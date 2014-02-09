package cl.uchile.pleiad.scoping

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Instantiation
import ca.mcgill.cs.sel.ram.InstantiationType
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import ca.mcgill.cs.sel.ram.Visibility
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassMember
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TStructuralView
import cl.uchile.pleiad.textRam.TTypedElement
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import cl.uchile.pleiad.textRam.TAttribute
import ca.mcgill.cs.sel.ram.StructuralFeature
import java.util.List
import cl.uchile.pleiad.textRam.TStructuralFeature
import cl.uchile.pleiad.textRam.TInteraction
import cl.uchile.pleiad.textRam.TextRamFactory
import cl.uchile.pleiad.textRam.TAbstractMessageView

class ModelScopeProvider implements IModelScopeProvider {
	
	override getTypesFor(StructuralView structuralView) {
		structuralView.types.appendPrimitiveTypes
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
		val tStructuralView = (aspect.structuralView as TStructuralView)
		val ret = aspect.structuralView.classes.filter(TClass).filter(TTypedElement).toList
		ret.addAll ( tStructuralView.TAssociations.toList )
		ret.addAll ( tStructuralView.classes.filter(TClass).map[members].flatten.filter(TAttribute))
		
		ret
	}
	
	private static def getAllTypes(StructuralView structuralView) {
		val EList<Type>  typeList = new BasicEList<Type> 
		for ( clazz : structuralView.classes ) {
			typeList.add(clazz)
			
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
			typesToReturn.add(RamFactory.eINSTANCE.createRVoid());
			typesToReturn.add(RamFactory.eINSTANCE.createRBoolean());
			typesToReturn.add(RamFactory.eINSTANCE.createRInt());
			typesToReturn.add(RamFactory.eINSTANCE.createRChar());
			typesToReturn.add(RamFactory.eINSTANCE.createRString());
			typesToReturn.add(RamFactory.eINSTANCE.createRAny());
		//			typesToReturn.add(RamFactory.eINSTANCE.createREnum());
		//			typesToReturn.add(RamFactory.eINSTANCE.createRSet());
			typesToReturn.add(RamFactory.eINSTANCE.createRDouble());
			typesToReturn.add(RamFactory.eINSTANCE.createRFloat());
		}
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
	
	override getTStructuralFeature(Aspect aspect) {
		val result = newArrayList()
		
		result.addAll ( aspect.getTAttributes.filter(TStructuralFeature) )
		result.addAll ( aspect.getTAssociations.filter(TStructuralFeature) )
		
		//TODO: Reference is missing
		
		result
	}
	
	private def getTAssociations(Aspect aspect) {
		(aspect.structuralView as TStructuralView).TAssociations
	}
	
	private def getTAttributes(Aspect aspect) {
		aspect.structuralView.classes.filter(TClass)
									 .map[members]
									 .flatten
									 .filter(TAttribute)
	}
	
	override getLeftTLifelines(Aspect aspect) {
		val tAbstractMessageView = aspect.messageViews.head as TAbstractMessageView
		
		if (tAbstractMessageView != null) {
			if (tAbstractMessageView.lifelines.exists[l | l.name == '>>'] == false) {
				val tStartGate = TextRamFactory.eINSTANCE.createTLifeline
				tStartGate.setName(">>")
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
				val tEndGate = TextRamFactory.eINSTANCE.createTLifeline
				tEndGate.setName("<<")
				tAbstractMessageView.lifelines.add(tEndGate)
				return tAbstractMessageView.lifelines
			}		
		}
		
		return null
	}
}