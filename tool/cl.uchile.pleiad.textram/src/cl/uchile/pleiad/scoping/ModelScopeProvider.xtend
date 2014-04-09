package cl.uchile.pleiad.scoping

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Instantiation
import ca.mcgill.cs.sel.ram.InstantiationType
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.RamPackage
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import ca.mcgill.cs.sel.ram.Visibility
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TAspectMessageView
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassMember
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TInteractionMessage
import cl.uchile.pleiad.textRam.TMessageAssignableFeature
import cl.uchile.pleiad.textRam.TMessageView
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TStructuralView
import cl.uchile.pleiad.textRam.TTypedElement
import cl.uchile.pleiad.textRam.TextRamFactory
import cl.uchile.pleiad.util.TextRamEcoreUtil
import java.util.List
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import ca.mcgill.cs.sel.ram.RSet
import cl.uchile.pleiad.textRam.TAspect
import cl.uchile.pleiad.textRam.TAbstractMessages
import cl.uchile.pleiad.textRam.TMessage
import cl.uchile.pleiad.textRam.TValueSpecification
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TParameterValue
import cl.uchile.pleiad.textRam.TTemporaryProperty
import cl.uchile.pleiad.textRam.TLifelineReferenceType
import cl.uchile.pleiad.textRam.TReference

class ModelScopeProvider {
	
	def getExternalAspectsFromHeader(TAspect aspect) {
		val validExternalAspects = aspect.headerInstantiations.map[externalAspects].flatten
		validExternalAspects						
	}
	
	def getTypesFor(StructuralView structuralView) {
		structuralView.types.appendPrimitiveTypes
		
		structuralView.types.addAll(addRSetPrimitiveTypes( structuralView.types ))
				
		return structuralView.allTypes
	}
	
	def getPrimitiveTypes(StructuralView structuralView) {
		structuralView.getTypes().appendPrimitiveTypes

		structuralView.getTypes().filter(typeof(PrimitiveType)).toList
	}
	
	def getClasses(Instantiation instantiation) {
		instantiation.externalAspect.structuralView.classes.toList
	}
	
	def getMembersFrom(TClassifierMapping classifierMapping) {
		// instantiation type from the container of classifierMapping
		val instantiationType = (classifierMapping.eContainer as Instantiation).type
		
		// class from external aspect
		val fromElement = classifierMapping.fromElement as TClass
		
		// customization is allowed to use only public elements
		if (instantiationType == InstantiationType.DEPENDS) {
			return fromElement.members.filter(TOperation).filter( t | t.visibility == Visibility.PUBLIC ).filter(TClassMember).toList
		}
		
		// extensions is allowed to use public and private elements
		return fromElement.members.toList 
	}
	
	def getPublicOperations(Aspect aspect) {
		val operations = aspect.structuralView.classes.filter(TClass).map[members].flatten.filter(TOperation).filter(oper | oper.visibility == Visibility.PUBLIC).toList
		operations
	}
	
	def getOperations(Aspect aspect) {
		val operations = aspect.structuralView.classes.filter(TClass).map[members].flatten.filter(TOperation)
		operations
	}
	
	def getTTypedElements(Aspect aspect) {
		//AssociationEnd
		//Attribute
		//Parameter
		//Reference/Class
		
		val List<TTypedElement> result = newArrayList
		
		result.addAll( aspect.getAllAssociations )
		result.addAll( aspect.getAllAttributes ) //TODO: nunca me encontré con un attribute
		//result.addAll( aspect.getAllParameters ) //TODO:parameters
		result.addAll( aspect.getAllClasses )
		
		result
	}
	
	private def getAllClasses(Aspect aspect) {
		return aspect.structuralView.classes.filter(TClass).filter(TTypedElement).toList
	}
	
	private def getAllAttributes(Aspect aspect) {
		val tStructuralView = (aspect.structuralView as TStructuralView)
		return tStructuralView.classes.filter(TClass).map[members].flatten.filter(TAttribute)
	}
	
