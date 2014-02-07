package cl.uchile.pleiad.scoping

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Classifier
import ca.mcgill.cs.sel.ram.Instantiation
import ca.mcgill.cs.sel.ram.PrimitiveType
import ca.mcgill.cs.sel.ram.StructuralView
import ca.mcgill.cs.sel.ram.Type
import cl.uchile.pleiad.textRam.TClassMember
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TOperation
import cl.uchile.pleiad.textRam.TTypedElement
import java.util.List
import ca.mcgill.cs.sel.ram.Parameter

interface IModelScopeProvider {
	
	def List<Type> getTypesFor(StructuralView structuralView)
	def List<PrimitiveType> getPrimitiveTypes(StructuralView structuralView)
	def List<Classifier> getClasses(Instantiation instantiation)
	def List<TClassMember> getMembersFrom(TClassifierMapping classifierMapping)
	def List<TOperation> getPublicOperations(Aspect aspect)
	def List<TTypedElement> getTTypedElements(Aspect aspect)
	def List<Parameter> getParameters(Aspect aspect) 
}