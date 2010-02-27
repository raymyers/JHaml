// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-26 20:19:37

package com.cadrlife.jaml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JamlLexer extends Lexer {
    public static final int IntegerNumber=24;
    public static final int END_HASH=12;
    public static final int LBRACE=40;
    public static final int Exponent=30;
    public static final int DEDENT=5;
    public static final int ID=10;
    public static final int EOF=-1;
    public static final int HexDigit=29;
    public static final int INDENT=4;
    public static final int COMMA=15;
    public static final int Spaces=16;
    public static final int FloatSuffix=32;
    public static final int NonIntegerNumber=31;
    public static final int NL=18;
    public static final int DOT=14;
    public static final int JAVA_RBRACE=43;
    public static final int HexPrefix=28;
    public static final int IGNORED_NEWLINE=19;
    public static final int PERCENT=9;
    public static final int RBRACE=41;
    public static final int POUND=13;
    public static final int DOUBLELITERAL=35;
    public static final int CHANGE_INDENT=20;
    public static final int SpacesQ=21;
    public static final int TEXT=7;
    public static final int INTLITERAL=27;
    public static final int BEGIN_HASH=11;
    public static final int LongSuffix=25;
    public static final int LONGLITERAL=26;
    public static final int StringLiteral=23;
    public static final int WS=17;
    public static final int HASH_CONTENTS=39;
    public static final int NEWLINE=6;
    public static final int DoubleSuffix=33;
    public static final int UnicodeEscape=37;
    public static final int CHARLITERAL=36;
    public static final int JAVA_LBRACE=42;
    public static final int FLOATLITERAL=34;
    public static final int EscapeSequence=22;
    public static final int OctalEscape=38;
    public static final int FORWARD_SLASH=8;

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
            // ../etc/Jaml.g:112:6: ({...}? => '#' )
            // ../etc/Jaml.g:112:8: {...}? => '#'
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
            // ../etc/Jaml.g:113:4: ({...}? => '.' )
            // ../etc/Jaml.g:113:6: {...}? => '.'
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
            // ../etc/Jaml.g:114:8: ({...}? => '%' )
            // ../etc/Jaml.g:114:10: {...}? => '%'
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
            // ../etc/Jaml.g:115:14: ({...}? => '/' )
            // ../etc/Jaml.g:115:16: {...}? => '/'
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "FORWARD_SLASH", " !textMode ");
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
            // ../etc/Jaml.g:116:6: ({...}? => ',' )
            // ../etc/Jaml.g:116:8: {...}? => ','
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
            // ../etc/Jaml.g:117:5: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // ../etc/Jaml.g:117:7: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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

            // ../etc/Jaml.g:117:44: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
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
            // ../etc/Jaml.g:120:4: ({...}? => Spaces )
            // ../etc/Jaml.g:120:6: {...}? => Spaces
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "WS", " !textMode ");
            }
            mSpaces(); 
            if (!hashMode ) { skip(); textMode=true; }

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
            // ../etc/Jaml.g:123:18: ({...}? => NL )
            // ../etc/Jaml.g:123:20: {...}? => NL
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
             int tb = 0; 
            // ../etc/Jaml.g:126:23: ({...}? => ( NL ) ( ' ' )* )
            // ../etc/Jaml.g:126:24: {...}? => ( NL ) ( ' ' )*
            {
            if ( !(( !hashMode )) ) {
                throw new FailedPredicateException(input, "CHANGE_INDENT", " !hashMode ");
            }
            // ../etc/Jaml.g:127:2: ( NL )
            // ../etc/Jaml.g:127:3: NL
            {
            mNL(); 

            }

            // ../etc/Jaml.g:127:7: ( ' ' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../etc/Jaml.g:127:8: ' '
            	    {
            	    match(' '); 
            	    tb++;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            	          emit(new CommonToken(NEWLINE));
            	          System.out.println("NEWLINE");
            	          System.out.println(tb + "/" + currentIndentation);
            	          if (tb > currentIndentation) {
            	              emit(new CommonToken(INDENT));
            	              System.out.println("INDENT");
            	          } else if(tb < currentIndentation) {
            	              for(int i = 0; i < currentIndentation - tb; i+=2) {
            	    	          emit(new CommonToken(DEDENT));
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
            // ../etc/Jaml.g:147:3: ( ( '\\r' )? '\\n' )
            // ../etc/Jaml.g:147:5: ( '\\r' )? '\\n'
            {
            // ../etc/Jaml.g:147:5: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../etc/Jaml.g:147:5: '\\r'
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
            // ../etc/Jaml.g:149:17: ( ( ' ' )* )
            // ../etc/Jaml.g:149:19: ( ' ' )*
            {
            // ../etc/Jaml.g:149:19: ( ' ' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../etc/Jaml.g:149:20: ' '
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
            // ../etc/Jaml.g:150:16: ( ( ' ' )+ )
            // ../etc/Jaml.g:150:18: ( ' ' )+
            {
            // ../etc/Jaml.g:150:18: ( ' ' )+
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
            	    // ../etc/Jaml.g:150:19: ' '
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
            // ../etc/Jaml.g:152:14: ({...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // ../etc/Jaml.g:152:16: {...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "StringLiteral", " !textMode ");
            }
            match('\"'); 
            // ../etc/Jaml.g:153:9: ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
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
            	    // ../etc/Jaml.g:153:11: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:153:28: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
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

    // $ANTLR start "LONGLITERAL"
    public final void mLONGLITERAL() throws RecognitionException {
    traceIn("LONGLITERAL", 14);
        try {
            int _type = LONGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:157:5: ( IntegerNumber LongSuffix )
            // ../etc/Jaml.g:157:9: IntegerNumber LongSuffix
            {
            mIntegerNumber(); 
            mLongSuffix(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("LONGLITERAL", 14);
        }
    }
    // $ANTLR end "LONGLITERAL"

    // $ANTLR start "INTLITERAL"
    public final void mINTLITERAL() throws RecognitionException {
    traceIn("INTLITERAL", 15);
        try {
            int _type = INTLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:162:5: ( IntegerNumber )
            // ../etc/Jaml.g:162:9: IntegerNumber
            {
            mIntegerNumber(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("INTLITERAL", 15);
        }
    }
    // $ANTLR end "INTLITERAL"

    // $ANTLR start "IntegerNumber"
    public final void mIntegerNumber() throws RecognitionException {
    traceIn("IntegerNumber", 16);
        try {
            // ../etc/Jaml.g:167:5: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | HexPrefix ( HexDigit )+ )
            int alt10=4;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt10=4;
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
                    alt10=3;
                    }
                    break;
                default:
                    alt10=1;}

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
                    // ../etc/Jaml.g:167:9: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:168:9: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../etc/Jaml.g:168:18: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../etc/Jaml.g:168:19: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:169:9: '0' ( '0' .. '7' )+
                    {
                    match('0'); 
                    // ../etc/Jaml.g:169:13: ( '0' .. '7' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='7')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../etc/Jaml.g:169:14: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // ../etc/Jaml.g:170:9: HexPrefix ( HexDigit )+
                    {
                    mHexPrefix(); 
                    // ../etc/Jaml.g:170:19: ( HexDigit )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../etc/Jaml.g:170:19: HexDigit
                    	    {
                    	    mHexDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt9 >= 1 ) break loop9;
                                EarlyExitException eee =
                                    new EarlyExitException(9, input);
                                throw eee;
                        }
                        cnt9++;
                    } while (true);


                    }
                    break;

            }
        }
        finally {
    traceOut("IntegerNumber", 16);
        }
    }
    // $ANTLR end "IntegerNumber"

    // $ANTLR start "HexPrefix"
    public final void mHexPrefix() throws RecognitionException {
    traceIn("HexPrefix", 17);
        try {
            // ../etc/Jaml.g:175:5: ( '0x' | '0X' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='0') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='x') ) {
                    alt11=1;
                }
                else if ( (LA11_1=='X') ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../etc/Jaml.g:175:9: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:175:16: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }
        }
        finally {
    traceOut("HexPrefix", 17);
        }
    }
    // $ANTLR end "HexPrefix"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
    traceIn("HexDigit", 18);
        try {
            // ../etc/Jaml.g:180:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../etc/Jaml.g:180:9: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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

    // $ANTLR start "LongSuffix"
    public final void mLongSuffix() throws RecognitionException {
    traceIn("LongSuffix", 19);
        try {
            // ../etc/Jaml.g:185:5: ( 'l' | 'L' )
            // ../etc/Jaml.g:
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
    traceOut("LongSuffix", 19);
        }
    }
    // $ANTLR end "LongSuffix"

    // $ANTLR start "NonIntegerNumber"
    public final void mNonIntegerNumber() throws RecognitionException {
    traceIn("NonIntegerNumber", 20);
        try {
            // ../etc/Jaml.g:191:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent | ( '0' .. '9' )+ | HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            int alt24=5;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../etc/Jaml.g:191:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )?
                    {
                    // ../etc/Jaml.g:191:9: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../etc/Jaml.g:191:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // ../etc/Jaml.g:191:27: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../etc/Jaml.g:191:28: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../etc/Jaml.g:191:41: ( Exponent )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../etc/Jaml.g:191:41: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:192:9: '.' ( '0' .. '9' )+ ( Exponent )?
                    {
                    match('.'); 
                    // ../etc/Jaml.g:192:13: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../etc/Jaml.g:192:15: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // ../etc/Jaml.g:192:29: ( Exponent )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../etc/Jaml.g:192:29: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:193:9: ( '0' .. '9' )+ Exponent
                    {
                    // ../etc/Jaml.g:193:9: ( '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../etc/Jaml.g:193:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    mExponent(); 

                    }
                    break;
                case 4 :
                    // ../etc/Jaml.g:194:9: ( '0' .. '9' )+
                    {
                    // ../etc/Jaml.g:194:9: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../etc/Jaml.g:194:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    }
                    break;
                case 5 :
                    // ../etc/Jaml.g:196:9: HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    mHexPrefix(); 
                    // ../etc/Jaml.g:196:19: ( HexDigit )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='F')||(LA19_0>='a' && LA19_0<='f')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../etc/Jaml.g:196:20: HexDigit
                    	    {
                    	    mHexDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../etc/Jaml.g:197:9: ( () | ( '.' ( HexDigit )* ) )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='P'||LA21_0=='p') ) {
                        alt21=1;
                    }
                    else if ( (LA21_0=='.') ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../etc/Jaml.g:197:14: ()
                            {
                            // ../etc/Jaml.g:197:14: ()
                            // ../etc/Jaml.g:197:15: 
                            {
                            }


                            }
                            break;
                        case 2 :
                            // ../etc/Jaml.g:198:14: ( '.' ( HexDigit )* )
                            {
                            // ../etc/Jaml.g:198:14: ( '.' ( HexDigit )* )
                            // ../etc/Jaml.g:198:15: '.' ( HexDigit )*
                            {
                            match('.'); 
                            // ../etc/Jaml.g:198:19: ( HexDigit )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='F')||(LA20_0>='a' && LA20_0<='f')) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../etc/Jaml.g:198:20: HexDigit
                            	    {
                            	    mHexDigit(); 

                            	    }
                            	    break;

                            	default :
                            	    break loop20;
                                }
                            } while (true);


                            }


                            }
                            break;

                    }

                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // ../etc/Jaml.g:201:9: ( '+' | '-' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='+'||LA22_0=='-') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../etc/Jaml.g:
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

                    // ../etc/Jaml.g:202:9: ( '0' .. '9' )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../etc/Jaml.g:202:11: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);


                    }
                    break;

            }
        }
        finally {
    traceOut("NonIntegerNumber", 20);
        }
    }
    // $ANTLR end "NonIntegerNumber"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
    traceIn("Exponent", 21);
        try {
            // ../etc/Jaml.g:207:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../etc/Jaml.g:207:9: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../etc/Jaml.g:207:23: ( '+' | '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='+'||LA25_0=='-') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../etc/Jaml.g:
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

            // ../etc/Jaml.g:207:38: ( '0' .. '9' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../etc/Jaml.g:207:40: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

        }
        finally {
    traceOut("Exponent", 21);
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatSuffix"
    public final void mFloatSuffix() throws RecognitionException {
    traceIn("FloatSuffix", 22);
        try {
            // ../etc/Jaml.g:212:5: ( 'f' | 'F' )
            // ../etc/Jaml.g:
            {
            if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
    traceOut("FloatSuffix", 22);
        }
    }
    // $ANTLR end "FloatSuffix"

    // $ANTLR start "DoubleSuffix"
    public final void mDoubleSuffix() throws RecognitionException {
    traceIn("DoubleSuffix", 23);
        try {
            // ../etc/Jaml.g:217:5: ( 'd' | 'D' )
            // ../etc/Jaml.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
    traceOut("DoubleSuffix", 23);
        }
    }
    // $ANTLR end "DoubleSuffix"

    // $ANTLR start "FLOATLITERAL"
    public final void mFLOATLITERAL() throws RecognitionException {
    traceIn("FLOATLITERAL", 24);
        try {
            int _type = FLOATLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:221:5: ( NonIntegerNumber FloatSuffix )
            // ../etc/Jaml.g:221:9: NonIntegerNumber FloatSuffix
            {
            mNonIntegerNumber(); 
            mFloatSuffix(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("FLOATLITERAL", 24);
        }
    }
    // $ANTLR end "FLOATLITERAL"

    // $ANTLR start "DOUBLELITERAL"
    public final void mDOUBLELITERAL() throws RecognitionException {
    traceIn("DOUBLELITERAL", 25);
        try {
            int _type = DOUBLELITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:225:5: ( NonIntegerNumber ( DoubleSuffix )? )
            // ../etc/Jaml.g:225:9: NonIntegerNumber ( DoubleSuffix )?
            {
            mNonIntegerNumber(); 
            // ../etc/Jaml.g:225:26: ( DoubleSuffix )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='D'||LA27_0=='d') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../etc/Jaml.g:225:26: DoubleSuffix
                    {
                    mDoubleSuffix(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("DOUBLELITERAL", 25);
        }
    }
    // $ANTLR end "DOUBLELITERAL"

    // $ANTLR start "CHARLITERAL"
    public final void mCHARLITERAL() throws RecognitionException {
    traceIn("CHARLITERAL", 26);
        try {
            int _type = CHARLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:229:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\'' )
            // ../etc/Jaml.g:229:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\''
            {
            match('\''); 
            // ../etc/Jaml.g:230:9: ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\\') ) {
                alt28=1;
            }
            else if ( ((LA28_0>='\u0000' && LA28_0<='\t')||(LA28_0>='\u000B' && LA28_0<='\f')||(LA28_0>='\u000E' && LA28_0<='&')||(LA28_0>='(' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../etc/Jaml.g:230:13: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:231:13: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
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

            }

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("CHARLITERAL", 26);
        }
    }
    // $ANTLR end "CHARLITERAL"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
    traceIn("EscapeSequence", 27);
        try {
            // ../etc/Jaml.g:238:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0=='\\') ) {
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
                    alt29=1;
                    }
                    break;
                case 'u':
                    {
                    alt29=2;
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
                    alt29=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../etc/Jaml.g:238:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // ../etc/Jaml.g:239:7: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:240:7: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
    traceOut("EscapeSequence", 27);
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
    traceIn("OctalEscape", 28);
        try {
            // ../etc/Jaml.g:245:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\\') ) {
                int LA30_1 = input.LA(2);

                if ( ((LA30_1>='0' && LA30_1<='3')) ) {
                    int LA30_2 = input.LA(3);

                    if ( ((LA30_2>='0' && LA30_2<='7')) ) {
                        int LA30_5 = input.LA(4);

                        if ( ((LA30_5>='0' && LA30_5<='7')) ) {
                            alt30=1;
                        }
                        else {
                            alt30=2;}
                    }
                    else {
                        alt30=3;}
                }
                else if ( ((LA30_1>='4' && LA30_1<='7')) ) {
                    int LA30_3 = input.LA(3);

                    if ( ((LA30_3>='0' && LA30_3<='7')) ) {
                        alt30=2;
                    }
                    else {
                        alt30=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../etc/Jaml.g:245:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:245:12: ( '0' .. '3' )
                    // ../etc/Jaml.g:245:13: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ../etc/Jaml.g:245:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:245:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:245:34: ( '0' .. '7' )
                    // ../etc/Jaml.g:245:35: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:246:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:246:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:246:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:246:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:246:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:247:7: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:247:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:247:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
    traceOut("OctalEscape", 28);
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
    traceIn("UnicodeEscape", 29);
        try {
            // ../etc/Jaml.g:252:3: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // ../etc/Jaml.g:252:7: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
    traceOut("UnicodeEscape", 29);
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
    traceIn("TEXT", 30);
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:255:5: ({...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' ) ) (~ ( '\\r' | '\\n' ) )* )
            // ../etc/Jaml.g:255:7: {...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' ) ) (~ ( '\\r' | '\\n' ) )*
            {
            if ( !(( textMode )) ) {
                throw new FailedPredicateException(input, "TEXT", " textMode ");
            }
            // ../etc/Jaml.g:256:7: (~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' ) )
            // ../etc/Jaml.g:256:8: ~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            // ../etc/Jaml.g:257:7: (~ ( '\\r' | '\\n' ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\u0000' && LA31_0<='\t')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../etc/Jaml.g:257:8: ~ ( '\\r' | '\\n' )
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
            	    break loop31;
                }
            } while (true);

            beginningOfLine=false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("TEXT", 30);
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "HASH_CONTENTS"
    public final void mHASH_CONTENTS() throws RecognitionException {
    traceIn("HASH_CONTENTS", 31);
        try {
            int _type = HASH_CONTENTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:260:14: ({...}? => (~ ( '\"' | '\\'' | '{' | '}' ) ) )
            // ../etc/Jaml.g:260:16: {...}? => (~ ( '\"' | '\\'' | '{' | '}' ) )
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "HASH_CONTENTS", " hashMode ");
            }
            // ../etc/Jaml.g:261:7: (~ ( '\"' | '\\'' | '{' | '}' ) )
            // ../etc/Jaml.g:261:8: ~ ( '\"' | '\\'' | '{' | '}' )
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
    traceOut("HASH_CONTENTS", 31);
        }
    }
    // $ANTLR end "HASH_CONTENTS"

    // $ANTLR start "BEGIN_HASH"
    public final void mBEGIN_HASH() throws RecognitionException {
    traceIn("BEGIN_HASH", 32);
        try {
            int _type = BEGIN_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:264:13: ({...}? => LBRACE )
            // ../etc/Jaml.g:264:15: {...}? => LBRACE
            {
            if ( !(( !textMode && braceDepth == 0 )) ) {
                throw new FailedPredicateException(input, "BEGIN_HASH", " !textMode && braceDepth == 0 ");
            }
            mLBRACE(); 
            hashMode=true;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("BEGIN_HASH", 32);
        }
    }
    // $ANTLR end "BEGIN_HASH"

    // $ANTLR start "END_HASH"
    public final void mEND_HASH() throws RecognitionException {
    traceIn("END_HASH", 33);
        try {
            int _type = END_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:265:11: ({...}? => RBRACE )
            // ../etc/Jaml.g:265:13: {...}? => RBRACE
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
    traceOut("END_HASH", 33);
        }
    }
    // $ANTLR end "END_HASH"

    // $ANTLR start "JAVA_LBRACE"
    public final void mJAVA_LBRACE() throws RecognitionException {
    traceIn("JAVA_LBRACE", 34);
        try {
            int _type = JAVA_LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:267:13: ({...}? => LBRACE )
            // ../etc/Jaml.g:267:15: {...}? => LBRACE
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
    traceOut("JAVA_LBRACE", 34);
        }
    }
    // $ANTLR end "JAVA_LBRACE"

    // $ANTLR start "JAVA_RBRACE"
    public final void mJAVA_RBRACE() throws RecognitionException {
    traceIn("JAVA_RBRACE", 35);
        try {
            int _type = JAVA_RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:268:13: ({...}? => RBRACE )
            // ../etc/Jaml.g:268:15: {...}? => RBRACE
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
    traceOut("JAVA_RBRACE", 35);
        }
    }
    // $ANTLR end "JAVA_RBRACE"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
    traceIn("LBRACE", 36);
        try {
            // ../etc/Jaml.g:270:17: ({...}? => '{' )
            // ../etc/Jaml.g:270:19: {...}? => '{'
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "LBRACE", " !textMode ");
            }
            match('{'); 
            braceDepth++;

            }

        }
        finally {
    traceOut("LBRACE", 36);
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
    traceIn("RBRACE", 37);
        try {
            // ../etc/Jaml.g:271:18: ({...}? => '}' )
            // ../etc/Jaml.g:271:20: {...}? => '}'
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "RBRACE", " hashMode ");
            }
            match('}'); 
            braceDepth--;

            }

        }
        finally {
    traceOut("RBRACE", 37);
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
    traceIn("NEWLINE", 38);
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:275:9: ({...}? => ' ' )
            // ../etc/Jaml.g:275:11: {...}? => ' '
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
    traceOut("NEWLINE", 38);
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "INDENT"
    public final void mINDENT() throws RecognitionException {
    traceIn("INDENT", 39);
        try {
            int _type = INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:276:8: ({...}? => ' ' )
            // ../etc/Jaml.g:276:10: {...}? => ' '
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
    traceOut("INDENT", 39);
        }
    }
    // $ANTLR end "INDENT"

    // $ANTLR start "DEDENT"
    public final void mDEDENT() throws RecognitionException {
    traceIn("DEDENT", 40);
        try {
            int _type = DEDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:277:8: ({...}? => ' ' )
            // ../etc/Jaml.g:277:10: {...}? => ' '
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
    traceOut("DEDENT", 40);
        }
    }
    // $ANTLR end "DEDENT"

    public void mTokens() throws RecognitionException {
        // ../etc/Jaml.g:1:8: ( POUND | DOT | PERCENT | FORWARD_SLASH | COMMA | ID | WS | IGNORED_NEWLINE | CHANGE_INDENT | StringLiteral | LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | TEXT | HASH_CONTENTS | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | NEWLINE | INDENT | DEDENT )
        int alt32=24;
        alt32 = dfa32.predict(input);
        switch (alt32) {
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
                // ../etc/Jaml.g:1:98: LONGLITERAL
                {
                mLONGLITERAL(); 

                }
                break;
            case 12 :
                // ../etc/Jaml.g:1:110: INTLITERAL
                {
                mINTLITERAL(); 

                }
                break;
            case 13 :
                // ../etc/Jaml.g:1:121: FLOATLITERAL
                {
                mFLOATLITERAL(); 

                }
                break;
            case 14 :
                // ../etc/Jaml.g:1:134: DOUBLELITERAL
                {
                mDOUBLELITERAL(); 

                }
                break;
            case 15 :
                // ../etc/Jaml.g:1:148: CHARLITERAL
                {
                mCHARLITERAL(); 

                }
                break;
            case 16 :
                // ../etc/Jaml.g:1:160: TEXT
                {
                mTEXT(); 

                }
                break;
            case 17 :
                // ../etc/Jaml.g:1:165: HASH_CONTENTS
                {
                mHASH_CONTENTS(); 

                }
                break;
            case 18 :
                // ../etc/Jaml.g:1:179: BEGIN_HASH
                {
                mBEGIN_HASH(); 

                }
                break;
            case 19 :
                // ../etc/Jaml.g:1:190: END_HASH
                {
                mEND_HASH(); 

                }
                break;
            case 20 :
                // ../etc/Jaml.g:1:199: JAVA_LBRACE
                {
                mJAVA_LBRACE(); 

                }
                break;
            case 21 :
                // ../etc/Jaml.g:1:211: JAVA_RBRACE
                {
                mJAVA_RBRACE(); 

                }
                break;
            case 22 :
                // ../etc/Jaml.g:1:223: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 23 :
                // ../etc/Jaml.g:1:231: INDENT
                {
                mINDENT(); 

                }
                break;
            case 24 :
                // ../etc/Jaml.g:1:238: DEDENT
                {
                mDEDENT(); 

                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA24_eotS =
        "\1\uffff\1\7\1\uffff\1\7\4\uffff";
    static final String DFA24_eofS =
        "\10\uffff";
    static final String DFA24_minS =
        "\2\56\1\uffff\1\56\4\uffff";
    static final String DFA24_maxS =
        "\1\71\1\170\1\uffff\1\145\4\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\uffff\1\5\1\3\1\1\1\4";
    static final String DFA24_specialS =
        "\10\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\1\uffff\1\1\11\3",
            "\1\6\1\uffff\12\3\13\uffff\1\5\22\uffff\1\4\14\uffff\1\5\22"+
            "\uffff\1\4",
            "",
            "\1\6\1\uffff\12\3\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "189:1: fragment NonIntegerNumber : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent | ( '0' .. '9' )+ | HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ );";
        }
    }
    static final String DFA32_eotS =
        "\1\uffff\1\21\1\23\1\24\1\25\1\27\1\30\1\32\1\35\1\36\1\26\2\51"+
        "\1\26\1\60\1\61\1\62\1\uffff\1\65\6\uffff\1\74\2\uffff\1\100\3\uffff"+
        "\2\26\1\106\2\26\1\112\1\51\1\26\1\117\1\uffff\1\120\1\121\1\122"+
        "\1\51\2\26\22\uffff\4\26\1\uffff\1\142\2\26\1\uffff\1\146\2\26\1"+
        "\151\4\uffff\4\26\1\156\5\uffff\1\65\3\26\2\uffff\1\26\1\161\1\26"+
        "\1\uffff\1\26\1\162\2\uffff\3\26\1\uffff\2\26\2\uffff\2\26\1\uffff"+
        "\4\26";
    static final String DFA32_eofS =
        "\172\uffff";
    static final String DFA32_minS =
        "\2\0\1\60\4\0\1\40\1\12\1\40\10\0\1\60\3\0\1\uffff\4\0\1\uffff\1"+
        "\40\1\uffff\1\0\1\uffff\1\42\2\0\2\56\2\0\1\53\1\0\1\uffff\4\0\1"+
        "\42\1\47\3\0\1\uffff\1\53\7\uffff\1\0\3\uffff\1\0\1\uffff\1\0\1"+
        "\60\4\0\1\53\1\60\2\0\1\53\1\60\5\0\1\47\1\60\2\47\1\0\4\uffff\3"+
        "\60\2\0\1\uffff\1\0\1\60\1\0\1\60\1\0\1\60\2\0\1\uffff\1\60\2\47"+
        "\1\0\1\60\3\0\1\60\1\47\1\uffff\2\60\1\0\1\47";
    static final String DFA32_maxS =
        "\1\uffff\1\0\1\71\1\0\3\uffff\1\40\1\12\1\40\7\uffff\1\0\1\146\3"+
        "\0\1\uffff\2\0\1\uffff\1\0\1\uffff\1\40\1\uffff\1\0\1\uffff\1\165"+
        "\2\uffff\2\160\2\uffff\1\71\1\uffff\1\uffff\4\uffff\1\165\1\47\3"+
        "\0\1\uffff\1\71\7\uffff\1\0\3\uffff\1\0\1\uffff\1\uffff\1\146\2"+
        "\uffff\1\0\1\uffff\1\71\1\160\1\0\1\uffff\2\71\1\uffff\4\0\1\47"+
        "\1\146\2\67\1\uffff\4\uffff\1\71\2\146\2\uffff\1\uffff\1\0\1\71"+
        "\1\uffff\1\160\1\0\1\71\1\uffff\1\0\1\uffff\1\146\1\67\1\47\1\0"+
        "\1\146\1\uffff\2\0\1\146\1\47\1\uffff\2\146\1\uffff\1\47";
    static final String DFA32_acceptS =
        "\26\uffff\1\20\4\uffff\1\7\1\uffff\1\21\1\uffff\1\11\11\uffff\1"+
        "\14\11\uffff\1\1\1\uffff\1\16\1\15\1\2\1\3\1\4\1\5\1\6\1\uffff\1"+
        "\26\1\27\1\30\1\uffff\1\10\26\uffff\1\22\1\24\1\23\1\25\5\uffff"+
        "\1\12\10\uffff\1\13\12\uffff\1\17\4\uffff";
    static final String DFA32_specialS =
        "\1\46\1\112\1\57\1\123\1\100\1\44\1\15\1\33\1\133\1\117\1\115\1"+
        "\116\1\52\1\37\1\126\1\6\1\104\1\54\1\uffff\1\53\1\64\1\11\1\uffff"+
        "\1\12\1\13\1\120\1\65\1\uffff\1\24\1\uffff\1\10\1\uffff\1\1\1\125"+
        "\1\31\1\103\1\134\1\113\1\22\1\40\1\61\1\uffff\1\34\1\21\1\111\1"+
        "\50\1\25\1\102\1\66\1\3\1\4\11\uffff\1\63\3\uffff\1\55\1\uffff\1"+
        "\105\1\45\1\14\1\20\1\62\1\26\1\5\1\2\1\73\1\131\1\41\1\36\1\30"+
        "\1\101\1\74\1\75\1\60\1\23\1\135\1\124\1\43\1\0\6\uffff\1\106\1"+
        "\121\1\114\1\uffff\1\77\1\42\1\32\1\56\1\72\1\35\1\17\1\71\1\uffff"+
        "\1\130\1\27\1\51\1\76\1\107\1\122\1\70\1\67\1\127\1\47\1\uffff\1"+
        "\110\1\132\1\7\1\16}>";
    static final String[] DFA32_transitionS = {
            "\12\16\1\11\2\16\1\10\22\16\1\7\1\16\1\12\1\1\1\16\1\3\1\16"+
            "\1\15\4\16\1\5\1\16\1\2\1\4\1\13\11\14\7\16\32\6\6\16\32\6\1"+
            "\17\1\16\1\20\uff82\16",
            "\1\uffff",
            "\12\22",
            "\1\uffff",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
            "\12\26\1\uffff\2\26\1\uffff\42\26\12\31\7\26\32\31\6\26\32"+
            "\31\uff85\26",
            "\1\33",
            "\1\34",
            "\1\37",
            "\12\41\1\uffff\2\41\1\uffff\24\41\1\42\71\41\1\40\uffa3\41",
            "\12\26\1\uffff\2\26\1\uffff\40\26\1\45\1\26\10\46\2\52\12\26"+
            "\1\53\1\47\1\50\5\26\1\54\13\26\1\44\13\26\1\53\1\47\1\50\5"+
            "\26\1\54\13\26\1\43\uff87\26",
            "\12\26\1\uffff\2\26\1\uffff\40\26\1\45\1\26\12\55\12\26\1\53"+
            "\1\47\1\50\5\26\1\54\27\26\1\53\1\47\1\50\5\26\1\54\uff93\26",
            "\12\57\1\uffff\2\57\1\uffff\31\57\1\uffff\64\57\1\56\uffa3"+
            "\57",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
            "\1\uffff",
            "\12\22\13\uffff\1\64\1\66\36\uffff\1\64\1\66",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\12\26\1\uffff\2\26\1\uffff\42\26\12\31\7\26\32\31\6\26\32"+
            "\31\uff85\26",
            "\1\uffff",
            "",
            "\1\37",
            "",
            "\1\uffff",
            "",
            "\1\102\4\uffff\1\102\10\uffff\4\104\4\105\44\uffff\1\102\5"+
            "\uffff\1\102\3\uffff\1\102\7\uffff\1\102\3\uffff\1\102\1\uffff"+
            "\1\102\1\103",
            "\12\41\1\uffff\2\41\1\uffff\24\41\1\42\71\41\1\40\uffa3\41",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
            "\1\111\1\uffff\12\107\7\uffff\6\107\11\uffff\1\110\20\uffff"+
            "\6\107\11\uffff\1\110",
            "\1\111\1\uffff\12\107\7\uffff\6\107\11\uffff\1\110\20\uffff"+
            "\6\107\11\uffff\1\110",
            "\12\26\1\uffff\2\26\1\uffff\42\26\12\113\12\26\1\53\1\114\1"+
            "\50\35\26\1\53\1\114\1\50\uff99\26",
            "\12\26\1\uffff\2\26\1\uffff\40\26\1\45\1\26\10\46\2\52\12\26"+
            "\1\53\1\47\1\50\5\26\1\54\27\26\1\53\1\47\1\50\5\26\1\54\uff93"+
            "\26",
            "\1\115\1\uffff\1\115\2\uffff\12\116",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
            "",
            "\12\26\1\uffff\2\26\1\uffff\40\26\1\45\1\26\12\52\12\26\1\53"+
            "\1\47\1\50\35\26\1\53\1\47\1\50\uff99\26",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
            "\12\26\1\uffff\2\26\1\uffff\40\26\1\45\1\26\12\55\12\26\1\53"+
            "\1\47\1\50\5\26\1\54\27\26\1\53\1\47\1\50\5\26\1\54\uff93\26",
            "\1\123\4\uffff\1\123\10\uffff\4\125\4\126\44\uffff\1\123\5"+
            "\uffff\1\123\3\uffff\1\123\7\uffff\1\123\3\uffff\1\123\1\uffff"+
            "\1\123\1\124",
            "\1\127",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\134\1\uffff\1\134\2\uffff\12\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\12\41\1\uffff\2\41\1\uffff\24\41\1\42\71\41\1\40\uffa3\41",
            "\12\136\7\uffff\6\136\32\uffff\6\136",
            "\12\41\1\uffff\2\41\1\uffff\24\41\1\42\15\41\10\137\44\41\1"+
            "\40\uffa3\41",
            "\12\41\1\uffff\2\41\1\uffff\24\41\1\42\15\41\10\140\44\41\1"+
            "\40\uffa3\41",
            "\1\uffff",
            "\12\26\1\uffff\2\26\1\uffff\40\26\1\111\1\26\12\107\7\26\6"+
            "\107\5\26\1\54\3\26\1\110\20\26\6\107\5\26\1\54\3\26\1\110\uff8f"+
            "\26",
            "\1\143\1\uffff\1\143\2\uffff\12\144",
            "\12\145\7\uffff\6\145\11\uffff\1\110\20\uffff\6\145\11\uffff"+
            "\1\110",
            "\1\uffff",
            "\12\26\1\uffff\2\26\1\uffff\42\26\12\113\12\26\1\53\1\114\1"+
            "\50\35\26\1\53\1\114\1\50\uff99\26",
            "\1\147\1\uffff\1\147\2\uffff\12\150",
            "\12\116",
            "\12\26\1\uffff\2\26\1\uffff\42\26\12\116\12\26\1\53\1\26\1"+
            "\50\35\26\1\53\1\26\1\50\uff99\26",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\127",
            "\12\153\7\uffff\6\153\32\uffff\6\153",
            "\1\127\10\uffff\10\154",
            "\1\127\10\uffff\10\155",
            "\12\26\1\uffff\2\26\1\uffff\ufff2\26",
            "",
            "",
            "",
            "",
            "\12\135",
            "\12\135\14\uffff\1\66\37\uffff\1\66",
            "\12\157\7\uffff\6\157\32\uffff\6\157",
            "\12\41\1\uffff\2\41\1\uffff\24\41\1\42\15\41\10\160\44\41\1"+
            "\40\uffa3\41",
            "\12\41\1\uffff\2\41\1\uffff\24\41\1\42\71\41\1\40\uffa3\41",
            "",
            "\1\uffff",
            "\12\144",
            "\12\26\1\uffff\2\26\1\uffff\42\26\12\144\12\26\1\53\1\26\1"+
            "\50\35\26\1\53\1\26\1\50\uff99\26",
            "\12\145\7\uffff\6\145\11\uffff\1\110\20\uffff\6\145\11\uffff"+
            "\1\110",
            "\1\uffff",
            "\12\150",
            "\12\26\1\uffff\2\26\1\uffff\42\26\12\150\12\26\1\53\1\26\1"+
            "\50\35\26\1\53\1\26\1\50\uff99\26",
            "\1\uffff",
            "",
            "\12\163\7\uffff\6\163\32\uffff\6\163",
            "\1\127\10\uffff\10\164",
            "\1\127",
            "\1\uffff",
            "\12\166\7\uffff\6\166\32\uffff\6\166",
            "\12\41\1\uffff\2\41\1\uffff\24\41\1\42\71\41\1\40\uffa3\41",
            "\1\uffff",
            "\1\uffff",
            "\12\167\7\uffff\6\167\32\uffff\6\167",
            "\1\127",
            "",
            "\12\170\7\uffff\6\170\32\uffff\6\170",
            "\12\171\7\uffff\6\171\32\uffff\6\171",
            "\12\41\1\uffff\2\41\1\uffff\24\41\1\42\71\41\1\40\uffa3\41",
            "\1\127"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( POUND | DOT | PERCENT | FORWARD_SLASH | COMMA | ID | WS | IGNORED_NEWLINE | CHANGE_INDENT | StringLiteral | LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | TEXT | HASH_CONTENTS | BEGIN_HASH | END_HASH | JAVA_LBRACE | JAVA_RBRACE | NEWLINE | INDENT | DEDENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_87 = input.LA(1);

                         
                        int index32_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_87>='\u0000' && LA32_87<='\t')||(LA32_87>='\u000B' && LA32_87<='\f')||(LA32_87>='\u000E' && LA32_87<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 110;

                         
                        input.seek(index32_87);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_32 = input.LA(1);

                         
                        int index32_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_32=='\"'||LA32_32=='\''||LA32_32=='\\'||LA32_32=='b'||LA32_32=='f'||LA32_32=='n'||LA32_32=='r'||LA32_32=='t') && ((( !textMode )||( textMode )))) {s = 66;}

                        else if ( (LA32_32=='u') && ((( !textMode )||( textMode )))) {s = 67;}

                        else if ( ((LA32_32>='0' && LA32_32<='3')) && ((( !textMode )||( textMode )))) {s = 68;}

                        else if ( ((LA32_32>='4' && LA32_32<='7')) && ((( !textMode )||( textMode )))) {s = 69;}

                        else s = 22;

                         
                        input.seek(index32_32);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_73 = input.LA(1);

                         
                        int index32_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_73>='0' && LA32_73<='9')||(LA32_73>='A' && LA32_73<='F')||(LA32_73>='a' && LA32_73<='f')) ) {s = 101;}

                        else if ( (LA32_73=='P'||LA32_73=='p') ) {s = 72;}

                        else s = 22;

                         
                        input.seek(index32_73);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_49 = input.LA(1);

                         
                        int index32_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( textMode )) ) {s = 22;}

                        else if ( ((( !textMode && braceDepth == 0 )&&( !textMode ))) ) {s = 88;}

                        else if ( ((( hashMode )&&( !textMode ))) ) {s = 89;}

                         
                        input.seek(index32_49);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_50 = input.LA(1);

                         
                        int index32_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( textMode )) ) {s = 22;}

                        else if ( ((( braceDepth == 1 )&&( hashMode ))) ) {s = 90;}

                        else if ( ((( braceDepth > 1 )&&( hashMode ))) ) {s = 91;}

                         
                        input.seek(index32_50);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_72 = input.LA(1);

                         
                        int index32_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_72=='+'||LA32_72=='-') ) {s = 99;}

                        else if ( ((LA32_72>='0' && LA32_72<='9')) ) {s = 100;}

                        else s = 22;

                         
                        input.seek(index32_72);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_15 = input.LA(1);

                         
                        int index32_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_15>='\u0000' && LA32_15<='\t')||(LA32_15>='\u000B' && LA32_15<='\f')||(LA32_15>='\u000E' && LA32_15<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 49;

                         
                        input.seek(index32_15);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_120 = input.LA(1);

                         
                        int index32_120 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_120=='\"') && ((( !textMode )||( textMode )))) {s = 34;}

                        else if ( (LA32_120=='\\') && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( ((LA32_120>='\u0000' && LA32_120<='\t')||(LA32_120>='\u000B' && LA32_120<='\f')||(LA32_120>='\u000E' && LA32_120<='!')||(LA32_120>='#' && LA32_120<='[')||(LA32_120>=']' && LA32_120<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 33;}

                        else s = 22;

                         
                        input.seek(index32_120);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_30 = input.LA(1);

                         
                        int index32_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 65;}

                        else if ( (( !hashMode )) ) {s = 31;}

                        else if ( (( hashMode )) ) {s = 29;}

                         
                        input.seek(index32_30);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_21 = input.LA(1);

                         
                        int index32_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 57;}

                        else if ( (( textMode )) ) {s = 22;}

                        else if ( (( hashMode )) ) {s = 29;}

                         
                        input.seek(index32_21);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_23 = input.LA(1);

                         
                        int index32_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 58;}

                        else if ( (( textMode )) ) {s = 22;}

                        else if ( (( hashMode )) ) {s = 29;}

                         
                        input.seek(index32_23);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_24 = input.LA(1);

                         
                        int index32_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 59;}

                        else if ( (( textMode )) ) {s = 22;}

                        else if ( (( hashMode )) ) {s = 29;}

                         
                        input.seek(index32_24);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_68 = input.LA(1);

                         
                        int index32_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_68>='0' && LA32_68<='7')) && ((( !textMode )||( textMode )))) {s = 95;}

                        else if ( (LA32_68=='\"') && ((( !textMode )||( textMode )))) {s = 34;}

                        else if ( (LA32_68=='\\') && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( ((LA32_68>='\u0000' && LA32_68<='\t')||(LA32_68>='\u000B' && LA32_68<='\f')||(LA32_68>='\u000E' && LA32_68<='!')||(LA32_68>='#' && LA32_68<='/')||(LA32_68>='8' && LA32_68<='[')||(LA32_68>=']' && LA32_68<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 33;}

                        else s = 22;

                         
                        input.seek(index32_68);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_6>='0' && LA32_6<='9')||(LA32_6>='A' && LA32_6<='Z')||(LA32_6>='a' && LA32_6<='z')) && ((( !textMode )||( textMode )))) {s = 25;}

                        else if ( ((LA32_6>='\u0000' && LA32_6<='\t')||(LA32_6>='\u000B' && LA32_6<='\f')||(LA32_6>='\u000E' && LA32_6<='/')||(LA32_6>=':' && LA32_6<='@')||(LA32_6>='[' && LA32_6<='`')||(LA32_6>='{' && LA32_6<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 24;

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_121 = input.LA(1);

                         
                        int index32_121 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_121=='\'') ) {s = 87;}

                        else s = 22;

                         
                        input.seek(index32_121);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_104 = input.LA(1);

                         
                        int index32_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_104=='D'||LA32_104=='d') ) {s = 43;}

                        else if ( ((LA32_104>='0' && LA32_104<='9')) ) {s = 104;}

                        else if ( (LA32_104=='F'||LA32_104=='f') ) {s = 40;}

                        else if ( ((LA32_104>='\u0000' && LA32_104<='\t')||(LA32_104>='\u000B' && LA32_104<='\f')||(LA32_104>='\u000E' && LA32_104<='/')||(LA32_104>=':' && LA32_104<='C')||LA32_104=='E'||(LA32_104>='G' && LA32_104<='c')||LA32_104=='e'||(LA32_104>='g' && LA32_104<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 114;

                         
                        input.seek(index32_104);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA32_69 = input.LA(1);

                         
                        int index32_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_69>='0' && LA32_69<='7')) && ((( !textMode )||( textMode )))) {s = 96;}

                        else if ( (LA32_69=='\"') && ((( !textMode )||( textMode )))) {s = 34;}

                        else if ( (LA32_69=='\\') && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( ((LA32_69>='\u0000' && LA32_69<='\t')||(LA32_69>='\u000B' && LA32_69<='\f')||(LA32_69>='\u000E' && LA32_69<='!')||(LA32_69>='#' && LA32_69<='/')||(LA32_69>='8' && LA32_69<='[')||(LA32_69>=']' && LA32_69<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 33;}

                        else s = 22;

                         
                        input.seek(index32_69);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA32_43 = input.LA(1);

                         
                        int index32_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_43>='\u0000' && LA32_43<='\t')||(LA32_43>='\u000B' && LA32_43<='\f')||(LA32_43>='\u000E' && LA32_43<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 81;

                         
                        input.seek(index32_43);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA32_38 = input.LA(1);

                         
                        int index32_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_38=='L'||LA32_38=='l') ) {s = 44;}

                        else if ( ((LA32_38>='0' && LA32_38<='7')) ) {s = 38;}

                        else if ( (LA32_38=='F'||LA32_38=='f') ) {s = 40;}

                        else if ( ((LA32_38>='8' && LA32_38<='9')) ) {s = 42;}

                        else if ( (LA32_38=='E'||LA32_38=='e') ) {s = 39;}

                        else if ( (LA32_38=='.') ) {s = 37;}

                        else if ( (LA32_38=='D'||LA32_38=='d') ) {s = 43;}

                        else if ( ((LA32_38>='\u0000' && LA32_38<='\t')||(LA32_38>='\u000B' && LA32_38<='\f')||(LA32_38>='\u000E' && LA32_38<='-')||LA32_38=='/'||(LA32_38>=':' && LA32_38<='C')||(LA32_38>='G' && LA32_38<='K')||(LA32_38>='M' && LA32_38<='c')||(LA32_38>='g' && LA32_38<='k')||(LA32_38>='m' && LA32_38<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 41;

                         
                        input.seek(index32_38);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA32_83 = input.LA(1);

                         
                        int index32_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_83=='\'') ) {s = 87;}

                        else s = 22;

                         
                        input.seek(index32_83);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA32_28 = input.LA(1);

                         
                        int index32_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_28==' ') && (( !hashMode ))) {s = 31;}

                        else s = 64;

                         
                        input.seek(index32_28);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA32_46 = input.LA(1);

                         
                        int index32_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_46=='\"'||LA32_46=='\''||LA32_46=='\\'||LA32_46=='b'||LA32_46=='f'||LA32_46=='n'||LA32_46=='r'||LA32_46=='t') ) {s = 83;}

                        else if ( (LA32_46=='u') ) {s = 84;}

                        else if ( ((LA32_46>='0' && LA32_46<='3')) ) {s = 85;}

                        else if ( ((LA32_46>='4' && LA32_46<='7')) ) {s = 86;}

                        else s = 22;

                         
                        input.seek(index32_46);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA32_71 = input.LA(1);

                         
                        int index32_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_71=='L'||LA32_71=='l') ) {s = 44;}

                        else if ( ((LA32_71>='0' && LA32_71<='9')||(LA32_71>='A' && LA32_71<='F')||(LA32_71>='a' && LA32_71<='f')) ) {s = 71;}

                        else if ( (LA32_71=='P'||LA32_71=='p') ) {s = 72;}

                        else if ( (LA32_71=='.') ) {s = 73;}

                        else if ( ((LA32_71>='\u0000' && LA32_71<='\t')||(LA32_71>='\u000B' && LA32_71<='\f')||(LA32_71>='\u000E' && LA32_71<='-')||LA32_71=='/'||(LA32_71>=':' && LA32_71<='@')||(LA32_71>='G' && LA32_71<='K')||(LA32_71>='M' && LA32_71<='O')||(LA32_71>='Q' && LA32_71<='`')||(LA32_71>='g' && LA32_71<='k')||(LA32_71>='m' && LA32_71<='o')||(LA32_71>='q' && LA32_71<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 98;

                         
                        input.seek(index32_71);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA32_108 = input.LA(1);

                         
                        int index32_108 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_108>='0' && LA32_108<='7')) ) {s = 116;}

                        else if ( (LA32_108=='\'') ) {s = 87;}

                        else s = 22;

                         
                        input.seek(index32_108);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA32_78 = input.LA(1);

                         
                        int index32_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_78=='D'||LA32_78=='d') ) {s = 43;}

                        else if ( ((LA32_78>='0' && LA32_78<='9')) ) {s = 78;}

                        else if ( (LA32_78=='F'||LA32_78=='f') ) {s = 40;}

                        else if ( ((LA32_78>='\u0000' && LA32_78<='\t')||(LA32_78>='\u000B' && LA32_78<='\f')||(LA32_78>='\u000E' && LA32_78<='/')||(LA32_78>=':' && LA32_78<='C')||LA32_78=='E'||(LA32_78>='G' && LA32_78<='c')||LA32_78=='e'||(LA32_78>='g' && LA32_78<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 105;

                         
                        input.seek(index32_78);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA32_34 = input.LA(1);

                         
                        int index32_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_34>='\u0000' && LA32_34<='\t')||(LA32_34>='\u000B' && LA32_34<='\f')||(LA32_34>='\u000E' && LA32_34<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 70;

                         
                        input.seek(index32_34);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA32_100 = input.LA(1);

                         
                        int index32_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_100=='F'||LA32_100=='f') ) {s = 40;}

                        else if ( ((LA32_100>='0' && LA32_100<='9')) ) {s = 100;}

                        else if ( (LA32_100=='D'||LA32_100=='d') ) {s = 43;}

                        else if ( ((LA32_100>='\u0000' && LA32_100<='\t')||(LA32_100>='\u000B' && LA32_100<='\f')||(LA32_100>='\u000E' && LA32_100<='/')||(LA32_100>=':' && LA32_100<='C')||LA32_100=='E'||(LA32_100>='G' && LA32_100<='c')||LA32_100=='e'||(LA32_100>='g' && LA32_100<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 113;

                         
                        input.seek(index32_100);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_7==' ') && (( !textMode ))) {s = 27;}

                        else s = 26;

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA32_42 = input.LA(1);

                         
                        int index32_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_42=='F'||LA32_42=='f') ) {s = 40;}

                        else if ( ((LA32_42>='0' && LA32_42<='9')) ) {s = 42;}

                        else if ( (LA32_42=='E'||LA32_42=='e') ) {s = 39;}

                        else if ( (LA32_42=='.') ) {s = 37;}

                        else if ( (LA32_42=='D'||LA32_42=='d') ) {s = 43;}

                        else if ( ((LA32_42>='\u0000' && LA32_42<='\t')||(LA32_42>='\u000B' && LA32_42<='\f')||(LA32_42>='\u000E' && LA32_42<='-')||LA32_42=='/'||(LA32_42>=':' && LA32_42<='C')||(LA32_42>='G' && LA32_42<='c')||(LA32_42>='g' && LA32_42<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 80;

                         
                        input.seek(index32_42);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA32_103 = input.LA(1);

                         
                        int index32_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_103>='0' && LA32_103<='9')) ) {s = 104;}

                        else s = 22;

                         
                        input.seek(index32_103);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA32_77 = input.LA(1);

                         
                        int index32_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_77>='0' && LA32_77<='9')) ) {s = 78;}

                        else s = 22;

                         
                        input.seek(index32_77);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA32_13 = input.LA(1);

                         
                        int index32_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_13=='\\') ) {s = 46;}

                        else if ( ((LA32_13>='\u0000' && LA32_13<='\t')||(LA32_13>='\u000B' && LA32_13<='\f')||(LA32_13>='\u000E' && LA32_13<='&')||(LA32_13>='(' && LA32_13<='[')||(LA32_13>=']' && LA32_13<='\uFFFF')) ) {s = 47;}

                        else s = 22;

                         
                        input.seek(index32_13);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA32_39 = input.LA(1);

                         
                        int index32_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_39=='+'||LA32_39=='-') ) {s = 77;}

                        else if ( ((LA32_39>='0' && LA32_39<='9')) ) {s = 78;}

                        else s = 22;

                         
                        input.seek(index32_39);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA32_76 = input.LA(1);

                         
                        int index32_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_76=='+'||LA32_76=='-') ) {s = 103;}

                        else if ( ((LA32_76>='0' && LA32_76<='9')) ) {s = 104;}

                        else s = 22;

                         
                        input.seek(index32_76);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA32_99 = input.LA(1);

                         
                        int index32_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_99>='0' && LA32_99<='9')) ) {s = 100;}

                        else s = 22;

                         
                        input.seek(index32_99);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA32_86 = input.LA(1);

                         
                        int index32_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_86>='0' && LA32_86<='7')) ) {s = 109;}

                        else if ( (LA32_86=='\'') ) {s = 87;}

                        else s = 22;

                         
                        input.seek(index32_86);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_5>='\u0000' && LA32_5<='\t')||(LA32_5>='\u000B' && LA32_5<='\f')||(LA32_5>='\u000E' && LA32_5<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 23;

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA32_67 = input.LA(1);

                         
                        int index32_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_67>='0' && LA32_67<='9')||(LA32_67>='A' && LA32_67<='F')||(LA32_67>='a' && LA32_67<='f')) && ((( !textMode )||( textMode )))) {s = 94;}

                        else s = 22;

                         
                        input.seek(index32_67);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_0=='#') && ((( beginningOfLine )||( hashMode )))) {s = 1;}

                        else if ( (LA32_0=='.') ) {s = 2;}

                        else if ( (LA32_0=='%') && ((( beginningOfLine )||( hashMode )))) {s = 3;}

                        else if ( (LA32_0=='/') && ((( !textMode )||( textMode )||( hashMode )))) {s = 4;}

                        else if ( (LA32_0==',') && ((( !textMode )||( textMode )||( hashMode )))) {s = 5;}

                        else if ( ((LA32_0>='A' && LA32_0<='Z')||(LA32_0>='a' && LA32_0<='z')) && ((( !textMode )||( textMode )||( hashMode )))) {s = 6;}

                        else if ( (LA32_0==' ') && ((( !textMode )||(false)||( hashMode )))) {s = 7;}

                        else if ( (LA32_0=='\r') && ((( !hashMode )||( hashMode )))) {s = 8;}

                        else if ( (LA32_0=='\n') && ((( !hashMode )||( hashMode )))) {s = 9;}

                        else if ( (LA32_0=='\"') && ((( !textMode )||( textMode )))) {s = 10;}

                        else if ( (LA32_0=='0') ) {s = 11;}

                        else if ( ((LA32_0>='1' && LA32_0<='9')) ) {s = 12;}

                        else if ( (LA32_0=='\'') ) {s = 13;}

                        else if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\u001F')||LA32_0=='!'||LA32_0=='$'||LA32_0=='&'||(LA32_0>='(' && LA32_0<='+')||LA32_0=='-'||(LA32_0>=':' && LA32_0<='@')||(LA32_0>='[' && LA32_0<='`')||LA32_0=='|'||(LA32_0>='~' && LA32_0<='\uFFFF')) && ((( textMode )||( hashMode )))) {s = 14;}

                        else if ( (LA32_0=='{') && (((( !textMode && braceDepth == 0 )&&( !textMode ))||(( hashMode )&&( !textMode ))||(( hashMode )&&( !textMode ))||(( !textMode && braceDepth == 0 )&&( !textMode ))||( textMode )||(( !textMode && braceDepth == 0 )&&( !textMode ))||(( !textMode && braceDepth == 0 )&&( !textMode ))||(( hashMode )&&( !textMode ))||(( hashMode )&&( !textMode ))||(( !textMode && braceDepth == 0 )&&( !textMode ))||(( !textMode && braceDepth == 0 )&&( !textMode ))||(( !textMode && braceDepth == 0 )&&( !textMode ))||(( hashMode )&&( !textMode ))||(( hashMode )&&( !textMode ))||(( !textMode && braceDepth == 0 )&&( !textMode ))||(( !textMode && braceDepth == 0 )&&( !textMode ))||(( hashMode )&&( !textMode ))||(( hashMode )&&( !textMode ))))) {s = 15;}

                        else if ( (LA32_0=='}') && (((( braceDepth == 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||( textMode )||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth > 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))||(( braceDepth == 1 )&&( hashMode ))))) {s = 16;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA32_116 = input.LA(1);

                         
                        int index32_116 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_116=='\'') ) {s = 87;}

                        else s = 22;

                         
                        input.seek(index32_116);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA32_45 = input.LA(1);

                         
                        int index32_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_45>='0' && LA32_45<='9')) ) {s = 45;}

                        else if ( (LA32_45=='F'||LA32_45=='f') ) {s = 40;}

                        else if ( (LA32_45=='.') ) {s = 37;}

                        else if ( (LA32_45=='E'||LA32_45=='e') ) {s = 39;}

                        else if ( (LA32_45=='L'||LA32_45=='l') ) {s = 44;}

                        else if ( (LA32_45=='D'||LA32_45=='d') ) {s = 43;}

                        else if ( ((LA32_45>='\u0000' && LA32_45<='\t')||(LA32_45>='\u000B' && LA32_45<='\f')||(LA32_45>='\u000E' && LA32_45<='-')||LA32_45=='/'||(LA32_45>=':' && LA32_45<='C')||(LA32_45>='G' && LA32_45<='K')||(LA32_45>='M' && LA32_45<='c')||(LA32_45>='g' && LA32_45<='k')||(LA32_45>='m' && LA32_45<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 41;

                         
                        input.seek(index32_45);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA32_109 = input.LA(1);

                         
                        int index32_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_109=='\'') ) {s = 87;}

                        else s = 22;

                         
                        input.seek(index32_109);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA32_12 = input.LA(1);

                         
                        int index32_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_12=='F'||LA32_12=='f') ) {s = 40;}

                        else if ( ((LA32_12>='0' && LA32_12<='9')) ) {s = 45;}

                        else if ( (LA32_12=='E'||LA32_12=='e') ) {s = 39;}

                        else if ( (LA32_12=='.') ) {s = 37;}

                        else if ( (LA32_12=='D'||LA32_12=='d') ) {s = 43;}

                        else if ( (LA32_12=='L'||LA32_12=='l') ) {s = 44;}

                        else if ( ((LA32_12>='\u0000' && LA32_12<='\t')||(LA32_12>='\u000B' && LA32_12<='\f')||(LA32_12>='\u000E' && LA32_12<='-')||LA32_12=='/'||(LA32_12>=':' && LA32_12<='C')||(LA32_12>='G' && LA32_12<='K')||(LA32_12>='M' && LA32_12<='c')||(LA32_12>='g' && LA32_12<='k')||(LA32_12>='m' && LA32_12<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 41;

                         
                        input.seek(index32_12);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA32_19 = input.LA(1);

                         
                        int index32_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( beginningOfLine )) ) {s = 55;}

                        else if ( (( hashMode )) ) {s = 29;}

                         
                        input.seek(index32_19);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA32_17 = input.LA(1);

                         
                        int index32_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( beginningOfLine )) ) {s = 51;}

                        else if ( (( hashMode )) ) {s = 29;}

                         
                        input.seek(index32_17);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA32_64 = input.LA(1);

                         
                        int index32_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 65;}

                        else if ( (( !hashMode )) ) {s = 31;}

                         
                        input.seek(index32_64);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA32_101 = input.LA(1);

                         
                        int index32_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_101=='P'||LA32_101=='p') ) {s = 72;}

                        else if ( ((LA32_101>='0' && LA32_101<='9')||(LA32_101>='A' && LA32_101<='F')||(LA32_101>='a' && LA32_101<='f')) ) {s = 101;}

                        else s = 22;

                         
                        input.seek(index32_101);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_2>='0' && LA32_2<='9')) ) {s = 18;}

                        else s = 19;

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA32_82 = input.LA(1);

                         
                        int index32_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 106;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_82);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA32_40 = input.LA(1);

                         
                        int index32_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_40>='\u0000' && LA32_40<='\t')||(LA32_40>='\u000B' && LA32_40<='\f')||(LA32_40>='\u000E' && LA32_40<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 79;

                         
                        input.seek(index32_40);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA32_70 = input.LA(1);

                         
                        int index32_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 97;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_70);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA32_60 = input.LA(1);

                         
                        int index32_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 59;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_60);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA32_20 = input.LA(1);

                         
                        int index32_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( beginningOfLine )) ) {s = 56;}

                        else if ( (( hashMode )) ) {s = 29;}

                         
                        input.seek(index32_20);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA32_26 = input.LA(1);

                         
                        int index32_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 27;}

                        else if ( (( hashMode )) ) {s = 29;}

                        else if ( ((false)) ) {s = 61;}

                        else if ( ((false)) ) {s = 62;}

                        else if ( ((false)) ) {s = 63;}

                         
                        input.seek(index32_26);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA32_48 = input.LA(1);

                         
                        int index32_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( textMode )) ) {s = 22;}

                        else if ( (( hashMode )) ) {s = 29;}

                         
                        input.seek(index32_48);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA32_114 = input.LA(1);

                         
                        int index32_114 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_114);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA32_113 = input.LA(1);

                         
                        int index32_113 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_113);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA32_105 = input.LA(1);

                         
                        int index32_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_105);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA32_102 = input.LA(1);

                         
                        int index32_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_102);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA32_74 = input.LA(1);

                         
                        int index32_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_74);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA32_80 = input.LA(1);

                         
                        int index32_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_80);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA32_81 = input.LA(1);

                         
                        int index32_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_81);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA32_110 = input.LA(1);

                         
                        int index32_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 117;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_110);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA32_98 = input.LA(1);

                         
                        int index32_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 41;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_98);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA32_4 = input.LA(1);

                         
                        int index32_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_4>='\u0000' && LA32_4<='\t')||(LA32_4>='\u000B' && LA32_4<='\f')||(LA32_4>='\u000E' && LA32_4<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 21;

                         
                        input.seek(index32_4);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA32_79 = input.LA(1);

                         
                        int index32_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 54;}

                        else if ( (( textMode )) ) {s = 22;}

                         
                        input.seek(index32_79);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA32_47 = input.LA(1);

                         
                        int index32_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_47=='\'') ) {s = 87;}

                        else s = 22;

                         
                        input.seek(index32_47);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA32_35 = input.LA(1);

                         
                        int index32_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_35>='0' && LA32_35<='9')||(LA32_35>='A' && LA32_35<='F')||(LA32_35>='a' && LA32_35<='f')) ) {s = 71;}

                        else if ( (LA32_35=='P'||LA32_35=='p') ) {s = 72;}

                        else if ( (LA32_35=='.') ) {s = 73;}

                        else s = 22;

                         
                        input.seek(index32_35);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA32_16 = input.LA(1);

                         
                        int index32_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_16>='\u0000' && LA32_16<='\t')||(LA32_16>='\u000B' && LA32_16<='\f')||(LA32_16>='\u000E' && LA32_16<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 50;

                         
                        input.seek(index32_16);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA32_66 = input.LA(1);

                         
                        int index32_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_66=='\"') && ((( !textMode )||( textMode )))) {s = 34;}

                        else if ( (LA32_66=='\\') && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( ((LA32_66>='\u0000' && LA32_66<='\t')||(LA32_66>='\u000B' && LA32_66<='\f')||(LA32_66>='\u000E' && LA32_66<='!')||(LA32_66>='#' && LA32_66<='[')||(LA32_66>=']' && LA32_66<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 33;}

                        else s = 22;

                         
                        input.seek(index32_66);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA32_94 = input.LA(1);

                         
                        int index32_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_94>='0' && LA32_94<='9')||(LA32_94>='A' && LA32_94<='F')||(LA32_94>='a' && LA32_94<='f')) && ((( !textMode )||( textMode )))) {s = 111;}

                        else s = 22;

                         
                        input.seek(index32_94);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA32_111 = input.LA(1);

                         
                        int index32_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_111>='0' && LA32_111<='9')||(LA32_111>='A' && LA32_111<='F')||(LA32_111>='a' && LA32_111<='f')) && ((( !textMode )||( textMode )))) {s = 118;}

                        else s = 22;

                         
                        input.seek(index32_111);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA32_118 = input.LA(1);

                         
                        int index32_118 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_118>='0' && LA32_118<='9')||(LA32_118>='A' && LA32_118<='F')||(LA32_118>='a' && LA32_118<='f')) && ((( !textMode )||( textMode )))) {s = 120;}

                        else s = 22;

                         
                        input.seek(index32_118);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA32_44 = input.LA(1);

                         
                        int index32_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_44>='\u0000' && LA32_44<='\t')||(LA32_44>='\u000B' && LA32_44<='\f')||(LA32_44>='\u000E' && LA32_44<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 82;

                         
                        input.seek(index32_44);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        s = 17;

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA32_37 = input.LA(1);

                         
                        int index32_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_37>='0' && LA32_37<='9')) ) {s = 75;}

                        else if ( (LA32_37=='E'||LA32_37=='e') ) {s = 76;}

                        else if ( (LA32_37=='D'||LA32_37=='d') ) {s = 43;}

                        else if ( (LA32_37=='F'||LA32_37=='f') ) {s = 40;}

                        else if ( ((LA32_37>='\u0000' && LA32_37<='\t')||(LA32_37>='\u000B' && LA32_37<='\f')||(LA32_37>='\u000E' && LA32_37<='/')||(LA32_37>=':' && LA32_37<='C')||(LA32_37>='G' && LA32_37<='c')||(LA32_37>='g' && LA32_37<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 74;

                         
                        input.seek(index32_37);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA32_96 = input.LA(1);

                         
                        int index32_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_96=='\"') && ((( !textMode )||( textMode )))) {s = 34;}

                        else if ( (LA32_96=='\\') && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( ((LA32_96>='\u0000' && LA32_96<='\t')||(LA32_96>='\u000B' && LA32_96<='\f')||(LA32_96>='\u000E' && LA32_96<='!')||(LA32_96>='#' && LA32_96<='[')||(LA32_96>=']' && LA32_96<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 33;}

                        else s = 22;

                         
                        input.seek(index32_96);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA32_10 = input.LA(1);

                         
                        int index32_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_10=='\\') && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( ((LA32_10>='\u0000' && LA32_10<='\t')||(LA32_10>='\u000B' && LA32_10<='\f')||(LA32_10>='\u000E' && LA32_10<='!')||(LA32_10>='#' && LA32_10<='[')||(LA32_10>=']' && LA32_10<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA32_10=='\"') && ((( !textMode )||( textMode )))) {s = 34;}

                        else s = 22;

                         
                        input.seek(index32_10);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA32_11 = input.LA(1);

                         
                        int index32_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_11=='x') ) {s = 35;}

                        else if ( (LA32_11=='X') ) {s = 36;}

                        else if ( (LA32_11=='.') ) {s = 37;}

                        else if ( ((LA32_11>='0' && LA32_11<='7')) ) {s = 38;}

                        else if ( (LA32_11=='E'||LA32_11=='e') ) {s = 39;}

                        else if ( (LA32_11=='F'||LA32_11=='f') ) {s = 40;}

                        else if ( ((LA32_11>='8' && LA32_11<='9')) ) {s = 42;}

                        else if ( (LA32_11=='D'||LA32_11=='d') ) {s = 43;}

                        else if ( (LA32_11=='L'||LA32_11=='l') ) {s = 44;}

                        else if ( ((LA32_11>='\u0000' && LA32_11<='\t')||(LA32_11>='\u000B' && LA32_11<='\f')||(LA32_11>='\u000E' && LA32_11<='-')||LA32_11=='/'||(LA32_11>=':' && LA32_11<='C')||(LA32_11>='G' && LA32_11<='K')||(LA32_11>='M' && LA32_11<='W')||(LA32_11>='Y' && LA32_11<='c')||(LA32_11>='g' && LA32_11<='k')||(LA32_11>='m' && LA32_11<='w')||(LA32_11>='y' && LA32_11<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 41;

                         
                        input.seek(index32_11);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_9==' ') && (( !hashMode ))) {s = 31;}

                        else s = 30;

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA32_25 = input.LA(1);

                         
                        int index32_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_25>='0' && LA32_25<='9')||(LA32_25>='A' && LA32_25<='Z')||(LA32_25>='a' && LA32_25<='z')) && ((( !textMode )||( textMode )))) {s = 25;}

                        else if ( ((LA32_25>='\u0000' && LA32_25<='\t')||(LA32_25>='\u000B' && LA32_25<='\f')||(LA32_25>='\u000E' && LA32_25<='/')||(LA32_25>=':' && LA32_25<='@')||(LA32_25>='[' && LA32_25<='`')||(LA32_25>='{' && LA32_25<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 60;

                         
                        input.seek(index32_25);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA32_95 = input.LA(1);

                         
                        int index32_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_95=='\"') && ((( !textMode )||( textMode )))) {s = 34;}

                        else if ( (LA32_95=='\\') && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( ((LA32_95>='0' && LA32_95<='7')) && ((( !textMode )||( textMode )))) {s = 112;}

                        else if ( ((LA32_95>='\u0000' && LA32_95<='\t')||(LA32_95>='\u000B' && LA32_95<='\f')||(LA32_95>='\u000E' && LA32_95<='!')||(LA32_95>='#' && LA32_95<='/')||(LA32_95>='8' && LA32_95<='[')||(LA32_95>=']' && LA32_95<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 33;}

                        else s = 22;

                         
                        input.seek(index32_95);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA32_112 = input.LA(1);

                         
                        int index32_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_112=='\"') && ((( !textMode )||( textMode )))) {s = 34;}

                        else if ( (LA32_112=='\\') && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( ((LA32_112>='\u0000' && LA32_112<='\t')||(LA32_112>='\u000B' && LA32_112<='\f')||(LA32_112>='\u000E' && LA32_112<='!')||(LA32_112>='#' && LA32_112<='[')||(LA32_112>=']' && LA32_112<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 33;}

                        else s = 22;

                         
                        input.seek(index32_112);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        s = 20;

                         
                        input.seek(index32_3);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA32_85 = input.LA(1);

                         
                        int index32_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_85>='0' && LA32_85<='7')) ) {s = 108;}

                        else if ( (LA32_85=='\'') ) {s = 87;}

                        else s = 22;

                         
                        input.seek(index32_85);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA32_33 = input.LA(1);

                         
                        int index32_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_33=='\"') && ((( !textMode )||( textMode )))) {s = 34;}

                        else if ( (LA32_33=='\\') && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( ((LA32_33>='\u0000' && LA32_33<='\t')||(LA32_33>='\u000B' && LA32_33<='\f')||(LA32_33>='\u000E' && LA32_33<='!')||(LA32_33>='#' && LA32_33<='[')||(LA32_33>=']' && LA32_33<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 33;}

                        else s = 22;

                         
                        input.seek(index32_33);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA32_14 = input.LA(1);

                         
                        int index32_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_14>='\u0000' && LA32_14<='\t')||(LA32_14>='\u000B' && LA32_14<='\f')||(LA32_14>='\u000E' && LA32_14<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 48;

                         
                        input.seek(index32_14);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA32_115 = input.LA(1);

                         
                        int index32_115 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_115>='0' && LA32_115<='9')||(LA32_115>='A' && LA32_115<='F')||(LA32_115>='a' && LA32_115<='f')) ) {s = 119;}

                        else s = 22;

                         
                        input.seek(index32_115);
                        if ( s>=0 ) return s;
                        break;
                    case 88 : 
                        int LA32_107 = input.LA(1);

                         
                        int index32_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_107>='0' && LA32_107<='9')||(LA32_107>='A' && LA32_107<='F')||(LA32_107>='a' && LA32_107<='f')) ) {s = 115;}

                        else s = 22;

                         
                        input.seek(index32_107);
                        if ( s>=0 ) return s;
                        break;
                    case 89 : 
                        int LA32_75 = input.LA(1);

                         
                        int index32_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_75=='E'||LA32_75=='e') ) {s = 76;}

                        else if ( (LA32_75=='D'||LA32_75=='d') ) {s = 43;}

                        else if ( ((LA32_75>='0' && LA32_75<='9')) ) {s = 75;}

                        else if ( (LA32_75=='F'||LA32_75=='f') ) {s = 40;}

                        else if ( ((LA32_75>='\u0000' && LA32_75<='\t')||(LA32_75>='\u000B' && LA32_75<='\f')||(LA32_75>='\u000E' && LA32_75<='/')||(LA32_75>=':' && LA32_75<='C')||(LA32_75>='G' && LA32_75<='c')||(LA32_75>='g' && LA32_75<='\uFFFF')) && (( textMode ))) {s = 22;}

                        else s = 102;

                         
                        input.seek(index32_75);
                        if ( s>=0 ) return s;
                        break;
                    case 90 : 
                        int LA32_119 = input.LA(1);

                         
                        int index32_119 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_119>='0' && LA32_119<='9')||(LA32_119>='A' && LA32_119<='F')||(LA32_119>='a' && LA32_119<='f')) ) {s = 121;}

                        else s = 22;

                         
                        input.seek(index32_119);
                        if ( s>=0 ) return s;
                        break;
                    case 91 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_8=='\n') && ((( !hashMode )||( hashMode )))) {s = 28;}

                        else s = 29;

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 92 : 
                        int LA32_36 = input.LA(1);

                         
                        int index32_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_36>='0' && LA32_36<='9')||(LA32_36>='A' && LA32_36<='F')||(LA32_36>='a' && LA32_36<='f')) ) {s = 71;}

                        else if ( (LA32_36=='P'||LA32_36=='p') ) {s = 72;}

                        else if ( (LA32_36=='.') ) {s = 73;}

                        else s = 22;

                         
                        input.seek(index32_36);
                        if ( s>=0 ) return s;
                        break;
                    case 93 : 
                        int LA32_84 = input.LA(1);

                         
                        int index32_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_84>='0' && LA32_84<='9')||(LA32_84>='A' && LA32_84<='F')||(LA32_84>='a' && LA32_84<='f')) ) {s = 107;}

                        else s = 22;

                         
                        input.seek(index32_84);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}