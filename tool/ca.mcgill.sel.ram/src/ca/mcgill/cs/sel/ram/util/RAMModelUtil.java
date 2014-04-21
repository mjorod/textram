package ca.mcgill.cs.sel.ram.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Class;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.Gate;
import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.InstantiationType;
import ca.mcgill.cs.sel.ram.Interaction;
import ca.mcgill.cs.sel.ram.Layout;
import ca.mcgill.cs.sel.ram.LayoutElement;
import ca.mcgill.cs.sel.ram.Lifeline;
import ca.mcgill.cs.sel.ram.Message;
import ca.mcgill.cs.sel.ram.MessageOccurrenceSpecification;
import ca.mcgill.cs.sel.ram.MessageSort;
import ca.mcgill.cs.sel.ram.MessageView;
import ca.mcgill.cs.sel.ram.NamedElement;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.PrimitiveType;
import ca.mcgill.cs.sel.ram.RAny;
import ca.mcgill.cs.sel.ram.RVoid;
import ca.mcgill.cs.sel.ram.RamFactory;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.Reference;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Type;
import ca.mcgill.cs.sel.ram.Visibility;

/**
 * Helper class with convenient static methods for working with RAM EMF model objects.
 * 
 * @author mschoettle
 */
public final class RAMModelUtil {
    
    /**
     * The name of a newly created aspect.
     */
    private static final String NEW_ASPECT_NAME = "Untitled";
    
    /**
     * Creates a new instance of {@link RAMModelUtil}.
     */
    private RAMModelUtil() {
        // suppress default constructor         
    }
    
    /**
     * Collects a set of aspects that are extended by this aspect. 
     * Collects these recursively in case an extended aspect also extends another aspect.
     * 
     * @param aspect the current aspect
     * @return the set of aspects that are extended by this aspect
     */
    public static Set<Aspect> collectExtendedAspects(Aspect aspect) {
        Set<Aspect> extendedAspects = new HashSet<Aspect>();
        
        for (Instantiation instantiation : aspect.getInstantiations()) {
            if (instantiation.getType() == InstantiationType.EXTENDS) {
                Aspect externalAspect = instantiation.getExternalAspect();
                
                // If it was already added, it is not necessary to search for extended aspects of that aspect again
                // this prevents infinite loops in case of cyclic dependencies between aspects
                if (extendedAspects.add(externalAspect)) {
                    extendedAspects.addAll(collectExtendedAspects(externalAspect));
                }
            }
        }
        
        return extendedAspects;
    }
    
    /**
     * Creates a new empty message view for that specifies the given operation.
     * The message view contains the initial call and a return message if it does not return void.
     * 
     * @param operation the operation a message view should be created for
     * @return the empty message view for the given operation
     */
    public static MessageView createMessageView(Operation operation) {
        RamFactory factory = RamFactory.eINSTANCE;
        
        MessageView messageView = factory.createMessageView();
        messageView.setSpecifies(operation);
        
        // Create interaction.
        Interaction interaction = factory.createInteraction();
        messageView.setSpecification(interaction);
        
        // Create the lifeline.
        Lifeline lifeline = factory.createLifeline();
        interaction.getLifelines().add(lifeline);
        
        // Create represents.
        Reference represents = factory.createReference();
        represents.setLowerBound(1);
        represents.setName("target");
        represents.setType((Classifier) operation.eContainer());
        
        interaction.getProperties().add(represents);
        lifeline.setRepresents(represents);
        
        // TODO: mschoettle: What about create and delete messages?
        createInitialMessage(interaction, lifeline, operation, MessageSort.SYNCH_CALL);
        
        // Create return message if operation doesn't return void.
        if (!operation.getReturnType().eClass().isInstance(RamPackage.Literals.RVOID)) {
            createInitialMessage(interaction, lifeline, operation, MessageSort.REPLY);
        }
        
        return messageView;
    }
    
