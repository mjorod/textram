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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextramParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Aspect'", "'{'", "'}'", "'StructuralView'", "'Class'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int T__15=15;
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
    public String getGrammarFileName() { return "../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g"; }


     
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




    // $ANTLR start "entryRuleRamModel"
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:60:1: entryRuleRamModel : ruleRamModel EOF ;
    public final void entryRuleRamModel() throws RecognitionException {
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:61:1: ( ruleRamModel EOF )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:62:1: ruleRamModel EOF
            {
             before(grammarAccess.getRamModelRule()); 
            pushFollow(FOLLOW_ruleRamModel_in_entryRuleRamModel61);
            ruleRamModel();

            state._fsp--;

             after(grammarAccess.getRamModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRamModel68); 

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
    // $ANTLR end "entryRuleRamModel"


    // $ANTLR start "ruleRamModel"
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:69:1: ruleRamModel : ( ( rule__RamModel__AspectsAssignment )* ) ;
    public final void ruleRamModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:73:2: ( ( ( rule__RamModel__AspectsAssignment )* ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:74:1: ( ( rule__RamModel__AspectsAssignment )* )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:74:1: ( ( rule__RamModel__AspectsAssignment )* )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:75:1: ( rule__RamModel__AspectsAssignment )*
            {
             before(grammarAccess.getRamModelAccess().getAspectsAssignment()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:76:1: ( rule__RamModel__AspectsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:76:2: rule__RamModel__AspectsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__RamModel__AspectsAssignment_in_ruleRamModel94);
            	    rule__RamModel__AspectsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getRamModelAccess().getAspectsAssignment()); 

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
    // $ANTLR end "ruleRamModel"


    // $ANTLR start "entryRuleAspect"
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:88:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:89:1: ( ruleAspect EOF )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:90:1: ruleAspect EOF
            {
             before(grammarAccess.getAspectRule()); 
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect122);
            ruleAspect();

            state._fsp--;

             after(grammarAccess.getAspectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect129); 

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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:97:1: ruleAspect : ( ( rule__Aspect__Group__0 ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:101:2: ( ( ( rule__Aspect__Group__0 ) ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:102:1: ( ( rule__Aspect__Group__0 ) )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:102:1: ( ( rule__Aspect__Group__0 ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:103:1: ( rule__Aspect__Group__0 )
            {
             before(grammarAccess.getAspectAccess().getGroup()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:104:1: ( rule__Aspect__Group__0 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:104:2: rule__Aspect__Group__0
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0_in_ruleAspect155);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:117:1: ( ruleEString EOF )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString182);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString189); 

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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:132:1: ( rule__EString__Alternatives )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString215);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:144:1: entryRuleStructuralView : ruleStructuralView EOF ;
    public final void entryRuleStructuralView() throws RecognitionException {
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:145:1: ( ruleStructuralView EOF )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:146:1: ruleStructuralView EOF
            {
             before(grammarAccess.getStructuralViewRule()); 
            pushFollow(FOLLOW_ruleStructuralView_in_entryRuleStructuralView242);
            ruleStructuralView();

            state._fsp--;

             after(grammarAccess.getStructuralViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuralView249); 

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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:153:1: ruleStructuralView : ( ( rule__StructuralView__Group__0 ) ) ;
    public final void ruleStructuralView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:157:2: ( ( ( rule__StructuralView__Group__0 ) ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:158:1: ( ( rule__StructuralView__Group__0 ) )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:158:1: ( ( rule__StructuralView__Group__0 ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:159:1: ( rule__StructuralView__Group__0 )
            {
             before(grammarAccess.getStructuralViewAccess().getGroup()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:160:1: ( rule__StructuralView__Group__0 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:160:2: rule__StructuralView__Group__0
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__0_in_ruleStructuralView275);
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


    // $ANTLR start "entryRuleClass"
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:172:1: entryRuleClass : ruleClass EOF ;
    public final void entryRuleClass() throws RecognitionException {
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:173:1: ( ruleClass EOF )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:174:1: ruleClass EOF
            {
             before(grammarAccess.getClassRule()); 
            pushFollow(FOLLOW_ruleClass_in_entryRuleClass302);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getClassRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClass309); 

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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:181:1: ruleClass : ( ( rule__Class__Group__0 ) ) ;
    public final void ruleClass() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:185:2: ( ( ( rule__Class__Group__0 ) ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:186:1: ( ( rule__Class__Group__0 ) )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:186:1: ( ( rule__Class__Group__0 ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:187:1: ( rule__Class__Group__0 )
            {
             before(grammarAccess.getClassAccess().getGroup()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:188:1: ( rule__Class__Group__0 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:188:2: rule__Class__Group__0
            {
            pushFollow(FOLLOW_rule__Class__Group__0_in_ruleClass335);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:200:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:204:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:205:1: ( RULE_STRING )
                    {
                    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:205:1: ( RULE_STRING )
                    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:206:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives371); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:211:6: ( RULE_ID )
                    {
                    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:211:6: ( RULE_ID )
                    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:212:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives388); 
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:224:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:228:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:229:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__0418);
            rule__Aspect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__0421);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:236:1: rule__Aspect__Group__0__Impl : ( 'Aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:240:1: ( ( 'Aspect' ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:241:1: ( 'Aspect' )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:241:1: ( 'Aspect' )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:242:1: 'Aspect'
            {
             before(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Aspect__Group__0__Impl449); 
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:255:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:259:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:260:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
            {
            pushFollow(FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__1480);
            rule__Aspect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__1483);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:267:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__NameAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:271:1: ( ( ( rule__Aspect__NameAssignment_1 ) ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:272:1: ( ( rule__Aspect__NameAssignment_1 ) )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:272:1: ( ( rule__Aspect__NameAssignment_1 ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:273:1: ( rule__Aspect__NameAssignment_1 )
            {
             before(grammarAccess.getAspectAccess().getNameAssignment_1()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:274:1: ( rule__Aspect__NameAssignment_1 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:274:2: rule__Aspect__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Aspect__NameAssignment_1_in_rule__Aspect__Group__1__Impl510);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:284:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:288:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:289:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
            {
            pushFollow(FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__2540);
            rule__Aspect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__2543);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:296:1: rule__Aspect__Group__2__Impl : ( '{' ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:300:1: ( ( '{' ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:301:1: ( '{' )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:301:1: ( '{' )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:302:1: '{'
            {
             before(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Aspect__Group__2__Impl571); 
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:315:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:319:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:320:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
            {
            pushFollow(FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__3602);
            rule__Aspect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__3605);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:327:1: rule__Aspect__Group__3__Impl : ( ( rule__Aspect__StructuralViewAssignment_3 ) ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:331:1: ( ( ( rule__Aspect__StructuralViewAssignment_3 ) ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:332:1: ( ( rule__Aspect__StructuralViewAssignment_3 ) )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:332:1: ( ( rule__Aspect__StructuralViewAssignment_3 ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:333:1: ( rule__Aspect__StructuralViewAssignment_3 )
            {
             before(grammarAccess.getAspectAccess().getStructuralViewAssignment_3()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:334:1: ( rule__Aspect__StructuralViewAssignment_3 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:334:2: rule__Aspect__StructuralViewAssignment_3
            {
            pushFollow(FOLLOW_rule__Aspect__StructuralViewAssignment_3_in_rule__Aspect__Group__3__Impl632);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:344:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:348:1: ( rule__Aspect__Group__4__Impl )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:349:2: rule__Aspect__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__4662);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:355:1: rule__Aspect__Group__4__Impl : ( '}' ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:359:1: ( ( '}' ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:360:1: ( '}' )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:360:1: ( '}' )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:361:1: '}'
            {
             before(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Aspect__Group__4__Impl690); 
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:384:1: rule__StructuralView__Group__0 : rule__StructuralView__Group__0__Impl rule__StructuralView__Group__1 ;
    public final void rule__StructuralView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:388:1: ( rule__StructuralView__Group__0__Impl rule__StructuralView__Group__1 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:389:2: rule__StructuralView__Group__0__Impl rule__StructuralView__Group__1
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__0__Impl_in_rule__StructuralView__Group__0731);
            rule__StructuralView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__1_in_rule__StructuralView__Group__0734);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:396:1: rule__StructuralView__Group__0__Impl : ( () ) ;
    public final void rule__StructuralView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:400:1: ( ( () ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:401:1: ( () )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:401:1: ( () )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:402:1: ()
            {
             before(grammarAccess.getStructuralViewAccess().getStructuralViewAction_0()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:403:1: ()
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:405:1: 
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:415:1: rule__StructuralView__Group__1 : rule__StructuralView__Group__1__Impl rule__StructuralView__Group__2 ;
    public final void rule__StructuralView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:419:1: ( rule__StructuralView__Group__1__Impl rule__StructuralView__Group__2 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:420:2: rule__StructuralView__Group__1__Impl rule__StructuralView__Group__2
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__1__Impl_in_rule__StructuralView__Group__1792);
            rule__StructuralView__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__2_in_rule__StructuralView__Group__1795);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:427:1: rule__StructuralView__Group__1__Impl : ( 'StructuralView' ) ;
    public final void rule__StructuralView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:431:1: ( ( 'StructuralView' ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:432:1: ( 'StructuralView' )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:432:1: ( 'StructuralView' )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:433:1: 'StructuralView'
            {
             before(grammarAccess.getStructuralViewAccess().getStructuralViewKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__StructuralView__Group__1__Impl823); 
             after(grammarAccess.getStructuralViewAccess().getStructuralViewKeyword_1()); 

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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:446:1: rule__StructuralView__Group__2 : rule__StructuralView__Group__2__Impl rule__StructuralView__Group__3 ;
    public final void rule__StructuralView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:450:1: ( rule__StructuralView__Group__2__Impl rule__StructuralView__Group__3 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:451:2: rule__StructuralView__Group__2__Impl rule__StructuralView__Group__3
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__2__Impl_in_rule__StructuralView__Group__2854);
            rule__StructuralView__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__3_in_rule__StructuralView__Group__2857);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:458:1: rule__StructuralView__Group__2__Impl : ( '{' ) ;
    public final void rule__StructuralView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:462:1: ( ( '{' ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:463:1: ( '{' )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:463:1: ( '{' )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:464:1: '{'
            {
             before(grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__StructuralView__Group__2__Impl885); 
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:477:1: rule__StructuralView__Group__3 : rule__StructuralView__Group__3__Impl rule__StructuralView__Group__4 ;
    public final void rule__StructuralView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:481:1: ( rule__StructuralView__Group__3__Impl rule__StructuralView__Group__4 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:482:2: rule__StructuralView__Group__3__Impl rule__StructuralView__Group__4
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__3__Impl_in_rule__StructuralView__Group__3916);
            rule__StructuralView__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__4_in_rule__StructuralView__Group__3919);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:489:1: rule__StructuralView__Group__3__Impl : ( ( rule__StructuralView__ClassesAssignment_3 )? ) ;
    public final void rule__StructuralView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:493:1: ( ( ( rule__StructuralView__ClassesAssignment_3 )? ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:494:1: ( ( rule__StructuralView__ClassesAssignment_3 )? )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:494:1: ( ( rule__StructuralView__ClassesAssignment_3 )? )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:495:1: ( rule__StructuralView__ClassesAssignment_3 )?
            {
             before(grammarAccess.getStructuralViewAccess().getClassesAssignment_3()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:496:1: ( rule__StructuralView__ClassesAssignment_3 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:496:2: rule__StructuralView__ClassesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__StructuralView__ClassesAssignment_3_in_rule__StructuralView__Group__3__Impl946);
                    rule__StructuralView__ClassesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructuralViewAccess().getClassesAssignment_3()); 

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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:506:1: rule__StructuralView__Group__4 : rule__StructuralView__Group__4__Impl ;
    public final void rule__StructuralView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:510:1: ( rule__StructuralView__Group__4__Impl )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:511:2: rule__StructuralView__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__4__Impl_in_rule__StructuralView__Group__4977);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:517:1: rule__StructuralView__Group__4__Impl : ( '}' ) ;
    public final void rule__StructuralView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:521:1: ( ( '}' ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:522:1: ( '}' )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:522:1: ( '}' )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:523:1: '}'
            {
             before(grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__StructuralView__Group__4__Impl1005); 
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


    // $ANTLR start "rule__Class__Group__0"
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:546:1: rule__Class__Group__0 : rule__Class__Group__0__Impl rule__Class__Group__1 ;
    public final void rule__Class__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:550:1: ( rule__Class__Group__0__Impl rule__Class__Group__1 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:551:2: rule__Class__Group__0__Impl rule__Class__Group__1
            {
            pushFollow(FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01046);
            rule__Class__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01049);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:558:1: rule__Class__Group__0__Impl : ( () ) ;
    public final void rule__Class__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:562:1: ( ( () ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:563:1: ( () )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:563:1: ( () )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:564:1: ()
            {
             before(grammarAccess.getClassAccess().getClassAction_0()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:565:1: ()
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:567:1: 
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:577:1: rule__Class__Group__1 : rule__Class__Group__1__Impl rule__Class__Group__2 ;
    public final void rule__Class__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:581:1: ( rule__Class__Group__1__Impl rule__Class__Group__2 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:582:2: rule__Class__Group__1__Impl rule__Class__Group__2
            {
            pushFollow(FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11107);
            rule__Class__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11110);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:589:1: rule__Class__Group__1__Impl : ( 'Class' ) ;
    public final void rule__Class__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:593:1: ( ( 'Class' ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:594:1: ( 'Class' )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:594:1: ( 'Class' )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:595:1: 'Class'
            {
             before(grammarAccess.getClassAccess().getClassKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Class__Group__1__Impl1138); 
             after(grammarAccess.getClassAccess().getClassKeyword_1()); 

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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:608:1: rule__Class__Group__2 : rule__Class__Group__2__Impl ;
    public final void rule__Class__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:612:1: ( rule__Class__Group__2__Impl )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:613:2: rule__Class__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21169);
            rule__Class__Group__2__Impl();

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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:619:1: rule__Class__Group__2__Impl : ( ( rule__Class__NameAssignment_2 ) ) ;
    public final void rule__Class__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:623:1: ( ( ( rule__Class__NameAssignment_2 ) ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:624:1: ( ( rule__Class__NameAssignment_2 ) )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:624:1: ( ( rule__Class__NameAssignment_2 ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:625:1: ( rule__Class__NameAssignment_2 )
            {
             before(grammarAccess.getClassAccess().getNameAssignment_2()); 
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:626:1: ( rule__Class__NameAssignment_2 )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:626:2: rule__Class__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl1196);
            rule__Class__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getClassAccess().getNameAssignment_2()); 

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


    // $ANTLR start "rule__RamModel__AspectsAssignment"
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:643:1: rule__RamModel__AspectsAssignment : ( ruleAspect ) ;
    public final void rule__RamModel__AspectsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:647:1: ( ( ruleAspect ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:648:1: ( ruleAspect )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:648:1: ( ruleAspect )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:649:1: ruleAspect
            {
             before(grammarAccess.getRamModelAccess().getAspectsAspectParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAspect_in_rule__RamModel__AspectsAssignment1237);
            ruleAspect();

            state._fsp--;

             after(grammarAccess.getRamModelAccess().getAspectsAspectParserRuleCall_0()); 

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
    // $ANTLR end "rule__RamModel__AspectsAssignment"


    // $ANTLR start "rule__Aspect__NameAssignment_1"
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:658:1: rule__Aspect__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Aspect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:662:1: ( ( ruleEString ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:663:1: ( ruleEString )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:663:1: ( ruleEString )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:664:1: ruleEString
            {
             before(grammarAccess.getAspectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Aspect__NameAssignment_11268);
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
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:673:1: rule__Aspect__StructuralViewAssignment_3 : ( ruleStructuralView ) ;
    public final void rule__Aspect__StructuralViewAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:677:1: ( ( ruleStructuralView ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:678:1: ( ruleStructuralView )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:678:1: ( ruleStructuralView )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:679:1: ruleStructuralView
            {
             before(grammarAccess.getAspectAccess().getStructuralViewStructuralViewParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructuralView_in_rule__Aspect__StructuralViewAssignment_31299);
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


    // $ANTLR start "rule__StructuralView__ClassesAssignment_3"
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:688:1: rule__StructuralView__ClassesAssignment_3 : ( ruleClass ) ;
    public final void rule__StructuralView__ClassesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:692:1: ( ( ruleClass ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:693:1: ( ruleClass )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:693:1: ( ruleClass )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:694:1: ruleClass
            {
             before(grammarAccess.getStructuralViewAccess().getClassesClassParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleClass_in_rule__StructuralView__ClassesAssignment_31330);
            ruleClass();

            state._fsp--;

             after(grammarAccess.getStructuralViewAccess().getClassesClassParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__StructuralView__ClassesAssignment_3"


    // $ANTLR start "rule__Class__NameAssignment_2"
    // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:703:1: rule__Class__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Class__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:707:1: ( ( ruleEString ) )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:708:1: ( ruleEString )
            {
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:708:1: ( ruleEString )
            // ../cl.pleiad.ram.textram.ui/src-gen/cl/pleiad/ram/ui/contentassist/antlr/internal/InternalTextram.g:709:1: ruleEString
            {
             before(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Class__NameAssignment_21361);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getClassAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Class__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRamModel_in_entryRuleRamModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRamModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RamModel__AspectsAssignment_in_ruleRamModel94 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0_in_ruleAspect155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralView_in_entryRuleStructuralView242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuralView249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__0_in_ruleStructuralView275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_entryRuleClass302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClass309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0_in_ruleClass335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__0418 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__0421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Aspect__Group__0__Impl449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__1480 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__NameAssignment_1_in_rule__Aspect__Group__1__Impl510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__2540 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Aspect__Group__2__Impl571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__3602 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__StructuralViewAssignment_3_in_rule__Aspect__Group__3__Impl632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__4662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Aspect__Group__4__Impl690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__0__Impl_in_rule__StructuralView__Group__0731 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__1_in_rule__StructuralView__Group__0734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__1__Impl_in_rule__StructuralView__Group__1792 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__2_in_rule__StructuralView__Group__1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StructuralView__Group__1__Impl823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__2__Impl_in_rule__StructuralView__Group__2854 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__3_in_rule__StructuralView__Group__2857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StructuralView__Group__2__Impl885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__3__Impl_in_rule__StructuralView__Group__3916 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__4_in_rule__StructuralView__Group__3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__ClassesAssignment_3_in_rule__StructuralView__Group__3__Impl946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__4__Impl_in_rule__StructuralView__Group__4977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StructuralView__Group__4__Impl1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__0__Impl_in_rule__Class__Group__01046 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Class__Group__1_in_rule__Class__Group__01049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__1__Impl_in_rule__Class__Group__11107 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Class__Group__2_in_rule__Class__Group__11110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Class__Group__1__Impl1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__Group__2__Impl_in_rule__Class__Group__21169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Class__NameAssignment_2_in_rule__Class__Group__2__Impl1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_rule__RamModel__AspectsAssignment1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Aspect__NameAssignment_11268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralView_in_rule__Aspect__StructuralViewAssignment_31299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClass_in_rule__StructuralView__ClassesAssignment_31330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Class__NameAssignment_21361 = new BitSet(new long[]{0x0000000000000002L});

}