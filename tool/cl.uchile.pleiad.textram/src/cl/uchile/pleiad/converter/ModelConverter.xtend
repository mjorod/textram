package cl.uchile.pleiad.converter

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Association
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.ClassifierMapping
import ca.mcgill.cs.sel.ram.Instantiation
import ca.mcgill.cs.sel.ram.MappableElement
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.RamPackage
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.sel.ram.controller.edit.AdapterFactoryUtil
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassMember
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TStructuralView
import java.util.List
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.common.command.CompoundCommand
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.emf.edit.domain.EditingDomain
import ca.mcgill.cs.sel.ram.OperationMapping

class ModelConverter implements IModelConverter {
	
	/**
	 * Transform the textRam model to a ram model
	 */
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
	
	def convertInstantiation(Instantiation instantiation, Aspect ramAspect, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		val newInstantiation = RamFactory.eINSTANCE.createInstantiation()
		val ramExternalAspect = ModelConverterProxy::instance.convertTextRAMModelToRAMModel(instantiation.externalAspect) 
					
		newInstantiation.setExternalAspect(ramExternalAspect)
		newInstantiation.setType(instantiation.type)
    	
    	instantiation.mappings.forEach[ mapping | mapping.convertMapping(ramExternalAspect, newInstantiation, editingDomain, compoundCommand, cacheForMappableElements) ]
    
//    	compoundCommand.append(AddCommand.create( editingDomain, ramAspect, RamPackage.Literals.ASPECT__INSTANTIATIONS, newInstantiation))
    	
    	newInstantiation	
	}
	
	def convertMapping(ClassifierMapping mapping, Aspect ramExternalAspect, Instantiation newInstantiation, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		// mappings
		val ramClassifierMapping = RamFactory.eINSTANCE.createClassifierMapping()
		val tClassifierMapping = mapping as TClassifierMapping
		
		// from element
		val fromElement = ramExternalAspect.structuralView.classes.findFirst( c | c.name == tClassifierMapping.fromElement.name )
		ramClassifierMapping.setFromElement(fromElement)
		//compoundCommand.append(AddCommand.create(editingDomain, newClassifierMapping, RamPackage.Literals.CLASSIFIER_MAPPING__FROM_ELEMENT, fromElement))
		
		// to element
		val toElement = cacheForMappableElements.findFirst( e | e.name ==  tClassifierMapping.toElement.name ) as Classifier
		ramClassifierMapping.setToElement(toElement)
		//compoundCommand.append(AddCommand.create(editingDomain, newClassifierMapping, RamPackage.Literals.CLASSIFIER_MAPPING__TO_ELEMENT, toElement ))
		
		compoundCommand.append( AddCommand.create( editingDomain, newInstantiation, RamPackage.Literals.INSTANTIATION__MAPPINGS, ramClassifierMapping ))
		
		tClassifierMapping.fromMember.forEach[ classMemberFrom | classMemberFrom.convertMemberMappings(ramExternalAspect, ramClassifierMapping, tClassifierMapping, editingDomain, compoundCommand, cacheForMappableElements) ]
		
		ramClassifierMapping
	}
	
	def void convertMemberMappings(TClassMember classMemberFrom, Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TClassifierMapping tClassifierMapping, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		// class member To
		val indexOfClassMemberFrom = tClassifierMapping.fromMember.indexOf(classMemberFrom)
		
		val classMemberTo = tClassifierMapping.getFromMember().get(indexOfClassMemberFrom)
		
		classMemberFrom.createMemberMapping(classMemberTo, ramExternalAspect, newClassifierMapping, tClassifierMapping, editingDomain, compoundCommand, cacheForMappableElements);
	}
	
	private def dispatch void createMemberMapping(TOperation classMemberFrom, TClassMember classMemberTo, Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TClassifierMapping tClassifierMapping, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements){
		// creates operation mapping
		createOperationMapping(ramExternalAspect, newClassifierMapping, classMemberFrom, classMemberTo, editingDomain, compoundCommand, cacheForMappableElements)
		
		//compoundCommand.append(AddCommand.create(editingDomain, newClassifierMapping, RamPackage.Literals.OPERATION_MAPPING, null ))
	}
	
