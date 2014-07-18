package cl.uchile.pleiad.transform

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.AspectMessageView
import ca.mcgill.cs.sel.ram.Association
import ca.mcgill.cs.sel.ram.AssociationEnd
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.CombinedFragment
import ca.mcgill.cs.sel.ram.ExecutionStatement
import ca.mcgill.cs.sel.ram.Interaction
import ca.mcgill.cs.sel.ram.InteractionFragment
import ca.mcgill.cs.sel.ram.Lifeline
import ca.mcgill.cs.sel.ram.Message
import ca.mcgill.cs.sel.ram.MessageOccurrenceSpecification
import ca.mcgill.cs.sel.ram.MessageView
import ca.mcgill.cs.sel.ram.OccurrenceSpecification
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.OriginalBehaviorExecution
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.ParameterValueMapping
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RSet
import ca.mcgill.cs.sel.ram.Reference
import ca.mcgill.cs.sel.ram.ReferenceType
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import cl.uchile.pleiad.textRam.AssociationDirectionMultiplicity
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TAspect
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassMember
import cl.uchile.pleiad.textRam.TInteraction
import cl.uchile.pleiad.textRam.TLifeline
import cl.uchile.pleiad.textRam.TLifelineReferenceType
import cl.uchile.pleiad.textRam.TLocalAttribute
import cl.uchile.pleiad.textRam.TMessageAssignableFeature
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TReference
import cl.uchile.pleiad.textRam.TStructuralView
import cl.uchile.pleiad.textRam.TTemporaryProperty
import cl.uchile.pleiad.textRam.TTypedElement
import cl.uchile.pleiad.textRam.TValueSpecification
import cl.uchile.pleiad.textRam.TextRamFactory
import cl.uchile.pleiad.util.TextRamEcoreUtil
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.EcoreUtil
import cl.uchile.pleiad.textRam.OcurrenceType

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
		
