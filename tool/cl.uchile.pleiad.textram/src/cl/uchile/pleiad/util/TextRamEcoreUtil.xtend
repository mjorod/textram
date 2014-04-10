package cl.uchile.pleiad.util

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClassifier
import java.util.List
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TClass
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.Operation
import cl.uchile.pleiad.textRam.TAssociation

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
	
	def static List<TOperation> findOperations(TClass clazz, String name) {
		val List<TOperation> result = newArrayList
		
		result.addAll(clazz.members.filter(TOperation).filter( o | o.name == name ).toList)
		
		if (result.size == 0) {
			clazz.superTypes.filter(TClass).forEach[ s |
				result.addAll( s.findOperations(name)  )
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
	}