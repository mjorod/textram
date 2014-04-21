/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package ca.mcgill.cs.sel.ram.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.AspectMessageView;
import ca.mcgill.cs.sel.ram.Association;
import ca.mcgill.cs.sel.ram.AssociationEnd;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.AttributeMapping;
import ca.mcgill.cs.sel.ram.ClassifierMapping;
import ca.mcgill.cs.sel.ram.CombinedFragment;
import ca.mcgill.cs.sel.ram.Constraint;
import ca.mcgill.cs.sel.ram.DestructionOccurrenceSpecification;
import ca.mcgill.cs.sel.ram.ExecutionStatement;
import ca.mcgill.cs.sel.ram.Gate;
import ca.mcgill.cs.sel.ram.ImplementationClass;
import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.InstantiationType;
import ca.mcgill.cs.sel.ram.Interaction;
import ca.mcgill.cs.sel.ram.InteractionOperand;
import ca.mcgill.cs.sel.ram.InteractionOperatorKind;
import ca.mcgill.cs.sel.ram.Layout;
import ca.mcgill.cs.sel.ram.LayoutElement;
import ca.mcgill.cs.sel.ram.Lifeline;
import ca.mcgill.cs.sel.ram.LiteralBoolean;
import ca.mcgill.cs.sel.ram.LiteralInteger;
import ca.mcgill.cs.sel.ram.LiteralString;
import ca.mcgill.cs.sel.ram.Message;
import ca.mcgill.cs.sel.ram.MessageOccurrenceSpecification;
import ca.mcgill.cs.sel.ram.MessageSort;
import ca.mcgill.cs.sel.ram.MessageView;
import ca.mcgill.cs.sel.ram.MessageViewReference;
import ca.mcgill.cs.sel.ram.OccurrenceSpecification;
import ca.mcgill.cs.sel.ram.OpaqueExpression;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.OperationMapping;
import ca.mcgill.cs.sel.ram.OriginalBehaviorExecution;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.ParameterMapping;
import ca.mcgill.cs.sel.ram.ParameterValue;
import ca.mcgill.cs.sel.ram.ParameterValueMapping;
import ca.mcgill.cs.sel.ram.RAny;
import ca.mcgill.cs.sel.ram.RArray;
import ca.mcgill.cs.sel.ram.RBoolean;
import ca.mcgill.cs.sel.ram.RChar;
import ca.mcgill.cs.sel.ram.RDouble;
import ca.mcgill.cs.sel.ram.REnum;
import ca.mcgill.cs.sel.ram.REnumLiteral;
import ca.mcgill.cs.sel.ram.RFloat;
import ca.mcgill.cs.sel.ram.RInt;
import ca.mcgill.cs.sel.ram.RLong;
import ca.mcgill.cs.sel.ram.RSequence;
import ca.mcgill.cs.sel.ram.RSet;
import ca.mcgill.cs.sel.ram.RString;
import ca.mcgill.cs.sel.ram.RVoid;
import ca.mcgill.cs.sel.ram.RamFactory;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.Reference;
import ca.mcgill.cs.sel.ram.ReferenceType;
import ca.mcgill.cs.sel.ram.State;
import ca.mcgill.cs.sel.ram.StateMachine;
import ca.mcgill.cs.sel.ram.StateView;
import ca.mcgill.cs.sel.ram.StructuralFeatureValue;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Substitution;
import ca.mcgill.cs.sel.ram.Transition;
import ca.mcgill.cs.sel.ram.TransitionSubstitution;
import ca.mcgill.cs.sel.ram.TypeParameter;
import ca.mcgill.cs.sel.ram.Visibility;
import java.util.Map;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RamFactoryImpl extends EFactoryImpl implements RamFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static RamFactory init() {
        try {
            RamFactory theRamFactory = (RamFactory)EPackage.Registry.INSTANCE.getEFactory(RamPackage.eNS_URI);
            if (theRamFactory != null) {
                return theRamFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new RamFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RamFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case RamPackage.ASPECT: return createAspect();
            case RamPackage.STRUCTURAL_VIEW: return createStructuralView();
            case RamPackage.CLASS: return createClass();
            case RamPackage.ASSOCIATION_END: return createAssociationEnd();
            case RamPackage.ASSOCIATION: return createAssociation();
            case RamPackage.INSTANTIATION: return createInstantiation();
            case RamPackage.OPERATION: return createOperation();
            case RamPackage.ATTRIBUTE: return createAttribute();
            case RamPackage.PARAMETER: return createParameter();
            case RamPackage.RVOID: return createRVoid();
            case RamPackage.RBOOLEAN: return createRBoolean();
            case RamPackage.RINT: return createRInt();
            case RamPackage.RCHAR: return createRChar();
            case RamPackage.RSTRING: return createRString();
            case RamPackage.RANY: return createRAny();
            case RamPackage.RENUM: return createREnum();
            case RamPackage.RENUM_LITERAL: return createREnumLiteral();
            case RamPackage.MESSAGE_VIEW: return createMessageView();
            case RamPackage.MESSAGE_VIEW_REFERENCE: return createMessageViewReference();
            case RamPackage.INTERACTION: return createInteraction();
            case RamPackage.ASPECT_MESSAGE_VIEW: return createAspectMessageView();
            case RamPackage.LIFELINE: return createLifeline();
            case RamPackage.MESSAGE: return createMessage();
            case RamPackage.MESSAGE_OCCURRENCE_SPECIFICATION: return createMessageOccurrenceSpecification();
            case RamPackage.OCCURRENCE_SPECIFICATION: return createOccurrenceSpecification();
            case RamPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION: return createDestructionOccurrenceSpecification();
            case RamPackage.COMBINED_FRAGMENT: return createCombinedFragment();
            case RamPackage.ORIGINAL_BEHAVIOR_EXECUTION: return createOriginalBehaviorExecution();
            case RamPackage.EXECUTION_STATEMENT: return createExecutionStatement();
            case RamPackage.INTERACTION_OPERAND: return createInteractionOperand();
            case RamPackage.STRUCTURAL_FEATURE_VALUE: return createStructuralFeatureValue();
            case RamPackage.PARAMETER_VALUE_MAPPING: return createParameterValueMapping();
            case RamPackage.PARAMETER_VALUE: return createParameterValue();
            case RamPackage.OPAQUE_EXPRESSION: return createOpaqueExpression();
            case RamPackage.LITERAL_STRING: return createLiteralString();
            case RamPackage.LITERAL_INTEGER: return createLiteralInteger();
            case RamPackage.RSET: return createRSet();
            case RamPackage.RSEQUENCE: return createRSequence();
            case RamPackage.LAYOUT: return createLayout();
            case RamPackage.CONTAINER_MAP: return (EObject)createContainerMap();
            case RamPackage.ELEMENT_MAP: return (EObject)createElementMap();
            case RamPackage.LAYOUT_ELEMENT: return createLayoutElement();
            case RamPackage.IMPLEMENTATION_CLASS: return createImplementationClass();
            case RamPackage.REFERENCE: return createReference();
            case RamPackage.GATE: return createGate();
            case RamPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
            case RamPackage.CLASSIFIER_MAPPING: return createClassifierMapping();
            case RamPackage.ATTRIBUTE_MAPPING: return createAttributeMapping();
            case RamPackage.OPERATION_MAPPING: return createOperationMapping();
            case RamPackage.PARAMETER_MAPPING: return createParameterMapping();
            case RamPackage.STATE_VIEW: return createStateView();
            case RamPackage.STATE_MACHINE: return createStateMachine();
            case RamPackage.TRANSITION: return createTransition();
            case RamPackage.STATE: return createState();
            case RamPackage.RDOUBLE: return createRDouble();
            case RamPackage.RFLOAT: return createRFloat();
            case RamPackage.CONSTRAINT: return createConstraint();
            case RamPackage.SUBSTITUTION: return createSubstitution();
            case RamPackage.TRANSITION_SUBSTITUTION: return createTransitionSubstitution();
            case RamPackage.TYPE_PARAMETER: return createTypeParameter();
            case RamPackage.RLONG: return createRLong();
            case RamPackage.RARRAY: return createRArray();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case RamPackage.VISIBILITY:
                return createVisibilityFromString(eDataType, initialValue);
            case RamPackage.REFERENCE_TYPE:
                return createReferenceTypeFromString(eDataType, initialValue);
            case RamPackage.MESSAGE_SORT:
                return createMessageSortFromString(eDataType, initialValue);
            case RamPackage.INTERACTION_OPERATOR_KIND:
                return createInteractionOperatorKindFromString(eDataType, initialValue);
            case RamPackage.INSTANTIATION_TYPE:
                return createInstantiationTypeFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case RamPackage.VISIBILITY:
                return convertVisibilityToString(eDataType, instanceValue);
            case RamPackage.REFERENCE_TYPE:
                return convertReferenceTypeToString(eDataType, instanceValue);
            case RamPackage.MESSAGE_SORT:
                return convertMessageSortToString(eDataType, instanceValue);
            case RamPackage.INTERACTION_OPERATOR_KIND:
                return convertInteractionOperatorKindToString(eDataType, instanceValue);
            case RamPackage.INSTANTIATION_TYPE:
                return convertInstantiationTypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Aspect createAspect() {
        AspectImpl aspect = new AspectImpl();
        return aspect;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuralView createStructuralView() {
        StructuralViewImpl structuralView = new StructuralViewImpl();
        return structuralView;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ca.mcgill.cs.sel.ram.Class createClass() {
        ClassImpl class_ = new ClassImpl();
        return class_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public AssociationEnd createAssociationEnd() {
        AssociationEndImpl associationEnd = new AssociationEndImpl();
        return associationEnd;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Association createAssociation() {
        AssociationImpl association = new AssociationImpl();
        return association;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Instantiation createInstantiation() {
        InstantiationImpl instantiation = new InstantiationImpl();
        return instantiation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Attribute createAttribute() {
        AttributeImpl attribute = new AttributeImpl();
        return attribute;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RVoid createRVoid() {
        RVoidImpl rVoid = new RVoidImpl();
        return rVoid;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RBoolean createRBoolean() {
        RBooleanImpl rBoolean = new RBooleanImpl();
        return rBoolean;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RInt createRInt() {
        RIntImpl rInt = new RIntImpl();
        return rInt;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RChar createRChar() {
        RCharImpl rChar = new RCharImpl();
        return rChar;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RString createRString() {
        RStringImpl rString = new RStringImpl();
        return rString;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RAny createRAny() {
        RAnyImpl rAny = new RAnyImpl();
        return rAny;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public REnum createREnum() {
        REnumImpl rEnum = new REnumImpl();
        return rEnum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public REnumLiteral createREnumLiteral() {
        REnumLiteralImpl rEnumLiteral = new REnumLiteralImpl();
        return rEnumLiteral;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageView createMessageView() {
        MessageViewImpl messageView = new MessageViewImpl();
        return messageView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageViewReference createMessageViewReference() {
        MessageViewReferenceImpl messageViewReference = new MessageViewReferenceImpl();
        return messageViewReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction createInteraction() {
        InteractionImpl interaction = new InteractionImpl();
        return interaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AspectMessageView createAspectMessageView() {
        AspectMessageViewImpl aspectMessageView = new AspectMessageViewImpl();
        return aspectMessageView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Lifeline createLifeline() {
        LifelineImpl lifeline = new LifelineImpl();
        return lifeline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Message createMessage() {
        MessageImpl message = new MessageImpl();
        return message;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageOccurrenceSpecification createMessageOccurrenceSpecification() {
        MessageOccurrenceSpecificationImpl messageOccurrenceSpecification = new MessageOccurrenceSpecificationImpl();
        return messageOccurrenceSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OccurrenceSpecification createOccurrenceSpecification() {
        OccurrenceSpecificationImpl occurrenceSpecification = new OccurrenceSpecificationImpl();
        return occurrenceSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DestructionOccurrenceSpecification createDestructionOccurrenceSpecification() {
        DestructionOccurrenceSpecificationImpl destructionOccurrenceSpecification = new DestructionOccurrenceSpecificationImpl();
        return destructionOccurrenceSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombinedFragment createCombinedFragment() {
        CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
        return combinedFragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OriginalBehaviorExecution createOriginalBehaviorExecution() {
        OriginalBehaviorExecutionImpl originalBehaviorExecution = new OriginalBehaviorExecutionImpl();
        return originalBehaviorExecution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionStatement createExecutionStatement() {
        ExecutionStatementImpl executionStatement = new ExecutionStatementImpl();
        return executionStatement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionOperand createInteractionOperand() {
        InteractionOperandImpl interactionOperand = new InteractionOperandImpl();
        return interactionOperand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuralFeatureValue createStructuralFeatureValue() {
        StructuralFeatureValueImpl structuralFeatureValue = new StructuralFeatureValueImpl();
        return structuralFeatureValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterValueMapping createParameterValueMapping() {
        ParameterValueMappingImpl parameterValueMapping = new ParameterValueMappingImpl();
        return parameterValueMapping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterValue createParameterValue() {
        ParameterValueImpl parameterValue = new ParameterValueImpl();
        return parameterValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpaqueExpression createOpaqueExpression() {
        OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
        return opaqueExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralString createLiteralString() {
        LiteralStringImpl literalString = new LiteralStringImpl();
        return literalString;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralInteger createLiteralInteger() {
        LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
        return literalInteger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RSet createRSet() {
        RSetImpl rSet = new RSetImpl();
        return rSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RSequence createRSequence() {
        RSequenceImpl rSequence = new RSequenceImpl();
        return rSequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Layout createLayout() {
        LayoutImpl layout = new LayoutImpl();
        return layout;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<EObject, EMap<EObject, LayoutElement>> createContainerMap() {
        ContainerMapImpl containerMap = new ContainerMapImpl();
        return containerMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Map.Entry<EObject, LayoutElement> createElementMap() {
        ElementMapImpl elementMap = new ElementMapImpl();
        return elementMap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LayoutElement createLayoutElement() {
        LayoutElementImpl layoutElement = new LayoutElementImpl();
        return layoutElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImplementationClass createImplementationClass() {
        ImplementationClassImpl implementationClass = new ImplementationClassImpl();
        return implementationClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Reference createReference() {
        ReferenceImpl reference = new ReferenceImpl();
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gate createGate() {
        GateImpl gate = new GateImpl();
        return gate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralBoolean createLiteralBoolean() {
        LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
        return literalBoolean;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassifierMapping createClassifierMapping() {
        ClassifierMappingImpl classifierMapping = new ClassifierMappingImpl();
        return classifierMapping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeMapping createAttributeMapping() {
        AttributeMappingImpl attributeMapping = new AttributeMappingImpl();
        return attributeMapping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationMapping createOperationMapping() {
        OperationMappingImpl operationMapping = new OperationMappingImpl();
        return operationMapping;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterMapping createParameterMapping() {
        ParameterMappingImpl parameterMapping = new ParameterMappingImpl();
        return parameterMapping;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StateView createStateView() {
        StateViewImpl stateView = new StateViewImpl();
        return stateView;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public StateMachine createStateMachine() {
        StateMachineImpl stateMachine = new StateMachineImpl();
        return stateMachine;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Transition createTransition() {
        TransitionImpl transition = new TransitionImpl();
        return transition;
    }

				/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public State createState() {
        StateImpl state = new StateImpl();
        return state;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RDouble createRDouble() {
        RDoubleImpl rDouble = new RDoubleImpl();
        return rDouble;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RFloat createRFloat() {
        RFloatImpl rFloat = new RFloatImpl();
        return rFloat;
    }

                /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Constraint createConstraint() {
        ConstraintImpl constraint = new ConstraintImpl();
        return constraint;
    }

																/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Substitution createSubstitution() {
        SubstitutionImpl substitution = new SubstitutionImpl();
        return substitution;
    }

																/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TransitionSubstitution createTransitionSubstitution() {
        TransitionSubstitutionImpl transitionSubstitution = new TransitionSubstitutionImpl();
        return transitionSubstitution;
    }

																/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeParameter createTypeParameter() {
        TypeParameterImpl typeParameter = new TypeParameterImpl();
        return typeParameter;
    }

                                                                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RLong createRLong() {
        RLongImpl rLong = new RLongImpl();
        return rLong;
    }

                                                                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RArray createRArray() {
        RArrayImpl rArray = new RArrayImpl();
        return rArray;
    }

                                                                /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
        Visibility result = Visibility.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceType createReferenceTypeFromString(EDataType eDataType, String initialValue) {
        ReferenceType result = ReferenceType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertReferenceTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageSort createMessageSortFromString(EDataType eDataType, String initialValue) {
        MessageSort result = MessageSort.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMessageSortToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionOperatorKind createInteractionOperatorKindFromString(EDataType eDataType, String initialValue) {
        InteractionOperatorKind result = InteractionOperatorKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInteractionOperatorKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstantiationType createInstantiationTypeFromString(EDataType eDataType, String initialValue) {
        InstantiationType result = InstantiationType.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInstantiationTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public RamPackage getRamPackage() {
        return (RamPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static RamPackage getPackage() {
        return RamPackage.eINSTANCE;
    }

} //RamFactoryImpl
