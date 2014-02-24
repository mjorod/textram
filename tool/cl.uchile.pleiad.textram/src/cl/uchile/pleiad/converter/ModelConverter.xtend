
package cl.uchile.pleiad.converter
import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Association
import ca.mcgill.cs.sel.ram.AssociationEnd
import ca.mcgill.cs.sel.ram.Attribute
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.ClassifierMapping
import ca.mcgill.cs.sel.ram.Gate
import ca.mcgill.cs.sel.ram.Instantiation
import ca.mcgill.cs.sel.ram.Interaction
import ca.mcgill.cs.sel.ram.Lifeline
import ca.mcgill.cs.sel.ram.Message
import ca.mcgill.cs.sel.ram.MessageSort
import ca.mcgill.cs.sel.ram.MessageView
import ca.mcgill.cs.sel.ram.NamedElement
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.OperationMapping
import ca.mcgill.cs.sel.ram.Parameter
import ca.mcgill.cs.sel.ram.ParameterValueMapping
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RVoid
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import ca.mcgill.cs.sel.ram.TypedElement
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassMember
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TInteractionMessage
import cl.uchile.pleiad.textRam.TLifeline
import cl.uchile.pleiad.textRam.TMessageView
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TStructuralView
import java.util.List
import org.eclipse.emf.ecore.util.EcoreUtil

class ModelConverter implements IModelConverter {

	val String PARTIAL_CHAR = '|'
	
	/**
	 * Transform the textRam model to a ram model
	 */
	override Aspect convertTextRAMModelToRAMModel(Aspect aspect) {
		// cache for all mappable elements (classes, attributes and operations)
		val List<NamedElement> collector = newArrayList

		// instance of TStructuralView
		val textRamStructuralView = aspect.structuralView as TStructuralView
		
		var ramAspect = aspect.copyAspect
		var ramStructuralView = ramAspect.createStructuralView
		
		ramStructuralView = textRamStructuralView.transformTypesToRam(ramStructuralView)
		ramStructuralView = textRamStructuralView.transformClassesToRam(ramStructuralView, collector)  
		ramStructuralView = ramStructuralView.convertAssociations(textRamStructuralView, collector) 
		
		ramAspect.convertInstantiations(aspect, collector)
		
		//ramAspect = ramAspect.transformMessageViews(aspect, collector)
		
		//ramAspect = textRamMessageViewToRamMessageView
			
			
//		)
						
		ramAspect
	}
	
	def transformMessageViews(Aspect ramAspect, Aspect textRamAspect, List<NamedElement> collector) {
		val tAbstractMessageView = textRamAspect.getTAbstractMessageView
		
		tAbstractMessageView.messages.filter(TMessageView).forEach[ m | m.transformMessageView( ramAspect, collector ) ]
		
		ramAspect
	}
	
	private def getTAbstractMessageView(Aspect textRamAspect) {
		textRamAspect.messageViews.filter(TAbstractMessageView).head
	}
	
	def transformMessageView(TMessageView textRamMessage, Aspect ramAspect, List<NamedElement> collector) {
		
		// create ram message view
		val ramMessageView = textRamMessage.createMessageView(collector)
		
		ramMessageView
	}
	
	def createInteraction(List<TLifeline> textRamLifelines, TMessageView textRamMessage, List<NamedElement> collector) {
		// create interaction 
		var interaction = RamFactory.eINSTANCE.createInteraction

		// set properties for interaction
		interaction = interaction.transformProperties( textRamLifelines, collector )
		
		// transform each textRam's lifeline to ram's lifelines
		interaction = interaction.transformLifelines( textRamLifelines, collector )		
		
		// set messages for interaction 
		interaction = interaction.transformMessages( textRamMessage, collector ) 
		
		
		interaction
	}
	
	def transformMessages(Interaction interaction, TMessageView textRamMessage, List<NamedElement> collector) {
//		textRamMessage.specification.interactionMessages.forEach[ i | i.transformMessage(interaction, collector) ]
		
		interaction
	}
	
	private def transformLifelines(Interaction interaction, List<TLifeline> textRamLifelines, List<NamedElement> collector) {
		textRamLifelines.filter( l | l.name != '>>' && l.name != '<<' ).forEach[ l | 
			val ramLifeline = l.createLifeline( interaction, collector)
			
			interaction.lifelines.add(ramLifeline)			
		]
		
		interaction
	}
	
