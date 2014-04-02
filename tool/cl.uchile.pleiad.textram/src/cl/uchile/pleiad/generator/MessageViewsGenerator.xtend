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
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TAbstractMessages
import cl.uchile.pleiad.textRam.TAspectMessageView
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TCombinedFragment
import cl.uchile.pleiad.textRam.TInteractionMessage
import cl.uchile.pleiad.textRam.TLifeline
import cl.uchile.pleiad.textRam.TLocalAttribute
import cl.uchile.pleiad.textRam.TMessage
import cl.uchile.pleiad.textRam.TMessageView
import cl.uchile.pleiad.textRam.TMessageWithSignature
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TReference
import cl.uchile.pleiad.textRam.TReturnMessage
import cl.uchile.pleiad.util.TextRamEcoreUtil
import java.util.ArrayList
import java.util.List

//TODO: toLowerCaseFirst is missing
class MessageViewsGenerator {
	
	private var Aspect textRamAspect
	private var Aspect ramAspect
	
	private val String PARTIAL_CHAR = '|'
	
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
		val result = findOperation(textRamMessage.specifies.name)
		result
	}
	
	private def generatePointcut(TAspectMessageView textRamAspectMessageView) {
		val result = findOperation(textRamAspectMessageView.pointcut.name)
		
		result
	}
	
	private def findOperation(String name) {
		ramAspect.structuralView.classes.filter(Class).map[operations].flatten.findFirst( a | a.name == name.resolveName )
	}
	
	private def createInteraction(TAbstractMessages textRamMessage) {
		
		val objects = textRamMessage.eContainer as TAbstractMessageView
		
		val result = RamFactory.eINSTANCE.createInteraction => [
			properties.addAll( generateProperties( objects.lifelines ) ) 
			lifelines.addAll( generateLifelines( objects.lifelines, properties ) )
		]
	
		// iterates textRam's interactions		
		textRamMessage.interactionMessages.forEach[  textRamInteraction | 
			generateInteractionMessages( textRamInteraction, result, textRamMessage )
		]
		
		result
	}
	
	private def dispatch void generateInteractionMessages( TInteractionMessage textRamInteractionMessage, FragmentContainer fragmentContainer, TAbstractMessages textRamMessage) {
		var Message message
		
		if (textRamInteractionMessage.isStartGate) {
			message = generateStartMessage( textRamInteractionMessage, fragmentContainer as Interaction )	
		}
		
		//TODO: se asume que solo habrá de retorno para el primer mensaje
		if (textRamInteractionMessage.isEndGate ) {
			//TODO: i can get textRamMessage using the father of the current message
			val firstInteractionMessage = textRamMessage.interactionMessages.filter(TInteractionMessage).findFirst( im | im.leftLifeline.name == '>>' )
			
			message = generateEndMessage( firstInteractionMessage, textRamInteractionMessage, fragmentContainer as Interaction )
		}
		
		if (textRamInteractionMessage.isNotStartGateNorEndGate) {
			message = generateMessageOcurrence(textRamInteractionMessage, fragmentContainer)
		}
		
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

	
	private def isStartGate( TInteractionMessage interaction ) {
		return interaction.leftLifeline.name == '>>'
	}
	
	private def isEndGate ( TInteractionMessage interaction ) {
		return interaction.rightLifeline.name == '<<'
	}
	
	private def isNotStartGateNorEndGate ( TInteractionMessage interaction ) {
		return interaction.leftLifeline.name != '>>' && interaction.rightLifeline.name != '<<'
	}
	
	private def generateMessageOcurrence(TInteractionMessage textRamInteractionMessage, FragmentContainer interaction) {
		val lifeLineFrom = getLifelineFrom(interaction, textRamInteractionMessage)
		val lifeLineTo = getLifelineTo(interaction, textRamInteractionMessage)
		
		val operation = getMessageSignature(textRamInteractionMessage)
		
		val send = RamFactory.eINSTANCE.createMessageOccurrenceSpecification
		send.covered.add(lifeLineFrom)
		interaction.fragments.add(send)
		
		val receive= RamFactory.eINSTANCE.createMessageOccurrenceSpecification
		receive.covered.add(lifeLineTo)
		interaction.fragments.add(receive)
		
		//TODO: defecto en AspectMessageViewView
//		if ( textRamInteractionMessage.originalExecution == true ) {
//			attachOriginalBehaviourExecution(lifeLineFrom, interaction)	
//		}
		
		val message = RamFactory.eINSTANCE.createMessage => [
			sendEvent = send
			receiveEvent = receive
			signature = operation
			arguments.addAll(textRamInteractionMessage.generateArguments(operation))
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
			result = textRamMessage.assignTo.createStructuralFeature(lifeline)
		}
				
		return result
	}
	
	private def dispatch StructuralFeature createStructuralFeature(TAssociation feature, Lifeline lifeline) {
		val result = this.ramAspect.findAssociationEnd( feature.name )
		result
	}
	
	private def dispatch StructuralFeature createStructuralFeature(TReference feature, Lifeline lifeline) {
		val result = lifeline.localProperties.filter(Reference).findFirst( r | r.name == feature.name )
		result
	}
	
	private def dispatch StructuralFeature  createStructuralFeature(TLocalAttribute feature, Lifeline lifeline) {
		val result = lifeline.localProperties.filter(Attribute).findFirst( a | a.name == feature.name )
		result	
	}
	
	private def generateArguments(TInteractionMessage interactionMessage, Operation operation) {
		val List<ParameterValueMapping> result = newArrayList
		
		if (interactionMessage.message instanceof TMessage) {
			operation.parameters.forEach[ p |  result.add( p.createParameterValueMapping ) ]
		}
		
		result
	}
	
	private def generateStartMessage(TInteractionMessage textRamStartInteraction, Interaction interaction) {
		val lifeLineTo = getLifelineTo(interaction, textRamStartInteraction)
		
		val operation = getMessageSignature(textRamStartInteraction)
		
		val gate = RamFactory.eINSTANCE.createGate => [
			name =  "in_" + operation.name
		]
		
		interaction.formalGates.add(gate)
		
		//create receive event
		val event = RamFactory.eINSTANCE.createMessageOccurrenceSpecification => [
			covered.add(lifeLineTo)	
		]
		
		if ( textRamStartInteraction.originalExecution == true ) {
			attachOriginalBehaviourExecution(lifeLineTo, interaction)	
		}
		
		interaction.fragments.add(event)
		
		// create message
		val result = RamFactory.eINSTANCE.createMessage => [
			signature = operation
			arguments.addAll(textRamStartInteraction.generateArguments(operation))
			sendEvent = gate
			receiveEvent = event
		]
		
		if (textRamStartInteraction.create == true) {
			result.messageSort = MessageSort.CREATE_MESSAGE
		}
		
		if (textRamStartInteraction.message instanceof TMessage) {
			result.assignTo = generateAssignTo(textRamStartInteraction.message as TMessage, lifeLineTo)	
		}
		
		interaction.getMessages.add(result)
		
		// set references
		event.message = result
		gate.message = result
		
		
		result
	}
	
	private def generateEndMessage(TInteractionMessage firstInteractionMessage, TInteractionMessage lastInteractionMessage, Interaction interaction) {
		val lifeline = getLifelineTo(interaction, firstInteractionMessage)
		// TODO: references?
		
		val gate = RamFactory.eINSTANCE.createGate => [
			name =  "out_" + firstInteractionMessage.rightLifeline.name
		]
		
		interaction.formalGates.add(gate)
		
		//create receive event
		val event = RamFactory.eINSTANCE.createMessageOccurrenceSpecification => [
			covered.add(lifeline)
		]
		
		interaction.fragments.add(event)
		
		// create message
		val result = RamFactory.eINSTANCE.createMessage => [
			signature = getMessageSignature(firstInteractionMessage)
			sendEvent = event
			receiveEvent = gate
			messageSort = MessageSort.REPLY
		]
		
		if (lastInteractionMessage.message != null) { 
			result.returns = getMessageReturn( lastInteractionMessage.message as TReturnMessage, lifeline )
		}
		
		interaction.messages.add(result)
		
		// set references
		event.message = result
		gate.message = result
		
		result
	}
	
	private def attachOriginalBehaviourExecution(Lifeline lifeline, Interaction interaction) {
		val originalBehaviourExecution = RamFactory.eINSTANCE.createOriginalBehaviorExecution => [
			covered.add(lifeline)
		]
		
		interaction.fragments.add(originalBehaviourExecution)
	}
	
	private def getMessageReturn(TReturnMessage message, Lifeline lifeline) {
		val result = RamFactory.eINSTANCE.createStructuralFeatureValue => [
			value = message.assignTo.createStructuralFeature(lifeline)
		]
		
		result
	}
	
	private def dispatch getLifelineTo(Interaction interaction, TInteractionMessage textRamInteractionMessage) {
		val lifeLineTo = interaction.lifelines.findFirst( l | l.represents.name == textRamInteractionMessage.rightLifeline.name.resolveName )
		lifeLineTo
	}
	
	private def dispatch getLifelineTo(InteractionOperand interactionOperand, TInteractionMessage textRamInteractionMessage) {
		val Interaction rootInteraction = TextRamEcoreUtil.getRootContainerOfType( interactionOperand, RamPackage.Literals.INTERACTION )
		val lifeLineTo = rootInteraction.lifelines.findFirst( l | l.represents.name == textRamInteractionMessage.rightLifeline.name.resolveName )
		lifeLineTo
	}	
	
	private def dispatch getLifelineFrom(Interaction interaction, TInteractionMessage textRamInteractionMessage) {
		val lifeLineFrom = interaction.lifelines.findFirst( l | l.represents.name == textRamInteractionMessage.leftLifeline.name.resolveName )
		lifeLineFrom
	}
	
	private def dispatch getLifelineFrom(InteractionOperand interactionOperand, TInteractionMessage textRamInteractionMessage) {
		val Interaction rootInteraction = TextRamEcoreUtil.getRootContainerOfType( interactionOperand, RamPackage.Literals.INTERACTION )
		val lifeLineFrom =  rootInteraction.lifelines.findFirst( l | l.represents.name == textRamInteractionMessage.leftLifeline.name.resolveName )
		lifeLineFrom
	}
	
	private def getMessageSignature(TInteractionMessage textRamInteractionMessage) {
		var Operation result
		
		val signatureName = textRamInteractionMessage.message.getSignature.name.resolveName 
		
		val classOwner = textRamInteractionMessage.rightLifeline.represents.getClassOwner
		
		result =  classOwner.operations.findFirst( o | o.name == signatureName )
		
		return result
	}
	
	private def dispatch getClassOwner(TAssociation owner) {
		val result = this.ramAspect.findAssociationEnd( owner.name ).eContainer as Class
		result
	}
	
	private def dispatch getClassOwner(TAttribute owner) {
		val result = this.ramAspect.findAttribute( owner.name ).eContainer as Class
		result
	}
	
	private def dispatch getClassOwner(TClass owner) {
		val result = this.ramAspect.findClass(owner.name.resolveName)
		result
	}
	
	private def dispatch TOperation getSignature(TMessageWithSignature textRamMessage) {
		textRamMessage.signature
	}
	
	private def dispatch TOperation getSignature(TReturnMessage textRamMessage) {
		throw new ClassCastException("TReturnMessage has not a Signature feature")
	}
	
	private def createParameterValueMapping(Parameter p) {
		val result = RamFactory.eINSTANCE.createParameterValueMapping => [
			parameter = p
			value = RamFactory.eINSTANCE.createParameterValue => [ parameter = p ]
		]
		
		result
	}
	
	private def generateLifelines(Interaction interaction, List<TLifeline> textRamLifelines, List<Reference> properties) {
		val result = new ArrayList<Lifeline> 
		
		textRamLifelines.filterNotStartGateNotEndGate.forEach[ textRamLifeline | 
			var lifeline = RamFactory.eINSTANCE.createLifeline => [
				represents = textRamLifeline.createRepresents(properties)
				localProperties.addAll( textRamLifeline.generateLocalProperties)
			]
			
			result.add(lifeline)
		]
		
		result
	}
	
	private def TypedElement createRepresents(TLifeline textRamLifeline, List<Reference> properties) {
		var TypedElement result 
		if (textRamLifeline.reference == true) {
			result = properties.findFirst( p | p.name == textRamLifeline.name.resolveName)
		}
		else {
			result = textRamLifeline.represents.mapRepresents //TODO: parameter
		}
		
		result
	}
	
	private def dispatch mapRepresents(TAssociation from) {
		return this.ramAspect.findAssociationEnd( from.name )
	}
	
	private def dispatch mapRepresents(TAttribute from) {
		return this.ramAspect.findAttribute(from.name)
	}
	
	private def filterNotStartGateNotEndGate(List<TLifeline> lifelines) {
		lifelines.filter( l | l.name != '>>' && l.name != '<<' )
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
	
	def findAssociationEnd(Aspect aspect, String name) {
		val result = aspect.structuralView.classes.filter(Class).map[associationEnds].flatten.findFirst( a | a.name == name )
		result
	}
	
	private def generateProperties(List<TLifeline> textRamLifelines) {
		val result = new ArrayList<Reference>()

		textRamLifelines.filter( lifeline | lifeline.isReference == true ).forEach[ lifeline | 
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
			type = this.ramAspect.findClass( (lifeline.represents as TClass).name.resolveName )
			static = lifeline.static
		]
		
		result
	}
	
	private def findClass(Aspect aspect, String name) {
		aspect.structuralView.classes.findFirst[ c | c.name == name ]
	}
	
	private def resolveName(String name) {
		if (name.startsWith(PARTIAL_CHAR) == true) {
			return name.substring(1)
		}
		
		name
	}
}