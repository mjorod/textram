/*
 * generated by Xtext
 */
package cl.uchile.pleiad.scoping

import ca.mcgill.cs.sel.ram.Aspect
import ca.mcgill.cs.sel.ram.Instantiation
import cl.uchile.pleiad.textRam.TAbstractMessageView
import cl.uchile.pleiad.textRam.TAbstractMessages
import cl.uchile.pleiad.textRam.TAspect
import cl.uchile.pleiad.textRam.TClass
import cl.uchile.pleiad.textRam.TClassifierMapping
import cl.uchile.pleiad.textRam.TInteractionMessage
import cl.uchile.pleiad.textRam.TStructuralView
import cl.uchile.pleiad.util.TextRamEcoreUtil
import cl.uchile.pleiad.util.TextRamModelUtil
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import ca.mcgill.cs.sel.ram.Classifier
import java.util.List
import ca.mcgill.cs.sel.ram.PrimitiveType

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class TextRAMScopeProvider extends AbstractDeclarativeScopeProvider {
	
	extension TextRamEcoreUtil scopeProvider = new TextRamEcoreUtil
//	
//	def IScope scope_Instantiation_externalAspect(TAspect aspect, EReference reference) {
//		Scopes::scopeFor( aspect.getExternalAspectsFromHeader )
//	}
	
//	def IScope scope_TInstantiationHeader_externalAspects( TAspect aspect, EReference reference ) {
//		val externalAspects = TextRamModelUtil::collectExtendedAspects( aspect ) 
//		 
//		Scopes::scopeFor( externalAspects ) 
//	}
	
	def IScope scope_TOperation_returnType(TStructuralView structuralView, EReference reference) {
		Scopes::scopeFor( structuralView.getTypesFor )
	}
	
	def IScope scope_TAttribute_type(TStructuralView structuralView, EReference reference) {
		Scopes::scopeFor( structuralView.getPrimitiveTypes )
	}
	
	def IScope scope_TParameter_type(TStructuralView structuralView, EReference reference ) {
		Scopes::scopeFor( structuralView.getTypesFor )
	}
	
	def IScope scope_TClass_superTypes(Aspect aspect, EReference reference) {
		val tAspect = aspect as TAspect
		
		Scopes::scopeFor( tAspect.getExtendedClasses )
	}
		
	def IScope scope_ClassifierMapping_fromElement(TAspect aspect, EReference reference) {
		val classes = aspect.getInstantiationsClasses
		Scopes::scopeFor( classes )
	}
	
	def IScope scope_ClassifierMapping_toElement(Aspect aspect, EReference reference) {
		val List<Classifier> res = (aspect.structuralView as TStructuralView).classes.filter(Classifier).toList
		
		res.addAll( aspect.structuralView.types.filter(Classifier).toList )
		
		Scopes::scopeFor( res )
	}
	
	def IScope scope_TClassifierMapping_fromMembers(TClassifierMapping classifierMapping, EReference reference) {
		val o =  classifierMapping.getMembersFrom
		Scopes::scopeFor(o)
	}
	
	def IScope scope_TClassifierMapping_toMembers(TClassifierMapping classifierMapping, EReference reference ) {
		val toElement = classifierMapping.toElement as TClass 
		Scopes::scopeFor( toElement.members )
	}
	
	def IScope scope_TAbstractMessages_class(Aspect aspect, EReference reference) {
		val tAspect = (aspect as TAspect)
		
		Scopes::scopeFor( tAspect.getExtendedClasses )
	}
	
	def IScope scope_TAbstractMessages_specifies(Aspect aspect, EReference reference ) {		
		val tAspect = aspect as TAspect
		
		Scopes::scopeFor( tAspect.getExtendedOperations )
	}
	
	def IScope scope_TAbstractMessages_arguments(TAbstractMessages messageView, EReference reference) {
		Scopes::scopeFor( messageView.getArgumentsForAspectMessageViewOperation )
	}
	
	def IScope scope_TLifeline_represents(Aspect aspect, EReference reference) {
		Scopes::scopeFor( (aspect as TAspect).getTTypedElements )
	}

	def IScope scope_TMessage_assignTo(TInteractionMessage textRamInteractionMessage, EReference reference) {
		Scopes::scopeFor ( textRamInteractionMessage.getAssignableFeatures )
	}
	
	def IScope scope_TMessage_signature(TInteractionMessage interaction, EReference reference) {
		Scopes::scopeFor ( interaction.getExtendedOperationsFromRightLifeline  )
	}
	
	def IScope scope_TReturnInteraction_return(TAbstractMessages textRamMessageView, EReference reference) {
		Scopes::scopeFor ( textRamMessageView.getTValueSpecificationUsedByMessageView )
	}
	
	def IScope scope_TMessage_arguments(TInteractionMessage interaction, EReference reference) {
		Scopes::scopeFor ( interaction.getTValueSpecificationList )
	}
	
	def IScope scope_TMessageView_affectedBy(Aspect aspect, EReference reference) {
		val abstractMessageView = aspect.messageViews.get(0) as TAbstractMessageView
		
		Scopes::scopeFor ( abstractMessageView.getAspectMessageViews )
	}
	
	def IScope scope_TAssociationEnd_classReference( Aspect aspect, EReference reference ) {
		val tAspect = (aspect as TAspect)
		
		Scopes::scopeFor( tAspect.getExtendedClasses )
	}
	
	def IScope scope_TInteractionMessage_leftLifeline( Aspect aspect, EReference reference ) {
		val tAspect = (aspect as TAspect)
		
		Scopes::scopeFor( tAspect.getTLifelines )
	}
	
	def IScope scope_TInteractionMessage_rightLifeline( Aspect aspect, EReference refenrece ) {
		val tAspect = (aspect as TAspect)
		
		Scopes::scopeFor( tAspect.getTLifelines )		
	}
	
	def IScope scope_TOcurrence_leftLifeline( Aspect aspect, EReference reference ) {
		val tAspect = (aspect as TAspect)
		
		Scopes::scopeFor( tAspect.getTLifelines )
	}
	
	def IScope scope_TReference_reference( Aspect aspect, EReference reference ) {
		val tAspect = (aspect as TAspect)
		
		Scopes::scopeFor( tAspect.getExtendedClasses )
	}
	
	def IScope scope_TLocalAttribute_type( Aspect aspect, EReference reference ) {
		val tAspect = aspect as TAspect
		
		Scopes::scopeFor( tAspect.structuralView.getPrimitiveTypes )
	}

//TODO: pending TReturnInteraction	
//	def IScope TReturnInteraction_return( Aspect aspect, EReference reference ) {
//		
//	}
}