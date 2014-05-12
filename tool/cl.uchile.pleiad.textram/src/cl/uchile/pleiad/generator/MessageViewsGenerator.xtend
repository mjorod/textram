package cl.uchile.pleiad.generator

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.AspectMessageView
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.FragmentContainer
import ca.mcgill.cs.sel.ram.Interaction
import ca.mcgill.cs.sel.ram.InteractionOperand
import ca.mcgill.cs.sel.ram.Lifeline
import ca.mcgill.cs.sel.ram.Message
import ca.mcgill.cs.sel.ram.MessageSort
import ca.mcgill.cs.sel.ram.MessageView
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.ParameterValueMapping
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.RamPackage
import ca.mcgill.cs.sel.ram.Reference
import ca.mcgill.cs.sel.ram.StructuralFeature
import ca.mcgill.cs.sel.ram.TemporaryProperty
import ca.mcgill.cs.sel.ram.TypedElement
import ca.mcgill.cs.sel.ram.ValueSpecification
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TAbstractMessages
import cl.uchile.pleiad.textRam.TAspectMessageView
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TCombinedFragment
import cl.uchile.pleiad.textRam.TInteractionMessage
import cl.uchile.pleiad.textRam.TLifeline
import cl.uchile.pleiad.textRam.TLifelineReferenceType
import cl.uchile.pleiad.textRam.TLocalAttribute
import cl.uchile.pleiad.textRam.TMessage
import cl.uchile.pleiad.textRam.TMessageView
import cl.uchile.pleiad.textRam.TOcurrence
import cl.uchile.pleiad.textRam.TParameter
import cl.uchile.pleiad.textRam.TReference
import cl.uchile.pleiad.textRam.TReturnInteraction
import cl.uchile.pleiad.textRam.TextRamPackage
import cl.uchile.pleiad.util.TextRamEcoreUtil
import java.util.ArrayList
import java.util.List

//TODO: toLowerCaseFirst is missing
class MessageViewsGenerator {
	
	private var Aspect textRamAspect
	private var Aspect ramAspect
	
	new( Aspect from, Aspect to) {
		this.textRamAspect = from
		this.ramAspect = to
		
		if (this.textRamAspect.messageViews.size > 0) { 
			val textRamMessages = getTextRamMessages()
			
			textRamMessages.filter(TAspectMessageView).forEach[ m | 
				this.ramAspect.messageViews.add(m.generateMessageView)
			]
			
			textRamMessages.filter(TMessageView).forEach[ m | 
				this.ramAspect.messageViews.add(m.generateMessageView)
			]	
		}	
	}
	
	def getMessagesView() {
		this.ramAspect.messageViews
	}
	
	private def getTextRamMessages() {
		(this.textRamAspect.messageViews.head as TAbstractMessageView).messages
	}
	
	private def dispatch generateMessageView(TAspectMessageView textRamAspectMessageView){
		var result = RamFactory.eINSTANCE.createAspectMessageView => [
			name = textRamAspectMessageView.name
			pointcut = textRamAspectMessageView.generatePointcut
			advice = textRamAspectMessageView.createInteraction
		]
		
		result	
	}
	
	private def dispatch generateMessageView(TMessageView textRamMessage) {
		var MessageView result = RamFactory.eINSTANCE.createMessageView => [
			specifies = textRamMessage.generateSpecifies
			specification = textRamMessage.createInteraction
			affectedBy.addAll( textRamMessage.generateAffectedBy )
		]
		
		result
	}
	
	def generateAffectedBy(TMessageView textRamMessageView) {
		val List<AspectMessageView> result = newArrayList
		
		textRamMessageView.affectedBy.forEach[ textRamAspectMessage |
			result.add(this.ramAspect.messageViews.filter(AspectMessageView).findFirst( m | m.name == textRamAspectMessage.name ))
		]
		
		result
	}
	
