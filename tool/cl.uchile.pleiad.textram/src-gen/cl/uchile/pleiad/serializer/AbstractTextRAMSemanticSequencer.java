package cl.uchile.pleiad.serializer;

import ca.mcgill.cs.sel.ram.Aspect;
import ca.mcgill.cs.sel.ram.AspectMessageView;
import ca.mcgill.cs.sel.ram.Association;
import ca.mcgill.cs.sel.ram.AssociationEnd;
import ca.mcgill.cs.sel.ram.Attribute;
import ca.mcgill.cs.sel.ram.AttributeMapping;
import ca.mcgill.cs.sel.ram.ClassifierMapping;
import ca.mcgill.cs.sel.ram.CombinedFragment;
import ca.mcgill.cs.sel.ram.Constraint;
import ca.mcgill.cs.sel.ram.DestructionOccurrenceSpecification;
import ca.mcgill.cs.sel.ram.ExecutionStatement;
import ca.mcgill.cs.sel.ram.Gate;
import ca.mcgill.cs.sel.ram.ImplementationClass;
import ca.mcgill.cs.sel.ram.Instantiation;
import ca.mcgill.cs.sel.ram.Interaction;
import ca.mcgill.cs.sel.ram.InteractionOperand;
import ca.mcgill.cs.sel.ram.Layout;
import ca.mcgill.cs.sel.ram.LayoutElement;
import ca.mcgill.cs.sel.ram.Lifeline;
import ca.mcgill.cs.sel.ram.LiteralBoolean;
import ca.mcgill.cs.sel.ram.LiteralInteger;
import ca.mcgill.cs.sel.ram.LiteralString;
import ca.mcgill.cs.sel.ram.Message;
import ca.mcgill.cs.sel.ram.MessageOccurrenceSpecification;
import ca.mcgill.cs.sel.ram.MessageView;
import ca.mcgill.cs.sel.ram.MessageViewReference;
import ca.mcgill.cs.sel.ram.OccurrenceSpecification;
import ca.mcgill.cs.sel.ram.OpaqueExpression;
import ca.mcgill.cs.sel.ram.Operation;
import ca.mcgill.cs.sel.ram.OperationMapping;
import ca.mcgill.cs.sel.ram.OriginalBehaviorExecution;
import ca.mcgill.cs.sel.ram.Parameter;
import ca.mcgill.cs.sel.ram.ParameterMapping;
import ca.mcgill.cs.sel.ram.ParameterValue;
import ca.mcgill.cs.sel.ram.ParameterValueMapping;
import ca.mcgill.cs.sel.ram.RAny;
import ca.mcgill.cs.sel.ram.RBoolean;
import ca.mcgill.cs.sel.ram.RChar;
import ca.mcgill.cs.sel.ram.RDouble;
import ca.mcgill.cs.sel.ram.REnum;
import ca.mcgill.cs.sel.ram.REnumLiteral;
import ca.mcgill.cs.sel.ram.RFloat;
import ca.mcgill.cs.sel.ram.RInt;
import ca.mcgill.cs.sel.ram.RSequence;
import ca.mcgill.cs.sel.ram.RSet;
import ca.mcgill.cs.sel.ram.RString;
import ca.mcgill.cs.sel.ram.RVoid;
import ca.mcgill.cs.sel.ram.RamPackage;
import ca.mcgill.cs.sel.ram.Reference;
import ca.mcgill.cs.sel.ram.State;
import ca.mcgill.cs.sel.ram.StateMachine;
import ca.mcgill.cs.sel.ram.StateView;
import ca.mcgill.cs.sel.ram.StructuralFeatureValue;
import ca.mcgill.cs.sel.ram.StructuralView;
import ca.mcgill.cs.sel.ram.Substitution;
import ca.mcgill.cs.sel.ram.Transition;
import ca.mcgill.cs.sel.ram.TransitionSubstitution;
import cl.uchile.pleiad.services.TextRAMGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.common.util.BasicEMap.Entry;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
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
public abstract class AbstractTextRAMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TextRAMGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EcorePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcorePackage.EOBJECT:
				if(context == grammarAccess.getEObjectRule()) {
					sequence_EObject(context, (EObject) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == RamPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RamPackage.ASPECT:
				if(context == grammarAccess.getAspectRule()) {
					sequence_Aspect(context, (Aspect) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.ASPECT_MESSAGE_VIEW:
				if(context == grammarAccess.getAbstractMessageViewRule() ||
				   context == grammarAccess.getAspectMessageViewRule()) {
					sequence_AspectMessageView(context, (AspectMessageView) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.ASSOCIATION:
				if(context == grammarAccess.getAssociationRule()) {
					sequence_Association(context, (Association) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.ASSOCIATION_END:
				if(context == grammarAccess.getAssociationEndRule() ||
				   context == grammarAccess.getStructuralFeatureRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_AssociationEnd(context, (AssociationEnd) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getStructuralFeatureRule() ||
				   context == grammarAccess.getTemporaryPropertyRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.ATTRIBUTE_MAPPING:
				if(context == grammarAccess.getAttributeMappingRule()) {
					sequence_AttributeMapping(context, (AttributeMapping) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.CLASS:
				if(context == grammarAccess.getClassRule() ||
				   context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_Class(context, (ca.mcgill.cs.sel.ram.Class) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.CLASSIFIER_MAPPING:
				if(context == grammarAccess.getClassifierMappingRule()) {
					sequence_ClassifierMapping(context, (ClassifierMapping) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.COMBINED_FRAGMENT:
				if(context == grammarAccess.getCombinedFragmentRule() ||
				   context == grammarAccess.getInteractionFragmentRule()) {
					sequence_CombinedFragment(context, (CombinedFragment) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.CONSTRAINT:
				if(context == grammarAccess.getConstraintRule()) {
					sequence_Constraint(context, (Constraint) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.CONTAINER_MAP:
				if(context == grammarAccess.getContainerMapRule()) {
					sequence_ContainerMap(context, (Entry<?, ?>) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.DESTRUCTION_OCCURRENCE_SPECIFICATION:
				if(context == grammarAccess.getDestructionOccurrenceSpecificationRule() ||
				   context == grammarAccess.getInteractionFragmentRule() ||
				   context == grammarAccess.getMessageEndRule()) {
					sequence_DestructionOccurrenceSpecification(context, (DestructionOccurrenceSpecification) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.ELEMENT_MAP:
				if(context == grammarAccess.getElementMapRule()) {
					sequence_ElementMap(context, (Entry<?, ?>) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.EXECUTION_STATEMENT:
				if(context == grammarAccess.getExecutionStatementRule() ||
				   context == grammarAccess.getInteractionFragmentRule()) {
					sequence_ExecutionStatement(context, (ExecutionStatement) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.GATE:
				if(context == grammarAccess.getGateRule() ||
				   context == grammarAccess.getMessageEndRule()) {
					sequence_Gate(context, (Gate) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.IMPLEMENTATION_CLASS:
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getImplementationClass_ImplRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_ImplementationClass_Impl(context, (ImplementationClass) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.INSTANTIATION:
				if(context == grammarAccess.getInstantiationRule()) {
					sequence_Instantiation(context, (Instantiation) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.INTERACTION:
				if(context == grammarAccess.getInteractionRule()) {
					sequence_Interaction(context, (Interaction) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.INTERACTION_OPERAND:
				if(context == grammarAccess.getInteractionOperandRule()) {
					sequence_InteractionOperand(context, (InteractionOperand) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.LAYOUT:
				if(context == grammarAccess.getLayoutRule()) {
					sequence_Layout(context, (Layout) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.LAYOUT_ELEMENT:
				if(context == grammarAccess.getLayoutElementRule()) {
					sequence_LayoutElement(context, (LayoutElement) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.LIFELINE:
				if(context == grammarAccess.getLifelineRule()) {
					sequence_Lifeline(context, (Lifeline) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.LITERAL_BOOLEAN:
				if(context == grammarAccess.getLiteralBooleanRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_LiteralBoolean(context, (LiteralBoolean) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.LITERAL_INTEGER:
				if(context == grammarAccess.getLiteralIntegerRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_LiteralInteger(context, (LiteralInteger) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.LITERAL_STRING:
				if(context == grammarAccess.getLiteralStringRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_LiteralString(context, (LiteralString) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.MESSAGE:
				if(context == grammarAccess.getMessageRule()) {
					sequence_Message(context, (Message) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.MESSAGE_OCCURRENCE_SPECIFICATION:
				if(context == grammarAccess.getInteractionFragmentRule() ||
				   context == grammarAccess.getMessageEndRule() ||
				   context == grammarAccess.getMessageOccurrenceSpecification_ImplRule()) {
					sequence_MessageOccurrenceSpecification_Impl(context, (MessageOccurrenceSpecification) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.MESSAGE_VIEW:
				if(context == grammarAccess.getAbstractMessageViewRule() ||
				   context == grammarAccess.getMessageViewRule()) {
					sequence_MessageView(context, (MessageView) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.MESSAGE_VIEW_REFERENCE:
				if(context == grammarAccess.getAbstractMessageViewRule() ||
				   context == grammarAccess.getMessageViewReferenceRule()) {
					sequence_MessageViewReference(context, (MessageViewReference) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.OCCURRENCE_SPECIFICATION:
				if(context == grammarAccess.getInteractionFragmentRule() ||
				   context == grammarAccess.getOccurrenceSpecification_ImplRule()) {
					sequence_OccurrenceSpecification_Impl(context, (OccurrenceSpecification) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.OPAQUE_EXPRESSION:
				if(context == grammarAccess.getOpaqueExpressionRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_OpaqueExpression(context, (OpaqueExpression) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.OPERATION:
				if(context == grammarAccess.getOperationRule()) {
					sequence_Operation(context, (Operation) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.OPERATION_MAPPING:
				if(context == grammarAccess.getOperationMappingRule()) {
					sequence_OperationMapping(context, (OperationMapping) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.ORIGINAL_BEHAVIOR_EXECUTION:
				if(context == grammarAccess.getInteractionFragmentRule() ||
				   context == grammarAccess.getOriginalBehaviorExecutionRule()) {
					sequence_OriginalBehaviorExecution(context, (OriginalBehaviorExecution) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.PARAMETER_MAPPING:
				if(context == grammarAccess.getParameterMappingRule()) {
					sequence_ParameterMapping(context, (ParameterMapping) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.PARAMETER_VALUE:
				if(context == grammarAccess.getParameterValueRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_ParameterValue(context, (ParameterValue) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.PARAMETER_VALUE_MAPPING:
				if(context == grammarAccess.getParameterValueMappingRule()) {
					sequence_ParameterValueMapping(context, (ParameterValueMapping) semanticObject); 
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
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRBooleanRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RBoolean(context, (RBoolean) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RCHAR:
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRCharRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RChar(context, (RChar) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RDOUBLE:
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRDoubleRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RDouble(context, (RDouble) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RENUM:
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getREnumRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_REnum(context, (REnum) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RENUM_LITERAL:
				if(context == grammarAccess.getREnumLiteralRule()) {
					sequence_REnumLiteral(context, (REnumLiteral) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RFLOAT:
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRFloatRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RFloat(context, (RFloat) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RINT:
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getPrimitiveTypeRule() ||
				   context == grammarAccess.getRIntRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RInt(context, (RInt) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RSEQUENCE:
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getRSequenceRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RSequence(context, (RSequence) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RSET:
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
				   context == grammarAccess.getRSetRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RSet(context, (RSet) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.RSTRING:
				if(context == grammarAccess.getClassifierRule() ||
				   context == grammarAccess.getObjectTypeRule() ||
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
			case RamPackage.REFERENCE:
				if(context == grammarAccess.getReferenceRule() ||
				   context == grammarAccess.getStructuralFeatureRule() ||
				   context == grammarAccess.getTemporaryPropertyRule() ||
				   context == grammarAccess.getTypedElementRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.STATE:
				if(context == grammarAccess.getStateRule()) {
					sequence_State(context, (State) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.STATE_MACHINE:
				if(context == grammarAccess.getStateMachineRule()) {
					sequence_StateMachine(context, (StateMachine) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.STATE_VIEW:
				if(context == grammarAccess.getStateViewRule()) {
					sequence_StateView(context, (StateView) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.STRUCTURAL_FEATURE_VALUE:
				if(context == grammarAccess.getStructuralFeatureValueRule() ||
				   context == grammarAccess.getValueSpecificationRule()) {
					sequence_StructuralFeatureValue(context, (StructuralFeatureValue) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.STRUCTURAL_VIEW:
				if(context == grammarAccess.getStructuralViewRule()) {
					sequence_StructuralView(context, (StructuralView) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.SUBSTITUTION:
				if(context == grammarAccess.getSubstitutionRule() ||
				   context == grammarAccess.getSubstitution_ImplRule()) {
					sequence_Substitution_Impl(context, (Substitution) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.TRANSITION:
				if(context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			case RamPackage.TRANSITION_SUBSTITUTION:
				if(context == grammarAccess.getSubstitutionRule() ||
				   context == grammarAccess.getTransitionSubstitutionRule()) {
					sequence_TransitionSubstitution(context, (TransitionSubstitution) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (affectedBy+=[AspectMessageView|EString] affectedBy+=[AspectMessageView|EString]*)? 
	 *         pointcut=[Operation|EString] 
	 *         advice=Interaction
	 *     )
	 */
	protected void sequence_AspectMessageView(EObject context, AspectMessageView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         structuralView=StructuralView 
	 *         (messageViews+=AbstractMessageView messageViews+=AbstractMessageView*)? 
	 *         (instantiations+=Instantiation instantiations+=Instantiation*)? 
	 *         layout=Layout? 
	 *         (stateViews+=StateView stateViews+=StateView*)?
	 *     )
	 */
	protected void sequence_Aspect(EObject context, Aspect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         static?='static' 
	 *         name=EString 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         referenceType=ReferenceType? 
	 *         navigable=EBoolean? 
	 *         assoc=[Association|EString]
	 *     )
	 */
	protected void sequence_AssociationEnd(EObject context, AssociationEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString ends+=[AssociationEnd|EString] ends+=[AssociationEnd|EString]*)
	 */
	protected void sequence_Association(EObject context, Association semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fromElement=[Attribute|EString] toElement=[Attribute|EString])
	 */
	protected void sequence_AttributeMapping(EObject context, AttributeMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.ATTRIBUTE_MAPPING__FROM_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.ATTRIBUTE_MAPPING__FROM_ELEMENT));
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.ATTRIBUTE_MAPPING__TO_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.ATTRIBUTE_MAPPING__TO_ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeMappingAccess().getFromElementAttributeEStringParserRuleCall_3_0_1(), semanticObject.getFromElement());
		feeder.accept(grammarAccess.getAttributeMappingAccess().getToElementAttributeEStringParserRuleCall_5_0_1(), semanticObject.getToElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (static?='static' name=EString type=[PrimitiveType|EString])
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.STRUCTURAL_FEATURE__STATIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.STRUCTURAL_FEATURE__STATIC));
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.ATTRIBUTE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_0(), semanticObject.isStatic());
		feeder.accept(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypePrimitiveTypeEStringParserRuleCall_5_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         partial?='partial'? 
	 *         abstract?='abstract'? 
	 *         name=EString 
	 *         (superTypes+=[Classifier|EString] superTypes+=[Classifier|EString]*)? 
	 *         (operations+=Operation operations+=Operation*)? 
	 *         (associationEnds+=AssociationEnd associationEnds+=AssociationEnd*)? 
	 *         (attributes+=Attribute attributes+=Attribute*)?
	 *     )
	 */
	protected void sequence_Class(EObject context, ca.mcgill.cs.sel.ram.Class semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         fromElement=[Classifier|EString] 
	 *         toElement=[Classifier|EString] 
	 *         (operationMappings+=OperationMapping operationMappings+=OperationMapping*)? 
	 *         (attributeMappings+=AttributeMapping attributeMappings+=AttributeMapping*)?
	 *     )
	 */
	protected void sequence_ClassifierMapping(EObject context, ClassifierMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         interactionOperator=InteractionOperatorKind 
	 *         covered+=[Lifeline|EString] 
	 *         covered+=[Lifeline|EString]* 
	 *         operands+=InteractionOperand 
	 *         operands+=InteractionOperand*
	 *     )
	 */
	protected void sequence_CombinedFragment(EObject context, CombinedFragment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     Specification=ValueSpecification
	 */
	protected void sequence_Constraint(EObject context, Constraint semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.CONSTRAINT__SPECIFICATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.CONSTRAINT__SPECIFICATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstraintAccess().getSpecificationValueSpecificationParserRuleCall_3_0(), semanticObject.getSpecification());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=[EObject|EString] value+=ElementMap value+=ElementMap*)
	 */
	protected void sequence_ContainerMap(EObject context, Entry<?, ?> semanticObject) {
		genericSequencer.createSequence(context, (EObject)semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (covered+=[Lifeline|EString] covered+=[Lifeline|EString]* message=[Message|EString])
	 */
	protected void sequence_DestructionOccurrenceSpecification(EObject context, DestructionOccurrenceSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {EObject}
	 */
	protected void sequence_EObject(EObject context, EObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (key=[EObject|EString] value=LayoutElement)
	 */
	protected void sequence_ElementMap(EObject context, Entry<?, ?> semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient((EObject)semanticObject, RamPackage.Literals.ELEMENT_MAP__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RamPackage.Literals.ELEMENT_MAP__KEY));
			if(transientValues.isValueTransient((EObject)semanticObject, RamPackage.Literals.ELEMENT_MAP__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing((EObject)semanticObject, RamPackage.Literals.ELEMENT_MAP__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider((EObject)semanticObject);
		SequenceFeeder feeder = createSequencerFeeder((EObject)semanticObject, nodes);
		feeder.accept(grammarAccess.getElementMapAccess().getKeyEObjectEStringParserRuleCall_3_0_1(), semanticObject.getKey());
		feeder.accept(grammarAccess.getElementMapAccess().getValueLayoutElementParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (covered+=[Lifeline|EString] covered+=[Lifeline|EString]* specification=ValueSpecification)
	 */
	protected void sequence_ExecutionStatement(EObject context, ExecutionStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString message=[Message|EString])
	 */
	protected void sequence_Gate(EObject context, Gate semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.MESSAGE_END__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.MESSAGE_END__MESSAGE));
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGateAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getGateAccess().getMessageMessageEStringParserRuleCall_4_0_1(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString instanceClassName=EString (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_ImplementationClass_Impl(EObject context, ImplementationClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=InstantiationType externalAspect=[Aspect|EString] (mappings+=ClassifierMapping mappings+=ClassifierMapping*)?)
	 */
	protected void sequence_Instantiation(EObject context, Instantiation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fragments+=InteractionFragment fragments+=InteractionFragment* interactionConstraint=ValueSpecification?)
	 */
	protected void sequence_InteractionOperand(EObject context, InteractionOperand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         fragments+=InteractionFragment 
	 *         fragments+=InteractionFragment* 
	 *         lifelines+=Lifeline 
	 *         lifelines+=Lifeline* 
	 *         messages+=Message 
	 *         messages+=Message* 
	 *         (properties+=Reference properties+=Reference*)? 
	 *         (formalGates+=Gate formalGates+=Gate*)?
	 *     )
	 */
	protected void sequence_Interaction(EObject context, Interaction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x=EFloat y=EFloat)
	 */
	protected void sequence_LayoutElement(EObject context, LayoutElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.LAYOUT_ELEMENT__X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.LAYOUT_ELEMENT__X));
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.LAYOUT_ELEMENT__Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.LAYOUT_ELEMENT__Y));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLayoutElementAccess().getXEFloatParserRuleCall_3_0(), semanticObject.getX());
		feeder.accept(grammarAccess.getLayoutElementAccess().getYEFloatParserRuleCall_5_0(), semanticObject.getY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (containers+=ContainerMap containers+=ContainerMap*)
	 */
	protected void sequence_Layout(EObject context, Layout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         represents=[TypedElement|EString] 
	 *         coveredBy+=[InteractionFragment|EString] 
	 *         coveredBy+=[InteractionFragment|EString]* 
	 *         (localProperties+=TemporaryProperty localProperties+=TemporaryProperty*)?
	 *     )
	 */
	protected void sequence_Lifeline(EObject context, Lifeline semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value?='value'
	 */
	protected void sequence_LiteralBoolean(EObject context, LiteralBoolean semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.LITERAL_BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.LITERAL_BOOLEAN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralBooleanAccess().getValueValueKeyword_0_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EInt
	 */
	protected void sequence_LiteralInteger(EObject context, LiteralInteger semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.LITERAL_INTEGER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.LITERAL_INTEGER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralIntegerAccess().getValueEIntParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_LiteralString(EObject context, LiteralString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.LITERAL_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.LITERAL_STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralStringAccess().getValueEStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (covered+=[Lifeline|EString] covered+=[Lifeline|EString]* message=[Message|EString])
	 */
	protected void sequence_MessageOccurrenceSpecification_Impl(EObject context, MessageOccurrenceSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((affectedBy+=[AspectMessageView|EString] affectedBy+=[AspectMessageView|EString]*)? references=[MessageView|EString])
	 */
	protected void sequence_MessageViewReference(EObject context, MessageViewReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((affectedBy+=[AspectMessageView|EString] affectedBy+=[AspectMessageView|EString]*)? specifies=[Operation|EString] specification=Interaction?)
	 */
	protected void sequence_MessageView(EObject context, MessageView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         messageSort=MessageSort 
	 *         sendEvent=[MessageEnd|EString] 
	 *         receiveEvent=[MessageEnd|EString] 
	 *         signature=[Operation|EString] 
	 *         assignTo=[StructuralFeature|EString]? 
	 *         (arguments+=ParameterValueMapping arguments+=ParameterValueMapping*)? 
	 *         returns=ValueSpecification?
	 *     )
	 */
	protected void sequence_Message(EObject context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (covered+=[Lifeline|EString] covered+=[Lifeline|EString]*)
	 */
	protected void sequence_OccurrenceSpecification_Impl(EObject context, OccurrenceSpecification semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body=EString language=EString)
	 */
	protected void sequence_OpaqueExpression(EObject context, OpaqueExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.OPAQUE_EXPRESSION__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.OPAQUE_EXPRESSION__BODY));
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.OPAQUE_EXPRESSION__LANGUAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.OPAQUE_EXPRESSION__LANGUAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOpaqueExpressionAccess().getBodyEStringParserRuleCall_3_0(), semanticObject.getBody());
		feeder.accept(grammarAccess.getOpaqueExpressionAccess().getLanguageEStringParserRuleCall_5_0(), semanticObject.getLanguage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fromElement=[Operation|EString] toElement=[Operation|EString] (parameterMappings+=ParameterMapping parameterMappings+=ParameterMapping*)?)
	 */
	protected void sequence_OperationMapping(EObject context, OperationMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         static?='static'? 
	 *         partial?='partial'? 
	 *         name=EString 
	 *         visibility=Visibility? 
	 *         returnType=[Type|EString] 
	 *         (parameters+=Parameter parameters+=Parameter*)?
	 *     )
	 */
	protected void sequence_Operation(EObject context, Operation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (covered+=[Lifeline|EString] covered+=[Lifeline|EString]*)
	 */
	protected void sequence_OriginalBehaviorExecution(EObject context, OriginalBehaviorExecution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fromElement=[Parameter|EString] toElement=[Parameter|EString])
	 */
	protected void sequence_ParameterMapping(EObject context, ParameterMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.PARAMETER_MAPPING__FROM_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.PARAMETER_MAPPING__FROM_ELEMENT));
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.PARAMETER_MAPPING__TO_ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.PARAMETER_MAPPING__TO_ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterMappingAccess().getFromElementParameterEStringParserRuleCall_3_0_1(), semanticObject.getFromElement());
		feeder.accept(grammarAccess.getParameterMappingAccess().getToElementParameterEStringParserRuleCall_5_0_1(), semanticObject.getToElement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=[Parameter|EString] value=ValueSpecification)
	 */
	protected void sequence_ParameterValueMapping(EObject context, ParameterValueMapping semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.PARAMETER_VALUE_MAPPING__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.PARAMETER_VALUE_MAPPING__PARAMETER));
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.PARAMETER_VALUE_MAPPING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.PARAMETER_VALUE_MAPPING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterValueMappingAccess().getParameterParameterEStringParserRuleCall_3_0_1(), semanticObject.getParameter());
		feeder.accept(grammarAccess.getParameterValueMappingAccess().getValueValueSpecificationParserRuleCall_5_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     parameter=[Parameter|EString]
	 */
	protected void sequence_ParameterValue(EObject context, ParameterValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.PARAMETER_VALUE__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.PARAMETER_VALUE__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterValueAccess().getParameterParameterEStringParserRuleCall_3_0_1(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=[Type|EString])
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.PARAMETER__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeEStringParserRuleCall_4_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_RAny(EObject context, RAny semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRAnyAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString instanceClassName=EString (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_RBoolean(EObject context, RBoolean semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString instanceClassName=EString (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_RChar(EObject context, RChar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString instanceClassName=EString (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_RDouble(EObject context, RDouble semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_REnumLiteral(EObject context, REnumLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString instanceClassName=EString (operations+=Operation operations+=Operation*)? literals+=REnumLiteral literals+=REnumLiteral*)
	 */
	protected void sequence_REnum(EObject context, REnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString instanceClassName=EString (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_RFloat(EObject context, RFloat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString instanceClassName=EString (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_RInt(EObject context, RInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString instanceClassName=EString type=[ObjectType|EString] (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_RSequence(EObject context, RSequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString instanceClassName=EString type=[ObjectType|EString] (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_RSet(EObject context, RSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString instanceClassName=EString (operations+=Operation operations+=Operation*)?)
	 */
	protected void sequence_RString(EObject context, RString semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_RVoid(EObject context, RVoid semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.NAMED_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRVoidAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         static?='static' 
	 *         name=EString 
	 *         lowerBound=EInt? 
	 *         upperBound=EInt? 
	 *         referenceType=ReferenceType? 
	 *         type=[ObjectType|EString]
	 *     )
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         start=[State|EString] 
	 *         (states+=State states+=State*)? 
	 *         (transitions+=Transition transitions+=Transition*)? 
	 *         (substitutions+=Substitution substitutions+=Substitution*)?
	 *     )
	 */
	protected void sequence_StateMachine(EObject context, StateMachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString specifies=[Classifier|EString] stateMachines+=StateMachine stateMachines+=StateMachine*)
	 */
	protected void sequence_StateView(EObject context, StateView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         (incomings+=[Transition|EString] incomings+=[Transition|EString]*)? 
	 *         (outgoings+=[Transition|EString] outgoings+=[Transition|EString]*)?
	 *     )
	 */
	protected void sequence_State(EObject context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[StructuralFeature|EString]
	 */
	protected void sequence_StructuralFeatureValue(EObject context, StructuralFeatureValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RamPackage.Literals.STRUCTURAL_FEATURE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RamPackage.Literals.STRUCTURAL_FEATURE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStructuralFeatureValueAccess().getValueStructuralFeatureEStringParserRuleCall_3_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((classes+=Classifier classes+=Classifier*)? (associations+=Association associations+=Association*)? (types+=Type types+=Type*)?)
	 */
	protected void sequence_StructuralView(EObject context, StructuralView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Substitution}
	 */
	protected void sequence_Substitution_Impl(EObject context, Substitution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (from=[Transition|EString] to+=[Transition|EString] to+=[Transition|EString]*)
	 */
	protected void sequence_TransitionSubstitution(EObject context, TransitionSubstitution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString endState=[State|EString] startState=[State|EString] signature=[Operation|EString]? guard=Constraint?)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
