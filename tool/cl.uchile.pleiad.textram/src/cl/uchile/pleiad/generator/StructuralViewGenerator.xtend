package cl.uchile.pleiad.generator

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Association
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.ClassifierMapping
import ca.mcgill.cs.sel.ram.Instantiation
import ca.mcgill.cs.sel.ram.InstantiationType
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.ParameterMapping
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RSet
import ca.mcgill.cs.sel.ram.RVoid
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.Type
import cl.uchile.pleiad.converter.ModelConverterProxy
import cl.uchile.pleiad.textRam.AssociationDirectionMultiplicity
import cl.uchile.pleiad.textRam.TAspect
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassMember
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TInstantiationHeader
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TParameter
import cl.uchile.pleiad.textRam.TStructuralView
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.EcoreUtil

class StructuralViewGenerator {
	
	Aspect textRamAspect
	Aspect ramAspect
	
	new( Aspect from, Aspect to) {
		this.textRamAspect = from
		this.ramAspect = to
		
		ramAspect.structuralView = RamFactory.eINSTANCE.createStructuralView
		
		ramAspect.structuralView.types.addAll(generateTypes)
		ramAspect.structuralView.classes.addAll(createClasses)
		ramAspect.structuralView.types.convertRSetTypeClassFromTClass

		generateClasses()
		ramAspect.structuralView.associations.addAll(generateAssociations)
		
		ramAspect.instantiations.addAll(generateInstantiations)
	}
	
	def void convertRSetTypeClassFromTClass(EList<Type> types) {
		types.filter(RSet).forEach [ rSetType |
			//TODO: cleaning instanceClassName (It's pending the good setting of RSet's instanceClassName)
			rSetType.instanceClassName = null

			if (rSetType.type instanceof TClass) {
				rSetType.type = this.ramAspect.structuralView.classes.findFirst[ c | c.name == rSetType.type.name ]
			}
		] 
	}
	
	def getStructuralView() {
		this.ramAspect.structuralView
	}
	
	private def generateInstantiations() {
		val List<Instantiation> result = newArrayList
		
		val aspect = this.textRamAspect as TAspect
		
		aspect.headerInstantiations.forEach[ i |
			if ( i.type == InstantiationType.EXTENDS ) {
				result.addAll(generateInstantiationExtendsFromHeader(i))
			}
			else if ( i.type == InstantiationType.DEPENDS ) {
				result.addAll(generateInstantiationDependsOnFromHeader(i))
			}	
		]
		
		result
	}
	
	private def generateInstantiationDependsOnFromHeader(TInstantiationHeader instantiationHeader) {
		val List<Instantiation> result = newArrayList
		
		if (instantiationHeader.type != InstantiationType.DEPENDS) {
			throw new Exception("Only instantiation of type DEPENDS can be processed in this method")
		}
		
		instantiationHeader.externalAspects.forEach[ ea | 
			val instantiationDependsOn = this.textRamAspect.instantiations.findFirst[ ins | ins.externalAspect.name == ea.name && ins.mappings.length > 0];
			result.add( instantiationDependsOn.generateInstantiation )
		]
		
		result
	}
	
	private def generateInstantiationExtendsFromHeader(TInstantiationHeader instantiationHeader ) {
		if (instantiationHeader.type != InstantiationType.EXTENDS) {
			throw new Exception("Only instantiation of type EXTENDS can be processed in this method")
		}
		
		val List<Instantiation> result = newArrayList
		
		instantiationHeader.externalAspects.forEach[ ea | 
			val myExternalAspect = ea//ModelConverterProxy::instance.convertTextRAMModelToRAMModel(ea)
			
			val instantiation = RamFactory.eINSTANCE.createInstantiation => [
				externalAspect = myExternalAspect
				type = instantiationHeader.type
			]
			
			// check mappings
			val instantiationMapped = this.textRamAspect.instantiations.findFirst[ ins | ins.externalAspect.name == ea.name && ins.mappings.length > 0];
			if (instantiationMapped != null) {
				instantiation.mappings.addAll( instantiationMapped.generateMappings(myExternalAspect) )
			}
			
			// add instantiation to result
			result.add(instantiation)
		]
		
		result
	}
	
	private def generateInstantiation(Instantiation from) {
		val Aspect myExternalAspect = ModelConverterProxy::instance.convertTextRAMModelToRAMModel(from.externalAspect)

		val result = RamFactory.eINSTANCE.createInstantiation => [
			externalAspect = myExternalAspect
			type = getInstantiationTypeFromHeader(from)
			mappings.addAll( from.generateMappings(myExternalAspect) )
		]
		
		result
	}
	
	private def getInstantiationTypeFromHeader(Instantiation instantiation) {
		val tAspect = this.textRamAspect as TAspect
		val headerInstantiation = tAspect.headerInstantiations.findFirst[ hi | hi.externalAspects.exists[ ea | ea.name == instantiation.externalAspect.name ]]
		val type = headerInstantiation.type
		
		type
	}
	
