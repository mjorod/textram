package cl.uchile.pleiad.serializer;

import cl.uchile.pleiad.services.TextRAMGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class TextRAMSyntacticSequencer extends AbstractSyntacticSequencer {

	protected TextRAMGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Instantiation_SemicolonKeyword_1_2_0_q;
	protected AbstractElementAlias match_TAbstractMessageView_SemicolonKeyword_4_0_q;
	protected AbstractElementAlias match_TAspectMessageView_SemicolonKeyword_15_0_q;
	protected AbstractElementAlias match_TAspect_CommaKeyword_2_1_0_q;
	protected AbstractElementAlias match_TAspect_SemicolonKeyword_5_3_0_q;
	protected AbstractElementAlias match_TClass_SemicolonKeyword_7_1_0_q;
	protected AbstractElementAlias match_TLifeline_SemicolonKeyword_5_2_0_q;
	protected AbstractElementAlias match_TMessageView_CommaKeyword_11_2_0_q;
	protected AbstractElementAlias match_TMessageView_SemicolonKeyword_12_2_0_q;
	protected AbstractElementAlias match_TStructuralView_SemicolonKeyword_4_3_0_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TextRAMGrammarAccess) access;
		match_Instantiation_SemicolonKeyword_1_2_0_q = new TokenAlias(false, true, grammarAccess.getInstantiationAccess().getSemicolonKeyword_1_2_0());
		match_TAbstractMessageView_SemicolonKeyword_4_0_q = new TokenAlias(false, true, grammarAccess.getTAbstractMessageViewAccess().getSemicolonKeyword_4_0());
		match_TAspectMessageView_SemicolonKeyword_15_0_q = new TokenAlias(false, true, grammarAccess.getTAspectMessageViewAccess().getSemicolonKeyword_15_0());
		match_TAspect_CommaKeyword_2_1_0_q = new TokenAlias(false, true, grammarAccess.getTAspectAccess().getCommaKeyword_2_1_0());
		match_TAspect_SemicolonKeyword_5_3_0_q = new TokenAlias(false, true, grammarAccess.getTAspectAccess().getSemicolonKeyword_5_3_0());
		match_TClass_SemicolonKeyword_7_1_0_q = new TokenAlias(false, true, grammarAccess.getTClassAccess().getSemicolonKeyword_7_1_0());
		match_TLifeline_SemicolonKeyword_5_2_0_q = new TokenAlias(false, true, grammarAccess.getTLifelineAccess().getSemicolonKeyword_5_2_0());
		match_TMessageView_CommaKeyword_11_2_0_q = new TokenAlias(false, true, grammarAccess.getTMessageViewAccess().getCommaKeyword_11_2_0());
		match_TMessageView_SemicolonKeyword_12_2_0_q = new TokenAlias(false, true, grammarAccess.getTMessageViewAccess().getSemicolonKeyword_12_2_0());
		match_TStructuralView_SemicolonKeyword_4_3_0_q = new TokenAlias(false, true, grammarAccess.getTStructuralViewAccess().getSemicolonKeyword_4_3_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Instantiation_SemicolonKeyword_1_2_0_q.equals(syntax))
				emit_Instantiation_SemicolonKeyword_1_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TAbstractMessageView_SemicolonKeyword_4_0_q.equals(syntax))
				emit_TAbstractMessageView_SemicolonKeyword_4_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TAspectMessageView_SemicolonKeyword_15_0_q.equals(syntax))
				emit_TAspectMessageView_SemicolonKeyword_15_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TAspect_CommaKeyword_2_1_0_q.equals(syntax))
				emit_TAspect_CommaKeyword_2_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TAspect_SemicolonKeyword_5_3_0_q.equals(syntax))
				emit_TAspect_SemicolonKeyword_5_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TClass_SemicolonKeyword_7_1_0_q.equals(syntax))
				emit_TClass_SemicolonKeyword_7_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TLifeline_SemicolonKeyword_5_2_0_q.equals(syntax))
				emit_TLifeline_SemicolonKeyword_5_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TMessageView_CommaKeyword_11_2_0_q.equals(syntax))
				emit_TMessageView_CommaKeyword_11_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TMessageView_SemicolonKeyword_12_2_0_q.equals(syntax))
				emit_TMessageView_SemicolonKeyword_12_2_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TStructuralView_SemicolonKeyword_4_3_0_q.equals(syntax))
				emit_TStructuralView_SemicolonKeyword_4_3_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_Instantiation_SemicolonKeyword_1_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_TAbstractMessageView_SemicolonKeyword_4_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_TAspectMessageView_SemicolonKeyword_15_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_TAspect_CommaKeyword_2_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_TAspect_SemicolonKeyword_5_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_TClass_SemicolonKeyword_7_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_TLifeline_SemicolonKeyword_5_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_TMessageView_CommaKeyword_11_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_TMessageView_SemicolonKeyword_12_2_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ';'?
	 */
	protected void emit_TStructuralView_SemicolonKeyword_4_3_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
