// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-03-08 10:47:24

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
    	int indentationSize = -1;
    	
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
            // ../etc/Jaml.g:194:6: ( '#' )
            // ../etc/Jaml.g:194:10: '#'
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
            // ../etc/Jaml.g:195:4: ( '.' )
            // ../etc/Jaml.g:195:10: '.'
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
            // ../etc/Jaml.g:196:8: ( '%' )
            // ../etc/Jaml.g:196:10: '%'
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
            // ../etc/Jaml.g:197:14: ({...}? => '/' )
            // ../etc/Jaml.g:197:16: {...}? => '/'
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
            // ../etc/Jaml.g:198:6: ({...}? => ',' )
            // ../etc/Jaml.g:198:8: {...}? => ','
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
            // ../etc/Jaml.g:199:5: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ../etc/Jaml.g:199:7: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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

            // ../etc/Jaml.g:200:23: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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

            //textMode = true;
              

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
            // ../etc/Jaml.g:205:4: ({...}? => Spaces )
            // ../etc/Jaml.g:205:6: {...}? => Spaces
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
            // ../etc/Jaml.g:208:18: ({...}? => NL )
            // ../etc/Jaml.g:208:20: {...}? => NL
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
            // ../etc/Jaml.g:211:31: ({...}? => ( NL ) ( ' ' | '\\t' )* )
            // ../etc/Jaml.g:211:32: {...}? => ( NL ) ( ' ' | '\\t' )*
            {
            if ( !(( !hashMode )) ) {
                throw new FailedPredicateException(input, "CHANGE_INDENT", " !hashMode ");
            }
            // ../etc/Jaml.g:212:2: ( NL )
            // ../etc/Jaml.g:212:3: NL
            {
            mNL(); 

            }

            // ../etc/Jaml.g:212:7: ( ' ' | '\\t' )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' ') ) {
                    alt2=1;
                }
                else if ( (LA2_0=='\t') ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // ../etc/Jaml.g:212:8: ' '
            	    {
            	    match(' '); 
            	    spaces+=" ";

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:212:29: '\\t'
            	    {
            	    match('\t'); 
            	    spaces+="\t";

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
            	              if (indentationSize == -1 ) {
            	                indentationSize = tb;
            	              }
            	              for(int i = 0; i < tb - currentIndentation; i+=indentationSize) {
            		              emit(new CommonToken(INDENT,""));
            		              System.out.println("INDENT");
            	              }
            	          } else if(tb < currentIndentation) {
            	              for(int i = 0; i < currentIndentation - tb; i+=indentationSize) {
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
            // ../etc/Jaml.g:239:3: ( ( '\\r' )? '\\n' )
            // ../etc/Jaml.g:239:5: ( '\\r' )? '\\n'
            {
            // ../etc/Jaml.g:239:5: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../etc/Jaml.g:239:5: '\\r'
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
            // ../etc/Jaml.g:241:17: ( ( ' ' )* )
            // ../etc/Jaml.g:241:19: ( ' ' )*
            {
            // ../etc/Jaml.g:241:19: ( ' ' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../etc/Jaml.g:241:20: ' '
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
            // ../etc/Jaml.g:242:16: ( ( ' ' )+ )
            // ../etc/Jaml.g:242:18: ( ' ' )+
            {
            // ../etc/Jaml.g:242:18: ( ' ' )+
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
            	    // ../etc/Jaml.g:242:19: ' '
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
            // ../etc/Jaml.g:244:14: ({...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // ../etc/Jaml.g:244:16: {...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "StringLiteral", " hashMode ");
            }
            match('\"'); 
            // ../etc/Jaml.g:245:9: ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
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
            	    // ../etc/Jaml.g:245:11: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:245:28: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
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
            // ../etc/Jaml.g:250:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )* '\\'' )
            // ../etc/Jaml.g:250:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )* '\\''
            {
            match('\''); 
            // ../etc/Jaml.g:251:9: ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )*
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
            	    // ../etc/Jaml.g:251:13: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:252:13: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
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
            // ../etc/Jaml.g:259:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
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
                    // ../etc/Jaml.g:259:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // ../etc/Jaml.g:260:7: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:261:7: OctalEscape
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
            // ../etc/Jaml.g:266:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // ../etc/Jaml.g:266:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:266:12: ( '0' .. '3' )
                    // ../etc/Jaml.g:266:13: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ../etc/Jaml.g:266:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:266:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:266:34: ( '0' .. '7' )
                    // ../etc/Jaml.g:266:35: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:267:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:267:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:267:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:267:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:267:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:268:7: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:268:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:268:13: '0' .. '7'
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
            // ../etc/Jaml.g:273:3: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // ../etc/Jaml.g:273:7: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
            // ../etc/Jaml.g:277:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../etc/Jaml.g:277:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // ../etc/Jaml.g:279:5: ({...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' | '{' | ' ' ) ) (~ ( '\\r' | '\\n' ) )* | {...}? => ( '-' | '=' ) (~ ( '\\r' | '\\n' ) )* )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='-'||LA12_0=='=') && ((( textMode && !hashMode )||( !hashMode )))) {
                int LA12_1 = input.LA(2);

                if ( (( textMode && !hashMode )) ) {
                    alt12=1;
                }
                else if ( (( !hashMode )) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='!' && LA12_0<='\"')||LA12_0=='$'||(LA12_0>='&' && LA12_0<=',')||(LA12_0>='/' && LA12_0<='<')||(LA12_0>='>' && LA12_0<='z')||(LA12_0>='|' && LA12_0<='\uFFFF')) && (( textMode && !hashMode ))) {
                alt12=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../etc/Jaml.g:279:7: {...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' | '{' | ' ' ) ) (~ ( '\\r' | '\\n' ) )*
                    {
                    if ( !(( textMode && !hashMode )) ) {
                        throw new FailedPredicateException(input, "TEXT", " textMode && !hashMode ");
                    }
                    // ../etc/Jaml.g:280:7: (~ ( '.' | '#' | '%' | '\\r' | '\\n' | '{' | ' ' ) )
                    // ../etc/Jaml.g:280:8: ~ ( '.' | '#' | '%' | '\\r' | '\\n' | '{' | ' ' )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='z')||(input.LA(1)>='|' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }

                    // ../etc/Jaml.g:281:7: (~ ( '\\r' | '\\n' ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../etc/Jaml.g:281:8: ~ ( '\\r' | '\\n' )
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


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:282:9: {...}? => ( '-' | '=' ) (~ ( '\\r' | '\\n' ) )*
                    {
                    if ( !(( !hashMode )) ) {
                        throw new FailedPredicateException(input, "TEXT", " !hashMode ");
                    }
                    if ( input.LA(1)=='-'||input.LA(1)=='=' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../etc/Jaml.g:282:38: (~ ( '\\r' | '\\n' ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../etc/Jaml.g:282:39: ~ ( '\\r' | '\\n' )
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
                    	    break loop11;
                        }
                    } while (true);


                            beginningOfLine = false;
                          

                    }
                    break;

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
            // ../etc/Jaml.g:287:14: ({...}? => (~ ( '\"' | '\\'' | '{' | '}' ) ) )
            // ../etc/Jaml.g:287:16: {...}? => (~ ( '\"' | '\\'' | '{' | '}' ) )
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "HASH_CONTENTS", " hashMode ");
            }
            // ../etc/Jaml.g:288:7: (~ ( '\"' | '\\'' | '{' | '}' ) )
            // ../etc/Jaml.g:288:8: ~ ( '\"' | '\\'' | '{' | '}' )
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
            // ../etc/Jaml.g:291:13: ({...}? => LBRACE )
            // ../etc/Jaml.g:291:15: {...}? => LBRACE
            {
            if ( !(( !beginningOfLine && braceDepth == 0 )) ) {
                throw new FailedPredicateException(input, "BEGIN_HASH", " !beginningOfLine && braceDepth == 0 ");
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
            // ../etc/Jaml.g:292:11: ({...}? => RBRACE )
            // ../etc/Jaml.g:292:13: {...}? => RBRACE
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
            // ../etc/Jaml.g:294:13: ({...}? => LBRACE )
            // ../etc/Jaml.g:294:15: {...}? => LBRACE
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
            // ../etc/Jaml.g:295:13: ({...}? => RBRACE )
            // ../etc/Jaml.g:295:15: {...}? => RBRACE
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
            // ../etc/Jaml.g:297:17: ( '{' )
            // ../etc/Jaml.g:297:19: '{'
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
            // ../etc/Jaml.g:298:18: ({...}? => '}' )
            // ../etc/Jaml.g:298:20: {...}? => '}'
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
            // ../etc/Jaml.g:302:9: ({...}? => ' ' )
            // ../etc/Jaml.g:302:11: {...}? => ' '
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
            // ../etc/Jaml.g:303:8: ({...}? => ' ' )
            // ../etc/Jaml.g:303:10: {...}? => ' '
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
            // ../etc/Jaml.g:304:8: ({...}? => ' ' )
            // ../etc/Jaml.g:304:10: {...}? => ' '
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
        int alt13=20;
        alt13 = dfa13.predict(input);
        switch (alt13) {
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


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\1\20\1\21\1\22\1\23\1\25\1\27\1\30\1\32\1\34\2\24\1\44"+
        "\1\46\1\47\1\50\6\uffff\1\56\4\uffff\1\63\2\uffff\2\67\1\72\2\67"+
        "\1\77\21\uffff\2\67\1\uffff\2\67\1\uffff\4\67\5\uffff\3\67\1\uffff"+
        "\3\67\1\uffff\10\67";
    static final String DFA13_eofS =
        "\124\uffff";
    static final String DFA13_minS =
        "\7\0\1\40\1\12\1\11\12\0\1\uffff\4\0\2\uffff\1\11\1\0\1\uffff\7"+
        "\0\1\uffff\3\0\5\uffff\1\0\4\uffff\1\0\1\uffff\2\0\1\uffff\10\0"+
        "\4\uffff\3\0\1\uffff\3\0\1\uffff\10\0";
    static final String DFA13_maxS =
        "\1\uffff\3\0\3\uffff\1\40\1\12\1\40\5\uffff\5\0\1\uffff\1\0\1\uffff"+
        "\2\0\2\uffff\1\40\1\0\1\uffff\6\uffff\1\0\1\uffff\3\0\5\uffff\1"+
        "\0\4\uffff\1\0\1\uffff\2\uffff\1\uffff\2\uffff\1\0\4\uffff\1\0\4"+
        "\uffff\3\uffff\1\uffff\3\uffff\1\uffff\10\uffff";
    static final String DFA13_acceptS =
        "\24\uffff\1\14\4\uffff\1\7\1\15\2\uffff\1\11\7\uffff\1\14\3\uffff"+
        "\1\1\1\2\1\3\1\4\1\5\1\uffff\1\6\1\22\1\23\1\24\1\uffff\1\10\2\uffff"+
        "\1\14\10\uffff\1\17\1\21\1\16\1\20\3\uffff\1\12\3\uffff\1\13\10"+
        "\uffff";
    static final String DFA13_specialS =
        "\1\0\3\uffff\1\64\1\67\1\16\1\30\1\22\1\13\1\21\1\1\1\12\1\6\1"+
        "\57\1\62\1\46\1\47\1\50\1\24\1\uffff\1\33\1\11\1\32\1\4\2\uffff"+
        "\1\14\1\34\1\uffff\1\36\1\7\1\10\1\45\1\3\1\17\1\71\1\uffff\1\56"+
        "\1\65\1\31\5\uffff\1\52\4\uffff\1\51\1\uffff\1\44\1\72\1\uffff\1"+
        "\63\1\41\1\54\1\15\1\66\1\5\1\61\1\55\4\uffff\1\40\1\60\1\20\1\uffff"+
        "\1\42\1\2\1\53\1\uffff\1\35\1\23\1\27\1\26\1\43\1\25\1\37\1\70}>";
    static final String[] DFA13_transitionS = {
            "\12\15\1\11\2\15\1\10\22\15\1\7\1\15\1\12\1\1\1\15\1\3\1\15"+
            "\1\13\4\15\1\5\1\14\1\2\1\4\15\15\1\14\3\15\32\6\6\15\32\6\1"+
            "\17\1\15\1\16\uff82\15",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\24\1\uffff\2\24\1\uffff\ufff2\24",
            "\12\24\1\uffff\2\24\1\uffff\ufff2\24",
            "\12\24\1\uffff\2\24\1\uffff\42\24\12\26\7\24\32\26\6\24\32"+
            "\26\uff85\24",
            "\1\31",
            "\1\33",
            "\1\35\26\uffff\1\35",
            "\12\37\1\uffff\2\37\1\uffff\24\37\1\40\71\37\1\36\uffa3\37",
            "\12\42\1\uffff\2\42\1\uffff\31\42\1\43\64\42\1\41\uffa3\42",
            "\12\45\1\uffff\2\45\1\uffff\ufff2\45",
            "\12\24\1\uffff\2\24\1\uffff\ufff2\24",
            "\12\24\1\uffff\2\24\1\uffff\ufff2\24",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\12\24\1\uffff\2\24\1\uffff\42\24\12\26\7\24\32\26\6\24\32"+
            "\26\uff85\24",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "\1\35\26\uffff\1\35",
            "\1\uffff",
            "",
            "\12\24\1\uffff\2\24\1\uffff\24\24\1\65\4\24\1\65\10\24\4\70"+
            "\4\71\44\24\1\65\5\24\1\65\3\24\1\65\7\24\1\65\3\24\1\65\1\24"+
            "\1\65\1\66\uff8a\24",
            "\12\37\1\uffff\2\37\1\uffff\24\37\1\40\71\37\1\36\uffa3\37",
            "\12\24\1\uffff\2\24\1\uffff\ufff2\24",
            "\12\24\1\uffff\2\24\1\uffff\24\24\1\73\4\24\1\73\10\24\4\75"+
            "\4\76\44\24\1\73\5\24\1\73\3\24\1\73\7\24\1\73\3\24\1\73\1\24"+
            "\1\73\1\74\uff8a\24",
            "\12\42\1\uffff\2\42\1\uffff\31\42\1\43\64\42\1\41\uffa3\42",
            "\12\24\1\uffff\2\24\1\uffff\ufff2\24",
            "\1\uffff",
            "",
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
            "\12\37\1\uffff\2\37\1\uffff\24\37\1\40\71\37\1\36\uffa3\37",
            "\12\24\1\uffff\2\24\1\uffff\42\24\12\104\7\24\6\104\32\24"+
            "\6\104\uff99\24",
            "",
            "\12\37\1\uffff\2\37\1\uffff\24\37\1\40\15\37\10\105\44\37"+
            "\1\36\uffa3\37",
            "\12\37\1\uffff\2\37\1\uffff\24\37\1\40\15\37\10\106\44\37"+
            "\1\36\uffa3\37",
            "\1\uffff",
            "\12\42\1\uffff\2\42\1\uffff\31\42\1\43\64\42\1\41\uffa3\42",
            "\12\24\1\uffff\2\24\1\uffff\42\24\12\110\7\24\6\110\32\24"+
            "\6\110\uff99\24",
            "\12\42\1\uffff\2\42\1\uffff\31\42\1\43\10\42\10\111\44\42"+
            "\1\41\uffa3\42",
            "\12\42\1\uffff\2\42\1\uffff\31\42\1\43\10\42\10\112\44\42"+
            "\1\41\uffa3\42",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\12\24\1\uffff\2\24\1\uffff\42\24\12\114\7\24\6\114\32\24"+
            "\6\114\uff99\24",
            "\12\37\1\uffff\2\37\1\uffff\24\37\1\40\15\37\10\115\44\37"+
            "\1\36\uffa3\37",
            "\12\37\1\uffff\2\37\1\uffff\24\37\1\40\71\37\1\36\uffa3\37",
            "",
            "\12\24\1\uffff\2\24\1\uffff\42\24\12\116\7\24\6\116\32\24"+
            "\6\116\uff99\24",
            "\12\42\1\uffff\2\42\1\uffff\31\42\1\43\10\42\10\117\44\42"+
            "\1\41\uffa3\42",
            "\12\42\1\uffff\2\42\1\uffff\31\42\1\43\64\42\1\41\uffa3\42",
            "",
            "\12\24\1\uffff\2\24\1\uffff\42\24\12\120\7\24\6\120\32\24"+
            "\6\120\uff99\24",
            "\12\37\1\uffff\2\37\1\uffff\24\37\1\40\71\37\1\36\uffa3\37",
            "\12\24\1\uffff\2\24\1\uffff\42\24\12\121\7\24\6\121\32\24"+
            "\6\121\uff99\24",
            "\12\42\1\uffff\2\42\1\uffff\31\42\1\43\64\42\1\41\uffa3\42",
            "\12\24\1\uffff\2\24\1\uffff\42\24\12\122\7\24\6\122\32\24"+
            "\6\122\uff99\24",
            "\12\24\1\uffff\2\24\1\uffff\42\24\12\123\7\24\6\123\32\24"+
            "\6\123\uff99\24",
            "\12\37\1\uffff\2\37\1\uffff\24\37\1\40\71\37\1\36\uffa3\37",
            "\12\42\1\uffff\2\42\1\uffff\31\42\1\43\64\42\1\41\uffa3\42"
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
            return "1:1: Tokens : ( POUND | DOT | PERCENT | FORWARD_SLASH | COMMA | ID | WS | IGNORED_NEWLINE | CHANGE_INDENT | StringLiteral | CHARLITERAL | TEXT | HASH_CONTENTS | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | NEWLINE | INDENT | DEDENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                         
                        int index13_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_0=='#') ) {s = 1;}

                        else if ( (LA13_0=='.') ) {s = 2;}

                        else if ( (LA13_0=='%') ) {s = 3;}

                        else if ( (LA13_0=='/') && ((( !beginningOfLine && !hashMode )||( textMode && !hashMode )||( hashMode )))) {s = 4;}

                        else if ( (LA13_0==',') && ((( !textMode )||( textMode && !hashMode )||( hashMode )))) {s = 5;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||(LA13_0>='a' && LA13_0<='z')) && ((( !textMode )||( textMode && !hashMode )||( hashMode )))) {s = 6;}

                        else if ( (LA13_0==' ') && ((( !textMode )||(false)||( hashMode )))) {s = 7;}

                        else if ( (LA13_0=='\r') && ((( !hashMode )||( hashMode )))) {s = 8;}

                        else if ( (LA13_0=='\n') && ((( !hashMode )||( hashMode )))) {s = 9;}

                        else if ( (LA13_0=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 10;}

                        else if ( (LA13_0=='\'') ) {s = 11;}

                        else if ( (LA13_0=='-'||LA13_0=='=') && ((( textMode && !hashMode )||( !hashMode )||( hashMode )))) {s = 12;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||LA13_0=='$'||LA13_0=='&'||(LA13_0>='(' && LA13_0<='+')||(LA13_0>='0' && LA13_0<='<')||(LA13_0>='>' && LA13_0<='@')||(LA13_0>='[' && LA13_0<='`')||LA13_0=='|'||(LA13_0>='~' && LA13_0<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 13;}

                        else if ( (LA13_0=='}') && (((( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||( textMode && !hashMode )||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))))) {s = 14;}

                        else if ( (LA13_0=='{') && ((( !beginningOfLine && braceDepth == 0 )||( hashMode )))) {s = 15;}

                         
                        input.seek(index13_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA13_11 = input.LA(1);

                         
                        int index13_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_11=='\\') ) {s = 33;}

                        else if ( ((LA13_11>='\u0000' && LA13_11<='\t')||(LA13_11>='\u000B' && LA13_11<='\f')||(LA13_11>='\u000E' && LA13_11<='&')||(LA13_11>='(' && LA13_11<='[')||(LA13_11>=']' && LA13_11<='\uFFFF')) ) {s = 34;}

                        else if ( (LA13_11=='\'') ) {s = 35;}

                        else s = 20;

                         
                        input.seek(index13_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA13_73 = input.LA(1);

                         
                        int index13_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_73>='0' && LA13_73<='7')) ) {s = 79;}

                        else if ( (LA13_73=='\'') ) {s = 35;}

                        else if ( (LA13_73=='\\') ) {s = 33;}

                        else if ( ((LA13_73>='\u0000' && LA13_73<='\t')||(LA13_73>='\u000B' && LA13_73<='\f')||(LA13_73>='\u000E' && LA13_73<='&')||(LA13_73>='(' && LA13_73<='/')||(LA13_73>='8' && LA13_73<='[')||(LA13_73>=']' && LA13_73<='\uFFFF')) ) {s = 34;}

                        else s = 55;

                         
                        input.seek(index13_73);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA13_34 = input.LA(1);

                         
                        int index13_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_34=='\'') ) {s = 35;}

                        else if ( (LA13_34=='\\') ) {s = 33;}

                        else if ( ((LA13_34>='\u0000' && LA13_34<='\t')||(LA13_34>='\u000B' && LA13_34<='\f')||(LA13_34>='\u000E' && LA13_34<='&')||(LA13_34>='(' && LA13_34<='[')||(LA13_34>=']' && LA13_34<='\uFFFF')) ) {s = 34;}

                        else s = 55;

                         
                        input.seek(index13_34);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA13_24 = input.LA(1);

                         
                        int index13_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 25;}

                        else if ( (( hashMode )) ) {s = 26;}

                        else if ( ((false)) ) {s = 48;}

                        else if ( ((false)) ) {s = 49;}

                        else if ( ((false)) ) {s = 50;}

                         
                        input.seek(index13_24);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA13_61 = input.LA(1);

                         
                        int index13_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_61>='0' && LA13_61<='7')) ) {s = 73;}

                        else if ( (LA13_61=='\'') ) {s = 35;}

                        else if ( (LA13_61=='\\') ) {s = 33;}

                        else if ( ((LA13_61>='\u0000' && LA13_61<='\t')||(LA13_61>='\u000B' && LA13_61<='\f')||(LA13_61>='\u000E' && LA13_61<='&')||(LA13_61>='(' && LA13_61<='/')||(LA13_61>='8' && LA13_61<='[')||(LA13_61>=']' && LA13_61<='\uFFFF')) ) {s = 34;}

                        else s = 55;

                         
                        input.seek(index13_61);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA13_13 = input.LA(1);

                         
                        int index13_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_13>='\u0000' && LA13_13<='\t')||(LA13_13>='\u000B' && LA13_13<='\f')||(LA13_13>='\u000E' && LA13_13<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 38;

                         
                        input.seek(index13_13);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA13_31 = input.LA(1);

                         
                        int index13_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_31=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 32;}

                        else if ( (LA13_31=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else if ( ((LA13_31>='\u0000' && LA13_31<='\t')||(LA13_31>='\u000B' && LA13_31<='\f')||(LA13_31>='\u000E' && LA13_31<='!')||(LA13_31>='#' && LA13_31<='[')||(LA13_31>=']' && LA13_31<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else s = 55;

                         
                        input.seek(index13_31);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA13_32 = input.LA(1);

                         
                        int index13_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_32>='\u0000' && LA13_32<='\t')||(LA13_32>='\u000B' && LA13_32<='\f')||(LA13_32>='\u000E' && LA13_32<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 58;

                         
                        input.seek(index13_32);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA13_22 = input.LA(1);

                         
                        int index13_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_22>='0' && LA13_22<='9')||(LA13_22>='A' && LA13_22<='Z')||(LA13_22>='a' && LA13_22<='z')) && ((( !textMode )||( textMode && !hashMode )))) {s = 22;}

                        else if ( ((LA13_22>='\u0000' && LA13_22<='\t')||(LA13_22>='\u000B' && LA13_22<='\f')||(LA13_22>='\u000E' && LA13_22<='/')||(LA13_22>=':' && LA13_22<='@')||(LA13_22>='[' && LA13_22<='`')||(LA13_22>='{' && LA13_22<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 46;

                         
                        input.seek(index13_22);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA13_12 = input.LA(1);

                         
                        int index13_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_12>='\u0000' && LA13_12<='\t')||(LA13_12>='\u000B' && LA13_12<='\f')||(LA13_12>='\u000E' && LA13_12<='\uFFFF')) && ((( textMode && !hashMode )||( !hashMode )))) {s = 37;}

                        else s = 36;

                         
                        input.seek(index13_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA13_9 = input.LA(1);

                         
                        int index13_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_9=='\t'||LA13_9==' ') && (( !hashMode ))) {s = 29;}

                        else s = 28;

                         
                        input.seek(index13_9);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA13_27 = input.LA(1);

                         
                        int index13_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_27=='\t'||LA13_27==' ') && (( !hashMode ))) {s = 29;}

                        else s = 51;

                         
                        input.seek(index13_27);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA13_59 = input.LA(1);

                         
                        int index13_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_59=='\'') ) {s = 35;}

                        else if ( (LA13_59=='\\') ) {s = 33;}

                        else if ( ((LA13_59>='\u0000' && LA13_59<='\t')||(LA13_59>='\u000B' && LA13_59<='\f')||(LA13_59>='\u000E' && LA13_59<='&')||(LA13_59>='(' && LA13_59<='[')||(LA13_59>=']' && LA13_59<='\uFFFF')) ) {s = 34;}

                        else s = 55;

                         
                        input.seek(index13_59);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA13_6 = input.LA(1);

                         
                        int index13_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_6>='0' && LA13_6<='9')||(LA13_6>='A' && LA13_6<='Z')||(LA13_6>='a' && LA13_6<='z')) && ((( !textMode )||( textMode && !hashMode )))) {s = 22;}

                        else if ( ((LA13_6>='\u0000' && LA13_6<='\t')||(LA13_6>='\u000B' && LA13_6<='\f')||(LA13_6>='\u000E' && LA13_6<='/')||(LA13_6>=':' && LA13_6<='@')||(LA13_6>='[' && LA13_6<='`')||(LA13_6>='{' && LA13_6<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 23;

                         
                        input.seek(index13_6);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA13_35 = input.LA(1);

                         
                        int index13_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_35>='\u0000' && LA13_35<='\t')||(LA13_35>='\u000B' && LA13_35<='\f')||(LA13_35>='\u000E' && LA13_35<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 63;

                         
                        input.seek(index13_35);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA13_70 = input.LA(1);

                         
                        int index13_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_70=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 32;}

                        else if ( (LA13_70=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else if ( ((LA13_70>='\u0000' && LA13_70<='\t')||(LA13_70>='\u000B' && LA13_70<='\f')||(LA13_70>='\u000E' && LA13_70<='!')||(LA13_70>='#' && LA13_70<='[')||(LA13_70>=']' && LA13_70<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else s = 55;

                         
                        input.seek(index13_70);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA13_10 = input.LA(1);

                         
                        int index13_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_10=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else if ( ((LA13_10>='\u0000' && LA13_10<='\t')||(LA13_10>='\u000B' && LA13_10<='\f')||(LA13_10>='\u000E' && LA13_10<='!')||(LA13_10>='#' && LA13_10<='[')||(LA13_10>=']' && LA13_10<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else if ( (LA13_10=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 32;}

                        else s = 20;

                         
                        input.seek(index13_10);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA13_8 = input.LA(1);

                         
                        int index13_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_8=='\n') && ((( !hashMode )||( hashMode )))) {s = 27;}

                        else s = 26;

                         
                        input.seek(index13_8);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA13_77 = input.LA(1);

                         
                        int index13_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_77=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 32;}

                        else if ( (LA13_77=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else if ( ((LA13_77>='\u0000' && LA13_77<='\t')||(LA13_77>='\u000B' && LA13_77<='\f')||(LA13_77>='\u000E' && LA13_77<='!')||(LA13_77>='#' && LA13_77<='[')||(LA13_77>=']' && LA13_77<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else s = 55;

                         
                        input.seek(index13_77);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA13_19 = input.LA(1);

                         
                        int index13_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !beginningOfLine && !hashMode )) ) {s = 44;}

                        else if ( (( textMode && !hashMode )) ) {s = 37;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index13_19);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA13_81 = input.LA(1);

                         
                        int index13_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_81>='0' && LA13_81<='9')||(LA13_81>='A' && LA13_81<='F')||(LA13_81>='a' && LA13_81<='f')) ) {s = 83;}

                        else if ( ((LA13_81>='\u0000' && LA13_81<='\t')||(LA13_81>='\u000B' && LA13_81<='\f')||(LA13_81>='\u000E' && LA13_81<='/')||(LA13_81>=':' && LA13_81<='@')||(LA13_81>='G' && LA13_81<='`')||(LA13_81>='g' && LA13_81<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 55;

                         
                        input.seek(index13_81);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA13_79 = input.LA(1);

                         
                        int index13_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_79=='\'') ) {s = 35;}

                        else if ( (LA13_79=='\\') ) {s = 33;}

                        else if ( ((LA13_79>='\u0000' && LA13_79<='\t')||(LA13_79>='\u000B' && LA13_79<='\f')||(LA13_79>='\u000E' && LA13_79<='&')||(LA13_79>='(' && LA13_79<='[')||(LA13_79>=']' && LA13_79<='\uFFFF')) ) {s = 34;}

                        else s = 55;

                         
                        input.seek(index13_79);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA13_78 = input.LA(1);

                         
                        int index13_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_78>='0' && LA13_78<='9')||(LA13_78>='A' && LA13_78<='F')||(LA13_78>='a' && LA13_78<='f')) ) {s = 81;}

                        else if ( ((LA13_78>='\u0000' && LA13_78<='\t')||(LA13_78>='\u000B' && LA13_78<='\f')||(LA13_78>='\u000E' && LA13_78<='/')||(LA13_78>=':' && LA13_78<='@')||(LA13_78>='G' && LA13_78<='`')||(LA13_78>='g' && LA13_78<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 55;

                         
                        input.seek(index13_78);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA13_7 = input.LA(1);

                         
                        int index13_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_7==' ') && (( !textMode ))) {s = 25;}

                        else s = 24;

                         
                        input.seek(index13_7);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA13_40 = input.LA(1);

                         
                        int index13_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !beginningOfLine && braceDepth == 0 )) ) {s = 66;}

                        else if ( (( hashMode )) ) {s = 67;}

                         
                        input.seek(index13_40);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA13_23 = input.LA(1);

                         
                        int index13_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 47;}

                        else if ( (( textMode && !hashMode )) ) {s = 37;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index13_23);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA13_21 = input.LA(1);

                         
                        int index13_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 45;}

                        else if ( (( textMode && !hashMode )) ) {s = 37;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index13_21);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA13_28 = input.LA(1);

                         
                        int index13_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 52;}

                        else if ( (( !hashMode )) ) {s = 29;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index13_28);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA13_76 = input.LA(1);

                         
                        int index13_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_76>='0' && LA13_76<='9')||(LA13_76>='A' && LA13_76<='F')||(LA13_76>='a' && LA13_76<='f')) && ((( textMode && !hashMode )||( hashMode )))) {s = 80;}

                        else if ( ((LA13_76>='\u0000' && LA13_76<='\t')||(LA13_76>='\u000B' && LA13_76<='\f')||(LA13_76>='\u000E' && LA13_76<='/')||(LA13_76>=':' && LA13_76<='@')||(LA13_76>='G' && LA13_76<='`')||(LA13_76>='g' && LA13_76<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 55;

                         
                        input.seek(index13_76);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA13_30 = input.LA(1);

                         
                        int index13_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_30=='\"'||LA13_30=='\''||LA13_30=='\\'||LA13_30=='b'||LA13_30=='f'||LA13_30=='n'||LA13_30=='r'||LA13_30=='t') && ((( textMode && !hashMode )||( hashMode )))) {s = 53;}

                        else if ( (LA13_30=='u') && ((( textMode && !hashMode )||( hashMode )))) {s = 54;}

                        else if ( ((LA13_30>='0' && LA13_30<='3')) && ((( textMode && !hashMode )||( hashMode )))) {s = 56;}

                        else if ( ((LA13_30>='\u0000' && LA13_30<='\t')||(LA13_30>='\u000B' && LA13_30<='\f')||(LA13_30>='\u000E' && LA13_30<='!')||(LA13_30>='#' && LA13_30<='&')||(LA13_30>='(' && LA13_30<='/')||(LA13_30>='8' && LA13_30<='[')||(LA13_30>=']' && LA13_30<='a')||(LA13_30>='c' && LA13_30<='e')||(LA13_30>='g' && LA13_30<='m')||(LA13_30>='o' && LA13_30<='q')||LA13_30=='s'||(LA13_30>='v' && LA13_30<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else if ( ((LA13_30>='4' && LA13_30<='7')) && ((( textMode && !hashMode )||( hashMode )))) {s = 57;}

                        else s = 55;

                         
                        input.seek(index13_30);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA13_82 = input.LA(1);

                         
                        int index13_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_82=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 32;}

                        else if ( (LA13_82=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else if ( ((LA13_82>='\u0000' && LA13_82<='\t')||(LA13_82>='\u000B' && LA13_82<='\f')||(LA13_82>='\u000E' && LA13_82<='!')||(LA13_82>='#' && LA13_82<='[')||(LA13_82>=']' && LA13_82<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else s = 55;

                         
                        input.seek(index13_82);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA13_68 = input.LA(1);

                         
                        int index13_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_68>='0' && LA13_68<='9')||(LA13_68>='A' && LA13_68<='F')||(LA13_68>='a' && LA13_68<='f')) && ((( textMode && !hashMode )||( hashMode )))) {s = 76;}

                        else if ( ((LA13_68>='\u0000' && LA13_68<='\t')||(LA13_68>='\u000B' && LA13_68<='\f')||(LA13_68>='\u000E' && LA13_68<='/')||(LA13_68>=':' && LA13_68<='@')||(LA13_68>='G' && LA13_68<='`')||(LA13_68>='g' && LA13_68<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 55;

                         
                        input.seek(index13_68);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA13_57 = input.LA(1);

                         
                        int index13_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_57=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 32;}

                        else if ( (LA13_57=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else if ( ((LA13_57>='0' && LA13_57<='7')) && ((( textMode && !hashMode )||( hashMode )))) {s = 70;}

                        else if ( ((LA13_57>='\u0000' && LA13_57<='\t')||(LA13_57>='\u000B' && LA13_57<='\f')||(LA13_57>='\u000E' && LA13_57<='!')||(LA13_57>='#' && LA13_57<='/')||(LA13_57>='8' && LA13_57<='[')||(LA13_57>=']' && LA13_57<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else s = 55;

                         
                        input.seek(index13_57);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA13_72 = input.LA(1);

                         
                        int index13_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_72>='0' && LA13_72<='9')||(LA13_72>='A' && LA13_72<='F')||(LA13_72>='a' && LA13_72<='f')) ) {s = 78;}

                        else if ( ((LA13_72>='\u0000' && LA13_72<='\t')||(LA13_72>='\u000B' && LA13_72<='\f')||(LA13_72>='\u000E' && LA13_72<='/')||(LA13_72>=':' && LA13_72<='@')||(LA13_72>='G' && LA13_72<='`')||(LA13_72>='g' && LA13_72<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 55;

                         
                        input.seek(index13_72);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA13_80 = input.LA(1);

                         
                        int index13_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_80>='0' && LA13_80<='9')||(LA13_80>='A' && LA13_80<='F')||(LA13_80>='a' && LA13_80<='f')) && ((( textMode && !hashMode )||( hashMode )))) {s = 82;}

                        else if ( ((LA13_80>='\u0000' && LA13_80<='\t')||(LA13_80>='\u000B' && LA13_80<='\f')||(LA13_80>='\u000E' && LA13_80<='/')||(LA13_80>=':' && LA13_80<='@')||(LA13_80>='G' && LA13_80<='`')||(LA13_80>='g' && LA13_80<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 55;

                         
                        input.seek(index13_80);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA13_53 = input.LA(1);

                         
                        int index13_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_53=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 32;}

                        else if ( (LA13_53=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else if ( ((LA13_53>='\u0000' && LA13_53<='\t')||(LA13_53>='\u000B' && LA13_53<='\f')||(LA13_53>='\u000E' && LA13_53<='!')||(LA13_53>='#' && LA13_53<='[')||(LA13_53>=']' && LA13_53<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else s = 55;

                         
                        input.seek(index13_53);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA13_33 = input.LA(1);

                         
                        int index13_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_33=='\"'||LA13_33=='\''||LA13_33=='\\'||LA13_33=='b'||LA13_33=='f'||LA13_33=='n'||LA13_33=='r'||LA13_33=='t') ) {s = 59;}

                        else if ( (LA13_33=='u') ) {s = 60;}

                        else if ( ((LA13_33>='0' && LA13_33<='3')) ) {s = 61;}

                        else if ( ((LA13_33>='\u0000' && LA13_33<='\t')||(LA13_33>='\u000B' && LA13_33<='\f')||(LA13_33>='\u000E' && LA13_33<='!')||(LA13_33>='#' && LA13_33<='&')||(LA13_33>='(' && LA13_33<='/')||(LA13_33>='8' && LA13_33<='[')||(LA13_33>=']' && LA13_33<='a')||(LA13_33>='c' && LA13_33<='e')||(LA13_33>='g' && LA13_33<='m')||(LA13_33>='o' && LA13_33<='q')||LA13_33=='s'||(LA13_33>='v' && LA13_33<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else if ( ((LA13_33>='4' && LA13_33<='7')) ) {s = 62;}

                        else s = 55;

                         
                        input.seek(index13_33);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA13_16 = input.LA(1);

                         
                        int index13_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( hashMode )))) ) {s = 41;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index13_16);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA13_17 = input.LA(1);

                         
                        int index13_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( hashMode )))) ) {s = 42;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index13_17);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA13_18 = input.LA(1);

                         
                        int index13_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( hashMode )))) ) {s = 43;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index13_18);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA13_51 = input.LA(1);

                         
                        int index13_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 52;}

                        else if ( (( !hashMode )) ) {s = 29;}

                         
                        input.seek(index13_51);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA13_46 = input.LA(1);

                         
                        int index13_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 47;}

                        else if ( (( textMode && !hashMode )) ) {s = 55;}

                         
                        input.seek(index13_46);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA13_74 = input.LA(1);

                         
                        int index13_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_74=='\'') ) {s = 35;}

                        else if ( (LA13_74=='\\') ) {s = 33;}

                        else if ( ((LA13_74>='\u0000' && LA13_74<='\t')||(LA13_74>='\u000B' && LA13_74<='\f')||(LA13_74>='\u000E' && LA13_74<='&')||(LA13_74>='(' && LA13_74<='[')||(LA13_74>=']' && LA13_74<='\uFFFF')) ) {s = 34;}

                        else s = 55;

                         
                        input.seek(index13_74);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA13_58 = input.LA(1);

                         
                        int index13_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 71;}

                        else if ( (( textMode && !hashMode )) ) {s = 55;}

                         
                        input.seek(index13_58);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA13_63 = input.LA(1);

                         
                        int index13_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode && !hashMode )))) ) {s = 75;}

                        else if ( (( textMode && !hashMode )) ) {s = 55;}

                         
                        input.seek(index13_63);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA13_38 = input.LA(1);

                         
                        int index13_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( textMode && !hashMode )) ) {s = 55;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index13_38);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA13_14 = input.LA(1);

                         
                        int index13_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_14>='\u0000' && LA13_14<='\t')||(LA13_14>='\u000B' && LA13_14<='\f')||(LA13_14>='\u000E' && LA13_14<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 39;

                         
                        input.seek(index13_14);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA13_69 = input.LA(1);

                         
                        int index13_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_69>='0' && LA13_69<='7')) && ((( textMode && !hashMode )||( hashMode )))) {s = 77;}

                        else if ( (LA13_69=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 32;}

                        else if ( (LA13_69=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else if ( ((LA13_69>='\u0000' && LA13_69<='\t')||(LA13_69>='\u000B' && LA13_69<='\f')||(LA13_69>='\u000E' && LA13_69<='!')||(LA13_69>='#' && LA13_69<='/')||(LA13_69>='8' && LA13_69<='[')||(LA13_69>=']' && LA13_69<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else s = 55;

                         
                        input.seek(index13_69);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA13_62 = input.LA(1);

                         
                        int index13_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_62=='\'') ) {s = 35;}

                        else if ( (LA13_62=='\\') ) {s = 33;}

                        else if ( ((LA13_62>='0' && LA13_62<='7')) ) {s = 74;}

                        else if ( ((LA13_62>='\u0000' && LA13_62<='\t')||(LA13_62>='\u000B' && LA13_62<='\f')||(LA13_62>='\u000E' && LA13_62<='&')||(LA13_62>='(' && LA13_62<='/')||(LA13_62>='8' && LA13_62<='[')||(LA13_62>=']' && LA13_62<='\uFFFF')) ) {s = 34;}

                        else s = 55;

                         
                        input.seek(index13_62);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA13_15 = input.LA(1);

                         
                        int index13_15 = input.index();
                        input.rewind();
                        s = -1;
                        s = 40;

                         
                        input.seek(index13_15);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA13_56 = input.LA(1);

                         
                        int index13_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_56>='0' && LA13_56<='7')) && ((( textMode && !hashMode )||( hashMode )))) {s = 69;}

                        else if ( (LA13_56=='\"') && ((( textMode && !hashMode )||( hashMode )))) {s = 32;}

                        else if ( (LA13_56=='\\') && ((( textMode && !hashMode )||( hashMode )))) {s = 30;}

                        else if ( ((LA13_56>='\u0000' && LA13_56<='\t')||(LA13_56>='\u000B' && LA13_56<='\f')||(LA13_56>='\u000E' && LA13_56<='!')||(LA13_56>='#' && LA13_56<='/')||(LA13_56>='8' && LA13_56<='[')||(LA13_56>=']' && LA13_56<='\uFFFF')) && ((( textMode && !hashMode )||( hashMode )))) {s = 31;}

                        else s = 55;

                         
                        input.seek(index13_56);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA13_4 = input.LA(1);

                         
                        int index13_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_4>='\u0000' && LA13_4<='\t')||(LA13_4>='\u000B' && LA13_4<='\f')||(LA13_4>='\u000E' && LA13_4<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 19;

                         
                        input.seek(index13_4);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA13_39 = input.LA(1);

                         
                        int index13_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( textMode && !hashMode )) ) {s = 55;}

                        else if ( ((( braceDepth == 1 )&&( hashMode ))) ) {s = 64;}

                        else if ( ((( braceDepth > 1 )&&( hashMode ))) ) {s = 65;}

                         
                        input.seek(index13_39);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA13_60 = input.LA(1);

                         
                        int index13_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_60>='0' && LA13_60<='9')||(LA13_60>='A' && LA13_60<='F')||(LA13_60>='a' && LA13_60<='f')) ) {s = 72;}

                        else if ( ((LA13_60>='\u0000' && LA13_60<='\t')||(LA13_60>='\u000B' && LA13_60<='\f')||(LA13_60>='\u000E' && LA13_60<='/')||(LA13_60>=':' && LA13_60<='@')||(LA13_60>='G' && LA13_60<='`')||(LA13_60>='g' && LA13_60<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 55;

                         
                        input.seek(index13_60);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA13_5 = input.LA(1);

                         
                        int index13_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_5>='\u0000' && LA13_5<='\t')||(LA13_5>='\u000B' && LA13_5<='\f')||(LA13_5>='\u000E' && LA13_5<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 21;

                         
                        input.seek(index13_5);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA13_83 = input.LA(1);

                         
                        int index13_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA13_83=='\'') ) {s = 35;}

                        else if ( (LA13_83=='\\') ) {s = 33;}

                        else if ( ((LA13_83>='\u0000' && LA13_83<='\t')||(LA13_83>='\u000B' && LA13_83<='\f')||(LA13_83>='\u000E' && LA13_83<='&')||(LA13_83>='(' && LA13_83<='[')||(LA13_83>=']' && LA13_83<='\uFFFF')) ) {s = 34;}

                        else s = 55;

                         
                        input.seek(index13_83);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA13_36 = input.LA(1);

                         
                        int index13_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((( textMode && !hashMode )||( !hashMode ))) ) {s = 55;}

                        else if ( (( hashMode )) ) {s = 26;}

                         
                        input.seek(index13_36);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA13_54 = input.LA(1);

                         
                        int index13_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA13_54>='0' && LA13_54<='9')||(LA13_54>='A' && LA13_54<='F')||(LA13_54>='a' && LA13_54<='f')) && ((( textMode && !hashMode )||( hashMode )))) {s = 68;}

                        else if ( ((LA13_54>='\u0000' && LA13_54<='\t')||(LA13_54>='\u000B' && LA13_54<='\f')||(LA13_54>='\u000E' && LA13_54<='/')||(LA13_54>=':' && LA13_54<='@')||(LA13_54>='G' && LA13_54<='`')||(LA13_54>='g' && LA13_54<='\uFFFF')) && (( textMode && !hashMode ))) {s = 20;}

                        else s = 55;

                         
                        input.seek(index13_54);
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