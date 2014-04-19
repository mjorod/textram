package cl.uchile.pleiad.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_TEMPLATE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'aspect'", "','", "'{'", "'instantiations'", "';'", "'}'", "'messages'", "'lifelines'", "'structure'", "'associations'", "'abstract'", "'class'", "'|'", "':'", "'static'", "'('", "')'", "'->'", "'..'", "'*'", "'<'", "'>'", "'messageView'", "'new'", "'.'", "'affectedBy'", "'aspectMessageView'", "'pointcut'", "'advice'", "'true'", "'='", "'=>'", "'['", "']'", "'else'", "':='", "'+'", "'-'", "'#'", "'~'", "'dependsOn'", "'extends'", "'o'", "'alt'", "'opt'", "'loop'", "'X'", "'ref'", "'assoc'", "'attr'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int RULE_INT=7;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=9;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_TEMPLATE=6;
    public static final int T__39=39;
    public static final int RULE_WS=10;

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:68:1: entryRuleAspect returns [EObject current=null] : iv_ruleAspect= ruleAspect EOF ;
    public final EObject entryRuleAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspect = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:69:2: (iv_ruleAspect= ruleAspect EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:70:2: iv_ruleAspect= ruleAspect EOF
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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:77:1: ruleAspect returns [EObject current=null] : this_TAspect_0= ruleTAspect ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        EObject this_TAspect_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:80:28: (this_TAspect_0= ruleTAspect )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:82:5: this_TAspect_0= ruleTAspect
            {
             
                    newCompositeNode(grammarAccess.getAspectAccess().getTAspectParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTAspect_in_ruleAspect131);
            this_TAspect_0=ruleTAspect();

            state._fsp--;

             
                    current = this_TAspect_0; 
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
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleTAspect"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:98:1: entryRuleTAspect returns [EObject current=null] : iv_ruleTAspect= ruleTAspect EOF ;
    public final EObject entryRuleTAspect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAspect = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:99:2: (iv_ruleTAspect= ruleTAspect EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:100:2: iv_ruleTAspect= ruleTAspect EOF
            {
             newCompositeNode(grammarAccess.getTAspectRule()); 
            pushFollow(FOLLOW_ruleTAspect_in_entryRuleTAspect165);
            iv_ruleTAspect=ruleTAspect();

            state._fsp--;

             current =iv_ruleTAspect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTAspect175); 

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
    // $ANTLR end "entryRuleTAspect"


    // $ANTLR start "ruleTAspect"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:107:1: ruleTAspect returns [EObject current=null] : (otherlv_0= 'aspect' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_headerInstantiations_2_0= ruleTInstantiationHeader ) ) ( (otherlv_3= ',' )? ( (lv_headerInstantiations_4_0= ruleTInstantiationHeader ) ) )* )? otherlv_5= '{' ( (lv_structuralView_6_0= ruleTStructuralView ) ) (otherlv_7= 'instantiations' otherlv_8= '{' ( (lv_instantiations_9_0= ruleInstantiation ) ) ( (otherlv_10= ';' )? ( (lv_instantiations_11_0= ruleInstantiation ) ) )* otherlv_12= '}' )? (otherlv_13= 'messages' otherlv_14= '{' ( (lv_messageViews_15_0= ruleTAbstractMessageView ) ) otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleTAspect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_headerInstantiations_2_0 = null;

        EObject lv_headerInstantiations_4_0 = null;

        EObject lv_structuralView_6_0 = null;

        EObject lv_instantiations_9_0 = null;

        EObject lv_instantiations_11_0 = null;

        EObject lv_messageViews_15_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:110:28: ( (otherlv_0= 'aspect' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_headerInstantiations_2_0= ruleTInstantiationHeader ) ) ( (otherlv_3= ',' )? ( (lv_headerInstantiations_4_0= ruleTInstantiationHeader ) ) )* )? otherlv_5= '{' ( (lv_structuralView_6_0= ruleTStructuralView ) ) (otherlv_7= 'instantiations' otherlv_8= '{' ( (lv_instantiations_9_0= ruleInstantiation ) ) ( (otherlv_10= ';' )? ( (lv_instantiations_11_0= ruleInstantiation ) ) )* otherlv_12= '}' )? (otherlv_13= 'messages' otherlv_14= '{' ( (lv_messageViews_15_0= ruleTAbstractMessageView ) ) otherlv_16= '}' )? otherlv_17= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:111:1: (otherlv_0= 'aspect' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_headerInstantiations_2_0= ruleTInstantiationHeader ) ) ( (otherlv_3= ',' )? ( (lv_headerInstantiations_4_0= ruleTInstantiationHeader ) ) )* )? otherlv_5= '{' ( (lv_structuralView_6_0= ruleTStructuralView ) ) (otherlv_7= 'instantiations' otherlv_8= '{' ( (lv_instantiations_9_0= ruleInstantiation ) ) ( (otherlv_10= ';' )? ( (lv_instantiations_11_0= ruleInstantiation ) ) )* otherlv_12= '}' )? (otherlv_13= 'messages' otherlv_14= '{' ( (lv_messageViews_15_0= ruleTAbstractMessageView ) ) otherlv_16= '}' )? otherlv_17= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:111:1: (otherlv_0= 'aspect' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_headerInstantiations_2_0= ruleTInstantiationHeader ) ) ( (otherlv_3= ',' )? ( (lv_headerInstantiations_4_0= ruleTInstantiationHeader ) ) )* )? otherlv_5= '{' ( (lv_structuralView_6_0= ruleTStructuralView ) ) (otherlv_7= 'instantiations' otherlv_8= '{' ( (lv_instantiations_9_0= ruleInstantiation ) ) ( (otherlv_10= ';' )? ( (lv_instantiations_11_0= ruleInstantiation ) ) )* otherlv_12= '}' )? (otherlv_13= 'messages' otherlv_14= '{' ( (lv_messageViews_15_0= ruleTAbstractMessageView ) ) otherlv_16= '}' )? otherlv_17= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:111:3: otherlv_0= 'aspect' ( (lv_name_1_0= ruleEString ) ) ( ( (lv_headerInstantiations_2_0= ruleTInstantiationHeader ) ) ( (otherlv_3= ',' )? ( (lv_headerInstantiations_4_0= ruleTInstantiationHeader ) ) )* )? otherlv_5= '{' ( (lv_structuralView_6_0= ruleTStructuralView ) ) (otherlv_7= 'instantiations' otherlv_8= '{' ( (lv_instantiations_9_0= ruleInstantiation ) ) ( (otherlv_10= ';' )? ( (lv_instantiations_11_0= ruleInstantiation ) ) )* otherlv_12= '}' )? (otherlv_13= 'messages' otherlv_14= '{' ( (lv_messageViews_15_0= ruleTAbstractMessageView ) ) otherlv_16= '}' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleTAspect212); 

                	newLeafNode(otherlv_0, grammarAccess.getTAspectAccess().getAspectKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:115:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:116:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:116:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:117:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTAspectAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTAspect233);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAspectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:133:2: ( ( (lv_headerInstantiations_2_0= ruleTInstantiationHeader ) ) ( (otherlv_3= ',' )? ( (lv_headerInstantiations_4_0= ruleTInstantiationHeader ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=52 && LA3_0<=53)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:133:3: ( (lv_headerInstantiations_2_0= ruleTInstantiationHeader ) ) ( (otherlv_3= ',' )? ( (lv_headerInstantiations_4_0= ruleTInstantiationHeader ) ) )*
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:133:3: ( (lv_headerInstantiations_2_0= ruleTInstantiationHeader ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:134:1: (lv_headerInstantiations_2_0= ruleTInstantiationHeader )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:134:1: (lv_headerInstantiations_2_0= ruleTInstantiationHeader )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:135:3: lv_headerInstantiations_2_0= ruleTInstantiationHeader
                    {
                     
                    	        newCompositeNode(grammarAccess.getTAspectAccess().getHeaderInstantiationsTInstantiationHeaderParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTInstantiationHeader_in_ruleTAspect255);
                    lv_headerInstantiations_2_0=ruleTInstantiationHeader();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTAspectRule());
                    	        }
                           		add(
                           			current, 
                           			"headerInstantiations",
                            		lv_headerInstantiations_2_0, 
                            		"TInstantiationHeader");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:151:2: ( (otherlv_3= ',' )? ( (lv_headerInstantiations_4_0= ruleTInstantiationHeader ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==13||(LA2_0>=52 && LA2_0<=53)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:151:3: (otherlv_3= ',' )? ( (lv_headerInstantiations_4_0= ruleTInstantiationHeader ) )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:151:3: (otherlv_3= ',' )?
                    	    int alt1=2;
                    	    int LA1_0 = input.LA(1);

                    	    if ( (LA1_0==13) ) {
                    	        alt1=1;
                    	    }
                    	    switch (alt1) {
                    	        case 1 :
                    	            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:151:5: otherlv_3= ','
                    	            {
                    	            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleTAspect269); 

                    	                	newLeafNode(otherlv_3, grammarAccess.getTAspectAccess().getCommaKeyword_2_1_0());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:155:3: ( (lv_headerInstantiations_4_0= ruleTInstantiationHeader ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:156:1: (lv_headerInstantiations_4_0= ruleTInstantiationHeader )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:156:1: (lv_headerInstantiations_4_0= ruleTInstantiationHeader )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:157:3: lv_headerInstantiations_4_0= ruleTInstantiationHeader
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTAspectAccess().getHeaderInstantiationsTInstantiationHeaderParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTInstantiationHeader_in_ruleTAspect292);
                    	    lv_headerInstantiations_4_0=ruleTInstantiationHeader();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTAspectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"headerInstantiations",
                    	            		lv_headerInstantiations_4_0, 
                    	            		"TInstantiationHeader");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleTAspect308); 

                	newLeafNode(otherlv_5, grammarAccess.getTAspectAccess().getLeftCurlyBracketKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:177:1: ( (lv_structuralView_6_0= ruleTStructuralView ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:178:1: (lv_structuralView_6_0= ruleTStructuralView )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:178:1: (lv_structuralView_6_0= ruleTStructuralView )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:179:3: lv_structuralView_6_0= ruleTStructuralView
            {
             
            	        newCompositeNode(grammarAccess.getTAspectAccess().getStructuralViewTStructuralViewParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTStructuralView_in_ruleTAspect329);
            lv_structuralView_6_0=ruleTStructuralView();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAspectRule());
            	        }
                   		set(
                   			current, 
                   			"structuralView",
                    		lv_structuralView_6_0, 
                    		"TStructuralView");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:195:2: (otherlv_7= 'instantiations' otherlv_8= '{' ( (lv_instantiations_9_0= ruleInstantiation ) ) ( (otherlv_10= ';' )? ( (lv_instantiations_11_0= ruleInstantiation ) ) )* otherlv_12= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:195:4: otherlv_7= 'instantiations' otherlv_8= '{' ( (lv_instantiations_9_0= ruleInstantiation ) ) ( (otherlv_10= ';' )? ( (lv_instantiations_11_0= ruleInstantiation ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleTAspect342); 

                        	newLeafNode(otherlv_7, grammarAccess.getTAspectAccess().getInstantiationsKeyword_5_0());
                        
                    otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleTAspect354); 

                        	newLeafNode(otherlv_8, grammarAccess.getTAspectAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:203:1: ( (lv_instantiations_9_0= ruleInstantiation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:204:1: (lv_instantiations_9_0= ruleInstantiation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:204:1: (lv_instantiations_9_0= ruleInstantiation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:205:3: lv_instantiations_9_0= ruleInstantiation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTAspectAccess().getInstantiationsInstantiationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInstantiation_in_ruleTAspect375);
                    lv_instantiations_9_0=ruleInstantiation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTAspectRule());
                    	        }
                           		add(
                           			current, 
                           			"instantiations",
                            		lv_instantiations_9_0, 
                            		"Instantiation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:221:2: ( (otherlv_10= ';' )? ( (lv_instantiations_11_0= ruleInstantiation ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_TEMPLATE)||LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:221:3: (otherlv_10= ';' )? ( (lv_instantiations_11_0= ruleInstantiation ) )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:221:3: (otherlv_10= ';' )?
                    	    int alt4=2;
                    	    int LA4_0 = input.LA(1);

                    	    if ( (LA4_0==16) ) {
                    	        alt4=1;
                    	    }
                    	    switch (alt4) {
                    	        case 1 :
                    	            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:221:5: otherlv_10= ';'
                    	            {
                    	            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleTAspect389); 

                    	                	newLeafNode(otherlv_10, grammarAccess.getTAspectAccess().getSemicolonKeyword_5_3_0());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:225:3: ( (lv_instantiations_11_0= ruleInstantiation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:226:1: (lv_instantiations_11_0= ruleInstantiation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:226:1: (lv_instantiations_11_0= ruleInstantiation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:227:3: lv_instantiations_11_0= ruleInstantiation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTAspectAccess().getInstantiationsInstantiationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleInstantiation_in_ruleTAspect412);
                    	    lv_instantiations_11_0=ruleInstantiation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTAspectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instantiations",
                    	            		lv_instantiations_11_0, 
                    	            		"Instantiation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleTAspect426); 

                        	newLeafNode(otherlv_12, grammarAccess.getTAspectAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:247:3: (otherlv_13= 'messages' otherlv_14= '{' ( (lv_messageViews_15_0= ruleTAbstractMessageView ) ) otherlv_16= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:247:5: otherlv_13= 'messages' otherlv_14= '{' ( (lv_messageViews_15_0= ruleTAbstractMessageView ) ) otherlv_16= '}'
                    {
                    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleTAspect441); 

                        	newLeafNode(otherlv_13, grammarAccess.getTAspectAccess().getMessagesKeyword_6_0());
                        
                    otherlv_14=(Token)match(input,14,FOLLOW_14_in_ruleTAspect453); 

                        	newLeafNode(otherlv_14, grammarAccess.getTAspectAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:255:1: ( (lv_messageViews_15_0= ruleTAbstractMessageView ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:256:1: (lv_messageViews_15_0= ruleTAbstractMessageView )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:256:1: (lv_messageViews_15_0= ruleTAbstractMessageView )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:257:3: lv_messageViews_15_0= ruleTAbstractMessageView
                    {
                     
                    	        newCompositeNode(grammarAccess.getTAspectAccess().getMessageViewsTAbstractMessageViewParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTAbstractMessageView_in_ruleTAspect474);
                    lv_messageViews_15_0=ruleTAbstractMessageView();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTAspectRule());
                    	        }
                           		add(
                           			current, 
                           			"messageViews",
                            		lv_messageViews_15_0, 
                            		"TAbstractMessageView");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleTAspect486); 

                        	newLeafNode(otherlv_16, grammarAccess.getTAspectAccess().getRightCurlyBracketKeyword_6_3());
                        

                    }
                    break;

            }

            otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleTAspect500); 

                	newLeafNode(otherlv_17, grammarAccess.getTAspectAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleTAspect"


    // $ANTLR start "entryRuleEString"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:289:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:290:2: (iv_ruleEString= ruleEString EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:291:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString537);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString548); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:298:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_TEMPLATE_2= RULE_TEMPLATE ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_TEMPLATE_2=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:301:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_TEMPLATE_2= RULE_TEMPLATE ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:302:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_TEMPLATE_2= RULE_TEMPLATE )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:302:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_TEMPLATE_2= RULE_TEMPLATE )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case RULE_TEMPLATE:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:302:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString588); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:310:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString614); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:318:10: this_TEMPLATE_2= RULE_TEMPLATE
                    {
                    this_TEMPLATE_2=(Token)match(input,RULE_TEMPLATE,FOLLOW_RULE_TEMPLATE_in_ruleEString640); 

                    		current.merge(this_TEMPLATE_2);
                        
                     
                        newLeafNode(this_TEMPLATE_2, grammarAccess.getEStringAccess().getTEMPLATETerminalRuleCall_2()); 
                        

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


    // $ANTLR start "entryRuleTAbstractMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:337:1: entryRuleTAbstractMessageView returns [EObject current=null] : iv_ruleTAbstractMessageView= ruleTAbstractMessageView EOF ;
    public final EObject entryRuleTAbstractMessageView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAbstractMessageView = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:338:2: (iv_ruleTAbstractMessageView= ruleTAbstractMessageView EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:339:2: iv_ruleTAbstractMessageView= ruleTAbstractMessageView EOF
            {
             newCompositeNode(grammarAccess.getTAbstractMessageViewRule()); 
            pushFollow(FOLLOW_ruleTAbstractMessageView_in_entryRuleTAbstractMessageView689);
            iv_ruleTAbstractMessageView=ruleTAbstractMessageView();

            state._fsp--;

             current =iv_ruleTAbstractMessageView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTAbstractMessageView699); 

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
    // $ANTLR end "entryRuleTAbstractMessageView"


    // $ANTLR start "ruleTAbstractMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:346:1: ruleTAbstractMessageView returns [EObject current=null] : ( () otherlv_1= 'lifelines' otherlv_2= '{' ( (lv_lifelines_3_0= ruleTLifeline ) ) ( (otherlv_4= ';' )? ( (lv_lifelines_5_0= ruleTLifeline ) ) )* otherlv_6= '}' ( (lv_messages_7_0= ruleTAbstractMessages ) ) ( (lv_messages_8_0= ruleTAbstractMessages ) )* ) ;
    public final EObject ruleTAbstractMessageView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_lifelines_3_0 = null;

        EObject lv_lifelines_5_0 = null;

        EObject lv_messages_7_0 = null;

        EObject lv_messages_8_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:349:28: ( ( () otherlv_1= 'lifelines' otherlv_2= '{' ( (lv_lifelines_3_0= ruleTLifeline ) ) ( (otherlv_4= ';' )? ( (lv_lifelines_5_0= ruleTLifeline ) ) )* otherlv_6= '}' ( (lv_messages_7_0= ruleTAbstractMessages ) ) ( (lv_messages_8_0= ruleTAbstractMessages ) )* ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:350:1: ( () otherlv_1= 'lifelines' otherlv_2= '{' ( (lv_lifelines_3_0= ruleTLifeline ) ) ( (otherlv_4= ';' )? ( (lv_lifelines_5_0= ruleTLifeline ) ) )* otherlv_6= '}' ( (lv_messages_7_0= ruleTAbstractMessages ) ) ( (lv_messages_8_0= ruleTAbstractMessages ) )* )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:350:1: ( () otherlv_1= 'lifelines' otherlv_2= '{' ( (lv_lifelines_3_0= ruleTLifeline ) ) ( (otherlv_4= ';' )? ( (lv_lifelines_5_0= ruleTLifeline ) ) )* otherlv_6= '}' ( (lv_messages_7_0= ruleTAbstractMessages ) ) ( (lv_messages_8_0= ruleTAbstractMessages ) )* )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:350:2: () otherlv_1= 'lifelines' otherlv_2= '{' ( (lv_lifelines_3_0= ruleTLifeline ) ) ( (otherlv_4= ';' )? ( (lv_lifelines_5_0= ruleTLifeline ) ) )* otherlv_6= '}' ( (lv_messages_7_0= ruleTAbstractMessages ) ) ( (lv_messages_8_0= ruleTAbstractMessages ) )*
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:350:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:351:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTAbstractMessageViewAccess().getTAbstractMessageViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleTAbstractMessageView745); 

                	newLeafNode(otherlv_1, grammarAccess.getTAbstractMessageViewAccess().getLifelinesKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTAbstractMessageView757); 

                	newLeafNode(otherlv_2, grammarAccess.getTAbstractMessageViewAccess().getLeftCurlyBracketKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:364:1: ( (lv_lifelines_3_0= ruleTLifeline ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:365:1: (lv_lifelines_3_0= ruleTLifeline )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:365:1: (lv_lifelines_3_0= ruleTLifeline )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:366:3: lv_lifelines_3_0= ruleTLifeline
            {
             
            	        newCompositeNode(grammarAccess.getTAbstractMessageViewAccess().getLifelinesTLifelineParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTLifeline_in_ruleTAbstractMessageView778);
            lv_lifelines_3_0=ruleTLifeline();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAbstractMessageViewRule());
            	        }
                   		add(
                   			current, 
                   			"lifelines",
                    		lv_lifelines_3_0, 
                    		"TLifeline");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:382:2: ( (otherlv_4= ';' )? ( (lv_lifelines_5_0= ruleTLifeline ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16||LA10_0==26||(LA10_0>=59 && LA10_0<=61)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:382:3: (otherlv_4= ';' )? ( (lv_lifelines_5_0= ruleTLifeline ) )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:382:3: (otherlv_4= ';' )?
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==16) ) {
            	        alt9=1;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:382:5: otherlv_4= ';'
            	            {
            	            otherlv_4=(Token)match(input,16,FOLLOW_16_in_ruleTAbstractMessageView792); 

            	                	newLeafNode(otherlv_4, grammarAccess.getTAbstractMessageViewAccess().getSemicolonKeyword_4_0());
            	                

            	            }
            	            break;

            	    }

            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:386:3: ( (lv_lifelines_5_0= ruleTLifeline ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:387:1: (lv_lifelines_5_0= ruleTLifeline )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:387:1: (lv_lifelines_5_0= ruleTLifeline )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:388:3: lv_lifelines_5_0= ruleTLifeline
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTAbstractMessageViewAccess().getLifelinesTLifelineParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTLifeline_in_ruleTAbstractMessageView815);
            	    lv_lifelines_5_0=ruleTLifeline();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTAbstractMessageViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"lifelines",
            	            		lv_lifelines_5_0, 
            	            		"TLifeline");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleTAbstractMessageView829); 

                	newLeafNode(otherlv_6, grammarAccess.getTAbstractMessageViewAccess().getRightCurlyBracketKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:408:1: ( (lv_messages_7_0= ruleTAbstractMessages ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:409:1: (lv_messages_7_0= ruleTAbstractMessages )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:409:1: (lv_messages_7_0= ruleTAbstractMessages )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:410:3: lv_messages_7_0= ruleTAbstractMessages
            {
             
            	        newCompositeNode(grammarAccess.getTAbstractMessageViewAccess().getMessagesTAbstractMessagesParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTAbstractMessages_in_ruleTAbstractMessageView850);
            lv_messages_7_0=ruleTAbstractMessages();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAbstractMessageViewRule());
            	        }
                   		add(
                   			current, 
                   			"messages",
                    		lv_messages_7_0, 
                    		"TAbstractMessages");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:426:2: ( (lv_messages_8_0= ruleTAbstractMessages ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34||LA11_0==38) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:427:1: (lv_messages_8_0= ruleTAbstractMessages )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:427:1: (lv_messages_8_0= ruleTAbstractMessages )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:428:3: lv_messages_8_0= ruleTAbstractMessages
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTAbstractMessageViewAccess().getMessagesTAbstractMessagesParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTAbstractMessages_in_ruleTAbstractMessageView871);
            	    lv_messages_8_0=ruleTAbstractMessages();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTAbstractMessageViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"messages",
            	            		lv_messages_8_0, 
            	            		"TAbstractMessages");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleTAbstractMessageView"


    // $ANTLR start "entryRuleTStructuralView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:452:1: entryRuleTStructuralView returns [EObject current=null] : iv_ruleTStructuralView= ruleTStructuralView EOF ;
    public final EObject entryRuleTStructuralView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTStructuralView = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:453:2: (iv_ruleTStructuralView= ruleTStructuralView EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:454:2: iv_ruleTStructuralView= ruleTStructuralView EOF
            {
             newCompositeNode(grammarAccess.getTStructuralViewRule()); 
            pushFollow(FOLLOW_ruleTStructuralView_in_entryRuleTStructuralView908);
            iv_ruleTStructuralView=ruleTStructuralView();

            state._fsp--;

             current =iv_ruleTStructuralView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTStructuralView918); 

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
    // $ANTLR end "entryRuleTStructuralView"


    // $ANTLR start "ruleTStructuralView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:461:1: ruleTStructuralView returns [EObject current=null] : ( () otherlv_1= 'structure' otherlv_2= '{' ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )? (otherlv_5= 'associations' otherlv_6= '{' ( (lv_tAssociations_7_0= ruleTAssociation ) ) ( (otherlv_8= ';' )? ( (lv_tAssociations_9_0= ruleTAssociation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleTStructuralView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_classes_3_0 = null;

        EObject lv_classes_4_0 = null;

        EObject lv_tAssociations_7_0 = null;

        EObject lv_tAssociations_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:464:28: ( ( () otherlv_1= 'structure' otherlv_2= '{' ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )? (otherlv_5= 'associations' otherlv_6= '{' ( (lv_tAssociations_7_0= ruleTAssociation ) ) ( (otherlv_8= ';' )? ( (lv_tAssociations_9_0= ruleTAssociation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:465:1: ( () otherlv_1= 'structure' otherlv_2= '{' ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )? (otherlv_5= 'associations' otherlv_6= '{' ( (lv_tAssociations_7_0= ruleTAssociation ) ) ( (otherlv_8= ';' )? ( (lv_tAssociations_9_0= ruleTAssociation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:465:1: ( () otherlv_1= 'structure' otherlv_2= '{' ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )? (otherlv_5= 'associations' otherlv_6= '{' ( (lv_tAssociations_7_0= ruleTAssociation ) ) ( (otherlv_8= ';' )? ( (lv_tAssociations_9_0= ruleTAssociation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:465:2: () otherlv_1= 'structure' otherlv_2= '{' ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )? (otherlv_5= 'associations' otherlv_6= '{' ( (lv_tAssociations_7_0= ruleTAssociation ) ) ( (otherlv_8= ';' )? ( (lv_tAssociations_9_0= ruleTAssociation ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:465:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:466:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTStructuralViewAccess().getTStructuralViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleTStructuralView964); 

                	newLeafNode(otherlv_1, grammarAccess.getTStructuralViewAccess().getStructureKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTStructuralView976); 

                	newLeafNode(otherlv_2, grammarAccess.getTStructuralViewAccess().getLeftCurlyBracketKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:479:1: ( ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=22 && LA13_0<=23)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:479:2: ( (lv_classes_3_0= ruleClassifier ) ) ( (lv_classes_4_0= ruleClassifier ) )*
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:479:2: ( (lv_classes_3_0= ruleClassifier ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:480:1: (lv_classes_3_0= ruleClassifier )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:480:1: (lv_classes_3_0= ruleClassifier )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:481:3: lv_classes_3_0= ruleClassifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getTStructuralViewAccess().getClassesClassifierParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassifier_in_ruleTStructuralView998);
                    lv_classes_3_0=ruleClassifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTStructuralViewRule());
                    	        }
                           		add(
                           			current, 
                           			"classes",
                            		lv_classes_3_0, 
                            		"Classifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:497:2: ( (lv_classes_4_0= ruleClassifier ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>=22 && LA12_0<=23)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:498:1: (lv_classes_4_0= ruleClassifier )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:498:1: (lv_classes_4_0= ruleClassifier )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:499:3: lv_classes_4_0= ruleClassifier
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTStructuralViewAccess().getClassesClassifierParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClassifier_in_ruleTStructuralView1019);
                    	    lv_classes_4_0=ruleClassifier();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTStructuralViewRule());
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
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:515:5: (otherlv_5= 'associations' otherlv_6= '{' ( (lv_tAssociations_7_0= ruleTAssociation ) ) ( (otherlv_8= ';' )? ( (lv_tAssociations_9_0= ruleTAssociation ) ) )* otherlv_10= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:515:7: otherlv_5= 'associations' otherlv_6= '{' ( (lv_tAssociations_7_0= ruleTAssociation ) ) ( (otherlv_8= ';' )? ( (lv_tAssociations_9_0= ruleTAssociation ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleTStructuralView1035); 

                        	newLeafNode(otherlv_5, grammarAccess.getTStructuralViewAccess().getAssociationsKeyword_4_0());
                        
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleTStructuralView1047); 

                        	newLeafNode(otherlv_6, grammarAccess.getTStructuralViewAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:523:1: ( (lv_tAssociations_7_0= ruleTAssociation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:524:1: (lv_tAssociations_7_0= ruleTAssociation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:524:1: (lv_tAssociations_7_0= ruleTAssociation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:525:3: lv_tAssociations_7_0= ruleTAssociation
                    {
                     
                    	        newCompositeNode(grammarAccess.getTStructuralViewAccess().getTAssociationsTAssociationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTAssociation_in_ruleTStructuralView1068);
                    lv_tAssociations_7_0=ruleTAssociation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTStructuralViewRule());
                    	        }
                           		add(
                           			current, 
                           			"tAssociations",
                            		lv_tAssociations_7_0, 
                            		"TAssociation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:541:2: ( (otherlv_8= ';' )? ( (lv_tAssociations_9_0= ruleTAssociation ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_INT)||LA15_0==16||LA15_0==31) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:541:3: (otherlv_8= ';' )? ( (lv_tAssociations_9_0= ruleTAssociation ) )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:541:3: (otherlv_8= ';' )?
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( (LA14_0==16) ) {
                    	        alt14=1;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:541:5: otherlv_8= ';'
                    	            {
                    	            otherlv_8=(Token)match(input,16,FOLLOW_16_in_ruleTStructuralView1082); 

                    	                	newLeafNode(otherlv_8, grammarAccess.getTStructuralViewAccess().getSemicolonKeyword_4_3_0());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:545:3: ( (lv_tAssociations_9_0= ruleTAssociation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:546:1: (lv_tAssociations_9_0= ruleTAssociation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:546:1: (lv_tAssociations_9_0= ruleTAssociation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:547:3: lv_tAssociations_9_0= ruleTAssociation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTStructuralViewAccess().getTAssociationsTAssociationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTAssociation_in_ruleTStructuralView1105);
                    	    lv_tAssociations_9_0=ruleTAssociation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTStructuralViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"tAssociations",
                    	            		lv_tAssociations_9_0, 
                    	            		"TAssociation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleTStructuralView1119); 

                        	newLeafNode(otherlv_10, grammarAccess.getTStructuralViewAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleTStructuralView1133); 

                	newLeafNode(otherlv_11, grammarAccess.getTStructuralViewAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleTStructuralView"


    // $ANTLR start "entryRuleClassifier"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:579:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:580:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:581:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier1169);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier1179); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:588:1: ruleClassifier returns [EObject current=null] : this_TClass_0= ruleTClass ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_TClass_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:591:28: (this_TClass_0= ruleTClass )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:593:5: this_TClass_0= ruleTClass
            {
             
                    newCompositeNode(grammarAccess.getClassifierAccess().getTClassParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleTClass_in_ruleClassifier1225);
            this_TClass_0=ruleTClass();

            state._fsp--;

             
                    current = this_TClass_0; 
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


    // $ANTLR start "entryRuleRString"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:615:1: entryRuleRString returns [EObject current=null] : iv_ruleRString= ruleRString EOF ;
    public final EObject entryRuleRString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRString = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:616:2: (iv_ruleRString= ruleRString EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:617:2: iv_ruleRString= ruleRString EOF
            {
             newCompositeNode(grammarAccess.getRStringRule()); 
            pushFollow(FOLLOW_ruleRString_in_entryRuleRString1265);
            iv_ruleRString=ruleRString();

            state._fsp--;

             current =iv_ruleRString; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRString1275); 

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
    // $ANTLR end "entryRuleRString"


    // $ANTLR start "ruleRString"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:624:1: ruleRString returns [EObject current=null] : () ;
    public final EObject ruleRString() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:627:28: ( () )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:628:1: ()
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:628:1: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:629:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRStringAccess().getRStringAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRString"


    // $ANTLR start "entryRuleRFloat"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:642:1: entryRuleRFloat returns [EObject current=null] : iv_ruleRFloat= ruleRFloat EOF ;
    public final EObject entryRuleRFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRFloat = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:643:2: (iv_ruleRFloat= ruleRFloat EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:644:2: iv_ruleRFloat= ruleRFloat EOF
            {
             newCompositeNode(grammarAccess.getRFloatRule()); 
            pushFollow(FOLLOW_ruleRFloat_in_entryRuleRFloat1343);
            iv_ruleRFloat=ruleRFloat();

            state._fsp--;

             current =iv_ruleRFloat; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRFloat1353); 

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
    // $ANTLR end "entryRuleRFloat"


    // $ANTLR start "ruleRFloat"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:651:1: ruleRFloat returns [EObject current=null] : () ;
    public final EObject ruleRFloat() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:654:28: ( () )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:655:1: ()
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:655:1: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:656:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRFloatAccess().getRFloatAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRFloat"


    // $ANTLR start "entryRuleRDouble"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:669:1: entryRuleRDouble returns [EObject current=null] : iv_ruleRDouble= ruleRDouble EOF ;
    public final EObject entryRuleRDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDouble = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:670:2: (iv_ruleRDouble= ruleRDouble EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:671:2: iv_ruleRDouble= ruleRDouble EOF
            {
             newCompositeNode(grammarAccess.getRDoubleRule()); 
            pushFollow(FOLLOW_ruleRDouble_in_entryRuleRDouble1421);
            iv_ruleRDouble=ruleRDouble();

            state._fsp--;

             current =iv_ruleRDouble; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRDouble1431); 

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
    // $ANTLR end "entryRuleRDouble"


    // $ANTLR start "ruleRDouble"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:678:1: ruleRDouble returns [EObject current=null] : () ;
    public final EObject ruleRDouble() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:681:28: ( () )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:682:1: ()
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:682:1: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:683:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRDoubleAccess().getRDoubleAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRDouble"


    // $ANTLR start "entryRuleRAny"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:696:1: entryRuleRAny returns [EObject current=null] : iv_ruleRAny= ruleRAny EOF ;
    public final EObject entryRuleRAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRAny = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:697:2: (iv_ruleRAny= ruleRAny EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:698:2: iv_ruleRAny= ruleRAny EOF
            {
             newCompositeNode(grammarAccess.getRAnyRule()); 
            pushFollow(FOLLOW_ruleRAny_in_entryRuleRAny1499);
            iv_ruleRAny=ruleRAny();

            state._fsp--;

             current =iv_ruleRAny; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRAny1509); 

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
    // $ANTLR end "entryRuleRAny"


    // $ANTLR start "ruleRAny"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:705:1: ruleRAny returns [EObject current=null] : () ;
    public final EObject ruleRAny() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:708:28: ( () )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:709:1: ()
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:709:1: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:710:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRAnyAccess().getRAnyAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRAny"


    // $ANTLR start "entryRuleRChar"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:723:1: entryRuleRChar returns [EObject current=null] : iv_ruleRChar= ruleRChar EOF ;
    public final EObject entryRuleRChar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRChar = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:724:2: (iv_ruleRChar= ruleRChar EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:725:2: iv_ruleRChar= ruleRChar EOF
            {
             newCompositeNode(grammarAccess.getRCharRule()); 
            pushFollow(FOLLOW_ruleRChar_in_entryRuleRChar1577);
            iv_ruleRChar=ruleRChar();

            state._fsp--;

             current =iv_ruleRChar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRChar1587); 

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
    // $ANTLR end "entryRuleRChar"


    // $ANTLR start "ruleRChar"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:732:1: ruleRChar returns [EObject current=null] : () ;
    public final EObject ruleRChar() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:735:28: ( () )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:736:1: ()
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:736:1: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:737:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRCharAccess().getRCharAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRChar"


    // $ANTLR start "entryRuleRInt"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:750:1: entryRuleRInt returns [EObject current=null] : iv_ruleRInt= ruleRInt EOF ;
    public final EObject entryRuleRInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRInt = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:751:2: (iv_ruleRInt= ruleRInt EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:752:2: iv_ruleRInt= ruleRInt EOF
            {
             newCompositeNode(grammarAccess.getRIntRule()); 
            pushFollow(FOLLOW_ruleRInt_in_entryRuleRInt1655);
            iv_ruleRInt=ruleRInt();

            state._fsp--;

             current =iv_ruleRInt; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRInt1665); 

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
    // $ANTLR end "entryRuleRInt"


    // $ANTLR start "ruleRInt"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:759:1: ruleRInt returns [EObject current=null] : () ;
    public final EObject ruleRInt() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:762:28: ( () )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:763:1: ()
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:763:1: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:764:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRIntAccess().getRIntAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRInt"


    // $ANTLR start "entryRuleRBoolean"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:777:1: entryRuleRBoolean returns [EObject current=null] : iv_ruleRBoolean= ruleRBoolean EOF ;
    public final EObject entryRuleRBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRBoolean = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:778:2: (iv_ruleRBoolean= ruleRBoolean EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:779:2: iv_ruleRBoolean= ruleRBoolean EOF
            {
             newCompositeNode(grammarAccess.getRBooleanRule()); 
            pushFollow(FOLLOW_ruleRBoolean_in_entryRuleRBoolean1733);
            iv_ruleRBoolean=ruleRBoolean();

            state._fsp--;

             current =iv_ruleRBoolean; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRBoolean1743); 

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
    // $ANTLR end "entryRuleRBoolean"


    // $ANTLR start "ruleRBoolean"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:786:1: ruleRBoolean returns [EObject current=null] : () ;
    public final EObject ruleRBoolean() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:789:28: ( () )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:790:1: ()
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:790:1: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:791:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRBooleanAccess().getRBooleanAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRBoolean"


    // $ANTLR start "entryRuleRVoid"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:804:1: entryRuleRVoid returns [EObject current=null] : iv_ruleRVoid= ruleRVoid EOF ;
    public final EObject entryRuleRVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRVoid = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:805:2: (iv_ruleRVoid= ruleRVoid EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:806:2: iv_ruleRVoid= ruleRVoid EOF
            {
             newCompositeNode(grammarAccess.getRVoidRule()); 
            pushFollow(FOLLOW_ruleRVoid_in_entryRuleRVoid1811);
            iv_ruleRVoid=ruleRVoid();

            state._fsp--;

             current =iv_ruleRVoid; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRVoid1821); 

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
    // $ANTLR end "entryRuleRVoid"


    // $ANTLR start "ruleRVoid"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:813:1: ruleRVoid returns [EObject current=null] : () ;
    public final EObject ruleRVoid() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:816:28: ( () )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:817:1: ()
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:817:1: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:818:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRVoidAccess().getRVoidAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRVoid"


    // $ANTLR start "entryRuleRSet"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:831:1: entryRuleRSet returns [EObject current=null] : iv_ruleRSet= ruleRSet EOF ;
    public final EObject entryRuleRSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSet = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:832:2: (iv_ruleRSet= ruleRSet EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:833:2: iv_ruleRSet= ruleRSet EOF
            {
             newCompositeNode(grammarAccess.getRSetRule()); 
            pushFollow(FOLLOW_ruleRSet_in_entryRuleRSet1889);
            iv_ruleRSet=ruleRSet();

            state._fsp--;

             current =iv_ruleRSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSet1899); 

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
    // $ANTLR end "entryRuleRSet"


    // $ANTLR start "ruleRSet"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:840:1: ruleRSet returns [EObject current=null] : () ;
    public final EObject ruleRSet() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:843:28: ( () )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:844:1: ()
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:844:1: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:845:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRSetAccess().getRSetAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRSet"


    // $ANTLR start "entryRuleTClassMember"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:860:1: entryRuleTClassMember returns [EObject current=null] : iv_ruleTClassMember= ruleTClassMember EOF ;
    public final EObject entryRuleTClassMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTClassMember = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:861:2: (iv_ruleTClassMember= ruleTClassMember EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:862:2: iv_ruleTClassMember= ruleTClassMember EOF
            {
             newCompositeNode(grammarAccess.getTClassMemberRule()); 
            pushFollow(FOLLOW_ruleTClassMember_in_entryRuleTClassMember1969);
            iv_ruleTClassMember=ruleTClassMember();

            state._fsp--;

             current =iv_ruleTClassMember; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTClassMember1979); 

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
    // $ANTLR end "entryRuleTClassMember"


    // $ANTLR start "ruleTClassMember"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:869:1: ruleTClassMember returns [EObject current=null] : (this_TAttribute_0= ruleTAttribute | this_TOperation_1= ruleTOperation ) ;
    public final EObject ruleTClassMember() throws RecognitionException {
        EObject current = null;

        EObject this_TAttribute_0 = null;

        EObject this_TOperation_1 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:872:28: ( (this_TAttribute_0= ruleTAttribute | this_TOperation_1= ruleTOperation ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:873:1: (this_TAttribute_0= ruleTAttribute | this_TOperation_1= ruleTOperation )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:873:1: (this_TAttribute_0= ruleTAttribute | this_TOperation_1= ruleTOperation )
            int alt17=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA17_1 = input.LA(2);

                if ( ((LA17_1>=RULE_STRING && LA17_1<=RULE_TEMPLATE)) ) {
                    alt17=1;
                }
                else if ( ((LA17_1>=48 && LA17_1<=51)) ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_TEMPLATE:
                {
                alt17=1;
                }
                break;
            case 22:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt17=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:874:5: this_TAttribute_0= ruleTAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getTClassMemberAccess().getTAttributeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTAttribute_in_ruleTClassMember2026);
                    this_TAttribute_0=ruleTAttribute();

                    state._fsp--;

                     
                            current = this_TAttribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:884:5: this_TOperation_1= ruleTOperation
                    {
                     
                            newCompositeNode(grammarAccess.getTClassMemberAccess().getTOperationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTOperation_in_ruleTClassMember2053);
                    this_TOperation_1=ruleTOperation();

                    state._fsp--;

                     
                            current = this_TOperation_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleTClassMember"


    // $ANTLR start "entryRuleTClass"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:900:1: entryRuleTClass returns [EObject current=null] : iv_ruleTClass= ruleTClass EOF ;
    public final EObject entryRuleTClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTClass = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:901:2: (iv_ruleTClass= ruleTClass EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:902:2: iv_ruleTClass= ruleTClass EOF
            {
             newCompositeNode(grammarAccess.getTClassRule()); 
            pushFollow(FOLLOW_ruleTClass_in_entryRuleTClass2088);
            iv_ruleTClass=ruleTClass();

            state._fsp--;

             current =iv_ruleTClass; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTClass2098); 

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
    // $ANTLR end "entryRuleTClass"


    // $ANTLR start "ruleTClass"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:909:1: ruleTClass returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_partial_3_0= '|' ) )? ( (lv_name_4_0= ruleEString ) ) (otherlv_5= ':' ( (lv_partialSuperType_6_0= '|' ) )? ( ( ruleEString ) ) )? otherlv_8= '{' ( ( (lv_members_9_0= ruleTClassMember ) ) ( (otherlv_10= ';' )? ( (lv_members_11_0= ruleTClassMember ) ) )* )? otherlv_12= '}' ) ;
    public final EObject ruleTClass() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token otherlv_2=null;
        Token lv_partial_3_0=null;
        Token otherlv_5=null;
        Token lv_partialSuperType_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_members_9_0 = null;

        EObject lv_members_11_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:912:28: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_partial_3_0= '|' ) )? ( (lv_name_4_0= ruleEString ) ) (otherlv_5= ':' ( (lv_partialSuperType_6_0= '|' ) )? ( ( ruleEString ) ) )? otherlv_8= '{' ( ( (lv_members_9_0= ruleTClassMember ) ) ( (otherlv_10= ';' )? ( (lv_members_11_0= ruleTClassMember ) ) )* )? otherlv_12= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:913:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_partial_3_0= '|' ) )? ( (lv_name_4_0= ruleEString ) ) (otherlv_5= ':' ( (lv_partialSuperType_6_0= '|' ) )? ( ( ruleEString ) ) )? otherlv_8= '{' ( ( (lv_members_9_0= ruleTClassMember ) ) ( (otherlv_10= ';' )? ( (lv_members_11_0= ruleTClassMember ) ) )* )? otherlv_12= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:913:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_partial_3_0= '|' ) )? ( (lv_name_4_0= ruleEString ) ) (otherlv_5= ':' ( (lv_partialSuperType_6_0= '|' ) )? ( ( ruleEString ) ) )? otherlv_8= '{' ( ( (lv_members_9_0= ruleTClassMember ) ) ( (otherlv_10= ';' )? ( (lv_members_11_0= ruleTClassMember ) ) )* )? otherlv_12= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:913:2: () ( (lv_abstract_1_0= 'abstract' ) )? otherlv_2= 'class' ( (lv_partial_3_0= '|' ) )? ( (lv_name_4_0= ruleEString ) ) (otherlv_5= ':' ( (lv_partialSuperType_6_0= '|' ) )? ( ( ruleEString ) ) )? otherlv_8= '{' ( ( (lv_members_9_0= ruleTClassMember ) ) ( (otherlv_10= ';' )? ( (lv_members_11_0= ruleTClassMember ) ) )* )? otherlv_12= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:913:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:914:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTClassAccess().getTClassAction_0(),
                        current);
                

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:919:2: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:920:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:920:1: (lv_abstract_1_0= 'abstract' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:921:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,22,FOLLOW_22_in_ruleTClass2150); 

                            newLeafNode(lv_abstract_1_0, grammarAccess.getTClassAccess().getAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTClassRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleTClass2176); 

                	newLeafNode(otherlv_2, grammarAccess.getTClassAccess().getClassKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:938:1: ( (lv_partial_3_0= '|' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:939:1: (lv_partial_3_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:939:1: (lv_partial_3_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:940:3: lv_partial_3_0= '|'
                    {
                    lv_partial_3_0=(Token)match(input,24,FOLLOW_24_in_ruleTClass2194); 

                            newLeafNode(lv_partial_3_0, grammarAccess.getTClassAccess().getPartialVerticalLineKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTClassRule());
                    	        }
                           		setWithLastConsumed(current, "partial", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:953:3: ( (lv_name_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:954:1: (lv_name_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:954:1: (lv_name_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:955:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTClassAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTClass2229);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTClassRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:971:2: (otherlv_5= ':' ( (lv_partialSuperType_6_0= '|' ) )? ( ( ruleEString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:971:4: otherlv_5= ':' ( (lv_partialSuperType_6_0= '|' ) )? ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleTClass2242); 

                        	newLeafNode(otherlv_5, grammarAccess.getTClassAccess().getColonKeyword_5_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:975:1: ( (lv_partialSuperType_6_0= '|' ) )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==24) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:976:1: (lv_partialSuperType_6_0= '|' )
                            {
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:976:1: (lv_partialSuperType_6_0= '|' )
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:977:3: lv_partialSuperType_6_0= '|'
                            {
                            lv_partialSuperType_6_0=(Token)match(input,24,FOLLOW_24_in_ruleTClass2260); 

                                    newLeafNode(lv_partialSuperType_6_0, grammarAccess.getTClassAccess().getPartialSuperTypeVerticalLineKeyword_5_1_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTClassRule());
                            	        }
                                   		setWithLastConsumed(current, "partialSuperType", true, "|");
                            	    

                            }


                            }
                            break;

                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:990:3: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:991:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:991:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:992:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTClassAccess().getSuperTypesClassifierCrossReference_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTClass2297);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,14,FOLLOW_14_in_ruleTClass2311); 

                	newLeafNode(otherlv_8, grammarAccess.getTClassAccess().getLeftCurlyBracketKeyword_6());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1009:1: ( ( (lv_members_9_0= ruleTClassMember ) ) ( (otherlv_10= ';' )? ( (lv_members_11_0= ruleTClassMember ) ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_TEMPLATE)||LA24_0==22||LA24_0==26||(LA24_0>=48 && LA24_0<=51)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1009:2: ( (lv_members_9_0= ruleTClassMember ) ) ( (otherlv_10= ';' )? ( (lv_members_11_0= ruleTClassMember ) ) )*
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1009:2: ( (lv_members_9_0= ruleTClassMember ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1010:1: (lv_members_9_0= ruleTClassMember )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1010:1: (lv_members_9_0= ruleTClassMember )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1011:3: lv_members_9_0= ruleTClassMember
                    {
                     
                    	        newCompositeNode(grammarAccess.getTClassAccess().getMembersTClassMemberParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTClassMember_in_ruleTClass2333);
                    lv_members_9_0=ruleTClassMember();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTClassRule());
                    	        }
                           		add(
                           			current, 
                           			"members",
                            		lv_members_9_0, 
                            		"TClassMember");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1027:2: ( (otherlv_10= ';' )? ( (lv_members_11_0= ruleTClassMember ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=RULE_STRING && LA23_0<=RULE_TEMPLATE)||LA23_0==16||LA23_0==22||LA23_0==26||(LA23_0>=48 && LA23_0<=51)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1027:3: (otherlv_10= ';' )? ( (lv_members_11_0= ruleTClassMember ) )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1027:3: (otherlv_10= ';' )?
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==16) ) {
                    	        alt22=1;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1027:5: otherlv_10= ';'
                    	            {
                    	            otherlv_10=(Token)match(input,16,FOLLOW_16_in_ruleTClass2347); 

                    	                	newLeafNode(otherlv_10, grammarAccess.getTClassAccess().getSemicolonKeyword_7_1_0());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1031:3: ( (lv_members_11_0= ruleTClassMember ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1032:1: (lv_members_11_0= ruleTClassMember )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1032:1: (lv_members_11_0= ruleTClassMember )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1033:3: lv_members_11_0= ruleTClassMember
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTClassAccess().getMembersTClassMemberParserRuleCall_7_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTClassMember_in_ruleTClass2370);
                    	    lv_members_11_0=ruleTClassMember();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"members",
                    	            		lv_members_11_0, 
                    	            		"TClassMember");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleTClass2386); 

                	newLeafNode(otherlv_12, grammarAccess.getTClassAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleTClass"


    // $ANTLR start "entryRuleTAttribute"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1061:1: entryRuleTAttribute returns [EObject current=null] : iv_ruleTAttribute= ruleTAttribute EOF ;
    public final EObject entryRuleTAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAttribute = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1062:2: (iv_ruleTAttribute= ruleTAttribute EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1063:2: iv_ruleTAttribute= ruleTAttribute EOF
            {
             newCompositeNode(grammarAccess.getTAttributeRule()); 
            pushFollow(FOLLOW_ruleTAttribute_in_entryRuleTAttribute2422);
            iv_ruleTAttribute=ruleTAttribute();

            state._fsp--;

             current =iv_ruleTAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTAttribute2432); 

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
    // $ANTLR end "entryRuleTAttribute"


    // $ANTLR start "ruleTAttribute"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1070:1: ruleTAttribute returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) )? ( ( ruleEString ) ) ( (lv_partial_2_0= '|' ) )? ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleTAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        Token lv_partial_2_0=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1073:28: ( ( ( (lv_static_0_0= 'static' ) )? ( ( ruleEString ) ) ( (lv_partial_2_0= '|' ) )? ( (lv_name_3_0= ruleEString ) ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1074:1: ( ( (lv_static_0_0= 'static' ) )? ( ( ruleEString ) ) ( (lv_partial_2_0= '|' ) )? ( (lv_name_3_0= ruleEString ) ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1074:1: ( ( (lv_static_0_0= 'static' ) )? ( ( ruleEString ) ) ( (lv_partial_2_0= '|' ) )? ( (lv_name_3_0= ruleEString ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1074:2: ( (lv_static_0_0= 'static' ) )? ( ( ruleEString ) ) ( (lv_partial_2_0= '|' ) )? ( (lv_name_3_0= ruleEString ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1074:2: ( (lv_static_0_0= 'static' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1075:1: (lv_static_0_0= 'static' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1075:1: (lv_static_0_0= 'static' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1076:3: lv_static_0_0= 'static'
                    {
                    lv_static_0_0=(Token)match(input,26,FOLLOW_26_in_ruleTAttribute2475); 

                            newLeafNode(lv_static_0_0, grammarAccess.getTAttributeAccess().getStaticStaticKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "static", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1089:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1090:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1090:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1091:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTAttributeAccess().getTypePrimitiveTypeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTAttribute2512);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1104:2: ( (lv_partial_2_0= '|' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==24) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1105:1: (lv_partial_2_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1105:1: (lv_partial_2_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1106:3: lv_partial_2_0= '|'
                    {
                    lv_partial_2_0=(Token)match(input,24,FOLLOW_24_in_ruleTAttribute2530); 

                            newLeafNode(lv_partial_2_0, grammarAccess.getTAttributeAccess().getPartialVerticalLineKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTAttributeRule());
                    	        }
                           		setWithLastConsumed(current, "partial", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1119:3: ( (lv_name_3_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1120:1: (lv_name_3_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1120:1: (lv_name_3_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1121:3: lv_name_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTAttributeAccess().getNameEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTAttribute2565);
            lv_name_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleTAttribute"


    // $ANTLR start "entryRuleTOperation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1145:1: entryRuleTOperation returns [EObject current=null] : iv_ruleTOperation= ruleTOperation EOF ;
    public final EObject entryRuleTOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTOperation = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1146:2: (iv_ruleTOperation= ruleTOperation EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1147:2: iv_ruleTOperation= ruleTOperation EOF
            {
             newCompositeNode(grammarAccess.getTOperationRule()); 
            pushFollow(FOLLOW_ruleTOperation_in_entryRuleTOperation2601);
            iv_ruleTOperation=ruleTOperation();

            state._fsp--;

             current =iv_ruleTOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOperation2611); 

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
    // $ANTLR end "entryRuleTOperation"


    // $ANTLR start "ruleTOperation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1154:1: ruleTOperation returns [EObject current=null] : ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_visibility_3_0= ruleVisibility ) ) ( (lv_partialReturnType_4_0= '|' ) )? ( ( ruleEString ) ) ( (lv_partial_6_0= '|' ) )? ( (lv_name_7_0= ruleEString ) ) otherlv_8= '(' ( ( (lv_parameters_9_0= ruleTParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleTParameter ) ) )* )? otherlv_12= ')' ) ;
    public final EObject ruleTOperation() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_1_0=null;
        Token lv_static_2_0=null;
        Token lv_partialReturnType_4_0=null;
        Token lv_partial_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_visibility_3_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_parameters_9_0 = null;

        EObject lv_parameters_11_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1157:28: ( ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_visibility_3_0= ruleVisibility ) ) ( (lv_partialReturnType_4_0= '|' ) )? ( ( ruleEString ) ) ( (lv_partial_6_0= '|' ) )? ( (lv_name_7_0= ruleEString ) ) otherlv_8= '(' ( ( (lv_parameters_9_0= ruleTParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleTParameter ) ) )* )? otherlv_12= ')' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1158:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_visibility_3_0= ruleVisibility ) ) ( (lv_partialReturnType_4_0= '|' ) )? ( ( ruleEString ) ) ( (lv_partial_6_0= '|' ) )? ( (lv_name_7_0= ruleEString ) ) otherlv_8= '(' ( ( (lv_parameters_9_0= ruleTParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleTParameter ) ) )* )? otherlv_12= ')' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1158:1: ( () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_visibility_3_0= ruleVisibility ) ) ( (lv_partialReturnType_4_0= '|' ) )? ( ( ruleEString ) ) ( (lv_partial_6_0= '|' ) )? ( (lv_name_7_0= ruleEString ) ) otherlv_8= '(' ( ( (lv_parameters_9_0= ruleTParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleTParameter ) ) )* )? otherlv_12= ')' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1158:2: () ( (lv_abstract_1_0= 'abstract' ) )? ( (lv_static_2_0= 'static' ) )? ( (lv_visibility_3_0= ruleVisibility ) ) ( (lv_partialReturnType_4_0= '|' ) )? ( ( ruleEString ) ) ( (lv_partial_6_0= '|' ) )? ( (lv_name_7_0= ruleEString ) ) otherlv_8= '(' ( ( (lv_parameters_9_0= ruleTParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleTParameter ) ) )* )? otherlv_12= ')'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1158:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1159:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTOperationAccess().getTOperationAction_0(),
                        current);
                

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1164:2: ( (lv_abstract_1_0= 'abstract' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==22) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1165:1: (lv_abstract_1_0= 'abstract' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1165:1: (lv_abstract_1_0= 'abstract' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1166:3: lv_abstract_1_0= 'abstract'
                    {
                    lv_abstract_1_0=(Token)match(input,22,FOLLOW_22_in_ruleTOperation2663); 

                            newLeafNode(lv_abstract_1_0, grammarAccess.getTOperationAccess().getAbstractAbstractKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTOperationRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1179:3: ( (lv_static_2_0= 'static' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1180:1: (lv_static_2_0= 'static' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1180:1: (lv_static_2_0= 'static' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1181:3: lv_static_2_0= 'static'
                    {
                    lv_static_2_0=(Token)match(input,26,FOLLOW_26_in_ruleTOperation2695); 

                            newLeafNode(lv_static_2_0, grammarAccess.getTOperationAccess().getStaticStaticKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTOperationRule());
                    	        }
                           		setWithLastConsumed(current, "static", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1194:3: ( (lv_visibility_3_0= ruleVisibility ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1195:1: (lv_visibility_3_0= ruleVisibility )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1195:1: (lv_visibility_3_0= ruleVisibility )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1196:3: lv_visibility_3_0= ruleVisibility
            {
             
            	        newCompositeNode(grammarAccess.getTOperationAccess().getVisibilityVisibilityEnumRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleVisibility_in_ruleTOperation2730);
            lv_visibility_3_0=ruleVisibility();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTOperationRule());
            	        }
                   		set(
                   			current, 
                   			"visibility",
                    		lv_visibility_3_0, 
                    		"Visibility");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1212:2: ( (lv_partialReturnType_4_0= '|' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==24) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1213:1: (lv_partialReturnType_4_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1213:1: (lv_partialReturnType_4_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1214:3: lv_partialReturnType_4_0= '|'
                    {
                    lv_partialReturnType_4_0=(Token)match(input,24,FOLLOW_24_in_ruleTOperation2748); 

                            newLeafNode(lv_partialReturnType_4_0, grammarAccess.getTOperationAccess().getPartialReturnTypeVerticalLineKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTOperationRule());
                    	        }
                           		setWithLastConsumed(current, "partialReturnType", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1227:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1228:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1228:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1229:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTOperationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTOperationAccess().getReturnTypeTypeCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTOperation2785);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1242:2: ( (lv_partial_6_0= '|' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==24) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1243:1: (lv_partial_6_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1243:1: (lv_partial_6_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1244:3: lv_partial_6_0= '|'
                    {
                    lv_partial_6_0=(Token)match(input,24,FOLLOW_24_in_ruleTOperation2803); 

                            newLeafNode(lv_partial_6_0, grammarAccess.getTOperationAccess().getPartialVerticalLineKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTOperationRule());
                    	        }
                           		setWithLastConsumed(current, "partial", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1257:3: ( (lv_name_7_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1258:1: (lv_name_7_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1258:1: (lv_name_7_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1259:3: lv_name_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTOperationAccess().getNameEStringParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTOperation2838);
            lv_name_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTOperationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_7_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleTOperation2850); 

                	newLeafNode(otherlv_8, grammarAccess.getTOperationAccess().getLeftParenthesisKeyword_8());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1279:1: ( ( (lv_parameters_9_0= ruleTParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleTParameter ) ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_TEMPLATE)||LA32_0==24) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1279:2: ( (lv_parameters_9_0= ruleTParameter ) ) (otherlv_10= ',' ( (lv_parameters_11_0= ruleTParameter ) ) )*
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1279:2: ( (lv_parameters_9_0= ruleTParameter ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1280:1: (lv_parameters_9_0= ruleTParameter )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1280:1: (lv_parameters_9_0= ruleTParameter )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1281:3: lv_parameters_9_0= ruleTParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getTOperationAccess().getParametersTParameterParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTParameter_in_ruleTOperation2872);
                    lv_parameters_9_0=ruleTParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_9_0, 
                            		"TParameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1297:2: (otherlv_10= ',' ( (lv_parameters_11_0= ruleTParameter ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==13) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1297:4: otherlv_10= ',' ( (lv_parameters_11_0= ruleTParameter ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleTOperation2885); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getTOperationAccess().getCommaKeyword_9_1_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1301:1: ( (lv_parameters_11_0= ruleTParameter ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1302:1: (lv_parameters_11_0= ruleTParameter )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1302:1: (lv_parameters_11_0= ruleTParameter )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1303:3: lv_parameters_11_0= ruleTParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTOperationAccess().getParametersTParameterParserRuleCall_9_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTParameter_in_ruleTOperation2906);
                    	    lv_parameters_11_0=ruleTParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_11_0, 
                    	            		"TParameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleTOperation2922); 

                	newLeafNode(otherlv_12, grammarAccess.getTOperationAccess().getRightParenthesisKeyword_10());
                

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
    // $ANTLR end "ruleTOperation"


    // $ANTLR start "entryRuleTParameter"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1331:1: entryRuleTParameter returns [EObject current=null] : iv_ruleTParameter= ruleTParameter EOF ;
    public final EObject entryRuleTParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTParameter = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1332:2: (iv_ruleTParameter= ruleTParameter EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1333:2: iv_ruleTParameter= ruleTParameter EOF
            {
             newCompositeNode(grammarAccess.getTParameterRule()); 
            pushFollow(FOLLOW_ruleTParameter_in_entryRuleTParameter2958);
            iv_ruleTParameter=ruleTParameter();

            state._fsp--;

             current =iv_ruleTParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTParameter2968); 

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
    // $ANTLR end "entryRuleTParameter"


    // $ANTLR start "ruleTParameter"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1340:1: ruleTParameter returns [EObject current=null] : ( ( (lv_partialType_0_0= '|' ) )? ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleTParameter() throws RecognitionException {
        EObject current = null;

        Token lv_partialType_0_0=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1343:28: ( ( ( (lv_partialType_0_0= '|' ) )? ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1344:1: ( ( (lv_partialType_0_0= '|' ) )? ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1344:1: ( ( (lv_partialType_0_0= '|' ) )? ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1344:2: ( (lv_partialType_0_0= '|' ) )? ( ( ruleEString ) ) ( (lv_name_2_0= ruleEString ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1344:2: ( (lv_partialType_0_0= '|' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==24) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1345:1: (lv_partialType_0_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1345:1: (lv_partialType_0_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1346:3: lv_partialType_0_0= '|'
                    {
                    lv_partialType_0_0=(Token)match(input,24,FOLLOW_24_in_ruleTParameter3011); 

                            newLeafNode(lv_partialType_0_0, grammarAccess.getTParameterAccess().getPartialTypeVerticalLineKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTParameterRule());
                    	        }
                           		setWithLastConsumed(current, "partialType", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1359:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1360:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1360:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1361:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTParameterAccess().getTypeTypeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTParameter3048);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1374:2: ( (lv_name_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1375:1: (lv_name_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1375:1: (lv_name_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1376:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTParameterAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTParameter3069);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleTParameter"


    // $ANTLR start "entryRuleTAssociation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1400:1: entryRuleTAssociation returns [EObject current=null] : iv_ruleTAssociation= ruleTAssociation EOF ;
    public final EObject entryRuleTAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAssociation = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1401:2: (iv_ruleTAssociation= ruleTAssociation EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1402:2: iv_ruleTAssociation= ruleTAssociation EOF
            {
             newCompositeNode(grammarAccess.getTAssociationRule()); 
            pushFollow(FOLLOW_ruleTAssociation_in_entryRuleTAssociation3105);
            iv_ruleTAssociation=ruleTAssociation();

            state._fsp--;

             current =iv_ruleTAssociation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTAssociation3115); 

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
    // $ANTLR end "entryRuleTAssociation"


    // $ANTLR start "ruleTAssociation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1409:1: ruleTAssociation returns [EObject current=null] : ( () ( (lv_fromEnd_1_0= ruleTAssociationEnd ) ) ( (lv_referenceType_2_0= ruleReferenceType ) )? otherlv_3= '->' ( (lv_toEnd_4_0= ruleTAssociationEnd ) ) otherlv_5= '{' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleTAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_fromEnd_1_0 = null;

        Enumerator lv_referenceType_2_0 = null;

        EObject lv_toEnd_4_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1412:28: ( ( () ( (lv_fromEnd_1_0= ruleTAssociationEnd ) ) ( (lv_referenceType_2_0= ruleReferenceType ) )? otherlv_3= '->' ( (lv_toEnd_4_0= ruleTAssociationEnd ) ) otherlv_5= '{' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1413:1: ( () ( (lv_fromEnd_1_0= ruleTAssociationEnd ) ) ( (lv_referenceType_2_0= ruleReferenceType ) )? otherlv_3= '->' ( (lv_toEnd_4_0= ruleTAssociationEnd ) ) otherlv_5= '{' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1413:1: ( () ( (lv_fromEnd_1_0= ruleTAssociationEnd ) ) ( (lv_referenceType_2_0= ruleReferenceType ) )? otherlv_3= '->' ( (lv_toEnd_4_0= ruleTAssociationEnd ) ) otherlv_5= '{' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1413:2: () ( (lv_fromEnd_1_0= ruleTAssociationEnd ) ) ( (lv_referenceType_2_0= ruleReferenceType ) )? otherlv_3= '->' ( (lv_toEnd_4_0= ruleTAssociationEnd ) ) otherlv_5= '{' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1413:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1414:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTAssociationAccess().getTAssociationAction_0(),
                        current);
                

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1419:2: ( (lv_fromEnd_1_0= ruleTAssociationEnd ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1420:1: (lv_fromEnd_1_0= ruleTAssociationEnd )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1420:1: (lv_fromEnd_1_0= ruleTAssociationEnd )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1421:3: lv_fromEnd_1_0= ruleTAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getTAssociationAccess().getFromEndTAssociationEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTAssociationEnd_in_ruleTAssociation3170);
            lv_fromEnd_1_0=ruleTAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"fromEnd",
                    		lv_fromEnd_1_0, 
                    		"TAssociationEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1437:2: ( (lv_referenceType_2_0= ruleReferenceType ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31||LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1438:1: (lv_referenceType_2_0= ruleReferenceType )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1438:1: (lv_referenceType_2_0= ruleReferenceType )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1439:3: lv_referenceType_2_0= ruleReferenceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTAssociationAccess().getReferenceTypeReferenceTypeEnumRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReferenceType_in_ruleTAssociation3191);
                    lv_referenceType_2_0=ruleReferenceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTAssociationRule());
                    	        }
                           		set(
                           			current, 
                           			"referenceType",
                            		lv_referenceType_2_0, 
                            		"ReferenceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleTAssociation3204); 

                	newLeafNode(otherlv_3, grammarAccess.getTAssociationAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1459:1: ( (lv_toEnd_4_0= ruleTAssociationEnd ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1460:1: (lv_toEnd_4_0= ruleTAssociationEnd )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1460:1: (lv_toEnd_4_0= ruleTAssociationEnd )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1461:3: lv_toEnd_4_0= ruleTAssociationEnd
            {
             
            	        newCompositeNode(grammarAccess.getTAssociationAccess().getToEndTAssociationEndParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTAssociationEnd_in_ruleTAssociation3225);
            lv_toEnd_4_0=ruleTAssociationEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"toEnd",
                    		lv_toEnd_4_0, 
                    		"TAssociationEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleTAssociation3237); 

                	newLeafNode(otherlv_5, grammarAccess.getTAssociationAccess().getLeftCurlyBracketKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1481:1: ( (lv_name_6_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1482:1: (lv_name_6_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1482:1: (lv_name_6_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1483:3: lv_name_6_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTAssociationAccess().getNameEStringParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTAssociation3258);
            lv_name_6_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleTAssociation3270); 

                	newLeafNode(otherlv_7, grammarAccess.getTAssociationAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleTAssociation"


    // $ANTLR start "entryRuleTAssociationEnd"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1511:1: entryRuleTAssociationEnd returns [EObject current=null] : iv_ruleTAssociationEnd= ruleTAssociationEnd EOF ;
    public final EObject entryRuleTAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAssociationEnd = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1512:2: (iv_ruleTAssociationEnd= ruleTAssociationEnd EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1513:2: iv_ruleTAssociationEnd= ruleTAssociationEnd EOF
            {
             newCompositeNode(grammarAccess.getTAssociationEndRule()); 
            pushFollow(FOLLOW_ruleTAssociationEnd_in_entryRuleTAssociationEnd3306);
            iv_ruleTAssociationEnd=ruleTAssociationEnd();

            state._fsp--;

             current =iv_ruleTAssociationEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTAssociationEnd3316); 

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
    // $ANTLR end "entryRuleTAssociationEnd"


    // $ANTLR start "ruleTAssociationEnd"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1520:1: ruleTAssociationEnd returns [EObject current=null] : ( () ( ( (lv_lowerBound_1_0= ruleElementBound ) ) otherlv_2= '..' )? ( (lv_upperBound_3_0= ruleElementBound ) )? ( ( ruleEString ) ) ) ;
    public final EObject ruleTAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_lowerBound_1_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_3_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1523:28: ( ( () ( ( (lv_lowerBound_1_0= ruleElementBound ) ) otherlv_2= '..' )? ( (lv_upperBound_3_0= ruleElementBound ) )? ( ( ruleEString ) ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1524:1: ( () ( ( (lv_lowerBound_1_0= ruleElementBound ) ) otherlv_2= '..' )? ( (lv_upperBound_3_0= ruleElementBound ) )? ( ( ruleEString ) ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1524:1: ( () ( ( (lv_lowerBound_1_0= ruleElementBound ) ) otherlv_2= '..' )? ( (lv_upperBound_3_0= ruleElementBound ) )? ( ( ruleEString ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1524:2: () ( ( (lv_lowerBound_1_0= ruleElementBound ) ) otherlv_2= '..' )? ( (lv_upperBound_3_0= ruleElementBound ) )? ( ( ruleEString ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1524:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1525:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTAssociationEndAccess().getTAssociationEndAction_0(),
                        current);
                

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1530:2: ( ( (lv_lowerBound_1_0= ruleElementBound ) ) otherlv_2= '..' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==31) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==30) ) {
                    alt35=1;
                }
            }
            else if ( (LA35_0==RULE_INT) ) {
                int LA35_2 = input.LA(2);

                if ( (LA35_2==30) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1530:3: ( (lv_lowerBound_1_0= ruleElementBound ) ) otherlv_2= '..'
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1530:3: ( (lv_lowerBound_1_0= ruleElementBound ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1531:1: (lv_lowerBound_1_0= ruleElementBound )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1531:1: (lv_lowerBound_1_0= ruleElementBound )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1532:3: lv_lowerBound_1_0= ruleElementBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getTAssociationEndAccess().getLowerBoundElementBoundParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementBound_in_ruleTAssociationEnd3372);
                    lv_lowerBound_1_0=ruleElementBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTAssociationEndRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_1_0, 
                            		"ElementBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleTAssociationEnd3384); 

                        	newLeafNode(otherlv_2, grammarAccess.getTAssociationEndAccess().getFullStopFullStopKeyword_1_1());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1552:3: ( (lv_upperBound_3_0= ruleElementBound ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT||LA36_0==31) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1553:1: (lv_upperBound_3_0= ruleElementBound )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1553:1: (lv_upperBound_3_0= ruleElementBound )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1554:3: lv_upperBound_3_0= ruleElementBound
                    {
                     
                    	        newCompositeNode(grammarAccess.getTAssociationEndAccess().getUpperBoundElementBoundParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleElementBound_in_ruleTAssociationEnd3407);
                    lv_upperBound_3_0=ruleElementBound();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTAssociationEndRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_3_0, 
                            		"ElementBound");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1570:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1571:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1571:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1572:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTAssociationEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTAssociationEndAccess().getClassReferenceClassCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTAssociationEnd3431);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleTAssociationEnd"


    // $ANTLR start "entryRuleElementBound"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1593:1: entryRuleElementBound returns [String current=null] : iv_ruleElementBound= ruleElementBound EOF ;
    public final String entryRuleElementBound() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleElementBound = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1594:2: (iv_ruleElementBound= ruleElementBound EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1595:2: iv_ruleElementBound= ruleElementBound EOF
            {
             newCompositeNode(grammarAccess.getElementBoundRule()); 
            pushFollow(FOLLOW_ruleElementBound_in_entryRuleElementBound3468);
            iv_ruleElementBound=ruleElementBound();

            state._fsp--;

             current =iv_ruleElementBound.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementBound3479); 

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
    // $ANTLR end "entryRuleElementBound"


    // $ANTLR start "ruleElementBound"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1602:1: ruleElementBound returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleElementBound() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1605:28: ( (kw= '*' | this_INT_1= RULE_INT ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1606:1: (kw= '*' | this_INT_1= RULE_INT )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1606:1: (kw= '*' | this_INT_1= RULE_INT )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==31) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_INT) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1607:2: kw= '*'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleElementBound3517); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getElementBoundAccess().getAsteriskKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1613:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleElementBound3538); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getElementBoundAccess().getINTTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleElementBound"


    // $ANTLR start "entryRuleTInstantiationHeader"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1628:1: entryRuleTInstantiationHeader returns [EObject current=null] : iv_ruleTInstantiationHeader= ruleTInstantiationHeader EOF ;
    public final EObject entryRuleTInstantiationHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTInstantiationHeader = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1629:2: (iv_ruleTInstantiationHeader= ruleTInstantiationHeader EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1630:2: iv_ruleTInstantiationHeader= ruleTInstantiationHeader EOF
            {
             newCompositeNode(grammarAccess.getTInstantiationHeaderRule()); 
            pushFollow(FOLLOW_ruleTInstantiationHeader_in_entryRuleTInstantiationHeader3583);
            iv_ruleTInstantiationHeader=ruleTInstantiationHeader();

            state._fsp--;

             current =iv_ruleTInstantiationHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTInstantiationHeader3593); 

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
    // $ANTLR end "entryRuleTInstantiationHeader"


    // $ANTLR start "ruleTInstantiationHeader"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1637:1: ruleTInstantiationHeader returns [EObject current=null] : ( ( (lv_type_0_0= ruleInstantiationType ) ) ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleTInstantiationHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1640:28: ( ( ( (lv_type_0_0= ruleInstantiationType ) ) ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1641:1: ( ( (lv_type_0_0= ruleInstantiationType ) ) ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1641:1: ( ( (lv_type_0_0= ruleInstantiationType ) ) ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )* )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1641:2: ( (lv_type_0_0= ruleInstantiationType ) ) ( ( ruleEString ) ) (otherlv_2= ',' ( ( ruleEString ) ) )*
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1641:2: ( (lv_type_0_0= ruleInstantiationType ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1642:1: (lv_type_0_0= ruleInstantiationType )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1642:1: (lv_type_0_0= ruleInstantiationType )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1643:3: lv_type_0_0= ruleInstantiationType
            {
             
            	        newCompositeNode(grammarAccess.getTInstantiationHeaderAccess().getTypeInstantiationTypeEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInstantiationType_in_ruleTInstantiationHeader3639);
            lv_type_0_0=ruleInstantiationType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTInstantiationHeaderRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"InstantiationType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1659:2: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1660:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1660:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1661:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTInstantiationHeaderRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTInstantiationHeaderAccess().getExternalAspectsAspectCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTInstantiationHeader3662);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1674:2: (otherlv_2= ',' ( ( ruleEString ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==13) ) {
                    int LA38_1 = input.LA(2);

                    if ( ((LA38_1>=RULE_STRING && LA38_1<=RULE_TEMPLATE)) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1674:4: otherlv_2= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleTInstantiationHeader3675); 

            	        	newLeafNode(otherlv_2, grammarAccess.getTInstantiationHeaderAccess().getCommaKeyword_2_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1678:1: ( ( ruleEString ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1679:1: ( ruleEString )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1679:1: ( ruleEString )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1680:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTInstantiationHeaderRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTInstantiationHeaderAccess().getExternalAspectsAspectCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEString_in_ruleTInstantiationHeader3698);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


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
    // $ANTLR end "ruleTInstantiationHeader"


    // $ANTLR start "entryRuleInstantiation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1701:1: entryRuleInstantiation returns [EObject current=null] : iv_ruleInstantiation= ruleInstantiation EOF ;
    public final EObject entryRuleInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiation = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1702:2: (iv_ruleInstantiation= ruleInstantiation EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1703:2: iv_ruleInstantiation= ruleInstantiation EOF
            {
             newCompositeNode(grammarAccess.getInstantiationRule()); 
            pushFollow(FOLLOW_ruleInstantiation_in_entryRuleInstantiation3736);
            iv_ruleInstantiation=ruleInstantiation();

            state._fsp--;

             current =iv_ruleInstantiation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstantiation3746); 

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
    // $ANTLR end "entryRuleInstantiation"


    // $ANTLR start "ruleInstantiation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1710:1: ruleInstantiation returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '{' ( (lv_mappings_2_0= ruleTClassifierMapping ) ) ( (otherlv_3= ';' )? ( (lv_mappings_4_0= ruleTClassifierMapping ) ) )* otherlv_5= '}' )? ) ;
    public final EObject ruleInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_mappings_2_0 = null;

        EObject lv_mappings_4_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1713:28: ( ( ( ( ruleEString ) ) (otherlv_1= '{' ( (lv_mappings_2_0= ruleTClassifierMapping ) ) ( (otherlv_3= ';' )? ( (lv_mappings_4_0= ruleTClassifierMapping ) ) )* otherlv_5= '}' )? ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1714:1: ( ( ( ruleEString ) ) (otherlv_1= '{' ( (lv_mappings_2_0= ruleTClassifierMapping ) ) ( (otherlv_3= ';' )? ( (lv_mappings_4_0= ruleTClassifierMapping ) ) )* otherlv_5= '}' )? )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1714:1: ( ( ( ruleEString ) ) (otherlv_1= '{' ( (lv_mappings_2_0= ruleTClassifierMapping ) ) ( (otherlv_3= ';' )? ( (lv_mappings_4_0= ruleTClassifierMapping ) ) )* otherlv_5= '}' )? )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1714:2: ( ( ruleEString ) ) (otherlv_1= '{' ( (lv_mappings_2_0= ruleTClassifierMapping ) ) ( (otherlv_3= ';' )? ( (lv_mappings_4_0= ruleTClassifierMapping ) ) )* otherlv_5= '}' )?
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1714:2: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1715:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1715:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1716:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstantiationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getExternalAspectAspectCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleInstantiation3794);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1729:2: (otherlv_1= '{' ( (lv_mappings_2_0= ruleTClassifierMapping ) ) ( (otherlv_3= ';' )? ( (lv_mappings_4_0= ruleTClassifierMapping ) ) )* otherlv_5= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1729:4: otherlv_1= '{' ( (lv_mappings_2_0= ruleTClassifierMapping ) ) ( (otherlv_3= ';' )? ( (lv_mappings_4_0= ruleTClassifierMapping ) ) )* otherlv_5= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleInstantiation3807); 

                        	newLeafNode(otherlv_1, grammarAccess.getInstantiationAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1733:1: ( (lv_mappings_2_0= ruleTClassifierMapping ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1734:1: (lv_mappings_2_0= ruleTClassifierMapping )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1734:1: (lv_mappings_2_0= ruleTClassifierMapping )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1735:3: lv_mappings_2_0= ruleTClassifierMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationAccess().getMappingsTClassifierMappingParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTClassifierMapping_in_ruleInstantiation3828);
                    lv_mappings_2_0=ruleTClassifierMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
                    	        }
                           		add(
                           			current, 
                           			"mappings",
                            		lv_mappings_2_0, 
                            		"TClassifierMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1751:2: ( (otherlv_3= ';' )? ( (lv_mappings_4_0= ruleTClassifierMapping ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( ((LA40_0>=RULE_STRING && LA40_0<=RULE_TEMPLATE)||LA40_0==16||LA40_0==24) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1751:3: (otherlv_3= ';' )? ( (lv_mappings_4_0= ruleTClassifierMapping ) )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1751:3: (otherlv_3= ';' )?
                    	    int alt39=2;
                    	    int LA39_0 = input.LA(1);

                    	    if ( (LA39_0==16) ) {
                    	        alt39=1;
                    	    }
                    	    switch (alt39) {
                    	        case 1 :
                    	            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1751:5: otherlv_3= ';'
                    	            {
                    	            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleInstantiation3842); 

                    	                	newLeafNode(otherlv_3, grammarAccess.getInstantiationAccess().getSemicolonKeyword_1_2_0());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1755:3: ( (lv_mappings_4_0= ruleTClassifierMapping ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1756:1: (lv_mappings_4_0= ruleTClassifierMapping )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1756:1: (lv_mappings_4_0= ruleTClassifierMapping )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1757:3: lv_mappings_4_0= ruleTClassifierMapping
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInstantiationAccess().getMappingsTClassifierMappingParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTClassifierMapping_in_ruleInstantiation3865);
                    	    lv_mappings_4_0=ruleTClassifierMapping();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"mappings",
                    	            		lv_mappings_4_0, 
                    	            		"TClassifierMapping");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleInstantiation3879); 

                        	newLeafNode(otherlv_5, grammarAccess.getInstantiationAccess().getRightCurlyBracketKeyword_1_3());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleInstantiation"


    // $ANTLR start "entryRuleTClassifierMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1787:1: entryRuleTClassifierMapping returns [EObject current=null] : iv_ruleTClassifierMapping= ruleTClassifierMapping EOF ;
    public final EObject entryRuleTClassifierMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTClassifierMapping = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1788:2: (iv_ruleTClassifierMapping= ruleTClassifierMapping EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1789:2: iv_ruleTClassifierMapping= ruleTClassifierMapping EOF
            {
             newCompositeNode(grammarAccess.getTClassifierMappingRule()); 
            pushFollow(FOLLOW_ruleTClassifierMapping_in_entryRuleTClassifierMapping3919);
            iv_ruleTClassifierMapping=ruleTClassifierMapping();

            state._fsp--;

             current =iv_ruleTClassifierMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTClassifierMapping3929); 

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
    // $ANTLR end "entryRuleTClassifierMapping"


    // $ANTLR start "ruleTClassifierMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1796:1: ruleTClassifierMapping returns [EObject current=null] : ( ( (lv_partialFromElement_0_0= '|' ) )? ( ( ruleEString ) ) (otherlv_2= '<' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '>' )? otherlv_7= '->' ( (lv_partialToElement_8_0= '|' ) )? ( ( ruleEString ) ) (otherlv_10= '<' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= '>' )? ) ;
    public final EObject ruleTClassifierMapping() throws RecognitionException {
        EObject current = null;

        Token lv_partialFromElement_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_partialToElement_8_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1799:28: ( ( ( (lv_partialFromElement_0_0= '|' ) )? ( ( ruleEString ) ) (otherlv_2= '<' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '>' )? otherlv_7= '->' ( (lv_partialToElement_8_0= '|' ) )? ( ( ruleEString ) ) (otherlv_10= '<' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= '>' )? ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1800:1: ( ( (lv_partialFromElement_0_0= '|' ) )? ( ( ruleEString ) ) (otherlv_2= '<' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '>' )? otherlv_7= '->' ( (lv_partialToElement_8_0= '|' ) )? ( ( ruleEString ) ) (otherlv_10= '<' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= '>' )? )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1800:1: ( ( (lv_partialFromElement_0_0= '|' ) )? ( ( ruleEString ) ) (otherlv_2= '<' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '>' )? otherlv_7= '->' ( (lv_partialToElement_8_0= '|' ) )? ( ( ruleEString ) ) (otherlv_10= '<' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= '>' )? )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1800:2: ( (lv_partialFromElement_0_0= '|' ) )? ( ( ruleEString ) ) (otherlv_2= '<' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '>' )? otherlv_7= '->' ( (lv_partialToElement_8_0= '|' ) )? ( ( ruleEString ) ) (otherlv_10= '<' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= '>' )?
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1800:2: ( (lv_partialFromElement_0_0= '|' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==24) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1801:1: (lv_partialFromElement_0_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1801:1: (lv_partialFromElement_0_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1802:3: lv_partialFromElement_0_0= '|'
                    {
                    lv_partialFromElement_0_0=(Token)match(input,24,FOLLOW_24_in_ruleTClassifierMapping3972); 

                            newLeafNode(lv_partialFromElement_0_0, grammarAccess.getTClassifierMappingAccess().getPartialFromElementVerticalLineKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTClassifierMappingRule());
                    	        }
                           		setWithLastConsumed(current, "partialFromElement", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1815:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1816:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1816:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1817:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTClassifierMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTClassifierMappingAccess().getFromElementClassifierCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTClassifierMapping4009);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1830:2: (otherlv_2= '<' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '>' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1830:4: otherlv_2= '<' ( ( ruleEString ) ) (otherlv_4= ',' ( ( ruleEString ) ) )* otherlv_6= '>'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleTClassifierMapping4022); 

                        	newLeafNode(otherlv_2, grammarAccess.getTClassifierMappingAccess().getLessThanSignKeyword_2_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1834:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1835:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1835:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1836:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTClassifierMappingRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTClassifierMappingAccess().getFromMembersTClassMemberCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTClassifierMapping4045);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1849:2: (otherlv_4= ',' ( ( ruleEString ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==13) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1849:4: otherlv_4= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleTClassifierMapping4058); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getTClassifierMappingAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1853:1: ( ( ruleEString ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1854:1: ( ruleEString )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1854:1: ( ruleEString )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1855:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTClassifierMappingRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTClassifierMappingAccess().getFromMembersTClassMemberCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEString_in_ruleTClassifierMapping4081);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleTClassifierMapping4095); 

                        	newLeafNode(otherlv_6, grammarAccess.getTClassifierMappingAccess().getGreaterThanSignKeyword_2_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleTClassifierMapping4109); 

                	newLeafNode(otherlv_7, grammarAccess.getTClassifierMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1876:1: ( (lv_partialToElement_8_0= '|' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==24) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1877:1: (lv_partialToElement_8_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1877:1: (lv_partialToElement_8_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1878:3: lv_partialToElement_8_0= '|'
                    {
                    lv_partialToElement_8_0=(Token)match(input,24,FOLLOW_24_in_ruleTClassifierMapping4127); 

                            newLeafNode(lv_partialToElement_8_0, grammarAccess.getTClassifierMappingAccess().getPartialToElementVerticalLineKeyword_4_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTClassifierMappingRule());
                    	        }
                           		setWithLastConsumed(current, "partialToElement", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1891:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1892:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1892:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1893:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTClassifierMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTClassifierMappingAccess().getToElementClassifierCrossReference_5_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTClassifierMapping4164);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1906:2: (otherlv_10= '<' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= '>' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==32) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1906:4: otherlv_10= '<' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= '>'
                    {
                    otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleTClassifierMapping4177); 

                        	newLeafNode(otherlv_10, grammarAccess.getTClassifierMappingAccess().getLessThanSignKeyword_6_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1910:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1911:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1911:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1912:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTClassifierMappingRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTClassifierMappingAccess().getToMembersTClassMemberCrossReference_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTClassifierMapping4200);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1925:2: (otherlv_12= ',' ( ( ruleEString ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==13) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1925:4: otherlv_12= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleTClassifierMapping4213); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTClassifierMappingAccess().getCommaKeyword_6_2_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1929:1: ( ( ruleEString ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1930:1: ( ruleEString )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1930:1: ( ruleEString )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1931:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTClassifierMappingRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTClassifierMappingAccess().getToMembersTClassMemberCrossReference_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEString_in_ruleTClassifierMapping4236);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,33,FOLLOW_33_in_ruleTClassifierMapping4250); 

                        	newLeafNode(otherlv_14, grammarAccess.getTClassifierMappingAccess().getGreaterThanSignKeyword_6_3());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleTClassifierMapping"


    // $ANTLR start "entryRuleTAbstractMessages"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1956:1: entryRuleTAbstractMessages returns [EObject current=null] : iv_ruleTAbstractMessages= ruleTAbstractMessages EOF ;
    public final EObject entryRuleTAbstractMessages() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAbstractMessages = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1957:2: (iv_ruleTAbstractMessages= ruleTAbstractMessages EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1958:2: iv_ruleTAbstractMessages= ruleTAbstractMessages EOF
            {
             newCompositeNode(grammarAccess.getTAbstractMessagesRule()); 
            pushFollow(FOLLOW_ruleTAbstractMessages_in_entryRuleTAbstractMessages4288);
            iv_ruleTAbstractMessages=ruleTAbstractMessages();

            state._fsp--;

             current =iv_ruleTAbstractMessages; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTAbstractMessages4298); 

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
    // $ANTLR end "entryRuleTAbstractMessages"


    // $ANTLR start "ruleTAbstractMessages"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1965:1: ruleTAbstractMessages returns [EObject current=null] : (this_TMessageView_0= ruleTMessageView | this_TAspectMessageView_1= ruleTAspectMessageView ) ;
    public final EObject ruleTAbstractMessages() throws RecognitionException {
        EObject current = null;

        EObject this_TMessageView_0 = null;

        EObject this_TAspectMessageView_1 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1968:28: ( (this_TMessageView_0= ruleTMessageView | this_TAspectMessageView_1= ruleTAspectMessageView ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1969:1: (this_TMessageView_0= ruleTMessageView | this_TAspectMessageView_1= ruleTAspectMessageView )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1969:1: (this_TMessageView_0= ruleTMessageView | this_TAspectMessageView_1= ruleTAspectMessageView )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==34) ) {
                alt48=1;
            }
            else if ( (LA48_0==38) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1970:5: this_TMessageView_0= ruleTMessageView
                    {
                     
                            newCompositeNode(grammarAccess.getTAbstractMessagesAccess().getTMessageViewParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTMessageView_in_ruleTAbstractMessages4345);
                    this_TMessageView_0=ruleTMessageView();

                    state._fsp--;

                     
                            current = this_TMessageView_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1980:5: this_TAspectMessageView_1= ruleTAspectMessageView
                    {
                     
                            newCompositeNode(grammarAccess.getTAbstractMessagesAccess().getTAspectMessageViewParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTAspectMessageView_in_ruleTAbstractMessages4372);
                    this_TAspectMessageView_1=ruleTAspectMessageView();

                    state._fsp--;

                     
                            current = this_TAspectMessageView_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleTAbstractMessages"


    // $ANTLR start "entryRuleTMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1996:1: entryRuleTMessageView returns [EObject current=null] : iv_ruleTMessageView= ruleTMessageView EOF ;
    public final EObject entryRuleTMessageView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMessageView = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1997:2: (iv_ruleTMessageView= ruleTMessageView EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1998:2: iv_ruleTMessageView= ruleTMessageView EOF
            {
             newCompositeNode(grammarAccess.getTMessageViewRule()); 
            pushFollow(FOLLOW_ruleTMessageView_in_entryRuleTMessageView4407);
            iv_ruleTMessageView=ruleTMessageView();

            state._fsp--;

             current =iv_ruleTMessageView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTMessageView4417); 

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
    // $ANTLR end "entryRuleTMessageView"


    // $ANTLR start "ruleTMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2005:1: ruleTMessageView returns [EObject current=null] : ( () otherlv_1= 'messageView' ( (lv_create_2_0= 'new' ) )? ( (lv_partialClass_3_0= '|' ) )? ( ( ruleEString ) ) otherlv_5= '.' ( (lv_partialOperation_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '(' ( ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' (otherlv_13= 'affectedBy' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) )* )? )? (otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' )? ) ;
    public final EObject ruleTMessageView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_create_2_0=null;
        Token lv_partialClass_3_0=null;
        Token otherlv_5=null;
        Token lv_partialOperation_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_interactionMessages_18_0 = null;

        EObject lv_interactionMessages_20_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2008:28: ( ( () otherlv_1= 'messageView' ( (lv_create_2_0= 'new' ) )? ( (lv_partialClass_3_0= '|' ) )? ( ( ruleEString ) ) otherlv_5= '.' ( (lv_partialOperation_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '(' ( ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' (otherlv_13= 'affectedBy' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) )* )? )? (otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' )? ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2009:1: ( () otherlv_1= 'messageView' ( (lv_create_2_0= 'new' ) )? ( (lv_partialClass_3_0= '|' ) )? ( ( ruleEString ) ) otherlv_5= '.' ( (lv_partialOperation_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '(' ( ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' (otherlv_13= 'affectedBy' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) )* )? )? (otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' )? )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2009:1: ( () otherlv_1= 'messageView' ( (lv_create_2_0= 'new' ) )? ( (lv_partialClass_3_0= '|' ) )? ( ( ruleEString ) ) otherlv_5= '.' ( (lv_partialOperation_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '(' ( ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' (otherlv_13= 'affectedBy' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) )* )? )? (otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' )? )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2009:2: () otherlv_1= 'messageView' ( (lv_create_2_0= 'new' ) )? ( (lv_partialClass_3_0= '|' ) )? ( ( ruleEString ) ) otherlv_5= '.' ( (lv_partialOperation_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '(' ( ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )? otherlv_12= ')' (otherlv_13= 'affectedBy' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) )* )? )? (otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' )?
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2009:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2010:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTMessageViewAccess().getTMessageViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleTMessageView4463); 

                	newLeafNode(otherlv_1, grammarAccess.getTMessageViewAccess().getMessageViewKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2019:1: ( (lv_create_2_0= 'new' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==35) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2020:1: (lv_create_2_0= 'new' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2020:1: (lv_create_2_0= 'new' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2021:3: lv_create_2_0= 'new'
                    {
                    lv_create_2_0=(Token)match(input,35,FOLLOW_35_in_ruleTMessageView4481); 

                            newLeafNode(lv_create_2_0, grammarAccess.getTMessageViewAccess().getCreateNewKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTMessageViewRule());
                    	        }
                           		setWithLastConsumed(current, "create", true, "new");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2034:3: ( (lv_partialClass_3_0= '|' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==24) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2035:1: (lv_partialClass_3_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2035:1: (lv_partialClass_3_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2036:3: lv_partialClass_3_0= '|'
                    {
                    lv_partialClass_3_0=(Token)match(input,24,FOLLOW_24_in_ruleTMessageView4513); 

                            newLeafNode(lv_partialClass_3_0, grammarAccess.getTMessageViewAccess().getPartialClassVerticalLineKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTMessageViewRule());
                    	        }
                           		setWithLastConsumed(current, "partialClass", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2049:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2050:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2050:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2051:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTMessageViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTMessageViewAccess().getClassTClassCrossReference_4_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTMessageView4550);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,36,FOLLOW_36_in_ruleTMessageView4562); 

                	newLeafNode(otherlv_5, grammarAccess.getTMessageViewAccess().getFullStopKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2068:1: ( (lv_partialOperation_6_0= '|' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==24) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2069:1: (lv_partialOperation_6_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2069:1: (lv_partialOperation_6_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2070:3: lv_partialOperation_6_0= '|'
                    {
                    lv_partialOperation_6_0=(Token)match(input,24,FOLLOW_24_in_ruleTMessageView4580); 

                            newLeafNode(lv_partialOperation_6_0, grammarAccess.getTMessageViewAccess().getPartialOperationVerticalLineKeyword_6_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTMessageViewRule());
                    	        }
                           		setWithLastConsumed(current, "partialOperation", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2083:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2084:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2084:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2085:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTMessageViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTMessageViewAccess().getSpecifiesTOperationCrossReference_7_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTMessageView4617);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleTMessageView4629); 

                	newLeafNode(otherlv_8, grammarAccess.getTMessageViewAccess().getLeftParenthesisKeyword_8());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2102:1: ( ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_STRING && LA53_0<=RULE_TEMPLATE)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2102:2: ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )*
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2102:2: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2103:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2103:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2104:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTMessageViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTMessageViewAccess().getArgumentsTParameterCrossReference_9_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTMessageView4653);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2117:2: (otherlv_10= ',' ( ( ruleEString ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==13) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2117:4: otherlv_10= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleTMessageView4666); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getTMessageViewAccess().getCommaKeyword_9_1_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2121:1: ( ( ruleEString ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2122:1: ( ruleEString )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2122:1: ( ruleEString )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2123:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTMessageViewRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getTMessageViewAccess().getArgumentsTParameterCrossReference_9_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEString_in_ruleTMessageView4689);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_12=(Token)match(input,28,FOLLOW_28_in_ruleTMessageView4705); 

                	newLeafNode(otherlv_12, grammarAccess.getTMessageViewAccess().getRightParenthesisKeyword_10());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2140:1: (otherlv_13= 'affectedBy' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) )* )? )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==37) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2140:3: otherlv_13= 'affectedBy' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) )* )?
                    {
                    otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleTMessageView4718); 

                        	newLeafNode(otherlv_13, grammarAccess.getTMessageViewAccess().getAffectedByKeyword_11_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2144:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2145:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2145:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2146:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTMessageViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTMessageViewAccess().getAffectedByTAspectMessageViewCrossReference_11_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTMessageView4741);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2159:2: (otherlv_15= ',' ( ( ruleEString ) )* )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==13) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2159:4: otherlv_15= ',' ( ( ruleEString ) )*
                            {
                            otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleTMessageView4754); 

                                	newLeafNode(otherlv_15, grammarAccess.getTMessageViewAccess().getCommaKeyword_11_2_0());
                                
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2163:1: ( ( ruleEString ) )*
                            loop54:
                            do {
                                int alt54=2;
                                int LA54_0 = input.LA(1);

                                if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_TEMPLATE)) ) {
                                    alt54=1;
                                }


                                switch (alt54) {
                            	case 1 :
                            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2164:1: ( ruleEString )
                            	    {
                            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2164:1: ( ruleEString )
                            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2165:3: ruleEString
                            	    {

                            	    			if (current==null) {
                            	    	            current = createModelElement(grammarAccess.getTMessageViewRule());
                            	    	        }
                            	            
                            	     
                            	    	        newCompositeNode(grammarAccess.getTMessageViewAccess().getAffectedByTAspectMessageViewCrossReference_11_2_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleEString_in_ruleTMessageView4777);
                            	    ruleEString();

                            	    state._fsp--;

                            	     
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop54;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2178:7: (otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==14) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2178:9: otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}'
                    {
                    otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleTMessageView4795); 

                        	newLeafNode(otherlv_17, grammarAccess.getTMessageViewAccess().getLeftCurlyBracketKeyword_12_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2182:1: ( (lv_interactionMessages_18_0= ruleTInteraction ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2183:1: (lv_interactionMessages_18_0= ruleTInteraction )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2183:1: (lv_interactionMessages_18_0= ruleTInteraction )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2184:3: lv_interactionMessages_18_0= ruleTInteraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTMessageViewAccess().getInteractionMessagesTInteractionParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTInteraction_in_ruleTMessageView4816);
                    lv_interactionMessages_18_0=ruleTInteraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTMessageViewRule());
                    	        }
                           		add(
                           			current, 
                           			"interactionMessages",
                            		lv_interactionMessages_18_0, 
                            		"TInteraction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2200:2: ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( ((LA58_0>=RULE_STRING && LA58_0<=RULE_TEMPLATE)||LA58_0==16||(LA58_0>=55 && LA58_0<=57)) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2200:3: (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2200:3: (otherlv_19= ';' )?
                    	    int alt57=2;
                    	    int LA57_0 = input.LA(1);

                    	    if ( (LA57_0==16) ) {
                    	        alt57=1;
                    	    }
                    	    switch (alt57) {
                    	        case 1 :
                    	            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2200:5: otherlv_19= ';'
                    	            {
                    	            otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleTMessageView4830); 

                    	                	newLeafNode(otherlv_19, grammarAccess.getTMessageViewAccess().getSemicolonKeyword_12_2_0());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2204:3: ( (lv_interactionMessages_20_0= ruleTInteraction ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2205:1: (lv_interactionMessages_20_0= ruleTInteraction )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2205:1: (lv_interactionMessages_20_0= ruleTInteraction )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2206:3: lv_interactionMessages_20_0= ruleTInteraction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTMessageViewAccess().getInteractionMessagesTInteractionParserRuleCall_12_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTInteraction_in_ruleTMessageView4853);
                    	    lv_interactionMessages_20_0=ruleTInteraction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTMessageViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"interactionMessages",
                    	            		lv_interactionMessages_20_0, 
                    	            		"TInteraction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleTMessageView4867); 

                        	newLeafNode(otherlv_21, grammarAccess.getTMessageViewAccess().getRightCurlyBracketKeyword_12_3());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleTMessageView"


    // $ANTLR start "entryRuleTAspectMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2234:1: entryRuleTAspectMessageView returns [EObject current=null] : iv_ruleTAspectMessageView= ruleTAspectMessageView EOF ;
    public final EObject entryRuleTAspectMessageView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAspectMessageView = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2235:2: (iv_ruleTAspectMessageView= ruleTAspectMessageView EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2236:2: iv_ruleTAspectMessageView= ruleTAspectMessageView EOF
            {
             newCompositeNode(grammarAccess.getTAspectMessageViewRule()); 
            pushFollow(FOLLOW_ruleTAspectMessageView_in_entryRuleTAspectMessageView4905);
            iv_ruleTAspectMessageView=ruleTAspectMessageView();

            state._fsp--;

             current =iv_ruleTAspectMessageView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTAspectMessageView4915); 

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
    // $ANTLR end "entryRuleTAspectMessageView"


    // $ANTLR start "ruleTAspectMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2243:1: ruleTAspectMessageView returns [EObject current=null] : ( () otherlv_1= 'aspectMessageView' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pointcut' ( (lv_create_5_0= 'new' ) )? ( ( (lv_partialClass_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '.' )? ( (lv_partialOperation_9_0= '|' ) )? ( ( ruleEString ) ) otherlv_11= '(' ( ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )? )? otherlv_15= ')' otherlv_16= 'advice' otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleTAspectMessageView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_create_5_0=null;
        Token lv_partialClass_6_0=null;
        Token otherlv_8=null;
        Token lv_partialOperation_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_interactionMessages_18_0 = null;

        EObject lv_interactionMessages_20_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2246:28: ( ( () otherlv_1= 'aspectMessageView' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pointcut' ( (lv_create_5_0= 'new' ) )? ( ( (lv_partialClass_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '.' )? ( (lv_partialOperation_9_0= '|' ) )? ( ( ruleEString ) ) otherlv_11= '(' ( ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )? )? otherlv_15= ')' otherlv_16= 'advice' otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2247:1: ( () otherlv_1= 'aspectMessageView' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pointcut' ( (lv_create_5_0= 'new' ) )? ( ( (lv_partialClass_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '.' )? ( (lv_partialOperation_9_0= '|' ) )? ( ( ruleEString ) ) otherlv_11= '(' ( ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )? )? otherlv_15= ')' otherlv_16= 'advice' otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2247:1: ( () otherlv_1= 'aspectMessageView' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pointcut' ( (lv_create_5_0= 'new' ) )? ( ( (lv_partialClass_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '.' )? ( (lv_partialOperation_9_0= '|' ) )? ( ( ruleEString ) ) otherlv_11= '(' ( ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )? )? otherlv_15= ')' otherlv_16= 'advice' otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2247:2: () otherlv_1= 'aspectMessageView' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'pointcut' ( (lv_create_5_0= 'new' ) )? ( ( (lv_partialClass_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '.' )? ( (lv_partialOperation_9_0= '|' ) )? ( ( ruleEString ) ) otherlv_11= '(' ( ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )? )? otherlv_15= ')' otherlv_16= 'advice' otherlv_17= '{' ( (lv_interactionMessages_18_0= ruleTInteraction ) ) ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )* otherlv_21= '}' otherlv_22= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2247:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2248:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTAspectMessageViewAccess().getTAspectMessageViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleTAspectMessageView4961); 

                	newLeafNode(otherlv_1, grammarAccess.getTAspectMessageViewAccess().getAspectMessageViewKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2257:1: ( (lv_name_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2258:1: (lv_name_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2258:1: (lv_name_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2259:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTAspectMessageViewAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTAspectMessageView4982);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAspectMessageViewRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTAspectMessageView4994); 

                	newLeafNode(otherlv_3, grammarAccess.getTAspectMessageViewAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,39,FOLLOW_39_in_ruleTAspectMessageView5006); 

                	newLeafNode(otherlv_4, grammarAccess.getTAspectMessageViewAccess().getPointcutKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2283:1: ( (lv_create_5_0= 'new' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==35) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2284:1: (lv_create_5_0= 'new' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2284:1: (lv_create_5_0= 'new' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2285:3: lv_create_5_0= 'new'
                    {
                    lv_create_5_0=(Token)match(input,35,FOLLOW_35_in_ruleTAspectMessageView5024); 

                            newLeafNode(lv_create_5_0, grammarAccess.getTAspectMessageViewAccess().getCreateNewKeyword_5_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTAspectMessageViewRule());
                    	        }
                           		setWithLastConsumed(current, "create", true, "new");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2298:3: ( ( (lv_partialClass_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '.' )?
            int alt62=2;
            switch ( input.LA(1) ) {
                case 24:
                    {
                    switch ( input.LA(2) ) {
                        case RULE_STRING:
                            {
                            int LA62_2 = input.LA(3);

                            if ( (LA62_2==36) ) {
                                alt62=1;
                            }
                            }
                            break;
                        case RULE_ID:
                            {
                            int LA62_3 = input.LA(3);

                            if ( (LA62_3==36) ) {
                                alt62=1;
                            }
                            }
                            break;
                        case RULE_TEMPLATE:
                            {
                            int LA62_4 = input.LA(3);

                            if ( (LA62_4==36) ) {
                                alt62=1;
                            }
                            }
                            break;
                    }

                    }
                    break;
                case RULE_STRING:
                    {
                    int LA62_2 = input.LA(2);

                    if ( (LA62_2==36) ) {
                        alt62=1;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA62_3 = input.LA(2);

                    if ( (LA62_3==36) ) {
                        alt62=1;
                    }
                    }
                    break;
                case RULE_TEMPLATE:
                    {
                    int LA62_4 = input.LA(2);

                    if ( (LA62_4==36) ) {
                        alt62=1;
                    }
                    }
                    break;
            }

            switch (alt62) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2298:4: ( (lv_partialClass_6_0= '|' ) )? ( ( ruleEString ) ) otherlv_8= '.'
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2298:4: ( (lv_partialClass_6_0= '|' ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==24) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2299:1: (lv_partialClass_6_0= '|' )
                            {
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2299:1: (lv_partialClass_6_0= '|' )
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2300:3: lv_partialClass_6_0= '|'
                            {
                            lv_partialClass_6_0=(Token)match(input,24,FOLLOW_24_in_ruleTAspectMessageView5057); 

                                    newLeafNode(lv_partialClass_6_0, grammarAccess.getTAspectMessageViewAccess().getPartialClassVerticalLineKeyword_6_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTAspectMessageViewRule());
                            	        }
                                   		setWithLastConsumed(current, "partialClass", true, "|");
                            	    

                            }


                            }
                            break;

                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2313:3: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2314:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2314:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2315:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTAspectMessageViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTAspectMessageViewAccess().getClassTClassCrossReference_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTAspectMessageView5094);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleTAspectMessageView5106); 

                        	newLeafNode(otherlv_8, grammarAccess.getTAspectMessageViewAccess().getFullStopKeyword_6_2());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2332:3: ( (lv_partialOperation_9_0= '|' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==24) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2333:1: (lv_partialOperation_9_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2333:1: (lv_partialOperation_9_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2334:3: lv_partialOperation_9_0= '|'
                    {
                    lv_partialOperation_9_0=(Token)match(input,24,FOLLOW_24_in_ruleTAspectMessageView5126); 

                            newLeafNode(lv_partialOperation_9_0, grammarAccess.getTAspectMessageViewAccess().getPartialOperationVerticalLineKeyword_7_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTAspectMessageViewRule());
                    	        }
                           		setWithLastConsumed(current, "partialOperation", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2347:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2348:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2348:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2349:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTAspectMessageViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTAspectMessageViewAccess().getSpecifiesTOperationCrossReference_8_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTAspectMessageView5163);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleTAspectMessageView5175); 

                	newLeafNode(otherlv_11, grammarAccess.getTAspectMessageViewAccess().getLeftParenthesisKeyword_9());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2366:1: ( ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )? )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_STRING && LA65_0<=RULE_TEMPLATE)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2366:2: ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )?
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2366:2: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2367:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2367:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2368:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTAspectMessageViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTAspectMessageViewAccess().getArgumentsTParameterCrossReference_10_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTAspectMessageView5199);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2381:2: (otherlv_13= ',' ( ( ruleEString ) ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==13) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2381:4: otherlv_13= ',' ( ( ruleEString ) )
                            {
                            otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleTAspectMessageView5212); 

                                	newLeafNode(otherlv_13, grammarAccess.getTAspectMessageViewAccess().getCommaKeyword_10_1_0());
                                
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2385:1: ( ( ruleEString ) )
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2386:1: ( ruleEString )
                            {
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2386:1: ( ruleEString )
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2387:3: ruleEString
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getTAspectMessageViewRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getTAspectMessageViewAccess().getArgumentsTParameterCrossReference_10_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleEString_in_ruleTAspectMessageView5235);
                            ruleEString();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,28,FOLLOW_28_in_ruleTAspectMessageView5251); 

                	newLeafNode(otherlv_15, grammarAccess.getTAspectMessageViewAccess().getRightParenthesisKeyword_11());
                
            otherlv_16=(Token)match(input,40,FOLLOW_40_in_ruleTAspectMessageView5263); 

                	newLeafNode(otherlv_16, grammarAccess.getTAspectMessageViewAccess().getAdviceKeyword_12());
                
            otherlv_17=(Token)match(input,14,FOLLOW_14_in_ruleTAspectMessageView5275); 

                	newLeafNode(otherlv_17, grammarAccess.getTAspectMessageViewAccess().getLeftCurlyBracketKeyword_13());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2412:1: ( (lv_interactionMessages_18_0= ruleTInteraction ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2413:1: (lv_interactionMessages_18_0= ruleTInteraction )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2413:1: (lv_interactionMessages_18_0= ruleTInteraction )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2414:3: lv_interactionMessages_18_0= ruleTInteraction
            {
             
            	        newCompositeNode(grammarAccess.getTAspectMessageViewAccess().getInteractionMessagesTInteractionParserRuleCall_14_0()); 
            	    
            pushFollow(FOLLOW_ruleTInteraction_in_ruleTAspectMessageView5296);
            lv_interactionMessages_18_0=ruleTInteraction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTAspectMessageViewRule());
            	        }
                   		add(
                   			current, 
                   			"interactionMessages",
                    		lv_interactionMessages_18_0, 
                    		"TInteraction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2430:2: ( (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=RULE_STRING && LA67_0<=RULE_TEMPLATE)||LA67_0==16||(LA67_0>=55 && LA67_0<=57)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2430:3: (otherlv_19= ';' )? ( (lv_interactionMessages_20_0= ruleTInteraction ) )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2430:3: (otherlv_19= ';' )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==16) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2430:5: otherlv_19= ';'
            	            {
            	            otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleTAspectMessageView5310); 

            	                	newLeafNode(otherlv_19, grammarAccess.getTAspectMessageViewAccess().getSemicolonKeyword_15_0());
            	                

            	            }
            	            break;

            	    }

            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2434:3: ( (lv_interactionMessages_20_0= ruleTInteraction ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2435:1: (lv_interactionMessages_20_0= ruleTInteraction )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2435:1: (lv_interactionMessages_20_0= ruleTInteraction )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2436:3: lv_interactionMessages_20_0= ruleTInteraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTAspectMessageViewAccess().getInteractionMessagesTInteractionParserRuleCall_15_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTInteraction_in_ruleTAspectMessageView5333);
            	    lv_interactionMessages_20_0=ruleTInteraction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTAspectMessageViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"interactionMessages",
            	            		lv_interactionMessages_20_0, 
            	            		"TInteraction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleTAspectMessageView5347); 

                	newLeafNode(otherlv_21, grammarAccess.getTAspectMessageViewAccess().getRightCurlyBracketKeyword_16());
                
            otherlv_22=(Token)match(input,17,FOLLOW_17_in_ruleTAspectMessageView5359); 

                	newLeafNode(otherlv_22, grammarAccess.getTAspectMessageViewAccess().getRightCurlyBracketKeyword_17());
                

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
    // $ANTLR end "ruleTAspectMessageView"


    // $ANTLR start "entryRuleTLifeline"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2468:1: entryRuleTLifeline returns [EObject current=null] : iv_ruleTLifeline= ruleTLifeline EOF ;
    public final EObject entryRuleTLifeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLifeline = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2469:2: (iv_ruleTLifeline= ruleTLifeline EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2470:2: iv_ruleTLifeline= ruleTLifeline EOF
            {
             newCompositeNode(grammarAccess.getTLifelineRule()); 
            pushFollow(FOLLOW_ruleTLifeline_in_entryRuleTLifeline5395);
            iv_ruleTLifeline=ruleTLifeline();

            state._fsp--;

             current =iv_ruleTLifeline; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTLifeline5405); 

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
    // $ANTLR end "entryRuleTLifeline"


    // $ANTLR start "ruleTLifeline"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2477:1: ruleTLifeline returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) )? ( (lv_referenceType_1_0= ruleTLifelineReferenceType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )? (otherlv_5= '{' ( (lv_localProperties_6_0= ruleTTemporaryProperty ) ) ( (otherlv_7= ';' )? ( (lv_localProperties_8_0= ruleTTemporaryProperty ) ) )* otherlv_9= '}' )? ) ;
    public final EObject ruleTLifeline() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_referenceType_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_localProperties_6_0 = null;

        EObject lv_localProperties_8_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2480:28: ( ( ( (lv_static_0_0= 'static' ) )? ( (lv_referenceType_1_0= ruleTLifelineReferenceType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )? (otherlv_5= '{' ( (lv_localProperties_6_0= ruleTTemporaryProperty ) ) ( (otherlv_7= ';' )? ( (lv_localProperties_8_0= ruleTTemporaryProperty ) ) )* otherlv_9= '}' )? ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2481:1: ( ( (lv_static_0_0= 'static' ) )? ( (lv_referenceType_1_0= ruleTLifelineReferenceType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )? (otherlv_5= '{' ( (lv_localProperties_6_0= ruleTTemporaryProperty ) ) ( (otherlv_7= ';' )? ( (lv_localProperties_8_0= ruleTTemporaryProperty ) ) )* otherlv_9= '}' )? )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2481:1: ( ( (lv_static_0_0= 'static' ) )? ( (lv_referenceType_1_0= ruleTLifelineReferenceType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )? (otherlv_5= '{' ( (lv_localProperties_6_0= ruleTTemporaryProperty ) ) ( (otherlv_7= ';' )? ( (lv_localProperties_8_0= ruleTTemporaryProperty ) ) )* otherlv_9= '}' )? )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2481:2: ( (lv_static_0_0= 'static' ) )? ( (lv_referenceType_1_0= ruleTLifelineReferenceType ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= ':' ( ( ruleEString ) )? (otherlv_5= '{' ( (lv_localProperties_6_0= ruleTTemporaryProperty ) ) ( (otherlv_7= ';' )? ( (lv_localProperties_8_0= ruleTTemporaryProperty ) ) )* otherlv_9= '}' )?
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2481:2: ( (lv_static_0_0= 'static' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==26) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2482:1: (lv_static_0_0= 'static' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2482:1: (lv_static_0_0= 'static' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2483:3: lv_static_0_0= 'static'
                    {
                    lv_static_0_0=(Token)match(input,26,FOLLOW_26_in_ruleTLifeline5448); 

                            newLeafNode(lv_static_0_0, grammarAccess.getTLifelineAccess().getStaticStaticKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTLifelineRule());
                    	        }
                           		setWithLastConsumed(current, "static", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2496:3: ( (lv_referenceType_1_0= ruleTLifelineReferenceType ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2497:1: (lv_referenceType_1_0= ruleTLifelineReferenceType )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2497:1: (lv_referenceType_1_0= ruleTLifelineReferenceType )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2498:3: lv_referenceType_1_0= ruleTLifelineReferenceType
            {
             
            	        newCompositeNode(grammarAccess.getTLifelineAccess().getReferenceTypeTLifelineReferenceTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTLifelineReferenceType_in_ruleTLifeline5483);
            lv_referenceType_1_0=ruleTLifelineReferenceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTLifelineRule());
            	        }
                   		set(
                   			current, 
                   			"referenceType",
                    		lv_referenceType_1_0, 
                    		"TLifelineReferenceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2514:2: ( (lv_name_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2515:1: (lv_name_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2515:1: (lv_name_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2516:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTLifelineAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTLifeline5504);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTLifelineRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleTLifeline5516); 

                	newLeafNode(otherlv_3, grammarAccess.getTLifelineAccess().getColonKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2536:1: ( ( ruleEString ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( ((LA69_0>=RULE_STRING && LA69_0<=RULE_TEMPLATE)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2537:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2537:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2538:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTLifelineRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTLifelineAccess().getRepresentsTTypedElementCrossReference_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTLifeline5539);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2551:3: (otherlv_5= '{' ( (lv_localProperties_6_0= ruleTTemporaryProperty ) ) ( (otherlv_7= ';' )? ( (lv_localProperties_8_0= ruleTTemporaryProperty ) ) )* otherlv_9= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==14) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2551:5: otherlv_5= '{' ( (lv_localProperties_6_0= ruleTTemporaryProperty ) ) ( (otherlv_7= ';' )? ( (lv_localProperties_8_0= ruleTTemporaryProperty ) ) )* otherlv_9= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleTLifeline5553); 

                        	newLeafNode(otherlv_5, grammarAccess.getTLifelineAccess().getLeftCurlyBracketKeyword_5_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2555:1: ( (lv_localProperties_6_0= ruleTTemporaryProperty ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2556:1: (lv_localProperties_6_0= ruleTTemporaryProperty )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2556:1: (lv_localProperties_6_0= ruleTTemporaryProperty )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2557:3: lv_localProperties_6_0= ruleTTemporaryProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getTLifelineAccess().getLocalPropertiesTTemporaryPropertyParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTTemporaryProperty_in_ruleTLifeline5574);
                    lv_localProperties_6_0=ruleTTemporaryProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTLifelineRule());
                    	        }
                           		add(
                           			current, 
                           			"localProperties",
                            		lv_localProperties_6_0, 
                            		"TTemporaryProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2573:2: ( (otherlv_7= ';' )? ( (lv_localProperties_8_0= ruleTTemporaryProperty ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( ((LA71_0>=RULE_STRING && LA71_0<=RULE_TEMPLATE)||LA71_0==16) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2573:3: (otherlv_7= ';' )? ( (lv_localProperties_8_0= ruleTTemporaryProperty ) )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2573:3: (otherlv_7= ';' )?
                    	    int alt70=2;
                    	    int LA70_0 = input.LA(1);

                    	    if ( (LA70_0==16) ) {
                    	        alt70=1;
                    	    }
                    	    switch (alt70) {
                    	        case 1 :
                    	            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2573:5: otherlv_7= ';'
                    	            {
                    	            otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleTLifeline5588); 

                    	                	newLeafNode(otherlv_7, grammarAccess.getTLifelineAccess().getSemicolonKeyword_5_2_0());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2577:3: ( (lv_localProperties_8_0= ruleTTemporaryProperty ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2578:1: (lv_localProperties_8_0= ruleTTemporaryProperty )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2578:1: (lv_localProperties_8_0= ruleTTemporaryProperty )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2579:3: lv_localProperties_8_0= ruleTTemporaryProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTLifelineAccess().getLocalPropertiesTTemporaryPropertyParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTTemporaryProperty_in_ruleTLifeline5611);
                    	    lv_localProperties_8_0=ruleTTemporaryProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTLifelineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"localProperties",
                    	            		lv_localProperties_8_0, 
                    	            		"TTemporaryProperty");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,17,FOLLOW_17_in_ruleTLifeline5625); 

                        	newLeafNode(otherlv_9, grammarAccess.getTLifelineAccess().getRightCurlyBracketKeyword_5_3());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleTLifeline"


    // $ANTLR start "entryRuleTDummyValueSpecification"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2609:1: entryRuleTDummyValueSpecification returns [EObject current=null] : iv_ruleTDummyValueSpecification= ruleTDummyValueSpecification EOF ;
    public final EObject entryRuleTDummyValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTDummyValueSpecification = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2610:2: (iv_ruleTDummyValueSpecification= ruleTDummyValueSpecification EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2611:2: iv_ruleTDummyValueSpecification= ruleTDummyValueSpecification EOF
            {
             newCompositeNode(grammarAccess.getTDummyValueSpecificationRule()); 
            pushFollow(FOLLOW_ruleTDummyValueSpecification_in_entryRuleTDummyValueSpecification5665);
            iv_ruleTDummyValueSpecification=ruleTDummyValueSpecification();

            state._fsp--;

             current =iv_ruleTDummyValueSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTDummyValueSpecification5675); 

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
    // $ANTLR end "entryRuleTDummyValueSpecification"


    // $ANTLR start "ruleTDummyValueSpecification"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2618:1: ruleTDummyValueSpecification returns [EObject current=null] : ( (lv_dummy_0_0= 'true' ) ) ;
    public final EObject ruleTDummyValueSpecification() throws RecognitionException {
        EObject current = null;

        Token lv_dummy_0_0=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2621:28: ( ( (lv_dummy_0_0= 'true' ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2622:1: ( (lv_dummy_0_0= 'true' ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2622:1: ( (lv_dummy_0_0= 'true' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2623:1: (lv_dummy_0_0= 'true' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2623:1: (lv_dummy_0_0= 'true' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2624:3: lv_dummy_0_0= 'true'
            {
            lv_dummy_0_0=(Token)match(input,41,FOLLOW_41_in_ruleTDummyValueSpecification5717); 

                    newLeafNode(lv_dummy_0_0, grammarAccess.getTDummyValueSpecificationAccess().getDummyTrueKeyword_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTDummyValueSpecificationRule());
            	        }
                   		setWithLastConsumed(current, "dummy", true, "true");
            	    

            }


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
    // $ANTLR end "ruleTDummyValueSpecification"


    // $ANTLR start "entryRuleTTemporaryProperty"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2645:1: entryRuleTTemporaryProperty returns [EObject current=null] : iv_ruleTTemporaryProperty= ruleTTemporaryProperty EOF ;
    public final EObject entryRuleTTemporaryProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTTemporaryProperty = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2646:2: (iv_ruleTTemporaryProperty= ruleTTemporaryProperty EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2647:2: iv_ruleTTemporaryProperty= ruleTTemporaryProperty EOF
            {
             newCompositeNode(grammarAccess.getTTemporaryPropertyRule()); 
            pushFollow(FOLLOW_ruleTTemporaryProperty_in_entryRuleTTemporaryProperty5765);
            iv_ruleTTemporaryProperty=ruleTTemporaryProperty();

            state._fsp--;

             current =iv_ruleTTemporaryProperty; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTTemporaryProperty5775); 

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
    // $ANTLR end "entryRuleTTemporaryProperty"


    // $ANTLR start "ruleTTemporaryProperty"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2654:1: ruleTTemporaryProperty returns [EObject current=null] : (this_TReference_0= ruleTReference | this_TLocalAttribute_1= ruleTLocalAttribute ) ;
    public final EObject ruleTTemporaryProperty() throws RecognitionException {
        EObject current = null;

        EObject this_TReference_0 = null;

        EObject this_TLocalAttribute_1 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2657:28: ( (this_TReference_0= ruleTReference | this_TLocalAttribute_1= ruleTLocalAttribute ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2658:1: (this_TReference_0= ruleTReference | this_TLocalAttribute_1= ruleTLocalAttribute )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2658:1: (this_TReference_0= ruleTReference | this_TLocalAttribute_1= ruleTLocalAttribute )
            int alt73=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==25) ) {
                    alt73=1;
                }
                else if ( ((LA73_1>=RULE_STRING && LA73_1<=RULE_TEMPLATE)) ) {
                    alt73=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==25) ) {
                    alt73=1;
                }
                else if ( ((LA73_2>=RULE_STRING && LA73_2<=RULE_TEMPLATE)) ) {
                    alt73=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_TEMPLATE:
                {
                int LA73_3 = input.LA(2);

                if ( ((LA73_3>=RULE_STRING && LA73_3<=RULE_TEMPLATE)) ) {
                    alt73=2;
                }
                else if ( (LA73_3==25) ) {
                    alt73=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2659:5: this_TReference_0= ruleTReference
                    {
                     
                            newCompositeNode(grammarAccess.getTTemporaryPropertyAccess().getTReferenceParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTReference_in_ruleTTemporaryProperty5822);
                    this_TReference_0=ruleTReference();

                    state._fsp--;

                     
                            current = this_TReference_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2669:5: this_TLocalAttribute_1= ruleTLocalAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getTTemporaryPropertyAccess().getTLocalAttributeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTLocalAttribute_in_ruleTTemporaryProperty5849);
                    this_TLocalAttribute_1=ruleTLocalAttribute();

                    state._fsp--;

                     
                            current = this_TLocalAttribute_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleTTemporaryProperty"


    // $ANTLR start "entryRuleTReference"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2685:1: entryRuleTReference returns [EObject current=null] : iv_ruleTReference= ruleTReference EOF ;
    public final EObject entryRuleTReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTReference = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2686:2: (iv_ruleTReference= ruleTReference EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2687:2: iv_ruleTReference= ruleTReference EOF
            {
             newCompositeNode(grammarAccess.getTReferenceRule()); 
            pushFollow(FOLLOW_ruleTReference_in_entryRuleTReference5884);
            iv_ruleTReference=ruleTReference();

            state._fsp--;

             current =iv_ruleTReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTReference5894); 

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
    // $ANTLR end "entryRuleTReference"


    // $ANTLR start "ruleTReference"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2694:1: ruleTReference returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_partialClass_2_0= '|' ) )? ( ( ruleEString ) ) ) ;
    public final EObject ruleTReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_partialClass_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2697:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_partialClass_2_0= '|' ) )? ( ( ruleEString ) ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2698:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_partialClass_2_0= '|' ) )? ( ( ruleEString ) ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2698:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_partialClass_2_0= '|' ) )? ( ( ruleEString ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2698:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_partialClass_2_0= '|' ) )? ( ( ruleEString ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2698:2: ( (lv_name_0_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2699:1: (lv_name_0_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2699:1: (lv_name_0_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2700:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTReferenceAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTReference5940);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleTReference5952); 

                	newLeafNode(otherlv_1, grammarAccess.getTReferenceAccess().getColonKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2720:1: ( (lv_partialClass_2_0= '|' ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==24) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2721:1: (lv_partialClass_2_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2721:1: (lv_partialClass_2_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2722:3: lv_partialClass_2_0= '|'
                    {
                    lv_partialClass_2_0=(Token)match(input,24,FOLLOW_24_in_ruleTReference5970); 

                            newLeafNode(lv_partialClass_2_0, grammarAccess.getTReferenceAccess().getPartialClassVerticalLineKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTReferenceRule());
                    	        }
                           		setWithLastConsumed(current, "partialClass", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2735:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2736:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2736:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2737:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTReferenceAccess().getReferenceTClassCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTReference6007);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleTReference"


    // $ANTLR start "entryRuleTLocalAttribute"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2758:1: entryRuleTLocalAttribute returns [EObject current=null] : iv_ruleTLocalAttribute= ruleTLocalAttribute EOF ;
    public final EObject entryRuleTLocalAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTLocalAttribute = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2759:2: (iv_ruleTLocalAttribute= ruleTLocalAttribute EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2760:2: iv_ruleTLocalAttribute= ruleTLocalAttribute EOF
            {
             newCompositeNode(grammarAccess.getTLocalAttributeRule()); 
            pushFollow(FOLLOW_ruleTLocalAttribute_in_entryRuleTLocalAttribute6043);
            iv_ruleTLocalAttribute=ruleTLocalAttribute();

            state._fsp--;

             current =iv_ruleTLocalAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTLocalAttribute6053); 

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
    // $ANTLR end "entryRuleTLocalAttribute"


    // $ANTLR start "ruleTLocalAttribute"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2767:1: ruleTLocalAttribute returns [EObject current=null] : ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleTLocalAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2770:28: ( ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )? ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2771:1: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )? )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2771:1: ( ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )? )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2771:2: ( ( ruleEString ) ) ( (lv_name_1_0= ruleEString ) ) (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )?
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2771:2: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2772:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2772:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2773:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTLocalAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTLocalAttributeAccess().getTypePrimitiveTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTLocalAttribute6101);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2786:2: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2787:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2787:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2788:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTLocalAttributeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTLocalAttribute6122);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTLocalAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2804:2: (otherlv_2= '=' ( (lv_value_3_0= ruleEString ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==42) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2804:4: otherlv_2= '=' ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleTLocalAttribute6135); 

                        	newLeafNode(otherlv_2, grammarAccess.getTLocalAttributeAccess().getEqualsSignKeyword_2_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2808:1: ( (lv_value_3_0= ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2809:1: (lv_value_3_0= ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2809:1: (lv_value_3_0= ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2810:3: lv_value_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getTLocalAttributeAccess().getValueEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTLocalAttribute6156);
                    lv_value_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTLocalAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


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
    // $ANTLR end "ruleTLocalAttribute"


    // $ANTLR start "entryRuleTInteraction"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2834:1: entryRuleTInteraction returns [EObject current=null] : iv_ruleTInteraction= ruleTInteraction EOF ;
    public final EObject entryRuleTInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTInteraction = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2835:2: (iv_ruleTInteraction= ruleTInteraction EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2836:2: iv_ruleTInteraction= ruleTInteraction EOF
            {
             newCompositeNode(grammarAccess.getTInteractionRule()); 
            pushFollow(FOLLOW_ruleTInteraction_in_entryRuleTInteraction6194);
            iv_ruleTInteraction=ruleTInteraction();

            state._fsp--;

             current =iv_ruleTInteraction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTInteraction6204); 

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
    // $ANTLR end "entryRuleTInteraction"


    // $ANTLR start "ruleTInteraction"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2843:1: ruleTInteraction returns [EObject current=null] : (this_TInteractionMessage_0= ruleTInteractionMessage | this_TCombinedFragment_1= ruleTCombinedFragment | this_TOcurrence_2= ruleTOcurrence ) ;
    public final EObject ruleTInteraction() throws RecognitionException {
        EObject current = null;

        EObject this_TInteractionMessage_0 = null;

        EObject this_TCombinedFragment_1 = null;

        EObject this_TOcurrence_2 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2846:28: ( (this_TInteractionMessage_0= ruleTInteractionMessage | this_TCombinedFragment_1= ruleTCombinedFragment | this_TOcurrence_2= ruleTOcurrence ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2847:1: (this_TInteractionMessage_0= ruleTInteractionMessage | this_TCombinedFragment_1= ruleTCombinedFragment | this_TOcurrence_2= ruleTOcurrence )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2847:1: (this_TInteractionMessage_0= ruleTInteractionMessage | this_TCombinedFragment_1= ruleTCombinedFragment | this_TOcurrence_2= ruleTOcurrence )
            int alt76=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==43) ) {
                    int LA76_5 = input.LA(3);

                    if ( (LA76_5==31||LA76_5==58) ) {
                        alt76=3;
                    }
                    else if ( ((LA76_5>=RULE_STRING && LA76_5<=RULE_TEMPLATE)||LA76_5==35) ) {
                        alt76=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA76_2 = input.LA(2);

                if ( (LA76_2==43) ) {
                    int LA76_5 = input.LA(3);

                    if ( (LA76_5==31||LA76_5==58) ) {
                        alt76=3;
                    }
                    else if ( ((LA76_5>=RULE_STRING && LA76_5<=RULE_TEMPLATE)||LA76_5==35) ) {
                        alt76=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_TEMPLATE:
                {
                int LA76_3 = input.LA(2);

                if ( (LA76_3==43) ) {
                    int LA76_5 = input.LA(3);

                    if ( (LA76_5==31||LA76_5==58) ) {
                        alt76=3;
                    }
                    else if ( ((LA76_5>=RULE_STRING && LA76_5<=RULE_TEMPLATE)||LA76_5==35) ) {
                        alt76=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 76, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 3, input);

                    throw nvae;
                }
                }
                break;
            case 55:
            case 56:
            case 57:
                {
                alt76=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2848:5: this_TInteractionMessage_0= ruleTInteractionMessage
                    {
                     
                            newCompositeNode(grammarAccess.getTInteractionAccess().getTInteractionMessageParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTInteractionMessage_in_ruleTInteraction6251);
                    this_TInteractionMessage_0=ruleTInteractionMessage();

                    state._fsp--;

                     
                            current = this_TInteractionMessage_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2858:5: this_TCombinedFragment_1= ruleTCombinedFragment
                    {
                     
                            newCompositeNode(grammarAccess.getTInteractionAccess().getTCombinedFragmentParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTCombinedFragment_in_ruleTInteraction6278);
                    this_TCombinedFragment_1=ruleTCombinedFragment();

                    state._fsp--;

                     
                            current = this_TCombinedFragment_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2868:5: this_TOcurrence_2= ruleTOcurrence
                    {
                     
                            newCompositeNode(grammarAccess.getTInteractionAccess().getTOcurrenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTOcurrence_in_ruleTInteraction6305);
                    this_TOcurrence_2=ruleTOcurrence();

                    state._fsp--;

                     
                            current = this_TOcurrence_2; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleTInteraction"


    // $ANTLR start "entryRuleTOcurrence"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2884:1: entryRuleTOcurrence returns [EObject current=null] : iv_ruleTOcurrence= ruleTOcurrence EOF ;
    public final EObject entryRuleTOcurrence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTOcurrence = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2885:2: (iv_ruleTOcurrence= ruleTOcurrence EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2886:2: iv_ruleTOcurrence= ruleTOcurrence EOF
            {
             newCompositeNode(grammarAccess.getTOcurrenceRule()); 
            pushFollow(FOLLOW_ruleTOcurrence_in_entryRuleTOcurrence6340);
            iv_ruleTOcurrence=ruleTOcurrence();

            state._fsp--;

             current =iv_ruleTOcurrence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTOcurrence6350); 

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
    // $ANTLR end "entryRuleTOcurrence"


    // $ANTLR start "ruleTOcurrence"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2893:1: ruleTOcurrence returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '=>' ( (lv_ocurrenceType_2_0= ruleOcurrenceType ) ) ) ;
    public final EObject ruleTOcurrence() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_ocurrenceType_2_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2896:28: ( ( ( ( ruleEString ) ) otherlv_1= '=>' ( (lv_ocurrenceType_2_0= ruleOcurrenceType ) ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2897:1: ( ( ( ruleEString ) ) otherlv_1= '=>' ( (lv_ocurrenceType_2_0= ruleOcurrenceType ) ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2897:1: ( ( ( ruleEString ) ) otherlv_1= '=>' ( (lv_ocurrenceType_2_0= ruleOcurrenceType ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2897:2: ( ( ruleEString ) ) otherlv_1= '=>' ( (lv_ocurrenceType_2_0= ruleOcurrenceType ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2897:2: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2898:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2898:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2899:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTOcurrenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTOcurrenceAccess().getLeftLifelineTLifelineCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTOcurrence6398);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleTOcurrence6410); 

                	newLeafNode(otherlv_1, grammarAccess.getTOcurrenceAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2916:1: ( (lv_ocurrenceType_2_0= ruleOcurrenceType ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2917:1: (lv_ocurrenceType_2_0= ruleOcurrenceType )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2917:1: (lv_ocurrenceType_2_0= ruleOcurrenceType )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2918:3: lv_ocurrenceType_2_0= ruleOcurrenceType
            {
             
            	        newCompositeNode(grammarAccess.getTOcurrenceAccess().getOcurrenceTypeOcurrenceTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleOcurrenceType_in_ruleTOcurrence6431);
            lv_ocurrenceType_2_0=ruleOcurrenceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTOcurrenceRule());
            	        }
                   		set(
                   			current, 
                   			"ocurrenceType",
                    		lv_ocurrenceType_2_0, 
                    		"OcurrenceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleTOcurrence"


    // $ANTLR start "entryRuleTInteractionMessage"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2942:1: entryRuleTInteractionMessage returns [EObject current=null] : iv_ruleTInteractionMessage= ruleTInteractionMessage EOF ;
    public final EObject entryRuleTInteractionMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTInteractionMessage = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2943:2: (iv_ruleTInteractionMessage= ruleTInteractionMessage EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2944:2: iv_ruleTInteractionMessage= ruleTInteractionMessage EOF
            {
             newCompositeNode(grammarAccess.getTInteractionMessageRule()); 
            pushFollow(FOLLOW_ruleTInteractionMessage_in_entryRuleTInteractionMessage6467);
            iv_ruleTInteractionMessage=ruleTInteractionMessage();

            state._fsp--;

             current =iv_ruleTInteractionMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTInteractionMessage6477); 

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
    // $ANTLR end "entryRuleTInteractionMessage"


    // $ANTLR start "ruleTInteractionMessage"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2951:1: ruleTInteractionMessage returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= '=>' ( (lv_create_2_0= 'new' ) )? ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_message_5_0= ruleTAbstractMessage ) ) otherlv_6= '}' )? ) ;
    public final EObject ruleTInteractionMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_create_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_message_5_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2954:28: ( ( ( ( ruleEString ) ) otherlv_1= '=>' ( (lv_create_2_0= 'new' ) )? ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_message_5_0= ruleTAbstractMessage ) ) otherlv_6= '}' )? ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2955:1: ( ( ( ruleEString ) ) otherlv_1= '=>' ( (lv_create_2_0= 'new' ) )? ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_message_5_0= ruleTAbstractMessage ) ) otherlv_6= '}' )? )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2955:1: ( ( ( ruleEString ) ) otherlv_1= '=>' ( (lv_create_2_0= 'new' ) )? ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_message_5_0= ruleTAbstractMessage ) ) otherlv_6= '}' )? )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2955:2: ( ( ruleEString ) ) otherlv_1= '=>' ( (lv_create_2_0= 'new' ) )? ( ( ruleEString ) ) (otherlv_4= '{' ( (lv_message_5_0= ruleTAbstractMessage ) ) otherlv_6= '}' )?
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2955:2: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2956:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2956:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2957:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTInteractionMessageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTInteractionMessageAccess().getLeftLifelineTLifelineCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTInteractionMessage6525);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleTInteractionMessage6537); 

                	newLeafNode(otherlv_1, grammarAccess.getTInteractionMessageAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2974:1: ( (lv_create_2_0= 'new' ) )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==35) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2975:1: (lv_create_2_0= 'new' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2975:1: (lv_create_2_0= 'new' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2976:3: lv_create_2_0= 'new'
                    {
                    lv_create_2_0=(Token)match(input,35,FOLLOW_35_in_ruleTInteractionMessage6555); 

                            newLeafNode(lv_create_2_0, grammarAccess.getTInteractionMessageAccess().getCreateNewKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTInteractionMessageRule());
                    	        }
                           		setWithLastConsumed(current, "create", true, "new");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2989:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2990:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2990:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2991:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTInteractionMessageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTInteractionMessageAccess().getRightLifelineTLifelineCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTInteractionMessage6592);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3004:2: (otherlv_4= '{' ( (lv_message_5_0= ruleTAbstractMessage ) ) otherlv_6= '}' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==14) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3004:4: otherlv_4= '{' ( (lv_message_5_0= ruleTAbstractMessage ) ) otherlv_6= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTInteractionMessage6605); 

                        	newLeafNode(otherlv_4, grammarAccess.getTInteractionMessageAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3008:1: ( (lv_message_5_0= ruleTAbstractMessage ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3009:1: (lv_message_5_0= ruleTAbstractMessage )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3009:1: (lv_message_5_0= ruleTAbstractMessage )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3010:3: lv_message_5_0= ruleTAbstractMessage
                    {
                     
                    	        newCompositeNode(grammarAccess.getTInteractionMessageAccess().getMessageTAbstractMessageParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTAbstractMessage_in_ruleTInteractionMessage6626);
                    lv_message_5_0=ruleTAbstractMessage();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTInteractionMessageRule());
                    	        }
                           		set(
                           			current, 
                           			"message",
                            		lv_message_5_0, 
                            		"TAbstractMessage");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleTInteractionMessage6638); 

                        	newLeafNode(otherlv_6, grammarAccess.getTInteractionMessageAccess().getRightCurlyBracketKeyword_4_2());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleTInteractionMessage"


    // $ANTLR start "entryRuleTCombinedFragment"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3038:1: entryRuleTCombinedFragment returns [EObject current=null] : iv_ruleTCombinedFragment= ruleTCombinedFragment EOF ;
    public final EObject entryRuleTCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTCombinedFragment = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3039:2: (iv_ruleTCombinedFragment= ruleTCombinedFragment EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3040:2: iv_ruleTCombinedFragment= ruleTCombinedFragment EOF
            {
             newCompositeNode(grammarAccess.getTCombinedFragmentRule()); 
            pushFollow(FOLLOW_ruleTCombinedFragment_in_entryRuleTCombinedFragment6676);
            iv_ruleTCombinedFragment=ruleTCombinedFragment();

            state._fsp--;

             current =iv_ruleTCombinedFragment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTCombinedFragment6686); 

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
    // $ANTLR end "entryRuleTCombinedFragment"


    // $ANTLR start "ruleTCombinedFragment"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3047:1: ruleTCombinedFragment returns [EObject current=null] : ( ( (lv_interactionOperator_0_0= ruleInteractionOperatorKind ) ) otherlv_1= '[' ( (lv_interactionConstraint_2_0= ruleEString ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_containers_5_0= ruleTInteraction ) ) ( (lv_containers_6_0= ruleTInteraction ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_elseContainers_10_0= ruleTInteraction ) ) ( (lv_elseContainers_11_0= ruleTInteraction ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleTCombinedFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Enumerator lv_interactionOperator_0_0 = null;

        AntlrDatatypeRuleToken lv_interactionConstraint_2_0 = null;

        EObject lv_containers_5_0 = null;

        EObject lv_containers_6_0 = null;

        EObject lv_elseContainers_10_0 = null;

        EObject lv_elseContainers_11_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3050:28: ( ( ( (lv_interactionOperator_0_0= ruleInteractionOperatorKind ) ) otherlv_1= '[' ( (lv_interactionConstraint_2_0= ruleEString ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_containers_5_0= ruleTInteraction ) ) ( (lv_containers_6_0= ruleTInteraction ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_elseContainers_10_0= ruleTInteraction ) ) ( (lv_elseContainers_11_0= ruleTInteraction ) )* otherlv_12= '}' )? ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3051:1: ( ( (lv_interactionOperator_0_0= ruleInteractionOperatorKind ) ) otherlv_1= '[' ( (lv_interactionConstraint_2_0= ruleEString ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_containers_5_0= ruleTInteraction ) ) ( (lv_containers_6_0= ruleTInteraction ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_elseContainers_10_0= ruleTInteraction ) ) ( (lv_elseContainers_11_0= ruleTInteraction ) )* otherlv_12= '}' )? )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3051:1: ( ( (lv_interactionOperator_0_0= ruleInteractionOperatorKind ) ) otherlv_1= '[' ( (lv_interactionConstraint_2_0= ruleEString ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_containers_5_0= ruleTInteraction ) ) ( (lv_containers_6_0= ruleTInteraction ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_elseContainers_10_0= ruleTInteraction ) ) ( (lv_elseContainers_11_0= ruleTInteraction ) )* otherlv_12= '}' )? )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3051:2: ( (lv_interactionOperator_0_0= ruleInteractionOperatorKind ) ) otherlv_1= '[' ( (lv_interactionConstraint_2_0= ruleEString ) ) otherlv_3= ']' otherlv_4= '{' ( (lv_containers_5_0= ruleTInteraction ) ) ( (lv_containers_6_0= ruleTInteraction ) )* otherlv_7= '}' (otherlv_8= 'else' otherlv_9= '{' ( (lv_elseContainers_10_0= ruleTInteraction ) ) ( (lv_elseContainers_11_0= ruleTInteraction ) )* otherlv_12= '}' )?
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3051:2: ( (lv_interactionOperator_0_0= ruleInteractionOperatorKind ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3052:1: (lv_interactionOperator_0_0= ruleInteractionOperatorKind )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3052:1: (lv_interactionOperator_0_0= ruleInteractionOperatorKind )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3053:3: lv_interactionOperator_0_0= ruleInteractionOperatorKind
            {
             
            	        newCompositeNode(grammarAccess.getTCombinedFragmentAccess().getInteractionOperatorInteractionOperatorKindEnumRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleInteractionOperatorKind_in_ruleTCombinedFragment6732);
            lv_interactionOperator_0_0=ruleInteractionOperatorKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTCombinedFragmentRule());
            	        }
                   		set(
                   			current, 
                   			"interactionOperator",
                    		lv_interactionOperator_0_0, 
                    		"InteractionOperatorKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleTCombinedFragment6744); 

                	newLeafNode(otherlv_1, grammarAccess.getTCombinedFragmentAccess().getLeftSquareBracketKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3073:1: ( (lv_interactionConstraint_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3074:1: (lv_interactionConstraint_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3074:1: (lv_interactionConstraint_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3075:3: lv_interactionConstraint_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTCombinedFragmentAccess().getInteractionConstraintEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTCombinedFragment6765);
            lv_interactionConstraint_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTCombinedFragmentRule());
            	        }
                   		set(
                   			current, 
                   			"interactionConstraint",
                    		lv_interactionConstraint_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleTCombinedFragment6777); 

                	newLeafNode(otherlv_3, grammarAccess.getTCombinedFragmentAccess().getRightSquareBracketKeyword_3());
                
            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleTCombinedFragment6789); 

                	newLeafNode(otherlv_4, grammarAccess.getTCombinedFragmentAccess().getLeftCurlyBracketKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3099:1: ( (lv_containers_5_0= ruleTInteraction ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3100:1: (lv_containers_5_0= ruleTInteraction )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3100:1: (lv_containers_5_0= ruleTInteraction )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3101:3: lv_containers_5_0= ruleTInteraction
            {
             
            	        newCompositeNode(grammarAccess.getTCombinedFragmentAccess().getContainersTInteractionParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTInteraction_in_ruleTCombinedFragment6810);
            lv_containers_5_0=ruleTInteraction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTCombinedFragmentRule());
            	        }
                   		add(
                   			current, 
                   			"containers",
                    		lv_containers_5_0, 
                    		"TInteraction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3117:2: ( (lv_containers_6_0= ruleTInteraction ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=RULE_STRING && LA79_0<=RULE_TEMPLATE)||(LA79_0>=55 && LA79_0<=57)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3118:1: (lv_containers_6_0= ruleTInteraction )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3118:1: (lv_containers_6_0= ruleTInteraction )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3119:3: lv_containers_6_0= ruleTInteraction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTCombinedFragmentAccess().getContainersTInteractionParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTInteraction_in_ruleTCombinedFragment6831);
            	    lv_containers_6_0=ruleTInteraction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTCombinedFragmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containers",
            	            		lv_containers_6_0, 
            	            		"TInteraction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleTCombinedFragment6844); 

                	newLeafNode(otherlv_7, grammarAccess.getTCombinedFragmentAccess().getRightCurlyBracketKeyword_7());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3139:1: (otherlv_8= 'else' otherlv_9= '{' ( (lv_elseContainers_10_0= ruleTInteraction ) ) ( (lv_elseContainers_11_0= ruleTInteraction ) )* otherlv_12= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==46) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3139:3: otherlv_8= 'else' otherlv_9= '{' ( (lv_elseContainers_10_0= ruleTInteraction ) ) ( (lv_elseContainers_11_0= ruleTInteraction ) )* otherlv_12= '}'
                    {
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleTCombinedFragment6857); 

                        	newLeafNode(otherlv_8, grammarAccess.getTCombinedFragmentAccess().getElseKeyword_8_0());
                        
                    otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleTCombinedFragment6869); 

                        	newLeafNode(otherlv_9, grammarAccess.getTCombinedFragmentAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3147:1: ( (lv_elseContainers_10_0= ruleTInteraction ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3148:1: (lv_elseContainers_10_0= ruleTInteraction )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3148:1: (lv_elseContainers_10_0= ruleTInteraction )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3149:3: lv_elseContainers_10_0= ruleTInteraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getTCombinedFragmentAccess().getElseContainersTInteractionParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTInteraction_in_ruleTCombinedFragment6890);
                    lv_elseContainers_10_0=ruleTInteraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTCombinedFragmentRule());
                    	        }
                           		add(
                           			current, 
                           			"elseContainers",
                            		lv_elseContainers_10_0, 
                            		"TInteraction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3165:2: ( (lv_elseContainers_11_0= ruleTInteraction ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( ((LA80_0>=RULE_STRING && LA80_0<=RULE_TEMPLATE)||(LA80_0>=55 && LA80_0<=57)) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3166:1: (lv_elseContainers_11_0= ruleTInteraction )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3166:1: (lv_elseContainers_11_0= ruleTInteraction )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3167:3: lv_elseContainers_11_0= ruleTInteraction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTCombinedFragmentAccess().getElseContainersTInteractionParserRuleCall_8_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTInteraction_in_ruleTCombinedFragment6911);
                    	    lv_elseContainers_11_0=ruleTInteraction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTCombinedFragmentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elseContainers",
                    	            		lv_elseContainers_11_0, 
                    	            		"TInteraction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleTCombinedFragment6924); 

                        	newLeafNode(otherlv_12, grammarAccess.getTCombinedFragmentAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }


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
    // $ANTLR end "ruleTCombinedFragment"


    // $ANTLR start "entryRuleTAbstractMessage"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3195:1: entryRuleTAbstractMessage returns [EObject current=null] : iv_ruleTAbstractMessage= ruleTAbstractMessage EOF ;
    public final EObject entryRuleTAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTAbstractMessage = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3196:2: (iv_ruleTAbstractMessage= ruleTAbstractMessage EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3197:2: iv_ruleTAbstractMessage= ruleTAbstractMessage EOF
            {
             newCompositeNode(grammarAccess.getTAbstractMessageRule()); 
            pushFollow(FOLLOW_ruleTAbstractMessage_in_entryRuleTAbstractMessage6962);
            iv_ruleTAbstractMessage=ruleTAbstractMessage();

            state._fsp--;

             current =iv_ruleTAbstractMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTAbstractMessage6972); 

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
    // $ANTLR end "entryRuleTAbstractMessage"


    // $ANTLR start "ruleTAbstractMessage"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3204:1: ruleTAbstractMessage returns [EObject current=null] : (this_TMessage_0= ruleTMessage | this_TReturnMessage_1= ruleTReturnMessage ) ;
    public final EObject ruleTAbstractMessage() throws RecognitionException {
        EObject current = null;

        EObject this_TMessage_0 = null;

        EObject this_TReturnMessage_1 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3207:28: ( (this_TMessage_0= ruleTMessage | this_TReturnMessage_1= ruleTReturnMessage ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3208:1: (this_TMessage_0= ruleTMessage | this_TReturnMessage_1= ruleTReturnMessage )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3208:1: (this_TMessage_0= ruleTMessage | this_TReturnMessage_1= ruleTReturnMessage )
            int alt82=2;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                int LA82_1 = input.LA(2);

                if ( (LA82_1==27||LA82_1==47) ) {
                    alt82=1;
                }
                else if ( (LA82_1==EOF||LA82_1==17) ) {
                    alt82=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA82_2 = input.LA(2);

                if ( (LA82_2==27||LA82_2==47) ) {
                    alt82=1;
                }
                else if ( (LA82_2==EOF||LA82_2==17) ) {
                    alt82=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_TEMPLATE:
                {
                int LA82_3 = input.LA(2);

                if ( (LA82_3==27||LA82_3==47) ) {
                    alt82=1;
                }
                else if ( (LA82_3==EOF||LA82_3==17) ) {
                    alt82=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 82, 3, input);

                    throw nvae;
                }
                }
                break;
            case 24:
                {
                alt82=1;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3209:5: this_TMessage_0= ruleTMessage
                    {
                     
                            newCompositeNode(grammarAccess.getTAbstractMessageAccess().getTMessageParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTMessage_in_ruleTAbstractMessage7019);
                    this_TMessage_0=ruleTMessage();

                    state._fsp--;

                     
                            current = this_TMessage_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3219:5: this_TReturnMessage_1= ruleTReturnMessage
                    {
                     
                            newCompositeNode(grammarAccess.getTAbstractMessageAccess().getTReturnMessageParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTReturnMessage_in_ruleTAbstractMessage7046);
                    this_TReturnMessage_1=ruleTReturnMessage();

                    state._fsp--;

                     
                            current = this_TReturnMessage_1; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleTAbstractMessage"


    // $ANTLR start "entryRuleTReturnMessage"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3235:1: entryRuleTReturnMessage returns [EObject current=null] : iv_ruleTReturnMessage= ruleTReturnMessage EOF ;
    public final EObject entryRuleTReturnMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTReturnMessage = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3236:2: (iv_ruleTReturnMessage= ruleTReturnMessage EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3237:2: iv_ruleTReturnMessage= ruleTReturnMessage EOF
            {
             newCompositeNode(grammarAccess.getTReturnMessageRule()); 
            pushFollow(FOLLOW_ruleTReturnMessage_in_entryRuleTReturnMessage7081);
            iv_ruleTReturnMessage=ruleTReturnMessage();

            state._fsp--;

             current =iv_ruleTReturnMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTReturnMessage7091); 

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
    // $ANTLR end "entryRuleTReturnMessage"


    // $ANTLR start "ruleTReturnMessage"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3244:1: ruleTReturnMessage returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleTReturnMessage() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3247:28: ( ( ( ruleEString ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3248:1: ( ( ruleEString ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3248:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3249:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3249:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3250:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTReturnMessageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTReturnMessageAccess().getAssignToTMessageAssignableFeatureCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTReturnMessage7138);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTReturnMessage"


    // $ANTLR start "entryRuleTMessage"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3271:1: entryRuleTMessage returns [EObject current=null] : iv_ruleTMessage= ruleTMessage EOF ;
    public final EObject entryRuleTMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTMessage = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3272:2: (iv_ruleTMessage= ruleTMessage EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3273:2: iv_ruleTMessage= ruleTMessage EOF
            {
             newCompositeNode(grammarAccess.getTMessageRule()); 
            pushFollow(FOLLOW_ruleTMessage_in_entryRuleTMessage7173);
            iv_ruleTMessage=ruleTMessage();

            state._fsp--;

             current =iv_ruleTMessage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTMessage7183); 

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
    // $ANTLR end "entryRuleTMessage"


    // $ANTLR start "ruleTMessage"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3280:1: ruleTMessage returns [EObject current=null] : ( ( ( ( ruleEString ) ) otherlv_1= ':=' )? ( (lv_partialOperation_2_0= '|' ) )? ( ( ruleEString ) ) otherlv_4= '(' ( ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )? )? otherlv_8= ')' ) ;
    public final EObject ruleTMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_partialOperation_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3283:28: ( ( ( ( ( ruleEString ) ) otherlv_1= ':=' )? ( (lv_partialOperation_2_0= '|' ) )? ( ( ruleEString ) ) otherlv_4= '(' ( ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )? )? otherlv_8= ')' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3284:1: ( ( ( ( ruleEString ) ) otherlv_1= ':=' )? ( (lv_partialOperation_2_0= '|' ) )? ( ( ruleEString ) ) otherlv_4= '(' ( ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )? )? otherlv_8= ')' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3284:1: ( ( ( ( ruleEString ) ) otherlv_1= ':=' )? ( (lv_partialOperation_2_0= '|' ) )? ( ( ruleEString ) ) otherlv_4= '(' ( ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )? )? otherlv_8= ')' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3284:2: ( ( ( ruleEString ) ) otherlv_1= ':=' )? ( (lv_partialOperation_2_0= '|' ) )? ( ( ruleEString ) ) otherlv_4= '(' ( ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )? )? otherlv_8= ')'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3284:2: ( ( ( ruleEString ) ) otherlv_1= ':=' )?
            int alt83=2;
            switch ( input.LA(1) ) {
                case RULE_STRING:
                    {
                    int LA83_1 = input.LA(2);

                    if ( (LA83_1==47) ) {
                        alt83=1;
                    }
                    }
                    break;
                case RULE_ID:
                    {
                    int LA83_2 = input.LA(2);

                    if ( (LA83_2==47) ) {
                        alt83=1;
                    }
                    }
                    break;
                case RULE_TEMPLATE:
                    {
                    int LA83_3 = input.LA(2);

                    if ( (LA83_3==47) ) {
                        alt83=1;
                    }
                    }
                    break;
            }

            switch (alt83) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3284:3: ( ( ruleEString ) ) otherlv_1= ':='
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3284:3: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3285:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3285:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3286:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTMessageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTMessageAccess().getAssignToTMessageAssignableFeatureCrossReference_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTMessage7232);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleTMessage7244); 

                        	newLeafNode(otherlv_1, grammarAccess.getTMessageAccess().getColonEqualsSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3303:3: ( (lv_partialOperation_2_0= '|' ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==24) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3304:1: (lv_partialOperation_2_0= '|' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3304:1: (lv_partialOperation_2_0= '|' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3305:3: lv_partialOperation_2_0= '|'
                    {
                    lv_partialOperation_2_0=(Token)match(input,24,FOLLOW_24_in_ruleTMessage7264); 

                            newLeafNode(lv_partialOperation_2_0, grammarAccess.getTMessageAccess().getPartialOperationVerticalLineKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTMessageRule());
                    	        }
                           		setWithLastConsumed(current, "partialOperation", true, "|");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3318:3: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3319:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3319:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3320:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTMessageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTMessageAccess().getSignatureTOperationCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTMessage7301);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleTMessage7313); 

                	newLeafNode(otherlv_4, grammarAccess.getTMessageAccess().getLeftParenthesisKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3337:1: ( ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )? )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=RULE_STRING && LA86_0<=RULE_TEMPLATE)) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3337:2: ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )?
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3337:2: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3338:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3338:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3339:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTMessageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTMessageAccess().getArgumentsTValueSpecificationCrossReference_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleEString_in_ruleTMessage7337);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3352:2: (otherlv_6= ',' ( ( ruleEString ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==13) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3352:4: otherlv_6= ',' ( ( ruleEString ) )
                            {
                            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleTMessage7350); 

                                	newLeafNode(otherlv_6, grammarAccess.getTMessageAccess().getCommaKeyword_4_1_0());
                                
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3356:1: ( ( ruleEString ) )
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3357:1: ( ruleEString )
                            {
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3357:1: ( ruleEString )
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3358:3: ruleEString
                            {

                            			if (current==null) {
                            	            current = createModelElement(grammarAccess.getTMessageRule());
                            	        }
                                    
                             
                            	        newCompositeNode(grammarAccess.getTMessageAccess().getArgumentsTValueSpecificationCrossReference_4_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleEString_in_ruleTMessage7373);
                            ruleEString();

                            state._fsp--;

                             
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleTMessage7389); 

                	newLeafNode(otherlv_8, grammarAccess.getTMessageAccess().getRightParenthesisKeyword_5());
                

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
    // $ANTLR end "ruleTMessage"


    // $ANTLR start "ruleVisibility"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3389:1: ruleVisibility returns [Enumerator current=null] : ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) ;
    public final Enumerator ruleVisibility() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3391:28: ( ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3392:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3392:1: ( (enumLiteral_0= '+' ) | (enumLiteral_1= '-' ) | (enumLiteral_2= '#' ) | (enumLiteral_3= '~' ) )
            int alt87=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt87=1;
                }
                break;
            case 49:
                {
                alt87=2;
                }
                break;
            case 50:
                {
                alt87=3;
                }
                break;
            case 51:
                {
                alt87=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3392:2: (enumLiteral_0= '+' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3392:2: (enumLiteral_0= '+' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3392:4: enumLiteral_0= '+'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_48_in_ruleVisibility7445); 

                            current = grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVisibilityAccess().getPublicEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3398:6: (enumLiteral_1= '-' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3398:6: (enumLiteral_1= '-' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3398:8: enumLiteral_1= '-'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_49_in_ruleVisibility7462); 

                            current = grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVisibilityAccess().getPrivateEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3404:6: (enumLiteral_2= '#' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3404:6: (enumLiteral_2= '#' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3404:8: enumLiteral_2= '#'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_50_in_ruleVisibility7479); 

                            current = grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVisibilityAccess().getProtectedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3410:6: (enumLiteral_3= '~' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3410:6: (enumLiteral_3= '~' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3410:8: enumLiteral_3= '~'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_51_in_ruleVisibility7496); 

                            current = grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getVisibilityAccess().getPackageEnumLiteralDeclaration_3()); 
                        

                    }


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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "ruleInstantiationType"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3420:1: ruleInstantiationType returns [Enumerator current=null] : ( (enumLiteral_0= 'dependsOn' ) | (enumLiteral_1= 'extends' ) ) ;
    public final Enumerator ruleInstantiationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3422:28: ( ( (enumLiteral_0= 'dependsOn' ) | (enumLiteral_1= 'extends' ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3423:1: ( (enumLiteral_0= 'dependsOn' ) | (enumLiteral_1= 'extends' ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3423:1: ( (enumLiteral_0= 'dependsOn' ) | (enumLiteral_1= 'extends' ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==52) ) {
                alt88=1;
            }
            else if ( (LA88_0==53) ) {
                alt88=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3423:2: (enumLiteral_0= 'dependsOn' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3423:2: (enumLiteral_0= 'dependsOn' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3423:4: enumLiteral_0= 'dependsOn'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_52_in_ruleInstantiationType7541); 

                            current = grammarAccess.getInstantiationTypeAccess().getDependsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInstantiationTypeAccess().getDependsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3429:6: (enumLiteral_1= 'extends' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3429:6: (enumLiteral_1= 'extends' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3429:8: enumLiteral_1= 'extends'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_53_in_ruleInstantiationType7558); 

                            current = grammarAccess.getInstantiationTypeAccess().getExtendsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInstantiationTypeAccess().getExtendsEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleInstantiationType"


    // $ANTLR start "ruleReferenceType"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3441:1: ruleReferenceType returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= 'o' ) ) ;
    public final Enumerator ruleReferenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3443:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= 'o' ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3444:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= 'o' ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3444:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= 'o' ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==31) ) {
                alt89=1;
            }
            else if ( (LA89_0==54) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3444:2: (enumLiteral_0= '*' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3444:2: (enumLiteral_0= '*' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3444:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleReferenceType7605); 

                            current = grammarAccess.getReferenceTypeAccess().getCompositionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getReferenceTypeAccess().getCompositionEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3450:6: (enumLiteral_1= 'o' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3450:6: (enumLiteral_1= 'o' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3450:8: enumLiteral_1= 'o'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_54_in_ruleReferenceType7622); 

                            current = grammarAccess.getReferenceTypeAccess().getAggregationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getReferenceTypeAccess().getAggregationEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleReferenceType"


    // $ANTLR start "ruleInteractionOperatorKind"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3460:1: ruleInteractionOperatorKind returns [Enumerator current=null] : ( (enumLiteral_0= 'alt' ) | (enumLiteral_1= 'opt' ) | (enumLiteral_2= 'loop' ) ) ;
    public final Enumerator ruleInteractionOperatorKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3462:28: ( ( (enumLiteral_0= 'alt' ) | (enumLiteral_1= 'opt' ) | (enumLiteral_2= 'loop' ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3463:1: ( (enumLiteral_0= 'alt' ) | (enumLiteral_1= 'opt' ) | (enumLiteral_2= 'loop' ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3463:1: ( (enumLiteral_0= 'alt' ) | (enumLiteral_1= 'opt' ) | (enumLiteral_2= 'loop' ) )
            int alt90=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt90=1;
                }
                break;
            case 56:
                {
                alt90=2;
                }
                break;
            case 57:
                {
                alt90=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3463:2: (enumLiteral_0= 'alt' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3463:2: (enumLiteral_0= 'alt' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3463:4: enumLiteral_0= 'alt'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleInteractionOperatorKind7667); 

                            current = grammarAccess.getInteractionOperatorKindAccess().getAltEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getInteractionOperatorKindAccess().getAltEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3469:6: (enumLiteral_1= 'opt' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3469:6: (enumLiteral_1= 'opt' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3469:8: enumLiteral_1= 'opt'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleInteractionOperatorKind7684); 

                            current = grammarAccess.getInteractionOperatorKindAccess().getOptEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getInteractionOperatorKindAccess().getOptEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3475:6: (enumLiteral_2= 'loop' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3475:6: (enumLiteral_2= 'loop' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3475:8: enumLiteral_2= 'loop'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleInteractionOperatorKind7701); 

                            current = grammarAccess.getInteractionOperatorKindAccess().getLoopEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getInteractionOperatorKindAccess().getLoopEnumLiteralDeclaration_2()); 
                        

                    }


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
    // $ANTLR end "ruleInteractionOperatorKind"


    // $ANTLR start "ruleOcurrenceType"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3485:1: ruleOcurrenceType returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= 'X' ) ) ;
    public final Enumerator ruleOcurrenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3487:28: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= 'X' ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3488:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= 'X' ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3488:1: ( (enumLiteral_0= '*' ) | (enumLiteral_1= 'X' ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==31) ) {
                alt91=1;
            }
            else if ( (LA91_0==58) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3488:2: (enumLiteral_0= '*' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3488:2: (enumLiteral_0= '*' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3488:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_31_in_ruleOcurrenceType7746); 

                            current = grammarAccess.getOcurrenceTypeAccess().getOriginalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOcurrenceTypeAccess().getOriginalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3494:6: (enumLiteral_1= 'X' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3494:6: (enumLiteral_1= 'X' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3494:8: enumLiteral_1= 'X'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleOcurrenceType7763); 

                            current = grammarAccess.getOcurrenceTypeAccess().getDestructionEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOcurrenceTypeAccess().getDestructionEnumLiteralDeclaration_1()); 
                        

                    }


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
    // $ANTLR end "ruleOcurrenceType"


    // $ANTLR start "ruleTLifelineReferenceType"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3504:1: ruleTLifelineReferenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'ref' ) | (enumLiteral_1= 'assoc' ) | (enumLiteral_2= 'attr' ) ) ;
    public final Enumerator ruleTLifelineReferenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3506:28: ( ( (enumLiteral_0= 'ref' ) | (enumLiteral_1= 'assoc' ) | (enumLiteral_2= 'attr' ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3507:1: ( (enumLiteral_0= 'ref' ) | (enumLiteral_1= 'assoc' ) | (enumLiteral_2= 'attr' ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3507:1: ( (enumLiteral_0= 'ref' ) | (enumLiteral_1= 'assoc' ) | (enumLiteral_2= 'attr' ) )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt92=1;
                }
                break;
            case 60:
                {
                alt92=2;
                }
                break;
            case 61:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3507:2: (enumLiteral_0= 'ref' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3507:2: (enumLiteral_0= 'ref' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3507:4: enumLiteral_0= 'ref'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleTLifelineReferenceType7808); 

                            current = grammarAccess.getTLifelineReferenceTypeAccess().getReferenceEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTLifelineReferenceTypeAccess().getReferenceEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3513:6: (enumLiteral_1= 'assoc' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3513:6: (enumLiteral_1= 'assoc' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3513:8: enumLiteral_1= 'assoc'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleTLifelineReferenceType7825); 

                            current = grammarAccess.getTLifelineReferenceTypeAccess().getAssociationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTLifelineReferenceTypeAccess().getAssociationEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3519:6: (enumLiteral_2= 'attr' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3519:6: (enumLiteral_2= 'attr' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3519:8: enumLiteral_2= 'attr'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleTLifelineReferenceType7842); 

                            current = grammarAccess.getTLifelineReferenceTypeAccess().getAttributeEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTLifelineReferenceTypeAccess().getAttributeEnumLiteralDeclaration_2()); 
                        

                    }


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
    // $ANTLR end "ruleTLifelineReferenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAspect_in_ruleAspect131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAspect_in_entryRuleTAspect165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTAspect175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTAspect212 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTAspect233 = new BitSet(new long[]{0x0030000000004000L});
    public static final BitSet FOLLOW_ruleTInstantiationHeader_in_ruleTAspect255 = new BitSet(new long[]{0x0030000000006000L});
    public static final BitSet FOLLOW_13_in_ruleTAspect269 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_ruleTInstantiationHeader_in_ruleTAspect292 = new BitSet(new long[]{0x0030000000006000L});
    public static final BitSet FOLLOW_14_in_ruleTAspect308 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleTStructuralView_in_ruleTAspect329 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_15_in_ruleTAspect342 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTAspect354 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleInstantiation_in_ruleTAspect375 = new BitSet(new long[]{0x0000000000030070L});
    public static final BitSet FOLLOW_16_in_ruleTAspect389 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleInstantiation_in_ruleTAspect412 = new BitSet(new long[]{0x0000000000030070L});
    public static final BitSet FOLLOW_17_in_ruleTAspect426 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_18_in_ruleTAspect441 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTAspect453 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleTAbstractMessageView_in_ruleTAspect474 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTAspect486 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTAspect500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_TEMPLATE_in_ruleEString640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAbstractMessageView_in_entryRuleTAbstractMessageView689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTAbstractMessageView699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTAbstractMessageView745 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTAbstractMessageView757 = new BitSet(new long[]{0x3800000004000000L});
    public static final BitSet FOLLOW_ruleTLifeline_in_ruleTAbstractMessageView778 = new BitSet(new long[]{0x3800000004030000L});
    public static final BitSet FOLLOW_16_in_ruleTAbstractMessageView792 = new BitSet(new long[]{0x3800000004000000L});
    public static final BitSet FOLLOW_ruleTLifeline_in_ruleTAbstractMessageView815 = new BitSet(new long[]{0x3800000004030000L});
    public static final BitSet FOLLOW_17_in_ruleTAbstractMessageView829 = new BitSet(new long[]{0x0000004400000000L});
    public static final BitSet FOLLOW_ruleTAbstractMessages_in_ruleTAbstractMessageView850 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_ruleTAbstractMessages_in_ruleTAbstractMessageView871 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_ruleTStructuralView_in_entryRuleTStructuralView908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTStructuralView918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTStructuralView964 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTStructuralView976 = new BitSet(new long[]{0x0000000000E20000L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleTStructuralView998 = new BitSet(new long[]{0x0000000000E20000L});
    public static final BitSet FOLLOW_ruleClassifier_in_ruleTStructuralView1019 = new BitSet(new long[]{0x0000000000E20000L});
    public static final BitSet FOLLOW_21_in_ruleTStructuralView1035 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTStructuralView1047 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_ruleTAssociation_in_ruleTStructuralView1068 = new BitSet(new long[]{0x00000000800300F0L});
    public static final BitSet FOLLOW_16_in_ruleTStructuralView1082 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_ruleTAssociation_in_ruleTStructuralView1105 = new BitSet(new long[]{0x00000000800300F0L});
    public static final BitSet FOLLOW_17_in_ruleTStructuralView1119 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTStructuralView1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier1169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTClass_in_ruleClassifier1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRString_in_entryRuleRString1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRString1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRFloat_in_entryRuleRFloat1343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRFloat1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRDouble_in_entryRuleRDouble1421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRDouble1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRAny_in_entryRuleRAny1499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRAny1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRChar_in_entryRuleRChar1577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRChar1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRInt_in_entryRuleRInt1655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRInt1665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRBoolean_in_entryRuleRBoolean1733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRBoolean1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRVoid_in_entryRuleRVoid1811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRVoid1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSet_in_entryRuleRSet1889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSet1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTClassMember_in_entryRuleTClassMember1969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTClassMember1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAttribute_in_ruleTClassMember2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOperation_in_ruleTClassMember2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTClass_in_entryRuleTClass2088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTClass2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTClass2150 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTClass2176 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTClass2194 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTClass2229 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_25_in_ruleTClass2242 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTClass2260 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTClass2297 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTClass2311 = new BitSet(new long[]{0x000F000004420070L});
    public static final BitSet FOLLOW_ruleTClassMember_in_ruleTClass2333 = new BitSet(new long[]{0x000F000004430070L});
    public static final BitSet FOLLOW_16_in_ruleTClass2347 = new BitSet(new long[]{0x000F000004400070L});
    public static final BitSet FOLLOW_ruleTClassMember_in_ruleTClass2370 = new BitSet(new long[]{0x000F000004430070L});
    public static final BitSet FOLLOW_17_in_ruleTClass2386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAttribute_in_entryRuleTAttribute2422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTAttribute2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTAttribute2475 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTAttribute2512 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTAttribute2530 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTAttribute2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOperation_in_entryRuleTOperation2601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOperation2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTOperation2663 = new BitSet(new long[]{0x000F000004400070L});
    public static final BitSet FOLLOW_26_in_ruleTOperation2695 = new BitSet(new long[]{0x000F000004400070L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleTOperation2730 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTOperation2748 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTOperation2785 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTOperation2803 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTOperation2838 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTOperation2850 = new BitSet(new long[]{0x0000000011000070L});
    public static final BitSet FOLLOW_ruleTParameter_in_ruleTOperation2872 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_13_in_ruleTOperation2885 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_ruleTParameter_in_ruleTOperation2906 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_28_in_ruleTOperation2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTParameter_in_entryRuleTParameter2958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTParameter2968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTParameter3011 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTParameter3048 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTParameter3069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAssociation_in_entryRuleTAssociation3105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTAssociation3115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAssociationEnd_in_ruleTAssociation3170 = new BitSet(new long[]{0x00400000A0000000L});
    public static final BitSet FOLLOW_ruleReferenceType_in_ruleTAssociation3191 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTAssociation3204 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_ruleTAssociationEnd_in_ruleTAssociation3225 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTAssociation3237 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTAssociation3258 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTAssociation3270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAssociationEnd_in_entryRuleTAssociationEnd3306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTAssociationEnd3316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementBound_in_ruleTAssociationEnd3372 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTAssociationEnd3384 = new BitSet(new long[]{0x00000000800000F0L});
    public static final BitSet FOLLOW_ruleElementBound_in_ruleTAssociationEnd3407 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTAssociationEnd3431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementBound_in_entryRuleElementBound3468 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementBound3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleElementBound3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleElementBound3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTInstantiationHeader_in_entryRuleTInstantiationHeader3583 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTInstantiationHeader3593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstantiationType_in_ruleTInstantiationHeader3639 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTInstantiationHeader3662 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleTInstantiationHeader3675 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTInstantiationHeader3698 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleInstantiation_in_entryRuleInstantiation3736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstantiation3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleInstantiation3794 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleInstantiation3807 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_ruleTClassifierMapping_in_ruleInstantiation3828 = new BitSet(new long[]{0x0000000001030070L});
    public static final BitSet FOLLOW_16_in_ruleInstantiation3842 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_ruleTClassifierMapping_in_ruleInstantiation3865 = new BitSet(new long[]{0x0000000001030070L});
    public static final BitSet FOLLOW_17_in_ruleInstantiation3879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTClassifierMapping_in_entryRuleTClassifierMapping3919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTClassifierMapping3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTClassifierMapping3972 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTClassifierMapping4009 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_32_in_ruleTClassifierMapping4022 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTClassifierMapping4045 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_13_in_ruleTClassifierMapping4058 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTClassifierMapping4081 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_33_in_ruleTClassifierMapping4095 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTClassifierMapping4109 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTClassifierMapping4127 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTClassifierMapping4164 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleTClassifierMapping4177 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTClassifierMapping4200 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_13_in_ruleTClassifierMapping4213 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTClassifierMapping4236 = new BitSet(new long[]{0x0000000200002000L});
    public static final BitSet FOLLOW_33_in_ruleTClassifierMapping4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAbstractMessages_in_entryRuleTAbstractMessages4288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTAbstractMessages4298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTMessageView_in_ruleTAbstractMessages4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAspectMessageView_in_ruleTAbstractMessages4372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTMessageView_in_entryRuleTMessageView4407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTMessageView4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTMessageView4463 = new BitSet(new long[]{0x0000000801000070L});
    public static final BitSet FOLLOW_35_in_ruleTMessageView4481 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTMessageView4513 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTMessageView4550 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleTMessageView4562 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTMessageView4580 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTMessageView4617 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTMessageView4629 = new BitSet(new long[]{0x0000000010000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTMessageView4653 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_13_in_ruleTMessageView4666 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTMessageView4689 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_28_in_ruleTMessageView4705 = new BitSet(new long[]{0x0000002000004002L});
    public static final BitSet FOLLOW_37_in_ruleTMessageView4718 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTMessageView4741 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13_in_ruleTMessageView4754 = new BitSet(new long[]{0x0000000000004072L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTMessageView4777 = new BitSet(new long[]{0x0000000000004072L});
    public static final BitSet FOLLOW_14_in_ruleTMessageView4795 = new BitSet(new long[]{0x0380000000000070L});
    public static final BitSet FOLLOW_ruleTInteraction_in_ruleTMessageView4816 = new BitSet(new long[]{0x0380000000030070L});
    public static final BitSet FOLLOW_16_in_ruleTMessageView4830 = new BitSet(new long[]{0x0380000000000070L});
    public static final BitSet FOLLOW_ruleTInteraction_in_ruleTMessageView4853 = new BitSet(new long[]{0x0380000000030070L});
    public static final BitSet FOLLOW_17_in_ruleTMessageView4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAspectMessageView_in_entryRuleTAspectMessageView4905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTAspectMessageView4915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTAspectMessageView4961 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTAspectMessageView4982 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTAspectMessageView4994 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleTAspectMessageView5006 = new BitSet(new long[]{0x0000000801000070L});
    public static final BitSet FOLLOW_35_in_ruleTAspectMessageView5024 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTAspectMessageView5057 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTAspectMessageView5094 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleTAspectMessageView5106 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTAspectMessageView5126 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTAspectMessageView5163 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTAspectMessageView5175 = new BitSet(new long[]{0x0000000010000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTAspectMessageView5199 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_13_in_ruleTAspectMessageView5212 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTAspectMessageView5235 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTAspectMessageView5251 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleTAspectMessageView5263 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTAspectMessageView5275 = new BitSet(new long[]{0x0380000000000070L});
    public static final BitSet FOLLOW_ruleTInteraction_in_ruleTAspectMessageView5296 = new BitSet(new long[]{0x0380000000030070L});
    public static final BitSet FOLLOW_16_in_ruleTAspectMessageView5310 = new BitSet(new long[]{0x0380000000000070L});
    public static final BitSet FOLLOW_ruleTInteraction_in_ruleTAspectMessageView5333 = new BitSet(new long[]{0x0380000000030070L});
    public static final BitSet FOLLOW_17_in_ruleTAspectMessageView5347 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTAspectMessageView5359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTLifeline_in_entryRuleTLifeline5395 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTLifeline5405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTLifeline5448 = new BitSet(new long[]{0x3800000004000000L});
    public static final BitSet FOLLOW_ruleTLifelineReferenceType_in_ruleTLifeline5483 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTLifeline5504 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTLifeline5516 = new BitSet(new long[]{0x0000000000004072L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTLifeline5539 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTLifeline5553 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleTTemporaryProperty_in_ruleTLifeline5574 = new BitSet(new long[]{0x0000000000030070L});
    public static final BitSet FOLLOW_16_in_ruleTLifeline5588 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleTTemporaryProperty_in_ruleTLifeline5611 = new BitSet(new long[]{0x0000000000030070L});
    public static final BitSet FOLLOW_17_in_ruleTLifeline5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTDummyValueSpecification_in_entryRuleTDummyValueSpecification5665 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTDummyValueSpecification5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTDummyValueSpecification5717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTTemporaryProperty_in_entryRuleTTemporaryProperty5765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTTemporaryProperty5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTReference_in_ruleTTemporaryProperty5822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTLocalAttribute_in_ruleTTemporaryProperty5849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTReference_in_entryRuleTReference5884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTReference5894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTReference5940 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTReference5952 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTReference5970 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTReference6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTLocalAttribute_in_entryRuleTLocalAttribute6043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTLocalAttribute6053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTLocalAttribute6101 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTLocalAttribute6122 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_ruleTLocalAttribute6135 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTLocalAttribute6156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTInteraction_in_entryRuleTInteraction6194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTInteraction6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTInteractionMessage_in_ruleTInteraction6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCombinedFragment_in_ruleTInteraction6278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOcurrence_in_ruleTInteraction6305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTOcurrence_in_entryRuleTOcurrence6340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTOcurrence6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTOcurrence6398 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleTOcurrence6410 = new BitSet(new long[]{0x0400000080000000L});
    public static final BitSet FOLLOW_ruleOcurrenceType_in_ruleTOcurrence6431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTInteractionMessage_in_entryRuleTInteractionMessage6467 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTInteractionMessage6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTInteractionMessage6525 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleTInteractionMessage6537 = new BitSet(new long[]{0x0000000800000070L});
    public static final BitSet FOLLOW_35_in_ruleTInteractionMessage6555 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTInteractionMessage6592 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleTInteractionMessage6605 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_ruleTAbstractMessage_in_ruleTInteractionMessage6626 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTInteractionMessage6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCombinedFragment_in_entryRuleTCombinedFragment6676 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTCombinedFragment6686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteractionOperatorKind_in_ruleTCombinedFragment6732 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleTCombinedFragment6744 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTCombinedFragment6765 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleTCombinedFragment6777 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTCombinedFragment6789 = new BitSet(new long[]{0x0380000000000070L});
    public static final BitSet FOLLOW_ruleTInteraction_in_ruleTCombinedFragment6810 = new BitSet(new long[]{0x0380000000020070L});
    public static final BitSet FOLLOW_ruleTInteraction_in_ruleTCombinedFragment6831 = new BitSet(new long[]{0x0380000000020070L});
    public static final BitSet FOLLOW_17_in_ruleTCombinedFragment6844 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_ruleTCombinedFragment6857 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTCombinedFragment6869 = new BitSet(new long[]{0x0380000000000070L});
    public static final BitSet FOLLOW_ruleTInteraction_in_ruleTCombinedFragment6890 = new BitSet(new long[]{0x0380000000020070L});
    public static final BitSet FOLLOW_ruleTInteraction_in_ruleTCombinedFragment6911 = new BitSet(new long[]{0x0380000000020070L});
    public static final BitSet FOLLOW_17_in_ruleTCombinedFragment6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTAbstractMessage_in_entryRuleTAbstractMessage6962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTAbstractMessage6972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTMessage_in_ruleTAbstractMessage7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTReturnMessage_in_ruleTAbstractMessage7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTReturnMessage_in_entryRuleTReturnMessage7081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTReturnMessage7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTReturnMessage7138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTMessage_in_entryRuleTMessage7173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTMessage7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTMessage7232 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleTMessage7244 = new BitSet(new long[]{0x0000000001000070L});
    public static final BitSet FOLLOW_24_in_ruleTMessage7264 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTMessage7301 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTMessage7313 = new BitSet(new long[]{0x0000000010000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTMessage7337 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_13_in_ruleTMessage7350 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTMessage7373 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTMessage7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVisibility7445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVisibility7462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVisibility7479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleVisibility7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleInstantiationType7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleInstantiationType7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleReferenceType7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleReferenceType7622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInteractionOperatorKind7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleInteractionOperatorKind7684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleInteractionOperatorKind7701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOcurrenceType7746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOcurrenceType7763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTLifelineReferenceType7808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleTLifelineReferenceType7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleTLifelineReferenceType7842 = new BitSet(new long[]{0x0000000000000002L});

}