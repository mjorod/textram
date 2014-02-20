package cl.uchile.pleiad.generator

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Association
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RVoid
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.Type
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TStructuralView
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil
import ca.mcgill.cs.sel.ram.Instantiation
import cl.uchile.pleiad.converter.ModelConverterProxy
import java.util.Collection
import ca.mcgill.cs.sel.ram.ClassifierMapping
import cl.uchile.pleiad.textRam.TClassifierMapping
import ca.mcgill.cs.sel.ram.AttributeMapping
import cl.uchile.pleiad.textRam.TClassMember
import ca.mcgill.cs.sel.ram.ParameterMapping

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
		
		ramAspect.structuralView.types.addAll(generateTypes)
		ramAspect.structuralView.classes.addAll(generateClasses)
		ramAspect.structuralView.associations.addAll(generateAssociations)
		
		ramAspect.instantiations.addAll(generateInstantiations)
	
	}
	
	def generateInstantiations() {
		val List<Instantiation> result = newArrayList
		
		textRamAspect.instantiations.forEach[ i | 
			result.add( i.generateInstantiation )
		]
		
		result
	}
	
	def generateInstantiation(Instantiation from) {
		val myExternalAspect = ModelConverterProxy::instance.convertTextRAMModelToRAMModel(from.externalAspect)

		val result = RamFactory.eINSTANCE.createInstantiation => [
			externalAspect = myExternalAspect
			type = from.type
			mappings.addAll( from.generateMappings(myExternalAspect) )
		]
		
		result
	}
	
	def  generateMappings(Instantiation from, Aspect externalAspect) {
		val List<ClassifierMapping> result = newArrayList
		
		from.mappings.filter(TClassifierMapping).forEach[ textRamMapping | 
			result.add(textRamMapping.generateMapping(externalAspect))
		]
		
		result
	}
	
	private def generateMapping(TClassifierMapping textRamClassifierMapping, Aspect externalAspect) {
		val result = RamFactory.eINSTANCE.createClassifierMapping => [
			fromElement = externalAspect.structuralView.classes.findFirst( c | c.name == textRamClassifierMapping.fromElement.name )
			toElement = this.ramAspect.structuralView.classes.findFirst( c | c.name == textRamClassifierMapping.toElement.name )
		]
		
		for ( Integer i: 0..textRamClassifierMapping.fromMembers.size ) {
			val fromMember = textRamClassifierMapping.fromMembers.get(i)
			val toMember = textRamClassifierMapping.toMembers.get(i)
			
			generateMemberMapping(fromMember, toMember, externalAspect, result)		
		}
		
		result
	}
	
	private def dispatch generateMemberMapping(TAttribute fromMember, TClassMember toMember, Aspect externalAspect, ClassifierMapping classifierMapping) {
		val attributeMapping = RamFactory.eINSTANCE.createAttributeMapping => [
			fromElement = externalAspect.structuralView.classes.filter(Class).map[attributes].flatten.findFirst( a | a.name == fromMember.name )
			toElement = ramAspect.structuralView.classes.filter(Class).map[attributes].flatten.findFirst( a | a.name == toMember.name ) 
		]
		
		classifierMapping.attributeMappings.add(attributeMapping)	
	}
	
	private def dispatch generateMemberMapping(TOperation fromMember, TClassMember toMember, Aspect externalAspect, ClassifierMapping classifierMapping) {
		val operationMapping = RamFactory.eINSTANCE.createOperationMapping => [
			fromElement = externalAspect.structuralView.classes.filter(Class).map[operations].flatten.findFirst( o | o.name == fromMember.name)
			toElement = ramAspect.structuralView.classes.filter(Class).map[operations].flatten.findFirst( a | a.name == toMember.name )
			parameterMappings.addAll( generateParameterMapping(fromElement, toElement) )
		]
		
		classifierMapping.operationMappings.add(operationMapping)
	}
	
	def generateParameterMapping(Operation fromOperation, Operation toOperation) {
		val List<ParameterMapping> result = newArrayList  

		fromOperation.parameters.forEach[ fromParm |
			val parameterMapping = RamFactory.eINSTANCE.createParameterMapping => [
				fromElement = fromParm
				toElement = toOperation.parameters.get( fromOperation.parameters.indexOf(fromParm)  )
			]
			
			result.add(parameterMapping)
		]
		
		result
	}
	
	def generate() {
		ramAspect
	}
	
	
	private def generateClasses() {
		val List<Classifier> result = newArrayList
		
		textRamAspect.structuralView.classes.filter(TClass).forEach [ textRamClass |
			result.add (textRamClass.generateClass)
		]
		
		result
	}
	
	private def generateClass(TClass from) {
		val clazz = RamFactory.eINSTANCE.createClass
		
		clazz.name = from.name.resolveNameWithoutPartial
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
			result.add( ramAspect.structuralView.classes.findFirst( c | c.name == superType.name.resolveNameWithoutPartial ) )
		]
		
		result
	}
	
	def resolveNameWithoutPartial(String name) {
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
			name = from.name.resolveNameWithoutPartial
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
	
	def generateAssociations() {
		val List<Association> result = newArrayList

		val textRamStructuralView = textRamAspect.structuralView as TStructuralView
		
		textRamStructuralView.TAssociations.forEach[ textRamAssoc | 
			result.add( textRamAssoc.generateAssociation )
		]
		
		
		
		result
	}
	
	def Association generateAssociation(TAssociation from) {
		val result = RamFactory.eINSTANCE.createAssociation
		
		val classFrom = this.ramAspect.structuralView.classes.findFirst[ c | c.name == from.fromEnd.classReference.name.resolveNameWithoutPartial ] as Class
		val classTo = this.ramAspect.structuralView.classes.findFirst[ c | c.name == from.toEnd.classReference.name.resolveNameWithoutPartial ] as Class
		
		val nameFrom = from.fromEnd.classReference.name.resolveNameWithoutPartial
		val nameTo = from.toEnd.classReference.name.resolveNameWithoutPartial
		
		result.name = nameFrom + '_' + nameTo 
		
		classFrom.associationEnds.add(result.generateAssociationEndFrom(from, classFrom))
		classTo.associationEnds.add(result.generateAssociationToFrom(from, classTo))
					
		result
	}
	
	def generateAssociationToFrom(Association association, TAssociation assocFrom, Class clazz) {
		val result = RamFactory.eINSTANCE.createAssociationEnd => [
			assoc = association
	     	lowerBound = assocFrom.fromEnd.lowerBound
	     	upperBound = assocFrom.fromEnd.upperBound
	     	name = clazz.name.toLowerCaseFirst
		]
		
		result
	}
	
	def generateAssociationEndFrom(Association association, TAssociation from, Class clazz) {
		val result = RamFactory.eINSTANCE.createAssociationEnd => [
			assoc = association
	     	lowerBound = from.fromEnd.lowerBound
	     	upperBound = from.fromEnd.upperBound
	     	name = clazz.name.toLowerCaseFirst
	     	navigable = false
		]
		
		result		
	}
	
	private def generateTypes() {
		EcoreUtil.copyAll(textRamAspect.structuralView.types)
	}
	
	private def static String toLowerCaseFirst(String text) {
        var charArray = text.toCharArray();
        charArray.set(0, Character.toLowerCase(charArray.get(0)));
        String.valueOf(charArray);
    }
}