	/**
	 * Transform ram's interaction properties. 
	 * Ram's interaction property is type of Reference, in textRam this is represented by TClass type
	 * TODO: It's missing all References types (RVoid, RInt, etc)
	 *   
	 * @param interaction receiver of the properties
	 * @param textRamLifelines container of TClasses. TClasses are the equivalent of Ram's Reference type.
	 * @param collector container of all cacheable ram models 
	 */
	private def transformProperties(Interaction interaction, List<TLifeline> textRamLifelines, List<NamedElement> collector) {
		
		// iterates over all textRamLifelines's TClass types to add them to the interaction
		textRamLifelines.forEach[ l | 
			
			if ( collector.exists[ c | c.name == l.name ] == false ) {
			
				val tClass = l.represents as TClass
				
				if ( tClass != null ) {
					// create the property
					val propertyRepresents = RamFactory.eINSTANCE.createReference
					propertyRepresents.setLowerBound(1)
					propertyRepresents.setName( l.name )
					propertyRepresents.setType( collector.filter(Class).findFirst( c | c.name == tClass.name.resolveName) )
					
					interaction.properties.add(propertyRepresents)
				} 
				
			}
			
		]
		
		interaction
	}
	
	private def createMessageView(TMessageView textRamMessage, List<NamedElement> collector) {
		var ramMessageView = RamFactory.eINSTANCE.createMessageView
		
		ramMessageView = ramMessageView.transformSpecifies( textRamMessage, collector )  
		
		ramMessageView = ramMessageView.transformSpecification( textRamMessage, collector )
		
		ramMessageView
	}
	
	private def transformSpecification(MessageView ramMessageView, TMessageView textRamMessage, List<NamedElement> collector) {
		//gets a reference of the lifelines block 
		val objects = textRamMessage.eContainer as TAbstractMessageView
		
		// transform ram interaction
		val interaction = createInteraction(objects.lifelines, textRamMessage, collector)
		
		ramMessageView.setSpecification(interaction)
		
		ramMessageView
	}
	
	private def transformSpecifies(MessageView ramMessageView, TMessageView textRamMessage, List<NamedElement> collector) {
		ramMessageView.setSpecifies ( collector.filter(Operation).findFirst( o | o.name == textRamMessage.specifies.name.resolveName ) )
		
		ramMessageView
	}
	
	private def void transformMessage(TInteractionMessage textRamInsteracionMessage, Interaction interaction, List<NamedElement> collector) {
//		// mal buscar en cache, nombre de operaciones es repetido
//		val operation =  collector.filter(Operation).findFirst( o | o.name == textRamInsteracionMessage.message.signature.name.resolveName )
//		var messageSort = MessageSort.SYNCH_CALL
//								
//		if (textRamInsteracionMessage.leftLifeline.name == '>>') {
//			val ramLifelineTo  = interaction.getLifelineTo(textRamInsteracionMessage)
//			createStartMessage( operation, interaction, ramLifelineTo, messageSort )
//		}
//		
//		if (textRamInsteracionMessage.rightLifeline.name == '<<') {
////			createStartMessage( operation, interaction, ramLifelineTo, messageSort )
//		}
//		
//		if (textRamInsteracionMessage.leftLifeline.name != '>>' && textRamInsteracionMessage.rightLifeline.name != '<<') {
//			val ramLifelineTo  = interaction.getLifelineTo(textRamInsteracionMessage)
//			val ramLifelineFrom = interaction.getLifelineFrom(textRamInsteracionMessage) 
//			createMessageOcurrence(ramLifelineFrom, ramLifelineTo, interaction, operation)
//		}
	}
	
	private def getLifelineTo(Interaction interaction, TInteractionMessage textRamInsteracionMessage) {
		interaction.lifelines.findFirst( l | l.represents.name == textRamInsteracionMessage.rightLifeline.name.resolveName )
	}
	
	private def getLifelineFrom(Interaction interaction, TInteractionMessage textRamInsteracionMessage) {
		interaction.lifelines.findFirst( l | l.represents.name == textRamInsteracionMessage.leftLifeline.name.resolveName )
	}
	
