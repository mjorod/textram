/*
* generated by Xtext
*/
package cl.pleiad.ram.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import cl.pleiad.ram.services.TextramGrammarAccess;

public class TextramParser extends AbstractContentAssistParser {
	
	@Inject
	private TextramGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected cl.pleiad.ram.ui.contentassist.antlr.internal.InternalTextramParser createParser() {
		cl.pleiad.ram.ui.contentassist.antlr.internal.InternalTextramParser result = new cl.pleiad.ram.ui.contentassist.antlr.internal.InternalTextramParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getAspectAccess().getGroup(), "rule__Aspect__Group__0");
					put(grammarAccess.getStructuralViewAccess().getGroup(), "rule__StructuralView__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getRamModelAccess().getAspectsAssignment(), "rule__RamModel__AspectsAssignment");
					put(grammarAccess.getAspectAccess().getNameAssignment_1(), "rule__Aspect__NameAssignment_1");
					put(grammarAccess.getAspectAccess().getStructuralViewAssignment_3(), "rule__Aspect__StructuralViewAssignment_3");
					put(grammarAccess.getStructuralViewAccess().getClassesAssignment_3(), "rule__StructuralView__ClassesAssignment_3");
					put(grammarAccess.getClassAccess().getPartialAssignment_1(), "rule__Class__PartialAssignment_1");
					put(grammarAccess.getClassAccess().getAbstractAssignment_2(), "rule__Class__AbstractAssignment_2");
					put(grammarAccess.getClassAccess().getNameAssignment_4(), "rule__Class__NameAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			cl.pleiad.ram.ui.contentassist.antlr.internal.InternalTextramParser typedParser = (cl.pleiad.ram.ui.contentassist.antlr.internal.InternalTextramParser) parser;
			typedParser.entryRuleRamModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public TextramGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TextramGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