	private def getAllAssociations(Aspect aspect) {
		val tStructuralView = (aspect.structuralView as TStructuralView)
		return tStructuralView.TAssociations.toList 
	}
	
	private static def getAllTypes(StructuralView structuralView) {
		val EList<Type>  typeList = new BasicEList<Type> 
		for ( clazz : structuralView.classes ) {
			typeList.add(clazz)
			
			if ( structuralView.types.filter(RSet).exists[t | t.type.name == clazz.name] == false ) {
				val rSet = RamFactory.eINSTANCE.createRSet => [
					type = clazz
					instanceClassName = '''Set<« clazz.name »>'''
				]
				
				structuralView.types.add(rSet)
				typeList.add(rSet)
			}
			
			// it also add a RSet
//			val rSet = RamFactory.eINSTANCE.createRSet()
//			rSet.setType(clazz)
//			rSet.setInstanceClassName(rSet.name)
//			structuralView.types.add(rSet as Type)
		}
		
		for ( type : structuralView.types ) {
			typeList.add(type)
			
//			// it also add a RSet
//			val rSet = RamFactory.eINSTANCE.createRSet()
//			rSet.setType(type as ObjectType)
//			typeList.add(rSet)
		}
		
		typeList
	}
	
	private static def appendPrimitiveTypes(EList<Type> typesToReturn) {
		if (typesToReturn.length == 0) {
			typesToReturn.add(RamFactory.eINSTANCE.createRVoid)
			typesToReturn.add(RamFactory.eINSTANCE.createRBoolean)
			typesToReturn.add(RamFactory.eINSTANCE.createRChar)
			typesToReturn.add(RamFactory.eINSTANCE.createRInt)
			typesToReturn.add(RamFactory.eINSTANCE.createRString)
			typesToReturn.add(RamFactory.eINSTANCE.createRAny)
			typesToReturn.add(RamFactory.eINSTANCE.createRDouble)
			typesToReturn.add(RamFactory.eINSTANCE.createRFloat)
		}
	}
	
	/**
	 * This method add a RSet type for each primitive type in the list.
	 * 
	 * @types list of types in the structural view
	 * @returns list of RSet type for each primitive type in the structural view
	 */
	private static def addRSetPrimitiveTypes(EList<Type> types) {
		val result = new BasicEList<Type>
		
		if (types.filter(RSet).size() == 0) {
		
			types.filter(PrimitiveType).forEach[ t |
				val rSet = RamFactory.eINSTANCE.createRSet => [
					type = t
					instanceClassName = '''Set<« t.name »>''' //TODO: implementationName is mandatory for eclipse's workbench. It works with a dummy value.
				]
				
				result.add(rSet)
			]
			
		}
		else 
		{
			result.addAll( types.filter(RSet) )
		}
		
		result
	}
	
	def getParameters(Aspect aspect) {
		val tStructuralView = aspect.structuralView as TStructuralView
		
		tStructuralView.classes.filter(TClass)
							   .map[members]
							   .flatten
							   .filter(TOperation)
							   .map[parameters]
							   .flatten
							   .toList
	}
	
	def getParameters(TMessageView messageView) {
		messageView.parameters
	}
	
	def getAssignableFeatures(TInteractionMessage textRamInteractionMessage) {
		val List<TMessageAssignableFeature> result = newArrayList()
		
		result.addAll ( textRamInteractionMessage.leftLifeline.localProperties )
		result.addAll ( textRamInteractionMessage.getAspect.getAllAssociations )
		result
	}
	
	private def getAspect(TInteractionMessage textRamInteractionMessage) {
		val Aspect result = TextRamEcoreUtil.getRootContainerOfType(textRamInteractionMessage, RamPackage.Literals.ASPECT)
		result
	}
	
	def getGetTAttributesFromLifelines(Aspect aspect) {
		val tAbstractMessageView = aspect.messageViews.head as TAbstractMessageView
		
		if (tAbstractMessageView != null) {
			return tAbstractMessageView.lifelines.map[localProperties].flatten
		}
		
		return null
	}
	
