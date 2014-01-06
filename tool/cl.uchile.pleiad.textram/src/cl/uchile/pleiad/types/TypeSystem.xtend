package cl.uchile.pleiad.types

import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.RamFactory

class TypeSystem implements ITypeSystem {
	
	override getDefaultTypes(StructuralView structuralView) {
		
		if (structuralView.getTypes().length == 0) {
			structuralView.getTypes().add(RamFactory.eINSTANCE.createRVoid());
			structuralView.getTypes().add(RamFactory.eINSTANCE.createRBoolean());
			structuralView.getTypes().add(RamFactory.eINSTANCE.createRInt());
			structuralView.getTypes().add(RamFactory.eINSTANCE.createRChar());
			structuralView.getTypes().add(RamFactory.eINSTANCE.createRString());
			structuralView.getTypes().add(RamFactory.eINSTANCE.createRAny());
//			structuralView.getTypes().add(RamFactory.eINSTANCE.createREnum());
//			structuralView.getTypes().add(RamFactory.eINSTANCE.createRSet());
			structuralView.getTypes().add(RamFactory.eINSTANCE.createRDouble());
			structuralView.getTypes().add(RamFactory.eINSTANCE.createRFloat());
		}
		
		return structuralView.getTypes()
	}
	
}