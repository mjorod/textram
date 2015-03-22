package cl.uchile.pleiad.util

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Instantiation
import ca.mcgill.cs.sel.ram.InstantiationType
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RAny
import ca.mcgill.cs.sel.ram.RSet
import ca.mcgill.cs.sel.ram.RVoid
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.RamPackage
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import ca.mcgill.cs.sel.ram.Visibility
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TAbstractMessages
import cl.uchile.pleiad.textRam.TAspect
import cl.uchile.pleiad.textRam.TAspectMessageView
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TCombinedFragment
import cl.uchile.pleiad.textRam.TInteractionMessage
import cl.uchile.pleiad.textRam.TLifelineReferenceType
import cl.uchile.pleiad.textRam.TMessage
import cl.uchile.pleiad.textRam.TMessageAssignableFeature
import cl.uchile.pleiad.textRam.TOcurrence
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TReturnInteraction
import cl.uchile.pleiad.textRam.TStructuralView
import cl.uchile.pleiad.textRam.TTemporaryProperty
import cl.uchile.pleiad.textRam.TTypedElement
import cl.uchile.pleiad.textRam.TValueSpecification
import cl.uchile.pleiad.textRam.TextRamPackage
import java.util.List
import java.util.Set
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2

final class TextRamEcoreUtil {
	
	//private new() {}
	
	/**
	 * Returns the next container object in the hierarchy of the given object that {@link EClassifier#isInstance is an instance} of the type
	 *   
     * @param eObject the child object to check
     * @param type the type of container to find
     * @return the first container object of the given type, null if none found
	 */
	def static <T extends EObject> T getRootContainerOfType(EObject eObject, EClassifier type) {
		if (eObject != null) {
			var currentObject = eObject
			
			while ( currentObject.eContainer != null ) {
				currentObject = currentObject.eContainer
				
				if (type.isInstance(currentObject)) {
					val typed = currentObject as T
					return typed
				}
			}
		}
		
		return null	
	}
	
	/**
	 * Returns the immediately preceding sibling of the given object that {@link EClassifier#isInstance is an instance} of the type
	 * 
	 * @param eObject current object
	 * @param type of the immediately predecessor to find
	 * @return the first sibling object of the given type, null if none found
	 */
	def static <T extends EObject> T getPrev(EObject eObject, EClassifier type) {
		if (eObject != null) {
			val parent = eObject.eContainer
			
			if (parent != null) {
				var prev = EcoreUtil2.getPreviousSibling(eObject)
				 
				while ( prev != null ) {
					if ( type.isInstance( prev ) ) {
						return prev as T
					}
					
					prev = EcoreUtil2.getPreviousSibling(prev)
				}
			}
		}
			
		return null
	}
	
	def getClassifierFrom( StructuralView owner, String name ) {
		if ( owner != null ) {
			return owner.classes.findFirst[ c | c.name == name ]
		}
		
		return null
	}
	
	def getTClassFrom( TStructuralView owner, String name ) {
		if ( owner != null ) {
			return owner.classes.filter(TClass).findFirst[ c | c.name == name ]
		}
		
		return null
	}
	
	/**
	 * Returns all TextRAM's operations that match the given name from a {@link TClass class} and also its super type's operations.
	 * 
	 * @param clazz owner of the operations
	 * @param name of the operation
	 * @return a list of all class's operations that match the given name 
	 */
	def static List<TOperation> findTextRamOperations(TClass clazz, String name) {
		val List<TOperation> result = newArrayList
		
		result.addAll(clazz.members.filter(TOperation).filter( o | o.name == name ).toList)
		
		if (result.size == 0) {
			clazz.superTypes.filter(TClass).forEach[ s |
				result.addAll( s.findTextRamOperations(name)  )
			]
		}
		
		result
	}
	
	/**
	 * Return a {@link TOperation operation} from {@link TClass clazz}
	 * 
	 * @param clazz owner of the operation
	 * @param operation Ram's {@Operation operation} that contains the signature of the {@link TOperation textram's operation} to find 
	 * return if founded it returns a {@link TOperation textram's operation}  
	 */
	def static TOperation findTextRamOperation( TClass clazz, Operation operation ) {

		// first it looks for the operations that match its name
		val operations = clazz.findTextRamOperations( operation.name )
		
		// match the signature
		for ( TOperation o : operations ) {
			if ( operationThatMatchSignature( o, operation ) == true ) {
				return o
			}	
		
		}
		
		return null
	}
	
