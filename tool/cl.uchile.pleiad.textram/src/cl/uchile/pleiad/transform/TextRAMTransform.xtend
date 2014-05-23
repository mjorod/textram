package cl.uchile.pleiad.transform

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import cl.uchile.pleiad.textRam.TAspect
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassMember
import cl.uchile.pleiad.textRam.TextRamFactory
import cl.uchile.pleiad.util.TextRamEcoreUtil
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.EcoreUtil

class TextRAMTransform implements ITextRAMTransform {
	
	val extension TextRamEcoreUtil textRamEcoreUtil = new TextRamEcoreUtil()
	
	override transform(TAspect textRamAspect) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override TAspect transform(Aspect ramAspect) {
		val textRamAspect = TextRamFactory.eINSTANCE.createTAspect
		
		ramAspect.structuralView.transformStructuralView( textRamAspect )
				
		return textRamAspect
	}
	
	private def transformStructuralView(StructuralView from, TAspect to) {
		to.structuralView = TextRamFactory.eINSTANCE.createTStructuralView
		
		//TODO: RSet
		to.structuralView.types.addAll( from.types.copyTypes )
		to.structuralView.classes.addAll( from.classes.transformClasses(to) )
		
	}
	
	private def copyTypes(List<Type> ramTypes) {
		val result = EcoreUtil.copyAll(ramTypes) 
		result
	}
	
	private def transformClasses(EList<Classifier> ramClasses, TAspect to) {
		val List<TClass> res = newArrayList
		
		ramClasses.forEach[ c |
			res.add( c.transformClass(to) )
		]
		
		res
	}
	
	private def TClass transformClass(Classifier from, TAspect to) {
		val ramClass = from as Class
		
		val res = TextRamFactory.eINSTANCE.createTClass => [
			layoutX = 0
			layoutY = 0
			members.addAll( ramClass.operations.transformOperations(to) )
			members.addAll( ramClass.attributes.transformAttributes(to) )
		]
		
		if ( ramClass.superTypes.size > 1 ) {
			throw new IllegalStateException('TextRam classes can have only one super type')
		}
		
		if ( ramClass.superTypes.size == 1 ) {
			res.partialSuperType = (ramClass.superTypes.get(0) as Class).partial
		}

		res
	}
	
	private def transformOperations(List<Operation> ramOperations, TAspect to) {
		val List<TClassMember> res = newArrayList
		
		ramOperations.forEach [ o |
			res.add( o.transforOperation(to) )
		]
		
		res
	}
	
	private def transforOperation(Operation operation, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTOperation
		res.static = operation.static
		res.partial = operation.partial
		res.name = operation.name
		res.abstract = operation.abstract
		res.visibility = operation.visibility
		res.returnType = to.getTypeReference( operation.returnType )
		
		if ( operation.returnType instanceof Class ) {
			res.partialReturnType = (operation.returnType as Class).partial
		}
		
		operation.parameters.forEach[ p | 
			res.parameters.add( p.transformParameter(to) )
		]
		
		res
	}
	
	private def transformParameter(Parameter parameter, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTParameter
		
		res.type = to.getTypeReference( parameter.type )
		res.name = parameter.name
		
		if ( parameter.type instanceof Class ) {
			res.partialType = ( parameter.type as Class ).partial
		}
		
		res
	}
	
	private def transformAttributes(List<Attribute> ramAttributes, TAspect to) {
		val List<TClassMember> res = newArrayList
		
		ramAttributes.forEach[ a | 
			res.add( a.transformAttribute(to) )
		]
		
		res
	}
	
	private def transformAttribute(Attribute from, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTAttribute
		res.static = from.static
		res.name = from.name
		res.type = to.getTypeReference( from.type ) as PrimitiveType

		res
	}
		
}