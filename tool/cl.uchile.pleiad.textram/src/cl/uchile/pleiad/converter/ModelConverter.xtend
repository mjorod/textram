package cl.uchile.pleiad.converter

import ca.mcgill.cs.sel.ram.Aspect
<<<<<<< HEAD
import ca.mcgill.cs.sel.ram.Association
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.ClassifierMapping
import ca.mcgill.cs.sel.ram.Instantiation
import ca.mcgill.cs.sel.ram.MappableElement
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.OperationMapping
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.StructuralView
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassMember
=======
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.MappableElement
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.RamPackage
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.sel.ram.controller.edit.AdapterFactoryUtil
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
>>>>>>> a014222359cdcf28781371da9ca4f2dfb72867b4
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TStructuralView
import java.util.List
<<<<<<< HEAD
import org.eclipse.emf.ecore.util.EcoreUtil

class ModelConverter implements IModelConverter {
	
	/**
	 * Transform the textRam model to a ram model
	 */
	override Aspect convertTextRAMModelToRAMModel(Aspect aspect) {
		// cache for all mappable elements (classes, attributes and operations)
		val List<MappableElement> cacheForMappableElements = newArrayList

		// instance of TStructuralView
		val textRamStructuralView = aspect.structuralView as TStructuralView
		
		var ramAspect = aspect.copyAspect
		var ramStructuralView = ramAspect.createStructuralView
		
		ramStructuralView = textRamStructuralView.transformTypesToRam(ramStructuralView)
		ramStructuralView = textRamStructuralView.transformClassesToRam(ramStructuralView, cacheForMappableElements)  
		ramStructuralView = ramStructuralView.convertAssociations(textRamStructuralView, cacheForMappableElements) 
		
		ramAspect.convertInstantiations(aspect, cacheForMappableElements)
		
		ramAspect
	}
	
	def createStructuralView(Aspect aspect) {
		RamFactory.eINSTANCE.createStructuralView()
	}
	
	private def StructuralView transformTypesToRam(TStructuralView textRamStructuralView, StructuralView ramStructuralView) {
		ramStructuralView.types.addAll(EcoreUtil.copyAll(textRamStructuralView.types))
		
		ramStructuralView
	}
	
	private def transformClassesToRam(TStructuralView textRamStructuralView, StructuralView ramStructuralView, List<MappableElement> cacheForMappableElements) {
		textRamStructuralView.classes.filter(TClass).forEach[ textRamClass | textRamClass.transformClass(ramStructuralView, cacheForMappableElements)  ]
		
		ramStructuralView
	}
	
	/**
	 * Create a new {@link Aspect} from the textRam aspect
	 * Only the name is set which is copied from textRam aspect
	 * 
	 * @param textRamAspect to be copied
	 */
	private def copyAspect(Aspect textRamAspect) {
		var newAspect = RamFactory.eINSTANCE.createAspect()
		newAspect.setName(textRamAspect.name)
		
		newAspect
	}
	
	private def void convertInstantiations(Aspect ramAspect, Aspect aspect, List<MappableElement> cacheForMappableElements) {
		aspect.instantiations.forEach[ instantiation | instantiation.convertInstantiation(ramAspect, cacheForMappableElements) ]
	}
	