	private def createMessageOcurrence(Lifeline ramLifelineFrom, Lifeline ramLifelineTo, Interaction interaction, Operation operation) {
		// create receive event
		val sendEvent = RamFactory.eINSTANCE.createMessageOccurrenceSpecification
		sendEvent.getCovered.add(ramLifelineFrom)
		interaction.fragments.add(sendEvent)
		
		// create receive event
		val receiveEvent = RamFactory.eINSTANCE.createMessageOccurrenceSpecification
		receiveEvent.getCovered.add(ramLifelineTo)
		interaction.fragments.add(receiveEvent)
		
		// create message
		val message = RamFactory.eINSTANCE.createMessage
		message.setSendEvent( sendEvent )
		message.setReceiveEvent( receiveEvent )
		message.transformArguments( operation )
		
		// set references
		sendEvent.setMessage(message)
		receiveEvent.setMessage(message)
		
		message
	}
	
	def createStartMessage(Operation operation, Interaction interaction, Lifeline ramLifelineTo, MessageSort messageSort) {
		var Gate gate = null
		//messageSort = MessageSort.REPLY 
		
		// create gate.
		gate = RamFactory.eINSTANCE.createGate
		gate.setName( "in_" + operation.name )
		interaction.formalGates.add(gate)
		
		// create receive event
		val event = RamFactory.eINSTANCE.createMessageOccurrenceSpecification
		event.getCovered.add(ramLifelineTo)
		interaction.fragments.add(event)
		
		// create message
		val message = RamFactory.eINSTANCE.createMessage
		message.setMessageSort(MessageSort.CREATE_MESSAGE)
		message.setSignature(operation)
		message.transformArguments(operation)
		interaction.getMessages.add(message)
		
		// set references
		event.setMessage(message)
		gate.setMessage(message)
		
		message.setSendEvent(gate)
		message.setReceiveEvent(event)
		
		message
	}
	
	def transformArguments(Message message, Operation operation) {
		operation.parameters.forEach[ p |  message.arguments.add( p.transformToParameterValueMapping ) ]
	}
	
	def ParameterValueMapping transformToParameterValueMapping(Parameter parameter) {
		// create parameter value mapping
		val parameterValueMapping = RamFactory.eINSTANCE.createParameterValueMapping
		
		// map parameter to parameterValueMapping
		parameterValueMapping.setParameter( parameter )
		
		// create value specification
		val parameterValue = RamFactory.eINSTANCE.createParameterValue
		parameterValue.setParameter(parameter)
		
		// set parameter value as value specification
		parameterValueMapping.setValue(parameterValue)
		
		parameterValueMapping
	}
	
	def createLifeline(TLifeline tLifeline, Interaction interaction, List<NamedElement> collector) {
		// create the life line.
		val lifeline = RamFactory.eINSTANCE.createLifeline
		
		var represents = collector.findFirst( c | c.name == tLifeline.name ) as TypedElement 
		
		if (represents == null)
			represents = tLifeline.represents.resolveRepresents(interaction, tLifeline, collector)
		
		val lifeLineRepresents = represents
		
		lifeline.setRepresents(lifeLineRepresents)
		
		lifeline
	}
	
	private def dispatch resolveRepresents(TAssociation element, Interaction interaction, TLifeline tLifeline, List<NamedElement> collector) {
		collector.filter(AssociationEnd).findFirst( a | a.name == element.name ) as TypedElement
	}
	
	private def dispatch resolveRepresents(TAttribute element, Interaction interaction, TLifeline tLifeline, List<NamedElement> collector) {
		collector.filter(Attribute).findFirst( a | a.name == element.name ) as TypedElement
	}
	
	private def dispatch resolveRepresents(TClass element, Interaction interaction, TLifeline tLifeline, List<NamedElement> collector) {
		interaction.properties.findFirst( p | p.name == tLifeline.name )
	}
	
	private def createStructuralView(Aspect aspect) {
		RamFactory.eINSTANCE.createStructuralView()
	}
	
	private def StructuralView transformTypesToRam(TStructuralView textRamStructuralView, StructuralView ramStructuralView) {
		ramStructuralView.types.addAll(EcoreUtil.copyAll(textRamStructuralView.types))
		
		ramStructuralView
	}
	
