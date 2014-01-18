package cl.uchile.pleiad.types

import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import org.eclipse.emf.common.util.EList
import ca.mcgill.cs.sel.ram.RamPackage
import ca.mcgill.cs.sel.ram.PrimitiveType
import org.eclipse.emf.common.util.BasicEList

class TypeSystem implements ITypeSystem {
	
	override getDefaultTypes(StructuralView structuralView) {
		
		structuralView.types.appendPrimitiveTypes
		
		return structuralView.allTypes
	}
	
	private static def getAllTypes(StructuralView structuralView) {
		val EList<Type>  typeList = new BasicEList<Type> 
		for ( clazz : structuralView.classes ) {
			typeList.add(clazz)
		}
		
		for ( type : structuralView.types ) {
			typeList.add(type)
		}
		
		typeList
	}
	
	private static def appendPrimitiveTypes(EList<Type> typesToReturn) {
		if (typesToReturn.length == 0) {
			typesToReturn.add(RamFactory.eINSTANCE.createRVoid());
			typesToReturn.add(RamFactory.eINSTANCE.createRBoolean());
			typesToReturn.add(RamFactory.eINSTANCE.createRInt());
			typesToReturn.add(RamFactory.eINSTANCE.createRChar());
			typesToReturn.add(RamFactory.eINSTANCE.createRString());
			typesToReturn.add(RamFactory.eINSTANCE.createRAny());
		//			typesToReturn.add(RamFactory.eINSTANCE.createREnum());
		//			typesToReturn.add(RamFactory.eINSTANCE.createRSet());
			typesToReturn.add(RamFactory.eINSTANCE.createRDouble());
			typesToReturn.add(RamFactory.eINSTANCE.createRFloat());
		}
	}
	
	override getPrimitiveTypes(StructuralView structuralView) {
		structuralView.getTypes().appendPrimitiveTypes

		structuralView.getTypes().filter(typeof(PrimitiveType)) as EList<PrimitiveType>
	}
	
	
}