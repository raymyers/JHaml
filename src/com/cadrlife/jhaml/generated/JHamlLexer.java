// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/JHaml.g 2010-03-19 14:38:39

package com.cadrlife.jhaml.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all") public class JHamlLexer extends Lexer {
    public static final int EXPONENT=37;
    public static final int JAVA_RPAREN=19;
    public static final int END_HASH=12;
    public static final int LBRACE=43;
    public static final int ID=28;
    public static final int EOF=-1;
    public static final int Space=30;
    public static final int STRING_LITERAL=21;
    public static final int FLOATING_POINT_LITERAL=26;
    public static final int COMMA=11;
    public static final int ELEMENT_TYPE=7;
    public static final int JAVA_COMMA=20;
    public static final int HEX_LITERAL=23;
    public static final int NL=33;
    public static final int MAP_TO=13;
    public static final int DOT=27;
    public static final int JAVA_LPAREN=18;
    public static final int JAVA_RBRACE=17;
    public static final int FLOAT_TYPE_SUFFIX=38;
    public static final int TextLine=40;
    public static final int RBRACE=44;
    public static final int PERCENT=6;
    public static final int IGNORED_NEWLINE=34;
    public static final int POUND=29;
    public static final int OCTAL_LITERAL=24;
    public static final int HEX_DIGIT=35;
    public static final int TEXT=5;
    public static final int InLineText=41;
    public static final int BEGIN_HASH=10;
    public static final int RemainderOfLineText=42;
    public static final int ATTRIBUTE_NAME=14;
    public static final int WS=31;
    public static final int WS_WITHIN_HASH=32;
    public static final int NEWLINE=4;
    public static final int CHAR_LITERAL=22;
    public static final int JAVA_CODE=15;
    public static final int JAVA_LBRACE=16;
    public static final int DECIMAL_LITERAL=25;
    public static final int INTEGER_TYPE_SUFFIX=36;
    public static final int EscapeSequence=39;
    public static final int FORWARD_SLASH=8;
    public static final int INDENTATION=9;

    static enum EMode {
          BEGINNING,ELEMENT_TYPE,ELEMENT_DECLARATION,ATTRIBUTE_HASH,AFTER_ATTRIBUTE_HASH,TEXT
        };
    EMode lineMode = EMode.BEGINNING;
    int braceDepth = 0;
    int parenDepth = 0;


    // delegates
    // delegators

    public JHamlLexer() {;} 
    public JHamlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JHamlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../etc/JHaml.g"; }

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
    traceIn("PERCENT", 1);
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:107:8: ({...}? => '%' )
            // ../etc/JHaml.g:107:12: {...}? => '%'
            {
            if ( !((lineMode == EMode.BEGINNING)) ) {
                throw new FailedPredicateException(input, "PERCENT", "lineMode == EMode.BEGINNING");
            }
            match('%'); 
            lineMode = EMode.ELEMENT_TYPE;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("PERCENT", 1);
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "POUND"
    public final void mPOUND() throws RecognitionException {
    traceIn("POUND", 2);
        try {
            int _type = POUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:110:6: ({...}? => '#' )
            // ../etc/JHaml.g:110:8: {...}? => '#'
            {
            if ( !((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.ELEMENT_TYPE)) ) {
                throw new FailedPredicateException(input, "POUND", "lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.ELEMENT_TYPE");
            }
            match('#'); 
            lineMode = EMode.ELEMENT_DECLARATION;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("POUND", 2);
        }
    }
    // $ANTLR end "POUND"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
    traceIn("DOT", 3);
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:113:4: ({...}? => '.' )
            // ../etc/JHaml.g:113:8: {...}? => '.'
            {
            if ( !((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.ELEMENT_TYPE)) ) {
                throw new FailedPredicateException(input, "DOT", "lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.ELEMENT_TYPE");
            }
            match('.'); 
            lineMode = EMode.ELEMENT_DECLARATION;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("DOT", 3);
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "FORWARD_SLASH"
    public final void mFORWARD_SLASH() throws RecognitionException {
    traceIn("FORWARD_SLASH", 4);
        try {
            int _type = FORWARD_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:116:14: ({...}? => '/' )
            // ../etc/JHaml.g:116:16: {...}? => '/'
            {
            if ( !(( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH || lineMode == EMode.ELEMENT_TYPE)) ) {
                throw new FailedPredicateException(input, "FORWARD_SLASH", " lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH || lineMode == EMode.ELEMENT_TYPE");
            }
            match('/'); 
            lineMode = EMode.TEXT;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("FORWARD_SLASH", 4);
        }
    }
    // $ANTLR end "FORWARD_SLASH"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
    traceIn("COMMA", 5);
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:120:6: ({...}? => ',' )
            // ../etc/JHaml.g:120:8: {...}? => ','
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH && parenDepth <= 0)) ) {
                throw new FailedPredicateException(input, "COMMA", " lineMode == EMode.ATTRIBUTE_HASH && parenDepth <= 0");
            }
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("COMMA", 5);
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "JAVA_COMMA"
    public final void mJAVA_COMMA() throws RecognitionException {
    traceIn("JAVA_COMMA", 6);
        try {
            int _type = JAVA_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:123:11: ({...}? => ',' )
            // ../etc/JHaml.g:123:13: {...}? => ','
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH && parenDepth > 0)) ) {
                throw new FailedPredicateException(input, "JAVA_COMMA", " lineMode == EMode.ATTRIBUTE_HASH && parenDepth > 0");
            }
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("JAVA_COMMA", 6);
        }
    }
    // $ANTLR end "JAVA_COMMA"

    // $ANTLR start "JAVA_CODE"
    public final void mJAVA_CODE() throws RecognitionException {
    traceIn("JAVA_CODE", 7);
        try {
            int _type = JAVA_CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:126:10: ({...}? => (~ ( ':' | '=' | ',' | '(' | ')' | ' ' | '\\t' | '\\n' | '\\'' | '\\\"' | ( '0' .. '9' ) | '{' | '}' ) )+ )
            // ../etc/JHaml.g:126:12: {...}? => (~ ( ':' | '=' | ',' | '(' | ')' | ' ' | '\\t' | '\\n' | '\\'' | '\\\"' | ( '0' .. '9' ) | '{' | '}' ) )+
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "JAVA_CODE", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            // ../etc/JHaml.g:127:3: (~ ( ':' | '=' | ',' | '(' | ')' | ' ' | '\\t' | '\\n' | '\\'' | '\\\"' | ( '0' .. '9' ) | '{' | '}' ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\u001F')||LA1_0=='!'||(LA1_0>='#' && LA1_0<='&')||(LA1_0>='*' && LA1_0<='+')||(LA1_0>='-' && LA1_0<='/')||(LA1_0>=';' && LA1_0<='<')||(LA1_0>='>' && LA1_0<='z')||LA1_0=='|'||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../etc/JHaml.g:127:3: ~ ( ':' | '=' | ',' | '(' | ')' | ' ' | '\\t' | '\\n' | '\\'' | '\\\"' | ( '0' .. '9' ) | '{' | '}' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\u001F')||input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='*' && input.LA(1)<='+')||(input.LA(1)>='-' && input.LA(1)<='/')||(input.LA(1)>=';' && input.LA(1)<='<')||(input.LA(1)>='>' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("JAVA_CODE", 7);
        }
    }
    // $ANTLR end "JAVA_CODE"

    // $ANTLR start "ATTRIBUTE_NAME"
    public final void mATTRIBUTE_NAME() throws RecognitionException {
    traceIn("ATTRIBUTE_NAME", 8);
        try {
            int _type = ATTRIBUTE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:130:15: ({...}? => ':' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ../etc/JHaml.g:130:19: {...}? => ':' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "ATTRIBUTE_NAME", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match(':'); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../etc/JHaml.g:131:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../etc/JHaml.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    traceOut("ATTRIBUTE_NAME", 8);
        }
    }
    // $ANTLR end "ATTRIBUTE_NAME"

    // $ANTLR start "MAP_TO"
    public final void mMAP_TO() throws RecognitionException {
    traceIn("MAP_TO", 9);
        try {
            int _type = MAP_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:134:7: ({...}? => '=>' )
            // ../etc/JHaml.g:134:9: {...}? => '=>'
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "MAP_TO", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("MAP_TO", 9);
        }
    }
    // $ANTLR end "MAP_TO"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
    traceIn("ID", 10);
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:137:3: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+ )
            // ../etc/JHaml.g:137:7: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            {
            if ( !(( lineMode == EMode.ELEMENT_DECLARATION )) ) {
                throw new FailedPredicateException(input, "ID", " lineMode == EMode.ELEMENT_DECLARATION ");
            }
            // ../etc/JHaml.g:138:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../etc/JHaml.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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
    traceOut("ID", 10);
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "ELEMENT_TYPE"
    public final void mELEMENT_TYPE() throws RecognitionException {
    traceIn("ELEMENT_TYPE", 11);
        try {
            int _type = ELEMENT_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:140:13: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' )+ )
            // ../etc/JHaml.g:140:17: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' )+
            {
            if ( !(( lineMode == EMode.ELEMENT_TYPE )) ) {
                throw new FailedPredicateException(input, "ELEMENT_TYPE", " lineMode == EMode.ELEMENT_TYPE ");
            }
            // ../etc/JHaml.g:141:3: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | ':' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<=':')||(LA4_0>='A' && LA4_0<='Z')||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../etc/JHaml.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

             lineMode = EMode.ELEMENT_DECLARATION; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("ELEMENT_TYPE", 11);
        }
    }
    // $ANTLR end "ELEMENT_TYPE"

    // $ANTLR start "INDENTATION"
    public final void mINDENTATION() throws RecognitionException {
    traceIn("INDENTATION", 12);
        try {
            int _type = INDENTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:144:13: ({...}? => ( Space )+ )
            // ../etc/JHaml.g:144:15: {...}? => ( Space )+
            {
            if ( !(( lineMode == EMode.BEGINNING )) ) {
                throw new FailedPredicateException(input, "INDENTATION", " lineMode == EMode.BEGINNING ");
            }
            // ../etc/JHaml.g:145:3: ( Space )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\t'||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../etc/JHaml.g:145:3: Space
            	    {
            	    mSpace(); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("INDENTATION", 12);
        }
    }
    // $ANTLR end "INDENTATION"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
    traceIn("WS", 13);
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:147:4: ({...}? => ( Space )+ )
            // ../etc/JHaml.g:147:6: {...}? => ( Space )+
            {
            if ( !(( lineMode == EMode.ELEMENT_TYPE || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "WS", " lineMode == EMode.ELEMENT_TYPE || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH ");
            }
            // ../etc/JHaml.g:148:3: ( Space )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\t'||LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../etc/JHaml.g:148:3: Space
            	    {
            	    mSpace(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

             _channel = HIDDEN; lineMode = EMode.TEXT; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("WS", 13);
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "WS_WITHIN_HASH"
    public final void mWS_WITHIN_HASH() throws RecognitionException {
    traceIn("WS_WITHIN_HASH", 14);
        try {
            int _type = WS_WITHIN_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:150:16: ({...}? => Space )
            // ../etc/JHaml.g:150:18: {...}? => Space
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "WS_WITHIN_HASH", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            mSpace(); 
             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("WS_WITHIN_HASH", 14);
        }
    }
    // $ANTLR end "WS_WITHIN_HASH"

    // $ANTLR start "Space"
    public final void mSpace() throws RecognitionException {
    traceIn("Space", 15);
        try {
            // ../etc/JHaml.g:153:15: ( ( '\\t' | ' ' ) )
            // ../etc/JHaml.g:153:17: ( '\\t' | ' ' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
    traceOut("Space", 15);
        }
    }
    // $ANTLR end "Space"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
    traceIn("NEWLINE", 16);
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:156:10: ({...}? => NL )
            // ../etc/JHaml.g:156:12: {...}? => NL
            {
            if ( !(( lineMode != EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "NEWLINE", " lineMode != EMode.ATTRIBUTE_HASH ");
            }
            mNL(); 
            lineMode = EMode.BEGINNING;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("NEWLINE", 16);
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "IGNORED_NEWLINE"
    public final void mIGNORED_NEWLINE() throws RecognitionException {
    traceIn("IGNORED_NEWLINE", 17);
        try {
            int _type = IGNORED_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:157:18: ({...}? => NL )
            // ../etc/JHaml.g:157:20: {...}? => NL
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "IGNORED_NEWLINE", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            mNL(); 
            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("IGNORED_NEWLINE", 17);
        }
    }
    // $ANTLR end "IGNORED_NEWLINE"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
    traceIn("NL", 18);
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:158:3: ( '\\n' )
            // ../etc/JHaml.g:158:5: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("NL", 18);
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
    traceIn("HEX_LITERAL", 19);
        try {
            int _type = HEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:160:13: ({...}? => '0' ( 'x' | 'X' ) ( HEX_DIGIT )+ ( INTEGER_TYPE_SUFFIX )? )
            // ../etc/JHaml.g:160:15: {...}? => '0' ( 'x' | 'X' ) ( HEX_DIGIT )+ ( INTEGER_TYPE_SUFFIX )?
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "HEX_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../etc/JHaml.g:160:69: ( HEX_DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='F')||(LA7_0>='a' && LA7_0<='f')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../etc/JHaml.g:160:69: HEX_DIGIT
            	    {
            	    mHEX_DIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../etc/JHaml.g:160:80: ( INTEGER_TYPE_SUFFIX )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='L'||LA8_0=='l') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../etc/JHaml.g:160:80: INTEGER_TYPE_SUFFIX
                    {
                    mINTEGER_TYPE_SUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("HEX_LITERAL", 19);
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
    traceIn("DECIMAL_LITERAL", 20);
        try {
            int _type = DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:162:17: ({...}? => ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( INTEGER_TYPE_SUFFIX )? )
            // ../etc/JHaml.g:162:19: {...}? => ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( INTEGER_TYPE_SUFFIX )?
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "DECIMAL_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            // ../etc/JHaml.g:162:59: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                alt10=1;
            }
            else if ( ((LA10_0>='1' && LA10_0<='9')) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../etc/JHaml.g:162:60: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../etc/JHaml.g:162:66: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../etc/JHaml.g:162:75: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../etc/JHaml.g:162:75: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../etc/JHaml.g:162:86: ( INTEGER_TYPE_SUFFIX )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='L'||LA11_0=='l') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../etc/JHaml.g:162:86: INTEGER_TYPE_SUFFIX
                    {
                    mINTEGER_TYPE_SUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("DECIMAL_LITERAL", 20);
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "OCTAL_LITERAL"
    public final void mOCTAL_LITERAL() throws RecognitionException {
    traceIn("OCTAL_LITERAL", 21);
        try {
            int _type = OCTAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:164:15: ({...}? => '0' ( '0' .. '7' )+ ( INTEGER_TYPE_SUFFIX )? )
            // ../etc/JHaml.g:164:17: {...}? => '0' ( '0' .. '7' )+ ( INTEGER_TYPE_SUFFIX )?
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "OCTAL_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('0'); 
            // ../etc/JHaml.g:164:61: ( '0' .. '7' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='7')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../etc/JHaml.g:164:62: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

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

            // ../etc/JHaml.g:164:73: ( INTEGER_TYPE_SUFFIX )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='L'||LA13_0=='l') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../etc/JHaml.g:164:73: INTEGER_TYPE_SUFFIX
                    {
                    mINTEGER_TYPE_SUFFIX(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("OCTAL_LITERAL", 21);
        }
    }
    // $ANTLR end "OCTAL_LITERAL"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
    traceIn("HEX_DIGIT", 22);
        try {
            // ../etc/JHaml.g:167:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../etc/JHaml.g:167:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
    traceOut("HEX_DIGIT", 22);
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "INTEGER_TYPE_SUFFIX"
    public final void mINTEGER_TYPE_SUFFIX() throws RecognitionException {
    traceIn("INTEGER_TYPE_SUFFIX", 23);
        try {
            // ../etc/JHaml.g:170:21: ( ( 'l' | 'L' ) )
            // ../etc/JHaml.g:170:23: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
    traceOut("INTEGER_TYPE_SUFFIX", 23);
        }
    }
    // $ANTLR end "INTEGER_TYPE_SUFFIX"

    // $ANTLR start "FLOATING_POINT_LITERAL"
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
    traceIn("FLOATING_POINT_LITERAL", 24);
        try {
            int _type = FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:173:5: ({...}? => ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX ) | '.' ( '0' .. '9' )+ ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? ) )
            // ../etc/JHaml.g:173:7: {...}? => ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX ) | '.' ( '0' .. '9' )+ ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? )
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "FLOATING_POINT_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            // ../etc/JHaml.g:174:7: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX ) | '.' ( '0' .. '9' )+ ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                alt23=1;
            }
            else if ( (LA23_0=='.') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../etc/JHaml.g:174:9: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX )
                    {
                    // ../etc/JHaml.g:174:9: ( '0' .. '9' )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../etc/JHaml.g:174:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    // ../etc/JHaml.g:175:9: ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX )
                    int alt19=3;
                    switch ( input.LA(1) ) {
                    case '.':
                        {
                        alt19=1;
                        }
                        break;
                    case 'E':
                    case 'e':
                        {
                        alt19=2;
                        }
                        break;
                    case 'D':
                    case 'F':
                    case 'd':
                    case 'f':
                        {
                        alt19=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // ../etc/JHaml.g:176:13: '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )?
                            {
                            match('.'); 
                            // ../etc/JHaml.g:176:17: ( '0' .. '9' )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // ../etc/JHaml.g:176:18: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);

                            // ../etc/JHaml.g:176:29: ( EXPONENT )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0=='E'||LA16_0=='e') ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../etc/JHaml.g:176:29: EXPONENT
                                    {
                                    mEXPONENT(); 

                                    }
                                    break;

                            }

                            // ../etc/JHaml.g:176:39: ( FLOAT_TYPE_SUFFIX )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='d'||LA17_0=='f') ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../etc/JHaml.g:176:39: FLOAT_TYPE_SUFFIX
                                    {
                                    mFLOAT_TYPE_SUFFIX(); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../etc/JHaml.g:177:13: EXPONENT ( FLOAT_TYPE_SUFFIX )?
                            {
                            mEXPONENT(); 
                            // ../etc/JHaml.g:177:22: ( FLOAT_TYPE_SUFFIX )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0=='D'||LA18_0=='F'||LA18_0=='d'||LA18_0=='f') ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../etc/JHaml.g:177:22: FLOAT_TYPE_SUFFIX
                                    {
                                    mFLOAT_TYPE_SUFFIX(); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // ../etc/JHaml.g:178:13: FLOAT_TYPE_SUFFIX
                            {
                            mFLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../etc/JHaml.g:180:9: '.' ( '0' .. '9' )+ ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )?
                    {
                    match('.'); 
                    // ../etc/JHaml.g:180:13: ( '0' .. '9' )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='0' && LA20_0<='9')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../etc/JHaml.g:180:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);

                    // ../etc/JHaml.g:180:25: ( EXPONENT )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='E'||LA21_0=='e') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../etc/JHaml.g:180:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }

                    // ../etc/JHaml.g:180:35: ( FLOAT_TYPE_SUFFIX )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='D'||LA22_0=='F'||LA22_0=='d'||LA22_0=='f') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../etc/JHaml.g:180:35: FLOAT_TYPE_SUFFIX
                            {
                            mFLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("FLOATING_POINT_LITERAL", 24);
        }
    }
    // $ANTLR end "FLOATING_POINT_LITERAL"

    // $ANTLR start "FLOAT_TYPE_SUFFIX"
    public final void mFLOAT_TYPE_SUFFIX() throws RecognitionException {
    traceIn("FLOAT_TYPE_SUFFIX", 25);
        try {
            // ../etc/JHaml.g:185:19: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // ../etc/JHaml.g:185:21: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
    traceOut("FLOAT_TYPE_SUFFIX", 25);
        }
    }
    // $ANTLR end "FLOAT_TYPE_SUFFIX"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
    traceIn("EXPONENT", 26);
        try {
            // ../etc/JHaml.g:188:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../etc/JHaml.g:188:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../etc/JHaml.g:188:22: ( '+' | '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='+'||LA24_0=='-') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../etc/JHaml.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../etc/JHaml.g:188:33: ( '0' .. '9' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../etc/JHaml.g:188:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

        }
        finally {
    traceOut("EXPONENT", 26);
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "CHAR_LITERAL"
    public final void mCHAR_LITERAL() throws RecognitionException {
    traceIn("CHAR_LITERAL", 27);
        try {
            int _type = CHAR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:192:5: ({...}? => '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
            // ../etc/JHaml.g:192:7: {...}? => '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "CHAR_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('\''); 
            // ../etc/JHaml.g:192:52: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\\') ) {
                    alt26=1;
                }
                else if ( ((LA26_0>='\u0000' && LA26_0<='&')||(LA26_0>='(' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // ../etc/JHaml.g:192:54: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/JHaml.g:192:71: ~ ( '\\'' | '\\\\' )
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
            	    break loop26;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("CHAR_LITERAL", 27);
        }
    }
    // $ANTLR end "CHAR_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
    traceIn("STRING_LITERAL", 28);
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:196:5: ({...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // ../etc/JHaml.g:196:7: {...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "STRING_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('\"'); 
            // ../etc/JHaml.g:196:51: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='\\') ) {
                    alt27=1;
                }
                else if ( ((LA27_0>='\u0000' && LA27_0<='!')||(LA27_0>='#' && LA27_0<='[')||(LA27_0>=']' && LA27_0<='\uFFFF')) ) {
                    alt27=2;
                }


                switch (alt27) {
            	case 1 :
            	    // ../etc/JHaml.g:196:53: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/JHaml.g:196:70: ~ ( '\\\\' | '\"' )
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
            	    break loop27;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("STRING_LITERAL", 28);
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
    traceIn("EscapeSequence", 29);
        try {
            // ../etc/JHaml.g:200:15: ( '\\\\' ~ NL )
            // ../etc/JHaml.g:200:17: '\\\\' ~ NL
            {
            match('\\'); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<=' ')||(input.LA(1)>='\"' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
    traceOut("EscapeSequence", 29);
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
    traceIn("TEXT", 30);
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:202:5: ( ( TextLine | InLineText )? ( RemainderOfLineText )? )
            // ../etc/JHaml.g:202:7: ( TextLine | InLineText )? ( RemainderOfLineText )?
            {
            // ../etc/JHaml.g:202:7: ( TextLine | InLineText )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='-'||LA28_0=='=') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {
                int LA28_1 = input.LA(2);

                if ( (( lineMode == EMode.BEGINNING )) ) {
                    alt28=1;
                }
                else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {
                    alt28=2;
                }
            }
            else if ( ((LA28_0>='\u0000' && LA28_0<='\b')||(LA28_0>='\u000B' && LA28_0<='\u001F')||(LA28_0>='!' && LA28_0<='\"')||LA28_0=='$'||(LA28_0>='&' && LA28_0<=',')||(LA28_0>='/' && LA28_0<='<')||(LA28_0>='>' && LA28_0<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {
                int LA28_2 = input.LA(2);

                if ( (( lineMode == EMode.BEGINNING )) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // ../etc/JHaml.g:202:8: TextLine
                    {
                    mTextLine(); 

                    }
                    break;
                case 2 :
                    // ../etc/JHaml.g:202:19: InLineText
                    {
                    mInLineText(); 

                    }
                    break;

            }

            // ../etc/JHaml.g:202:32: ( RemainderOfLineText )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../etc/JHaml.g:202:32: RemainderOfLineText
                    {
                    mRemainderOfLineText(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("TEXT", 30);
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "RemainderOfLineText"
    public final void mRemainderOfLineText() throws RecognitionException {
    traceIn("RemainderOfLineText", 31);
        try {
            int _type = RemainderOfLineText;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:204:20: ({...}? => (~ '\\n' )+ )
            // ../etc/JHaml.g:204:22: {...}? => (~ '\\n' )+
            {
            if ( !(( lineMode == EMode.TEXT )) ) {
                throw new FailedPredicateException(input, "RemainderOfLineText", " lineMode == EMode.TEXT ");
            }
            // ../etc/JHaml.g:204:52: (~ '\\n' )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>='\u0000' && LA30_0<='\t')||(LA30_0>='\u000B' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../etc/JHaml.g:204:53: ~ '\\n'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("RemainderOfLineText", 31);
        }
    }
    // $ANTLR end "RemainderOfLineText"

    // $ANTLR start "TextLine"
    public final void mTextLine() throws RecognitionException {
    traceIn("TextLine", 32);
        try {
            int _type = TextLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:206:9: ({...}? => (~ ( '.' | '#' | '%' | NL | Space ) ) )
            // ../etc/JHaml.g:206:11: {...}? => (~ ( '.' | '#' | '%' | NL | Space ) )
            {
            if ( !(( lineMode == EMode.BEGINNING )) ) {
                throw new FailedPredicateException(input, "TextLine", " lineMode == EMode.BEGINNING ");
            }
            // ../etc/JHaml.g:207:3: (~ ( '.' | '#' | '%' | NL | Space ) )
            // ../etc/JHaml.g:207:4: ~ ( '.' | '#' | '%' | NL | Space )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            lineMode = EMode.TEXT;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("TextLine", 32);
        }
    }
    // $ANTLR end "TextLine"

    // $ANTLR start "InLineText"
    public final void mInLineText() throws RecognitionException {
    traceIn("InLineText", 33);
        try {
            int _type = InLineText;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:209:11: ({...}? => ( '-' | '=' ) )
            // ../etc/JHaml.g:209:13: {...}? => ( '-' | '=' )
            {
            if ( !(( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "InLineText", " lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH ");
            }
            if ( input.LA(1)=='-'||input.LA(1)=='=' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            lineMode = EMode.TEXT;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("InLineText", 33);
        }
    }
    // $ANTLR end "InLineText"

    // $ANTLR start "BEGIN_HASH"
    public final void mBEGIN_HASH() throws RecognitionException {
    traceIn("BEGIN_HASH", 34);
        try {
            int _type = BEGIN_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:213:13: ({...}? => LBRACE )
            // ../etc/JHaml.g:213:15: {...}? => LBRACE
            {
            if ( !(( lineMode == EMode.ELEMENT_DECLARATION )) ) {
                throw new FailedPredicateException(input, "BEGIN_HASH", " lineMode == EMode.ELEMENT_DECLARATION ");
            }
            mLBRACE(); 
            lineMode = EMode.ATTRIBUTE_HASH;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("BEGIN_HASH", 34);
        }
    }
    // $ANTLR end "BEGIN_HASH"

    // $ANTLR start "END_HASH"
    public final void mEND_HASH() throws RecognitionException {
    traceIn("END_HASH", 35);
        try {
            int _type = END_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:214:11: ({...}? => RBRACE )
            // ../etc/JHaml.g:214:13: {...}? => RBRACE
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH && braceDepth == 1 )) ) {
                throw new FailedPredicateException(input, "END_HASH", " lineMode == EMode.ATTRIBUTE_HASH && braceDepth == 1 ");
            }
            mRBRACE(); 
            lineMode = EMode.AFTER_ATTRIBUTE_HASH;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("END_HASH", 35);
        }
    }
    // $ANTLR end "END_HASH"

    // $ANTLR start "JAVA_LBRACE"
    public final void mJAVA_LBRACE() throws RecognitionException {
    traceIn("JAVA_LBRACE", 36);
        try {
            int _type = JAVA_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:216:13: ({...}? => LBRACE )
            // ../etc/JHaml.g:216:15: {...}? => LBRACE
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "JAVA_LBRACE", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            mLBRACE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("JAVA_LBRACE", 36);
        }
    }
    // $ANTLR end "JAVA_LBRACE"

    // $ANTLR start "JAVA_RBRACE"
    public final void mJAVA_RBRACE() throws RecognitionException {
    traceIn("JAVA_RBRACE", 37);
        try {
            int _type = JAVA_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:218:13: ({...}? => RBRACE )
            // ../etc/JHaml.g:218:15: {...}? => RBRACE
            {
            if ( !(( braceDepth > 1 )) ) {
                throw new FailedPredicateException(input, "JAVA_RBRACE", " braceDepth > 1 ");
            }
            mRBRACE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("JAVA_RBRACE", 37);
        }
    }
    // $ANTLR end "JAVA_RBRACE"

    // $ANTLR start "JAVA_LPAREN"
    public final void mJAVA_LPAREN() throws RecognitionException {
    traceIn("JAVA_LPAREN", 38);
        try {
            int _type = JAVA_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:220:13: ({...}? => '(' )
            // ../etc/JHaml.g:220:15: {...}? => '('
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "JAVA_LPAREN", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('('); 
             parenDepth++; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("JAVA_LPAREN", 38);
        }
    }
    // $ANTLR end "JAVA_LPAREN"

    // $ANTLR start "JAVA_RPAREN"
    public final void mJAVA_RPAREN() throws RecognitionException {
    traceIn("JAVA_RPAREN", 39);
        try {
            int _type = JAVA_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:223:13: ({...}? => ')' )
            // ../etc/JHaml.g:223:15: {...}? => ')'
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "JAVA_RPAREN", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match(')'); 
             if (parenDepth > 0) parenDepth--; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("JAVA_RPAREN", 39);
        }
    }
    // $ANTLR end "JAVA_RPAREN"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
    traceIn("LBRACE", 40);
        try {
            // ../etc/JHaml.g:226:17: ( '{' )
            // ../etc/JHaml.g:226:19: '{'
            {
            match('{'); 
            braceDepth++;

            }

        }
        finally {
    traceOut("LBRACE", 40);
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
    traceIn("RBRACE", 41);
        try {
            // ../etc/JHaml.g:227:18: ( '}' )
            // ../etc/JHaml.g:227:20: '}'
            {
            match('}'); 
            braceDepth--;

            }

        }
        finally {
    traceOut("RBRACE", 41);
        }
    }
    // $ANTLR end "RBRACE"

    public void mTokens() throws RecognitionException {
        // ../etc/JHaml.g:1:8: ( PERCENT | POUND | DOT | FORWARD_SLASH | COMMA | JAVA_COMMA | JAVA_CODE | ATTRIBUTE_NAME | MAP_TO | ID | ELEMENT_TYPE | INDENTATION | WS | WS_WITHIN_HASH | NEWLINE | IGNORED_NEWLINE | NL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | CHAR_LITERAL | STRING_LITERAL | TEXT | RemainderOfLineText | TextLine | InLineText | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | JAVA_LPAREN | JAVA_RPAREN )
        int alt31=33;
        alt31 = dfa31.predict(input);
        switch (alt31) {
            case 1 :
                // ../etc/JHaml.g:1:10: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 2 :
                // ../etc/JHaml.g:1:18: POUND
                {
                mPOUND(); 

                }
                break;
            case 3 :
                // ../etc/JHaml.g:1:24: DOT
                {
                mDOT(); 

                }
                break;
            case 4 :
                // ../etc/JHaml.g:1:28: FORWARD_SLASH
                {
                mFORWARD_SLASH(); 

                }
                break;
            case 5 :
                // ../etc/JHaml.g:1:42: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 6 :
                // ../etc/JHaml.g:1:48: JAVA_COMMA
                {
                mJAVA_COMMA(); 

                }
                break;
            case 7 :
                // ../etc/JHaml.g:1:59: JAVA_CODE
                {
                mJAVA_CODE(); 

                }
                break;
            case 8 :
                // ../etc/JHaml.g:1:69: ATTRIBUTE_NAME
                {
                mATTRIBUTE_NAME(); 

                }
                break;
            case 9 :
                // ../etc/JHaml.g:1:84: MAP_TO
                {
                mMAP_TO(); 

                }
                break;
            case 10 :
                // ../etc/JHaml.g:1:91: ID
                {
                mID(); 

                }
                break;
            case 11 :
                // ../etc/JHaml.g:1:94: ELEMENT_TYPE
                {
                mELEMENT_TYPE(); 

                }
                break;
            case 12 :
                // ../etc/JHaml.g:1:107: INDENTATION
                {
                mINDENTATION(); 

                }
                break;
            case 13 :
                // ../etc/JHaml.g:1:119: WS
                {
                mWS(); 

                }
                break;
            case 14 :
                // ../etc/JHaml.g:1:122: WS_WITHIN_HASH
                {
                mWS_WITHIN_HASH(); 

                }
                break;
            case 15 :
                // ../etc/JHaml.g:1:137: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 16 :
                // ../etc/JHaml.g:1:145: IGNORED_NEWLINE
                {
                mIGNORED_NEWLINE(); 

                }
                break;
            case 17 :
                // ../etc/JHaml.g:1:161: NL
                {
                mNL(); 

                }
                break;
            case 18 :
                // ../etc/JHaml.g:1:164: HEX_LITERAL
                {
                mHEX_LITERAL(); 

                }
                break;
            case 19 :
                // ../etc/JHaml.g:1:176: DECIMAL_LITERAL
                {
                mDECIMAL_LITERAL(); 

                }
                break;
            case 20 :
                // ../etc/JHaml.g:1:192: OCTAL_LITERAL
                {
                mOCTAL_LITERAL(); 

                }
                break;
            case 21 :
                // ../etc/JHaml.g:1:206: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); 

                }
                break;
            case 22 :
                // ../etc/JHaml.g:1:229: CHAR_LITERAL
                {
                mCHAR_LITERAL(); 

                }
                break;
            case 23 :
                // ../etc/JHaml.g:1:242: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 24 :
                // ../etc/JHaml.g:1:257: TEXT
                {
                mTEXT(); 

                }
                break;
            case 25 :
                // ../etc/JHaml.g:1:262: RemainderOfLineText
                {
                mRemainderOfLineText(); 

                }
                break;
            case 26 :
                // ../etc/JHaml.g:1:282: TextLine
                {
                mTextLine(); 

                }
                break;
            case 27 :
                // ../etc/JHaml.g:1:291: InLineText
                {
                mInLineText(); 

                }
                break;
            case 28 :
                // ../etc/JHaml.g:1:302: BEGIN_HASH
                {
                mBEGIN_HASH(); 

                }
                break;
            case 29 :
                // ../etc/JHaml.g:1:313: END_HASH
                {
                mEND_HASH(); 

                }
                break;
            case 30 :
                // ../etc/JHaml.g:1:322: JAVA_LBRACE
                {
                mJAVA_LBRACE(); 

                }
                break;
            case 31 :
                // ../etc/JHaml.g:1:334: JAVA_RBRACE
                {
                mJAVA_RBRACE(); 

                }
                break;
            case 32 :
                // ../etc/JHaml.g:1:346: JAVA_LPAREN
                {
                mJAVA_LPAREN(); 

                }
                break;
            case 33 :
                // ../etc/JHaml.g:1:358: JAVA_RPAREN
                {
                mJAVA_RPAREN(); 

                }
                break;

        }

    }


    protected DFA31 dfa31 = new DFA31(this);
    static final String DFA31_eotS =
        "\1\22\1\26\1\31\1\32\1\34\1\37\1\40\1\45\1\47\1\51\1\61\1\63\1"+
        "\65\1\67\1\70\1\100\1\102\1\103\1\uffff\1\104\1\105\1\106\1\uffff"+
        "\1\112\1\113\2\uffff\1\120\1\uffff\1\123\1\124\2\uffff\1\131\1\132"+
        "\1\133\1\134\1\uffff\1\136\1\uffff\1\140\1\uffff\1\141\1\142\1\144"+
        "\1\150\1\153\1\154\1\156\1\uffff\1\160\1\uffff\1\164\1\uffff\1\170"+
        "\2\uffff\1\172\1\173\1\174\1\uffff\1\176\1\177\1\u0080\16\uffff"+
        "\1\113\1\120\15\uffff\1\u008b\5\uffff\1\u008d\1\uffff\1\u008f\1"+
        "\u0092\1\u0093\1\uffff\1\u0094\1\u0096\2\uffff\1\u0099\13\uffff"+
        "\1\u009a\3\uffff\1\u009b\11\uffff\1\113\1\120\5\uffff\1\u009d\1"+
        "\uffff\1\u009e\1\u009f\3\uffff\1\u00a0\1\uffff\1\u00a1\12\uffff"+
        "\1\u00a3\1\uffff";
    static final String DFA31_eofS =
        "\u00a4\uffff";
    static final String DFA31_minS =
        "\22\0\1\uffff\51\0\1\uffff\4\0\1\uffff\5\0\3\uffff\2\0\2\uffff"+
        "\3\0\2\uffff\2\0\4\uffff\6\0\1\uffff\17\0\1\uffff\1\0\3\uffff\1"+
        "\0\3\uffff\11\0\6\uffff\2\0\2\uffff\1\0\1\uffff\13\0\1\uffff\3\0"+
        "\1\uffff\7\0";
    static final String DFA31_maxS =
        "\14\uffff\1\0\5\uffff\1\uffff\3\uffff\1\0\2\uffff\2\0\1\uffff\1"+
        "\0\2\uffff\2\0\4\uffff\1\0\1\uffff\1\0\1\uffff\1\0\7\uffff\1\0\1"+
        "\uffff\1\0\1\uffff\1\0\1\uffff\2\0\3\uffff\1\uffff\3\uffff\1\0\1"+
        "\uffff\5\0\3\uffff\2\0\2\uffff\2\uffff\1\0\2\uffff\2\0\4\uffff\4"+
        "\0\1\uffff\1\0\1\uffff\3\0\1\uffff\1\0\3\uffff\1\0\2\uffff\2\0\1"+
        "\uffff\1\0\1\uffff\1\0\3\uffff\1\0\3\uffff\1\0\1\uffff\3\0\1\uffff"+
        "\3\0\6\uffff\2\uffff\2\uffff\1\0\1\uffff\1\0\1\uffff\1\0\2\uffff"+
        "\3\0\1\uffff\1\0\1\uffff\1\uffff\3\0\1\uffff\5\0\1\uffff\1\0";
    static final String DFA31_acceptS =
        "\22\uffff\1\30\51\uffff\1\26\4\uffff\1\27\5\uffff\1\1\1\7\1\31"+
        "\2\uffff\1\2\1\3\3\uffff\1\4\1\32\2\uffff\1\5\1\6\1\12\1\13\6\uffff"+
        "\1\33\17\uffff\1\23\1\uffff\1\14\1\15\1\16\1\uffff\1\17\1\20\1\21"+
        "\11\uffff\1\34\1\36\1\35\1\37\1\40\1\41\2\uffff\1\25\1\10\1\uffff"+
        "\1\11\13\uffff\1\24\3\uffff\1\22\7\uffff";
    static final String DFA31_specialS =
        "\1\u0081\1\60\1\42\1\73\1\40\1\21\1\137\1\104\1\100\1\24\1\14\1"+
        "\30\1\uffff\1\3\1\10\1\132\1\173\1\41\1\uffff\1\22\1\25\1\51\1\62"+
        "\1\16\1\12\1\63\1\64\1\136\1\171\1\76\1\135\1\170\1\126\1\141\1"+
        "\35\1\0\1\117\1\34\1\70\1\143\1\7\1\75\1\174\1\54\1\17\1\127\1\176"+
        "\1\2\1\124\1\120\1\33\1\36\1\20\1\1\1\107\1\121\1\105\1\55\1\133"+
        "\1\130\1\uffff\1\53\1\56\1\77\1\106\1\uffff\1\142\1\31\1\140\1\66"+
        "\1\65\3\uffff\1\u0080\1\43\2\uffff\1\71\1\61\1\167\2\uffff\1\131"+
        "\1\155\4\uffff\1\5\1\52\1\101\1\45\1\175\1\32\1\uffff\1\102\1\27"+
        "\1\50\1\23\1\116\1\26\1\15\1\13\1\47\1\11\1\123\1\162\1\157\1\74"+
        "\1\166\1\uffff\1\46\3\uffff\1\125\3\uffff\1\165\1\134\1\154\1\153"+
        "\1\110\1\37\1\152\1\151\1\103\6\uffff\1\6\1\67\2\uffff\1\44\1\uffff"+
        "\1\164\1\57\1\115\1\122\1\177\1\150\1\114\1\161\1\72\1\147\1\172"+
        "\1\uffff\1\156\1\146\1\145\1\uffff\1\163\1\144\1\113\1\160\1\112"+
        "\1\4\1\111}>";
    static final String[] DFA31_transitionS = {
            "\11\21\1\13\1\14\25\21\1\13\1\21\1\17\1\2\1\21\1\1\1\21\1\16"+
            "\1\24\1\25\2\21\1\5\1\11\1\3\1\4\1\12\11\15\1\7\2\21\1\10\3"+
            "\21\32\6\6\21\32\6\1\20\1\21\1\23\uff82\21",
            "\11\27\1\30\1\uffff\25\27\1\30\1\27\1\30\4\27\3\30\2\27\1"+
            "\30\3\27\13\30\2\27\1\30\75\27\1\30\1\27\1\30\uff82\27",
            "\11\27\1\30\1\uffff\25\27\1\30\1\27\1\30\4\27\3\30\2\27\1"+
            "\30\3\27\13\30\2\27\1\30\75\27\1\30\1\27\1\30\uff82\27",
            "\11\27\1\30\1\uffff\25\27\1\30\1\27\1\30\4\27\3\30\2\27\1"+
            "\30\3\27\12\33\1\30\2\27\1\30\75\27\1\30\1\27\1\30\uff82\27",
            "\11\35\1\36\1\uffff\25\35\1\36\1\35\1\36\4\35\3\36\2\35\1"+
            "\36\3\35\13\36\2\35\1\36\75\35\1\36\1\35\1\36\uff82\35",
            "\12\36\1\uffff\ufff5\36",
            "\11\35\1\36\1\uffff\25\35\1\36\1\35\1\36\4\35\3\36\2\35\1"+
            "\36\3\35\12\42\1\43\2\35\1\36\3\35\32\41\6\35\32\41\1\36\1\35"+
            "\1\36\uff82\35",
            "\12\36\1\uffff\45\36\13\43\6\36\32\44\6\36\32\44\uff85\36",
            "\12\50\1\uffff\63\50\1\46\uffc1\50",
            "\11\52\1\50\1\uffff\25\52\1\50\1\52\1\50\4\52\3\50\2\52\1"+
            "\50\3\52\13\50\2\52\1\50\75\52\1\50\1\52\1\50\uff82\52",
            "\12\36\1\uffff\43\36\1\54\1\36\10\57\2\62\1\43\6\36\3\42\1"+
            "\56\1\55\1\56\5\42\1\60\13\42\1\53\2\42\6\36\3\42\1\56\1\55"+
            "\1\56\5\42\1\60\13\42\1\53\2\42\uff85\36",
            "\11\30\1\64\1\uffff\25\30\1\64\uffdf\30",
            "\1\uffff",
            "\12\36\1\uffff\43\36\1\54\1\36\12\66\1\43\6\36\3\42\1\56\1"+
            "\55\1\56\5\42\1\60\16\42\6\36\3\42\1\56\1\55\1\56\5\42\1\60"+
            "\16\42\uff85\36",
            "\12\72\1\74\34\72\1\73\64\72\1\71\uffa3\72",
            "\12\76\1\101\27\76\1\77\71\76\1\75\uffa3\76",
            "\12\36\1\uffff\ufff5\36",
            "\11\35\1\36\1\uffff\25\35\1\36\1\35\1\36\4\35\3\36\2\35\1"+
            "\36\3\35\13\36\2\35\1\36\75\35\1\36\1\35\1\36\uff82\35",
            "",
            "\12\36\1\uffff\ufff5\36",
            "\12\36\1\uffff\ufff5\36",
            "\12\36\1\uffff\ufff5\36",
            "\1\uffff",
            "\11\27\1\30\1\uffff\25\27\1\30\1\27\1\30\4\27\3\30\2\27\1"+
            "\30\3\27\13\30\2\27\1\30\75\27\1\30\1\27\1\30\uff82\27",
            "\12\30\1\uffff\ufff5\30",
            "\1\uffff",
            "\1\uffff",
            "\12\30\1\uffff\45\30\12\33\12\30\1\117\1\116\1\117\35\30\1"+
            "\117\1\116\1\117\uff99\30",
            "\1\uffff",
            "\11\35\1\36\1\uffff\25\35\1\36\1\35\1\36\4\35\3\36\2\35\1"+
            "\36\3\35\13\36\2\35\1\36\75\35\1\36\1\35\1\36\uff82\35",
            "\12\36\1\uffff\ufff5\36",
            "\1\uffff",
            "\1\uffff",
            "\11\35\1\36\1\uffff\25\35\1\36\1\35\1\36\4\35\3\36\2\35\1"+
            "\36\3\35\12\42\1\43\2\35\1\36\3\35\32\41\6\35\32\41\1\36\1\35"+
            "\1\36\uff82\35",
            "\12\36\1\uffff\45\36\12\42\1\43\6\36\32\42\6\36\32\42\uff85"+
            "\36",
            "\12\36\1\uffff\45\36\13\43\6\36\32\43\6\36\32\43\uff85\36",
            "\12\36\1\uffff\45\36\12\135\1\43\6\36\32\135\6\36\32\135\uff85"+
            "\36",
            "\1\uffff",
            "\12\50\1\uffff\ufff5\50",
            "\1\uffff",
            "\12\50\1\uffff\ufff5\50",
            "\1\uffff",
            "\11\52\1\50\1\uffff\25\52\1\50\1\52\1\50\4\52\3\50\2\52\1"+
            "\50\3\52\13\50\2\52\1\50\75\52\1\50\1\52\1\50\uff82\52",
            "\12\36\1\uffff\45\36\12\143\1\43\6\36\6\143\24\42\6\36\6\143"+
            "\24\42\uff85\36",
            "\12\36\1\uffff\45\36\12\145\12\36\1\147\1\146\1\147\35\36"+
            "\1\147\1\146\1\147\uff99\36",
            "\12\36\1\uffff\40\36\1\152\1\36\1\152\2\36\12\151\1\43\6\36"+
            "\32\42\6\36\32\42\uff85\36",
            "\12\36\1\uffff\45\36\12\42\1\43\6\36\32\42\6\36\32\42\uff85"+
            "\36",
            "\12\36\1\uffff\43\36\1\54\1\36\10\57\2\62\1\43\6\36\3\42\1"+
            "\56\1\55\1\56\5\42\1\155\16\42\6\36\3\42\1\56\1\55\1\56\5\42"+
            "\1\155\16\42\uff85\36",
            "\12\36\1\uffff\45\36\12\42\1\43\6\36\32\42\6\36\32\42\uff85"+
            "\36",
            "\1\uffff",
            "\12\36\1\uffff\43\36\1\54\1\36\12\62\1\43\6\36\3\42\1\56\1"+
            "\55\1\56\24\42\6\36\3\42\1\56\1\55\1\56\24\42\uff85\36",
            "\1\uffff",
            "\11\30\1\64\1\uffff\25\30\1\64\uffdf\30",
            "\1\uffff",
            "\12\36\1\uffff\43\36\1\54\1\36\12\66\1\43\6\36\3\42\1\56\1"+
            "\55\1\56\5\42\1\60\16\42\6\36\3\42\1\56\1\55\1\56\5\42\1\60"+
            "\16\42\uff85\36",
            "\1\uffff",
            "\1\uffff",
            "\12\171\1\uffff\ufff5\171",
            "\12\72\1\74\34\72\1\73\64\72\1\71\uffa3\72",
            "\12\36\1\uffff\ufff5\36",
            "",
            "\12\175\1\uffff\ufff5\175",
            "\12\76\1\101\27\76\1\77\71\76\1\75\uffa3\76",
            "\12\36\1\uffff\ufff5\36",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\12\30\1\uffff\40\30\1\u0087\1\30\1\u0087\2\30\12\u0088\uffc6"+
            "\30",
            "\12\30\1\uffff\ufff5\30",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\135\1\43\6\36\32\135\6\36\32\135\uff85"+
            "\36",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\143\1\43\6\36\6\143\5\42\1\u008e\16"+
            "\42\6\36\6\143\5\42\1\u008e\16\42\uff85\36",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\145\12\36\1\147\1\146\1\147\35\36"+
            "\1\147\1\146\1\147\uff99\36",
            "\12\36\1\uffff\40\36\1\u0090\1\36\1\u0090\2\36\12\u0091\uffc6"+
            "\36",
            "\12\36\1\uffff\ufff5\36",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\151\1\43\6\36\3\42\1\u0095\1\42\1"+
            "\u0095\24\42\6\36\3\42\1\u0095\1\42\1\u0095\24\42\uff85\36",
            "\12\36\1\uffff\45\36\12\u0097\uffc6\36",
            "\1\uffff",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\42\1\43\6\36\32\42\6\36\32\42\uff85"+
            "\36",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\12\72\1\74\34\72\1\73\64\72\1\71\uffa3\72",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\76\1\101\27\76\1\77\71\76\1\75\uffa3\76",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\30\1\uffff\45\30\12\u0088\uffc6\30",
            "\12\30\1\uffff\45\30\12\u0088\12\30\1\117\1\30\1\117\35\30"+
            "\1\117\1\30\1\117\uff99\30",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\42\1\43\6\36\32\42\6\36\32\42\uff85"+
            "\36",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\u0091\uffc6\36",
            "\12\36\1\uffff\45\36\12\u0091\12\36\1\147\1\36\1\147\35\36"+
            "\1\147\1\36\1\147\uff99\36",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\42\1\43\6\36\32\42\6\36\32\42\uff85"+
            "\36",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\u0097\12\36\1\u00a2\1\36\1\u00a2\35"+
            "\36\1\u00a2\1\36\1\u00a2\uff99\36",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\36\1\uffff\ufff5\36",
            "\1\uffff"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PERCENT | POUND | DOT | FORWARD_SLASH | COMMA | JAVA_COMMA | JAVA_CODE | ATTRIBUTE_NAME | MAP_TO | ID | ELEMENT_TYPE | INDENTATION | WS | WS_WITHIN_HASH | NEWLINE | IGNORED_NEWLINE | NL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | CHAR_LITERAL | STRING_LITERAL | TEXT | RemainderOfLineText | TextLine | InLineText | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | JAVA_LPAREN | JAVA_RPAREN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA31_35 = input.LA(1);

                         
                        int index31_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_35>='0' && LA31_35<=':')||(LA31_35>='A' && LA31_35<='Z')||(LA31_35>='a' && LA31_35<='z')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_35>='\u0000' && LA31_35<='\t')||(LA31_35>='\u000B' && LA31_35<='/')||(LA31_35>=';' && LA31_35<='@')||(LA31_35>='[' && LA31_35<='`')||(LA31_35>='{' && LA31_35<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 91;

                         
                        input.seek(index31_35);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA31_53 = input.LA(1);

                         
                        int index31_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode != EMode.ATTRIBUTE_HASH )) ) {s = 117;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 118;}

                        else if ( (true) ) {s = 119;}

                         
                        input.seek(index31_53);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA31_47 = input.LA(1);

                         
                        int index31_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_47=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 44;}

                        else if ( (LA31_47=='E'||LA31_47=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 45;}

                        else if ( (LA31_47=='D'||LA31_47=='F'||LA31_47=='d'||LA31_47=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 46;}

                        else if ( ((LA31_47>='0' && LA31_47<='7')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 47;}

                        else if ( (LA31_47=='L'||LA31_47=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 109;}

                        else if ( ((LA31_47>='A' && LA31_47<='C')||(LA31_47>='G' && LA31_47<='K')||(LA31_47>='M' && LA31_47<='Z')||(LA31_47>='a' && LA31_47<='c')||(LA31_47>='g' && LA31_47<='k')||(LA31_47>='m' && LA31_47<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( ((LA31_47>='8' && LA31_47<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 50;}

                        else if ( (LA31_47==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_47>='\u0000' && LA31_47<='\t')||(LA31_47>='\u000B' && LA31_47<='-')||LA31_47=='/'||(LA31_47>=';' && LA31_47<='@')||(LA31_47>='[' && LA31_47<='`')||(LA31_47>='{' && LA31_47<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 108;

                         
                        input.seek(index31_47);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA31_13 = input.LA(1);

                         
                        int index31_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_13=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 44;}

                        else if ( (LA31_13=='E'||LA31_13=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 45;}

                        else if ( (LA31_13=='D'||LA31_13=='F'||LA31_13=='d'||LA31_13=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 46;}

                        else if ( ((LA31_13>='0' && LA31_13<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 54;}

                        else if ( (LA31_13=='L'||LA31_13=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 48;}

                        else if ( ((LA31_13>='A' && LA31_13<='C')||(LA31_13>='G' && LA31_13<='K')||(LA31_13>='M' && LA31_13<='Z')||(LA31_13>='a' && LA31_13<='c')||(LA31_13>='g' && LA31_13<='k')||(LA31_13>='m' && LA31_13<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_13==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_13>='\u0000' && LA31_13<='\t')||(LA31_13>='\u000B' && LA31_13<='-')||LA31_13=='/'||(LA31_13>=';' && LA31_13<='@')||(LA31_13>='[' && LA31_13<='`')||(LA31_13>='{' && LA31_13<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 55;

                         
                        input.seek(index31_13);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA31_162 = input.LA(1);

                         
                        int index31_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_162>='\u0000' && LA31_162<='\t')||(LA31_162>='\u000B' && LA31_162<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 163;

                         
                        input.seek(index31_162);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA31_89 = input.LA(1);

                         
                        int index31_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_89);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA31_135 = input.LA(1);

                         
                        int index31_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_135>='0' && LA31_135<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 136;}

                        else if ( ((LA31_135>='\u0000' && LA31_135<='\t')||(LA31_135>='\u000B' && LA31_135<='/')||(LA31_135>=':' && LA31_135<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 75;

                         
                        input.seek(index31_135);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA31_40 = input.LA(1);

                         
                        int index31_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_40>='\u0000' && LA31_40<='\t')||(LA31_40>='\u000B' && LA31_40<='\uFFFF')) && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 40;}

                        else s = 96;

                         
                        input.seek(index31_40);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA31_14 = input.LA(1);

                         
                        int index31_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_14=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 57;}

                        else if ( ((LA31_14>='\u0000' && LA31_14<='\t')||(LA31_14>='\u000B' && LA31_14<='&')||(LA31_14>='(' && LA31_14<='[')||(LA31_14>=']' && LA31_14<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 58;}

                        else if ( (LA31_14=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 59;}

                        else if ( (LA31_14=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 60;}

                        else s = 56;

                         
                        input.seek(index31_14);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA31_105 = input.LA(1);

                         
                        int index31_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_105=='D'||LA31_105=='F'||LA31_105=='d'||LA31_105=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 149;}

                        else if ( ((LA31_105>='0' && LA31_105<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 105;}

                        else if ( ((LA31_105>='A' && LA31_105<='C')||LA31_105=='E'||(LA31_105>='G' && LA31_105<='Z')||(LA31_105>='a' && LA31_105<='c')||LA31_105=='e'||(LA31_105>='g' && LA31_105<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_105==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_105>='\u0000' && LA31_105<='\t')||(LA31_105>='\u000B' && LA31_105<='/')||(LA31_105>=';' && LA31_105<='@')||(LA31_105>='[' && LA31_105<='`')||(LA31_105>='{' && LA31_105<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 148;

                         
                        input.seek(index31_105);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA31_24 = input.LA(1);

                         
                        int index31_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_24>='\u0000' && LA31_24<='\t')||(LA31_24>='\u000B' && LA31_24<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 75;

                         
                        input.seek(index31_24);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA31_103 = input.LA(1);

                         
                        int index31_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_103>='\u0000' && LA31_103<='\t')||(LA31_103>='\u000B' && LA31_103<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 147;

                         
                        input.seek(index31_103);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA31_10 = input.LA(1);

                         
                        int index31_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_10=='X'||LA31_10=='x') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 43;}

                        else if ( (LA31_10=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 44;}

                        else if ( (LA31_10=='E'||LA31_10=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 45;}

                        else if ( (LA31_10=='D'||LA31_10=='F'||LA31_10=='d'||LA31_10=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 46;}

                        else if ( ((LA31_10>='0' && LA31_10<='7')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 47;}

                        else if ( (LA31_10=='L'||LA31_10=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 48;}

                        else if ( ((LA31_10>='A' && LA31_10<='C')||(LA31_10>='G' && LA31_10<='K')||(LA31_10>='M' && LA31_10<='W')||(LA31_10>='Y' && LA31_10<='Z')||(LA31_10>='a' && LA31_10<='c')||(LA31_10>='g' && LA31_10<='k')||(LA31_10>='m' && LA31_10<='w')||(LA31_10>='y' && LA31_10<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_10==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_10>='8' && LA31_10<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 50;}

                        else if ( ((LA31_10>='\u0000' && LA31_10<='\t')||(LA31_10>='\u000B' && LA31_10<='-')||LA31_10=='/'||(LA31_10>=';' && LA31_10<='@')||(LA31_10>='[' && LA31_10<='`')||(LA31_10>='{' && LA31_10<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 49;

                         
                        input.seek(index31_10);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA31_102 = input.LA(1);

                         
                        int index31_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_102=='+'||LA31_102=='-') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 144;}

                        else if ( ((LA31_102>='0' && LA31_102<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 145;}

                        else if ( ((LA31_102>='\u0000' && LA31_102<='\t')||(LA31_102>='\u000B' && LA31_102<='*')||LA31_102==','||(LA31_102>='.' && LA31_102<='/')||(LA31_102>=':' && LA31_102<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 146;

                         
                        input.seek(index31_102);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA31_23 = input.LA(1);

                         
                        int index31_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_23>='\u0000' && LA31_23<='\b')||(LA31_23>='\u000B' && LA31_23<='\u001F')||LA31_23=='!'||(LA31_23>='#' && LA31_23<='&')||(LA31_23>='*' && LA31_23<='+')||(LA31_23>='-' && LA31_23<='/')||(LA31_23>=';' && LA31_23<='<')||(LA31_23>='>' && LA31_23<='z')||LA31_23=='|'||(LA31_23>='~' && LA31_23<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 23;}

                        else if ( (LA31_23=='\t'||LA31_23==' '||LA31_23=='\"'||(LA31_23>='\'' && LA31_23<=')')||LA31_23==','||(LA31_23>='0' && LA31_23<=':')||LA31_23=='='||LA31_23=='{'||LA31_23=='}') && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 74;

                         
                        input.seek(index31_23);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA31_44 = input.LA(1);

                         
                        int index31_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_44>='0' && LA31_44<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 101;}

                        else if ( (LA31_44=='E'||LA31_44=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 102;}

                        else if ( (LA31_44=='D'||LA31_44=='F'||LA31_44=='d'||LA31_44=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 103;}

                        else if ( ((LA31_44>='\u0000' && LA31_44<='\t')||(LA31_44>='\u000B' && LA31_44<='/')||(LA31_44>=':' && LA31_44<='C')||(LA31_44>='G' && LA31_44<='c')||(LA31_44>='g' && LA31_44<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 100;

                         
                        input.seek(index31_44);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA31_52 = input.LA(1);

                         
                        int index31_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_52=='\t'||LA31_52==' ') && ((( lineMode == EMode.ELEMENT_TYPE || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 52;}

                        else if ( ((LA31_52>='\u0000' && LA31_52<='\b')||(LA31_52>='\u000B' && LA31_52<='\u001F')||(LA31_52>='!' && LA31_52<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 116;

                         
                        input.seek(index31_52);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA31_5 = input.LA(1);

                         
                        int index31_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_5>='\u0000' && LA31_5<='\t')||(LA31_5>='\u000B' && LA31_5<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 31;

                         
                        input.seek(index31_5);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA31_19 = input.LA(1);

                         
                        int index31_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_19>='\u0000' && LA31_19<='\t')||(LA31_19>='\u000B' && LA31_19<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 68;

                         
                        input.seek(index31_19);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA31_99 = input.LA(1);

                         
                        int index31_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_99=='L'||LA31_99=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 142;}

                        else if ( (LA31_99==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_99>='0' && LA31_99<='9')||(LA31_99>='A' && LA31_99<='F')||(LA31_99>='a' && LA31_99<='f')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 99;}

                        else if ( ((LA31_99>='G' && LA31_99<='K')||(LA31_99>='M' && LA31_99<='Z')||(LA31_99>='g' && LA31_99<='k')||(LA31_99>='m' && LA31_99<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( ((LA31_99>='\u0000' && LA31_99<='\t')||(LA31_99>='\u000B' && LA31_99<='/')||(LA31_99>=';' && LA31_99<='@')||(LA31_99>='[' && LA31_99<='`')||(LA31_99>='{' && LA31_99<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 141;

                         
                        input.seek(index31_99);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA31_9 = input.LA(1);

                         
                        int index31_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_9>='\u0000' && LA31_9<='\b')||(LA31_9>='\u000B' && LA31_9<='\u001F')||LA31_9=='!'||(LA31_9>='#' && LA31_9<='&')||(LA31_9>='*' && LA31_9<='+')||(LA31_9>='-' && LA31_9<='/')||(LA31_9>=';' && LA31_9<='<')||(LA31_9>='>' && LA31_9<='z')||LA31_9=='|'||(LA31_9>='~' && LA31_9<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 42;}

                        else if ( (LA31_9=='\t'||LA31_9==' '||LA31_9=='\"'||(LA31_9>='\'' && LA31_9<=')')||LA31_9==','||(LA31_9>='0' && LA31_9<=':')||LA31_9=='='||LA31_9=='{'||LA31_9=='}') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 40;}

                        else s = 41;

                         
                        input.seek(index31_9);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA31_20 = input.LA(1);

                         
                        int index31_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_20>='\u0000' && LA31_20<='\t')||(LA31_20>='\u000B' && LA31_20<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 69;

                         
                        input.seek(index31_20);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA31_101 = input.LA(1);

                         
                        int index31_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_101=='E'||LA31_101=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 102;}

                        else if ( (LA31_101=='D'||LA31_101=='F'||LA31_101=='d'||LA31_101=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 103;}

                        else if ( ((LA31_101>='0' && LA31_101<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 101;}

                        else if ( ((LA31_101>='\u0000' && LA31_101<='\t')||(LA31_101>='\u000B' && LA31_101<='/')||(LA31_101>=':' && LA31_101<='C')||(LA31_101>='G' && LA31_101<='c')||(LA31_101>='g' && LA31_101<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 143;

                         
                        input.seek(index31_101);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA31_97 = input.LA(1);

                         
                        int index31_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_97);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA31_11 = input.LA(1);

                         
                        int index31_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_11=='\t'||LA31_11==' ') && ((( lineMode == EMode.ELEMENT_TYPE || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 52;}

                        else if ( ((LA31_11>='\u0000' && LA31_11<='\b')||(LA31_11>='\u000B' && LA31_11<='\u001F')||(LA31_11>='!' && LA31_11<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 51;

                         
                        input.seek(index31_11);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA31_67 = input.LA(1);

                         
                        int index31_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                         
                        input.seek(index31_67);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA31_94 = input.LA(1);

                         
                        int index31_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 140;}

                        else if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_94);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA31_50 = input.LA(1);

                         
                        int index31_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_50=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 44;}

                        else if ( (LA31_50=='E'||LA31_50=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 45;}

                        else if ( (LA31_50=='D'||LA31_50=='F'||LA31_50=='d'||LA31_50=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 46;}

                        else if ( ((LA31_50>='0' && LA31_50<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 50;}

                        else if ( ((LA31_50>='A' && LA31_50<='C')||(LA31_50>='G' && LA31_50<='Z')||(LA31_50>='a' && LA31_50<='c')||(LA31_50>='g' && LA31_50<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_50==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_50>='\u0000' && LA31_50<='\t')||(LA31_50>='\u000B' && LA31_50<='-')||LA31_50=='/'||(LA31_50>=';' && LA31_50<='@')||(LA31_50>='[' && LA31_50<='`')||(LA31_50>='{' && LA31_50<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 112;

                         
                        input.seek(index31_50);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA31_37 = input.LA(1);

                         
                        int index31_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                         
                        input.seek(index31_37);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA31_34 = input.LA(1);

                         
                        int index31_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_34>='0' && LA31_34<='9')||(LA31_34>='A' && LA31_34<='Z')||(LA31_34>='a' && LA31_34<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_34==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_34>='\u0000' && LA31_34<='\t')||(LA31_34>='\u000B' && LA31_34<='/')||(LA31_34>=';' && LA31_34<='@')||(LA31_34>='[' && LA31_34<='`')||(LA31_34>='{' && LA31_34<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 90;

                         
                        input.seek(index31_34);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA31_51 = input.LA(1);

                         
                        int index31_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.BEGINNING )) ) {s = 113;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 114;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 115;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_51);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA31_125 = input.LA(1);

                         
                        int index31_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_125=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 63;}

                        else if ( (LA31_125=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 61;}

                        else if ( ((LA31_125>='\u0000' && LA31_125<='\t')||(LA31_125>='\u000B' && LA31_125<='!')||(LA31_125>='#' && LA31_125<='[')||(LA31_125>=']' && LA31_125<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 62;}

                        else if ( (LA31_125=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 65;}

                        else s = 155;

                         
                        input.seek(index31_125);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA31_4 = input.LA(1);

                         
                        int index31_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_4>='\u0000' && LA31_4<='\b')||(LA31_4>='\u000B' && LA31_4<='\u001F')||LA31_4=='!'||(LA31_4>='#' && LA31_4<='&')||(LA31_4>='*' && LA31_4<='+')||(LA31_4>='-' && LA31_4<='/')||(LA31_4>=';' && LA31_4<='<')||(LA31_4>='>' && LA31_4<='z')||LA31_4=='|'||(LA31_4>='~' && LA31_4<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 29;}

                        else if ( (LA31_4=='\t'||LA31_4==' '||LA31_4=='\"'||(LA31_4>='\'' && LA31_4<=')')||LA31_4==','||(LA31_4>='0' && LA31_4<=':')||LA31_4=='='||LA31_4=='{'||LA31_4=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 28;

                         
                        input.seek(index31_4);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA31_17 = input.LA(1);

                         
                        int index31_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_17>='\u0000' && LA31_17<='\b')||(LA31_17>='\u000B' && LA31_17<='\u001F')||LA31_17=='!'||(LA31_17>='#' && LA31_17<='&')||(LA31_17>='*' && LA31_17<='+')||(LA31_17>='-' && LA31_17<='/')||(LA31_17>=';' && LA31_17<='<')||(LA31_17>='>' && LA31_17<='z')||LA31_17=='|'||(LA31_17>='~' && LA31_17<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 29;}

                        else if ( (LA31_17=='\t'||LA31_17==' '||LA31_17=='\"'||(LA31_17>='\'' && LA31_17<=')')||LA31_17==','||(LA31_17>='0' && LA31_17<=':')||LA31_17=='='||LA31_17=='{'||LA31_17=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 67;

                         
                        input.seek(index31_17);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA31_2 = input.LA(1);

                         
                        int index31_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_2>='\u0000' && LA31_2<='\b')||(LA31_2>='\u000B' && LA31_2<='\u001F')||LA31_2=='!'||(LA31_2>='#' && LA31_2<='&')||(LA31_2>='*' && LA31_2<='+')||(LA31_2>='-' && LA31_2<='/')||(LA31_2>=';' && LA31_2<='<')||(LA31_2>='>' && LA31_2<='z')||LA31_2=='|'||(LA31_2>='~' && LA31_2<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 23;}

                        else if ( (LA31_2=='\t'||LA31_2==' '||LA31_2=='\"'||(LA31_2>='\'' && LA31_2<=')')||LA31_2==','||(LA31_2>='0' && LA31_2<=':')||LA31_2=='='||LA31_2=='{'||LA31_2=='}') && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 25;

                         
                        input.seek(index31_2);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA31_75 = input.LA(1);

                         
                        int index31_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_75);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA31_139 = input.LA(1);

                         
                        int index31_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 138;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_139);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA31_92 = input.LA(1);

                         
                        int index31_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 138;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_92);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA31_112 = input.LA(1);

                         
                        int index31_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_112);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA31_104 = input.LA(1);

                         
                        int index31_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_104);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA31_98 = input.LA(1);

                         
                        int index31_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_98);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA31_21 = input.LA(1);

                         
                        int index31_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_21>='\u0000' && LA31_21<='\t')||(LA31_21>='\u000B' && LA31_21<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 70;

                         
                        input.seek(index31_21);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA31_90 = input.LA(1);

                         
                        int index31_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_90);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA31_61 = input.LA(1);

                         
                        int index31_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_61>='\u0000' && LA31_61<='\t')||(LA31_61>='\u000B' && LA31_61<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 125;}

                        else s = 126;

                         
                        input.seek(index31_61);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA31_43 = input.LA(1);

                         
                        int index31_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_43>='0' && LA31_43<='9')||(LA31_43>='A' && LA31_43<='F')||(LA31_43>='a' && LA31_43<='f')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 99;}

                        else if ( ((LA31_43>='G' && LA31_43<='Z')||(LA31_43>='g' && LA31_43<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_43==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_43>='\u0000' && LA31_43<='\t')||(LA31_43>='\u000B' && LA31_43<='/')||(LA31_43>=';' && LA31_43<='@')||(LA31_43>='[' && LA31_43<='`')||(LA31_43>='{' && LA31_43<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 98;

                         
                        input.seek(index31_43);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA31_57 = input.LA(1);

                         
                        int index31_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_57>='\u0000' && LA31_57<='\t')||(LA31_57>='\u000B' && LA31_57<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 121;}

                        else s = 122;

                         
                        input.seek(index31_57);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA31_62 = input.LA(1);

                         
                        int index31_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_62=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 63;}

                        else if ( (LA31_62=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 61;}

                        else if ( ((LA31_62>='\u0000' && LA31_62<='\t')||(LA31_62>='\u000B' && LA31_62<='!')||(LA31_62>='#' && LA31_62<='[')||(LA31_62>=']' && LA31_62<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 62;}

                        else if ( (LA31_62=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 65;}

                        else s = 127;

                         
                        input.seek(index31_62);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA31_142 = input.LA(1);

                         
                        int index31_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_142>='0' && LA31_142<='9')||(LA31_142>='A' && LA31_142<='Z')||(LA31_142>='a' && LA31_142<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_142==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_142>='\u0000' && LA31_142<='\t')||(LA31_142>='\u000B' && LA31_142<='/')||(LA31_142>=';' && LA31_142<='@')||(LA31_142>='[' && LA31_142<='`')||(LA31_142>='{' && LA31_142<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 157;

                         
                        input.seek(index31_142);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA31_1 = input.LA(1);

                         
                        int index31_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_1>='\u0000' && LA31_1<='\b')||(LA31_1>='\u000B' && LA31_1<='\u001F')||LA31_1=='!'||(LA31_1>='#' && LA31_1<='&')||(LA31_1>='*' && LA31_1<='+')||(LA31_1>='-' && LA31_1<='/')||(LA31_1>=';' && LA31_1<='<')||(LA31_1>='>' && LA31_1<='z')||LA31_1=='|'||(LA31_1>='~' && LA31_1<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 23;}

                        else if ( (LA31_1=='\t'||LA31_1==' '||LA31_1=='\"'||(LA31_1>='\'' && LA31_1<=')')||LA31_1==','||(LA31_1>='0' && LA31_1<=':')||LA31_1=='='||LA31_1=='{'||LA31_1=='}') && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 22;

                         
                        input.seek(index31_1);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA31_79 = input.LA(1);

                         
                        int index31_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_79>='\u0000' && LA31_79<='\t')||(LA31_79>='\u000B' && LA31_79<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 80;

                         
                        input.seek(index31_79);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA31_22 = input.LA(1);

                         
                        int index31_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING)) ) {s = 71;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_22);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA31_25 = input.LA(1);

                         
                        int index31_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.ELEMENT_TYPE)) ) {s = 76;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_25);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA31_26 = input.LA(1);

                         
                        int index31_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.ELEMENT_TYPE)) ) {s = 77;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_26);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA31_70 = input.LA(1);

                         
                        int index31_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 134;}

                         
                        input.seek(index31_70);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA31_69 = input.LA(1);

                         
                        int index31_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 133;}

                         
                        input.seek(index31_69);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA31_136 = input.LA(1);

                         
                        int index31_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_136=='D'||LA31_136=='F'||LA31_136=='d'||LA31_136=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 79;}

                        else if ( ((LA31_136>='0' && LA31_136<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 136;}

                        else if ( ((LA31_136>='\u0000' && LA31_136<='\t')||(LA31_136>='\u000B' && LA31_136<='/')||(LA31_136>=':' && LA31_136<='C')||LA31_136=='E'||(LA31_136>='G' && LA31_136<='c')||LA31_136=='e'||(LA31_136>='g' && LA31_136<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 80;

                         
                        input.seek(index31_136);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA31_38 = input.LA(1);

                         
                        int index31_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_38>='\u0000' && LA31_38<='\t')||(LA31_38>='\u000B' && LA31_38<='\uFFFF')) && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 40;}

                        else s = 94;

                         
                        input.seek(index31_38);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA31_78 = input.LA(1);

                         
                        int index31_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_78=='+'||LA31_78=='-') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 135;}

                        else if ( ((LA31_78>='0' && LA31_78<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 136;}

                        else if ( ((LA31_78>='\u0000' && LA31_78<='\t')||(LA31_78>='\u000B' && LA31_78<='*')||LA31_78==','||(LA31_78>='.' && LA31_78<='/')||(LA31_78>=':' && LA31_78<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 75;

                         
                        input.seek(index31_78);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA31_149 = input.LA(1);

                         
                        int index31_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_149>='0' && LA31_149<='9')||(LA31_149>='A' && LA31_149<='Z')||(LA31_149>='a' && LA31_149<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_149==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_149>='\u0000' && LA31_149<='\t')||(LA31_149>='\u000B' && LA31_149<='/')||(LA31_149>=';' && LA31_149<='@')||(LA31_149>='[' && LA31_149<='`')||(LA31_149>='{' && LA31_149<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 160;

                         
                        input.seek(index31_149);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA31_3 = input.LA(1);

                         
                        int index31_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_3>='\u0000' && LA31_3<='\b')||(LA31_3>='\u000B' && LA31_3<='\u001F')||LA31_3=='!'||(LA31_3>='#' && LA31_3<='&')||(LA31_3>='*' && LA31_3<='+')||(LA31_3>='-' && LA31_3<='/')||(LA31_3>=';' && LA31_3<='<')||(LA31_3>='>' && LA31_3<='z')||LA31_3=='|'||(LA31_3>='~' && LA31_3<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 23;}

                        else if ( ((LA31_3>='0' && LA31_3<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 27;}

                        else if ( (LA31_3=='\t'||LA31_3==' '||LA31_3=='\"'||(LA31_3>='\'' && LA31_3<=')')||LA31_3==','||LA31_3==':'||LA31_3=='='||LA31_3=='{'||LA31_3=='}') && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 26;

                         
                        input.seek(index31_3);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA31_109 = input.LA(1);

                         
                        int index31_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_109>='0' && LA31_109<='9')||(LA31_109>='A' && LA31_109<='Z')||(LA31_109>='a' && LA31_109<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_109==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_109>='\u0000' && LA31_109<='\t')||(LA31_109>='\u000B' && LA31_109<='/')||(LA31_109>=';' && LA31_109<='@')||(LA31_109>='[' && LA31_109<='`')||(LA31_109>='{' && LA31_109<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 153;

                         
                        input.seek(index31_109);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA31_41 = input.LA(1);

                         
                        int index31_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 95;}

                         
                        input.seek(index31_41);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA31_29 = input.LA(1);

                         
                        int index31_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_29>='\u0000' && LA31_29<='\b')||(LA31_29>='\u000B' && LA31_29<='\u001F')||LA31_29=='!'||(LA31_29>='#' && LA31_29<='&')||(LA31_29>='*' && LA31_29<='+')||(LA31_29>='-' && LA31_29<='/')||(LA31_29>=';' && LA31_29<='<')||(LA31_29>='>' && LA31_29<='z')||LA31_29=='|'||(LA31_29>='~' && LA31_29<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 29;}

                        else if ( (LA31_29=='\t'||LA31_29==' '||LA31_29=='\"'||(LA31_29>='\'' && LA31_29<=')')||LA31_29==','||(LA31_29>='0' && LA31_29<=':')||LA31_29=='='||LA31_29=='{'||LA31_29=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 83;

                         
                        input.seek(index31_29);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA31_63 = input.LA(1);

                         
                        int index31_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_63>='\u0000' && LA31_63<='\t')||(LA31_63>='\u000B' && LA31_63<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 128;

                         
                        input.seek(index31_63);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA31_8 = input.LA(1);

                         
                        int index31_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_8=='>') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA31_8>='\u0000' && LA31_8<='\t')||(LA31_8>='\u000B' && LA31_8<='=')||(LA31_8>='?' && LA31_8<='\uFFFF')) && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 40;}

                        else s = 39;

                         
                        input.seek(index31_8);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA31_91 = input.LA(1);

                         
                        int index31_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_91);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA31_96 = input.LA(1);

                         
                        int index31_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_96);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA31_128 = input.LA(1);

                         
                        int index31_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 65;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_128);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA31_7 = input.LA(1);

                         
                        int index31_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_7>='A' && LA31_7<='Z')||(LA31_7>='a' && LA31_7<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 36;}

                        else if ( ((LA31_7>='0' && LA31_7<=':')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_7>='\u0000' && LA31_7<='\t')||(LA31_7>='\u000B' && LA31_7<='/')||(LA31_7>=';' && LA31_7<='@')||(LA31_7>='[' && LA31_7<='`')||(LA31_7>='{' && LA31_7<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 37;

                         
                        input.seek(index31_7);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA31_56 = input.LA(1);

                         
                        int index31_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                         
                        input.seek(index31_56);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA31_64 = input.LA(1);

                         
                        int index31_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                         
                        input.seek(index31_64);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA31_54 = input.LA(1);

                         
                        int index31_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_54=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 44;}

                        else if ( (LA31_54=='E'||LA31_54=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 45;}

                        else if ( (LA31_54=='D'||LA31_54=='F'||LA31_54=='d'||LA31_54=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 46;}

                        else if ( ((LA31_54>='0' && LA31_54<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 54;}

                        else if ( (LA31_54=='L'||LA31_54=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 48;}

                        else if ( (LA31_54==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_54>='\u0000' && LA31_54<='\t')||(LA31_54>='\u000B' && LA31_54<='-')||LA31_54=='/'||(LA31_54>=';' && LA31_54<='@')||(LA31_54>='[' && LA31_54<='`')||(LA31_54>='{' && LA31_54<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else if ( ((LA31_54>='A' && LA31_54<='C')||(LA31_54>='G' && LA31_54<='K')||(LA31_54>='M' && LA31_54<='Z')||(LA31_54>='a' && LA31_54<='c')||(LA31_54>='g' && LA31_54<='k')||(LA31_54>='m' && LA31_54<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else s = 120;

                         
                        input.seek(index31_54);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA31_124 = input.LA(1);

                         
                        int index31_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 60;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_124);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA31_163 = input.LA(1);

                         
                        int index31_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_163);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA31_161 = input.LA(1);

                         
                        int index31_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_161);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA31_159 = input.LA(1);

                         
                        int index31_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_159);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA31_147 = input.LA(1);

                         
                        int index31_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_147);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA31_143 = input.LA(1);

                         
                        int index31_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_143);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA31_100 = input.LA(1);

                         
                        int index31_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_100);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA31_36 = input.LA(1);

                         
                        int index31_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_36>='0' && LA31_36<='9')||(LA31_36>='A' && LA31_36<='Z')||(LA31_36>='a' && LA31_36<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 93;}

                        else if ( ((LA31_36>='\u0000' && LA31_36<='\t')||(LA31_36>='\u000B' && LA31_36<='/')||(LA31_36>=';' && LA31_36<='@')||(LA31_36>='[' && LA31_36<='`')||(LA31_36>='{' && LA31_36<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else if ( (LA31_36==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else s = 92;

                         
                        input.seek(index31_36);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA31_49 = input.LA(1);

                         
                        int index31_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 111;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                         
                        input.seek(index31_49);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA31_55 = input.LA(1);

                         
                        int index31_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 111;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                         
                        input.seek(index31_55);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA31_144 = input.LA(1);

                         
                        int index31_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_144>='0' && LA31_144<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 145;}

                        else if ( ((LA31_144>='\u0000' && LA31_144<='\t')||(LA31_144>='\u000B' && LA31_144<='/')||(LA31_144>=':' && LA31_144<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 158;

                         
                        input.seek(index31_144);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA31_106 = input.LA(1);

                         
                        int index31_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_106>='0' && LA31_106<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 151;}

                        else if ( ((LA31_106>='\u0000' && LA31_106<='\t')||(LA31_106>='\u000B' && LA31_106<='/')||(LA31_106>=':' && LA31_106<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 150;

                         
                        input.seek(index31_106);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA31_48 = input.LA(1);

                         
                        int index31_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_48>='0' && LA31_48<='9')||(LA31_48>='A' && LA31_48<='Z')||(LA31_48>='a' && LA31_48<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_48==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_48>='\u0000' && LA31_48<='\t')||(LA31_48>='\u000B' && LA31_48<='/')||(LA31_48>=';' && LA31_48<='@')||(LA31_48>='[' && LA31_48<='`')||(LA31_48>='{' && LA31_48<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 110;

                         
                        input.seek(index31_48);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA31_116 = input.LA(1);

                         
                        int index31_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.BEGINNING )) ) {s = 113;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 114;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_116);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA31_32 = input.LA(1);

                         
                        int index31_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                         
                        input.seek(index31_32);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA31_45 = input.LA(1);

                         
                        int index31_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_45>='0' && LA31_45<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 105;}

                        else if ( (LA31_45==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( (LA31_45=='+'||LA31_45=='-') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 106;}

                        else if ( ((LA31_45>='\u0000' && LA31_45<='\t')||(LA31_45>='\u000B' && LA31_45<='*')||LA31_45==','||(LA31_45>='.' && LA31_45<='/')||(LA31_45>=';' && LA31_45<='@')||(LA31_45>='[' && LA31_45<='`')||(LA31_45>='{' && LA31_45<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else if ( ((LA31_45>='A' && LA31_45<='Z')||(LA31_45>='a' && LA31_45<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else s = 104;

                         
                        input.seek(index31_45);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA31_59 = input.LA(1);

                         
                        int index31_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_59>='\u0000' && LA31_59<='\t')||(LA31_59>='\u000B' && LA31_59<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 124;

                         
                        input.seek(index31_59);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA31_83 = input.LA(1);

                         
                        int index31_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_83);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA31_15 = input.LA(1);

                         
                        int index31_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_15=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 61;}

                        else if ( ((LA31_15>='\u0000' && LA31_15<='\t')||(LA31_15>='\u000B' && LA31_15<='!')||(LA31_15>='#' && LA31_15<='[')||(LA31_15>=']' && LA31_15<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 62;}

                        else if ( (LA31_15=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 63;}

                        else if ( (LA31_15=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 65;}

                        else s = 64;

                         
                        input.seek(index31_15);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA31_58 = input.LA(1);

                         
                        int index31_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_58=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 59;}

                        else if ( (LA31_58=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 57;}

                        else if ( ((LA31_58>='\u0000' && LA31_58<='\t')||(LA31_58>='\u000B' && LA31_58<='&')||(LA31_58>='(' && LA31_58<='[')||(LA31_58>=']' && LA31_58<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 58;}

                        else if ( (LA31_58=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 60;}

                        else s = 123;

                         
                        input.seek(index31_58);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA31_121 = input.LA(1);

                         
                        int index31_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_121=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 59;}

                        else if ( (LA31_121=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 57;}

                        else if ( ((LA31_121>='\u0000' && LA31_121<='\t')||(LA31_121>='\u000B' && LA31_121<='&')||(LA31_121>='(' && LA31_121<='[')||(LA31_121>=']' && LA31_121<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 58;}

                        else if ( (LA31_121=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 60;}

                        else s = 154;

                         
                        input.seek(index31_121);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA31_30 = input.LA(1);

                         
                        int index31_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_30>='\u0000' && LA31_30<='\t')||(LA31_30>='\u000B' && LA31_30<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 84;

                         
                        input.seek(index31_30);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA31_27 = input.LA(1);

                         
                        int index31_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_27=='E'||LA31_27=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 78;}

                        else if ( (LA31_27=='D'||LA31_27=='F'||LA31_27=='d'||LA31_27=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 79;}

                        else if ( ((LA31_27>='0' && LA31_27<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 27;}

                        else if ( ((LA31_27>='\u0000' && LA31_27<='\t')||(LA31_27>='\u000B' && LA31_27<='/')||(LA31_27>=':' && LA31_27<='C')||(LA31_27>='G' && LA31_27<='c')||(LA31_27>='g' && LA31_27<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 80;

                         
                        input.seek(index31_27);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA31_6 = input.LA(1);

                         
                        int index31_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_6>='A' && LA31_6<='Z')||(LA31_6>='a' && LA31_6<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 33;}

                        else if ( ((LA31_6>='\u0000' && LA31_6<='\b')||(LA31_6>='\u000B' && LA31_6<='\u001F')||LA31_6=='!'||(LA31_6>='#' && LA31_6<='&')||(LA31_6>='*' && LA31_6<='+')||(LA31_6>='-' && LA31_6<='/')||(LA31_6>=';' && LA31_6<='<')||(LA31_6>='>' && LA31_6<='@')||(LA31_6>='[' && LA31_6<='`')||LA31_6=='|'||(LA31_6>='~' && LA31_6<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 29;}

                        else if ( ((LA31_6>='0' && LA31_6<='9')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_6==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( (LA31_6=='\t'||LA31_6==' '||LA31_6=='\"'||(LA31_6>='\'' && LA31_6<=')')||LA31_6==','||LA31_6=='='||LA31_6=='{'||LA31_6=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 32;

                         
                        input.seek(index31_6);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA31_68 = input.LA(1);

                         
                        int index31_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH && braceDepth == 1 )) ) {s = 131;}

                        else if ( (( braceDepth > 1 )) ) {s = 132;}

                         
                        input.seek(index31_68);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA31_33 = input.LA(1);

                         
                        int index31_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_33>='A' && LA31_33<='Z')||(LA31_33>='a' && LA31_33<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 33;}

                        else if ( ((LA31_33>='\u0000' && LA31_33<='\b')||(LA31_33>='\u000B' && LA31_33<='\u001F')||LA31_33=='!'||(LA31_33>='#' && LA31_33<='&')||(LA31_33>='*' && LA31_33<='+')||(LA31_33>='-' && LA31_33<='/')||(LA31_33>=';' && LA31_33<='<')||(LA31_33>='>' && LA31_33<='@')||(LA31_33>='[' && LA31_33<='`')||LA31_33=='|'||(LA31_33>='~' && LA31_33<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 29;}

                        else if ( ((LA31_33>='0' && LA31_33<='9')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_33==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( (LA31_33=='\t'||LA31_33==' '||LA31_33=='\"'||(LA31_33>='\'' && LA31_33<=')')||LA31_33==','||LA31_33=='='||LA31_33=='{'||LA31_33=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 89;

                         
                        input.seek(index31_33);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA31_66 = input.LA(1);

                         
                        int index31_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 129;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 130;}

                         
                        input.seek(index31_66);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA31_39 = input.LA(1);

                         
                        int index31_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 95;}

                         
                        input.seek(index31_39);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA31_158 = input.LA(1);

                         
                        int index31_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_158);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA31_155 = input.LA(1);

                         
                        int index31_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_155);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA31_154 = input.LA(1);

                         
                        int index31_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_154);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA31_150 = input.LA(1);

                         
                        int index31_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_150);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA31_146 = input.LA(1);

                         
                        int index31_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_146);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA31_127 = input.LA(1);

                         
                        int index31_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_127);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA31_126 = input.LA(1);

                         
                        int index31_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_126);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA31_123 = input.LA(1);

                         
                        int index31_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_123);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA31_122 = input.LA(1);

                         
                        int index31_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_122);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA31_84 = input.LA(1);

                         
                        int index31_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_84);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA31_153 = input.LA(1);

                         
                        int index31_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 152;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_153);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA31_108 = input.LA(1);

                         
                        int index31_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 152;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_108);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA31_160 = input.LA(1);

                         
                        int index31_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_160);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA31_148 = input.LA(1);

                         
                        int index31_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_148);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA31_107 = input.LA(1);

                         
                        int index31_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_107);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA31_157 = input.LA(1);

                         
                        int index31_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 156;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_157);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA31_141 = input.LA(1);

                         
                        int index31_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 156;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_141);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA31_120 = input.LA(1);

                         
                        int index31_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 111;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_120);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA31_110 = input.LA(1);

                         
                        int index31_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 87;}

                        else if ( (( lineMode == EMode.ELEMENT_TYPE )) ) {s = 88;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 111;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_110);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA31_80 = input.LA(1);

                         
                        int index31_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_80);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA31_31 = input.LA(1);

                         
                        int index31_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH && parenDepth <= 0)) ) {s = 85;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH && parenDepth > 0)) ) {s = 86;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                         
                        input.seek(index31_31);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA31_28 = input.LA(1);

                         
                        int index31_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH || lineMode == EMode.ELEMENT_TYPE)) ) {s = 81;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 82;}

                         
                        input.seek(index31_28);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA31_151 = input.LA(1);

                         
                        int index31_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_151=='D'||LA31_151=='F'||LA31_151=='d'||LA31_151=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 162;}

                        else if ( ((LA31_151>='0' && LA31_151<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 151;}

                        else if ( ((LA31_151>='\u0000' && LA31_151<='\t')||(LA31_151>='\u000B' && LA31_151<='/')||(LA31_151>=':' && LA31_151<='C')||LA31_151=='E'||(LA31_151>='G' && LA31_151<='c')||LA31_151=='e'||(LA31_151>='g' && LA31_151<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 161;

                         
                        input.seek(index31_151);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA31_16 = input.LA(1);

                         
                        int index31_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_16>='\u0000' && LA31_16<='\t')||(LA31_16>='\u000B' && LA31_16<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 66;

                         
                        input.seek(index31_16);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA31_42 = input.LA(1);

                         
                        int index31_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_42>='\u0000' && LA31_42<='\b')||(LA31_42>='\u000B' && LA31_42<='\u001F')||LA31_42=='!'||(LA31_42>='#' && LA31_42<='&')||(LA31_42>='*' && LA31_42<='+')||(LA31_42>='-' && LA31_42<='/')||(LA31_42>=';' && LA31_42<='<')||(LA31_42>='>' && LA31_42<='z')||LA31_42=='|'||(LA31_42>='~' && LA31_42<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 42;}

                        else if ( (LA31_42=='\t'||LA31_42==' '||LA31_42=='\"'||(LA31_42>='\'' && LA31_42<=')')||LA31_42==','||(LA31_42>='0' && LA31_42<=':')||LA31_42=='='||LA31_42=='{'||LA31_42=='}') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 40;}

                        else s = 97;

                         
                        input.seek(index31_42);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA31_93 = input.LA(1);

                         
                        int index31_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_93>='0' && LA31_93<='9')||(LA31_93>='A' && LA31_93<='Z')||(LA31_93>='a' && LA31_93<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 93;}

                        else if ( (LA31_93==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_93>='\u0000' && LA31_93<='\t')||(LA31_93>='\u000B' && LA31_93<='/')||(LA31_93>=';' && LA31_93<='@')||(LA31_93>='[' && LA31_93<='`')||(LA31_93>='{' && LA31_93<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 139;

                         
                        input.seek(index31_93);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA31_46 = input.LA(1);

                         
                        int index31_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA31_46>='0' && LA31_46<='9')||(LA31_46>='A' && LA31_46<='Z')||(LA31_46>='a' && LA31_46<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 34;}

                        else if ( (LA31_46==':') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 35;}

                        else if ( ((LA31_46>='\u0000' && LA31_46<='\t')||(LA31_46>='\u000B' && LA31_46<='/')||(LA31_46>=';' && LA31_46<='@')||(LA31_46>='[' && LA31_46<='`')||(LA31_46>='{' && LA31_46<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 107;

                         
                        input.seek(index31_46);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA31_145 = input.LA(1);

                         
                        int index31_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_145=='D'||LA31_145=='F'||LA31_145=='d'||LA31_145=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 103;}

                        else if ( ((LA31_145>='0' && LA31_145<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 145;}

                        else if ( ((LA31_145>='\u0000' && LA31_145<='\t')||(LA31_145>='\u000B' && LA31_145<='/')||(LA31_145>=':' && LA31_145<='C')||LA31_145=='E'||(LA31_145>='G' && LA31_145<='c')||LA31_145=='e'||(LA31_145>='g' && LA31_145<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 159;

                         
                        input.seek(index31_145);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA31_74 = input.LA(1);

                         
                        int index31_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 72;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 73;}

                         
                        input.seek(index31_74);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA31_0 = input.LA(1);

                         
                        int index31_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA31_0=='%') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING)))) {s = 1;}

                        else if ( (LA31_0=='#') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.ELEMENT_TYPE)))) {s = 2;}

                        else if ( (LA31_0=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.ELEMENT_TYPE)))) {s = 3;}

                        else if ( (LA31_0=='/') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH || lineMode == EMode.ELEMENT_TYPE)||( lineMode == EMode.BEGINNING )))) {s = 4;}

                        else if ( (LA31_0==',') && ((( lineMode == EMode.ATTRIBUTE_HASH && parenDepth > 0)||( lineMode == EMode.ATTRIBUTE_HASH && parenDepth <= 0)||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 5;}

                        else if ( ((LA31_0>='A' && LA31_0<='Z')||(LA31_0>='a' && LA31_0<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 6;}

                        else if ( (LA31_0==':') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 7;}

                        else if ( (LA31_0=='=') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 8;}

                        else if ( (LA31_0=='-') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 9;}

                        else if ( (LA31_0=='0') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 10;}

                        else if ( (LA31_0=='\t'||LA31_0==' ') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_TYPE || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 11;}

                        else if ( (LA31_0=='\n') ) {s = 12;}

                        else if ( ((LA31_0>='1' && LA31_0<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ELEMENT_TYPE )))) {s = 13;}

                        else if ( (LA31_0=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 14;}

                        else if ( (LA31_0=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 15;}

                        else if ( (LA31_0=='{') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 16;}

                        else if ( ((LA31_0>='\u0000' && LA31_0<='\b')||(LA31_0>='\u000B' && LA31_0<='\u001F')||LA31_0=='!'||LA31_0=='$'||LA31_0=='&'||(LA31_0>='*' && LA31_0<='+')||(LA31_0>=';' && LA31_0<='<')||(LA31_0>='>' && LA31_0<='@')||(LA31_0>='[' && LA31_0<='`')||LA31_0=='|'||(LA31_0>='~' && LA31_0<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 17;}

                        else if ( (LA31_0=='}') && ((( lineMode == EMode.TEXT )||( braceDepth > 1 )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ATTRIBUTE_HASH && braceDepth == 1 )))) {s = 19;}

                        else if ( (LA31_0=='(') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 20;}

                        else if ( (LA31_0==')') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 21;}

                        else s = 18;

                         
                        input.seek(index31_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 31, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}