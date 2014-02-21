package cl.uchile.pleiad.generator

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Interaction
import ca.mcgill.cs.sel.ram.Lifeline
import ca.mcgill.cs.sel.ram.Message
import ca.mcgill.cs.sel.ram.MessageView
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.ParameterValueMapping
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.Reference
import ca.mcgill.cs.sel.ram.TypedElement
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TInteractionMessage
import cl.uchile.pleiad.textRam.TLifeline
import cl.uchile.pleiad.textRam.TMessage
import cl.uchile.pleiad.textRam.TMessageView
import java.util.ArrayList
import java.util.List

class MessageViewsGenerator {
	
	private var Aspect textRamAspect
	private var Aspect ramAspect
	
	private val String PARTIAL_CHAR = '|'
	
	new( Aspect from, Aspect to) {
		this.textRamAspect = from
		this.ramAspect = to
		
		if (this.textRamAspect.messageViews.size > 0) { 
			val textRamMessages = getTextRamMessages()
			textRamMessages.forEach[ m | 
				this.ramAspect.messageViews.add(m.generateMessageView)
			]	
		}	
	}
	
	def getMessagesView() {
		this.ramAspect.messageViews
	}
	
	private def getTextRamMessages() {
		(this.textRamAspect.messageViews.head as TAbstractMessageView).messages.filter(TMessageView)
	}
	
	private def generateMessageView(TMessageView textRamMessage) {
		var MessageView result = RamFactory.eINSTANCE.createMessageView => [
			specifies = textRamMessage.generateSpecifies
			specification = textRamMessage.generateSpecification 
		]
		
		result
	}
	
	private def generateSpecifies(TMessageView textRamMessage) {
		ramAspect.structuralView.classes.filter(Class).map[operations].flatten.findFirst( a | a.name == textRamMessage.specifies.name.resolveName )
	}
	
	private def Interaction generateSpecification(TMessageView textRamMessage) {
		val objects = textRamMessage.eContainer as TAbstractMessageView
		
		val result = RamFactory.eINSTANCE.createInteraction => [
			properties.addAll(generateProperties( objects.lifelines )) 
			lifelines.addAll(generateLifelines( objects.lifelines, properties ))
		]
		
		result.messages.addAll( generateMessages( result, textRamMessage ) )
		
		result		
	}
	
	private def generateMessages(Interaction interaction, TMessageView textRamMessageView) {
		val List<Message> result = newArrayList
		
		
		textRamMessageView.interactionMessages.forEach[ textRamInteractionMessage |
			
			if (textRamInteractionMessage.leftLifeline.name == '>>') {
				result.add(generateStartMessage( textRamInteractionMessage, interaction ))	
			}
			if (textRamInteractionMessage.rightLifeline.name == '<<') {
				
			}
			if (textRamInteractionMessage.leftLifeline.name != '>>' && textRamInteractionMessage.rightLifeline.name != '<<') {
				result.add(generateMessageOcurrence(textRamInteractionMessage, interaction))
			}
		]
		
		result 
	}
	
	private def  generateMessageOcurrence(TInteractionMessage textRamInteractionMessage, Interaction interaction) {
		
		val lifeLineFrom = getLifelineFrom(interaction, textRamInteractionMessage)
		val lifeLineTo = getLifelineTo(interaction, textRamInteractionMessage)
		
		val operation = getMessageSignature(textRamInteractionMessage)
		
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
			arguments.addAll(textRamInteractionMessage.generateArguments(operation))
		]
		
		send.message = message
		receive.message = message
		