	private static def operationThatMatchSignature( TOperation current, Operation toCompare ) {
		// check operation's name
		if ( current.name != toCompare.name ) {
			return false
		}
		
		// check number of arguments
		if ( current.parameters.size != toCompare.parameters.size ) {
			return false
		}
		
		// check each parameter's type
		if ( current.parameters.size > 0 ) {
			for ( Integer i: 0..toCompare.parameters.size -1 ) {
				if ( toCompare.parameters.get(i).type.name != current.parameters.get(i).type.name ) {
					return false
				}
			}
		}
		
		return true
	}
	
	/**
	 * Returns all TextRAM's operations for the given {@link TClass class} and also its super types
	 * 
	 * @param clazz owner of the operations
	 * @return a list of all class's operations
	 */
	def static List<TOperation> findTextRamOperations(TClass clazz) {
		val List<TOperation> result = newArrayList
		
		result.addAll(clazz.members.filter(TOperation).toList)
		
		if (result.size == 0) {
			clazz.superTypes.filter(TClass).forEach[ superType |
				result.addAll( superType.findTextRamOperations  )
			]
		}
		
		result
	}
	
	def static List<Operation> findOperations(Class clazz, String name) {
		val List<Operation> result = newArrayList
		
		result.addAll(clazz.operations.filter( o | o.name == name ).toList)
		
		if (result.size == 0) {
			clazz.superTypes.filter(Class).forEach[ s |
				result.addAll( s.findOperations(name)  )
			]
		}
		
		result
	}
	
	def static List<TOperation> findAspectOperations(Aspect aspect, String operationName) {
		val List<TOperation> result = newArrayList
		
		result.addAll(aspect.structuralView.classes.filter(TClass).map[members].flatten.filter(TOperation).filter( o | o.name == operationName ).toList)
		
		result
	}
	
	/**
	 * Gets the class from a {@link TInteractionMessage interaction}. 
	 * Evaluates the rightlifeline's referenceType attribute and resolves how to get the corresponded class.
	 * 
	 * @param textRamInteraction current message interaction
	 * @return {@link TClass class} owner f the message interaction
	 */
	def static getTextRamClass(TInteractionMessage textRamInteraction) {
		var TClass result = null
		
		if (textRamInteraction.rightLifeline.referenceType == TLifelineReferenceType.REFERENCE) {
			result = textRamInteraction.rightLifeline.represents as TClass
		}
		
		if (textRamInteraction.rightLifeline.referenceType == TLifelineReferenceType.ASSOCIATION) {
			result = (textRamInteraction.rightLifeline.represents as TAssociation).toEnd.classReference as TClass
		}
		
		if (textRamInteraction.rightLifeline.referenceType == TLifelineReferenceType.ATTRIBUTE) {
			throw new Exception("Attributes are not supported as TLifeline references")
		}
		
		result
	}
	
	def getTAssociation(Aspect aspect, String name) {
		val tStructuralView = aspect.structuralView as TStructuralView
		
		return tStructuralView.TAssociations.findFirst[ a | a.name == name ]
	}
	
	def dispatch getTypeReference(Aspect aspect, PrimitiveType type) {
		aspect.structuralView.types.filter(PrimitiveType).findFirst[ t | t.name == type.name ]
	}
	
	def dispatch getTypeReference(Aspect aspect, Type type) {
		aspect.structuralView.classes.filter(Class).findFirst( c | c.name == type.name) 
	}
	
	def dispatch getTypeReference(Aspect aspect, RVoid type) { 
		aspect.structuralView.types.filter(RVoid).findFirst[ t | t.name == type.name ]
	}
	
	def dispatch getTypeReference(Aspect aspect, RSet type) {
		aspect.structuralView.types.filter(RSet).findFirst[ t | t.name == type.name ]
	}
	
	def dispatch getTypeReference(Aspect aspect, RAny type) {
		aspect.structuralView.types.filter(RAny).findFirst[ t | t.name == type.name ]
	}
	
	def findClass(TAspect aspect, String name) {
		aspect.structuralView.classes.filter(TClass).findFirst[ c | c.name == name ]
	}
	