	private def generateSpecifies(TMessageView textRamMessage) {
		val result = findOperationWithSameSignature(textRamMessage)
		result
	}
	
	private def generatePointcut(TAspectMessageView textRamAspectMessageView) {
		var Operation result = null
		
		val veryDumbClass_ = textRamAspectMessageView.class_ // can't use (textRamAspectMessageView.class_ != null)
		
		if (veryDumbClass_ != null) {
			val clazz = this.ramAspect.findClass( textRamAspectMessageView.class_.name )
			result = clazz.operations.findFirst[ o | o.name == textRamAspectMessageView.specifies.name ]
		} 
		else {
			result = findOperationWithSameSignature(textRamAspectMessageView)		
		}
				
		result
	}
	
	private def Operation getMessageSignature(TMessage message) {
		val textRamOperation = message.signature
	
		val List<Operation> classOperations = newArrayList
		val arguments = message.arguments
		
		classOperations.addAll(ramAspect.structuralView.classes.map[operations].flatten.filter( a | a.name == textRamOperation.name))
		
		//TODO: repeated code -> findOperationWithSameSignature
		for ( o : classOperations ) {
			// check parameter's length
			if ( o.parameters.length == arguments.length ) {
				// check parameter's type
				var matchParameterType = true
				
				try {
					if (o.parameters.empty == false && arguments.empty == false) {
						for ( Integer i: 0..o.parameters.size - 1) {
							if ( o.parameters.get(i).type.name == arguments.get(i).typeNameForTValueSpecification == false) {
								matchParameterType = false;
							}
						}
					}
					
					if (matchParameterType == true) {
						return o
					}	
				}
				catch (NullPointerException e) {
					var m = e.message
					m = m;
				}
				
			}
		}
		
		return null
	}
	
	private def dispatch getTypeNameForTValueSpecification(TLocalAttribute specification) {
		specification.type.name
	}
	
	private def dispatch getTypeNameForTValueSpecification(TReference specification) {
		(specification.reference as TClass).name
	}
	
	private def dispatch getTypeNameForTValueSpecification(TParameter specification) {
		specification.type.name
	}
	
	private def dispatch getTypeNameForTValueSpecification(TLifeline l) {
		if (l.referenceType != TLifelineReferenceType.REFERENCE) {
			throw new Exception("Only Reference types can be parameters");
		}
		
		(l.represents as TClass).name
	}
	
	private def Operation findOperationWithSameSignature(TAbstractMessages from) {
		val operation = from.specifies
		var Class clazz = null
		
		if (from.class_ != null) { 
			clazz = this.ramAspect.findClass( from.class_.name )
		}
		
		val List<Operation> classOperations = newArrayList
		val arguments = from.arguments
		
		// since the class is optional, checks if there are any class defined
		if ( clazz != null ) {
			classOperations.addAll(TextRamEcoreUtil.findOperations( clazz, operation.name ))
		}
		else {
			classOperations.addAll(ramAspect.structuralView.classes.map[operations].flatten.filter( a | a.name == operation.name))
		}
		
		for ( o : classOperations ) {
			// check parameter's length
			if ( o.parameters.length == arguments.length ) {
				// check parameter's type
				var matchParameterType = true
				
				if (o.parameters.empty == false && arguments.empty == false) {
					for ( Integer i: 0..o.parameters.size - 1 ) {
						if ( o.parameters.get(i).type.name == arguments.get(i).type.name == false) {
							matchParameterType = false;
						}
					}
				}
				
				if (matchParameterType == true) {
					return o			 
				}
			}
		}
		
		return null
	}
	
	private def createInteraction(TAbstractMessages textRamMessage) {
		val objects = textRamMessage.eContainer as TAbstractMessageView
		
		val result = RamFactory.eINSTANCE.createInteraction => [
			properties.addAll( generateProperties( objects.lifelines ) ) 
			lifelines.addAll( generateLifelines( objects.lifelines, properties ) )
		]
	
		// creates default start message
		generatesDefaultStartMessage(result, textRamMessage)
		
		// creates messages
		textRamMessage.interactionMessages.forEach[  textRamInteraction | 
			generateInteractionMessages( textRamInteraction, result, textRamMessage )
		]
		
		result
	}
	
