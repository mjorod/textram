package cl.uchile.pleiad.converter

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.RamPackage
import ca.mcgill.sel.ram.controller.edit.AdapterFactoryUtil
import cl.uchile.pleiad.textRam.TAttribute
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TStructuralView
import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.command.Command
import org.eclipse.emf.common.command.CompoundCommand
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.edit.command.AddCommand
import org.eclipse.emf.edit.domain.EditingDomain
import java.util.Collections
import java.io.IOException
import java.util.List

class TextRAMModelConverter {
	
	def static String serializeRAMAspect(Aspect aspect) {
		var result = ""
		
		val tStructuralView = aspect.structuralView as TStructuralView
		
		var newAspect = RamFactory.eINSTANCE.createAspect()
		newAspect.setName(aspect.name)
		
		val editingDomain = AdapterFactoryUtil.getEditingDomain(newAspect)
		val compoundCommand = new CompoundCommand()
		
		var newStructuralView = RamFactory.eINSTANCE.createStructuralView()
		
		compoundCommand.append(AddCommand.create(editingDomain, newAspect, RamPackage.Literals.STRUCTURAL_VIEW, newStructuralView))
    	
    	newStructuralView.types.addAll(EcoreUtil.copyAll(tStructuralView.types))
		
		val List<Class> cacheForNewClasses = newArrayList
		
		for ( classifier : tStructuralView.classes ) {
			val tClass = classifier as TClass
			
			var newClass = RamFactory.eINSTANCE.createClass()
			newClass.setName(tClass.name)
			newClass.setAbstract(tClass.abstract)
			newClass.setPartial(tClass.partial)
			
			// add class
			compoundCommand.append(AddCommand.create(editingDomain, newStructuralView, RamPackage.Literals.CLASSIFIER, newClass))
			cacheForNewClasses.add(newClass)
			
			// members
			for (classMember : tClass.members) {
				if ( classMember instanceof TAttribute ) {
					var tAttribute = classMember as TAttribute
					
					// creates attribute
					var newAttribute = RamFactory.eINSTANCE.createAttribute()
					newAttribute.setName(tAttribute.name)
					newAttribute.setStatic(tAttribute.static)
					newAttribute.setType(tAttribute.type)
					
					compoundCommand.append(AddCommand.create(editingDomain, newClass, RamPackage.Literals.CLASS__ATTRIBUTES, newAttribute))
				}
			}
		}
		
		// supertypes
		tStructuralView.classes.filter(Class).filter(c | c.superTypes.empty == false).forEach[ tClass |
			compoundCommand.append(AddCommand.create(editingDomain, 
													 cacheForNewClasses.filter( c | c.name == tClass.name).head, //owner 
													 RamPackage.Literals.CLASS__SUPER_TYPES, // feature
													 cacheForNewClasses.filter( c | c.name == tClass.superTypes.head.name ).head ) // value
			)]
						
		// associations
		for ( t: tStructuralView.getTAssociations) {
			var Class from = cacheForNewClasses.filter( c | c.name == t.fromEnd.classReference.name ).head as Class
			var Class to = cacheForNewClasses.filter( c | c.name == t.toEnd.classReference.name ).head as Class
			
			val classNameFrom = t.fromEnd.classReference.name
			val classNameTo = t.toEnd.classReference.name
			
			// create association
			var association = RamFactory.eINSTANCE.createAssociation()
			association.setName(classNameFrom + "_" + classNameTo);
			
			// create from association end
         	var fromEnd = RamFactory.eINSTANCE.createAssociationEnd();
         	fromEnd.setAssoc(association);
         	fromEnd.setLowerBound(1);
         	fromEnd.setName(to.name.toLowerCaseFirst)
         
         	compoundCommand.append(AddCommand.create(editingDomain, from, RamPackage.Literals.CLASS__ASSOCIATION_ENDS, fromEnd))
         
             // create to association end
             var toEnd = RamFactory.eINSTANCE.createAssociationEnd();
             toEnd.setAssoc(association);
             toEnd.setLowerBound(1);
             toEnd.setName(from.name.toLowerCaseFirst)
         
         	compoundCommand.append(AddCommand.create(editingDomain, to, RamPackage.Literals.CLASS__ASSOCIATION_ENDS, toEnd));
         
             // create command for association
	         compoundCommand.append(AddCommand.create(editingDomain, newStructuralView, RamPackage.Literals.STRUCTURAL_VIEW__ASSOCIATIONS, association));
		}
		
		doExecute(editingDomain, compoundCommand);
		
		val resourceSet = new ResourceSetImpl()
		val resource = resourceSet.createResource(URI.createFileURI(""))
		
		// Add the resources to the resource to be saved.
        resource.getContents().add(newAspect)
        
        // Now save the content.
        try {
        	val outputStream = new ByteArrayOutputStream()
        	
            resource.save(outputStream, Collections.EMPTY_MAP);
            
            outputStream.flush();
            outputStream.close();
            
            result = outputStream.toString();
            
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error saving RAM.");
            
        }
		
		result
	}
	
	def static  doExecute(EditingDomain editingDomain, Command command) {        
        if (!command.canExecute()) {
            throw new RuntimeException("Command " + command + " not executable.");
        }
        
        editingDomain.getCommandStack().execute(command);
    }	
	 
	def static String toLowerCaseFirst(String text) {
        var charArray = text.toCharArray();
        charArray.set(0, Character.toLowerCase(charArray.get(0)));
        String.valueOf(charArray);
    }
		
}