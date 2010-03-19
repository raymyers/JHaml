// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/JHaml.g 2010-03-19 10:21:20

package com.cadrlife.jhaml.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all") public class JHamlLexer extends Lexer {
    public static final int EXPONENT=36;
    public static final int JAVA_RPAREN=19;
    public static final int END_HASH=12;
    public static final int LBRACE=42;
    public static final int ID=7;
    public static final int EOF=-1;
    public static final int Space=29;
    public static final int STRING_LITERAL=21;
    public static final int FLOATING_POINT_LITERAL=26;
    public static final int COMMA=11;
    public static final int JAVA_COMMA=20;
    public static final int HEX_LITERAL=23;
    public static final int NL=32;
    public static final int MAP_TO=13;
    public static final int DOT=27;
    public static final int JAVA_RBRACE=17;
    public static final int JAVA_LPAREN=18;
    public static final int FLOAT_TYPE_SUFFIX=37;
    public static final int TextLine=39;
    public static final int PERCENT=6;
    public static final int IGNORED_NEWLINE=33;
    public static final int RBRACE=43;
    public static final int POUND=28;
    public static final int OCTAL_LITERAL=24;
    public static final int HEX_DIGIT=34;
    public static final int TEXT=5;
    public static final int InLineText=40;
    public static final int BEGIN_HASH=10;
    public static final int RemainderOfLineText=41;
    public static final int ATTRIBUTE_NAME=14;
    public static final int WS=30;
    public static final int WS_WITHIN_HASH=31;
    public static final int NEWLINE=4;
    public static final int CHAR_LITERAL=22;
    public static final int JAVA_CODE=15;
    public static final int JAVA_LBRACE=16;
    public static final int DECIMAL_LITERAL=25;
    public static final int INTEGER_TYPE_SUFFIX=35;
    public static final int EscapeSequence=38;
    public static final int FORWARD_SLASH=8;
    public static final int INDENTATION=9;

    static enum EMode {
          BEGINNING,ELEMENT_DECLARATION,ATTRIBUTE_HASH,AFTER_ATTRIBUTE_HASH,TEXT
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
            if ( !((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {
                throw new FailedPredicateException(input, "PERCENT", "lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION");
            }
            match('%'); 
            lineMode = EMode.ELEMENT_DECLARATION;

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
            if ( !((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {
                throw new FailedPredicateException(input, "POUND", "lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION");
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
            if ( !((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {
                throw new FailedPredicateException(input, "DOT", "lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION");
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
            if ( !(( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH)) ) {
                throw new FailedPredicateException(input, "FORWARD_SLASH", " lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH");
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
            // ../etc/JHaml.g:137:3: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ../etc/JHaml.g:137:7: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( !(( lineMode == EMode.ELEMENT_DECLARATION )) ) {
                throw new FailedPredicateException(input, "ID", " lineMode == EMode.ELEMENT_DECLARATION ");
            }
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../etc/JHaml.g:138:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            	    break loop3;
                }
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

    // $ANTLR start "INDENTATION"
    public final void mINDENTATION() throws RecognitionException {
    traceIn("INDENTATION", 11);
        try {
            int _type = INDENTATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:141:13: ({...}? => ( Space )+ )
            // ../etc/JHaml.g:141:15: {...}? => ( Space )+
            {
            if ( !(( lineMode == EMode.BEGINNING )) ) {
                throw new FailedPredicateException(input, "INDENTATION", " lineMode == EMode.BEGINNING ");
            }
            // ../etc/JHaml.g:142:3: ( Space )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../etc/JHaml.g:142:3: Space
            	    {
            	    mSpace(); 

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
    traceOut("INDENTATION", 11);
        }
    }
    // $ANTLR end "INDENTATION"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
    traceIn("WS", 12);
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:144:4: ({...}? => ( Space )+ )
            // ../etc/JHaml.g:144:6: {...}? => ( Space )+
            {
            if ( !(( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "WS", " lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH ");
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

             _channel = HIDDEN; lineMode = EMode.TEXT; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("WS", 12);
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "WS_WITHIN_HASH"
    public final void mWS_WITHIN_HASH() throws RecognitionException {
    traceIn("WS_WITHIN_HASH", 13);
        try {
            int _type = WS_WITHIN_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:147:16: ({...}? => Space )
            // ../etc/JHaml.g:147:18: {...}? => Space
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
    traceOut("WS_WITHIN_HASH", 13);
        }
    }
    // $ANTLR end "WS_WITHIN_HASH"

    // $ANTLR start "Space"
    public final void mSpace() throws RecognitionException {
    traceIn("Space", 14);
        try {
            // ../etc/JHaml.g:150:15: ( ( '\\t' | ' ' ) )
            // ../etc/JHaml.g:150:17: ( '\\t' | ' ' )
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
    traceOut("Space", 14);
        }
    }
    // $ANTLR end "Space"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
    traceIn("NEWLINE", 15);
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:153:10: ({...}? => NL )
            // ../etc/JHaml.g:153:12: {...}? => NL
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
    traceOut("NEWLINE", 15);
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "IGNORED_NEWLINE"
    public final void mIGNORED_NEWLINE() throws RecognitionException {
    traceIn("IGNORED_NEWLINE", 16);
        try {
            int _type = IGNORED_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:154:18: ({...}? => NL )
            // ../etc/JHaml.g:154:20: {...}? => NL
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
    traceOut("IGNORED_NEWLINE", 16);
        }
    }
    // $ANTLR end "IGNORED_NEWLINE"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
    traceIn("NL", 17);
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:155:3: ( '\\n' )
            // ../etc/JHaml.g:155:5: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("NL", 17);
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
    traceIn("HEX_LITERAL", 18);
        try {
            int _type = HEX_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:157:13: ({...}? => '0' ( 'x' | 'X' ) ( HEX_DIGIT )+ ( INTEGER_TYPE_SUFFIX )? )
            // ../etc/JHaml.g:157:15: {...}? => '0' ( 'x' | 'X' ) ( HEX_DIGIT )+ ( INTEGER_TYPE_SUFFIX )?
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

            // ../etc/JHaml.g:157:69: ( HEX_DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')||(LA6_0>='a' && LA6_0<='f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../etc/JHaml.g:157:69: HEX_DIGIT
            	    {
            	    mHEX_DIGIT(); 

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

            // ../etc/JHaml.g:157:80: ( INTEGER_TYPE_SUFFIX )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='L'||LA7_0=='l') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../etc/JHaml.g:157:80: INTEGER_TYPE_SUFFIX
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
    traceOut("HEX_LITERAL", 18);
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
    traceIn("DECIMAL_LITERAL", 19);
        try {
            int _type = DECIMAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:159:17: ({...}? => ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( INTEGER_TYPE_SUFFIX )? )
            // ../etc/JHaml.g:159:19: {...}? => ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( INTEGER_TYPE_SUFFIX )?
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "DECIMAL_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            // ../etc/JHaml.g:159:59: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='0') ) {
                alt9=1;
            }
            else if ( ((LA9_0>='1' && LA9_0<='9')) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../etc/JHaml.g:159:60: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../etc/JHaml.g:159:66: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../etc/JHaml.g:159:75: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../etc/JHaml.g:159:75: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../etc/JHaml.g:159:86: ( INTEGER_TYPE_SUFFIX )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='L'||LA10_0=='l') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../etc/JHaml.g:159:86: INTEGER_TYPE_SUFFIX
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
    traceOut("DECIMAL_LITERAL", 19);
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "OCTAL_LITERAL"
    public final void mOCTAL_LITERAL() throws RecognitionException {
    traceIn("OCTAL_LITERAL", 20);
        try {
            int _type = OCTAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:161:15: ({...}? => '0' ( '0' .. '7' )+ ( INTEGER_TYPE_SUFFIX )? )
            // ../etc/JHaml.g:161:17: {...}? => '0' ( '0' .. '7' )+ ( INTEGER_TYPE_SUFFIX )?
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "OCTAL_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('0'); 
            // ../etc/JHaml.g:161:61: ( '0' .. '7' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='7')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../etc/JHaml.g:161:62: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

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

            // ../etc/JHaml.g:161:73: ( INTEGER_TYPE_SUFFIX )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='L'||LA12_0=='l') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../etc/JHaml.g:161:73: INTEGER_TYPE_SUFFIX
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
    traceOut("OCTAL_LITERAL", 20);
        }
    }
    // $ANTLR end "OCTAL_LITERAL"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
    traceIn("HEX_DIGIT", 21);
        try {
            // ../etc/JHaml.g:164:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../etc/JHaml.g:164:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
    traceOut("HEX_DIGIT", 21);
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "INTEGER_TYPE_SUFFIX"
    public final void mINTEGER_TYPE_SUFFIX() throws RecognitionException {
    traceIn("INTEGER_TYPE_SUFFIX", 22);
        try {
            // ../etc/JHaml.g:167:21: ( ( 'l' | 'L' ) )
            // ../etc/JHaml.g:167:23: ( 'l' | 'L' )
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
    traceOut("INTEGER_TYPE_SUFFIX", 22);
        }
    }
    // $ANTLR end "INTEGER_TYPE_SUFFIX"

    // $ANTLR start "FLOATING_POINT_LITERAL"
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
    traceIn("FLOATING_POINT_LITERAL", 23);
        try {
            int _type = FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:170:5: ({...}? => ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX ) | DOT ( '0' .. '9' )+ ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>='0' && LA22_0<='9')) && (( lineMode == EMode.ATTRIBUTE_HASH ))) {
                alt22=1;
            }
            else if ( (LA22_0=='.') && ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION))) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../etc/JHaml.g:170:7: {...}? => ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX )
                    {
                    if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                        throw new FailedPredicateException(input, "FLOATING_POINT_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
                    }
                    // ../etc/JHaml.g:171:9: ( '0' .. '9' )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../etc/JHaml.g:171:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);

                    // ../etc/JHaml.g:172:9: ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX )
                    int alt18=3;
                    switch ( input.LA(1) ) {
                    case '.':
                        {
                        alt18=1;
                        }
                        break;
                    case 'E':
                    case 'e':
                        {
                        alt18=2;
                        }
                        break;
                    case 'D':
                    case 'F':
                    case 'd':
                    case 'f':
                        {
                        alt18=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;
                    }

                    switch (alt18) {
                        case 1 :
                            // ../etc/JHaml.g:173:13: '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )?
                            {
                            match('.'); 
                            // ../etc/JHaml.g:173:17: ( '0' .. '9' )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../etc/JHaml.g:173:18: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);

                            // ../etc/JHaml.g:173:29: ( EXPONENT )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='E'||LA15_0=='e') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../etc/JHaml.g:173:29: EXPONENT
                                    {
                                    mEXPONENT(); 

                                    }
                                    break;

                            }

                            // ../etc/JHaml.g:173:39: ( FLOAT_TYPE_SUFFIX )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0=='D'||LA16_0=='F'||LA16_0=='d'||LA16_0=='f') ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../etc/JHaml.g:173:39: FLOAT_TYPE_SUFFIX
                                    {
                                    mFLOAT_TYPE_SUFFIX(); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../etc/JHaml.g:174:13: EXPONENT ( FLOAT_TYPE_SUFFIX )?
                            {
                            mEXPONENT(); 
                            // ../etc/JHaml.g:174:22: ( FLOAT_TYPE_SUFFIX )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='d'||LA17_0=='f') ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../etc/JHaml.g:174:22: FLOAT_TYPE_SUFFIX
                                    {
                                    mFLOAT_TYPE_SUFFIX(); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // ../etc/JHaml.g:175:13: FLOAT_TYPE_SUFFIX
                            {
                            mFLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../etc/JHaml.g:177:9: DOT ( '0' .. '9' )+ ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )?
                    {
                    mDOT(); 
                    // ../etc/JHaml.g:177:13: ( '0' .. '9' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../etc/JHaml.g:177:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    // ../etc/JHaml.g:177:25: ( EXPONENT )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../etc/JHaml.g:177:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }

                    // ../etc/JHaml.g:177:35: ( FLOAT_TYPE_SUFFIX )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='D'||LA21_0=='F'||LA21_0=='d'||LA21_0=='f') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../etc/JHaml.g:177:35: FLOAT_TYPE_SUFFIX
                            {
                            mFLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("FLOATING_POINT_LITERAL", 23);
        }
    }
    // $ANTLR end "FLOATING_POINT_LITERAL"

    // $ANTLR start "FLOAT_TYPE_SUFFIX"
    public final void mFLOAT_TYPE_SUFFIX() throws RecognitionException {
    traceIn("FLOAT_TYPE_SUFFIX", 24);
        try {
            // ../etc/JHaml.g:181:19: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // ../etc/JHaml.g:181:21: ( 'f' | 'F' | 'd' | 'D' )
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
    traceOut("FLOAT_TYPE_SUFFIX", 24);
        }
    }
    // $ANTLR end "FLOAT_TYPE_SUFFIX"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
    traceIn("EXPONENT", 25);
        try {
            // ../etc/JHaml.g:184:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../etc/JHaml.g:184:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../etc/JHaml.g:184:22: ( '+' | '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='+'||LA23_0=='-') ) {
                alt23=1;
            }
            switch (alt23) {
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

            // ../etc/JHaml.g:184:33: ( '0' .. '9' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../etc/JHaml.g:184:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }

        }
        finally {
    traceOut("EXPONENT", 25);
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "CHAR_LITERAL"
    public final void mCHAR_LITERAL() throws RecognitionException {
    traceIn("CHAR_LITERAL", 26);
        try {
            int _type = CHAR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:188:5: ({...}? => '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
            // ../etc/JHaml.g:188:7: {...}? => '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "CHAR_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('\''); 
            // ../etc/JHaml.g:188:52: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\\') ) {
                    alt25=1;
                }
                else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // ../etc/JHaml.g:188:54: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/JHaml.g:188:71: ~ ( '\\'' | '\\\\' )
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
            	    break loop25;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("CHAR_LITERAL", 26);
        }
    }
    // $ANTLR end "CHAR_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
    traceIn("STRING_LITERAL", 27);
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:192:5: ({...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // ../etc/JHaml.g:192:7: {...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "STRING_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('\"'); 
            // ../etc/JHaml.g:192:51: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\\') ) {
                    alt26=1;
                }
                else if ( ((LA26_0>='\u0000' && LA26_0<='!')||(LA26_0>='#' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // ../etc/JHaml.g:192:53: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/JHaml.g:192:70: ~ ( '\\\\' | '\"' )
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
            	    break loop26;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("STRING_LITERAL", 27);
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
    traceIn("EscapeSequence", 28);
        try {
            // ../etc/JHaml.g:196:15: ( '\\\\' ~ NL )
            // ../etc/JHaml.g:196:17: '\\\\' ~ NL
            {
            match('\\'); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
    traceOut("EscapeSequence", 28);
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
    traceIn("TEXT", 29);
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:198:5: ( ( TextLine | InLineText )? ( RemainderOfLineText )? )
            // ../etc/JHaml.g:198:7: ( TextLine | InLineText )? ( RemainderOfLineText )?
            {
            // ../etc/JHaml.g:198:7: ( TextLine | InLineText )?
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='-'||LA27_0=='=') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {
                int LA27_1 = input.LA(2);

                if ( (( lineMode == EMode.BEGINNING )) ) {
                    alt27=1;
                }
                else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {
                    alt27=2;
                }
            }
            else if ( ((LA27_0>='\u0000' && LA27_0<='\b')||(LA27_0>='\u000B' && LA27_0<='\u001F')||(LA27_0>='!' && LA27_0<='\"')||LA27_0=='$'||(LA27_0>='&' && LA27_0<=',')||(LA27_0>='/' && LA27_0<='<')||(LA27_0>='>' && LA27_0<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {
                int LA27_2 = input.LA(2);

                if ( (( lineMode == EMode.BEGINNING )) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../etc/JHaml.g:198:8: TextLine
                    {
                    mTextLine(); 

                    }
                    break;
                case 2 :
                    // ../etc/JHaml.g:198:19: InLineText
                    {
                    mInLineText(); 

                    }
                    break;

            }

            // ../etc/JHaml.g:198:32: ( RemainderOfLineText )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../etc/JHaml.g:198:32: RemainderOfLineText
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
    traceOut("TEXT", 29);
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "RemainderOfLineText"
    public final void mRemainderOfLineText() throws RecognitionException {
    traceIn("RemainderOfLineText", 30);
        try {
            int _type = RemainderOfLineText;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:200:20: ({...}? => (~ '\\n' )+ )
            // ../etc/JHaml.g:200:22: {...}? => (~ '\\n' )+
            {
            if ( !(( lineMode == EMode.TEXT )) ) {
                throw new FailedPredicateException(input, "RemainderOfLineText", " lineMode == EMode.TEXT ");
            }
            // ../etc/JHaml.g:200:52: (~ '\\n' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='\u0000' && LA29_0<='\t')||(LA29_0>='\u000B' && LA29_0<='\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../etc/JHaml.g:200:53: ~ '\\n'
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
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("RemainderOfLineText", 30);
        }
    }
    // $ANTLR end "RemainderOfLineText"

    // $ANTLR start "TextLine"
    public final void mTextLine() throws RecognitionException {
    traceIn("TextLine", 31);
        try {
            int _type = TextLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:202:9: ({...}? => (~ ( '.' | '#' | '%' | NL | Space ) ) )
            // ../etc/JHaml.g:202:11: {...}? => (~ ( '.' | '#' | '%' | NL | Space ) )
            {
            if ( !(( lineMode == EMode.BEGINNING )) ) {
                throw new FailedPredicateException(input, "TextLine", " lineMode == EMode.BEGINNING ");
            }
            // ../etc/JHaml.g:203:3: (~ ( '.' | '#' | '%' | NL | Space ) )
            // ../etc/JHaml.g:203:4: ~ ( '.' | '#' | '%' | NL | Space )
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
    traceOut("TextLine", 31);
        }
    }
    // $ANTLR end "TextLine"

    // $ANTLR start "InLineText"
    public final void mInLineText() throws RecognitionException {
    traceIn("InLineText", 32);
        try {
            int _type = InLineText;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:205:11: ({...}? => ( '-' | '=' ) )
            // ../etc/JHaml.g:205:13: {...}? => ( '-' | '=' )
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
    traceOut("InLineText", 32);
        }
    }
    // $ANTLR end "InLineText"

    // $ANTLR start "BEGIN_HASH"
    public final void mBEGIN_HASH() throws RecognitionException {
    traceIn("BEGIN_HASH", 33);
        try {
            int _type = BEGIN_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:209:13: ({...}? => LBRACE )
            // ../etc/JHaml.g:209:15: {...}? => LBRACE
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
    traceOut("BEGIN_HASH", 33);
        }
    }
    // $ANTLR end "BEGIN_HASH"

    // $ANTLR start "END_HASH"
    public final void mEND_HASH() throws RecognitionException {
    traceIn("END_HASH", 34);
        try {
            int _type = END_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:210:11: ({...}? => RBRACE )
            // ../etc/JHaml.g:210:13: {...}? => RBRACE
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
    traceOut("END_HASH", 34);
        }
    }
    // $ANTLR end "END_HASH"

    // $ANTLR start "JAVA_LBRACE"
    public final void mJAVA_LBRACE() throws RecognitionException {
    traceIn("JAVA_LBRACE", 35);
        try {
            int _type = JAVA_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:212:13: ({...}? => LBRACE )
            // ../etc/JHaml.g:212:15: {...}? => LBRACE
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
    traceOut("JAVA_LBRACE", 35);
        }
    }
    // $ANTLR end "JAVA_LBRACE"

    // $ANTLR start "JAVA_RBRACE"
    public final void mJAVA_RBRACE() throws RecognitionException {
    traceIn("JAVA_RBRACE", 36);
        try {
            int _type = JAVA_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:214:13: ({...}? => RBRACE )
            // ../etc/JHaml.g:214:15: {...}? => RBRACE
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
    traceOut("JAVA_RBRACE", 36);
        }
    }
    // $ANTLR end "JAVA_RBRACE"

    // $ANTLR start "JAVA_LPAREN"
    public final void mJAVA_LPAREN() throws RecognitionException {
    traceIn("JAVA_LPAREN", 37);
        try {
            int _type = JAVA_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:216:13: ({...}? => '(' )
            // ../etc/JHaml.g:216:15: {...}? => '('
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
    traceOut("JAVA_LPAREN", 37);
        }
    }
    // $ANTLR end "JAVA_LPAREN"

    // $ANTLR start "JAVA_RPAREN"
    public final void mJAVA_RPAREN() throws RecognitionException {
    traceIn("JAVA_RPAREN", 38);
        try {
            int _type = JAVA_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:219:13: ({...}? => ')' )
            // ../etc/JHaml.g:219:15: {...}? => ')'
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
    traceOut("JAVA_RPAREN", 38);
        }
    }
    // $ANTLR end "JAVA_RPAREN"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
    traceIn("LBRACE", 39);
        try {
            // ../etc/JHaml.g:222:17: ( '{' )
            // ../etc/JHaml.g:222:19: '{'
            {
            match('{'); 
            braceDepth++;

            }

        }
        finally {
    traceOut("LBRACE", 39);
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
    traceIn("RBRACE", 40);
        try {
            // ../etc/JHaml.g:223:18: ( '}' )
            // ../etc/JHaml.g:223:20: '}'
            {
            match('}'); 
            braceDepth--;

            }

        }
        finally {
    traceOut("RBRACE", 40);
        }
    }
    // $ANTLR end "RBRACE"

    public void mTokens() throws RecognitionException {
        // ../etc/JHaml.g:1:8: ( PERCENT | POUND | DOT | FORWARD_SLASH | COMMA | JAVA_COMMA | JAVA_CODE | ATTRIBUTE_NAME | MAP_TO | ID | INDENTATION | WS | WS_WITHIN_HASH | NEWLINE | IGNORED_NEWLINE | NL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | CHAR_LITERAL | STRING_LITERAL | TEXT | RemainderOfLineText | TextLine | InLineText | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | JAVA_LPAREN | JAVA_RPAREN )
        int alt30=32;
        alt30 = dfa30.predict(input);
        switch (alt30) {
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
                // ../etc/JHaml.g:1:94: INDENTATION
                {
                mINDENTATION(); 

                }
                break;
            case 12 :
                // ../etc/JHaml.g:1:106: WS
                {
                mWS(); 

                }
                break;
            case 13 :
                // ../etc/JHaml.g:1:109: WS_WITHIN_HASH
                {
                mWS_WITHIN_HASH(); 

                }
                break;
            case 14 :
                // ../etc/JHaml.g:1:124: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 15 :
                // ../etc/JHaml.g:1:132: IGNORED_NEWLINE
                {
                mIGNORED_NEWLINE(); 

                }
                break;
            case 16 :
                // ../etc/JHaml.g:1:148: NL
                {
                mNL(); 

                }
                break;
            case 17 :
                // ../etc/JHaml.g:1:151: HEX_LITERAL
                {
                mHEX_LITERAL(); 

                }
                break;
            case 18 :
                // ../etc/JHaml.g:1:163: DECIMAL_LITERAL
                {
                mDECIMAL_LITERAL(); 

                }
                break;
            case 19 :
                // ../etc/JHaml.g:1:179: OCTAL_LITERAL
                {
                mOCTAL_LITERAL(); 

                }
                break;
            case 20 :
                // ../etc/JHaml.g:1:193: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); 

                }
                break;
            case 21 :
                // ../etc/JHaml.g:1:216: CHAR_LITERAL
                {
                mCHAR_LITERAL(); 

                }
                break;
            case 22 :
                // ../etc/JHaml.g:1:229: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 23 :
                // ../etc/JHaml.g:1:244: TEXT
                {
                mTEXT(); 

                }
                break;
            case 24 :
                // ../etc/JHaml.g:1:249: RemainderOfLineText
                {
                mRemainderOfLineText(); 

                }
                break;
            case 25 :
                // ../etc/JHaml.g:1:269: TextLine
                {
                mTextLine(); 

                }
                break;
            case 26 :
                // ../etc/JHaml.g:1:278: InLineText
                {
                mInLineText(); 

                }
                break;
            case 27 :
                // ../etc/JHaml.g:1:289: BEGIN_HASH
                {
                mBEGIN_HASH(); 

                }
                break;
            case 28 :
                // ../etc/JHaml.g:1:300: END_HASH
                {
                mEND_HASH(); 

                }
                break;
            case 29 :
                // ../etc/JHaml.g:1:309: JAVA_LBRACE
                {
                mJAVA_LBRACE(); 

                }
                break;
            case 30 :
                // ../etc/JHaml.g:1:321: JAVA_RBRACE
                {
                mJAVA_RBRACE(); 

                }
                break;
            case 31 :
                // ../etc/JHaml.g:1:333: JAVA_LPAREN
                {
                mJAVA_LPAREN(); 

                }
                break;
            case 32 :
                // ../etc/JHaml.g:1:345: JAVA_RPAREN
                {
                mJAVA_RPAREN(); 

                }
                break;

        }

    }


    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA30_eotS =
        "\1\22\1\26\1\31\1\32\1\34\1\37\1\40\1\44\1\46\1\50\1\52\1\54\1"+
        "\56\1\65\1\67\1\74\1\101\1\102\1\uffff\1\103\1\104\1\105\1\uffff"+
        "\1\111\1\112\2\uffff\1\115\1\uffff\1\122\1\123\2\uffff\1\127\1\130"+
        "\1\131\1\uffff\1\133\1\uffff\1\135\1\uffff\1\136\1\uffff\1\142\1"+
        "\uffff\1\146\1\uffff\1\151\1\153\1\157\1\162\1\163\1\164\1\uffff"+
        "\1\165\1\uffff\1\167\1\170\1\171\2\uffff\1\173\1\174\1\175\16\uffff"+
        "\1\112\1\115\12\uffff\1\u0088\14\uffff\1\u008a\2\uffff\1\u008d\1"+
        "\uffff\1\u008e\1\u008f\1\u0092\1\uffff\1\u0093\1\u0094\4\uffff\1"+
        "\u0096\3\uffff\1\u0097\12\uffff\1\112\1\115\4\uffff\1\u0099\4\uffff"+
        "\1\u009a\1\u009b\3\uffff\1\u009c\7\uffff";
    static final String DFA30_eofS =
        "\u009d\uffff";
    static final String DFA30_minS =
        "\22\0\1\uffff\50\0\1\uffff\4\0\1\uffff\5\0\3\uffff\2\0\2\uffff"+
        "\3\0\2\uffff\2\0\3\uffff\5\0\1\uffff\2\0\3\uffff\1\0\3\uffff\2\0"+
        "\1\uffff\25\0\7\uffff\2\0\1\uffff\1\0\1\uffff\2\0\1\uffff\13\0\1"+
        "\uffff\4\0";
    static final String DFA30_maxS =
        "\13\uffff\1\0\6\uffff\1\uffff\3\uffff\1\0\2\uffff\2\0\1\uffff\1"+
        "\0\2\uffff\2\0\3\uffff\1\0\1\uffff\1\0\1\uffff\1\0\1\uffff\1\0\1"+
        "\uffff\1\0\1\uffff\1\0\6\uffff\1\0\1\uffff\1\0\3\uffff\1\uffff\1"+
        "\0\3\uffff\1\uffff\5\0\3\uffff\2\0\2\uffff\1\0\2\uffff\2\uffff\2"+
        "\0\3\uffff\3\0\1\uffff\1\0\1\uffff\2\0\3\uffff\1\0\3\uffff\1\0\1"+
        "\uffff\1\uffff\1\0\1\uffff\1\0\3\uffff\1\0\2\uffff\4\0\1\uffff\3"+
        "\0\1\uffff\3\0\7\uffff\2\uffff\1\uffff\1\0\1\uffff\1\0\1\uffff\1"+
        "\uffff\3\0\2\uffff\3\0\1\uffff\2\0\1\uffff\4\0";
    static final String DFA30_acceptS =
        "\22\uffff\1\27\50\uffff\1\25\4\uffff\1\26\5\uffff\1\1\1\7\1\30"+
        "\2\uffff\1\2\1\3\3\uffff\1\4\1\31\2\uffff\1\5\1\6\1\12\5\uffff\1"+
        "\32\2\uffff\1\13\1\14\1\15\1\uffff\1\16\1\17\1\20\2\uffff\1\22\25"+
        "\uffff\1\33\1\35\1\34\1\36\1\37\1\40\1\24\2\uffff\1\10\1\uffff\1"+
        "\11\2\uffff\1\23\13\uffff\1\21\4\uffff";
    static final String DFA30_specialS =
        "\1\145\1\51\1\141\1\132\1\1\1\27\1\46\1\107\1\105\1\172\1\163\1"+
        "\uffff\1\60\1\135\1\25\1\112\1\110\1\43\1\uffff\1\33\1\131\1\124"+
        "\1\37\1\23\1\123\1\40\1\41\1\144\1\55\1\154\1\170\1\54\1\47\1\155"+
        "\1\42\1\77\1\117\1\167\1\26\1\143\1\3\1\104\1\157\1\111\1\30\1\140"+
        "\1\126\1\160\1\0\1\2\1\164\1\50\1\36\1\127\1\122\1\120\1\57\1\152"+
        "\1\166\1\uffff\1\121\1\56\1\156\1\171\1\uffff\1\32\1\136\1\34\1"+
        "\151\1\150\3\uffff\1\24\1\147\2\uffff\1\22\1\125\1\52\2\uffff\1"+
        "\106\1\20\3\uffff\1\161\1\101\1\103\1\130\1\137\1\uffff\1\115\1"+
        "\133\3\uffff\1\53\3\uffff\1\17\1\165\1\uffff\1\74\1\35\1\72\1\113"+
        "\1\162\1\142\1\67\1\45\1\173\1\16\1\66\1\15\1\71\1\114\1\14\1\13"+
        "\1\70\1\153\1\12\1\11\1\116\7\uffff\1\31\1\146\1\uffff\1\102\1\uffff"+
        "\1\76\1\100\1\uffff\1\73\1\65\1\10\1\44\1\21\1\64\1\7\1\63\1\134"+
        "\1\6\1\5\1\uffff\1\75\1\4\1\62\1\61}>";
    static final String[] DFA30_transitionS = {
            "\11\21\1\12\1\13\25\21\1\12\1\21\1\17\1\2\1\21\1\1\1\21\1\16"+
            "\1\24\1\25\2\21\1\5\1\11\1\3\1\4\1\14\11\15\1\7\2\21\1\10\3"+
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
            "\36\3\35\12\42\1\36\2\35\1\36\3\35\32\41\6\35\32\41\1\36\1\35"+
            "\1\36\uff82\35",
            "\12\36\1\uffff\66\36\32\43\6\36\32\43\uff85\36",
            "\12\47\1\uffff\63\47\1\45\uffc1\47",
            "\11\51\1\47\1\uffff\25\51\1\47\1\51\1\47\4\51\3\47\2\51\1"+
            "\47\3\51\13\47\2\51\1\47\75\51\1\47\1\51\1\47\uff82\51",
            "\11\30\1\53\1\uffff\25\30\1\53\uffdf\30",
            "\1\uffff",
            "\12\36\1\uffff\43\36\1\61\1\36\10\57\2\64\12\36\1\63\1\62"+
            "\1\63\5\36\1\60\13\36\1\55\13\36\1\63\1\62\1\63\5\36\1\60\13"+
            "\36\1\55\uff87\36",
            "\12\36\1\uffff\43\36\1\61\1\36\12\66\12\36\1\63\1\62\1\63"+
            "\5\36\1\60\27\36\1\63\1\62\1\63\5\36\1\60\uff93\36",
            "\12\71\1\73\34\71\1\72\64\71\1\70\uffa3\71",
            "\12\76\1\100\27\76\1\77\71\76\1\75\uffa3\76",
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
            "\36\3\35\12\42\1\36\2\35\1\36\3\35\32\41\6\35\32\41\1\36\1\35"+
            "\1\36\uff82\35",
            "\12\36\1\uffff\45\36\12\42\7\36\32\42\6\36\32\42\uff85\36",
            "\12\36\1\uffff\45\36\12\132\7\36\32\132\6\36\32\132\uff85"+
            "\36",
            "\1\uffff",
            "\12\47\1\uffff\ufff5\47",
            "\1\uffff",
            "\12\47\1\uffff\ufff5\47",
            "\1\uffff",
            "\11\51\1\47\1\uffff\25\51\1\47\1\51\1\47\4\51\3\47\2\51\1"+
            "\47\3\51\13\47\2\51\1\47\75\51\1\47\1\51\1\47\uff82\51",
            "\1\uffff",
            "\11\30\1\53\1\uffff\25\30\1\53\uffdf\30",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\147\7\36\6\147\32\36\6\147\uff99\36",
            "\1\uffff",
            "\12\36\1\uffff\43\36\1\61\1\36\10\57\2\64\12\36\1\63\1\62"+
            "\1\63\5\36\1\152\27\36\1\63\1\62\1\63\5\36\1\152\uff93\36",
            "\12\36\1\uffff\ufff5\36",
            "\12\36\1\uffff\45\36\12\154\12\36\1\156\1\155\1\156\35\36"+
            "\1\156\1\155\1\156\uff99\36",
            "\12\36\1\uffff\40\36\1\160\1\36\1\160\2\36\12\161\uffc6\36",
            "\12\36\1\uffff\ufff5\36",
            "\12\36\1\uffff\43\36\1\61\1\36\12\64\12\36\1\63\1\62\1\63"+
            "\35\36\1\63\1\62\1\63\uff99\36",
            "\1\uffff",
            "\12\36\1\uffff\43\36\1\61\1\36\12\66\12\36\1\63\1\62\1\63"+
            "\5\36\1\60\27\36\1\63\1\62\1\63\5\36\1\60\uff93\36",
            "\1\uffff",
            "\12\166\1\uffff\ufff5\166",
            "\12\71\1\73\34\71\1\72\64\71\1\70\uffa3\71",
            "\12\36\1\uffff\ufff5\36",
            "",
            "\1\uffff",
            "\12\172\1\uffff\ufff5\172",
            "\12\76\1\100\27\76\1\77\71\76\1\75\uffa3\76",
            "\12\36\1\uffff\ufff5\36",
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
            "\1\uffff",
            "\12\30\1\uffff\40\30\1\u0085\1\30\1\u0085\2\30\12\u0086\uffc6"+
            "\30",
            "\12\30\1\uffff\ufff5\30",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\132\7\36\32\132\6\36\32\132\uff85"+
            "\36",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\147\7\36\6\147\5\36\1\u008b\24\36"+
            "\6\147\5\36\1\u008b\uff93\36",
            "",
            "\1\uffff",
            "\12\36\1\uffff\ufff5\36",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\154\12\36\1\156\1\155\1\156\35\36"+
            "\1\156\1\155\1\156\uff99\36",
            "\12\36\1\uffff\40\36\1\u0090\1\36\1\u0090\2\36\12\u0091\uffc6"+
            "\36",
            "\12\36\1\uffff\ufff5\36",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\161\uffc6\36",
            "\12\36\1\uffff\45\36\12\161\12\36\1\u0095\1\36\1\u0095\35"+
            "\36\1\u0095\1\36\1\u0095\uff99\36",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\71\1\73\34\71\1\72\64\71\1\70\uffa3\71",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\76\1\100\27\76\1\77\71\76\1\75\uffa3\76",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\30\1\uffff\45\30\12\u0086\uffc6\30",
            "\12\30\1\uffff\45\30\12\u0086\12\30\1\117\1\30\1\117\35\30"+
            "\1\117\1\30\1\117\uff99\30",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\12\36\1\uffff\ufff5\36",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\36\1\uffff\45\36\12\u0091\uffc6\36",
            "\12\36\1\uffff\45\36\12\u0091\12\36\1\156\1\36\1\156\35\36"+
            "\1\156\1\36\1\156\uff99\36",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\36\1\uffff\ufff5\36",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PERCENT | POUND | DOT | FORWARD_SLASH | COMMA | JAVA_COMMA | JAVA_CODE | ATTRIBUTE_NAME | MAP_TO | ID | INDENTATION | WS | WS_WITHIN_HASH | NEWLINE | IGNORED_NEWLINE | NL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | FLOATING_POINT_LITERAL | CHAR_LITERAL | STRING_LITERAL | TEXT | RemainderOfLineText | TextLine | InLineText | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | JAVA_LPAREN | JAVA_RPAREN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_48 = input.LA(1);

                         
                        int index30_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_48>='\u0000' && LA30_48<='\t')||(LA30_48>='\u000B' && LA30_48<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 107;

                         
                        input.seek(index30_48);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_4>='\u0000' && LA30_4<='\b')||(LA30_4>='\u000B' && LA30_4<='\u001F')||LA30_4=='!'||(LA30_4>='#' && LA30_4<='&')||(LA30_4>='*' && LA30_4<='+')||(LA30_4>='-' && LA30_4<='/')||(LA30_4>=';' && LA30_4<='<')||(LA30_4>='>' && LA30_4<='z')||LA30_4=='|'||(LA30_4>='~' && LA30_4<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 29;}

                        else if ( (LA30_4=='\t'||LA30_4==' '||LA30_4=='\"'||(LA30_4>='\'' && LA30_4<=')')||LA30_4==','||(LA30_4>='0' && LA30_4<=':')||LA30_4=='='||LA30_4=='{'||LA30_4=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 28;

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_49 = input.LA(1);

                         
                        int index30_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_49>='0' && LA30_49<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 108;}

                        else if ( (LA30_49=='E'||LA30_49=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 109;}

                        else if ( (LA30_49=='D'||LA30_49=='F'||LA30_49=='d'||LA30_49=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 110;}

                        else if ( ((LA30_49>='\u0000' && LA30_49<='\t')||(LA30_49>='\u000B' && LA30_49<='/')||(LA30_49>=':' && LA30_49<='C')||(LA30_49>='G' && LA30_49<='c')||(LA30_49>='g' && LA30_49<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 111;

                         
                        input.seek(index30_49);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_40 = input.LA(1);

                         
                        int index30_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 92;}

                         
                        input.seek(index30_40);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_154 = input.LA(1);

                         
                        int index30_154 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_154);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_151 = input.LA(1);

                         
                        int index30_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_151);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_150 = input.LA(1);

                         
                        int index30_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_150);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_147 = input.LA(1);

                         
                        int index30_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_147);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_143 = input.LA(1);

                         
                        int index30_143 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_143);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA30_124 = input.LA(1);

                         
                        int index30_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_124);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA30_123 = input.LA(1);

                         
                        int index30_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_123);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA30_120 = input.LA(1);

                         
                        int index30_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_120);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA30_119 = input.LA(1);

                         
                        int index30_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_119);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA30_116 = input.LA(1);

                         
                        int index30_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_116);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA30_114 = input.LA(1);

                         
                        int index30_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_114);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA30_102 = input.LA(1);

                         
                        int index30_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_102);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA30_83 = input.LA(1);

                         
                        int index30_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_83);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA30_145 = input.LA(1);

                         
                        int index30_145 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_145=='D'||LA30_145=='F'||LA30_145=='d'||LA30_145=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 110;}

                        else if ( ((LA30_145>='0' && LA30_145<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 145;}

                        else if ( ((LA30_145>='\u0000' && LA30_145<='\t')||(LA30_145>='\u000B' && LA30_145<='/')||(LA30_145>=':' && LA30_145<='C')||LA30_145=='E'||(LA30_145>='G' && LA30_145<='c')||LA30_145=='e'||(LA30_145>='g' && LA30_145<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 155;

                         
                        input.seek(index30_145);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA30_77 = input.LA(1);

                         
                        int index30_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {s = 132;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_77);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA30_23 = input.LA(1);

                         
                        int index30_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_23>='\u0000' && LA30_23<='\b')||(LA30_23>='\u000B' && LA30_23<='\u001F')||LA30_23=='!'||(LA30_23>='#' && LA30_23<='&')||(LA30_23>='*' && LA30_23<='+')||(LA30_23>='-' && LA30_23<='/')||(LA30_23>=';' && LA30_23<='<')||(LA30_23>='>' && LA30_23<='z')||LA30_23=='|'||(LA30_23>='~' && LA30_23<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 23;}

                        else if ( (LA30_23=='\t'||LA30_23==' '||LA30_23=='\"'||(LA30_23>='\'' && LA30_23<=')')||LA30_23==','||(LA30_23>='0' && LA30_23<=':')||LA30_23=='='||LA30_23=='{'||LA30_23=='}') && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 73;

                         
                        input.seek(index30_23);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA30_73 = input.LA(1);

                         
                        int index30_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_73);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA30_14 = input.LA(1);

                         
                        int index30_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_14=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 56;}

                        else if ( ((LA30_14>='\u0000' && LA30_14<='\t')||(LA30_14>='\u000B' && LA30_14<='&')||(LA30_14>='(' && LA30_14<='[')||(LA30_14>=']' && LA30_14<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 57;}

                        else if ( (LA30_14=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 58;}

                        else if ( (LA30_14=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 59;}

                        else s = 55;

                         
                        input.seek(index30_14);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA30_38 = input.LA(1);

                         
                        int index30_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 92;}

                         
                        input.seek(index30_38);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_5>='\u0000' && LA30_5<='\t')||(LA30_5>='\u000B' && LA30_5<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 31;

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA30_44 = input.LA(1);

                         
                        int index30_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode != EMode.ATTRIBUTE_HASH )) ) {s = 99;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 100;}

                        else if ( (true) ) {s = 101;}

                         
                        input.seek(index30_44);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA30_133 = input.LA(1);

                         
                        int index30_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_133>='0' && LA30_133<='9')) && ((( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 134;}

                        else if ( ((LA30_133>='\u0000' && LA30_133<='\t')||(LA30_133>='\u000B' && LA30_133<='/')||(LA30_133>=':' && LA30_133<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 74;

                         
                        input.seek(index30_133);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA30_65 = input.LA(1);

                         
                        int index30_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 126;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 127;}

                         
                        input.seek(index30_65);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA30_19 = input.LA(1);

                         
                        int index30_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_19>='\u0000' && LA30_19<='\t')||(LA30_19>='\u000B' && LA30_19<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 67;

                         
                        input.seek(index30_19);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA30_67 = input.LA(1);

                         
                        int index30_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH && braceDepth == 1 )) ) {s = 128;}

                        else if ( (( braceDepth > 1 )) ) {s = 129;}

                         
                        input.seek(index30_67);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA30_106 = input.LA(1);

                         
                        int index30_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_106>='\u0000' && LA30_106<='\t')||(LA30_106>='\u000B' && LA30_106<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 141;

                         
                        input.seek(index30_106);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA30_52 = input.LA(1);

                         
                        int index30_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_52=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 49;}

                        else if ( (LA30_52=='E'||LA30_52=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 50;}

                        else if ( (LA30_52=='D'||LA30_52=='F'||LA30_52=='d'||LA30_52=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 51;}

                        else if ( ((LA30_52>='0' && LA30_52<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 52;}

                        else if ( ((LA30_52>='\u0000' && LA30_52<='\t')||(LA30_52>='\u000B' && LA30_52<='-')||LA30_52=='/'||(LA30_52>=':' && LA30_52<='C')||(LA30_52>='G' && LA30_52<='c')||(LA30_52>='g' && LA30_52<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 116;

                         
                        input.seek(index30_52);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA30_22 = input.LA(1);

                         
                        int index30_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {s = 70;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_22);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA30_25 = input.LA(1);

                         
                        int index30_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {s = 75;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_25);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA30_26 = input.LA(1);

                         
                        int index30_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {s = 76;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_26);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA30_34 = input.LA(1);

                         
                        int index30_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_34>='0' && LA30_34<='9')||(LA30_34>='A' && LA30_34<='Z')||(LA30_34>='a' && LA30_34<='z')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 34;}

                        else if ( ((LA30_34>='\u0000' && LA30_34<='\t')||(LA30_34>='\u000B' && LA30_34<='/')||(LA30_34>=':' && LA30_34<='@')||(LA30_34>='[' && LA30_34<='`')||(LA30_34>='{' && LA30_34<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 88;

                         
                        input.seek(index30_34);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA30_17 = input.LA(1);

                         
                        int index30_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_17>='\u0000' && LA30_17<='\b')||(LA30_17>='\u000B' && LA30_17<='\u001F')||LA30_17=='!'||(LA30_17>='#' && LA30_17<='&')||(LA30_17>='*' && LA30_17<='+')||(LA30_17>='-' && LA30_17<='/')||(LA30_17>=';' && LA30_17<='<')||(LA30_17>='>' && LA30_17<='z')||LA30_17=='|'||(LA30_17>='~' && LA30_17<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 29;}

                        else if ( (LA30_17=='\t'||LA30_17==' '||LA30_17=='\"'||(LA30_17>='\'' && LA30_17<=')')||LA30_17==','||(LA30_17>='0' && LA30_17<=':')||LA30_17=='='||LA30_17=='{'||LA30_17=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 66;

                         
                        input.seek(index30_17);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA30_144 = input.LA(1);

                         
                        int index30_144 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_144>='0' && LA30_144<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 145;}

                        else if ( ((LA30_144>='\u0000' && LA30_144<='\t')||(LA30_144>='\u000B' && LA30_144<='/')||(LA30_144>=':' && LA30_144<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 154;

                         
                        input.seek(index30_144);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA30_112 = input.LA(1);

                         
                        int index30_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_112>='0' && LA30_112<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 113;}

                        else if ( ((LA30_112>='\u0000' && LA30_112<='\t')||(LA30_112>='\u000B' && LA30_112<='/')||(LA30_112>=':' && LA30_112<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 147;

                         
                        input.seek(index30_112);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA30_6 = input.LA(1);

                         
                        int index30_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_6>='A' && LA30_6<='Z')||(LA30_6>='a' && LA30_6<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else if ( ((LA30_6>='\u0000' && LA30_6<='\b')||(LA30_6>='\u000B' && LA30_6<='\u001F')||LA30_6=='!'||(LA30_6>='#' && LA30_6<='&')||(LA30_6>='*' && LA30_6<='+')||(LA30_6>='-' && LA30_6<='/')||(LA30_6>=';' && LA30_6<='<')||(LA30_6>='>' && LA30_6<='@')||(LA30_6>='[' && LA30_6<='`')||LA30_6=='|'||(LA30_6>='~' && LA30_6<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 29;}

                        else if ( ((LA30_6>='0' && LA30_6<='9')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 34;}

                        else if ( (LA30_6=='\t'||LA30_6==' '||LA30_6=='\"'||(LA30_6>='\'' && LA30_6<=')')||LA30_6==','||LA30_6==':'||LA30_6=='='||LA30_6=='{'||LA30_6=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 32;

                         
                        input.seek(index30_6);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA30_32 = input.LA(1);

                         
                        int index30_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 86;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                         
                        input.seek(index30_32);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA30_51 = input.LA(1);

                         
                        int index30_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_51>='\u0000' && LA30_51<='\t')||(LA30_51>='\u000B' && LA30_51<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 115;

                         
                        input.seek(index30_51);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_1>='\u0000' && LA30_1<='\b')||(LA30_1>='\u000B' && LA30_1<='\u001F')||LA30_1=='!'||(LA30_1>='#' && LA30_1<='&')||(LA30_1>='*' && LA30_1<='+')||(LA30_1>='-' && LA30_1<='/')||(LA30_1>=';' && LA30_1<='<')||(LA30_1>='>' && LA30_1<='z')||LA30_1=='|'||(LA30_1>='~' && LA30_1<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 23;}

                        else if ( (LA30_1=='\t'||LA30_1==' '||LA30_1=='\"'||(LA30_1>='\'' && LA30_1<=')')||LA30_1==','||(LA30_1>='0' && LA30_1<=':')||LA30_1=='='||LA30_1=='{'||LA30_1=='}') && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 22;

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA30_79 = input.LA(1);

                         
                        int index30_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_79>='\u0000' && LA30_79<='\t')||(LA30_79>='\u000B' && LA30_79<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 77;

                         
                        input.seek(index30_79);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA30_98 = input.LA(1);

                         
                        int index30_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.BEGINNING )) ) {s = 95;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 96;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_98);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA30_31 = input.LA(1);

                         
                        int index30_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH && parenDepth <= 0)) ) {s = 84;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH && parenDepth > 0)) ) {s = 85;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                         
                        input.seek(index30_31);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA30_28 = input.LA(1);

                         
                        int index30_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH)) ) {s = 80;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                         
                        input.seek(index30_28);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA30_61 = input.LA(1);

                         
                        int index30_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_61>='\u0000' && LA30_61<='\t')||(LA30_61>='\u000B' && LA30_61<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 122;}

                        else s = 123;

                         
                        input.seek(index30_61);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA30_56 = input.LA(1);

                         
                        int index30_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_56>='\u0000' && LA30_56<='\t')||(LA30_56>='\u000B' && LA30_56<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 118;}

                        else s = 119;

                         
                        input.seek(index30_56);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA30_12 = input.LA(1);

                         
                        int index30_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_12=='X'||LA30_12=='x') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 45;}

                        else if ( ((LA30_12>='0' && LA30_12<='7')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 47;}

                        else if ( (LA30_12=='L'||LA30_12=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 48;}

                        else if ( (LA30_12=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 49;}

                        else if ( (LA30_12=='E'||LA30_12=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 50;}

                        else if ( (LA30_12=='D'||LA30_12=='F'||LA30_12=='d'||LA30_12=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 51;}

                        else if ( ((LA30_12>='8' && LA30_12<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 52;}

                        else if ( ((LA30_12>='\u0000' && LA30_12<='\t')||(LA30_12>='\u000B' && LA30_12<='-')||LA30_12=='/'||(LA30_12>=':' && LA30_12<='C')||(LA30_12>='G' && LA30_12<='K')||(LA30_12>='M' && LA30_12<='W')||(LA30_12>='Y' && LA30_12<='c')||(LA30_12>='g' && LA30_12<='k')||(LA30_12>='m' && LA30_12<='w')||(LA30_12>='y' && LA30_12<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 46;

                         
                        input.seek(index30_12);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA30_156 = input.LA(1);

                         
                        int index30_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 132;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_156);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA30_155 = input.LA(1);

                         
                        int index30_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 132;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_155);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA30_148 = input.LA(1);

                         
                        int index30_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 132;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_148);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA30_146 = input.LA(1);

                         
                        int index30_146 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 132;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_146);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA30_142 = input.LA(1);

                         
                        int index30_142 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 132;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_142);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA30_115 = input.LA(1);

                         
                        int index30_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 132;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_115);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA30_111 = input.LA(1);

                         
                        int index30_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 132;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_111);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA30_121 = input.LA(1);

                         
                        int index30_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 59;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_121);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA30_117 = input.LA(1);

                         
                        int index30_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 104;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_117);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA30_107 = input.LA(1);

                         
                        int index30_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 104;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_107);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA30_141 = input.LA(1);

                         
                        int index30_141 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 140;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_141);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA30_105 = input.LA(1);

                         
                        int index30_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 140;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_105);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA30_153 = input.LA(1);

                         
                        int index30_153 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 152;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_153);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA30_138 = input.LA(1);

                         
                        int index30_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 152;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_138);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA30_35 = input.LA(1);

                         
                        int index30_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_35>='0' && LA30_35<='9')||(LA30_35>='A' && LA30_35<='Z')||(LA30_35>='a' && LA30_35<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 90;}

                        else if ( ((LA30_35>='\u0000' && LA30_35<='\t')||(LA30_35>='\u000B' && LA30_35<='/')||(LA30_35>=':' && LA30_35<='@')||(LA30_35>='[' && LA30_35<='`')||(LA30_35>='{' && LA30_35<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 89;

                         
                        input.seek(index30_35);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA30_139 = input.LA(1);

                         
                        int index30_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_139>='\u0000' && LA30_139<='\t')||(LA30_139>='\u000B' && LA30_139<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 153;

                         
                        input.seek(index30_139);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA30_88 = input.LA(1);

                         
                        int index30_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 86;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_88);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA30_136 = input.LA(1);

                         
                        int index30_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 135;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_136);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA30_89 = input.LA(1);

                         
                        int index30_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 135;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_89);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA30_41 = input.LA(1);

                         
                        int index30_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_41>='\u0000' && LA30_41<='\b')||(LA30_41>='\u000B' && LA30_41<='\u001F')||LA30_41=='!'||(LA30_41>='#' && LA30_41<='&')||(LA30_41>='*' && LA30_41<='+')||(LA30_41>='-' && LA30_41<='/')||(LA30_41>=';' && LA30_41<='<')||(LA30_41>='>' && LA30_41<='z')||LA30_41=='|'||(LA30_41>='~' && LA30_41<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 41;}

                        else if ( (LA30_41=='\t'||LA30_41==' '||LA30_41=='\"'||(LA30_41>='\'' && LA30_41<=')')||LA30_41==','||(LA30_41>='0' && LA30_41<=':')||LA30_41=='='||LA30_41=='{'||LA30_41=='}') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 39;}

                        else s = 94;

                         
                        input.seek(index30_41);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA30_8 = input.LA(1);

                         
                        int index30_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_8=='>') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_8>='\u0000' && LA30_8<='\t')||(LA30_8>='\u000B' && LA30_8<='=')||(LA30_8>='?' && LA30_8<='\uFFFF')) && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 39;}

                        else s = 38;

                         
                        input.seek(index30_8);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA30_82 = input.LA(1);

                         
                        int index30_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_82);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA30_7 = input.LA(1);

                         
                        int index30_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_7>='A' && LA30_7<='Z')||(LA30_7>='a' && LA30_7<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 35;}

                        else if ( ((LA30_7>='\u0000' && LA30_7<='\t')||(LA30_7>='\u000B' && LA30_7<='@')||(LA30_7>='[' && LA30_7<='`')||(LA30_7>='{' && LA30_7<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 36;

                         
                        input.seek(index30_7);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA30_16 = input.LA(1);

                         
                        int index30_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_16>='\u0000' && LA30_16<='\t')||(LA30_16>='\u000B' && LA30_16<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 65;

                         
                        input.seek(index30_16);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA30_43 = input.LA(1);

                         
                        int index30_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_43=='\t'||LA30_43==' ') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 43;}

                        else if ( ((LA30_43>='\u0000' && LA30_43<='\b')||(LA30_43>='\u000B' && LA30_43<='\u001F')||(LA30_43>='!' && LA30_43<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 98;

                         
                        input.seek(index30_43);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA30_15 = input.LA(1);

                         
                        int index30_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_15=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 61;}

                        else if ( ((LA30_15>='\u0000' && LA30_15<='\t')||(LA30_15>='\u000B' && LA30_15<='!')||(LA30_15>='#' && LA30_15<='[')||(LA30_15>=']' && LA30_15<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 62;}

                        else if ( (LA30_15=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 63;}

                        else if ( (LA30_15=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 64;}

                        else s = 60;

                         
                        input.seek(index30_15);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA30_108 = input.LA(1);

                         
                        int index30_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_108=='E'||LA30_108=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 109;}

                        else if ( (LA30_108=='D'||LA30_108=='F'||LA30_108=='d'||LA30_108=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 110;}

                        else if ( ((LA30_108>='0' && LA30_108<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 108;}

                        else if ( ((LA30_108>='\u0000' && LA30_108<='\t')||(LA30_108>='\u000B' && LA30_108<='/')||(LA30_108>=':' && LA30_108<='C')||(LA30_108>='G' && LA30_108<='c')||(LA30_108>='g' && LA30_108<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 142;

                         
                        input.seek(index30_108);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA30_118 = input.LA(1);

                         
                        int index30_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_118=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 58;}

                        else if ( (LA30_118=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 56;}

                        else if ( ((LA30_118>='\u0000' && LA30_118<='\t')||(LA30_118>='\u000B' && LA30_118<='&')||(LA30_118>='(' && LA30_118<='[')||(LA30_118>=']' && LA30_118<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 57;}

                        else if ( (LA30_118=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 59;}

                        else s = 150;

                         
                        input.seek(index30_118);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA30_93 = input.LA(1);

                         
                        int index30_93 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_93);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA30_125 = input.LA(1);

                         
                        int index30_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 64;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_125);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA30_36 = input.LA(1);

                         
                        int index30_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                         
                        input.seek(index30_36);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA30_55 = input.LA(1);

                         
                        int index30_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                         
                        input.seek(index30_55);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA30_60 = input.LA(1);

                         
                        int index30_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                         
                        input.seek(index30_60);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA30_54 = input.LA(1);

                         
                        int index30_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_54=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 49;}

                        else if ( (LA30_54=='E'||LA30_54=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 50;}

                        else if ( (LA30_54=='D'||LA30_54=='F'||LA30_54=='d'||LA30_54=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 51;}

                        else if ( ((LA30_54>='0' && LA30_54<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 54;}

                        else if ( (LA30_54=='L'||LA30_54=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 48;}

                        else if ( ((LA30_54>='\u0000' && LA30_54<='\t')||(LA30_54>='\u000B' && LA30_54<='-')||LA30_54=='/'||(LA30_54>=':' && LA30_54<='C')||(LA30_54>='G' && LA30_54<='K')||(LA30_54>='M' && LA30_54<='c')||(LA30_54>='g' && LA30_54<='k')||(LA30_54>='m' && LA30_54<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 117;

                         
                        input.seek(index30_54);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA30_24 = input.LA(1);

                         
                        int index30_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_24>='\u0000' && LA30_24<='\t')||(LA30_24>='\u000B' && LA30_24<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 74;

                         
                        input.seek(index30_24);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA30_21 = input.LA(1);

                         
                        int index30_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_21>='\u0000' && LA30_21<='\t')||(LA30_21>='\u000B' && LA30_21<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 69;

                         
                        input.seek(index30_21);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA30_78 = input.LA(1);

                         
                        int index30_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_78=='+'||LA30_78=='-') && (((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 133;}

                        else if ( ((LA30_78>='0' && LA30_78<='9')) && ((( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 134;}

                        else if ( ((LA30_78>='\u0000' && LA30_78<='\t')||(LA30_78>='\u000B' && LA30_78<='*')||LA30_78==','||(LA30_78>='.' && LA30_78<='/')||(LA30_78>=':' && LA30_78<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 74;

                         
                        input.seek(index30_78);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA30_46 = input.LA(1);

                         
                        int index30_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 104;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                         
                        input.seek(index30_46);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA30_53 = input.LA(1);

                         
                        int index30_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 104;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                         
                        input.seek(index30_53);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA30_90 = input.LA(1);

                         
                        int index30_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_90>='0' && LA30_90<='9')||(LA30_90>='A' && LA30_90<='Z')||(LA30_90>='a' && LA30_90<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 90;}

                        else if ( ((LA30_90>='\u0000' && LA30_90<='\t')||(LA30_90>='\u000B' && LA30_90<='/')||(LA30_90>=':' && LA30_90<='@')||(LA30_90>='[' && LA30_90<='`')||(LA30_90>='{' && LA30_90<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 136;

                         
                        input.seek(index30_90);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA30_20 = input.LA(1);

                         
                        int index30_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_20>='\u0000' && LA30_20<='\t')||(LA30_20>='\u000B' && LA30_20<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 68;

                         
                        input.seek(index30_20);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_3>='0' && LA30_3<='9')) && (((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 27;}

                        else if ( ((LA30_3>='\u0000' && LA30_3<='\b')||(LA30_3>='\u000B' && LA30_3<='\u001F')||LA30_3=='!'||(LA30_3>='#' && LA30_3<='&')||(LA30_3>='*' && LA30_3<='+')||(LA30_3>='-' && LA30_3<='/')||(LA30_3>=';' && LA30_3<='<')||(LA30_3>='>' && LA30_3<='z')||LA30_3=='|'||(LA30_3>='~' && LA30_3<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 23;}

                        else if ( (LA30_3=='\t'||LA30_3==' '||LA30_3=='\"'||(LA30_3>='\'' && LA30_3<=')')||LA30_3==','||LA30_3==':'||LA30_3=='='||LA30_3=='{'||LA30_3=='}') && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 26;

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA30_94 = input.LA(1);

                         
                        int index30_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_94);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA30_149 = input.LA(1);

                         
                        int index30_149 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_149>='\u0000' && LA30_149<='\t')||(LA30_149>='\u000B' && LA30_149<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 156;

                         
                        input.seek(index30_149);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA30_13 = input.LA(1);

                         
                        int index30_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_13=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 49;}

                        else if ( (LA30_13=='E'||LA30_13=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 50;}

                        else if ( (LA30_13=='D'||LA30_13=='F'||LA30_13=='d'||LA30_13=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 51;}

                        else if ( ((LA30_13>='0' && LA30_13<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 54;}

                        else if ( (LA30_13=='L'||LA30_13=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 48;}

                        else if ( ((LA30_13>='\u0000' && LA30_13<='\t')||(LA30_13>='\u000B' && LA30_13<='-')||LA30_13=='/'||(LA30_13>=':' && LA30_13<='C')||(LA30_13>='G' && LA30_13<='K')||(LA30_13>='M' && LA30_13<='c')||(LA30_13>='g' && LA30_13<='k')||(LA30_13>='m' && LA30_13<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 53;

                         
                        input.seek(index30_13);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA30_66 = input.LA(1);

                         
                        int index30_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                         
                        input.seek(index30_66);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA30_91 = input.LA(1);

                         
                        int index30_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 137;}

                        else if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_91);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA30_45 = input.LA(1);

                         
                        int index30_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_45>='0' && LA30_45<='9')||(LA30_45>='A' && LA30_45<='F')||(LA30_45>='a' && LA30_45<='f')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 103;}

                        else if ( ((LA30_45>='\u0000' && LA30_45<='\t')||(LA30_45>='\u000B' && LA30_45<='/')||(LA30_45>=':' && LA30_45<='@')||(LA30_45>='G' && LA30_45<='`')||(LA30_45>='g' && LA30_45<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 102;

                         
                        input.seek(index30_45);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_2>='\u0000' && LA30_2<='\b')||(LA30_2>='\u000B' && LA30_2<='\u001F')||LA30_2=='!'||(LA30_2>='#' && LA30_2<='&')||(LA30_2>='*' && LA30_2<='+')||(LA30_2>='-' && LA30_2<='/')||(LA30_2>=';' && LA30_2<='<')||(LA30_2>='>' && LA30_2<='z')||LA30_2=='|'||(LA30_2>='~' && LA30_2<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 23;}

                        else if ( (LA30_2=='\t'||LA30_2==' '||LA30_2=='\"'||(LA30_2>='\'' && LA30_2<=')')||LA30_2==','||(LA30_2>='0' && LA30_2<=':')||LA30_2=='='||LA30_2=='{'||LA30_2=='}') && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 25;

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA30_110 = input.LA(1);

                         
                        int index30_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_110>='\u0000' && LA30_110<='\t')||(LA30_110>='\u000B' && LA30_110<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 146;

                         
                        input.seek(index30_110);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA30_39 = input.LA(1);

                         
                        int index30_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_39>='\u0000' && LA30_39<='\t')||(LA30_39>='\u000B' && LA30_39<='\uFFFF')) && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 39;}

                        else s = 93;

                         
                        input.seek(index30_39);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA30_27 = input.LA(1);

                         
                        int index30_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_27=='E'||LA30_27=='e') && (((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 78;}

                        else if ( (LA30_27=='D'||LA30_27=='F'||LA30_27=='d'||LA30_27=='f') && (((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 79;}

                        else if ( ((LA30_27>='0' && LA30_27<='9')) && (((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 27;}

                        else if ( ((LA30_27>='\u0000' && LA30_27<='\t')||(LA30_27>='\u000B' && LA30_27<='/')||(LA30_27>=':' && LA30_27<='C')||(LA30_27>='G' && LA30_27<='c')||(LA30_27>='g' && LA30_27<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 77;

                         
                        input.seek(index30_27);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0=='%') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 1;}

                        else if ( (LA30_0=='#') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 2;}

                        else if ( (LA30_0=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 3;}

                        else if ( (LA30_0=='/') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH)||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 4;}

                        else if ( (LA30_0==',') && ((( lineMode == EMode.ATTRIBUTE_HASH && parenDepth > 0)||( lineMode == EMode.ATTRIBUTE_HASH && parenDepth <= 0)||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 5;}

                        else if ( ((LA30_0>='A' && LA30_0<='Z')||(LA30_0>='a' && LA30_0<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 6;}

                        else if ( (LA30_0==':') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 7;}

                        else if ( (LA30_0=='=') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 8;}

                        else if ( (LA30_0=='-') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 9;}

                        else if ( (LA30_0=='\t'||LA30_0==' ') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 10;}

                        else if ( (LA30_0=='\n') ) {s = 11;}

                        else if ( (LA30_0=='0') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 12;}

                        else if ( ((LA30_0>='1' && LA30_0<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 13;}

                        else if ( (LA30_0=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 14;}

                        else if ( (LA30_0=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 15;}

                        else if ( (LA30_0=='{') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 16;}

                        else if ( ((LA30_0>='\u0000' && LA30_0<='\b')||(LA30_0>='\u000B' && LA30_0<='\u001F')||LA30_0=='!'||LA30_0=='$'||LA30_0=='&'||(LA30_0>='*' && LA30_0<='+')||(LA30_0>=';' && LA30_0<='<')||(LA30_0>='>' && LA30_0<='@')||(LA30_0>='[' && LA30_0<='`')||LA30_0=='|'||(LA30_0>='~' && LA30_0<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 17;}

                        else if ( (LA30_0=='}') && ((( lineMode == EMode.TEXT )||( braceDepth > 1 )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ATTRIBUTE_HASH && braceDepth == 1 )))) {s = 19;}

                        else if ( (LA30_0=='(') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 20;}

                        else if ( (LA30_0==')') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 21;}

                        else s = 18;

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA30_134 = input.LA(1);

                         
                        int index30_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_134=='D'||LA30_134=='F'||LA30_134=='d'||LA30_134=='f') && (((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 79;}

                        else if ( ((LA30_134>='0' && LA30_134<='9')) && ((( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 134;}

                        else if ( ((LA30_134>='\u0000' && LA30_134<='\t')||(LA30_134>='\u000B' && LA30_134<='/')||(LA30_134>=':' && LA30_134<='C')||LA30_134=='E'||(LA30_134>='G' && LA30_134<='c')||LA30_134=='e'||(LA30_134>='g' && LA30_134<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 77;

                         
                        input.seek(index30_134);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA30_74 = input.LA(1);

                         
                        int index30_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_74);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA30_69 = input.LA(1);

                         
                        int index30_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 131;}

                         
                        input.seek(index30_69);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA30_68 = input.LA(1);

                         
                        int index30_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 81;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 130;}

                         
                        input.seek(index30_68);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA30_57 = input.LA(1);

                         
                        int index30_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_57=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 58;}

                        else if ( (LA30_57=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 56;}

                        else if ( ((LA30_57>='\u0000' && LA30_57<='\t')||(LA30_57>='\u000B' && LA30_57<='&')||(LA30_57>='(' && LA30_57<='[')||(LA30_57>=']' && LA30_57<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 57;}

                        else if ( (LA30_57=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 59;}

                        else s = 120;

                         
                        input.seek(index30_57);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA30_122 = input.LA(1);

                         
                        int index30_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_122=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 63;}

                        else if ( (LA30_122=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 61;}

                        else if ( ((LA30_122>='\u0000' && LA30_122<='\t')||(LA30_122>='\u000B' && LA30_122<='!')||(LA30_122>='#' && LA30_122<='[')||(LA30_122>=']' && LA30_122<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 62;}

                        else if ( (LA30_122=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 64;}

                        else s = 151;

                         
                        input.seek(index30_122);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA30_29 = input.LA(1);

                         
                        int index30_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_29>='\u0000' && LA30_29<='\b')||(LA30_29>='\u000B' && LA30_29<='\u001F')||LA30_29=='!'||(LA30_29>='#' && LA30_29<='&')||(LA30_29>='*' && LA30_29<='+')||(LA30_29>='-' && LA30_29<='/')||(LA30_29>=';' && LA30_29<='<')||(LA30_29>='>' && LA30_29<='z')||LA30_29=='|'||(LA30_29>='~' && LA30_29<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 29;}

                        else if ( (LA30_29=='\t'||LA30_29==' '||LA30_29=='\"'||(LA30_29>='\'' && LA30_29<=')')||LA30_29==','||(LA30_29>='0' && LA30_29<=':')||LA30_29=='='||LA30_29=='{'||LA30_29=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 82;

                         
                        input.seek(index30_29);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA30_33 = input.LA(1);

                         
                        int index30_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_33>='A' && LA30_33<='Z')||(LA30_33>='a' && LA30_33<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else if ( ((LA30_33>='0' && LA30_33<='9')) && ((( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 34;}

                        else if ( ((LA30_33>='\u0000' && LA30_33<='\b')||(LA30_33>='\u000B' && LA30_33<='\u001F')||LA30_33=='!'||(LA30_33>='#' && LA30_33<='&')||(LA30_33>='*' && LA30_33<='+')||(LA30_33>='-' && LA30_33<='/')||(LA30_33>=';' && LA30_33<='<')||(LA30_33>='>' && LA30_33<='@')||(LA30_33>='[' && LA30_33<='`')||LA30_33=='|'||(LA30_33>='~' && LA30_33<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 29;}

                        else if ( (LA30_33=='\t'||LA30_33==' '||LA30_33=='\"'||(LA30_33>='\'' && LA30_33<=')')||LA30_33==','||LA30_33==':'||LA30_33=='='||LA30_33=='{'||LA30_33=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 87;

                         
                        input.seek(index30_33);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA30_62 = input.LA(1);

                         
                        int index30_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_62=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 63;}

                        else if ( (LA30_62=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 61;}

                        else if ( ((LA30_62>='\u0000' && LA30_62<='\t')||(LA30_62>='\u000B' && LA30_62<='!')||(LA30_62>='#' && LA30_62<='[')||(LA30_62>=']' && LA30_62<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 62;}

                        else if ( (LA30_62=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 64;}

                        else s = 124;

                         
                        input.seek(index30_62);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA30_42 = input.LA(1);

                         
                        int index30_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.BEGINNING )) ) {s = 95;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 96;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 97;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_42);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA30_47 = input.LA(1);

                         
                        int index30_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_47=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 49;}

                        else if ( (LA30_47=='E'||LA30_47=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 50;}

                        else if ( (LA30_47=='D'||LA30_47=='F'||LA30_47=='d'||LA30_47=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 51;}

                        else if ( ((LA30_47>='0' && LA30_47<='7')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 47;}

                        else if ( (LA30_47=='L'||LA30_47=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 106;}

                        else if ( ((LA30_47>='\u0000' && LA30_47<='\t')||(LA30_47>='\u000B' && LA30_47<='-')||LA30_47=='/'||(LA30_47>=':' && LA30_47<='C')||(LA30_47>='G' && LA30_47<='K')||(LA30_47>='M' && LA30_47<='c')||(LA30_47>='g' && LA30_47<='k')||(LA30_47>='m' && LA30_47<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else if ( ((LA30_47>='8' && LA30_47<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 52;}

                        else s = 105;

                         
                        input.seek(index30_47);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA30_87 = input.LA(1);

                         
                        int index30_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 71;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 86;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 18;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 72;}

                         
                        input.seek(index30_87);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA30_109 = input.LA(1);

                         
                        int index30_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_109=='+'||LA30_109=='-') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 144;}

                        else if ( ((LA30_109>='0' && LA30_109<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 145;}

                        else if ( ((LA30_109>='\u0000' && LA30_109<='\t')||(LA30_109>='\u000B' && LA30_109<='*')||LA30_109==','||(LA30_109>='.' && LA30_109<='/')||(LA30_109>=':' && LA30_109<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 143;

                         
                        input.seek(index30_109);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA30_10 = input.LA(1);

                         
                        int index30_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_10=='\t'||LA30_10==' ') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 43;}

                        else if ( ((LA30_10>='\u0000' && LA30_10<='\b')||(LA30_10>='\u000B' && LA30_10<='\u001F')||(LA30_10>='!' && LA30_10<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 24;}

                        else s = 42;

                         
                        input.seek(index30_10);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA30_50 = input.LA(1);

                         
                        int index30_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_50=='+'||LA30_50=='-') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 112;}

                        else if ( ((LA30_50>='0' && LA30_50<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 113;}

                        else if ( ((LA30_50>='\u0000' && LA30_50<='\t')||(LA30_50>='\u000B' && LA30_50<='*')||LA30_50==','||(LA30_50>='.' && LA30_50<='/')||(LA30_50>=':' && LA30_50<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 114;

                         
                        input.seek(index30_50);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA30_103 = input.LA(1);

                         
                        int index30_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_103=='L'||LA30_103=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 139;}

                        else if ( ((LA30_103>='0' && LA30_103<='9')||(LA30_103>='A' && LA30_103<='F')||(LA30_103>='a' && LA30_103<='f')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 103;}

                        else if ( ((LA30_103>='\u0000' && LA30_103<='\t')||(LA30_103>='\u000B' && LA30_103<='/')||(LA30_103>=':' && LA30_103<='@')||(LA30_103>='G' && LA30_103<='K')||(LA30_103>='M' && LA30_103<='`')||(LA30_103>='g' && LA30_103<='k')||(LA30_103>='m' && LA30_103<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 138;

                         
                        input.seek(index30_103);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA30_58 = input.LA(1);

                         
                        int index30_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_58>='\u0000' && LA30_58<='\t')||(LA30_58>='\u000B' && LA30_58<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 121;

                         
                        input.seek(index30_58);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA30_37 = input.LA(1);

                         
                        int index30_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_37>='\u0000' && LA30_37<='\t')||(LA30_37>='\u000B' && LA30_37<='\uFFFF')) && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 39;}

                        else s = 91;

                         
                        input.seek(index30_37);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA30_30 = input.LA(1);

                         
                        int index30_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_30>='\u0000' && LA30_30<='\t')||(LA30_30>='\u000B' && LA30_30<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 83;

                         
                        input.seek(index30_30);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA30_63 = input.LA(1);

                         
                        int index30_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_63>='\u0000' && LA30_63<='\t')||(LA30_63>='\u000B' && LA30_63<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 125;

                         
                        input.seek(index30_63);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA30_9 = input.LA(1);

                         
                        int index30_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_9>='\u0000' && LA30_9<='\b')||(LA30_9>='\u000B' && LA30_9<='\u001F')||LA30_9=='!'||(LA30_9>='#' && LA30_9<='&')||(LA30_9>='*' && LA30_9<='+')||(LA30_9>='-' && LA30_9<='/')||(LA30_9>=';' && LA30_9<='<')||(LA30_9>='>' && LA30_9<='z')||LA30_9=='|'||(LA30_9>='~' && LA30_9<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 41;}

                        else if ( (LA30_9=='\t'||LA30_9==' '||LA30_9=='\"'||(LA30_9>='\'' && LA30_9<=')')||LA30_9==','||(LA30_9>='0' && LA30_9<=':')||LA30_9=='='||LA30_9=='{'||LA30_9=='}') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 39;}

                        else s = 40;

                         
                        input.seek(index30_9);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA30_113 = input.LA(1);

                         
                        int index30_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_113=='D'||LA30_113=='F'||LA30_113=='d'||LA30_113=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 149;}

                        else if ( ((LA30_113>='0' && LA30_113<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 113;}

                        else if ( ((LA30_113>='\u0000' && LA30_113<='\t')||(LA30_113>='\u000B' && LA30_113<='/')||(LA30_113>=':' && LA30_113<='C')||LA30_113=='E'||(LA30_113>='G' && LA30_113<='c')||LA30_113=='e'||(LA30_113>='g' && LA30_113<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 30;}

                        else s = 148;

                         
                        input.seek(index30_113);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}