	private def dispatch void generateInteractionMessages( TOcurrence textRamOcurrenceMessage, FragmentContainer fragmentContainer, TAbstractMessages textRamMessage ) {
		val interaction = fragmentContainer as Interaction
		val lifeline= interaction.lifelines.findFirst( l | l.represents.name == textRamOcurrenceMessage.leftLifeline.name )
		
		val originalBehaviourExecution = RamFactory.eINSTANCE.createOriginalBehaviorExecution => [
			covered.add(lifeline)
		]
		
		interaction.fragments.add(originalBehaviourExecution)	
	}
	
	private def dispatch void generateInteractionMessages( TInteractionMessage textRamInteractionMessage, FragmentContainer fragmentContainer, TAbstractMessages textRamMessage) {
		val Message message = generateMessageOcurrence(textRamInteractionMessage, fragmentContainer)
		
		fragmentContainer.addMessage(message)
	}
	
	private def addMessage(FragmentContainer fragmentContainer, Message message) {
		if ( fragmentContainer instanceof InteractionOperand ) {
			val Interaction rootInteraction = TextRamEcoreUtil.getRootContainerOfType( fragmentContainer, RamPackage.Literals.INTERACTION )
			rootInteraction.messages.add(message)	
		} 
		else {
			(fragmentContainer as Interaction).messages.add(message)
		}
	}
	
	private def dispatch void generateInteractionMessages ( TCombinedFragment textRamCombinedFragment, FragmentContainer fragmentContainer, TAbstractMessages textRamMessage) {
		
		val combinedFragment = RamFactory.eINSTANCE.createCombinedFragment => [
			interactionOperator = textRamCombinedFragment.interactionOperator
		]
		
		// add fragments!!!!
		fragmentContainer.fragments.add( combinedFragment )
			
		val interactionOperand = RamFactory.eINSTANCE.createInteractionOperand
		combinedFragment.operands.add( interactionOperand )
		
		val interactionConstraint = RamFactory.eINSTANCE.createOpaqueExpression => [
			body = textRamCombinedFragment.interactionConstraint
			language = "java"
		]
		
		interactionOperand.interactionConstraint = interactionConstraint
		
		textRamCombinedFragment.containers.forEach[ fragment | 
			generateInteractionMessages( fragment, interactionOperand, textRamMessage )
		]
		
		combinedFragment.operands.map[fragments].flatten.forEach[ fragment | 
			combinedFragment.covered.addAll( fragment.covered )
		]		
	}
	
	private def dispatch void generateInteractionMessages ( TReturnInteraction textRamReturnInteraction, FragmentContainer fragmentContainer, TAbstractMessages textRamMessage) {
		// gets the previous interaction
		val TInteractionMessage prev = TextRamEcoreUtil.getPrev( textRamReturnInteraction, TextRamPackage.Literals.TINTERACTION_MESSAGE )
		
		if ( prev == null ) {
			throw new NullPointerException("Previous element of type TInteractionMessage cannot be found")
		}
		
		val interaction = fragmentContainer as Interaction
		val lifeLineFrom = interaction.lifelines.findFirst( l | l.represents.name == prev.rightLifeline.name )
		val lifeLineTo =  prev.getFirstLifeline(interaction)
		
		val send = RamFactory.eINSTANCE.createMessageOccurrenceSpecification
		send.covered.add(lifeLineFrom)
		interaction.fragments.add(send)
		
		val receive= RamFactory.eINSTANCE.createMessageOccurrenceSpecification
		receive.covered.add(lifeLineTo)
		interaction.fragments.add(receive)
		
		val message = RamFactory.eINSTANCE.createMessage => [
			sendEvent = send
			receiveEvent = receive
			messageSort = MessageSort.REPLY
			returns = getMessageReturn( textRamReturnInteraction, lifeLineTo )
		] 
		

		send.message = message
		receive.message = message
		
		fragmentContainer.addMessage(message)
	}
	
