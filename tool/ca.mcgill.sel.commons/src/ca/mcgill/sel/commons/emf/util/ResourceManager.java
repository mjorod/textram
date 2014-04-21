package ca.mcgill.sel.commons.emf.util;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ocl.examples.pivot.delegate.OCLDelegateDomain;
import org.eclipse.ocl.examples.pivot.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.examples.pivot.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.examples.pivot.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.examples.xtext.oclinecore.OCLinEcoreStandaloneSetup;

/**
 * ResourceManager is a helper class to load and save any model based on an Ecore metamodel.
 * {@link #initialize()} should be called first, which will perform all the necessary initialization steps,
 * but it will be lazy initialized if it wasn't explicitly called (when loading a model).
 * All loaded resources will be cached in order to only load them once. 
 * Therefore, in order to reload a model, the resource has to be unloaded first ({@link #unloadResource(Resource)}.
 * <br /><br />
 * <b>Note:</b> To work with your own resource factory and file extensions you have to call 
 * {@link #registerExtensionFactory(String, Factory)} first to register your own resource factory.
 * Furthermore, you will need to register the package of your model, for example: 
 * <code>EcorePackage.INSTANCE.eClass();</code>.
 * 
 * @author mschoettle
 */
public final class ResourceManager {
    
    private static ResourceSet resourceSet;
    
    /**
     * Creates a new resource manager.
     */
    private ResourceManager() {
        // Suppress.
    }

    /**
     * Loads the root {@link EObject} from the given file.
     * 
     * @param file the file the object should be loaded from
     * @return the loaded {@link EObject}
     * @see #loadModel(File)
     */
    public static EObject loadModel(String file) {        
        return loadModel(new File(file));
    }
    
    /**
     * Loads the root {@link EObject} from the given file.
     * Makes sure that the given file exists. Throws an {@link IllegalArgumentException}
     * if it doesn't otherwise. 
     * A {@link RuntimeException} might be thrown 
     * in case the resource factory for the file extension was not registered beforehand.
     * See {@link #registerExtensionFactory(String, Factory)}.
     * A {@link org.eclipse.ecore.xmi.PackageNotFoundException} is thrown when the corresponding
     * package of the metamodel wasn't registered. To register, call <code>eClass()</code> on the package instance
     * (e.g., <code>EcorePackage.INSTANCE.eClass();</code>).
     * 
     * @param file the file the object should be loaded from
     * @return the loaded {@link EObject}
     */
    public static EObject loadModel(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException("Given file does not exist: ".concat(file.getAbsolutePath()));
        }
        
        // Initialize resource set on demand.
        if (resourceSet == null) {
            initialize();
        }

        // Get the resource.
        Resource resource = resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
        // Get the first model element, which is the root element.
        return resource.getContents().get(0);
    }
    
    /**
     * Saves the given aspect to the given path.
     * 
     * @param object the {@link EObject} to save as a file
     * @param file the full path of the file where the object should be saved to
     * @return true, if successfully saved, false otherwise
     */
    public static boolean saveModel(EObject object, String file) {
        if (file == null || file.isEmpty()) {
            return false;
        }
    
        // Create a resource        
        Resource resource = resourceSet.createResource(URI.createFileURI(file));
    
        // Add the resources to the resource to be saved.
        resource.getContents().add(object);
    
        // Now save the content.
        try {
            resource.save(Collections.EMPTY_MAP);
        } 
        catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error saving file. See stack trace.");
            return false;
        }
        
        return true;
    }

    /**
     * Removes a loaded resource from the loaded resources in order to be able to load it from the file again.
     * 
     * @param resource the resource to be unloaded
     */
    public static void unloadResource(Resource resource) {        
        if (resourceSet != null && resource != null) {
            // Remove the resource from resource map (cache).
            ResourceSetImpl resourceSetImpl = (ResourceSetImpl) resourceSet;
            resourceSetImpl.getURIResourceMap().remove(resource.getURI());
            resourceSet.getResources().remove(resource);            
        }
    }
    
    /**
     * Registers a given resource factory for a given file extension. The factory is used
     * to handle files with this extension from a metamodel that the factory is intended for.
     * 
     * @param extension the file extension for the resource factory
     * @param factory the resource factory to use to handle files of the file extension
     */
    public static void registerExtensionFactory(String extension, Factory factory) {
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> extensionToFactoryMap = reg.getExtensionToFactoryMap();
        
        extensionToFactoryMap.put(extension, factory);
    }
    
    /**
     * Initializes the required registries and resources.
     * This has to be called before any loading or saving is performed.
     */
    public static void initialize() {
        // Avoid initializing multiple times.
        if (resourceSet == null) {
            initializeOCL();
            
            ResourceSetImpl resourceSetImpl = new ResourceSetImpl();
            resourceSetImpl.setURIResourceMap(new HashMap<URI, Resource>());
            resourceSet = resourceSetImpl;            
        }
    }
    
    /**
     * Initializes OCL Pivot in case this is used by a metamodel.
     */
    private static void initializeOCL() {
        // Register Pivot globally (resourceSet == null).
        org.eclipse.ocl.examples.pivot.OCL.initialize(null);
        
        String oclDelegateURI = OCLDelegateDomain.OCL_DELEGATE_URI_PIVOT;
        EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
            new OCLInvocationDelegateFactory.Global());
        EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(oclDelegateURI,
            new OCLSettingDelegateFactory.Global());
        EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
            new OCLValidationDelegateFactory.Global());
        
        OCLinEcoreStandaloneSetup.doSetup();
        org.eclipse.ocl.examples.pivot.model.OCLstdlib.install();
    }

}