	/**
	 * Gets a hierarchy of the external aspect's classes of type EXTENDS defined in the header of the given {@link TAspect aspect}
	 * 
	 * @param aspect owner of the external aspects
	 * @return a flatten list of the hierarchy of the extended classes for the given aspects   
	 */
	def List<TClass> getExtendedClasses(TAspect aspect) {
		val List<TClass> result = newArrayList
		
		addExtendedClasses(aspect, result)
		
		result
	}
	
	private def void addExtendedClasses(TAspect aspect, List<TClass> classes) {
		classes.addAll( aspect.structuralView.classes.filter(TClass) )
        
		aspect.getExtendedExternalAspects.forEach[ a | 
			addExtendedClasses(a, classes)
		]
	}
	
	def getExternalAspectsFromHeader(TAspect aspect) {
		val validExternalAspects = aspect.headerInstantiations.map[externalAspects].flatten
		validExternalAspects						
	}
	
	def getTypesFor(TStructuralView structuralView) {
		structuralView.types.appendPrimitiveTypes
		
		structuralView.types.addAll(addRSetPrimitiveTypes( structuralView.types ))
				
		return structuralView.allTypes
	}
	
	def getPrimitiveTypes(StructuralView structuralView) {
		structuralView.getTypes().appendPrimitiveTypes

		structuralView.getTypes().filter(typeof(PrimitiveType)).toList
	}
	
	def getClasses(Instantiation instantiation) {
		instantiation.externalAspect.structuralView.classes.toList
	}
	
	def Set<TClass> getInstantiationsClasses(TAspect aspect) {
		val Set<TClass> res = newHashSet
		
		  res.addAll( collectClassesFromInstantiations( aspect, res ) )
		
		return res
	}
	
	private def Set<TClass> collectClassesFromInstantiations( TAspect aspect, Set<TClass> classes ) {
		aspect.structuralView.classes.filter(TClass).forEach[ c |
			if ( classes.exists[ q | q.name == c.name ] == false ) {
				classes.add(c)
			}
		]
		
		aspect.headerInstantiations.map[externalAspects].flatten.forEach[ i |
			classes.addAll( collectClassesFromInstantiations( i, classes ) )
		]
		
		return classes

	}
	
	def getMembersFrom(TClassifierMapping classifierMapping) {
		// instantiation type from the container of classifierMapping
//		val instantiationType = (classifierMapping.eContainer as Instantiation).type
		
		// class from external aspect
		val fromElement = classifierMapping.fromElement as TClass
		
		// customization is allowed to use only public elements
//		if (instantiationType == InstantiationType.DEPENDS) {
//			return fromElement.members.filter(TOperation).filter( t | t.visibility == Visibility.PUBLIC || t.visibility == Visibility.PACKAGE ).filter(TClassMember).toList
//		}
		
		// extensions is allowed to use public and private elements
		return fromElement.members.filter(TOperation).toList 
	}
	
	def getPublicOperations(Aspect aspect) {
		val operations = aspect.structuralView.classes.filter(TClass).map[members].flatten.filter(TOperation).filter(oper | oper.visibility == Visibility.PUBLIC).toList
		operations
	}
	
	def getOperations(Aspect aspect) {
		val operations = aspect.structuralView.classes.filter(TClass).map[members].flatten.filter(TOperation)
		operations
	}
	
	def getTTypedElements(TAspect aspect) {
		//AssociationEnd
		//Attribute
		//Parameter
		//Reference/Class
		
		val List<TTypedElement> result = newArrayList
		
		addExtendendTTypedElements(aspect, result)
					
		result
	}
	
	def getExtendedOperationsFromRightLifeline(TInteractionMessage interaction) {
		if ( interaction.message instanceof TMessage == false ) {
			throw new Exception("Concrete type of TAbstractMessage must be TMessage")
		}
		
		val owner = TextRamEcoreUtil.getTextRamClass(interaction)

		val operations = TextRamEcoreUtil.findTextRamOperations( owner )
		
		return operations
	}
	
