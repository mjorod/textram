package cl.uchile.pleiad.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ca.mcgill.cs.sel.ram.Aspect;

public class RAMPersistenceAdapter {

	private static final String RAM_EXTENSION = "ram";
    private static final String RAM_FILE_EXTENSION = "." + RAM_EXTENSION;
	
    public static String serializeRAMAspect(Aspect aspect, String path) {
    	String result = "";
    	
    	ResourceSet resourceSet = new ResourceSetImpl();
    	
        if ((path == null) || path.isEmpty()) {
        	throw new IllegalArgumentException("Path cannot be null or empty");
        }

        // Create a resource
        if (!path.endsWith(RAM_FILE_EXTENSION)) {
            path += RAM_FILE_EXTENSION;
        }
        
        Resource resource = resourceSet.createResource(URI.createFileURI(path));

        // Add the resources to the resource to be saved.
        resource.getContents().add(aspect);

        // Now save the content.
        try {
        	OutputStream outputStream = new ByteArrayOutputStream();
        	
            resource.save(outputStream, Collections.EMPTY_MAP);
            
            outputStream.flush();
            outputStream.close();
            
            result = outputStream.toString();
            
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error saving RAM.");
            
        }
        
        return result;
    }
    
    public static String getRAMExtension() 
    {
    	return RAM_EXTENSION;
    }
	
}
