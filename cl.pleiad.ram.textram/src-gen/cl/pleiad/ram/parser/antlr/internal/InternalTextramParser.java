package cl.pleiad.ram.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cl.pleiad.ram.services.TextramGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextramParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aspect'", "'{'", "'}'", "'StructuralView'", "'partial'", "'abstract'", "'Class'"
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


        public InternalTextramParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTextramParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTextramParser.tokenNames; }
    public String getGrammarFileName() { return "../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g"; }



     	private TextramGrammarAccess grammarAccess;
     	
        public InternalTextramParser(TokenStream input, TextramGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RamModel";	
       	}
       	
       	@Override
       	protected TextramGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRamModel"
    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:67:1: entryRuleRamModel returns [EObject current=null] : iv_ruleRamModel= ruleRamModel EOF ;
    public final EObject entryRuleRamModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRamModel = null;


        try {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:68:2: (iv_ruleRamModel= ruleRamModel EOF )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:69:2: iv_ruleRamModel= ruleRamModel EOF
            {
             newCompositeNode(grammarAccess.getRamModelRule()); 
            pushFollow(FOLLOW_ruleRamModel_in_entryRuleRamModel75);
            iv_ruleRamModel=ruleRamModel();

            state._fsp--;

             current =iv_ruleRamModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRamModel85); 

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
    // $ANTLR end "entryRuleRamModel"


    // $ANTLR start "ruleRamModel"
    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:76:1: ruleRamModel returns [EObject current=null] : ( (lv_aspects_0_0= ruleAspect ) )* ;
    public final EObject ruleRamModel() throws RecognitionException {
        EObject current = null;

        EObject lv_aspects_0_0 = null;


         enterRule(); 
            
        try {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:79:28: ( ( (lv_aspects_0_0= ruleAspect ) )* )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:80:1: ( (lv_aspects_0_0= ruleAspect ) )*
            {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:80:1: ( (lv_aspects_0_0= ruleAspect ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:81:1: (lv_aspects_0_0= ruleAspect )
            	    {
            	    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:81:1: (lv_aspects_0_0= ruleAspect )
            	    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:82:3: lv_aspects_0_0= ruleAspect
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRamModelAccess().getAspectsAspectParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAspect_in_ruleRamModel130);
            	    lv_aspects_0_0=ruleAspect();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRamModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"aspects",
            	            		lv_aspects_0_0, 
            	            		"Aspect");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleRamModel"


    // $ANTLR start "entryRuleAspect"
    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:106:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:107:2: (iv_ruleAspect= ruleAspect EOF )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:108:2: iv_ruleAspect= ruleAspect EOF
            {
             newCompositeNode(grammarAccess.getAspectRule()); 
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect166);
            iv_ruleAspect=ruleAspect();

            state._fsp--;

             current =iv_ruleAspect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect176); 

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
    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:115:1: ruleAspect returns [EObject current=null] : (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_structuralView_3_0= ruleStructuralView ) ) otherlv_4= '}' ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_structuralView_3_0 = null;


         enterRule(); 
            
        try {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:118:28: ( (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_structuralView_3_0= ruleStructuralView ) ) otherlv_4= '}' ) )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:119:1: (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_structuralView_3_0= ruleStructuralView ) ) otherlv_4= '}' )
            {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:119:1: (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_structuralView_3_0= ruleStructuralView ) ) otherlv_4= '}' )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:119:3: otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_structuralView_3_0= ruleStructuralView ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleAspect213); 

                	newLeafNode(otherlv_0, grammarAccess.getAspectAccess().getAspectKeyword_0());
                
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:123:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:124:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:124:1: (lv_name_1_0= ruleEString )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:125:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAspectAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleAspect234);
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

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleAspect246); 

                	newLeafNode(otherlv_2, grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2());
                
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:145:1: ( (lv_structuralView_3_0= ruleStructuralView ) )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:146:1: (lv_structuralView_3_0= ruleStructuralView )
            {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:146:1: (lv_structuralView_3_0= ruleStructuralView )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:147:3: lv_structuralView_3_0= ruleStructuralView
            {
             
            	        newCompositeNode(grammarAccess.getAspectAccess().getStructuralViewStructuralViewParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStructuralView_in_ruleAspect267);
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

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleAspect279); 

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
    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:175:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:176:2: (iv_ruleEString= ruleEString EOF )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:177:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString316);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString327); 

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
    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:184:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:187:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:188:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:188:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:188:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString367); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:196:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString393); 

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
    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:211:1: entryRuleStructuralView returns [EObject current=null] : iv_ruleStructuralView= ruleStructuralView EOF ;
    public final EObject entryRuleStructuralView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralView = null;


        try {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:212:2: (iv_ruleStructuralView= ruleStructuralView EOF )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:213:2: iv_ruleStructuralView= ruleStructuralView EOF
            {
             newCompositeNode(grammarAccess.getStructuralViewRule()); 
            pushFollow(FOLLOW_ruleStructuralView_in_entryRuleStructuralView438);
            iv_ruleStructuralView=ruleStructuralView();

            state._fsp--;

             current =iv_ruleStructuralView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralView448); 

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
    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:220:1: ruleStructuralView returns [EObject current=null] : ( () otherlv_1= 'StructuralView' otherlv_2= '{' ( (lv_classes_3_0= ruleClass ) )? otherlv_4= '}' ) ;
    public final EObject ruleStructuralView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_classes_3_0 = null;


         enterRule(); 
            
        try {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:223:28: ( ( () otherlv_1= 'StructuralView' otherlv_2= '{' ( (lv_classes_3_0= ruleClass ) )? otherlv_4= '}' ) )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:224:1: ( () otherlv_1= 'StructuralView' otherlv_2= '{' ( (lv_classes_3_0= ruleClass ) )? otherlv_4= '}' )
            {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:224:1: ( () otherlv_1= 'StructuralView' otherlv_2= '{' ( (lv_classes_3_0= ruleClass ) )? otherlv_4= '}' )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:224:2: () otherlv_1= 'StructuralView' otherlv_2= '{' ( (lv_classes_3_0= ruleClass ) )? otherlv_4= '}'
            {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:224:2: ()
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:225:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructuralViewAccess().getStructuralViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleStructuralView494); 

                	newLeafNode(otherlv_1, grammarAccess.getStructuralViewAccess().getStructuralViewKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStructuralView506); 

                	newLeafNode(otherlv_2, grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_2());
                
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:238:1: ( (lv_classes_3_0= ruleClass ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=15 && LA3_0<=17)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:239:1: (lv_classes_3_0= ruleClass )
                    {
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:239:1: (lv_classes_3_0= ruleClass )
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:240:3: lv_classes_3_0= ruleClass
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructuralViewAccess().getClassesClassParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClass_in_ruleStructuralView527);
                    lv_classes_3_0=ruleClass();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructuralViewRule());
                    	        }
                           		add(
                           			current, 
                           			"classes",
                            		lv_classes_3_0, 
                            		"Class");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleStructuralView540); 

                	newLeafNode(otherlv_4, grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_4());
                

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


    // $ANTLR start "entryRuleClass"
    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:268:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:269:2: (iv_ruleClass= ruleClass EOF )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:270:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass576);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass586); 

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
    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:277:1: ruleClass returns [EObject current=null] : ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= '}' ) ;
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
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:280:28: ( ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= '}' ) )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:281:1: ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= '}' )
            {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:281:1: ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= '}' )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:281:2: () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' otherlv_6= '}'
            {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:281:2: ()
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:282:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClassAccess().getClassAction_0(),
                        current);
                

            }

            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:287:2: ( (lv_partial_1_0= 'partial' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:288:1: (lv_partial_1_0= 'partial' )
                    {
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:288:1: (lv_partial_1_0= 'partial' )
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:289:3: lv_partial_1_0= 'partial'
                    {
                    lv_partial_1_0=(Token)match(input,15,FOLLOW_15_in_ruleClass638); 

                            newLeafNode(lv_partial_1_0, grammarAccess.getClassAccess().getPartialPartialKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(current, "partial", true, "partial");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:302:3: ( (lv_abstract_2_0= 'abstract' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:303:1: (lv_abstract_2_0= 'abstract' )
                    {
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:303:1: (lv_abstract_2_0= 'abstract' )
                    // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:304:3: lv_abstract_2_0= 'abstract'
                    {
                    lv_abstract_2_0=(Token)match(input,16,FOLLOW_16_in_ruleClass670); 

                            newLeafNode(lv_abstract_2_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleClass696); 

                	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_3());
                
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:321:1: ( (lv_name_4_0= ruleEString ) )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:322:1: (lv_name_4_0= ruleEString )
            {
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:322:1: (lv_name_4_0= ruleEString )
            // ../cl.pleiad.ram.textram/src-gen/cl/pleiad/ram/parser/antlr/internal/InternalTextram.g:323:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleClass717);
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

            otherlv_5=(Token)match(input,12,FOLLOW_12_in_ruleClass729); 

                	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
                
            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleClass741); 

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


 

    public static final BitSet FOLLOW_ruleRamModel_in_entryRuleRamModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRamModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_ruleRamModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleAspect213 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleAspect234 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAspect246 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleStructuralView_in_ruleAspect267 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAspect279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralView_in_entryRuleStructuralView438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralView448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStructuralView494 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleStructuralView506 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_ruleClass_in_ruleStructuralView527 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStructuralView540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleClass638 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_16_in_ruleClass670 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleClass696 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleClass717 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleClass729 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleClass741 = new BitSet(new long[]{0x0000000000000002L});

}