package cl.uchile.pleiad.crosscutting;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.Association;
import ca.mcgill.cs.sel.ram.AssociationEnd;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.AttributeMapping;
import ca.mcgill.cs.sel.ram.Classifier;
import ca.mcgill.cs.sel.ram.ClassifierMapping;
import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.OperationMapping;
import ca.mcgill.cs.sel.ram.ParameterMapping;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Class;
import ca.mcgill.sel.ram.controller.edit.AdapterFactoryUtil;
import cl.uchile.pleiad.converter.ModelConverter;

public aspect ModelCommand {
    
	private EditingDomain editingDomain;
	private CompoundCommand compoundCommand;
	private Aspect ramAspect;
	
	/**
     * initializes the editing domain and the commands to manipulate ram models
     * 
     * @return Returns the converted ram aspect from textRam model
     */
    Aspect around() : execution( Aspect ModelConverter.convertToRamAspect(Aspect) ) {
        // convert root textRam aspect to ram aspect
    	this.ramAspect = proceed();

    	// manages a self-contained set of ram models and the commands that modify them    	
    	this.editingDomain = AdapterFactoryUtil.getEditingDomain(ramAspect);
    	
		// create compound command
    	this.compoundCommand = new CompoundCommand();
            
        return this.ramAspect;
    }
    
    /**
     * Add the converted structural view to the ram aspect
     * 
     * @param {@link StructuralView} transformed from textRam to Ram
     */
    after(StructuralView structuralView): call( StructuralView convertStructuralView(..) ) && target(structuralView)  {
		// add structural view to ram aspect
		compoundCommand.append(AddCommand.create(editingDomain, ramAspect, RamPackage.Literals.STRUCTURAL_VIEW, structuralView));
    }
    
    /**
     * Add the converted {@link Class}  to the {@link StructuralView}
     *   
     * @param clazz classifier to add
     * @param structuralView owner of the class 
     */
    after(Class clazz, StructuralView structuralView): call( Class convertClass(..) ) 
    && target(clazz) && args(*, structuralView, ..) {

    	compoundCommand.append(AddCommand.create(editingDomain, structuralView, RamPackage.Literals.CLASSIFIER, clazz));
    }
    
    /**
     * Add the converted {@link Operation} to the {@link Class} owner
     * 
     * @param operation to add
     * @param classOwner owner of the operation
     */
    after(Operation operation, Class classOwner): call( Operation convertOperation(..) ) 
    && target(operation) && args(*, classOwner, .. ) {
    	
    	compoundCommand.append(AddCommand.create(editingDomain, classOwner, RamPackage.Literals.CLASSIFIER__OPERATIONS, operation));
    }
    
    /**
     * Add the converted {@link Attribute} to the {@link Class} owner
     * 
     * @param attribute to add
     * @param classOwner owner of the attribute
     */
    after(Attribute attribute, Class classOwner): call( Attribute convertAttribute(..) )
    && target(attribute) && args(*, classOwner, .. ) {
    	
    	compoundCommand.append(AddCommand.create(editingDomain, classOwner, RamPackage.Literals.CLASS__ATTRIBUTES, attribute));
    }
    
    /**
     * Add {@Classifier} as super type of the given sub type 
     * 
     * @param subType derived class
     * @param superType base class
     */
    after(Classifier subType, Classifier superType): call( * addSuperType(..) )
    && args(subType, superType, ..) {
    	compoundCommand.append(AddCommand.create(editingDomain, 
				 subType,
				 RamPackage.Literals.CLASS__SUPER_TYPES, // feature
				 superType));
    }
    
    /**
     * Add {@link Association} to a {@link StructuralView}
     * 
     * @param association to add
     * @param structuralView owner of the association
     */
    after(Association association, StructuralView structuralView): call( Association convertAssociation(..) )
    && target(association) && args(*, structuralView, ..) {
        
    	// create command for association
        compoundCommand.append(AddCommand.create(editingDomain, structuralView, RamPackage.Literals.STRUCTURAL_VIEW__ASSOCIATIONS, association));
    }
    
    /**
     * Add an {@link AssociationEnd} to the specified from {@link Class}
     *  
     * @param fromEnd association end to add
     * @param from class
     */
    after(AssociationEnd fromEnd, Class from): call ( AssociationEnd convertAssociationEndClassFrom(..) )
    && target(fromEnd) && args(*, *, from, ..) {
    	
    	compoundCommand.append(AddCommand.create(editingDomain, from, RamPackage.Literals.CLASS__ASSOCIATION_ENDS, fromEnd));
    }
    
    /**
     * Add an {@link AssociationEnd} to the specified destination {@link Class}
     * 
     * @param toEnd association end to add
     * @param to class
     */
    after(AssociationEnd toEnd, Class to): call ( AssociationEnd convertAssociationEndClassTo(..) )
    && target(toEnd) && args(*, *, to, ..) {
    	
    	compoundCommand.append(AddCommand.create(editingDomain, to, RamPackage.Literals.CLASS__ASSOCIATION_ENDS, toEnd));
    }
    
    /**
     * Add an {@Instantiation} to the specified {@link Aspect}
     * 
     * @param instantiation to add 
     * @param ramAspect owner of the instantiation
     */
    after(Instantiation instantiation, Aspect ramAspect): call( Instantiation convertInstantiation(..) )
    && target(instantiation) && args(*, ramAspect, .. ) {
    
    	compoundCommand.append(AddCommand.create( editingDomain, ramAspect, RamPackage.Literals.ASPECT__INSTANTIATIONS, instantiation));
    }
    
    /**
     * Add a {@link ClassifierMapping} to the specified {@link Instantiation}
     * 
     * @param classifierMapping to add
     * @param instantiation owner of the classifier mapping 
     */
    after(ClassifierMapping classifierMapping, Instantiation instantiation): call( ClassifierMapping convertMapping(..) )
    && target(classifierMapping) && args(*, *, instantiation, ..) {
    	
    	compoundCommand.append( AddCommand.create( editingDomain, instantiation, RamPackage.Literals.INSTANTIATION__MAPPINGS, classifierMapping ));
    }
   
    /**
     * Add an {@link OperationMapping} to a {@link ClassifierMapping}
     *  
     * @param operationMapping to add
     * @param classifierMapping owner of the operation mapping
     */
    after(OperationMapping operationMapping, ClassifierMapping classifierMapping): call( OperationMapping createOperationMapping(..) )
    && target(operationMapping) && args(*, classifierMapping, ..) {
    	
    	compoundCommand.append(AddCommand.create(editingDomain, classifierMapping, RamPackage.Literals.OPERATION_MAPPING, operationMapping ));
    }
    
    /**
     * Add an {@link AttributeMapping} to a {@link ClassifierMapping}
     * 
     * @param attributeMapping to add
     * @param classifierMapping owner of the attribute mapping
     */
      after(AttributeMapping attributeMapping, ClassifierMapping classifierMapping): call( AttributeMapping createAttributeMapping(..) )
      && target(attributeMapping) && args(*, classifierMapping, ..) {
      	
      	compoundCommand.append(AddCommand.create(editingDomain, classifierMapping, RamPackage.Literals.ATTRIBUTE_MAPPING, attributeMapping ));
      }
      
      /**
       * Add a {@link ParameterMapping} to a {@link OperationMapping} 
       * 
       * @param parameterMapping to add
       * @param operationMapping owner of the parameter mapping
       */
      after(ParameterMapping parameterMapping, OperationMapping operationMapping): call( ParameterMapping convertParameterMapping(..) )
      && target(parameterMapping) && args(*, operationMapping, ..) {

  		compoundCommand.append(AddCommand.create(editingDomain, operationMapping, RamPackage.Literals.PARAMETER_MAPPING, parameterMapping));
      }    
}
