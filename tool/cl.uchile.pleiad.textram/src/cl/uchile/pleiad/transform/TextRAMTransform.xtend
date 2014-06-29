package cl.uchile.pleiad.transform

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RSet
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
import java.util.Collection
import ca.mcgill.cs.sel.ram.Association
import cl.uchile.pleiad.services.TextRAMGrammarAccess.AssociationDirectionMultplicityElements
import cl.uchile.pleiad.textRam.AssociationDirectionMultiplicity
import cl.uchile.pleiad.textRam.TStructuralView
import ca.mcgill.cs.sel.ram.ReferenceType
import cl.uchile.pleiad.textRam.TAbstractMessageView
import ca.mcgill.cs.sel.ram.AspectMessageView
import ca.mcgill.cs.sel.ram.MessageView
import ca.mcgill.cs.sel.ram.MessageViewReference
import cl.uchile.pleiad.textRam.TLifeline
import cl.uchile.pleiad.textRam.TLifelineReferenceType
import ca.mcgill.cs.sel.ram.Lifeline
import ca.mcgill.cs.sel.ram.TypedElement
import ca.mcgill.cs.sel.ram.AssociationEnd
import ca.mcgill.cs.sel.ram.Reference
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TTypedElement

class TextRAMTransform implements ITextRAMTransform {
	
	val extension TextRamEcoreUtil textRamEcoreUtil = new TextRamEcoreUtil()
	
	override transform(TAspect textRamAspect) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override TAspect transform(Aspect ramAspect) {
		val textRamAspect = TextRamFactory.eINSTANCE.createTAspect => [
			name = ramAspect.name
		]
		
		ramAspect.structuralView.transformStructuralView( textRamAspect )
		
		transformMessageViews( ramAspect, textRamAspect )
		
				
		return textRamAspect
	}
	
	private def transformMessageViews(Aspect from, TAspect to) {
		from.messageViews.addAll( getTransformedMessageViews( from, to ) )		
	}
	
	private def getTransformedMessageViews(Aspect from, TAspect to) {
		val List<TAbstractMessageView> res = newArrayList
		
		// get lifelines
		
		val List<TLifeline> lifelines = newArrayList
		from.messageViews.filter(AspectMessageView).forEach[ amv |
			amv.advice.lifelines.forEach[ l | lifelines.add( getTransformedLifeline( l, to ) ) ]
		]
		
		return res
	}
	
	private def getTransformedLifeline(Lifeline from, Aspect to) {
		val res = TextRamFactory.eINSTANCE.createTLifeline => [
			represents = getRepresentsFrom( from.represents, to )
		]
		
		res
	}
	
	private def dispatch TTypedElement getRepresentsFrom(AssociationEnd from, Aspect to) {
		return to.getTAssociation( from.name )
	}
	
	private def dispatch TTypedElement getRepresentsFrom(Reference from, Aspect to) {
		return (to.structuralView as TStructuralView).getTClassFrom( from.name )
	}
	
	private def dispatch TTypedElement getRepresentsFrom(Attribute from, Aspect to) {
		//TODO: class name must be defined for attribute
		to.structuralView.classes.filter(TClass).map[members].flatten.filter(TAttribute).findFirst[ a | a.name == from.name ]
	}
	
	private def dispatch TTypedElement getRepresentsFrom(Parameter from, Aspect to) {
		throw new IllegalStateException("Parameter not supported in TTypedElement")
	}
	
//	private def dispatch getTransformedLifeline(AspectMessageView view) {
//		val res = TextRamFactory.eINSTANCE.createTLifeline
//		
//		res.referenceType = getTypedElement(view.)
//		
//		return res
//	}
//	
//	private def dispatch getTransformedLifeline(MessageView view) {
//		val res = TextRamFactory.eINSTANCE.createTLifeline
//		
//		return res
//	}
//	
//	private def dispatch getTransformedMessageView(AspectMessageView from) {
//		
//	}
//	
//	private def dispatch getTransformedMessageView(MessageView from) {
//		
//	}
//	
//	private def dispatch getTransformedMessageView(MessageViewReference from) {
//		
//	}
	
