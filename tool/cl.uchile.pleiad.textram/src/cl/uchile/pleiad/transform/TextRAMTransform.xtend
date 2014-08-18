package cl.uchile.pleiad.transform

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.AspectMessageView
import ca.mcgill.cs.sel.ram.Association
import ca.mcgill.cs.sel.ram.AssociationEnd
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.CombinedFragment
import ca.mcgill.cs.sel.ram.DestructionOccurrenceSpecification
import ca.mcgill.cs.sel.ram.ExecutionStatement
import ca.mcgill.cs.sel.ram.InstantiationType
import ca.mcgill.cs.sel.ram.Interaction
import ca.mcgill.cs.sel.ram.InteractionFragment
import ca.mcgill.cs.sel.ram.InteractionOperatorKind
import ca.mcgill.cs.sel.ram.Lifeline
import ca.mcgill.cs.sel.ram.LiteralInteger
import ca.mcgill.cs.sel.ram.LiteralString
import ca.mcgill.cs.sel.ram.Message
import ca.mcgill.cs.sel.ram.MessageOccurrenceSpecification
import ca.mcgill.cs.sel.ram.MessageView
import ca.mcgill.cs.sel.ram.OccurrenceSpecification
import ca.mcgill.cs.sel.ram.OpaqueExpression
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.OriginalBehaviorExecution
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.ParameterValue
import ca.mcgill.cs.sel.ram.ParameterValueMapping
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RSet
import ca.mcgill.cs.sel.ram.RamPackage
import ca.mcgill.cs.sel.ram.Reference
import ca.mcgill.cs.sel.ram.ReferenceType
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import ca.mcgill.sel.commons.emf.util.EMFModelUtil
import cl.uchile.pleiad.textRam.AssociationDirectionMultiplicity
import cl.uchile.pleiad.textRam.OcurrenceType
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TAspect
import cl.uchile.pleiad.textRam.TAspectMessageView
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassMember
import cl.uchile.pleiad.textRam.TCombinedFragment
import cl.uchile.pleiad.textRam.TInteraction
import cl.uchile.pleiad.textRam.TInteractionMessage
import cl.uchile.pleiad.textRam.TLifeline
import cl.uchile.pleiad.textRam.TLifelineReferenceType
import cl.uchile.pleiad.textRam.TLocalAttribute
import cl.uchile.pleiad.textRam.TMessageAssignableFeature
import cl.uchile.pleiad.textRam.TOcurrence
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TReference
import cl.uchile.pleiad.textRam.TReturnInteraction
import cl.uchile.pleiad.textRam.TStructuralView
import cl.uchile.pleiad.textRam.TTemporaryProperty
import cl.uchile.pleiad.textRam.TTypedElement
import cl.uchile.pleiad.textRam.TValueSpecification
import cl.uchile.pleiad.textRam.TextRamFactory
import cl.uchile.pleiad.util.TextRamEcoreUtil
import cl.uchile.pleiad.util.TextRamModelUtil
import java.util.List
import java.util.Set
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.EcoreUtil
import ca.mcgill.cs.sel.ram.Instantiation
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.ClassifierMapping
import ca.mcgill.cs.sel.ram.AttributeMapping
import ca.mcgill.cs.sel.ram.OperationMapping
import cl.uchile.pleiad.textRam.TClassifierMapping

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
		
		val extendedTextRamAspects = TextRamModelUtil::transformExtendedAspects( ramAspect )
		
		transformInstantiations( ramAspect, textRamAspect, extendedTextRamAspects )
		
		transformMessageViews( ramAspect, textRamAspect )
		
		transformLayout( ramAspect, textRamAspect )
				
		return textRamAspect
	}
	
	private def transformInstantiations(Aspect from, TAspect to, Set<TAspect> extendedTextRamAspects) {
		// transform extends type
		val headerExtend = transformHeaderInstantiationOfExtendType( from, extendedTextRamAspects )
		if ( headerExtend != null ) {
			to.headerInstantiations.add( headerExtend )
		}
		
		// transform depends type
		val headerDepends = transformHeaderInstantiationOfDependsType ( from, extendedTextRamAspects )
		if ( headerDepends != null ) {
			to.headerInstantiations.add( headerDepends )
		}
		
		// transform instantiation's body
		from.instantiations.forEach[ i |
			to.instantiations.add( transformInstantiationBody( i, to, extendedTextRamAspects ) )
		]
	}
	
	
	
	private def transformInstantiationBody(Instantiation instantiation, TAspect to, Set<TAspect> extendedAspects) {
		// it looks for an existing instantiation
		var Instantiation res = to.instantiations.findFirst[ a | a.externalAspect.name == instantiation.externalAspect.name ]
		
		if ( res == null ) {
			res = RamFactory.eINSTANCE.createInstantiation
		}
		
		res.externalAspect = extendedAspects.findFirst[ a | a.name == instantiation.externalAspect.name ]
		 
		// transform mappings
		
		for ( ClassifierMapping m : instantiation.mappings ) {
			res.mappings.add( transformMappings( m, res.externalAspect, to, extendedAspects ) ) 
		}
		
		return res
	}
	
	private def transformMappings(ClassifierMapping mapping, Aspect fromAspect, TAspect toAspect, Set<TAspect> extendedAspects) {
		var TClassifierMapping res = null
		
		res = TextRamFactory.eINSTANCE.createTClassifierMapping
		val extendedClasses = toAspect.getInstantiationsClasses
		
		// transform from element
		res.fromElement = extendedClasses.findFirst[ c | c.name == mapping.fromElement.name ]
	
		// transform to element
		var Classifier classTo = toAspect.findClass( mapping.toElement.name )
		if (classTo == null) {
			if ( mapping.toElement instanceof PrimitiveType ) {
				var type = toAspect.structuralView.types.filter(PrimitiveType).findFirst( e | e.name == mapping.toElement.name )
				classTo = type
			}
		}
		res.toElement = classTo
		
		// transform attributes
		for ( AttributeMapping a : mapping.attributeMappings ) { 
			res.fromMembers.add( transformAttributeMemberFromElement( res.fromElement as TClass, a ))
			res.toMembers.add( transformAttributeMemberToElement( res.toElement as TClass, a ) )			
		}
		
		for ( OperationMapping o : mapping.operationMappings ) {
			res.fromMembers.add( transfomOperationMemberFromElement( res.fromElement as TClass, o))
			res.toMembers.add( transformOperationsMemberToElement( res.toElement as TClass, o ) )
		}
		
		return res
	}
	
	private def transformOperationsMemberToElement(TClass clazz, OperationMapping mapping) {
		val res = TextRamEcoreUtil::findTextRamOperation( clazz, mapping.toElement ) 
		return res
	}

	
	private def transformAttributeMemberToElement(TClass clazz, AttributeMapping mapping) {
		return clazz.members.filter(TAttribute).findFirst[ a | a.name == mapping.toElement.name ]
	}
	
	private def TClassMember transfomOperationMemberFromElement(TClass clazz, OperationMapping mapping) {
		val res = TextRamEcoreUtil::findTextRamOperation( clazz, mapping.fromElement )
		
		return res
	}
	
	private def transformAttributeMemberFromElement(TClass clazz, AttributeMapping mapping) {
		return clazz.members.filter(TAttribute).findFirst[ a | a.name == mapping.fromElement.name ]
	}
	
	private def transformHeaderInstantiationOfExtendType(Aspect from, Set<TAspect> extendedExternalTextRamAspects) {
		if ( from.instantiations.exists[ i | i.type == InstantiationType.EXTENDS ] ) {
			// 	transform header instantiations
			val header = TextRamFactory.eINSTANCE.createTInstantiationHeader
						
			header.type = InstantiationType.EXTENDS
			from.instantiations.filter( ins | ins.type == InstantiationType.EXTENDS ).forEach[ ins |
				header.externalAspects.add( extendedExternalTextRamAspects.findFirst[ e | e.name == ins.externalAspect.name ] )
			]
			
			return header
		}
		
		return null
	}
	
	private def transformHeaderInstantiationOfDependsType(Aspect from, Set<TAspect> extendedExternalTextRamAspects) {
		if ( from.instantiations.exists[ i | i.type == InstantiationType.DEPENDS ] ) {
			// 	transform header instantiations
			val header = TextRamFactory.eINSTANCE.createTInstantiationHeader
			
			header.type = InstantiationType.DEPENDS
			from.instantiations.filter( ins | ins.type == InstantiationType.DEPENDS).forEach[ ins |
				header.externalAspects.add( extendedExternalTextRamAspects.findFirst[ e | e.name == ins.externalAspect.name ] )
			]
			
			return header
		}
		
		return null
	}
	
		
	private def transformLayout(Aspect from, TAspect to) {
		
		from.layout.containers.get(0).value.forEach[ v |
			if ( v.key instanceof Class ) {
				val tClass = to.findClass( (v.key as Class).name )
				
				if ( tClass != null ) {
					tClass.layoutX = v.value.x
					tClass.layoutY = v.value.y
				}
			}

		]
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
		
		// order matters. First we transform AspectMessageView because MessageView has a property named affectedBy that contains a list of AspectMessageViews
		from.messageViews.filter( AspectMessageView ).forEach[ mv | tAbstractMessageView.messages.add( getTransformedMessage( mv, to ) ) ]
		
		// transform MessageViews
		from.messageViews.filter( MessageView ).forEach[ mv | tAbstractMessageView.messages.add( getTransformedMessage( mv, to ) ) ]
		
		return tAbstractMessageView
	}
	
	private def dispatch getTransformedMessage(AspectMessageView from, TAspect to ) {
		val res = TextRamFactory.eINSTANCE.createTAspectMessageView
	
	   	// pointcut
		res.name = from.name
		res.setClass( getClassFromMessageView( from.pointcut, to ) )
		res.specifies = TextRamEcoreUtil.findTextRamOperation(  res.class_, from.pointcut )
		res.partialClass = res.class_.partial
		res.partialOperation = res.specifies.partial
		res.arguments.addAll( res.specifies.parameters ) 
		
		// advice
		res.interactionMessages.addAll( getTextRamInteractions( from.advice, to ) )
			
		return res
	}
	
	private def dispatch getTransformedMessage(MessageView from, TAspect to) {
	
		val res = TextRamFactory.eINSTANCE.createTMessageView
		//create
		res.setClass( getClassFromMessageView( from.specifies, to ) )
		res.specifies = TextRamEcoreUtil.findTextRamOperation( res.class_, from.specifies )
		res.partialClass = res.class_.partial
		res.partialOperation = res.specifies.partial
		res.arguments.addAll( res.specifies.parameters ) 
		
		if ( from.affectedBy.size == 0 ) {
			// right now we don't know whether all AspectMessageView has been transformed. 
			// Therefore the affectedBy property is set at the end of the MessageView and AspectView's transformation.
			res.interactionMessages.addAll( getTextRamInteractions( from.specification, to ) )
		} else {
			// gets RAM's aspect
			 val Aspect root = EMFModelUtil.getRootContainerOfType( from, RamPackage.eINSTANCE.aspect )
			 
			 // adds all AspectMessageView
			 root.messageViews.filter(AspectMessageView).forEach[ amv | 
			 	val textRamAspectMessage = (to.messageViews.get(0) as TAbstractMessageView).messages.filter(TAspectMessageView).findFirst( q | q.name == amv.name )
			 	
			 	if ( textRamAspectMessage == null ) {
			 		throw new IllegalStateException("TAspectMessageView has not been found")
			 	}
			 	
			 	res.affectedBy.add( textRamAspectMessage )
			 ]
		}
		
		return res
	}
	
	private def getTextRamInteractions(Interaction interaction, TAspect to) {
		val List<TInteraction> res = newArrayList
		
		//TODO: TReturnInteraction
		interaction.fragments.forEach[ f | 
			val transformed = getTransformedFragment( f, interaction.fragments, to )
			
			if ( transformed != null && res.containsFragment( transformed ) == false ) {
				res.add( transformed )
			} 
		]
		
		return res 
	}
	
	private def dispatch boolean containsFragment(List<TInteraction> interactions, TInteractionMessage interaction) {
		val res = interactions.filter(TInteractionMessage).exists[ i | 
			i.leftLifeline.nameFromTLifeline == interaction.leftLifeline.nameFromTLifeline &&
			i.rightLifeline.nameFromTLifeline == interaction.rightLifeline.nameFromTLifeline &&
			i.message.signature.name == interaction.message.signature.name
		]
		
		return res
	}
	
	private def dispatch boolean containsFragment(List<TInteraction> interactions, TCombinedFragment interaction) {
		return false
	}
	
	private def dispatch boolean containsFragment(List<TInteraction> interactions, TReturnInteraction interaction) {
		return false
	}
	
	private def dispatch boolean containsFragment(List<TInteraction> interactions, TOcurrence interaction) {
		val res = interactions.filter(TOcurrence).exists[ i | 
			i.leftLifeline.nameFromTLifeline == interaction.leftLifeline.nameFromTLifeline
			i.ocurrenceType == interaction.ocurrenceType
		]
		
		return res
	}
	
	private def dispatch TInteraction getTransformedFragment(MessageOccurrenceSpecification from, EList<InteractionFragment> fragments, TAspect to) {
		val ramMessage = from.message
		
		// order text ram's lifelines according source
		val List<TLifeline> tLifelines = to.messageViews.filter(TAbstractMessageView).get(0).lifelines
		
		val pair = fragments.filter(MessageOccurrenceSpecification).filter( mos | mos.message == ramMessage ).toList
		
		if ( pair.size == 2 ) {
			val res = TextRamFactory.eINSTANCE.createTInteractionMessage

			val tLeftLifeline =  tLifelines.getFirstTLifelineFromLifeline( (from.message.sendEvent as MessageOccurrenceSpecification).covered.get(0) )
			val tRightLifeline =  tLifelines.getFirstTLifelineFromLifeline( (from.message.receiveEvent as MessageOccurrenceSpecification).covered.get(0) )

			if ( tLeftLifeline == null ) {
				throw new IllegalStateException("Left TLifeline has not been found")
			}
			
			if ( tRightLifeline == null ) {
				throw new IllegalStateException("Right TLifeline has not been found")
			}
			
			res.leftLifeline =  tLeftLifeline  //pair.get(0).getTLifelineFrom ( tLifelines )
			
			res.rightLifeline =  tRightLifeline //pair.get(1).getTLifelineFrom ( tLifelines )
			
			res.message = ramMessage.getTransformedTMessageFrom( to )
			
  			return res
		}
	}
	
	def  getFirstTLifelineFromLifeline(List<TLifeline> lifelines, Lifeline lifeline) {
		 return lifelines.findFirst( l | l.represents.nameFromRepresents == lifeline.represents.ramNameFromRepresents )
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
	
	private def dispatch TInteraction getTransformedFragment(OccurrenceSpecification from, EList<InteractionFragment> fragments, TAspect to ) {
		val res = TextRamFactory.eINSTANCE.createTOcurrence
		
		return res
	}
	
	private def dispatch TInteraction getTransformedFragment(ExecutionStatement from, EList<InteractionFragment> fragments, TAspect to ) {
		//TODO: ExecutionStatement is not supported yet
		return null
	}
	
	private def dispatch TInteraction getTransformedFragment(DestructionOccurrenceSpecification from, EList<InteractionFragment> fragments, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTOcurrence
		
		res.ocurrenceType = OcurrenceType.DESTRUCTION
		
		return res	
	}
	
	private def dispatch TInteraction getTransformedFragment(CombinedFragment from, EList<InteractionFragment> fragments, TAspect to ) {
		val res = TextRamFactory.eINSTANCE.createTCombinedFragment
		
		//loop
		res.interactionOperator = from.interactionOperator
    	res.interactionConstraint = from.operands.get(0).interactionConstraint.getTextRamInteractionConstraint
    	
    	val List<TInteraction> tInteractions = newArrayList
    	val List<TInteraction> tInteractionsForAlt = newArrayList
    	
		from.operands.get(0).fragments.forEach[ f |
			val transformed = getTransformedFragment( f, from.operands.get(0).fragments, to )
			
			if ( transformed != null && tInteractions.containsFragment( transformed ) == false ) {
				tInteractions.add( transformed )
			} 
			
		]
		
		res.containers.addAll( tInteractions )
		
		if ( from.interactionOperator == InteractionOperatorKind.ALT ) {					
			from.operands.get(1).fragments.forEach[ f | 
				val transformed = getTransformedFragment( f, from.operands.get(1).fragments, to )
			
				if ( transformed != null && tInteractions.containsFragment( transformed ) == false ) {
					tInteractionsForAlt.add( transformed )
				} 				
			]
		}
		
		res.elseContainers.addAll( tInteractionsForAlt )
		
		return res
	}
	
	private def dispatch String getTextRamInteractionConstraint(OpaqueExpression value) {
		return value.body	
	}
	
	private def dispatch String getTextRamInteractionConstraint(LiteralString value) {
		return value.value
	}
	
	private def dispatch String getTextRamInteractionConstraint(LiteralInteger value) { 
		return String.valueOf( value.value )
	}
	
	private def dispatch String getTextRamInteractionConstraint(ParameterValue value) {
		return value.parameter.name
	}
	
	
	private def getTransformedTMessageFrom(Message message, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTMessage
		
		val clazz = to.findClass( ( message.signature.eContainer as Class ).name )
		
		if ( message.assignTo != null ) {
			res.assignTo = message.assignTo.getAssignToFrom( to, clazz )
		}
		
		val tOperation = TextRamEcoreUtil.findTextRamOperation( clazz, message.signature )
		res.signature = tOperation
		//res.arguments.addAll( getMessagesArguments( message, to, tOperation ) )
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
		
		//TReference has precedence over TLifeline
		var TMessageAssignableFeature res =  mv.lifelines.map[ localProperties ].flatten.filter(TReference).findFirst[ la | la.name == feature.name ] as TReference
		
		// lookups lifelines
		if ( res == null ) { 
		 	res = mv.lifelines.findFirst[ l | l.name == feature.name ]
		}
		
		if ( res == null ) {
			res = mv.lifelines.findFirst[ l | l.represents.nameFromRepresents == feature.name ]
		}
		
		return res
	}
	
	private def dispatch TLifeline getTLifelineFrom(OriginalBehaviorExecution originalExecution, List<TLifeline> list) {
		val res = list.findFirst( tl | tl.nameFromTLifeline ==  originalExecution.covered.get(0).nameFromLifeline )
		
		return res
	}
	
	private def dispatch TLifeline getTLifelineFrom(MessageOccurrenceSpecification messageOcurrence, List<TLifeline> list) {
		val res = list.findFirst( tl | tl.nameFromTLifeline == messageOcurrence.covered.get(0).nameFromLifeline )
		
		return res
	}
	
	
	private def getClassFromMessageView(Operation operation, TAspect to) {
		val clazz = operation.eContainer as Class
		
		val res = to.findClass( clazz.name ) as TClass
		
		return res
	}
	
	private def void addLifelinesfrom(TAbstractMessageView textRamMessageView, Aspect from, TAspect to) {
		//TODO: change the look-up of the lifeline.
		
		val List<TLifeline> lifelines = newArrayList
		
		// lifelines from AspectMessageView
		from.messageViews.filter(AspectMessageView).forEach [ amv |
			amv.advice.lifelines.forEach[ l |
				if ( lifelines.exists( l ) == false ) {
					lifelines.add( getTransformedLifeline( l, to ) )
				}
			]
		]
		
		// lifelines from MessageView
		from.messageViews.filter(MessageView).forEach[ mv |
			if ( mv.specification != null ) {
					mv.specification.lifelines.forEach[ l | 
						if ( lifelines.exists( l ) == false ) {
							lifelines.add ( getTransformedLifeline( l, to ) )
						}
					]
			}
		]
		
		textRamMessageView.lifelines.addAll( lifelines )
		
	}
	
	private def exists(List<TLifeline> lifelines, Lifeline toFind) {
		//associations has different treatment
		if ( toFind.represents instanceof TAssociation ) {
			// it looks by TLifeline's name
			return lifelines.filter( l | l.name == toFind.nameFromLifeline ).size > 0
		} else {
			// otherwise it looks by TLifeline's represents name
			return lifelines.filter( l | l.nameFromTLifeline == toFind.nameFromLifeline ).size > 0
		}
		
	}
	
	private def getTransformedLifeline(Lifeline from, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTLifeline
		
		res.static = resolveStaticFromReference( from.represents )
		res.represents = getRepresentsFrom( from.represents, to )
		res.name = getNameFromLifeline( from )
		res.referenceType = getReferenceTypeFrom ( from.represents )
		res.localProperties.addAll( getLocalPropertiesFromLifeline( from, to ) )
			
		return res
	}
	
	private def getLocalPropertiesFromLifeline( Lifeline from, TAspect to ) {
		val List<TTemporaryProperty> res = newArrayList
		
		from.localProperties.forEach[ lp | 
			val localProperty = getLocalProperty( lp, to )
			
			if ( res.exists[ q | q.name == localProperty.name ] == false ) {
				res.add(localProperty)
			}
		]
		
		return res
	}
	
	private def dispatch TTemporaryProperty getLocalProperty( Reference from, TAspect to ) {
				
		if ( from.type instanceof Class ) {
			return transformLocalPropertyFromReference( from.type as Class, from.name, to )
		}
		
		if ( from.type instanceof RSet ) {
			val rSet = ( from.type as RSet )
			
			if ( rSet.type instanceof Class ) {
				return transformLocalPropertyFromReference( rSet.type as Class, from.name, to )
			} else if ( rSet.type instanceof PrimitiveType ) {
				return transformLocalPropertyFromPrimitiveType( rSet.type as PrimitiveType, from, to )
			}
		}
		
		if ( from.type instanceof PrimitiveType ) {
			return transformLocalPropertyFromPrimitiveType( from.type as PrimitiveType, from, to )
		}
		
		return null
	}
	
	private def transformLocalPropertyFromPrimitiveType(PrimitiveType type, Reference from, TAspect to) {
		val res = TextRamFactory.eINSTANCE.createTLocalAttribute 
		
		res.name = from.name
		res.type = to.getTypeReference( type ) as PrimitiveType
		
		return res
	}
	
	private def TTemporaryProperty transformLocalPropertyFromReference(Class clazz, String name, TAspect aspect) {
		val tClass = aspect.findClass( clazz.name )
		
		val res = TextRamFactory.eINSTANCE.createTReference 
		res.name = name
		res.partialClass = tClass.partial
		res.reference = tClass
		
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
		return tLifeline.name
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
	
	private def dispatch getRamNameFromRepresents(Reference r) {
		return r.type.name
	}
	
	private def dispatch getRamNameFromRepresents( AssociationEnd ass ) {
		return ass.name
	}
	
	private def dispatch getRamNameFromRepresents( Attribute attr ) {
		attr.name
	}
	
	private def dispatch getRamNameFromRepresents( Parameter par ) {
		return par.name
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
	
	private def dispatch boolean resolveStaticFromReference(AssociationEnd from) {
		return false
	}
	
	private def dispatch boolean resolveStaticFromReference(Reference from) {
		return from.static
	}
	
	private def dispatch boolean resolveStaticFromReference(Attribute from) {
		//TODO: class name must be defined for attribute
		return false
	}
	
	private def dispatch boolean resolveStaticFromReference(Parameter from) {
		throw new IllegalStateException("Parameter not supported in TTypedElement")
	}
	
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
		val res = TextRamFactory.eINSTANCE.createTAssociation => [ name = from.ends.get(0).name ]
		
		res.fromEnd = TextRamFactory.eINSTANCE.createTAssociationEnd => [
			lowerBound     = from.ends.get(0).lowerBound
			upperBound     = from.ends.get(0).upperBound
		]
		
		res.toEnd = TextRamFactory.eINSTANCE.createTAssociationEnd => [
			lowerBound     = from.ends.get(1).lowerBound
			upperBound     = from.ends.get(1).upperBound
		]
		
		val clazzFrom = (from.eContainer as StructuralView).getClassifierFrom( from.ends.get(0).classifier.name ) as Class
		val clazzTo = (from.eContainer as StructuralView).getClassifierFrom( from.ends.get(1).classifier.name ) as Class
		
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
			ramClass.superTypes.get(0)
			//throw new IllegalStateException('TextRam classes can have only one super type')
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