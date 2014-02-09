package cl.uchile.pleiad.crosscutting;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.ibm.icu.util.Output;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Association;
import ca.mcgill.cs.sel.ram.AssociationEnd;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.AttributeMapping;
import ca.mcgill.cs.sel.ram.Class;
import ca.mcgill.cs.sel.ram.ClassifierMapping;
import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.OperationMapping;
import ca.mcgill.cs.sel.ram.ParameterMapping;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.sel.ram.controller.edit.AdapterFactoryUtil;
import cl.uchile.pleiad.converter.ModelConverter;
import cl.uchile.pleiad.textRam.TClass;

public aspect ModelCommand {
    
	private EditingDomain ModelConverter.editingDomain;
	private CompoundCommand ModelConverter.compoundCommand;
		
    private void ModelConverter.doExecute(EditingDomain editingDomain, Command command) {        
    	if (!command.canExecute()) {
	    	throw new RuntimeException("Command " + command + " not executable.");
    	}
	  
    	editingDomain.getCommandStack().execute(command);
    }
	
    after(ModelConverter converter) returning : execution( Aspect ModelConverter.convertTextRAMModelToRAMModel(Aspect) )
	&& this(converter) {
    	converter.doExecute(converter.editingDomain, converter.compoundCommand);
    }
    
	after(ModelConverter converter) returning(Aspect ramAspect) : execution (Aspect copyAspect(Aspect)) 
	&& this(converter) {
		// manages a self-contained set of ram models and the commands that modify them    	
    	converter.editingDomain = AdapterFactoryUtil.getEditingDomain(ramAspect);
    	
		// create compound command
    	converter.compoundCommand = new CompoundCommand();
    }
            
    /**
     * Add the transformed structural view to the ram aspect
     * 
     * @param {@link StructuralView} transformed from textRam to Ram
     */
	after(ModelConverter converter, Aspect ramAspect) returning(StructuralView structuralView) : execution ( StructuralView createStructuralView(Aspect) ) 
	&& this(converter) && args(ramAspect) {
		// add structural view to ram aspect
		converter.compoundCommand.append(AddCommand.create(converter.editingDomain, ramAspect, RamPackage.Literals.STRUCTURAL_VIEW, structuralView));
	}
    
    /**
    * Add the transformed {@link Class}  to the {@link StructuralView}
    *   
    * @param clazz classifier to add
    * @param structuralView owner of the class 
    */
	after(StructuralView structuralView, ModelConverter converter) returning(Class ramClass): call( * ModelConverter.transformClass(..) )
	&& args(*, structuralView, ..) && target(converter) {
		converter.compoundCommand.append(AddCommand.create(converter.editingDomain, structuralView, RamPackage.Literals.CLASSIFIER, ramClass));		
	}
	
    /**
    * Add the converted {@link Operation} to the {@link Class} owner
    * 
    * @param operation to add
    * @param classOwner owner of the operation
    */
    after(ModelConverter converter, Class classOwner) returning(Operation operation): call( Operation copyOperation(..) ) 
    && this(converter) && args(*, classOwner, .. ) {
    	converter.compoundCommand.append(AddCommand.create(converter.editingDomain, classOwner, RamPackage.Literals.CLASSIFIER__OPERATIONS, operation));
    }
    
    /**
     * Add the converted {@link Attribute} to the {@link Class} owner
     * 
     * @param attribute to add
     * @param classOwner owner of the attribute
     */
    after(ModelConverter converter, Class classOwner) returning(Attribute attribute): call( Attribute copyAttribute(..) )
    && this(converter) && args(*, classOwner, .. ) {
    	converter.compoundCommand.append(AddCommand.create(converter.editingDomain, classOwner, RamPackage.Literals.CLASS__ATTRIBUTES, attribute));
    }
    
    /**
     * Add {@link Association} to a {@link StructuralView}
     * 
     * @param association to add
     * @param structuralView owner of the association
     */
    after(ModelConverter converter, StructuralView structuralView) returning(Association association): call( Association ModelConverter.transformAssociation(..) )
    && target(converter) && args(*, structuralView, ..) {
        
    	// create command for association
        converter.compoundCommand.append(AddCommand.create(converter.editingDomain, structuralView, RamPackage.Literals.STRUCTURAL_VIEW__ASSOCIATIONS, association));
    }
    
    /**
     * Add an {@link AssociationEnd} to the specified from {@link Class}
     *  
     * @param fromEnd association end to add
     * @param from class
     */
    after(ModelConverter converter, Class from) returning(AssociationEnd fromEnd): call ( AssociationEnd transformAssociationEndClassFrom(..) )
    && this(converter) && args(*, *, from, ..) {
    	
    	converter.compoundCommand.append(AddCommand.create(converter.editingDomain, from, RamPackage.Literals.CLASS__ASSOCIATION_ENDS, fromEnd));
    }
    
    /**
     * Add an {@link AssociationEnd} to the specified destination {@link Class}
     * 
     * @param toEnd association end to add
     * @param to class
     */
    after(ModelConverter converter, Class to) returning(AssociationEnd toEnd): execution ( AssociationEnd transformAssociationEndClassTo(..) )
    && this(converter) && args(*, *, *, to) {
    	
    	converter.compoundCommand.append(AddCommand.create(converter.editingDomain, to, RamPackage.Literals.CLASS__ASSOCIATION_ENDS, toEnd));
    }
    
    /**
     * Add an {@Instantiation} to the specified {@link Aspect}
     * 
     * @param instantiation to add 
     * @param ramAspect owner of the instantiation
     */
    after(ModelConverter converter, Aspect ramAspect) returning(Instantiation instantiation): call( Instantiation convertInstantiation(..) )
    && target(converter) && args(*, ramAspect, .. ) {
    
    	converter.compoundCommand.append(AddCommand.create( converter.editingDomain, ramAspect, RamPackage.Literals.ASPECT__INSTANTIATIONS, instantiation));
    }
    
//    /**
//     * Add a {@link ClassifierMapping} to the specified {@link Instantiation}
//     * 
//     * @param classifierMapping to add
//     * @param instantiation owner of the classifier mapping 
//     */
//    after(ModelConverter converter, ClassifierMapping classifierMapping, Instantiation instantiation) returning: call ( ClassifierMapping convertMapping(..) )
//    && this(converter) && target(classifierMapping) && args(*, *, instantiation, ..) {
//    	
//    	converter.compoundCommand.append( AddCommand.create( converter.editingDomain, instantiation, RamPackage.Literals.INSTANTIATION__MAPPINGS, classifierMapping ));
//    }
//   
//    /**
//     * Add an {@link OperationMapping} to a {@link ClassifierMapping}
//     *  
//     * @param operationMapping to add
//     * @param classifierMapping owner of the operation mapping
//     */
//    after(ModelConverter converter, OperationMapping operationMapping, ClassifierMapping classifierMapping) returning: call ( OperationMapping createOperationMapping(..) )
//    && this(converter) && target(operationMapping) && args(*, classifierMapping, ..) {
//    	
//    	converter.compoundCommand.append(AddCommand.create(converter.editingDomain, classifierMapping, RamPackage.Literals.OPERATION_MAPPING, operationMapping ));
//    }
//    
//    /**
//     * Add an {@link AttributeMapping} to a {@link ClassifierMapping}
//     * 
//     * @param attributeMapping to add
//     * @param classifierMapping owner of the attribute mapping
//     */
//      after(ModelConverter converter, AttributeMapping attributeMapping, ClassifierMapping classifierMapping) returning: call ( AttributeMapping createAttributeMapping(..) )
//      && this(converter) && target(attributeMapping) && args(*, classifierMapping, ..) {
//      	
//      	converter.compoundCommand.append(AddCommand.create(converter.editingDomain, classifierMapping, RamPackage.Literals.ATTRIBUTE_MAPPING, attributeMapping ));
//      }
//      
//      /**
//       * Add a {@link ParameterMapping} to a {@link OperationMapping} 
//       * 
//       * @param parameterMapping to add
//       * @param operationMapping owner of the parameter mapping
//       */
//      after(ModelConverter converter, ParameterMapping parameterMapping, OperationMapping operationMapping) returning: call ( ParameterMapping convertParameterMapping(..) )
//      && this(converter) && target(parameterMapping) && args(*, operationMapping, ..) {
//
//  		converter.compoundCommand.append(AddCommand.create(converter.editingDomain, operationMapping, RamPackage.Literals.PARAMETER_MAPPING, parameterMapping));
//      }
}