	private def createOperationMapping(Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TOperation tClassMemberFrom, TClassMember tClassMemberTo, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
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
																				 tClassMemberTo as TOperation, 
																				 editingDomain, 
																				 compoundCommand)]
		
		ramOperationMapping
	}
	
	def convertParameterMapping(Parameter tParameterFrom, OperationMapping ramOperationMapping,  Aspect externalAspect, Operation externalOperation, Operation internalOperation, TOperation tClassMemberFrom, TOperation tClassMemberTo, EditingDomain editingDomain, CompoundCommand compoundCommand) {
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
		
		// add the parameter mapping 
		//compoundCommand.append(AddCommand.create(editingDomain, ramOperationMapping, RamPackage.Literals.PARAMETER_MAPPING, ramOperationMapping))
				
		ramParameterMapping
	}
	
	private def dispatch void createMemberMapping(TAttribute classMemberFrom, TClassMember classMemberTo, Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TClassifierMapping tClassifierMapping, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements){
		// creates attribute mapping
		createAttributeMapping(ramExternalAspect, newClassifierMapping, classMemberFrom, classMemberTo, cacheForMappableElements)
		
		// creates attribute mapping 
//		compoundCommand.append(AddCommand.create(editingDomain, newClassifierMapping, RamPackage.Literals.ATTRIBUTE_MAPPING, ramAttributeMapping ))
	}
	
	private def createAttributeMapping(Aspect ramExternalAspect, ClassifierMapping ramClassifierMapping, TAttribute classMemberFrom, TClassMember classMemberTo, List<MappableElement> cacheForMappableElements) {
		val ramAttributeMapping = RamFactory.eINSTANCE.createAttributeMapping()
		val externalAttribute = ramExternalAspect.structuralView.classes.filter(Class).map[attributes].flatten.findFirst( attr | attr.name == classMemberFrom.name )
		ramAttributeMapping.setFromElement( externalAttribute )
		ramAttributeMapping.setToElement( cacheForMappableElements.findFirst( e | e.name == classMemberTo.name ) as Attribute )
		
		ramAttributeMapping
	}
	private def void convertAssociations(StructuralView ramStructuralView, TStructuralView tStructuralView, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		tStructuralView.TAssociations.forEach[ t | val assoc = t.convertAssociation(ramStructuralView, editingDomain, compoundCommand, cacheForMappableElements)  ]
	}
	
	def convertAssociation(TAssociation t, StructuralView ramStructuralView, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		var Class from = cacheForMappableElements.filter( c | c.name == t.fromEnd.classReference.name ).head as Class
		var Class to = cacheForMappableElements.filter( c | c.name == t.toEnd.classReference.name ).head as Class
		
		val classNameFrom = t.fromEnd.classReference.name
		val classNameTo = t.toEnd.classReference.name
		
		// create association
		var association = RamFactory.eINSTANCE.createAssociation()
		association.setName(classNameFrom + "_" + classNameTo);
		
		association.convertAssociationEndClassFrom( t, from, to, editingDomain, compoundCommand )
		
		association.convertAssociationEndClassTo ( t, from, to, editingDomain, compoundCommand )
        
//        // create command for association
//        compoundCommand.append(AddCommand.create(editingDomain, ramStructuralView, RamPackage.Literals.STRUCTURAL_VIEW__ASSOCIATIONS, association));
         
        return association
	}
	
	def convertAssociationEndClassFrom(Association association, TAssociation tAssociation, Class from, Class to, EditingDomain editingDomain, CompoundCommand compoundCommand ) {
		// create from association end
     	var fromEnd = RamFactory.eINSTANCE.createAssociationEnd();
     	fromEnd.setAssoc(association);
     	fromEnd.setLowerBound(tAssociation.fromEnd.lowerBound)
     	fromEnd.setUpperBound(tAssociation.fromEnd.upperBound)
     	fromEnd.setName(to.name.toLowerCaseFirst)
     
//     	compoundCommand.append(AddCommand.create(editingDomain, from, RamPackage.Literals.CLASS__ASSOCIATION_ENDS, fromEnd))
		
		fromEnd
	}
	
	def convertAssociationEndClassTo(Association association, TAssociation tAssociation, Class from, Class to, EditingDomain editingDomain, CompoundCommand compoundCommand ) {
		 // create to association end
         var toEnd = RamFactory.eINSTANCE.createAssociationEnd();
         toEnd.setAssoc(association);
         toEnd.setLowerBound(tAssociation.toEnd.lowerBound)
         toEnd.setUpperBound(tAssociation.toEnd.upperBound)
         toEnd.setName(from.name.toLowerCaseFirst)
     
//     	 compoundCommand.append(AddCommand.create(editingDomain, to, RamPackage.Literals.CLASS__ASSOCIATION_ENDS, toEnd));
     	 
     	 toEnd
   	}
	
	private def void convertSuperTypes(StructuralView structuralView, TStructuralView tStructuralView, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		tStructuralView.classes.filter(Class).filter(c | c.superTypes.empty == false).forEach[ tClass |
				val subType = cacheForMappableElements.filter( c | c.name == tClass.name).head as Classifier;
				val superType =  cacheForMappableElements.filter( c | c.name == tClass.superTypes.head.name ).head as Classifier;
				
				subType.addSuperType(superType, editingDomain, compoundCommand)
			]
			
	}
	
	def void addSuperType(Classifier subType, Classifier superType, EditingDomain editingDomain, CompoundCommand compoundCommand) {
//		compoundCommand.append(AddCommand.create(editingDomain, 
//													 subType,
//													 RamPackage.Literals.CLASS__SUPER_TYPES, // feature
//													 superType))
	}
	
	def void convertClasses(StructuralView ramStructuralView, TStructuralView tStructuralView, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements ) {
		tStructuralView.classes.forEach[ classifier | val c = classifier.convertClass(ramStructuralView, editingDomain, compoundCommand, cacheForMappableElements)  ]
	}
	
	def Class convertClass(Classifier classifier, StructuralView ramStructuralView, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		val tClass = classifier as TClass
		
		val ramClass = RamFactory.eINSTANCE.createClass()
		ramClass.setName(tClass.name)
		ramClass.setAbstract(tClass.abstract)
		ramClass.setPartial(tClass.partial)
		
		// add class
		compoundCommand.append(AddCommand.create(editingDomain, ramStructuralView, RamPackage.Literals.CLASSIFIER, ramClass))
		cacheForMappableElements.add(ramClass)
		
		// uses dispatch methods to add attributes and operations
		tClass.members.forEach[ classMember | convertClassMember(classMember, ramClass, editingDomain, compoundCommand, cacheForMappableElements ) ]
	
		ramClass
	}
	
	private def dispatch convertClassMember(TOperation tOperation, Class classOwner, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		val ramOperation = tOperation.convertOperation(classOwner, editingDomain, compoundCommand )
		
		cacheForMappableElements.add(ramOperation)
	}
	
	private def convertOperation(TOperation tOperation, Class classOwner, EditingDomain editingDomain, CompoundCommand compoundCommand) {
		val ramOperation = RamFactory.eINSTANCE.createOperation()
		ramOperation.setName(tOperation.name)
		ramOperation.setAbstract(tOperation.abstract)
		ramOperation.setStatic(tOperation.static)
		ramOperation.setPartial(tOperation.partial)
		ramOperation.setReturnType(tOperation.returnType)
		ramOperation.setVisibility(tOperation.visibility)
		
		ramOperation.parameters.addAll( EcoreUtil.copyAll( tOperation.parameters ))
		
		//compoundCommand.append(AddCommand.create(editingDomain, classOwner, RamPackage.Literals.CLASSIFIER__OPERATIONS, ramOperation))
		
		ramOperation
	}
	
	private def dispatch convertClassMember(TAttribute tAttribute, Class classOwner, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		val ramAttribute = tAttribute.convertAttribute(classOwner, editingDomain, compoundCommand)
		
		cacheForMappableElements.add(ramAttribute)
	}
	
	private def convertAttribute(TAttribute tAttribute, Class classOwner, EditingDomain editingDomain, CompoundCommand compoundCommand) {
		val ramAttribute = RamFactory.eINSTANCE.createAttribute()
		ramAttribute.setName(tAttribute.name)
		ramAttribute.setStatic(tAttribute.static)
		ramAttribute.setType(tAttribute.type)
		
		//compoundCommand.append(AddCommand.create(editingDomain, classOwner, RamPackage.Literals.CLASS__ATTRIBUTES, ramAttribute))
		
		ramAttribute
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
	 
	private def static String toLowerCaseFirst(String text) {
        var charArray = text.toCharArray();
        charArray.set(0, Character.toLowerCase(charArray.get(0)));
        String.valueOf(charArray);
    }
		
}