	private def generateMessageOcurrence(TInteractionMessage textRamInteractionMessage, FragmentContainer interaction) {
		val lifeLineFrom = getLifelineFrom(interaction, textRamInteractionMessage)
		val lifeLineTo = getLifelineTo(interaction, textRamInteractionMessage)
		
		val operation = getMessageSignature(textRamInteractionMessage.message)
		if (operation == null) {
			throw new Exception("Operation: " + (textRamInteractionMessage.message as TMessage).signature.name + " not founded in " + this.textRamAspect.name)
		}
		
		val send = RamFactory.eINSTANCE.createMessageOccurrenceSpecification
		send.covered.add(lifeLineFrom)
		interaction.fragments.add(send)
		
		val receive= RamFactory.eINSTANCE.createMessageOccurrenceSpecification
		receive.covered.add(lifeLineTo)
		interaction.fragments.add(receive)
		
		val message = RamFactory.eINSTANCE.createMessage => [
			sendEvent = send
			receiveEvent = receive
			signature = operation
			arguments.addAll(generateArguments(textRamInteractionMessage.message as TMessage, operation, lifeLineTo))  
		] 
		
		if ( textRamInteractionMessage.message instanceof TMessage ) {
			if ((textRamInteractionMessage.message as TMessage).assignTo != null) {
				message.assignTo = generateAssignTo(textRamInteractionMessage.message as TMessage, lifeLineTo)
			}
		}
		
		if (textRamInteractionMessage.create == true) {
			message.messageSort = MessageSort.CREATE_MESSAGE
		}
		
		send.message = message
		receive.message = message
		
		message
	}
	
	def generateAssignTo(TMessage textRamMessage, Lifeline lifeline) {
		var StructuralFeature result 
		
		if ( textRamMessage.assignTo != null ) {
			if (textRamMessage.assignTo instanceof TAssociation) {
				result = (textRamMessage.assignTo as TAssociation).createStructuralFeature(lifeline)
			}		
			else if (textRamMessage.assignTo instanceof TLifeline) {
				result = (textRamMessage.assignTo as TLifeline).createStructuralFeature(lifeline)
			}
			else {
				result = (textRamMessage.assignTo).createStructuralFeature(lifeline)
			}
		}
				
		return result
	}
	
	private def getReferenceFromLifeline(TReference tReference, Lifeline lifeline) {
		lifeline.localProperties.filter(Reference).findFirst( r | r.name == tReference.name )
	}
	
	private def getLocalPropertyFromLifeline(TLocalAttribute tLocalAttribute, Lifeline lifeline) {
		lifeline.localProperties.filter(Attribute).findFirst( a | a.name == tLocalAttribute.name )
	}
	
	private def getLifelineFromSibiling(TLifeline tLifeline, Lifeline lifeline) {
		(lifeline.eContainer as Interaction).properties.findFirst[ p | p.name == tLifeline.name ]
	}
	
	private def dispatch StructuralFeature createStructuralFeature(TAssociation feature, Lifeline lifeline) {
		val result = this.ramAspect.findAssociationEnd( feature.name )
		
		result
	}
	
	private def dispatch StructuralFeature createStructuralFeature(TReference feature, Lifeline lifeline) {
		val result = getReferenceFromLifeline(feature, lifeline)
		result
	}
	
	private def dispatch StructuralFeature createStructuralFeature(TLocalAttribute feature, Lifeline lifeline) {
		val result = getLocalPropertyFromLifeline(feature, lifeline)
		result	
	}
	
	private def dispatch StructuralFeature createStructuralFeature(TLifeline tLifeline, Lifeline lifeline) {
		val represents = getLifelineFromSibiling(tLifeline, lifeline)
		val result = represents
		result
	}
	
