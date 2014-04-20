package cl.uchile.pleiad.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTextRAMLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
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
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_TEMPLATE=6;
    public static final int RULE_WS=10;

    // delegates
    // delegators

    public InternalTextRAMLexer() {;} 
    public InternalTextRAMLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTextRAMLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11:7: ( '*' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:12:7: ( '+' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:12:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:13:7: ( '-' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:13:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:14:7: ( '#' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:14:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:15:7: ( '~' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:15:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:16:7: ( 'dependsOn' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:16:9: 'dependsOn'
            {
            match("dependsOn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:17:7: ( 'extends' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:17:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:18:7: ( 'o' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:18:9: 'o'
            {
            match('o'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:19:7: ( 'alt' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:19:9: 'alt'
            {
            match("alt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:20:7: ( 'opt' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:20:9: 'opt'
            {
            match("opt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:21:7: ( 'loop' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:21:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:22:7: ( 'X' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:22:9: 'X'
            {
            match('X'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:23:7: ( 'ref' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:23:9: 'ref'
            {
            match("ref"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:24:7: ( 'assoc' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:24:9: 'assoc'
            {
            match("assoc"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:25:7: ( 'attr' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:25:9: 'attr'
            {
            match("attr"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:26:7: ( 'aspect' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:26:9: 'aspect'
            {
            match("aspect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:27:7: ( '{' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:28:7: ( '}' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:28:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:29:7: ( ',' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:29:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:30:7: ( 'instantiations' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:30:9: 'instantiations'
            {
            match("instantiations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:31:7: ( ';' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:31:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:32:7: ( 'messages' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:32:9: 'messages'
            {
            match("messages"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:33:7: ( 'lifelines' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:33:9: 'lifelines'
            {
            match("lifelines"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:34:7: ( 'structure' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:34:9: 'structure'
            {
            match("structure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:35:7: ( 'associations' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:35:9: 'associations'
            {
            match("associations"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:36:7: ( 'class' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:36:9: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:37:7: ( ':' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:37:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:38:7: ( '(' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:38:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:39:7: ( ')' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:39:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:40:7: ( '->' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:40:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:41:7: ( '..' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:41:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:42:7: ( '<' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:42:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:43:7: ( '>' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:43:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:44:7: ( 'messageView' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:44:9: 'messageView'
            {
            match("messageView"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:45:7: ( '.' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:45:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:46:7: ( 'affectedBy' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:46:9: 'affectedBy'
            {
            match("affectedBy"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:47:7: ( 'aspectMessageView' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:47:9: 'aspectMessageView'
            {
            match("aspectMessageView"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:48:7: ( 'pointcut' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:48:9: 'pointcut'
            {
            match("pointcut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:49:7: ( 'advice' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:49:9: 'advice'
            {
            match("advice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:50:7: ( '=' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:50:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:51:7: ( '=>' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:51:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:52:7: ( '[' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:52:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:53:7: ( ']' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:53:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:54:7: ( 'else' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:54:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:55:7: ( ':=' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:55:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:56:7: ( 'abstract' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:56:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:57:7: ( '|' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:57:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:58:7: ( 'static' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:58:9: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:59:7: ( 'new' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:59:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:60:7: ( 'true' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:60:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "RULE_TEMPLATE"
    public final void mRULE_TEMPLATE() throws RecognitionException {
        try {
            int _type = RULE_TEMPLATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11431:15: ( ( RULE_ID '<' RULE_ID '>' )* )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11431:17: ( RULE_ID '<' RULE_ID '>' )*
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11431:17: ( RULE_ID '<' RULE_ID '>' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='^' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11431:18: RULE_ID '<' RULE_ID '>'
            	    {
            	    mRULE_ID(); 
            	    match('<'); 
            	    mRULE_ID(); 
            	    match('>'); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TEMPLATE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11433:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11433:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11433:11: ( '^' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='^') ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11433:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11433:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11435:10: ( ( '0' .. '9' )+ )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11435:12: ( '0' .. '9' )+
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11435:12: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11435:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11437:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11439:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11439:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11439:24: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1>='\u0000' && LA8_1<='.')||(LA8_1>='0' && LA8_1<='\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0>='\u0000' && LA8_0<=')')||(LA8_0>='+' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11439:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11441:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11441:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11441:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11441:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11441:40: ( ( '\\r' )? '\\n' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='\n'||LA11_0=='\r') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11441:41: ( '\\r' )? '\\n'
                    {
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11441:41: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11441:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11443:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11443:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11443:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11445:16: ( . )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11445:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_TEMPLATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt13=58;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:310: RULE_TEMPLATE
                {
                mRULE_TEMPLATE(); 

                }
                break;
            case 52 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:324: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 53 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:332: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 54 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:341: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 55 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:353: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 56 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:369: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 57 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:385: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 58 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:393: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\44\2\uffff\1\56\2\uffff\2\62\1\67\2\62\1\100\1\62\3\uffff\1\62"+
        "\1\uffff\3\62\1\113\2\uffff\1\117\2\uffff\1\62\1\124\3\uffff\2\62"+
        "\1\52\1\62\2\uffff\3\52\10\uffff\1\62\1\uffff\4\62\1\uffff\10\62"+
        "\1\uffff\1\62\3\uffff\1\62\1\uffff\3\62\10\uffff\1\62\5\uffff\3"+
        "\62\5\uffff\3\62\1\171\1\172\10\62\1\u0083\6\62\1\u008a\3\62\1\u008e"+
        "\2\uffff\2\62\1\u0091\3\62\1\u0095\1\62\1\uffff\6\62\1\uffff\1\u009d"+
        "\2\62\1\uffff\1\u00a1\1\62\1\uffff\3\62\1\uffff\5\62\1\u00ab\1\62"+
        "\1\uffff\3\62\1\uffff\1\u00b1\1\62\1\u00b3\5\62\1\u00b9\1\uffff"+
        "\2\62\1\u00bc\2\62\1\uffff\1\62\1\uffff\5\62\1\uffff\2\62\1\uffff"+
        "\3\62\1\u00cb\2\62\1\u00ce\2\62\1\u00d1\1\u00d2\3\62\1\uffff\1\u00d6"+
        "\1\62\1\uffff\1\62\1\u00d9\2\uffff\2\62\1\u00dc\1\uffff\2\62\1\uffff"+
        "\2\62\1\uffff\1\62\1\u00e2\1\u00e3\2\62\2\uffff\3\62\1\u00e9\1\62"+
        "\1\uffff\1\62\1\u00ec\1\uffff";
    static final String DFA13_eofS =
        "\u00ed\uffff";
    static final String DFA13_minS =
        "\1\0\2\uffff\1\76\2\uffff\7\60\3\uffff\1\60\1\uffff\3\60\1\75\2"+
        "\uffff\1\56\2\uffff\1\60\1\76\3\uffff\2\60\1\101\1\60\2\uffff\2"+
        "\0\1\52\10\uffff\1\60\1\uffff\4\60\1\uffff\10\60\1\uffff\1\60\3"+
        "\uffff\1\60\1\uffff\3\60\10\uffff\1\60\5\uffff\3\60\5\uffff\31\60"+
        "\2\uffff\10\60\1\uffff\6\60\1\uffff\3\60\1\uffff\2\60\1\uffff\3"+
        "\60\1\uffff\7\60\1\uffff\3\60\1\uffff\11\60\1\uffff\5\60\1\uffff"+
        "\1\60\1\uffff\5\60\1\uffff\2\60\1\uffff\16\60\1\uffff\2\60\1\uffff"+
        "\2\60\2\uffff\3\60\1\uffff\2\60\1\uffff\2\60\1\uffff\5\60\2\uffff"+
        "\5\60\1\uffff\2\60\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\2\uffff\1\76\2\uffff\7\172\3\uffff\1\172\1\uffff\3\172"+
        "\1\75\2\uffff\1\56\2\uffff\1\172\1\76\3\uffff\4\172\2\uffff\2\uffff"+
        "\1\57\10\uffff\1\172\1\uffff\4\172\1\uffff\10\172\1\uffff\1\172"+
        "\3\uffff\1\172\1\uffff\3\172\10\uffff\1\172\5\uffff\3\172\5\uffff"+
        "\31\172\2\uffff\10\172\1\uffff\6\172\1\uffff\3\172\1\uffff\2\172"+
        "\1\uffff\3\172\1\uffff\7\172\1\uffff\3\172\1\uffff\11\172\1\uffff"+
        "\5\172\1\uffff\1\172\1\uffff\5\172\1\uffff\2\172\1\uffff\16\172"+
        "\1\uffff\2\172\1\uffff\2\172\2\uffff\3\172\1\uffff\2\172\1\uffff"+
        "\2\172\1\uffff\5\172\2\uffff\5\172\1\uffff\2\172\1\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\4\1\5\7\uffff\1\21\1\22\1\23\1\uffff"+
        "\1\25\4\uffff\1\34\1\35\1\uffff\1\40\1\41\2\uffff\1\52\1\53\1\57"+
        "\4\uffff\1\63\1\65\3\uffff\1\71\1\72\1\1\1\2\1\36\1\3\1\4\1\5\1"+
        "\uffff\1\64\4\uffff\1\10\10\uffff\1\14\1\uffff\1\21\1\22\1\23\1"+
        "\uffff\1\25\3\uffff\1\55\1\33\1\34\1\35\1\37\1\43\1\40\1\41\1\uffff"+
        "\1\51\1\50\1\52\1\53\1\57\3\uffff\1\65\1\66\1\67\1\70\1\71\31\uffff"+
        "\1\12\1\11\10\uffff\1\15\6\uffff\1\61\3\uffff\1\54\2\uffff\1\17"+
        "\3\uffff\1\13\7\uffff\1\62\3\uffff\1\16\11\uffff\1\32\5\uffff\1"+
        "\20\1\uffff\1\47\5\uffff\1\60\2\uffff\1\7\16\uffff\1\56\2\uffff"+
        "\1\26\2\uffff\1\46\1\6\3\uffff\1\27\2\uffff\1\30\2\uffff\1\44\5"+
        "\uffff\1\42\1\31\5\uffff\1\24\2\uffff\1\45";
    static final String DFA13_specialS =
        "\1\1\45\uffff\1\0\1\2\u00c5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\52\2\51\2\52\1\51\22\52\1\51\1\52\1\46\1\4\3\52\1\47\1\26"+
            "\1\27\1\1\1\2\1\17\1\3\1\30\1\50\12\45\1\25\1\21\1\31\1\34\1"+
            "\32\2\52\27\43\1\13\2\43\1\35\1\52\1\36\1\42\1\43\1\52\1\11"+
            "\1\43\1\24\1\6\1\7\3\43\1\20\2\43\1\12\1\22\1\40\1\10\1\33\1"+
            "\43\1\14\1\23\1\41\6\43\1\15\1\37\1\16\1\5\uff81\52",
            "",
            "",
            "\1\55",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\61\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\13\63"+
            "\1\65\13\63\1\64\2\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\17\63"+
            "\1\66\12\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\1\63"+
            "\1\75\1\63\1\74\1\63\1\73\5\63\1\70\6\63\1\71\1\72\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\77\5\63\1\76\13\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\101\25\63",
            "",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\15\63"+
            "\1\105\14\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\107\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\110\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\13\63"+
            "\1\111\16\63",
            "\1\112",
            "",
            "",
            "\1\116",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\16\63"+
            "\1\122\13\63",
            "\1\123",
            "",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\130\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\21\63"+
            "\1\131\10\63",
            "\32\132\4\uffff\1\132\1\uffff\32\132",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\0\134",
            "\0\134",
            "\1\135\4\uffff\1\136",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\17\63"+
            "\1\140\12\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\141\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\142\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\143\6\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\144\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\17\63"+
            "\1\146\2\63\1\145\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\147\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\5\63"+
            "\1\150\24\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\25\63"+
            "\1\151\4\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\152\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\16\63"+
            "\1\153\13\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\5\63"+
            "\1\154\24\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\5\63"+
            "\1\155\24\63",
            "",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\156\7\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\157\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\1\161"+
            "\20\63\1\160\10\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\1\162"+
            "\31\63",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\163\21\63",
            "",
            "",
            "",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\26\63"+
            "\1\164\3\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\24\63"+
            "\1\165\5\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\166\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\167\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\170\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\16\63"+
            "\1\173\13\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\174\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\21\63"+
            "\1\175\10\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\176\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\177\21\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u0080\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\17\63"+
            "\1\u0081\12\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u0082\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u0084\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\u0085\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\24\63"+
            "\1\u0086\5\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u0087\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\u0088\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\15\63"+
            "\1\u0089\14\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u008b\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\15\63"+
            "\1\u008c\14\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\15\63"+
            "\1\u008d\14\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\2\63"+
            "\1\u008f\27\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\2\63"+
            "\1\u0090\27\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\2\63"+
            "\1\u0092\27\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\2\63"+
            "\1\u0093\27\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\21\63"+
            "\1\u0094\10\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\13\63"+
            "\1\u0096\16\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\1\u0097"+
            "\31\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\1\u0098"+
            "\31\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\2\63"+
            "\1\u0099\27\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\u009a\21\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\u009b\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u009c\6\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\3\63"+
            "\1\u009e\26\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\3\63"+
            "\1\u009f\26\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\u00a0\21\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u00a2\6\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u00a3\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u00a4\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\1\u00a5"+
            "\31\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\u00a6\21\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\15\63"+
            "\1\u00a7\14\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\6\63"+
            "\1\u00a8\23\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u00a9\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\2\63"+
            "\1\u00aa\27\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\2\63"+
            "\1\u00ac\27\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\u00ad\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\u00ae\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\1\u00af"+
            "\31\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\14\63\1\u00b0\15\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u00b2\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\2\63"+
            "\1\u00b4\27\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\15\63"+
            "\1\u00b5\14\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u00b6\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u00b7\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\24\63"+
            "\1\u00b8\5\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\24\63"+
            "\1\u00ba\5\63",
            "\12\63\2\uffff\1\44\4\uffff\16\63\1\u00bb\13\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u00bd\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u00be\25\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\3\63"+
            "\1\u00bf\26\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u00c0\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u00c1\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\u00c2\21\63",
            "\12\63\2\uffff\1\44\4\uffff\25\63\1\u00c4\4\63\4\uffff\1\63"+
            "\1\uffff\22\63\1\u00c3\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\21\63"+
            "\1\u00c5\10\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u00c6\6\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\15\63"+
            "\1\u00c7\14\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\u00c8\21\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\u00c9\7\63",
            "\12\63\2\uffff\1\44\4\uffff\1\63\1\u00ca\30\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\u00cc\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\1\u00cd"+
            "\31\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\u00cf\21\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u00d0\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\16\63"+
            "\1\u00d3\13\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\u00d4\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\30\63"+
            "\1\u00d5\1\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\23\63"+
            "\1\u00d7\6\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u00d8\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\15\63"+
            "\1\u00da\14\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\1\u00db"+
            "\31\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\u00dd\21\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\26\63"+
            "\1\u00de\3\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\u00df\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\6\63"+
            "\1\u00e0\23\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\16\63"+
            "\1\u00e1\13\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u00e4\25\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\15\63"+
            "\1\u00e5\14\63",
            "",
            "",
            "\12\63\2\uffff\1\44\4\uffff\25\63\1\u00e6\4\63\4\uffff\1\63"+
            "\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\22\63"+
            "\1\u00e7\7\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\10\63"+
            "\1\u00e8\21\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\4\63"+
            "\1\u00ea\25\63",
            "",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\26\63"+
            "\1\u00eb\3\63",
            "\12\63\2\uffff\1\44\4\uffff\32\63\4\uffff\1\63\1\uffff\32\63",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | RULE_TEMPLATE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_38 = input.LA(1);

                        s = -1;
                        if ( ((LA13_38>='\u0000' && LA13_38<='\uFFFF')) ) {s = 92;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='*') ) {s = 1;}

                        else if ( (LA13_0=='+') ) {s = 2;}

                        else if ( (LA13_0=='-') ) {s = 3;}

                        else if ( (LA13_0=='#') ) {s = 4;}

                        else if ( (LA13_0=='~') ) {s = 5;}

                        else if ( (LA13_0=='d') ) {s = 6;}

                        else if ( (LA13_0=='e') ) {s = 7;}

                        else if ( (LA13_0=='o') ) {s = 8;}

                        else if ( (LA13_0=='a') ) {s = 9;}

                        else if ( (LA13_0=='l') ) {s = 10;}

                        else if ( (LA13_0=='X') ) {s = 11;}

                        else if ( (LA13_0=='r') ) {s = 12;}

                        else if ( (LA13_0=='{') ) {s = 13;}

                        else if ( (LA13_0=='}') ) {s = 14;}

                        else if ( (LA13_0==',') ) {s = 15;}

                        else if ( (LA13_0=='i') ) {s = 16;}

                        else if ( (LA13_0==';') ) {s = 17;}

                        else if ( (LA13_0=='m') ) {s = 18;}

                        else if ( (LA13_0=='s') ) {s = 19;}

                        else if ( (LA13_0=='c') ) {s = 20;}

                        else if ( (LA13_0==':') ) {s = 21;}

                        else if ( (LA13_0=='(') ) {s = 22;}

                        else if ( (LA13_0==')') ) {s = 23;}

                        else if ( (LA13_0=='.') ) {s = 24;}

                        else if ( (LA13_0=='<') ) {s = 25;}

                        else if ( (LA13_0=='>') ) {s = 26;}

                        else if ( (LA13_0=='p') ) {s = 27;}

                        else if ( (LA13_0=='=') ) {s = 28;}

                        else if ( (LA13_0=='[') ) {s = 29;}

                        else if ( (LA13_0==']') ) {s = 30;}

                        else if ( (LA13_0=='|') ) {s = 31;}

                        else if ( (LA13_0=='n') ) {s = 32;}

                        else if ( (LA13_0=='t') ) {s = 33;}

                        else if ( (LA13_0=='^') ) {s = 34;}

                        else if ( ((LA13_0>='A' && LA13_0<='W')||(LA13_0>='Y' && LA13_0<='Z')||LA13_0=='_'||LA13_0=='b'||(LA13_0>='f' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='k')||LA13_0=='q'||(LA13_0>='u' && LA13_0<='z')) ) {s = 35;}

                        else if ( ((LA13_0>='0' && LA13_0<='9')) ) {s = 37;}

                        else if ( (LA13_0=='\"') ) {s = 38;}

                        else if ( (LA13_0=='\'') ) {s = 39;}

                        else if ( (LA13_0=='/') ) {s = 40;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {s = 41;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='$' && LA13_0<='&')||(LA13_0>='?' && LA13_0<='@')||LA13_0=='\\'||LA13_0=='`'||(LA13_0>='\u007F' && LA13_0<='\uFFFF')) ) {s = 42;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_39 = input.LA(1);

                        s = -1;
                        if ( ((LA13_39>='\u0000' && LA13_39<='\uFFFF')) ) {s = 92;}

                        else s = 42;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}