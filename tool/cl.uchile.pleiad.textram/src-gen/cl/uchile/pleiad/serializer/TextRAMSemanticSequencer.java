package cl.uchile.pleiad.serializer;

import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.LiteralString;
import ca.mcgill.cs.sel.ram.RAny;
import ca.mcgill.cs.sel.ram.RBoolean;
import ca.mcgill.cs.sel.ram.RChar;
import ca.mcgill.cs.sel.ram.RDouble;
import ca.mcgill.cs.sel.ram.RFloat;
import ca.mcgill.cs.sel.ram.RInt;
import ca.mcgill.cs.sel.ram.RSet;
import ca.mcgill.cs.sel.ram.RString;
import ca.mcgill.cs.sel.ram.RVoid;
import ca.mcgill.cs.sel.ram.RamPackage;
import cl.uchile.pleiad.services.TextRAMGrammarAccess;
import cl.uchile.pleiad.textRam.TAbstractMessageView;
import cl.uchile.pleiad.textRam.TAspect;
import cl.uchile.pleiad.textRam.TAspectMessageView;
import cl.uchile.pleiad.textRam.TAssociation;
import cl.uchile.pleiad.textRam.TAssociationEnd;
import cl.uchile.pleiad.textRam.TAttribute;
import cl.uchile.pleiad.textRam.TClass;
import cl.uchile.pleiad.textRam.TClassifierMapping;
import cl.uchile.pleiad.textRam.TCombinedFragment;
import cl.uchile.pleiad.textRam.TDummyValueSpecification;
import cl.uchile.pleiad.textRam.TInstantiationHeader;
import cl.uchile.pleiad.textRam.TInteractionMessage;
import cl.uchile.pleiad.textRam.TLifeline;
import cl.uchile.pleiad.textRam.TLocalAttribute;
import cl.uchile.pleiad.textRam.TMessage;
import cl.uchile.pleiad.textRam.TMessageView;
import cl.uchile.pleiad.textRam.TOcurrence;
import cl.uchile.pleiad.textRam.TOperation;
import cl.uchile.pleiad.textRam.TParameter;
import cl.uchile.pleiad.textRam.TReference;
import cl.uchile.pleiad.textRam.TReturnMessage;
import cl.uchile.pleiad.textRam.TStructuralView;
import cl.uchile.pleiad.textRam.TextRamPackage;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TextRAMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TextRAMGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RamPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RamPackage.INSTANTIATION:
				if(context == grammarAccess.getInstantiationRule()) {
					sequence_Instantiation(context, (Instantiation) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.LITERAL_STRING:
				if(context == grammarAccess.getLiteralStringRule()) {
					sequence_LiteralString(context, (LiteralString) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RANY:
				if(context == grammarAccess.getRAnyRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RAny(context, (RAny) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RBOOLEAN:
				if(context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRBooleanRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RBoolean(context, (RBoolean) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RCHAR:
				if(context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRCharRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RChar(context, (RChar) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RDOUBLE:
				if(context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRDoubleRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RDouble(context, (RDouble) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RFLOAT:
				if(context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRFloatRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RFloat(context, (RFloat) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RINT:
				if(context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRIntRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RInt(context, (RInt) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RSET:
				if(context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getRSetRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RSet(context, (RSet) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RSTRING:
				if(context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRStringRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RString(context, (RString) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RVOID:
				if(context == grammarAccess.getRVoidRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RVoid(context, (RVoid) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == TextRamPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TextRamPackage.TABSTRACT_MESSAGE_VIEW:
				if(context == grammarAccess.getTAbstractMessageViewRule()) {
					sequence_TAbstractMessageView(context, (TAbstractMessageView) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TASPECT:
				if(context == grammarAccess.getAspectRule() ||
				   context == grammarAccess.getTAspectRule()) {
					sequence_TAspect(context, (TAspect) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TASPECT_MESSAGE_VIEW:
				if(context == grammarAccess.getTAbstractMessagesRule() ||
				   context == grammarAccess.getTAspectMessageViewRule()) {
					sequence_TAspectMessageView(context, (TAspectMessageView) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TASSOCIATION:
				if(context == grammarAccess.getTAssociationRule() ||
				   context == grammarAccess.getTMessageAssignableFeatureRule() ||
				   context == grammarAccess.getTTypedElementRule()) {
					sequence_TAssociation(context, (TAssociation) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TASSOCIATION_END:
				if(context == grammarAccess.getTAssociationEndRule()) {
					sequence_TAssociationEnd(context, (TAssociationEnd) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TATTRIBUTE:
				if(context == grammarAccess.getTAttributeRule() ||
				   context == grammarAccess.getTClassMemberRule() ||
				   context == grammarAccess.getTTypedElementRule()) {
					sequence_TAttribute(context, (TAttribute) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TCLASS:
				if(context == grammarAccess.getAbstractClassRule() ||
				   context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getTClassRule() ||
				   context == grammarAccess.getTTypedElementRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_TClass(context, (TClass) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TCLASSIFIER_MAPPING:
				if(context == grammarAccess.getAbstractClassifierMappingRule() ||
				   context == grammarAccess.getTClassifierMappingRule()) {
					sequence_TClassifierMapping(context, (TClassifierMapping) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TCOMBINED_FRAGMENT:
				if(context == grammarAccess.getTCombinedFragmentRule() ||
				   context == grammarAccess.getTInteractionRule()) {
					sequence_TCombinedFragment(context, (TCombinedFragment) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TDUMMY_VALUE_SPECIFICATION:
				if(context == grammarAccess.getTDummyValueSpecificationRule() ||
				   context == grammarAccess.getTValueSpecificationRule()) {
					sequence_TDummyValueSpecification(context, (TDummyValueSpecification) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TINSTANTIATION_HEADER:
				if(context == grammarAccess.getTInstantiationHeaderRule()) {
					sequence_TInstantiationHeader(context, (TInstantiationHeader) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TINTERACTION_MESSAGE:
				if(context == grammarAccess.getTInteractionRule() ||
				   context == grammarAccess.getTInteractionMessageRule()) {
					sequence_TInteractionMessage(context, (TInteractionMessage) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TLIFELINE:
				if(context == grammarAccess.getTLifelineRule() ||
				   context == grammarAccess.getTMessageAssignableFeatureRule() ||
				   context == grammarAccess.getTValueSpecificationRule()) {
					sequence_TLifeline(context, (TLifeline) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TLOCAL_ATTRIBUTE:
				if(context == grammarAccess.getTLocalAttributeRule() ||
				   context == grammarAccess.getTMessageAssignableFeatureRule() ||
				   context == grammarAccess.getTTemporaryPropertyRule() ||
				   context == grammarAccess.getTValueSpecificationRule()) {
					sequence_TLocalAttribute(context, (TLocalAttribute) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TMESSAGE:
				if(context == grammarAccess.getTAbstractMessageRule() ||
				   context == grammarAccess.getTMessageRule()) {
					sequence_TMessage(context, (TMessage) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TMESSAGE_VIEW:
				if(context == grammarAccess.getTAbstractMessagesRule() ||
				   context == grammarAccess.getTMessageViewRule()) {
					sequence_TMessageView(context, (TMessageView) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TOCURRENCE:
				if(context == grammarAccess.getTInteractionRule() ||
				   context == grammarAccess.getTOcurrenceRule()) {
					sequence_TOcurrence(context, (TOcurrence) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TOPERATION:
				if(context == grammarAccess.getTClassMemberRule() ||
				   context == grammarAccess.getTOperationRule()) {
					sequence_TOperation(context, (TOperation) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TPARAMETER:
				if(context == grammarAccess.getTParameterRule() ||
				   context == grammarAccess.getTValueSpecificationRule()) {
					sequence_TParameter(context, (TParameter) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TREFERENCE:
				if(context == grammarAccess.getTMessageAssignableFeatureRule() ||
				   context == grammarAccess.getTReferenceRule() ||
				   context == grammarAccess.getTTemporaryPropertyRule() ||
				   context == grammarAccess.getTValueSpecificationRule()) {
					sequence_TReference(context, (TReference) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TRETURN_MESSAGE:
				if(context == grammarAccess.getTAbstractMessageRule() ||
				   context == grammarAccess.getTReturnMessageRule()) {
					sequence_TReturnMessage(context, (TReturnMessage) semanticObject); 
					return; 
				}
				else break;
			case TextRamPackage.TSTRUCTURAL_VIEW:
				if(context == grammarAccess.getAbstractStructuralViewRule() ||
				   context == grammarAccess.getTStructuralViewRule()) {
					sequence_TStructuralView(context, (TStructuralView) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (externalAspect=[Aspect|EString] (mappings+=TClassifierMapping mappings+=TClassifierMapping*)?)
	 */
	protected void sequence_Instantiation(EObject context, Instantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {LiteralString}
	 */
	protected void sequence_LiteralString(EObject context, LiteralString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RAny}
	 */
	protected void sequence_RAny(EObject context, RAny semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RBoolean}
	 */
	protected void sequence_RBoolean(EObject context, RBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RChar}
	 */
	protected void sequence_RChar(EObject context, RChar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RDouble}
	 */
	protected void sequence_RDouble(EObject context, RDouble semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RFloat}
	 */
	protected void sequence_RFloat(EObject context, RFloat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RInt}
	 */
	protected void sequence_RInt(EObject context, RInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RSet}
	 */
	protected void sequence_RSet(EObject context, RSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RString}
	 */
	protected void sequence_RString(EObject context, RString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {RVoid}
	 */
	protected void sequence_RVoid(EObject context, RVoid semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lifelines+=TLifeline lifelines+=TLifeline* messages+=TAbstractMessages messages+=TAbstractMessages*)
	 */
	protected void sequence_TAbstractMessageView(EObject context, TAbstractMessageView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         create?='new'? 
	 *         (partialClass?='|'? class=[TClass|EString])? 
	 *         partialOperation?='|'? 
	 *         specifies=[TOperation|EString] 
	 *         (arguments+=[TParameter|EString] arguments+=[TParameter|EString]?)? 
	 *         interactionMessages+=TInteraction 
	 *         interactionMessages+=TInteraction*
	 *     )
	 */
	protected void sequence_TAspectMessageView(EObject context, TAspectMessageView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (headerInstantiations+=TInstantiationHeader headerInstantiations+=TInstantiationHeader*)? 
	 *         structuralView=TStructuralView 
	 *         (instantiations+=Instantiation instantiations+=Instantiation*)? 
	 *         messageViews+=TAbstractMessageView?
	 *     )
	 */
	protected void sequence_TAspect(EObject context, TAspect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lowerBound=ElementBound? upperBound=ElementBound? classReference=[Class|EString])
	 */
	protected void sequence_TAssociationEnd(EObject context, TAssociationEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fromEnd=TAssociationEnd referenceType=ReferenceType? toEnd=TAssociationEnd name=EString)
	 */
	protected void sequence_TAssociation(EObject context, TAssociation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (static?='static'? type=[PrimitiveType|EString] partial?='|'? name=EString)
	 */
	protected void sequence_TAttribute(EObject context, TAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         partial?='|'? 
	 *         name=EString 
	 *         (partialSuperType?='|'? superTypes+=[Classifier|EString])? 
	 *         (members+=TClassMember members+=TClassMember*)?
	 *     )
	 */
	protected void sequence_TClass(EObject context, TClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         partialFromElement?='|'? 
	 *         fromElement=[Classifier|EString] 
	 *         (fromMembers+=[TClassMember|EString] fromMembers+=[TClassMember|EString]*)? 
	 *         partialToElement?='|'? 
	 *         toElement=[Classifier|EString] 
	 *         (toMembers+=[TClassMember|EString] toMembers+=[TClassMember|EString]*)?
	 *     )
	 */
	protected void sequence_TClassifierMapping(EObject context, TClassifierMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         interactionOperator=InteractionOperatorKind 
	 *         interactionConstraint=EString 
	 *         containers+=TInteraction 
	 *         containers+=TInteraction* 
	 *         (elseContainers+=TInteraction elseContainers+=TInteraction*)?
	 *     )
	 */
	protected void sequence_TCombinedFragment(EObject context, TCombinedFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dummy?='true'
	 */
	protected void sequence_TDummyValueSpecification(EObject context, TDummyValueSpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TextRamPackage.Literals.TDUMMY_VALUE_SPECIFICATION__DUMMY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextRamPackage.Literals.TDUMMY_VALUE_SPECIFICATION__DUMMY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTDummyValueSpecificationAccess().getDummyTrueKeyword_0(), semanticObject.isDummy());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=InstantiationType externalAspects+=[Aspect|EString] externalAspects+=[Aspect|EString]*)
	 */
	protected void sequence_TInstantiationHeader(EObject context, TInstantiationHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftLifeline=[TLifeline|EString] create?='new'? rightLifeline=[TLifeline|EString] message=TAbstractMessage?)
	 */
	protected void sequence_TInteractionMessage(EObject context, TInteractionMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         static?='static'? 
	 *         referenceType=TLifelineReferenceType 
	 *         name=EString 
	 *         represents=[TTypedElement|EString]? 
	 *         (localProperties+=TTemporaryProperty localProperties+=TTemporaryProperty*)?
	 *     )
	 */
	protected void sequence_TLifeline(EObject context, TLifeline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[PrimitiveType|EString] name=EString value=EString?)
	 */
	protected void sequence_TLocalAttribute(EObject context, TLocalAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         create?='new'? 
	 *         partialClass?='|'? 
	 *         class=[TClass|EString] 
	 *         partialOperation?='|'? 
	 *         specifies=[TOperation|EString] 
	 *         (arguments+=[TParameter|EString] arguments+=[TParameter|EString]*)? 
	 *         (affectedBy+=[TAspectMessageView|EString] affectedBy+=[TAspectMessageView|EString]*)? 
	 *         (interactionMessages+=TInteraction interactionMessages+=TInteraction*)?
	 *     )
	 */
	protected void sequence_TMessageView(EObject context, TMessageView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         assignTo=[TMessageAssignableFeature|EString]? 
	 *         partialOperation?='|'? 
	 *         signature=[TOperation|EString] 
	 *         (arguments+=[TValueSpecification|EString] arguments+=[TValueSpecification|EString]?)?
	 *     )
	 */
	protected void sequence_TMessage(EObject context, TMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (leftLifeline=[TLifeline|EString] ocurrenceType=OcurrenceType)
	 */
	protected void sequence_TOcurrence(EObject context, TOcurrence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TextRamPackage.Literals.TOCURRENCE__LEFT_LIFELINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextRamPackage.Literals.TOCURRENCE__LEFT_LIFELINE));
			if(transientValues.isValueTransient(semanticObject, TextRamPackage.Literals.TOCURRENCE__OCURRENCE_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextRamPackage.Literals.TOCURRENCE__OCURRENCE_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTOcurrenceAccess().getLeftLifelineTLifelineEStringParserRuleCall_0_0_1(), semanticObject.getLeftLifeline());
		feeder.accept(grammarAccess.getTOcurrenceAccess().getOcurrenceTypeOcurrenceTypeEnumRuleCall_2_0(), semanticObject.getOcurrenceType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         static?='static'? 
	 *         visibility=Visibility 
	 *         partialReturnType?='|'? 
	 *         returnType=[Type|EString] 
	 *         partial?='|'? 
	 *         name=EString 
	 *         (parameters+=TParameter parameters+=TParameter*)?
	 *     )
	 */
	protected void sequence_TOperation(EObject context, TOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (partialType?='|'? type=[Type|EString] name=EString)
	 */
	protected void sequence_TParameter(EObject context, TParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString partialClass?='|'? reference=[TClass|EString])
	 */
	protected void sequence_TReference(EObject context, TReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     assignTo=[TMessageAssignableFeature|EString]
	 */
	protected void sequence_TReturnMessage(EObject context, TReturnMessage semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TextRamPackage.Literals.TABSTRACT_MESSAGE__ASSIGN_TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TextRamPackage.Literals.TABSTRACT_MESSAGE__ASSIGN_TO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTReturnMessageAccess().getAssignToTMessageAssignableFeatureEStringParserRuleCall_0_1(), semanticObject.getAssignTo());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((classes+=Classifier classes+=Classifier*)? (tAssociations+=TAssociation tAssociations+=TAssociation*)?)
	 */
	protected void sequence_TStructuralView(EObject context, TStructuralView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