	private def generateMappings(Instantiation from, Aspect externalAspect) {
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
		
		if (textRamClassifierMapping.fromMembers.size > 0) {
			for ( Integer i: 0..textRamClassifierMapping.fromMembers.size - 1) {
				val fromMember = textRamClassifierMapping.fromMembers.get(i)
				val toMember = textRamClassifierMapping.toMembers.get(i)
				
				generateMemberMapping(fromMember, toMember, externalAspect, result)		
			}	
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
	
	private def generateParameterMapping(Operation fromOperation, Operation toOperation) {
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
	
	private def createClasses() {
		val List<Classifier> result = newArrayList
		
		textRamAspect.structuralView.classes.filter(TClass).forEach [ textRamClass |
			result.add(textRamClass.createClass)
		]
		
		result
	}
	
	private def generateClasses() {
		this.textRamAspect.structuralView.classes.filter(TClass).forEach[ textRamClass |
			val clazz = this.ramAspect.structuralView.classes.findFirst(c | c.name == textRamClass.name) as Class
			
			generateClass(textRamClass, clazz)
		]
	}
	
	private def createClass(TClass from) { 
		val clazz = RamFactory.eINSTANCE.createClass
		
		clazz.name = from.name
		clazz.abstract = from.abstract
		clazz.partial = from.partial
		
		clazz
	}
	
	private def generateClass(TClass from, Class to) {
		
		to.superTypes.addAll(from.generateSuperTypes)
		to.operations.addAll(from.generateOperations)
		to.attributes.addAll(from.generateAttributes)
		
	}
	
	private def generateSuperTypes(TClass textRamClass) {
		val List<Classifier> result = newArrayList
		
		textRamClass.superTypes.forEach[ superType | 
			result.add( ramAspect.structuralView.classes.findFirst( c | c.name == superType.name ) )
		]
		
		result
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
			name = from.name
			abstract = from.abstract
			static = from.static
			partial = from.partial
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
			type = from.type.transformType as PrimitiveType
		]
		
		result
	}
	
	private def generateParameters(TOperation from) {
		val List<Parameter> result = newArrayList
		
		from.parameters.forEach[ p |
			result.add( p.generateParameter )
		]
		
		result
	}
	
	private def generateParameter(TParameter from) {
		val result = RamFactory.eINSTANCE.createParameter => [
			name = from.name
			type = from.type.transformType
		]
		
		result
	}
	
	private def dispatch transformType(PrimitiveType type) {
		ramAspect.structuralView.types.filter(PrimitiveType).findFirst[ t | t.name == type.name ]
	}
	
	private def dispatch transformType(Type type) {
		ramAspect.structuralView.classes.findFirst( c | c.name == type.name) 
	}
	
	private def dispatch transformType(RVoid type) { 
		ramAspect.structuralView.types.filter(RVoid).findFirst[ t | t.name == type.name ]
	}
	
	private def dispatch transformType(RSet type) {
		ramAspect.structuralView.types.filter(RSet).findFirst[ t | t.name == type.name ]
	}
	
	private def generateAssociations() {
		val List<Association> result = newArrayList

		val textRamStructuralView = textRamAspect.structuralView as TStructuralView
		
		textRamStructuralView.TAssociations.forEach[ textRamAssoc | 
			result.add( textRamAssoc.generateAssociation )
		]

		result
	}
	
	private def Association generateAssociation(TAssociation textRamAssoc) {
		val result = RamFactory.eINSTANCE.createAssociation
		
		val classFrom = this.ramAspect.structuralView.classes.findFirst[ c | c.name == textRamAssoc.fromEnd.classReference.name ] as Class
		val classTo = this.ramAspect.structuralView.classes.findFirst[ c | c.name == textRamAssoc.toEnd.classReference.name ] as Class
		
		val nameFrom = textRamAssoc.fromEnd.classReference.name
		val nameTo = textRamAssoc.toEnd.classReference.name
		
		result.name = nameFrom + '_' + nameTo 
		
		// create -from- association end
        val fromEnd = RamFactory.eINSTANCE.createAssociationEnd()
        fromEnd.assoc = result
        
        // there is no representation of lower bounds if both are zero
        if ( textRamAssoc.fromEnd.lowerBound + textRamAssoc.fromEnd.lowerBound != 0 ) {
	        fromEnd.lowerBound = textRamAssoc.fromEnd.lowerBound
	        fromEnd.upperBound = textRamAssoc.fromEnd.upperBound
        }
        
        fromEnd.name = textRamAssoc.name.toLowerCaseFirst
        
        if (textRamAssoc.referenceType != null) {
        	fromEnd.referenceType = textRamAssoc.referenceType
        }
        
        // create -to- association end
        val toEnd = RamFactory.eINSTANCE.createAssociationEnd()
        toEnd.assoc =result 
       	
		// there is no representation of lower bounds if both are zero       	
       	if ( textRamAssoc.toEnd.lowerBound +  textRamAssoc.toEnd.upperBound != 0 ) {
	       	toEnd.lowerBound = textRamAssoc.toEnd.lowerBound
	        toEnd.upperBound = textRamAssoc.toEnd.upperBound
        }
        
        toEnd.navigable = false
        toEnd.name = classFrom.name.toLowerCaseFirst
		
		// creates associations ends
		classFrom.associationEnds.add(fromEnd)
		classTo.associationEnds.add(toEnd)
		
		if ( textRamAssoc.directionMultplicity == AssociationDirectionMultiplicity.BIDIRECTIONAL ) {
			classFrom.associationEnds.add(toEnd)
			classTo.associationEnds.add(fromEnd)
		}
					
		result
	}
	
	private def generateTypes() {
		val result = EcoreUtil.copyAll(textRamAspect.structuralView.types) 
		result
	}
	
	private def static String toLowerCaseFirst(String text) {
        var charArray = text.toCharArray();
        charArray.set(0, Character.toLowerCase(charArray.get(0)));
        String.valueOf(charArray);
    }
}