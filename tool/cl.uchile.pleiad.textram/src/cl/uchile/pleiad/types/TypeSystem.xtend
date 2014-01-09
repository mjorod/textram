package cl.uchile.pleiad.types

import ca.mcgill.cs.sel.ram.Class
import ca.mcgill.cs.sel.ram.RamFactory
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import org.eclipse.emf.common.util.EList

class TypeSystem implements ITypeSystem {
	
	override getDefaultTypes(StructuralView structuralView) {
		val EList<Type> typesToReturn = structuralView.getTypes();
		
		typesToReturn.appendPrimitiveTypes
		
//		typesToReturn.appendClasses(structuralView.getClasses.filter(typeof(Class)))
				
		return typesToReturn
	}
	
	private static def appendClasses(EList<Type> typesToReturn, Iterable<Class> classes) {
		classes.forEach [ c |
			if (typesToReturn.contains(c) == false)
 		   		typesToReturn.add(c)
		]
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
	
}