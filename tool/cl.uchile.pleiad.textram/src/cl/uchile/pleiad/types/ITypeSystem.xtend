package cl.uchile.pleiad.types

import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import org.eclipse.emf.common.util.EList

interface ITypeSystem {
	def EList<Type> getDefaultTypes(StructuralView structuralView);
	def EList<PrimitiveType> getPrimitiveTypes(StructuralView structuralView);
}