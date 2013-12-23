/*
* generated by Xtext
*/
package cl.uchile.pleiad.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class TextRAMGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class AspectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Aspect");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAspectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cStructuralViewAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStructuralViewStructuralViewParserRuleCall_3_0 = (RuleCall)cStructuralViewAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Aspect returns ram::Aspect:
		//	"Aspect" name=EString "{" structuralView=StructuralView "}";
		public ParserRule getRule() { return rule; }

		//"Aspect" name=EString "{" structuralView=StructuralView "}"
		public Group getGroup() { return cGroup; }

		//"Aspect"
		public Keyword getAspectKeyword_0() { return cAspectKeyword_0; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//structuralView=StructuralView
		public Assignment getStructuralViewAssignment_3() { return cStructuralViewAssignment_3; }

		//StructuralView
		public RuleCall getStructuralViewStructuralViewParserRuleCall_3_0() { return cStructuralViewStructuralViewParserRuleCall_3_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class StructuralViewElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StructuralView");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStructuralViewAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cStructureKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cClassesAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cClassesClassifierParserRuleCall_3_0_0 = (RuleCall)cClassesAssignment_3_0.eContents().get(0);
		private final Assignment cClassesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cClassesClassifierParserRuleCall_3_1_0 = (RuleCall)cClassesAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//StructuralView returns ram::StructuralView:
		//	{StructuralView} "structure" "{" (classes+=Classifier classes+=Classifier*)? "}";
		public ParserRule getRule() { return rule; }

		//{StructuralView} "structure" "{" (classes+=Classifier classes+=Classifier*)? "}"
		public Group getGroup() { return cGroup; }

		//{StructuralView}
		public Action getStructuralViewAction_0() { return cStructuralViewAction_0; }

		//"structure"
		public Keyword getStructureKeyword_1() { return cStructureKeyword_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//(classes+=Classifier classes+=Classifier*)?
		public Group getGroup_3() { return cGroup_3; }

		//classes+=Classifier
		public Assignment getClassesAssignment_3_0() { return cClassesAssignment_3_0; }

		//Classifier
		public RuleCall getClassesClassifierParserRuleCall_3_0_0() { return cClassesClassifierParserRuleCall_3_0_0; }

		//classes+=Classifier*
		public Assignment getClassesAssignment_3_1() { return cClassesAssignment_3_1; }

		//Classifier
		public RuleCall getClassesClassifierParserRuleCall_3_1_0() { return cClassesClassifierParserRuleCall_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}

	public class ClassifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Classifier");
		private final RuleCall cClassParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Classifier returns ram::Classifier:
		//	Class;
		public ParserRule getRule() { return rule; }

		//Class
		public RuleCall getClassParserRuleCall() { return cClassParserRuleCall; }
	}

	public class ClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Class");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cClassAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cPartialAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cPartialPartialKeyword_1_0 = (Keyword)cPartialAssignment_1.eContents().get(0);
		private final Assignment cAbstractAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Keyword cAbstractAbstractKeyword_2_0 = (Keyword)cAbstractAssignment_2.eContents().get(0);
		private final Keyword cClassKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameEStringParserRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Class:
		//	{Class} partial?="partial"? abstract?="abstract"? "class" name=EString //(':' (superTypes+=[ram::Classifier] ( "," superTypes+=[ram::Classifier])* ')')?)?
		//	"{" //                ('operations' '{' operations+=Operation ( "," operations+=Operation)* '}' )?
		//	//                ('associationEnds' '{' associationEnds+=AssociationEnd ( "," associationEnds+=AssociationEnd)* '}' )?
		//	//                ('attributes' '{' attributes+=Attribute ( "," attributes+=Attribute)* '}' )?
		//	"}";
		public ParserRule getRule() { return rule; }

		//{Class} partial?="partial"? abstract?="abstract"? "class" name=EString //(':' (superTypes+=[ram::Classifier] ( "," superTypes+=[ram::Classifier])* ')')?)?
		//"{" //                ('operations' '{' operations+=Operation ( "," operations+=Operation)* '}' )?
		////                ('associationEnds' '{' associationEnds+=AssociationEnd ( "," associationEnds+=AssociationEnd)* '}' )?
		////                ('attributes' '{' attributes+=Attribute ( "," attributes+=Attribute)* '}' )?
		//"}"
		public Group getGroup() { return cGroup; }

		//{Class}
		public Action getClassAction_0() { return cClassAction_0; }

		//partial?="partial"?
		public Assignment getPartialAssignment_1() { return cPartialAssignment_1; }

		//"partial"
		public Keyword getPartialPartialKeyword_1_0() { return cPartialPartialKeyword_1_0; }

		//abstract?="abstract"?
		public Assignment getAbstractAssignment_2() { return cAbstractAssignment_2; }

		//"abstract"
		public Keyword getAbstractAbstractKeyword_2_0() { return cAbstractAbstractKeyword_2_0; }

		//"class"
		public Keyword getClassKeyword_3() { return cClassKeyword_3; }

		//name=EString
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }

		//EString
		public RuleCall getNameEStringParserRuleCall_4_0() { return cNameEStringParserRuleCall_4_0; }

		////(':' (superTypes+=[ram::Classifier] ( "," superTypes+=[ram::Classifier])* ')')?)?
		//"{"
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }

		////                ('operations' '{' operations+=Operation ( "," operations+=Operation)* '}' )?
		////                ('associationEnds' '{' associationEnds+=AssociationEnd ( "," associationEnds+=AssociationEnd)* '}' )?
		////                ('attributes' '{' attributes+=Attribute ( "," attributes+=Attribute)* '}' )?
		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	
	
	private AspectElements pAspect;
	private EStringElements pEString;
	private StructuralViewElements pStructuralView;
	private ClassifierElements pClassifier;
	private ClassElements pClass;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public TextRAMGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("cl.uchile.pleiad.TextRAM".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Aspect returns ram::Aspect:
	//	"Aspect" name=EString "{" structuralView=StructuralView "}";
	public AspectElements getAspectAccess() {
		return (pAspect != null) ? pAspect : (pAspect = new AspectElements());
	}
	
	public ParserRule getAspectRule() {
		return getAspectAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return (pEString != null) ? pEString : (pEString = new EStringElements());
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//StructuralView returns ram::StructuralView:
	//	{StructuralView} "structure" "{" (classes+=Classifier classes+=Classifier*)? "}";
	public StructuralViewElements getStructuralViewAccess() {
		return (pStructuralView != null) ? pStructuralView : (pStructuralView = new StructuralViewElements());
	}
	
	public ParserRule getStructuralViewRule() {
		return getStructuralViewAccess().getRule();
	}

	//Classifier returns ram::Classifier:
	//	Class;
	public ClassifierElements getClassifierAccess() {
		return (pClassifier != null) ? pClassifier : (pClassifier = new ClassifierElements());
	}
	
	public ParserRule getClassifierRule() {
		return getClassifierAccess().getRule();
	}

	//Class:
	//	{Class} partial?="partial"? abstract?="abstract"? "class" name=EString //(':' (superTypes+=[ram::Classifier] ( "," superTypes+=[ram::Classifier])* ')')?)?
	//	"{" //                ('operations' '{' operations+=Operation ( "," operations+=Operation)* '}' )?
	//	//                ('associationEnds' '{' associationEnds+=AssociationEnd ( "," associationEnds+=AssociationEnd)* '}' )?
	//	//                ('attributes' '{' attributes+=Attribute ( "," attributes+=Attribute)* '}' )?
	//	"}";
	public ClassElements getClassAccess() {
		return (pClass != null) ? pClass : (pClass = new ClassElements());
	}
	
	public ParserRule getClassRule() {
		return getClassAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