	private def dispatch ValueSpecification createValueSpecification(TReference feature, Lifeline lifeline) {
		val structuralFeature = getReferenceFromLifeline(feature, lifeline)
		
		val structuralFeautreValue = RamFactory.eINSTANCE.createStructuralFeatureValue => [
			value = structuralFeature
		]
		
		return structuralFeautreValue
	}
	
	private def dispatch ValueSpecification createValueSpecification(TLocalAttribute feature, Lifeline lifeline) {
		val structuralFeature = getLocalPropertyFromLifeline(feature, lifeline)
		
		val structuralFeautreValue = RamFactory.eINSTANCE.createStructuralFeatureValue => [
			value = structuralFeature
		]
		
		return structuralFeautreValue
	}
	
	private def dispatch ValueSpecification createValueSpecification(TLifeline tLifeline, Lifeline lifeline) {
		val structuralFeature = getLifelineFromSibiling(tLifeline, lifeline)
		
		val structuralFeautreValue = RamFactory.eINSTANCE.createStructuralFeatureValue => [
			value = structuralFeature
		]
		
		return structuralFeautreValue
	}
	
	//TODO: generateArguments has duplicated code
	private def dispatch generateArguments(TAbstractMessages tMessage,  Operation operation, Lifeline lifeline) {
		val List<ParameterValueMapping> result = newArrayList
		
		if ( operation.parameters.empty == false ) {
			for ( Integer i: 0..operation.parameters.length -1 ) {
				result.add( createParameterValueMapping(operation.parameters.get(i), tMessage.arguments.get(i), lifeline  ) ) 
			}
		}
		
		result
	}
		
	private def dispatch generateArguments(TMessage tMessage,  Operation operation, Lifeline lifeline) {
		val List<ParameterValueMapping> result = newArrayList
		
		if ( operation.parameters.empty == false ) {
			for ( Integer i: 0..operation.parameters.length -1 ) {
				result.add( createParameterValueMapping(operation.parameters.get(i), tMessage.arguments.get(i), lifeline  ) ) 
			}
		}
		
		result
	}
	
	private def generatesDefaultStartMessage(Interaction interaction, TAbstractMessages messageView) {
		if (messageView instanceof TMessageView && (messageView as TMessageView).affectedBy != null) {
			return null
		}
		
		val lifeLineTo = messageView.interactionMessages.head.getFirstLifeline(interaction)
		
		var Operation operation = null
		
		if ( messageView.class_ != null ) {
			var Class clazz = null
			clazz = this.ramAspect.findClass(messageView.class_.name) as Class
			operation = clazz.operations.findFirst[ o | o.name == messageView.specifies.name ]	
		}
		else {
			val operations = this.ramAspect.structuralView.classes.filter(Class).map[operations].flatten.filter( o | o.name == messageView.specifies.name )
			if (operations.length != 1) {
				throw new Exception("Invalid operation definition.")
			}
			
			operation = operations.get(0)
		}
				
		val gate = RamFactory.eINSTANCE.createGate
		gate.name =  "in_" + operation.name
		
		interaction.formalGates.add(gate)
		
		//create receive event
		val event = RamFactory.eINSTANCE.createMessageOccurrenceSpecification => [
			covered.add(lifeLineTo)	
		]
		
		interaction.fragments.add(event)
		
		// create message
		val result = RamFactory.eINSTANCE.createMessage
		result.signature = operation
		//TODO: arguments for start message?
		result.arguments.addAll(generateArguments(messageView, operation, lifeLineTo))
		result.sendEvent = gate
		result.receiveEvent = event
		
		if (messageView.create == true) {
			result.messageSort = MessageSort.CREATE_MESSAGE
		}
		
		//TODO: assingTo
//		if (textRamStartInteraction.message instanceof TMessage) {
//			result.assignTo = generateAssignTo(textRamStartInteraction.message as TMessage, lifeLineTo)	
//		}
		
		interaction.getMessages.add(result)
		
		// set references
		event.message = result
		gate.message = result
			
		result	
	}
	