	private def convertInstantiation(Instantiation instantiation, Aspect ramAspect, List<MappableElement> cacheForMappableElements) {
=======
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.common.command.CompoundCommand
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.emf.edit.domain.EditingDomain
import ca.mcgill.cs.sel.ram.ClassifierMapping
import ca.mcgill.cs.sel.ram.Instantiation
import cl.uchile.pleiad.textRam.TClassMember
import cl.uchile.pleiad.textRam.TAssociation

class ModelConverter implements IModelConverter {
	
	override Aspect convertTextRAMModelToRAMModel(Aspect aspect) {
		// instance of TStructuralView
		val tStructuralView = aspect.structuralView as TStructuralView
		
		// ram aspect model
		var ramAspect = aspect.convertToRamAspect
		
		// manages a self-contained set of ram models and the commands that modify them
		val editingDomain = AdapterFactoryUtil.getEditingDomain(ramAspect)

		// create compound command
		val compoundCommand = new CompoundCommand()
		
		// ram structural view
		var ramStructuralView = ramAspect.convertStructuralView 
		
		// add primitive types to structural view
		ramStructuralView.types.addAll(EcoreUtil.copyAll(tStructuralView.types))
		
		// add structural view to ram aspect
		//compoundCommand.append(AddCommand.create(editingDomain, ramAspect, RamPackage.Literals.STRUCTURAL_VIEW, ramStructuralView))
    	
		// cache for all mappable elements (classes, attributes and operations)
		val List<MappableElement> cacheForMappableElements = newArrayList
		
		// convert classes
		ramStructuralView.convertClasses(tStructuralView, editingDomain, compoundCommand, cacheForMappableElements)
		
		// convert classes's super types
		ramStructuralView.convertSuperTypes(tStructuralView, editingDomain, compoundCommand, cacheForMappableElements)
		
		// convert classes's associations
		ramStructuralView.convertAssociations(tStructuralView, editingDomain, compoundCommand, cacheForMappableElements)
		
		// convert instantiations
		ramAspect.convertInstantiations(aspect, editingDomain, compoundCommand, cacheForMappableElements)
		
		doExecute(editingDomain, compoundCommand);
		
		ramAspect
	}
	
	private def void convertInstantiations(Aspect ramAspect, Aspect aspect, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {

		aspect.instantiations.forEach[ instantiation | instantiation.convertInstantiation(ramAspect, editingDomain, compoundCommand, cacheForMappableElements) ]
		
	}
	
	def void convertInstantiation(Instantiation instantiation, Aspect ramAspect, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
>>>>>>> a014222359cdcf28781371da9ca4f2dfb72867b4
		val newInstantiation = RamFactory.eINSTANCE.createInstantiation()
		val ramExternalAspect = ModelConverterProxy::instance.convertTextRAMModelToRAMModel(instantiation.externalAspect) 
					
		newInstantiation.setExternalAspect(ramExternalAspect)
		newInstantiation.setType(instantiation.type)
    	
<<<<<<< HEAD
//    	instantiation.mappings.forEach[ mapping | mapping.convertMapping(ramExternalAspect, newInstantiation, cacheForMappableElements) ]
    
    	newInstantiation	
	}
	
	private def convertMapping(ClassifierMapping mapping, Aspect ramExternalAspect, Instantiation newInstantiation, List<MappableElement> cacheForMappableElements) {
		// create ClassifierMapping
		val ramClassifierMapping = RamFactory.eINSTANCE.createClassifierMapping()
		val tClassifierMapping = mapping as TClassifierMapping
		
		// from element
		val fromElement = ramExternalAspect.structuralView.classes.findFirst( c | c.name == tClassifierMapping.fromElement.name )
		ramClassifierMapping.setFromElement(fromElement)
		
		// to element
		val toElement = cacheForMappableElements.findFirst( e | e.name ==  tClassifierMapping.toElement.name ) as Classifier
		ramClassifierMapping.setToElement(toElement)
		
		// call a dispatch method for mapping members (operations and attributes)
		tClassifierMapping.fromMember.forEach[ classMemberFrom | classMemberFrom.convertMemberMappings(ramExternalAspect, ramClassifierMapping, tClassifierMapping, cacheForMappableElements) ]
		
		ramClassifierMapping
	}
	
	private def void convertMemberMappings(TClassMember classMemberFrom, Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TClassifierMapping tClassifierMapping, List<MappableElement> cacheForMappableElements) {
		// class member To
		val indexOfClassMemberFrom = tClassifierMapping.fromMember.indexOf(classMemberFrom)
		
		val classMemberTo = tClassifierMapping.getFromMember().get(indexOfClassMemberFrom)
		
		classMemberFrom.createMemberMapping(classMemberTo, ramExternalAspect, newClassifierMapping, tClassifierMapping, cacheForMappableElements);
	}
	
	private def dispatch void createMemberMapping(TOperation classMemberFrom, TClassMember classMemberTo, Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TClassifierMapping tClassifierMapping, List<MappableElement> cacheForMappableElements){
		createOperationMapping(ramExternalAspect, newClassifierMapping, classMemberFrom, classMemberTo, cacheForMappableElements)
	}
	
	private def createOperationMapping(Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TOperation tClassMemberFrom, TClassMember tClassMemberTo, List<MappableElement> cacheForMappableElements) {
		val ramOperationMapping = RamFactory.eINSTANCE.createOperationMapping()
		val externalOperation = ramExternalAspect.structuralView.classes.filter(Class).map[operations].flatten.findFirst( opr | opr.name == tClassMemberFrom.name )
		val internalOperation = cacheForMappableElements.findFirst( e | e.name == tClassMemberTo.name ) as Operation
		
		ramOperationMapping.setFromElement( externalOperation )
		ramOperationMapping.setToElement( internalOperation )
		
		tClassMemberFrom.parameters.forEach[ parm | parm.convertParameterMapping(ramOperationMapping,
																				 ramExternalAspect, 
																				 externalOperation, 
																				 internalOperation, 
																				 tClassMemberFrom, 
																				 tClassMemberTo as TOperation)]
		
		ramOperationMapping
	}
	
	private def convertParameterMapping(Parameter tParameterFrom, OperationMapping ramOperationMapping,  Aspect externalAspect, Operation externalOperation, Operation internalOperation, TOperation tClassMemberFrom, TOperation tClassMemberTo) {
		//externalAspect<tParameterFrom> -> internalAspect<tParameterTo>

		// index to get the To TParameter 
		val indexOfParameterMemberFrom = tClassMemberFrom.parameters.indexOf(tParameterFrom);
		
		// To TParameter 
		val tParameterTo = tClassMemberTo.parameters.get(indexOfParameterMemberFrom)
		
		// create ram parameter mapping
		val ramParameterMapping = RamFactory.eINSTANCE.createParameterMapping()
		
		// get the parameter from external operation which is inside of the external aspect
		val ramParameterFrom = externalOperation.parameters.findFirst( parm | parm.name == tParameterFrom.name )
		
		// get the parameter for the current operation which is inside of the current editing aspect
		val ramParameterTo = internalOperation.parameters.findFirst( parm | parm.name == tParameterTo.name )
		
		// set from element 			
		ramParameterMapping.setFromElement( ramParameterFrom )
		
		// set to element
		ramParameterMapping.setToElement( ramParameterTo )
				
		ramParameterMapping
	}
	
	private def dispatch void createMemberMapping(TAttribute classMemberFrom, TClassMember classMemberTo, Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TClassifierMapping tClassifierMapping, List<MappableElement> cacheForMappableElements){
		createAttributeMapping(ramExternalAspect, newClassifierMapping, classMemberFrom, classMemberTo, cacheForMappableElements)
	}
	
	private def createAttributeMapping(Aspect ramExternalAspect, ClassifierMapping ramClassifierMapping, TAttribute classMemberFrom, TClassMember classMemberTo, List<MappableElement> cacheForMappableElements) {
		val ramAttributeMapping = RamFactory.eINSTANCE.createAttributeMapping()
		val externalAttribute = ramExternalAspect.structuralView.classes.filter(Class).map[attributes].flatten.findFirst( attr | attr.name == classMemberFrom.name )
		ramAttributeMapping.setFromElement( externalAttribute )
		ramAttributeMapping.setToElement( cacheForMappableElements.findFirst( e | e.name == classMemberTo.name ) as Attribute )
		
		ramAttributeMapping
	}
	
	private def convertAssociations(StructuralView ramStructuralView, TStructuralView textRamStructuralView, List<MappableElement> cacheForMappableElements) {
		textRamStructuralView.TAssociations.forEach[ textRamAssoc | textRamAssoc.transformAssociation(ramStructuralView, cacheForMappableElements)  ]
		
		ramStructuralView
	}
	
	private def transformAssociation(TAssociation textRamAssociation, StructuralView ramStructuralView, List<MappableElement> cacheForMappableElements) {
		var Class from = cacheForMappableElements.findFirst( c | c.name == textRamAssociation.fromEnd.classReference.name ) as Class
		var Class to = cacheForMappableElements.findFirst( c | c.name == textRamAssociation.toEnd.classReference.name ) as Class
		
		val classNameFrom = textRamAssociation.fromEnd.classReference.name
		val classNameTo = textRamAssociation.toEnd.classReference.name
		
		// create association
		var ramAssociation = RamFactory.eINSTANCE.createAssociation()
		ramAssociation.setName(classNameFrom + "_" + classNameTo);
		
		ramAssociation.transformAssociationEndClassFrom( textRamAssociation, from, to )
		ramAssociation.transformAssociationEndClassTo ( textRamAssociation, from, to )
         
        return ramAssociation
	}
	
	private def transformAssociationEndClassFrom(Association ramAssociation, TAssociation textRamAssociation, Class from, Class to) {
		// create from association end
     	var fromEnd = RamFactory.eINSTANCE.createAssociationEnd();
     	fromEnd.setAssoc(ramAssociation);
     	fromEnd.setLowerBound(textRamAssociation.fromEnd.lowerBound)
     	fromEnd.setUpperBound(textRamAssociation.fromEnd.upperBound)
     	fromEnd.setName(to.name.toLowerCaseFirst)
     
		fromEnd
	}
	
	private def transformAssociationEndClassTo(Association association, TAssociation tAssociation, Class from, Class to) {
		 // create to association end
         var toEnd = RamFactory.eINSTANCE.createAssociationEnd();
         toEnd.setAssoc(association);
         toEnd.setLowerBound(tAssociation.toEnd.lowerBound)
         toEnd.setUpperBound(tAssociation.toEnd.upperBound)
         toEnd.setName(from.name.toLowerCaseFirst)
     
     	 toEnd
   	}
	
	private def Class transformClass(TClass textRamClass, StructuralView ramStructuralView, List<MappableElement> cacheForMappableElements) {
		val ramClass = RamFactory.eINSTANCE.createClass()
		ramClass.setName(textRamClass.name)
		ramClass.setAbstract(textRamClass.abstract)
		ramClass.setPartial(textRamClass.partial)
		
		cacheForMappableElements.add(ramClass)
		
		// use dispatch methods to transform attributes and operations
		textRamClass.members.forEach[ classMember | transformClassMember(classMember, ramClass, cacheForMappableElements ) ]
		
		// add super type
		if (textRamClass.superTypes.empty == false) {
			val superType = cacheForMappableElements.findFirst( c | c.name == textRamClass.superTypes.head.name ) as Classifier;
			ramClass.superTypes.add(superType)
		}
		
		
	
		ramClass
	}
	
	private def dispatch transformClassMember(TOperation tOperation, Class classOwner, List<MappableElement> cacheForMappableElements) {
		val ramOperation = tOperation.copyOperation(classOwner)
		
		cacheForMappableElements.add(ramOperation)
	}
	
	private def dispatch transformClassMember(TAttribute tAttribute, Class classOwner, List<MappableElement> cacheForMappableElements) {
		val ramAttribute = tAttribute.copyAttribute(classOwner)
		
		cacheForMappableElements.add(ramAttribute)
	}
	
	private def copyOperation(TOperation tOperation, Class classOwner) {
		val ramOperation = RamFactory.eINSTANCE.createOperation()
		ramOperation.setName(tOperation.name)
		ramOperation.setAbstract(tOperation.abstract)
=======
    	instantiation.mappings.forEach[ mapping | mapping.convertMapping(ramExternalAspect, newInstantiation, editingDomain, compoundCommand, cacheForMappableElements) ]
    
    	compoundCommand.append(AddCommand.create( editingDomain, ramAspect, RamPackage.Literals.ASPECT__INSTANTIATIONS, newInstantiation))	
	}
	
	def void convertMapping(ClassifierMapping mapping, Aspect ramExternalAspect, Instantiation newInstantiation, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		// mappings
		val newClassifierMapping = RamFactory.eINSTANCE.createClassifierMapping()
		val tClassifierMapping = mapping as TClassifierMapping
		
		// from element
		val fromElement = ramExternalAspect.structuralView.classes.findFirst( c | c.name == tClassifierMapping.fromElement.name )
		newClassifierMapping.setFromElement(fromElement)
		//compoundCommand.append(AddCommand.create(editingDomain, newClassifierMapping, RamPackage.Literals.CLASSIFIER_MAPPING__FROM_ELEMENT, fromElement))
		
		// to element
		val toElement = cacheForMappableElements.findFirst( e | e.name ==  tClassifierMapping.toElement.name ) as Classifier
		newClassifierMapping.setToElement(toElement)
		//compoundCommand.append(AddCommand.create(editingDomain, newClassifierMapping, RamPackage.Literals.CLASSIFIER_MAPPING__TO_ELEMENT, toElement ))
		
		compoundCommand.append( AddCommand.create( editingDomain, newInstantiation, RamPackage.Literals.INSTANTIATION__MAPPINGS, newClassifierMapping ))
		
		tClassifierMapping.fromMember.forEach[ classMemberFrom | classMemberFrom.convertMappingMember(ramExternalAspect, newClassifierMapping, tClassifierMapping, editingDomain, compoundCommand, cacheForMappableElements) ]

	}
	
	def void convertMappingMember(TClassMember classMemberFrom, Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TClassifierMapping tClassifierMapping, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		// class member To
		val indexOfClassMemberFrom = tClassifierMapping.fromMember.indexOf(classMemberFrom)
		
		val classMemberTo = tClassifierMapping.getFromMember().get(indexOfClassMemberFrom)
		
		// typeOf member
		if (classMemberFrom instanceof TAttribute) {
			// creates attribute mapping
			val newAttributeMapping = RamFactory.eINSTANCE.createAttributeMapping()
			val externalAttribute = ramExternalAspect.structuralView.classes.filter(Class).map[attributes].flatten.findFirst( attr | attr.name == classMemberFrom.name )
			newAttributeMapping.setFromElement( externalAttribute )
			newAttributeMapping.setToElement( cacheForMappableElements.findFirst( e | e.name == classMemberTo.name ) as Attribute )
			
			//newAttributeMapping.setFromElement(   )
			
			// creates attribute mapping 
			compoundCommand.append(AddCommand.create(editingDomain, newClassifierMapping, RamPackage.Literals.ATTRIBUTE_MAPPING, newAttributeMapping ))        				
		}
	}
	
	private def void convertAssociations(StructuralView ramStructuralView, TStructuralView tStructuralView, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		tStructuralView.TAssociations.forEach[ t | t.convertAssociation(ramStructuralView, editingDomain, compoundCommand, cacheForMappableElements)  ]
	}
	
	def void convertAssociation(TAssociation t, StructuralView ramStructuralView, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {

		var Class from = cacheForMappableElements.filter( c | c.name == t.fromEnd.classReference.name ).head as Class
		var Class to = cacheForMappableElements.filter( c | c.name == t.toEnd.classReference.name ).head as Class
		
		val classNameFrom = t.fromEnd.classReference.name
		val classNameTo = t.toEnd.classReference.name
		
		// create association
		var association = RamFactory.eINSTANCE.createAssociation()
		association.setName(classNameFrom + "_" + classNameTo);
		
		// create from association end
     	var fromEnd = RamFactory.eINSTANCE.createAssociationEnd();
     	fromEnd.setAssoc(association);
     	fromEnd.setLowerBound(t.fromEnd.lowerBound)
     	fromEnd.setUpperBound(t.fromEnd.upperBound)
     	fromEnd.setName(to.name.toLowerCaseFirst)
     
     	compoundCommand.append(AddCommand.create(editingDomain, from, RamPackage.Literals.CLASS__ASSOCIATION_ENDS, fromEnd))
     
         // create to association end
         var toEnd = RamFactory.eINSTANCE.createAssociationEnd();
         toEnd.setAssoc(association);
         toEnd.setLowerBound(t.toEnd.lowerBound)
         toEnd.setUpperBound(t.toEnd.upperBound)
         toEnd.setName(from.name.toLowerCaseFirst)
     
     	 compoundCommand.append(AddCommand.create(editingDomain, to, RamPackage.Literals.CLASS__ASSOCIATION_ENDS, toEnd));
     
         // create command for association
         compoundCommand.append(AddCommand.create(editingDomain, ramStructuralView, RamPackage.Literals.STRUCTURAL_VIEW__ASSOCIATIONS, association));
	}
	
	private def void convertSuperTypes(StructuralView structuralView, TStructuralView tStructuralView, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		
		tStructuralView.classes.filter(Class).filter(c | c.superTypes.empty == false).forEach[ tClass |
			compoundCommand.append(AddCommand.create(editingDomain, 
													 cacheForMappableElements.filter( c | c.name == tClass.name).head, //owner 
													 RamPackage.Literals.CLASS__SUPER_TYPES, // feature
													 cacheForMappableElements.filter( c | c.name == tClass.superTypes.head.name ).head ) // value
			)]
			
	}
	
	def void convertClasses(StructuralView ramStructuralView, TStructuralView tStructuralView, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements ) {
		tStructuralView.classes.forEach[ classifier | classifier.convertClass(ramStructuralView, editingDomain, compoundCommand, cacheForMappableElements)  ]
	}
	
	def void convertClass(Classifier classifier, StructuralView ramStructuralView, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		val tClass = classifier as TClass
		
		val ramClass = RamFactory.eINSTANCE.createClass()
		ramClass.setName(tClass.name)
		ramClass.setAbstract(tClass.abstract)
		ramClass.setPartial(tClass.partial)
		
		// add class
		compoundCommand.append(AddCommand.create(editingDomain, ramStructuralView, RamPackage.Literals.CLASSIFIER, ramClass))
		cacheForMappableElements.add(ramClass)
		
		// uses dispatch methods to add attributes and operations
		tClass.members.forEach[ classMember | addMemberToClass(classMember, ramClass, editingDomain, compoundCommand, cacheForMappableElements ) ]

	}
	
	private def dispatch addMemberToClass(TOperation tOperation, Class classOwner, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		val ramOperation = RamFactory.eINSTANCE.createOperation()
		ramOperation.setName(tOperation.name)
>>>>>>> a014222359cdcf28781371da9ca4f2dfb72867b4
		ramOperation.setStatic(tOperation.static)
		ramOperation.setPartial(tOperation.partial)
		ramOperation.setReturnType(tOperation.returnType)
		ramOperation.setVisibility(tOperation.visibility)
		
		ramOperation.parameters.addAll( EcoreUtil.copyAll( tOperation.parameters ))
		
<<<<<<< HEAD
		ramOperation
	}
		
	private def copyAttribute(TAttribute tAttribute, Class classOwner) {
=======
		compoundCommand.append(AddCommand.create(editingDomain, classOwner, RamPackage.Literals.CLASSIFIER__OPERATIONS, ramOperation))
		cacheForMappableElements.add(ramOperation)
	}
	
	private def dispatch addMemberToClass(TAttribute tAttribute, Class classOwner, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
>>>>>>> a014222359cdcf28781371da9ca4f2dfb72867b4
		val ramAttribute = RamFactory.eINSTANCE.createAttribute()
		ramAttribute.setName(tAttribute.name)
		ramAttribute.setStatic(tAttribute.static)
		ramAttribute.setType(tAttribute.type)
		
<<<<<<< HEAD
		ramAttribute
	} 	
=======
		compoundCommand.append(AddCommand.create(editingDomain, classOwner, RamPackage.Literals.CLASS__ATTRIBUTES, ramAttribute))
		cacheForMappableElements.add(ramAttribute)
	} 
	
	private def StructuralView convertStructuralView(Aspect ramAspect) {
		RamFactory.eINSTANCE.createStructuralView()
	}
	
	private def convertToRamAspect(Aspect aspect) {
		var newAspect = RamFactory.eINSTANCE.createAspect()
		newAspect.setName(aspect.name)
		
		newAspect
	}
	
	private def static doExecute(EditingDomain editingDomain, Command command) {        
        if (!command.canExecute()) {
            throw new RuntimeException("Command " + command + " not executable.");
        }
        
        editingDomain.getCommandStack().execute(command);
    }	
>>>>>>> a014222359cdcf28781371da9ca4f2dfb72867b4
	 
	private def static String toLowerCaseFirst(String text) {
        var charArray = text.toCharArray();
        charArray.set(0, Character.toLowerCase(charArray.get(0)));
        String.valueOf(charArray);
    }
		
}