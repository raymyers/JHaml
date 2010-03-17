// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/JHaml.g 2010-03-17 12:36:37

package com.cadrlife.jhaml.generated;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all") public class JHamlLexer extends Lexer {
    public static final int EXPONENT=39;
    public static final int JAVA_RPAREN=19;
    public static final int END_HASH=12;
    public static final int LBRACE=45;
    public static final int ID=7;
    public static final int EOF=-1;
    public static final int Space=32;
    public static final int STRING_LITERAL=21;
    public static final int FLOATING_POINT_LITERAL=26;
    public static final int COMMA=11;
    public static final int JAVA_COMMA=20;
    public static final int HEX_LITERAL=23;
    public static final int NL=35;
    public static final int MAP_TO=13;
    public static final int DOT=30;
    public static final int JAVA_RBRACE=17;
    public static final int JAVA_LPAREN=18;
    public static final int FLOAT_TYPE_SUFFIX=40;
    public static final int TextLine=42;
    public static final int RBRACE=46;
    public static final int PERCENT=6;
    public static final int IGNORED_NEWLINE=36;
    public static final int POUND=31;
    public static final int NULL=29;
    public static final int OCTAL_LITERAL=24;
    public static final int HEX_DIGIT=37;
    public static final int TEXT=5;
    public static final int InLineText=43;
    public static final int TRUE=27;
    public static final int RemainderOfLineText=44;
    public static final int BEGIN_HASH=10;
    public static final int ATTRIBUTE_NAME=14;
    public static final int WS=33;
    public static final int WS_WITHIN_HASH=34;
    public static final int NEWLINE=4;
    public static final int CHAR_LITERAL=22;
    public static final int JAVA_CODE=15;
    public static final int JAVA_LBRACE=16;
    public static final int FALSE=28;
    public static final int EscapeSequence=41;
    public static final int DECIMAL_LITERAL=25;
    public static final int INTEGER_TYPE_SUFFIX=38;
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
            // ../etc/JHaml.g:108:8: ({...}? => '%' )
            // ../etc/JHaml.g:108:12: {...}? => '%'
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
            // ../etc/JHaml.g:111:6: ({...}? => '#' )
            // ../etc/JHaml.g:111:8: {...}? => '#'
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
            // ../etc/JHaml.g:114:4: ({...}? => '.' )
            // ../etc/JHaml.g:114:8: {...}? => '.'
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
            // ../etc/JHaml.g:117:14: ({...}? => '/' )
            // ../etc/JHaml.g:117:16: {...}? => '/'
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
            // ../etc/JHaml.g:121:6: ({...}? => ',' )
            // ../etc/JHaml.g:121:8: {...}? => ','
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
            // ../etc/JHaml.g:124:11: ({...}? => ',' )
            // ../etc/JHaml.g:124:13: {...}? => ','
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
            // ../etc/JHaml.g:127:10: ({...}? => (~ ( ':' | '=' | ',' | '(' | ')' | ' ' | '\\t' | '\\n' | '\\'' | '\\\"' | ( '0' .. '9' ) | '{' | '}' ) )+ )
            // ../etc/JHaml.g:127:12: {...}? => (~ ( ':' | '=' | ',' | '(' | ')' | ' ' | '\\t' | '\\n' | '\\'' | '\\\"' | ( '0' .. '9' ) | '{' | '}' ) )+
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "JAVA_CODE", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            // ../etc/JHaml.g:128:3: (~ ( ':' | '=' | ',' | '(' | ')' | ' ' | '\\t' | '\\n' | '\\'' | '\\\"' | ( '0' .. '9' ) | '{' | '}' ) )+
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
            	    // ../etc/JHaml.g:128:3: ~ ( ':' | '=' | ',' | '(' | ')' | ' ' | '\\t' | '\\n' | '\\'' | '\\\"' | ( '0' .. '9' ) | '{' | '}' )
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
            // ../etc/JHaml.g:131:15: ({...}? => ':' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ../etc/JHaml.g:131:19: {...}? => ':' ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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

            // ../etc/JHaml.g:132:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // ../etc/JHaml.g:135:7: ({...}? => '=>' )
            // ../etc/JHaml.g:135:9: {...}? => '=>'
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
            // ../etc/JHaml.g:138:3: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ../etc/JHaml.g:138:7: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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

            // ../etc/JHaml.g:139:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // ../etc/JHaml.g:142:13: ({...}? => ( Space )+ )
            // ../etc/JHaml.g:142:15: {...}? => ( Space )+
            {
            if ( !(( lineMode == EMode.BEGINNING )) ) {
                throw new FailedPredicateException(input, "INDENTATION", " lineMode == EMode.BEGINNING ");
            }
            // ../etc/JHaml.g:143:3: ( Space )+
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
            	    // ../etc/JHaml.g:143:3: Space
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
            // ../etc/JHaml.g:145:4: ({...}? => ( Space )+ )
            // ../etc/JHaml.g:145:6: {...}? => ( Space )+
            {
            if ( !(( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "WS", " lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH ");
            }
            // ../etc/JHaml.g:146:3: ( Space )+
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
            	    // ../etc/JHaml.g:146:3: Space
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
            // ../etc/JHaml.g:148:16: ({...}? => Space )
            // ../etc/JHaml.g:148:18: {...}? => Space
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
            // ../etc/JHaml.g:151:15: ( ( '\\t' | ' ' ) )
            // ../etc/JHaml.g:151:17: ( '\\t' | ' ' )
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
            // ../etc/JHaml.g:154:10: ({...}? => NL )
            // ../etc/JHaml.g:154:12: {...}? => NL
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
            // ../etc/JHaml.g:155:18: ({...}? => NL )
            // ../etc/JHaml.g:155:20: {...}? => NL
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
            // ../etc/JHaml.g:156:3: ( '\\n' )
            // ../etc/JHaml.g:156:5: '\\n'
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
            // ../etc/JHaml.g:158:13: ({...}? => '0' ( 'x' | 'X' ) ( HEX_DIGIT )+ ( INTEGER_TYPE_SUFFIX )? )
            // ../etc/JHaml.g:158:15: {...}? => '0' ( 'x' | 'X' ) ( HEX_DIGIT )+ ( INTEGER_TYPE_SUFFIX )?
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

            // ../etc/JHaml.g:158:69: ( HEX_DIGIT )+
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
            	    // ../etc/JHaml.g:158:69: HEX_DIGIT
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

            // ../etc/JHaml.g:158:80: ( INTEGER_TYPE_SUFFIX )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='L'||LA7_0=='l') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../etc/JHaml.g:158:80: INTEGER_TYPE_SUFFIX
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
            // ../etc/JHaml.g:160:17: ({...}? => ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( INTEGER_TYPE_SUFFIX )? )
            // ../etc/JHaml.g:160:19: {...}? => ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( INTEGER_TYPE_SUFFIX )?
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "DECIMAL_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            // ../etc/JHaml.g:160:59: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // ../etc/JHaml.g:160:60: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../etc/JHaml.g:160:66: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../etc/JHaml.g:160:75: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../etc/JHaml.g:160:75: '0' .. '9'
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

            // ../etc/JHaml.g:160:86: ( INTEGER_TYPE_SUFFIX )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='L'||LA10_0=='l') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../etc/JHaml.g:160:86: INTEGER_TYPE_SUFFIX
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
            // ../etc/JHaml.g:162:15: ({...}? => '0' ( '0' .. '7' )+ ( INTEGER_TYPE_SUFFIX )? )
            // ../etc/JHaml.g:162:17: {...}? => '0' ( '0' .. '7' )+ ( INTEGER_TYPE_SUFFIX )?
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "OCTAL_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('0'); 
            // ../etc/JHaml.g:162:61: ( '0' .. '7' )+
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
            	    // ../etc/JHaml.g:162:62: '0' .. '7'
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

            // ../etc/JHaml.g:162:73: ( INTEGER_TYPE_SUFFIX )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='L'||LA12_0=='l') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../etc/JHaml.g:162:73: INTEGER_TYPE_SUFFIX
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
            // ../etc/JHaml.g:165:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../etc/JHaml.g:165:13: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // ../etc/JHaml.g:168:21: ( ( 'l' | 'L' ) )
            // ../etc/JHaml.g:168:23: ( 'l' | 'L' )
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

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
    traceIn("TRUE", 23);
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:170:5: ({...}? => 'true' )
            // ../etc/JHaml.g:170:7: {...}? => 'true'
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "TRUE", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("TRUE", 23);
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
    traceIn("FALSE", 24);
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:171:6: ({...}? => 'false' )
            // ../etc/JHaml.g:171:8: {...}? => 'false'
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "FALSE", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("FALSE", 24);
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
    traceIn("NULL", 25);
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:172:5: ({...}? => 'null' )
            // ../etc/JHaml.g:172:7: {...}? => 'null'
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "NULL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("NULL", 25);
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "FLOATING_POINT_LITERAL"
    public final void mFLOATING_POINT_LITERAL() throws RecognitionException {
    traceIn("FLOATING_POINT_LITERAL", 26);
        try {
            int _type = FLOATING_POINT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:175:5: ({...}? => ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX ) | DOT ( '0' .. '9' )+ ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? )
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
                    // ../etc/JHaml.g:175:7: {...}? => ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX )
                    {
                    if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                        throw new FailedPredicateException(input, "FLOATING_POINT_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
                    }
                    // ../etc/JHaml.g:176:9: ( '0' .. '9' )+
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
                    	    // ../etc/JHaml.g:176:10: '0' .. '9'
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

                    // ../etc/JHaml.g:177:9: ( '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )? | EXPONENT ( FLOAT_TYPE_SUFFIX )? | FLOAT_TYPE_SUFFIX )
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
                            // ../etc/JHaml.g:178:13: '.' ( '0' .. '9' )* ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )?
                            {
                            match('.'); 
                            // ../etc/JHaml.g:178:17: ( '0' .. '9' )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../etc/JHaml.g:178:18: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop14;
                                }
                            } while (true);

                            // ../etc/JHaml.g:178:29: ( EXPONENT )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='E'||LA15_0=='e') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../etc/JHaml.g:178:29: EXPONENT
                                    {
                                    mEXPONENT(); 

                                    }
                                    break;

                            }

                            // ../etc/JHaml.g:178:39: ( FLOAT_TYPE_SUFFIX )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0=='D'||LA16_0=='F'||LA16_0=='d'||LA16_0=='f') ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../etc/JHaml.g:178:39: FLOAT_TYPE_SUFFIX
                                    {
                                    mFLOAT_TYPE_SUFFIX(); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ../etc/JHaml.g:179:13: EXPONENT ( FLOAT_TYPE_SUFFIX )?
                            {
                            mEXPONENT(); 
                            // ../etc/JHaml.g:179:22: ( FLOAT_TYPE_SUFFIX )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='d'||LA17_0=='f') ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // ../etc/JHaml.g:179:22: FLOAT_TYPE_SUFFIX
                                    {
                                    mFLOAT_TYPE_SUFFIX(); 

                                    }
                                    break;

                            }


                            }
                            break;
                        case 3 :
                            // ../etc/JHaml.g:180:13: FLOAT_TYPE_SUFFIX
                            {
                            mFLOAT_TYPE_SUFFIX(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../etc/JHaml.g:182:9: DOT ( '0' .. '9' )+ ( EXPONENT )? ( FLOAT_TYPE_SUFFIX )?
                    {
                    mDOT(); 
                    // ../etc/JHaml.g:182:13: ( '0' .. '9' )+
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
                    	    // ../etc/JHaml.g:182:14: '0' .. '9'
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

                    // ../etc/JHaml.g:182:25: ( EXPONENT )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='E'||LA20_0=='e') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../etc/JHaml.g:182:25: EXPONENT
                            {
                            mEXPONENT(); 

                            }
                            break;

                    }

                    // ../etc/JHaml.g:182:35: ( FLOAT_TYPE_SUFFIX )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='D'||LA21_0=='F'||LA21_0=='d'||LA21_0=='f') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../etc/JHaml.g:182:35: FLOAT_TYPE_SUFFIX
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
    traceOut("FLOATING_POINT_LITERAL", 26);
        }
    }
    // $ANTLR end "FLOATING_POINT_LITERAL"

    // $ANTLR start "FLOAT_TYPE_SUFFIX"
    public final void mFLOAT_TYPE_SUFFIX() throws RecognitionException {
    traceIn("FLOAT_TYPE_SUFFIX", 27);
        try {
            // ../etc/JHaml.g:186:19: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // ../etc/JHaml.g:186:21: ( 'f' | 'F' | 'd' | 'D' )
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
    traceOut("FLOAT_TYPE_SUFFIX", 27);
        }
    }
    // $ANTLR end "FLOAT_TYPE_SUFFIX"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
    traceIn("EXPONENT", 28);
        try {
            // ../etc/JHaml.g:189:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../etc/JHaml.g:189:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../etc/JHaml.g:189:22: ( '+' | '-' )?
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

            // ../etc/JHaml.g:189:33: ( '0' .. '9' )+
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
            	    // ../etc/JHaml.g:189:34: '0' .. '9'
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
    traceOut("EXPONENT", 28);
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "CHAR_LITERAL"
    public final void mCHAR_LITERAL() throws RecognitionException {
    traceIn("CHAR_LITERAL", 29);
        try {
            int _type = CHAR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:193:5: ({...}? => '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
            // ../etc/JHaml.g:193:7: {...}? => '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "CHAR_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('\''); 
            // ../etc/JHaml.g:193:52: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
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
            	    // ../etc/JHaml.g:193:54: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/JHaml.g:193:71: ~ ( '\\'' | '\\\\' )
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
    traceOut("CHAR_LITERAL", 29);
        }
    }
    // $ANTLR end "CHAR_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
    traceIn("STRING_LITERAL", 30);
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:197:5: ({...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // ../etc/JHaml.g:197:7: {...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            if ( !(( lineMode == EMode.ATTRIBUTE_HASH )) ) {
                throw new FailedPredicateException(input, "STRING_LITERAL", " lineMode == EMode.ATTRIBUTE_HASH ");
            }
            match('\"'); 
            // ../etc/JHaml.g:197:51: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
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
            	    // ../etc/JHaml.g:197:53: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/JHaml.g:197:70: ~ ( '\\\\' | '\"' )
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
    traceOut("STRING_LITERAL", 30);
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
    traceIn("EscapeSequence", 31);
        try {
            // ../etc/JHaml.g:201:15: ( '\\\\' ~ NL )
            // ../etc/JHaml.g:201:17: '\\\\' ~ NL
            {
            match('\\'); 
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\"')||(input.LA(1)>='$' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
    traceOut("EscapeSequence", 31);
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
    traceIn("TEXT", 32);
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:203:5: ( ( TextLine | InLineText )? ( RemainderOfLineText )? )
            // ../etc/JHaml.g:203:7: ( TextLine | InLineText )? ( RemainderOfLineText )?
            {
            // ../etc/JHaml.g:203:7: ( TextLine | InLineText )?
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
                    // ../etc/JHaml.g:203:8: TextLine
                    {
                    mTextLine(); 

                    }
                    break;
                case 2 :
                    // ../etc/JHaml.g:203:19: InLineText
                    {
                    mInLineText(); 

                    }
                    break;

            }

            // ../etc/JHaml.g:203:32: ( RemainderOfLineText )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../etc/JHaml.g:203:32: RemainderOfLineText
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
    traceOut("TEXT", 32);
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "RemainderOfLineText"
    public final void mRemainderOfLineText() throws RecognitionException {
    traceIn("RemainderOfLineText", 33);
        try {
            int _type = RemainderOfLineText;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:205:20: ({...}? => (~ '\\n' )+ )
            // ../etc/JHaml.g:205:22: {...}? => (~ '\\n' )+
            {
            if ( !(( lineMode == EMode.TEXT )) ) {
                throw new FailedPredicateException(input, "RemainderOfLineText", " lineMode == EMode.TEXT ");
            }
            // ../etc/JHaml.g:205:52: (~ '\\n' )+
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
            	    // ../etc/JHaml.g:205:53: ~ '\\n'
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
    traceOut("RemainderOfLineText", 33);
        }
    }
    // $ANTLR end "RemainderOfLineText"

    // $ANTLR start "TextLine"
    public final void mTextLine() throws RecognitionException {
    traceIn("TextLine", 34);
        try {
            int _type = TextLine;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:207:9: ({...}? => (~ ( '.' | '#' | '%' | NL | Space ) ) )
            // ../etc/JHaml.g:207:11: {...}? => (~ ( '.' | '#' | '%' | NL | Space ) )
            {
            if ( !(( lineMode == EMode.BEGINNING )) ) {
                throw new FailedPredicateException(input, "TextLine", " lineMode == EMode.BEGINNING ");
            }
            // ../etc/JHaml.g:208:3: (~ ( '.' | '#' | '%' | NL | Space ) )
            // ../etc/JHaml.g:208:4: ~ ( '.' | '#' | '%' | NL | Space )
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
    traceOut("TextLine", 34);
        }
    }
    // $ANTLR end "TextLine"

    // $ANTLR start "InLineText"
    public final void mInLineText() throws RecognitionException {
    traceIn("InLineText", 35);
        try {
            int _type = InLineText;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:210:11: ({...}? => ( '-' | '=' ) )
            // ../etc/JHaml.g:210:13: {...}? => ( '-' | '=' )
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
    traceOut("InLineText", 35);
        }
    }
    // $ANTLR end "InLineText"

    // $ANTLR start "BEGIN_HASH"
    public final void mBEGIN_HASH() throws RecognitionException {
    traceIn("BEGIN_HASH", 36);
        try {
            int _type = BEGIN_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:214:13: ({...}? => LBRACE )
            // ../etc/JHaml.g:214:15: {...}? => LBRACE
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
    traceOut("BEGIN_HASH", 36);
        }
    }
    // $ANTLR end "BEGIN_HASH"

    // $ANTLR start "END_HASH"
    public final void mEND_HASH() throws RecognitionException {
    traceIn("END_HASH", 37);
        try {
            int _type = END_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:215:11: ({...}? => RBRACE )
            // ../etc/JHaml.g:215:13: {...}? => RBRACE
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
    traceOut("END_HASH", 37);
        }
    }
    // $ANTLR end "END_HASH"

    // $ANTLR start "JAVA_LBRACE"
    public final void mJAVA_LBRACE() throws RecognitionException {
    traceIn("JAVA_LBRACE", 38);
        try {
            int _type = JAVA_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:217:13: ({...}? => LBRACE )
            // ../etc/JHaml.g:217:15: {...}? => LBRACE
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
    traceOut("JAVA_LBRACE", 38);
        }
    }
    // $ANTLR end "JAVA_LBRACE"

    // $ANTLR start "JAVA_RBRACE"
    public final void mJAVA_RBRACE() throws RecognitionException {
    traceIn("JAVA_RBRACE", 39);
        try {
            int _type = JAVA_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:219:13: ({...}? => RBRACE )
            // ../etc/JHaml.g:219:15: {...}? => RBRACE
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
    traceOut("JAVA_RBRACE", 39);
        }
    }
    // $ANTLR end "JAVA_RBRACE"

    // $ANTLR start "JAVA_LPAREN"
    public final void mJAVA_LPAREN() throws RecognitionException {
    traceIn("JAVA_LPAREN", 40);
        try {
            int _type = JAVA_LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:221:13: ({...}? => '(' )
            // ../etc/JHaml.g:221:15: {...}? => '('
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
    traceOut("JAVA_LPAREN", 40);
        }
    }
    // $ANTLR end "JAVA_LPAREN"

    // $ANTLR start "JAVA_RPAREN"
    public final void mJAVA_RPAREN() throws RecognitionException {
    traceIn("JAVA_RPAREN", 41);
        try {
            int _type = JAVA_RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/JHaml.g:224:13: ({...}? => ')' )
            // ../etc/JHaml.g:224:15: {...}? => ')'
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
    traceOut("JAVA_RPAREN", 41);
        }
    }
    // $ANTLR end "JAVA_RPAREN"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
    traceIn("LBRACE", 42);
        try {
            // ../etc/JHaml.g:227:17: ( '{' )
            // ../etc/JHaml.g:227:19: '{'
            {
            match('{'); 
            braceDepth++;

            }

        }
        finally {
    traceOut("LBRACE", 42);
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
    traceIn("RBRACE", 43);
        try {
            // ../etc/JHaml.g:228:18: ( '}' )
            // ../etc/JHaml.g:228:20: '}'
            {
            match('}'); 
            braceDepth--;

            }

        }
        finally {
    traceOut("RBRACE", 43);
        }
    }
    // $ANTLR end "RBRACE"

    public void mTokens() throws RecognitionException {
        // ../etc/JHaml.g:1:8: ( PERCENT | POUND | DOT | FORWARD_SLASH | COMMA | JAVA_COMMA | JAVA_CODE | ATTRIBUTE_NAME | MAP_TO | ID | INDENTATION | WS | WS_WITHIN_HASH | NEWLINE | IGNORED_NEWLINE | NL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | TRUE | FALSE | NULL | FLOATING_POINT_LITERAL | CHAR_LITERAL | STRING_LITERAL | TEXT | RemainderOfLineText | TextLine | InLineText | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | JAVA_LPAREN | JAVA_RPAREN )
        int alt30=35;
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
                // ../etc/JHaml.g:1:193: TRUE
                {
                mTRUE(); 

                }
                break;
            case 21 :
                // ../etc/JHaml.g:1:198: FALSE
                {
                mFALSE(); 

                }
                break;
            case 22 :
                // ../etc/JHaml.g:1:204: NULL
                {
                mNULL(); 

                }
                break;
            case 23 :
                // ../etc/JHaml.g:1:209: FLOATING_POINT_LITERAL
                {
                mFLOATING_POINT_LITERAL(); 

                }
                break;
            case 24 :
                // ../etc/JHaml.g:1:232: CHAR_LITERAL
                {
                mCHAR_LITERAL(); 

                }
                break;
            case 25 :
                // ../etc/JHaml.g:1:245: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 26 :
                // ../etc/JHaml.g:1:260: TEXT
                {
                mTEXT(); 

                }
                break;
            case 27 :
                // ../etc/JHaml.g:1:265: RemainderOfLineText
                {
                mRemainderOfLineText(); 

                }
                break;
            case 28 :
                // ../etc/JHaml.g:1:285: TextLine
                {
                mTextLine(); 

                }
                break;
            case 29 :
                // ../etc/JHaml.g:1:294: InLineText
                {
                mInLineText(); 

                }
                break;
            case 30 :
                // ../etc/JHaml.g:1:305: BEGIN_HASH
                {
                mBEGIN_HASH(); 

                }
                break;
            case 31 :
                // ../etc/JHaml.g:1:316: END_HASH
                {
                mEND_HASH(); 

                }
                break;
            case 32 :
                // ../etc/JHaml.g:1:325: JAVA_LBRACE
                {
                mJAVA_LBRACE(); 

                }
                break;
            case 33 :
                // ../etc/JHaml.g:1:337: JAVA_RBRACE
                {
                mJAVA_RBRACE(); 

                }
                break;
            case 34 :
                // ../etc/JHaml.g:1:349: JAVA_LPAREN
                {
                mJAVA_LPAREN(); 

                }
                break;
            case 35 :
                // ../etc/JHaml.g:1:361: JAVA_RPAREN
                {
                mJAVA_RPAREN(); 

                }
                break;

        }

    }


    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA30_eotS =
        "\1\25\1\31\1\34\1\35\1\37\1\42\1\44\1\50\1\52\1\54\1\56\1\60\1"+
        "\63\1\72\1\74\1\76\1\77\1\100\1\110\1\112\1\113\1\uffff\1\114\1"+
        "\115\1\116\1\uffff\1\122\1\123\2\uffff\1\130\1\uffff\1\133\1\134"+
        "\1\uffff\1\140\1\uffff\1\142\1\143\1\145\1\uffff\1\146\1\uffff\1"+
        "\150\1\uffff\1\151\1\uffff\1\155\1\uffff\1\162\1\163\1\uffff\1\165"+
        "\1\173\1\174\1\175\1\177\1\u0080\1\uffff\1\u0082\1\uffff\1\u0084"+
        "\3\uffff\1\u0086\1\u0087\1\u0088\1\uffff\1\u008a\1\u008b\1\u008c"+
        "\16\uffff\1\123\1\130\7\uffff\1\u0097\4\uffff\1\u0098\14\uffff\1"+
        "\u009b\4\uffff\1\u009d\1\u009e\1\u00a1\1\u00a2\1\u00a3\3\uffff\1"+
        "\u00a6\2\uffff\1\u00a8\1\uffff\1\u00aa\1\uffff\1\u00ab\3\uffff\1"+
        "\u00ac\11\uffff\1\123\1\130\1\uffff\1\u00ad\5\uffff\1\u00af\2\uffff"+
        "\1\u00b0\1\u00b1\3\uffff\1\u00b2\2\uffff\1\u00b4\1\uffff\1\u00b5"+
        "\11\uffff\1\u00b7\6\uffff";
    static final String DFA30_eofS =
        "\u00ba\uffff";
    static final String DFA30_minS =
        "\25\0\1\uffff\56\0\1\uffff\4\0\1\uffff\5\0\3\uffff\2\0\2\uffff"+
        "\3\0\2\uffff\2\0\2\uffff\2\0\1\uffff\5\0\1\uffff\2\0\3\uffff\1\0"+
        "\3\uffff\3\0\1\uffff\30\0\6\uffff\2\0\1\uffff\3\0\2\uffff\12\0\1"+
        "\uffff\10\0\1\uffff\7\0\1\uffff\1\0\2\uffff";
    static final String DFA30_maxS =
        "\13\uffff\1\0\11\uffff\1\uffff\3\uffff\1\0\2\uffff\2\0\1\uffff"+
        "\1\0\2\uffff\1\0\1\uffff\1\0\3\uffff\1\0\1\uffff\1\0\1\uffff\1\0"+
        "\1\uffff\1\0\1\uffff\1\0\2\uffff\1\0\6\uffff\1\0\1\uffff\1\0\1\uffff"+
        "\3\0\3\uffff\1\uffff\3\uffff\1\0\1\uffff\5\0\3\uffff\2\0\2\uffff"+
        "\2\uffff\1\0\2\uffff\2\0\2\uffff\1\uffff\1\0\1\uffff\2\0\1\uffff"+
        "\2\0\1\uffff\2\0\3\uffff\1\0\3\uffff\1\uffff\2\0\1\uffff\1\0\5\uffff"+
        "\3\0\1\uffff\2\0\1\uffff\1\0\1\uffff\1\0\1\uffff\3\0\1\uffff\3\0"+
        "\6\uffff\2\uffff\1\uffff\1\uffff\2\0\2\uffff\1\0\1\uffff\2\0\2\uffff"+
        "\3\0\1\uffff\1\uffff\1\0\1\uffff\1\0\1\uffff\4\0\1\uffff\4\0\1\uffff"+
        "\2\0\1\uffff\1\0\2\uffff";
    static final String DFA30_acceptS =
        "\25\uffff\1\32\56\uffff\1\30\4\uffff\1\31\5\uffff\1\1\1\7\1\33"+
        "\2\uffff\1\2\1\3\3\uffff\1\4\1\34\2\uffff\1\5\1\6\2\uffff\1\12\5"+
        "\uffff\1\35\2\uffff\1\13\1\14\1\15\1\uffff\1\16\1\17\1\20\3\uffff"+
        "\1\22\30\uffff\1\36\1\40\1\37\1\41\1\42\1\43\2\uffff\1\27\3\uffff"+
        "\1\10\1\11\12\uffff\1\23\10\uffff\1\21\7\uffff\1\24\1\uffff\1\26"+
        "\1\25";
    static final String DFA30_specialS =
        "\1\u0084\1\126\1\143\1\74\1\102\1\125\1\134\1\60\1\u0094\1\50\1"+
        "\101\1\uffff\1\54\1\146\1\104\1\141\1\150\1\10\1\132\1\43\1\70\1"+
        "\uffff\1\156\1\53\1\71\1\u0082\1\103\1\u008e\1\177\1\u0080\1\56"+
        "\1\66\1\57\1\u0095\1\65\1\152\1\12\1\46\1\175\1\u0083\1\11\1\u0087"+
        "\1\0\1\73\1\76\1\1\1\u0081\1\142\1\144\1\u0089\1\162\1\u008f\1\u0092"+
        "\1\u008d\1\52\1\30\1\151\1\55\1\u0090\1\133\1\13\1\127\1\14\1\15"+
        "\1\16\1\135\1\122\1\72\1\uffff\1\136\1\75\1\61\1\17\1\uffff\1\2"+
        "\1\u0088\1\3\1\130\1\123\3\uffff\1\140\1\4\2\uffff\1\145\1\147\1"+
        "\77\2\uffff\1\47\1\121\2\uffff\1\153\1\174\1\uffff\1\173\1\42\1"+
        "\100\1\45\1\u0086\1\uffff\1\7\1\u0085\3\uffff\1\163\3\uffff\1\157"+
        "\1\120\1\35\1\uffff\1\27\1\154\1\u008c\1\164\1\41\1\u008a\1\117"+
        "\1\26\1\37\1\20\1\116\1\34\1\131\1\172\1\124\1\171\1\176\1\115\1"+
        "\114\1\31\1\51\1\113\1\112\1\6\6\uffff\1\67\1\5\1\uffff\1\u008b"+
        "\1\170\1\44\2\uffff\1\33\1\u0091\1\25\1\111\1\40\1\161\1\24\1\110"+
        "\1\23\1\155\1\uffff\1\36\1\137\1\167\1\160\1\166\1\107\1\106\1\62"+
        "\1\uffff\1\32\1\105\1\22\1\21\1\u0093\1\165\1\64\1\uffff\1\63\2"+
        "\uffff}>";
    static final String[] DFA30_transitionS = {
            "\11\24\1\12\1\13\25\24\1\12\1\24\1\22\1\2\1\24\1\1\1\24\1\21"+
            "\1\27\1\30\2\24\1\5\1\11\1\3\1\4\1\14\11\15\1\7\2\24\1\10\3"+
            "\24\32\20\6\24\5\20\1\16\7\20\1\17\5\20\1\6\6\20\1\23\1\24\1"+
            "\26\uff82\24",
            "\11\32\1\33\1\uffff\25\32\1\33\1\32\1\33\4\32\3\33\2\32\1"+
            "\33\3\32\13\33\2\32\1\33\75\32\1\33\1\32\1\33\uff82\32",
            "\11\32\1\33\1\uffff\25\32\1\33\1\32\1\33\4\32\3\33\2\32\1"+
            "\33\3\32\13\33\2\32\1\33\75\32\1\33\1\32\1\33\uff82\32",
            "\11\32\1\33\1\uffff\25\32\1\33\1\32\1\33\4\32\3\33\2\32\1"+
            "\33\3\32\12\36\1\33\2\32\1\33\75\32\1\33\1\32\1\33\uff82\32",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\13\41\2\40\1\41\75\40\1\41\1\40\1\41\uff82\40",
            "\12\41\1\uffff\ufff5\41",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\21\45\1\43\10"+
            "\45\1\41\1\40\1\41\uff82\40",
            "\12\41\1\uffff\66\41\32\47\6\41\32\47\uff85\41",
            "\12\53\1\uffff\63\53\1\51\uffc1\53",
            "\11\55\1\53\1\uffff\25\55\1\53\1\55\1\53\4\55\3\53\2\55\1"+
            "\53\3\55\13\53\2\55\1\53\75\55\1\53\1\55\1\53\uff82\55",
            "\11\33\1\57\1\uffff\25\33\1\57\uffdf\33",
            "\1\uffff",
            "\12\41\1\uffff\43\41\1\64\1\41\10\67\2\70\12\41\1\66\1\65"+
            "\1\66\5\41\1\62\13\41\1\61\13\41\1\66\1\65\1\66\5\41\1\62\13"+
            "\41\1\61\uff87\41",
            "\12\41\1\uffff\43\41\1\64\1\41\12\71\12\41\1\66\1\65\1\66"+
            "\5\41\1\62\27\41\1\66\1\65\1\66\5\41\1\62\uff93\41",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\1\73\31\45\1\41"+
            "\1\40\1\41\uff82\40",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\24\45\1\75\5\45"+
            "\1\41\1\40\1\41\uff82\40",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\32\45\1\41\1\40"+
            "\1\41\uff82\40",
            "\12\102\1\104\34\102\1\103\64\102\1\101\uffa3\102",
            "\12\106\1\111\27\106\1\107\71\106\1\105\uffa3\106",
            "\12\41\1\uffff\ufff5\41",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\13\41\2\40\1\41\75\40\1\41\1\40\1\41\uff82\40",
            "",
            "\12\41\1\uffff\ufff5\41",
            "\12\41\1\uffff\ufff5\41",
            "\12\41\1\uffff\ufff5\41",
            "\1\uffff",
            "\11\32\1\33\1\uffff\25\32\1\33\1\32\1\33\4\32\3\33\2\32\1"+
            "\33\3\32\13\33\2\32\1\33\75\32\1\33\1\32\1\33\uff82\32",
            "\12\33\1\uffff\ufff5\33",
            "\1\uffff",
            "\1\uffff",
            "\12\33\1\uffff\45\33\12\36\12\33\1\127\1\126\1\127\35\33\1"+
            "\127\1\126\1\127\uff99\33",
            "\1\uffff",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\13\41\2\40\1\41\75\40\1\41\1\40\1\41\uff82\40",
            "\12\41\1\uffff\ufff5\41",
            "\1\uffff",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\24\45\1\137\5"+
            "\45\1\41\1\40\1\41\uff82\40",
            "\1\uffff",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\32\45\1\41\1\40"+
            "\1\41\uff82\40",
            "\12\41\1\uffff\45\41\12\46\7\41\32\46\6\41\32\46\uff85\41",
            "\12\41\1\uffff\45\41\12\144\7\41\32\144\6\41\32\144\uff85"+
            "\41",
            "\1\uffff",
            "\12\53\1\uffff\ufff5\53",
            "\1\uffff",
            "\12\53\1\uffff\ufff5\53",
            "\1\uffff",
            "\11\55\1\53\1\uffff\25\55\1\53\1\55\1\53\4\55\3\53\2\55\1"+
            "\53\3\55\13\53\2\55\1\53\75\55\1\53\1\55\1\53\uff82\55",
            "\1\uffff",
            "\11\33\1\57\1\uffff\25\33\1\57\uffdf\33",
            "\1\uffff",
            "\12\41\1\uffff\45\41\12\161\7\41\6\161\32\41\6\161\uff99\41",
            "\12\41\1\uffff\ufff5\41",
            "\1\uffff",
            "\12\41\1\uffff\45\41\12\166\12\41\1\170\1\167\1\170\35\41"+
            "\1\170\1\167\1\170\uff99\41",
            "\12\41\1\uffff\40\41\1\171\1\41\1\171\2\41\12\172\uffc6\41",
            "\12\41\1\uffff\ufff5\41",
            "\12\41\1\uffff\43\41\1\64\1\41\10\67\2\70\12\41\1\66\1\65"+
            "\1\66\5\41\1\176\27\41\1\66\1\65\1\66\5\41\1\176\uff93\41",
            "\12\41\1\uffff\43\41\1\64\1\41\12\70\12\41\1\66\1\65\1\66"+
            "\35\41\1\66\1\65\1\66\uff99\41",
            "\12\41\1\uffff\43\41\1\64\1\41\12\71\12\41\1\66\1\65\1\66"+
            "\5\41\1\62\27\41\1\66\1\65\1\66\5\41\1\62\uff93\41",
            "\1\uffff",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\13\45\1\u0081"+
            "\16\45\1\41\1\40\1\41\uff82\40",
            "\1\uffff",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\13\45\1\u0083"+
            "\16\45\1\41\1\40\1\41\uff82\40",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\u0085\1\uffff\ufff5\u0085",
            "\12\102\1\104\34\102\1\103\64\102\1\101\uffa3\102",
            "\12\41\1\uffff\ufff5\41",
            "",
            "\12\u0089\1\uffff\ufff5\u0089",
            "\12\106\1\111\27\106\1\107\71\106\1\105\uffa3\106",
            "\12\41\1\uffff\ufff5\41",
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
            "\12\33\1\uffff\40\33\1\u0093\1\33\1\u0093\2\33\12\u0094\uffc6"+
            "\33",
            "\12\33\1\uffff\ufff5\33",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\4\45\1\u0096\25"+
            "\45\1\41\1\40\1\41\uff82\40",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\12\41\1\uffff\45\41\12\144\7\41\32\144\6\41\32\144\uff85"+
            "\41",
            "\1\uffff",
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
            "\12\41\1\uffff\45\41\12\161\7\41\6\161\5\41\1\u009c\24\41"+
            "\6\161\5\41\1\u009c\uff93\41",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\12\41\1\uffff\45\41\12\166\12\41\1\170\1\167\1\170\35\41"+
            "\1\170\1\167\1\170\uff99\41",
            "\12\41\1\uffff\40\41\1\u009f\1\41\1\u009f\2\41\12\u00a0\uffc6"+
            "\41",
            "\12\41\1\uffff\ufff5\41",
            "\12\41\1\uffff\45\41\12\172\uffc6\41",
            "\12\41\1\uffff\45\41\12\172\12\41\1\u00a4\1\41\1\u00a4\35"+
            "\41\1\u00a4\1\41\1\u00a4\uff99\41",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\41\1\uffff\ufff5\41",
            "\1\uffff",
            "\1\uffff",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\22\45\1\u00a7"+
            "\7\45\1\41\1\40\1\41\uff82\40",
            "\1\uffff",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\13\45\1\u00a9"+
            "\16\45\1\41\1\40\1\41\uff82\40",
            "\1\uffff",
            "\12\102\1\104\34\102\1\103\64\102\1\101\uffa3\102",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\106\1\111\27\106\1\107\71\106\1\105\uffa3\106",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\33\1\uffff\45\33\12\u0094\uffc6\33",
            "\12\33\1\uffff\45\33\12\u0094\12\33\1\127\1\33\1\127\35\33"+
            "\1\127\1\33\1\127\uff99\33",
            "",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\32\45\1\41\1\40"+
            "\1\41\uff82\40",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\uffff",
            "\12\41\1\uffff\ufff5\41",
            "\1\uffff",
            "\1\uffff",
            "\12\41\1\uffff\45\41\12\u00a0\uffc6\41",
            "\12\41\1\uffff\45\41\12\u00a0\12\41\1\170\1\41\1\170\35\41"+
            "\1\170\1\41\1\170\uff99\41",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\41\1\uffff\ufff5\41",
            "",
            "\1\uffff",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\4\45\1\u00b3\25"+
            "\45\1\41\1\40\1\41\uff82\40",
            "\1\uffff",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\32\45\1\41\1\40"+
            "\1\41\uff82\40",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\11\40\1\41\1\uffff\25\40\1\41\1\40\1\41\4\40\3\41\2\40\1"+
            "\41\3\40\12\46\1\41\2\40\1\41\3\40\32\45\6\40\32\45\1\41\1\40"+
            "\1\41\uff82\40",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "",
            ""
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
            return "1:1: Tokens : ( PERCENT | POUND | DOT | FORWARD_SLASH | COMMA | JAVA_COMMA | JAVA_CODE | ATTRIBUTE_NAME | MAP_TO | ID | INDENTATION | WS | WS_WITHIN_HASH | NEWLINE | IGNORED_NEWLINE | NL | HEX_LITERAL | DECIMAL_LITERAL | OCTAL_LITERAL | TRUE | FALSE | NULL | FLOATING_POINT_LITERAL | CHAR_LITERAL | STRING_LITERAL | TEXT | RemainderOfLineText | TextLine | InLineText | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | JAVA_LPAREN | JAVA_RPAREN );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_42 = input.LA(1);

                         
                        int index30_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 103;}

                         
                        input.seek(index30_42);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA30_45 = input.LA(1);

                         
                        int index30_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_45>='\u0000' && LA30_45<='\b')||(LA30_45>='\u000B' && LA30_45<='\u001F')||LA30_45=='!'||(LA30_45>='#' && LA30_45<='&')||(LA30_45>='*' && LA30_45<='+')||(LA30_45>='-' && LA30_45<='/')||(LA30_45>=';' && LA30_45<='<')||(LA30_45>='>' && LA30_45<='z')||LA30_45=='|'||(LA30_45>='~' && LA30_45<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 45;}

                        else if ( (LA30_45=='\t'||LA30_45==' '||LA30_45=='\"'||(LA30_45>='\'' && LA30_45<=')')||LA30_45==','||(LA30_45>='0' && LA30_45<=':')||LA30_45=='='||LA30_45=='{'||LA30_45=='}') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 43;}

                        else s = 105;

                         
                        input.seek(index30_45);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA30_74 = input.LA(1);

                         
                        int index30_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 141;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 142;}

                         
                        input.seek(index30_74);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA30_76 = input.LA(1);

                         
                        int index30_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH && braceDepth == 1 )) ) {s = 143;}

                        else if ( (( braceDepth > 1 )) ) {s = 144;}

                         
                        input.seek(index30_76);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA30_83 = input.LA(1);

                         
                        int index30_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.TEXT )) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_83);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA30_148 = input.LA(1);

                         
                        int index30_148 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_148=='D'||LA30_148=='F'||LA30_148=='d'||LA30_148=='f') && ((( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 87;}

                        else if ( ((LA30_148>='0' && LA30_148<='9')) && ((( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 148;}

                        else if ( ((LA30_148>='\u0000' && LA30_148<='\t')||(LA30_148>='\u000B' && LA30_148<='/')||(LA30_148>=':' && LA30_148<='C')||LA30_148=='E'||(LA30_148>='G' && LA30_148<='c')||LA30_148=='e'||(LA30_148>='g' && LA30_148<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 88;

                         
                        input.seek(index30_148);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA30_140 = input.LA(1);

                         
                        int index30_140 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 73;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_140);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA30_104 = input.LA(1);

                         
                        int index30_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_104);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA30_17 = input.LA(1);

                         
                        int index30_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_17=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 65;}

                        else if ( ((LA30_17>='\u0000' && LA30_17<='\t')||(LA30_17>='\u000B' && LA30_17<='&')||(LA30_17>='(' && LA30_17<='[')||(LA30_17>=']' && LA30_17<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 66;}

                        else if ( (LA30_17=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 67;}

                        else if ( (LA30_17=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 68;}

                        else s = 64;

                         
                        input.seek(index30_17);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA30_40 = input.LA(1);

                         
                        int index30_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_40);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA30_36 = input.LA(1);

                         
                        int index30_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_36);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA30_60 = input.LA(1);

                         
                        int index30_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_60);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA30_62 = input.LA(1);

                         
                        int index30_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_62);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA30_63 = input.LA(1);

                         
                        int index30_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_63);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA30_64 = input.LA(1);

                         
                        int index30_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_64);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA30_72 = input.LA(1);

                         
                        int index30_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_72);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA30_126 = input.LA(1);

                         
                        int index30_126 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_126>='\u0000' && LA30_126<='\t')||(LA30_126>='\u000B' && LA30_126<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 166;

                         
                        input.seek(index30_126);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA30_178 = input.LA(1);

                         
                        int index30_178 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 149;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_178);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA30_177 = input.LA(1);

                         
                        int index30_177 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 149;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_177);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA30_163 = input.LA(1);

                         
                        int index30_163 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 149;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_163);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA30_161 = input.LA(1);

                         
                        int index30_161 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 149;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_161);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA30_157 = input.LA(1);

                         
                        int index30_157 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 149;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_157);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA30_124 = input.LA(1);

                         
                        int index30_124 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 149;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_124);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA30_117 = input.LA(1);

                         
                        int index30_117 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 149;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_117);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA30_55 = input.LA(1);

                         
                        int index30_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_55=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 52;}

                        else if ( (LA30_55=='E'||LA30_55=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 53;}

                        else if ( (LA30_55=='D'||LA30_55=='F'||LA30_55=='d'||LA30_55=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 54;}

                        else if ( ((LA30_55>='0' && LA30_55<='7')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 55;}

                        else if ( (LA30_55=='L'||LA30_55=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 126;}

                        else if ( ((LA30_55>='\u0000' && LA30_55<='\t')||(LA30_55>='\u000B' && LA30_55<='-')||LA30_55=='/'||(LA30_55>=':' && LA30_55<='C')||(LA30_55>='G' && LA30_55<='K')||(LA30_55>='M' && LA30_55<='c')||(LA30_55>='g' && LA30_55<='k')||(LA30_55>='m' && LA30_55<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else if ( ((LA30_55>='8' && LA30_55<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 56;}

                        else s = 125;

                         
                        input.seek(index30_55);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA30_136 = input.LA(1);

                         
                        int index30_136 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 68;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_136);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA30_175 = input.LA(1);

                         
                        int index30_175 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 174;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_175);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA30_155 = input.LA(1);

                         
                        int index30_155 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 174;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_155);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA30_128 = input.LA(1);

                         
                        int index30_128 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 116;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_128);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA30_115 = input.LA(1);

                         
                        int index30_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 116;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_115);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA30_166 = input.LA(1);

                         
                        int index30_166 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 165;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_166);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA30_125 = input.LA(1);

                         
                        int index30_125 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 165;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_125);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA30_159 = input.LA(1);

                         
                        int index30_159 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_159>='0' && LA30_159<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 160;}

                        else if ( ((LA30_159>='\u0000' && LA30_159<='\t')||(LA30_159>='\u000B' && LA30_159<='/')||(LA30_159>=':' && LA30_159<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 176;

                         
                        input.seek(index30_159);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA30_121 = input.LA(1);

                         
                        int index30_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_121>='0' && LA30_121<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 122;}

                        else if ( ((LA30_121>='\u0000' && LA30_121<='\t')||(LA30_121>='\u000B' && LA30_121<='/')||(LA30_121>=':' && LA30_121<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 162;

                         
                        input.seek(index30_121);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA30_99 = input.LA(1);

                         
                        int index30_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_99);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA30_19 = input.LA(1);

                         
                        int index30_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_19>='\u0000' && LA30_19<='\t')||(LA30_19>='\u000B' && LA30_19<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 74;

                         
                        input.seek(index30_19);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA30_152 = input.LA(1);

                         
                        int index30_152 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 153;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_152);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA30_101 = input.LA(1);

                         
                        int index30_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 153;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_101);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA30_37 = input.LA(1);

                         
                        int index30_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_37>='A' && LA30_37<='Z')||(LA30_37>='a' && LA30_37<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_37>='0' && LA30_37<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_37>='\u0000' && LA30_37<='\b')||(LA30_37>='\u000B' && LA30_37<='\u001F')||LA30_37=='!'||(LA30_37>='#' && LA30_37<='&')||(LA30_37>='*' && LA30_37<='+')||(LA30_37>='-' && LA30_37<='/')||(LA30_37>=';' && LA30_37<='<')||(LA30_37>='>' && LA30_37<='@')||(LA30_37>='[' && LA30_37<='`')||LA30_37=='|'||(LA30_37>='~' && LA30_37<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_37=='\t'||LA30_37==' '||LA30_37=='\"'||(LA30_37>='\'' && LA30_37<=')')||LA30_37==','||LA30_37==':'||LA30_37=='='||LA30_37=='{'||LA30_37=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 98;

                         
                        input.seek(index30_37);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA30_91 = input.LA(1);

                         
                        int index30_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_91);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA30_9 = input.LA(1);

                         
                        int index30_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_9>='\u0000' && LA30_9<='\b')||(LA30_9>='\u000B' && LA30_9<='\u001F')||LA30_9=='!'||(LA30_9>='#' && LA30_9<='&')||(LA30_9>='*' && LA30_9<='+')||(LA30_9>='-' && LA30_9<='/')||(LA30_9>=';' && LA30_9<='<')||(LA30_9>='>' && LA30_9<='z')||LA30_9=='|'||(LA30_9>='~' && LA30_9<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 45;}

                        else if ( (LA30_9=='\t'||LA30_9==' '||LA30_9=='\"'||(LA30_9>='\'' && LA30_9<=')')||LA30_9==','||(LA30_9>='0' && LA30_9<=':')||LA30_9=='='||LA30_9=='{'||LA30_9=='}') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 43;}

                        else s = 44;

                         
                        input.seek(index30_9);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA30_137 = input.LA(1);

                         
                        int index30_137 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_137=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 71;}

                        else if ( (LA30_137=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 69;}

                        else if ( ((LA30_137>='\u0000' && LA30_137<='\t')||(LA30_137>='\u000B' && LA30_137<='!')||(LA30_137>='#' && LA30_137<='[')||(LA30_137>=']' && LA30_137<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 70;}

                        else if ( (LA30_137=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 73;}

                        else s = 172;

                         
                        input.seek(index30_137);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA30_54 = input.LA(1);

                         
                        int index30_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_54>='\u0000' && LA30_54<='\t')||(LA30_54>='\u000B' && LA30_54<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 124;

                         
                        input.seek(index30_54);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA30_23 = input.LA(1);

                         
                        int index30_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_23>='\u0000' && LA30_23<='\t')||(LA30_23>='\u000B' && LA30_23<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 77;

                         
                        input.seek(index30_23);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA30_12 = input.LA(1);

                         
                        int index30_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_12=='X'||LA30_12=='x') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 49;}

                        else if ( (LA30_12=='L'||LA30_12=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 50;}

                        else if ( (LA30_12=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 52;}

                        else if ( (LA30_12=='E'||LA30_12=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 53;}

                        else if ( (LA30_12=='D'||LA30_12=='F'||LA30_12=='d'||LA30_12=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 54;}

                        else if ( ((LA30_12>='0' && LA30_12<='7')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 55;}

                        else if ( ((LA30_12>='8' && LA30_12<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 56;}

                        else if ( ((LA30_12>='\u0000' && LA30_12<='\t')||(LA30_12>='\u000B' && LA30_12<='-')||LA30_12=='/'||(LA30_12>=':' && LA30_12<='C')||(LA30_12>='G' && LA30_12<='K')||(LA30_12>='M' && LA30_12<='W')||(LA30_12>='Y' && LA30_12<='c')||(LA30_12>='g' && LA30_12<='k')||(LA30_12>='m' && LA30_12<='w')||(LA30_12>='y' && LA30_12<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 51;

                         
                        input.seek(index30_12);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA30_57 = input.LA(1);

                         
                        int index30_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_57=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 52;}

                        else if ( (LA30_57=='E'||LA30_57=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 53;}

                        else if ( (LA30_57=='D'||LA30_57=='F'||LA30_57=='d'||LA30_57=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 54;}

                        else if ( ((LA30_57>='0' && LA30_57<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 57;}

                        else if ( (LA30_57=='L'||LA30_57=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 50;}

                        else if ( ((LA30_57>='\u0000' && LA30_57<='\t')||(LA30_57>='\u000B' && LA30_57<='-')||LA30_57=='/'||(LA30_57>=':' && LA30_57<='C')||(LA30_57>='G' && LA30_57<='K')||(LA30_57>='M' && LA30_57<='c')||(LA30_57>='g' && LA30_57<='k')||(LA30_57>='m' && LA30_57<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 128;

                         
                        input.seek(index30_57);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA30_30 = input.LA(1);

                         
                        int index30_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_30=='E'||LA30_30=='e') && ((( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 86;}

                        else if ( (LA30_30=='D'||LA30_30=='F'||LA30_30=='d'||LA30_30=='f') && ((( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 87;}

                        else if ( ((LA30_30>='0' && LA30_30<='9')) && (((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 30;}

                        else if ( ((LA30_30>='\u0000' && LA30_30<='\t')||(LA30_30>='\u000B' && LA30_30<='/')||(LA30_30>=':' && LA30_30<='C')||(LA30_30>='G' && LA30_30<='c')||(LA30_30>='g' && LA30_30<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 88;

                         
                        input.seek(index30_30);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA30_32 = input.LA(1);

                         
                        int index30_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_32>='\u0000' && LA30_32<='\b')||(LA30_32>='\u000B' && LA30_32<='\u001F')||LA30_32=='!'||(LA30_32>='#' && LA30_32<='&')||(LA30_32>='*' && LA30_32<='+')||(LA30_32>='-' && LA30_32<='/')||(LA30_32>=';' && LA30_32<='<')||(LA30_32>='>' && LA30_32<='z')||LA30_32=='|'||(LA30_32>='~' && LA30_32<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_32=='\t'||LA30_32==' '||LA30_32=='\"'||(LA30_32>='\'' && LA30_32<=')')||LA30_32==','||(LA30_32>='0' && LA30_32<=':')||LA30_32=='='||LA30_32=='{'||LA30_32=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 91;

                         
                        input.seek(index30_32);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA30_7 = input.LA(1);

                         
                        int index30_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_7>='A' && LA30_7<='Z')||(LA30_7>='a' && LA30_7<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 39;}

                        else if ( ((LA30_7>='\u0000' && LA30_7<='\t')||(LA30_7>='\u000B' && LA30_7<='@')||(LA30_7>='[' && LA30_7<='`')||(LA30_7>='{' && LA30_7<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 40;

                         
                        input.seek(index30_7);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA30_71 = input.LA(1);

                         
                        int index30_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_71>='\u0000' && LA30_71<='\t')||(LA30_71>='\u000B' && LA30_71<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 140;

                         
                        input.seek(index30_71);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA30_173 = input.LA(1);

                         
                        int index30_173 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 182;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_173);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA30_183 = input.LA(1);

                         
                        int index30_183 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 185;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_183);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA30_181 = input.LA(1);

                         
                        int index30_181 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 184;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_181);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA30_34 = input.LA(1);

                         
                        int index30_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH && parenDepth <= 0)) ) {s = 93;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH && parenDepth > 0)) ) {s = 94;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_34);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA30_31 = input.LA(1);

                         
                        int index30_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH)) ) {s = 89;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_31);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA30_147 = input.LA(1);

                         
                        int index30_147 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_147>='0' && LA30_147<='9')) && ((( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 148;}

                        else if ( ((LA30_147>='\u0000' && LA30_147<='\t')||(LA30_147>='\u000B' && LA30_147<='/')||(LA30_147>=':' && LA30_147<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 83;

                         
                        input.seek(index30_147);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA30_20 = input.LA(1);

                         
                        int index30_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_20>='\u0000' && LA30_20<='\b')||(LA30_20>='\u000B' && LA30_20<='\u001F')||LA30_20=='!'||(LA30_20>='#' && LA30_20<='&')||(LA30_20>='*' && LA30_20<='+')||(LA30_20>='-' && LA30_20<='/')||(LA30_20>=';' && LA30_20<='<')||(LA30_20>='>' && LA30_20<='z')||LA30_20=='|'||(LA30_20>='~' && LA30_20<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_20=='\t'||LA30_20==' '||LA30_20=='\"'||(LA30_20>='\'' && LA30_20<=')')||LA30_20==','||(LA30_20>='0' && LA30_20<=':')||LA30_20=='='||LA30_20=='{'||LA30_20=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 75;

                         
                        input.seek(index30_20);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA30_24 = input.LA(1);

                         
                        int index30_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_24>='\u0000' && LA30_24<='\t')||(LA30_24>='\u000B' && LA30_24<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 78;

                         
                        input.seek(index30_24);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA30_67 = input.LA(1);

                         
                        int index30_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_67>='\u0000' && LA30_67<='\t')||(LA30_67>='\u000B' && LA30_67<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 136;

                         
                        input.seek(index30_67);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA30_43 = input.LA(1);

                         
                        int index30_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_43>='\u0000' && LA30_43<='\t')||(LA30_43>='\u000B' && LA30_43<='\uFFFF')) && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 43;}

                        else s = 104;

                         
                        input.seek(index30_43);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA30_3 = input.LA(1);

                         
                        int index30_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_3>='\u0000' && LA30_3<='\b')||(LA30_3>='\u000B' && LA30_3<='\u001F')||LA30_3=='!'||(LA30_3>='#' && LA30_3<='&')||(LA30_3>='*' && LA30_3<='+')||(LA30_3>='-' && LA30_3<='/')||(LA30_3>=';' && LA30_3<='<')||(LA30_3>='>' && LA30_3<='z')||LA30_3=='|'||(LA30_3>='~' && LA30_3<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 26;}

                        else if ( ((LA30_3>='0' && LA30_3<='9')) && (((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 30;}

                        else if ( (LA30_3=='\t'||LA30_3==' '||LA30_3=='\"'||(LA30_3>='\'' && LA30_3<=')')||LA30_3==','||LA30_3==':'||LA30_3=='='||LA30_3=='{'||LA30_3=='}') && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 29;

                         
                        input.seek(index30_3);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA30_70 = input.LA(1);

                         
                        int index30_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_70=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 71;}

                        else if ( (LA30_70=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 69;}

                        else if ( ((LA30_70>='\u0000' && LA30_70<='\t')||(LA30_70>='\u000B' && LA30_70<='!')||(LA30_70>='#' && LA30_70<='[')||(LA30_70>=']' && LA30_70<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 70;}

                        else if ( (LA30_70=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 73;}

                        else s = 139;

                         
                        input.seek(index30_70);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA30_44 = input.LA(1);

                         
                        int index30_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 103;}

                         
                        input.seek(index30_44);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA30_88 = input.LA(1);

                         
                        int index30_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {s = 149;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_88);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA30_100 = input.LA(1);

                         
                        int index30_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_100>='0' && LA30_100<='9')||(LA30_100>='A' && LA30_100<='Z')||(LA30_100>='a' && LA30_100<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 100;}

                        else if ( ((LA30_100>='\u0000' && LA30_100<='\t')||(LA30_100>='\u000B' && LA30_100<='/')||(LA30_100>=':' && LA30_100<='@')||(LA30_100>='[' && LA30_100<='`')||(LA30_100>='{' && LA30_100<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 152;

                         
                        input.seek(index30_100);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA30_10 = input.LA(1);

                         
                        int index30_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_10=='\t'||LA30_10==' ') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 47;}

                        else if ( ((LA30_10>='\u0000' && LA30_10<='\b')||(LA30_10>='\u000B' && LA30_10<='\u001F')||(LA30_10>='!' && LA30_10<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 46;

                         
                        input.seek(index30_10);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA30_4 = input.LA(1);

                         
                        int index30_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_4>='\u0000' && LA30_4<='\b')||(LA30_4>='\u000B' && LA30_4<='\u001F')||LA30_4=='!'||(LA30_4>='#' && LA30_4<='&')||(LA30_4>='*' && LA30_4<='+')||(LA30_4>='-' && LA30_4<='/')||(LA30_4>=';' && LA30_4<='<')||(LA30_4>='>' && LA30_4<='z')||LA30_4=='|'||(LA30_4>='~' && LA30_4<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_4=='\t'||LA30_4==' '||LA30_4=='\"'||(LA30_4>='\'' && LA30_4<=')')||LA30_4==','||(LA30_4>='0' && LA30_4<=':')||LA30_4=='='||LA30_4=='{'||LA30_4=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 31;

                         
                        input.seek(index30_4);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA30_26 = input.LA(1);

                         
                        int index30_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_26>='\u0000' && LA30_26<='\b')||(LA30_26>='\u000B' && LA30_26<='\u001F')||LA30_26=='!'||(LA30_26>='#' && LA30_26<='&')||(LA30_26>='*' && LA30_26<='+')||(LA30_26>='-' && LA30_26<='/')||(LA30_26>=';' && LA30_26<='<')||(LA30_26>='>' && LA30_26<='z')||LA30_26=='|'||(LA30_26>='~' && LA30_26<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 26;}

                        else if ( (LA30_26=='\t'||LA30_26==' '||LA30_26=='\"'||(LA30_26>='\'' && LA30_26<=')')||LA30_26==','||(LA30_26>='0' && LA30_26<=':')||LA30_26=='='||LA30_26=='{'||LA30_26=='}') && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 82;

                         
                        input.seek(index30_26);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA30_14 = input.LA(1);

                         
                        int index30_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_14=='a') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 59;}

                        else if ( ((LA30_14>='A' && LA30_14<='Z')||(LA30_14>='b' && LA30_14<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_14>='0' && LA30_14<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_14>='\u0000' && LA30_14<='\b')||(LA30_14>='\u000B' && LA30_14<='\u001F')||LA30_14=='!'||(LA30_14>='#' && LA30_14<='&')||(LA30_14>='*' && LA30_14<='+')||(LA30_14>='-' && LA30_14<='/')||(LA30_14>=';' && LA30_14<='<')||(LA30_14>='>' && LA30_14<='@')||(LA30_14>='[' && LA30_14<='`')||LA30_14=='|'||(LA30_14>='~' && LA30_14<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_14=='\t'||LA30_14==' '||LA30_14=='\"'||(LA30_14>='\'' && LA30_14<=')')||LA30_14==','||LA30_14==':'||LA30_14=='='||LA30_14=='{'||LA30_14=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 60;

                         
                        input.seek(index30_14);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA30_176 = input.LA(1);

                         
                        int index30_176 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_176);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA30_172 = input.LA(1);

                         
                        int index30_172 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_172);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA30_171 = input.LA(1);

                         
                        int index30_171 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_171);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA30_162 = input.LA(1);

                         
                        int index30_162 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_162);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA30_158 = input.LA(1);

                         
                        int index30_158 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_158);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA30_139 = input.LA(1);

                         
                        int index30_139 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_139);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA30_138 = input.LA(1);

                         
                        int index30_138 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_138);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA30_135 = input.LA(1);

                         
                        int index30_135 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_135);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA30_134 = input.LA(1);

                         
                        int index30_134 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_134);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA30_127 = input.LA(1);

                         
                        int index30_127 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_127);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA30_123 = input.LA(1);

                         
                        int index30_123 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_123);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA30_114 = input.LA(1);

                         
                        int index30_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_114);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA30_92 = input.LA(1);

                         
                        int index30_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_92);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA30_66 = input.LA(1);

                         
                        int index30_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_66=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 67;}

                        else if ( (LA30_66=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 65;}

                        else if ( ((LA30_66>='\u0000' && LA30_66<='\t')||(LA30_66>='\u000B' && LA30_66<='&')||(LA30_66>='(' && LA30_66<='[')||(LA30_66>=']' && LA30_66<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 66;}

                        else if ( (LA30_66=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 68;}

                        else s = 135;

                         
                        input.seek(index30_66);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA30_78 = input.LA(1);

                         
                        int index30_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 146;}

                         
                        input.seek(index30_78);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA30_131 = input.LA(1);

                         
                        int index30_131 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_131=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 169;}

                        else if ( ((LA30_131>='A' && LA30_131<='Z')||(LA30_131>='a' && LA30_131<='k')||(LA30_131>='m' && LA30_131<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_131>='0' && LA30_131<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_131>='\u0000' && LA30_131<='\b')||(LA30_131>='\u000B' && LA30_131<='\u001F')||LA30_131=='!'||(LA30_131>='#' && LA30_131<='&')||(LA30_131>='*' && LA30_131<='+')||(LA30_131>='-' && LA30_131<='/')||(LA30_131>=';' && LA30_131<='<')||(LA30_131>='>' && LA30_131<='@')||(LA30_131>='[' && LA30_131<='`')||LA30_131=='|'||(LA30_131>='~' && LA30_131<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_131=='\t'||LA30_131==' '||LA30_131=='\"'||(LA30_131>='\'' && LA30_131<=')')||LA30_131==','||LA30_131==':'||LA30_131=='='||LA30_131=='{'||LA30_131=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 170;

                         
                        input.seek(index30_131);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA30_5 = input.LA(1);

                         
                        int index30_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_5>='\u0000' && LA30_5<='\t')||(LA30_5>='\u000B' && LA30_5<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 34;

                         
                        input.seek(index30_5);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA30_1 = input.LA(1);

                         
                        int index30_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_1>='\u0000' && LA30_1<='\b')||(LA30_1>='\u000B' && LA30_1<='\u001F')||LA30_1=='!'||(LA30_1>='#' && LA30_1<='&')||(LA30_1>='*' && LA30_1<='+')||(LA30_1>='-' && LA30_1<='/')||(LA30_1>=';' && LA30_1<='<')||(LA30_1>='>' && LA30_1<='z')||LA30_1=='|'||(LA30_1>='~' && LA30_1<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 26;}

                        else if ( (LA30_1=='\t'||LA30_1==' '||LA30_1=='\"'||(LA30_1>='\'' && LA30_1<=')')||LA30_1==','||(LA30_1>='0' && LA30_1<=':')||LA30_1=='='||LA30_1=='{'||LA30_1=='}') && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 25;

                         
                        input.seek(index30_1);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA30_61 = input.LA(1);

                         
                        int index30_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_61=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 131;}

                        else if ( ((LA30_61>='A' && LA30_61<='Z')||(LA30_61>='a' && LA30_61<='k')||(LA30_61>='m' && LA30_61<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_61>='0' && LA30_61<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_61>='\u0000' && LA30_61<='\b')||(LA30_61>='\u000B' && LA30_61<='\u001F')||LA30_61=='!'||(LA30_61>='#' && LA30_61<='&')||(LA30_61>='*' && LA30_61<='+')||(LA30_61>='-' && LA30_61<='/')||(LA30_61>=';' && LA30_61<='<')||(LA30_61>='>' && LA30_61<='@')||(LA30_61>='[' && LA30_61<='`')||LA30_61=='|'||(LA30_61>='~' && LA30_61<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_61=='\t'||LA30_61==' '||LA30_61=='\"'||(LA30_61>='\'' && LA30_61<=')')||LA30_61==','||LA30_61==':'||LA30_61=='='||LA30_61=='{'||LA30_61=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 132;

                         
                        input.seek(index30_61);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA30_77 = input.LA(1);

                         
                        int index30_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 145;}

                         
                        input.seek(index30_77);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA30_129 = input.LA(1);

                         
                        int index30_129 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_129=='s') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 167;}

                        else if ( ((LA30_129>='A' && LA30_129<='Z')||(LA30_129>='a' && LA30_129<='r')||(LA30_129>='t' && LA30_129<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_129>='0' && LA30_129<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_129>='\u0000' && LA30_129<='\b')||(LA30_129>='\u000B' && LA30_129<='\u001F')||LA30_129=='!'||(LA30_129>='#' && LA30_129<='&')||(LA30_129>='*' && LA30_129<='+')||(LA30_129>='-' && LA30_129<='/')||(LA30_129>=';' && LA30_129<='<')||(LA30_129>='>' && LA30_129<='@')||(LA30_129>='[' && LA30_129<='`')||LA30_129=='|'||(LA30_129>='~' && LA30_129<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_129=='\t'||LA30_129==' '||LA30_129=='\"'||(LA30_129>='\'' && LA30_129<=')')||LA30_129==','||LA30_129==':'||LA30_129=='='||LA30_129=='{'||LA30_129=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 168;

                         
                        input.seek(index30_129);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA30_18 = input.LA(1);

                         
                        int index30_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_18=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 69;}

                        else if ( ((LA30_18>='\u0000' && LA30_18<='\t')||(LA30_18>='\u000B' && LA30_18<='!')||(LA30_18>='#' && LA30_18<='[')||(LA30_18>=']' && LA30_18<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 70;}

                        else if ( (LA30_18=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 71;}

                        else if ( (LA30_18=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 73;}

                        else s = 72;

                         
                        input.seek(index30_18);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA30_59 = input.LA(1);

                         
                        int index30_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_59=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 129;}

                        else if ( ((LA30_59>='A' && LA30_59<='Z')||(LA30_59>='a' && LA30_59<='k')||(LA30_59>='m' && LA30_59<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_59>='0' && LA30_59<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_59>='\u0000' && LA30_59<='\b')||(LA30_59>='\u000B' && LA30_59<='\u001F')||LA30_59=='!'||(LA30_59>='#' && LA30_59<='&')||(LA30_59>='*' && LA30_59<='+')||(LA30_59>='-' && LA30_59<='/')||(LA30_59>=';' && LA30_59<='<')||(LA30_59>='>' && LA30_59<='@')||(LA30_59>='[' && LA30_59<='`')||LA30_59=='|'||(LA30_59>='~' && LA30_59<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_59=='\t'||LA30_59==' '||LA30_59=='\"'||(LA30_59>='\'' && LA30_59<=')')||LA30_59==','||LA30_59==':'||LA30_59=='='||LA30_59=='{'||LA30_59=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 130;

                         
                        input.seek(index30_59);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA30_6 = input.LA(1);

                         
                        int index30_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_6=='r') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 35;}

                        else if ( ((LA30_6>='A' && LA30_6<='Z')||(LA30_6>='a' && LA30_6<='q')||(LA30_6>='s' && LA30_6<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_6>='0' && LA30_6<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_6>='\u0000' && LA30_6<='\b')||(LA30_6>='\u000B' && LA30_6<='\u001F')||LA30_6=='!'||(LA30_6>='#' && LA30_6<='&')||(LA30_6>='*' && LA30_6<='+')||(LA30_6>='-' && LA30_6<='/')||(LA30_6>=';' && LA30_6<='<')||(LA30_6>='>' && LA30_6<='@')||(LA30_6>='[' && LA30_6<='`')||LA30_6=='|'||(LA30_6>='~' && LA30_6<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_6=='\t'||LA30_6==' '||LA30_6=='\"'||(LA30_6>='\'' && LA30_6<=')')||LA30_6==','||LA30_6==':'||LA30_6=='='||LA30_6=='{'||LA30_6=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 36;

                         
                        input.seek(index30_6);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA30_65 = input.LA(1);

                         
                        int index30_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_65>='\u0000' && LA30_65<='\t')||(LA30_65>='\u000B' && LA30_65<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 133;}

                        else s = 134;

                         
                        input.seek(index30_65);
                        if ( s>=0 ) return s;
                        break;
                    case 94 : 
                        int LA30_69 = input.LA(1);

                         
                        int index30_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_69>='\u0000' && LA30_69<='\t')||(LA30_69>='\u000B' && LA30_69<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 137;}

                        else s = 138;

                         
                        input.seek(index30_69);
                        if ( s>=0 ) return s;
                        break;
                    case 95 : 
                        int LA30_167 = input.LA(1);

                         
                        int index30_167 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_167=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 179;}

                        else if ( ((LA30_167>='A' && LA30_167<='Z')||(LA30_167>='a' && LA30_167<='d')||(LA30_167>='f' && LA30_167<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_167>='0' && LA30_167<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_167>='\u0000' && LA30_167<='\b')||(LA30_167>='\u000B' && LA30_167<='\u001F')||LA30_167=='!'||(LA30_167>='#' && LA30_167<='&')||(LA30_167>='*' && LA30_167<='+')||(LA30_167>='-' && LA30_167<='/')||(LA30_167>=';' && LA30_167<='<')||(LA30_167>='>' && LA30_167<='@')||(LA30_167>='[' && LA30_167<='`')||LA30_167=='|'||(LA30_167>='~' && LA30_167<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_167=='\t'||LA30_167==' '||LA30_167=='\"'||(LA30_167>='\'' && LA30_167<=')')||LA30_167==','||LA30_167==':'||LA30_167=='='||LA30_167=='{'||LA30_167=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 180;

                         
                        input.seek(index30_167);
                        if ( s>=0 ) return s;
                        break;
                    case 96 : 
                        int LA30_82 = input.LA(1);

                         
                        int index30_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_82);
                        if ( s>=0 ) return s;
                        break;
                    case 97 : 
                        int LA30_15 = input.LA(1);

                         
                        int index30_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_15=='u') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 61;}

                        else if ( ((LA30_15>='A' && LA30_15<='Z')||(LA30_15>='a' && LA30_15<='t')||(LA30_15>='v' && LA30_15<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_15>='0' && LA30_15<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_15>='\u0000' && LA30_15<='\b')||(LA30_15>='\u000B' && LA30_15<='\u001F')||LA30_15=='!'||(LA30_15>='#' && LA30_15<='&')||(LA30_15>='*' && LA30_15<='+')||(LA30_15>='-' && LA30_15<='/')||(LA30_15>=';' && LA30_15<='<')||(LA30_15>='>' && LA30_15<='@')||(LA30_15>='[' && LA30_15<='`')||LA30_15=='|'||(LA30_15>='~' && LA30_15<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_15=='\t'||LA30_15==' '||LA30_15=='\"'||(LA30_15>='\'' && LA30_15<=')')||LA30_15==','||LA30_15==':'||LA30_15=='='||LA30_15=='{'||LA30_15=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 62;

                         
                        input.seek(index30_15);
                        if ( s>=0 ) return s;
                        break;
                    case 98 : 
                        int LA30_47 = input.LA(1);

                         
                        int index30_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_47=='\t'||LA30_47==' ') && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 47;}

                        else if ( ((LA30_47>='\u0000' && LA30_47<='\b')||(LA30_47>='\u000B' && LA30_47<='\u001F')||(LA30_47>='!' && LA30_47<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 109;

                         
                        input.seek(index30_47);
                        if ( s>=0 ) return s;
                        break;
                    case 99 : 
                        int LA30_2 = input.LA(1);

                         
                        int index30_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_2>='\u0000' && LA30_2<='\b')||(LA30_2>='\u000B' && LA30_2<='\u001F')||LA30_2=='!'||(LA30_2>='#' && LA30_2<='&')||(LA30_2>='*' && LA30_2<='+')||(LA30_2>='-' && LA30_2<='/')||(LA30_2>=';' && LA30_2<='<')||(LA30_2>='>' && LA30_2<='z')||LA30_2=='|'||(LA30_2>='~' && LA30_2<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )))) {s = 26;}

                        else if ( (LA30_2=='\t'||LA30_2==' '||LA30_2=='\"'||(LA30_2>='\'' && LA30_2<=')')||LA30_2==','||(LA30_2>='0' && LA30_2<=':')||LA30_2=='='||LA30_2=='{'||LA30_2=='}') && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 28;

                         
                        input.seek(index30_2);
                        if ( s>=0 ) return s;
                        break;
                    case 100 : 
                        int LA30_48 = input.LA(1);

                         
                        int index30_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode != EMode.ATTRIBUTE_HASH )) ) {s = 110;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 111;}

                        else if ( (true) ) {s = 112;}

                         
                        input.seek(index30_48);
                        if ( s>=0 ) return s;
                        break;
                    case 101 : 
                        int LA30_86 = input.LA(1);

                         
                        int index30_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_86=='+'||LA30_86=='-') && (((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 147;}

                        else if ( ((LA30_86>='0' && LA30_86<='9')) && ((( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 148;}

                        else if ( ((LA30_86>='\u0000' && LA30_86<='\t')||(LA30_86>='\u000B' && LA30_86<='*')||LA30_86==','||(LA30_86>='.' && LA30_86<='/')||(LA30_86>=':' && LA30_86<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 83;

                         
                        input.seek(index30_86);
                        if ( s>=0 ) return s;
                        break;
                    case 102 : 
                        int LA30_13 = input.LA(1);

                         
                        int index30_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_13>='0' && LA30_13<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 57;}

                        else if ( (LA30_13=='L'||LA30_13=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 50;}

                        else if ( (LA30_13=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 52;}

                        else if ( (LA30_13=='E'||LA30_13=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 53;}

                        else if ( (LA30_13=='D'||LA30_13=='F'||LA30_13=='d'||LA30_13=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 54;}

                        else if ( ((LA30_13>='\u0000' && LA30_13<='\t')||(LA30_13>='\u000B' && LA30_13<='-')||LA30_13=='/'||(LA30_13>=':' && LA30_13<='C')||(LA30_13>='G' && LA30_13<='K')||(LA30_13>='M' && LA30_13<='c')||(LA30_13>='g' && LA30_13<='k')||(LA30_13>='m' && LA30_13<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 58;

                         
                        input.seek(index30_13);
                        if ( s>=0 ) return s;
                        break;
                    case 103 : 
                        int LA30_87 = input.LA(1);

                         
                        int index30_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_87>='\u0000' && LA30_87<='\t')||(LA30_87>='\u000B' && LA30_87<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 88;

                         
                        input.seek(index30_87);
                        if ( s>=0 ) return s;
                        break;
                    case 104 : 
                        int LA30_16 = input.LA(1);

                         
                        int index30_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_16>='A' && LA30_16<='Z')||(LA30_16>='a' && LA30_16<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_16>='0' && LA30_16<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_16>='\u0000' && LA30_16<='\b')||(LA30_16>='\u000B' && LA30_16<='\u001F')||LA30_16=='!'||(LA30_16>='#' && LA30_16<='&')||(LA30_16>='*' && LA30_16<='+')||(LA30_16>='-' && LA30_16<='/')||(LA30_16>=';' && LA30_16<='<')||(LA30_16>='>' && LA30_16<='@')||(LA30_16>='[' && LA30_16<='`')||LA30_16=='|'||(LA30_16>='~' && LA30_16<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_16=='\t'||LA30_16==' '||LA30_16=='\"'||(LA30_16>='\'' && LA30_16<=')')||LA30_16==','||LA30_16==':'||LA30_16=='='||LA30_16=='{'||LA30_16=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 63;

                         
                        input.seek(index30_16);
                        if ( s>=0 ) return s;
                        break;
                    case 105 : 
                        int LA30_56 = input.LA(1);

                         
                        int index30_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_56=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 52;}

                        else if ( (LA30_56=='E'||LA30_56=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 53;}

                        else if ( (LA30_56=='D'||LA30_56=='F'||LA30_56=='d'||LA30_56=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 54;}

                        else if ( ((LA30_56>='0' && LA30_56<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 56;}

                        else if ( ((LA30_56>='\u0000' && LA30_56<='\t')||(LA30_56>='\u000B' && LA30_56<='-')||LA30_56=='/'||(LA30_56>=':' && LA30_56<='C')||(LA30_56>='G' && LA30_56<='c')||(LA30_56>='g' && LA30_56<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 127;

                         
                        input.seek(index30_56);
                        if ( s>=0 ) return s;
                        break;
                    case 106 : 
                        int LA30_35 = input.LA(1);

                         
                        int index30_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_35=='u') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 95;}

                        else if ( ((LA30_35>='A' && LA30_35<='Z')||(LA30_35>='a' && LA30_35<='t')||(LA30_35>='v' && LA30_35<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_35>='0' && LA30_35<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_35>='\u0000' && LA30_35<='\b')||(LA30_35>='\u000B' && LA30_35<='\u001F')||LA30_35=='!'||(LA30_35>='#' && LA30_35<='&')||(LA30_35>='*' && LA30_35<='+')||(LA30_35>='-' && LA30_35<='/')||(LA30_35>=';' && LA30_35<='<')||(LA30_35>='>' && LA30_35<='@')||(LA30_35>='[' && LA30_35<='`')||LA30_35=='|'||(LA30_35>='~' && LA30_35<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_35=='\t'||LA30_35==' '||LA30_35=='\"'||(LA30_35>='\'' && LA30_35<=')')||LA30_35==','||LA30_35==':'||LA30_35=='='||LA30_35=='{'||LA30_35=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 96;

                         
                        input.seek(index30_35);
                        if ( s>=0 ) return s;
                        break;
                    case 107 : 
                        int LA30_95 = input.LA(1);

                         
                        int index30_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_95=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 150;}

                        else if ( ((LA30_95>='A' && LA30_95<='Z')||(LA30_95>='a' && LA30_95<='d')||(LA30_95>='f' && LA30_95<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_95>='0' && LA30_95<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_95>='\u0000' && LA30_95<='\b')||(LA30_95>='\u000B' && LA30_95<='\u001F')||LA30_95=='!'||(LA30_95>='#' && LA30_95<='&')||(LA30_95>='*' && LA30_95<='+')||(LA30_95>='-' && LA30_95<='/')||(LA30_95>=';' && LA30_95<='<')||(LA30_95>='>' && LA30_95<='@')||(LA30_95>='[' && LA30_95<='`')||LA30_95=='|'||(LA30_95>='~' && LA30_95<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_95=='\t'||LA30_95==' '||LA30_95=='\"'||(LA30_95>='\'' && LA30_95<=')')||LA30_95==','||LA30_95==':'||LA30_95=='='||LA30_95=='{'||LA30_95=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 151;

                         
                        input.seek(index30_95);
                        if ( s>=0 ) return s;
                        break;
                    case 108 : 
                        int LA30_118 = input.LA(1);

                         
                        int index30_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_118=='E'||LA30_118=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 119;}

                        else if ( (LA30_118=='D'||LA30_118=='F'||LA30_118=='d'||LA30_118=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 120;}

                        else if ( ((LA30_118>='0' && LA30_118<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 118;}

                        else if ( ((LA30_118>='\u0000' && LA30_118<='\t')||(LA30_118>='\u000B' && LA30_118<='/')||(LA30_118>=':' && LA30_118<='C')||(LA30_118>='G' && LA30_118<='c')||(LA30_118>='g' && LA30_118<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 157;

                         
                        input.seek(index30_118);
                        if ( s>=0 ) return s;
                        break;
                    case 109 : 
                        int LA30_164 = input.LA(1);

                         
                        int index30_164 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_164>='\u0000' && LA30_164<='\t')||(LA30_164>='\u000B' && LA30_164<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 178;

                         
                        input.seek(index30_164);
                        if ( s>=0 ) return s;
                        break;
                    case 110 : 
                        int LA30_22 = input.LA(1);

                         
                        int index30_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_22>='\u0000' && LA30_22<='\t')||(LA30_22>='\u000B' && LA30_22<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 76;

                         
                        input.seek(index30_22);
                        if ( s>=0 ) return s;
                        break;
                    case 111 : 
                        int LA30_113 = input.LA(1);

                         
                        int index30_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_113=='L'||LA30_113=='l') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 156;}

                        else if ( ((LA30_113>='0' && LA30_113<='9')||(LA30_113>='A' && LA30_113<='F')||(LA30_113>='a' && LA30_113<='f')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 113;}

                        else if ( ((LA30_113>='\u0000' && LA30_113<='\t')||(LA30_113>='\u000B' && LA30_113<='/')||(LA30_113>=':' && LA30_113<='@')||(LA30_113>='G' && LA30_113<='K')||(LA30_113>='M' && LA30_113<='`')||(LA30_113>='g' && LA30_113<='k')||(LA30_113>='m' && LA30_113<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 155;

                         
                        input.seek(index30_113);
                        if ( s>=0 ) return s;
                        break;
                    case 112 : 
                        int LA30_169 = input.LA(1);

                         
                        int index30_169 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_169>='A' && LA30_169<='Z')||(LA30_169>='a' && LA30_169<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_169>='0' && LA30_169<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_169>='\u0000' && LA30_169<='\b')||(LA30_169>='\u000B' && LA30_169<='\u001F')||LA30_169=='!'||(LA30_169>='#' && LA30_169<='&')||(LA30_169>='*' && LA30_169<='+')||(LA30_169>='-' && LA30_169<='/')||(LA30_169>=';' && LA30_169<='<')||(LA30_169>='>' && LA30_169<='@')||(LA30_169>='[' && LA30_169<='`')||LA30_169=='|'||(LA30_169>='~' && LA30_169<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_169=='\t'||LA30_169==' '||LA30_169=='\"'||(LA30_169>='\'' && LA30_169<=')')||LA30_169==','||LA30_169==':'||LA30_169=='='||LA30_169=='{'||LA30_169=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 181;

                         
                        input.seek(index30_169);
                        if ( s>=0 ) return s;
                        break;
                    case 113 : 
                        int LA30_160 = input.LA(1);

                         
                        int index30_160 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_160=='D'||LA30_160=='F'||LA30_160=='d'||LA30_160=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 120;}

                        else if ( ((LA30_160>='0' && LA30_160<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 160;}

                        else if ( ((LA30_160>='\u0000' && LA30_160<='\t')||(LA30_160>='\u000B' && LA30_160<='/')||(LA30_160>=':' && LA30_160<='C')||LA30_160=='E'||(LA30_160>='G' && LA30_160<='c')||LA30_160=='e'||(LA30_160>='g' && LA30_160<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 177;

                         
                        input.seek(index30_160);
                        if ( s>=0 ) return s;
                        break;
                    case 114 : 
                        int LA30_50 = input.LA(1);

                         
                        int index30_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_50>='\u0000' && LA30_50<='\t')||(LA30_50>='\u000B' && LA30_50<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 115;

                         
                        input.seek(index30_50);
                        if ( s>=0 ) return s;
                        break;
                    case 115 : 
                        int LA30_109 = input.LA(1);

                         
                        int index30_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.BEGINNING )) ) {s = 106;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 107;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_109);
                        if ( s>=0 ) return s;
                        break;
                    case 116 : 
                        int LA30_120 = input.LA(1);

                         
                        int index30_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_120>='\u0000' && LA30_120<='\t')||(LA30_120>='\u000B' && LA30_120<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 161;

                         
                        input.seek(index30_120);
                        if ( s>=0 ) return s;
                        break;
                    case 117 : 
                        int LA30_180 = input.LA(1);

                         
                        int index30_180 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_180);
                        if ( s>=0 ) return s;
                        break;
                    case 118 : 
                        int LA30_170 = input.LA(1);

                         
                        int index30_170 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_170);
                        if ( s>=0 ) return s;
                        break;
                    case 119 : 
                        int LA30_168 = input.LA(1);

                         
                        int index30_168 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_168);
                        if ( s>=0 ) return s;
                        break;
                    case 120 : 
                        int LA30_151 = input.LA(1);

                         
                        int index30_151 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_151);
                        if ( s>=0 ) return s;
                        break;
                    case 121 : 
                        int LA30_132 = input.LA(1);

                         
                        int index30_132 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_132);
                        if ( s>=0 ) return s;
                        break;
                    case 122 : 
                        int LA30_130 = input.LA(1);

                         
                        int index30_130 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_130);
                        if ( s>=0 ) return s;
                        break;
                    case 123 : 
                        int LA30_98 = input.LA(1);

                         
                        int index30_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_98);
                        if ( s>=0 ) return s;
                        break;
                    case 124 : 
                        int LA30_96 = input.LA(1);

                         
                        int index30_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION )) ) {s = 97;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_96);
                        if ( s>=0 ) return s;
                        break;
                    case 125 : 
                        int LA30_38 = input.LA(1);

                         
                        int index30_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_38>='0' && LA30_38<='9')||(LA30_38>='A' && LA30_38<='Z')||(LA30_38>='a' && LA30_38<='z')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_38>='\u0000' && LA30_38<='\t')||(LA30_38>='\u000B' && LA30_38<='/')||(LA30_38>=':' && LA30_38<='@')||(LA30_38>='[' && LA30_38<='`')||(LA30_38>='{' && LA30_38<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 99;

                         
                        input.seek(index30_38);
                        if ( s>=0 ) return s;
                        break;
                    case 126 : 
                        int LA30_133 = input.LA(1);

                         
                        int index30_133 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_133=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 67;}

                        else if ( (LA30_133=='\\') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 65;}

                        else if ( ((LA30_133>='\u0000' && LA30_133<='\t')||(LA30_133>='\u000B' && LA30_133<='&')||(LA30_133>='(' && LA30_133<='[')||(LA30_133>=']' && LA30_133<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 66;}

                        else if ( (LA30_133=='\n') && (( lineMode == EMode.ATTRIBUTE_HASH ))) {s = 68;}

                        else s = 171;

                         
                        input.seek(index30_133);
                        if ( s>=0 ) return s;
                        break;
                    case 127 : 
                        int LA30_28 = input.LA(1);

                         
                        int index30_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {s = 84;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_28);
                        if ( s>=0 ) return s;
                        break;
                    case 128 : 
                        int LA30_29 = input.LA(1);

                         
                        int index30_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {s = 85;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_29);
                        if ( s>=0 ) return s;
                        break;
                    case 129 : 
                        int LA30_46 = input.LA(1);

                         
                        int index30_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.BEGINNING )) ) {s = 106;}

                        else if ( (( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )) ) {s = 107;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 108;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_46);
                        if ( s>=0 ) return s;
                        break;
                    case 130 : 
                        int LA30_25 = input.LA(1);

                         
                        int index30_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)) ) {s = 79;}

                        else if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_25);
                        if ( s>=0 ) return s;
                        break;
                    case 131 : 
                        int LA30_39 = input.LA(1);

                         
                        int index30_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_39>='0' && LA30_39<='9')||(LA30_39>='A' && LA30_39<='Z')||(LA30_39>='a' && LA30_39<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 100;}

                        else if ( ((LA30_39>='\u0000' && LA30_39<='\t')||(LA30_39>='\u000B' && LA30_39<='/')||(LA30_39>=':' && LA30_39<='@')||(LA30_39>='[' && LA30_39<='`')||(LA30_39>='{' && LA30_39<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 101;

                         
                        input.seek(index30_39);
                        if ( s>=0 ) return s;
                        break;
                    case 132 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0=='%') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 1;}

                        else if ( (LA30_0=='#') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)))) {s = 2;}

                        else if ( (LA30_0=='.') && ((( lineMode == EMode.ATTRIBUTE_HASH )||(lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION)||( lineMode == EMode.TEXT )))) {s = 3;}

                        else if ( (LA30_0=='/') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH)||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 4;}

                        else if ( (LA30_0==',') && ((( lineMode == EMode.ATTRIBUTE_HASH && parenDepth > 0)||( lineMode == EMode.ATTRIBUTE_HASH && parenDepth <= 0)||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 5;}

                        else if ( (LA30_0=='t') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 6;}

                        else if ( (LA30_0==':') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 7;}

                        else if ( (LA30_0=='=') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 8;}

                        else if ( (LA30_0=='-') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 9;}

                        else if ( (LA30_0=='\t'||LA30_0==' ') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 10;}

                        else if ( (LA30_0=='\n') ) {s = 11;}

                        else if ( (LA30_0=='0') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 12;}

                        else if ( ((LA30_0>='1' && LA30_0<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 13;}

                        else if ( (LA30_0=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 14;}

                        else if ( (LA30_0=='n') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 15;}

                        else if ( ((LA30_0>='A' && LA30_0<='Z')||(LA30_0>='a' && LA30_0<='e')||(LA30_0>='g' && LA30_0<='m')||(LA30_0>='o' && LA30_0<='s')||(LA30_0>='u' && LA30_0<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 16;}

                        else if ( (LA30_0=='\'') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 17;}

                        else if ( (LA30_0=='\"') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 18;}

                        else if ( (LA30_0=='{') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 19;}

                        else if ( ((LA30_0>='\u0000' && LA30_0<='\b')||(LA30_0>='\u000B' && LA30_0<='\u001F')||LA30_0=='!'||LA30_0=='$'||LA30_0=='&'||(LA30_0>='*' && LA30_0<='+')||(LA30_0>=';' && LA30_0<='<')||(LA30_0>='>' && LA30_0<='@')||(LA30_0>='[' && LA30_0<='`')||LA30_0=='|'||(LA30_0>='~' && LA30_0<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 20;}

                        else if ( (LA30_0=='}') && ((( lineMode == EMode.TEXT )||( braceDepth > 1 )||( lineMode == EMode.BEGINNING )||( lineMode == EMode.ATTRIBUTE_HASH && braceDepth == 1 )))) {s = 22;}

                        else if ( (LA30_0=='(') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 23;}

                        else if ( (LA30_0==')') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 24;}

                        else s = 21;

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
                    case 133 : 
                        int LA30_105 = input.LA(1);

                         
                        int index30_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_105);
                        if ( s>=0 ) return s;
                        break;
                    case 134 : 
                        int LA30_102 = input.LA(1);

                         
                        int index30_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 154;}

                        else if ( ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                         
                        input.seek(index30_102);
                        if ( s>=0 ) return s;
                        break;
                    case 135 : 
                        int LA30_41 = input.LA(1);

                         
                        int index30_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_41>='\u0000' && LA30_41<='\t')||(LA30_41>='\u000B' && LA30_41<='\uFFFF')) && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 43;}

                        else s = 102;

                         
                        input.seek(index30_41);
                        if ( s>=0 ) return s;
                        break;
                    case 136 : 
                        int LA30_75 = input.LA(1);

                         
                        int index30_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 80;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_75);
                        if ( s>=0 ) return s;
                        break;
                    case 137 : 
                        int LA30_49 = input.LA(1);

                         
                        int index30_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_49>='0' && LA30_49<='9')||(LA30_49>='A' && LA30_49<='F')||(LA30_49>='a' && LA30_49<='f')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 113;}

                        else if ( ((LA30_49>='\u0000' && LA30_49<='\t')||(LA30_49>='\u000B' && LA30_49<='/')||(LA30_49>=':' && LA30_49<='@')||(LA30_49>='G' && LA30_49<='`')||(LA30_49>='g' && LA30_49<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 114;

                         
                        input.seek(index30_49);
                        if ( s>=0 ) return s;
                        break;
                    case 138 : 
                        int LA30_122 = input.LA(1);

                         
                        int index30_122 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_122=='D'||LA30_122=='F'||LA30_122=='d'||LA30_122=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 164;}

                        else if ( ((LA30_122>='0' && LA30_122<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 122;}

                        else if ( ((LA30_122>='\u0000' && LA30_122<='\t')||(LA30_122>='\u000B' && LA30_122<='/')||(LA30_122>=':' && LA30_122<='C')||LA30_122=='E'||(LA30_122>='G' && LA30_122<='c')||LA30_122=='e'||(LA30_122>='g' && LA30_122<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 163;

                         
                        input.seek(index30_122);
                        if ( s>=0 ) return s;
                        break;
                    case 139 : 
                        int LA30_150 = input.LA(1);

                         
                        int index30_150 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_150>='A' && LA30_150<='Z')||(LA30_150>='a' && LA30_150<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_150>='0' && LA30_150<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_150>='\u0000' && LA30_150<='\b')||(LA30_150>='\u000B' && LA30_150<='\u001F')||LA30_150=='!'||(LA30_150>='#' && LA30_150<='&')||(LA30_150>='*' && LA30_150<='+')||(LA30_150>='-' && LA30_150<='/')||(LA30_150>=';' && LA30_150<='<')||(LA30_150>='>' && LA30_150<='@')||(LA30_150>='[' && LA30_150<='`')||LA30_150=='|'||(LA30_150>='~' && LA30_150<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_150=='\t'||LA30_150==' '||LA30_150=='\"'||(LA30_150>='\'' && LA30_150<=')')||LA30_150==','||LA30_150==':'||LA30_150=='='||LA30_150=='{'||LA30_150=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 173;

                         
                        input.seek(index30_150);
                        if ( s>=0 ) return s;
                        break;
                    case 140 : 
                        int LA30_119 = input.LA(1);

                         
                        int index30_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_119=='+'||LA30_119=='-') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 159;}

                        else if ( ((LA30_119>='0' && LA30_119<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 160;}

                        else if ( ((LA30_119>='\u0000' && LA30_119<='\t')||(LA30_119>='\u000B' && LA30_119<='*')||LA30_119==','||(LA30_119>='.' && LA30_119<='/')||(LA30_119>=':' && LA30_119<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 158;

                         
                        input.seek(index30_119);
                        if ( s>=0 ) return s;
                        break;
                    case 141 : 
                        int LA30_53 = input.LA(1);

                         
                        int index30_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_53=='+'||LA30_53=='-') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 121;}

                        else if ( ((LA30_53>='0' && LA30_53<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 122;}

                        else if ( ((LA30_53>='\u0000' && LA30_53<='\t')||(LA30_53>='\u000B' && LA30_53<='*')||LA30_53==','||(LA30_53>='.' && LA30_53<='/')||(LA30_53>=':' && LA30_53<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 123;

                         
                        input.seek(index30_53);
                        if ( s>=0 ) return s;
                        break;
                    case 142 : 
                        int LA30_27 = input.LA(1);

                         
                        int index30_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_27>='\u0000' && LA30_27<='\t')||(LA30_27>='\u000B' && LA30_27<='\uFFFF')) && (( lineMode == EMode.TEXT ))) {s = 27;}

                        else s = 83;

                         
                        input.seek(index30_27);
                        if ( s>=0 ) return s;
                        break;
                    case 143 : 
                        int LA30_51 = input.LA(1);

                         
                        int index30_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 116;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_51);
                        if ( s>=0 ) return s;
                        break;
                    case 144 : 
                        int LA30_58 = input.LA(1);

                         
                        int index30_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( lineMode == EMode.ATTRIBUTE_HASH )) ) {s = 116;}

                        else if ( ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING ))) ) {s = 21;}

                        else if ( (( lineMode == EMode.TEXT )) ) {s = 81;}

                        else if ( (( lineMode == EMode.BEGINNING )) ) {s = 90;}

                         
                        input.seek(index30_58);
                        if ( s>=0 ) return s;
                        break;
                    case 145 : 
                        int LA30_156 = input.LA(1);

                         
                        int index30_156 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_156>='\u0000' && LA30_156<='\t')||(LA30_156>='\u000B' && LA30_156<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 175;

                         
                        input.seek(index30_156);
                        if ( s>=0 ) return s;
                        break;
                    case 146 : 
                        int LA30_52 = input.LA(1);

                         
                        int index30_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_52>='0' && LA30_52<='9')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 118;}

                        else if ( (LA30_52=='E'||LA30_52=='e') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 119;}

                        else if ( (LA30_52=='D'||LA30_52=='F'||LA30_52=='d'||LA30_52=='f') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 120;}

                        else if ( ((LA30_52>='\u0000' && LA30_52<='\t')||(LA30_52>='\u000B' && LA30_52<='/')||(LA30_52>=':' && LA30_52<='C')||(LA30_52>='G' && LA30_52<='c')||(LA30_52>='g' && LA30_52<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 117;

                         
                        input.seek(index30_52);
                        if ( s>=0 ) return s;
                        break;
                    case 147 : 
                        int LA30_179 = input.LA(1);

                         
                        int index30_179 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_179>='A' && LA30_179<='Z')||(LA30_179>='a' && LA30_179<='z')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 37;}

                        else if ( ((LA30_179>='0' && LA30_179<='9')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.ELEMENT_DECLARATION )||( lineMode == EMode.BEGINNING )))) {s = 38;}

                        else if ( ((LA30_179>='\u0000' && LA30_179<='\b')||(LA30_179>='\u000B' && LA30_179<='\u001F')||LA30_179=='!'||(LA30_179>='#' && LA30_179<='&')||(LA30_179>='*' && LA30_179<='+')||(LA30_179>='-' && LA30_179<='/')||(LA30_179>=';' && LA30_179<='<')||(LA30_179>='>' && LA30_179<='@')||(LA30_179>='[' && LA30_179<='`')||LA30_179=='|'||(LA30_179>='~' && LA30_179<='\uFFFF')) && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 32;}

                        else if ( (LA30_179=='\t'||LA30_179==' '||LA30_179=='\"'||(LA30_179>='\'' && LA30_179<=')')||LA30_179==','||LA30_179==':'||LA30_179=='='||LA30_179=='{'||LA30_179=='}') && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 183;

                         
                        input.seek(index30_179);
                        if ( s>=0 ) return s;
                        break;
                    case 148 : 
                        int LA30_8 = input.LA(1);

                         
                        int index30_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_8=='>') && ((( lineMode == EMode.ATTRIBUTE_HASH )||( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 41;}

                        else if ( ((LA30_8>='\u0000' && LA30_8<='\t')||(LA30_8>='\u000B' && LA30_8<='=')||(LA30_8>='?' && LA30_8<='\uFFFF')) && ((( lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH )||( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 43;}

                        else s = 42;

                         
                        input.seek(index30_8);
                        if ( s>=0 ) return s;
                        break;
                    case 149 : 
                        int LA30_33 = input.LA(1);

                         
                        int index30_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA30_33>='\u0000' && LA30_33<='\t')||(LA30_33>='\u000B' && LA30_33<='\uFFFF')) && ((( lineMode == EMode.TEXT )||( lineMode == EMode.BEGINNING )))) {s = 33;}

                        else s = 92;

                         
                        input.seek(index30_33);
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