	//TODO: repeated code
	private def dispatch Lifeline getFirstLifeline(TInteractionMessage interactionMessage, Interaction interaction) {
		val firstLifeline = interactionMessage.leftLifeline
		val result = interaction.lifelines.findFirst( l | l.represents.name == firstLifeline.name)
		
		result
	}
	
	private def dispatch Lifeline getFirstLifeline(TOcurrence interactionMessage, Interaction interaction) { 
		val firstLifeline = interactionMessage.leftLifeline
		val result = interaction.lifelines.findFirst( l | l.represents.name == firstLifeline.name)
		
		result
	}
	
	private def getMessageReturn(TReturnInteraction interaction, Lifeline lifeline) {
		val result =  interaction.^return.createValueSpecification(lifeline)
		
		result
	}
	
	private def dispatch getLifelineTo(Interaction interaction, TInteractionMessage textRamInteractionMessage) {
		val lifeLineTo = interaction.lifelines.findFirst( l | l.represents.name == textRamInteractionMessage.rightLifeline.name)
		lifeLineTo
	}
	
	private def dispatch getLifelineTo(InteractionOperand interactionOperand, TInteractionMessage textRamInteractionMessage) {
		val Interaction rootInteraction = TextRamEcoreUtil.getRootContainerOfType( interactionOperand, RamPackage.Literals.INTERACTION )
		val lifeLineTo = rootInteraction.lifelines.findFirst( l | l.represents.name == textRamInteractionMessage.rightLifeline.name)
		lifeLineTo
	}	
	
	private def dispatch getLifelineFrom(Interaction interaction, TInteractionMessage textRamInteractionMessage) {
		val lifeLineFrom = interaction.lifelines.findFirst( l | l.represents.name == textRamInteractionMessage.leftLifeline.name)
		lifeLineFrom
	}
	
	private def dispatch getLifelineFrom(InteractionOperand interactionOperand, TInteractionMessage textRamInteractionMessage) {
		val Interaction rootInteraction = TextRamEcoreUtil.getRootContainerOfType( interactionOperand, RamPackage.Literals.INTERACTION )
		val lifeLineFrom =  rootInteraction.lifelines.findFirst( l | l.represents.name == textRamInteractionMessage.leftLifeline.name)
		lifeLineFrom
	}
	
	private def dispatch ParameterValueMapping createParameterValueMapping(Parameter p, TLocalAttribute tLocalAttribute, Lifeline lifeline) {
		val result = RamFactory.eINSTANCE.createParameterValueMapping => [
			parameter = p
			value = RamFactory.eINSTANCE.createStructuralFeatureValue => [
				value = lifeline.localProperties.filter(Attribute).findFirst[ l | l.name == tLocalAttribute.name ]
			]
		]
		
		result
	}
	
	private def dispatch ParameterValueMapping createParameterValueMapping(Parameter p, TReference tReference, Lifeline lifeline) {
		val result = RamFactory.eINSTANCE.createParameterValueMapping => [
			parameter = p
			value = RamFactory.eINSTANCE.createStructuralFeatureValue => [
				value = lifeline.localProperties.filter(Reference).findFirst[ l | l.name == tReference.name ]
			]
		]
		
		result
	}
	
	private def dispatch ParameterValueMapping createParameterValueMapping(Parameter p, TLifeline tLifeline, Lifeline lifeline) {
		val interaction = (lifeline).eContainer as Interaction
		
		val result = RamFactory.eINSTANCE.createParameterValueMapping => [
			parameter = p
			value = RamFactory.eINSTANCE.createStructuralFeatureValue => [
				value = interaction.properties.findFirst( prop | prop.name == tLifeline.name )
			]
		]
		
		result
	}

