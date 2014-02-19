package cl.uchile.pleiad.generator

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Gate
import ca.mcgill.cs.sel.ram.Interaction
import ca.mcgill.cs.sel.ram.Lifeline
import ca.mcgill.cs.sel.ram.MessageView
import ca.mcgill.cs.sel.ram.NamedElement
import ca.mcgill.cs.sel.ram.ObjectType
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.Reference
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TLifeline
import cl.uchile.pleiad.textRam.TMessageView
import java.util.ArrayList
import java.util.List
import ca.mcgill.cs.sel.ram.TypedElement
import ca.mcgill.cs.sel.ram.AssociationEnd
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import ca.mcgill.cs.sel.ram.Attribute

class MessageViewsGenerator {
	
	private var Aspect textRamAspect
	private var Aspect ramAspect
	private var List<NamedElement> collector
	
	private val String PARTIAL_CHAR = '|'
	
	def generate( Aspect textRamAspect, Aspect ramAspect,  List<NamedElement> collector) {
		this.textRamAspect = textRamAspect
		this.ramAspect = ramAspect
		this.collector = collector
	}
	
	private def generateMessages() {
		this.textRamMessages.forEach[ m | m.generateMessage ]
		
		//TODO: que retorna?
	}
	
	def generateMessage(TMessageView textRamMessage) {
		var MessageView result = RamFactory.eINSTANCE.createMessageView => [
			specifies = operationFrom(textRamMessage)
			specification = interactionFrom(textRamMessage) 
		]
		
		result
	}
	
	private def Interaction interactionFrom(TMessageView textRamMessage) {
		val objects = textRamMessage.eContainer as TAbstractMessageView
		
		val result = RamFactory.eINSTANCE.createInteraction => [
			properties.addAll(getPropertiesFrom( objects.lifelines )) 
			lifelines.addAll(getLifelines( objects.lifelines, properties )  )
		]
		
//		result.createStartGate(textRamMessage)
//		
//		result.createMessagesOcurrunce()
//		
//		result.createEndGate()
		
		
		result		
	}
	
	def void createStartGate(Interaction interaction, TMessageView textRamMessageView) {
//		val signature = 
		
		
	}
	
	def getLifelines(Interaction interaction, List<TLifeline> textRamLifelines, List<Reference> properties) {
		val result = new ArrayList<Lifeline> 
		
		textRamLifelines.forEach[ textRamLifeline | 
			var lifeline = RamFactory.eINSTANCE.createLifeline => [
				represents = getTypedElement(textRamLifeline ,properties)
			] //TODO: what happend with coveredby and localproperties?
			
			result.add(lifeline)
		]
		
		result
	}
	
	def getTypedElement(TLifeline textRamLifeline, List<Reference> properties) {
		var represents = collector.findFirst( c | c.name == textRamLifeline.name ) as TypedElement 
		
		if (represents == null)
			represents = textRamLifeline.represents.resolveRepresents(properties, textRamLifeline, collector)
		
		represents
	}
	
	private def dispatch resolveRepresents(TAssociation element, List<Reference> properties, TLifeline tLifeline, List<NamedElement> collector) {
		collector.filter(AssociationEnd).findFirst( a | a.name == element.name ) as TypedElement
	}
	
	private def dispatch resolveRepresents(TAttribute element, List<Reference> properties, TLifeline tLifeline, List<NamedElement> collector) {
		collector.filter(Attribute).findFirst( a | a.name == element.name ) as TypedElement
	}
	
	private def dispatch resolveRepresents(TClass element, List<Reference> properties, TLifeline tLifeline, List<NamedElement> collector) {
		properties.findFirst( p | p.name == tLifeline.name )
	}
	
	def getPropertiesFrom(List<TLifeline> textRamLifelines) {
		val result = new ArrayList<Reference>()
		// iterates over all textRamLifelines's TClass types to add them to the interaction
		textRamLifelines.forEach[ l | 
			
			if ( collector.exists[ c | c.name == l.name ] == false ) {
			
				val tClass = l.represents as TClass
				
				if ( tClass != null ) {
					// create the property
					val propertyRepresents = RamFactory.eINSTANCE.createReference
					propertyRepresents.setLowerBound(1)
					propertyRepresents.setName( l.name )
					propertyRepresents.setType( collector.filter(ObjectType).findFirst( c | c.name == tClass.name.resolveName) )
					
					result.add(propertyRepresents)
				} 
			}			
		]
		
		return result
	}
	
	
	private def operationFrom(TMessageView textRamMessage) {
		collector.filter(Operation).findFirst( o | o.name == textRamMessage.specifies.name.resolveName)	
	}

	
	private def getTAbstractMessageView() {
		textRamAspect.messageViews.head as TAbstractMessageView
	}
	
	private def getTextRamMessages() {
		this.getTAbstractMessageView.messages.filter(TMessageView)
	}
	
//	def createStartMessage(Operation operation, Interaction interaction, Lifeline ramLifelineTo, MessageSort messageSort) {
//		var Gate gate = null
//		//messageSort = MessageSort.REPLY 
//		
//		// create gate.
//		gate = RamFactory.eINSTANCE.createGate
//		gate.setName( "in_" + operation.name )
//		interaction.formalGates.add(gate)
//		
//		// create receive event
//		val event = RamFactory.eINSTANCE.createMessageOccurrenceSpecification
//		event.getCovered.add(ramLifelineTo)
//		interaction.fragments.add(event)
//		
//		// create message
//		val message = RamFactory.eINSTANCE.createMessage
//		message.setMessageSort(MessageSort.CREATE_MESSAGE)
//		message.setSignature(operation)
//		message.transformArguments(operation)
//		interaction.getMessages.add(message)
//		
//		// set references
//		event.setMessage(message)
//		gate.setMessage(message)
//		
//		message.setSendEvent(gate)
//		message.setReceiveEvent(event)
//		
//		message
//	}
//	
	def resolveName(String name) {
		if (name.startsWith(PARTIAL_CHAR) == true) {
			return name.substring(1)
		}
		
		name
	}
	
	
}