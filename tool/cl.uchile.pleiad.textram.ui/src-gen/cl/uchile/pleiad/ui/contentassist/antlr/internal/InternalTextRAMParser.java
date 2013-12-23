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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextRAMParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aspect'", "'{'", "'}'", "'structure'", "'class'", "'partial'", "'abstract'"
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
    public String getGrammarFileName() { return "../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g"; }


     
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




    // $ANTLR start "entryRuleAspect"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:60:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:61:1: ( ruleAspect EOF )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:62:1: ruleAspect EOF
            {
             before(grammarAccess.getAspectRule()); 
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect61);
            ruleAspect();

            state._fsp--;

             after(grammarAccess.getAspectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAspect"


    // $ANTLR start "ruleAspect"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:69:1: ruleAspect : ( ( rule__Aspect__Group__0 ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:73:2: ( ( ( rule__Aspect__Group__0 ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:74:1: ( ( rule__Aspect__Group__0 ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:74:1: ( ( rule__Aspect__Group__0 ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:75:1: ( rule__Aspect__Group__0 )
            {
             before(grammarAccess.getAspectAccess().getGroup()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:76:1: ( rule__Aspect__Group__0 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:76:2: rule__Aspect__Group__0
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0_in_ruleAspect94);
            rule__Aspect__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAspectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAspect"


    // $ANTLR start "entryRuleEString"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:88:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:89:1: ( ruleEString EOF )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:90:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString121);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:97:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:101:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:102:1: ( ( rule__EString__Alternatives ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:102:1: ( ( rule__EString__Alternatives ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:103:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:104:1: ( rule__EString__Alternatives )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:104:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString154);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleStructuralView"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:116:1: entryRuleStructuralView : ruleStructuralView EOF ;
    public final void entryRuleStructuralView() throws RecognitionException {
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:117:1: ( ruleStructuralView EOF )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:118:1: ruleStructuralView EOF
            {
             before(grammarAccess.getStructuralViewRule()); 
            pushFollow(FOLLOW_ruleStructuralView_in_entryRuleStructuralView181);
            ruleStructuralView();

            state._fsp--;

             after(grammarAccess.getStructuralViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralView188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructuralView"


    // $ANTLR start "ruleStructuralView"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:125:1: ruleStructuralView : ( ( rule__StructuralView__Group__0 ) ) ;
    public final void ruleStructuralView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:129:2: ( ( ( rule__StructuralView__Group__0 ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:130:1: ( ( rule__StructuralView__Group__0 ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:130:1: ( ( rule__StructuralView__Group__0 ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:131:1: ( rule__StructuralView__Group__0 )
            {
             before(grammarAccess.getStructuralViewAccess().getGroup()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:132:1: ( rule__StructuralView__Group__0 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:132:2: rule__StructuralView__Group__0
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__0_in_ruleStructuralView214);
            rule__StructuralView__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructuralViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructuralView"


    // $ANTLR start "entryRuleClassifier"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:144:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:145:1: ( ruleClassifier EOF )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:146:1: ruleClassifier EOF
            {
             before(grammarAccess.getClassifierRule()); 
            pushFollow(FOLLOW_ruleClassifier_in_entryRuleClassifier241);
            ruleClassifier();

            state._fsp--;

             after(grammarAccess.getClassifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassifier248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:153:1: ruleClassifier : ( ruleClass ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:157:2: ( ( ruleClass ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:158:1: ( ruleClass )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:158:1: ( ruleClass )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:159:1: ruleClass
            {
             before(grammarAccess.getClassifierAccess().getClassParserRuleCall()); 
            pushFollow(FOLLOW_ruleClass_in_ruleClassifier274);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassifierAccess().getClassParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassifier"


    // $ANTLR start "entryRuleClass"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:172:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:173:1: ( ruleClass EOF )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:174:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass300);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass307); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClass"


    // $ANTLR start "ruleClass"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:181:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:185:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:186:1: ( ( rule__Class__Group__0 ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:186:1: ( ( rule__Class__Group__0 ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:187:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:188:1: ( rule__Class__Group__0 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:188:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass333);
            rule__Class__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClass"


    // $ANTLR start "rule__EString__Alternatives"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:200:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:204:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:205:1: ( RULE_STRING )
                    {
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:205:1: ( RULE_STRING )
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:206:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives369); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:211:6: ( RULE_ID )
                    {
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:211:6: ( RULE_ID )
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:212:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives386); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Aspect__Group__0"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:224:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:228:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:229:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__0416);
            rule__Aspect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__0419);
            rule__Aspect__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__0"


    // $ANTLR start "rule__Aspect__Group__0__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:236:1: rule__Aspect__Group__0__Impl : ( 'Aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:240:1: ( ( 'Aspect' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:241:1: ( 'Aspect' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:241:1: ( 'Aspect' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:242:1: 'Aspect'
            {
             before(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Aspect__Group__0__Impl447); 
             after(grammarAccess.getAspectAccess().getAspectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__0__Impl"


    // $ANTLR start "rule__Aspect__Group__1"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:255:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:259:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:260:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
            {
            pushFollow(FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__1478);
            rule__Aspect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__1481);
            rule__Aspect__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__1"


    // $ANTLR start "rule__Aspect__Group__1__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:267:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__NameAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:271:1: ( ( ( rule__Aspect__NameAssignment_1 ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:272:1: ( ( rule__Aspect__NameAssignment_1 ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:272:1: ( ( rule__Aspect__NameAssignment_1 ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:273:1: ( rule__Aspect__NameAssignment_1 )
            {
             before(grammarAccess.getAspectAccess().getNameAssignment_1()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:274:1: ( rule__Aspect__NameAssignment_1 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:274:2: rule__Aspect__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Aspect__NameAssignment_1_in_rule__Aspect__Group__1__Impl508);
            rule__Aspect__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAspectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__1__Impl"


    // $ANTLR start "rule__Aspect__Group__2"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:284:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:288:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:289:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
            {
            pushFollow(FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__2538);
            rule__Aspect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__2541);
            rule__Aspect__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__2"


    // $ANTLR start "rule__Aspect__Group__2__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:296:1: rule__Aspect__Group__2__Impl : ( '{' ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:300:1: ( ( '{' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:301:1: ( '{' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:301:1: ( '{' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:302:1: '{'
            {
             before(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Aspect__Group__2__Impl569); 
             after(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__2__Impl"


    // $ANTLR start "rule__Aspect__Group__3"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:315:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:319:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:320:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
            {
            pushFollow(FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__3600);
            rule__Aspect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__3603);
            rule__Aspect__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__3"


    // $ANTLR start "rule__Aspect__Group__3__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:327:1: rule__Aspect__Group__3__Impl : ( ( rule__Aspect__StructuralViewAssignment_3 ) ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:331:1: ( ( ( rule__Aspect__StructuralViewAssignment_3 ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:332:1: ( ( rule__Aspect__StructuralViewAssignment_3 ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:332:1: ( ( rule__Aspect__StructuralViewAssignment_3 ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:333:1: ( rule__Aspect__StructuralViewAssignment_3 )
            {
             before(grammarAccess.getAspectAccess().getStructuralViewAssignment_3()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:334:1: ( rule__Aspect__StructuralViewAssignment_3 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:334:2: rule__Aspect__StructuralViewAssignment_3
            {
            pushFollow(FOLLOW_rule__Aspect__StructuralViewAssignment_3_in_rule__Aspect__Group__3__Impl630);
            rule__Aspect__StructuralViewAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAspectAccess().getStructuralViewAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__3__Impl"


    // $ANTLR start "rule__Aspect__Group__4"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:344:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:348:1: ( rule__Aspect__Group__4__Impl )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:349:2: rule__Aspect__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__4660);
            rule__Aspect__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__4"


    // $ANTLR start "rule__Aspect__Group__4__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:355:1: rule__Aspect__Group__4__Impl : ( '}' ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:359:1: ( ( '}' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:360:1: ( '}' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:360:1: ( '}' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:361:1: '}'
            {
             before(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Aspect__Group__4__Impl688); 
             after(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group__4__Impl"


    // $ANTLR start "rule__StructuralView__Group__0"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:384:1: rule__StructuralView__Group__0 : rule__StructuralView__Group__0__Impl rule__StructuralView__Group__1 ;
    public final void rule__StructuralView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:388:1: ( rule__StructuralView__Group__0__Impl rule__StructuralView__Group__1 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:389:2: rule__StructuralView__Group__0__Impl rule__StructuralView__Group__1
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__0__Impl_in_rule__StructuralView__Group__0729);
            rule__StructuralView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__1_in_rule__StructuralView__Group__0732);
            rule__StructuralView__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group__0"


    // $ANTLR start "rule__StructuralView__Group__0__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:396:1: rule__StructuralView__Group__0__Impl : ( () ) ;
    public final void rule__StructuralView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:400:1: ( ( () ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:401:1: ( () )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:401:1: ( () )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:402:1: ()
            {
             before(grammarAccess.getStructuralViewAccess().getStructuralViewAction_0()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:403:1: ()
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:405:1: 
            {
            }

             after(grammarAccess.getStructuralViewAccess().getStructuralViewAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group__0__Impl"


    // $ANTLR start "rule__StructuralView__Group__1"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:415:1: rule__StructuralView__Group__1 : rule__StructuralView__Group__1__Impl rule__StructuralView__Group__2 ;
    public final void rule__StructuralView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:419:1: ( rule__StructuralView__Group__1__Impl rule__StructuralView__Group__2 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:420:2: rule__StructuralView__Group__1__Impl rule__StructuralView__Group__2
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__1__Impl_in_rule__StructuralView__Group__1790);
            rule__StructuralView__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__2_in_rule__StructuralView__Group__1793);
            rule__StructuralView__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group__1"


    // $ANTLR start "rule__StructuralView__Group__1__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:427:1: rule__StructuralView__Group__1__Impl : ( 'structure' ) ;
    public final void rule__StructuralView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:431:1: ( ( 'structure' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:432:1: ( 'structure' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:432:1: ( 'structure' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:433:1: 'structure'
            {
             before(grammarAccess.getStructuralViewAccess().getStructureKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__StructuralView__Group__1__Impl821); 
             after(grammarAccess.getStructuralViewAccess().getStructureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group__1__Impl"


    // $ANTLR start "rule__StructuralView__Group__2"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:446:1: rule__StructuralView__Group__2 : rule__StructuralView__Group__2__Impl rule__StructuralView__Group__3 ;
    public final void rule__StructuralView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:450:1: ( rule__StructuralView__Group__2__Impl rule__StructuralView__Group__3 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:451:2: rule__StructuralView__Group__2__Impl rule__StructuralView__Group__3
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__2__Impl_in_rule__StructuralView__Group__2852);
            rule__StructuralView__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__3_in_rule__StructuralView__Group__2855);
            rule__StructuralView__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group__2"


    // $ANTLR start "rule__StructuralView__Group__2__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:458:1: rule__StructuralView__Group__2__Impl : ( '{' ) ;
    public final void rule__StructuralView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:462:1: ( ( '{' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:463:1: ( '{' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:463:1: ( '{' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:464:1: '{'
            {
             before(grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__StructuralView__Group__2__Impl883); 
             after(grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group__2__Impl"


    // $ANTLR start "rule__StructuralView__Group__3"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:477:1: rule__StructuralView__Group__3 : rule__StructuralView__Group__3__Impl rule__StructuralView__Group__4 ;
    public final void rule__StructuralView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:481:1: ( rule__StructuralView__Group__3__Impl rule__StructuralView__Group__4 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:482:2: rule__StructuralView__Group__3__Impl rule__StructuralView__Group__4
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__3__Impl_in_rule__StructuralView__Group__3914);
            rule__StructuralView__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__4_in_rule__StructuralView__Group__3917);
            rule__StructuralView__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group__3"


    // $ANTLR start "rule__StructuralView__Group__3__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:489:1: rule__StructuralView__Group__3__Impl : ( ( rule__StructuralView__Group_3__0 )? ) ;
    public final void rule__StructuralView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:493:1: ( ( ( rule__StructuralView__Group_3__0 )? ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:494:1: ( ( rule__StructuralView__Group_3__0 )? )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:494:1: ( ( rule__StructuralView__Group_3__0 )? )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:495:1: ( rule__StructuralView__Group_3__0 )?
            {
             before(grammarAccess.getStructuralViewAccess().getGroup_3()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:496:1: ( rule__StructuralView__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=15 && LA2_0<=17)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:496:2: rule__StructuralView__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__StructuralView__Group_3__0_in_rule__StructuralView__Group__3__Impl944);
                    rule__StructuralView__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructuralViewAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group__3__Impl"


    // $ANTLR start "rule__StructuralView__Group__4"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:506:1: rule__StructuralView__Group__4 : rule__StructuralView__Group__4__Impl ;
    public final void rule__StructuralView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:510:1: ( rule__StructuralView__Group__4__Impl )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:511:2: rule__StructuralView__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__4__Impl_in_rule__StructuralView__Group__4975);
            rule__StructuralView__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group__4"


    // $ANTLR start "rule__StructuralView__Group__4__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:517:1: rule__StructuralView__Group__4__Impl : ( '}' ) ;
    public final void rule__StructuralView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:521:1: ( ( '}' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:522:1: ( '}' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:522:1: ( '}' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:523:1: '}'
            {
             before(grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__StructuralView__Group__4__Impl1003); 
             after(grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group__4__Impl"


    // $ANTLR start "rule__StructuralView__Group_3__0"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:546:1: rule__StructuralView__Group_3__0 : rule__StructuralView__Group_3__0__Impl rule__StructuralView__Group_3__1 ;
    public final void rule__StructuralView__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:550:1: ( rule__StructuralView__Group_3__0__Impl rule__StructuralView__Group_3__1 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:551:2: rule__StructuralView__Group_3__0__Impl rule__StructuralView__Group_3__1
            {
            pushFollow(FOLLOW_rule__StructuralView__Group_3__0__Impl_in_rule__StructuralView__Group_3__01044);
            rule__StructuralView__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group_3__1_in_rule__StructuralView__Group_3__01047);
            rule__StructuralView__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group_3__0"


    // $ANTLR start "rule__StructuralView__Group_3__0__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:558:1: rule__StructuralView__Group_3__0__Impl : ( ( rule__StructuralView__ClassesAssignment_3_0 ) ) ;
    public final void rule__StructuralView__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:562:1: ( ( ( rule__StructuralView__ClassesAssignment_3_0 ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:563:1: ( ( rule__StructuralView__ClassesAssignment_3_0 ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:563:1: ( ( rule__StructuralView__ClassesAssignment_3_0 ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:564:1: ( rule__StructuralView__ClassesAssignment_3_0 )
            {
             before(grammarAccess.getStructuralViewAccess().getClassesAssignment_3_0()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:565:1: ( rule__StructuralView__ClassesAssignment_3_0 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:565:2: rule__StructuralView__ClassesAssignment_3_0
            {
            pushFollow(FOLLOW_rule__StructuralView__ClassesAssignment_3_0_in_rule__StructuralView__Group_3__0__Impl1074);
            rule__StructuralView__ClassesAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getStructuralViewAccess().getClassesAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group_3__0__Impl"


    // $ANTLR start "rule__StructuralView__Group_3__1"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:575:1: rule__StructuralView__Group_3__1 : rule__StructuralView__Group_3__1__Impl ;
    public final void rule__StructuralView__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:579:1: ( rule__StructuralView__Group_3__1__Impl )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:580:2: rule__StructuralView__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__StructuralView__Group_3__1__Impl_in_rule__StructuralView__Group_3__11104);
            rule__StructuralView__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group_3__1"


    // $ANTLR start "rule__StructuralView__Group_3__1__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:586:1: rule__StructuralView__Group_3__1__Impl : ( ( rule__StructuralView__ClassesAssignment_3_1 )* ) ;
    public final void rule__StructuralView__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:590:1: ( ( ( rule__StructuralView__ClassesAssignment_3_1 )* ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:591:1: ( ( rule__StructuralView__ClassesAssignment_3_1 )* )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:591:1: ( ( rule__StructuralView__ClassesAssignment_3_1 )* )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:592:1: ( rule__StructuralView__ClassesAssignment_3_1 )*
            {
             before(grammarAccess.getStructuralViewAccess().getClassesAssignment_3_1()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:593:1: ( rule__StructuralView__ClassesAssignment_3_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=17)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:593:2: rule__StructuralView__ClassesAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__StructuralView__ClassesAssignment_3_1_in_rule__StructuralView__Group_3__1__Impl1131);
            	    rule__StructuralView__ClassesAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStructuralViewAccess().getClassesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__Group_3__1__Impl"


    // $ANTLR start "rule__Class__Group__0"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:607:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:611:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:612:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01166);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01169);
            rule__Class__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0"


    // $ANTLR start "rule__Class__Group__0__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:619:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:623:1: ( ( () ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:624:1: ( () )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:624:1: ( () )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:625:1: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:626:1: ()
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:628:1: 
            {
            }

             after(grammarAccess.getClassAccess().getClassAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__0__Impl"


    // $ANTLR start "rule__Class__Group__1"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:638:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:642:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:643:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11227);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11230);
            rule__Class__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1"


    // $ANTLR start "rule__Class__Group__1__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:650:1: rule__Class__Group__1__Impl : ( ( rule__Class__PartialAssignment_1 )? ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:654:1: ( ( ( rule__Class__PartialAssignment_1 )? ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:655:1: ( ( rule__Class__PartialAssignment_1 )? )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:655:1: ( ( rule__Class__PartialAssignment_1 )? )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:656:1: ( rule__Class__PartialAssignment_1 )?
            {
             before(grammarAccess.getClassAccess().getPartialAssignment_1()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:657:1: ( rule__Class__PartialAssignment_1 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:657:2: rule__Class__PartialAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Class__PartialAssignment_1_in_rule__Class__Group__1__Impl1257);
                    rule__Class__PartialAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getPartialAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__1__Impl"


    // $ANTLR start "rule__Class__Group__2"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:667:1: rule__Class__Group__2 : rule__Class__Group__2__Impl rule__Class__Group__3 ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:671:1: ( rule__Class__Group__2__Impl rule__Class__Group__3 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:672:2: rule__Class__Group__2__Impl rule__Class__Group__3
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21288);
            rule__Class__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21291);
            rule__Class__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2"


    // $ANTLR start "rule__Class__Group__2__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:679:1: rule__Class__Group__2__Impl : ( ( rule__Class__AbstractAssignment_2 )? ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:683:1: ( ( ( rule__Class__AbstractAssignment_2 )? ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:684:1: ( ( rule__Class__AbstractAssignment_2 )? )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:684:1: ( ( rule__Class__AbstractAssignment_2 )? )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:685:1: ( rule__Class__AbstractAssignment_2 )?
            {
             before(grammarAccess.getClassAccess().getAbstractAssignment_2()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:686:1: ( rule__Class__AbstractAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:686:2: rule__Class__AbstractAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Class__AbstractAssignment_2_in_rule__Class__Group__2__Impl1318);
                    rule__Class__AbstractAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getClassAccess().getAbstractAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__2__Impl"


    // $ANTLR start "rule__Class__Group__3"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:696:1: rule__Class__Group__3 : rule__Class__Group__3__Impl rule__Class__Group__4 ;
    public final void rule__Class__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:700:1: ( rule__Class__Group__3__Impl rule__Class__Group__4 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:701:2: rule__Class__Group__3__Impl rule__Class__Group__4
            {
            pushFollow(FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31349);
            rule__Class__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31352);
            rule__Class__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3"


    // $ANTLR start "rule__Class__Group__3__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:708:1: rule__Class__Group__3__Impl : ( 'class' ) ;
    public final void rule__Class__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:712:1: ( ( 'class' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:713:1: ( 'class' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:713:1: ( 'class' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:714:1: 'class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_3()); 
            match(input,15,FOLLOW_15_in_rule__Class__Group__3__Impl1380); 
             after(grammarAccess.getClassAccess().getClassKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__3__Impl"


    // $ANTLR start "rule__Class__Group__4"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:727:1: rule__Class__Group__4 : rule__Class__Group__4__Impl rule__Class__Group__5 ;
    public final void rule__Class__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:731:1: ( rule__Class__Group__4__Impl rule__Class__Group__5 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:732:2: rule__Class__Group__4__Impl rule__Class__Group__5
            {
            pushFollow(FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41411);
            rule__Class__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41414);
            rule__Class__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4"


    // $ANTLR start "rule__Class__Group__4__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:739:1: rule__Class__Group__4__Impl : ( ( rule__Class__NameAssignment_4 ) ) ;
    public final void rule__Class__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:743:1: ( ( ( rule__Class__NameAssignment_4 ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:744:1: ( ( rule__Class__NameAssignment_4 ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:744:1: ( ( rule__Class__NameAssignment_4 ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:745:1: ( rule__Class__NameAssignment_4 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_4()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:746:1: ( rule__Class__NameAssignment_4 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:746:2: rule__Class__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_4_in_rule__Class__Group__4__Impl1441);
            rule__Class__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__4__Impl"


    // $ANTLR start "rule__Class__Group__5"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:756:1: rule__Class__Group__5 : rule__Class__Group__5__Impl rule__Class__Group__6 ;
    public final void rule__Class__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:760:1: ( rule__Class__Group__5__Impl rule__Class__Group__6 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:761:2: rule__Class__Group__5__Impl rule__Class__Group__6
            {
            pushFollow(FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51471);
            rule__Class__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51474);
            rule__Class__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5"


    // $ANTLR start "rule__Class__Group__5__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:768:1: rule__Class__Group__5__Impl : ( '{' ) ;
    public final void rule__Class__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:772:1: ( ( '{' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:773:1: ( '{' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:773:1: ( '{' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:774:1: '{'
            {
             before(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,12,FOLLOW_12_in_rule__Class__Group__5__Impl1502); 
             after(grammarAccess.getClassAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__5__Impl"


    // $ANTLR start "rule__Class__Group__6"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:787:1: rule__Class__Group__6 : rule__Class__Group__6__Impl ;
    public final void rule__Class__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:791:1: ( rule__Class__Group__6__Impl )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:792:2: rule__Class__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__61533);
            rule__Class__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6"


    // $ANTLR start "rule__Class__Group__6__Impl"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:798:1: rule__Class__Group__6__Impl : ( '}' ) ;
    public final void rule__Class__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:802:1: ( ( '}' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:803:1: ( '}' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:803:1: ( '}' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:804:1: '}'
            {
             before(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_13_in_rule__Class__Group__6__Impl1561); 
             after(grammarAccess.getClassAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__Group__6__Impl"


    // $ANTLR start "rule__Aspect__NameAssignment_1"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:832:1: rule__Aspect__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Aspect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:836:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:837:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:837:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:838:1: ruleEString
            {
             before(grammarAccess.getAspectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Aspect__NameAssignment_11611);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAspectAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__NameAssignment_1"


    // $ANTLR start "rule__Aspect__StructuralViewAssignment_3"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:847:1: rule__Aspect__StructuralViewAssignment_3 : ( ruleStructuralView ) ;
    public final void rule__Aspect__StructuralViewAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:851:1: ( ( ruleStructuralView ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:852:1: ( ruleStructuralView )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:852:1: ( ruleStructuralView )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:853:1: ruleStructuralView
            {
             before(grammarAccess.getAspectAccess().getStructuralViewStructuralViewParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructuralView_in_rule__Aspect__StructuralViewAssignment_31642);
            ruleStructuralView();

            state._fsp--;

             after(grammarAccess.getAspectAccess().getStructuralViewStructuralViewParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__StructuralViewAssignment_3"


    // $ANTLR start "rule__StructuralView__ClassesAssignment_3_0"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:862:1: rule__StructuralView__ClassesAssignment_3_0 : ( ruleClassifier ) ;
    public final void rule__StructuralView__ClassesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:866:1: ( ( ruleClassifier ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:867:1: ( ruleClassifier )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:867:1: ( ruleClassifier )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:868:1: ruleClassifier
            {
             before(grammarAccess.getStructuralViewAccess().getClassesClassifierParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleClassifier_in_rule__StructuralView__ClassesAssignment_3_01673);
            ruleClassifier();

            state._fsp--;

             after(grammarAccess.getStructuralViewAccess().getClassesClassifierParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__ClassesAssignment_3_0"


    // $ANTLR start "rule__StructuralView__ClassesAssignment_3_1"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:877:1: rule__StructuralView__ClassesAssignment_3_1 : ( ruleClassifier ) ;
    public final void rule__StructuralView__ClassesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:881:1: ( ( ruleClassifier ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:882:1: ( ruleClassifier )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:882:1: ( ruleClassifier )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:883:1: ruleClassifier
            {
             before(grammarAccess.getStructuralViewAccess().getClassesClassifierParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleClassifier_in_rule__StructuralView__ClassesAssignment_3_11704);
            ruleClassifier();

            state._fsp--;

             after(grammarAccess.getStructuralViewAccess().getClassesClassifierParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuralView__ClassesAssignment_3_1"


    // $ANTLR start "rule__Class__PartialAssignment_1"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:892:1: rule__Class__PartialAssignment_1 : ( ( 'partial' ) ) ;
    public final void rule__Class__PartialAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:896:1: ( ( ( 'partial' ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:897:1: ( ( 'partial' ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:897:1: ( ( 'partial' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:898:1: ( 'partial' )
            {
             before(grammarAccess.getClassAccess().getPartialPartialKeyword_1_0()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:899:1: ( 'partial' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:900:1: 'partial'
            {
             before(grammarAccess.getClassAccess().getPartialPartialKeyword_1_0()); 
            match(input,16,FOLLOW_16_in_rule__Class__PartialAssignment_11740); 
             after(grammarAccess.getClassAccess().getPartialPartialKeyword_1_0()); 

            }

             after(grammarAccess.getClassAccess().getPartialPartialKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__PartialAssignment_1"


    // $ANTLR start "rule__Class__AbstractAssignment_2"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:915:1: rule__Class__AbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__Class__AbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:919:1: ( ( ( 'abstract' ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:920:1: ( ( 'abstract' ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:920:1: ( ( 'abstract' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:921:1: ( 'abstract' )
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:922:1: ( 'abstract' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:923:1: 'abstract'
            {
             before(grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0()); 
            match(input,17,FOLLOW_17_in_rule__Class__AbstractAssignment_21784); 
             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0()); 

            }

             after(grammarAccess.getClassAccess().getAbstractAbstractKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__AbstractAssignment_2"


    // $ANTLR start "rule__Class__NameAssignment_4"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:938:1: rule__Class__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:942:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:943:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:943:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:944:1: ruleEString
            {
             before(grammarAccess.getClassAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Class__NameAssignment_41823);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Class__NameAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0_in_ruleAspect94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralView_in_entryRuleStructuralView181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralView188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__0_in_ruleStructuralView214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_entryRuleClassifier241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassifier248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_ruleClassifier274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass300 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__0416 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__0419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Aspect__Group__0__Impl447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__1478 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__NameAssignment_1_in_rule__Aspect__Group__1__Impl508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__2538 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Aspect__Group__2__Impl569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__3600 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__3603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__StructuralViewAssignment_3_in_rule__Aspect__Group__3__Impl630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Aspect__Group__4__Impl688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__0__Impl_in_rule__StructuralView__Group__0729 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__1_in_rule__StructuralView__Group__0732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__1__Impl_in_rule__StructuralView__Group__1790 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__2_in_rule__StructuralView__Group__1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StructuralView__Group__1__Impl821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__2__Impl_in_rule__StructuralView__Group__2852 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__3_in_rule__StructuralView__Group__2855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StructuralView__Group__2__Impl883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__3__Impl_in_rule__StructuralView__Group__3914 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__4_in_rule__StructuralView__Group__3917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group_3__0_in_rule__StructuralView__Group__3__Impl944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__4__Impl_in_rule__StructuralView__Group__4975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StructuralView__Group__4__Impl1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group_3__0__Impl_in_rule__StructuralView__Group_3__01044 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group_3__1_in_rule__StructuralView__Group_3__01047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__ClassesAssignment_3_0_in_rule__StructuralView__Group_3__0__Impl1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group_3__1__Impl_in_rule__StructuralView__Group_3__11104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__ClassesAssignment_3_1_in_rule__StructuralView__Group_3__1__Impl1131 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01166 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11227 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__PartialAssignment_1_in_rule__Class__Group__1__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21288 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Class__Group__3_in_rule__Class__Group__21291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__AbstractAssignment_2_in_rule__Class__Group__2__Impl1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__3__Impl_in_rule__Class__Group__31349 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Class__Group__4_in_rule__Class__Group__31352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Class__Group__3__Impl1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__4__Impl_in_rule__Class__Group__41411 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Class__Group__5_in_rule__Class__Group__41414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_4_in_rule__Class__Group__4__Impl1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__5__Impl_in_rule__Class__Group__51471 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Class__Group__6_in_rule__Class__Group__51474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Class__Group__5__Impl1502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__6__Impl_in_rule__Class__Group__61533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Class__Group__6__Impl1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Aspect__NameAssignment_11611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralView_in_rule__Aspect__StructuralViewAssignment_31642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__StructuralView__ClassesAssignment_3_01673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassifier_in_rule__StructuralView__ClassesAssignment_3_11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Class__PartialAssignment_11740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Class__AbstractAssignment_21784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Class__NameAssignment_41823 = new BitSet(new long[]{0x0000000000000002L});

}