	private def dispatch ParameterValueMapping createParameterValueMapping(Parameter p, TParameter tParameter, Lifeline lifeline) {
		val result = RamFactory.eINSTANCE.createParameterValueMapping => [
			parameter = p
			value = RamFactory.eINSTANCE.createParameterValue => [
				parameter = p
			]
		]
		
		result
	}
	
	private def findClass(Aspect aspect, String name) {
		var result = aspect.structuralView.classes.filter(Class).findFirst[ c | 
			c.name == name
		]
		
		result
	}
	
	def findAssociationEnd(Aspect aspect, String name) {
		val result = aspect.structuralView.classes.filter(Class).map[associationEnds].flatten.findFirst( a | a.name == name )
		result
	}
	
	def findClassFromAssociationEnd( Aspect aspect, TAssociation assoc ) {
		val result = this.ramAspect.findClass( assoc.toEnd.classReference.name )
		result
	}
	
	private def generateLifelines(Interaction interaction, List<TLifeline> textRamLifelines, List<Reference> properties) {
		val result = new ArrayList<Lifeline> 
		
		textRamLifelines.forEach[ textRamLifeline | 
			var lifeline = RamFactory.eINSTANCE.createLifeline => [
				represents = textRamLifeline.createRepresents(properties)
				localProperties.addAll( textRamLifeline.generateLocalProperties)
			]
			
			result.add(lifeline)
		]
		
		result
	}
	
	private def TypedElement createRepresents(TLifeline textRamLifeline, List<Reference> properties) {
		//TODO: change for dispatch methods
		var TypedElement result 
		if (textRamLifeline.referenceType == TLifelineReferenceType.REFERENCE) {
			result = properties.findFirst( p | p.name == textRamLifeline.name)
		}
		
		if (textRamLifeline.referenceType == TLifelineReferenceType.ASSOCIATION ) {
			result = this.ramAspect.findAssociationEnd( (textRamLifeline.represents as TAssociation).name )
		}
		
		if (textRamLifeline.referenceType == TLifelineReferenceType.ATTRIBUTE ) {
			result = this.ramAspect.findAttribute( (textRamLifeline.represents as TAttribute).name )
		}
		
		result
	}
	
	private def generateLocalProperties(TLifeline textRamLifeline) {
		val List<TemporaryProperty> result = newArrayList
		
		textRamLifeline.localProperties.forEach[ textRamTemporaryProperty | 
			result.add(textRamTemporaryProperty.createLocalProperty)
		]

		result
	}
	
	def dispatch TemporaryProperty createLocalProperty(TReference reference) {
		val result = RamFactory.eINSTANCE.createReference => [
			lowerBound = 1
			name = reference.name
			type = this.ramAspect.findClass(reference.reference.name)
		]
		
		result
	}
	
	def dispatch TemporaryProperty createLocalProperty(TLocalAttribute attribute) {
		var result = RamFactory.eINSTANCE.createAttribute => [
			name = attribute.name
			type = attribute.type
		]
		
		result
	}

	def findAttribute(Aspect aspect, String name) {
		val result = aspect.structuralView.classes.filter(Class).map[attributes].flatten.findFirst( a | a.name == name )
		result
	}
	
	private def generateProperties(List<TLifeline> textRamLifelines) {
		val result = new ArrayList<Reference>()

		textRamLifelines.filter( lifeline | lifeline.referenceType == TLifelineReferenceType.REFERENCE).forEach[ lifeline | 
			result.add( lifeline.createProperty )			
		]
		
		return result
	}
	
	private def createProperty(TLifeline lifeline) {
		if (lifeline.represents instanceof TClass == false) {
			throw new ClassCastException
		} 
		
		val result = RamFactory.eINSTANCE.createReference => [
			lowerBound = 1
			name = lifeline.name
			type = this.ramAspect.findClass( (lifeline.represents as TClass).name)
			static = lifeline.static
		]
		
		result
	}
}