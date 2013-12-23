/*
* generated by Xtext
*/
package cl.uchile.pleiad.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import cl.uchile.pleiad.services.TextRAMGrammarAccess;

public class TextRAMParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private TextRAMGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected cl.uchile.pleiad.parser.antlr.internal.InternalTextRAMParser createParser(XtextTokenStream stream) {
		return new cl.uchile.pleiad.parser.antlr.internal.InternalTextRAMParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Aspect";
	}
	
	public TextRAMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TextRAMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}