package cl.uchile.pleiad.util

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Operation
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TParameter
import java.util.List
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EObject

final class TextRamEcoreUtil {
	
	private new() {}
	
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
	 * Returns all TextRAM's operations from a {@link TClass}
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