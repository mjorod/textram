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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aspect'", "'{'", "'}'", "'StructuralView'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:181:1: ruleStructuralView returns [EObject current=null] : ( () otherlv_1= 'StructuralView' otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleStructuralView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:184:28: ( ( () otherlv_1= 'StructuralView' otherlv_2= '{' otherlv_3= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:185:1: ( () otherlv_1= 'StructuralView' otherlv_2= '{' otherlv_3= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:185:1: ( () otherlv_1= 'StructuralView' otherlv_2= '{' otherlv_3= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:185:2: () otherlv_1= 'StructuralView' otherlv_2= '{' otherlv_3= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:185:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:186:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructuralViewAccess().getStructuralViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleStructuralView403); 

                	newLeafNode(otherlv_1, grammarAccess.getStructuralViewAccess().getStructuralViewKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStructuralView415); 

                	newLeafNode(otherlv_2, grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStructuralView427); 

                	newLeafNode(otherlv_3, grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_3());
                

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
    public static final BitSet FOLLOW_12_in_ruleStructuralView415 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructuralView427 = new BitSet(new long[]{0x0000000000000002L});

}