	private def transformClassesToRam(TStructuralView textRamStructuralView, StructuralView ramStructuralView, List<NamedElement> collector) {
		textRamStructuralView.classes.filter(TClass).forEach[ textRamClass | textRamClass.transformClass(ramStructuralView, collector)  ]
		
		ramStructuralView
	}
	
	/**
	 * Create a new {@link Aspect} from the textRam aspect
	 * Only the name is set which is copied from textRam aspect
	 * 
	 * @param textRamAspect to be copied
	 */
	private def copyAspect(Aspect textRamAspect) {
		var newAspect = RamFactory.eINSTANCE.createAspect()
		newAspect.setName(textRamAspect.name)
		
		newAspect
	}
	
	private def void convertInstantiations(Aspect ramAspect, Aspect aspect, List<NamedElement> collector) {
		aspect.instantiations.forEach[ instantiation | instantiation.convertInstantiation(ramAspect, collector) ]
	}
	
	private def convertInstantiation(Instantiation instantiation, Aspect ramAspect, List<NamedElement> collector) {
		val newInstantiation = RamFactory.eINSTANCE.createInstantiation()
		val ramExternalAspect = ModelConverterProxy::instance.convertTextRAMModelToRAMModel(instantiation.externalAspect) 
					
		newInstantiation.setExternalAspect(ramExternalAspect)
		newInstantiation.setType(instantiation.type)
    	
    	instantiation.mappings.forEach[ mapping | mapping.convertMapping(ramExternalAspect, newInstantiation, collector) ]
    
    	newInstantiation	
	}
	
	private def convertMapping(ClassifierMapping mapping, Aspect ramExternalAspect, Instantiation newInstantiation, List<NamedElement> collector) {
		// create ClassifierMapping
		val ramClassifierMapping = RamFactory.eINSTANCE.createClassifierMapping()
		val tClassifierMapping = mapping as TClassifierMapping
		
		// from element
		val fromElement = ramExternalAspect.structuralView.classes.findFirst( c | c.name == tClassifierMapping.fromElement.name )
		ramClassifierMapping.setFromElement(fromElement)
		
		// to element
		val toElement = collector.findFirst( e | e.name ==  tClassifierMapping.toElement.name ) as Classifier
		ramClassifierMapping.setToElement(toElement)
		
		// call a dispatch method for mapping members (operations and attributes)
		tClassifierMapping.fromMembers.forEach[ classMemberFrom | classMemberFrom.convertMemberMappings(ramExternalAspect, ramClassifierMapping, tClassifierMapping, collector) ]
		
		ramClassifierMapping
	}
	
	private def void convertMemberMappings(TClassMember classMemberFrom, Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TClassifierMapping tClassifierMapping, List<NamedElement> collector) {
		// class member To
		val indexOfClassMemberFrom = tClassifierMapping.fromMembers.indexOf(classMemberFrom)
		
		val classMemberTo = tClassifierMapping.getFromMembers().get(indexOfClassMemberFrom)
		
		classMemberFrom.createMemberMapping(classMemberTo, ramExternalAspect, newClassifierMapping, tClassifierMapping, collector);
	}
	
	private def dispatch void createMemberMapping(TOperation classMemberFrom, TClassMember classMemberTo, Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TClassifierMapping tClassifierMapping, List<NamedElement> collector){
		createOperationMapping(ramExternalAspect, newClassifierMapping, classMemberFrom, classMemberTo, collector)
	}
	
	private def createOperationMapping(Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TOperation tClassMemberFrom, TClassMember tClassMemberTo, List<NamedElement> collector) {
		val ramOperationMapping = RamFactory.eINSTANCE.createOperationMapping()
		val externalOperation = ramExternalAspect.structuralView.classes.filter(Class).map[operations].flatten.findFirst( opr | opr.name == tClassMemberFrom.name.resolveName )
		val internalOperation = collector.findFirst( e | e.name == tClassMemberTo.name.resolveName ) as Operation
		
		ramOperationMapping.setFromElement( externalOperation )
		ramOperationMapping.setToElement( internalOperation )
		
		tClassMemberFrom.parameters.forEach[ parm | parm.convertParameterMapping(ramOperationMapping,
																				 ramExternalAspect, 
																				 externalOperation, 
																				 internalOperation, 
																				 tClassMemberFrom, 
																				 tClassMemberTo as TOperation)]
		
		ramOperationMapping
	}
	
