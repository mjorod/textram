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

class TextRAMTransform implements ITextRAMTransform {
	
	override transform(TAspect textRamAspect) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	override TAspect transform(Aspect ramAspect) {
		val res = TextRamFactory.eINSTANCE.createTAspect
		
		res.structuralView = ramAspect.structuralView.transformStructuralView
				
		res		
	}
	
	private def TStructuralView transformStructuralView(StructuralView ramStructuralView) {
		val res = TextRamFactory.eINSTANCE.createTStructuralView
		
		res.classes.addAll( ramStructuralView.classes.transformClasses )
		
		res
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
		res.abstract = operation.abstract
		res.visibility = operation.visibility
		res.returnType = operation.returnType
		
		
		res
	}
	
	private def transformAttributes(List<Attribute> ramAttributes) {
		val List<TClassMember> res = newArrayList
		
		res
	}
		
}

