/*
* generated by Xtext
*/
grammar InternalTextram;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package cl.pleiad.ram.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package cl.pleiad.ram.ui.contentassist.antlr.internal; 

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
import cl.pleiad.ram.services.TextramGrammarAccess;

}

@parser::members {
 
 	private TextramGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(TextramGrammarAccess grammarAccess) {
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




// Entry rule entryRuleRamModel
entryRuleRamModel 
:
{ before(grammarAccess.getRamModelRule()); }
	 ruleRamModel
{ after(grammarAccess.getRamModelRule()); } 
	 EOF 
;

// Rule RamModel
ruleRamModel
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRamModelAccess().getAspectsAssignment()); }
(rule__RamModel__AspectsAssignment)*
{ after(grammarAccess.getRamModelAccess().getAspectsAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
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



// Entry rule entryRuleClass
entryRuleClass 
:
{ before(grammarAccess.getClassRule()); }
	 ruleClass
{ after(grammarAccess.getClassRule()); } 
	 EOF 
;

// Rule Class
ruleClass
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getClassAccess().getGroup()); }
(rule__Class__Group__0)
{ after(grammarAccess.getClassAccess().getGroup()); }
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
	rule__StructuralView__Group__4
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
{ before(grammarAccess.getStructuralViewAccess().getClassesAssignment_3()); }
(rule__StructuralView__ClassesAssignment_3)?
{ after(grammarAccess.getStructuralViewAccess().getClassesAssignment_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__StructuralView__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__StructuralView__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StructuralView__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_4()); }

	'}' 

{ after(grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}












rule__Class__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__0__Impl
	rule__Class__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getClassAction_0()); }
(

)
{ after(grammarAccess.getClassAccess().getClassAction_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__1__Impl
	rule__Class__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getPartialAssignment_1()); }
(rule__Class__PartialAssignment_1)?
{ after(grammarAccess.getClassAccess().getPartialAssignment_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__2__Impl
	rule__Class__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAbstractAssignment_2()); }
(rule__Class__AbstractAssignment_2)?
{ after(grammarAccess.getClassAccess().getAbstractAssignment_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__3__Impl
	rule__Class__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getClassKeyword_3()); }

	'Class' 

{ after(grammarAccess.getClassAccess().getClassKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__4__Impl
	rule__Class__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getNameAssignment_4()); }
(rule__Class__NameAssignment_4)
{ after(grammarAccess.getClassAccess().getNameAssignment_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__5
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__5__Impl
	rule__Class__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__5__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); }

	'{' 

{ after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__Class__Group__6
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__Class__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Class__Group__6__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); }

	'}' 

{ after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); }
)

;
finally {
	restoreStackSize(stackSize);
}

















rule__RamModel__AspectsAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRamModelAccess().getAspectsAspectParserRuleCall_0()); }
	ruleAspect{ after(grammarAccess.getRamModelAccess().getAspectsAspectParserRuleCall_0()); }
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

rule__StructuralView__ClassesAssignment_3
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStructuralViewAccess().getClassesClassParserRuleCall_3_0()); }
	ruleClass{ after(grammarAccess.getStructuralViewAccess().getClassesClassParserRuleCall_3_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__PartialAssignment_1
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getPartialPartialKeyword_1_0()); }
(
{ before(grammarAccess.getClassAccess().getPartialPartialKeyword_1_0()); }

	'partial' 

{ after(grammarAccess.getClassAccess().getPartialPartialKeyword_1_0()); }
)

{ after(grammarAccess.getClassAccess().getPartialPartialKeyword_1_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__AbstractAssignment_2
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0()); }
(
{ before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0()); }

	'abstract' 

{ after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0()); }
)

{ after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__Class__NameAssignment_4
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getClassAccess().getNameEStringParserRuleCall_4_0()); }
	ruleEString{ after(grammarAccess.getClassAccess().getNameEStringParserRuleCall_4_0()); }
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


