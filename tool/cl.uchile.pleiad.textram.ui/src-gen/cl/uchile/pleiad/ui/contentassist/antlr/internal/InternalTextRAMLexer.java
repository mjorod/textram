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

    public InternalTextRAMLexer() {;} 
    public InternalTextRAMLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTextRAMLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11:7: ( 'Aspect' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:11:9: 'Aspect'
            {
            match("Aspect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:12:7: ( '{' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:12:9: '{'
            {
            match('{'); 

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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:13:7: ( '}' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:13:9: '}'
            {
            match('}'); 

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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:14:7: ( 'structure' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:14:9: 'structure'
            {
            match("structure"); 


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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:15:7: ( 'class' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:15:9: 'class'
            {
            match("class"); 


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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:16:7: ( 'partial' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:16:9: 'partial'
            {
            match("partial"); 


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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:17:7: ( 'abstract' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:17:9: 'abstract'
            {
            match("abstract"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:954:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:954:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:954:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:954:11: '^'
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

            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:954:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
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
            	    break loop2;
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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:956:10: ( ( '0' .. '9' )+ )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:956:12: ( '0' .. '9' )+
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:956:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:956:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:958:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop5;
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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:960:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:960:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:960:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:960:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:962:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:962:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:962:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:962:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop8;
                }
            } while (true);

            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:962:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:962:41: ( '\\r' )? '\\n'
                    {
                    // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:962:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:962:41: '\\r'
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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:964:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:964:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:964:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:966:16: ( . )
            // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:966:18: .
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
        // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=14;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:52: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 9 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:60: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 10 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:69: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 11 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:81: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 12 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:97: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 13 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:113: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 14 :
                // ../cl.uchile.pleiad.textram.ui/src-gen/cl/uchile/pleiad/ui/contentassist/antlr/internal/InternalTextRAM.g:1:121: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\21\2\uffff\4\21\1\17\2\uffff\3\17\2\uffff\1\21\3\uffff"+
        "\4\21\5\uffff\14\21\1\56\2\21\1\61\1\21\1\uffff\2\21\1\uffff\1\21"+
        "\1\66\2\21\1\uffff\1\71\1\72\2\uffff";
    static final String DFA12_eofS =
        "\73\uffff";
    static final String DFA12_minS =
        "\1\0\1\163\2\uffff\1\164\1\154\1\141\1\142\1\101\2\uffff\2\0\1\52"+
        "\2\uffff\1\160\3\uffff\1\162\1\141\1\162\1\163\5\uffff\1\145\1\165"+
        "\1\163\2\164\2\143\1\163\1\151\1\162\2\164\1\60\2\141\1\60\1\165"+
        "\1\uffff\1\154\1\143\1\uffff\1\162\1\60\1\164\1\145\1\uffff\2\60"+
        "\2\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\163\2\uffff\1\164\1\154\1\141\1\142\1\172\2\uffff\2\uffff"+
        "\1\57\2\uffff\1\160\3\uffff\1\162\1\141\1\162\1\163\5\uffff\1\145"+
        "\1\165\1\163\2\164\2\143\1\163\1\151\1\162\2\164\1\172\2\141\1\172"+
        "\1\165\1\uffff\1\154\1\143\1\uffff\1\162\1\172\1\164\1\145\1\uffff"+
        "\2\172\2\uffff";
    static final String DFA12_acceptS =
        "\2\uffff\1\2\1\3\5\uffff\1\10\1\11\3\uffff\1\15\1\16\1\uffff\1\10"+
        "\1\2\1\3\4\uffff\1\11\1\12\1\13\1\14\1\15\21\uffff\1\5\2\uffff\1"+
        "\1\4\uffff\1\6\2\uffff\1\7\1\4";
    static final String DFA12_specialS =
        "\1\2\12\uffff\1\1\1\0\56\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\17\2\16\2\17\1\16\22\17\1\16\1\17\1\13\4\17\1\14\7\17\1"+
            "\15\12\12\7\17\1\1\31\11\3\17\1\10\1\11\1\17\1\7\1\11\1\5\14"+
            "\11\1\6\2\11\1\4\7\11\1\2\1\17\1\3\uff82\17",
            "\1\20",
            "",
            "",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            "",
            "\0\31",
            "\0\31",
            "\1\32\4\uffff\1\33",
            "",
            "",
            "\1\35",
            "",
            "",
            "",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\41",
            "",
            "",
            "",
            "",
            "",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\57",
            "\1\60",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\62",
            "",
            "\1\63",
            "\1\64",
            "",
            "\1\65",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\1\67",
            "\1\70",
            "",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "\12\21\7\uffff\32\21\4\uffff\1\21\1\uffff\32\21",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_12 = input.LA(1);

                        s = -1;
                        if ( ((LA12_12>='\u0000' && LA12_12<='\uFFFF')) ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_11 = input.LA(1);

                        s = -1;
                        if ( ((LA12_11>='\u0000' && LA12_11<='\uFFFF')) ) {s = 25;}

                        else s = 15;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='A') ) {s = 1;}

                        else if ( (LA12_0=='{') ) {s = 2;}

                        else if ( (LA12_0=='}') ) {s = 3;}

                        else if ( (LA12_0=='s') ) {s = 4;}

                        else if ( (LA12_0=='c') ) {s = 5;}

                        else if ( (LA12_0=='p') ) {s = 6;}

                        else if ( (LA12_0=='a') ) {s = 7;}

                        else if ( (LA12_0=='^') ) {s = 8;}

                        else if ( ((LA12_0>='B' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='b'||(LA12_0>='d' && LA12_0<='o')||(LA12_0>='q' && LA12_0<='r')||(LA12_0>='t' && LA12_0<='z')) ) {s = 9;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 10;}

                        else if ( (LA12_0=='\"') ) {s = 11;}

                        else if ( (LA12_0=='\'') ) {s = 12;}

                        else if ( (LA12_0=='/') ) {s = 13;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 14;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 15;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}