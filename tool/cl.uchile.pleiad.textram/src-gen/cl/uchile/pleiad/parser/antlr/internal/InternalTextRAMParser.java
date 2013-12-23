package cl.uchile.pleiad.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cl.uchile.pleiad.services.TextRAMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextRAMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aspect'", "'{'", "'}'", "'structure'", "'partial'", "'abstract'", "'class'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalTextRAMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextRAMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextRAMParser.tokenNames; }
    public String getGrammarFileName() { return "../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g"; }



     	private TextRAMGrammarAccess grammarAccess;
     	
        public InternalTextRAMParser(TokenStream input, TextRAMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Aspect";	
       	}
       	
       	@Override
       	protected TextRAMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleAspect"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:67:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:68:2: (iv_ruleAspect= ruleAspect EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:69:2: iv_ruleAspect= ruleAspect EOF
            {
             newCompositeNode(grammarAccess.getAspectRule()); 
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect75);
            iv_ruleAspect=ruleAspect();

            state._fsp--;

             current =iv_ruleAspect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:76:1: ruleAspect returns [EObject current=null] : (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_structuralView_3_0= ruleStructuralView ) ) otherlv_4= '}' ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_structuralView_3_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:79:28: ( (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_structuralView_3_0= ruleStructuralView ) ) otherlv_4= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:80:1: (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_structuralView_3_0= ruleStructuralView ) ) otherlv_4= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:80:1: (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_structuralView_3_0= ruleStructuralView ) ) otherlv_4= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:80:3: otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_structuralView_3_0= ruleStructuralView ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAspect122); 

                	newLeafNode(otherlv_0, grammarAccess.getAspectAccess().getAspectKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:85:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:86:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAspectAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleAspect143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAspectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAspect155); 

                	newLeafNode(otherlv_2, grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:106:1: ( (lv_structuralView_3_0= ruleStructuralView ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:107:1: (lv_structuralView_3_0= ruleStructuralView )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:107:1: (lv_structuralView_3_0= ruleStructuralView )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:108:3: lv_structuralView_3_0= ruleStructuralView
            {
             
            	        newCompositeNode(grammarAccess.getAspectAccess().getStructuralViewStructuralViewParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStructuralView_in_ruleAspect176);
            lv_structuralView_3_0=ruleStructuralView();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAspectRule());
            	        }
                   		set(
                   			current, 
                   			"structuralView",
                    		lv_structuralView_3_0, 
                    		"StructuralView");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAspect188); 

                	newLeafNode(otherlv_4, grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleEString"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:136:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:137:2: (iv_ruleEString= ruleEString EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:138:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString225);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString236); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:145:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:148:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:149:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:149:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:149:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString276); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:157:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString302); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStructuralView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:172:1: entryRuleStructuralView returns [EObject current=null] : iv_ruleStructuralView= ruleStructuralView EOF ;
    public final EObject entryRuleStructuralView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralView = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:173:2: (iv_ruleStructuralView= ruleStructuralView EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:174:2: iv_ruleStructuralView= ruleStructuralView EOF
            {
             newCompositeNode(grammarAccess.getStructuralViewRule()); 
            pushFollow(FOLLOW_ruleStructuralView_in_entryRuleStructuralView347);
            iv_ruleStructuralView=ruleStructuralView();

            state._fsp--;

             current =iv_ruleStructuralView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralView357); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructuralView"


    // $ANTLR start "ruleStructuralView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:181:1: ruleStructuralView returns [EObject current=null] : ( () otherlv_1= 'structure' otherlv_2= '{' ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleStructuralView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_classes_3_0 = null;

        EObject lv_classes_4_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:184:28: ( ( () otherlv_1= 'structure' otherlv_2= '{' ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )? otherlv_5= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:185:1: ( () otherlv_1= 'structure' otherlv_2= '{' ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )? otherlv_5= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:185:1: ( () otherlv_1= 'structure' otherlv_2= '{' ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )? otherlv_5= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:185:2: () otherlv_1= 'structure' otherlv_2= '{' ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )? otherlv_5= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:185:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:186:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructuralViewAccess().getStructuralViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleStructuralView403); 

                	newLeafNode(otherlv_1, grammarAccess.getStructuralViewAccess().getStructureKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStructuralView415); 

                	newLeafNode(otherlv_2, grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:199:1: ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=15 && LA3_0<=17)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:199:2: ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )*
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:199:2: ( (lv_classes_3_0= ruleClassifier ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:200:1: (lv_classes_3_0= ruleClassifier )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:200:1: (lv_classes_3_0= ruleClassifier )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:201:3: lv_classes_3_0= ruleClassifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructuralViewAccess().getClassesClassifierParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassifier_in_ruleStructuralView437);
                    lv_classes_3_0=ruleClassifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructuralViewRule());
                    	        }
                           		add(
                           			current, 
                           			"classes",
                            		lv_classes_3_0, 
                            		"Classifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:217:2: ( (lv_classes_4_0= ruleClassifier ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=15 && LA2_0<=17)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:218:1: (lv_classes_4_0= ruleClassifier )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:218:1: (lv_classes_4_0= ruleClassifier )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:219:3: lv_classes_4_0= ruleClassifier
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructuralViewAccess().getClassesClassifierParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClassifier_in_ruleStructuralView458);
                    	    lv_classes_4_0=ruleClassifier();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructuralViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"classes",
                    	            		lv_classes_4_0, 
                    	            		"Classifier");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleStructuralView473); 

                	newLeafNode(otherlv_5, grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructuralView"


    // $ANTLR start "entryRuleClassifier"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:247:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:248:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:249:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier509);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier519); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:256:1: ruleClassifier returns [EObject current=null] : this_Class_0= ruleClass ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:259:28: (this_Class_0= ruleClass )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:261:5: this_Class_0= ruleClass
            {
             
                    newCompositeNode(grammarAccess.getClassifierAccess().getClassParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleClass_in_ruleClassifier565);
            this_Class_0=ruleClass();

            state._fsp--;

             
                    current = this_Class_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleClass"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:277:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:278:2: (iv_ruleClass= ruleClass EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:279:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass599);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass609); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:286:1: ruleClass returns [EObject current=null] : ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_partial_1_0=null;
        Token lv_abstract_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:289:28: ( ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:290:1: ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:290:1: ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:290:2: () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:290:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:291:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClassAccess().getClassAction_0(),
                        current);
                

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:296:2: ( (lv_partial_1_0= 'partial' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:297:1: (lv_partial_1_0= 'partial' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:297:1: (lv_partial_1_0= 'partial' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:298:3: lv_partial_1_0= 'partial'
                    {
                    lv_partial_1_0=(Token)match(input,15,FOLLOW_15_in_ruleClass661); 

                            newLeafNode(lv_partial_1_0, grammarAccess.getClassAccess().getPartialPartialKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(current, "partial", true, "partial");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:311:3: ( (lv_abstract_2_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:312:1: (lv_abstract_2_0= 'abstract' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:312:1: (lv_abstract_2_0= 'abstract' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:313:3: lv_abstract_2_0= 'abstract'
                    {
                    lv_abstract_2_0=(Token)match(input,16,FOLLOW_16_in_ruleClass693); 

                            newLeafNode(lv_abstract_2_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleClass719); 

                	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:330:1: ( (lv_name_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:331:1: (lv_name_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:331:1: (lv_name_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:332:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleClass740);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleClass752); 

                	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleClass764); 

                	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClass"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAspect122 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAspect143 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAspect155 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleStructuralView_in_ruleAspect176 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAspect188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString225 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralView_in_entryRuleStructuralView347 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralView357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStructuralView403 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructuralView415 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleStructuralView437 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleStructuralView458 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_13_in_ruleStructuralView473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleClassifier565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleClass661 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleClass693 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleClass719 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleClass740 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleClass752 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleClass764 = new BitSet(new long[]{0x0000000000000002L});

}