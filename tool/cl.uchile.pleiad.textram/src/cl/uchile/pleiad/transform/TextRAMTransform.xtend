package cl.uchile.pleiad.transform

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.StructuralView
import cl.uchile.pleiad.textRam.TAspect
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TStructuralView
import cl.uchile.pleiad.textRam.TextRamFactory
import java.util.List
import org.eclipse.emf.common.util.EList
import ca.mcgill.cs.sel.ram.Classifier
import java.util.Collection
import cl.uchile.pleiad.textRam.TClassMember
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Type
import org.eclipse.emf.ecore.util.EcoreUtil
import cl.uchile.pleiad.util.TextRamEcoreUtil
import cl.uchile.pleiad.textRam.TextRamPackage
import cl.uchile.pleiad.textRam.TParameter
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.PrimitiveType

class TextRAMTransform implements ITextRAMTransform {
	
	val extension TextRamEcoreUtil textRamEcoreUtil = new TextRamEcoreUtil()
	
	private var Aspect ramAspect;
	private var TAspect textRamAspect;
	
	override transform(TAspect textRamAspect) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override TAspect transform(Aspect ramAspect) {
		this.textRamAspect = TextRamFactory.eINSTANCE.createTAspect
		
		this.textRamAspect.structuralView = ramAspect.structuralView.transformStructuralView
				
		this.textRamAspect
	}
	
	private def TStructuralView transformStructuralView(StructuralView ramStructuralView) {
		val res = TextRamFactory.eINSTANCE.createTStructuralView
		
		//TODO: RSet
		res.types.addAll( ramStructuralView.types.copyTypes )
		res.classes.addAll( ramStructuralView.classes.transformClasses )
		
		res
	}
	
	private def copyTypes(List<Type> ramTypes) {
		val result = EcoreUtil.copyAll(ramTypes) 
		result
	}
	
	private def transformClasses(EList<Classifier> ramClasses) {
		val List<TClass> res = newArrayList
		
		ramClasses.forEach[ c |
			res.add( c.transformClass )
		]
		
		res
	}
	
	private def TClass transformClass(Classifier classifier) {
		val ramClass = classifier as Class
		
		if ( ramClass.superTypes.size > 1 ) {
			throw new IllegalStateException('TextRam classes can have only one super type')
		}
		
		val res = TextRamFactory.eINSTANCE.createTClass => [
			partialSuperType = (ramClass.superTypes.get(0) as Class).partial
			layoutX = 0
			layoutY = 0
			members.addAll( ramClass.operations.transformOperations )
			members.addAll( ramClass.attributes.transformAttributes )
		]
		
		res
	}
	
	private def transformOperations(List<Operation> ramOperations) {
		val List<TClassMember> res = newArrayList
		
		ramOperations.forEach [ o |
			res.add( o.transforOperation )
		]
		
		res
	}
	
	def transforOperation(Operation operation) {
		val res = TextRamFactory.eINSTANCE.createTOperation
		res.static = operation.static
		res.partial = operation.partial
		res.name = operation.name
		res.abstract = operation.abstract
		res.visibility = operation.visibility
		res.returnType = this.textRamAspect.getTypeReference( operation.returnType )
		
		if ( operation.returnType instanceof Class ) {
			res.partialReturnType = (res.returnType as Class).partial
		}
		
		operation.parameters.forEach[ p | 
			res.parameters.add( p.transformParameter )
		]
		
		res
	}
	
	def transformParameter(Parameter parameter) {
		val res = TextRamFactory.eINSTANCE.createTParameter
		
		res.type = this.textRamAspect.getTypeReference( parameter.type )
		res.name = parameter.name
		
		if ( parameter.type instanceof Class ) {
			res.partialType = ( parameter.type as Class ).partial
		}
		
		res
	}
	
	private def transformAttributes(List<Attribute> ramAttributes) {
		val List<TClassMember> res = newArrayList
		
		ramAttributes.forEach[ a | 
			res.add( a.transformAttribute )
		]
		
		res
	}
	
	def transformAttribute(Attribute attr) {
		val res = TextRamFactory.eINSTANCE.createTAttribute
		res.static = attr.static
		res.name = attr.name
		res.type = this.textRamAspect.getTypeReference( attr.type ) as PrimitiveType

		res
	}
		
}