//		transformMessageViews( ramAspect, textRamAspect )
		
				
		return textRamAspect
	}
	
	private def transformMessageViews(Aspect from, TAspect to) {
		if ( from.messageViews.size > 0 ) {
			getTransformedMessageViews( from, to )
		}
		
	}
	
	private def getTransformedMessageViews(Aspect from, TAspect to) {
		val tAbstractMessageView = TextRamFactory.eINSTANCE.createTAbstractMessageView
	
		// add the abstract message view to the aspect
		to.messageViews.add( tAbstractMessageView )
	
		tAbstractMessageView.addLifelinesfrom( from, to )
			
		from.messageViews.forEach[ mv | tAbstractMessageView.messages.add( getTransformedMessage( mv, to ) ) ]
		
		return tAbstractMessageView
	}
	
	private def dispatch getTransformedMessage(AspectMessageView from, TAspect to ) {
		val res = TextRamFactory.eINSTANCE.createTAspectMessageView
	
	   	// pointcut
		res.name = from.name
		res.setClass( getClassFromPointCut( from.pointcut, to ) )
		res.specifies = TextRamEcoreUtil.findTextRamOperation(  res.class_, from.pointcut )
		res.partialClass = res.class_.partial
		res.partialOperation = res.specifies.partial
		res.arguments.addAll( res.specifies.parameters ) 
		
			// advice
		res.interactionMessages.addAll( getTextRamInteractions( from.advice, to ) )
			
		return res
	}
	
	private def getTextRamInteractions(Interaction interaction, TAspect to) {
		val List<TInteraction> res = newArrayList
		
		
		//TODO: TReturnInteraction
		interaction.fragments.forEach[ f | res.add( getTransformedFragment( f, interaction.fragments, to ) ) ]
		
		return res 
	}
	
	private def dispatch TInteraction getTransformedFragment(MessageOccurrenceSpecification from, EList<InteractionFragment> fragments, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTInteractionMessage
		
		// get the lifelines
		val tLifelines = to.messageViews.filter(TAbstractMessageView).get(0).lifelines
		
		// get a pair of fragments according its message
		val pair = fragments.filter(MessageOccurrenceSpecification).filter( f | f.message.signature.name == from.message.signature.name )
		
		if ( pair.size == 2 ) {
			// left
			res.leftLifeline = pair.get(0).getTLifelineFrom ( tLifelines )
			
			// right
			res.rightLifeline = pair.get(1).getTLifelineFrom ( tLifelines )
			
			// message
			res.message = getTransformedTMessageFrom( from.message, to )
		}
		
		return res
	}
	
	
	private def dispatch TInteraction getTransformedFragment(OriginalBehaviorExecution from, EList<InteractionFragment> fragments, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTOcurrence
		
		// get the lifelines
		val tLifelines = to.messageViews.filter(TAbstractMessageView).get(0).lifelines
		
		// gets the left side
		res.leftLifeline = from.getTLifelineFrom ( tLifelines )
			
		res.ocurrenceType = OcurrenceType.ORIGINAL
		
		return res
	}
	
	private def getTransformedTMessageFrom(Message message, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTMessage
		
		val clazz = to.findClass( ( message.signature.eContainer as Class ).name )
		
		res.assignTo = message.assignTo.getAssignToFrom( to, clazz )
		
		val tOperation = TextRamEcoreUtil.findTextRamOperation( clazz, message.signature )
		res.signature = tOperation
		res.arguments.addAll( getMessagesArguments( message, to, tOperation ) )
		res.partialOperation = tOperation.partial

		return res
	}
	
	private def getMessagesArguments(Message message, TAspect to, TOperation operation) {
		val List<TValueSpecification> res = newArrayList
		
		message.arguments.forEach[ a | res.add( a.transformTValueSpecification( to, operation ) ) ]
		
		return res
	}
	
	private def  transformTValueSpecification(ParameterValueMapping mapping, TAspect to, TOperation operation ) {
		var res = mapping.value.resolveValueSpecification( to )
		
		if ( mapping.parameter != null && res == null ) {
			// return TParameter
			res = operation.parameters.findFirst( p | p.name == mapping.parameter.name )
		}
		
		return res
	}
	
	private def dispatch TValueSpecification resolveValueSpecification(Attribute specification, TAspect to) {
		val tAbstractMessageView = to.messageViews.get(0) as TAbstractMessageView
		
		val res = tAbstractMessageView.lifelines.map[localProperties].flatten.filter(TLocalAttribute).findFirst( la | la.name == specification.name )
		
		return res
	}
	
	private def dispatch TValueSpecification resolveValueSpecification(Reference specification, TAspect to) {
		val tAbstractMessageView = to.messageViews.get(0) as TAbstractMessageView
		
		// returns TReference
		var TValueSpecification res = tAbstractMessageView.lifelines.map[localProperties].flatten.filter(TReference).findFirst( la | la.name == specification.name )
		
		// returns TLifeline
		if ( res == null ) {
			res = tAbstractMessageView.lifelines.findFirst( l | l.name == specification.name )
		}
		
		return res
	}
		
	private def dispatch TMessageAssignableFeature getAssignToFrom(AssociationEnd feature, TAspect to, TClass clazz) {
		val tStructuralView = to.structuralView as TStructuralView
		
		return tStructuralView.TAssociations.findFirst( a | a.name == feature.name )
	}
	
	private def dispatch TMessageAssignableFeature getAssignToFrom(Attribute feature, TAspect to, TClass clazz) {
		val mv = to.messageViews.get(0) as TAbstractMessageView
		
		val res = mv.lifelines.map[ localProperties ].flatten.filter(TLocalAttribute).findFirst[ la | la.name == feature.name ]
		
		return res
	}
	
	private def dispatch TMessageAssignableFeature getAssignToFrom(Reference feature, TAspect to, TClass clazz) {
		val mv = to.messageViews.get(0) as TAbstractMessageView
		
		var res = mv.lifelines.findFirst[ l | l.name == feature.name ]
		
		if ( res == null ) {
			res = mv.lifelines.findFirst[ l | l.represents.nameFromRepresents == feature.name ]
		}
		
		return res
	}
	
	private def dispatch TLifeline getTLifelineFrom(OriginalBehaviorExecution originalExecution, EList<TLifeline> list) {
		val res = list.findFirst( tl | tl.nameFromTLifeline ==  originalExecution.covered.get(0).nameFromLifeline )
		
		return res
	}
	
	private def dispatch TLifeline getTLifelineFrom(MessageOccurrenceSpecification messageOcurrence, EList<TLifeline> list) {
		val res = list.findFirst( tl | tl.nameFromTLifeline == messageOcurrence.covered.get(0).nameFromLifeline )
		
		return res
	}
	
	private def dispatch getTransformedFragment(OccurrenceSpecification from, EList<InteractionFragment> fragments, TAspect to ) {
		val res = TextRamFactory.eINSTANCE.createTOcurrence
		
		return res
	}
	
	private def dispatch getTransformedFragment(CombinedFragment from, EList<InteractionFragment> fragments, TAspect to ) {
		val res = TextRamFactory.eINSTANCE.createTCombinedFragment
		
		return res
	}
	
	private def dispatch getTransformedFragment(ExecutionStatement from, EList<InteractionFragment> fragments, TAspect to ) {
		val res = TextRamFactory.eINSTANCE.createTCombinedFragment
		
		return res
	}
	
	private def getClassFromPointCut(Operation operation, TAspect to) {
		val clazz = operation.eContainer as Class
		
		val res = to.findClass( clazz.name ) as TClass
		
		return res
	}
	
	private def dispatch getTransformedMessage(MessageView from, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTMessageView => []
		
		return res
	}
	
	private def void addLifelinesfrom(TAbstractMessageView textRamMessageView, Aspect from, TAspect to) {
		// lifelines from AspectMessageView
		from.messageViews.filter(AspectMessageView).forEach [ amv |
			amv.advice.lifelines.forEach[ l | 
				textRamMessageView.lifelines.add( getTransformedLifeline( l, to ) )
			]
		]
		
		// lifelines from MessageView
		from.messageViews.filter(MessageView).forEach[ mv |
			if ( mv.specification != null ) {
				mv.specification.lifelines.forEach[ l | textRamMessageView.lifelines.add( getTransformedLifeline( l, to ) ) ]
			}
		]
		
	}
	
	
	private def getTransformedLifeline(Lifeline from, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTLifeline

		res.represents = getRepresentsFrom( from.represents, to )
		res.name = getNameFromLifeline( from )
		res.referenceType = getReferenceTypeFrom ( from.represents )
		res.localProperties.addAll( getLocalPropertiesFromLifeline( from, to ) )
			
		return res
	}
	
	private def getLocalPropertiesFromLifeline( Lifeline from, TAspect to ) {
		val List<TTemporaryProperty> res = newArrayList
		
		from.localProperties.forEach[ lp | res.add( getLocalProperty( lp, to ) ) ]
		
		return res
	}
	
	private def dispatch TTemporaryProperty getLocalProperty( Reference from, TAspect to ) {
				
		if ( from.type instanceof Class ) {
			return transformLocalPropertyFromReference( from.type as Class, to )
		}
		
		if ( from.type instanceof RSet ) {
			val rSet = ( from.type as RSet )
			
			if ( rSet.type instanceof Class ) {
				return transformLocalPropertyFromReference( rSet.type as Class, to )
			} else if ( from.type instanceof PrimitiveType ) {
				return transformLocalPropertyFromPrimitiveType( rSet.type as PrimitiveType, from, to )
			}
		}
		
		if ( from.type instanceof PrimitiveType ) {
			return transformLocalPropertyFromPrimitiveType( from.type as PrimitiveType, from, to )
		}
		
		return null
	}
	
	private def transformLocalPropertyFromPrimitiveType(PrimitiveType type, Reference from,  TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTLocalAttribute 
		
		res.name = from.name
		res.type = to.getTypeReference( type ) as PrimitiveType
		
		return res
	}
	
	private def TTemporaryProperty transformLocalPropertyFromReference(Class clazz, TAspect aspect) {
		val tClass = aspect.findClass( clazz.name )
		
		val res = TextRamFactory.eINSTANCE.createTReference => [
			name = clazz.name
			partialClass = tClass.partial
			reference = tClass
		]
		
		return res
	}
	
	private def dispatch TTemporaryProperty getLocalProperty(Attribute from, TAspect to ) {
		val res = TextRamFactory.eINSTANCE.createTLocalAttribute => [
			name = from.name
			type = to.getTypeReference( from.type ) as PrimitiveType
			//TODO: value is missing
			// value = ?? StructuralFeatureValue
		]
		
		return res
	}
	
	private def dispatch TLifelineReferenceType getReferenceTypeFrom(AssociationEnd from) {
		return TLifelineReferenceType.ASSOCIATION
	}
	
	private def dispatch TLifelineReferenceType getReferenceTypeFrom( Attribute from ) {
		return TLifelineReferenceType.ATTRIBUTE		
	}
	
	private def dispatch TLifelineReferenceType getReferenceTypeFrom( Reference from ) {
		return TLifelineReferenceType.REFERENCE
	}
	
	private def dispatch TLifelineReferenceType getReferenceTypeFrom( Parameter from ) {
		throw new IllegalStateException("Parameter is not supported as referenceType")
	}	
	
	private def getNameFromLifeline(Lifeline lifeline) {
		return lifeline.represents.name
	}
	
	private def getNameFromTLifeline(TLifeline tLifeline) {
		return tLifeline.represents.getNameFromRepresents
	}
	
	private def dispatch getNameFromRepresents(TClass clazz) {
		return clazz.name
	}
	
	private def dispatch getNameFromRepresents(TAssociation assoc) {
		return assoc.name
	}
	
	private def dispatch getNameFromRepresents(TAttribute attr) {
		return attr.name
	}
	
	private def dispatch TTypedElement getRepresentsFrom(AssociationEnd from, Aspect to) {
		return to.getTAssociation( from.name )
	}
	
	private def dispatch TTypedElement getRepresentsFrom(Reference from, Aspect to) {
		return (to.structuralView as TStructuralView).getTClassFrom( from.type.name )
	}
	
	private def dispatch TTypedElement getRepresentsFrom(Attribute from, Aspect to) {
		//TODO: class name must be defined for attribute
		to.structuralView.classes.filter(TClass).map[members].flatten.filter(TAttribute).findFirst[ a | a.name == from.type.name ]
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