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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aspect'", "'{'", "'structuralView'", "'messageViews'", "','", "'}'", "'instantiations'", "'layout'", "'stateViews'", "'StructuralView'", "'classes'", "'associations'", "'types'", "'Instantiation'", "'type'", "'externalAspect'", "'mappings'", "'Layout'", "'containers'", "'StateView'", "'specifies'", "'stateMachines'", "'Association'", "'ends'", "'('", "')'", "'abstract'", "'static'", "'partial'", "'Operation'", "'visibility'", "'returnType'", "'parameters'", "'Class'", "'superTypes'", "'operations'", "'associationEnds'", "'attributes'", "'RBoolean'", "'instanceClassName'", "'RInt'", "'RChar'", "'RString'", "'REnum'", "'literals'", "'RSet'", "'RSequence'", "'ImplementationClass'", "'RDouble'", "'RFloat'", "'true'", "'false'", "'Visibility'", "'Parameter'", "'AssociationEnd'", "'lowerBound'", "'upperBound'", "'referenceType'", "'navigable'", "'assoc'", "'Attribute'", "'-'", "'ReferenceType'", "'REnumLiteral'", "'RVoid'", "'RAny'", "'AspectMessageView'", "'affectedBy'", "'pointcut'", "'advice'", "'MessageView'", "'specification'", "'MessageViewReference'", "'references'", "'Interaction'", "'fragments'", "'lifelines'", "'messages'", "'properties'", "'formalGates'", "'Lifeline'", "'represents'", "'coveredBy'", "'localProperties'", "'Message'", "'messageSort'", "'sendEvent'", "'receiveEvent'", "'signature'", "'assignTo'", "'arguments'", "'returns'", "'Reference'", "'Gate'", "'message'", "'MessageOccurrenceSpecification'", "'covered'", "'OccurrenceSpecification'", "'DestructionOccurrenceSpecification'", "'CombinedFragment'", "'interactionOperator'", "'operands'", "'OriginalBehaviorExecution'", "'ExecutionStatement'", "'InteractionOperatorKind'", "'InteractionOperand'", "'interactionConstraint'", "'StructuralFeatureValue'", "'value'", "'ParameterValue'", "'parameter'", "'OpaqueExpression'", "'body'", "'language'", "'LiteralString'", "'LiteralInteger'", "'LiteralBoolean'", "'MessageSort'", "'ParameterValueMapping'", "'ClassifierMapping'", "'fromElement'", "'toElement'", "'operationMappings'", "'attributeMappings'", "'InstantiationType'", "'OperationMapping'", "'parameterMappings'", "'AttributeMapping'", "'ParameterMapping'", "'ContainerMap'", "'key'", "'ElementMap'", "'LayoutElement'", "'x'", "'y'", "'.'", "'E'", "'e'", "'StateMachine'", "'start'", "'states'", "'transitions'", "'substitutions'", "'State'", "'incomings'", "'outgoings'", "'Transition'", "'endState'", "'startState'", "'guard'", "'Substitution'", "'Constraint'", "'Specification'", "'TransitionSubstitution'", "'from'", "'to'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__159=159;
    public static final int T__27=27;
    public static final int T__158=158;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__160=160;
    public static final int EOF=-1;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__16=16;
    public static final int T__147=147;
    public static final int T__15=15;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__149=149;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__157=157;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=4;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__59=59;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=6;
    public static final int T__113=113;
    public static final int T__112=112;
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
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

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
            pushFollow(FollowSets000.FOLLOW_ruleAspect_in_entryRuleAspect75);
            iv_ruleAspect=ruleAspect();

            state._fsp--;

             current =iv_ruleAspect; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAspect85); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:76:1: ruleAspect returns [EObject current=null] : (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'structuralView' ( (lv_structuralView_4_0= ruleStructuralView ) ) (otherlv_5= 'messageViews' otherlv_6= '{' ( (lv_messageViews_7_0= ruleAbstractMessageView ) ) (otherlv_8= ',' ( (lv_messageViews_9_0= ruleAbstractMessageView ) ) )* otherlv_10= '}' )? (otherlv_11= 'instantiations' otherlv_12= '{' ( (lv_instantiations_13_0= ruleInstantiation ) ) (otherlv_14= ',' ( (lv_instantiations_15_0= ruleInstantiation ) ) )* otherlv_16= '}' )? (otherlv_17= 'layout' ( (lv_layout_18_0= ruleLayout ) ) )? (otherlv_19= 'stateViews' otherlv_20= '{' ( (lv_stateViews_21_0= ruleStateView ) ) (otherlv_22= ',' ( (lv_stateViews_23_0= ruleStateView ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) ;
    public final EObject ruleAspect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_structuralView_4_0 = null;

        EObject lv_messageViews_7_0 = null;

        EObject lv_messageViews_9_0 = null;

        EObject lv_instantiations_13_0 = null;

        EObject lv_instantiations_15_0 = null;

        EObject lv_layout_18_0 = null;

        EObject lv_stateViews_21_0 = null;

        EObject lv_stateViews_23_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:79:28: ( (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'structuralView' ( (lv_structuralView_4_0= ruleStructuralView ) ) (otherlv_5= 'messageViews' otherlv_6= '{' ( (lv_messageViews_7_0= ruleAbstractMessageView ) ) (otherlv_8= ',' ( (lv_messageViews_9_0= ruleAbstractMessageView ) ) )* otherlv_10= '}' )? (otherlv_11= 'instantiations' otherlv_12= '{' ( (lv_instantiations_13_0= ruleInstantiation ) ) (otherlv_14= ',' ( (lv_instantiations_15_0= ruleInstantiation ) ) )* otherlv_16= '}' )? (otherlv_17= 'layout' ( (lv_layout_18_0= ruleLayout ) ) )? (otherlv_19= 'stateViews' otherlv_20= '{' ( (lv_stateViews_21_0= ruleStateView ) ) (otherlv_22= ',' ( (lv_stateViews_23_0= ruleStateView ) ) )* otherlv_24= '}' )? otherlv_25= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:80:1: (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'structuralView' ( (lv_structuralView_4_0= ruleStructuralView ) ) (otherlv_5= 'messageViews' otherlv_6= '{' ( (lv_messageViews_7_0= ruleAbstractMessageView ) ) (otherlv_8= ',' ( (lv_messageViews_9_0= ruleAbstractMessageView ) ) )* otherlv_10= '}' )? (otherlv_11= 'instantiations' otherlv_12= '{' ( (lv_instantiations_13_0= ruleInstantiation ) ) (otherlv_14= ',' ( (lv_instantiations_15_0= ruleInstantiation ) ) )* otherlv_16= '}' )? (otherlv_17= 'layout' ( (lv_layout_18_0= ruleLayout ) ) )? (otherlv_19= 'stateViews' otherlv_20= '{' ( (lv_stateViews_21_0= ruleStateView ) ) (otherlv_22= ',' ( (lv_stateViews_23_0= ruleStateView ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:80:1: (otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'structuralView' ( (lv_structuralView_4_0= ruleStructuralView ) ) (otherlv_5= 'messageViews' otherlv_6= '{' ( (lv_messageViews_7_0= ruleAbstractMessageView ) ) (otherlv_8= ',' ( (lv_messageViews_9_0= ruleAbstractMessageView ) ) )* otherlv_10= '}' )? (otherlv_11= 'instantiations' otherlv_12= '{' ( (lv_instantiations_13_0= ruleInstantiation ) ) (otherlv_14= ',' ( (lv_instantiations_15_0= ruleInstantiation ) ) )* otherlv_16= '}' )? (otherlv_17= 'layout' ( (lv_layout_18_0= ruleLayout ) ) )? (otherlv_19= 'stateViews' otherlv_20= '{' ( (lv_stateViews_21_0= ruleStateView ) ) (otherlv_22= ',' ( (lv_stateViews_23_0= ruleStateView ) ) )* otherlv_24= '}' )? otherlv_25= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:80:3: otherlv_0= 'Aspect' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'structuralView' ( (lv_structuralView_4_0= ruleStructuralView ) ) (otherlv_5= 'messageViews' otherlv_6= '{' ( (lv_messageViews_7_0= ruleAbstractMessageView ) ) (otherlv_8= ',' ( (lv_messageViews_9_0= ruleAbstractMessageView ) ) )* otherlv_10= '}' )? (otherlv_11= 'instantiations' otherlv_12= '{' ( (lv_instantiations_13_0= ruleInstantiation ) ) (otherlv_14= ',' ( (lv_instantiations_15_0= ruleInstantiation ) ) )* otherlv_16= '}' )? (otherlv_17= 'layout' ( (lv_layout_18_0= ruleLayout ) ) )? (otherlv_19= 'stateViews' otherlv_20= '{' ( (lv_stateViews_21_0= ruleStateView ) ) (otherlv_22= ',' ( (lv_stateViews_23_0= ruleStateView ) ) )* otherlv_24= '}' )? otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleAspect122); 

                	newLeafNode(otherlv_0, grammarAccess.getAspectAccess().getAspectKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:84:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:85:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:85:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:86:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAspectAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAspect143);
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

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAspect155); 

                	newLeafNode(otherlv_2, grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleAspect167); 

                	newLeafNode(otherlv_3, grammarAccess.getAspectAccess().getStructuralViewKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:110:1: ( (lv_structuralView_4_0= ruleStructuralView ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:111:1: (lv_structuralView_4_0= ruleStructuralView )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:111:1: (lv_structuralView_4_0= ruleStructuralView )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:112:3: lv_structuralView_4_0= ruleStructuralView
            {
             
            	        newCompositeNode(grammarAccess.getAspectAccess().getStructuralViewStructuralViewParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStructuralView_in_ruleAspect188);
            lv_structuralView_4_0=ruleStructuralView();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAspectRule());
            	        }
                   		set(
                   			current, 
                   			"structuralView",
                    		lv_structuralView_4_0, 
                    		"StructuralView");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:128:2: (otherlv_5= 'messageViews' otherlv_6= '{' ( (lv_messageViews_7_0= ruleAbstractMessageView ) ) (otherlv_8= ',' ( (lv_messageViews_9_0= ruleAbstractMessageView ) ) )* otherlv_10= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:128:4: otherlv_5= 'messageViews' otherlv_6= '{' ( (lv_messageViews_7_0= ruleAbstractMessageView ) ) (otherlv_8= ',' ( (lv_messageViews_9_0= ruleAbstractMessageView ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleAspect201); 

                        	newLeafNode(otherlv_5, grammarAccess.getAspectAccess().getMessageViewsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAspect213); 

                        	newLeafNode(otherlv_6, grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:136:1: ( (lv_messageViews_7_0= ruleAbstractMessageView ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:137:1: (lv_messageViews_7_0= ruleAbstractMessageView )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:137:1: (lv_messageViews_7_0= ruleAbstractMessageView )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:138:3: lv_messageViews_7_0= ruleAbstractMessageView
                    {
                     
                    	        newCompositeNode(grammarAccess.getAspectAccess().getMessageViewsAbstractMessageViewParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAbstractMessageView_in_ruleAspect234);
                    lv_messageViews_7_0=ruleAbstractMessageView();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAspectRule());
                    	        }
                           		add(
                           			current, 
                           			"messageViews",
                            		lv_messageViews_7_0, 
                            		"AbstractMessageView");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:154:2: (otherlv_8= ',' ( (lv_messageViews_9_0= ruleAbstractMessageView ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:154:4: otherlv_8= ',' ( (lv_messageViews_9_0= ruleAbstractMessageView ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAspect247); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getAspectAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:158:1: ( (lv_messageViews_9_0= ruleAbstractMessageView ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:159:1: (lv_messageViews_9_0= ruleAbstractMessageView )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:159:1: (lv_messageViews_9_0= ruleAbstractMessageView )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:160:3: lv_messageViews_9_0= ruleAbstractMessageView
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAspectAccess().getMessageViewsAbstractMessageViewParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAbstractMessageView_in_ruleAspect268);
                    	    lv_messageViews_9_0=ruleAbstractMessageView();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAspectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"messageViews",
                    	            		lv_messageViews_9_0, 
                    	            		"AbstractMessageView");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAspect282); 

                        	newLeafNode(otherlv_10, grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:180:3: (otherlv_11= 'instantiations' otherlv_12= '{' ( (lv_instantiations_13_0= ruleInstantiation ) ) (otherlv_14= ',' ( (lv_instantiations_15_0= ruleInstantiation ) ) )* otherlv_16= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:180:5: otherlv_11= 'instantiations' otherlv_12= '{' ( (lv_instantiations_13_0= ruleInstantiation ) ) (otherlv_14= ',' ( (lv_instantiations_15_0= ruleInstantiation ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAspect297); 

                        	newLeafNode(otherlv_11, grammarAccess.getAspectAccess().getInstantiationsKeyword_6_0());
                        
                    otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAspect309); 

                        	newLeafNode(otherlv_12, grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:188:1: ( (lv_instantiations_13_0= ruleInstantiation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:189:1: (lv_instantiations_13_0= ruleInstantiation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:189:1: (lv_instantiations_13_0= ruleInstantiation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:190:3: lv_instantiations_13_0= ruleInstantiation
                    {
                     
                    	        newCompositeNode(grammarAccess.getAspectAccess().getInstantiationsInstantiationParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInstantiation_in_ruleAspect330);
                    lv_instantiations_13_0=ruleInstantiation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAspectRule());
                    	        }
                           		add(
                           			current, 
                           			"instantiations",
                            		lv_instantiations_13_0, 
                            		"Instantiation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:206:2: (otherlv_14= ',' ( (lv_instantiations_15_0= ruleInstantiation ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:206:4: otherlv_14= ',' ( (lv_instantiations_15_0= ruleInstantiation ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAspect343); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getAspectAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:210:1: ( (lv_instantiations_15_0= ruleInstantiation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:211:1: (lv_instantiations_15_0= ruleInstantiation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:211:1: (lv_instantiations_15_0= ruleInstantiation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:212:3: lv_instantiations_15_0= ruleInstantiation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAspectAccess().getInstantiationsInstantiationParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleInstantiation_in_ruleAspect364);
                    	    lv_instantiations_15_0=ruleInstantiation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAspectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"instantiations",
                    	            		lv_instantiations_15_0, 
                    	            		"Instantiation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAspect378); 

                        	newLeafNode(otherlv_16, grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:232:3: (otherlv_17= 'layout' ( (lv_layout_18_0= ruleLayout ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:232:5: otherlv_17= 'layout' ( (lv_layout_18_0= ruleLayout ) )
                    {
                    otherlv_17=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAspect393); 

                        	newLeafNode(otherlv_17, grammarAccess.getAspectAccess().getLayoutKeyword_7_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:236:1: ( (lv_layout_18_0= ruleLayout ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:237:1: (lv_layout_18_0= ruleLayout )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:237:1: (lv_layout_18_0= ruleLayout )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:238:3: lv_layout_18_0= ruleLayout
                    {
                     
                    	        newCompositeNode(grammarAccess.getAspectAccess().getLayoutLayoutParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleLayout_in_ruleAspect414);
                    lv_layout_18_0=ruleLayout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAspectRule());
                    	        }
                           		set(
                           			current, 
                           			"layout",
                            		lv_layout_18_0, 
                            		"Layout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:254:4: (otherlv_19= 'stateViews' otherlv_20= '{' ( (lv_stateViews_21_0= ruleStateView ) ) (otherlv_22= ',' ( (lv_stateViews_23_0= ruleStateView ) ) )* otherlv_24= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:254:6: otherlv_19= 'stateViews' otherlv_20= '{' ( (lv_stateViews_21_0= ruleStateView ) ) (otherlv_22= ',' ( (lv_stateViews_23_0= ruleStateView ) ) )* otherlv_24= '}'
                    {
                    otherlv_19=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAspect429); 

                        	newLeafNode(otherlv_19, grammarAccess.getAspectAccess().getStateViewsKeyword_8_0());
                        
                    otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAspect441); 

                        	newLeafNode(otherlv_20, grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:262:1: ( (lv_stateViews_21_0= ruleStateView ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:263:1: (lv_stateViews_21_0= ruleStateView )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:263:1: (lv_stateViews_21_0= ruleStateView )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:264:3: lv_stateViews_21_0= ruleStateView
                    {
                     
                    	        newCompositeNode(grammarAccess.getAspectAccess().getStateViewsStateViewParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleStateView_in_ruleAspect462);
                    lv_stateViews_21_0=ruleStateView();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAspectRule());
                    	        }
                           		add(
                           			current, 
                           			"stateViews",
                            		lv_stateViews_21_0, 
                            		"StateView");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:280:2: (otherlv_22= ',' ( (lv_stateViews_23_0= ruleStateView ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:280:4: otherlv_22= ',' ( (lv_stateViews_23_0= ruleStateView ) )
                    	    {
                    	    otherlv_22=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAspect475); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getAspectAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:284:1: ( (lv_stateViews_23_0= ruleStateView ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:285:1: (lv_stateViews_23_0= ruleStateView )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:285:1: (lv_stateViews_23_0= ruleStateView )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:286:3: lv_stateViews_23_0= ruleStateView
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAspectAccess().getStateViewsStateViewParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleStateView_in_ruleAspect496);
                    	    lv_stateViews_23_0=ruleStateView();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAspectRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"stateViews",
                    	            		lv_stateViews_23_0, 
                    	            		"StateView");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAspect510); 

                        	newLeafNode(otherlv_24, grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            otherlv_25=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAspect524); 

                	newLeafNode(otherlv_25, grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_9());
                

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


    // $ANTLR start "entryRuleAbstractMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:318:1: entryRuleAbstractMessageView returns [EObject current=null] : iv_ruleAbstractMessageView= ruleAbstractMessageView EOF ;
    public final EObject entryRuleAbstractMessageView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractMessageView = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:319:2: (iv_ruleAbstractMessageView= ruleAbstractMessageView EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:320:2: iv_ruleAbstractMessageView= ruleAbstractMessageView EOF
            {
             newCompositeNode(grammarAccess.getAbstractMessageViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAbstractMessageView_in_entryRuleAbstractMessageView560);
            iv_ruleAbstractMessageView=ruleAbstractMessageView();

            state._fsp--;

             current =iv_ruleAbstractMessageView; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAbstractMessageView570); 

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
    // $ANTLR end "entryRuleAbstractMessageView"


    // $ANTLR start "ruleAbstractMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:327:1: ruleAbstractMessageView returns [EObject current=null] : (this_MessageView_0= ruleMessageView | this_MessageViewReference_1= ruleMessageViewReference | this_AspectMessageView_2= ruleAspectMessageView ) ;
    public final EObject ruleAbstractMessageView() throws RecognitionException {
        EObject current = null;

        EObject this_MessageView_0 = null;

        EObject this_MessageViewReference_1 = null;

        EObject this_AspectMessageView_2 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:330:28: ( (this_MessageView_0= ruleMessageView | this_MessageViewReference_1= ruleMessageViewReference | this_AspectMessageView_2= ruleAspectMessageView ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:331:1: (this_MessageView_0= ruleMessageView | this_MessageViewReference_1= ruleMessageViewReference | this_AspectMessageView_2= ruleAspectMessageView )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:331:1: (this_MessageView_0= ruleMessageView | this_MessageViewReference_1= ruleMessageViewReference | this_AspectMessageView_2= ruleAspectMessageView )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt8=1;
                }
                break;
            case 83:
                {
                alt8=2;
                }
                break;
            case 77:
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
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:332:5: this_MessageView_0= ruleMessageView
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMessageViewAccess().getMessageViewParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageView_in_ruleAbstractMessageView617);
                    this_MessageView_0=ruleMessageView();

                    state._fsp--;

                     
                            current = this_MessageView_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:342:5: this_MessageViewReference_1= ruleMessageViewReference
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMessageViewAccess().getMessageViewReferenceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageViewReference_in_ruleAbstractMessageView644);
                    this_MessageViewReference_1=ruleMessageViewReference();

                    state._fsp--;

                     
                            current = this_MessageViewReference_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:352:5: this_AspectMessageView_2= ruleAspectMessageView
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractMessageViewAccess().getAspectMessageViewParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAspectMessageView_in_ruleAbstractMessageView671);
                    this_AspectMessageView_2=ruleAspectMessageView();

                    state._fsp--;

                     
                            current = this_AspectMessageView_2; 
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
    // $ANTLR end "ruleAbstractMessageView"


    // $ANTLR start "entryRuleClassifier"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:368:1: entryRuleClassifier returns [EObject current=null] : iv_ruleClassifier= ruleClassifier EOF ;
    public final EObject entryRuleClassifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifier = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:369:2: (iv_ruleClassifier= ruleClassifier EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:370:2: iv_ruleClassifier= ruleClassifier EOF
            {
             newCompositeNode(grammarAccess.getClassifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_entryRuleClassifier706);
            iv_ruleClassifier=ruleClassifier();

            state._fsp--;

             current =iv_ruleClassifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassifier716); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:377:1: ruleClassifier returns [EObject current=null] : (this_Class_0= ruleClass | this_RBoolean_1= ruleRBoolean | this_RInt_2= ruleRInt | this_RChar_3= ruleRChar | this_RString_4= ruleRString | this_REnum_5= ruleREnum | this_RSet_6= ruleRSet | this_RSequence_7= ruleRSequence | this_ImplementationClass_Impl_8= ruleImplementationClass_Impl | this_RDouble_9= ruleRDouble | this_RFloat_10= ruleRFloat ) ;
    public final EObject ruleClassifier() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_RBoolean_1 = null;

        EObject this_RInt_2 = null;

        EObject this_RChar_3 = null;

        EObject this_RString_4 = null;

        EObject this_REnum_5 = null;

        EObject this_RSet_6 = null;

        EObject this_RSequence_7 = null;

        EObject this_ImplementationClass_Impl_8 = null;

        EObject this_RDouble_9 = null;

        EObject this_RFloat_10 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:380:28: ( (this_Class_0= ruleClass | this_RBoolean_1= ruleRBoolean | this_RInt_2= ruleRInt | this_RChar_3= ruleRChar | this_RString_4= ruleRString | this_REnum_5= ruleREnum | this_RSet_6= ruleRSet | this_RSequence_7= ruleRSequence | this_ImplementationClass_Impl_8= ruleImplementationClass_Impl | this_RDouble_9= ruleRDouble | this_RFloat_10= ruleRFloat ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:381:1: (this_Class_0= ruleClass | this_RBoolean_1= ruleRBoolean | this_RInt_2= ruleRInt | this_RChar_3= ruleRChar | this_RString_4= ruleRString | this_REnum_5= ruleREnum | this_RSet_6= ruleRSet | this_RSequence_7= ruleRSequence | this_ImplementationClass_Impl_8= ruleImplementationClass_Impl | this_RDouble_9= ruleRDouble | this_RFloat_10= ruleRFloat )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:381:1: (this_Class_0= ruleClass | this_RBoolean_1= ruleRBoolean | this_RInt_2= ruleRInt | this_RChar_3= ruleRChar | this_RString_4= ruleRString | this_REnum_5= ruleREnum | this_RSet_6= ruleRSet | this_RSequence_7= ruleRSequence | this_ImplementationClass_Impl_8= ruleImplementationClass_Impl | this_RDouble_9= ruleRDouble | this_RFloat_10= ruleRFloat )
            int alt9=11;
            switch ( input.LA(1) ) {
            case 37:
            case 39:
            case 44:
                {
                alt9=1;
                }
                break;
            case 49:
                {
                alt9=2;
                }
                break;
            case 51:
                {
                alt9=3;
                }
                break;
            case 52:
                {
                alt9=4;
                }
                break;
            case 53:
                {
                alt9=5;
                }
                break;
            case 54:
                {
                alt9=6;
                }
                break;
            case 56:
                {
                alt9=7;
                }
                break;
            case 57:
                {
                alt9=8;
                }
                break;
            case 58:
                {
                alt9=9;
                }
                break;
            case 59:
                {
                alt9=10;
                }
                break;
            case 60:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:382:5: this_Class_0= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClass_in_ruleClassifier763);
                    this_Class_0=ruleClass();

                    state._fsp--;

                     
                            current = this_Class_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:392:5: this_RBoolean_1= ruleRBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getRBooleanParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRBoolean_in_ruleClassifier790);
                    this_RBoolean_1=ruleRBoolean();

                    state._fsp--;

                     
                            current = this_RBoolean_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:402:5: this_RInt_2= ruleRInt
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getRIntParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRInt_in_ruleClassifier817);
                    this_RInt_2=ruleRInt();

                    state._fsp--;

                     
                            current = this_RInt_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:412:5: this_RChar_3= ruleRChar
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getRCharParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRChar_in_ruleClassifier844);
                    this_RChar_3=ruleRChar();

                    state._fsp--;

                     
                            current = this_RChar_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:422:5: this_RString_4= ruleRString
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getRStringParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRString_in_ruleClassifier871);
                    this_RString_4=ruleRString();

                    state._fsp--;

                     
                            current = this_RString_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:432:5: this_REnum_5= ruleREnum
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getREnumParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleREnum_in_ruleClassifier898);
                    this_REnum_5=ruleREnum();

                    state._fsp--;

                     
                            current = this_REnum_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:442:5: this_RSet_6= ruleRSet
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getRSetParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRSet_in_ruleClassifier925);
                    this_RSet_6=ruleRSet();

                    state._fsp--;

                     
                            current = this_RSet_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:452:5: this_RSequence_7= ruleRSequence
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getRSequenceParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRSequence_in_ruleClassifier952);
                    this_RSequence_7=ruleRSequence();

                    state._fsp--;

                     
                            current = this_RSequence_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:462:5: this_ImplementationClass_Impl_8= ruleImplementationClass_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getImplementationClass_ImplParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImplementationClass_Impl_in_ruleClassifier979);
                    this_ImplementationClass_Impl_8=ruleImplementationClass_Impl();

                    state._fsp--;

                     
                            current = this_ImplementationClass_Impl_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:472:5: this_RDouble_9= ruleRDouble
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getRDoubleParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRDouble_in_ruleClassifier1006);
                    this_RDouble_9=ruleRDouble();

                    state._fsp--;

                     
                            current = this_RDouble_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:482:5: this_RFloat_10= ruleRFloat
                    {
                     
                            newCompositeNode(grammarAccess.getClassifierAccess().getRFloatParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRFloat_in_ruleClassifier1033);
                    this_RFloat_10=ruleRFloat();

                    state._fsp--;

                     
                            current = this_RFloat_10; 
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
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleType"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:498:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:499:2: (iv_ruleType= ruleType EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:500:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleType_in_entryRuleType1068);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleType1078); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:507:1: ruleType returns [EObject current=null] : (this_Class_0= ruleClass | this_RVoid_1= ruleRVoid | this_RBoolean_2= ruleRBoolean | this_RInt_3= ruleRInt | this_RChar_4= ruleRChar | this_RString_5= ruleRString | this_RAny_6= ruleRAny | this_REnum_7= ruleREnum | this_RSet_8= ruleRSet | this_RSequence_9= ruleRSequence | this_ImplementationClass_Impl_10= ruleImplementationClass_Impl | this_RDouble_11= ruleRDouble | this_RFloat_12= ruleRFloat ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Class_0 = null;

        EObject this_RVoid_1 = null;

        EObject this_RBoolean_2 = null;

        EObject this_RInt_3 = null;

        EObject this_RChar_4 = null;

        EObject this_RString_5 = null;

        EObject this_RAny_6 = null;

        EObject this_REnum_7 = null;

        EObject this_RSet_8 = null;

        EObject this_RSequence_9 = null;

        EObject this_ImplementationClass_Impl_10 = null;

        EObject this_RDouble_11 = null;

        EObject this_RFloat_12 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:510:28: ( (this_Class_0= ruleClass | this_RVoid_1= ruleRVoid | this_RBoolean_2= ruleRBoolean | this_RInt_3= ruleRInt | this_RChar_4= ruleRChar | this_RString_5= ruleRString | this_RAny_6= ruleRAny | this_REnum_7= ruleREnum | this_RSet_8= ruleRSet | this_RSequence_9= ruleRSequence | this_ImplementationClass_Impl_10= ruleImplementationClass_Impl | this_RDouble_11= ruleRDouble | this_RFloat_12= ruleRFloat ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:511:1: (this_Class_0= ruleClass | this_RVoid_1= ruleRVoid | this_RBoolean_2= ruleRBoolean | this_RInt_3= ruleRInt | this_RChar_4= ruleRChar | this_RString_5= ruleRString | this_RAny_6= ruleRAny | this_REnum_7= ruleREnum | this_RSet_8= ruleRSet | this_RSequence_9= ruleRSequence | this_ImplementationClass_Impl_10= ruleImplementationClass_Impl | this_RDouble_11= ruleRDouble | this_RFloat_12= ruleRFloat )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:511:1: (this_Class_0= ruleClass | this_RVoid_1= ruleRVoid | this_RBoolean_2= ruleRBoolean | this_RInt_3= ruleRInt | this_RChar_4= ruleRChar | this_RString_5= ruleRString | this_RAny_6= ruleRAny | this_REnum_7= ruleREnum | this_RSet_8= ruleRSet | this_RSequence_9= ruleRSequence | this_ImplementationClass_Impl_10= ruleImplementationClass_Impl | this_RDouble_11= ruleRDouble | this_RFloat_12= ruleRFloat )
            int alt10=13;
            switch ( input.LA(1) ) {
            case 37:
            case 39:
            case 44:
                {
                alt10=1;
                }
                break;
            case 75:
                {
                alt10=2;
                }
                break;
            case 49:
                {
                alt10=3;
                }
                break;
            case 51:
                {
                alt10=4;
                }
                break;
            case 52:
                {
                alt10=5;
                }
                break;
            case 53:
                {
                alt10=6;
                }
                break;
            case 76:
                {
                alt10=7;
                }
                break;
            case 54:
                {
                alt10=8;
                }
                break;
            case 56:
                {
                alt10=9;
                }
                break;
            case 57:
                {
                alt10=10;
                }
                break;
            case 58:
                {
                alt10=11;
                }
                break;
            case 59:
                {
                alt10=12;
                }
                break;
            case 60:
                {
                alt10=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:512:5: this_Class_0= ruleClass
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getClassParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleClass_in_ruleType1125);
                    this_Class_0=ruleClass();

                    state._fsp--;

                     
                            current = this_Class_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:522:5: this_RVoid_1= ruleRVoid
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRVoidParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRVoid_in_ruleType1152);
                    this_RVoid_1=ruleRVoid();

                    state._fsp--;

                     
                            current = this_RVoid_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:532:5: this_RBoolean_2= ruleRBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRBooleanParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRBoolean_in_ruleType1179);
                    this_RBoolean_2=ruleRBoolean();

                    state._fsp--;

                     
                            current = this_RBoolean_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:542:5: this_RInt_3= ruleRInt
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRIntParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRInt_in_ruleType1206);
                    this_RInt_3=ruleRInt();

                    state._fsp--;

                     
                            current = this_RInt_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:552:5: this_RChar_4= ruleRChar
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRCharParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRChar_in_ruleType1233);
                    this_RChar_4=ruleRChar();

                    state._fsp--;

                     
                            current = this_RChar_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:562:5: this_RString_5= ruleRString
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRStringParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRString_in_ruleType1260);
                    this_RString_5=ruleRString();

                    state._fsp--;

                     
                            current = this_RString_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:572:5: this_RAny_6= ruleRAny
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRAnyParserRuleCall_6()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRAny_in_ruleType1287);
                    this_RAny_6=ruleRAny();

                    state._fsp--;

                     
                            current = this_RAny_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:582:5: this_REnum_7= ruleREnum
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getREnumParserRuleCall_7()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleREnum_in_ruleType1314);
                    this_REnum_7=ruleREnum();

                    state._fsp--;

                     
                            current = this_REnum_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:592:5: this_RSet_8= ruleRSet
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRSetParserRuleCall_8()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRSet_in_ruleType1341);
                    this_RSet_8=ruleRSet();

                    state._fsp--;

                     
                            current = this_RSet_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:602:5: this_RSequence_9= ruleRSequence
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRSequenceParserRuleCall_9()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRSequence_in_ruleType1368);
                    this_RSequence_9=ruleRSequence();

                    state._fsp--;

                     
                            current = this_RSequence_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:612:5: this_ImplementationClass_Impl_10= ruleImplementationClass_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getImplementationClass_ImplParserRuleCall_10()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleImplementationClass_Impl_in_ruleType1395);
                    this_ImplementationClass_Impl_10=ruleImplementationClass_Impl();

                    state._fsp--;

                     
                            current = this_ImplementationClass_Impl_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:622:5: this_RDouble_11= ruleRDouble
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRDoubleParserRuleCall_11()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRDouble_in_ruleType1422);
                    this_RDouble_11=ruleRDouble();

                    state._fsp--;

                     
                            current = this_RDouble_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:632:5: this_RFloat_12= ruleRFloat
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRFloatParserRuleCall_12()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRFloat_in_ruleType1449);
                    this_RFloat_12=ruleRFloat();

                    state._fsp--;

                     
                            current = this_RFloat_12; 
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleInteractionFragment"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:652:1: entryRuleInteractionFragment returns [EObject current=null] : iv_ruleInteractionFragment= ruleInteractionFragment EOF ;
    public final EObject entryRuleInteractionFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionFragment = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:653:2: (iv_ruleInteractionFragment= ruleInteractionFragment EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:654:2: iv_ruleInteractionFragment= ruleInteractionFragment EOF
            {
             newCompositeNode(grammarAccess.getInteractionFragmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteractionFragment_in_entryRuleInteractionFragment1488);
            iv_ruleInteractionFragment=ruleInteractionFragment();

            state._fsp--;

             current =iv_ruleInteractionFragment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteractionFragment1498); 

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
    // $ANTLR end "entryRuleInteractionFragment"


    // $ANTLR start "ruleInteractionFragment"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:661:1: ruleInteractionFragment returns [EObject current=null] : (this_MessageOccurrenceSpecification_Impl_0= ruleMessageOccurrenceSpecification_Impl | this_OccurrenceSpecification_Impl_1= ruleOccurrenceSpecification_Impl | this_DestructionOccurrenceSpecification_2= ruleDestructionOccurrenceSpecification | this_CombinedFragment_3= ruleCombinedFragment | this_OriginalBehaviorExecution_4= ruleOriginalBehaviorExecution | this_ExecutionStatement_5= ruleExecutionStatement ) ;
    public final EObject ruleInteractionFragment() throws RecognitionException {
        EObject current = null;

        EObject this_MessageOccurrenceSpecification_Impl_0 = null;

        EObject this_OccurrenceSpecification_Impl_1 = null;

        EObject this_DestructionOccurrenceSpecification_2 = null;

        EObject this_CombinedFragment_3 = null;

        EObject this_OriginalBehaviorExecution_4 = null;

        EObject this_ExecutionStatement_5 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:664:28: ( (this_MessageOccurrenceSpecification_Impl_0= ruleMessageOccurrenceSpecification_Impl | this_OccurrenceSpecification_Impl_1= ruleOccurrenceSpecification_Impl | this_DestructionOccurrenceSpecification_2= ruleDestructionOccurrenceSpecification | this_CombinedFragment_3= ruleCombinedFragment | this_OriginalBehaviorExecution_4= ruleOriginalBehaviorExecution | this_ExecutionStatement_5= ruleExecutionStatement ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:665:1: (this_MessageOccurrenceSpecification_Impl_0= ruleMessageOccurrenceSpecification_Impl | this_OccurrenceSpecification_Impl_1= ruleOccurrenceSpecification_Impl | this_DestructionOccurrenceSpecification_2= ruleDestructionOccurrenceSpecification | this_CombinedFragment_3= ruleCombinedFragment | this_OriginalBehaviorExecution_4= ruleOriginalBehaviorExecution | this_ExecutionStatement_5= ruleExecutionStatement )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:665:1: (this_MessageOccurrenceSpecification_Impl_0= ruleMessageOccurrenceSpecification_Impl | this_OccurrenceSpecification_Impl_1= ruleOccurrenceSpecification_Impl | this_DestructionOccurrenceSpecification_2= ruleDestructionOccurrenceSpecification | this_CombinedFragment_3= ruleCombinedFragment | this_OriginalBehaviorExecution_4= ruleOriginalBehaviorExecution | this_ExecutionStatement_5= ruleExecutionStatement )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt11=1;
                }
                break;
            case 108:
                {
                alt11=2;
                }
                break;
            case 109:
                {
                alt11=3;
                }
                break;
            case 110:
                {
                alt11=4;
                }
                break;
            case 113:
                {
                alt11=5;
                }
                break;
            case 114:
                {
                alt11=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:666:5: this_MessageOccurrenceSpecification_Impl_0= ruleMessageOccurrenceSpecification_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionFragmentAccess().getMessageOccurrenceSpecification_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleMessageOccurrenceSpecification_Impl_in_ruleInteractionFragment1545);
                    this_MessageOccurrenceSpecification_Impl_0=ruleMessageOccurrenceSpecification_Impl();

                    state._fsp--;

                     
                            current = this_MessageOccurrenceSpecification_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:676:5: this_OccurrenceSpecification_Impl_1= ruleOccurrenceSpecification_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionFragmentAccess().getOccurrenceSpecification_ImplParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOccurrenceSpecification_Impl_in_ruleInteractionFragment1572);
                    this_OccurrenceSpecification_Impl_1=ruleOccurrenceSpecification_Impl();

                    state._fsp--;

                     
                            current = this_OccurrenceSpecification_Impl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:686:5: this_DestructionOccurrenceSpecification_2= ruleDestructionOccurrenceSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionFragmentAccess().getDestructionOccurrenceSpecificationParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDestructionOccurrenceSpecification_in_ruleInteractionFragment1599);
                    this_DestructionOccurrenceSpecification_2=ruleDestructionOccurrenceSpecification();

                    state._fsp--;

                     
                            current = this_DestructionOccurrenceSpecification_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:696:5: this_CombinedFragment_3= ruleCombinedFragment
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionFragmentAccess().getCombinedFragmentParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleCombinedFragment_in_ruleInteractionFragment1626);
                    this_CombinedFragment_3=ruleCombinedFragment();

                    state._fsp--;

                     
                            current = this_CombinedFragment_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:706:5: this_OriginalBehaviorExecution_4= ruleOriginalBehaviorExecution
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionFragmentAccess().getOriginalBehaviorExecutionParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOriginalBehaviorExecution_in_ruleInteractionFragment1653);
                    this_OriginalBehaviorExecution_4=ruleOriginalBehaviorExecution();

                    state._fsp--;

                     
                            current = this_OriginalBehaviorExecution_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:716:5: this_ExecutionStatement_5= ruleExecutionStatement
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionFragmentAccess().getExecutionStatementParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleExecutionStatement_in_ruleInteractionFragment1680);
                    this_ExecutionStatement_5=ruleExecutionStatement();

                    state._fsp--;

                     
                            current = this_ExecutionStatement_5; 
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
    // $ANTLR end "ruleInteractionFragment"


    // $ANTLR start "entryRuleTemporaryProperty"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:734:1: entryRuleTemporaryProperty returns [EObject current=null] : iv_ruleTemporaryProperty= ruleTemporaryProperty EOF ;
    public final EObject entryRuleTemporaryProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporaryProperty = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:735:2: (iv_ruleTemporaryProperty= ruleTemporaryProperty EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:736:2: iv_ruleTemporaryProperty= ruleTemporaryProperty EOF
            {
             newCompositeNode(grammarAccess.getTemporaryPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTemporaryProperty_in_entryRuleTemporaryProperty1717);
            iv_ruleTemporaryProperty=ruleTemporaryProperty();

            state._fsp--;

             current =iv_ruleTemporaryProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTemporaryProperty1727); 

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
    // $ANTLR end "entryRuleTemporaryProperty"


    // $ANTLR start "ruleTemporaryProperty"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:743:1: ruleTemporaryProperty returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) ;
    public final EObject ruleTemporaryProperty() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Reference_1 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:746:28: ( (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:747:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:747:1: (this_Attribute_0= ruleAttribute | this_Reference_1= ruleReference )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==38) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==103) ) {
                    alt12=2;
                }
                else if ( (LA12_1==71) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:748:5: this_Attribute_0= ruleAttribute
                    {
                     
                            newCompositeNode(grammarAccess.getTemporaryPropertyAccess().getAttributeParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleTemporaryProperty1774);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;

                     
                            current = this_Attribute_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:758:5: this_Reference_1= ruleReference
                    {
                     
                            newCompositeNode(grammarAccess.getTemporaryPropertyAccess().getReferenceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleReference_in_ruleTemporaryProperty1801);
                    this_Reference_1=ruleReference();

                    state._fsp--;

                     
                            current = this_Reference_1; 
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
    // $ANTLR end "ruleTemporaryProperty"


    // $ANTLR start "entryRuleValueSpecification"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:778:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:779:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:780:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
             newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification1840);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;

             current =iv_ruleValueSpecification; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValueSpecification1850); 

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
    // $ANTLR end "entryRuleValueSpecification"


    // $ANTLR start "ruleValueSpecification"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:787:1: ruleValueSpecification returns [EObject current=null] : (this_StructuralFeatureValue_0= ruleStructuralFeatureValue | this_ParameterValue_1= ruleParameterValue | this_OpaqueExpression_2= ruleOpaqueExpression | this_LiteralString_3= ruleLiteralString | this_LiteralInteger_4= ruleLiteralInteger | this_LiteralBoolean_5= ruleLiteralBoolean ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_StructuralFeatureValue_0 = null;

        EObject this_ParameterValue_1 = null;

        EObject this_OpaqueExpression_2 = null;

        EObject this_LiteralString_3 = null;

        EObject this_LiteralInteger_4 = null;

        EObject this_LiteralBoolean_5 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:790:28: ( (this_StructuralFeatureValue_0= ruleStructuralFeatureValue | this_ParameterValue_1= ruleParameterValue | this_OpaqueExpression_2= ruleOpaqueExpression | this_LiteralString_3= ruleLiteralString | this_LiteralInteger_4= ruleLiteralInteger | this_LiteralBoolean_5= ruleLiteralBoolean ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:791:1: (this_StructuralFeatureValue_0= ruleStructuralFeatureValue | this_ParameterValue_1= ruleParameterValue | this_OpaqueExpression_2= ruleOpaqueExpression | this_LiteralString_3= ruleLiteralString | this_LiteralInteger_4= ruleLiteralInteger | this_LiteralBoolean_5= ruleLiteralBoolean )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:791:1: (this_StructuralFeatureValue_0= ruleStructuralFeatureValue | this_ParameterValue_1= ruleParameterValue | this_OpaqueExpression_2= ruleOpaqueExpression | this_LiteralString_3= ruleLiteralString | this_LiteralInteger_4= ruleLiteralInteger | this_LiteralBoolean_5= ruleLiteralBoolean )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt13=1;
                }
                break;
            case 120:
                {
                alt13=2;
                }
                break;
            case 122:
                {
                alt13=3;
                }
                break;
            case 125:
                {
                alt13=4;
                }
                break;
            case 126:
                {
                alt13=5;
                }
                break;
            case 119:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:792:5: this_StructuralFeatureValue_0= ruleStructuralFeatureValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getStructuralFeatureValueParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleStructuralFeatureValue_in_ruleValueSpecification1897);
                    this_StructuralFeatureValue_0=ruleStructuralFeatureValue();

                    state._fsp--;

                     
                            current = this_StructuralFeatureValue_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:802:5: this_ParameterValue_1= ruleParameterValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getParameterValueParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleParameterValue_in_ruleValueSpecification1924);
                    this_ParameterValue_1=ruleParameterValue();

                    state._fsp--;

                     
                            current = this_ParameterValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:812:5: this_OpaqueExpression_2= ruleOpaqueExpression
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getOpaqueExpressionParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleOpaqueExpression_in_ruleValueSpecification1951);
                    this_OpaqueExpression_2=ruleOpaqueExpression();

                    state._fsp--;

                     
                            current = this_OpaqueExpression_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:822:5: this_LiteralString_3= ruleLiteralString
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralStringParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_ruleValueSpecification1978);
                    this_LiteralString_3=ruleLiteralString();

                    state._fsp--;

                     
                            current = this_LiteralString_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:832:5: this_LiteralInteger_4= ruleLiteralInteger
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralIntegerParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_ruleValueSpecification2005);
                    this_LiteralInteger_4=ruleLiteralInteger();

                    state._fsp--;

                     
                            current = this_LiteralInteger_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:842:5: this_LiteralBoolean_5= ruleLiteralBoolean
                    {
                     
                            newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralBooleanParserRuleCall_5()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_ruleValueSpecification2032);
                    this_LiteralBoolean_5=ruleLiteralBoolean();

                    state._fsp--;

                     
                            current = this_LiteralBoolean_5; 
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
    // $ANTLR end "ruleValueSpecification"


    // $ANTLR start "entryRuleSubstitution"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:858:1: entryRuleSubstitution returns [EObject current=null] : iv_ruleSubstitution= ruleSubstitution EOF ;
    public final EObject entryRuleSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstitution = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:859:2: (iv_ruleSubstitution= ruleSubstitution EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:860:2: iv_ruleSubstitution= ruleSubstitution EOF
            {
             newCompositeNode(grammarAccess.getSubstitutionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_entryRuleSubstitution2067);
            iv_ruleSubstitution=ruleSubstitution();

            state._fsp--;

             current =iv_ruleSubstitution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubstitution2077); 

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
    // $ANTLR end "entryRuleSubstitution"


    // $ANTLR start "ruleSubstitution"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:867:1: ruleSubstitution returns [EObject current=null] : (this_Substitution_Impl_0= ruleSubstitution_Impl | this_TransitionSubstitution_1= ruleTransitionSubstitution ) ;
    public final EObject ruleSubstitution() throws RecognitionException {
        EObject current = null;

        EObject this_Substitution_Impl_0 = null;

        EObject this_TransitionSubstitution_1 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:870:28: ( (this_Substitution_Impl_0= ruleSubstitution_Impl | this_TransitionSubstitution_1= ruleTransitionSubstitution ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:871:1: (this_Substitution_Impl_0= ruleSubstitution_Impl | this_TransitionSubstitution_1= ruleTransitionSubstitution )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:871:1: (this_Substitution_Impl_0= ruleSubstitution_Impl | this_TransitionSubstitution_1= ruleTransitionSubstitution )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==161) ) {
                alt14=1;
            }
            else if ( (LA14_0==164) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:872:5: this_Substitution_Impl_0= ruleSubstitution_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getSubstitutionAccess().getSubstitution_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSubstitution_Impl_in_ruleSubstitution2124);
                    this_Substitution_Impl_0=ruleSubstitution_Impl();

                    state._fsp--;

                     
                            current = this_Substitution_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:882:5: this_TransitionSubstitution_1= ruleTransitionSubstitution
                    {
                     
                            newCompositeNode(grammarAccess.getSubstitutionAccess().getTransitionSubstitutionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTransitionSubstitution_in_ruleSubstitution2151);
                    this_TransitionSubstitution_1=ruleTransitionSubstitution();

                    state._fsp--;

                     
                            current = this_TransitionSubstitution_1; 
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
    // $ANTLR end "ruleSubstitution"


    // $ANTLR start "entryRuleEString"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:898:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:899:2: (iv_ruleEString= ruleEString EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:900:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2187);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2198); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:907:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:910:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:911:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:911:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:911:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2238); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:919:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2264); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:934:1: entryRuleStructuralView returns [EObject current=null] : iv_ruleStructuralView= ruleStructuralView EOF ;
    public final EObject entryRuleStructuralView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralView = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:935:2: (iv_ruleStructuralView= ruleStructuralView EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:936:2: iv_ruleStructuralView= ruleStructuralView EOF
            {
             newCompositeNode(grammarAccess.getStructuralViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStructuralView_in_entryRuleStructuralView2309);
            iv_ruleStructuralView=ruleStructuralView();

            state._fsp--;

             current =iv_ruleStructuralView; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructuralView2319); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:943:1: ruleStructuralView returns [EObject current=null] : ( () otherlv_1= 'StructuralView' otherlv_2= '{' (otherlv_3= 'classes' otherlv_4= '{' ( (lv_classes_5_0= ruleClassifier ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClassifier ) ) )* otherlv_8= '}' )? (otherlv_9= 'associations' otherlv_10= '{' ( (lv_associations_11_0= ruleAssociation ) ) (otherlv_12= ',' ( (lv_associations_13_0= ruleAssociation ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleStructuralView() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_classes_5_0 = null;

        EObject lv_classes_7_0 = null;

        EObject lv_associations_11_0 = null;

        EObject lv_associations_13_0 = null;

        EObject lv_types_17_0 = null;

        EObject lv_types_19_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:946:28: ( ( () otherlv_1= 'StructuralView' otherlv_2= '{' (otherlv_3= 'classes' otherlv_4= '{' ( (lv_classes_5_0= ruleClassifier ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClassifier ) ) )* otherlv_8= '}' )? (otherlv_9= 'associations' otherlv_10= '{' ( (lv_associations_11_0= ruleAssociation ) ) (otherlv_12= ',' ( (lv_associations_13_0= ruleAssociation ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:947:1: ( () otherlv_1= 'StructuralView' otherlv_2= '{' (otherlv_3= 'classes' otherlv_4= '{' ( (lv_classes_5_0= ruleClassifier ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClassifier ) ) )* otherlv_8= '}' )? (otherlv_9= 'associations' otherlv_10= '{' ( (lv_associations_11_0= ruleAssociation ) ) (otherlv_12= ',' ( (lv_associations_13_0= ruleAssociation ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:947:1: ( () otherlv_1= 'StructuralView' otherlv_2= '{' (otherlv_3= 'classes' otherlv_4= '{' ( (lv_classes_5_0= ruleClassifier ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClassifier ) ) )* otherlv_8= '}' )? (otherlv_9= 'associations' otherlv_10= '{' ( (lv_associations_11_0= ruleAssociation ) ) (otherlv_12= ',' ( (lv_associations_13_0= ruleAssociation ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:947:2: () otherlv_1= 'StructuralView' otherlv_2= '{' (otherlv_3= 'classes' otherlv_4= '{' ( (lv_classes_5_0= ruleClassifier ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClassifier ) ) )* otherlv_8= '}' )? (otherlv_9= 'associations' otherlv_10= '{' ( (lv_associations_11_0= ruleAssociation ) ) (otherlv_12= ',' ( (lv_associations_13_0= ruleAssociation ) ) )* otherlv_14= '}' )? (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:947:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:948:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructuralViewAccess().getStructuralViewAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleStructuralView2365); 

                	newLeafNode(otherlv_1, grammarAccess.getStructuralViewAccess().getStructuralViewKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStructuralView2377); 

                	newLeafNode(otherlv_2, grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:961:1: (otherlv_3= 'classes' otherlv_4= '{' ( (lv_classes_5_0= ruleClassifier ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClassifier ) ) )* otherlv_8= '}' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:961:3: otherlv_3= 'classes' otherlv_4= '{' ( (lv_classes_5_0= ruleClassifier ) ) (otherlv_6= ',' ( (lv_classes_7_0= ruleClassifier ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleStructuralView2390); 

                        	newLeafNode(otherlv_3, grammarAccess.getStructuralViewAccess().getClassesKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStructuralView2402); 

                        	newLeafNode(otherlv_4, grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_3_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:969:1: ( (lv_classes_5_0= ruleClassifier ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:970:1: (lv_classes_5_0= ruleClassifier )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:970:1: (lv_classes_5_0= ruleClassifier )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:971:3: lv_classes_5_0= ruleClassifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructuralViewAccess().getClassesClassifierParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_ruleStructuralView2423);
                    lv_classes_5_0=ruleClassifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructuralViewRule());
                    	        }
                           		add(
                           			current, 
                           			"classes",
                            		lv_classes_5_0, 
                            		"Classifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:987:2: (otherlv_6= ',' ( (lv_classes_7_0= ruleClassifier ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==15) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:987:4: otherlv_6= ',' ( (lv_classes_7_0= ruleClassifier ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStructuralView2436); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getStructuralViewAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:991:1: ( (lv_classes_7_0= ruleClassifier ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:992:1: (lv_classes_7_0= ruleClassifier )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:992:1: (lv_classes_7_0= ruleClassifier )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:993:3: lv_classes_7_0= ruleClassifier
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructuralViewAccess().getClassesClassifierParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleClassifier_in_ruleStructuralView2457);
                    	    lv_classes_7_0=ruleClassifier();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructuralViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"classes",
                    	            		lv_classes_7_0, 
                    	            		"Classifier");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStructuralView2471); 

                        	newLeafNode(otherlv_8, grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_3_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1013:3: (otherlv_9= 'associations' otherlv_10= '{' ( (lv_associations_11_0= ruleAssociation ) ) (otherlv_12= ',' ( (lv_associations_13_0= ruleAssociation ) ) )* otherlv_14= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1013:5: otherlv_9= 'associations' otherlv_10= '{' ( (lv_associations_11_0= ruleAssociation ) ) (otherlv_12= ',' ( (lv_associations_13_0= ruleAssociation ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleStructuralView2486); 

                        	newLeafNode(otherlv_9, grammarAccess.getStructuralViewAccess().getAssociationsKeyword_4_0());
                        
                    otherlv_10=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStructuralView2498); 

                        	newLeafNode(otherlv_10, grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1021:1: ( (lv_associations_11_0= ruleAssociation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1022:1: (lv_associations_11_0= ruleAssociation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1022:1: (lv_associations_11_0= ruleAssociation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1023:3: lv_associations_11_0= ruleAssociation
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructuralViewAccess().getAssociationsAssociationParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_ruleStructuralView2519);
                    lv_associations_11_0=ruleAssociation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructuralViewRule());
                    	        }
                           		add(
                           			current, 
                           			"associations",
                            		lv_associations_11_0, 
                            		"Association");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1039:2: (otherlv_12= ',' ( (lv_associations_13_0= ruleAssociation ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==15) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1039:4: otherlv_12= ',' ( (lv_associations_13_0= ruleAssociation ) )
                    	    {
                    	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStructuralView2532); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getStructuralViewAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1043:1: ( (lv_associations_13_0= ruleAssociation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1044:1: (lv_associations_13_0= ruleAssociation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1044:1: (lv_associations_13_0= ruleAssociation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1045:3: lv_associations_13_0= ruleAssociation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructuralViewAccess().getAssociationsAssociationParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_ruleStructuralView2553);
                    	    lv_associations_13_0=ruleAssociation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructuralViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"associations",
                    	            		lv_associations_13_0, 
                    	            		"Association");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStructuralView2567); 

                        	newLeafNode(otherlv_14, grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1065:3: (otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==23) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1065:5: otherlv_15= 'types' otherlv_16= '{' ( (lv_types_17_0= ruleType ) ) (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleStructuralView2582); 

                        	newLeafNode(otherlv_15, grammarAccess.getStructuralViewAccess().getTypesKeyword_5_0());
                        
                    otherlv_16=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStructuralView2594); 

                        	newLeafNode(otherlv_16, grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1073:1: ( (lv_types_17_0= ruleType ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1074:1: (lv_types_17_0= ruleType )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1074:1: (lv_types_17_0= ruleType )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1075:3: lv_types_17_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructuralViewAccess().getTypesTypeParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleStructuralView2615);
                    lv_types_17_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructuralViewRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_17_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1091:2: (otherlv_18= ',' ( (lv_types_19_0= ruleType ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1091:4: otherlv_18= ',' ( (lv_types_19_0= ruleType ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStructuralView2628); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getStructuralViewAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1095:1: ( (lv_types_19_0= ruleType ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1096:1: (lv_types_19_0= ruleType )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1096:1: (lv_types_19_0= ruleType )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1097:3: lv_types_19_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructuralViewAccess().getTypesTypeParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleType_in_ruleStructuralView2649);
                    	    lv_types_19_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructuralViewRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_19_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStructuralView2663); 

                        	newLeafNode(otherlv_20, grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStructuralView2677); 

                	newLeafNode(otherlv_21, grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_6());
                

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


    // $ANTLR start "entryRuleInstantiation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1129:1: entryRuleInstantiation returns [EObject current=null] : iv_ruleInstantiation= ruleInstantiation EOF ;
    public final EObject entryRuleInstantiation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiation = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1130:2: (iv_ruleInstantiation= ruleInstantiation EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1131:2: iv_ruleInstantiation= ruleInstantiation EOF
            {
             newCompositeNode(grammarAccess.getInstantiationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInstantiation_in_entryRuleInstantiation2713);
            iv_ruleInstantiation=ruleInstantiation();

            state._fsp--;

             current =iv_ruleInstantiation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInstantiation2723); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1138:1: ruleInstantiation returns [EObject current=null] : (otherlv_0= 'Instantiation' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleInstantiationType ) ) otherlv_4= 'externalAspect' ( ( ruleEString ) ) (otherlv_6= 'mappings' otherlv_7= '{' ( (lv_mappings_8_0= ruleClassifierMapping ) ) (otherlv_9= ',' ( (lv_mappings_10_0= ruleClassifierMapping ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleInstantiation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_mappings_8_0 = null;

        EObject lv_mappings_10_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1141:28: ( (otherlv_0= 'Instantiation' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleInstantiationType ) ) otherlv_4= 'externalAspect' ( ( ruleEString ) ) (otherlv_6= 'mappings' otherlv_7= '{' ( (lv_mappings_8_0= ruleClassifierMapping ) ) (otherlv_9= ',' ( (lv_mappings_10_0= ruleClassifierMapping ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1142:1: (otherlv_0= 'Instantiation' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleInstantiationType ) ) otherlv_4= 'externalAspect' ( ( ruleEString ) ) (otherlv_6= 'mappings' otherlv_7= '{' ( (lv_mappings_8_0= ruleClassifierMapping ) ) (otherlv_9= ',' ( (lv_mappings_10_0= ruleClassifierMapping ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1142:1: (otherlv_0= 'Instantiation' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleInstantiationType ) ) otherlv_4= 'externalAspect' ( ( ruleEString ) ) (otherlv_6= 'mappings' otherlv_7= '{' ( (lv_mappings_8_0= ruleClassifierMapping ) ) (otherlv_9= ',' ( (lv_mappings_10_0= ruleClassifierMapping ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1142:3: otherlv_0= 'Instantiation' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleInstantiationType ) ) otherlv_4= 'externalAspect' ( ( ruleEString ) ) (otherlv_6= 'mappings' otherlv_7= '{' ( (lv_mappings_8_0= ruleClassifierMapping ) ) (otherlv_9= ',' ( (lv_mappings_10_0= ruleClassifierMapping ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleInstantiation2760); 

                	newLeafNode(otherlv_0, grammarAccess.getInstantiationAccess().getInstantiationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInstantiation2772); 

                	newLeafNode(otherlv_1, grammarAccess.getInstantiationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleInstantiation2784); 

                	newLeafNode(otherlv_2, grammarAccess.getInstantiationAccess().getTypeKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1154:1: ( (lv_type_3_0= ruleInstantiationType ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1155:1: (lv_type_3_0= ruleInstantiationType )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1155:1: (lv_type_3_0= ruleInstantiationType )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1156:3: lv_type_3_0= ruleInstantiationType
            {
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getTypeInstantiationTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInstantiationType_in_ruleInstantiation2805);
            lv_type_3_0=ruleInstantiationType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"InstantiationType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleInstantiation2817); 

                	newLeafNode(otherlv_4, grammarAccess.getInstantiationAccess().getExternalAspectKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1176:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1177:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1177:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1178:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstantiationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInstantiationAccess().getExternalAspectAspectCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleInstantiation2840);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1191:2: (otherlv_6= 'mappings' otherlv_7= '{' ( (lv_mappings_8_0= ruleClassifierMapping ) ) (otherlv_9= ',' ( (lv_mappings_10_0= ruleClassifierMapping ) ) )* otherlv_11= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1191:4: otherlv_6= 'mappings' otherlv_7= '{' ( (lv_mappings_8_0= ruleClassifierMapping ) ) (otherlv_9= ',' ( (lv_mappings_10_0= ruleClassifierMapping ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleInstantiation2853); 

                        	newLeafNode(otherlv_6, grammarAccess.getInstantiationAccess().getMappingsKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInstantiation2865); 

                        	newLeafNode(otherlv_7, grammarAccess.getInstantiationAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1199:1: ( (lv_mappings_8_0= ruleClassifierMapping ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1200:1: (lv_mappings_8_0= ruleClassifierMapping )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1200:1: (lv_mappings_8_0= ruleClassifierMapping )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1201:3: lv_mappings_8_0= ruleClassifierMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getInstantiationAccess().getMappingsClassifierMappingParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleClassifierMapping_in_ruleInstantiation2886);
                    lv_mappings_8_0=ruleClassifierMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
                    	        }
                           		add(
                           			current, 
                           			"mappings",
                            		lv_mappings_8_0, 
                            		"ClassifierMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1217:2: (otherlv_9= ',' ( (lv_mappings_10_0= ruleClassifierMapping ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1217:4: otherlv_9= ',' ( (lv_mappings_10_0= ruleClassifierMapping ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInstantiation2899); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getInstantiationAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1221:1: ( (lv_mappings_10_0= ruleClassifierMapping ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1222:1: (lv_mappings_10_0= ruleClassifierMapping )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1222:1: (lv_mappings_10_0= ruleClassifierMapping )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1223:3: lv_mappings_10_0= ruleClassifierMapping
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInstantiationAccess().getMappingsClassifierMappingParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleClassifierMapping_in_ruleInstantiation2920);
                    	    lv_mappings_10_0=ruleClassifierMapping();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInstantiationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"mappings",
                    	            		lv_mappings_10_0, 
                    	            		"ClassifierMapping");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInstantiation2934); 

                        	newLeafNode(otherlv_11, grammarAccess.getInstantiationAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInstantiation2948); 

                	newLeafNode(otherlv_12, grammarAccess.getInstantiationAccess().getRightCurlyBracketKeyword_7());
                

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


    // $ANTLR start "entryRuleLayout"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1255:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1256:2: (iv_ruleLayout= ruleLayout EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1257:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayout_in_entryRuleLayout2984);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayout2994); 

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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1264:1: ruleLayout returns [EObject current=null] : (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'containers' otherlv_3= '{' ( (lv_containers_4_0= ruleContainerMap ) ) (otherlv_5= ',' ( (lv_containers_6_0= ruleContainerMap ) ) )* otherlv_7= '}' otherlv_8= '}' ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_containers_4_0 = null;

        EObject lv_containers_6_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1267:28: ( (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'containers' otherlv_3= '{' ( (lv_containers_4_0= ruleContainerMap ) ) (otherlv_5= ',' ( (lv_containers_6_0= ruleContainerMap ) ) )* otherlv_7= '}' otherlv_8= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1268:1: (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'containers' otherlv_3= '{' ( (lv_containers_4_0= ruleContainerMap ) ) (otherlv_5= ',' ( (lv_containers_6_0= ruleContainerMap ) ) )* otherlv_7= '}' otherlv_8= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1268:1: (otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'containers' otherlv_3= '{' ( (lv_containers_4_0= ruleContainerMap ) ) (otherlv_5= ',' ( (lv_containers_6_0= ruleContainerMap ) ) )* otherlv_7= '}' otherlv_8= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1268:3: otherlv_0= 'Layout' otherlv_1= '{' otherlv_2= 'containers' otherlv_3= '{' ( (lv_containers_4_0= ruleContainerMap ) ) (otherlv_5= ',' ( (lv_containers_6_0= ruleContainerMap ) ) )* otherlv_7= '}' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleLayout3031); 

                	newLeafNode(otherlv_0, grammarAccess.getLayoutAccess().getLayoutKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLayout3043); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleLayout3055); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutAccess().getContainersKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLayout3067); 

                	newLeafNode(otherlv_3, grammarAccess.getLayoutAccess().getLeftCurlyBracketKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1284:1: ( (lv_containers_4_0= ruleContainerMap ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1285:1: (lv_containers_4_0= ruleContainerMap )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1285:1: (lv_containers_4_0= ruleContainerMap )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1286:3: lv_containers_4_0= ruleContainerMap
            {
             
            	        newCompositeNode(grammarAccess.getLayoutAccess().getContainersContainerMapParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContainerMap_in_ruleLayout3088);
            lv_containers_4_0=ruleContainerMap();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLayoutRule());
            	        }
                   		add(
                   			current, 
                   			"containers",
                    		lv_containers_4_0, 
                    		"ContainerMap");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1302:2: (otherlv_5= ',' ( (lv_containers_6_0= ruleContainerMap ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1302:4: otherlv_5= ',' ( (lv_containers_6_0= ruleContainerMap ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLayout3101); 

            	        	newLeafNode(otherlv_5, grammarAccess.getLayoutAccess().getCommaKeyword_5_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1306:1: ( (lv_containers_6_0= ruleContainerMap ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1307:1: (lv_containers_6_0= ruleContainerMap )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1307:1: (lv_containers_6_0= ruleContainerMap )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1308:3: lv_containers_6_0= ruleContainerMap
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLayoutAccess().getContainersContainerMapParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContainerMap_in_ruleLayout3122);
            	    lv_containers_6_0=ruleContainerMap();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLayoutRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"containers",
            	            		lv_containers_6_0, 
            	            		"ContainerMap");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLayout3136); 

                	newLeafNode(otherlv_7, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLayout3148); 

                	newLeafNode(otherlv_8, grammarAccess.getLayoutAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleStateView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1340:1: entryRuleStateView returns [EObject current=null] : iv_ruleStateView= ruleStateView EOF ;
    public final EObject entryRuleStateView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateView = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1341:2: (iv_ruleStateView= ruleStateView EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1342:2: iv_ruleStateView= ruleStateView EOF
            {
             newCompositeNode(grammarAccess.getStateViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateView_in_entryRuleStateView3184);
            iv_ruleStateView=ruleStateView();

            state._fsp--;

             current =iv_ruleStateView; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateView3194); 

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
    // $ANTLR end "entryRuleStateView"


    // $ANTLR start "ruleStateView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1349:1: ruleStateView returns [EObject current=null] : (otherlv_0= 'StateView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'specifies' ( ( ruleEString ) ) otherlv_5= 'stateMachines' otherlv_6= '{' ( (lv_stateMachines_7_0= ruleStateMachine ) ) (otherlv_8= ',' ( (lv_stateMachines_9_0= ruleStateMachine ) ) )* otherlv_10= '}' otherlv_11= '}' ) ;
    public final EObject ruleStateView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_stateMachines_7_0 = null;

        EObject lv_stateMachines_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1352:28: ( (otherlv_0= 'StateView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'specifies' ( ( ruleEString ) ) otherlv_5= 'stateMachines' otherlv_6= '{' ( (lv_stateMachines_7_0= ruleStateMachine ) ) (otherlv_8= ',' ( (lv_stateMachines_9_0= ruleStateMachine ) ) )* otherlv_10= '}' otherlv_11= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1353:1: (otherlv_0= 'StateView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'specifies' ( ( ruleEString ) ) otherlv_5= 'stateMachines' otherlv_6= '{' ( (lv_stateMachines_7_0= ruleStateMachine ) ) (otherlv_8= ',' ( (lv_stateMachines_9_0= ruleStateMachine ) ) )* otherlv_10= '}' otherlv_11= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1353:1: (otherlv_0= 'StateView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'specifies' ( ( ruleEString ) ) otherlv_5= 'stateMachines' otherlv_6= '{' ( (lv_stateMachines_7_0= ruleStateMachine ) ) (otherlv_8= ',' ( (lv_stateMachines_9_0= ruleStateMachine ) ) )* otherlv_10= '}' otherlv_11= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1353:3: otherlv_0= 'StateView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'specifies' ( ( ruleEString ) ) otherlv_5= 'stateMachines' otherlv_6= '{' ( (lv_stateMachines_7_0= ruleStateMachine ) ) (otherlv_8= ',' ( (lv_stateMachines_9_0= ruleStateMachine ) ) )* otherlv_10= '}' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleStateView3231); 

                	newLeafNode(otherlv_0, grammarAccess.getStateViewAccess().getStateViewKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1357:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1358:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1358:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1359:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateViewAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateView3252);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateViewRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateView3264); 

                	newLeafNode(otherlv_2, grammarAccess.getStateViewAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleStateView3276); 

                	newLeafNode(otherlv_3, grammarAccess.getStateViewAccess().getSpecifiesKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1383:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1384:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1384:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1385:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStateViewAccess().getSpecifiesClassifierCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateView3299);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleStateView3311); 

                	newLeafNode(otherlv_5, grammarAccess.getStateViewAccess().getStateMachinesKeyword_5());
                
            otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateView3323); 

                	newLeafNode(otherlv_6, grammarAccess.getStateViewAccess().getLeftCurlyBracketKeyword_6());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1406:1: ( (lv_stateMachines_7_0= ruleStateMachine ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1407:1: (lv_stateMachines_7_0= ruleStateMachine )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1407:1: (lv_stateMachines_7_0= ruleStateMachine )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1408:3: lv_stateMachines_7_0= ruleStateMachine
            {
             
            	        newCompositeNode(grammarAccess.getStateViewAccess().getStateMachinesStateMachineParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleStateView3344);
            lv_stateMachines_7_0=ruleStateMachine();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateViewRule());
            	        }
                   		add(
                   			current, 
                   			"stateMachines",
                    		lv_stateMachines_7_0, 
                    		"StateMachine");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1424:2: (otherlv_8= ',' ( (lv_stateMachines_9_0= ruleStateMachine ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==15) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1424:4: otherlv_8= ',' ( (lv_stateMachines_9_0= ruleStateMachine ) )
            	    {
            	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateView3357); 

            	        	newLeafNode(otherlv_8, grammarAccess.getStateViewAccess().getCommaKeyword_8_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1428:1: ( (lv_stateMachines_9_0= ruleStateMachine ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1429:1: (lv_stateMachines_9_0= ruleStateMachine )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1429:1: (lv_stateMachines_9_0= ruleStateMachine )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1430:3: lv_stateMachines_9_0= ruleStateMachine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateViewAccess().getStateMachinesStateMachineParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_ruleStateView3378);
            	    lv_stateMachines_9_0=ruleStateMachine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateViewRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stateMachines",
            	            		lv_stateMachines_9_0, 
            	            		"StateMachine");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateView3392); 

                	newLeafNode(otherlv_10, grammarAccess.getStateViewAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateView3404); 

                	newLeafNode(otherlv_11, grammarAccess.getStateViewAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleStateView"


    // $ANTLR start "entryRuleAssociation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1462:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1463:2: (iv_ruleAssociation= ruleAssociation EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1464:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociation_in_entryRuleAssociation3440);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociation3450); 

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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1471:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ends' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1474:28: ( (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ends' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1475:1: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ends' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1475:1: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ends' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1475:3: otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'ends' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAssociation3487); 

                	newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1479:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1480:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1480:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1481:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssociation3508);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAssociation3520); 

                	newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAssociation3532); 

                	newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getEndsKeyword_3());
                
            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAssociation3544); 

                	newLeafNode(otherlv_4, grammarAccess.getAssociationAccess().getLeftParenthesisKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1509:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1510:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1510:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1511:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssociationAccess().getEndsAssociationEndCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssociation3567);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1524:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==15) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1524:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAssociation3580); 

            	        	newLeafNode(otherlv_6, grammarAccess.getAssociationAccess().getCommaKeyword_6_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1528:1: ( ( ruleEString ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1529:1: ( ruleEString )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1529:1: ( ruleEString )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1530:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getAssociationRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getAssociationAccess().getEndsAssociationEndCrossReference_6_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssociation3603);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAssociation3617); 

                	newLeafNode(otherlv_8, grammarAccess.getAssociationAccess().getRightParenthesisKeyword_7());
                
            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssociation3629); 

                	newLeafNode(otherlv_9, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleOperation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1559:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1560:2: (iv_ruleOperation= ruleOperation EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1561:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperation_in_entryRuleOperation3665);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperation3675); 

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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1568:1: ruleOperation returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_partial_2_0= 'partial' ) )? otherlv_3= 'Operation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? otherlv_8= 'returnType' ( ( ruleEString ) ) (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token lv_static_1_0=null;
        Token lv_partial_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        AntlrDatatypeRuleToken lv_visibility_7_0 = null;

        EObject lv_parameters_12_0 = null;

        EObject lv_parameters_14_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1571:28: ( ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_partial_2_0= 'partial' ) )? otherlv_3= 'Operation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? otherlv_8= 'returnType' ( ( ruleEString ) ) (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1572:1: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_partial_2_0= 'partial' ) )? otherlv_3= 'Operation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? otherlv_8= 'returnType' ( ( ruleEString ) ) (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1572:1: ( ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_partial_2_0= 'partial' ) )? otherlv_3= 'Operation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? otherlv_8= 'returnType' ( ( ruleEString ) ) (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1572:2: ( (lv_abstract_0_0= 'abstract' ) )? ( (lv_static_1_0= 'static' ) )? ( (lv_partial_2_0= 'partial' ) )? otherlv_3= 'Operation' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )? otherlv_8= 'returnType' ( ( ruleEString ) ) (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1572:2: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1573:1: (lv_abstract_0_0= 'abstract' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1573:1: (lv_abstract_0_0= 'abstract' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1574:3: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleOperation3718); 

                            newLeafNode(lv_abstract_0_0, grammarAccess.getOperationAccess().getAbstractAbstractKeyword_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1587:3: ( (lv_static_1_0= 'static' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==38) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1588:1: (lv_static_1_0= 'static' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1588:1: (lv_static_1_0= 'static' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1589:3: lv_static_1_0= 'static'
                    {
                    lv_static_1_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleOperation3750); 

                            newLeafNode(lv_static_1_0, grammarAccess.getOperationAccess().getStaticStaticKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                           		setWithLastConsumed(current, "static", true, "static");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1602:3: ( (lv_partial_2_0= 'partial' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1603:1: (lv_partial_2_0= 'partial' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1603:1: (lv_partial_2_0= 'partial' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1604:3: lv_partial_2_0= 'partial'
                    {
                    lv_partial_2_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleOperation3782); 

                            newLeafNode(lv_partial_2_0, grammarAccess.getOperationAccess().getPartialPartialKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOperationRule());
                    	        }
                           		setWithLastConsumed(current, "partial", true, "partial");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleOperation3808); 

                	newLeafNode(otherlv_3, grammarAccess.getOperationAccess().getOperationKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1621:1: ( (lv_name_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1622:1: (lv_name_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1622:1: (lv_name_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1623:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOperationAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperation3829);
            lv_name_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOperationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperation3841); 

                	newLeafNode(otherlv_5, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1643:1: (otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1643:3: otherlv_6= 'visibility' ( (lv_visibility_7_0= ruleVisibility ) )
                    {
                    otherlv_6=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleOperation3854); 

                        	newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getVisibilityKeyword_6_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1647:1: ( (lv_visibility_7_0= ruleVisibility ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1648:1: (lv_visibility_7_0= ruleVisibility )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1648:1: (lv_visibility_7_0= ruleVisibility )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1649:3: lv_visibility_7_0= ruleVisibility
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getVisibilityVisibilityParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleVisibility_in_ruleOperation3875);
                    lv_visibility_7_0=ruleVisibility();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	        }
                           		set(
                           			current, 
                           			"visibility",
                            		lv_visibility_7_0, 
                            		"Visibility");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleOperation3889); 

                	newLeafNode(otherlv_8, grammarAccess.getOperationAccess().getReturnTypeKeyword_7());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1669:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1670:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1670:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1671:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOperationAccess().getReturnTypeTypeCrossReference_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperation3912);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1684:2: (otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1684:4: otherlv_10= 'parameters' otherlv_11= '{' ( (lv_parameters_12_0= ruleParameter ) ) (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleOperation3925); 

                        	newLeafNode(otherlv_10, grammarAccess.getOperationAccess().getParametersKeyword_9_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperation3937); 

                        	newLeafNode(otherlv_11, grammarAccess.getOperationAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1692:1: ( (lv_parameters_12_0= ruleParameter ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1693:1: (lv_parameters_12_0= ruleParameter )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1693:1: (lv_parameters_12_0= ruleParameter )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1694:3: lv_parameters_12_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleOperation3958);
                    lv_parameters_12_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_12_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1710:2: (otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==15) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1710:4: otherlv_13= ',' ( (lv_parameters_14_0= ruleParameter ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperation3971); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getOperationAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1714:1: ( (lv_parameters_14_0= ruleParameter ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1715:1: (lv_parameters_14_0= ruleParameter )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1715:1: (lv_parameters_14_0= ruleParameter )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1716:3: lv_parameters_14_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationAccess().getParametersParameterParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameter_in_ruleOperation3992);
                    	    lv_parameters_14_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_14_0, 
                    	            		"Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOperation4006); 

                        	newLeafNode(otherlv_15, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOperation4020); 

                	newLeafNode(otherlv_16, grammarAccess.getOperationAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleClass"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1748:1: entryRuleClass returns [EObject current=null] : iv_ruleClass= ruleClass EOF ;
    public final EObject entryRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClass = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1749:2: (iv_ruleClass= ruleClass EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1750:2: iv_ruleClass= ruleClass EOF
            {
             newCompositeNode(grammarAccess.getClassRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClass_in_entryRuleClass4056);
            iv_ruleClass=ruleClass();

            state._fsp--;

             current =iv_ruleClass; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClass4066); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1757:1: ruleClass returns [EObject current=null] : ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'superTypes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operations_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operations_16_0= ruleOperation ) ) )* otherlv_17= '}' )? (otherlv_18= 'associationEnds' otherlv_19= '{' ( (lv_associationEnds_20_0= ruleAssociationEnd ) ) (otherlv_21= ',' ( (lv_associationEnds_22_0= ruleAssociationEnd ) ) )* otherlv_23= '}' )? (otherlv_24= 'attributes' otherlv_25= '{' ( (lv_attributes_26_0= ruleAttribute ) ) (otherlv_27= ',' ( (lv_attributes_28_0= ruleAttribute ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) ;
    public final EObject ruleClass() throws RecognitionException {
        EObject current = null;

        Token lv_partial_1_0=null;
        Token lv_abstract_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        EObject lv_operations_14_0 = null;

        EObject lv_operations_16_0 = null;

        EObject lv_associationEnds_20_0 = null;

        EObject lv_associationEnds_22_0 = null;

        EObject lv_attributes_26_0 = null;

        EObject lv_attributes_28_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1760:28: ( ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'superTypes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operations_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operations_16_0= ruleOperation ) ) )* otherlv_17= '}' )? (otherlv_18= 'associationEnds' otherlv_19= '{' ( (lv_associationEnds_20_0= ruleAssociationEnd ) ) (otherlv_21= ',' ( (lv_associationEnds_22_0= ruleAssociationEnd ) ) )* otherlv_23= '}' )? (otherlv_24= 'attributes' otherlv_25= '{' ( (lv_attributes_26_0= ruleAttribute ) ) (otherlv_27= ',' ( (lv_attributes_28_0= ruleAttribute ) ) )* otherlv_29= '}' )? otherlv_30= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1761:1: ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'superTypes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operations_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operations_16_0= ruleOperation ) ) )* otherlv_17= '}' )? (otherlv_18= 'associationEnds' otherlv_19= '{' ( (lv_associationEnds_20_0= ruleAssociationEnd ) ) (otherlv_21= ',' ( (lv_associationEnds_22_0= ruleAssociationEnd ) ) )* otherlv_23= '}' )? (otherlv_24= 'attributes' otherlv_25= '{' ( (lv_attributes_26_0= ruleAttribute ) ) (otherlv_27= ',' ( (lv_attributes_28_0= ruleAttribute ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1761:1: ( () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'superTypes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operations_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operations_16_0= ruleOperation ) ) )* otherlv_17= '}' )? (otherlv_18= 'associationEnds' otherlv_19= '{' ( (lv_associationEnds_20_0= ruleAssociationEnd ) ) (otherlv_21= ',' ( (lv_associationEnds_22_0= ruleAssociationEnd ) ) )* otherlv_23= '}' )? (otherlv_24= 'attributes' otherlv_25= '{' ( (lv_attributes_26_0= ruleAttribute ) ) (otherlv_27= ',' ( (lv_attributes_28_0= ruleAttribute ) ) )* otherlv_29= '}' )? otherlv_30= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1761:2: () ( (lv_partial_1_0= 'partial' ) )? ( (lv_abstract_2_0= 'abstract' ) )? otherlv_3= 'Class' ( (lv_name_4_0= ruleEString ) ) otherlv_5= '{' (otherlv_6= 'superTypes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )? (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operations_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operations_16_0= ruleOperation ) ) )* otherlv_17= '}' )? (otherlv_18= 'associationEnds' otherlv_19= '{' ( (lv_associationEnds_20_0= ruleAssociationEnd ) ) (otherlv_21= ',' ( (lv_associationEnds_22_0= ruleAssociationEnd ) ) )* otherlv_23= '}' )? (otherlv_24= 'attributes' otherlv_25= '{' ( (lv_attributes_26_0= ruleAttribute ) ) (otherlv_27= ',' ( (lv_attributes_28_0= ruleAttribute ) ) )* otherlv_29= '}' )? otherlv_30= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1761:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1762:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getClassAccess().getClassAction_0(),
                        current);
                

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1767:2: ( (lv_partial_1_0= 'partial' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==39) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1768:1: (lv_partial_1_0= 'partial' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1768:1: (lv_partial_1_0= 'partial' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1769:3: lv_partial_1_0= 'partial'
                    {
                    lv_partial_1_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleClass4118); 

                            newLeafNode(lv_partial_1_0, grammarAccess.getClassAccess().getPartialPartialKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(current, "partial", true, "partial");
                    	    

                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1782:3: ( (lv_abstract_2_0= 'abstract' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1783:1: (lv_abstract_2_0= 'abstract' )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1783:1: (lv_abstract_2_0= 'abstract' )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1784:3: lv_abstract_2_0= 'abstract'
                    {
                    lv_abstract_2_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleClass4150); 

                            newLeafNode(lv_abstract_2_0, grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                           		setWithLastConsumed(current, "abstract", true, "abstract");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleClass4176); 

                	newLeafNode(otherlv_3, grammarAccess.getClassAccess().getClassKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1801:1: ( (lv_name_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1802:1: (lv_name_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1802:1: (lv_name_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1803:3: lv_name_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getClassAccess().getNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClass4197);
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

            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClass4209); 

                	newLeafNode(otherlv_5, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1823:1: (otherlv_6= 'superTypes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==45) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1823:3: otherlv_6= 'superTypes' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleClass4222); 

                        	newLeafNode(otherlv_6, grammarAccess.getClassAccess().getSuperTypesKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleClass4234); 

                        	newLeafNode(otherlv_7, grammarAccess.getClassAccess().getLeftParenthesisKeyword_6_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1831:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1832:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1832:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1833:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getSuperTypesClassifierCrossReference_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClass4257);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1846:2: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==15) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1846:4: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClass4270); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getClassAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1850:1: ( ( ruleEString ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1851:1: ( ruleEString )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1851:1: ( ruleEString )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1852:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getClassRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassAccess().getSuperTypesClassifierCrossReference_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClass4293);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleClass4307); 

                        	newLeafNode(otherlv_11, grammarAccess.getClassAccess().getRightParenthesisKeyword_6_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1869:3: (otherlv_12= 'operations' otherlv_13= '{' ( (lv_operations_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operations_16_0= ruleOperation ) ) )* otherlv_17= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1869:5: otherlv_12= 'operations' otherlv_13= '{' ( (lv_operations_14_0= ruleOperation ) ) (otherlv_15= ',' ( (lv_operations_16_0= ruleOperation ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleClass4322); 

                        	newLeafNode(otherlv_12, grammarAccess.getClassAccess().getOperationsKeyword_7_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClass4334); 

                        	newLeafNode(otherlv_13, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1877:1: ( (lv_operations_14_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1878:1: (lv_operations_14_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1878:1: (lv_operations_14_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1879:3: lv_operations_14_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleClass4355);
                    lv_operations_14_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_14_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1895:2: (otherlv_15= ',' ( (lv_operations_16_0= ruleOperation ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==15) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1895:4: otherlv_15= ',' ( (lv_operations_16_0= ruleOperation ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClass4368); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getClassAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1899:1: ( (lv_operations_16_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1900:1: (lv_operations_16_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1900:1: (lv_operations_16_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1901:3: lv_operations_16_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassAccess().getOperationsOperationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleClass4389);
                    	    lv_operations_16_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_16_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClass4403); 

                        	newLeafNode(otherlv_17, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1921:3: (otherlv_18= 'associationEnds' otherlv_19= '{' ( (lv_associationEnds_20_0= ruleAssociationEnd ) ) (otherlv_21= ',' ( (lv_associationEnds_22_0= ruleAssociationEnd ) ) )* otherlv_23= '}' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==47) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1921:5: otherlv_18= 'associationEnds' otherlv_19= '{' ( (lv_associationEnds_20_0= ruleAssociationEnd ) ) (otherlv_21= ',' ( (lv_associationEnds_22_0= ruleAssociationEnd ) ) )* otherlv_23= '}'
                    {
                    otherlv_18=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleClass4418); 

                        	newLeafNode(otherlv_18, grammarAccess.getClassAccess().getAssociationEndsKeyword_8_0());
                        
                    otherlv_19=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClass4430); 

                        	newLeafNode(otherlv_19, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_8_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1929:1: ( (lv_associationEnds_20_0= ruleAssociationEnd ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1930:1: (lv_associationEnds_20_0= ruleAssociationEnd )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1930:1: (lv_associationEnds_20_0= ruleAssociationEnd )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1931:3: lv_associationEnds_20_0= ruleAssociationEnd
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getAssociationEndsAssociationEndParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAssociationEnd_in_ruleClass4451);
                    lv_associationEnds_20_0=ruleAssociationEnd();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	        }
                           		add(
                           			current, 
                           			"associationEnds",
                            		lv_associationEnds_20_0, 
                            		"AssociationEnd");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1947:2: (otherlv_21= ',' ( (lv_associationEnds_22_0= ruleAssociationEnd ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==15) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1947:4: otherlv_21= ',' ( (lv_associationEnds_22_0= ruleAssociationEnd ) )
                    	    {
                    	    otherlv_21=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClass4464); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getClassAccess().getCommaKeyword_8_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1951:1: ( (lv_associationEnds_22_0= ruleAssociationEnd ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1952:1: (lv_associationEnds_22_0= ruleAssociationEnd )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1952:1: (lv_associationEnds_22_0= ruleAssociationEnd )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1953:3: lv_associationEnds_22_0= ruleAssociationEnd
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassAccess().getAssociationEndsAssociationEndParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAssociationEnd_in_ruleClass4485);
                    	    lv_associationEnds_22_0=ruleAssociationEnd();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"associationEnds",
                    	            		lv_associationEnds_22_0, 
                    	            		"AssociationEnd");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClass4499); 

                        	newLeafNode(otherlv_23, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_8_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1973:3: (otherlv_24= 'attributes' otherlv_25= '{' ( (lv_attributes_26_0= ruleAttribute ) ) (otherlv_27= ',' ( (lv_attributes_28_0= ruleAttribute ) ) )* otherlv_29= '}' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==48) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1973:5: otherlv_24= 'attributes' otherlv_25= '{' ( (lv_attributes_26_0= ruleAttribute ) ) (otherlv_27= ',' ( (lv_attributes_28_0= ruleAttribute ) ) )* otherlv_29= '}'
                    {
                    otherlv_24=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleClass4514); 

                        	newLeafNode(otherlv_24, grammarAccess.getClassAccess().getAttributesKeyword_9_0());
                        
                    otherlv_25=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClass4526); 

                        	newLeafNode(otherlv_25, grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1981:1: ( (lv_attributes_26_0= ruleAttribute ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1982:1: (lv_attributes_26_0= ruleAttribute )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1982:1: (lv_attributes_26_0= ruleAttribute )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1983:3: lv_attributes_26_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleClass4547);
                    lv_attributes_26_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_26_0, 
                            		"Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1999:2: (otherlv_27= ',' ( (lv_attributes_28_0= ruleAttribute ) ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:1999:4: otherlv_27= ',' ( (lv_attributes_28_0= ruleAttribute ) )
                    	    {
                    	    otherlv_27=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClass4560); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getClassAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2003:1: ( (lv_attributes_28_0= ruleAttribute ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2004:1: (lv_attributes_28_0= ruleAttribute )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2004:1: (lv_attributes_28_0= ruleAttribute )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2005:3: lv_attributes_28_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassAccess().getAttributesAttributeParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleClass4581);
                    	    lv_attributes_28_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_28_0, 
                    	            		"Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    otherlv_29=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClass4595); 

                        	newLeafNode(otherlv_29, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_30=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClass4609); 

                	newLeafNode(otherlv_30, grammarAccess.getClassAccess().getRightCurlyBracketKeyword_10());
                

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


    // $ANTLR start "entryRuleRBoolean"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2037:1: entryRuleRBoolean returns [EObject current=null] : iv_ruleRBoolean= ruleRBoolean EOF ;
    public final EObject entryRuleRBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRBoolean = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2038:2: (iv_ruleRBoolean= ruleRBoolean EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2039:2: iv_ruleRBoolean= ruleRBoolean EOF
            {
             newCompositeNode(grammarAccess.getRBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRBoolean_in_entryRuleRBoolean4645);
            iv_ruleRBoolean=ruleRBoolean();

            state._fsp--;

             current =iv_ruleRBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRBoolean4655); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2046:1: ruleRBoolean returns [EObject current=null] : (otherlv_0= 'RBoolean' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleRBoolean() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_4_0 = null;

        EObject lv_operations_7_0 = null;

        EObject lv_operations_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2049:28: ( (otherlv_0= 'RBoolean' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2050:1: (otherlv_0= 'RBoolean' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2050:1: (otherlv_0= 'RBoolean' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2050:3: otherlv_0= 'RBoolean' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleRBoolean4692); 

                	newLeafNode(otherlv_0, grammarAccess.getRBooleanAccess().getRBooleanKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2054:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2055:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2055:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2056:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRBooleanAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRBoolean4713);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRBoolean4725); 

                	newLeafNode(otherlv_2, grammarAccess.getRBooleanAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRBoolean4737); 

                	newLeafNode(otherlv_3, grammarAccess.getRBooleanAccess().getInstanceClassNameKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2080:1: ( (lv_instanceClassName_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2081:1: (lv_instanceClassName_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2081:1: (lv_instanceClassName_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2082:3: lv_instanceClassName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRBooleanAccess().getInstanceClassNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRBoolean4758);
            lv_instanceClassName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRBooleanRule());
            	        }
                   		set(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2098:2: (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==46) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2098:4: otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRBoolean4771); 

                        	newLeafNode(otherlv_5, grammarAccess.getRBooleanAccess().getOperationsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRBoolean4783); 

                        	newLeafNode(otherlv_6, grammarAccess.getRBooleanAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2106:1: ( (lv_operations_7_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2107:1: (lv_operations_7_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2107:1: (lv_operations_7_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2108:3: lv_operations_7_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRBooleanAccess().getOperationsOperationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRBoolean4804);
                    lv_operations_7_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRBooleanRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_7_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2124:2: (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==15) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2124:4: otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRBoolean4817); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getRBooleanAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2128:1: ( (lv_operations_9_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2129:1: (lv_operations_9_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2129:1: (lv_operations_9_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2130:3: lv_operations_9_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRBooleanAccess().getOperationsOperationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRBoolean4838);
                    	    lv_operations_9_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRBooleanRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_9_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRBoolean4852); 

                        	newLeafNode(otherlv_10, grammarAccess.getRBooleanAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRBoolean4866); 

                	newLeafNode(otherlv_11, grammarAccess.getRBooleanAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRBoolean"


    // $ANTLR start "entryRuleRInt"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2162:1: entryRuleRInt returns [EObject current=null] : iv_ruleRInt= ruleRInt EOF ;
    public final EObject entryRuleRInt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRInt = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2163:2: (iv_ruleRInt= ruleRInt EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2164:2: iv_ruleRInt= ruleRInt EOF
            {
             newCompositeNode(grammarAccess.getRIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRInt_in_entryRuleRInt4902);
            iv_ruleRInt=ruleRInt();

            state._fsp--;

             current =iv_ruleRInt; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRInt4912); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2171:1: ruleRInt returns [EObject current=null] : (otherlv_0= 'RInt' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleRInt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_4_0 = null;

        EObject lv_operations_7_0 = null;

        EObject lv_operations_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2174:28: ( (otherlv_0= 'RInt' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2175:1: (otherlv_0= 'RInt' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2175:1: (otherlv_0= 'RInt' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2175:3: otherlv_0= 'RInt' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleRInt4949); 

                	newLeafNode(otherlv_0, grammarAccess.getRIntAccess().getRIntKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2179:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2180:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2180:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2181:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRIntAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRInt4970);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRIntRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRInt4982); 

                	newLeafNode(otherlv_2, grammarAccess.getRIntAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRInt4994); 

                	newLeafNode(otherlv_3, grammarAccess.getRIntAccess().getInstanceClassNameKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2205:1: ( (lv_instanceClassName_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2206:1: (lv_instanceClassName_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2206:1: (lv_instanceClassName_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2207:3: lv_instanceClassName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRIntAccess().getInstanceClassNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRInt5015);
            lv_instanceClassName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRIntRule());
            	        }
                   		set(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2223:2: (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==46) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2223:4: otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRInt5028); 

                        	newLeafNode(otherlv_5, grammarAccess.getRIntAccess().getOperationsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRInt5040); 

                        	newLeafNode(otherlv_6, grammarAccess.getRIntAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2231:1: ( (lv_operations_7_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2232:1: (lv_operations_7_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2232:1: (lv_operations_7_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2233:3: lv_operations_7_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRIntAccess().getOperationsOperationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRInt5061);
                    lv_operations_7_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRIntRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_7_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2249:2: (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==15) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2249:4: otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRInt5074); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getRIntAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2253:1: ( (lv_operations_9_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2254:1: (lv_operations_9_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2254:1: (lv_operations_9_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2255:3: lv_operations_9_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRIntAccess().getOperationsOperationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRInt5095);
                    	    lv_operations_9_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRIntRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_9_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRInt5109); 

                        	newLeafNode(otherlv_10, grammarAccess.getRIntAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRInt5123); 

                	newLeafNode(otherlv_11, grammarAccess.getRIntAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRInt"


    // $ANTLR start "entryRuleRChar"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2287:1: entryRuleRChar returns [EObject current=null] : iv_ruleRChar= ruleRChar EOF ;
    public final EObject entryRuleRChar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRChar = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2288:2: (iv_ruleRChar= ruleRChar EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2289:2: iv_ruleRChar= ruleRChar EOF
            {
             newCompositeNode(grammarAccess.getRCharRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRChar_in_entryRuleRChar5159);
            iv_ruleRChar=ruleRChar();

            state._fsp--;

             current =iv_ruleRChar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRChar5169); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2296:1: ruleRChar returns [EObject current=null] : (otherlv_0= 'RChar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleRChar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_4_0 = null;

        EObject lv_operations_7_0 = null;

        EObject lv_operations_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2299:28: ( (otherlv_0= 'RChar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2300:1: (otherlv_0= 'RChar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2300:1: (otherlv_0= 'RChar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2300:3: otherlv_0= 'RChar' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,52,FollowSets000.FOLLOW_52_in_ruleRChar5206); 

                	newLeafNode(otherlv_0, grammarAccess.getRCharAccess().getRCharKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2304:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2305:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2305:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2306:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRCharAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRChar5227);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRCharRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRChar5239); 

                	newLeafNode(otherlv_2, grammarAccess.getRCharAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRChar5251); 

                	newLeafNode(otherlv_3, grammarAccess.getRCharAccess().getInstanceClassNameKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2330:1: ( (lv_instanceClassName_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2331:1: (lv_instanceClassName_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2331:1: (lv_instanceClassName_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2332:3: lv_instanceClassName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRCharAccess().getInstanceClassNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRChar5272);
            lv_instanceClassName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRCharRule());
            	        }
                   		set(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2348:2: (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==46) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2348:4: otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRChar5285); 

                        	newLeafNode(otherlv_5, grammarAccess.getRCharAccess().getOperationsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRChar5297); 

                        	newLeafNode(otherlv_6, grammarAccess.getRCharAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2356:1: ( (lv_operations_7_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2357:1: (lv_operations_7_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2357:1: (lv_operations_7_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2358:3: lv_operations_7_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRCharAccess().getOperationsOperationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRChar5318);
                    lv_operations_7_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRCharRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_7_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2374:2: (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==15) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2374:4: otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRChar5331); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getRCharAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2378:1: ( (lv_operations_9_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2379:1: (lv_operations_9_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2379:1: (lv_operations_9_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2380:3: lv_operations_9_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRCharAccess().getOperationsOperationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRChar5352);
                    	    lv_operations_9_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRCharRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_9_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRChar5366); 

                        	newLeafNode(otherlv_10, grammarAccess.getRCharAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRChar5380); 

                	newLeafNode(otherlv_11, grammarAccess.getRCharAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRChar"


    // $ANTLR start "entryRuleRString"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2412:1: entryRuleRString returns [EObject current=null] : iv_ruleRString= ruleRString EOF ;
    public final EObject entryRuleRString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRString = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2413:2: (iv_ruleRString= ruleRString EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2414:2: iv_ruleRString= ruleRString EOF
            {
             newCompositeNode(grammarAccess.getRStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRString_in_entryRuleRString5416);
            iv_ruleRString=ruleRString();

            state._fsp--;

             current =iv_ruleRString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRString5426); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2421:1: ruleRString returns [EObject current=null] : (otherlv_0= 'RString' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleRString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_4_0 = null;

        EObject lv_operations_7_0 = null;

        EObject lv_operations_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2424:28: ( (otherlv_0= 'RString' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2425:1: (otherlv_0= 'RString' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2425:1: (otherlv_0= 'RString' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2425:3: otherlv_0= 'RString' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,53,FollowSets000.FOLLOW_53_in_ruleRString5463); 

                	newLeafNode(otherlv_0, grammarAccess.getRStringAccess().getRStringKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2429:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2430:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2430:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2431:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRStringAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRString5484);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRStringRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRString5496); 

                	newLeafNode(otherlv_2, grammarAccess.getRStringAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRString5508); 

                	newLeafNode(otherlv_3, grammarAccess.getRStringAccess().getInstanceClassNameKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2455:1: ( (lv_instanceClassName_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2456:1: (lv_instanceClassName_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2456:1: (lv_instanceClassName_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2457:3: lv_instanceClassName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRStringAccess().getInstanceClassNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRString5529);
            lv_instanceClassName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRStringRule());
            	        }
                   		set(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2473:2: (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2473:4: otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRString5542); 

                        	newLeafNode(otherlv_5, grammarAccess.getRStringAccess().getOperationsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRString5554); 

                        	newLeafNode(otherlv_6, grammarAccess.getRStringAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2481:1: ( (lv_operations_7_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2482:1: (lv_operations_7_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2482:1: (lv_operations_7_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2483:3: lv_operations_7_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRStringAccess().getOperationsOperationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRString5575);
                    lv_operations_7_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRStringRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_7_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2499:2: (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==15) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2499:4: otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRString5588); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getRStringAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2503:1: ( (lv_operations_9_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2504:1: (lv_operations_9_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2504:1: (lv_operations_9_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2505:3: lv_operations_9_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRStringAccess().getOperationsOperationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRString5609);
                    	    lv_operations_9_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRStringRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_9_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRString5623); 

                        	newLeafNode(otherlv_10, grammarAccess.getRStringAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRString5637); 

                	newLeafNode(otherlv_11, grammarAccess.getRStringAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRString"


    // $ANTLR start "entryRuleREnum"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2537:1: entryRuleREnum returns [EObject current=null] : iv_ruleREnum= ruleREnum EOF ;
    public final EObject entryRuleREnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREnum = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2538:2: (iv_ruleREnum= ruleREnum EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2539:2: iv_ruleREnum= ruleREnum EOF
            {
             newCompositeNode(grammarAccess.getREnumRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleREnum_in_entryRuleREnum5673);
            iv_ruleREnum=ruleREnum();

            state._fsp--;

             current =iv_ruleREnum; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleREnum5683); 

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
    // $ANTLR end "entryRuleREnum"


    // $ANTLR start "ruleREnum"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2546:1: ruleREnum returns [EObject current=null] : (otherlv_0= 'REnum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= 'literals' otherlv_12= '{' ( (lv_literals_13_0= ruleREnumLiteral ) ) (otherlv_14= ',' ( (lv_literals_15_0= ruleREnumLiteral ) ) )* otherlv_16= '}' otherlv_17= '}' ) ;
    public final EObject ruleREnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_4_0 = null;

        EObject lv_operations_7_0 = null;

        EObject lv_operations_9_0 = null;

        EObject lv_literals_13_0 = null;

        EObject lv_literals_15_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2549:28: ( (otherlv_0= 'REnum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= 'literals' otherlv_12= '{' ( (lv_literals_13_0= ruleREnumLiteral ) ) (otherlv_14= ',' ( (lv_literals_15_0= ruleREnumLiteral ) ) )* otherlv_16= '}' otherlv_17= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2550:1: (otherlv_0= 'REnum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= 'literals' otherlv_12= '{' ( (lv_literals_13_0= ruleREnumLiteral ) ) (otherlv_14= ',' ( (lv_literals_15_0= ruleREnumLiteral ) ) )* otherlv_16= '}' otherlv_17= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2550:1: (otherlv_0= 'REnum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= 'literals' otherlv_12= '{' ( (lv_literals_13_0= ruleREnumLiteral ) ) (otherlv_14= ',' ( (lv_literals_15_0= ruleREnumLiteral ) ) )* otherlv_16= '}' otherlv_17= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2550:3: otherlv_0= 'REnum' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= 'literals' otherlv_12= '{' ( (lv_literals_13_0= ruleREnumLiteral ) ) (otherlv_14= ',' ( (lv_literals_15_0= ruleREnumLiteral ) ) )* otherlv_16= '}' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,54,FollowSets000.FOLLOW_54_in_ruleREnum5720); 

                	newLeafNode(otherlv_0, grammarAccess.getREnumAccess().getREnumKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2554:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2555:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2555:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2556:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getREnumAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleREnum5741);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getREnumRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleREnum5753); 

                	newLeafNode(otherlv_2, grammarAccess.getREnumAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleREnum5765); 

                	newLeafNode(otherlv_3, grammarAccess.getREnumAccess().getInstanceClassNameKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2580:1: ( (lv_instanceClassName_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2581:1: (lv_instanceClassName_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2581:1: (lv_instanceClassName_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2582:3: lv_instanceClassName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getREnumAccess().getInstanceClassNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleREnum5786);
            lv_instanceClassName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getREnumRule());
            	        }
                   		set(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2598:2: (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==46) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2598:4: otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleREnum5799); 

                        	newLeafNode(otherlv_5, grammarAccess.getREnumAccess().getOperationsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleREnum5811); 

                        	newLeafNode(otherlv_6, grammarAccess.getREnumAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2606:1: ( (lv_operations_7_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2607:1: (lv_operations_7_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2607:1: (lv_operations_7_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2608:3: lv_operations_7_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getREnumAccess().getOperationsOperationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleREnum5832);
                    lv_operations_7_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getREnumRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_7_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2624:2: (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==15) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2624:4: otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleREnum5845); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getREnumAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2628:1: ( (lv_operations_9_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2629:1: (lv_operations_9_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2629:1: (lv_operations_9_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2630:3: lv_operations_9_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getREnumAccess().getOperationsOperationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleREnum5866);
                    	    lv_operations_9_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getREnumRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_9_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleREnum5880); 

                        	newLeafNode(otherlv_10, grammarAccess.getREnumAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,55,FollowSets000.FOLLOW_55_in_ruleREnum5894); 

                	newLeafNode(otherlv_11, grammarAccess.getREnumAccess().getLiteralsKeyword_6());
                
            otherlv_12=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleREnum5906); 

                	newLeafNode(otherlv_12, grammarAccess.getREnumAccess().getLeftCurlyBracketKeyword_7());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2658:1: ( (lv_literals_13_0= ruleREnumLiteral ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2659:1: (lv_literals_13_0= ruleREnumLiteral )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2659:1: (lv_literals_13_0= ruleREnumLiteral )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2660:3: lv_literals_13_0= ruleREnumLiteral
            {
             
            	        newCompositeNode(grammarAccess.getREnumAccess().getLiteralsREnumLiteralParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleREnumLiteral_in_ruleREnum5927);
            lv_literals_13_0=ruleREnumLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getREnumRule());
            	        }
                   		add(
                   			current, 
                   			"literals",
                    		lv_literals_13_0, 
                    		"REnumLiteral");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2676:2: (otherlv_14= ',' ( (lv_literals_15_0= ruleREnumLiteral ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==15) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2676:4: otherlv_14= ',' ( (lv_literals_15_0= ruleREnumLiteral ) )
            	    {
            	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleREnum5940); 

            	        	newLeafNode(otherlv_14, grammarAccess.getREnumAccess().getCommaKeyword_9_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2680:1: ( (lv_literals_15_0= ruleREnumLiteral ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2681:1: (lv_literals_15_0= ruleREnumLiteral )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2681:1: (lv_literals_15_0= ruleREnumLiteral )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2682:3: lv_literals_15_0= ruleREnumLiteral
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getREnumAccess().getLiteralsREnumLiteralParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleREnumLiteral_in_ruleREnum5961);
            	    lv_literals_15_0=ruleREnumLiteral();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getREnumRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"literals",
            	            		lv_literals_15_0, 
            	            		"REnumLiteral");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleREnum5975); 

                	newLeafNode(otherlv_16, grammarAccess.getREnumAccess().getRightCurlyBracketKeyword_10());
                
            otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleREnum5987); 

                	newLeafNode(otherlv_17, grammarAccess.getREnumAccess().getRightCurlyBracketKeyword_11());
                

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
    // $ANTLR end "ruleREnum"


    // $ANTLR start "entryRuleRSet"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2714:1: entryRuleRSet returns [EObject current=null] : iv_ruleRSet= ruleRSet EOF ;
    public final EObject entryRuleRSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSet = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2715:2: (iv_ruleRSet= ruleRSet EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2716:2: iv_ruleRSet= ruleRSet EOF
            {
             newCompositeNode(grammarAccess.getRSetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRSet_in_entryRuleRSet6023);
            iv_ruleRSet=ruleRSet();

            state._fsp--;

             current =iv_ruleRSet; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRSet6033); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2723:1: ruleRSet returns [EObject current=null] : (otherlv_0= 'RSet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) otherlv_5= 'type' ( ( ruleEString ) ) (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleRSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_4_0 = null;

        EObject lv_operations_9_0 = null;

        EObject lv_operations_11_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2726:28: ( (otherlv_0= 'RSet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) otherlv_5= 'type' ( ( ruleEString ) ) (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2727:1: (otherlv_0= 'RSet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) otherlv_5= 'type' ( ( ruleEString ) ) (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2727:1: (otherlv_0= 'RSet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) otherlv_5= 'type' ( ( ruleEString ) ) (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2727:3: otherlv_0= 'RSet' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) otherlv_5= 'type' ( ( ruleEString ) ) (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_56_in_ruleRSet6070); 

                	newLeafNode(otherlv_0, grammarAccess.getRSetAccess().getRSetKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2731:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2732:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2732:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2733:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRSetAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRSet6091);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRSetRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRSet6103); 

                	newLeafNode(otherlv_2, grammarAccess.getRSetAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRSet6115); 

                	newLeafNode(otherlv_3, grammarAccess.getRSetAccess().getInstanceClassNameKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2757:1: ( (lv_instanceClassName_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2758:1: (lv_instanceClassName_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2758:1: (lv_instanceClassName_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2759:3: lv_instanceClassName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRSetAccess().getInstanceClassNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRSet6136);
            lv_instanceClassName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRSetRule());
            	        }
                   		set(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRSet6148); 

                	newLeafNode(otherlv_5, grammarAccess.getRSetAccess().getTypeKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2779:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2780:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2780:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2781:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRSetRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRSetAccess().getTypeObjectTypeCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRSet6171);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2794:2: (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==46) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2794:4: otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRSet6184); 

                        	newLeafNode(otherlv_7, grammarAccess.getRSetAccess().getOperationsKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRSet6196); 

                        	newLeafNode(otherlv_8, grammarAccess.getRSetAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2802:1: ( (lv_operations_9_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2803:1: (lv_operations_9_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2803:1: (lv_operations_9_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2804:3: lv_operations_9_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRSetAccess().getOperationsOperationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRSet6217);
                    lv_operations_9_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRSetRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_9_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2820:2: (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2820:4: otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRSet6230); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRSetAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2824:1: ( (lv_operations_11_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2825:1: (lv_operations_11_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2825:1: (lv_operations_11_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2826:3: lv_operations_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRSetAccess().getOperationsOperationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRSet6251);
                    	    lv_operations_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRSetRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_11_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRSet6265); 

                        	newLeafNode(otherlv_12, grammarAccess.getRSetAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRSet6279); 

                	newLeafNode(otherlv_13, grammarAccess.getRSetAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRSet"


    // $ANTLR start "entryRuleRSequence"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2858:1: entryRuleRSequence returns [EObject current=null] : iv_ruleRSequence= ruleRSequence EOF ;
    public final EObject entryRuleRSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSequence = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2859:2: (iv_ruleRSequence= ruleRSequence EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2860:2: iv_ruleRSequence= ruleRSequence EOF
            {
             newCompositeNode(grammarAccess.getRSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRSequence_in_entryRuleRSequence6315);
            iv_ruleRSequence=ruleRSequence();

            state._fsp--;

             current =iv_ruleRSequence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRSequence6325); 

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
    // $ANTLR end "entryRuleRSequence"


    // $ANTLR start "ruleRSequence"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2867:1: ruleRSequence returns [EObject current=null] : (otherlv_0= 'RSequence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) otherlv_5= 'type' ( ( ruleEString ) ) (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleRSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_4_0 = null;

        EObject lv_operations_9_0 = null;

        EObject lv_operations_11_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2870:28: ( (otherlv_0= 'RSequence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) otherlv_5= 'type' ( ( ruleEString ) ) (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2871:1: (otherlv_0= 'RSequence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) otherlv_5= 'type' ( ( ruleEString ) ) (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2871:1: (otherlv_0= 'RSequence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) otherlv_5= 'type' ( ( ruleEString ) ) (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2871:3: otherlv_0= 'RSequence' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) otherlv_5= 'type' ( ( ruleEString ) ) (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_57_in_ruleRSequence6362); 

                	newLeafNode(otherlv_0, grammarAccess.getRSequenceAccess().getRSequenceKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2875:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2876:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2876:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2877:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRSequenceAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRSequence6383);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRSequenceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRSequence6395); 

                	newLeafNode(otherlv_2, grammarAccess.getRSequenceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRSequence6407); 

                	newLeafNode(otherlv_3, grammarAccess.getRSequenceAccess().getInstanceClassNameKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2901:1: ( (lv_instanceClassName_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2902:1: (lv_instanceClassName_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2902:1: (lv_instanceClassName_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2903:3: lv_instanceClassName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRSequenceAccess().getInstanceClassNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRSequence6428);
            lv_instanceClassName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRSequenceRule());
            	        }
                   		set(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRSequence6440); 

                	newLeafNode(otherlv_5, grammarAccess.getRSequenceAccess().getTypeKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2923:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2924:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2924:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2925:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRSequenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRSequenceAccess().getTypeObjectTypeCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRSequence6463);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2938:2: (otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2938:4: otherlv_7= 'operations' otherlv_8= '{' ( (lv_operations_9_0= ruleOperation ) ) (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRSequence6476); 

                        	newLeafNode(otherlv_7, grammarAccess.getRSequenceAccess().getOperationsKeyword_7_0());
                        
                    otherlv_8=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRSequence6488); 

                        	newLeafNode(otherlv_8, grammarAccess.getRSequenceAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2946:1: ( (lv_operations_9_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2947:1: (lv_operations_9_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2947:1: (lv_operations_9_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2948:3: lv_operations_9_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRSequenceAccess().getOperationsOperationParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRSequence6509);
                    lv_operations_9_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRSequenceRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_9_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2964:2: (otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2964:4: otherlv_10= ',' ( (lv_operations_11_0= ruleOperation ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRSequence6522); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getRSequenceAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2968:1: ( (lv_operations_11_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2969:1: (lv_operations_11_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2969:1: (lv_operations_11_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:2970:3: lv_operations_11_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRSequenceAccess().getOperationsOperationParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRSequence6543);
                    	    lv_operations_11_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRSequenceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_11_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRSequence6557); 

                        	newLeafNode(otherlv_12, grammarAccess.getRSequenceAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRSequence6571); 

                	newLeafNode(otherlv_13, grammarAccess.getRSequenceAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleRSequence"


    // $ANTLR start "entryRuleImplementationClass_Impl"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3002:1: entryRuleImplementationClass_Impl returns [EObject current=null] : iv_ruleImplementationClass_Impl= ruleImplementationClass_Impl EOF ;
    public final EObject entryRuleImplementationClass_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationClass_Impl = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3003:2: (iv_ruleImplementationClass_Impl= ruleImplementationClass_Impl EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3004:2: iv_ruleImplementationClass_Impl= ruleImplementationClass_Impl EOF
            {
             newCompositeNode(grammarAccess.getImplementationClass_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleImplementationClass_Impl_in_entryRuleImplementationClass_Impl6607);
            iv_ruleImplementationClass_Impl=ruleImplementationClass_Impl();

            state._fsp--;

             current =iv_ruleImplementationClass_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleImplementationClass_Impl6617); 

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
    // $ANTLR end "entryRuleImplementationClass_Impl"


    // $ANTLR start "ruleImplementationClass_Impl"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3011:1: ruleImplementationClass_Impl returns [EObject current=null] : (otherlv_0= 'ImplementationClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleImplementationClass_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_4_0 = null;

        EObject lv_operations_7_0 = null;

        EObject lv_operations_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3014:28: ( (otherlv_0= 'ImplementationClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3015:1: (otherlv_0= 'ImplementationClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3015:1: (otherlv_0= 'ImplementationClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3015:3: otherlv_0= 'ImplementationClass' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,58,FollowSets000.FOLLOW_58_in_ruleImplementationClass_Impl6654); 

                	newLeafNode(otherlv_0, grammarAccess.getImplementationClass_ImplAccess().getImplementationClassKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3019:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3020:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3020:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3021:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getImplementationClass_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImplementationClass_Impl6675);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplementationClass_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleImplementationClass_Impl6687); 

                	newLeafNode(otherlv_2, grammarAccess.getImplementationClass_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleImplementationClass_Impl6699); 

                	newLeafNode(otherlv_3, grammarAccess.getImplementationClass_ImplAccess().getInstanceClassNameKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3045:1: ( (lv_instanceClassName_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3046:1: (lv_instanceClassName_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3046:1: (lv_instanceClassName_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3047:3: lv_instanceClassName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getImplementationClass_ImplAccess().getInstanceClassNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleImplementationClass_Impl6720);
            lv_instanceClassName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getImplementationClass_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3063:2: (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==46) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3063:4: otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleImplementationClass_Impl6733); 

                        	newLeafNode(otherlv_5, grammarAccess.getImplementationClass_ImplAccess().getOperationsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleImplementationClass_Impl6745); 

                        	newLeafNode(otherlv_6, grammarAccess.getImplementationClass_ImplAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3071:1: ( (lv_operations_7_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3072:1: (lv_operations_7_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3072:1: (lv_operations_7_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3073:3: lv_operations_7_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getImplementationClass_ImplAccess().getOperationsOperationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleImplementationClass_Impl6766);
                    lv_operations_7_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImplementationClass_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_7_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3089:2: (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==15) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3089:4: otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleImplementationClass_Impl6779); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getImplementationClass_ImplAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3093:1: ( (lv_operations_9_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3094:1: (lv_operations_9_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3094:1: (lv_operations_9_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3095:3: lv_operations_9_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getImplementationClass_ImplAccess().getOperationsOperationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleImplementationClass_Impl6800);
                    	    lv_operations_9_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getImplementationClass_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_9_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleImplementationClass_Impl6814); 

                        	newLeafNode(otherlv_10, grammarAccess.getImplementationClass_ImplAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleImplementationClass_Impl6828); 

                	newLeafNode(otherlv_11, grammarAccess.getImplementationClass_ImplAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleImplementationClass_Impl"


    // $ANTLR start "entryRuleRDouble"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3127:1: entryRuleRDouble returns [EObject current=null] : iv_ruleRDouble= ruleRDouble EOF ;
    public final EObject entryRuleRDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRDouble = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3128:2: (iv_ruleRDouble= ruleRDouble EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3129:2: iv_ruleRDouble= ruleRDouble EOF
            {
             newCompositeNode(grammarAccess.getRDoubleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRDouble_in_entryRuleRDouble6864);
            iv_ruleRDouble=ruleRDouble();

            state._fsp--;

             current =iv_ruleRDouble; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRDouble6874); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3136:1: ruleRDouble returns [EObject current=null] : (otherlv_0= 'RDouble' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleRDouble() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_4_0 = null;

        EObject lv_operations_7_0 = null;

        EObject lv_operations_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3139:28: ( (otherlv_0= 'RDouble' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3140:1: (otherlv_0= 'RDouble' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3140:1: (otherlv_0= 'RDouble' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3140:3: otherlv_0= 'RDouble' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,59,FollowSets000.FOLLOW_59_in_ruleRDouble6911); 

                	newLeafNode(otherlv_0, grammarAccess.getRDoubleAccess().getRDoubleKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3144:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3145:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3145:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3146:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRDoubleAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRDouble6932);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRDoubleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRDouble6944); 

                	newLeafNode(otherlv_2, grammarAccess.getRDoubleAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRDouble6956); 

                	newLeafNode(otherlv_3, grammarAccess.getRDoubleAccess().getInstanceClassNameKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3170:1: ( (lv_instanceClassName_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3171:1: (lv_instanceClassName_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3171:1: (lv_instanceClassName_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3172:3: lv_instanceClassName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRDoubleAccess().getInstanceClassNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRDouble6977);
            lv_instanceClassName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRDoubleRule());
            	        }
                   		set(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3188:2: (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==46) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3188:4: otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRDouble6990); 

                        	newLeafNode(otherlv_5, grammarAccess.getRDoubleAccess().getOperationsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRDouble7002); 

                        	newLeafNode(otherlv_6, grammarAccess.getRDoubleAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3196:1: ( (lv_operations_7_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3197:1: (lv_operations_7_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3197:1: (lv_operations_7_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3198:3: lv_operations_7_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRDoubleAccess().getOperationsOperationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRDouble7023);
                    lv_operations_7_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRDoubleRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_7_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3214:2: (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==15) ) {
                            alt60=1;
                        }


                        switch (alt60) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3214:4: otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRDouble7036); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getRDoubleAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3218:1: ( (lv_operations_9_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3219:1: (lv_operations_9_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3219:1: (lv_operations_9_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3220:3: lv_operations_9_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRDoubleAccess().getOperationsOperationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRDouble7057);
                    	    lv_operations_9_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRDoubleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_9_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRDouble7071); 

                        	newLeafNode(otherlv_10, grammarAccess.getRDoubleAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRDouble7085); 

                	newLeafNode(otherlv_11, grammarAccess.getRDoubleAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRDouble"


    // $ANTLR start "entryRuleRFloat"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3252:1: entryRuleRFloat returns [EObject current=null] : iv_ruleRFloat= ruleRFloat EOF ;
    public final EObject entryRuleRFloat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRFloat = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3253:2: (iv_ruleRFloat= ruleRFloat EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3254:2: iv_ruleRFloat= ruleRFloat EOF
            {
             newCompositeNode(grammarAccess.getRFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRFloat_in_entryRuleRFloat7121);
            iv_ruleRFloat=ruleRFloat();

            state._fsp--;

             current =iv_ruleRFloat; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRFloat7131); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3261:1: ruleRFloat returns [EObject current=null] : (otherlv_0= 'RFloat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleRFloat() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_instanceClassName_4_0 = null;

        EObject lv_operations_7_0 = null;

        EObject lv_operations_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3264:28: ( (otherlv_0= 'RFloat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3265:1: (otherlv_0= 'RFloat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3265:1: (otherlv_0= 'RFloat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3265:3: otherlv_0= 'RFloat' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'instanceClassName' ( (lv_instanceClassName_4_0= ruleEString ) ) (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,60,FollowSets000.FOLLOW_60_in_ruleRFloat7168); 

                	newLeafNode(otherlv_0, grammarAccess.getRFloatAccess().getRFloatKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3269:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3270:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3270:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3271:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRFloatAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRFloat7189);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRFloatRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRFloat7201); 

                	newLeafNode(otherlv_2, grammarAccess.getRFloatAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleRFloat7213); 

                	newLeafNode(otherlv_3, grammarAccess.getRFloatAccess().getInstanceClassNameKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3295:1: ( (lv_instanceClassName_4_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3296:1: (lv_instanceClassName_4_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3296:1: (lv_instanceClassName_4_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3297:3: lv_instanceClassName_4_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRFloatAccess().getInstanceClassNameEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRFloat7234);
            lv_instanceClassName_4_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRFloatRule());
            	        }
                   		set(
                   			current, 
                   			"instanceClassName",
                    		lv_instanceClassName_4_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3313:2: (otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==46) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3313:4: otherlv_5= 'operations' otherlv_6= '{' ( (lv_operations_7_0= ruleOperation ) ) (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleRFloat7247); 

                        	newLeafNode(otherlv_5, grammarAccess.getRFloatAccess().getOperationsKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRFloat7259); 

                        	newLeafNode(otherlv_6, grammarAccess.getRFloatAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3321:1: ( (lv_operations_7_0= ruleOperation ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3322:1: (lv_operations_7_0= ruleOperation )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3322:1: (lv_operations_7_0= ruleOperation )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3323:3: lv_operations_7_0= ruleOperation
                    {
                     
                    	        newCompositeNode(grammarAccess.getRFloatAccess().getOperationsOperationParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRFloat7280);
                    lv_operations_7_0=ruleOperation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRFloatRule());
                    	        }
                           		add(
                           			current, 
                           			"operations",
                            		lv_operations_7_0, 
                            		"Operation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3339:2: (otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==15) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3339:4: otherlv_8= ',' ( (lv_operations_9_0= ruleOperation ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleRFloat7293); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getRFloatAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3343:1: ( (lv_operations_9_0= ruleOperation ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3344:1: (lv_operations_9_0= ruleOperation )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3344:1: (lv_operations_9_0= ruleOperation )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3345:3: lv_operations_9_0= ruleOperation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRFloatAccess().getOperationsOperationParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperation_in_ruleRFloat7314);
                    	    lv_operations_9_0=ruleOperation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRFloatRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operations",
                    	            		lv_operations_9_0, 
                    	            		"Operation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRFloat7328); 

                        	newLeafNode(otherlv_10, grammarAccess.getRFloatAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleRFloat7342); 

                	newLeafNode(otherlv_11, grammarAccess.getRFloatAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleRFloat"


    // $ANTLR start "entryRuleEBoolean"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3377:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3378:2: (iv_ruleEBoolean= ruleEBoolean EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3379:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_entryRuleEBoolean7379);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEBoolean7390); 

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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3386:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3389:28: ( (kw= 'true' | kw= 'false' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3390:1: (kw= 'true' | kw= 'false' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3390:1: (kw= 'true' | kw= 'false' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==61) ) {
                alt64=1;
            }
            else if ( (LA64_0==62) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3391:2: kw= 'true'
                    {
                    kw=(Token)match(input,61,FollowSets000.FOLLOW_61_in_ruleEBoolean7428); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3398:2: kw= 'false'
                    {
                    kw=(Token)match(input,62,FollowSets000.FOLLOW_62_in_ruleEBoolean7447); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                        

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleVisibility"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3411:1: entryRuleVisibility returns [String current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final String entryRuleVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVisibility = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3412:2: (iv_ruleVisibility= ruleVisibility EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3413:2: iv_ruleVisibility= ruleVisibility EOF
            {
             newCompositeNode(grammarAccess.getVisibilityRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVisibility_in_entryRuleVisibility7488);
            iv_ruleVisibility=ruleVisibility();

            state._fsp--;

             current =iv_ruleVisibility.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVisibility7499); 

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
    // $ANTLR end "entryRuleVisibility"


    // $ANTLR start "ruleVisibility"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3420:1: ruleVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Visibility' ;
    public final AntlrDatatypeRuleToken ruleVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3423:28: (kw= 'Visibility' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3425:2: kw= 'Visibility'
            {
            kw=(Token)match(input,63,FollowSets000.FOLLOW_63_in_ruleVisibility7536); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVisibilityAccess().getVisibilityKeyword()); 
                

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


    // $ANTLR start "entryRuleParameter"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3438:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3439:2: (iv_ruleParameter= ruleParameter EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3440:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameter_in_entryRuleParameter7575);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameter7585); 

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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3447:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3450:28: ( (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3451:1: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3451:1: (otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3451:3: otherlv_0= 'Parameter' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'type' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,64,FollowSets000.FOLLOW_64_in_ruleParameter7622); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3455:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3456:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3456:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3457:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter7643);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameter7655); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleParameter7667); 

                	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypeKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3481:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3482:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3482:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3483:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameter7690);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParameter7702); 

                	newLeafNode(otherlv_5, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleAssociationEnd"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3508:1: entryRuleAssociationEnd returns [EObject current=null] : iv_ruleAssociationEnd= ruleAssociationEnd EOF ;
    public final EObject entryRuleAssociationEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociationEnd = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3509:2: (iv_ruleAssociationEnd= ruleAssociationEnd EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3510:2: iv_ruleAssociationEnd= ruleAssociationEnd EOF
            {
             newCompositeNode(grammarAccess.getAssociationEndRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAssociationEnd_in_entryRuleAssociationEnd7738);
            iv_ruleAssociationEnd=ruleAssociationEnd();

            state._fsp--;

             current =iv_ruleAssociationEnd; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAssociationEnd7748); 

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
    // $ANTLR end "entryRuleAssociationEnd"


    // $ANTLR start "ruleAssociationEnd"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3517:1: ruleAssociationEnd returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'AssociationEnd' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )? (otherlv_10= 'navigable' ( (lv_navigable_11_0= ruleEBoolean ) ) )? otherlv_12= 'assoc' ( ( ruleEString ) ) otherlv_14= '}' ) ;
    public final EObject ruleAssociationEnd() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;

        AntlrDatatypeRuleToken lv_referenceType_9_0 = null;

        AntlrDatatypeRuleToken lv_navigable_11_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3520:28: ( ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'AssociationEnd' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )? (otherlv_10= 'navigable' ( (lv_navigable_11_0= ruleEBoolean ) ) )? otherlv_12= 'assoc' ( ( ruleEString ) ) otherlv_14= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3521:1: ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'AssociationEnd' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )? (otherlv_10= 'navigable' ( (lv_navigable_11_0= ruleEBoolean ) ) )? otherlv_12= 'assoc' ( ( ruleEString ) ) otherlv_14= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3521:1: ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'AssociationEnd' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )? (otherlv_10= 'navigable' ( (lv_navigable_11_0= ruleEBoolean ) ) )? otherlv_12= 'assoc' ( ( ruleEString ) ) otherlv_14= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3521:2: ( (lv_static_0_0= 'static' ) ) otherlv_1= 'AssociationEnd' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )? (otherlv_10= 'navigable' ( (lv_navigable_11_0= ruleEBoolean ) ) )? otherlv_12= 'assoc' ( ( ruleEString ) ) otherlv_14= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3521:2: ( (lv_static_0_0= 'static' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3522:1: (lv_static_0_0= 'static' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3522:1: (lv_static_0_0= 'static' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3523:3: lv_static_0_0= 'static'
            {
            lv_static_0_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAssociationEnd7791); 

                    newLeafNode(lv_static_0_0, grammarAccess.getAssociationEndAccess().getStaticStaticKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationEndRule());
            	        }
                   		setWithLastConsumed(current, "static", true, "static");
            	    

            }


            }

            otherlv_1=(Token)match(input,65,FollowSets000.FOLLOW_65_in_ruleAssociationEnd7816); 

                	newLeafNode(otherlv_1, grammarAccess.getAssociationEndAccess().getAssociationEndKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3540:1: ( (lv_name_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3541:1: (lv_name_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3541:1: (lv_name_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3542:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAssociationEndAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssociationEnd7837);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssociationEndRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAssociationEnd7849); 

                	newLeafNode(otherlv_3, grammarAccess.getAssociationEndAccess().getLeftCurlyBracketKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3562:1: (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==66) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3562:3: otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleAssociationEnd7862); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssociationEndAccess().getLowerBoundKeyword_4_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3566:1: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3567:1: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3567:1: (lv_lowerBound_5_0= ruleEInt )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3568:3: lv_lowerBound_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationEndAccess().getLowerBoundEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAssociationEnd7883);
                    lv_lowerBound_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationEndRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3584:4: (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==67) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3584:6: otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleAssociationEnd7898); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssociationEndAccess().getUpperBoundKeyword_5_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3588:1: ( (lv_upperBound_7_0= ruleEInt ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3589:1: (lv_upperBound_7_0= ruleEInt )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3589:1: (lv_upperBound_7_0= ruleEInt )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3590:3: lv_upperBound_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationEndAccess().getUpperBoundEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleAssociationEnd7919);
                    lv_upperBound_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationEndRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3606:4: (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==68) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3606:6: otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) )
                    {
                    otherlv_8=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleAssociationEnd7934); 

                        	newLeafNode(otherlv_8, grammarAccess.getAssociationEndAccess().getReferenceTypeKeyword_6_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3610:1: ( (lv_referenceType_9_0= ruleReferenceType ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3611:1: (lv_referenceType_9_0= ruleReferenceType )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3611:1: (lv_referenceType_9_0= ruleReferenceType )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3612:3: lv_referenceType_9_0= ruleReferenceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationEndAccess().getReferenceTypeReferenceTypeParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleReferenceType_in_ruleAssociationEnd7955);
                    lv_referenceType_9_0=ruleReferenceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationEndRule());
                    	        }
                           		set(
                           			current, 
                           			"referenceType",
                            		lv_referenceType_9_0, 
                            		"ReferenceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3628:4: (otherlv_10= 'navigable' ( (lv_navigable_11_0= ruleEBoolean ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==69) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3628:6: otherlv_10= 'navigable' ( (lv_navigable_11_0= ruleEBoolean ) )
                    {
                    otherlv_10=(Token)match(input,69,FollowSets000.FOLLOW_69_in_ruleAssociationEnd7970); 

                        	newLeafNode(otherlv_10, grammarAccess.getAssociationEndAccess().getNavigableKeyword_7_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3632:1: ( (lv_navigable_11_0= ruleEBoolean ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3633:1: (lv_navigable_11_0= ruleEBoolean )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3633:1: (lv_navigable_11_0= ruleEBoolean )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3634:3: lv_navigable_11_0= ruleEBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssociationEndAccess().getNavigableEBooleanParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEBoolean_in_ruleAssociationEnd7991);
                    lv_navigable_11_0=ruleEBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssociationEndRule());
                    	        }
                           		set(
                           			current, 
                           			"navigable",
                            		lv_navigable_11_0, 
                            		"EBoolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,70,FollowSets000.FOLLOW_70_in_ruleAssociationEnd8005); 

                	newLeafNode(otherlv_12, grammarAccess.getAssociationEndAccess().getAssocKeyword_8());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3654:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3655:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3655:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3656:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssociationEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssociationEndAccess().getAssocAssociationCrossReference_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAssociationEnd8028);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAssociationEnd8040); 

                	newLeafNode(otherlv_14, grammarAccess.getAssociationEndAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleAssociationEnd"


    // $ANTLR start "entryRuleAttribute"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3681:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3682:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3683:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute8076);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute8086); 

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3690:1: ruleAttribute returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'type' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3693:28: ( ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'type' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3694:1: ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'type' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3694:1: ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'type' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3694:2: ( (lv_static_0_0= 'static' ) ) otherlv_1= 'Attribute' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'type' ( ( ruleEString ) ) otherlv_6= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3694:2: ( (lv_static_0_0= 'static' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3695:1: (lv_static_0_0= 'static' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3695:1: (lv_static_0_0= 'static' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3696:3: lv_static_0_0= 'static'
            {
            lv_static_0_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleAttribute8129); 

                    newLeafNode(lv_static_0_0, grammarAccess.getAttributeAccess().getStaticStaticKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                   		setWithLastConsumed(current, "static", true, "static");
            	    

            }


            }

            otherlv_1=(Token)match(input,71,FollowSets000.FOLLOW_71_in_ruleAttribute8154); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getAttributeKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3713:1: ( (lv_name_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3714:1: (lv_name_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3714:1: (lv_name_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3715:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttribute8175);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAttribute8187); 

                	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAttribute8199); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getTypeKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3739:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3740:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3740:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3741:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypePrimitiveTypeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttribute8222);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAttribute8234); 

                	newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleEInt"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3766:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3767:2: (iv_ruleEInt= ruleEInt EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3768:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt8271);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt8282); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3775:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3778:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3779:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3779:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3779:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3779:2: (kw= '-' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==72) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3780:2: kw= '-'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleEInt8321); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt8338); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleReferenceType"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3800:1: entryRuleReferenceType returns [String current=null] : iv_ruleReferenceType= ruleReferenceType EOF ;
    public final String entryRuleReferenceType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReferenceType = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3801:2: (iv_ruleReferenceType= ruleReferenceType EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3802:2: iv_ruleReferenceType= ruleReferenceType EOF
            {
             newCompositeNode(grammarAccess.getReferenceTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReferenceType_in_entryRuleReferenceType8384);
            iv_ruleReferenceType=ruleReferenceType();

            state._fsp--;

             current =iv_ruleReferenceType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReferenceType8395); 

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
    // $ANTLR end "entryRuleReferenceType"


    // $ANTLR start "ruleReferenceType"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3809:1: ruleReferenceType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'ReferenceType' ;
    public final AntlrDatatypeRuleToken ruleReferenceType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3812:28: (kw= 'ReferenceType' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3814:2: kw= 'ReferenceType'
            {
            kw=(Token)match(input,73,FollowSets000.FOLLOW_73_in_ruleReferenceType8432); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getReferenceTypeAccess().getReferenceTypeKeyword()); 
                

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


    // $ANTLR start "entryRuleREnumLiteral"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3827:1: entryRuleREnumLiteral returns [EObject current=null] : iv_ruleREnumLiteral= ruleREnumLiteral EOF ;
    public final EObject entryRuleREnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleREnumLiteral = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3828:2: (iv_ruleREnumLiteral= ruleREnumLiteral EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3829:2: iv_ruleREnumLiteral= ruleREnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getREnumLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleREnumLiteral_in_entryRuleREnumLiteral8471);
            iv_ruleREnumLiteral=ruleREnumLiteral();

            state._fsp--;

             current =iv_ruleREnumLiteral; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleREnumLiteral8481); 

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
    // $ANTLR end "entryRuleREnumLiteral"


    // $ANTLR start "ruleREnumLiteral"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3836:1: ruleREnumLiteral returns [EObject current=null] : ( () otherlv_1= 'REnumLiteral' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleREnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3839:28: ( ( () otherlv_1= 'REnumLiteral' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3840:1: ( () otherlv_1= 'REnumLiteral' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3840:1: ( () otherlv_1= 'REnumLiteral' ( (lv_name_2_0= ruleEString ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3840:2: () otherlv_1= 'REnumLiteral' ( (lv_name_2_0= ruleEString ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3840:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3841:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getREnumLiteralAccess().getREnumLiteralAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,74,FollowSets000.FOLLOW_74_in_ruleREnumLiteral8527); 

                	newLeafNode(otherlv_1, grammarAccess.getREnumLiteralAccess().getREnumLiteralKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3850:1: ( (lv_name_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3851:1: (lv_name_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3851:1: (lv_name_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3852:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getREnumLiteralAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleREnumLiteral8548);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getREnumLiteralRule());
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
    // $ANTLR end "ruleREnumLiteral"


    // $ANTLR start "entryRuleRVoid"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3876:1: entryRuleRVoid returns [EObject current=null] : iv_ruleRVoid= ruleRVoid EOF ;
    public final EObject entryRuleRVoid() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRVoid = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3877:2: (iv_ruleRVoid= ruleRVoid EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3878:2: iv_ruleRVoid= ruleRVoid EOF
            {
             newCompositeNode(grammarAccess.getRVoidRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRVoid_in_entryRuleRVoid8584);
            iv_ruleRVoid=ruleRVoid();

            state._fsp--;

             current =iv_ruleRVoid; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRVoid8594); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3885:1: ruleRVoid returns [EObject current=null] : ( () otherlv_1= 'RVoid' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRVoid() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3888:28: ( ( () otherlv_1= 'RVoid' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3889:1: ( () otherlv_1= 'RVoid' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3889:1: ( () otherlv_1= 'RVoid' ( (lv_name_2_0= ruleEString ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3889:2: () otherlv_1= 'RVoid' ( (lv_name_2_0= ruleEString ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3889:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3890:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRVoidAccess().getRVoidAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,75,FollowSets000.FOLLOW_75_in_ruleRVoid8640); 

                	newLeafNode(otherlv_1, grammarAccess.getRVoidAccess().getRVoidKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3899:1: ( (lv_name_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3900:1: (lv_name_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3900:1: (lv_name_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3901:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRVoidAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRVoid8661);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRVoidRule());
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
    // $ANTLR end "ruleRVoid"


    // $ANTLR start "entryRuleRAny"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3925:1: entryRuleRAny returns [EObject current=null] : iv_ruleRAny= ruleRAny EOF ;
    public final EObject entryRuleRAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRAny = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3926:2: (iv_ruleRAny= ruleRAny EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3927:2: iv_ruleRAny= ruleRAny EOF
            {
             newCompositeNode(grammarAccess.getRAnyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRAny_in_entryRuleRAny8697);
            iv_ruleRAny=ruleRAny();

            state._fsp--;

             current =iv_ruleRAny; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRAny8707); 

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
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3934:1: ruleRAny returns [EObject current=null] : ( () otherlv_1= 'RAny' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3937:28: ( ( () otherlv_1= 'RAny' ( (lv_name_2_0= ruleEString ) ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3938:1: ( () otherlv_1= 'RAny' ( (lv_name_2_0= ruleEString ) ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3938:1: ( () otherlv_1= 'RAny' ( (lv_name_2_0= ruleEString ) ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3938:2: () otherlv_1= 'RAny' ( (lv_name_2_0= ruleEString ) )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3938:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3939:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRAnyAccess().getRAnyAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,76,FollowSets000.FOLLOW_76_in_ruleRAny8753); 

                	newLeafNode(otherlv_1, grammarAccess.getRAnyAccess().getRAnyKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3948:1: ( (lv_name_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3949:1: (lv_name_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3949:1: (lv_name_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3950:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRAnyAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRAny8774);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRAnyRule());
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
    // $ANTLR end "ruleRAny"


    // $ANTLR start "entryRuleAspectMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3974:1: entryRuleAspectMessageView returns [EObject current=null] : iv_ruleAspectMessageView= ruleAspectMessageView EOF ;
    public final EObject entryRuleAspectMessageView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAspectMessageView = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3975:2: (iv_ruleAspectMessageView= ruleAspectMessageView EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3976:2: iv_ruleAspectMessageView= ruleAspectMessageView EOF
            {
             newCompositeNode(grammarAccess.getAspectMessageViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAspectMessageView_in_entryRuleAspectMessageView8810);
            iv_ruleAspectMessageView=ruleAspectMessageView();

            state._fsp--;

             current =iv_ruleAspectMessageView; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAspectMessageView8820); 

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
    // $ANTLR end "entryRuleAspectMessageView"


    // $ANTLR start "ruleAspectMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3983:1: ruleAspectMessageView returns [EObject current=null] : (otherlv_0= 'AspectMessageView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'affectedBy' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'pointcut' ( ( ruleEString ) ) otherlv_11= 'advice' ( (lv_advice_12_0= ruleInteraction ) ) otherlv_13= '}' ) ;
    public final EObject ruleAspectMessageView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_advice_12_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3986:28: ( (otherlv_0= 'AspectMessageView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'affectedBy' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'pointcut' ( ( ruleEString ) ) otherlv_11= 'advice' ( (lv_advice_12_0= ruleInteraction ) ) otherlv_13= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3987:1: (otherlv_0= 'AspectMessageView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'affectedBy' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'pointcut' ( ( ruleEString ) ) otherlv_11= 'advice' ( (lv_advice_12_0= ruleInteraction ) ) otherlv_13= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3987:1: (otherlv_0= 'AspectMessageView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'affectedBy' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'pointcut' ( ( ruleEString ) ) otherlv_11= 'advice' ( (lv_advice_12_0= ruleInteraction ) ) otherlv_13= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3987:3: otherlv_0= 'AspectMessageView' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'affectedBy' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? otherlv_9= 'pointcut' ( ( ruleEString ) ) otherlv_11= 'advice' ( (lv_advice_12_0= ruleInteraction ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_77_in_ruleAspectMessageView8857); 

                	newLeafNode(otherlv_0, grammarAccess.getAspectMessageViewAccess().getAspectMessageViewKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3991:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3992:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3992:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:3993:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAspectMessageViewAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAspectMessageView8878);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAspectMessageViewRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAspectMessageView8890); 

                	newLeafNode(otherlv_2, grammarAccess.getAspectMessageViewAccess().getLeftCurlyBracketKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4013:1: (otherlv_3= 'affectedBy' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==78) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4013:3: otherlv_3= 'affectedBy' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleAspectMessageView8903); 

                        	newLeafNode(otherlv_3, grammarAccess.getAspectMessageViewAccess().getAffectedByKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAspectMessageView8915); 

                        	newLeafNode(otherlv_4, grammarAccess.getAspectMessageViewAccess().getLeftParenthesisKeyword_3_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4021:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4022:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4022:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4023:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAspectMessageViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAspectMessageViewAccess().getAffectedByAspectMessageViewCrossReference_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAspectMessageView8938);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4036:2: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( (LA70_0==15) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4036:4: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleAspectMessageView8951); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAspectMessageViewAccess().getCommaKeyword_3_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4040:1: ( ( ruleEString ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4041:1: ( ruleEString )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4041:1: ( ruleEString )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4042:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAspectMessageViewRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getAspectMessageViewAccess().getAffectedByAspectMessageViewCrossReference_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAspectMessageView8974);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAspectMessageView8988); 

                        	newLeafNode(otherlv_8, grammarAccess.getAspectMessageViewAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,79,FollowSets000.FOLLOW_79_in_ruleAspectMessageView9002); 

                	newLeafNode(otherlv_9, grammarAccess.getAspectMessageViewAccess().getPointcutKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4063:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4064:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4064:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4065:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAspectMessageViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAspectMessageViewAccess().getPointcutOperationCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAspectMessageView9025);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_11=(Token)match(input,80,FollowSets000.FOLLOW_80_in_ruleAspectMessageView9037); 

                	newLeafNode(otherlv_11, grammarAccess.getAspectMessageViewAccess().getAdviceKeyword_6());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4082:1: ( (lv_advice_12_0= ruleInteraction ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4083:1: (lv_advice_12_0= ruleInteraction )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4083:1: (lv_advice_12_0= ruleInteraction )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4084:3: lv_advice_12_0= ruleInteraction
            {
             
            	        newCompositeNode(grammarAccess.getAspectMessageViewAccess().getAdviceInteractionParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteraction_in_ruleAspectMessageView9058);
            lv_advice_12_0=ruleInteraction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAspectMessageViewRule());
            	        }
                   		set(
                   			current, 
                   			"advice",
                    		lv_advice_12_0, 
                    		"Interaction");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAspectMessageView9070); 

                	newLeafNode(otherlv_13, grammarAccess.getAspectMessageViewAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleAspectMessageView"


    // $ANTLR start "entryRuleMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4112:1: entryRuleMessageView returns [EObject current=null] : iv_ruleMessageView= ruleMessageView EOF ;
    public final EObject entryRuleMessageView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageView = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4113:2: (iv_ruleMessageView= ruleMessageView EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4114:2: iv_ruleMessageView= ruleMessageView EOF
            {
             newCompositeNode(grammarAccess.getMessageViewRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageView_in_entryRuleMessageView9106);
            iv_ruleMessageView=ruleMessageView();

            state._fsp--;

             current =iv_ruleMessageView; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageView9116); 

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
    // $ANTLR end "entryRuleMessageView"


    // $ANTLR start "ruleMessageView"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4121:1: ruleMessageView returns [EObject current=null] : (otherlv_0= 'MessageView' otherlv_1= '{' (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'specifies' ( ( ruleEString ) ) (otherlv_10= 'specification' ( (lv_specification_11_0= ruleInteraction ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleMessageView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_specification_11_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4124:28: ( (otherlv_0= 'MessageView' otherlv_1= '{' (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'specifies' ( ( ruleEString ) ) (otherlv_10= 'specification' ( (lv_specification_11_0= ruleInteraction ) ) )? otherlv_12= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4125:1: (otherlv_0= 'MessageView' otherlv_1= '{' (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'specifies' ( ( ruleEString ) ) (otherlv_10= 'specification' ( (lv_specification_11_0= ruleInteraction ) ) )? otherlv_12= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4125:1: (otherlv_0= 'MessageView' otherlv_1= '{' (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'specifies' ( ( ruleEString ) ) (otherlv_10= 'specification' ( (lv_specification_11_0= ruleInteraction ) ) )? otherlv_12= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4125:3: otherlv_0= 'MessageView' otherlv_1= '{' (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'specifies' ( ( ruleEString ) ) (otherlv_10= 'specification' ( (lv_specification_11_0= ruleInteraction ) ) )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,81,FollowSets000.FOLLOW_81_in_ruleMessageView9153); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageViewAccess().getMessageViewKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMessageView9165); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageViewAccess().getLeftCurlyBracketKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4133:1: (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==78) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4133:3: otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleMessageView9178); 

                        	newLeafNode(otherlv_2, grammarAccess.getMessageViewAccess().getAffectedByKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMessageView9190); 

                        	newLeafNode(otherlv_3, grammarAccess.getMessageViewAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4141:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4142:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4142:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4143:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageViewRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMessageViewAccess().getAffectedByAspectMessageViewCrossReference_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessageView9213);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4156:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==15) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4156:4: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMessageView9226); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMessageViewAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4160:1: ( ( ruleEString ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4161:1: ( ruleEString )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4161:1: ( ruleEString )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4162:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMessageViewRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageViewAccess().getAffectedByAspectMessageViewCrossReference_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessageView9249);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop72;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMessageView9263); 

                        	newLeafNode(otherlv_7, grammarAccess.getMessageViewAccess().getRightParenthesisKeyword_2_4());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleMessageView9277); 

                	newLeafNode(otherlv_8, grammarAccess.getMessageViewAccess().getSpecifiesKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4183:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4184:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4184:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4185:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageViewRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageViewAccess().getSpecifiesOperationCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessageView9300);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4198:2: (otherlv_10= 'specification' ( (lv_specification_11_0= ruleInteraction ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==82) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4198:4: otherlv_10= 'specification' ( (lv_specification_11_0= ruleInteraction ) )
                    {
                    otherlv_10=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleMessageView9313); 

                        	newLeafNode(otherlv_10, grammarAccess.getMessageViewAccess().getSpecificationKeyword_5_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4202:1: ( (lv_specification_11_0= ruleInteraction ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4203:1: (lv_specification_11_0= ruleInteraction )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4203:1: (lv_specification_11_0= ruleInteraction )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4204:3: lv_specification_11_0= ruleInteraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getMessageViewAccess().getSpecificationInteractionParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleInteraction_in_ruleMessageView9334);
                    lv_specification_11_0=ruleInteraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMessageViewRule());
                    	        }
                           		set(
                           			current, 
                           			"specification",
                            		lv_specification_11_0, 
                            		"Interaction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMessageView9348); 

                	newLeafNode(otherlv_12, grammarAccess.getMessageViewAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleMessageView"


    // $ANTLR start "entryRuleMessageViewReference"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4232:1: entryRuleMessageViewReference returns [EObject current=null] : iv_ruleMessageViewReference= ruleMessageViewReference EOF ;
    public final EObject entryRuleMessageViewReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageViewReference = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4233:2: (iv_ruleMessageViewReference= ruleMessageViewReference EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4234:2: iv_ruleMessageViewReference= ruleMessageViewReference EOF
            {
             newCompositeNode(grammarAccess.getMessageViewReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageViewReference_in_entryRuleMessageViewReference9384);
            iv_ruleMessageViewReference=ruleMessageViewReference();

            state._fsp--;

             current =iv_ruleMessageViewReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageViewReference9394); 

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
    // $ANTLR end "entryRuleMessageViewReference"


    // $ANTLR start "ruleMessageViewReference"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4241:1: ruleMessageViewReference returns [EObject current=null] : (otherlv_0= 'MessageViewReference' otherlv_1= '{' (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'references' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleMessageViewReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4244:28: ( (otherlv_0= 'MessageViewReference' otherlv_1= '{' (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'references' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4245:1: (otherlv_0= 'MessageViewReference' otherlv_1= '{' (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'references' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4245:1: (otherlv_0= 'MessageViewReference' otherlv_1= '{' (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'references' ( ( ruleEString ) ) otherlv_10= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4245:3: otherlv_0= 'MessageViewReference' otherlv_1= '{' (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )? otherlv_8= 'references' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,83,FollowSets000.FOLLOW_83_in_ruleMessageViewReference9431); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageViewReferenceAccess().getMessageViewReferenceKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMessageViewReference9443); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageViewReferenceAccess().getLeftCurlyBracketKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4253:1: (otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==78) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4253:3: otherlv_2= 'affectedBy' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,78,FollowSets000.FOLLOW_78_in_ruleMessageViewReference9456); 

                        	newLeafNode(otherlv_2, grammarAccess.getMessageViewReferenceAccess().getAffectedByKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMessageViewReference9468); 

                        	newLeafNode(otherlv_3, grammarAccess.getMessageViewReferenceAccess().getLeftParenthesisKeyword_2_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4261:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4262:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4262:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4263:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageViewReferenceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMessageViewReferenceAccess().getAffectedByAspectMessageViewCrossReference_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessageViewReference9491);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4276:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==15) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4276:4: otherlv_5= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMessageViewReference9504); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getMessageViewReferenceAccess().getCommaKeyword_2_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4280:1: ( ( ruleEString ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4281:1: ( ruleEString )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4281:1: ( ruleEString )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4282:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getMessageViewReferenceRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageViewReferenceAccess().getAffectedByAspectMessageViewCrossReference_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessageViewReference9527);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMessageViewReference9541); 

                        	newLeafNode(otherlv_7, grammarAccess.getMessageViewReferenceAccess().getRightParenthesisKeyword_2_4());
                        

                    }
                    break;

            }

            otherlv_8=(Token)match(input,84,FollowSets000.FOLLOW_84_in_ruleMessageViewReference9555); 

                	newLeafNode(otherlv_8, grammarAccess.getMessageViewReferenceAccess().getReferencesKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4303:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4304:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4304:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4305:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageViewReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageViewReferenceAccess().getReferencesMessageViewCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessageViewReference9578);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMessageViewReference9590); 

                	newLeafNode(otherlv_10, grammarAccess.getMessageViewReferenceAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleMessageViewReference"


    // $ANTLR start "entryRuleInteraction"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4330:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4331:2: (iv_ruleInteraction= ruleInteraction EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4332:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteraction_in_entryRuleInteraction9626);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteraction9636); 

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
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4339:1: ruleInteraction returns [EObject current=null] : (otherlv_0= 'Interaction' otherlv_1= '{' otherlv_2= 'fragments' otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) ) (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )* otherlv_7= '}' otherlv_8= 'lifelines' otherlv_9= '{' ( (lv_lifelines_10_0= ruleLifeline ) ) (otherlv_11= ',' ( (lv_lifelines_12_0= ruleLifeline ) ) )* otherlv_13= '}' otherlv_14= 'messages' otherlv_15= '{' ( (lv_messages_16_0= ruleMessage ) ) (otherlv_17= ',' ( (lv_messages_18_0= ruleMessage ) ) )* otherlv_19= '}' (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleReference ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleReference ) ) )* otherlv_25= '}' )? (otherlv_26= 'formalGates' otherlv_27= '{' ( (lv_formalGates_28_0= ruleGate ) ) (otherlv_29= ',' ( (lv_formalGates_30_0= ruleGate ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        EObject lv_fragments_4_0 = null;

        EObject lv_fragments_6_0 = null;

        EObject lv_lifelines_10_0 = null;

        EObject lv_lifelines_12_0 = null;

        EObject lv_messages_16_0 = null;

        EObject lv_messages_18_0 = null;

        EObject lv_properties_22_0 = null;

        EObject lv_properties_24_0 = null;

        EObject lv_formalGates_28_0 = null;

        EObject lv_formalGates_30_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4342:28: ( (otherlv_0= 'Interaction' otherlv_1= '{' otherlv_2= 'fragments' otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) ) (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )* otherlv_7= '}' otherlv_8= 'lifelines' otherlv_9= '{' ( (lv_lifelines_10_0= ruleLifeline ) ) (otherlv_11= ',' ( (lv_lifelines_12_0= ruleLifeline ) ) )* otherlv_13= '}' otherlv_14= 'messages' otherlv_15= '{' ( (lv_messages_16_0= ruleMessage ) ) (otherlv_17= ',' ( (lv_messages_18_0= ruleMessage ) ) )* otherlv_19= '}' (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleReference ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleReference ) ) )* otherlv_25= '}' )? (otherlv_26= 'formalGates' otherlv_27= '{' ( (lv_formalGates_28_0= ruleGate ) ) (otherlv_29= ',' ( (lv_formalGates_30_0= ruleGate ) ) )* otherlv_31= '}' )? otherlv_32= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4343:1: (otherlv_0= 'Interaction' otherlv_1= '{' otherlv_2= 'fragments' otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) ) (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )* otherlv_7= '}' otherlv_8= 'lifelines' otherlv_9= '{' ( (lv_lifelines_10_0= ruleLifeline ) ) (otherlv_11= ',' ( (lv_lifelines_12_0= ruleLifeline ) ) )* otherlv_13= '}' otherlv_14= 'messages' otherlv_15= '{' ( (lv_messages_16_0= ruleMessage ) ) (otherlv_17= ',' ( (lv_messages_18_0= ruleMessage ) ) )* otherlv_19= '}' (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleReference ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleReference ) ) )* otherlv_25= '}' )? (otherlv_26= 'formalGates' otherlv_27= '{' ( (lv_formalGates_28_0= ruleGate ) ) (otherlv_29= ',' ( (lv_formalGates_30_0= ruleGate ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4343:1: (otherlv_0= 'Interaction' otherlv_1= '{' otherlv_2= 'fragments' otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) ) (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )* otherlv_7= '}' otherlv_8= 'lifelines' otherlv_9= '{' ( (lv_lifelines_10_0= ruleLifeline ) ) (otherlv_11= ',' ( (lv_lifelines_12_0= ruleLifeline ) ) )* otherlv_13= '}' otherlv_14= 'messages' otherlv_15= '{' ( (lv_messages_16_0= ruleMessage ) ) (otherlv_17= ',' ( (lv_messages_18_0= ruleMessage ) ) )* otherlv_19= '}' (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleReference ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleReference ) ) )* otherlv_25= '}' )? (otherlv_26= 'formalGates' otherlv_27= '{' ( (lv_formalGates_28_0= ruleGate ) ) (otherlv_29= ',' ( (lv_formalGates_30_0= ruleGate ) ) )* otherlv_31= '}' )? otherlv_32= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4343:3: otherlv_0= 'Interaction' otherlv_1= '{' otherlv_2= 'fragments' otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) ) (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )* otherlv_7= '}' otherlv_8= 'lifelines' otherlv_9= '{' ( (lv_lifelines_10_0= ruleLifeline ) ) (otherlv_11= ',' ( (lv_lifelines_12_0= ruleLifeline ) ) )* otherlv_13= '}' otherlv_14= 'messages' otherlv_15= '{' ( (lv_messages_16_0= ruleMessage ) ) (otherlv_17= ',' ( (lv_messages_18_0= ruleMessage ) ) )* otherlv_19= '}' (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleReference ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleReference ) ) )* otherlv_25= '}' )? (otherlv_26= 'formalGates' otherlv_27= '{' ( (lv_formalGates_28_0= ruleGate ) ) (otherlv_29= ',' ( (lv_formalGates_30_0= ruleGate ) ) )* otherlv_31= '}' )? otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,85,FollowSets000.FOLLOW_85_in_ruleInteraction9673); 

                	newLeafNode(otherlv_0, grammarAccess.getInteractionAccess().getInteractionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInteraction9685); 

                	newLeafNode(otherlv_1, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleInteraction9697); 

                	newLeafNode(otherlv_2, grammarAccess.getInteractionAccess().getFragmentsKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInteraction9709); 

                	newLeafNode(otherlv_3, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4359:1: ( (lv_fragments_4_0= ruleInteractionFragment ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4360:1: (lv_fragments_4_0= ruleInteractionFragment )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4360:1: (lv_fragments_4_0= ruleInteractionFragment )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4361:3: lv_fragments_4_0= ruleInteractionFragment
            {
             
            	        newCompositeNode(grammarAccess.getInteractionAccess().getFragmentsInteractionFragmentParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteractionFragment_in_ruleInteraction9730);
            lv_fragments_4_0=ruleInteractionFragment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInteractionRule());
            	        }
                   		add(
                   			current, 
                   			"fragments",
                    		lv_fragments_4_0, 
                    		"InteractionFragment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4377:2: (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==15) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4377:4: otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInteraction9743); 

            	        	newLeafNode(otherlv_5, grammarAccess.getInteractionAccess().getCommaKeyword_5_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4381:1: ( (lv_fragments_6_0= ruleInteractionFragment ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4382:1: (lv_fragments_6_0= ruleInteractionFragment )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4382:1: (lv_fragments_6_0= ruleInteractionFragment )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4383:3: lv_fragments_6_0= ruleInteractionFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInteractionAccess().getFragmentsInteractionFragmentParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleInteractionFragment_in_ruleInteraction9764);
            	    lv_fragments_6_0=ruleInteractionFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_6_0, 
            	            		"InteractionFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInteraction9778); 

                	newLeafNode(otherlv_7, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_6());
                
            otherlv_8=(Token)match(input,87,FollowSets000.FOLLOW_87_in_ruleInteraction9790); 

                	newLeafNode(otherlv_8, grammarAccess.getInteractionAccess().getLifelinesKeyword_7());
                
            otherlv_9=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInteraction9802); 

                	newLeafNode(otherlv_9, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_8());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4411:1: ( (lv_lifelines_10_0= ruleLifeline ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4412:1: (lv_lifelines_10_0= ruleLifeline )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4412:1: (lv_lifelines_10_0= ruleLifeline )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4413:3: lv_lifelines_10_0= ruleLifeline
            {
             
            	        newCompositeNode(grammarAccess.getInteractionAccess().getLifelinesLifelineParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLifeline_in_ruleInteraction9823);
            lv_lifelines_10_0=ruleLifeline();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInteractionRule());
            	        }
                   		add(
                   			current, 
                   			"lifelines",
                    		lv_lifelines_10_0, 
                    		"Lifeline");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4429:2: (otherlv_11= ',' ( (lv_lifelines_12_0= ruleLifeline ) ) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==15) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4429:4: otherlv_11= ',' ( (lv_lifelines_12_0= ruleLifeline ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInteraction9836); 

            	        	newLeafNode(otherlv_11, grammarAccess.getInteractionAccess().getCommaKeyword_10_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4433:1: ( (lv_lifelines_12_0= ruleLifeline ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4434:1: (lv_lifelines_12_0= ruleLifeline )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4434:1: (lv_lifelines_12_0= ruleLifeline )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4435:3: lv_lifelines_12_0= ruleLifeline
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInteractionAccess().getLifelinesLifelineParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleLifeline_in_ruleInteraction9857);
            	    lv_lifelines_12_0=ruleLifeline();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"lifelines",
            	            		lv_lifelines_12_0, 
            	            		"Lifeline");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);

            otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInteraction9871); 

                	newLeafNode(otherlv_13, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_11());
                
            otherlv_14=(Token)match(input,88,FollowSets000.FOLLOW_88_in_ruleInteraction9883); 

                	newLeafNode(otherlv_14, grammarAccess.getInteractionAccess().getMessagesKeyword_12());
                
            otherlv_15=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInteraction9895); 

                	newLeafNode(otherlv_15, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_13());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4463:1: ( (lv_messages_16_0= ruleMessage ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4464:1: (lv_messages_16_0= ruleMessage )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4464:1: (lv_messages_16_0= ruleMessage )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4465:3: lv_messages_16_0= ruleMessage
            {
             
            	        newCompositeNode(grammarAccess.getInteractionAccess().getMessagesMessageParserRuleCall_14_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMessage_in_ruleInteraction9916);
            lv_messages_16_0=ruleMessage();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInteractionRule());
            	        }
                   		add(
                   			current, 
                   			"messages",
                    		lv_messages_16_0, 
                    		"Message");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4481:2: (otherlv_17= ',' ( (lv_messages_18_0= ruleMessage ) ) )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==15) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4481:4: otherlv_17= ',' ( (lv_messages_18_0= ruleMessage ) )
            	    {
            	    otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInteraction9929); 

            	        	newLeafNode(otherlv_17, grammarAccess.getInteractionAccess().getCommaKeyword_15_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4485:1: ( (lv_messages_18_0= ruleMessage ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4486:1: (lv_messages_18_0= ruleMessage )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4486:1: (lv_messages_18_0= ruleMessage )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4487:3: lv_messages_18_0= ruleMessage
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInteractionAccess().getMessagesMessageParserRuleCall_15_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleMessage_in_ruleInteraction9950);
            	    lv_messages_18_0=ruleMessage();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"messages",
            	            		lv_messages_18_0, 
            	            		"Message");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            otherlv_19=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInteraction9964); 

                	newLeafNode(otherlv_19, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_16());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4507:1: (otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleReference ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleReference ) ) )* otherlv_25= '}' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==89) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4507:3: otherlv_20= 'properties' otherlv_21= '{' ( (lv_properties_22_0= ruleReference ) ) (otherlv_23= ',' ( (lv_properties_24_0= ruleReference ) ) )* otherlv_25= '}'
                    {
                    otherlv_20=(Token)match(input,89,FollowSets000.FOLLOW_89_in_ruleInteraction9977); 

                        	newLeafNode(otherlv_20, grammarAccess.getInteractionAccess().getPropertiesKeyword_17_0());
                        
                    otherlv_21=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInteraction9989); 

                        	newLeafNode(otherlv_21, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_17_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4515:1: ( (lv_properties_22_0= ruleReference ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4516:1: (lv_properties_22_0= ruleReference )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4516:1: (lv_properties_22_0= ruleReference )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4517:3: lv_properties_22_0= ruleReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteractionAccess().getPropertiesReferenceParserRuleCall_17_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleReference_in_ruleInteraction10010);
                    lv_properties_22_0=ruleReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	        }
                           		add(
                           			current, 
                           			"properties",
                            		lv_properties_22_0, 
                            		"Reference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4533:2: (otherlv_23= ',' ( (lv_properties_24_0= ruleReference ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==15) ) {
                            alt80=1;
                        }


                        switch (alt80) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4533:4: otherlv_23= ',' ( (lv_properties_24_0= ruleReference ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInteraction10023); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getInteractionAccess().getCommaKeyword_17_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4537:1: ( (lv_properties_24_0= ruleReference ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4538:1: (lv_properties_24_0= ruleReference )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4538:1: (lv_properties_24_0= ruleReference )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4539:3: lv_properties_24_0= ruleReference
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInteractionAccess().getPropertiesReferenceParserRuleCall_17_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleReference_in_ruleInteraction10044);
                    	    lv_properties_24_0=ruleReference();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_24_0, 
                    	            		"Reference");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInteraction10058); 

                        	newLeafNode(otherlv_25, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_17_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4559:3: (otherlv_26= 'formalGates' otherlv_27= '{' ( (lv_formalGates_28_0= ruleGate ) ) (otherlv_29= ',' ( (lv_formalGates_30_0= ruleGate ) ) )* otherlv_31= '}' )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==90) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4559:5: otherlv_26= 'formalGates' otherlv_27= '{' ( (lv_formalGates_28_0= ruleGate ) ) (otherlv_29= ',' ( (lv_formalGates_30_0= ruleGate ) ) )* otherlv_31= '}'
                    {
                    otherlv_26=(Token)match(input,90,FollowSets000.FOLLOW_90_in_ruleInteraction10073); 

                        	newLeafNode(otherlv_26, grammarAccess.getInteractionAccess().getFormalGatesKeyword_18_0());
                        
                    otherlv_27=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInteraction10085); 

                        	newLeafNode(otherlv_27, grammarAccess.getInteractionAccess().getLeftCurlyBracketKeyword_18_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4567:1: ( (lv_formalGates_28_0= ruleGate ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4568:1: (lv_formalGates_28_0= ruleGate )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4568:1: (lv_formalGates_28_0= ruleGate )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4569:3: lv_formalGates_28_0= ruleGate
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteractionAccess().getFormalGatesGateParserRuleCall_18_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleGate_in_ruleInteraction10106);
                    lv_formalGates_28_0=ruleGate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	        }
                           		add(
                           			current, 
                           			"formalGates",
                            		lv_formalGates_28_0, 
                            		"Gate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4585:2: (otherlv_29= ',' ( (lv_formalGates_30_0= ruleGate ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==15) ) {
                            alt82=1;
                        }


                        switch (alt82) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4585:4: otherlv_29= ',' ( (lv_formalGates_30_0= ruleGate ) )
                    	    {
                    	    otherlv_29=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInteraction10119); 

                    	        	newLeafNode(otherlv_29, grammarAccess.getInteractionAccess().getCommaKeyword_18_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4589:1: ( (lv_formalGates_30_0= ruleGate ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4590:1: (lv_formalGates_30_0= ruleGate )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4590:1: (lv_formalGates_30_0= ruleGate )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4591:3: lv_formalGates_30_0= ruleGate
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getInteractionAccess().getFormalGatesGateParserRuleCall_18_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleGate_in_ruleInteraction10140);
                    	    lv_formalGates_30_0=ruleGate();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getInteractionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"formalGates",
                    	            		lv_formalGates_30_0, 
                    	            		"Gate");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInteraction10154); 

                        	newLeafNode(otherlv_31, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_18_4());
                        

                    }
                    break;

            }

            otherlv_32=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInteraction10168); 

                	newLeafNode(otherlv_32, grammarAccess.getInteractionAccess().getRightCurlyBracketKeyword_19());
                

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
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleLifeline"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4623:1: entryRuleLifeline returns [EObject current=null] : iv_ruleLifeline= ruleLifeline EOF ;
    public final EObject entryRuleLifeline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLifeline = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4624:2: (iv_ruleLifeline= ruleLifeline EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4625:2: iv_ruleLifeline= ruleLifeline EOF
            {
             newCompositeNode(grammarAccess.getLifelineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLifeline_in_entryRuleLifeline10204);
            iv_ruleLifeline=ruleLifeline();

            state._fsp--;

             current =iv_ruleLifeline; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLifeline10214); 

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
    // $ANTLR end "entryRuleLifeline"


    // $ANTLR start "ruleLifeline"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4632:1: ruleLifeline returns [EObject current=null] : (otherlv_0= 'Lifeline' otherlv_1= '{' otherlv_2= 'represents' ( ( ruleEString ) ) otherlv_4= 'coveredBy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'localProperties' otherlv_11= '{' ( (lv_localProperties_12_0= ruleTemporaryProperty ) ) (otherlv_13= ',' ( (lv_localProperties_14_0= ruleTemporaryProperty ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleLifeline() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_localProperties_12_0 = null;

        EObject lv_localProperties_14_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4635:28: ( (otherlv_0= 'Lifeline' otherlv_1= '{' otherlv_2= 'represents' ( ( ruleEString ) ) otherlv_4= 'coveredBy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'localProperties' otherlv_11= '{' ( (lv_localProperties_12_0= ruleTemporaryProperty ) ) (otherlv_13= ',' ( (lv_localProperties_14_0= ruleTemporaryProperty ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4636:1: (otherlv_0= 'Lifeline' otherlv_1= '{' otherlv_2= 'represents' ( ( ruleEString ) ) otherlv_4= 'coveredBy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'localProperties' otherlv_11= '{' ( (lv_localProperties_12_0= ruleTemporaryProperty ) ) (otherlv_13= ',' ( (lv_localProperties_14_0= ruleTemporaryProperty ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4636:1: (otherlv_0= 'Lifeline' otherlv_1= '{' otherlv_2= 'represents' ( ( ruleEString ) ) otherlv_4= 'coveredBy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'localProperties' otherlv_11= '{' ( (lv_localProperties_12_0= ruleTemporaryProperty ) ) (otherlv_13= ',' ( (lv_localProperties_14_0= ruleTemporaryProperty ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4636:3: otherlv_0= 'Lifeline' otherlv_1= '{' otherlv_2= 'represents' ( ( ruleEString ) ) otherlv_4= 'coveredBy' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' (otherlv_10= 'localProperties' otherlv_11= '{' ( (lv_localProperties_12_0= ruleTemporaryProperty ) ) (otherlv_13= ',' ( (lv_localProperties_14_0= ruleTemporaryProperty ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,91,FollowSets000.FOLLOW_91_in_ruleLifeline10251); 

                	newLeafNode(otherlv_0, grammarAccess.getLifelineAccess().getLifelineKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLifeline10263); 

                	newLeafNode(otherlv_1, grammarAccess.getLifelineAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,92,FollowSets000.FOLLOW_92_in_ruleLifeline10275); 

                	newLeafNode(otherlv_2, grammarAccess.getLifelineAccess().getRepresentsKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4648:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4649:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4649:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4650:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLifelineRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLifelineAccess().getRepresentsTypedElementCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLifeline10298);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,93,FollowSets000.FOLLOW_93_in_ruleLifeline10310); 

                	newLeafNode(otherlv_4, grammarAccess.getLifelineAccess().getCoveredByKeyword_4());
                
            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleLifeline10322); 

                	newLeafNode(otherlv_5, grammarAccess.getLifelineAccess().getLeftParenthesisKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4671:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4672:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4672:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4673:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLifelineRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLifelineAccess().getCoveredByInteractionFragmentCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLifeline10345);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4686:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==15) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4686:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLifeline10358); 

            	        	newLeafNode(otherlv_7, grammarAccess.getLifelineAccess().getCommaKeyword_7_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4690:1: ( ( ruleEString ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4691:1: ( ruleEString )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4691:1: ( ruleEString )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4692:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLifelineRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getLifelineAccess().getCoveredByInteractionFragmentCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLifeline10381);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleLifeline10395); 

                	newLeafNode(otherlv_9, grammarAccess.getLifelineAccess().getRightParenthesisKeyword_8());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4709:1: (otherlv_10= 'localProperties' otherlv_11= '{' ( (lv_localProperties_12_0= ruleTemporaryProperty ) ) (otherlv_13= ',' ( (lv_localProperties_14_0= ruleTemporaryProperty ) ) )* otherlv_15= '}' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==94) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4709:3: otherlv_10= 'localProperties' otherlv_11= '{' ( (lv_localProperties_12_0= ruleTemporaryProperty ) ) (otherlv_13= ',' ( (lv_localProperties_14_0= ruleTemporaryProperty ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,94,FollowSets000.FOLLOW_94_in_ruleLifeline10408); 

                        	newLeafNode(otherlv_10, grammarAccess.getLifelineAccess().getLocalPropertiesKeyword_9_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLifeline10420); 

                        	newLeafNode(otherlv_11, grammarAccess.getLifelineAccess().getLeftCurlyBracketKeyword_9_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4717:1: ( (lv_localProperties_12_0= ruleTemporaryProperty ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4718:1: (lv_localProperties_12_0= ruleTemporaryProperty )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4718:1: (lv_localProperties_12_0= ruleTemporaryProperty )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4719:3: lv_localProperties_12_0= ruleTemporaryProperty
                    {
                     
                    	        newCompositeNode(grammarAccess.getLifelineAccess().getLocalPropertiesTemporaryPropertyParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTemporaryProperty_in_ruleLifeline10441);
                    lv_localProperties_12_0=ruleTemporaryProperty();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLifelineRule());
                    	        }
                           		add(
                           			current, 
                           			"localProperties",
                            		lv_localProperties_12_0, 
                            		"TemporaryProperty");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4735:2: (otherlv_13= ',' ( (lv_localProperties_14_0= ruleTemporaryProperty ) ) )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==15) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4735:4: otherlv_13= ',' ( (lv_localProperties_14_0= ruleTemporaryProperty ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleLifeline10454); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getLifelineAccess().getCommaKeyword_9_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4739:1: ( (lv_localProperties_14_0= ruleTemporaryProperty ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4740:1: (lv_localProperties_14_0= ruleTemporaryProperty )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4740:1: (lv_localProperties_14_0= ruleTemporaryProperty )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4741:3: lv_localProperties_14_0= ruleTemporaryProperty
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLifelineAccess().getLocalPropertiesTemporaryPropertyParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTemporaryProperty_in_ruleLifeline10475);
                    	    lv_localProperties_14_0=ruleTemporaryProperty();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLifelineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"localProperties",
                    	            		lv_localProperties_14_0, 
                    	            		"TemporaryProperty");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLifeline10489); 

                        	newLeafNode(otherlv_15, grammarAccess.getLifelineAccess().getRightCurlyBracketKeyword_9_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLifeline10503); 

                	newLeafNode(otherlv_16, grammarAccess.getLifelineAccess().getRightCurlyBracketKeyword_10());
                

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
    // $ANTLR end "ruleLifeline"


    // $ANTLR start "entryRuleMessage"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4773:1: entryRuleMessage returns [EObject current=null] : iv_ruleMessage= ruleMessage EOF ;
    public final EObject entryRuleMessage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessage = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4774:2: (iv_ruleMessage= ruleMessage EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4775:2: iv_ruleMessage= ruleMessage EOF
            {
             newCompositeNode(grammarAccess.getMessageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessage_in_entryRuleMessage10539);
            iv_ruleMessage=ruleMessage();

            state._fsp--;

             current =iv_ruleMessage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessage10549); 

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
    // $ANTLR end "entryRuleMessage"


    // $ANTLR start "ruleMessage"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4782:1: ruleMessage returns [EObject current=null] : (otherlv_0= 'Message' otherlv_1= '{' otherlv_2= 'messageSort' ( (lv_messageSort_3_0= ruleMessageSort ) ) otherlv_4= 'sendEvent' ( ( ruleEString ) ) otherlv_6= 'receiveEvent' ( ( ruleEString ) ) otherlv_8= 'signature' ( ( ruleEString ) ) (otherlv_10= 'assignTo' ( ( ruleEString ) ) )? (otherlv_12= 'arguments' otherlv_13= '{' ( (lv_arguments_14_0= ruleParameterValueMapping ) ) (otherlv_15= ',' ( (lv_arguments_16_0= ruleParameterValueMapping ) ) )* otherlv_17= '}' )? (otherlv_18= 'returns' ( (lv_returns_19_0= ruleValueSpecification ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleMessage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_messageSort_3_0 = null;

        EObject lv_arguments_14_0 = null;

        EObject lv_arguments_16_0 = null;

        EObject lv_returns_19_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4785:28: ( (otherlv_0= 'Message' otherlv_1= '{' otherlv_2= 'messageSort' ( (lv_messageSort_3_0= ruleMessageSort ) ) otherlv_4= 'sendEvent' ( ( ruleEString ) ) otherlv_6= 'receiveEvent' ( ( ruleEString ) ) otherlv_8= 'signature' ( ( ruleEString ) ) (otherlv_10= 'assignTo' ( ( ruleEString ) ) )? (otherlv_12= 'arguments' otherlv_13= '{' ( (lv_arguments_14_0= ruleParameterValueMapping ) ) (otherlv_15= ',' ( (lv_arguments_16_0= ruleParameterValueMapping ) ) )* otherlv_17= '}' )? (otherlv_18= 'returns' ( (lv_returns_19_0= ruleValueSpecification ) ) )? otherlv_20= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4786:1: (otherlv_0= 'Message' otherlv_1= '{' otherlv_2= 'messageSort' ( (lv_messageSort_3_0= ruleMessageSort ) ) otherlv_4= 'sendEvent' ( ( ruleEString ) ) otherlv_6= 'receiveEvent' ( ( ruleEString ) ) otherlv_8= 'signature' ( ( ruleEString ) ) (otherlv_10= 'assignTo' ( ( ruleEString ) ) )? (otherlv_12= 'arguments' otherlv_13= '{' ( (lv_arguments_14_0= ruleParameterValueMapping ) ) (otherlv_15= ',' ( (lv_arguments_16_0= ruleParameterValueMapping ) ) )* otherlv_17= '}' )? (otherlv_18= 'returns' ( (lv_returns_19_0= ruleValueSpecification ) ) )? otherlv_20= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4786:1: (otherlv_0= 'Message' otherlv_1= '{' otherlv_2= 'messageSort' ( (lv_messageSort_3_0= ruleMessageSort ) ) otherlv_4= 'sendEvent' ( ( ruleEString ) ) otherlv_6= 'receiveEvent' ( ( ruleEString ) ) otherlv_8= 'signature' ( ( ruleEString ) ) (otherlv_10= 'assignTo' ( ( ruleEString ) ) )? (otherlv_12= 'arguments' otherlv_13= '{' ( (lv_arguments_14_0= ruleParameterValueMapping ) ) (otherlv_15= ',' ( (lv_arguments_16_0= ruleParameterValueMapping ) ) )* otherlv_17= '}' )? (otherlv_18= 'returns' ( (lv_returns_19_0= ruleValueSpecification ) ) )? otherlv_20= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4786:3: otherlv_0= 'Message' otherlv_1= '{' otherlv_2= 'messageSort' ( (lv_messageSort_3_0= ruleMessageSort ) ) otherlv_4= 'sendEvent' ( ( ruleEString ) ) otherlv_6= 'receiveEvent' ( ( ruleEString ) ) otherlv_8= 'signature' ( ( ruleEString ) ) (otherlv_10= 'assignTo' ( ( ruleEString ) ) )? (otherlv_12= 'arguments' otherlv_13= '{' ( (lv_arguments_14_0= ruleParameterValueMapping ) ) (otherlv_15= ',' ( (lv_arguments_16_0= ruleParameterValueMapping ) ) )* otherlv_17= '}' )? (otherlv_18= 'returns' ( (lv_returns_19_0= ruleValueSpecification ) ) )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,95,FollowSets000.FOLLOW_95_in_ruleMessage10586); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMessage10598); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,96,FollowSets000.FOLLOW_96_in_ruleMessage10610); 

                	newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getMessageSortKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4798:1: ( (lv_messageSort_3_0= ruleMessageSort ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4799:1: (lv_messageSort_3_0= ruleMessageSort )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4799:1: (lv_messageSort_3_0= ruleMessageSort )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4800:3: lv_messageSort_3_0= ruleMessageSort
            {
             
            	        newCompositeNode(grammarAccess.getMessageAccess().getMessageSortMessageSortParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleMessageSort_in_ruleMessage10631);
            lv_messageSort_3_0=ruleMessageSort();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMessageRule());
            	        }
                   		set(
                   			current, 
                   			"messageSort",
                    		lv_messageSort_3_0, 
                    		"MessageSort");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,97,FollowSets000.FOLLOW_97_in_ruleMessage10643); 

                	newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getSendEventKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4820:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4821:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4821:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4822:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageAccess().getSendEventMessageEndCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessage10666);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,98,FollowSets000.FOLLOW_98_in_ruleMessage10678); 

                	newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getReceiveEventKeyword_6());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4839:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4840:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4840:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4841:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageAccess().getReceiveEventMessageEndCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessage10701);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleMessage10713); 

                	newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getSignatureKeyword_8());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4858:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4859:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4859:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4860:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageAccess().getSignatureOperationCrossReference_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessage10736);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4873:2: (otherlv_10= 'assignTo' ( ( ruleEString ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==100) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4873:4: otherlv_10= 'assignTo' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,100,FollowSets000.FOLLOW_100_in_ruleMessage10749); 

                        	newLeafNode(otherlv_10, grammarAccess.getMessageAccess().getAssignToKeyword_10_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4877:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4878:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4878:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4879:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getMessageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getMessageAccess().getAssignToStructuralFeatureCrossReference_10_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessage10772);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4892:4: (otherlv_12= 'arguments' otherlv_13= '{' ( (lv_arguments_14_0= ruleParameterValueMapping ) ) (otherlv_15= ',' ( (lv_arguments_16_0= ruleParameterValueMapping ) ) )* otherlv_17= '}' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==101) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4892:6: otherlv_12= 'arguments' otherlv_13= '{' ( (lv_arguments_14_0= ruleParameterValueMapping ) ) (otherlv_15= ',' ( (lv_arguments_16_0= ruleParameterValueMapping ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,101,FollowSets000.FOLLOW_101_in_ruleMessage10787); 

                        	newLeafNode(otherlv_12, grammarAccess.getMessageAccess().getArgumentsKeyword_11_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMessage10799); 

                        	newLeafNode(otherlv_13, grammarAccess.getMessageAccess().getLeftCurlyBracketKeyword_11_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4900:1: ( (lv_arguments_14_0= ruleParameterValueMapping ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4901:1: (lv_arguments_14_0= ruleParameterValueMapping )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4901:1: (lv_arguments_14_0= ruleParameterValueMapping )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4902:3: lv_arguments_14_0= ruleParameterValueMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getMessageAccess().getArgumentsParameterValueMappingParserRuleCall_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameterValueMapping_in_ruleMessage10820);
                    lv_arguments_14_0=ruleParameterValueMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	        }
                           		add(
                           			current, 
                           			"arguments",
                            		lv_arguments_14_0, 
                            		"ParameterValueMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4918:2: (otherlv_15= ',' ( (lv_arguments_16_0= ruleParameterValueMapping ) ) )*
                    loop88:
                    do {
                        int alt88=2;
                        int LA88_0 = input.LA(1);

                        if ( (LA88_0==15) ) {
                            alt88=1;
                        }


                        switch (alt88) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4918:4: otherlv_15= ',' ( (lv_arguments_16_0= ruleParameterValueMapping ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMessage10833); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getMessageAccess().getCommaKeyword_11_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4922:1: ( (lv_arguments_16_0= ruleParameterValueMapping ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4923:1: (lv_arguments_16_0= ruleParameterValueMapping )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4923:1: (lv_arguments_16_0= ruleParameterValueMapping )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4924:3: lv_arguments_16_0= ruleParameterValueMapping
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMessageAccess().getArgumentsParameterValueMappingParserRuleCall_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterValueMapping_in_ruleMessage10854);
                    	    lv_arguments_16_0=ruleParameterValueMapping();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"arguments",
                    	            		lv_arguments_16_0, 
                    	            		"ParameterValueMapping");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop88;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMessage10868); 

                        	newLeafNode(otherlv_17, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_11_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4944:3: (otherlv_18= 'returns' ( (lv_returns_19_0= ruleValueSpecification ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==102) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4944:5: otherlv_18= 'returns' ( (lv_returns_19_0= ruleValueSpecification ) )
                    {
                    otherlv_18=(Token)match(input,102,FollowSets000.FOLLOW_102_in_ruleMessage10883); 

                        	newLeafNode(otherlv_18, grammarAccess.getMessageAccess().getReturnsKeyword_12_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4948:1: ( (lv_returns_19_0= ruleValueSpecification ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4949:1: (lv_returns_19_0= ruleValueSpecification )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4949:1: (lv_returns_19_0= ruleValueSpecification )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4950:3: lv_returns_19_0= ruleValueSpecification
                    {
                     
                    	        newCompositeNode(grammarAccess.getMessageAccess().getReturnsValueSpecificationParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleMessage10904);
                    lv_returns_19_0=ruleValueSpecification();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMessageRule());
                    	        }
                           		set(
                           			current, 
                           			"returns",
                            		lv_returns_19_0, 
                            		"ValueSpecification");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMessage10918); 

                	newLeafNode(otherlv_20, grammarAccess.getMessageAccess().getRightCurlyBracketKeyword_13());
                

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
    // $ANTLR end "ruleMessage"


    // $ANTLR start "entryRuleReference"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4978:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4979:2: (iv_ruleReference= ruleReference EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4980:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleReference_in_entryRuleReference10954);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleReference10964); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4987:1: ruleReference returns [EObject current=null] : ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )? otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= '}' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token lv_static_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;

        AntlrDatatypeRuleToken lv_referenceType_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4990:28: ( ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )? otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4991:1: ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )? otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4991:1: ( ( (lv_static_0_0= 'static' ) ) otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )? otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4991:2: ( (lv_static_0_0= 'static' ) ) otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )? (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )? (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )? otherlv_10= 'type' ( ( ruleEString ) ) otherlv_12= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4991:2: ( (lv_static_0_0= 'static' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4992:1: (lv_static_0_0= 'static' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4992:1: (lv_static_0_0= 'static' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:4993:3: lv_static_0_0= 'static'
            {
            lv_static_0_0=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleReference11007); 

                    newLeafNode(lv_static_0_0, grammarAccess.getReferenceAccess().getStaticStaticKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                   		setWithLastConsumed(current, "static", true, "static");
            	    

            }


            }

            otherlv_1=(Token)match(input,103,FollowSets000.FOLLOW_103_in_ruleReference11032); 

                	newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getReferenceKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5010:1: ( (lv_name_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5011:1: (lv_name_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5011:1: (lv_name_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5012:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReference11053);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleReference11065); 

                	newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5032:1: (otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) ) )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==66) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5032:3: otherlv_4= 'lowerBound' ( (lv_lowerBound_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,66,FollowSets000.FOLLOW_66_in_ruleReference11078); 

                        	newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getLowerBoundKeyword_4_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5036:1: ( (lv_lowerBound_5_0= ruleEInt ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5037:1: (lv_lowerBound_5_0= ruleEInt )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5037:1: (lv_lowerBound_5_0= ruleEInt )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5038:3: lv_lowerBound_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceAccess().getLowerBoundEIntParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReference11099);
                    lv_lowerBound_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"lowerBound",
                            		lv_lowerBound_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5054:4: (otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==67) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5054:6: otherlv_6= 'upperBound' ( (lv_upperBound_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,67,FollowSets000.FOLLOW_67_in_ruleReference11114); 

                        	newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getUpperBoundKeyword_5_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5058:1: ( (lv_upperBound_7_0= ruleEInt ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5059:1: (lv_upperBound_7_0= ruleEInt )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5059:1: (lv_upperBound_7_0= ruleEInt )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5060:3: lv_upperBound_7_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleReference11135);
                    lv_upperBound_7_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"upperBound",
                            		lv_upperBound_7_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5076:4: (otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==68) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5076:6: otherlv_8= 'referenceType' ( (lv_referenceType_9_0= ruleReferenceType ) )
                    {
                    otherlv_8=(Token)match(input,68,FollowSets000.FOLLOW_68_in_ruleReference11150); 

                        	newLeafNode(otherlv_8, grammarAccess.getReferenceAccess().getReferenceTypeKeyword_6_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5080:1: ( (lv_referenceType_9_0= ruleReferenceType ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5081:1: (lv_referenceType_9_0= ruleReferenceType )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5081:1: (lv_referenceType_9_0= ruleReferenceType )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5082:3: lv_referenceType_9_0= ruleReferenceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getReferenceAccess().getReferenceTypeReferenceTypeParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleReferenceType_in_ruleReference11171);
                    lv_referenceType_9_0=ruleReferenceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReferenceRule());
                    	        }
                           		set(
                           			current, 
                           			"referenceType",
                            		lv_referenceType_9_0, 
                            		"ReferenceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleReference11185); 

                	newLeafNode(otherlv_10, grammarAccess.getReferenceAccess().getTypeKeyword_7());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5102:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5103:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5103:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5104:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getReferenceAccess().getTypeObjectTypeCrossReference_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleReference11208);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleReference11220); 

                	newLeafNode(otherlv_12, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleGate"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5129:1: entryRuleGate returns [EObject current=null] : iv_ruleGate= ruleGate EOF ;
    public final EObject entryRuleGate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGate = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5130:2: (iv_ruleGate= ruleGate EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5131:2: iv_ruleGate= ruleGate EOF
            {
             newCompositeNode(grammarAccess.getGateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGate_in_entryRuleGate11256);
            iv_ruleGate=ruleGate();

            state._fsp--;

             current =iv_ruleGate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGate11266); 

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
    // $ANTLR end "entryRuleGate"


    // $ANTLR start "ruleGate"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5138:1: ruleGate returns [EObject current=null] : (otherlv_0= 'Gate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'message' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleGate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5141:28: ( (otherlv_0= 'Gate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'message' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5142:1: (otherlv_0= 'Gate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'message' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5142:1: (otherlv_0= 'Gate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'message' ( ( ruleEString ) ) otherlv_5= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5142:3: otherlv_0= 'Gate' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'message' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,104,FollowSets000.FOLLOW_104_in_ruleGate11303); 

                	newLeafNode(otherlv_0, grammarAccess.getGateAccess().getGateKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5146:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5147:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5147:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5148:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGateAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGate11324);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleGate11336); 

                	newLeafNode(otherlv_2, grammarAccess.getGateAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleGate11348); 

                	newLeafNode(otherlv_3, grammarAccess.getGateAccess().getMessageKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5172:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5173:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5173:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5174:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGateRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGateAccess().getMessageMessageCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleGate11371);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleGate11383); 

                	newLeafNode(otherlv_5, grammarAccess.getGateAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleGate"


    // $ANTLR start "entryRuleMessageOccurrenceSpecification_Impl"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5199:1: entryRuleMessageOccurrenceSpecification_Impl returns [EObject current=null] : iv_ruleMessageOccurrenceSpecification_Impl= ruleMessageOccurrenceSpecification_Impl EOF ;
    public final EObject entryRuleMessageOccurrenceSpecification_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageOccurrenceSpecification_Impl = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5200:2: (iv_ruleMessageOccurrenceSpecification_Impl= ruleMessageOccurrenceSpecification_Impl EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5201:2: iv_ruleMessageOccurrenceSpecification_Impl= ruleMessageOccurrenceSpecification_Impl EOF
            {
             newCompositeNode(grammarAccess.getMessageOccurrenceSpecification_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageOccurrenceSpecification_Impl_in_entryRuleMessageOccurrenceSpecification_Impl11419);
            iv_ruleMessageOccurrenceSpecification_Impl=ruleMessageOccurrenceSpecification_Impl();

            state._fsp--;

             current =iv_ruleMessageOccurrenceSpecification_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageOccurrenceSpecification_Impl11429); 

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
    // $ANTLR end "entryRuleMessageOccurrenceSpecification_Impl"


    // $ANTLR start "ruleMessageOccurrenceSpecification_Impl"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5208:1: ruleMessageOccurrenceSpecification_Impl returns [EObject current=null] : (otherlv_0= 'MessageOccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'message' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleMessageOccurrenceSpecification_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5211:28: ( (otherlv_0= 'MessageOccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'message' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5212:1: (otherlv_0= 'MessageOccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'message' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5212:1: (otherlv_0= 'MessageOccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'message' ( ( ruleEString ) ) otherlv_10= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5212:3: otherlv_0= 'MessageOccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'message' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,106,FollowSets000.FOLLOW_106_in_ruleMessageOccurrenceSpecification_Impl11466); 

                	newLeafNode(otherlv_0, grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getMessageOccurrenceSpecificationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMessageOccurrenceSpecification_Impl11478); 

                	newLeafNode(otherlv_1, grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleMessageOccurrenceSpecification_Impl11490); 

                	newLeafNode(otherlv_2, grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getCoveredKeyword_2());
                
            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleMessageOccurrenceSpecification_Impl11502); 

                	newLeafNode(otherlv_3, grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getLeftParenthesisKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5228:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5229:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5229:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5230:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageOccurrenceSpecification_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getCoveredLifelineCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessageOccurrenceSpecification_Impl11525);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5243:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==15) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5243:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMessageOccurrenceSpecification_Impl11538); 

            	        	newLeafNode(otherlv_5, grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getCommaKeyword_5_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5247:1: ( ( ruleEString ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5248:1: ( ruleEString )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5248:1: ( ruleEString )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5249:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMessageOccurrenceSpecification_ImplRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getCoveredLifelineCrossReference_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessageOccurrenceSpecification_Impl11561);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleMessageOccurrenceSpecification_Impl11575); 

                	newLeafNode(otherlv_7, grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getRightParenthesisKeyword_6());
                
            otherlv_8=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleMessageOccurrenceSpecification_Impl11587); 

                	newLeafNode(otherlv_8, grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getMessageKeyword_7());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5270:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5271:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5271:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5272:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMessageOccurrenceSpecification_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getMessageMessageCrossReference_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMessageOccurrenceSpecification_Impl11610);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMessageOccurrenceSpecification_Impl11622); 

                	newLeafNode(otherlv_10, grammarAccess.getMessageOccurrenceSpecification_ImplAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleMessageOccurrenceSpecification_Impl"


    // $ANTLR start "entryRuleOccurrenceSpecification_Impl"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5297:1: entryRuleOccurrenceSpecification_Impl returns [EObject current=null] : iv_ruleOccurrenceSpecification_Impl= ruleOccurrenceSpecification_Impl EOF ;
    public final EObject entryRuleOccurrenceSpecification_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOccurrenceSpecification_Impl = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5298:2: (iv_ruleOccurrenceSpecification_Impl= ruleOccurrenceSpecification_Impl EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5299:2: iv_ruleOccurrenceSpecification_Impl= ruleOccurrenceSpecification_Impl EOF
            {
             newCompositeNode(grammarAccess.getOccurrenceSpecification_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOccurrenceSpecification_Impl_in_entryRuleOccurrenceSpecification_Impl11658);
            iv_ruleOccurrenceSpecification_Impl=ruleOccurrenceSpecification_Impl();

            state._fsp--;

             current =iv_ruleOccurrenceSpecification_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOccurrenceSpecification_Impl11668); 

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
    // $ANTLR end "entryRuleOccurrenceSpecification_Impl"


    // $ANTLR start "ruleOccurrenceSpecification_Impl"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5306:1: ruleOccurrenceSpecification_Impl returns [EObject current=null] : (otherlv_0= 'OccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleOccurrenceSpecification_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5309:28: ( (otherlv_0= 'OccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5310:1: (otherlv_0= 'OccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5310:1: (otherlv_0= 'OccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5310:3: otherlv_0= 'OccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,108,FollowSets000.FOLLOW_108_in_ruleOccurrenceSpecification_Impl11705); 

                	newLeafNode(otherlv_0, grammarAccess.getOccurrenceSpecification_ImplAccess().getOccurrenceSpecificationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOccurrenceSpecification_Impl11717); 

                	newLeafNode(otherlv_1, grammarAccess.getOccurrenceSpecification_ImplAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleOccurrenceSpecification_Impl11729); 

                	newLeafNode(otherlv_2, grammarAccess.getOccurrenceSpecification_ImplAccess().getCoveredKeyword_2());
                
            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOccurrenceSpecification_Impl11741); 

                	newLeafNode(otherlv_3, grammarAccess.getOccurrenceSpecification_ImplAccess().getLeftParenthesisKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5326:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5327:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5327:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5328:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOccurrenceSpecification_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOccurrenceSpecification_ImplAccess().getCoveredLifelineCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOccurrenceSpecification_Impl11764);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5341:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==15) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5341:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOccurrenceSpecification_Impl11777); 

            	        	newLeafNode(otherlv_5, grammarAccess.getOccurrenceSpecification_ImplAccess().getCommaKeyword_5_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5345:1: ( ( ruleEString ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5346:1: ( ruleEString )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5346:1: ( ruleEString )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5347:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOccurrenceSpecification_ImplRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getOccurrenceSpecification_ImplAccess().getCoveredLifelineCrossReference_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOccurrenceSpecification_Impl11800);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOccurrenceSpecification_Impl11814); 

                	newLeafNode(otherlv_7, grammarAccess.getOccurrenceSpecification_ImplAccess().getRightParenthesisKeyword_6());
                
            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOccurrenceSpecification_Impl11826); 

                	newLeafNode(otherlv_8, grammarAccess.getOccurrenceSpecification_ImplAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleOccurrenceSpecification_Impl"


    // $ANTLR start "entryRuleDestructionOccurrenceSpecification"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5376:1: entryRuleDestructionOccurrenceSpecification returns [EObject current=null] : iv_ruleDestructionOccurrenceSpecification= ruleDestructionOccurrenceSpecification EOF ;
    public final EObject entryRuleDestructionOccurrenceSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestructionOccurrenceSpecification = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5377:2: (iv_ruleDestructionOccurrenceSpecification= ruleDestructionOccurrenceSpecification EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5378:2: iv_ruleDestructionOccurrenceSpecification= ruleDestructionOccurrenceSpecification EOF
            {
             newCompositeNode(grammarAccess.getDestructionOccurrenceSpecificationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDestructionOccurrenceSpecification_in_entryRuleDestructionOccurrenceSpecification11862);
            iv_ruleDestructionOccurrenceSpecification=ruleDestructionOccurrenceSpecification();

            state._fsp--;

             current =iv_ruleDestructionOccurrenceSpecification; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDestructionOccurrenceSpecification11872); 

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
    // $ANTLR end "entryRuleDestructionOccurrenceSpecification"


    // $ANTLR start "ruleDestructionOccurrenceSpecification"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5385:1: ruleDestructionOccurrenceSpecification returns [EObject current=null] : (otherlv_0= 'DestructionOccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'message' ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleDestructionOccurrenceSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5388:28: ( (otherlv_0= 'DestructionOccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'message' ( ( ruleEString ) ) otherlv_10= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5389:1: (otherlv_0= 'DestructionOccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'message' ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5389:1: (otherlv_0= 'DestructionOccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'message' ( ( ruleEString ) ) otherlv_10= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5389:3: otherlv_0= 'DestructionOccurrenceSpecification' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'message' ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,109,FollowSets000.FOLLOW_109_in_ruleDestructionOccurrenceSpecification11909); 

                	newLeafNode(otherlv_0, grammarAccess.getDestructionOccurrenceSpecificationAccess().getDestructionOccurrenceSpecificationKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDestructionOccurrenceSpecification11921); 

                	newLeafNode(otherlv_1, grammarAccess.getDestructionOccurrenceSpecificationAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleDestructionOccurrenceSpecification11933); 

                	newLeafNode(otherlv_2, grammarAccess.getDestructionOccurrenceSpecificationAccess().getCoveredKeyword_2());
                
            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleDestructionOccurrenceSpecification11945); 

                	newLeafNode(otherlv_3, grammarAccess.getDestructionOccurrenceSpecificationAccess().getLeftParenthesisKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5405:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5406:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5406:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5407:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDestructionOccurrenceSpecificationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDestructionOccurrenceSpecificationAccess().getCoveredLifelineCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDestructionOccurrenceSpecification11968);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5420:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop96:
            do {
                int alt96=2;
                int LA96_0 = input.LA(1);

                if ( (LA96_0==15) ) {
                    alt96=1;
                }


                switch (alt96) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5420:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleDestructionOccurrenceSpecification11981); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDestructionOccurrenceSpecificationAccess().getCommaKeyword_5_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5424:1: ( ( ruleEString ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5425:1: ( ruleEString )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5425:1: ( ruleEString )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5426:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDestructionOccurrenceSpecificationRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getDestructionOccurrenceSpecificationAccess().getCoveredLifelineCrossReference_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDestructionOccurrenceSpecification12004);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop96;
                }
            } while (true);

            otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleDestructionOccurrenceSpecification12018); 

                	newLeafNode(otherlv_7, grammarAccess.getDestructionOccurrenceSpecificationAccess().getRightParenthesisKeyword_6());
                
            otherlv_8=(Token)match(input,105,FollowSets000.FOLLOW_105_in_ruleDestructionOccurrenceSpecification12030); 

                	newLeafNode(otherlv_8, grammarAccess.getDestructionOccurrenceSpecificationAccess().getMessageKeyword_7());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5447:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5448:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5448:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5449:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDestructionOccurrenceSpecificationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDestructionOccurrenceSpecificationAccess().getMessageMessageCrossReference_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDestructionOccurrenceSpecification12053);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDestructionOccurrenceSpecification12065); 

                	newLeafNode(otherlv_10, grammarAccess.getDestructionOccurrenceSpecificationAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleDestructionOccurrenceSpecification"


    // $ANTLR start "entryRuleCombinedFragment"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5474:1: entryRuleCombinedFragment returns [EObject current=null] : iv_ruleCombinedFragment= ruleCombinedFragment EOF ;
    public final EObject entryRuleCombinedFragment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCombinedFragment = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5475:2: (iv_ruleCombinedFragment= ruleCombinedFragment EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5476:2: iv_ruleCombinedFragment= ruleCombinedFragment EOF
            {
             newCompositeNode(grammarAccess.getCombinedFragmentRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCombinedFragment_in_entryRuleCombinedFragment12101);
            iv_ruleCombinedFragment=ruleCombinedFragment();

            state._fsp--;

             current =iv_ruleCombinedFragment; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCombinedFragment12111); 

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
    // $ANTLR end "entryRuleCombinedFragment"


    // $ANTLR start "ruleCombinedFragment"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5483:1: ruleCombinedFragment returns [EObject current=null] : (otherlv_0= 'CombinedFragment' otherlv_1= '{' otherlv_2= 'interactionOperator' ( (lv_interactionOperator_3_0= ruleInteractionOperatorKind ) ) otherlv_4= 'covered' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'operands' otherlv_11= '{' ( (lv_operands_12_0= ruleInteractionOperand ) ) (otherlv_13= ',' ( (lv_operands_14_0= ruleInteractionOperand ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleCombinedFragment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_interactionOperator_3_0 = null;

        EObject lv_operands_12_0 = null;

        EObject lv_operands_14_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5486:28: ( (otherlv_0= 'CombinedFragment' otherlv_1= '{' otherlv_2= 'interactionOperator' ( (lv_interactionOperator_3_0= ruleInteractionOperatorKind ) ) otherlv_4= 'covered' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'operands' otherlv_11= '{' ( (lv_operands_12_0= ruleInteractionOperand ) ) (otherlv_13= ',' ( (lv_operands_14_0= ruleInteractionOperand ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5487:1: (otherlv_0= 'CombinedFragment' otherlv_1= '{' otherlv_2= 'interactionOperator' ( (lv_interactionOperator_3_0= ruleInteractionOperatorKind ) ) otherlv_4= 'covered' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'operands' otherlv_11= '{' ( (lv_operands_12_0= ruleInteractionOperand ) ) (otherlv_13= ',' ( (lv_operands_14_0= ruleInteractionOperand ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5487:1: (otherlv_0= 'CombinedFragment' otherlv_1= '{' otherlv_2= 'interactionOperator' ( (lv_interactionOperator_3_0= ruleInteractionOperatorKind ) ) otherlv_4= 'covered' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'operands' otherlv_11= '{' ( (lv_operands_12_0= ruleInteractionOperand ) ) (otherlv_13= ',' ( (lv_operands_14_0= ruleInteractionOperand ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5487:3: otherlv_0= 'CombinedFragment' otherlv_1= '{' otherlv_2= 'interactionOperator' ( (lv_interactionOperator_3_0= ruleInteractionOperatorKind ) ) otherlv_4= 'covered' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'operands' otherlv_11= '{' ( (lv_operands_12_0= ruleInteractionOperand ) ) (otherlv_13= ',' ( (lv_operands_14_0= ruleInteractionOperand ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,110,FollowSets000.FOLLOW_110_in_ruleCombinedFragment12148); 

                	newLeafNode(otherlv_0, grammarAccess.getCombinedFragmentAccess().getCombinedFragmentKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCombinedFragment12160); 

                	newLeafNode(otherlv_1, grammarAccess.getCombinedFragmentAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,111,FollowSets000.FOLLOW_111_in_ruleCombinedFragment12172); 

                	newLeafNode(otherlv_2, grammarAccess.getCombinedFragmentAccess().getInteractionOperatorKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5499:1: ( (lv_interactionOperator_3_0= ruleInteractionOperatorKind ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5500:1: (lv_interactionOperator_3_0= ruleInteractionOperatorKind )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5500:1: (lv_interactionOperator_3_0= ruleInteractionOperatorKind )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5501:3: lv_interactionOperator_3_0= ruleInteractionOperatorKind
            {
             
            	        newCompositeNode(grammarAccess.getCombinedFragmentAccess().getInteractionOperatorInteractionOperatorKindParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteractionOperatorKind_in_ruleCombinedFragment12193);
            lv_interactionOperator_3_0=ruleInteractionOperatorKind();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCombinedFragmentRule());
            	        }
                   		set(
                   			current, 
                   			"interactionOperator",
                    		lv_interactionOperator_3_0, 
                    		"InteractionOperatorKind");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleCombinedFragment12205); 

                	newLeafNode(otherlv_4, grammarAccess.getCombinedFragmentAccess().getCoveredKeyword_4());
                
            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleCombinedFragment12217); 

                	newLeafNode(otherlv_5, grammarAccess.getCombinedFragmentAccess().getLeftParenthesisKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5525:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5526:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5526:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5527:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCombinedFragmentRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCombinedFragmentAccess().getCoveredLifelineCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCombinedFragment12240);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5540:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==15) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5540:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCombinedFragment12253); 

            	        	newLeafNode(otherlv_7, grammarAccess.getCombinedFragmentAccess().getCommaKeyword_7_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5544:1: ( ( ruleEString ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5545:1: ( ruleEString )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5545:1: ( ruleEString )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5546:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCombinedFragmentRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getCombinedFragmentAccess().getCoveredLifelineCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCombinedFragment12276);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop97;
                }
            } while (true);

            otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleCombinedFragment12290); 

                	newLeafNode(otherlv_9, grammarAccess.getCombinedFragmentAccess().getRightParenthesisKeyword_8());
                
            otherlv_10=(Token)match(input,112,FollowSets000.FOLLOW_112_in_ruleCombinedFragment12302); 

                	newLeafNode(otherlv_10, grammarAccess.getCombinedFragmentAccess().getOperandsKeyword_9());
                
            otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCombinedFragment12314); 

                	newLeafNode(otherlv_11, grammarAccess.getCombinedFragmentAccess().getLeftCurlyBracketKeyword_10());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5571:1: ( (lv_operands_12_0= ruleInteractionOperand ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5572:1: (lv_operands_12_0= ruleInteractionOperand )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5572:1: (lv_operands_12_0= ruleInteractionOperand )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5573:3: lv_operands_12_0= ruleInteractionOperand
            {
             
            	        newCompositeNode(grammarAccess.getCombinedFragmentAccess().getOperandsInteractionOperandParserRuleCall_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteractionOperand_in_ruleCombinedFragment12335);
            lv_operands_12_0=ruleInteractionOperand();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCombinedFragmentRule());
            	        }
                   		add(
                   			current, 
                   			"operands",
                    		lv_operands_12_0, 
                    		"InteractionOperand");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5589:2: (otherlv_13= ',' ( (lv_operands_14_0= ruleInteractionOperand ) ) )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==15) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5589:4: otherlv_13= ',' ( (lv_operands_14_0= ruleInteractionOperand ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleCombinedFragment12348); 

            	        	newLeafNode(otherlv_13, grammarAccess.getCombinedFragmentAccess().getCommaKeyword_12_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5593:1: ( (lv_operands_14_0= ruleInteractionOperand ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5594:1: (lv_operands_14_0= ruleInteractionOperand )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5594:1: (lv_operands_14_0= ruleInteractionOperand )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5595:3: lv_operands_14_0= ruleInteractionOperand
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getCombinedFragmentAccess().getOperandsInteractionOperandParserRuleCall_12_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleInteractionOperand_in_ruleCombinedFragment12369);
            	    lv_operands_14_0=ruleInteractionOperand();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getCombinedFragmentRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"operands",
            	            		lv_operands_14_0, 
            	            		"InteractionOperand");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);

            otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCombinedFragment12383); 

                	newLeafNode(otherlv_15, grammarAccess.getCombinedFragmentAccess().getRightCurlyBracketKeyword_13());
                
            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleCombinedFragment12395); 

                	newLeafNode(otherlv_16, grammarAccess.getCombinedFragmentAccess().getRightCurlyBracketKeyword_14());
                

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
    // $ANTLR end "ruleCombinedFragment"


    // $ANTLR start "entryRuleOriginalBehaviorExecution"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5627:1: entryRuleOriginalBehaviorExecution returns [EObject current=null] : iv_ruleOriginalBehaviorExecution= ruleOriginalBehaviorExecution EOF ;
    public final EObject entryRuleOriginalBehaviorExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOriginalBehaviorExecution = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5628:2: (iv_ruleOriginalBehaviorExecution= ruleOriginalBehaviorExecution EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5629:2: iv_ruleOriginalBehaviorExecution= ruleOriginalBehaviorExecution EOF
            {
             newCompositeNode(grammarAccess.getOriginalBehaviorExecutionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOriginalBehaviorExecution_in_entryRuleOriginalBehaviorExecution12431);
            iv_ruleOriginalBehaviorExecution=ruleOriginalBehaviorExecution();

            state._fsp--;

             current =iv_ruleOriginalBehaviorExecution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOriginalBehaviorExecution12441); 

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
    // $ANTLR end "entryRuleOriginalBehaviorExecution"


    // $ANTLR start "ruleOriginalBehaviorExecution"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5636:1: ruleOriginalBehaviorExecution returns [EObject current=null] : (otherlv_0= 'OriginalBehaviorExecution' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) ;
    public final EObject ruleOriginalBehaviorExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5639:28: ( (otherlv_0= 'OriginalBehaviorExecution' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5640:1: (otherlv_0= 'OriginalBehaviorExecution' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5640:1: (otherlv_0= 'OriginalBehaviorExecution' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5640:3: otherlv_0= 'OriginalBehaviorExecution' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,113,FollowSets000.FOLLOW_113_in_ruleOriginalBehaviorExecution12478); 

                	newLeafNode(otherlv_0, grammarAccess.getOriginalBehaviorExecutionAccess().getOriginalBehaviorExecutionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOriginalBehaviorExecution12490); 

                	newLeafNode(otherlv_1, grammarAccess.getOriginalBehaviorExecutionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleOriginalBehaviorExecution12502); 

                	newLeafNode(otherlv_2, grammarAccess.getOriginalBehaviorExecutionAccess().getCoveredKeyword_2());
                
            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleOriginalBehaviorExecution12514); 

                	newLeafNode(otherlv_3, grammarAccess.getOriginalBehaviorExecutionAccess().getLeftParenthesisKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5656:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5657:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5657:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5658:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOriginalBehaviorExecutionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOriginalBehaviorExecutionAccess().getCoveredLifelineCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOriginalBehaviorExecution12537);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5671:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop99:
            do {
                int alt99=2;
                int LA99_0 = input.LA(1);

                if ( (LA99_0==15) ) {
                    alt99=1;
                }


                switch (alt99) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5671:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOriginalBehaviorExecution12550); 

            	        	newLeafNode(otherlv_5, grammarAccess.getOriginalBehaviorExecutionAccess().getCommaKeyword_5_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5675:1: ( ( ruleEString ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5676:1: ( ruleEString )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5676:1: ( ruleEString )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5677:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOriginalBehaviorExecutionRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getOriginalBehaviorExecutionAccess().getCoveredLifelineCrossReference_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOriginalBehaviorExecution12573);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop99;
                }
            } while (true);

            otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleOriginalBehaviorExecution12587); 

                	newLeafNode(otherlv_7, grammarAccess.getOriginalBehaviorExecutionAccess().getRightParenthesisKeyword_6());
                
            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOriginalBehaviorExecution12599); 

                	newLeafNode(otherlv_8, grammarAccess.getOriginalBehaviorExecutionAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleOriginalBehaviorExecution"


    // $ANTLR start "entryRuleExecutionStatement"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5706:1: entryRuleExecutionStatement returns [EObject current=null] : iv_ruleExecutionStatement= ruleExecutionStatement EOF ;
    public final EObject entryRuleExecutionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecutionStatement = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5707:2: (iv_ruleExecutionStatement= ruleExecutionStatement EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5708:2: iv_ruleExecutionStatement= ruleExecutionStatement EOF
            {
             newCompositeNode(grammarAccess.getExecutionStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleExecutionStatement_in_entryRuleExecutionStatement12635);
            iv_ruleExecutionStatement=ruleExecutionStatement();

            state._fsp--;

             current =iv_ruleExecutionStatement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleExecutionStatement12645); 

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
    // $ANTLR end "entryRuleExecutionStatement"


    // $ANTLR start "ruleExecutionStatement"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5715:1: ruleExecutionStatement returns [EObject current=null] : (otherlv_0= 'ExecutionStatement' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) otherlv_10= '}' ) ;
    public final EObject ruleExecutionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_specification_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5718:28: ( (otherlv_0= 'ExecutionStatement' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) otherlv_10= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5719:1: (otherlv_0= 'ExecutionStatement' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) otherlv_10= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5719:1: (otherlv_0= 'ExecutionStatement' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) otherlv_10= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5719:3: otherlv_0= 'ExecutionStatement' otherlv_1= '{' otherlv_2= 'covered' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' otherlv_8= 'specification' ( (lv_specification_9_0= ruleValueSpecification ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,114,FollowSets000.FOLLOW_114_in_ruleExecutionStatement12682); 

                	newLeafNode(otherlv_0, grammarAccess.getExecutionStatementAccess().getExecutionStatementKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleExecutionStatement12694); 

                	newLeafNode(otherlv_1, grammarAccess.getExecutionStatementAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,107,FollowSets000.FOLLOW_107_in_ruleExecutionStatement12706); 

                	newLeafNode(otherlv_2, grammarAccess.getExecutionStatementAccess().getCoveredKeyword_2());
                
            otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleExecutionStatement12718); 

                	newLeafNode(otherlv_3, grammarAccess.getExecutionStatementAccess().getLeftParenthesisKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5735:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5736:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5736:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5737:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getExecutionStatementRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getExecutionStatementAccess().getCoveredLifelineCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExecutionStatement12741);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5750:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop100:
            do {
                int alt100=2;
                int LA100_0 = input.LA(1);

                if ( (LA100_0==15) ) {
                    alt100=1;
                }


                switch (alt100) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5750:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleExecutionStatement12754); 

            	        	newLeafNode(otherlv_5, grammarAccess.getExecutionStatementAccess().getCommaKeyword_5_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5754:1: ( ( ruleEString ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5755:1: ( ruleEString )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5755:1: ( ruleEString )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5756:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExecutionStatementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getExecutionStatementAccess().getCoveredLifelineCrossReference_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleExecutionStatement12777);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop100;
                }
            } while (true);

            otherlv_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleExecutionStatement12791); 

                	newLeafNode(otherlv_7, grammarAccess.getExecutionStatementAccess().getRightParenthesisKeyword_6());
                
            otherlv_8=(Token)match(input,82,FollowSets000.FOLLOW_82_in_ruleExecutionStatement12803); 

                	newLeafNode(otherlv_8, grammarAccess.getExecutionStatementAccess().getSpecificationKeyword_7());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5777:1: ( (lv_specification_9_0= ruleValueSpecification ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5778:1: (lv_specification_9_0= ruleValueSpecification )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5778:1: (lv_specification_9_0= ruleValueSpecification )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5779:3: lv_specification_9_0= ruleValueSpecification
            {
             
            	        newCompositeNode(grammarAccess.getExecutionStatementAccess().getSpecificationValueSpecificationParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleExecutionStatement12824);
            lv_specification_9_0=ruleValueSpecification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExecutionStatementRule());
            	        }
                   		set(
                   			current, 
                   			"specification",
                    		lv_specification_9_0, 
                    		"ValueSpecification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleExecutionStatement12836); 

                	newLeafNode(otherlv_10, grammarAccess.getExecutionStatementAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleExecutionStatement"


    // $ANTLR start "entryRuleInteractionOperatorKind"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5807:1: entryRuleInteractionOperatorKind returns [String current=null] : iv_ruleInteractionOperatorKind= ruleInteractionOperatorKind EOF ;
    public final String entryRuleInteractionOperatorKind() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteractionOperatorKind = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5808:2: (iv_ruleInteractionOperatorKind= ruleInteractionOperatorKind EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5809:2: iv_ruleInteractionOperatorKind= ruleInteractionOperatorKind EOF
            {
             newCompositeNode(grammarAccess.getInteractionOperatorKindRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteractionOperatorKind_in_entryRuleInteractionOperatorKind12873);
            iv_ruleInteractionOperatorKind=ruleInteractionOperatorKind();

            state._fsp--;

             current =iv_ruleInteractionOperatorKind.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteractionOperatorKind12884); 

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
    // $ANTLR end "entryRuleInteractionOperatorKind"


    // $ANTLR start "ruleInteractionOperatorKind"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5816:1: ruleInteractionOperatorKind returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'InteractionOperatorKind' ;
    public final AntlrDatatypeRuleToken ruleInteractionOperatorKind() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5819:28: (kw= 'InteractionOperatorKind' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5821:2: kw= 'InteractionOperatorKind'
            {
            kw=(Token)match(input,115,FollowSets000.FOLLOW_115_in_ruleInteractionOperatorKind12921); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInteractionOperatorKindAccess().getInteractionOperatorKindKeyword()); 
                

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


    // $ANTLR start "entryRuleInteractionOperand"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5834:1: entryRuleInteractionOperand returns [EObject current=null] : iv_ruleInteractionOperand= ruleInteractionOperand EOF ;
    public final EObject entryRuleInteractionOperand() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteractionOperand = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5835:2: (iv_ruleInteractionOperand= ruleInteractionOperand EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5836:2: iv_ruleInteractionOperand= ruleInteractionOperand EOF
            {
             newCompositeNode(grammarAccess.getInteractionOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInteractionOperand_in_entryRuleInteractionOperand12960);
            iv_ruleInteractionOperand=ruleInteractionOperand();

            state._fsp--;

             current =iv_ruleInteractionOperand; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInteractionOperand12970); 

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
    // $ANTLR end "entryRuleInteractionOperand"


    // $ANTLR start "ruleInteractionOperand"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5843:1: ruleInteractionOperand returns [EObject current=null] : (otherlv_0= 'InteractionOperand' otherlv_1= '{' otherlv_2= 'fragments' otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) ) (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )* otherlv_7= '}' (otherlv_8= 'interactionConstraint' ( (lv_interactionConstraint_9_0= ruleValueSpecification ) ) )? otherlv_10= '}' ) ;
    public final EObject ruleInteractionOperand() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_fragments_4_0 = null;

        EObject lv_fragments_6_0 = null;

        EObject lv_interactionConstraint_9_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5846:28: ( (otherlv_0= 'InteractionOperand' otherlv_1= '{' otherlv_2= 'fragments' otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) ) (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )* otherlv_7= '}' (otherlv_8= 'interactionConstraint' ( (lv_interactionConstraint_9_0= ruleValueSpecification ) ) )? otherlv_10= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5847:1: (otherlv_0= 'InteractionOperand' otherlv_1= '{' otherlv_2= 'fragments' otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) ) (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )* otherlv_7= '}' (otherlv_8= 'interactionConstraint' ( (lv_interactionConstraint_9_0= ruleValueSpecification ) ) )? otherlv_10= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5847:1: (otherlv_0= 'InteractionOperand' otherlv_1= '{' otherlv_2= 'fragments' otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) ) (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )* otherlv_7= '}' (otherlv_8= 'interactionConstraint' ( (lv_interactionConstraint_9_0= ruleValueSpecification ) ) )? otherlv_10= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5847:3: otherlv_0= 'InteractionOperand' otherlv_1= '{' otherlv_2= 'fragments' otherlv_3= '{' ( (lv_fragments_4_0= ruleInteractionFragment ) ) (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )* otherlv_7= '}' (otherlv_8= 'interactionConstraint' ( (lv_interactionConstraint_9_0= ruleValueSpecification ) ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,116,FollowSets000.FOLLOW_116_in_ruleInteractionOperand13007); 

                	newLeafNode(otherlv_0, grammarAccess.getInteractionOperandAccess().getInteractionOperandKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInteractionOperand13019); 

                	newLeafNode(otherlv_1, grammarAccess.getInteractionOperandAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,86,FollowSets000.FOLLOW_86_in_ruleInteractionOperand13031); 

                	newLeafNode(otherlv_2, grammarAccess.getInteractionOperandAccess().getFragmentsKeyword_2());
                
            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleInteractionOperand13043); 

                	newLeafNode(otherlv_3, grammarAccess.getInteractionOperandAccess().getLeftCurlyBracketKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5863:1: ( (lv_fragments_4_0= ruleInteractionFragment ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5864:1: (lv_fragments_4_0= ruleInteractionFragment )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5864:1: (lv_fragments_4_0= ruleInteractionFragment )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5865:3: lv_fragments_4_0= ruleInteractionFragment
            {
             
            	        newCompositeNode(grammarAccess.getInteractionOperandAccess().getFragmentsInteractionFragmentParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleInteractionFragment_in_ruleInteractionOperand13064);
            lv_fragments_4_0=ruleInteractionFragment();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInteractionOperandRule());
            	        }
                   		add(
                   			current, 
                   			"fragments",
                    		lv_fragments_4_0, 
                    		"InteractionFragment");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5881:2: (otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) ) )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( (LA101_0==15) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5881:4: otherlv_5= ',' ( (lv_fragments_6_0= ruleInteractionFragment ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleInteractionOperand13077); 

            	        	newLeafNode(otherlv_5, grammarAccess.getInteractionOperandAccess().getCommaKeyword_5_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5885:1: ( (lv_fragments_6_0= ruleInteractionFragment ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5886:1: (lv_fragments_6_0= ruleInteractionFragment )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5886:1: (lv_fragments_6_0= ruleInteractionFragment )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5887:3: lv_fragments_6_0= ruleInteractionFragment
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInteractionOperandAccess().getFragmentsInteractionFragmentParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleInteractionFragment_in_ruleInteractionOperand13098);
            	    lv_fragments_6_0=ruleInteractionFragment();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInteractionOperandRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fragments",
            	            		lv_fragments_6_0, 
            	            		"InteractionFragment");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop101;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInteractionOperand13112); 

                	newLeafNode(otherlv_7, grammarAccess.getInteractionOperandAccess().getRightCurlyBracketKeyword_6());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5907:1: (otherlv_8= 'interactionConstraint' ( (lv_interactionConstraint_9_0= ruleValueSpecification ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==117) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5907:3: otherlv_8= 'interactionConstraint' ( (lv_interactionConstraint_9_0= ruleValueSpecification ) )
                    {
                    otherlv_8=(Token)match(input,117,FollowSets000.FOLLOW_117_in_ruleInteractionOperand13125); 

                        	newLeafNode(otherlv_8, grammarAccess.getInteractionOperandAccess().getInteractionConstraintKeyword_7_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5911:1: ( (lv_interactionConstraint_9_0= ruleValueSpecification ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5912:1: (lv_interactionConstraint_9_0= ruleValueSpecification )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5912:1: (lv_interactionConstraint_9_0= ruleValueSpecification )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5913:3: lv_interactionConstraint_9_0= ruleValueSpecification
                    {
                     
                    	        newCompositeNode(grammarAccess.getInteractionOperandAccess().getInteractionConstraintValueSpecificationParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleInteractionOperand13146);
                    lv_interactionConstraint_9_0=ruleValueSpecification();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getInteractionOperandRule());
                    	        }
                           		set(
                           			current, 
                           			"interactionConstraint",
                            		lv_interactionConstraint_9_0, 
                            		"ValueSpecification");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleInteractionOperand13160); 

                	newLeafNode(otherlv_10, grammarAccess.getInteractionOperandAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleInteractionOperand"


    // $ANTLR start "entryRuleStructuralFeatureValue"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5941:1: entryRuleStructuralFeatureValue returns [EObject current=null] : iv_ruleStructuralFeatureValue= ruleStructuralFeatureValue EOF ;
    public final EObject entryRuleStructuralFeatureValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuralFeatureValue = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5942:2: (iv_ruleStructuralFeatureValue= ruleStructuralFeatureValue EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5943:2: iv_ruleStructuralFeatureValue= ruleStructuralFeatureValue EOF
            {
             newCompositeNode(grammarAccess.getStructuralFeatureValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStructuralFeatureValue_in_entryRuleStructuralFeatureValue13196);
            iv_ruleStructuralFeatureValue=ruleStructuralFeatureValue();

            state._fsp--;

             current =iv_ruleStructuralFeatureValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStructuralFeatureValue13206); 

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
    // $ANTLR end "entryRuleStructuralFeatureValue"


    // $ANTLR start "ruleStructuralFeatureValue"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5950:1: ruleStructuralFeatureValue returns [EObject current=null] : (otherlv_0= 'StructuralFeatureValue' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleStructuralFeatureValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5953:28: ( (otherlv_0= 'StructuralFeatureValue' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5954:1: (otherlv_0= 'StructuralFeatureValue' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5954:1: (otherlv_0= 'StructuralFeatureValue' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5954:3: otherlv_0= 'StructuralFeatureValue' otherlv_1= '{' otherlv_2= 'value' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,118,FollowSets000.FOLLOW_118_in_ruleStructuralFeatureValue13243); 

                	newLeafNode(otherlv_0, grammarAccess.getStructuralFeatureValueAccess().getStructuralFeatureValueKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStructuralFeatureValue13255); 

                	newLeafNode(otherlv_1, grammarAccess.getStructuralFeatureValueAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,119,FollowSets000.FOLLOW_119_in_ruleStructuralFeatureValue13267); 

                	newLeafNode(otherlv_2, grammarAccess.getStructuralFeatureValueAccess().getValueKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5966:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5967:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5967:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5968:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStructuralFeatureValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStructuralFeatureValueAccess().getValueStructuralFeatureCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStructuralFeatureValue13290);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStructuralFeatureValue13302); 

                	newLeafNode(otherlv_4, grammarAccess.getStructuralFeatureValueAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleStructuralFeatureValue"


    // $ANTLR start "entryRuleParameterValue"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5993:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5994:2: (iv_ruleParameterValue= ruleParameterValue EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:5995:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterValue_in_entryRuleParameterValue13338);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterValue13348); 

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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6002:1: ruleParameterValue returns [EObject current=null] : (otherlv_0= 'ParameterValue' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6005:28: ( (otherlv_0= 'ParameterValue' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6006:1: (otherlv_0= 'ParameterValue' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6006:1: (otherlv_0= 'ParameterValue' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6006:3: otherlv_0= 'ParameterValue' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,120,FollowSets000.FOLLOW_120_in_ruleParameterValue13385); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterValueAccess().getParameterValueKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameterValue13397); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterValueAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,121,FollowSets000.FOLLOW_121_in_ruleParameterValue13409); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterValueAccess().getParameterKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6018:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6019:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6019:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6020:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterValueRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterValueAccess().getParameterParameterCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameterValue13432);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParameterValue13444); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterValueAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleOpaqueExpression"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6045:1: entryRuleOpaqueExpression returns [EObject current=null] : iv_ruleOpaqueExpression= ruleOpaqueExpression EOF ;
    public final EObject entryRuleOpaqueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOpaqueExpression = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6046:2: (iv_ruleOpaqueExpression= ruleOpaqueExpression EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6047:2: iv_ruleOpaqueExpression= ruleOpaqueExpression EOF
            {
             newCompositeNode(grammarAccess.getOpaqueExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOpaqueExpression_in_entryRuleOpaqueExpression13480);
            iv_ruleOpaqueExpression=ruleOpaqueExpression();

            state._fsp--;

             current =iv_ruleOpaqueExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOpaqueExpression13490); 

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
    // $ANTLR end "entryRuleOpaqueExpression"


    // $ANTLR start "ruleOpaqueExpression"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6054:1: ruleOpaqueExpression returns [EObject current=null] : (otherlv_0= 'OpaqueExpression' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= 'language' ( (lv_language_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleOpaqueExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_body_3_0 = null;

        AntlrDatatypeRuleToken lv_language_5_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6057:28: ( (otherlv_0= 'OpaqueExpression' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= 'language' ( (lv_language_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6058:1: (otherlv_0= 'OpaqueExpression' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= 'language' ( (lv_language_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6058:1: (otherlv_0= 'OpaqueExpression' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= 'language' ( (lv_language_5_0= ruleEString ) ) otherlv_6= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6058:3: otherlv_0= 'OpaqueExpression' otherlv_1= '{' otherlv_2= 'body' ( (lv_body_3_0= ruleEString ) ) otherlv_4= 'language' ( (lv_language_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,122,FollowSets000.FOLLOW_122_in_ruleOpaqueExpression13527); 

                	newLeafNode(otherlv_0, grammarAccess.getOpaqueExpressionAccess().getOpaqueExpressionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOpaqueExpression13539); 

                	newLeafNode(otherlv_1, grammarAccess.getOpaqueExpressionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,123,FollowSets000.FOLLOW_123_in_ruleOpaqueExpression13551); 

                	newLeafNode(otherlv_2, grammarAccess.getOpaqueExpressionAccess().getBodyKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6070:1: ( (lv_body_3_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6071:1: (lv_body_3_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6071:1: (lv_body_3_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6072:3: lv_body_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpaqueExpressionAccess().getBodyEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpaqueExpression13572);
            lv_body_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpaqueExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"body",
                    		lv_body_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,124,FollowSets000.FOLLOW_124_in_ruleOpaqueExpression13584); 

                	newLeafNode(otherlv_4, grammarAccess.getOpaqueExpressionAccess().getLanguageKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6092:1: ( (lv_language_5_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6093:1: (lv_language_5_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6093:1: (lv_language_5_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6094:3: lv_language_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getOpaqueExpressionAccess().getLanguageEStringParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOpaqueExpression13605);
            lv_language_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOpaqueExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"language",
                    		lv_language_5_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOpaqueExpression13617); 

                	newLeafNode(otherlv_6, grammarAccess.getOpaqueExpressionAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleOpaqueExpression"


    // $ANTLR start "entryRuleLiteralString"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6122:1: entryRuleLiteralString returns [EObject current=null] : iv_ruleLiteralString= ruleLiteralString EOF ;
    public final EObject entryRuleLiteralString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralString = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6123:2: (iv_ruleLiteralString= ruleLiteralString EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6124:2: iv_ruleLiteralString= ruleLiteralString EOF
            {
             newCompositeNode(grammarAccess.getLiteralStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralString_in_entryRuleLiteralString13653);
            iv_ruleLiteralString=ruleLiteralString();

            state._fsp--;

             current =iv_ruleLiteralString; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralString13663); 

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
    // $ANTLR end "entryRuleLiteralString"


    // $ANTLR start "ruleLiteralString"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6131:1: ruleLiteralString returns [EObject current=null] : (otherlv_0= 'LiteralString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleLiteralString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6134:28: ( (otherlv_0= 'LiteralString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6135:1: (otherlv_0= 'LiteralString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6135:1: (otherlv_0= 'LiteralString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6135:3: otherlv_0= 'LiteralString' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,125,FollowSets000.FOLLOW_125_in_ruleLiteralString13700); 

                	newLeafNode(otherlv_0, grammarAccess.getLiteralStringAccess().getLiteralStringKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralString13712); 

                	newLeafNode(otherlv_1, grammarAccess.getLiteralStringAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,119,FollowSets000.FOLLOW_119_in_ruleLiteralString13724); 

                	newLeafNode(otherlv_2, grammarAccess.getLiteralStringAccess().getValueKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6147:1: ( (lv_value_3_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6148:1: (lv_value_3_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6148:1: (lv_value_3_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6149:3: lv_value_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getLiteralStringAccess().getValueEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleLiteralString13745);
            lv_value_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLiteralStringRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLiteralString13757); 

                	newLeafNode(otherlv_4, grammarAccess.getLiteralStringAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleLiteralString"


    // $ANTLR start "entryRuleLiteralInteger"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6177:1: entryRuleLiteralInteger returns [EObject current=null] : iv_ruleLiteralInteger= ruleLiteralInteger EOF ;
    public final EObject entryRuleLiteralInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralInteger = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6178:2: (iv_ruleLiteralInteger= ruleLiteralInteger EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6179:2: iv_ruleLiteralInteger= ruleLiteralInteger EOF
            {
             newCompositeNode(grammarAccess.getLiteralIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger13793);
            iv_ruleLiteralInteger=ruleLiteralInteger();

            state._fsp--;

             current =iv_ruleLiteralInteger; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralInteger13803); 

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
    // $ANTLR end "entryRuleLiteralInteger"


    // $ANTLR start "ruleLiteralInteger"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6186:1: ruleLiteralInteger returns [EObject current=null] : (otherlv_0= 'LiteralInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) ;
    public final EObject ruleLiteralInteger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6189:28: ( (otherlv_0= 'LiteralInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6190:1: (otherlv_0= 'LiteralInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6190:1: (otherlv_0= 'LiteralInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6190:3: otherlv_0= 'LiteralInteger' otherlv_1= '{' otherlv_2= 'value' ( (lv_value_3_0= ruleEInt ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,126,FollowSets000.FOLLOW_126_in_ruleLiteralInteger13840); 

                	newLeafNode(otherlv_0, grammarAccess.getLiteralIntegerAccess().getLiteralIntegerKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLiteralInteger13852); 

                	newLeafNode(otherlv_1, grammarAccess.getLiteralIntegerAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,119,FollowSets000.FOLLOW_119_in_ruleLiteralInteger13864); 

                	newLeafNode(otherlv_2, grammarAccess.getLiteralIntegerAccess().getValueKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6202:1: ( (lv_value_3_0= ruleEInt ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6203:1: (lv_value_3_0= ruleEInt )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6203:1: (lv_value_3_0= ruleEInt )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6204:3: lv_value_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getLiteralIntegerAccess().getValueEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleLiteralInteger13885);
            lv_value_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLiteralIntegerRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLiteralInteger13897); 

                	newLeafNode(otherlv_4, grammarAccess.getLiteralIntegerAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleLiteralInteger"


    // $ANTLR start "entryRuleLiteralBoolean"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6232:1: entryRuleLiteralBoolean returns [EObject current=null] : iv_ruleLiteralBoolean= ruleLiteralBoolean EOF ;
    public final EObject entryRuleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralBoolean = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6233:2: (iv_ruleLiteralBoolean= ruleLiteralBoolean EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6234:2: iv_ruleLiteralBoolean= ruleLiteralBoolean EOF
            {
             newCompositeNode(grammarAccess.getLiteralBooleanRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean13933);
            iv_ruleLiteralBoolean=ruleLiteralBoolean();

            state._fsp--;

             current =iv_ruleLiteralBoolean; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteralBoolean13943); 

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
    // $ANTLR end "entryRuleLiteralBoolean"


    // $ANTLR start "ruleLiteralBoolean"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6241:1: ruleLiteralBoolean returns [EObject current=null] : ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'LiteralBoolean' ) ;
    public final EObject ruleLiteralBoolean() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6244:28: ( ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'LiteralBoolean' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6245:1: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'LiteralBoolean' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6245:1: ( ( (lv_value_0_0= 'value' ) ) otherlv_1= 'LiteralBoolean' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6245:2: ( (lv_value_0_0= 'value' ) ) otherlv_1= 'LiteralBoolean'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6245:2: ( (lv_value_0_0= 'value' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6246:1: (lv_value_0_0= 'value' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6246:1: (lv_value_0_0= 'value' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6247:3: lv_value_0_0= 'value'
            {
            lv_value_0_0=(Token)match(input,119,FollowSets000.FOLLOW_119_in_ruleLiteralBoolean13986); 

                    newLeafNode(lv_value_0_0, grammarAccess.getLiteralBooleanAccess().getValueValueKeyword_0_0());
                

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLiteralBooleanRule());
            	        }
                   		setWithLastConsumed(current, "value", true, "value");
            	    

            }


            }

            otherlv_1=(Token)match(input,127,FollowSets000.FOLLOW_127_in_ruleLiteralBoolean14011); 

                	newLeafNode(otherlv_1, grammarAccess.getLiteralBooleanAccess().getLiteralBooleanKeyword_1());
                

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
    // $ANTLR end "ruleLiteralBoolean"


    // $ANTLR start "entryRuleMessageSort"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6272:1: entryRuleMessageSort returns [String current=null] : iv_ruleMessageSort= ruleMessageSort EOF ;
    public final String entryRuleMessageSort() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMessageSort = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6273:2: (iv_ruleMessageSort= ruleMessageSort EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6274:2: iv_ruleMessageSort= ruleMessageSort EOF
            {
             newCompositeNode(grammarAccess.getMessageSortRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMessageSort_in_entryRuleMessageSort14048);
            iv_ruleMessageSort=ruleMessageSort();

            state._fsp--;

             current =iv_ruleMessageSort.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMessageSort14059); 

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
    // $ANTLR end "entryRuleMessageSort"


    // $ANTLR start "ruleMessageSort"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6281:1: ruleMessageSort returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'MessageSort' ;
    public final AntlrDatatypeRuleToken ruleMessageSort() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6284:28: (kw= 'MessageSort' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6286:2: kw= 'MessageSort'
            {
            kw=(Token)match(input,128,FollowSets000.FOLLOW_128_in_ruleMessageSort14096); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getMessageSortAccess().getMessageSortKeyword()); 
                

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
    // $ANTLR end "ruleMessageSort"


    // $ANTLR start "entryRuleParameterValueMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6299:1: entryRuleParameterValueMapping returns [EObject current=null] : iv_ruleParameterValueMapping= ruleParameterValueMapping EOF ;
    public final EObject entryRuleParameterValueMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValueMapping = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6300:2: (iv_ruleParameterValueMapping= ruleParameterValueMapping EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6301:2: iv_ruleParameterValueMapping= ruleParameterValueMapping EOF
            {
             newCompositeNode(grammarAccess.getParameterValueMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterValueMapping_in_entryRuleParameterValueMapping14135);
            iv_ruleParameterValueMapping=ruleParameterValueMapping();

            state._fsp--;

             current =iv_ruleParameterValueMapping; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterValueMapping14145); 

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
    // $ANTLR end "entryRuleParameterValueMapping"


    // $ANTLR start "ruleParameterValueMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6308:1: ruleParameterValueMapping returns [EObject current=null] : (otherlv_0= 'ParameterValueMapping' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleValueSpecification ) ) otherlv_6= '}' ) ;
    public final EObject ruleParameterValueMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6311:28: ( (otherlv_0= 'ParameterValueMapping' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleValueSpecification ) ) otherlv_6= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6312:1: (otherlv_0= 'ParameterValueMapping' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleValueSpecification ) ) otherlv_6= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6312:1: (otherlv_0= 'ParameterValueMapping' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleValueSpecification ) ) otherlv_6= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6312:3: otherlv_0= 'ParameterValueMapping' otherlv_1= '{' otherlv_2= 'parameter' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleValueSpecification ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,129,FollowSets000.FOLLOW_129_in_ruleParameterValueMapping14182); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterValueMappingAccess().getParameterValueMappingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameterValueMapping14194); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterValueMappingAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,121,FollowSets000.FOLLOW_121_in_ruleParameterValueMapping14206); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterValueMappingAccess().getParameterKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6324:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6325:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6325:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6326:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterValueMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterValueMappingAccess().getParameterParameterCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameterValueMapping14229);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,119,FollowSets000.FOLLOW_119_in_ruleParameterValueMapping14241); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterValueMappingAccess().getValueKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6343:1: ( (lv_value_5_0= ruleValueSpecification ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6344:1: (lv_value_5_0= ruleValueSpecification )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6344:1: (lv_value_5_0= ruleValueSpecification )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6345:3: lv_value_5_0= ruleValueSpecification
            {
             
            	        newCompositeNode(grammarAccess.getParameterValueMappingAccess().getValueValueSpecificationParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleParameterValueMapping14262);
            lv_value_5_0=ruleValueSpecification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterValueMappingRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"ValueSpecification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParameterValueMapping14274); 

                	newLeafNode(otherlv_6, grammarAccess.getParameterValueMappingAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleParameterValueMapping"


    // $ANTLR start "entryRuleClassifierMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6373:1: entryRuleClassifierMapping returns [EObject current=null] : iv_ruleClassifierMapping= ruleClassifierMapping EOF ;
    public final EObject entryRuleClassifierMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassifierMapping = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6374:2: (iv_ruleClassifierMapping= ruleClassifierMapping EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6375:2: iv_ruleClassifierMapping= ruleClassifierMapping EOF
            {
             newCompositeNode(grammarAccess.getClassifierMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleClassifierMapping_in_entryRuleClassifierMapping14310);
            iv_ruleClassifierMapping=ruleClassifierMapping();

            state._fsp--;

             current =iv_ruleClassifierMapping; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleClassifierMapping14320); 

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
    // $ANTLR end "entryRuleClassifierMapping"


    // $ANTLR start "ruleClassifierMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6382:1: ruleClassifierMapping returns [EObject current=null] : (otherlv_0= 'ClassifierMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) (otherlv_6= 'operationMappings' otherlv_7= '{' ( (lv_operationMappings_8_0= ruleOperationMapping ) ) (otherlv_9= ',' ( (lv_operationMappings_10_0= ruleOperationMapping ) ) )* otherlv_11= '}' )? (otherlv_12= 'attributeMappings' otherlv_13= '{' ( (lv_attributeMappings_14_0= ruleAttributeMapping ) ) (otherlv_15= ',' ( (lv_attributeMappings_16_0= ruleAttributeMapping ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) ;
    public final EObject ruleClassifierMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_operationMappings_8_0 = null;

        EObject lv_operationMappings_10_0 = null;

        EObject lv_attributeMappings_14_0 = null;

        EObject lv_attributeMappings_16_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6385:28: ( (otherlv_0= 'ClassifierMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) (otherlv_6= 'operationMappings' otherlv_7= '{' ( (lv_operationMappings_8_0= ruleOperationMapping ) ) (otherlv_9= ',' ( (lv_operationMappings_10_0= ruleOperationMapping ) ) )* otherlv_11= '}' )? (otherlv_12= 'attributeMappings' otherlv_13= '{' ( (lv_attributeMappings_14_0= ruleAttributeMapping ) ) (otherlv_15= ',' ( (lv_attributeMappings_16_0= ruleAttributeMapping ) ) )* otherlv_17= '}' )? otherlv_18= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6386:1: (otherlv_0= 'ClassifierMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) (otherlv_6= 'operationMappings' otherlv_7= '{' ( (lv_operationMappings_8_0= ruleOperationMapping ) ) (otherlv_9= ',' ( (lv_operationMappings_10_0= ruleOperationMapping ) ) )* otherlv_11= '}' )? (otherlv_12= 'attributeMappings' otherlv_13= '{' ( (lv_attributeMappings_14_0= ruleAttributeMapping ) ) (otherlv_15= ',' ( (lv_attributeMappings_16_0= ruleAttributeMapping ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6386:1: (otherlv_0= 'ClassifierMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) (otherlv_6= 'operationMappings' otherlv_7= '{' ( (lv_operationMappings_8_0= ruleOperationMapping ) ) (otherlv_9= ',' ( (lv_operationMappings_10_0= ruleOperationMapping ) ) )* otherlv_11= '}' )? (otherlv_12= 'attributeMappings' otherlv_13= '{' ( (lv_attributeMappings_14_0= ruleAttributeMapping ) ) (otherlv_15= ',' ( (lv_attributeMappings_16_0= ruleAttributeMapping ) ) )* otherlv_17= '}' )? otherlv_18= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6386:3: otherlv_0= 'ClassifierMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) (otherlv_6= 'operationMappings' otherlv_7= '{' ( (lv_operationMappings_8_0= ruleOperationMapping ) ) (otherlv_9= ',' ( (lv_operationMappings_10_0= ruleOperationMapping ) ) )* otherlv_11= '}' )? (otherlv_12= 'attributeMappings' otherlv_13= '{' ( (lv_attributeMappings_14_0= ruleAttributeMapping ) ) (otherlv_15= ',' ( (lv_attributeMappings_16_0= ruleAttributeMapping ) ) )* otherlv_17= '}' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,130,FollowSets000.FOLLOW_130_in_ruleClassifierMapping14357); 

                	newLeafNode(otherlv_0, grammarAccess.getClassifierMappingAccess().getClassifierMappingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClassifierMapping14369); 

                	newLeafNode(otherlv_1, grammarAccess.getClassifierMappingAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,131,FollowSets000.FOLLOW_131_in_ruleClassifierMapping14381); 

                	newLeafNode(otherlv_2, grammarAccess.getClassifierMappingAccess().getFromElementKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6398:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6399:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6399:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6400:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassifierMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getClassifierMappingAccess().getFromElementClassifierCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClassifierMapping14404);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,132,FollowSets000.FOLLOW_132_in_ruleClassifierMapping14416); 

                	newLeafNode(otherlv_4, grammarAccess.getClassifierMappingAccess().getToElementKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6417:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6418:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6418:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6419:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassifierMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getClassifierMappingAccess().getToElementClassifierCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleClassifierMapping14439);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6432:2: (otherlv_6= 'operationMappings' otherlv_7= '{' ( (lv_operationMappings_8_0= ruleOperationMapping ) ) (otherlv_9= ',' ( (lv_operationMappings_10_0= ruleOperationMapping ) ) )* otherlv_11= '}' )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==133) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6432:4: otherlv_6= 'operationMappings' otherlv_7= '{' ( (lv_operationMappings_8_0= ruleOperationMapping ) ) (otherlv_9= ',' ( (lv_operationMappings_10_0= ruleOperationMapping ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,133,FollowSets000.FOLLOW_133_in_ruleClassifierMapping14452); 

                        	newLeafNode(otherlv_6, grammarAccess.getClassifierMappingAccess().getOperationMappingsKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClassifierMapping14464); 

                        	newLeafNode(otherlv_7, grammarAccess.getClassifierMappingAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6440:1: ( (lv_operationMappings_8_0= ruleOperationMapping ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6441:1: (lv_operationMappings_8_0= ruleOperationMapping )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6441:1: (lv_operationMappings_8_0= ruleOperationMapping )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6442:3: lv_operationMappings_8_0= ruleOperationMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassifierMappingAccess().getOperationMappingsOperationMappingParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleOperationMapping_in_ruleClassifierMapping14485);
                    lv_operationMappings_8_0=ruleOperationMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassifierMappingRule());
                    	        }
                           		add(
                           			current, 
                           			"operationMappings",
                            		lv_operationMappings_8_0, 
                            		"OperationMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6458:2: (otherlv_9= ',' ( (lv_operationMappings_10_0= ruleOperationMapping ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==15) ) {
                            alt103=1;
                        }


                        switch (alt103) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6458:4: otherlv_9= ',' ( (lv_operationMappings_10_0= ruleOperationMapping ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClassifierMapping14498); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getClassifierMappingAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6462:1: ( (lv_operationMappings_10_0= ruleOperationMapping ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6463:1: (lv_operationMappings_10_0= ruleOperationMapping )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6463:1: (lv_operationMappings_10_0= ruleOperationMapping )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6464:3: lv_operationMappings_10_0= ruleOperationMapping
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassifierMappingAccess().getOperationMappingsOperationMappingParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleOperationMapping_in_ruleClassifierMapping14519);
                    	    lv_operationMappings_10_0=ruleOperationMapping();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClassifierMappingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operationMappings",
                    	            		lv_operationMappings_10_0, 
                    	            		"OperationMapping");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClassifierMapping14533); 

                        	newLeafNode(otherlv_11, grammarAccess.getClassifierMappingAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6484:3: (otherlv_12= 'attributeMappings' otherlv_13= '{' ( (lv_attributeMappings_14_0= ruleAttributeMapping ) ) (otherlv_15= ',' ( (lv_attributeMappings_16_0= ruleAttributeMapping ) ) )* otherlv_17= '}' )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==134) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6484:5: otherlv_12= 'attributeMappings' otherlv_13= '{' ( (lv_attributeMappings_14_0= ruleAttributeMapping ) ) (otherlv_15= ',' ( (lv_attributeMappings_16_0= ruleAttributeMapping ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,134,FollowSets000.FOLLOW_134_in_ruleClassifierMapping14548); 

                        	newLeafNode(otherlv_12, grammarAccess.getClassifierMappingAccess().getAttributeMappingsKeyword_7_0());
                        
                    otherlv_13=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleClassifierMapping14560); 

                        	newLeafNode(otherlv_13, grammarAccess.getClassifierMappingAccess().getLeftCurlyBracketKeyword_7_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6492:1: ( (lv_attributeMappings_14_0= ruleAttributeMapping ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6493:1: (lv_attributeMappings_14_0= ruleAttributeMapping )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6493:1: (lv_attributeMappings_14_0= ruleAttributeMapping )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6494:3: lv_attributeMappings_14_0= ruleAttributeMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getClassifierMappingAccess().getAttributeMappingsAttributeMappingParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeMapping_in_ruleClassifierMapping14581);
                    lv_attributeMappings_14_0=ruleAttributeMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClassifierMappingRule());
                    	        }
                           		add(
                           			current, 
                           			"attributeMappings",
                            		lv_attributeMappings_14_0, 
                            		"AttributeMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6510:2: (otherlv_15= ',' ( (lv_attributeMappings_16_0= ruleAttributeMapping ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==15) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6510:4: otherlv_15= ',' ( (lv_attributeMappings_16_0= ruleAttributeMapping ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleClassifierMapping14594); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getClassifierMappingAccess().getCommaKeyword_7_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6514:1: ( (lv_attributeMappings_16_0= ruleAttributeMapping ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6515:1: (lv_attributeMappings_16_0= ruleAttributeMapping )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6515:1: (lv_attributeMappings_16_0= ruleAttributeMapping )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6516:3: lv_attributeMappings_16_0= ruleAttributeMapping
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClassifierMappingAccess().getAttributeMappingsAttributeMappingParserRuleCall_7_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleAttributeMapping_in_ruleClassifierMapping14615);
                    	    lv_attributeMappings_16_0=ruleAttributeMapping();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClassifierMappingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributeMappings",
                    	            		lv_attributeMappings_16_0, 
                    	            		"AttributeMapping");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop105;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClassifierMapping14629); 

                        	newLeafNode(otherlv_17, grammarAccess.getClassifierMappingAccess().getRightCurlyBracketKeyword_7_4());
                        

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleClassifierMapping14643); 

                	newLeafNode(otherlv_18, grammarAccess.getClassifierMappingAccess().getRightCurlyBracketKeyword_8());
                

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
    // $ANTLR end "ruleClassifierMapping"


    // $ANTLR start "entryRuleInstantiationType"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6548:1: entryRuleInstantiationType returns [String current=null] : iv_ruleInstantiationType= ruleInstantiationType EOF ;
    public final String entryRuleInstantiationType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInstantiationType = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6549:2: (iv_ruleInstantiationType= ruleInstantiationType EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6550:2: iv_ruleInstantiationType= ruleInstantiationType EOF
            {
             newCompositeNode(grammarAccess.getInstantiationTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleInstantiationType_in_entryRuleInstantiationType14680);
            iv_ruleInstantiationType=ruleInstantiationType();

            state._fsp--;

             current =iv_ruleInstantiationType.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleInstantiationType14691); 

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
    // $ANTLR end "entryRuleInstantiationType"


    // $ANTLR start "ruleInstantiationType"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6557:1: ruleInstantiationType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'InstantiationType' ;
    public final AntlrDatatypeRuleToken ruleInstantiationType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6560:28: (kw= 'InstantiationType' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6562:2: kw= 'InstantiationType'
            {
            kw=(Token)match(input,135,FollowSets000.FOLLOW_135_in_ruleInstantiationType14728); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInstantiationTypeAccess().getInstantiationTypeKeyword()); 
                

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


    // $ANTLR start "entryRuleOperationMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6575:1: entryRuleOperationMapping returns [EObject current=null] : iv_ruleOperationMapping= ruleOperationMapping EOF ;
    public final EObject entryRuleOperationMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperationMapping = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6576:2: (iv_ruleOperationMapping= ruleOperationMapping EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6577:2: iv_ruleOperationMapping= ruleOperationMapping EOF
            {
             newCompositeNode(grammarAccess.getOperationMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleOperationMapping_in_entryRuleOperationMapping14767);
            iv_ruleOperationMapping=ruleOperationMapping();

            state._fsp--;

             current =iv_ruleOperationMapping; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleOperationMapping14777); 

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
    // $ANTLR end "entryRuleOperationMapping"


    // $ANTLR start "ruleOperationMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6584:1: ruleOperationMapping returns [EObject current=null] : (otherlv_0= 'OperationMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) (otherlv_6= 'parameterMappings' otherlv_7= '{' ( (lv_parameterMappings_8_0= ruleParameterMapping ) ) (otherlv_9= ',' ( (lv_parameterMappings_10_0= ruleParameterMapping ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleOperationMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_parameterMappings_8_0 = null;

        EObject lv_parameterMappings_10_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6587:28: ( (otherlv_0= 'OperationMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) (otherlv_6= 'parameterMappings' otherlv_7= '{' ( (lv_parameterMappings_8_0= ruleParameterMapping ) ) (otherlv_9= ',' ( (lv_parameterMappings_10_0= ruleParameterMapping ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6588:1: (otherlv_0= 'OperationMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) (otherlv_6= 'parameterMappings' otherlv_7= '{' ( (lv_parameterMappings_8_0= ruleParameterMapping ) ) (otherlv_9= ',' ( (lv_parameterMappings_10_0= ruleParameterMapping ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6588:1: (otherlv_0= 'OperationMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) (otherlv_6= 'parameterMappings' otherlv_7= '{' ( (lv_parameterMappings_8_0= ruleParameterMapping ) ) (otherlv_9= ',' ( (lv_parameterMappings_10_0= ruleParameterMapping ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6588:3: otherlv_0= 'OperationMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) (otherlv_6= 'parameterMappings' otherlv_7= '{' ( (lv_parameterMappings_8_0= ruleParameterMapping ) ) (otherlv_9= ',' ( (lv_parameterMappings_10_0= ruleParameterMapping ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,136,FollowSets000.FOLLOW_136_in_ruleOperationMapping14814); 

                	newLeafNode(otherlv_0, grammarAccess.getOperationMappingAccess().getOperationMappingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperationMapping14826); 

                	newLeafNode(otherlv_1, grammarAccess.getOperationMappingAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,131,FollowSets000.FOLLOW_131_in_ruleOperationMapping14838); 

                	newLeafNode(otherlv_2, grammarAccess.getOperationMappingAccess().getFromElementKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6600:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6601:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6601:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6602:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOperationMappingAccess().getFromElementOperationCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperationMapping14861);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,132,FollowSets000.FOLLOW_132_in_ruleOperationMapping14873); 

                	newLeafNode(otherlv_4, grammarAccess.getOperationMappingAccess().getToElementKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6619:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6620:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6620:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6621:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getOperationMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getOperationMappingAccess().getToElementOperationCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleOperationMapping14896);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6634:2: (otherlv_6= 'parameterMappings' otherlv_7= '{' ( (lv_parameterMappings_8_0= ruleParameterMapping ) ) (otherlv_9= ',' ( (lv_parameterMappings_10_0= ruleParameterMapping ) ) )* otherlv_11= '}' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==137) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6634:4: otherlv_6= 'parameterMappings' otherlv_7= '{' ( (lv_parameterMappings_8_0= ruleParameterMapping ) ) (otherlv_9= ',' ( (lv_parameterMappings_10_0= ruleParameterMapping ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,137,FollowSets000.FOLLOW_137_in_ruleOperationMapping14909); 

                        	newLeafNode(otherlv_6, grammarAccess.getOperationMappingAccess().getParameterMappingsKeyword_6_0());
                        
                    otherlv_7=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleOperationMapping14921); 

                        	newLeafNode(otherlv_7, grammarAccess.getOperationMappingAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6642:1: ( (lv_parameterMappings_8_0= ruleParameterMapping ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6643:1: (lv_parameterMappings_8_0= ruleParameterMapping )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6643:1: (lv_parameterMappings_8_0= ruleParameterMapping )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6644:3: lv_parameterMappings_8_0= ruleParameterMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getOperationMappingAccess().getParameterMappingsParameterMappingParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleParameterMapping_in_ruleOperationMapping14942);
                    lv_parameterMappings_8_0=ruleParameterMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOperationMappingRule());
                    	        }
                           		add(
                           			current, 
                           			"parameterMappings",
                            		lv_parameterMappings_8_0, 
                            		"ParameterMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6660:2: (otherlv_9= ',' ( (lv_parameterMappings_10_0= ruleParameterMapping ) ) )*
                    loop107:
                    do {
                        int alt107=2;
                        int LA107_0 = input.LA(1);

                        if ( (LA107_0==15) ) {
                            alt107=1;
                        }


                        switch (alt107) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6660:4: otherlv_9= ',' ( (lv_parameterMappings_10_0= ruleParameterMapping ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleOperationMapping14955); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getOperationMappingAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6664:1: ( (lv_parameterMappings_10_0= ruleParameterMapping ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6665:1: (lv_parameterMappings_10_0= ruleParameterMapping )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6665:1: (lv_parameterMappings_10_0= ruleParameterMapping )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6666:3: lv_parameterMappings_10_0= ruleParameterMapping
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getOperationMappingAccess().getParameterMappingsParameterMappingParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleParameterMapping_in_ruleOperationMapping14976);
                    	    lv_parameterMappings_10_0=ruleParameterMapping();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getOperationMappingRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameterMappings",
                    	            		lv_parameterMappings_10_0, 
                    	            		"ParameterMapping");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop107;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOperationMapping14990); 

                        	newLeafNode(otherlv_11, grammarAccess.getOperationMappingAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleOperationMapping15004); 

                	newLeafNode(otherlv_12, grammarAccess.getOperationMappingAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleOperationMapping"


    // $ANTLR start "entryRuleAttributeMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6698:1: entryRuleAttributeMapping returns [EObject current=null] : iv_ruleAttributeMapping= ruleAttributeMapping EOF ;
    public final EObject entryRuleAttributeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeMapping = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6699:2: (iv_ruleAttributeMapping= ruleAttributeMapping EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6700:2: iv_ruleAttributeMapping= ruleAttributeMapping EOF
            {
             newCompositeNode(grammarAccess.getAttributeMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAttributeMapping_in_entryRuleAttributeMapping15040);
            iv_ruleAttributeMapping=ruleAttributeMapping();

            state._fsp--;

             current =iv_ruleAttributeMapping; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeMapping15050); 

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
    // $ANTLR end "entryRuleAttributeMapping"


    // $ANTLR start "ruleAttributeMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6707:1: ruleAttributeMapping returns [EObject current=null] : (otherlv_0= 'AttributeMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleAttributeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6710:28: ( (otherlv_0= 'AttributeMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6711:1: (otherlv_0= 'AttributeMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6711:1: (otherlv_0= 'AttributeMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6711:3: otherlv_0= 'AttributeMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,138,FollowSets000.FOLLOW_138_in_ruleAttributeMapping15087); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeMappingAccess().getAttributeMappingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAttributeMapping15099); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeMappingAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,131,FollowSets000.FOLLOW_131_in_ruleAttributeMapping15111); 

                	newLeafNode(otherlv_2, grammarAccess.getAttributeMappingAccess().getFromElementKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6723:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6724:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6724:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6725:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getFromElementAttributeCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttributeMapping15134);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,132,FollowSets000.FOLLOW_132_in_ruleAttributeMapping15146); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeMappingAccess().getToElementKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6742:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6743:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6743:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6744:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAttributeMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAttributeMappingAccess().getToElementAttributeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttributeMapping15169);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleAttributeMapping15181); 

                	newLeafNode(otherlv_6, grammarAccess.getAttributeMappingAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleAttributeMapping"


    // $ANTLR start "entryRuleParameterMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6769:1: entryRuleParameterMapping returns [EObject current=null] : iv_ruleParameterMapping= ruleParameterMapping EOF ;
    public final EObject entryRuleParameterMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterMapping = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6770:2: (iv_ruleParameterMapping= ruleParameterMapping EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6771:2: iv_ruleParameterMapping= ruleParameterMapping EOF
            {
             newCompositeNode(grammarAccess.getParameterMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleParameterMapping_in_entryRuleParameterMapping15217);
            iv_ruleParameterMapping=ruleParameterMapping();

            state._fsp--;

             current =iv_ruleParameterMapping; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleParameterMapping15227); 

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
    // $ANTLR end "entryRuleParameterMapping"


    // $ANTLR start "ruleParameterMapping"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6778:1: ruleParameterMapping returns [EObject current=null] : (otherlv_0= 'ParameterMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleParameterMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6781:28: ( (otherlv_0= 'ParameterMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6782:1: (otherlv_0= 'ParameterMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6782:1: (otherlv_0= 'ParameterMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6782:3: otherlv_0= 'ParameterMapping' otherlv_1= '{' otherlv_2= 'fromElement' ( ( ruleEString ) ) otherlv_4= 'toElement' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,139,FollowSets000.FOLLOW_139_in_ruleParameterMapping15264); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterMappingAccess().getParameterMappingKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleParameterMapping15276); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterMappingAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,131,FollowSets000.FOLLOW_131_in_ruleParameterMapping15288); 

                	newLeafNode(otherlv_2, grammarAccess.getParameterMappingAccess().getFromElementKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6794:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6795:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6795:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6796:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterMappingAccess().getFromElementParameterCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameterMapping15311);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,132,FollowSets000.FOLLOW_132_in_ruleParameterMapping15323); 

                	newLeafNode(otherlv_4, grammarAccess.getParameterMappingAccess().getToElementKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6813:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6814:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6814:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6815:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getParameterMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getParameterMappingAccess().getToElementParameterCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleParameterMapping15346);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleParameterMapping15358); 

                	newLeafNode(otherlv_6, grammarAccess.getParameterMappingAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleParameterMapping"


    // $ANTLR start "entryRuleContainerMap"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6840:1: entryRuleContainerMap returns [EObject current=null] : iv_ruleContainerMap= ruleContainerMap EOF ;
    public final EObject entryRuleContainerMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerMap = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6841:2: (iv_ruleContainerMap= ruleContainerMap EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6842:2: iv_ruleContainerMap= ruleContainerMap EOF
            {
             newCompositeNode(grammarAccess.getContainerMapRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainerMap_in_entryRuleContainerMap15394);
            iv_ruleContainerMap=ruleContainerMap();

            state._fsp--;

             current =iv_ruleContainerMap; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainerMap15404); 

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
    // $ANTLR end "entryRuleContainerMap"


    // $ANTLR start "ruleContainerMap"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6849:1: ruleContainerMap returns [EObject current=null] : (otherlv_0= 'ContainerMap' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' otherlv_5= '{' ( (lv_value_6_0= ruleElementMap ) ) (otherlv_7= ',' ( (lv_value_8_0= ruleElementMap ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleContainerMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_value_6_0 = null;

        EObject lv_value_8_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6852:28: ( (otherlv_0= 'ContainerMap' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' otherlv_5= '{' ( (lv_value_6_0= ruleElementMap ) ) (otherlv_7= ',' ( (lv_value_8_0= ruleElementMap ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6853:1: (otherlv_0= 'ContainerMap' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' otherlv_5= '{' ( (lv_value_6_0= ruleElementMap ) ) (otherlv_7= ',' ( (lv_value_8_0= ruleElementMap ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6853:1: (otherlv_0= 'ContainerMap' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' otherlv_5= '{' ( (lv_value_6_0= ruleElementMap ) ) (otherlv_7= ',' ( (lv_value_8_0= ruleElementMap ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6853:3: otherlv_0= 'ContainerMap' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' otherlv_5= '{' ( (lv_value_6_0= ruleElementMap ) ) (otherlv_7= ',' ( (lv_value_8_0= ruleElementMap ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,140,FollowSets000.FOLLOW_140_in_ruleContainerMap15441); 

                	newLeafNode(otherlv_0, grammarAccess.getContainerMapAccess().getContainerMapKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContainerMap15453); 

                	newLeafNode(otherlv_1, grammarAccess.getContainerMapAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,141,FollowSets000.FOLLOW_141_in_ruleContainerMap15465); 

                	newLeafNode(otherlv_2, grammarAccess.getContainerMapAccess().getKeyKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6865:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6866:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6866:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6867:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContainerMapRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContainerMapAccess().getKeyEObjectCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleContainerMap15488);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,119,FollowSets000.FOLLOW_119_in_ruleContainerMap15500); 

                	newLeafNode(otherlv_4, grammarAccess.getContainerMapAccess().getValueKeyword_4());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleContainerMap15512); 

                	newLeafNode(otherlv_5, grammarAccess.getContainerMapAccess().getLeftCurlyBracketKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6888:1: ( (lv_value_6_0= ruleElementMap ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6889:1: (lv_value_6_0= ruleElementMap )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6889:1: (lv_value_6_0= ruleElementMap )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6890:3: lv_value_6_0= ruleElementMap
            {
             
            	        newCompositeNode(grammarAccess.getContainerMapAccess().getValueElementMapParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleElementMap_in_ruleContainerMap15533);
            lv_value_6_0=ruleElementMap();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainerMapRule());
            	        }
                   		add(
                   			current, 
                   			"value",
                    		lv_value_6_0, 
                    		"ElementMap");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6906:2: (otherlv_7= ',' ( (lv_value_8_0= ruleElementMap ) ) )*
            loop109:
            do {
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==15) ) {
                    alt109=1;
                }


                switch (alt109) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6906:4: otherlv_7= ',' ( (lv_value_8_0= ruleElementMap ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleContainerMap15546); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContainerMapAccess().getCommaKeyword_7_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6910:1: ( (lv_value_8_0= ruleElementMap ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6911:1: (lv_value_8_0= ruleElementMap )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6911:1: (lv_value_8_0= ruleElementMap )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6912:3: lv_value_8_0= ruleElementMap
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerMapAccess().getValueElementMapParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleElementMap_in_ruleContainerMap15567);
            	    lv_value_8_0=ruleElementMap();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerMapRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"value",
            	            		lv_value_8_0, 
            	            		"ElementMap");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop109;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContainerMap15581); 

                	newLeafNode(otherlv_9, grammarAccess.getContainerMapAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleContainerMap15593); 

                	newLeafNode(otherlv_10, grammarAccess.getContainerMapAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleContainerMap"


    // $ANTLR start "entryRuleElementMap"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6946:1: entryRuleElementMap returns [EObject current=null] : iv_ruleElementMap= ruleElementMap EOF ;
    public final EObject entryRuleElementMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementMap = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6947:2: (iv_ruleElementMap= ruleElementMap EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6948:2: iv_ruleElementMap= ruleElementMap EOF
            {
             newCompositeNode(grammarAccess.getElementMapRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElementMap_in_entryRuleElementMap15631);
            iv_ruleElementMap=ruleElementMap();

            state._fsp--;

             current =iv_ruleElementMap; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElementMap15641); 

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
    // $ANTLR end "entryRuleElementMap"


    // $ANTLR start "ruleElementMap"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6955:1: ruleElementMap returns [EObject current=null] : (otherlv_0= 'ElementMap' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleLayoutElement ) ) otherlv_6= '}' ) ;
    public final EObject ruleElementMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6958:28: ( (otherlv_0= 'ElementMap' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleLayoutElement ) ) otherlv_6= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6959:1: (otherlv_0= 'ElementMap' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleLayoutElement ) ) otherlv_6= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6959:1: (otherlv_0= 'ElementMap' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleLayoutElement ) ) otherlv_6= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6959:3: otherlv_0= 'ElementMap' otherlv_1= '{' otherlv_2= 'key' ( ( ruleEString ) ) otherlv_4= 'value' ( (lv_value_5_0= ruleLayoutElement ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,142,FollowSets000.FOLLOW_142_in_ruleElementMap15678); 

                	newLeafNode(otherlv_0, grammarAccess.getElementMapAccess().getElementMapKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElementMap15690); 

                	newLeafNode(otherlv_1, grammarAccess.getElementMapAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,141,FollowSets000.FOLLOW_141_in_ruleElementMap15702); 

                	newLeafNode(otherlv_2, grammarAccess.getElementMapAccess().getKeyKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6971:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6972:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6972:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6973:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getElementMapRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getElementMapAccess().getKeyEObjectCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleElementMap15725);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,119,FollowSets000.FOLLOW_119_in_ruleElementMap15737); 

                	newLeafNode(otherlv_4, grammarAccess.getElementMapAccess().getValueKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6990:1: ( (lv_value_5_0= ruleLayoutElement ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6991:1: (lv_value_5_0= ruleLayoutElement )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6991:1: (lv_value_5_0= ruleLayoutElement )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:6992:3: lv_value_5_0= ruleLayoutElement
            {
             
            	        newCompositeNode(grammarAccess.getElementMapAccess().getValueLayoutElementParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleLayoutElement_in_ruleElementMap15758);
            lv_value_5_0=ruleLayoutElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getElementMapRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"LayoutElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleElementMap15770); 

                	newLeafNode(otherlv_6, grammarAccess.getElementMapAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleElementMap"


    // $ANTLR start "entryRuleLayoutElement"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7020:1: entryRuleLayoutElement returns [EObject current=null] : iv_ruleLayoutElement= ruleLayoutElement EOF ;
    public final EObject entryRuleLayoutElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutElement = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7021:2: (iv_ruleLayoutElement= ruleLayoutElement EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7022:2: iv_ruleLayoutElement= ruleLayoutElement EOF
            {
             newCompositeNode(grammarAccess.getLayoutElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement15806);
            iv_ruleLayoutElement=ruleLayoutElement();

            state._fsp--;

             current =iv_ruleLayoutElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLayoutElement15816); 

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
    // $ANTLR end "entryRuleLayoutElement"


    // $ANTLR start "ruleLayoutElement"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7029:1: ruleLayoutElement returns [EObject current=null] : (otherlv_0= 'LayoutElement' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEFloat ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEFloat ) ) otherlv_6= '}' ) ;
    public final EObject ruleLayoutElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_5_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7032:28: ( (otherlv_0= 'LayoutElement' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEFloat ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEFloat ) ) otherlv_6= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7033:1: (otherlv_0= 'LayoutElement' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEFloat ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEFloat ) ) otherlv_6= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7033:1: (otherlv_0= 'LayoutElement' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEFloat ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEFloat ) ) otherlv_6= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7033:3: otherlv_0= 'LayoutElement' otherlv_1= '{' otherlv_2= 'x' ( (lv_x_3_0= ruleEFloat ) ) otherlv_4= 'y' ( (lv_y_5_0= ruleEFloat ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,143,FollowSets000.FOLLOW_143_in_ruleLayoutElement15853); 

                	newLeafNode(otherlv_0, grammarAccess.getLayoutElementAccess().getLayoutElementKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleLayoutElement15865); 

                	newLeafNode(otherlv_1, grammarAccess.getLayoutElementAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,144,FollowSets000.FOLLOW_144_in_ruleLayoutElement15877); 

                	newLeafNode(otherlv_2, grammarAccess.getLayoutElementAccess().getXKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7045:1: ( (lv_x_3_0= ruleEFloat ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7046:1: (lv_x_3_0= ruleEFloat )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7046:1: (lv_x_3_0= ruleEFloat )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7047:3: lv_x_3_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getLayoutElementAccess().getXEFloatParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleLayoutElement15898);
            lv_x_3_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLayoutElementRule());
            	        }
                   		set(
                   			current, 
                   			"x",
                    		lv_x_3_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,145,FollowSets000.FOLLOW_145_in_ruleLayoutElement15910); 

                	newLeafNode(otherlv_4, grammarAccess.getLayoutElementAccess().getYKeyword_4());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7067:1: ( (lv_y_5_0= ruleEFloat ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7068:1: (lv_y_5_0= ruleEFloat )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7068:1: (lv_y_5_0= ruleEFloat )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7069:3: lv_y_5_0= ruleEFloat
            {
             
            	        newCompositeNode(grammarAccess.getLayoutElementAccess().getYEFloatParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_ruleLayoutElement15931);
            lv_y_5_0=ruleEFloat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLayoutElementRule());
            	        }
                   		set(
                   			current, 
                   			"y",
                    		lv_y_5_0, 
                    		"EFloat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleLayoutElement15943); 

                	newLeafNode(otherlv_6, grammarAccess.getLayoutElementAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleLayoutElement"


    // $ANTLR start "entryRuleEFloat"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7097:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7098:2: (iv_ruleEFloat= ruleEFloat EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7099:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEFloat_in_entryRuleEFloat15980);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEFloat15991); 

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
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7106:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7109:28: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7110:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7110:1: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7110:2: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7110:2: (kw= '-' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==72) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7111:2: kw= '-'
                    {
                    kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleEFloat16030); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7116:3: (this_INT_1= RULE_INT )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==RULE_INT) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7116:8: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat16048); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,146,FollowSets000.FOLLOW_146_in_ruleEFloat16068); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2()); 
                
            this_INT_3=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat16083); 

            		current.merge(this_INT_3);
                
             
                newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3()); 
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7136:1: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=147 && LA114_0<=148)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7136:2: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7136:2: (kw= 'E' | kw= 'e' )
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==147) ) {
                        alt112=1;
                    }
                    else if ( (LA112_0==148) ) {
                        alt112=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;
                    }
                    switch (alt112) {
                        case 1 :
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7137:2: kw= 'E'
                            {
                            kw=(Token)match(input,147,FollowSets000.FOLLOW_147_in_ruleEFloat16103); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7144:2: kw= 'e'
                            {
                            kw=(Token)match(input,148,FollowSets000.FOLLOW_148_in_ruleEFloat16122); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1()); 
                                

                            }
                            break;

                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7149:2: (kw= '-' )?
                    int alt113=2;
                    int LA113_0 = input.LA(1);

                    if ( (LA113_0==72) ) {
                        alt113=1;
                    }
                    switch (alt113) {
                        case 1 :
                            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7150:2: kw= '-'
                            {
                            kw=(Token)match(input,72,FollowSets000.FOLLOW_72_in_ruleEFloat16137); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1()); 
                                

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEFloat16154); 

                    		current.merge(this_INT_7);
                        
                     
                        newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2()); 
                        

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
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleStateMachine"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7170:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7171:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7172:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleStateMachine_in_entryRuleStateMachine16201);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleStateMachine16211); 

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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7179:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'StateMachine' otherlv_1= '{' otherlv_2= 'start' ( ( ruleEString ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? (otherlv_16= 'substitutions' otherlv_17= '{' ( (lv_substitutions_18_0= ruleSubstitution ) ) (otherlv_19= ',' ( (lv_substitutions_20_0= ruleSubstitution ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_states_6_0 = null;

        EObject lv_states_8_0 = null;

        EObject lv_transitions_12_0 = null;

        EObject lv_transitions_14_0 = null;

        EObject lv_substitutions_18_0 = null;

        EObject lv_substitutions_20_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7182:28: ( (otherlv_0= 'StateMachine' otherlv_1= '{' otherlv_2= 'start' ( ( ruleEString ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? (otherlv_16= 'substitutions' otherlv_17= '{' ( (lv_substitutions_18_0= ruleSubstitution ) ) (otherlv_19= ',' ( (lv_substitutions_20_0= ruleSubstitution ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7183:1: (otherlv_0= 'StateMachine' otherlv_1= '{' otherlv_2= 'start' ( ( ruleEString ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? (otherlv_16= 'substitutions' otherlv_17= '{' ( (lv_substitutions_18_0= ruleSubstitution ) ) (otherlv_19= ',' ( (lv_substitutions_20_0= ruleSubstitution ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7183:1: (otherlv_0= 'StateMachine' otherlv_1= '{' otherlv_2= 'start' ( ( ruleEString ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? (otherlv_16= 'substitutions' otherlv_17= '{' ( (lv_substitutions_18_0= ruleSubstitution ) ) (otherlv_19= ',' ( (lv_substitutions_20_0= ruleSubstitution ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7183:3: otherlv_0= 'StateMachine' otherlv_1= '{' otherlv_2= 'start' ( ( ruleEString ) ) (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )? (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )? (otherlv_16= 'substitutions' otherlv_17= '{' ( (lv_substitutions_18_0= ruleSubstitution ) ) (otherlv_19= ',' ( (lv_substitutions_20_0= ruleSubstitution ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,149,FollowSets000.FOLLOW_149_in_ruleStateMachine16248); 

                	newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine16260); 

                	newLeafNode(otherlv_1, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,150,FollowSets000.FOLLOW_150_in_ruleStateMachine16272); 

                	newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getStartKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7195:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7196:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7196:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7197:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateMachineRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStateMachineAccess().getStartStateCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleStateMachine16295);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7210:2: (otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}' )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==151) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7210:4: otherlv_4= 'states' otherlv_5= '{' ( (lv_states_6_0= ruleState ) ) (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,151,FollowSets000.FOLLOW_151_in_ruleStateMachine16308); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getStatesKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine16320); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7218:1: ( (lv_states_6_0= ruleState ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7219:1: (lv_states_6_0= ruleState )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7219:1: (lv_states_6_0= ruleState )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7220:3: lv_states_6_0= ruleState
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleStateMachine16341);
                    lv_states_6_0=ruleState();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"states",
                            		lv_states_6_0, 
                            		"State");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7236:2: (otherlv_7= ',' ( (lv_states_8_0= ruleState ) ) )*
                    loop115:
                    do {
                        int alt115=2;
                        int LA115_0 = input.LA(1);

                        if ( (LA115_0==15) ) {
                            alt115=1;
                        }


                        switch (alt115) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7236:4: otherlv_7= ',' ( (lv_states_8_0= ruleState ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine16354); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7240:1: ( (lv_states_8_0= ruleState ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7241:1: (lv_states_8_0= ruleState )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7241:1: (lv_states_8_0= ruleState )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7242:3: lv_states_8_0= ruleState
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleStateMachine16375);
                    	    lv_states_8_0=ruleState();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"states",
                    	            		lv_states_8_0, 
                    	            		"State");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop115;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine16389); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7262:3: (otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==152) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7262:5: otherlv_10= 'transitions' otherlv_11= '{' ( (lv_transitions_12_0= ruleTransition ) ) (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,152,FollowSets000.FOLLOW_152_in_ruleStateMachine16404); 

                        	newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getTransitionsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine16416); 

                        	newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7270:1: ( (lv_transitions_12_0= ruleTransition ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7271:1: (lv_transitions_12_0= ruleTransition )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7271:1: (lv_transitions_12_0= ruleTransition )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7272:3: lv_transitions_12_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStateMachine16437);
                    lv_transitions_12_0=ruleTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"transitions",
                            		lv_transitions_12_0, 
                            		"Transition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7288:2: (otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) ) )*
                    loop117:
                    do {
                        int alt117=2;
                        int LA117_0 = input.LA(1);

                        if ( (LA117_0==15) ) {
                            alt117=1;
                        }


                        switch (alt117) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7288:4: otherlv_13= ',' ( (lv_transitions_14_0= ruleTransition ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine16450); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7292:1: ( (lv_transitions_14_0= ruleTransition ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7293:1: (lv_transitions_14_0= ruleTransition )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7293:1: (lv_transitions_14_0= ruleTransition )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7294:3: lv_transitions_14_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleStateMachine16471);
                    	    lv_transitions_14_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_14_0, 
                    	            		"Transition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine16485); 

                        	newLeafNode(otherlv_15, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7314:3: (otherlv_16= 'substitutions' otherlv_17= '{' ( (lv_substitutions_18_0= ruleSubstitution ) ) (otherlv_19= ',' ( (lv_substitutions_20_0= ruleSubstitution ) ) )* otherlv_21= '}' )?
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==153) ) {
                alt120=1;
            }
            switch (alt120) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7314:5: otherlv_16= 'substitutions' otherlv_17= '{' ( (lv_substitutions_18_0= ruleSubstitution ) ) (otherlv_19= ',' ( (lv_substitutions_20_0= ruleSubstitution ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,153,FollowSets000.FOLLOW_153_in_ruleStateMachine16500); 

                        	newLeafNode(otherlv_16, grammarAccess.getStateMachineAccess().getSubstitutionsKeyword_6_0());
                        
                    otherlv_17=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleStateMachine16512); 

                        	newLeafNode(otherlv_17, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7322:1: ( (lv_substitutions_18_0= ruleSubstitution ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7323:1: (lv_substitutions_18_0= ruleSubstitution )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7323:1: (lv_substitutions_18_0= ruleSubstitution )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7324:3: lv_substitutions_18_0= ruleSubstitution
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateMachineAccess().getSubstitutionsSubstitutionParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_ruleStateMachine16533);
                    lv_substitutions_18_0=ruleSubstitution();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"substitutions",
                            		lv_substitutions_18_0, 
                            		"Substitution");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7340:2: (otherlv_19= ',' ( (lv_substitutions_20_0= ruleSubstitution ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==15) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7340:4: otherlv_19= ',' ( (lv_substitutions_20_0= ruleSubstitution ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleStateMachine16546); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getStateMachineAccess().getCommaKeyword_6_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7344:1: ( (lv_substitutions_20_0= ruleSubstitution ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7345:1: (lv_substitutions_20_0= ruleSubstitution )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7345:1: (lv_substitutions_20_0= ruleSubstitution )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7346:3: lv_substitutions_20_0= ruleSubstitution
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getSubstitutionsSubstitutionParserRuleCall_6_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleSubstitution_in_ruleStateMachine16567);
                    	    lv_substitutions_20_0=ruleSubstitution();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"substitutions",
                    	            		lv_substitutions_20_0, 
                    	            		"Substitution");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine16581); 

                        	newLeafNode(otherlv_21, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_6_4());
                        

                    }
                    break;

            }

            otherlv_22=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleStateMachine16595); 

                	newLeafNode(otherlv_22, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_7());
                

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
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleState"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7378:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7379:2: (iv_ruleState= ruleState EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7380:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState16631);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState16641); 

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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7387:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7390:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7391:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7391:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7391:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? otherlv_16= '}'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7391:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7392:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,154,FollowSets000.FOLLOW_154_in_ruleState16687); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7401:1: ( (lv_name_2_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7402:1: (lv_name_2_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7402:1: (lv_name_2_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7403:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState16708);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleState16720); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7423:1: (otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==155) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7423:3: otherlv_4= 'incomings' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,155,FollowSets000.FOLLOW_155_in_ruleState16733); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getIncomingsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleState16745); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftParenthesisKeyword_4_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7431:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7432:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7432:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7433:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getIncomingsTransitionCrossReference_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState16768);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7446:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop121:
                    do {
                        int alt121=2;
                        int LA121_0 = input.LA(1);

                        if ( (LA121_0==15) ) {
                            alt121=1;
                        }


                        switch (alt121) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7446:4: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState16781); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7450:1: ( ( ruleEString ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7451:1: ( ruleEString )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7451:1: ( ruleEString )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7452:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getIncomingsTransitionCrossReference_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState16804);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop121;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleState16818); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7469:3: (otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==156) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7469:5: otherlv_10= 'outgoings' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,156,FollowSets000.FOLLOW_156_in_ruleState16833); 

                        	newLeafNode(otherlv_10, grammarAccess.getStateAccess().getOutgoingsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleState16845); 

                        	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getLeftParenthesisKeyword_5_1());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7477:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7478:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7478:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7479:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStateRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingsTransitionCrossReference_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState16868);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7492:2: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop123:
                    do {
                        int alt123=2;
                        int LA123_0 = input.LA(1);

                        if ( (LA123_0==15) ) {
                            alt123=1;
                        }


                        switch (alt123) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7492:4: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState16881); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7496:1: ( ( ruleEString ) )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7497:1: ( ruleEString )
                    	    {
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7497:1: ( ruleEString )
                    	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7498:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStateRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getOutgoingsTransitionCrossReference_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState16904);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop123;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleState16918); 

                        	newLeafNode(otherlv_15, grammarAccess.getStateAccess().getRightParenthesisKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleState16932); 

                	newLeafNode(otherlv_16, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7527:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7528:2: (iv_ruleTransition= ruleTransition EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7529:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition16968);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition16978); 

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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7536:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'endState' ( ( ruleEString ) ) otherlv_5= 'startState' ( ( ruleEString ) ) (otherlv_7= 'signature' ( ( ruleEString ) ) )? (otherlv_9= 'guard' ( (lv_guard_10_0= ruleConstraint ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_guard_10_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7539:28: ( (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'endState' ( ( ruleEString ) ) otherlv_5= 'startState' ( ( ruleEString ) ) (otherlv_7= 'signature' ( ( ruleEString ) ) )? (otherlv_9= 'guard' ( (lv_guard_10_0= ruleConstraint ) ) )? otherlv_11= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7540:1: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'endState' ( ( ruleEString ) ) otherlv_5= 'startState' ( ( ruleEString ) ) (otherlv_7= 'signature' ( ( ruleEString ) ) )? (otherlv_9= 'guard' ( (lv_guard_10_0= ruleConstraint ) ) )? otherlv_11= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7540:1: (otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'endState' ( ( ruleEString ) ) otherlv_5= 'startState' ( ( ruleEString ) ) (otherlv_7= 'signature' ( ( ruleEString ) ) )? (otherlv_9= 'guard' ( (lv_guard_10_0= ruleConstraint ) ) )? otherlv_11= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7540:3: otherlv_0= 'Transition' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'endState' ( ( ruleEString ) ) otherlv_5= 'startState' ( ( ruleEString ) ) (otherlv_7= 'signature' ( ( ruleEString ) ) )? (otherlv_9= 'guard' ( (lv_guard_10_0= ruleConstraint ) ) )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,157,FollowSets000.FOLLOW_157_in_ruleTransition17015); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7544:1: ( (lv_name_1_0= ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7545:1: (lv_name_1_0= ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7545:1: (lv_name_1_0= ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7546:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition17036);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition17048); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,158,FollowSets000.FOLLOW_158_in_ruleTransition17060); 

                	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getEndStateKeyword_3());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7570:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7571:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7571:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7572:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getEndStateStateCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition17083);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,159,FollowSets000.FOLLOW_159_in_ruleTransition17095); 

                	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getStartStateKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7589:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7590:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7590:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7591:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getStartStateStateCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition17118);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7604:2: (otherlv_7= 'signature' ( ( ruleEString ) ) )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==99) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7604:4: otherlv_7= 'signature' ( ( ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,99,FollowSets000.FOLLOW_99_in_ruleTransition17131); 

                        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getSignatureKeyword_7_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7608:1: ( ( ruleEString ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7609:1: ( ruleEString )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7609:1: ( ruleEString )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7610:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getSignatureOperationCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition17154);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7623:4: (otherlv_9= 'guard' ( (lv_guard_10_0= ruleConstraint ) ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==160) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7623:6: otherlv_9= 'guard' ( (lv_guard_10_0= ruleConstraint ) )
                    {
                    otherlv_9=(Token)match(input,160,FollowSets000.FOLLOW_160_in_ruleTransition17169); 

                        	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getGuardKeyword_8_0());
                        
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7627:1: ( (lv_guard_10_0= ruleConstraint ) )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7628:1: (lv_guard_10_0= ruleConstraint )
                    {
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7628:1: (lv_guard_10_0= ruleConstraint )
                    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7629:3: lv_guard_10_0= ruleConstraint
                    {
                     
                    	        newCompositeNode(grammarAccess.getTransitionAccess().getGuardConstraintParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_ruleTransition17190);
                    lv_guard_10_0=ruleConstraint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
                    	        }
                           		set(
                           			current, 
                           			"guard",
                            		lv_guard_10_0, 
                            		"Constraint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTransition17204); 

                	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleSubstitution_Impl"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7657:1: entryRuleSubstitution_Impl returns [EObject current=null] : iv_ruleSubstitution_Impl= ruleSubstitution_Impl EOF ;
    public final EObject entryRuleSubstitution_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstitution_Impl = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7658:2: (iv_ruleSubstitution_Impl= ruleSubstitution_Impl EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7659:2: iv_ruleSubstitution_Impl= ruleSubstitution_Impl EOF
            {
             newCompositeNode(grammarAccess.getSubstitution_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSubstitution_Impl_in_entryRuleSubstitution_Impl17240);
            iv_ruleSubstitution_Impl=ruleSubstitution_Impl();

            state._fsp--;

             current =iv_ruleSubstitution_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSubstitution_Impl17250); 

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
    // $ANTLR end "entryRuleSubstitution_Impl"


    // $ANTLR start "ruleSubstitution_Impl"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7666:1: ruleSubstitution_Impl returns [EObject current=null] : ( () otherlv_1= 'Substitution' ) ;
    public final EObject ruleSubstitution_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7669:28: ( ( () otherlv_1= 'Substitution' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7670:1: ( () otherlv_1= 'Substitution' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7670:1: ( () otherlv_1= 'Substitution' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7670:2: () otherlv_1= 'Substitution'
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7670:2: ()
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7671:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSubstitution_ImplAccess().getSubstitutionAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,161,FollowSets000.FOLLOW_161_in_ruleSubstitution_Impl17296); 

                	newLeafNode(otherlv_1, grammarAccess.getSubstitution_ImplAccess().getSubstitutionKeyword_1());
                

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
    // $ANTLR end "ruleSubstitution_Impl"


    // $ANTLR start "entryRuleConstraint"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7688:1: entryRuleConstraint returns [EObject current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final EObject entryRuleConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstraint = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7689:2: (iv_ruleConstraint= ruleConstraint EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7690:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstraint_in_entryRuleConstraint17332);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstraint17342); 

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
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7697:1: ruleConstraint returns [EObject current=null] : (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'Specification' ( (lv_Specification_3_0= ruleValueSpecification ) ) otherlv_4= '}' ) ;
    public final EObject ruleConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_Specification_3_0 = null;


         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7700:28: ( (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'Specification' ( (lv_Specification_3_0= ruleValueSpecification ) ) otherlv_4= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7701:1: (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'Specification' ( (lv_Specification_3_0= ruleValueSpecification ) ) otherlv_4= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7701:1: (otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'Specification' ( (lv_Specification_3_0= ruleValueSpecification ) ) otherlv_4= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7701:3: otherlv_0= 'Constraint' otherlv_1= '{' otherlv_2= 'Specification' ( (lv_Specification_3_0= ruleValueSpecification ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,162,FollowSets000.FOLLOW_162_in_ruleConstraint17379); 

                	newLeafNode(otherlv_0, grammarAccess.getConstraintAccess().getConstraintKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleConstraint17391); 

                	newLeafNode(otherlv_1, grammarAccess.getConstraintAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,163,FollowSets000.FOLLOW_163_in_ruleConstraint17403); 

                	newLeafNode(otherlv_2, grammarAccess.getConstraintAccess().getSpecificationKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7713:1: ( (lv_Specification_3_0= ruleValueSpecification ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7714:1: (lv_Specification_3_0= ruleValueSpecification )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7714:1: (lv_Specification_3_0= ruleValueSpecification )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7715:3: lv_Specification_3_0= ruleValueSpecification
            {
             
            	        newCompositeNode(grammarAccess.getConstraintAccess().getSpecificationValueSpecificationParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValueSpecification_in_ruleConstraint17424);
            lv_Specification_3_0=ruleValueSpecification();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstraintRule());
            	        }
                   		set(
                   			current, 
                   			"Specification",
                    		lv_Specification_3_0, 
                    		"ValueSpecification");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConstraint17436); 

                	newLeafNode(otherlv_4, grammarAccess.getConstraintAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleTransitionSubstitution"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7743:1: entryRuleTransitionSubstitution returns [EObject current=null] : iv_ruleTransitionSubstitution= ruleTransitionSubstitution EOF ;
    public final EObject entryRuleTransitionSubstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitionSubstitution = null;


        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7744:2: (iv_ruleTransitionSubstitution= ruleTransitionSubstitution EOF )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7745:2: iv_ruleTransitionSubstitution= ruleTransitionSubstitution EOF
            {
             newCompositeNode(grammarAccess.getTransitionSubstitutionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransitionSubstitution_in_entryRuleTransitionSubstitution17472);
            iv_ruleTransitionSubstitution=ruleTransitionSubstitution();

            state._fsp--;

             current =iv_ruleTransitionSubstitution; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransitionSubstitution17482); 

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
    // $ANTLR end "entryRuleTransitionSubstitution"


    // $ANTLR start "ruleTransitionSubstitution"
    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7752:1: ruleTransitionSubstitution returns [EObject current=null] : (otherlv_0= 'TransitionSubstitution' otherlv_1= '{' otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' ) ;
    public final EObject ruleTransitionSubstitution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;

         enterRule(); 
            
        try {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7755:28: ( (otherlv_0= 'TransitionSubstitution' otherlv_1= '{' otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7756:1: (otherlv_0= 'TransitionSubstitution' otherlv_1= '{' otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7756:1: (otherlv_0= 'TransitionSubstitution' otherlv_1= '{' otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}' )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7756:3: otherlv_0= 'TransitionSubstitution' otherlv_1= '{' otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,164,FollowSets000.FOLLOW_164_in_ruleTransitionSubstitution17519); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionSubstitutionAccess().getTransitionSubstitutionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransitionSubstitution17531); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionSubstitutionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,165,FollowSets000.FOLLOW_165_in_ruleTransitionSubstitution17543); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionSubstitutionAccess().getFromKeyword_2());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7768:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7769:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7769:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7770:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionSubstitutionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionSubstitutionAccess().getFromTransitionCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransitionSubstitution17566);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,166,FollowSets000.FOLLOW_166_in_ruleTransitionSubstitution17578); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionSubstitutionAccess().getToKeyword_4());
                
            otherlv_5=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTransitionSubstitution17590); 

                	newLeafNode(otherlv_5, grammarAccess.getTransitionSubstitutionAccess().getLeftParenthesisKeyword_5());
                
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7791:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7792:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7792:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7793:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionSubstitutionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionSubstitutionAccess().getToTransitionCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransitionSubstitution17613);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7806:2: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( (LA127_0==15) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7806:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTransitionSubstitution17626); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTransitionSubstitutionAccess().getCommaKeyword_7_0());
            	        
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7810:1: ( ( ruleEString ) )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7811:1: ( ruleEString )
            	    {
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7811:1: ( ruleEString )
            	    // ../cl.uchile.pleiad.textram/src-gen/cl/uchile/pleiad/parser/antlr/internal/InternalTextRAM.g:7812:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTransitionSubstitutionRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getTransitionSubstitutionAccess().getToTransitionCrossReference_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransitionSubstitution17649);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop127;
                }
            } while (true);

            otherlv_9=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleTransitionSubstitution17663); 

                	newLeafNode(otherlv_9, grammarAccess.getTransitionSubstitutionAccess().getRightParenthesisKeyword_8());
                
            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTransitionSubstitution17675); 

                	newLeafNode(otherlv_10, grammarAccess.getTransitionSubstitutionAccess().getRightCurlyBracketKeyword_9());
                

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
    // $ANTLR end "ruleTransitionSubstitution"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAspect85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleAspect122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAspect143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAspect155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleAspect167 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleStructuralView_in_ruleAspect188 = new BitSet(new long[]{0x00000000000F4000L});
        public static final BitSet FOLLOW_14_in_ruleAspect201 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAspect213 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A2000L});
        public static final BitSet FOLLOW_ruleAbstractMessageView_in_ruleAspect234 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleAspect247 = new BitSet(new long[]{0x0000000000000000L,0x00000000000A2000L});
        public static final BitSet FOLLOW_ruleAbstractMessageView_in_ruleAspect268 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleAspect282 = new BitSet(new long[]{0x00000000000F0000L});
        public static final BitSet FOLLOW_17_in_ruleAspect297 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAspect309 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleInstantiation_in_ruleAspect330 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleAspect343 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleInstantiation_in_ruleAspect364 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleAspect378 = new BitSet(new long[]{0x00000000000D0000L});
        public static final BitSet FOLLOW_18_in_ruleAspect393 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleLayout_in_ruleAspect414 = new BitSet(new long[]{0x0000000000090000L});
        public static final BitSet FOLLOW_19_in_ruleAspect429 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAspect441 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleStateView_in_ruleAspect462 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleAspect475 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_ruleStateView_in_ruleAspect496 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleAspect510 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAspect524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAbstractMessageView_in_entryRuleAbstractMessageView560 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAbstractMessageView570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageView_in_ruleAbstractMessageView617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageViewReference_in_ruleAbstractMessageView644 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAspectMessageView_in_ruleAbstractMessageView671 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier706 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassifier716 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_ruleClassifier763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRBoolean_in_ruleClassifier790 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRInt_in_ruleClassifier817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRChar_in_ruleClassifier844 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRString_in_ruleClassifier871 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleREnum_in_ruleClassifier898 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRSet_in_ruleClassifier925 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRSequence_in_ruleClassifier952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementationClass_Impl_in_ruleClassifier979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRDouble_in_ruleClassifier1006 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRFloat_in_ruleClassifier1033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleType_in_entryRuleType1068 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleType1078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_ruleType1125 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRVoid_in_ruleType1152 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRBoolean_in_ruleType1179 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRInt_in_ruleType1206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRChar_in_ruleType1233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRString_in_ruleType1260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRAny_in_ruleType1287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleREnum_in_ruleType1314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRSet_in_ruleType1341 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRSequence_in_ruleType1368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementationClass_Impl_in_ruleType1395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRDouble_in_ruleType1422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRFloat_in_ruleType1449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteractionFragment_in_entryRuleInteractionFragment1488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteractionFragment1498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageOccurrenceSpecification_Impl_in_ruleInteractionFragment1545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOccurrenceSpecification_Impl_in_ruleInteractionFragment1572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDestructionOccurrenceSpecification_in_ruleInteractionFragment1599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCombinedFragment_in_ruleInteractionFragment1626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOriginalBehaviorExecution_in_ruleInteractionFragment1653 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecutionStatement_in_ruleInteractionFragment1680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTemporaryProperty_in_entryRuleTemporaryProperty1717 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTemporaryProperty1727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleTemporaryProperty1774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_ruleTemporaryProperty1801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification1840 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification1850 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructuralFeatureValue_in_ruleValueSpecification1897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterValue_in_ruleValueSpecification1924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpaqueExpression_in_ruleValueSpecification1951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_ruleValueSpecification1978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_ruleValueSpecification2005 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_ruleValueSpecification2032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstitution_in_entryRuleSubstitution2067 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubstitution2077 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstitution_Impl_in_ruleSubstitution2124 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionSubstitution_in_ruleSubstitution2151 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructuralView_in_entryRuleStructuralView2309 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructuralView2319 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleStructuralView2365 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStructuralView2377 = new BitSet(new long[]{0x0000000000E10000L});
        public static final BitSet FOLLOW_21_in_ruleStructuralView2390 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStructuralView2402 = new BitSet(new long[]{0x1F7A10A000000000L});
        public static final BitSet FOLLOW_ruleClassifier_in_ruleStructuralView2423 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStructuralView2436 = new BitSet(new long[]{0x1F7A10A000000000L});
        public static final BitSet FOLLOW_ruleClassifier_in_ruleStructuralView2457 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStructuralView2471 = new BitSet(new long[]{0x0000000000C10000L});
        public static final BitSet FOLLOW_22_in_ruleStructuralView2486 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStructuralView2498 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleAssociation_in_ruleStructuralView2519 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStructuralView2532 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_ruleAssociation_in_ruleStructuralView2553 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStructuralView2567 = new BitSet(new long[]{0x0000000000810000L});
        public static final BitSet FOLLOW_23_in_ruleStructuralView2582 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStructuralView2594 = new BitSet(new long[]{0x1F7A10A000000000L,0x0000000000001800L});
        public static final BitSet FOLLOW_ruleType_in_ruleStructuralView2615 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStructuralView2628 = new BitSet(new long[]{0x1F7A10A000000000L,0x0000000000001800L});
        public static final BitSet FOLLOW_ruleType_in_ruleStructuralView2649 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStructuralView2663 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStructuralView2677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstantiation_in_entryRuleInstantiation2713 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInstantiation2723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleInstantiation2760 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInstantiation2772 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleInstantiation2784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_ruleInstantiationType_in_ruleInstantiation2805 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleInstantiation2817 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleInstantiation2840 = new BitSet(new long[]{0x0000000008010000L});
        public static final BitSet FOLLOW_27_in_ruleInstantiation2853 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInstantiation2865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleClassifierMapping_in_ruleInstantiation2886 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleInstantiation2899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_ruleClassifierMapping_in_ruleInstantiation2920 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleInstantiation2934 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleInstantiation2948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayout_in_entryRuleLayout2984 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayout2994 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleLayout3031 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLayout3043 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleLayout3055 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLayout3067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleContainerMap_in_ruleLayout3088 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleLayout3101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_ruleContainerMap_in_ruleLayout3122 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleLayout3136 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLayout3148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateView_in_entryRuleStateView3184 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateView3194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleStateView3231 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateView3252 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateView3264 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleStateView3276 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateView3299 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleStateView3311 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateView3323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleStateView3344 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStateView3357 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_ruleStateMachine_in_ruleStateView3378 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStateView3392 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStateView3404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation3440 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociation3450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAssociation3487 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssociation3508 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAssociation3520 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleAssociation3532 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleAssociation3544 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssociation3567 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleAssociation3580 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssociation3603 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleAssociation3617 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAssociation3629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperation_in_entryRuleOperation3665 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperation3675 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleOperation3718 = new BitSet(new long[]{0x000001C000000000L});
        public static final BitSet FOLLOW_38_in_ruleOperation3750 = new BitSet(new long[]{0x0000018000000000L});
        public static final BitSet FOLLOW_39_in_ruleOperation3782 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_40_in_ruleOperation3808 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperation3829 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperation3841 = new BitSet(new long[]{0x0000060000000000L});
        public static final BitSet FOLLOW_41_in_ruleOperation3854 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_ruleVisibility_in_ruleOperation3875 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_42_in_ruleOperation3889 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperation3912 = new BitSet(new long[]{0x0000080000010000L});
        public static final BitSet FOLLOW_43_in_ruleOperation3925 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperation3937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleOperation3958 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleOperation3971 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleParameter_in_ruleOperation3992 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleOperation4006 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOperation4020 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClass_in_entryRuleClass4056 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClass4066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleClass4118 = new BitSet(new long[]{0x0000102000000000L});
        public static final BitSet FOLLOW_37_in_ruleClass4150 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44_in_ruleClass4176 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClass4197 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass4209 = new BitSet(new long[]{0x0001E00000010000L});
        public static final BitSet FOLLOW_45_in_ruleClass4222 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleClass4234 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClass4257 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleClass4270 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClass4293 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleClass4307 = new BitSet(new long[]{0x0001C00000010000L});
        public static final BitSet FOLLOW_46_in_ruleClass4322 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass4334 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleClass4355 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClass4368 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleClass4389 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClass4403 = new BitSet(new long[]{0x0001800000010000L});
        public static final BitSet FOLLOW_47_in_ruleClass4418 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass4430 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleAssociationEnd_in_ruleClass4451 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClass4464 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleAssociationEnd_in_ruleClass4485 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClass4499 = new BitSet(new long[]{0x0001000000010000L});
        public static final BitSet FOLLOW_48_in_ruleClass4514 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClass4526 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleClass4547 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClass4560 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleClass4581 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClass4595 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleClass4609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRBoolean_in_entryRuleRBoolean4645 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRBoolean4655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleRBoolean4692 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRBoolean4713 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRBoolean4725 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleRBoolean4737 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRBoolean4758 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_46_in_ruleRBoolean4771 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRBoolean4783 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRBoolean4804 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRBoolean4817 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRBoolean4838 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRBoolean4852 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRBoolean4866 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRInt_in_entryRuleRInt4902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRInt4912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleRInt4949 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRInt4970 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRInt4982 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleRInt4994 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRInt5015 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_46_in_ruleRInt5028 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRInt5040 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRInt5061 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRInt5074 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRInt5095 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRInt5109 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRInt5123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRChar_in_entryRuleRChar5159 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRChar5169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_52_in_ruleRChar5206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRChar5227 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRChar5239 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleRChar5251 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRChar5272 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_46_in_ruleRChar5285 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRChar5297 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRChar5318 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRChar5331 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRChar5352 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRChar5366 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRChar5380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRString_in_entryRuleRString5416 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRString5426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_53_in_ruleRString5463 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRString5484 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRString5496 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleRString5508 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRString5529 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_46_in_ruleRString5542 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRString5554 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRString5575 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRString5588 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRString5609 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRString5623 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRString5637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleREnum_in_entryRuleREnum5673 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleREnum5683 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_54_in_ruleREnum5720 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleREnum5741 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleREnum5753 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleREnum5765 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleREnum5786 = new BitSet(new long[]{0x0080400000000000L});
        public static final BitSet FOLLOW_46_in_ruleREnum5799 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleREnum5811 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleREnum5832 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleREnum5845 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleREnum5866 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleREnum5880 = new BitSet(new long[]{0x0080000000000000L});
        public static final BitSet FOLLOW_55_in_ruleREnum5894 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleREnum5906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_ruleREnumLiteral_in_ruleREnum5927 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleREnum5940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_ruleREnumLiteral_in_ruleREnum5961 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleREnum5975 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleREnum5987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRSet_in_entryRuleRSet6023 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRSet6033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_56_in_ruleRSet6070 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRSet6091 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRSet6103 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleRSet6115 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRSet6136 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleRSet6148 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRSet6171 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_46_in_ruleRSet6184 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRSet6196 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRSet6217 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRSet6230 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRSet6251 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRSet6265 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRSet6279 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRSequence_in_entryRuleRSequence6315 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRSequence6325 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_57_in_ruleRSequence6362 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRSequence6383 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRSequence6395 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleRSequence6407 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRSequence6428 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleRSequence6440 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRSequence6463 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_46_in_ruleRSequence6476 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRSequence6488 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRSequence6509 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRSequence6522 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRSequence6543 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRSequence6557 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRSequence6571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleImplementationClass_Impl_in_entryRuleImplementationClass_Impl6607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleImplementationClass_Impl6617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_58_in_ruleImplementationClass_Impl6654 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImplementationClass_Impl6675 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleImplementationClass_Impl6687 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleImplementationClass_Impl6699 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleImplementationClass_Impl6720 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_46_in_ruleImplementationClass_Impl6733 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleImplementationClass_Impl6745 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleImplementationClass_Impl6766 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleImplementationClass_Impl6779 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleImplementationClass_Impl6800 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleImplementationClass_Impl6814 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleImplementationClass_Impl6828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRDouble_in_entryRuleRDouble6864 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRDouble6874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_59_in_ruleRDouble6911 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRDouble6932 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRDouble6944 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleRDouble6956 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRDouble6977 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_46_in_ruleRDouble6990 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRDouble7002 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRDouble7023 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRDouble7036 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRDouble7057 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRDouble7071 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRDouble7085 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRFloat_in_entryRuleRFloat7121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRFloat7131 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_60_in_ruleRFloat7168 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRFloat7189 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRFloat7201 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_50_in_ruleRFloat7213 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRFloat7234 = new BitSet(new long[]{0x0000400000010000L});
        public static final BitSet FOLLOW_46_in_ruleRFloat7247 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleRFloat7259 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRFloat7280 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleRFloat7293 = new BitSet(new long[]{0x000001E000000000L});
        public static final BitSet FOLLOW_ruleOperation_in_ruleRFloat7314 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleRFloat7328 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleRFloat7342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEBoolean_in_entryRuleEBoolean7379 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEBoolean7390 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_61_in_ruleEBoolean7428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_62_in_ruleEBoolean7447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleVisibility_in_entryRuleVisibility7488 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVisibility7499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_63_in_ruleVisibility7536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter7575 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameter7585 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_64_in_ruleParameter7622 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter7643 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameter7655 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleParameter7667 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameter7690 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParameter7702 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAssociationEnd_in_entryRuleAssociationEnd7738 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAssociationEnd7748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleAssociationEnd7791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_65_in_ruleAssociationEnd7816 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssociationEnd7837 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAssociationEnd7849 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
        public static final BitSet FOLLOW_66_in_ruleAssociationEnd7862 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAssociationEnd7883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000078L});
        public static final BitSet FOLLOW_67_in_ruleAssociationEnd7898 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleAssociationEnd7919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000070L});
        public static final BitSet FOLLOW_68_in_ruleAssociationEnd7934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_ruleReferenceType_in_ruleAssociationEnd7955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_69_in_ruleAssociationEnd7970 = new BitSet(new long[]{0x6000000000000000L});
        public static final BitSet FOLLOW_ruleEBoolean_in_ruleAssociationEnd7991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_70_in_ruleAssociationEnd8005 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAssociationEnd8028 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAssociationEnd8040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute8076 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute8086 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleAttribute8129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_71_in_ruleAttribute8154 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttribute8175 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAttribute8187 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleAttribute8199 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttribute8222 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAttribute8234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt8271 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt8282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleEInt8321 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt8338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReferenceType_in_entryRuleReferenceType8384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReferenceType8395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_73_in_ruleReferenceType8432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleREnumLiteral_in_entryRuleREnumLiteral8471 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleREnumLiteral8481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_74_in_ruleREnumLiteral8527 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleREnumLiteral8548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRVoid_in_entryRuleRVoid8584 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRVoid8594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_75_in_ruleRVoid8640 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRVoid8661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRAny_in_entryRuleRAny8697 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRAny8707 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_76_in_ruleRAny8753 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRAny8774 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAspectMessageView_in_entryRuleAspectMessageView8810 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAspectMessageView8820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_77_in_ruleAspectMessageView8857 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAspectMessageView8878 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAspectMessageView8890 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
        public static final BitSet FOLLOW_78_in_ruleAspectMessageView8903 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleAspectMessageView8915 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAspectMessageView8938 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleAspectMessageView8951 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAspectMessageView8974 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleAspectMessageView8988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_79_in_ruleAspectMessageView9002 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAspectMessageView9025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_80_in_ruleAspectMessageView9037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_ruleInteraction_in_ruleAspectMessageView9058 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAspectMessageView9070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageView_in_entryRuleMessageView9106 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageView9116 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_81_in_ruleMessageView9153 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMessageView9165 = new BitSet(new long[]{0x0000000080000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_78_in_ruleMessageView9178 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleMessageView9190 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessageView9213 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleMessageView9226 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessageView9249 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleMessageView9263 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_31_in_ruleMessageView9277 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessageView9300 = new BitSet(new long[]{0x0000000000010000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleMessageView9313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_ruleInteraction_in_ruleMessageView9334 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMessageView9348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageViewReference_in_entryRuleMessageViewReference9384 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageViewReference9394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_83_in_ruleMessageViewReference9431 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMessageViewReference9443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000104000L});
        public static final BitSet FOLLOW_78_in_ruleMessageViewReference9456 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleMessageViewReference9468 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessageViewReference9491 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleMessageViewReference9504 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessageViewReference9527 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleMessageViewReference9541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
        public static final BitSet FOLLOW_84_in_ruleMessageViewReference9555 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessageViewReference9578 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMessageViewReference9590 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteraction_in_entryRuleInteraction9626 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteraction9636 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_85_in_ruleInteraction9673 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInteraction9685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_86_in_ruleInteraction9697 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInteraction9709 = new BitSet(new long[]{0x0000000000000000L,0x0006740000000000L});
        public static final BitSet FOLLOW_ruleInteractionFragment_in_ruleInteraction9730 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleInteraction9743 = new BitSet(new long[]{0x0000000000000000L,0x0006740000000000L});
        public static final BitSet FOLLOW_ruleInteractionFragment_in_ruleInteraction9764 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleInteraction9778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
        public static final BitSet FOLLOW_87_in_ruleInteraction9790 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInteraction9802 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
        public static final BitSet FOLLOW_ruleLifeline_in_ruleInteraction9823 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleInteraction9836 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
        public static final BitSet FOLLOW_ruleLifeline_in_ruleInteraction9857 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleInteraction9871 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
        public static final BitSet FOLLOW_88_in_ruleInteraction9883 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInteraction9895 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_ruleMessage_in_ruleInteraction9916 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleInteraction9929 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_ruleMessage_in_ruleInteraction9950 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleInteraction9964 = new BitSet(new long[]{0x0000000000010000L,0x0000000006000000L});
        public static final BitSet FOLLOW_89_in_ruleInteraction9977 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInteraction9989 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleReference_in_ruleInteraction10010 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleInteraction10023 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleReference_in_ruleInteraction10044 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleInteraction10058 = new BitSet(new long[]{0x0000000000010000L,0x0000000004000000L});
        public static final BitSet FOLLOW_90_in_ruleInteraction10073 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInteraction10085 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_ruleGate_in_ruleInteraction10106 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleInteraction10119 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
        public static final BitSet FOLLOW_ruleGate_in_ruleInteraction10140 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleInteraction10154 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleInteraction10168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLifeline_in_entryRuleLifeline10204 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLifeline10214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_91_in_ruleLifeline10251 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLifeline10263 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_92_in_ruleLifeline10275 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLifeline10298 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_93_in_ruleLifeline10310 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleLifeline10322 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLifeline10345 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleLifeline10358 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLifeline10381 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleLifeline10395 = new BitSet(new long[]{0x0000000000010000L,0x0000000040000000L});
        public static final BitSet FOLLOW_94_in_ruleLifeline10408 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLifeline10420 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleTemporaryProperty_in_ruleLifeline10441 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleLifeline10454 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_ruleTemporaryProperty_in_ruleLifeline10475 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleLifeline10489 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLifeline10503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessage_in_entryRuleMessage10539 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessage10549 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_95_in_ruleMessage10586 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMessage10598 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_96_in_ruleMessage10610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_ruleMessageSort_in_ruleMessage10631 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_97_in_ruleMessage10643 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessage10666 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_98_in_ruleMessage10678 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessage10701 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_99_in_ruleMessage10713 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessage10736 = new BitSet(new long[]{0x0000000000010000L,0x0000007000000000L});
        public static final BitSet FOLLOW_100_in_ruleMessage10749 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessage10772 = new BitSet(new long[]{0x0000000000010000L,0x0000006000000000L});
        public static final BitSet FOLLOW_101_in_ruleMessage10787 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMessage10799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterValueMapping_in_ruleMessage10820 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleMessage10833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterValueMapping_in_ruleMessage10854 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleMessage10868 = new BitSet(new long[]{0x0000000000010000L,0x0000004000000000L});
        public static final BitSet FOLLOW_102_in_ruleMessage10883 = new BitSet(new long[]{0x0000000000000000L,0x65C0000000000000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleMessage10904 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMessage10918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleReference_in_entryRuleReference10954 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleReference10964 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleReference11007 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
        public static final BitSet FOLLOW_103_in_ruleReference11032 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReference11053 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleReference11065 = new BitSet(new long[]{0x0000000002000000L,0x000000000000001CL});
        public static final BitSet FOLLOW_66_in_ruleReference11078 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReference11099 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_67_in_ruleReference11114 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleReference11135 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_68_in_ruleReference11150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_ruleReferenceType_in_ruleReference11171 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleReference11185 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleReference11208 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleReference11220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGate_in_entryRuleGate11256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGate11266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_104_in_ruleGate11303 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGate11324 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleGate11336 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_105_in_ruleGate11348 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleGate11371 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleGate11383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageOccurrenceSpecification_Impl_in_entryRuleMessageOccurrenceSpecification_Impl11419 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageOccurrenceSpecification_Impl11429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_106_in_ruleMessageOccurrenceSpecification_Impl11466 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMessageOccurrenceSpecification_Impl11478 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_107_in_ruleMessageOccurrenceSpecification_Impl11490 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleMessageOccurrenceSpecification_Impl11502 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessageOccurrenceSpecification_Impl11525 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleMessageOccurrenceSpecification_Impl11538 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessageOccurrenceSpecification_Impl11561 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleMessageOccurrenceSpecification_Impl11575 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_105_in_ruleMessageOccurrenceSpecification_Impl11587 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMessageOccurrenceSpecification_Impl11610 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMessageOccurrenceSpecification_Impl11622 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOccurrenceSpecification_Impl_in_entryRuleOccurrenceSpecification_Impl11658 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOccurrenceSpecification_Impl11668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_108_in_ruleOccurrenceSpecification_Impl11705 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOccurrenceSpecification_Impl11717 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_107_in_ruleOccurrenceSpecification_Impl11729 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleOccurrenceSpecification_Impl11741 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOccurrenceSpecification_Impl11764 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleOccurrenceSpecification_Impl11777 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOccurrenceSpecification_Impl11800 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleOccurrenceSpecification_Impl11814 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOccurrenceSpecification_Impl11826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDestructionOccurrenceSpecification_in_entryRuleDestructionOccurrenceSpecification11862 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDestructionOccurrenceSpecification11872 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_109_in_ruleDestructionOccurrenceSpecification11909 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDestructionOccurrenceSpecification11921 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_107_in_ruleDestructionOccurrenceSpecification11933 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleDestructionOccurrenceSpecification11945 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDestructionOccurrenceSpecification11968 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleDestructionOccurrenceSpecification11981 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDestructionOccurrenceSpecification12004 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleDestructionOccurrenceSpecification12018 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L});
        public static final BitSet FOLLOW_105_in_ruleDestructionOccurrenceSpecification12030 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDestructionOccurrenceSpecification12053 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDestructionOccurrenceSpecification12065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCombinedFragment_in_entryRuleCombinedFragment12101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCombinedFragment12111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_110_in_ruleCombinedFragment12148 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCombinedFragment12160 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
        public static final BitSet FOLLOW_111_in_ruleCombinedFragment12172 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
        public static final BitSet FOLLOW_ruleInteractionOperatorKind_in_ruleCombinedFragment12193 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_107_in_ruleCombinedFragment12205 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleCombinedFragment12217 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCombinedFragment12240 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleCombinedFragment12253 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCombinedFragment12276 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleCombinedFragment12290 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
        public static final BitSet FOLLOW_112_in_ruleCombinedFragment12302 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCombinedFragment12314 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
        public static final BitSet FOLLOW_ruleInteractionOperand_in_ruleCombinedFragment12335 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleCombinedFragment12348 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
        public static final BitSet FOLLOW_ruleInteractionOperand_in_ruleCombinedFragment12369 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleCombinedFragment12383 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleCombinedFragment12395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOriginalBehaviorExecution_in_entryRuleOriginalBehaviorExecution12431 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOriginalBehaviorExecution12441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_113_in_ruleOriginalBehaviorExecution12478 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOriginalBehaviorExecution12490 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_107_in_ruleOriginalBehaviorExecution12502 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleOriginalBehaviorExecution12514 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOriginalBehaviorExecution12537 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleOriginalBehaviorExecution12550 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOriginalBehaviorExecution12573 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleOriginalBehaviorExecution12587 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOriginalBehaviorExecution12599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleExecutionStatement_in_entryRuleExecutionStatement12635 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleExecutionStatement12645 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_114_in_ruleExecutionStatement12682 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleExecutionStatement12694 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
        public static final BitSet FOLLOW_107_in_ruleExecutionStatement12706 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleExecutionStatement12718 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExecutionStatement12741 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleExecutionStatement12754 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleExecutionStatement12777 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleExecutionStatement12791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_82_in_ruleExecutionStatement12803 = new BitSet(new long[]{0x0000000000000000L,0x65C0000000000000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleExecutionStatement12824 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleExecutionStatement12836 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteractionOperatorKind_in_entryRuleInteractionOperatorKind12873 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteractionOperatorKind12884 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_115_in_ruleInteractionOperatorKind12921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInteractionOperand_in_entryRuleInteractionOperand12960 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInteractionOperand12970 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_116_in_ruleInteractionOperand13007 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInteractionOperand13019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_86_in_ruleInteractionOperand13031 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleInteractionOperand13043 = new BitSet(new long[]{0x0000000000000000L,0x0006740000000000L});
        public static final BitSet FOLLOW_ruleInteractionFragment_in_ruleInteractionOperand13064 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleInteractionOperand13077 = new BitSet(new long[]{0x0000000000000000L,0x0006740000000000L});
        public static final BitSet FOLLOW_ruleInteractionFragment_in_ruleInteractionOperand13098 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleInteractionOperand13112 = new BitSet(new long[]{0x0000000000010000L,0x0020000000000000L});
        public static final BitSet FOLLOW_117_in_ruleInteractionOperand13125 = new BitSet(new long[]{0x0000000000000000L,0x65C0000000000000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleInteractionOperand13146 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleInteractionOperand13160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStructuralFeatureValue_in_entryRuleStructuralFeatureValue13196 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStructuralFeatureValue13206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_118_in_ruleStructuralFeatureValue13243 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStructuralFeatureValue13255 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
        public static final BitSet FOLLOW_119_in_ruleStructuralFeatureValue13267 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStructuralFeatureValue13290 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStructuralFeatureValue13302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterValue_in_entryRuleParameterValue13338 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterValue13348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_120_in_ruleParameterValue13385 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameterValue13397 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
        public static final BitSet FOLLOW_121_in_ruleParameterValue13409 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameterValue13432 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParameterValue13444 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOpaqueExpression_in_entryRuleOpaqueExpression13480 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOpaqueExpression13490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_122_in_ruleOpaqueExpression13527 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOpaqueExpression13539 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
        public static final BitSet FOLLOW_123_in_ruleOpaqueExpression13551 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpaqueExpression13572 = new BitSet(new long[]{0x0000000000000000L,0x1000000000000000L});
        public static final BitSet FOLLOW_124_in_ruleOpaqueExpression13584 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOpaqueExpression13605 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOpaqueExpression13617 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralString_in_entryRuleLiteralString13653 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralString13663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_125_in_ruleLiteralString13700 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralString13712 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
        public static final BitSet FOLLOW_119_in_ruleLiteralString13724 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleLiteralString13745 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLiteralString13757 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralInteger_in_entryRuleLiteralInteger13793 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralInteger13803 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_126_in_ruleLiteralInteger13840 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLiteralInteger13852 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
        public static final BitSet FOLLOW_119_in_ruleLiteralInteger13864 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleLiteralInteger13885 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLiteralInteger13897 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteralBoolean_in_entryRuleLiteralBoolean13933 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteralBoolean13943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_119_in_ruleLiteralBoolean13986 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
        public static final BitSet FOLLOW_127_in_ruleLiteralBoolean14011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleMessageSort_in_entryRuleMessageSort14048 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMessageSort14059 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_128_in_ruleMessageSort14096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterValueMapping_in_entryRuleParameterValueMapping14135 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterValueMapping14145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_129_in_ruleParameterValueMapping14182 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameterValueMapping14194 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
        public static final BitSet FOLLOW_121_in_ruleParameterValueMapping14206 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameterValueMapping14229 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
        public static final BitSet FOLLOW_119_in_ruleParameterValueMapping14241 = new BitSet(new long[]{0x0000000000000000L,0x65C0000000000000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleParameterValueMapping14262 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParameterValueMapping14274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleClassifierMapping_in_entryRuleClassifierMapping14310 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleClassifierMapping14320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_130_in_ruleClassifierMapping14357 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClassifierMapping14369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_131_in_ruleClassifierMapping14381 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClassifierMapping14404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_132_in_ruleClassifierMapping14416 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleClassifierMapping14439 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_133_in_ruleClassifierMapping14452 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClassifierMapping14464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleOperationMapping_in_ruleClassifierMapping14485 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClassifierMapping14498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_ruleOperationMapping_in_ruleClassifierMapping14519 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClassifierMapping14533 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_134_in_ruleClassifierMapping14548 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleClassifierMapping14560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_ruleAttributeMapping_in_ruleClassifierMapping14581 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleClassifierMapping14594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_ruleAttributeMapping_in_ruleClassifierMapping14615 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleClassifierMapping14629 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleClassifierMapping14643 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleInstantiationType_in_entryRuleInstantiationType14680 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleInstantiationType14691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_135_in_ruleInstantiationType14728 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleOperationMapping_in_entryRuleOperationMapping14767 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleOperationMapping14777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_136_in_ruleOperationMapping14814 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperationMapping14826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_131_in_ruleOperationMapping14838 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperationMapping14861 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_132_in_ruleOperationMapping14873 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleOperationMapping14896 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000000000200L});
        public static final BitSet FOLLOW_137_in_ruleOperationMapping14909 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleOperationMapping14921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_ruleParameterMapping_in_ruleOperationMapping14942 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleOperationMapping14955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
        public static final BitSet FOLLOW_ruleParameterMapping_in_ruleOperationMapping14976 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleOperationMapping14990 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleOperationMapping15004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeMapping_in_entryRuleAttributeMapping15040 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeMapping15050 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_138_in_ruleAttributeMapping15087 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAttributeMapping15099 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_131_in_ruleAttributeMapping15111 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttributeMapping15134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_132_in_ruleAttributeMapping15146 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttributeMapping15169 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleAttributeMapping15181 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleParameterMapping_in_entryRuleParameterMapping15217 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleParameterMapping15227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_139_in_ruleParameterMapping15264 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleParameterMapping15276 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_131_in_ruleParameterMapping15288 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameterMapping15311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_132_in_ruleParameterMapping15323 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleParameterMapping15346 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleParameterMapping15358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleContainerMap_in_entryRuleContainerMap15394 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainerMap15404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_140_in_ruleContainerMap15441 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContainerMap15453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_141_in_ruleContainerMap15465 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleContainerMap15488 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
        public static final BitSet FOLLOW_119_in_ruleContainerMap15500 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleContainerMap15512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleElementMap_in_ruleContainerMap15533 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleContainerMap15546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_ruleElementMap_in_ruleContainerMap15567 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleContainerMap15581 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleContainerMap15593 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElementMap_in_entryRuleElementMap15631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElementMap15641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_142_in_ruleElementMap15678 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElementMap15690 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_141_in_ruleElementMap15702 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleElementMap15725 = new BitSet(new long[]{0x0000000000000000L,0x0080000000000000L});
        public static final BitSet FOLLOW_119_in_ruleElementMap15737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_ruleLayoutElement_in_ruleElementMap15758 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleElementMap15770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLayoutElement_in_entryRuleLayoutElement15806 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLayoutElement15816 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_143_in_ruleLayoutElement15853 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleLayoutElement15865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
        public static final BitSet FOLLOW_144_in_ruleLayoutElement15877 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L,0x0000000000040000L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleLayoutElement15898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
        public static final BitSet FOLLOW_145_in_ruleLayoutElement15910 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L,0x0000000000040000L});
        public static final BitSet FOLLOW_ruleEFloat_in_ruleLayoutElement15931 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleLayoutElement15943 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEFloat_in_entryRuleEFloat15980 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEFloat15991 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_72_in_ruleEFloat16030 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat16048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_146_in_ruleEFloat16068 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat16083 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000180000L});
        public static final BitSet FOLLOW_147_in_ruleEFloat16103 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
        public static final BitSet FOLLOW_148_in_ruleEFloat16122 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000100L});
        public static final BitSet FOLLOW_72_in_ruleEFloat16137 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEFloat16154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine16201 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine16211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_149_in_ruleStateMachine16248 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine16260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
        public static final BitSet FOLLOW_150_in_ruleStateMachine16272 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleStateMachine16295 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000003800000L});
        public static final BitSet FOLLOW_151_in_ruleStateMachine16308 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine16320 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleState_in_ruleStateMachine16341 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine16354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
        public static final BitSet FOLLOW_ruleState_in_ruleStateMachine16375 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine16389 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000003000000L});
        public static final BitSet FOLLOW_152_in_ruleStateMachine16404 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine16416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStateMachine16437 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine16450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleStateMachine16471 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine16485 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000002000000L});
        public static final BitSet FOLLOW_153_in_ruleStateMachine16500 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleStateMachine16512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001200000000L});
        public static final BitSet FOLLOW_ruleSubstitution_in_ruleStateMachine16533 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleStateMachine16546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001200000000L});
        public static final BitSet FOLLOW_ruleSubstitution_in_ruleStateMachine16567 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine16581 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleStateMachine16595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState16631 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState16641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_154_in_ruleState16687 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState16708 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleState16720 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000018000000L});
        public static final BitSet FOLLOW_155_in_ruleState16733 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleState16745 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState16768 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleState16781 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState16804 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleState16818 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000010000000L});
        public static final BitSet FOLLOW_156_in_ruleState16833 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleState16845 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState16868 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleState16881 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState16904 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleState16918 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleState16932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition16968 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition16978 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_157_in_ruleTransition17015 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition17036 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTransition17048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
        public static final BitSet FOLLOW_158_in_ruleTransition17060 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition17083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_159_in_ruleTransition17095 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition17118 = new BitSet(new long[]{0x0000000000010000L,0x0000000800000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_99_in_ruleTransition17131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition17154 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_160_in_ruleTransition17169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_ruleConstraint_in_ruleTransition17190 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTransition17204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSubstitution_Impl_in_entryRuleSubstitution_Impl17240 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSubstitution_Impl17250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_161_in_ruleSubstitution_Impl17296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstraint_in_entryRuleConstraint17332 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstraint17342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_162_in_ruleConstraint17379 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleConstraint17391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_163_in_ruleConstraint17403 = new BitSet(new long[]{0x0000000000000000L,0x65C0000000000000L});
        public static final BitSet FOLLOW_ruleValueSpecification_in_ruleConstraint17424 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConstraint17436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransitionSubstitution_in_entryRuleTransitionSubstitution17472 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransitionSubstitution17482 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_164_in_ruleTransitionSubstitution17519 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTransitionSubstitution17531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_165_in_ruleTransitionSubstitution17543 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransitionSubstitution17566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_166_in_ruleTransitionSubstitution17578 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleTransitionSubstitution17590 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransitionSubstitution17613 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_15_in_ruleTransitionSubstitution17626 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransitionSubstitution17649 = new BitSet(new long[]{0x0000001000008000L});
        public static final BitSet FOLLOW_36_in_ruleTransitionSubstitution17663 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTransitionSubstitution17675 = new BitSet(new long[]{0x0000000000000002L});
    }


}