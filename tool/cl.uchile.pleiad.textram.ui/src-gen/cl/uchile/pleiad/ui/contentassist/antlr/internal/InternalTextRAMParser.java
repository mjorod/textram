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


    // $ANTLR start "rule__EString__Alternatives"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:144:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:148:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:149:1: ( RULE_STRING )
                    {
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:149:1: ( RULE_STRING )
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:150:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives250); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:155:6: ( RULE_ID )
                    {
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:155:6: ( RULE_ID )
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:156:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives267); 
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:168:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:172:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:173:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__0297);
            rule__Aspect__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__0300);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:180:1: rule__Aspect__Group__0__Impl : ( 'Aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:184:1: ( ( 'Aspect' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:185:1: ( 'Aspect' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:185:1: ( 'Aspect' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:186:1: 'Aspect'
            {
             before(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Aspect__Group__0__Impl328); 
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:199:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:203:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:204:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
            {
            pushFollow(FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__1359);
            rule__Aspect__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__1362);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:211:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__NameAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:215:1: ( ( ( rule__Aspect__NameAssignment_1 ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:216:1: ( ( rule__Aspect__NameAssignment_1 ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:216:1: ( ( rule__Aspect__NameAssignment_1 ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:217:1: ( rule__Aspect__NameAssignment_1 )
            {
             before(grammarAccess.getAspectAccess().getNameAssignment_1()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:218:1: ( rule__Aspect__NameAssignment_1 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:218:2: rule__Aspect__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Aspect__NameAssignment_1_in_rule__Aspect__Group__1__Impl389);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:228:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:232:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:233:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
            {
            pushFollow(FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__2419);
            rule__Aspect__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__2422);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:240:1: rule__Aspect__Group__2__Impl : ( '{' ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:244:1: ( ( '{' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:245:1: ( '{' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:245:1: ( '{' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:246:1: '{'
            {
             before(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__Aspect__Group__2__Impl450); 
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:259:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:263:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:264:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
            {
            pushFollow(FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__3481);
            rule__Aspect__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__3484);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:271:1: rule__Aspect__Group__3__Impl : ( ( rule__Aspect__StructuralViewAssignment_3 ) ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:275:1: ( ( ( rule__Aspect__StructuralViewAssignment_3 ) ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:276:1: ( ( rule__Aspect__StructuralViewAssignment_3 ) )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:276:1: ( ( rule__Aspect__StructuralViewAssignment_3 ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:277:1: ( rule__Aspect__StructuralViewAssignment_3 )
            {
             before(grammarAccess.getAspectAccess().getStructuralViewAssignment_3()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:278:1: ( rule__Aspect__StructuralViewAssignment_3 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:278:2: rule__Aspect__StructuralViewAssignment_3
            {
            pushFollow(FOLLOW_rule__Aspect__StructuralViewAssignment_3_in_rule__Aspect__Group__3__Impl511);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:288:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:292:1: ( rule__Aspect__Group__4__Impl )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:293:2: rule__Aspect__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__4541);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:299:1: rule__Aspect__Group__4__Impl : ( '}' ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:303:1: ( ( '}' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:304:1: ( '}' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:304:1: ( '}' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:305:1: '}'
            {
             before(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_13_in_rule__Aspect__Group__4__Impl569); 
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:328:1: rule__StructuralView__Group__0 : rule__StructuralView__Group__0__Impl rule__StructuralView__Group__1 ;
    public final void rule__StructuralView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:332:1: ( rule__StructuralView__Group__0__Impl rule__StructuralView__Group__1 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:333:2: rule__StructuralView__Group__0__Impl rule__StructuralView__Group__1
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__0__Impl_in_rule__StructuralView__Group__0610);
            rule__StructuralView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__1_in_rule__StructuralView__Group__0613);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:340:1: rule__StructuralView__Group__0__Impl : ( () ) ;
    public final void rule__StructuralView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:344:1: ( ( () ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:345:1: ( () )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:345:1: ( () )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:346:1: ()
            {
             before(grammarAccess.getStructuralViewAccess().getStructuralViewAction_0()); 
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:347:1: ()
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:349:1: 
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:359:1: rule__StructuralView__Group__1 : rule__StructuralView__Group__1__Impl rule__StructuralView__Group__2 ;
    public final void rule__StructuralView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:363:1: ( rule__StructuralView__Group__1__Impl rule__StructuralView__Group__2 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:364:2: rule__StructuralView__Group__1__Impl rule__StructuralView__Group__2
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__1__Impl_in_rule__StructuralView__Group__1671);
            rule__StructuralView__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__2_in_rule__StructuralView__Group__1674);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:371:1: rule__StructuralView__Group__1__Impl : ( 'StructuralView' ) ;
    public final void rule__StructuralView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:375:1: ( ( 'StructuralView' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:376:1: ( 'StructuralView' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:376:1: ( 'StructuralView' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:377:1: 'StructuralView'
            {
             before(grammarAccess.getStructuralViewAccess().getStructuralViewKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__StructuralView__Group__1__Impl702); 
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:390:1: rule__StructuralView__Group__2 : rule__StructuralView__Group__2__Impl rule__StructuralView__Group__3 ;
    public final void rule__StructuralView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:394:1: ( rule__StructuralView__Group__2__Impl rule__StructuralView__Group__3 )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:395:2: rule__StructuralView__Group__2__Impl rule__StructuralView__Group__3
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__2__Impl_in_rule__StructuralView__Group__2733);
            rule__StructuralView__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuralView__Group__3_in_rule__StructuralView__Group__2736);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:402:1: rule__StructuralView__Group__2__Impl : ( '{' ) ;
    public final void rule__StructuralView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:406:1: ( ( '{' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:407:1: ( '{' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:407:1: ( '{' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:408:1: '{'
            {
             before(grammarAccess.getStructuralViewAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__StructuralView__Group__2__Impl764); 
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:421:1: rule__StructuralView__Group__3 : rule__StructuralView__Group__3__Impl ;
    public final void rule__StructuralView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:425:1: ( rule__StructuralView__Group__3__Impl )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:426:2: rule__StructuralView__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__StructuralView__Group__3__Impl_in_rule__StructuralView__Group__3795);
            rule__StructuralView__Group__3__Impl();

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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:432:1: rule__StructuralView__Group__3__Impl : ( '}' ) ;
    public final void rule__StructuralView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:436:1: ( ( '}' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:437:1: ( '}' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:437:1: ( '}' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:438:1: '}'
            {
             before(grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__StructuralView__Group__3__Impl823); 
             after(grammarAccess.getStructuralViewAccess().getRightCurlyBracketKeyword_3()); 

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


    // $ANTLR start "rule__Aspect__NameAssignment_1"
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:460:1: rule__Aspect__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Aspect__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:464:1: ( ( ruleEString ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:465:1: ( ruleEString )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:465:1: ( ruleEString )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:466:1: ruleEString
            {
             before(grammarAccess.getAspectAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__Aspect__NameAssignment_1867);
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
    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:475:1: rule__Aspect__StructuralViewAssignment_3 : ( ruleStructuralView ) ;
    public final void rule__Aspect__StructuralViewAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:479:1: ( ( ruleStructuralView ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:480:1: ( ruleStructuralView )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:480:1: ( ruleStructuralView )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:481:1: ruleStructuralView
            {
             before(grammarAccess.getAspectAccess().getStructuralViewStructuralViewParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructuralView_in_rule__Aspect__StructuralViewAssignment_3898);
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
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__0297 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__0300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Aspect__Group__0__Impl328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__1359 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__NameAssignment_1_in_rule__Aspect__Group__1__Impl389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__2419 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Aspect__Group__2__Impl450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__3481 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__3484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__StructuralViewAssignment_3_in_rule__Aspect__Group__3__Impl511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Aspect__Group__4__Impl569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__0__Impl_in_rule__StructuralView__Group__0610 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__1_in_rule__StructuralView__Group__0613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__1__Impl_in_rule__StructuralView__Group__1671 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__2_in_rule__StructuralView__Group__1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StructuralView__Group__1__Impl702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__2__Impl_in_rule__StructuralView__Group__2733 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__3_in_rule__StructuralView__Group__2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StructuralView__Group__2__Impl764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuralView__Group__3__Impl_in_rule__StructuralView__Group__3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StructuralView__Group__3__Impl823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__Aspect__NameAssignment_1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuralView_in_rule__Aspect__StructuralViewAssignment_3898 = new BitSet(new long[]{0x0000000000000002L});

}