	//TODO: why uses rightlifeline
	def getReturnMessageAssignTo(TInteractionMessage textRamInteractionMessage) {
		val List<TMessageAssignableFeature> result = newArrayList
		
		result.addAll ( textRamInteractionMessage.getAspect.allAssociations )
		result.addAll ( textRamInteractionMessage.rightLifeline.localProperties )
		//TODO: parameters?
		result
	}
	
	def getAspectMessageViews(TAbstractMessageView abstractMessageView) {
		val List<TAspectMessageView> result = newArrayList
		
		abstractMessageView.messages.filter(TAspectMessageView).forEach( m | result.add(m))
		
		result
	}
	
	def getOperationsForAspectMessageView(TAbstractMessages messageView) {
		if ( messageView.class_ != null ) {
			return messageView.class_.members.filter(TOperation)
		}
		else {
			val Aspect aspect = TextRamEcoreUtil.getRootContainerOfType(messageView, RamPackage.Literals.ASPECT)
			return aspect.getPublicOperations
		}
	}
	
	def getArgumentsForAspectMessageViewOperation(TAbstractMessages messageView) {
		val Aspect aspect = TextRamEcoreUtil.getRootContainerOfType(messageView, RamPackage.Literals.ASPECT)
		
		val clazz = messageView.class_
		
		var Iterable<TOperation> operations
		
		if (clazz != null) {
			operations = (aspect.structuralView as TStructuralView).classes.filter(TClass).filter( c | c.name == messageView.class_.name ).map[members].flatten.filter(TOperation).filter( o | o.name == messageView.specifies.name )
		}
		else {
			operations = (aspect.structuralView as TStructuralView).classes.filter(TClass).map[members].flatten.filter(TOperation).filter( o | o.name == messageView.specifies.name )
		}
		
		val result = operations.map[parameters].flatten
		
		result
//		// check operation's signature
//		operations.forEach[ o |
//			// checks for arguments length
//			if (o.parameters.length == aspectMessageView.arguments.length) {
//				// checks each argument type
//				for ( Integer i: 0..o.parameters.size - 1) {
//					if ( o.parameters.get(i).type.name.equals( aspectMessageView.arguments.get(i).type.name ) == false ) {
//						
//					}
//				}
//				
//			}
//			
//		]
//		
	}
	
	def getTValueSpecificationList(TInteractionMessage interaction) {
		val List<TValueSpecification> result = newArrayList
		
		val Aspect aspect = TextRamEcoreUtil.getRootContainerOfType(interaction, RamPackage.Literals.ASPECT)
		val operationName = (interaction.message as TMessage).signature.name
		
		// possible parameters from signature
		val clazz = interaction.rightLifeline.represents.getClassOwner(aspect)
		val List<TParameterValue> parameterValueList = newArrayList
		clazz.members.filter(TOperation).filter(o | o.name == operationName ).map[parameters].flatten.forEach[ p |
			val parameterValue = TextRamFactory.eINSTANCE.createTParameterValue => [
				parameter = p
			]
			
			parameterValueList.add(parameterValue)
		]
		
		// add parameters
		result.addAll(parameterValueList)
		
		
		val lifeline = interaction.leftLifeline
		
		// add class reference
		if (lifeline.referenceType == TLifelineReferenceType.REFERENCE) {
			result.add(lifeline)
		}
		
		// add temporary properties
		val List<TTemporaryProperty> temporaryPropertyList = newArrayList
		
		lifeline.localProperties.forEach[ p | 
			temporaryPropertyList.add(p)
		]
		result.addAll(temporaryPropertyList)
		
		result
	}
	
	private def dispatch getClassOwner(TAssociation owner, Aspect aspect) {
		val result = owner.toEnd.classReference as TClass
		result
	}
	
	private def dispatch getClassOwner(TAttribute owner, Aspect aspect) {
		val result = ( owner ).eContainer as TClass
		result
	}
	
	private def dispatch getClassOwner(TClass owner, Aspect aspect) {
		val result = owner
		result
	}
		
}