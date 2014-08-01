/**
 * generated by Xtext
 */
package cl.uchile.pleiad.formatting;

import cl.uchile.pleiad.services.TextRAMGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
@SuppressWarnings("all")
public class TextRAMFormatter extends AbstractDeclarativeFormatter {
  @Inject
  private TextRAMGrammarAccess g;
  
  protected void configureFormatting(final FormattingConfig c) {
    final IGrammarAccess f = this.getGrammarAccess();
    List<Keyword> _findKeywords = f.findKeywords("{");
    final Procedure1<Keyword> _function = new Procedure1<Keyword>() {
      public void apply(final Keyword k) {
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap();
        _setLinewrap.after(k);
      }
    };
    IterableExtensions.<Keyword>forEach(_findKeywords, _function);
    List<Keyword> _findKeywords_1 = f.findKeywords("}");
    final Procedure1<Keyword> _function_1 = new Procedure1<Keyword>() {
      public void apply(final Keyword k) {
        FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap();
        _setLinewrap.before(k);
        FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap();
        _setLinewrap_1.after(k);
      }
    };
    IterableExtensions.<Keyword>forEach(_findKeywords_1, _function_1);
    List<Pair<Keyword,Keyword>> _findKeywordPairs = f.findKeywordPairs("(", ")");
    final Procedure1<Pair<Keyword,Keyword>> _function_2 = new Procedure1<Pair<Keyword,Keyword>>() {
      public void apply(final Pair<Keyword,Keyword> pair) {
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        Keyword _first = pair.getFirst();
        _setNoSpace.after(_first);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        Keyword _first_1 = pair.getFirst();
        _setNoSpace_1.before(_first_1);
        FormattingConfig.NoSpaceLocator _setNoSpace_2 = c.setNoSpace();
        Keyword _second = pair.getSecond();
        _setNoSpace_2.before(_second);
      }
    };
    IterableExtensions.<Pair<Keyword,Keyword>>forEach(_findKeywordPairs, _function_2);
    List<Keyword> _findKeywords_2 = f.findKeywords("|");
    final Procedure1<Keyword> _function_3 = new Procedure1<Keyword>() {
      public void apply(final Keyword k) {
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.after(k);
      }
    };
    IterableExtensions.<Keyword>forEach(_findKeywords_2, _function_3);
    List<Keyword> _findKeywords_3 = f.findKeywords(".");
    final Procedure1<Keyword> _function_4 = new Procedure1<Keyword>() {
      public void apply(final Keyword k) {
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.after(k);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        _setNoSpace_1.before(k);
      }
    };
    IterableExtensions.<Keyword>forEach(_findKeywords_3, _function_4);
    TextRAMGrammarAccess.TAspectElements _tAspectAccess = this.g.getTAspectAccess();
    Keyword _leftCurlyBracketKeyword_3 = _tAspectAccess.getLeftCurlyBracketKeyword_3();
    TextRAMGrammarAccess.TAspectElements _tAspectAccess_1 = this.g.getTAspectAccess();
    Keyword _rightCurlyBracketKeyword_5_4 = _tAspectAccess_1.getRightCurlyBracketKeyword_5_4();
    c.setIndentation(_leftCurlyBracketKeyword_3, _rightCurlyBracketKeyword_5_4);
    TextRAMGrammarAccess.TStructuralViewElements _tStructuralViewAccess = this.g.getTStructuralViewAccess();
    Keyword _leftCurlyBracketKeyword_2 = _tStructuralViewAccess.getLeftCurlyBracketKeyword_2();
    TextRAMGrammarAccess.TStructuralViewElements _tStructuralViewAccess_1 = this.g.getTStructuralViewAccess();
    Keyword _rightCurlyBracketKeyword_4_4 = _tStructuralViewAccess_1.getRightCurlyBracketKeyword_4_4();
    c.setIndentation(_leftCurlyBracketKeyword_2, _rightCurlyBracketKeyword_4_4);
    TextRAMGrammarAccess.TClassElements _tClassAccess = this.g.getTClassAccess();
    Keyword _leftCurlyBracketKeyword_8 = _tClassAccess.getLeftCurlyBracketKeyword_8();
    TextRAMGrammarAccess.TClassElements _tClassAccess_1 = this.g.getTClassAccess();
    Keyword _rightCurlyBracketKeyword_10 = _tClassAccess_1.getRightCurlyBracketKeyword_10();
    c.setIndentation(_leftCurlyBracketKeyword_8, _rightCurlyBracketKeyword_10);
    FormattingConfig.LinewrapLocator _setLinewrap = c.setLinewrap();
    TextRAMGrammarAccess.TClassMemberElements _tClassMemberAccess = this.g.getTClassMemberAccess();
    RuleCall _tAttributeParserRuleCall_0 = _tClassMemberAccess.getTAttributeParserRuleCall_0();
    _setLinewrap.before(_tAttributeParserRuleCall_0);
    FormattingConfig.LinewrapLocator _setLinewrap_1 = c.setLinewrap();
    TextRAMGrammarAccess.TClassMemberElements _tClassMemberAccess_1 = this.g.getTClassMemberAccess();
    RuleCall _tOperationParserRuleCall_1 = _tClassMemberAccess_1.getTOperationParserRuleCall_1();
    _setLinewrap_1.before(_tOperationParserRuleCall_1);
    FormattingConfig.NoLinewrapLocator _setNoLinewrap = c.setNoLinewrap();
    TextRAMGrammarAccess.TAssociationElements _tAssociationAccess = this.g.getTAssociationAccess();
    Keyword _leftCurlyBracketKeyword_5 = _tAssociationAccess.getLeftCurlyBracketKeyword_5();
    _setNoLinewrap.after(_leftCurlyBracketKeyword_5);
    FormattingConfig.NoLinewrapLocator _setNoLinewrap_1 = c.setNoLinewrap();
    TextRAMGrammarAccess.TAssociationElements _tAssociationAccess_1 = this.g.getTAssociationAccess();
    Keyword _rightCurlyBracketKeyword_7 = _tAssociationAccess_1.getRightCurlyBracketKeyword_7();
    _setNoLinewrap_1.before(_rightCurlyBracketKeyword_7);
    TextRAMGrammarAccess.TStructuralViewElements _tStructuralViewAccess_2 = this.g.getTStructuralViewAccess();
    Keyword _leftCurlyBracketKeyword_4_1 = _tStructuralViewAccess_2.getLeftCurlyBracketKeyword_4_1();
    TextRAMGrammarAccess.TStructuralViewElements _tStructuralViewAccess_3 = this.g.getTStructuralViewAccess();
    Keyword _rightCurlyBracketKeyword_5 = _tStructuralViewAccess_3.getRightCurlyBracketKeyword_5();
    c.setIndentation(_leftCurlyBracketKeyword_4_1, _rightCurlyBracketKeyword_5);
    TextRAMGrammarAccess.TAspectElements _tAspectAccess_2 = this.g.getTAspectAccess();
    Keyword _leftCurlyBracketKeyword_6_1 = _tAspectAccess_2.getLeftCurlyBracketKeyword_6_1();
    TextRAMGrammarAccess.TAspectElements _tAspectAccess_3 = this.g.getTAspectAccess();
    Keyword _rightCurlyBracketKeyword_7_1 = _tAspectAccess_3.getRightCurlyBracketKeyword_7();
    c.setIndentation(_leftCurlyBracketKeyword_6_1, _rightCurlyBracketKeyword_7_1);
    TextRAMGrammarAccess.TAbstractMessageViewElements _tAbstractMessageViewAccess = this.g.getTAbstractMessageViewAccess();
    Keyword _leftCurlyBracketKeyword_2_1 = _tAbstractMessageViewAccess.getLeftCurlyBracketKeyword_2();
    TextRAMGrammarAccess.TAbstractMessageViewElements _tAbstractMessageViewAccess_1 = this.g.getTAbstractMessageViewAccess();
    Keyword _rightCurlyBracketKeyword_5_1 = _tAbstractMessageViewAccess_1.getRightCurlyBracketKeyword_5();
    c.setIndentation(_leftCurlyBracketKeyword_2_1, _rightCurlyBracketKeyword_5_1);
    TextRAMGrammarAccess.TLifelineElements _tLifelineAccess = this.g.getTLifelineAccess();
    Keyword _leftCurlyBracketKeyword_5_0 = _tLifelineAccess.getLeftCurlyBracketKeyword_5_0();
    TextRAMGrammarAccess.TLifelineElements _tLifelineAccess_1 = this.g.getTLifelineAccess();
    Keyword _rightCurlyBracketKeyword_5_3 = _tLifelineAccess_1.getRightCurlyBracketKeyword_5_3();
    c.setIndentation(_leftCurlyBracketKeyword_5_0, _rightCurlyBracketKeyword_5_3);
    TextRAMGrammarAccess.TLifelineElements _tLifelineAccess_2 = this.g.getTLifelineAccess();
    List<Keyword> _findKeywords_4 = _tLifelineAccess_2.findKeywords(":");
    final Procedure1<Keyword> _function_5 = new Procedure1<Keyword>() {
      public void apply(final Keyword k) {
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(k);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        _setNoSpace_1.after(k);
      }
    };
    IterableExtensions.<Keyword>forEach(_findKeywords_4, _function_5);
    FormattingConfig.LinewrapLocator _setLinewrap_2 = c.setLinewrap();
    TextRAMGrammarAccess.TLifelineElements _tLifelineAccess_3 = this.g.getTLifelineAccess();
    Assignment _referenceTypeAssignment_1 = _tLifelineAccess_3.getReferenceTypeAssignment_1();
    _setLinewrap_2.before(_referenceTypeAssignment_1);
    FormattingConfig.NoLinewrapLocator _setNoLinewrap_2 = c.setNoLinewrap();
    TextRAMGrammarAccess.TLifelineElements _tLifelineAccess_4 = this.g.getTLifelineAccess();
    Assignment _staticAssignment_0 = _tLifelineAccess_4.getStaticAssignment_0();
    _setNoLinewrap_2.after(_staticAssignment_0);
    FormattingConfig.LinewrapLocator _setLinewrap_3 = c.setLinewrap();
    TextRAMGrammarAccess.TLifelineElements _tLifelineAccess_5 = this.g.getTLifelineAccess();
    Assignment _localPropertiesAssignment_5_2_1 = _tLifelineAccess_5.getLocalPropertiesAssignment_5_2_1();
    _setLinewrap_3.before(_localPropertiesAssignment_5_2_1);
    TextRAMGrammarAccess.TReferenceElements _tReferenceAccess = this.g.getTReferenceAccess();
    List<Keyword> _findKeywords_5 = _tReferenceAccess.findKeywords(":");
    final Procedure1<Keyword> _function_6 = new Procedure1<Keyword>() {
      public void apply(final Keyword k) {
        FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
        _setNoSpace.before(k);
        FormattingConfig.NoSpaceLocator _setNoSpace_1 = c.setNoSpace();
        _setNoSpace_1.after(k);
      }
    };
    IterableExtensions.<Keyword>forEach(_findKeywords_5, _function_6);
    TextRAMGrammarAccess.TAspectMessageViewElements _tAspectMessageViewAccess = this.g.getTAspectMessageViewAccess();
    Keyword _leftCurlyBracketKeyword_3_1 = _tAspectMessageViewAccess.getLeftCurlyBracketKeyword_3();
    TextRAMGrammarAccess.TAspectMessageViewElements _tAspectMessageViewAccess_1 = this.g.getTAspectMessageViewAccess();
    Keyword _rightCurlyBracketKeyword_17 = _tAspectMessageViewAccess_1.getRightCurlyBracketKeyword_17();
    c.setIndentation(_leftCurlyBracketKeyword_3_1, _rightCurlyBracketKeyword_17);
    TextRAMGrammarAccess.TAspectMessageViewElements _tAspectMessageViewAccess_2 = this.g.getTAspectMessageViewAccess();
    Keyword _leftCurlyBracketKeyword_13 = _tAspectMessageViewAccess_2.getLeftCurlyBracketKeyword_13();
    TextRAMGrammarAccess.TAspectMessageViewElements _tAspectMessageViewAccess_3 = this.g.getTAspectMessageViewAccess();
    Keyword _rightCurlyBracketKeyword_16 = _tAspectMessageViewAccess_3.getRightCurlyBracketKeyword_16();
    c.setIndentation(_leftCurlyBracketKeyword_13, _rightCurlyBracketKeyword_16);
    FormattingConfig.LinewrapLocator _setLinewrap_4 = c.setLinewrap();
    TextRAMGrammarAccess.TAspectMessageViewElements _tAspectMessageViewAccess_4 = this.g.getTAspectMessageViewAccess();
    Keyword _adviceKeyword_12 = _tAspectMessageViewAccess_4.getAdviceKeyword_12();
    _setLinewrap_4.before(_adviceKeyword_12);
    FormattingConfig.LinewrapLocator _setLinewrap_5 = c.setLinewrap();
    TextRAMGrammarAccess.TOcurrenceElements _tOcurrenceAccess = this.g.getTOcurrenceAccess();
    Assignment _leftLifelineAssignment_0 = _tOcurrenceAccess.getLeftLifelineAssignment_0();
    _setLinewrap_5.before(_leftLifelineAssignment_0);
    FormattingConfig.LinewrapLocator _setLinewrap_6 = c.setLinewrap();
    TextRAMGrammarAccess.TInteractionMessageElements _tInteractionMessageAccess = this.g.getTInteractionMessageAccess();
    Assignment _leftLifelineAssignment_0_1 = _tInteractionMessageAccess.getLeftLifelineAssignment_0();
    _setLinewrap_6.before(_leftLifelineAssignment_0_1);
    FormattingConfig.LinewrapLocator _setLinewrap_7 = c.setLinewrap();
    TextRAMGrammarAccess.TCombinedFragmentElements _tCombinedFragmentAccess = this.g.getTCombinedFragmentAccess();
    Assignment _interactionOperatorAssignment_0 = _tCombinedFragmentAccess.getInteractionOperatorAssignment_0();
    _setLinewrap_7.before(_interactionOperatorAssignment_0);
    FormattingConfig.LinewrapLocator _setLinewrap_8 = c.setLinewrap();
    TextRAMGrammarAccess.TReturnInteractionElements _tReturnInteractionAccess = this.g.getTReturnInteractionAccess();
    Keyword _returnKeyword_0 = _tReturnInteractionAccess.getReturnKeyword_0();
    _setLinewrap_8.before(_returnKeyword_0);
    FormattingConfig.NoLinewrapLocator _setNoLinewrap_3 = c.setNoLinewrap();
    TextRAMGrammarAccess.TInteractionMessageElements _tInteractionMessageAccess_1 = this.g.getTInteractionMessageAccess();
    Keyword _leftCurlyBracketKeyword_4_0 = _tInteractionMessageAccess_1.getLeftCurlyBracketKeyword_4_0();
    _setNoLinewrap_3.after(_leftCurlyBracketKeyword_4_0);
    FormattingConfig.NoLinewrapLocator _setNoLinewrap_4 = c.setNoLinewrap();
    TextRAMGrammarAccess.TInteractionMessageElements _tInteractionMessageAccess_2 = this.g.getTInteractionMessageAccess();
    Keyword _rightCurlyBracketKeyword_4_2 = _tInteractionMessageAccess_2.getRightCurlyBracketKeyword_4_2();
    _setNoLinewrap_4.before(_rightCurlyBracketKeyword_4_2);
    TextRAMGrammarAccess.TCombinedFragmentElements _tCombinedFragmentAccess_1 = this.g.getTCombinedFragmentAccess();
    List<Pair<Keyword,Keyword>> _findKeywordPairs_1 = _tCombinedFragmentAccess_1.findKeywordPairs("{", "}");
    final Procedure1<Pair<Keyword,Keyword>> _function_7 = new Procedure1<Pair<Keyword,Keyword>>() {
      public void apply(final Pair<Keyword,Keyword> pair) {
        Keyword _first = pair.getFirst();
        Keyword _second = pair.getSecond();
        c.setIndentation(_first, _second);
      }
    };
    IterableExtensions.<Pair<Keyword,Keyword>>forEach(_findKeywordPairs_1, _function_7);
    FormattingConfig.NoSpaceLocator _setNoSpace = c.setNoSpace();
    TextRAMGrammarAccess.TOcurrenceElements _tOcurrenceAccess_1 = this.g.getTOcurrenceAccess();
    Assignment _ocurrenceTypeAssignment_2 = _tOcurrenceAccess_1.getOcurrenceTypeAssignment_2();
    _setNoSpace.before(_ocurrenceTypeAssignment_2);
    TextRAMGrammarAccess.TMessageViewElements _tMessageViewAccess = this.g.getTMessageViewAccess();
    Keyword _leftCurlyBracketKeyword_12_0 = _tMessageViewAccess.getLeftCurlyBracketKeyword_12_0();
    TextRAMGrammarAccess.TMessageViewElements _tMessageViewAccess_1 = this.g.getTMessageViewAccess();
    Keyword _rightCurlyBracketKeyword_12_3 = _tMessageViewAccess_1.getRightCurlyBracketKeyword_12_3();
    c.setIndentation(_leftCurlyBracketKeyword_12_0, _rightCurlyBracketKeyword_12_3);
    FormattingConfig.LinewrapLocator _setLinewrap_9 = c.setLinewrap(0, 1, 2);
    TerminalRule _sL_COMMENTRule = this.g.getSL_COMMENTRule();
    _setLinewrap_9.before(_sL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_10 = c.setLinewrap(0, 1, 2);
    TerminalRule _mL_COMMENTRule = this.g.getML_COMMENTRule();
    _setLinewrap_10.before(_mL_COMMENTRule);
    FormattingConfig.LinewrapLocator _setLinewrap_11 = c.setLinewrap(0, 1, 1);
    TerminalRule _mL_COMMENTRule_1 = this.g.getML_COMMENTRule();
    _setLinewrap_11.after(_mL_COMMENTRule_1);
  }
}