	private def convertParameterMapping(Parameter tParameterFrom, OperationMapping ramOperationMapping,  Aspect externalAspect, Operation externalOperation, Operation internalOperation, TOperation tClassMemberFrom, TOperation tClassMemberTo) {
		//externalAspect<tParameterFrom> -> internalAspect<tParameterTo>

		// index to get the To TParameter 
		val indexOfParameterMemberFrom = tClassMemberFrom.parameters.indexOf(tParameterFrom);
		
		// To TParameter 
		val tParameterTo = tClassMemberTo.parameters.get(indexOfParameterMemberFrom)
		
		// create ram parameter mapping
		val ramParameterMapping = RamFactory.eINSTANCE.createParameterMapping()
		
		// get the parameter from external operation which is inside of the external aspect
		val ramParameterFrom = externalOperation.parameters.findFirst( parm | parm.name == tParameterFrom.name )
		
		// get the parameter for the current operation which is inside of the current editing aspect
		val ramParameterTo = internalOperation.parameters.findFirst( parm | parm.name == tParameterTo.name )
		
		// set from element 			
		ramParameterMapping.setFromElement( ramParameterFrom )
		
		// set to element
		ramParameterMapping.setToElement( ramParameterTo )
				
		ramParameterMapping
	}
	
	private def dispatch void createMemberMapping(TAttribute classMemberFrom, TClassMember classMemberTo, Aspect ramExternalAspect, ClassifierMapping newClassifierMapping, TClassifierMapping tClassifierMapping, List<NamedElement> collector){
		createAttributeMapping(ramExternalAspect, newClassifierMapping, classMemberFrom, classMemberTo, collector)
	}
	
	private def createAttributeMapping(Aspect ramExternalAspect, ClassifierMapping ramClassifierMapping, TAttribute classMemberFrom, TClassMember classMemberTo, List<NamedElement> collector) {
		val ramAttributeMapping = RamFactory.eINSTANCE.createAttributeMapping()
		val externalAttribute = ramExternalAspect.structuralView.classes.filter(Class).map[attributes].flatten.findFirst( attr | attr.name == classMemberFrom.name )
		ramAttributeMapping.setFromElement( externalAttribute )
		ramAttributeMapping.setToElement( collector.findFirst( e | e.name == classMemberTo.name ) as Attribute )
		
		ramAttributeMapping
	}
	
	private def convertAssociations(StructuralView ramStructuralView, TStructuralView textRamStructuralView, List<NamedElement> collector) {
		textRamStructuralView.TAssociations.forEach[ textRamAssoc | textRamAssoc.transformAssociation(ramStructuralView, collector)  ]
		
		ramStructuralView
	}
	
	private def transformAssociation(TAssociation textRamAssociation, StructuralView ramStructuralView, List<NamedElement> collector) {
		var Class from = collector.findFirst( c | c.name == textRamAssociation.fromEnd.classReference.name.resolveName ) as Class
		var Class to = collector.findFirst( c | c.name == textRamAssociation.toEnd.classReference.name.resolveName ) as Class
		
		val classNameFrom = textRamAssociation.fromEnd.classReference.name.resolveName
		val classNameTo = textRamAssociation.toEnd.classReference.name.resolveName
		
		// create association
		var ramAssociation = RamFactory.eINSTANCE.createAssociation()
		ramAssociation.setName(classNameFrom + "_" + classNameTo);
		
		ramAssociation.transformAssociationEndClassFrom( textRamAssociation, from, to )
		ramAssociation.transformAssociationEndClassTo ( textRamAssociation, from, to, collector )
         
        return ramAssociation
	}
	
	def resolveName(String name) {
		if (name.startsWith(PARTIAL_CHAR) == true) {
			return name.substring(1)
		}
		
		name
	} 
	
	private def transformAssociationEndClassFrom(Association ramAssociation, TAssociation textRamAssociation, Class from, Class to) {
		// create from association end
     	var fromEnd = RamFactory.eINSTANCE.createAssociationEnd();
     	fromEnd.setAssoc(ramAssociation);
     	fromEnd.setLowerBound(textRamAssociation.fromEnd.lowerBound)
     	fromEnd.setUpperBound(textRamAssociation.fromEnd.upperBound)
     	fromEnd.setName(to.name.toLowerCaseFirst)
     	fromEnd.setNavigable(false)
     
		fromEnd
	}
	
