package ca.mcgill.sel.commons.emf.util;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Helper class with convenient static methods for working with EMF objects.
 * 
 * @author mschoettle
 */
public final class EMFModelUtil {
    /**
     * Creates a new EMF Model Util instance. 
     */
    private EMFModelUtil() {
        // Suppress and hide default constructor. 
    }
    
    /**
     * Returns the next container object in the hierarchy of the given object that {@link EClassifier#isInstance is an
     * instance} of the type.
     * 
     * @param eObject the child object to check
     * @param type the type of container to find
     * @param <T> the expected return type
     * 
     * @return the first container object of the given type, null if none found
     */
    public static <T extends EObject> T getRootContainerOfType(EObject eObject, EClassifier type) {
        if (eObject != null) {
            EObject currentObject = eObject;
            
            while (currentObject.eContainer() != null) {
                currentObject = currentObject.eContainer();
                
                if (type.isInstance(currentObject)) {
                    @SuppressWarnings("unchecked") T typed = (T) currentObject;
                    return typed;
                }
            }
        }
        
        return null;
    }
    
    /**
     * Retrieves the map type for the given container from the given {@link EMap}.
     * 
     * @param map the map
     * @param container the container the map type is searched for
     * @param <T> the expected return type
     *
     * @return the {@link ContainerMapImpl} of the given container
     */
    public static <T extends EObject> T getMap(EMap<?, ?> map, EObject container) {
        for (Entry<?, ?> entry : map.entrySet()) {
            if (entry.getKey() == container) {
                if (entry instanceof EObject) {
                    @SuppressWarnings("unchecked") T mapType = (T) entry; 
                    return mapType;
                }
            }
        }
        
        return null;
    }
    
}