	private def transformStructuralView(StructuralView from, TAspect to) {
		to.structuralView = TextRamFactory.eINSTANCE.createTStructuralView
		
		//TODO: RSet
		// copy types
		
		to.structuralView.types.addAll( from.types.copyTypes )
		transformClasses( from, to )
		transformAssociations( from, to )
		
		
	}
	
	private def transformAssociations(StructuralView from, TAspect to) {
		from.associations.forEach[ a |
			(to.structuralView as TStructuralView).TAssociations.add ( transformAssociation( a, to.structuralView as TStructuralView ) )
		]
	}
	
	private def transformAssociation( Association from, TStructuralView to ) {
		val res = TextRamFactory.eINSTANCE.createTAssociation => [ name = from.name ]
		
		res.fromEnd = TextRamFactory.eINSTANCE.createTAssociationEnd => [
			lowerBound     = from.ends.get(0).lowerBound
			upperBound     = from.ends.get(0).upperBound
		]
		
		res.toEnd = TextRamFactory.eINSTANCE.createTAssociationEnd => [
			lowerBound     = from.ends.get(1).lowerBound
			upperBound     = from.ends.get(1).upperBound
		]
		
		val clazzFrom = (from.eContainer as StructuralView).getClassifierFrom( from.ends.get(0).classifier.name ) as Class
		val clazzTo = (from.eContainer as StructuralView).getClassifierFrom( from.ends.get(0).classifier.name ) as Class
		
		res.fromEnd.classReference = to.getTClassFrom( clazzFrom.name )
		res.toEnd.classReference = to.getTClassFrom( clazzTo.name )
		
		res.referenceType = ReferenceType.COMPOSITION;
		res.directionMultplicity = AssociationDirectionMultiplicity.UNIDIRECTIONAL; 
		
		return res
	}
	
	def void convertRSetTypeClassFromTClass(Aspect aspect, EList<Type> types) {
		types.filter(RSet).forEach [ rSetType |
			//TODO: cleaning instanceClassName (It's pending the good setting of RSet's instanceClassName)
			rSetType.instanceClassName = null

			if (rSetType.type instanceof TClass) {
				rSetType.type = aspect.structuralView.classes.findFirst[ c | c.name == rSetType.type.name ]
			}
		] 
	}
	
	private def copyTypes(List<Type> ramTypes) {
		val result = EcoreUtil.copyAll(ramTypes) 
		result
	}
	
	private def transformClasses( StructuralView from, TAspect to ) {
		to.structuralView.classes.addAll( from.classes.transformClasses(to) )
		
		// add class's members
		from.classes.transformClassMembers(to)
	}
	
	private def transformClasses(EList<Classifier> ramClasses, TAspect to) {
		val List<TClass> res = newArrayList
		
		ramClasses.forEach[ c |
			val textRamClass = c.transformClass(to) 
			res.add( textRamClass )
		]
		
		res
	}
	
	private def TClass transformClass(Classifier from, TAspect to) {
		val ramClass = from as Class
		
		val res = TextRamFactory.eINSTANCE.createTClass => [
			name = from.name
			layoutX = 0
			layoutY = 0
		]
		
		if ( ramClass.superTypes.size > 1 ) {
			throw new IllegalStateException('TextRam classes can have only one super type')
		}
		
		if ( ramClass.superTypes.size == 1 ) {
			res.partialSuperType = (ramClass.superTypes.get(0) as Class).partial
		}

		res
	}
	
	/**
	 * Transform TextRam's class members after the {@link TClass class) itself were added to the TextRam's {@link TAspect aspect}
	 * 
	 * @ramClasses {@link EList<ca.mcgill.cs.sel.ram.Classifier> classes} that contains the members.
	 * @textRamAsepect {@link TAspect aspect} that contains the classes that will receive the members.
	 */
	private def transformClassMembers(EList<Classifier> ramClasses, TAspect to) {
		
		ramClasses.forEach [ c |
			val ramClass = c as Class
			val textRamClass = to.findClass(ramClass.name)
			textRamClass.members.addAll ( ramClass.operations.transformOperations(to) )
			textRamClass.members.addAll( ramClass.attributes.transformAttributes(to) )	
		]
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