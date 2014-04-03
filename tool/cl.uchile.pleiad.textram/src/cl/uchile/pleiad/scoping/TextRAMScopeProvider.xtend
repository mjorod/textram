/*
 * generated by Xtext
 */
package cl.uchile.pleiad.scoping

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Instantiation
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TAspect
import cl.uchile.pleiad.textRam.TAspectMessageView
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TInteractionMessage
import cl.uchile.pleiad.textRam.TMessageView
import cl.uchile.pleiad.textRam.TStructuralView
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
	
	extension ModelScopeProvider scopeProvider = new ModelScopeProvider
	
	def IScope scope_Instantiation_externalAspect(TAspect aspect, EReference reference) {
		Scopes::scopeFor( aspect.getExternalAspectsFromHeader )
	}
	
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
	
	def IScope scope_ClassifierMapping_toElement(Aspect aspect, EReference reference) {
		Scopes::scopeFor( (aspect.structuralView as TStructuralView).classes.filter(TClass) )
	}
	
	def IScope scope_TClassifierMapping_fromMembers(TClassifierMapping classifierMapping, EReference reference) {
		Scopes::scopeFor( classifierMapping.getMembersFrom )
	}
	
	def IScope scope_TClassifierMapping_toMembers(TClassifierMapping classifierMapping, EReference reference ) {
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

	def IScope scope_TMessage_assignTo(TInteractionMessage textRamInteractionMessage, EReference reference) {
		Scopes::scopeFor ( textRamInteractionMessage.getAssignableFeatures )
	}
	
	def IScope scope_TTReturnMessage_assignTo(TInteractionMessage textRamInteractionMessage, EReference reference) {
		Scopes::scopeFor ( textRamInteractionMessage.getReturnMessageAssignTo )
	}

	def IScope scope_TMessageWithSignature_signature(Aspect aspect, EReference reference) {
		Scopes::scopeFor ( aspect.getOperations  )
	}
	
	def IScope scope_TMessage_arguments(TMessageView messageView, EReference reference) {
		Scopes::scopeFor ( messageView.getParameters )
	}
	
	def IScope scope_TMessageView_parameters(Aspect aspect, EReference reference) {
		Scopes::scopeFor ( aspect.getParameters )
	}
	
	def IScope scope_TMessageView_affectedBy(TAbstractMessageView abstractMessageView, EReference reference) {
		Scopes::scopeFor ( abstractMessageView.getAspectMessageViews )
	}
	
	def IScope scope_TAspectMessageView_pointcut(TAspectMessageView aspectMessageView, EReference reference ) {
		Scopes::scopeFor( aspectMessageView.getOperationsForAspectMessageView )
	}
}