    /**
     * Creates an initial message in the given interaction calling the given operation.
     * The message is coming from a gate and received by the given lifeline.
     * It is added to the interaction.
     * 
     * @param interaction the interaction the message belongs to
     * @param lifeline the lifeline that receives the message call
     * @param operation the operation that is called on the lifeline
     * @param messageSort the kind of the message call
     */
    public static void createInitialMessage(Interaction interaction, Lifeline lifeline, Operation operation, 
                                        MessageSort messageSort) {
        // create gate
        Gate gate = RamFactory.eINSTANCE.createGate();
        
        String gateName = (messageSort == MessageSort.REPLY) ? "in_" : "out_";
        gateName += operation.getName();
        
        gate.setName(gateName);
        interaction.getFormalGates().add(gate);
        
        // create receive event
        MessageOccurrenceSpecification event = RamFactory.eINSTANCE.createMessageOccurrenceSpecification();
        event.getCovered().add(lifeline);
        interaction.getFragments().add(event);
        
        // create message
        Message message = RamFactory.eINSTANCE.createMessage();
        message.setMessageSort(messageSort);
        message.setSignature(operation);
        interaction.getMessages().add(message);
        
        // set references
        event.setMessage(message);
        gate.setMessage(message);
        
        if (messageSort == MessageSort.REPLY) {
            message.setSendEvent(event);
            message.setReceiveEvent(gate);
        }
        else {
            message.setSendEvent(gate);
            message.setReceiveEvent(event);            
        }
    }
    
    /**
     * Creates a new operation with the given properties.
     * 
     * @param name the name of the operation
     * @param visibility the {@link Visibility} of the operation
     * @param returnType the return type of the operation
     * @param parameters a list of parameters for the operation
     * @return a new {@link Operation} with the given properties set
     */
    public static Operation createOperation(String name, Visibility visibility,
            Type returnType, List<Parameter> parameters) {
        Operation operation = RamFactory.eINSTANCE.createOperation();
        operation.setName(name);
        operation.setVisibility(visibility);
        operation.setReturnType(returnType);
        
        if (parameters != null) {
            operation.getParameters().addAll(parameters);
        }
        
        return operation;
    }
    
