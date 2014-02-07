package cl.uchile.pleiad.util

import ca.mcgill.cs.sel.ram.Aspect
import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import java.util.Collections
import java.io.IOException

class TextRAMPersistence {
<<<<<<< HEAD
        private static val TextRAMPersistence instance = new TextRAMPersistence 
        
        private new() {}
        
        def static getInstance() {
                instance
        }
        
        def serializeModel(Aspect aspect, String path) {
                var result = ""
                
                val resourceSet = new ResourceSetImpl()
                val resource = resourceSet.createResource(URI.createFileURI(path))
                
                // Add the resources to the resource to be saved.
=======
	private static val TextRAMPersistence instance = new TextRAMPersistence 
	
	private new() {}
	
	def static getInstance() {
		instance
	}
	
	def serializeModel(Aspect aspect, String path) {
		var result = ""
		
		val resourceSet = new ResourceSetImpl()
		val resource = resourceSet.createResource(URI.createFileURI(path))
		
		// Add the resources to the resource to be saved.
>>>>>>> a014222359cdcf28781371da9ca4f2dfb72867b4
        resource.getContents().add(aspect)
        
        // Now save the content.
        try {
<<<<<<< HEAD
                val outputStream = new ByteArrayOutputStream()
                
=======
        	val outputStream = new ByteArrayOutputStream()
        	
>>>>>>> a014222359cdcf28781371da9ca4f2dfb72867b4
            resource.save(outputStream, Collections.EMPTY_MAP);
            
            outputStream.flush();
            outputStream.close();
            
            result = outputStream.toString();
            
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error saving RAM.");
            result = e.message
        }
<<<<<<< HEAD
                
                result
        }
=======
		
		result
	}
>>>>>>> a014222359cdcf28781371da9ca4f2dfb72867b4
}