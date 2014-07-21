package cl.uchile.pleiad.util

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Operation
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.RSet
import ca.mcgill.cs.sel.ram.RVoid
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import cl.uchile.pleiad.textRam.TAspect
import cl.uchile.pleiad.textRam.TAssociation
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TInteractionMessage
import cl.uchile.pleiad.textRam.TLifelineReferenceType
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TStructuralView
import java.util.List
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import ca.mcgill.cs.sel.ram.RAny

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