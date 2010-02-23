// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-23 12:38:01

package com.cadrlife.jaml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JamlLexer extends Lexer {
    public static final int T__28=28;
    public static final int PERCENT=8;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int POUND=14;
    public static final int END_HASH=12;
    public static final int CHANGE_INDENT=20;
    public static final int SpacesQ=21;
    public static final int DEDENT=5;
    public static final int INT=16;
    public static final int TEXT=7;
    public static final int ID=9;
    public static final int EOF=-1;
    public static final int HexDigit=25;
    public static final int BEGIN_HASH=10;
    public static final int INDENT=4;
    public static final int StringLiteral=13;
    public static final int WS=18;
    public static final int NEWLINE=6;
    public static final int COMMA=11;
    public static final int Spaces=17;
    public static final int UnicodeEscape=23;
    public static final int NL=19;
    public static final int DOT=15;
    public static final int EscapeSequence=22;
    public static final int OctalEscape=24;

    int currentIndentation = 0;
    boolean textMode = true;
    boolean hashMode = false;
    boolean beginningOfLine = true;


    // delegates
    // delegators

    public JamlLexer() {;} 
    public JamlLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JamlLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../etc/Jaml.g"; }

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
    traceIn("T__26", 1);
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:13:7: ( ':' )
            // ../etc/Jaml.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("T__26", 1);
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
    traceIn("T__27", 2);
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:14:7: ( '=' )
            // ../etc/Jaml.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("T__27", 2);
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
    traceIn("T__28", 3);
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:15:7: ( '>' )
            // ../etc/Jaml.g:15:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("T__28", 3);
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "POUND"
    public final void mPOUND() throws RecognitionException {
    traceIn("POUND", 4);
        try {
            int _type = POUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:95:6: ({...}? => '#' )
            // ../etc/Jaml.g:95:8: {...}? => '#'
            {
            if ( !(( beginningOfLine )) ) {
                throw new FailedPredicateException(input, "POUND", " beginningOfLine ");
            }
            match('#'); 
            textMode = false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("POUND", 4);
        }
    }
    // $ANTLR end "POUND"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
    traceIn("DOT", 5);
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:96:4: ({...}? => '.' )
            // ../etc/Jaml.g:96:6: {...}? => '.'
            {
            if ( !(( beginningOfLine )) ) {
                throw new FailedPredicateException(input, "DOT", " beginningOfLine ");
            }
            match('.'); 
            textMode = false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("DOT", 5);
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
    traceIn("PERCENT", 6);
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:97:8: ({...}? => '%' )
            // ../etc/Jaml.g:97:10: {...}? => '%'
            {
            if ( !(( beginningOfLine )) ) {
                throw new FailedPredicateException(input, "PERCENT", " beginningOfLine ");
            }
            match('%'); 
            textMode = false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("PERCENT", 6);
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
    traceIn("COMMA", 7);
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:98:6: ({...}? => ',' )
            // ../etc/Jaml.g:98:8: {...}? => ','
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "COMMA", " !textMode ");
            }
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("COMMA", 7);
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
    traceIn("ID", 8);
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:99:5: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // ../etc/Jaml.g:99:7: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "ID", " !textMode ");
            }
            // ../etc/Jaml.g:99:24: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../etc/Jaml.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    traceOut("ID", 8);
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
    traceIn("INT", 9);
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:100:5: ({...}? => ( '0' .. '9' )+ )
            // ../etc/Jaml.g:100:7: {...}? => ( '0' .. '9' )+
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "INT", " !textMode ");
            }
            // ../etc/Jaml.g:100:25: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../etc/Jaml.g:100:25: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("INT", 9);
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "BEGIN_HASH"
    public final void mBEGIN_HASH() throws RecognitionException {
    traceIn("BEGIN_HASH", 10);
        try {
            int _type = BEGIN_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:103:11: ({...}? => '{' )
            // ../etc/Jaml.g:103:13: {...}? => '{'
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "BEGIN_HASH", " !textMode ");
            }
            match('{'); 
            hashMode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("BEGIN_HASH", 10);
        }
    }
    // $ANTLR end "BEGIN_HASH"

    // $ANTLR start "END_HASH"
    public final void mEND_HASH() throws RecognitionException {
    traceIn("END_HASH", 11);
        try {
            int _type = END_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:106:9: ({...}? => '}' )
            // ../etc/Jaml.g:106:11: {...}? => '}'
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "END_HASH", " hashMode ");
            }
            match('}'); 
            hashMode = false; textMode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("END_HASH", 11);
        }
    }
    // $ANTLR end "END_HASH"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
    traceIn("WS", 12);
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:109:5: ({...}? => Spaces )
            // ../etc/Jaml.g:109:7: {...}? => Spaces
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "WS", " !textMode ");
            }
            mSpaces(); 
            skip(); if (!hashMode ) textMode=true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("WS", 12);
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "CHANGE_INDENT"
    public final void mCHANGE_INDENT() throws RecognitionException {
    traceIn("CHANGE_INDENT", 13);
        try {
            int _type = CHANGE_INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             int tb = 0; 
            // ../etc/Jaml.g:114:3: ( ( NL ) ( ' ' )* )
            // ../etc/Jaml.g:114:4: ( NL ) ( ' ' )*
            {
            // ../etc/Jaml.g:114:4: ( NL )
            // ../etc/Jaml.g:114:5: NL
            {
            mNL(); 

            }

            // ../etc/Jaml.g:114:9: ( ' ' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../etc/Jaml.g:114:10: ' '
            	    {
            	    match(' '); 
            	    tb++;

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


                      if(tb > currentIndentation) {
                          emit(new CommonToken(INDENT));
                          System.out.println("INDENT");
                      }else if(tb < currentIndentation) {
                          for(int i = 0; i < currentIndentation - tb; i++) {
                              emit(new CommonToken(DEDENT));
                          System.out.println("DEDENT");
                          }
                      }else {
                            emit(new CommonToken(NEWLINE));
                          System.out.println("NEWLINE");
                          //skip();
                      }
                      currentIndentation = tb;
                  

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("CHANGE_INDENT", 13);
        }
    }
    // $ANTLR end "CHANGE_INDENT"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
    traceIn("NL", 14);
        try {
            // ../etc/Jaml.g:131:3: ( ( '\\r' )? '\\n' )
            // ../etc/Jaml.g:131:5: ( '\\r' )? '\\n'
            {
            // ../etc/Jaml.g:131:5: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../etc/Jaml.g:131:5: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

        }
        finally {
    traceOut("NL", 14);
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "SpacesQ"
    public final void mSpacesQ() throws RecognitionException {
    traceIn("SpacesQ", 15);
        try {
            // ../etc/Jaml.g:133:17: ( ( ' ' )* )
            // ../etc/Jaml.g:133:19: ( ' ' )*
            {
            // ../etc/Jaml.g:133:19: ( ' ' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../etc/Jaml.g:133:20: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

        }
        finally {
    traceOut("SpacesQ", 15);
        }
    }
    // $ANTLR end "SpacesQ"

    // $ANTLR start "Spaces"
    public final void mSpaces() throws RecognitionException {
    traceIn("Spaces", 16);
        try {
            // ../etc/Jaml.g:134:16: ( ( ' ' )+ )
            // ../etc/Jaml.g:134:18: ( ' ' )+
            {
            // ../etc/Jaml.g:134:18: ( ' ' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==' ') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../etc/Jaml.g:134:19: ' '
            	    {
            	    match(' '); 

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


            }

        }
        finally {
    traceOut("Spaces", 16);
        }
    }
    // $ANTLR end "Spaces"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
    traceIn("StringLiteral", 17);
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:136:14: ({...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // ../etc/Jaml.g:136:16: {...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "StringLiteral", " !textMode ");
            }
            match('\"'); 
            // ../etc/Jaml.g:137:9: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // ../etc/Jaml.g:137:11: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:137:28: ~ ( '\\\\' | '\"' )
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
            	    break loop7;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("StringLiteral", 17);
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
    traceIn("EscapeSequence", 18);
        try {
            // ../etc/Jaml.g:142:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt8=3;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt8=1;
                    }
                    break;
                case 'u':
                    {
                    alt8=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt8=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../etc/Jaml.g:142:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:143:7: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:144:7: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
    traceOut("EscapeSequence", 18);
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
    traceIn("OctalEscape", 19);
        try {
            // ../etc/Jaml.g:149:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>='0' && LA9_1<='3')) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>='0' && LA9_2<='7')) ) {
                        int LA9_4 = input.LA(4);

                        if ( ((LA9_4>='0' && LA9_4<='7')) ) {
                            alt9=1;
                        }
                        else {
                            alt9=2;}
                    }
                    else {
                        alt9=3;}
                }
                else if ( ((LA9_1>='4' && LA9_1<='7')) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3>='0' && LA9_3<='7')) ) {
                        alt9=2;
                    }
                    else {
                        alt9=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../etc/Jaml.g:149:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:149:12: ( '0' .. '3' )
                    // ../etc/Jaml.g:149:13: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ../etc/Jaml.g:149:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:149:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:149:34: ( '0' .. '7' )
                    // ../etc/Jaml.g:149:35: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:150:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:150:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:150:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:150:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:150:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:151:7: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:151:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:151:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
    traceOut("OctalEscape", 19);
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
    traceIn("UnicodeEscape", 20);
        try {
            // ../etc/Jaml.g:156:3: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // ../etc/Jaml.g:156:7: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
    traceOut("UnicodeEscape", 20);
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
    traceIn("HexDigit", 21);
        try {
            // ../etc/Jaml.g:160:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../etc/Jaml.g:160:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
    traceOut("HexDigit", 21);
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
    traceIn("TEXT", 22);
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:162:5: ({...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' ) ) (~ ( '\\r' | '\\n' ) )* )
            // ../etc/Jaml.g:162:7: {...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' ) ) (~ ( '\\r' | '\\n' ) )*
            {
            if ( !(( textMode )) ) {
                throw new FailedPredicateException(input, "TEXT", " textMode ");
            }
            // ../etc/Jaml.g:163:7: (~ ( '.' | '#' | '%' | '\\r' | '\\n' ) )
            // ../etc/Jaml.g:163:8: ~ ( '.' | '#' | '%' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            // ../etc/Jaml.g:164:7: (~ ( '\\r' | '\\n' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../etc/Jaml.g:164:8: ~ ( '\\r' | '\\n' )
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
            	    break loop10;
                }
            } while (true);

            beginningOfLine=false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("TEXT", 22);
        }
    }
    // $ANTLR end "TEXT"

    public void mTokens() throws RecognitionException {
        // ../etc/Jaml.g:1:8: ( T__26 | T__27 | T__28 | POUND | DOT | PERCENT | COMMA | ID | INT | BEGIN_HASH | END_HASH | WS | CHANGE_INDENT | StringLiteral | TEXT )
        int alt11=15;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../etc/Jaml.g:1:10: T__26
                {
                mT__26(); 

                }
                break;
            case 2 :
                // ../etc/Jaml.g:1:16: T__27
                {
                mT__27(); 

                }
                break;
            case 3 :
                // ../etc/Jaml.g:1:22: T__28
                {
                mT__28(); 

                }
                break;
            case 4 :
                // ../etc/Jaml.g:1:28: POUND
                {
                mPOUND(); 

                }
                break;
            case 5 :
                // ../etc/Jaml.g:1:34: DOT
                {
                mDOT(); 

                }
                break;
            case 6 :
                // ../etc/Jaml.g:1:38: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 7 :
                // ../etc/Jaml.g:1:46: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 8 :
                // ../etc/Jaml.g:1:52: ID
                {
                mID(); 

                }
                break;
            case 9 :
                // ../etc/Jaml.g:1:55: INT
                {
                mINT(); 

                }
                break;
            case 10 :
                // ../etc/Jaml.g:1:59: BEGIN_HASH
                {
                mBEGIN_HASH(); 

                }
                break;
            case 11 :
                // ../etc/Jaml.g:1:70: END_HASH
                {
                mEND_HASH(); 

                }
                break;
            case 12 :
                // ../etc/Jaml.g:1:79: WS
                {
                mWS(); 

                }
                break;
            case 13 :
                // ../etc/Jaml.g:1:82: CHANGE_INDENT
                {
                mCHANGE_INDENT(); 

                }
                break;
            case 14 :
                // ../etc/Jaml.g:1:96: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 15 :
                // ../etc/Jaml.g:1:110: TEXT
                {
                mTEXT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\20\1\21\1\22\3\uffff\1\23\1\24\1\27\1\30\1\31\1\32\1"+
        "\uffff\1\17\6\uffff\1\24\1\27\4\uffff\1\32\2\17\1\55\12\uffff\4"+
        "\17\1\uffff\7\17";
    static final String DFA11_eofS =
        "\65\uffff";
    static final String DFA11_minS =
        "\4\0\3\uffff\6\0\1\uffff\1\0\1\uffff\14\0\1\42\2\0\12\uffff\1\0"+
        "\1\60\3\0\1\60\2\0\1\60\1\0\1\60\1\0";
    static final String DFA11_maxS =
        "\4\uffff\3\uffff\6\uffff\1\uffff\1\uffff\1\uffff\5\0\2\uffff\4\0"+
        "\1\uffff\1\165\2\uffff\12\uffff\1\uffff\1\146\2\uffff\1\0\1\146"+
        "\2\uffff\1\146\1\uffff\1\146\1\uffff";
    static final String DFA11_acceptS =
        "\4\uffff\1\4\1\5\1\6\6\uffff\1\15\1\uffff\1\17\17\uffff\1\16\1\1"+
        "\1\2\1\3\1\7\1\10\1\11\1\12\1\13\1\14\14\uffff";
    static final String DFA11_specialS =
        "\1\11\1\34\1\43\1\41\3\uffff\1\21\1\36\1\1\1\35\1\40\1\3\1\uffff"+
        "\1\26\1\uffff\1\16\1\14\1\17\1\13\1\12\1\22\1\37\1\5\1\4\1\7\1\6"+
        "\1\24\1\33\1\31\1\32\12\uffff\1\10\1\2\1\15\1\20\1\30\1\42\1\25"+
        "\1\27\1\45\1\23\1\44\1\0}>";
    static final String[] DFA11_transitionS = {
            "\12\17\1\15\2\17\1\15\22\17\1\14\1\17\1\16\1\4\1\17\1\6\6\17"+
            "\1\7\1\17\1\5\1\17\12\11\1\1\2\17\1\2\1\3\2\17\32\10\6\17\32"+
            "\10\1\12\1\17\1\13\uff82\17",
            "\12\17\1\uffff\2\17\1\uffff\ufff2\17",
            "\12\17\1\uffff\2\17\1\uffff\ufff2\17",
            "\12\17\1\uffff\2\17\1\uffff\ufff2\17",
            "",
            "",
            "",
            "\12\17\1\uffff\2\17\1\uffff\ufff2\17",
            "\12\17\1\uffff\2\17\1\uffff\63\17\32\25\6\17\32\25\uff85\17",
            "\12\17\1\uffff\2\17\1\uffff\42\17\12\26\uffc6\17",
            "\12\17\1\uffff\2\17\1\uffff\ufff2\17",
            "\12\17\1\uffff\2\17\1\uffff\ufff2\17",
            "\12\17\1\uffff\2\17\1\uffff\22\17\1\33\uffdf\17",
            "",
            "\12\35\1\37\2\35\1\37\24\35\1\36\71\35\1\34\uffa3\35",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\17\1\uffff\2\17\1\uffff\63\17\32\25\6\17\32\25\uff85\17",
            "\12\17\1\uffff\2\17\1\uffff\42\17\12\26\uffc6\17",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\17\1\uffff\2\17\1\uffff\22\17\1\33\uffdf\17",
            "\1\51\4\uffff\1\51\10\uffff\4\53\4\54\44\uffff\1\51\5\uffff"+
            "\1\51\3\uffff\1\51\7\uffff\1\51\3\uffff\1\51\1\uffff\1\51\1"+
            "\52",
            "\12\35\1\37\2\35\1\37\24\35\1\36\71\35\1\34\uffa3\35",
            "\12\17\1\uffff\2\17\1\uffff\ufff2\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\35\1\37\2\35\1\37\24\35\1\36\71\35\1\34\uffa3\35",
            "\12\56\7\uffff\6\56\32\uffff\6\56",
            "\12\35\1\37\2\35\1\37\24\35\1\36\15\35\10\57\44\35\1\34\uffa3"+
            "\35",
            "\12\35\1\37\2\35\1\37\24\35\1\36\15\35\10\60\44\35\1\34\uffa3"+
            "\35",
            "\1\uffff",
            "\12\61\7\uffff\6\61\32\uffff\6\61",
            "\12\35\1\37\2\35\1\37\24\35\1\36\15\35\10\62\44\35\1\34\uffa3"+
            "\35",
            "\12\35\1\37\2\35\1\37\24\35\1\36\71\35\1\34\uffa3\35",
            "\12\63\7\uffff\6\63\32\uffff\6\63",
            "\12\35\1\37\2\35\1\37\24\35\1\36\71\35\1\34\uffa3\35",
            "\12\64\7\uffff\6\64\32\uffff\6\64",
            "\12\35\1\37\2\35\1\37\24\35\1\36\71\35\1\34\uffa3\35"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__26 | T__27 | T__28 | POUND | DOT | PERCENT | COMMA | ID | INT | BEGIN_HASH | END_HASH | WS | CHANGE_INDENT | StringLiteral | TEXT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_52 = input.LA(1);

                         
                        int index11_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_52=='\"') && ((( !textMode )||( textMode )))) {s = 30;}

                        else if ( (LA11_52=='\\') && ((( !textMode )||( textMode )))) {s = 28;}

                        else if ( ((LA11_52>='\u0000' && LA11_52<='\t')||(LA11_52>='\u000B' && LA11_52<='\f')||(LA11_52>='\u000E' && LA11_52<='!')||(LA11_52>='#' && LA11_52<='[')||(LA11_52>=']' && LA11_52<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 29;}

                        else if ( (LA11_52=='\n'||LA11_52=='\r') && (( !textMode ))) {s = 31;}

                        else s = 15;

                         
                        input.seek(index11_52);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_9>='0' && LA11_9<='9')) && ((( !textMode )||( textMode )))) {s = 22;}

                        else if ( ((LA11_9>='\u0000' && LA11_9<='\t')||(LA11_9>='\u000B' && LA11_9<='\f')||(LA11_9>='\u000E' && LA11_9<='/')||(LA11_9>=':' && LA11_9<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 23;

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_42 = input.LA(1);

                         
                        int index11_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_42>='0' && LA11_42<='9')||(LA11_42>='A' && LA11_42<='F')||(LA11_42>='a' && LA11_42<='f')) && ((( !textMode )||( textMode )))) {s = 46;}

                        else s = 15;

                         
                        input.seek(index11_42);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_12==' ') && ((( !textMode )||( textMode )))) {s = 27;}

                        else if ( ((LA11_12>='\u0000' && LA11_12<='\t')||(LA11_12>='\u000B' && LA11_12<='\f')||(LA11_12>='\u000E' && LA11_12<='\u001F')||(LA11_12>='!' && LA11_12<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 26;

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_24 = input.LA(1);

                         
                        int index11_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 38;}

                        else if ( (( textMode )) ) {s = 15;}

                         
                        input.seek(index11_24);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_23 = input.LA(1);

                         
                        int index11_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 37;}

                        else if ( (( textMode )) ) {s = 15;}

                         
                        input.seek(index11_23);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_26 = input.LA(1);

                         
                        int index11_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 40;}

                        else if ( (( textMode )) ) {s = 15;}

                         
                        input.seek(index11_26);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_25 = input.LA(1);

                         
                        int index11_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 39;}

                        else if ( (( textMode )) ) {s = 15;}

                         
                        input.seek(index11_25);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_41 = input.LA(1);

                         
                        int index11_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_41=='\"') && ((( !textMode )||( textMode )))) {s = 30;}

                        else if ( (LA11_41=='\\') && ((( !textMode )||( textMode )))) {s = 28;}

                        else if ( ((LA11_41>='\u0000' && LA11_41<='\t')||(LA11_41>='\u000B' && LA11_41<='\f')||(LA11_41>='\u000E' && LA11_41<='!')||(LA11_41>='#' && LA11_41<='[')||(LA11_41>=']' && LA11_41<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 29;}

                        else if ( (LA11_41=='\n'||LA11_41=='\r') && (( !textMode ))) {s = 31;}

                        else s = 15;

                         
                        input.seek(index11_41);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0==':') ) {s = 1;}

                        else if ( (LA11_0=='=') ) {s = 2;}

                        else if ( (LA11_0=='>') ) {s = 3;}

                        else if ( (LA11_0=='#') && (( beginningOfLine ))) {s = 4;}

                        else if ( (LA11_0=='.') && (( beginningOfLine ))) {s = 5;}

                        else if ( (LA11_0=='%') && (( beginningOfLine ))) {s = 6;}

                        else if ( (LA11_0==',') && ((( !textMode )||( textMode )))) {s = 7;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) && ((( !textMode )||( textMode )))) {s = 8;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) && ((( !textMode )||( textMode )))) {s = 9;}

                        else if ( (LA11_0=='{') && ((( !textMode )||( textMode )))) {s = 10;}

                        else if ( (LA11_0=='}') && ((( textMode )||( hashMode )))) {s = 11;}

                        else if ( (LA11_0==' ') && ((( !textMode )||( textMode )))) {s = 12;}

                        else if ( (LA11_0=='\n'||LA11_0=='\r') ) {s = 13;}

                        else if ( (LA11_0=='\"') && ((( !textMode )||( textMode )))) {s = 14;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||LA11_0=='$'||(LA11_0>='&' && LA11_0<='+')||LA11_0=='-'||LA11_0=='/'||(LA11_0>=';' && LA11_0<='<')||(LA11_0>='?' && LA11_0<='@')||(LA11_0>='[' && LA11_0<='`')||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) && (( textMode ))) {s = 15;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_20 = input.LA(1);

                         
                        int index11_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 36;}

                        else if ( (( textMode )) ) {s = 15;}

                         
                        input.seek(index11_20);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_19 = input.LA(1);

                         
                        int index11_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 35;}

                        else if ( (( textMode )) ) {s = 15;}

                         
                        input.seek(index11_19);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_17 = input.LA(1);

                         
                        int index11_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 33;}

                        else if ( (( textMode )) ) {s = 15;}

                         
                        input.seek(index11_17);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_43 = input.LA(1);

                         
                        int index11_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_43>='0' && LA11_43<='7')) && ((( !textMode )||( textMode )))) {s = 47;}

                        else if ( (LA11_43=='\"') && ((( !textMode )||( textMode )))) {s = 30;}

                        else if ( (LA11_43=='\\') && ((( !textMode )||( textMode )))) {s = 28;}

                        else if ( ((LA11_43>='\u0000' && LA11_43<='\t')||(LA11_43>='\u000B' && LA11_43<='\f')||(LA11_43>='\u000E' && LA11_43<='!')||(LA11_43>='#' && LA11_43<='/')||(LA11_43>='8' && LA11_43<='[')||(LA11_43>=']' && LA11_43<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 29;}

                        else if ( (LA11_43=='\n'||LA11_43=='\r') && (( !textMode ))) {s = 31;}

                        else s = 15;

                         
                        input.seek(index11_43);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 32;}

                        else if ( (( textMode )) ) {s = 15;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_18 = input.LA(1);

                         
                        int index11_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 34;}

                        else if ( (( textMode )) ) {s = 15;}

                         
                        input.seek(index11_18);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_44 = input.LA(1);

                         
                        int index11_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_44>='0' && LA11_44<='7')) && ((( !textMode )||( textMode )))) {s = 48;}

                        else if ( (LA11_44=='\"') && ((( !textMode )||( textMode )))) {s = 30;}

                        else if ( (LA11_44=='\\') && ((( !textMode )||( textMode )))) {s = 28;}

                        else if ( ((LA11_44>='\u0000' && LA11_44<='\t')||(LA11_44>='\u000B' && LA11_44<='\f')||(LA11_44>='\u000E' && LA11_44<='!')||(LA11_44>='#' && LA11_44<='/')||(LA11_44>='8' && LA11_44<='[')||(LA11_44>=']' && LA11_44<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 29;}

                        else if ( (LA11_44=='\n'||LA11_44=='\r') && (( !textMode ))) {s = 31;}

                        else s = 15;

                         
                        input.seek(index11_44);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_7>='\u0000' && LA11_7<='\t')||(LA11_7>='\u000B' && LA11_7<='\f')||(LA11_7>='\u000E' && LA11_7<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 19;

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA11_21 = input.LA(1);

                         
                        int index11_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_21>='A' && LA11_21<='Z')||(LA11_21>='a' && LA11_21<='z')) && ((( !textMode )||( textMode )))) {s = 21;}

                        else if ( ((LA11_21>='\u0000' && LA11_21<='\t')||(LA11_21>='\u000B' && LA11_21<='\f')||(LA11_21>='\u000E' && LA11_21<='@')||(LA11_21>='[' && LA11_21<='`')||(LA11_21>='{' && LA11_21<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 20;

                         
                        input.seek(index11_21);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA11_50 = input.LA(1);

                         
                        int index11_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_50=='\"') && ((( !textMode )||( textMode )))) {s = 30;}

                        else if ( (LA11_50=='\\') && ((( !textMode )||( textMode )))) {s = 28;}

                        else if ( ((LA11_50>='\u0000' && LA11_50<='\t')||(LA11_50>='\u000B' && LA11_50<='\f')||(LA11_50>='\u000E' && LA11_50<='!')||(LA11_50>='#' && LA11_50<='[')||(LA11_50>=']' && LA11_50<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 29;}

                        else if ( (LA11_50=='\n'||LA11_50=='\r') && (( !textMode ))) {s = 31;}

                        else s = 15;

                         
                        input.seek(index11_50);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA11_27 = input.LA(1);

                         
                        int index11_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_27==' ') && ((( !textMode )||( textMode )))) {s = 27;}

                        else if ( ((LA11_27>='\u0000' && LA11_27<='\t')||(LA11_27>='\u000B' && LA11_27<='\f')||(LA11_27>='\u000E' && LA11_27<='\u001F')||(LA11_27>='!' && LA11_27<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 26;

                         
                        input.seek(index11_27);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA11_47 = input.LA(1);

                         
                        int index11_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_47=='\"') && ((( !textMode )||( textMode )))) {s = 30;}

                        else if ( (LA11_47=='\\') && ((( !textMode )||( textMode )))) {s = 28;}

                        else if ( ((LA11_47>='0' && LA11_47<='7')) && ((( !textMode )||( textMode )))) {s = 50;}

                        else if ( (LA11_47=='\n'||LA11_47=='\r') && (( !textMode ))) {s = 31;}

                        else if ( ((LA11_47>='\u0000' && LA11_47<='\t')||(LA11_47>='\u000B' && LA11_47<='\f')||(LA11_47>='\u000E' && LA11_47<='!')||(LA11_47>='#' && LA11_47<='/')||(LA11_47>='8' && LA11_47<='[')||(LA11_47>=']' && LA11_47<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 29;}

                        else s = 15;

                         
                        input.seek(index11_47);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_14=='\\') && ((( !textMode )||( textMode )))) {s = 28;}

                        else if ( ((LA11_14>='\u0000' && LA11_14<='\t')||(LA11_14>='\u000B' && LA11_14<='\f')||(LA11_14>='\u000E' && LA11_14<='!')||(LA11_14>='#' && LA11_14<='[')||(LA11_14>=']' && LA11_14<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 29;}

                        else if ( (LA11_14=='\"') && ((( !textMode )||( textMode )))) {s = 30;}

                        else if ( (LA11_14=='\n'||LA11_14=='\r') && (( !textMode ))) {s = 31;}

                        else s = 15;

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA11_48 = input.LA(1);

                         
                        int index11_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_48=='\"') && ((( !textMode )||( textMode )))) {s = 30;}

                        else if ( (LA11_48=='\\') && ((( !textMode )||( textMode )))) {s = 28;}

                        else if ( ((LA11_48>='\u0000' && LA11_48<='\t')||(LA11_48>='\u000B' && LA11_48<='\f')||(LA11_48>='\u000E' && LA11_48<='!')||(LA11_48>='#' && LA11_48<='[')||(LA11_48>=']' && LA11_48<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 29;}

                        else if ( (LA11_48=='\n'||LA11_48=='\r') && (( !textMode ))) {s = 31;}

                        else s = 15;

                         
                        input.seek(index11_48);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA11_45 = input.LA(1);

                         
                        int index11_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 31;}

                        else if ( (( textMode )) ) {s = 15;}

                         
                        input.seek(index11_45);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA11_29 = input.LA(1);

                         
                        int index11_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_29=='\"') && ((( !textMode )||( textMode )))) {s = 30;}

                        else if ( (LA11_29=='\\') && ((( !textMode )||( textMode )))) {s = 28;}

                        else if ( ((LA11_29>='\u0000' && LA11_29<='\t')||(LA11_29>='\u000B' && LA11_29<='\f')||(LA11_29>='\u000E' && LA11_29<='!')||(LA11_29>='#' && LA11_29<='[')||(LA11_29>=']' && LA11_29<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 29;}

                        else if ( (LA11_29=='\n'||LA11_29=='\r') && (( !textMode ))) {s = 31;}

                        else s = 15;

                         
                        input.seek(index11_29);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA11_30 = input.LA(1);

                         
                        int index11_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_30>='\u0000' && LA11_30<='\t')||(LA11_30>='\u000B' && LA11_30<='\f')||(LA11_30>='\u000E' && LA11_30<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 45;

                         
                        input.seek(index11_30);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA11_28 = input.LA(1);

                         
                        int index11_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_28=='\"'||LA11_28=='\''||LA11_28=='\\'||LA11_28=='b'||LA11_28=='f'||LA11_28=='n'||LA11_28=='r'||LA11_28=='t') && ((( !textMode )||( textMode )))) {s = 41;}

                        else if ( (LA11_28=='u') && ((( !textMode )||( textMode )))) {s = 42;}

                        else if ( ((LA11_28>='0' && LA11_28<='3')) && ((( !textMode )||( textMode )))) {s = 43;}

                        else if ( ((LA11_28>='4' && LA11_28<='7')) && ((( !textMode )||( textMode )))) {s = 44;}

                        else s = 15;

                         
                        input.seek(index11_28);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_1>='\u0000' && LA11_1<='\t')||(LA11_1>='\u000B' && LA11_1<='\f')||(LA11_1>='\u000E' && LA11_1<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 16;

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_10>='\u0000' && LA11_10<='\t')||(LA11_10>='\u000B' && LA11_10<='\f')||(LA11_10>='\u000E' && LA11_10<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 24;

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_8>='A' && LA11_8<='Z')||(LA11_8>='a' && LA11_8<='z')) && ((( !textMode )||( textMode )))) {s = 21;}

                        else if ( ((LA11_8>='\u0000' && LA11_8<='\t')||(LA11_8>='\u000B' && LA11_8<='\f')||(LA11_8>='\u000E' && LA11_8<='@')||(LA11_8>='[' && LA11_8<='`')||(LA11_8>='{' && LA11_8<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 20;

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA11_22 = input.LA(1);

                         
                        int index11_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_22>='0' && LA11_22<='9')) && ((( !textMode )||( textMode )))) {s = 22;}

                        else if ( ((LA11_22>='\u0000' && LA11_22<='\t')||(LA11_22>='\u000B' && LA11_22<='\f')||(LA11_22>='\u000E' && LA11_22<='/')||(LA11_22>=':' && LA11_22<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 23;

                         
                        input.seek(index11_22);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_11>='\u0000' && LA11_11<='\t')||(LA11_11>='\u000B' && LA11_11<='\f')||(LA11_11>='\u000E' && LA11_11<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 25;

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_3>='\u0000' && LA11_3<='\t')||(LA11_3>='\u000B' && LA11_3<='\f')||(LA11_3>='\u000E' && LA11_3<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 18;

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA11_46 = input.LA(1);

                         
                        int index11_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_46>='0' && LA11_46<='9')||(LA11_46>='A' && LA11_46<='F')||(LA11_46>='a' && LA11_46<='f')) && ((( !textMode )||( textMode )))) {s = 49;}

                        else s = 15;

                         
                        input.seek(index11_46);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_2>='\u0000' && LA11_2<='\t')||(LA11_2>='\u000B' && LA11_2<='\f')||(LA11_2>='\u000E' && LA11_2<='\uFFFF')) && (( textMode ))) {s = 15;}

                        else s = 17;

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA11_51 = input.LA(1);

                         
                        int index11_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_51>='0' && LA11_51<='9')||(LA11_51>='A' && LA11_51<='F')||(LA11_51>='a' && LA11_51<='f')) && ((( !textMode )||( textMode )))) {s = 52;}

                        else s = 15;

                         
                        input.seek(index11_51);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA11_49 = input.LA(1);

                         
                        int index11_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_49>='0' && LA11_49<='9')||(LA11_49>='A' && LA11_49<='F')||(LA11_49>='a' && LA11_49<='f')) && ((( !textMode )||( textMode )))) {s = 51;}

                        else s = 15;

                         
                        input.seek(index11_49);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}