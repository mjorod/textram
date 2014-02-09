/*
 * generated by Xtext
 */
package cl.uchile.pleiad.scoping

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Instantiation
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TInteraction
import cl.uchile.pleiad.textRam.TStructuralView
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
	
	@Inject extension IModelScopeProvider scopeProvider 
	
	def IScope scope_TOperation_returnType(TStructuralView structuralView, EReference reference)
	{
		Scopes::scopeFor( structuralView.getTypesFor )
	}
	
	def IScope scope_TAttribute_type(TStructuralView structuralView, EReference reference)
	{
		Scopes::scopeFor( structuralView.getPrimitiveTypes )
	}
	
	def IScope scope_ClassifierMapping_fromElement(Instantiation instantiation, EReference reference) {
		val classes = instantiation.getClasses
		Scopes::scopeFor( classes )
	}
	
	def IScope scope_ClassifierMapping_toElement(TStructuralView structuralView, EReference reference) {
		Scopes::scopeFor( structuralView.classes )
	}
	
	def IScope scope_TClassifierMapping_fromMember(TClassifierMapping classifierMapping, EReference reference) {
		Scopes::scopeFor( classifierMapping.getMembersFrom )
	}
	
	def IScope scope_TClassifierMapping_toMember(TClassifierMapping classifierMapping, EReference reference ) {
		val toElement = classifierMapping.toElement as TClass 
		Scopes::scopeFor( toElement.members )
	}
	
	def IScope scope_TMessageView_class(Aspect aspect, EReference reference) {
		val classes = aspect.structuralView.classes.filter(TClass)
		Scopes::scopeFor( classes )
	}
	
	def IScope scope_TMessageView_specifies(Aspect aspect, EReference reference) {
		Scopes::scopeFor( aspect.getPublicOperations )
	}
	
	def IScope scope_TLifeline_represents(Aspect aspect, EReference reference) {
		Scopes::scopeFor( aspect.getTTypedElements )
	}
	
	def IScope scope_TInteractionMessage_leftLifeline(Aspect aspect, EReference reference) {
		Scopes::scopeFor( aspect.getLeftTLifelines )
	}
	
	def IScope scope_TInteractionMessage_rightLifeline(Aspect aspect, EReference reference) {
		Scopes::scopeFor( aspect.getRightTLifelines )
	}

	def IScope scope_TMessage_assignTo(Aspect aspect, EReference reference) {
		Scopes::scopeFor ( aspect.getTStructuralFeature )
	}	

	def IScope scope_TMessage_signature(Aspect aspect, EReference reference) {
		Scopes::scopeFor ( aspect.getPublicOperations )
	}
	
	def IScope scope_TMessage_arguments(Aspect aspect, EReference reference) {
		Scopes::scopeFor ( aspect.getParameters )
	}
	
	def IScope scope_TOperationSignature_operation(Aspect aspect, EReference reference) {
		Scopes::scopeFor ( aspect.getPublicOperations )
	}
}
