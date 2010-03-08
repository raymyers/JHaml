// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-03-07 21:47:45

package com.cadrlife.jaml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all") public class JamlLexer extends Lexer {
    public static final int IGNORED_NEWLINE=19;
    public static final int PERCENT=9;
    public static final int RBRACE=30;
    public static final int POUND=13;
    public static final int END_HASH=12;
    public static final int LBRACE=29;
    public static final int CHANGE_INDENT=20;
    public static final int SpacesQ=21;
    public static final int DEDENT=5;
    public static final int TEXT=8;
    public static final int ID=10;
    public static final int EOF=-1;
    public static final int HexDigit=27;
    public static final int BEGIN_HASH=11;
    public static final int INDENT=4;
    public static final int StringLiteral=23;
    public static final int WS=17;
    public static final int HASH_CONTENTS=28;
    public static final int NEWLINE=6;
    public static final int COMMA=15;
    public static final int Spaces=16;
    public static final int UnicodeEscape=25;
    public static final int CHARLITERAL=24;
    public static final int JAVA_LBRACE=31;
    public static final int NL=18;
    public static final int DOT=14;
    public static final int EscapeSequence=22;
    public static final int OctalEscape=26;
    public static final int FORWARD_SLASH=7;
    public static final int JAVA_RBRACE=32;

    	int currentIndentation = 0;
    	boolean textMode = true;
    	boolean hashMode = false;
    	boolean beginningOfLine = true;
    	int braceDepth = 0;
    	
    	List tokens = new ArrayList();
    	@Override
    	public void emit(Token token) {
    	        state.token = token;
    	    	tokens.add(token);
    	}
    	@Override
    	public Token nextToken() {
    	    	super.nextToken();
    	        if ( tokens.size()==0 ) {
    	            return Token.EOF_TOKEN;
    	        }
    	        return (Token)tokens.remove(0);
    	}


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

    // $ANTLR start "POUND"
    public final void mPOUND() throws RecognitionException {
    traceIn("POUND", 1);
        try {
            int _type = POUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:170:6: ( '#' )
            // ../etc/Jaml.g:170:10: '#'
            {
            match('#'); 
            textMode = false; beginningOfLine=false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("POUND", 1);
        }
    }
    // $ANTLR end "POUND"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
    traceIn("DOT", 2);
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:171:4: ( '.' )
            // ../etc/Jaml.g:171:10: '.'
            {
            match('.'); 
            textMode = false; beginningOfLine=false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("DOT", 2);
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
    traceIn("PERCENT", 3);
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:172:8: ( '%' )
            // ../etc/Jaml.g:172:10: '%'
            {
            match('%'); 
            textMode = false; beginningOfLine=false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("PERCENT", 3);
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "FORWARD_SLASH"
    public final void mFORWARD_SLASH() throws RecognitionException {
    traceIn("FORWARD_SLASH", 4);
        try {
            int _type = FORWARD_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:173:14: ({...}? => '/' )
            // ../etc/Jaml.g:173:16: {...}? => '/'
            {
            if ( !(( !beginningOfLine && !hashMode )) ) {
                throw new FailedPredicateException(input, "FORWARD_SLASH", " !beginningOfLine && !hashMode ");
            }
            match('/'); 

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
            // ../etc/Jaml.g:174:6: ({...}? => ',' )
            // ../etc/Jaml.g:174:8: {...}? => ','
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
    traceOut("COMMA", 5);
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
    traceIn("ID", 6);
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:175:5: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ../etc/Jaml.g:175:7: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "ID", " !textMode ");
            }
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../etc/Jaml.g:176:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../etc/Jaml.g:
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
            	    break loop1;
                }
            } while (true);

            textMode = true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("ID", 6);
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
    traceIn("WS", 7);
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:180:4: ({...}? => Spaces )
            // ../etc/Jaml.g:180:6: {...}? => Spaces
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "WS", " !textMode ");
            }
            mSpaces(); 
            if ( !hashMode ) { _channel = HIDDEN; textMode=true; }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("WS", 7);
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "IGNORED_NEWLINE"
    public final void mIGNORED_NEWLINE() throws RecognitionException {
    traceIn("IGNORED_NEWLINE", 8);
        try {
            int _type = IGNORED_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:183:18: ({...}? => NL )
            // ../etc/Jaml.g:183:20: {...}? => NL
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "IGNORED_NEWLINE", " hashMode ");
            }
            mNL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("IGNORED_NEWLINE", 8);
        }
    }
    // $ANTLR end "IGNORED_NEWLINE"

    // $ANTLR start "CHANGE_INDENT"
    public final void mCHANGE_INDENT() throws RecognitionException {
    traceIn("CHANGE_INDENT", 9);
        try {
            int _type = CHANGE_INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             String spaces = ""; 
            // ../etc/Jaml.g:186:31: ({...}? => ( NL ) ( ' ' )* )
            // ../etc/Jaml.g:186:32: {...}? => ( NL ) ( ' ' )*
            {
            if ( !(( !hashMode )) ) {
                throw new FailedPredicateException(input, "CHANGE_INDENT", " !hashMode ");
            }
            // ../etc/Jaml.g:187:2: ( NL )
            // ../etc/Jaml.g:187:3: NL
            {
            mNL(); 

            }

            // ../etc/Jaml.g:187:7: ( ' ' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../etc/Jaml.g:187:8: ' '
            	    {
            	    match(' '); 
            	    spaces+=" ";

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            	          emit(new CommonToken(NEWLINE, "\n" + spaces));
            	          System.out.println("NEWLINE");
            	          int tb = spaces.length();
            	          System.out.println(tb + "/" + currentIndentation);
            	          if (tb > currentIndentation) {
            	              for(int i = 0; i < tb - currentIndentation; i+=2) {
            		              emit(new CommonToken(INDENT,""));
            		              System.out.println("INDENT");
            	              }
            	          } else if(tb < currentIndentation) {
            	              for(int i = 0; i < currentIndentation - tb; i+=2) {
            	    	          emit(new CommonToken(DEDENT,""));
            		    	      System.out.println("DEDENT");
            	              }
            	          } else {
            	              //skip();
            	          }
            	          currentIndentation = tb;
            	          textMode=true;
            	          beginningOfLine=true;
                  

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("CHANGE_INDENT", 9);
        }
    }
    // $ANTLR end "CHANGE_INDENT"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
    traceIn("NL", 10);
        try {
            // ../etc/Jaml.g:210:3: ( ( '\\r' )? '\\n' )
            // ../etc/Jaml.g:210:5: ( '\\r' )? '\\n'
            {
            // ../etc/Jaml.g:210:5: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../etc/Jaml.g:210:5: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

        }
        finally {
    traceOut("NL", 10);
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "SpacesQ"
    public final void mSpacesQ() throws RecognitionException {
    traceIn("SpacesQ", 11);
        try {
            // ../etc/Jaml.g:212:17: ( ( ' ' )* )
            // ../etc/Jaml.g:212:19: ( ' ' )*
            {
            // ../etc/Jaml.g:212:19: ( ' ' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../etc/Jaml.g:212:20: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

        }
        finally {
    traceOut("SpacesQ", 11);
        }
    }
    // $ANTLR end "SpacesQ"

    // $ANTLR start "Spaces"
    public final void mSpaces() throws RecognitionException {
    traceIn("Spaces", 12);
        try {
            // ../etc/Jaml.g:213:16: ( ( ' ' )+ )
            // ../etc/Jaml.g:213:18: ( ' ' )+
            {
            // ../etc/Jaml.g:213:18: ( ' ' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../etc/Jaml.g:213:19: ' '
            	    {
            	    match(' '); 

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

        }
        finally {
    traceOut("Spaces", 12);
        }
    }
    // $ANTLR end "Spaces"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
    traceIn("StringLiteral", 13);
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:215:14: ({...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // ../etc/Jaml.g:215:16: {...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "StringLiteral", " hashMode ");
            }
            match('\"'); 
            // ../etc/Jaml.g:216:9: ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../etc/Jaml.g:216:11: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:216:28: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("StringLiteral", 13);
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "CHARLITERAL"
    public final void mCHARLITERAL() throws RecognitionException {
    traceIn("CHARLITERAL", 14);
        try {
            int _type = CHARLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:221:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )* '\\'' )
            // ../etc/Jaml.g:221:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )* '\\''
            {
            match('\''); 
            // ../etc/Jaml.g:222:9: ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='\\') ) {
                    alt7=1;
                }
                else if ( ((LA7_0>='\u0000' && LA7_0<='\t')||(LA7_0>='\u000B' && LA7_0<='\f')||(LA7_0>='\u000E' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                    alt7=2;
                }


                switch (alt7) {
            	case 1 :
            	    // ../etc/Jaml.g:222:13: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:223:13: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
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

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("CHARLITERAL", 14);
        }
    }
    // $ANTLR end "CHARLITERAL"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
    traceIn("EscapeSequence", 15);
        try {
            // ../etc/Jaml.g:230:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
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
                    // ../etc/Jaml.g:230:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // ../etc/Jaml.g:231:7: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:232:7: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
    traceOut("EscapeSequence", 15);
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
    traceIn("OctalEscape", 16);
        try {
            // ../etc/Jaml.g:237:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\\') ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>='0' && LA9_1<='3')) ) {
                    int LA9_2 = input.LA(3);

                    if ( ((LA9_2>='0' && LA9_2<='7')) ) {
                        int LA9_5 = input.LA(4);

                        if ( ((LA9_5>='0' && LA9_5<='7')) ) {
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
                    // ../etc/Jaml.g:237:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:237:12: ( '0' .. '3' )
                    // ../etc/Jaml.g:237:13: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ../etc/Jaml.g:237:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:237:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:237:34: ( '0' .. '7' )
                    // ../etc/Jaml.g:237:35: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:238:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:238:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:238:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:238:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:238:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:239:7: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:239:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:239:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
    traceOut("OctalEscape", 16);
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
    traceIn("UnicodeEscape", 17);
        try {
            // ../etc/Jaml.g:244:3: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // ../etc/Jaml.g:244:7: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
    traceOut("UnicodeEscape", 17);
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
    traceIn("HexDigit", 18);
        try {
            // ../etc/Jaml.g:248:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../etc/Jaml.g:248:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
    traceOut("HexDigit", 18);
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
    traceIn("TEXT", 19);
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:250:5: ({...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' | '{' | ' ' ) ) (~ ( '\\r' | '\\n' ) )* )
            // ../etc/Jaml.g:250:7: {...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' | '{' | ' ' ) ) (~ ( '\\r' | '\\n' ) )*
            {
            if ( !(( textMode && !hashMode )) ) {
                throw new FailedPredicateException(input, "TEXT", " textMode && !hashMode ");
            }
            // ../etc/Jaml.g:251:7: (~ ( '.' | '#' | '%' | '\\r' | '\\n' | '{' | ' ' ) )
            // ../etc/Jaml.g:251:8: ~ ( '.' | '#' | '%' | '\\r' | '\\n' | '{' | ' ' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            // ../etc/Jaml.g:252:7: (~ ( '\\r' | '\\n' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../etc/Jaml.g:252:8: ~ ( '\\r' | '\\n' )
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


                    beginningOfLine = false;
                  

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("TEXT", 19);
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "HASH_CONTENTS"
    public final void mHASH_CONTENTS() throws RecognitionException {
    traceIn("HASH_CONTENTS", 20);
        try {
            int _type = HASH_CONTENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:257:14: ({...}? => (~ ( '\"' | '\\'' | '{' | '}' ) ) )
            // ../etc/Jaml.g:257:16: {...}? => (~ ( '\"' | '\\'' | '{' | '}' ) )
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "HASH_CONTENTS", " hashMode ");
            }
            // ../etc/Jaml.g:258:7: (~ ( '\"' | '\\'' | '{' | '}' ) )
            // ../etc/Jaml.g:258:8: ~ ( '\"' | '\\'' | '{' | '}' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("HASH_CONTENTS", 20);
        }
    }
    // $ANTLR end "HASH_CONTENTS"

    // $ANTLR start "BEGIN_HASH"
    public final void mBEGIN_HASH() throws RecognitionException {
    traceIn("BEGIN_HASH", 21);
        try {
            int _type = BEGIN_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:261:13: ({...}? => LBRACE )
            // ../etc/Jaml.g:261:15: {...}? => LBRACE
            {
            if ( !(( textMode && braceDepth == 0 )) ) {
                throw new FailedPredicateException(input, "BEGIN_HASH", " textMode && braceDepth == 0 ");
            }
            mLBRACE(); 
            hashMode=true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("BEGIN_HASH", 21);
        }
    }
    // $ANTLR end "BEGIN_HASH"

    // $ANTLR start "END_HASH"
    public final void mEND_HASH() throws RecognitionException {
    traceIn("END_HASH", 22);
        try {
            int _type = END_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:262:11: ({...}? => RBRACE )
            // ../etc/Jaml.g:262:13: {...}? => RBRACE
            {
            if ( !(( braceDepth == 1 )) ) {
                throw new FailedPredicateException(input, "END_HASH", " braceDepth == 1 ");
            }
            mRBRACE(); 
            hashMode=false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("END_HASH", 22);
        }
    }
    // $ANTLR end "END_HASH"

    // $ANTLR start "JAVA_LBRACE"
    public final void mJAVA_LBRACE() throws RecognitionException {
    traceIn("JAVA_LBRACE", 23);
        try {
            int _type = JAVA_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:264:13: ({...}? => LBRACE )
            // ../etc/Jaml.g:264:15: {...}? => LBRACE
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "JAVA_LBRACE", " hashMode ");
            }
            mLBRACE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("JAVA_LBRACE", 23);
        }
    }
    // $ANTLR end "JAVA_LBRACE"

    // $ANTLR start "JAVA_RBRACE"
    public final void mJAVA_RBRACE() throws RecognitionException {
    traceIn("JAVA_RBRACE", 24);
        try {
            int _type = JAVA_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:265:13: ({...}? => RBRACE )
            // ../etc/Jaml.g:265:15: {...}? => RBRACE
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
    traceOut("JAVA_RBRACE", 24);
        }
    }
    // $ANTLR end "JAVA_RBRACE"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
    traceIn("LBRACE", 25);
        try {
            // ../etc/Jaml.g:267:17: ( '{' )
            // ../etc/Jaml.g:267:19: '{'
            {
            match('{'); 
            braceDepth++;

            }

        }
        finally {
    traceOut("LBRACE", 25);
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
    traceIn("RBRACE", 26);
        try {
            // ../etc/Jaml.g:268:18: ({...}? => '}' )
            // ../etc/Jaml.g:268:20: {...}? => '}'
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "RBRACE", " hashMode ");
            }
            match('}'); 
            braceDepth--;

            }

        }
        finally {
    traceOut("RBRACE", 26);
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
    traceIn("NEWLINE", 27);
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:272:9: ({...}? => ' ' )
            // ../etc/Jaml.g:272:11: {...}? => ' '
            {
            if ( !((false)) ) {
                throw new FailedPredicateException(input, "NEWLINE", "false");
            }
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("NEWLINE", 27);
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "INDENT"
    public final void mINDENT() throws RecognitionException {
    traceIn("INDENT", 28);
        try {
            int _type = INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:273:8: ({...}? => ' ' )
            // ../etc/Jaml.g:273:10: {...}? => ' '
            {
            if ( !((false)) ) {
                throw new FailedPredicateException(input, "INDENT", "false");
            }
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("INDENT", 28);
        }
    }
    // $ANTLR end "INDENT"

    // $ANTLR start "DEDENT"
    public final void mDEDENT() throws RecognitionException {
    traceIn("DEDENT", 29);
        try {
            int _type = DEDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:274:8: ({...}? => ' ' )
            // ../etc/Jaml.g:274:10: {...}? => ' '
            {
            if ( !((false)) ) {
                throw new FailedPredicateException(input, "DEDENT", "false");
            }
            match(' '); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("DEDENT", 29);
        }
    }
    // $ANTLR end "DEDENT"

    public void mTokens() throws RecognitionException {
        // ../etc/Jaml.g:1:8: ( POUND | DOT | PERCENT | FORWARD_SLASH | COMMA | ID | WS | IGNORED_NEWLINE | CHANGE_INDENT | StringLiteral | CHARLITERAL | TEXT | HASH_CONTENTS | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | NEWLINE | INDENT | DEDENT )
        int alt11=20;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../etc/Jaml.g:1:10: POUND
                {
                mPOUND(); 

                }
                break;
            case 2 :
                // ../etc/Jaml.g:1:16: DOT
                {
                mDOT(); 

                }
                break;
            case 3 :
                // ../etc/Jaml.g:1:20: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 4 :
                // ../etc/Jaml.g:1:28: FORWARD_SLASH
                {
                mFORWARD_SLASH(); 

                }
                break;
            case 5 :
                // ../etc/Jaml.g:1:42: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 6 :
                // ../etc/Jaml.g:1:48: ID
                {
                mID(); 

                }
                break;
            case 7 :
                // ../etc/Jaml.g:1:51: WS
                {
                mWS(); 

                }
                break;
            case 8 :
                // ../etc/Jaml.g:1:54: IGNORED_NEWLINE
                {
                mIGNORED_NEWLINE(); 

                }
                break;
            case 9 :
                // ../etc/Jaml.g:1:70: CHANGE_INDENT
                {
                mCHANGE_INDENT(); 

                }
                break;
            case 10 :
                // ../etc/Jaml.g:1:84: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 11 :
                // ../etc/Jaml.g:1:98: CHARLITERAL
                {
                mCHARLITERAL(); 

                }
                break;
            case 12 :
                // ../etc/Jaml.g:1:110: TEXT
                {
                mTEXT(); 

                }
                break;
            case 13 :
                // ../etc/Jaml.g:1:115: HASH_CONTENTS
                {
                mHASH_CONTENTS(); 

                }
                break;
            case 14 :
                // ../etc/Jaml.g:1:129: BEGIN_HASH
                {
                mBEGIN_HASH(); 

                }
                break;
            case 15 :
                // ../etc/Jaml.g:1:140: END_HASH
                {
                mEND_HASH(); 

                }
                break;
            case 16 :
                // ../etc/Jaml.g:1:149: JAVA_LBRACE
                {
                mJAVA_LBRACE(); 

                }
                break;
            case 17 :
                // ../etc/Jaml.g:1:161: JAVA_RBRACE
                {
                mJAVA_RBRACE(); 

                }
                break;
            case 18 :
                // ../etc/Jaml.g:1:173: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 19 :
                // ../etc/Jaml.g:1:181: INDENT
                {
                mINDENT(); 

                }
                break;
            case 20 :
                // ../etc/Jaml.g:1:188: DEDENT
                {
                mDEDENT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\17\1\20\1\21\1\23\1\24\1\26\1\27\1\32\1\33\2\22\1\43"+
        "\1\44\1\45\6\uffff\1\53\3\uffff\1\60\3\uffff\2\22\1\66\2\22\1\73"+
        "\17\uffff\4\22\1\uffff\4\22\5\uffff\3\22\1\uffff\3\22\1\uffff\10"+
        "\22";
    static final String DFA11_eofS =
        "\120\uffff";
    static final String DFA11_minS =
        "\7\0\1\40\1\12\1\40\10\0\1\uffff\5\0\1\uffff\1\40\1\uffff\1\0\1"+
        "\uffff\1\42\2\0\1\42\5\0\5\uffff\1\0\4\uffff\1\0\1\uffff\1\0\1\60"+
        "\4\0\1\60\3\0\4\uffff\1\60\2\0\1\uffff\1\60\2\0\1\uffff\1\60\1\0"+
        "\1\60\1\0\2\60\2\0";
    static final String DFA11_maxS =
        "\1\uffff\3\0\3\uffff\1\40\1\12\1\40\4\uffff\4\0\1\uffff\2\0\1\uffff"+
        "\2\0\1\uffff\1\40\1\uffff\1\0\1\uffff\1\165\2\uffff\1\165\2\uffff"+
        "\3\0\5\uffff\1\0\4\uffff\1\0\1\uffff\1\uffff\1\146\2\uffff\1\0\1"+
        "\uffff\1\146\2\uffff\1\0\4\uffff\1\146\2\uffff\1\uffff\1\146\2\uffff"+
        "\1\uffff\1\146\1\uffff\1\146\1\uffff\2\146\2\uffff";
    static final String DFA11_acceptS =
        "\22\uffff\1\14\5\uffff\1\7\1\uffff\1\15\1\uffff\1\11\11\uffff\1"+
        "\1\1\2\1\3\1\4\1\5\1\uffff\1\6\1\22\1\23\1\24\1\uffff\1\10\12\uffff"+
        "\1\17\1\21\1\16\1\20\3\uffff\1\12\3\uffff\1\13\10\uffff";
    static final String DFA11_specialS =
        "\1\43\3\uffff\1\22\1\27\1\56\1\1\1\53\1\0\1\52\1\70\1\23\1\31\1"+
        "\7\1\10\1\6\1\3\1\uffff\1\15\1\24\1\12\1\21\1\26\1\uffff\1\50\1"+
        "\uffff\1\25\1\uffff\1\36\1\13\1\16\1\47\1\54\1\32\1\64\1\30\1\65"+
        "\5\uffff\1\4\4\uffff\1\2\1\uffff\1\61\1\45\1\63\1\33\1\57\1\67\1"+
        "\46\1\17\1\51\1\60\4\uffff\1\37\1\55\1\11\1\uffff\1\42\1\5\1\66"+
        "\1\uffff\1\40\1\14\1\44\1\34\1\41\1\62\1\35\1\20}>";
    static final String[] DFA11_transitionS = {
            "\12\14\1\11\2\14\1\10\22\14\1\7\1\14\1\12\1\1\1\14\1\3\1\14"+
            "\1\13\4\14\1\5\1\14\1\2\1\4\21\14\32\6\6\14\32\6\1\16\1\14\1"+
            "\15\uff82\14",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\22\1\uffff\2\22\1\uffff\ufff2\22",
            "\12\22\1\uffff\2\22\1\uffff\ufff2\22",
            "\12\22\1\uffff\2\22\1\uffff\42\22\12\25\7\22\32\25\6\22\32"+
            "\25\uff85\22",
            "\1\30",
            "\1\31",
            "\1\34",
            "\12\36\1\uffff\2\36\1\uffff\24\36\1\37\71\36\1\35\uffa3\36",
            "\12\41\1\uffff\2\41\1\uffff\31\41\1\42\64\41\1\40\uffa3\41",
            "\12\22\1\uffff\2\22\1\uffff\ufff2\22",
            "\12\22\1\uffff\2\22\1\uffff\ufff2\22",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\12\22\1\uffff\2\22\1\uffff\42\22\12\25\7\22\32\25\6\22\32"+
            "\25\uff85\22",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\34",
            "",
            "\1\uffff",
            "",
            "\1\62\4\uffff\1\62\10\uffff\4\64\4\65\44\uffff\1\62\5\uffff"+
            "\1\62\3\uffff\1\62\7\uffff\1\62\3\uffff\1\62\1\uffff\1\62\1"+
            "\63",
            "\12\36\1\uffff\2\36\1\uffff\24\36\1\37\71\36\1\35\uffa3\36",
            "\12\22\1\uffff\2\22\1\uffff\ufff2\22",
            "\1\67\4\uffff\1\67\10\uffff\4\71\4\72\44\uffff\1\67\5\uffff"+
            "\1\67\3\uffff\1\67\7\uffff\1\67\3\uffff\1\67\1\uffff\1\67\1"+
            "\70",
            "\12\41\1\uffff\2\41\1\uffff\31\41\1\42\64\41\1\40\uffa3\41",
            "\12\22\1\uffff\2\22\1\uffff\ufff2\22",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\12\36\1\uffff\2\36\1\uffff\24\36\1\37\71\36\1\35\uffa3\36",
            "\12\100\7\uffff\6\100\32\uffff\6\100",
            "\12\36\1\uffff\2\36\1\uffff\24\36\1\37\15\36\10\101\44\36"+
            "\1\35\uffa3\36",
            "\12\36\1\uffff\2\36\1\uffff\24\36\1\37\15\36\10\102\44\36"+
            "\1\35\uffa3\36",
            "\1\uffff",
            "\12\41\1\uffff\2\41\1\uffff\31\41\1\42\64\41\1\40\uffa3\41",
            "\12\104\7\uffff\6\104\32\uffff\6\104",
            "\12\41\1\uffff\2\41\1\uffff\31\41\1\42\10\41\10\105\44\41"+
            "\1\40\uffa3\41",
            "\12\41\1\uffff\2\41\1\uffff\31\41\1\42\10\41\10\106\44\41"+
            "\1\40\uffa3\41",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\12\110\7\uffff\6\110\32\uffff\6\110",
            "\12\36\1\uffff\2\36\1\uffff\24\36\1\37\15\36\10\111\44\36"+
            "\1\35\uffa3\36",
            "\12\36\1\uffff\2\36\1\uffff\24\36\1\37\71\36\1\35\uffa3\36",
            "",
            "\12\112\7\uffff\6\112\32\uffff\6\112",
            "\12\41\1\uffff\2\41\1\uffff\31\41\1\42\10\41\10\113\44\41"+
            "\1\40\uffa3\41",
            "\12\41\1\uffff\2\41\1\uffff\31\41\1\42\64\41\1\40\uffa3\41",
            "",
            "\12\114\7\uffff\6\114\32\uffff\6\114",
            "\12\36\1\uffff\2\36\1\uffff\24\36\1\37\71\36\1\35\uffa3\36",
            "\12\115\7\uffff\6\115\32\uffff\6\115",
            "\12\41\1\uffff\2\41\1\uffff\31\41\1\42\64\41\1\40\uffa3\41",
            "\12\116\7\uffff\6\116\32\uffff\6\116",
            "\12\117\7\uffff\6\117\32\uffff\6\117",
            "\12\36\1\uffff\2\36\1\uffff\24\36\1\37\71\36\1\35\uffa3\36",
            "\12\41\1\uffff\2\41\1\uffff\31\41\1\42\64\41\1\40\uffa3\41"
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
            return "1:1: Tokens : ( POUND | DOT | PERCENT | FORWARD_SLASH | COMMA | ID | WS | IGNORED_NEWLINE | CHANGE_INDENT | StringLiteral | CHARLITERAL | TEXT | HASH_CONTENTS | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | NEWLINE | INDENT | DEDENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_9==' ') && (( !hashMode ))) {s = 28;}

                        else s = 27;

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_7==' ') && (( !textMode ))) {s = 24;}

                        else s = 23;

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_48 = input.LA(1);

                         
                        int index11_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 49;}

                        else if ( (( !hashMode )) ) {s = 28;}

                         
                        input.seek(index11_48);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_17 = input.LA(1);

                         
                        int index11_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( hashMode )))) ) {s = 40;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index11_17);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_43 = input.LA(1);

                         
                        int index11_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 44;}

                        else if ( (( textMode && !hashMode )) ) {s = 18;}

                         
                        input.seek(index11_43);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_69 = input.LA(1);

                         
                        int index11_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_69>='0' && LA11_69<='7')) ) {s = 75;}

                        else if ( (LA11_69=='\'') ) {s = 34;}

                        else if ( (LA11_69=='\\') ) {s = 32;}

                        else if ( ((LA11_69>='\u0000' && LA11_69<='\t')||(LA11_69>='\u000B' && LA11_69<='\f')||(LA11_69>='\u000E' && LA11_69<='&')||(LA11_69>='(' && LA11_69<='/')||(LA11_69>='8' && LA11_69<='[')||(LA11_69>=']' && LA11_69<='\uFFFF')) ) {s = 33;}

                        else s = 18;

                         
                        input.seek(index11_69);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( hashMode )))) ) {s = 39;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        s = 37;

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( hashMode )))) ) {s = 38;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_66 = input.LA(1);

                         
                        int index11_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_66=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else if ( (LA11_66=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 29;}

                        else if ( ((LA11_66>='\u0000' && LA11_66<='\t')||(LA11_66>='\u000B' && LA11_66<='\f')||(LA11_66>='\u000E' && LA11_66<='!')||(LA11_66>='#' && LA11_66<='[')||(LA11_66>=']' && LA11_66<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else s = 18;

                         
                        input.seek(index11_66);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_21 = input.LA(1);

                         
                        int index11_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_21>='0' && LA11_21<='9')||(LA11_21>='A' && LA11_21<='Z')||(LA11_21>='a' && LA11_21<='z')) && ((( !textMode )||( textMode && !hashMode )))) {s = 21;}

                        else if ( ((LA11_21>='\u0000' && LA11_21<='\t')||(LA11_21>='\u000B' && LA11_21<='\f')||(LA11_21>='\u000E' && LA11_21<='/')||(LA11_21>=':' && LA11_21<='@')||(LA11_21>='[' && LA11_21<='`')||(LA11_21>='{' && LA11_21<='\uFFFF')) && (( textMode && !hashMode ))) {s = 18;}

                        else s = 43;

                         
                        input.seek(index11_21);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_30 = input.LA(1);

                         
                        int index11_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_30=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else if ( (LA11_30=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 29;}

                        else if ( ((LA11_30>='\u0000' && LA11_30<='\t')||(LA11_30>='\u000B' && LA11_30<='\f')||(LA11_30>='\u000E' && LA11_30<='!')||(LA11_30>='#' && LA11_30<='[')||(LA11_30>=']' && LA11_30<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else s = 18;

                         
                        input.seek(index11_30);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_73 = input.LA(1);

                         
                        int index11_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_73=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else if ( (LA11_73=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 29;}

                        else if ( ((LA11_73>='\u0000' && LA11_73<='\t')||(LA11_73>='\u000B' && LA11_73<='\f')||(LA11_73>='\u000E' && LA11_73<='!')||(LA11_73>='#' && LA11_73<='[')||(LA11_73>=']' && LA11_73<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else s = 18;

                         
                        input.seek(index11_73);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_19 = input.LA(1);

                         
                        int index11_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !beginningOfLine && !hashMode )) ) {s = 41;}

                        else if ( (( textMode && !hashMode )) ) {s = 18;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index11_19);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_31 = input.LA(1);

                         
                        int index11_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_31>='\u0000' && LA11_31<='\t')||(LA11_31>='\u000B' && LA11_31<='\f')||(LA11_31>='\u000E' && LA11_31<='\uFFFF')) && (( textMode && !hashMode ))) {s = 18;}

                        else s = 54;

                         
                        input.seek(index11_31);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_57 = input.LA(1);

                         
                        int index11_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_57=='\'') ) {s = 34;}

                        else if ( (LA11_57=='\\') ) {s = 32;}

                        else if ( ((LA11_57>='0' && LA11_57<='7')) ) {s = 69;}

                        else if ( ((LA11_57>='\u0000' && LA11_57<='\t')||(LA11_57>='\u000B' && LA11_57<='\f')||(LA11_57>='\u000E' && LA11_57<='&')||(LA11_57>='(' && LA11_57<='/')||(LA11_57>='8' && LA11_57<='[')||(LA11_57>=']' && LA11_57<='\uFFFF')) ) {s = 33;}

                        else s = 18;

                         
                        input.seek(index11_57);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_79 = input.LA(1);

                         
                        int index11_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_79=='\'') ) {s = 34;}

                        else if ( (LA11_79=='\\') ) {s = 32;}

                        else if ( ((LA11_79>='\u0000' && LA11_79<='\t')||(LA11_79>='\u000B' && LA11_79<='\f')||(LA11_79>='\u000E' && LA11_79<='&')||(LA11_79>='(' && LA11_79<='[')||(LA11_79>=']' && LA11_79<='\uFFFF')) ) {s = 33;}

                        else s = 18;

                         
                        input.seek(index11_79);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA11_22 = input.LA(1);

                         
                        int index11_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 44;}

                        else if ( (( textMode && !hashMode )) ) {s = 18;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index11_22);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_4>='\u0000' && LA11_4<='\t')||(LA11_4>='\u000B' && LA11_4<='\f')||(LA11_4>='\u000E' && LA11_4<='\uFFFF')) && (( textMode && !hashMode ))) {s = 18;}

                        else s = 19;

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_12>='\u0000' && LA11_12<='\t')||(LA11_12>='\u000B' && LA11_12<='\f')||(LA11_12>='\u000E' && LA11_12<='\uFFFF')) && (( textMode && !hashMode ))) {s = 18;}

                        else s = 35;

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA11_20 = input.LA(1);

                         
                        int index11_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 42;}

                        else if ( (( textMode && !hashMode )) ) {s = 18;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index11_20);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA11_27 = input.LA(1);

                         
                        int index11_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 49;}

                        else if ( (( !hashMode )) ) {s = 28;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index11_27);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA11_23 = input.LA(1);

                         
                        int index11_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 24;}

                        else if ( (( hashMode )) ) {s = 26;}

                        else if ( ((false)) ) {s = 45;}

                        else if ( ((false)) ) {s = 46;}

                        else if ( ((false)) ) {s = 47;}

                         
                        input.seek(index11_23);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_5>='\u0000' && LA11_5<='\t')||(LA11_5>='\u000B' && LA11_5<='\f')||(LA11_5>='\u000E' && LA11_5<='\uFFFF')) && (( textMode && !hashMode ))) {s = 18;}

                        else s = 20;

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA11_36 = input.LA(1);

                         
                        int index11_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( textMode && !hashMode )) ) {s = 18;}

                        else if ( ((( braceDepth == 1 )&&( hashMode ))) ) {s = 60;}

                        else if ( ((( braceDepth > 1 )&&( hashMode ))) ) {s = 61;}

                         
                        input.seek(index11_36);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA11_13 = input.LA(1);

                         
                        int index11_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_13>='\u0000' && LA11_13<='\t')||(LA11_13>='\u000B' && LA11_13<='\f')||(LA11_13>='\u000E' && LA11_13<='\uFFFF')) && (( textMode && !hashMode ))) {s = 18;}

                        else s = 36;

                         
                        input.seek(index11_13);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA11_34 = input.LA(1);

                         
                        int index11_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_34>='\u0000' && LA11_34<='\t')||(LA11_34>='\u000B' && LA11_34<='\f')||(LA11_34>='\u000E' && LA11_34<='\uFFFF')) && (( textMode && !hashMode ))) {s = 18;}

                        else s = 59;

                         
                        input.seek(index11_34);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA11_53 = input.LA(1);

                         
                        int index11_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_53=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else if ( (LA11_53=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 29;}

                        else if ( ((LA11_53>='0' && LA11_53<='7')) && ((( textMode && !hashMode )||( hashMode )))) {s = 66;}

                        else if ( ((LA11_53>='\u0000' && LA11_53<='\t')||(LA11_53>='\u000B' && LA11_53<='\f')||(LA11_53>='\u000E' && LA11_53<='!')||(LA11_53>='#' && LA11_53<='/')||(LA11_53>='8' && LA11_53<='[')||(LA11_53>=']' && LA11_53<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else s = 18;

                         
                        input.seek(index11_53);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA11_75 = input.LA(1);

                         
                        int index11_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_75=='\'') ) {s = 34;}

                        else if ( (LA11_75=='\\') ) {s = 32;}

                        else if ( ((LA11_75>='\u0000' && LA11_75<='\t')||(LA11_75>='\u000B' && LA11_75<='\f')||(LA11_75>='\u000E' && LA11_75<='&')||(LA11_75>='(' && LA11_75<='[')||(LA11_75>=']' && LA11_75<='\uFFFF')) ) {s = 33;}

                        else s = 18;

                         
                        input.seek(index11_75);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA11_78 = input.LA(1);

                         
                        int index11_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_78=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else if ( (LA11_78=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 29;}

                        else if ( ((LA11_78>='\u0000' && LA11_78<='\t')||(LA11_78>='\u000B' && LA11_78<='\f')||(LA11_78>='\u000E' && LA11_78<='!')||(LA11_78>='#' && LA11_78<='[')||(LA11_78>=']' && LA11_78<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else s = 18;

                         
                        input.seek(index11_78);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA11_29 = input.LA(1);

                         
                        int index11_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_29=='\"'||LA11_29=='\''||LA11_29=='\\'||LA11_29=='b'||LA11_29=='f'||LA11_29=='n'||LA11_29=='r'||LA11_29=='t') && ((( textMode && !hashMode )||( hashMode )))) {s = 50;}

                        else if ( (LA11_29=='u') && ((( textMode && !hashMode )||( hashMode )))) {s = 51;}

                        else if ( ((LA11_29>='0' && LA11_29<='3')) && ((( textMode && !hashMode )||( hashMode )))) {s = 52;}

                        else if ( ((LA11_29>='4' && LA11_29<='7')) && ((( textMode && !hashMode )||( hashMode )))) {s = 53;}

                        else s = 18;

                         
                        input.seek(index11_29);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA11_64 = input.LA(1);

                         
                        int index11_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_64>='0' && LA11_64<='9')||(LA11_64>='A' && LA11_64<='F')||(LA11_64>='a' && LA11_64<='f')) && ((( textMode && !hashMode )||( hashMode )))) {s = 72;}

                        else s = 18;

                         
                        input.seek(index11_64);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA11_72 = input.LA(1);

                         
                        int index11_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_72>='0' && LA11_72<='9')||(LA11_72>='A' && LA11_72<='F')||(LA11_72>='a' && LA11_72<='f')) && ((( textMode && !hashMode )||( hashMode )))) {s = 76;}

                        else s = 18;

                         
                        input.seek(index11_72);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA11_76 = input.LA(1);

                         
                        int index11_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_76>='0' && LA11_76<='9')||(LA11_76>='A' && LA11_76<='F')||(LA11_76>='a' && LA11_76<='f')) && ((( textMode && !hashMode )||( hashMode )))) {s = 78;}

                        else s = 18;

                         
                        input.seek(index11_76);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA11_68 = input.LA(1);

                         
                        int index11_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_68>='0' && LA11_68<='9')||(LA11_68>='A' && LA11_68<='F')||(LA11_68>='a' && LA11_68<='f')) ) {s = 74;}

                        else s = 18;

                         
                        input.seek(index11_68);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA11_0 = input.LA(1);

                         
                        int index11_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_0=='#') ) {s = 1;}

                        else if ( (LA11_0=='.') ) {s = 2;}

                        else if ( (LA11_0=='%') ) {s = 3;}

                        else if ( (LA11_0=='/') && ((( !beginningOfLine && !hashMode )||( textMode && !hashMode )||( hashMode )))) {s = 4;}

                        else if ( (LA11_0==',') && ((( !textMode )||( textMode && !hashMode )||( hashMode )))) {s = 5;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) && ((( !textMode )||( textMode && !hashMode )||( hashMode )))) {s = 6;}

                        else if ( (LA11_0==' ') && ((( !textMode )||(false)||( hashMode )))) {s = 7;}

                        else if ( (LA11_0=='\r') && ((( !hashMode )||( hashMode )))) {s = 8;}

                        else if ( (LA11_0=='\n') && ((( !hashMode )||( hashMode )))) {s = 9;}

                        else if ( (LA11_0=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 10;}

                        else if ( (LA11_0=='\'') ) {s = 11;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||LA11_0=='$'||LA11_0=='&'||(LA11_0>='(' && LA11_0<='+')||LA11_0=='-'||(LA11_0>='0' && LA11_0<='@')||(LA11_0>='[' && LA11_0<='`')||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 12;}

                        else if ( (LA11_0=='}') && (((( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||( textMode && !hashMode )||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))))) {s = 13;}

                        else if ( (LA11_0=='{') && ((( textMode && braceDepth == 0 )||( hashMode )))) {s = 14;}

                         
                        input.seek(index11_0);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA11_74 = input.LA(1);

                         
                        int index11_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_74>='0' && LA11_74<='9')||(LA11_74>='A' && LA11_74<='F')||(LA11_74>='a' && LA11_74<='f')) ) {s = 77;}

                        else s = 18;

                         
                        input.seek(index11_74);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA11_51 = input.LA(1);

                         
                        int index11_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_51>='0' && LA11_51<='9')||(LA11_51>='A' && LA11_51<='F')||(LA11_51>='a' && LA11_51<='f')) && ((( textMode && !hashMode )||( hashMode )))) {s = 64;}

                        else s = 18;

                         
                        input.seek(index11_51);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA11_56 = input.LA(1);

                         
                        int index11_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_56>='0' && LA11_56<='9')||(LA11_56>='A' && LA11_56<='F')||(LA11_56>='a' && LA11_56<='f')) ) {s = 68;}

                        else s = 18;

                         
                        input.seek(index11_56);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA11_32 = input.LA(1);

                         
                        int index11_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_32=='\"'||LA11_32=='\''||LA11_32=='\\'||LA11_32=='b'||LA11_32=='f'||LA11_32=='n'||LA11_32=='r'||LA11_32=='t') ) {s = 55;}

                        else if ( (LA11_32=='u') ) {s = 56;}

                        else if ( ((LA11_32>='0' && LA11_32<='3')) ) {s = 57;}

                        else if ( ((LA11_32>='4' && LA11_32<='7')) ) {s = 58;}

                        else s = 18;

                         
                        input.seek(index11_32);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA11_25 = input.LA(1);

                         
                        int index11_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_25==' ') && (( !hashMode ))) {s = 28;}

                        else s = 48;

                         
                        input.seek(index11_25);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA11_58 = input.LA(1);

                         
                        int index11_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_58=='\'') ) {s = 34;}

                        else if ( (LA11_58=='\\') ) {s = 32;}

                        else if ( ((LA11_58>='0' && LA11_58<='7')) ) {s = 70;}

                        else if ( ((LA11_58>='\u0000' && LA11_58<='\t')||(LA11_58>='\u000B' && LA11_58<='\f')||(LA11_58>='\u000E' && LA11_58<='&')||(LA11_58>='(' && LA11_58<='/')||(LA11_58>='8' && LA11_58<='[')||(LA11_58>=']' && LA11_58<='\uFFFF')) ) {s = 33;}

                        else s = 18;

                         
                        input.seek(index11_58);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_10=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 29;}

                        else if ( ((LA11_10>='\u0000' && LA11_10<='\t')||(LA11_10>='\u000B' && LA11_10<='\f')||(LA11_10>='\u000E' && LA11_10<='!')||(LA11_10>='#' && LA11_10<='[')||(LA11_10>=']' && LA11_10<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else if ( (LA11_10=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else s = 18;

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_8=='\n') && ((( !hashMode )||( hashMode )))) {s = 25;}

                        else s = 26;

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA11_33 = input.LA(1);

                         
                        int index11_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_33=='\'') ) {s = 34;}

                        else if ( (LA11_33=='\\') ) {s = 32;}

                        else if ( ((LA11_33>='\u0000' && LA11_33<='\t')||(LA11_33>='\u000B' && LA11_33<='\f')||(LA11_33>='\u000E' && LA11_33<='&')||(LA11_33>='(' && LA11_33<='[')||(LA11_33>=']' && LA11_33<='\uFFFF')) ) {s = 33;}

                        else s = 18;

                         
                        input.seek(index11_33);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA11_65 = input.LA(1);

                         
                        int index11_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_65>='0' && LA11_65<='7')) && ((( textMode && !hashMode )||( hashMode )))) {s = 73;}

                        else if ( (LA11_65=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else if ( (LA11_65=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 29;}

                        else if ( ((LA11_65>='\u0000' && LA11_65<='\t')||(LA11_65>='\u000B' && LA11_65<='\f')||(LA11_65>='\u000E' && LA11_65<='!')||(LA11_65>='#' && LA11_65<='/')||(LA11_65>='8' && LA11_65<='[')||(LA11_65>=']' && LA11_65<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else s = 18;

                         
                        input.seek(index11_65);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_6>='0' && LA11_6<='9')||(LA11_6>='A' && LA11_6<='Z')||(LA11_6>='a' && LA11_6<='z')) && ((( !textMode )||( textMode && !hashMode )))) {s = 21;}

                        else if ( ((LA11_6>='\u0000' && LA11_6<='\t')||(LA11_6>='\u000B' && LA11_6<='\f')||(LA11_6>='\u000E' && LA11_6<='/')||(LA11_6>=':' && LA11_6<='@')||(LA11_6>='[' && LA11_6<='`')||(LA11_6>='{' && LA11_6<='\uFFFF')) && (( textMode && !hashMode ))) {s = 18;}

                        else s = 22;

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA11_54 = input.LA(1);

                         
                        int index11_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 67;}

                        else if ( (( textMode && !hashMode )) ) {s = 18;}

                         
                        input.seek(index11_54);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA11_59 = input.LA(1);

                         
                        int index11_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode && !hashMode )))) ) {s = 71;}

                        else if ( (( textMode && !hashMode )) ) {s = 18;}

                         
                        input.seek(index11_59);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA11_50 = input.LA(1);

                         
                        int index11_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_50=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else if ( (LA11_50=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 29;}

                        else if ( ((LA11_50>='\u0000' && LA11_50<='\t')||(LA11_50>='\u000B' && LA11_50<='\f')||(LA11_50>='\u000E' && LA11_50<='!')||(LA11_50>='#' && LA11_50<='[')||(LA11_50>=']' && LA11_50<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else s = 18;

                         
                        input.seek(index11_50);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA11_77 = input.LA(1);

                         
                        int index11_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_77>='0' && LA11_77<='9')||(LA11_77>='A' && LA11_77<='F')||(LA11_77>='a' && LA11_77<='f')) ) {s = 79;}

                        else s = 18;

                         
                        input.seek(index11_77);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA11_52 = input.LA(1);

                         
                        int index11_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_52>='0' && LA11_52<='7')) && ((( textMode && !hashMode )||( hashMode )))) {s = 65;}

                        else if ( (LA11_52=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else if ( (LA11_52=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 29;}

                        else if ( ((LA11_52>='\u0000' && LA11_52<='\t')||(LA11_52>='\u000B' && LA11_52<='\f')||(LA11_52>='\u000E' && LA11_52<='!')||(LA11_52>='#' && LA11_52<='/')||(LA11_52>='8' && LA11_52<='[')||(LA11_52>=']' && LA11_52<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else s = 18;

                         
                        input.seek(index11_52);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA11_35 = input.LA(1);

                         
                        int index11_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( textMode && !hashMode )) ) {s = 18;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index11_35);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA11_37 = input.LA(1);

                         
                        int index11_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( textMode && braceDepth == 0 )) ) {s = 62;}

                        else if ( (( hashMode )) ) {s = 63;}

                         
                        input.seek(index11_37);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA11_70 = input.LA(1);

                         
                        int index11_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_70=='\'') ) {s = 34;}

                        else if ( (LA11_70=='\\') ) {s = 32;}

                        else if ( ((LA11_70>='\u0000' && LA11_70<='\t')||(LA11_70>='\u000B' && LA11_70<='\f')||(LA11_70>='\u000E' && LA11_70<='&')||(LA11_70>='(' && LA11_70<='[')||(LA11_70>=']' && LA11_70<='\uFFFF')) ) {s = 33;}

                        else s = 18;

                         
                        input.seek(index11_70);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA11_55 = input.LA(1);

                         
                        int index11_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_55=='\'') ) {s = 34;}

                        else if ( (LA11_55=='\\') ) {s = 32;}

                        else if ( ((LA11_55>='\u0000' && LA11_55<='\t')||(LA11_55>='\u000B' && LA11_55<='\f')||(LA11_55>='\u000E' && LA11_55<='&')||(LA11_55>='(' && LA11_55<='[')||(LA11_55>=']' && LA11_55<='\uFFFF')) ) {s = 33;}

                        else s = 18;

                         
                        input.seek(index11_55);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_11=='\\') ) {s = 32;}

                        else if ( ((LA11_11>='\u0000' && LA11_11<='\t')||(LA11_11>='\u000B' && LA11_11<='\f')||(LA11_11>='\u000E' && LA11_11<='&')||(LA11_11>='(' && LA11_11<='[')||(LA11_11>=']' && LA11_11<='\uFFFF')) ) {s = 33;}

                        else if ( (LA11_11=='\'') ) {s = 34;}

                        else s = 18;

                         
                        input.seek(index11_11);
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