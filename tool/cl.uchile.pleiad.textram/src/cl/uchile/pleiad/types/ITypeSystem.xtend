package cl.uchile.pleiad.types

import org.eclipse.emf.common.util.EList
import ca.mcgill.cs.sel.ram.Type
import ca.mcgill.cs.sel.ram.StructuralView

interface ITypeSystem {
	def EList<Type> getDefaultTypes(StructuralView structuralView);
}