/*
* generated by Xtext
*/
grammar InternalTextRAM;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package cl.uchile.pleiad.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package cl.uchile.pleiad.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import cl.uchile.pleiad.services.TextRAMGrammarAccess;

}

@parser::members {
 
 	private TextRAMGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(TextRAMGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleAspect
entryRuleAspect 
:
{ before(grammarAccess.getAspectRule()); }
	 ruleAspect
{ after(grammarAccess.getAspectRule()); } 
	 EOF 
;

// Rule Aspect
ruleAspect
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getAspectAccess().getGroup()); }
(rule__Aspect__Group__0)
{ after(grammarAccess.getAspectAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleEString
entryRuleEString 
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getEStringAccess().getAlternatives()); }
(rule__EString__Alternatives)
{ after(grammarAccess.getEStringAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStructuralView
entryRuleStructuralView 
:
{ before(grammarAccess.getStructuralViewRule()); }
	 ruleStructuralView
{ after(grammarAccess.getStructuralViewRule()); } 
	 EOF 
;

// Rule StructuralView
ruleStructuralView
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStructuralViewAccess().getGroup()); }
(rule__StructuralView__Group__0)
{ after(grammarAccess.getStructuralViewAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__EString__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	RULE_STRING
{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
)

    |(
{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	RULE_ID
{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Aspect__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Aspect__Group__0__Impl
	rule__Aspect__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Aspect__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAspectAccess().getAspectKeyword_0()); }

	'Aspect' 

{ after(grammarAccess.getAspectAccess().getAspectKeyword_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Aspect__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Aspect__Group__1__Impl
	rule__Aspect__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Aspect__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAspectAccess().getNameAssignment_1()); }
(rule__Aspect__NameAssignment_1)
{ after(grammarAccess.getAspectAccess().getNameAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Aspect__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Aspect__Group__2__Impl
	rule__Aspect__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Aspect__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Aspect__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Aspect__Group__3__Impl
	rule__Aspect__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Aspect__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAspectAccess().getStructuralViewAssignment_3()); }
(rule__Aspect__StructuralViewAssignment_3)
{ after(grammarAccess.getAspectAccess().getStructuralViewAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Aspect__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Aspect__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Aspect__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__StructuralView__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructuralView__Group__0__Impl
	rule__StructuralView__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuralView__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructuralViewAccess().getStructuralViewAction_0()); }
(

)
{ after(grammarAccess.getStructuralViewAccess().getStructuralViewAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StructuralView__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructuralView__Group__1__Impl
	rule__StructuralView__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuralView__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructuralViewAccess().getStructuralViewKeyword_1()); }

	'StructuralView' 

{ after(grammarAccess.getStructuralViewAccess().getStructuralViewKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StructuralView__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructuralView__Group__2__Impl
	rule__StructuralView__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuralView__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StructuralView__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructuralView__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuralView__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_3()); }

	'}' 

{ after(grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}











rule__Aspect__NameAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAspectAccess().getNameEStringParserRuleCall_1_0()); }
	ruleEString{ after(grammarAccess.getAspectAccess().getNameEStringParserRuleCall_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Aspect__StructuralViewAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getAspectAccess().getStructuralViewStructuralViewParserRuleCall_3_0()); }
	ruleStructuralView{ after(grammarAccess.getAspectAccess().getStructuralViewStructuralViewParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


