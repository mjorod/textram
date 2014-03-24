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

class ModelScopeProvider implements IModelScopeProvider {
	
	override getTypesFor(StructuralView structuralView) {
		structuralView.types.appendPrimitiveTypes
		
		structuralView.types.addAll(addRSetPrimitiveTypes( structuralView.types ))
				
		return structuralView.allTypes
	}
	
	override getPrimitiveTypes(StructuralView structuralView) {
		structuralView.getTypes().appendPrimitiveTypes

		structuralView.getTypes().filter(typeof(PrimitiveType)).toList
	}
	
	override getClasses(Instantiation instantiation) {
		instantiation.externalAspect.structuralView.classes.toList
	}
	
	override getMembersFrom(TClassifierMapping classifierMapping) {
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
	
	override getPublicOperations(Aspect aspect) {
		val operations = aspect.structuralView.classes.filter(TClass).map[members].flatten.filter(TOperation).filter(oper | oper.visibility == Visibility.PUBLIC).toList
		operations
	}
	
	override getTTypedElements(Aspect aspect) {
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
	
	override getParameters(Aspect aspect) {
		val tStructuralView = aspect.structuralView as TStructuralView
		
		tStructuralView.classes.filter(TClass)
							   .map[members]
							   .flatten
							   .filter(TOperation)
							   .map[parameters]
							   .flatten
							   .toList
	}
	
	override getParameters(TMessageView messageView) {
		messageView.parameters
	}
	
	override getAssignableFeatures(TInteractionMessage textRamInteractionMessage) {
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

	override getLeftTLifelines(Aspect aspect) {
		val tAbstractMessageView = aspect.messageViews.head as TAbstractMessageView
		
		if (tAbstractMessageView != null) {
			if (tAbstractMessageView.lifelines.exists[l | l.name == '>>'] == false) {
				val tStartGate = TextRamFactory.eINSTANCE.createTLifeline => [
					name = '>>'
				]
				tAbstractMessageView.lifelines.add(tStartGate)
				
				return tAbstractMessageView.lifelines
			}		
		}
		
		return null
	}
	
	override getRightTLifelines(Aspect aspect) {
		val tAbstractMessageView = aspect.messageViews.head as TAbstractMessageView
		
		if (tAbstractMessageView != null) {
			if (tAbstractMessageView.lifelines.exists[l | l.name == '<<'] == false) {
				val tEndGate = TextRamFactory.eINSTANCE.createTLifeline => [
					name = '<<'
				]
				
				tAbstractMessageView.lifelines.add(tEndGate)
				
				return tAbstractMessageView.lifelines
			}		
		}
		
		return null
	}
	
	
	override getReturnMessageAssignTo(TInteractionMessage textRamInteractionMessage) {
		val List<TMessageAssignableFeature> result = newArrayList
		
		result.addAll ( textRamInteractionMessage.getAspect.allAssociations )
		result.addAll ( textRamInteractionMessage.rightLifeline.localProperties )
		//TODO: parameters?
		result
	}
	
	override getAspectMessageViews(TAbstractMessageView abstractMessageView) {
		val List<TAspectMessageView> result = newArrayList
		
		abstractMessageView.messages.filter(TAspectMessageView).forEach( m | result.add(m))
		
		result
	}
		
}