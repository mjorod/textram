/*
 * generated by Xtext
 */
package cl.uchile.pleiad.scoping

import ca.mcgill.cs.sel.ram.StructuralView
import cl.uchile.pleiad.types.ITypeSystem
import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class TextRAMScopeProvider extends AbstractDeclarativeScopeProvider {
	
	@Inject extension ITypeSystem typeSystem 
	
	def IScope scope_Operation_returnType(StructuralView structuralView, EReference reference)
	{
		Scopes::scopeFor(structuralView.getDefaultTypes)
	}
}
