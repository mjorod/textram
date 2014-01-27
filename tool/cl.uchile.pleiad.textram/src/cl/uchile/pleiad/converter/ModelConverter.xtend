package cl.uchile.pleiad.converter

import ca.mcgill.cs.sel.ram.Aspect
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
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TStructuralView
import java.util.List
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
		val newInstantiation = RamFactory.eINSTANCE.createInstantiation()
		val ramExternalAspect = ModelConverterProxy::instance.convertTextRAMModelToRAMModel(instantiation.externalAspect) 
					
		newInstantiation.setExternalAspect(ramExternalAspect)
		newInstantiation.setType(instantiation.type)
    	
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
		ramOperation.setStatic(tOperation.static)
		ramOperation.setPartial(tOperation.partial)
		ramOperation.setReturnType(tOperation.returnType)
		ramOperation.setVisibility(tOperation.visibility)
		
		ramOperation.parameters.addAll( EcoreUtil.copyAll( tOperation.parameters ))
		
		compoundCommand.append(AddCommand.create(editingDomain, classOwner, RamPackage.Literals.CLASSIFIER__OPERATIONS, ramOperation))
		cacheForMappableElements.add(ramOperation)
	}
	
	private def dispatch addMemberToClass(TAttribute tAttribute, Class classOwner, EditingDomain editingDomain, CompoundCommand compoundCommand, List<MappableElement> cacheForMappableElements) {
		val ramAttribute = RamFactory.eINSTANCE.createAttribute()
		ramAttribute.setName(tAttribute.name)
		ramAttribute.setStatic(tAttribute.static)
		ramAttribute.setType(tAttribute.type)
		
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
	 
	private def static String toLowerCaseFirst(String text) {
        var charArray = text.toCharArray();
        charArray.set(0, Character.toLowerCase(charArray.get(0)));
        String.valueOf(charArray);
    }
		
}