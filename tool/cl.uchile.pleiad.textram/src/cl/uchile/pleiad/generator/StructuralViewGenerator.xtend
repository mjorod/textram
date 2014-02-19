package cl.uchile.pleiad.generator

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RVoid
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.Type
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TOperation
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil

class StructuralViewGenerator {
	
	private val PARTIAL = '|'
	
	Aspect textRamAspect
	Aspect ramAspect
	
	new(Aspect textRamAspect) {
		this.textRamAspect = textRamAspect
		
		ramAspect = RamFactory.eINSTANCE.createAspect => [
			name = textRamAspect.name
			structuralView = RamFactory.eINSTANCE.createStructuralView
		]
		
		generateStructuralView
	}
	
	def generate() {
		ramAspect
	}
	
	private def generateStructuralView() {
		ramAspect.structuralView.types.addAll(generateTypes)
		ramAspect.structuralView.classes.addAll(generateClasses)
	}
	
	private def generateClasses() {
		val List<Classifier> result = newArrayList
		
		textRamAspect.structuralView.classes.filter(TClass).forEach [ textRamClass |
			result.add (textRamClass.generateClass)
		]
//		textRamStructuralView.classes.filter(TClass).forEach[ textRamClass | textRamClass.transformClass(ramStructuralView, collector)  ]
		
		
		result
	}
	
	private def generateClass(TClass from) {
		val clazz = RamFactory.eINSTANCE.createClass
		
		clazz.name = from.name.resolveNameWithPartial
		clazz.abstract = from.abstract
		clazz.partial = from.name.startsWith(PARTIAL)
		clazz.superTypes.addAll(from.generateSuperTypes)
		clazz.operations.addAll(from.generateOperations)
		clazz.attributes.addAll(from.generateAttributes)
		
		clazz
	}
	
	def generateSuperTypes(TClass textRamClass) {
		val List<Classifier> result = newArrayList
		
		textRamClass.superTypes.forEach[ superType | 
			result.add( ramAspect.structuralView.classes.findFirst( c | c.name == superType.name.resolveNameWithPartial ) )
		]
		
		result
	}
	
	def resolveNameWithPartial(String name) {
		name.replace(PARTIAL, '')
	}
	
	private def generateOperations(TClass textRamClass) {
		val List<Operation> result = newArrayList
		
		textRamClass.members.filter(TOperation).forEach[ o | 
			result.add(o.generateOperation )
		]
		
		result
	}
	
	private def generateOperation(TOperation from) {
		val result = RamFactory.eINSTANCE.createOperation => [
			name = from.name.resolveNameWithPartial
			abstract = from.abstract
			static = from.static
			partial = from.name.startsWith(PARTIAL)
			returnType = from.returnType.transformType
			visibility = from.visibility
			parameters.addAll(generateParameters(from))
		]
		
		result
	}
	
	private def generateAttributes(TClass textRamClass) {
		val List<Attribute> result = newArrayList
		
		textRamClass.members.filter(TAttribute).forEach[ o | 
			result.add(o.generateAttribute )
		]
		
		result
	}
	
	private def generateAttribute(TAttribute from) {
		val result = RamFactory.eINSTANCE.createAttribute => [
			name = from.name
			static = from.static
			type = from.type
		]
		
		result
	}
	
	def generateParameters(TOperation from) {
		val List<Parameter> result = newArrayList
		
		from.parameters.forEach[ p |
			result.add( p.generateParameter )
		]
		
		result
	}
	
	def generateParameter(Parameter from) {
		val result = RamFactory.eINSTANCE.createParameter => [
			name = from.name.replace(PARTIAL, '')
			type = from.type.transformType
		]
		
		result
	}
	
	private def dispatch transformType(PrimitiveType type) {
		type as Type
	}
	
	private def dispatch transformType(Type type) {
		ramAspect.structuralView.classes.findFirst( c | c.name == type.name.replace(PARTIAL, '') )
	}
	
	private def dispatch transformType(RVoid type) { 
		type as Type
	}
	
	private def generateTypes() {
		EcoreUtil.copyAll(textRamAspect.structuralView.types)
	}
}