	/**
	 * Gets the hierarchy of the external aspect's operations of type EXTENDS defined in the header of the given {@link TAspect aspect}
	 * 
	 * @param aspect owner of the external aspects
	 * @return a flatten list of the hierarchy of the extended classes for the given aspects.
	 */
	 def getExtendedOperations(TAspect aspect) {
		val List<TOperation> result = newArrayList
		
		addExtendedOperations(aspect, result)
		
		result
	}
	
	private def void addExtendendTTypedElements(TAspect aspect, List<TTypedElement> elements) {
		elements.addAll( aspect.getAllAssociations )
		elements.addAll( aspect.getAllAttributes ) //TODO: nunca me encontré con un attribute
		//result.addAll( aspect.getAllParameters ) //TODO:parameters
		elements.addAll( aspect.getAllClasses )
		
		aspect.getExtendedExternalAspects.forEach[ a | 
			addExtendendTTypedElements(a , elements)	
		]		
	}
	
	
	
	private def void addExtendedOperations(TAspect aspect, List<TOperation> operations) {
		operations.addAll(aspect.structuralView.classes.filter(TClass).map[members].flatten.filter(TOperation))
		
		aspect.getExtendedExternalAspects.forEach[ a |
			addExtendedOperations(a, operations)
		]
	}
	
	/**
	 * gets all external aspects defined in the header instantiation of the given {@link TAspect aspect} model.
	 * 
	 * @param aspect owner of the external aspects
	 * @return external aspect from the given aspect
	 */	
	private def getExtendedExternalAspects(TAspect aspect) {
		aspect.headerInstantiations.filter( i | i.type == InstantiationType.EXTENDS).map[externalAspects].flatten.filter(TAspect)
	}
	
	private def getAllClasses(Aspect aspect) {
		return aspect.structuralView.classes.filter(TClass).filter(TTypedElement).toList
	}
	
	private def getAllAttributes(Aspect aspect) {
		val tStructuralView = (aspect.structuralView as TStructuralView)
		return tStructuralView.classes.filter(TClass).map[members].flatten.filter(TAttribute)
	}
	
	private def getAllAssociations(Aspect aspect) {
		val tStructuralView = (aspect.structuralView as TStructuralView)
		return tStructuralView.TAssociations.toList 
	}
	
	private static def getAllTypes(TStructuralView structuralView) {
		val EList<Type>  typeList = new BasicEList<Type> 
		for ( clazz : structuralView.classes ) {
			typeList.add(clazz)
			
			if ( structuralView.types.filter(RSet).exists[t | t.type.name == clazz.name] == false ) {
				val rSet = RamFactory.eINSTANCE.createRSet => [
					type = clazz
					instanceClassName = '''Set<« clazz.name »>'''
				]
				
				structuralView.types.add(rSet)
				typeList.add(rSet)
			}
			
			// it also add a RSet
//			val rSet = RamFactory.eINSTANCE.createRSet()
//			rSet.setType(clazz)
//			rSet.setInstanceClassName(rSet.name)
//			structuralView.types.add(rSet as Type)
		}
		
		for ( type : structuralView.types ) {
			typeList.add(type)
			
//			// it also add a RSet
//			val rSet = RamFactory.eINSTANCE.createRSet()
//			rSet.setType(type as ObjectType)
//			typeList.add(rSet)
		}
		
		typeList
	}
	
	private static def appendPrimitiveTypes(EList<Type> typesToReturn) {
		if (typesToReturn.length == 0) {
			typesToReturn.add(RamFactory.eINSTANCE.createRVoid)
			typesToReturn.add(RamFactory.eINSTANCE.createRBoolean)
			typesToReturn.add(RamFactory.eINSTANCE.createRChar)
			typesToReturn.add(RamFactory.eINSTANCE.createRInt)
			typesToReturn.add(RamFactory.eINSTANCE.createRString)
			typesToReturn.add(RamFactory.eINSTANCE.createRAny)
			typesToReturn.add(RamFactory.eINSTANCE.createRDouble)
			typesToReturn.add(RamFactory.eINSTANCE.createRFloat)
		}
	}
	
