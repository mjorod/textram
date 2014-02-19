package cl.uchile.pleiad.util

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClassifier

final class TextRamEcoreUtil {
	
	private new() {}
	
	/**
	 * Returns the next container object in the hierarchy of the given object that {@link EClassifier#isInstance is an instance} of the typepe
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
}