		message
	}
	
	private def generateArguments(TInteractionMessage interactionMessage, Operation operation) {
		val List<ParameterValueMapping> result = newArrayList
		
		if (interactionMessage.message instanceof TMessage) {
			operation.parameters.forEach[ p |  result.add( p.generateParameterValueMapping ) ]
		}
		
		result
	}
	
	private def generateStartMessage(TInteractionMessage textRamStartInteraction, Interaction interaction) {
		val lifeLineTo = getLifelineTo(interaction, textRamStartInteraction)
		
		val operation = getMessageSignature(textRamStartInteraction)
		
		val gate = RamFactory.eINSTANCE.createGate
		gate.name = "in_" + operation.name
		interaction.formalGates.add(gate)
		
		//create receive event
		val event = RamFactory.eINSTANCE.createMessageOccurrenceSpecification
		event.covered.add(lifeLineTo)
		interaction.fragments.add(event)
		
		// create message
		val result = RamFactory.eINSTANCE.createMessage
		result.setSignature(operation)
		result.arguments.addAll(textRamStartInteraction.generateArguments(operation))
		interaction.getMessages.add(result)
		
		// set references
		event.message = result
		gate.message = result
		
		result.sendEvent = gate
		result.receiveEvent = event
		
		result
	}
	
	private def getLifelineTo(Interaction interaction, TInteractionMessage textRamInteractionMessage) {
		val lifeLineTo = interaction.lifelines.findFirst( l | l.represents.name == textRamInteractionMessage.rightLifeline.name.resolveName )
		lifeLineTo
	}
	
	private def getLifelineFrom(Interaction interaction, TInteractionMessage textRamInteractionMessage) {
		val lifeLineFrom = interaction.lifelines.findFirst( l | l.represents.name == textRamInteractionMessage.leftLifeline.name.resolveName )
		lifeLineFrom
	}
	
	private def getMessageSignature(TInteractionMessage textRamInteractionMessage) {
		var Class classOwner  
		
		switch textRamInteractionMessage.rightLifeline.represents {
			TClass: classOwner = this.ramAspect.findClass( (textRamInteractionMessage.rightLifeline.represents as TClass).name.resolveName ) as Class  
		}
		
		val result = classOwner.operations.findFirst[ o | o.name == textRamInteractionMessage.message.signature.name.resolveName ]
		
		result
	}
	
	
	private def generateParameterValueMapping(Parameter p) {
		val result = RamFactory.eINSTANCE.createParameterValueMapping => [
			parameter = p
			value = RamFactory.eINSTANCE.createParameterValue => [ parameter = p ]
		]
		
		result
	}
	
	private def generateLifelines(Interaction interaction, List<TLifeline> textRamLifelines, List<Reference> properties) {
		val result = new ArrayList<Lifeline> 
		
		textRamLifelines.filter( l | l.name != '>>' && l.name != '<<' ).forEach[ textRamLifeline | 
			var lifeline = RamFactory.eINSTANCE.createLifeline
			lifeline.represents = findRepresents(textRamLifeline, properties)
			
			//TODO: what happend with localproperties?
			
			result.add(lifeline)
		]
		
		result
	}
	
	private def findRepresents(TLifeline textRamLifeline, List<Reference> properties) {
		
		//TODO: poor search. it is missing the owner
		
		var TypedElement result = findAssociationEnd( this.ramAspect, textRamLifeline.name )
		
		if (result == null) {
			result = findAttribute( this.ramAspect, textRamLifeline.name )
		}
		
		if (result == null) {
			result = properties.findFirst[p | p.name == textRamLifeline.name ]
		}
		
		//findClass( this.ramAspect, textRamLifeline.name ) as TypedElement
		
		
		
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
		
	private def dispatch resolveRepresents(TAssociation element, List<Reference> properties) {
		this.ramAspect.structuralView.classes.filter(Class).map[associationEnds].flatten.findFirst( a | a.name == element.name ) 
	}
	
	private def dispatch resolveRepresents(TAttribute element, List<Reference> properties) {
		this.ramAspect.structuralView.classes.filter(Class).map[attributes].flatten.findFirst( a | a.name == element.name )
	}
	
	private def dispatch resolveRepresents(TClass element, List<Reference> properties) {
		properties.findFirst[p | p.type.name == element.name.resolveName ]
	}
	
	private def generateProperties(List<TLifeline> textRamLifelines) {
		val result = new ArrayList<Reference>()

		textRamLifelines.forEach[ l | 
			
			if ( this.ramAspect.containsTypedElement(l.name) == false) {
				
				val tClass = l.represents as TClass
				
				if ( tClass != null ) {
					// create the property
					val propertyRepresents = RamFactory.eINSTANCE.createReference
					propertyRepresents.setLowerBound(1)
					propertyRepresents.setName( l.name )
					propertyRepresents.setType( this.ramAspect.findClass( (l.represents as TClass).name.resolveName ) )
					
					result.add(propertyRepresents)
				} 
			}			
		]
		
		return result
	}
	
	private def findClass(Aspect aspect, String name) {
		aspect.structuralView.classes.findFirst[ c | c.name == name ]
	}
	
	private def containsTypedElement(Aspect aspect, String name) {
		// look for classes
		aspect.structuralView.classes.exists[ c | c.name == name ] ||
		// look for attributes
		aspect.structuralView.classes.filter(Class).map[attributes].flatten.exists[ c | c.name == name ] ||
		// look for parameters
		aspect.structuralView.classes.filter(Class).map[operations].flatten.map[parameters].flatten.exists[ c | c.name == name ] ||
		// look for associationEnds
		aspect.structuralView.classes.filter(Class).map[associationEnds].flatten.exists[ c | c.name == name ]
	}
	
	private def resolveName(String name) {
		if (name.startsWith(PARTIAL_CHAR) == true) {
			return name.substring(1)
		}
		
		name
	}
}