    /**
     * Returns whether the given sub-class has the given super class as a super type.
     * I.e., the sub-class inherits from the super class.
     * 
     * @param subType the class that is considered a sub-class
     * @param superType the classifier that is considered a super-type
     * @return true, if the sub-type class has the super-type classifier as a super type, false otherwise
     */
    public static boolean hasSuperClass(Class subType, Classifier superType) {
        for (Classifier classifier : subType.getSuperTypes()) {
            if (classifier == superType) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Checks whether the given name is unique inside the owners feature.
     * 
     * @param owner the owner containing {@link NamedElement}s
     * @param feature the feature of the owner containing {@link NamedElement}s
     * @param name the name to be checked for uniqueness
     * @return true, if the given name is unique among the {@link NamedElement}s of the owners feature, false otherwise
     */
    public static boolean isUniqueName(EObject owner, EStructuralFeature feature, String name) {
        @SuppressWarnings("unchecked")
        List<NamedElement> children = (List<NamedElement>) owner.eGet(feature);
        
        for (NamedElement namedElement : children) {
            if (namedElement.getName() != null && namedElement.getName().equals(name)) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Gets the void type from the structural view.
     * 
     * @param structuralView the structuralView
     * @return the void type, null if not found
     */
    public static RVoid getVoidType(StructuralView structuralView) {
        for (Type type : structuralView.getTypes()) {
            if (RVoid.class.isInstance(type)) {
                return (RVoid) type;
            }
        }
       
        return null;
    }
    
    /**
     * Returns a list of all primitive types contained in the given structural view.
     * 
     * @param structuralView the {@link StructuralView}
     * @return a list of all primitive types of the given structural view
     */
    public static List<PrimitiveType> getPrimitiveTypes(StructuralView structuralView) {
        List<PrimitiveType> primitiveTypes = new ArrayList<PrimitiveType>();
        
        for (Type type : structuralView.getTypes()) {
            if (type instanceof PrimitiveType) {
                primitiveTypes.add((PrimitiveType) type);
            }
        }
        
        return primitiveTypes;
    }
    
    /**
     * Creates a new {@link Aspect} with an empty {@link StructuralView} containing default types.
     * 
     * @return the newly created {@link Aspect}
     */
    public static Aspect createAspect() {
        Aspect aspect = RamFactory.eINSTANCE.createAspect();
        aspect.setName(NEW_ASPECT_NAME);
        
        // create structural view as it is needed
        StructuralView structuralView = RamFactory.eINSTANCE.createStructuralView();
        aspect.setStructuralView(structuralView);
        
        // create default types
        createDefaultTypes(structuralView);
        
        // create empty layout
        createLayout(aspect, structuralView);
        
        return aspect;
    }
    
    /**
     * Creates a new layout for a given {@link StructuralView}. 
     * The layout is the {@link ca.mcgill.cs.sel.ram.impl.ContainerMapImpl} specifically
     * that holds all {@link LayoutElement} for children of the given {@link StructuralView}.
     * 
     * @param aspect the aspect
     * @param structuralView the {@link StructuralView} holding the {@link LayoutElement} for its children
     */
    public static void createLayout(Aspect aspect, StructuralView structuralView)
    {
        Layout layout = RamFactory.eINSTANCE.createLayout();
        
        // workaround used here since creating the map, adding the values and then putting it doesn't work
        // EMF somehow does some magic with the passed map instance
        layout.getContainers().put(structuralView, new BasicEMap<EObject, LayoutElement>());
        
        aspect.setLayout(layout);
    }

    /**
     * Creates all the primitive types that do not currently exist in the structural view (and sets them...).
     * 
     * @param structuralView the structural view of interest
     */
    private static void createDefaultTypes(StructuralView structuralView) {
        if (getTypeInstance(structuralView, RVoid.class) == null) {
            structuralView.getTypes().add(RamFactory.eINSTANCE.createRVoid());
        }
        
        if (getTypeInstance(structuralView, RAny.class) == null) {
            structuralView.getTypes().add(RamFactory.eINSTANCE.createRAny());
        }
        
        // add all primitive types
        EClass primitiveTypeClass = RamPackage.eINSTANCE.getPrimitiveType();
        
        for (EClassifier classifier : RamPackage.eINSTANCE.getEClassifiers()) {
            if (classifier instanceof EClass) {
                EClass clazz = (EClass) classifier;
                
                // is it a PrimitiveType but not an Enum or Array
                if (!clazz.isAbstract() && primitiveTypeClass.isSuperTypeOf(clazz) 
                        && !RamPackage.eINSTANCE.getREnum().equals(clazz)
                        && !RamPackage.eINSTANCE.getRArray().equals(clazz)) {
                    
                    boolean alreadyExists = false;
                    
                    // if the type already exists we don't want to add it another time
                    for (Type type : structuralView.getTypes()) {
                        
                        if (type.eClass().equals(clazz)) {
                            alreadyExists = true;
                            break;
                        }
                        
                    }
                    
                    if (!alreadyExists) {
                        Type newObject = (Type) RamFactory.eINSTANCE.create(clazz);
                        structuralView.getTypes().add(newObject);
                    }
                }
            }
        }
    }
    
    /**
     * Returns the type instance of the given class that is a type of the given structural view.
     * If no such type is found, null is returned.
     * 
     * @param structuralView the {@link StructuralView} containing the types
     * @param typeClass the {@link java.lang.Class} of which an instance is requested
     * @param <T> the type of the requested type
     * @return the type instance of the given class, null if none is found
     */
    private static <T extends Type> T getTypeInstance(StructuralView structuralView, java.lang.Class<T> typeClass) {
        for (final Type type : structuralView.getTypes()) {
            if (typeClass.isInstance(type)) {
                @SuppressWarnings("unchecked")
                T typed = (T) type;
                return typed;
            }
        }
        return null;
    }
    
}
