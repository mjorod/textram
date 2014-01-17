package cl.uchile.pleiad.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Association;
import ca.mcgill.cs.sel.ram.AssociationEnd;
import ca.mcgill.cs.sel.ram.Class;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.RamFactory;
import ca.mcgill.cs.sel.ram.StructuralView;
import cl.uchile.pleiad.textRam.TAssociation;
import cl.uchile.pleiad.textRam.TStructuralView;

public class RAMPersistenceAdapter {

	private static final String RAM_EXTENSION = "ram";
    private static final String RAM_FILE_EXTENSION = "." + RAM_EXTENSION;
	
    public static String serializeRAMAspect(Aspect aspect, String path) {
    	String result = "";
    	
    	TStructuralView tsv = (TStructuralView)aspect.getStructuralView();
    	
    	Aspect newAspect = RamFactory.eINSTANCE.createAspect();
    	newAspect.setName(aspect.getName());
    	
    	StructuralView structuralView = RamFactory.eINSTANCE.createStructuralView();
    	
    	newAspect.setStructuralView(structuralView);
    	
    	// types
        structuralView.getTypes().addAll(EcoreUtil.copyAll(tsv.getTypes()));
    	
        structuralView.getClasses().addAll(EcoreUtil.copyAll(tsv.getClasses()));
        
    	// associations
        for ( TAssociation t : tsv.getTAssociations() ) {
        	 Class from = null;
        	 Class to = null;
        	
        	 String classNameFrom = t.getFromEnd().getClassReference().getName();
        	 String classNameTo = t.getToEnd().getClassReference().getName();
        
        	 for ( Classifier c : newAspect.getStructuralView().getClasses() ) {
        		 if ( c.getName() == classNameFrom ) {
            		from = (Class) c;
            	 }
            	
	        	 if ( c.getName() == classNameTo ) {
	        		 to = (Class) c;
	             }
        	 }
        	 
        	// create association
             Association association = RamFactory.eINSTANCE.createAssociation();
             association.setName(from.getName() + "_" + to.getName());
             
             // create from association end
             AssociationEnd fromEnd = RamFactory.eINSTANCE.createAssociationEnd();
             fromEnd.setAssoc(association);
             fromEnd.setLowerBound(1);
             fromEnd.setName(toLowerCaseFirst(to.getName()));
             
             from.getAssociationEnds().add(fromEnd);
             
             // create to association end
             AssociationEnd toEnd = RamFactory.eINSTANCE.createAssociationEnd();
             toEnd.setAssoc(association);
             toEnd.setLowerBound(1);
             toEnd.setName(toLowerCaseFirst(from.getName()));
             
             to.getAssociationEnds().add(toEnd);
             
             // create command for association
             structuralView.getAssociations().add(association);
        }
        
        ResourceSet resourceSet = new ResourceSetImpl();
    	
        if ((path == null) || path.isEmpty()) {
        	throw new IllegalArgumentException("Path cannot be null or empty");
        }

        // Create a resource
        if (!path.endsWith(RAM_FILE_EXTENSION)) {
            path += RAM_FILE_EXTENSION;
        }
        
        Resource resource = resourceSet.createResource(URI.createFileURI(""));

        // Add the resources to the resource to be saved.
        resource.getContents().add(newAspect);

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
    
    private static void doExecute(EditingDomain editingDomain, Command command) {        
        if (!command.canExecute()) {
            throw new RuntimeException("Command " + command + " not executable.");
        }
        
        editingDomain.getCommandStack().execute(command);
    }
    
    public static String getRAMExtension() 
    {
    	return RAM_EXTENSION;
    }
    
    private static String toLowerCaseFirst(String text) {
        char[] charArray = text.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return String.valueOf(charArray);
    }
    
}