	/**
	 * This method add a RSet type for each primitive type in the list.
	 * 
	 * @types list of types in the structural view
	 * @returns list of RSet type for each primitive type in the structural view
	 */
	private static def addRSetPrimitiveTypes(EList<Type> types) {
		val result = new BasicEList<Type>
		
		if (types.filter(RSet).size() == 0) {
		
			types.filter(PrimitiveType).forEach[ t |
				val rSet = RamFactory.eINSTANCE.createRSet => [
					type = t
					instanceClassName = '''Set<« t.name »>''' //TODO: implementationName is mandatory for eclipse's workbench. It works with a dummy value.
				]
				
				result.add(rSet)
			]
			
		}
		else 
		{
			result.addAll( types.filter(RSet) )
		}
		
		result
	}
	
	def getParameters(Aspect aspect) {
		val tStructuralView = aspect.structuralView as TStructuralView
		
		tStructuralView.classes.filter(TClass)
							   .map[members]
							   .flatten
							   .filter(TOperation)
							   .map[parameters]
							   .flatten
							   .toList
	}
	
	/**
	 * Gets all assignable features from TInteractionMessage, according the following rules:
	 * 1. Only local properties defined in the left lifeline
	 * 2. All aspect's associations
	 * 3. Right lifeline
	 * 
	 * @param textRamInteractionMessage current interaction
	 */
	def getAssignableFeatures(TInteractionMessage textRamInteractionMessage) {
		val List<TMessageAssignableFeature> result = newArrayList()
		
		result.addAll ( textRamInteractionMessage.leftLifeline.localProperties )
		result.addAll ( textRamInteractionMessage.getAspect.getAllAssociations )
		result.add ( textRamInteractionMessage.rightLifeline )
		
		result
	}
	
	private def allLifelines(Aspect aspect) {
		val view = aspect.messageViews.get(0) as TAbstractMessageView
		
		return view.lifelines 
	}
	
	private def getAspect(TInteractionMessage textRamInteractionMessage) {
		val Aspect result = TextRamEcoreUtil.getRootContainerOfType(textRamInteractionMessage, RamPackage.Literals.ASPECT)
		result
	}
	
	def getGetTAttributesFromLifelines(Aspect aspect) {
		val tAbstractMessageView = aspect.messageViews.head as TAbstractMessageView
		
		if (tAbstractMessageView != null) {
			return tAbstractMessageView.lifelines.map[localProperties].flatten
		}
		
		return null
	}
	
	def getAspectMessageViews(TAbstractMessageView abstractMessageView) {
		val List<TAspectMessageView> result = newArrayList
		
		abstractMessageView.messages.filter(TAspectMessageView).forEach( m | result.add(m))
		
		result
	}
	
	def getOperationsForAspectMessageView(TAbstractMessages messageView) {
		if ( messageView.class_ != null ) {
			return messageView.class_.members.filter(TOperation)
		}
		else {
			val Aspect aspect = TextRamEcoreUtil.getRootContainerOfType(messageView, RamPackage.Literals.ASPECT)
			return aspect.getPublicOperations
		}
	}
	
	def getArgumentsForAspectMessageViewOperation(TAbstractMessages messageView) {
		val Aspect aspect = TextRamEcoreUtil.getRootContainerOfType(messageView, RamPackage.Literals.ASPECT)
		
		val clazz = messageView.class_
		
		var Iterable<TOperation> operations
		
		if (clazz != null) {
			operations = (aspect.structuralView as TStructuralView).classes.filter(TClass).filter( c | c.name == messageView.class_.name ).map[members].flatten.filter(TOperation).filter( o | o.name == messageView.specifies.name )
		}
		else {
			operations = (aspect.structuralView as TStructuralView).classes.filter(TClass).map[members].flatten.filter(TOperation).filter( o | o.name == messageView.specifies.name )
		}
		
		val result = operations.map[parameters].flatten
		
		result
//		// check operation's signature
//		operations.forEach[ o |
//			// checks for arguments length
//			if (o.parameters.length == aspectMessageView.arguments.length) {
//				// checks each argument type
//				for ( Integer i: 0..o.parameters.size - 1) {
//					if ( o.parameters.get(i).type.name.equals( aspectMessageView.arguments.get(i).type.name ) == false ) {
//						
//					}
//				}
//				
//			}
//			
//		]
//		
	}
	
	def getTValueSpecificationUsedByMessageView(TAbstractMessages messageView) {
		val List<TValueSpecification> result = newArrayList
		
		messageView.interactionMessages.forEach[ i | 
			val textRamValueSpecification = getTValueSpecificationFromInteraction(i)
			result.addAll(textRamValueSpecification)
		]
				
		result
	}
	
