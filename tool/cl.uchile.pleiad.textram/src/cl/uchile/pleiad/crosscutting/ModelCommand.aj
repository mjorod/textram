package cl.uchile.pleiad.crosscutting;

import ca.mcgill.cs.sel.ram.Aspect;
import cl.uchile.pleiad.converter.ModelConverter;;

public aspect ModelCommand {
	
//	private EditingDomain editingDomain;
//	private CompoundCommand command;
	private Aspect ramAspect;
	//private StructuralView structuralView;
	
	/**
	 * initializes the editing domain and the commands to manipulate ram models
	 * 
	 * @return Returns the converted ram aspect from textRam model
	 */
//	Aspect around() : execution( Aspect ModelConverter.convertToRamAspect(..) ) {
//		System.out.println("antes del aspect!!!");
//		// convert root textRam aspect to ram aspect
//		this.ramAspect = proceed();
//		System.out.println("después del command!!!");
//		
////		// manages a self-contained set of ram models and the commands that modify them
////		editingDomain = AdapterFactoryUtil.getEditingDomain(ramAspect);
////		
////		// compound command to manage ram models
////		command = new CompoundCommand();
//		
//		return this.ramAspect;
//	}
	
	/**
	 * Add the converted structural view to the ram aspect
	 * 
	 * @param {@link StructuralView} transformed from textRam to Ram
	 */
//	after(StructuralView structuralView) : call( * ModelConverter.convertStructuralView(..) ) && target(structuralView) {
//		this.structuralView = structuralView;
//		System.out.println("antes del command!!!");
//		this.command.append(AddCommand.create(this.editingDomain, this.ramAspect, RamPackage.Literals.STRUCTURAL_VIEW, this.structuralView));
//		System.out.println("después del command!!!");
//	}
//	
//	after(Class clazz) : call( Class ModelConverter.convertClass(..) ) && target(clazz) {
//		command.append(AddCommand.create(editingDomain, this.structuralView, RamPackage.Literals.CLASSIFIER, clazz));
//	}
	
	
	
	
	

}