	private def transformAssociationEndClassTo(Association association, TAssociation tAssociation, Class from, Class to, List<NamedElement> collector) {
		// create to association end
        var toEnd = RamFactory.eINSTANCE.createAssociationEnd();
        toEnd.setAssoc(association);
        toEnd.setLowerBound(tAssociation.toEnd.lowerBound)
        toEnd.setUpperBound(tAssociation.toEnd.upperBound)
        toEnd.setName(tAssociation.name.toLowerCaseFirst)
     
     	collector.add(toEnd)
     
     	toEnd
   	}
	
	private def Class transformClass(TClass textRamClass, StructuralView ramStructuralView, List<NamedElement> collector) {
		val ramClass = RamFactory.eINSTANCE.createClass()
		ramClass.setName( textRamClass.name.replace(PARTIAL_CHAR, '') )
		ramClass.setAbstract(textRamClass.abstract)
		ramClass.setPartial( textRamClass.name.startsWith(PARTIAL_CHAR) )
		
		collector.add(ramClass)
		
		// use dispatch methods to transform attributes and operations
		textRamClass.members.forEach[ classMember | transformClassMember(classMember, ramClass, collector ) ]
		
		// add super type
		if (textRamClass.superTypes.empty == false) {
			val superType = collector.findFirst( c | c.name == textRamClass.superTypes.head.name ) as Classifier;
			ramClass.superTypes.add(superType)
		}
		
		ramClass
	}
	
	private def dispatch transformClassMember(TOperation tOperation, Class classOwner, List<NamedElement> collector) {
		val ramOperation = tOperation.copyOperation(classOwner, collector)
		
		collector.add(ramOperation)
	}
	
	private def dispatch transformClassMember(TAttribute tAttribute, Class classOwner, List<NamedElement> collector) {
		val ramAttribute = tAttribute.copyAttribute(classOwner, collector)
		
		collector.add(ramAttribute)
	}
	
	private def copyOperation(TOperation tOperation, Class classOwner, List<NamedElement> collector ) {
		val ramOperation = RamFactory.eINSTANCE.createOperation()
		ramOperation.setName( tOperation.name.replace(PARTIAL_CHAR, '') )
		ramOperation.setAbstract(tOperation.abstract)
		ramOperation.setStatic(tOperation.static)
		ramOperation.setPartial( tOperation.name.startsWith(PARTIAL_CHAR) )
		ramOperation.setReturnType( tOperation.returnType.transformType(collector) )
		ramOperation.setVisibility(tOperation.visibility)
		
		tOperation.parameters.forEach[ p |  ramOperation.addParameter(p, collector ) ]
		
		ramOperation
	}
	
	def addParameter(Operation operation, Parameter parameter, List<NamedElement> collector) {
		operation.parameters.add( parameter.transformParameter( collector ) )
	}
	
	def transformParameter(Parameter parameter, List<NamedElement> collector) {
		val ramParameter = RamFactory.eINSTANCE.createParameter
		ramParameter.name = parameter.name
		ramParameter.type = parameter.type.transformType( collector)
		
		ramParameter
	}
	
	private def dispatch transformType(PrimitiveType type, List<NamedElement> collector) {
		type as Type
	}
	
	private def dispatch transformType(Type type, List<NamedElement> collector) {
		collector.findFirst( c | c.name == type.name ) as Type
	}
	
	private def dispatch transformType(RVoid type, List<NamedElement> collector) {
		type as Type
	}
	
	private def copyAttribute(TAttribute tAttribute, Class classOwner, List<NamedElement> collector) {
		val ramAttribute = RamFactory.eINSTANCE.createAttribute()
		ramAttribute.setName(tAttribute.name)
		ramAttribute.setStatic(tAttribute.static)
		ramAttribute.setType(tAttribute.type)
		
		collector.add(ramAttribute)
		
		ramAttribute
	} 	
	 
	private def static String toLowerCaseFirst(String text) {
        var charArray = text.toCharArray();
        charArray.set(0, Character.toLowerCase(charArray.get(0)));
        String.valueOf(charArray);
    }
		
}