	private def dispatch List<TValueSpecification> getTValueSpecificationFromInteraction(TInteractionMessage interaction) {
		val List<TValueSpecification> result = newArrayList
		
		val message = interaction.message
		
		// adds assignTo
		if (message != null && message.assignTo != null) {
			//TODO: why TAssociation is not a TValueSpecification?
			//if ( message.assignTo instanceof TAssociation == false ) {
				result.add( message.assignTo as TValueSpecification )
			//}
		}
		
		// adds operation's parameters
		message.signature.parameters.forEach[ p | 
			result.add(p)
		]
		
		result
	}
	
	private def dispatch List<TValueSpecification> getTValueSpecificationFromInteraction(TCombinedFragment interaction) { 
		val List<TValueSpecification> result = newArrayList
		
		interaction.containers.forEach[ i |
			val textRamValueSpecification = getTValueSpecificationFromInteraction(i)
			result.addAll(textRamValueSpecification)		
		]
		
		interaction.elseContainers.forEach[ i |
			val textRamValueSpecification = getTValueSpecificationFromInteraction(i)
			result.addAll(textRamValueSpecification)		
		]
		
		result
	}
	
	private def dispatch List<TValueSpecification> getTValueSpecificationFromInteraction(TReturnInteraction interaction) {
		// do nothing
		val List<TValueSpecification> result = newArrayList
		result
	}
	
	private def dispatch List<TValueSpecification> getTValueSpecificationFromInteraction(TOcurrence interaction) {
		// do nothing
		val List<TValueSpecification> result = newArrayList
		result
	}
	
	def getTValueSpecificationList(TInteractionMessage interaction) {
		val List<TValueSpecification> result = newArrayList
		
		val Aspect aspect = TextRamEcoreUtil.getRootContainerOfType(interaction, RamPackage.Literals.ASPECT)
		val operationName = (interaction.message as TMessage).signature.name
		
		// add parameters
		val clazz = interaction.rightLifeline.represents.getClassOwner(aspect)
		clazz.members.filter(TOperation).filter(o | o.name == operationName ).map[parameters].flatten.forEach[ p |
			result.add(p)
		]
		
		// add reference lifelines
		val TAbstractMessageView messageView = TextRamEcoreUtil.getRootContainerOfType(interaction, TextRamPackage.Literals.TABSTRACT_MESSAGE_VIEW)
		result.addAll(messageView.lifelines.filter(l | l.referenceType == TLifelineReferenceType.REFERENCE).toList) 
				
		// add temporary properties
		val List<TTemporaryProperty> temporaryPropertyList = newArrayList
		
		interaction.rightLifeline.localProperties.forEach[ p | 
			temporaryPropertyList.add(p)
		]
		
		interaction.leftLifeline.localProperties.forEach[ p | 
			temporaryPropertyList.add(p)
		]
		
		result.addAll(temporaryPropertyList)
		
		result
	}
	
	def getTLifelines ( TAspect aspect ) {
		val tAbstractMessageView = (aspect.messageViews.get(0) as TAbstractMessageView)
		
		return tAbstractMessageView.lifelines
	} 	
	
	private def dispatch getClassOwner(TAssociation owner, Aspect aspect) {
		val result = owner.toEnd.classReference as TClass
		result
	}
	
	private def dispatch getClassOwner(TAttribute owner, Aspect aspect) {
		val result = ( owner ).eContainer as TClass
		result
	}
	
	private def dispatch getClassOwner(TClass owner, Aspect aspect) {
		val result = owner
		result
	}
	
	
	
//	def static getAllOperationsForClass(TClass clazz, String operationName) {
//		val List<TOperation> result = newArrayList
//
//		if (clazz != null) {
//			result.addAll( findOperations(clazz,  operationName) )
//		}
//		else {
//			val Aspect aspect = TextRamEcoreUtil.getRootContainerOfType( clazz, RamPackage.Literals.ASPECT ) 
//			
//			
//			if (operations.length > 1) {
//				error('ambiguity in operation definition', TextRamPackage.Literals.TABSTRACT_MESSAGES__SPECIFIES)
//			}
//		}
//		
//		result
//	}
	
}