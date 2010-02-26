// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-26 12:33:13

package com.cadrlife.jaml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JamlLexer extends Lexer {
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int PERCENT=9;
    public static final int IGNORED_NEWLINE=25;
    public static final int POUND=20;
    public static final int IntegerNumber=29;
    public static final int END_HASH=13;
    public static final int DOUBLELITERAL=19;
    public static final int CHANGE_INDENT=26;
    public static final int SpacesQ=27;
    public static final int Exponent=33;
    public static final int DEDENT=5;
    public static final int TEXT=7;
    public static final int ID=10;
    public static final int INTLITERAL=15;
    public static final int EOF=-1;
    public static final int HexDigit=32;
    public static final int BEGIN_HASH=11;
    public static final int INDENT=4;
    public static final int LONGLITERAL=16;
    public static final int LongSuffix=30;
    public static final int StringLiteral=14;
    public static final int WS=23;
    public static final int NEWLINE=6;
    public static final int DoubleSuffix=36;
    public static final int COMMA=12;
    public static final int T__39=39;
    public static final int Spaces=22;
    public static final int UnicodeEscape=37;
    public static final int NonIntegerNumber=34;
    public static final int FloatSuffix=35;
    public static final int CHARLITERAL=17;
    public static final int NL=24;
    public static final int DOT=21;
    public static final int FLOATLITERAL=18;
    public static final int EscapeSequence=28;
    public static final int OctalEscape=38;
    public static final int FORWARD_SLASH=8;
    public static final int HexPrefix=31;

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

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
    traceIn("T__39", 1);
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:29:7: ( ':' )
            // ../etc/Jaml.g:29:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("T__39", 1);
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
    traceIn("T__40", 2);
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:30:7: ( '=' )
            // ../etc/Jaml.g:30:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("T__40", 2);
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
    traceIn("T__41", 3);
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:31:7: ( '>' )
            // ../etc/Jaml.g:31:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("T__41", 3);
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "POUND"
    public final void mPOUND() throws RecognitionException {
    traceIn("POUND", 4);
        try {
            int _type = POUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:120:6: ({...}? => '#' )
            // ../etc/Jaml.g:120:8: {...}? => '#'
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
            // ../etc/Jaml.g:121:4: ({...}? => '.' )
            // ../etc/Jaml.g:121:6: {...}? => '.'
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
            // ../etc/Jaml.g:122:8: ({...}? => '%' )
            // ../etc/Jaml.g:122:10: {...}? => '%'
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

    // $ANTLR start "FORWARD_SLASH"
    public final void mFORWARD_SLASH() throws RecognitionException {
    traceIn("FORWARD_SLASH", 7);
        try {
            int _type = FORWARD_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:123:14: ({...}? => '/' )
            // ../etc/Jaml.g:123:16: {...}? => '/'
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
    traceOut("FORWARD_SLASH", 7);
        }
    }
    // $ANTLR end "FORWARD_SLASH"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
    traceIn("COMMA", 8);
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:124:6: ({...}? => ',' )
            // ../etc/Jaml.g:124:8: {...}? => ','
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
    traceOut("COMMA", 8);
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
    traceIn("ID", 9);
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:125:5: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // ../etc/Jaml.g:125:7: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "ID", " !textMode ");
            }
            // ../etc/Jaml.g:125:24: ( 'a' .. 'z' | 'A' .. 'Z' )+
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
    traceOut("ID", 9);
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
    traceIn("WS", 10);
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:128:4: ({...}? => Spaces )
            // ../etc/Jaml.g:128:6: {...}? => Spaces
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
    traceOut("WS", 10);
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "IGNORED_NEWLINE"
    public final void mIGNORED_NEWLINE() throws RecognitionException {
    traceIn("IGNORED_NEWLINE", 11);
        try {
            int _type = IGNORED_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:131:18: ({...}? => NL )
            // ../etc/Jaml.g:131:20: {...}? => NL
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "IGNORED_NEWLINE", " hashMode ");
            }
            mNL(); 
            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("IGNORED_NEWLINE", 11);
        }
    }
    // $ANTLR end "IGNORED_NEWLINE"

    // $ANTLR start "CHANGE_INDENT"
    public final void mCHANGE_INDENT() throws RecognitionException {
    traceIn("CHANGE_INDENT", 12);
        try {
            int _type = CHANGE_INDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
             int tb = 0; 
            // ../etc/Jaml.g:134:23: ({...}? => ( NL ) ( ' ' )* )
            // ../etc/Jaml.g:134:24: {...}? => ( NL ) ( ' ' )*
            {
            if ( !(( !hashMode )) ) {
                throw new FailedPredicateException(input, "CHANGE_INDENT", " !hashMode ");
            }
            // ../etc/Jaml.g:135:2: ( NL )
            // ../etc/Jaml.g:135:3: NL
            {
            mNL(); 

            }

            // ../etc/Jaml.g:135:7: ( ' ' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../etc/Jaml.g:135:8: ' '
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
    traceOut("CHANGE_INDENT", 12);
        }
    }
    // $ANTLR end "CHANGE_INDENT"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
    traceIn("NL", 13);
        try {
            // ../etc/Jaml.g:155:3: ( ( '\\r' )? '\\n' )
            // ../etc/Jaml.g:155:5: ( '\\r' )? '\\n'
            {
            // ../etc/Jaml.g:155:5: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../etc/Jaml.g:155:5: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

        }
        finally {
    traceOut("NL", 13);
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "SpacesQ"
    public final void mSpacesQ() throws RecognitionException {
    traceIn("SpacesQ", 14);
        try {
            // ../etc/Jaml.g:157:17: ( ( ' ' )* )
            // ../etc/Jaml.g:157:19: ( ' ' )*
            {
            // ../etc/Jaml.g:157:19: ( ' ' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../etc/Jaml.g:157:20: ' '
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
    traceOut("SpacesQ", 14);
        }
    }
    // $ANTLR end "SpacesQ"

    // $ANTLR start "Spaces"
    public final void mSpaces() throws RecognitionException {
    traceIn("Spaces", 15);
        try {
            // ../etc/Jaml.g:158:16: ( ( ' ' )+ )
            // ../etc/Jaml.g:158:18: ( ' ' )+
            {
            // ../etc/Jaml.g:158:18: ( ' ' )+
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
            	    // ../etc/Jaml.g:158:19: ' '
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
    traceOut("Spaces", 15);
        }
    }
    // $ANTLR end "Spaces"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
    traceIn("StringLiteral", 16);
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:160:14: ({...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"' )
            // ../etc/Jaml.g:160:16: {...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )* '\"'
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "StringLiteral", " !textMode ");
            }
            match('\"'); 
            // ../etc/Jaml.g:161:9: ( EscapeSequence | ~ ( '\\\\' | '\"' | '\\r' | '\\n' ) )*
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
            	    // ../etc/Jaml.g:161:11: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:161:28: ~ ( '\\\\' | '\"' | '\\r' | '\\n' )
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
    traceOut("StringLiteral", 16);
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "LONGLITERAL"
    public final void mLONGLITERAL() throws RecognitionException {
    traceIn("LONGLITERAL", 17);
        try {
            int _type = LONGLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:165:5: ( IntegerNumber LongSuffix )
            // ../etc/Jaml.g:165:9: IntegerNumber LongSuffix
            {
            mIntegerNumber(); 
            mLongSuffix(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("LONGLITERAL", 17);
        }
    }
    // $ANTLR end "LONGLITERAL"

    // $ANTLR start "INTLITERAL"
    public final void mINTLITERAL() throws RecognitionException {
    traceIn("INTLITERAL", 18);
        try {
            int _type = INTLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:170:5: ( IntegerNumber )
            // ../etc/Jaml.g:170:9: IntegerNumber
            {
            mIntegerNumber(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("INTLITERAL", 18);
        }
    }
    // $ANTLR end "INTLITERAL"

    // $ANTLR start "IntegerNumber"
    public final void mIntegerNumber() throws RecognitionException {
    traceIn("IntegerNumber", 19);
        try {
            // ../etc/Jaml.g:175:5: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | HexPrefix ( HexDigit )+ )
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
                    // ../etc/Jaml.g:175:9: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:176:9: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../etc/Jaml.g:176:18: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../etc/Jaml.g:176:19: '0' .. '9'
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
                    // ../etc/Jaml.g:177:9: '0' ( '0' .. '7' )+
                    {
                    match('0'); 
                    // ../etc/Jaml.g:177:13: ( '0' .. '7' )+
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
                    	    // ../etc/Jaml.g:177:14: '0' .. '7'
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
                    // ../etc/Jaml.g:178:9: HexPrefix ( HexDigit )+
                    {
                    mHexPrefix(); 
                    // ../etc/Jaml.g:178:19: ( HexDigit )+
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
                    	    // ../etc/Jaml.g:178:19: HexDigit
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
    traceOut("IntegerNumber", 19);
        }
    }
    // $ANTLR end "IntegerNumber"

    // $ANTLR start "HexPrefix"
    public final void mHexPrefix() throws RecognitionException {
    traceIn("HexPrefix", 20);
        try {
            // ../etc/Jaml.g:183:5: ( '0x' | '0X' )
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
                    // ../etc/Jaml.g:183:9: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:183:16: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }
        }
        finally {
    traceOut("HexPrefix", 20);
        }
    }
    // $ANTLR end "HexPrefix"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
    traceIn("HexDigit", 21);
        try {
            // ../etc/Jaml.g:188:5: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../etc/Jaml.g:188:9: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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

    // $ANTLR start "LongSuffix"
    public final void mLongSuffix() throws RecognitionException {
    traceIn("LongSuffix", 22);
        try {
            // ../etc/Jaml.g:193:5: ( 'l' | 'L' )
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
    traceOut("LongSuffix", 22);
        }
    }
    // $ANTLR end "LongSuffix"

    // $ANTLR start "NonIntegerNumber"
    public final void mNonIntegerNumber() throws RecognitionException {
    traceIn("NonIntegerNumber", 23);
        try {
            // ../etc/Jaml.g:199:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent | ( '0' .. '9' )+ | HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            int alt24=5;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // ../etc/Jaml.g:199:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )?
                    {
                    // ../etc/Jaml.g:199:9: ( '0' .. '9' )+
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
                    	    // ../etc/Jaml.g:199:10: '0' .. '9'
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
                    // ../etc/Jaml.g:199:27: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../etc/Jaml.g:199:28: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../etc/Jaml.g:199:41: ( Exponent )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../etc/Jaml.g:199:41: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:200:9: '.' ( '0' .. '9' )+ ( Exponent )?
                    {
                    match('.'); 
                    // ../etc/Jaml.g:200:13: ( '0' .. '9' )+
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
                    	    // ../etc/Jaml.g:200:15: '0' .. '9'
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

                    // ../etc/Jaml.g:200:29: ( Exponent )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../etc/Jaml.g:200:29: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:201:9: ( '0' .. '9' )+ Exponent
                    {
                    // ../etc/Jaml.g:201:9: ( '0' .. '9' )+
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
                    	    // ../etc/Jaml.g:201:10: '0' .. '9'
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
                    // ../etc/Jaml.g:202:9: ( '0' .. '9' )+
                    {
                    // ../etc/Jaml.g:202:9: ( '0' .. '9' )+
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
                    	    // ../etc/Jaml.g:202:10: '0' .. '9'
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
                    // ../etc/Jaml.g:204:9: HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    mHexPrefix(); 
                    // ../etc/Jaml.g:204:19: ( HexDigit )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='F')||(LA19_0>='a' && LA19_0<='f')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../etc/Jaml.g:204:20: HexDigit
                    	    {
                    	    mHexDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    // ../etc/Jaml.g:205:9: ( () | ( '.' ( HexDigit )* ) )
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
                            // ../etc/Jaml.g:205:14: ()
                            {
                            // ../etc/Jaml.g:205:14: ()
                            // ../etc/Jaml.g:205:15: 
                            {
                            }


                            }
                            break;
                        case 2 :
                            // ../etc/Jaml.g:206:14: ( '.' ( HexDigit )* )
                            {
                            // ../etc/Jaml.g:206:14: ( '.' ( HexDigit )* )
                            // ../etc/Jaml.g:206:15: '.' ( HexDigit )*
                            {
                            match('.'); 
                            // ../etc/Jaml.g:206:19: ( HexDigit )*
                            loop20:
                            do {
                                int alt20=2;
                                int LA20_0 = input.LA(1);

                                if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='F')||(LA20_0>='a' && LA20_0<='f')) ) {
                                    alt20=1;
                                }


                                switch (alt20) {
                            	case 1 :
                            	    // ../etc/Jaml.g:206:20: HexDigit
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

                    // ../etc/Jaml.g:209:9: ( '+' | '-' )?
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

                    // ../etc/Jaml.g:210:9: ( '0' .. '9' )+
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
                    	    // ../etc/Jaml.g:210:11: '0' .. '9'
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
    traceOut("NonIntegerNumber", 23);
        }
    }
    // $ANTLR end "NonIntegerNumber"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
    traceIn("Exponent", 24);
        try {
            // ../etc/Jaml.g:215:5: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../etc/Jaml.g:215:9: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../etc/Jaml.g:215:23: ( '+' | '-' )?
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

            // ../etc/Jaml.g:215:38: ( '0' .. '9' )+
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
            	    // ../etc/Jaml.g:215:40: '0' .. '9'
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
    traceOut("Exponent", 24);
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatSuffix"
    public final void mFloatSuffix() throws RecognitionException {
    traceIn("FloatSuffix", 25);
        try {
            // ../etc/Jaml.g:220:5: ( 'f' | 'F' )
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
    traceOut("FloatSuffix", 25);
        }
    }
    // $ANTLR end "FloatSuffix"

    // $ANTLR start "DoubleSuffix"
    public final void mDoubleSuffix() throws RecognitionException {
    traceIn("DoubleSuffix", 26);
        try {
            // ../etc/Jaml.g:225:5: ( 'd' | 'D' )
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
    traceOut("DoubleSuffix", 26);
        }
    }
    // $ANTLR end "DoubleSuffix"

    // $ANTLR start "FLOATLITERAL"
    public final void mFLOATLITERAL() throws RecognitionException {
    traceIn("FLOATLITERAL", 27);
        try {
            int _type = FLOATLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:229:5: ( NonIntegerNumber FloatSuffix )
            // ../etc/Jaml.g:229:9: NonIntegerNumber FloatSuffix
            {
            mNonIntegerNumber(); 
            mFloatSuffix(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("FLOATLITERAL", 27);
        }
    }
    // $ANTLR end "FLOATLITERAL"

    // $ANTLR start "DOUBLELITERAL"
    public final void mDOUBLELITERAL() throws RecognitionException {
    traceIn("DOUBLELITERAL", 28);
        try {
            int _type = DOUBLELITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:233:5: ( NonIntegerNumber ( DoubleSuffix )? )
            // ../etc/Jaml.g:233:9: NonIntegerNumber ( DoubleSuffix )?
            {
            mNonIntegerNumber(); 
            // ../etc/Jaml.g:233:26: ( DoubleSuffix )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='D'||LA27_0=='d') ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../etc/Jaml.g:233:26: DoubleSuffix
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
    traceOut("DOUBLELITERAL", 28);
        }
    }
    // $ANTLR end "DOUBLELITERAL"

    // $ANTLR start "CHARLITERAL"
    public final void mCHARLITERAL() throws RecognitionException {
    traceIn("CHARLITERAL", 29);
        try {
            int _type = CHARLITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:237:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\'' )
            // ../etc/Jaml.g:237:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) ) '\\''
            {
            match('\''); 
            // ../etc/Jaml.g:238:9: ( EscapeSequence | ~ ( '\\'' | '\\\\' | '\\r' | '\\n' ) )
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
                    // ../etc/Jaml.g:238:13: EscapeSequence
                    {
                    mEscapeSequence(); 

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:239:13: ~ ( '\\'' | '\\\\' | '\\r' | '\\n' )
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
    traceOut("CHARLITERAL", 29);
        }
    }
    // $ANTLR end "CHARLITERAL"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
    traceIn("EscapeSequence", 30);
        try {
            // ../etc/Jaml.g:246:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
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
                    // ../etc/Jaml.g:246:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // ../etc/Jaml.g:247:7: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:248:7: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
    traceOut("EscapeSequence", 30);
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
    traceIn("OctalEscape", 31);
        try {
            // ../etc/Jaml.g:253:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // ../etc/Jaml.g:253:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:253:12: ( '0' .. '3' )
                    // ../etc/Jaml.g:253:13: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ../etc/Jaml.g:253:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:253:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:253:34: ( '0' .. '7' )
                    // ../etc/Jaml.g:253:35: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:254:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:254:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:254:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:254:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:254:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:255:7: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:255:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:255:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
    traceOut("OctalEscape", 31);
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
    traceIn("UnicodeEscape", 32);
        try {
            // ../etc/Jaml.g:260:3: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // ../etc/Jaml.g:260:7: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
    traceOut("UnicodeEscape", 32);
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
    traceIn("TEXT", 33);
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:263:5: ({...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' ) ) (~ ( '\\r' | '\\n' ) )* )
            // ../etc/Jaml.g:263:7: {...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' ) ) (~ ( '\\r' | '\\n' ) )*
            {
            if ( !(( textMode )) ) {
                throw new FailedPredicateException(input, "TEXT", " textMode ");
            }
            // ../etc/Jaml.g:264:7: (~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' ) )
            // ../etc/Jaml.g:264:8: ~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            // ../etc/Jaml.g:265:7: (~ ( '\\r' | '\\n' ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\u0000' && LA31_0<='\t')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../etc/Jaml.g:265:8: ~ ( '\\r' | '\\n' )
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
    traceOut("TEXT", 33);
        }
    }
    // $ANTLR end "TEXT"

    // $ANTLR start "BEGIN_HASH"
    public final void mBEGIN_HASH() throws RecognitionException {
    traceIn("BEGIN_HASH", 34);
        try {
            int _type = BEGIN_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:268:13: ({...}? => '{' )
            // ../etc/Jaml.g:268:15: {...}? => '{'
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "BEGIN_HASH", " !textMode ");
            }
            match('{'); 
            braceDepth++; hashMode=true;

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
            // ../etc/Jaml.g:269:11: ({...}? => '}' )
            // ../etc/Jaml.g:269:13: {...}? => '}'
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "END_HASH", " hashMode ");
            }
            match('}'); 
            if (--braceDepth == 0) hashMode=false;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("END_HASH", 35);
        }
    }
    // $ANTLR end "END_HASH"

    public void mTokens() throws RecognitionException {
        // ../etc/Jaml.g:1:8: ( T__39 | T__40 | T__41 | POUND | DOT | PERCENT | FORWARD_SLASH | COMMA | ID | WS | IGNORED_NEWLINE | CHANGE_INDENT | StringLiteral | LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | TEXT | BEGIN_HASH | END_HASH )
        int alt32=21;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // ../etc/Jaml.g:1:10: T__39
                {
                mT__39(); 

                }
                break;
            case 2 :
                // ../etc/Jaml.g:1:16: T__40
                {
                mT__40(); 

                }
                break;
            case 3 :
                // ../etc/Jaml.g:1:22: T__41
                {
                mT__41(); 

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
                // ../etc/Jaml.g:1:46: FORWARD_SLASH
                {
                mFORWARD_SLASH(); 

                }
                break;
            case 8 :
                // ../etc/Jaml.g:1:60: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 9 :
                // ../etc/Jaml.g:1:66: ID
                {
                mID(); 

                }
                break;
            case 10 :
                // ../etc/Jaml.g:1:69: WS
                {
                mWS(); 

                }
                break;
            case 11 :
                // ../etc/Jaml.g:1:72: IGNORED_NEWLINE
                {
                mIGNORED_NEWLINE(); 

                }
                break;
            case 12 :
                // ../etc/Jaml.g:1:88: CHANGE_INDENT
                {
                mCHANGE_INDENT(); 

                }
                break;
            case 13 :
                // ../etc/Jaml.g:1:102: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 14 :
                // ../etc/Jaml.g:1:116: LONGLITERAL
                {
                mLONGLITERAL(); 

                }
                break;
            case 15 :
                // ../etc/Jaml.g:1:128: INTLITERAL
                {
                mINTLITERAL(); 

                }
                break;
            case 16 :
                // ../etc/Jaml.g:1:139: FLOATLITERAL
                {
                mFLOATLITERAL(); 

                }
                break;
            case 17 :
                // ../etc/Jaml.g:1:152: DOUBLELITERAL
                {
                mDOUBLELITERAL(); 

                }
                break;
            case 18 :
                // ../etc/Jaml.g:1:166: CHARLITERAL
                {
                mCHARLITERAL(); 

                }
                break;
            case 19 :
                // ../etc/Jaml.g:1:178: TEXT
                {
                mTEXT(); 

                }
                break;
            case 20 :
                // ../etc/Jaml.g:1:183: BEGIN_HASH
                {
                mBEGIN_HASH(); 

                }
                break;
            case 21 :
                // ../etc/Jaml.g:1:194: END_HASH
                {
                mEND_HASH(); 

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
            return "197:1: fragment NonIntegerNumber : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent | ( '0' .. '9' )+ | HexPrefix ( HexDigit )* ( () | ( '.' ( HexDigit )* ) ) ( 'p' | 'P' ) ( '+' | '-' )? ( '0' .. '9' )+ );";
        }
    }
    static final String DFA32_eotS =
        "\1\uffff\1\24\1\25\1\26\1\uffff\1\30\1\uffff\1\31\1\32\1\34\2\uffff"+
        "\1\35\1\23\2\44\1\23\1\57\1\60\4\uffff\1\65\3\uffff\1\34\3\uffff"+
        "\2\23\1\77\2\23\1\uffff\1\103\1\44\1\104\1\107\1\110\1\23\1\113"+
        "\1\44\2\23\14\uffff\4\23\1\uffff\1\131\2\23\2\uffff\1\136\1\23\2"+
        "\uffff\1\23\1\141\1\uffff\4\23\1\145\3\uffff\1\65\3\23\2\uffff\1"+
        "\23\1\150\1\23\2\uffff\1\23\1\151\1\uffff\3\23\1\uffff\2\23\2\uffff"+
        "\2\23\1\uffff\4\23";
    static final String DFA32_eofS =
        "\161\uffff";
    static final String DFA32_minS =
        "\4\0\1\uffff\1\60\1\uffff\3\0\1\uffff\1\12\1\40\6\0\1\uffff\3\0"+
        "\1\60\1\uffff\5\0\1\uffff\1\42\2\0\2\56\1\uffff\5\0\1\53\2\0\1\42"+
        "\1\47\2\0\3\uffff\1\53\6\uffff\1\0\1\60\4\0\1\53\1\60\3\0\1\53\2"+
        "\0\1\60\2\0\1\47\1\60\2\47\1\0\2\uffff\3\60\2\0\1\uffff\1\0\1\60"+
        "\1\0\1\60\1\uffff\1\0\1\60\2\0\1\60\2\47\1\0\1\60\3\0\1\60\1\47"+
        "\1\uffff\2\60\1\0\1\47";
    static final String DFA32_maxS =
        "\4\uffff\1\uffff\1\71\1\uffff\3\uffff\1\uffff\1\12\1\40\6\uffff"+
        "\1\uffff\3\0\1\146\1\uffff\2\0\1\uffff\2\0\1\uffff\1\165\2\uffff"+
        "\2\160\1\uffff\5\uffff\1\71\2\uffff\1\165\1\47\2\0\3\uffff\1\71"+
        "\6\uffff\1\uffff\1\146\2\uffff\1\0\1\uffff\1\71\1\160\2\0\1\uffff"+
        "\1\71\2\0\1\71\1\uffff\1\0\1\47\1\146\2\67\1\uffff\2\uffff\1\71"+
        "\2\146\2\uffff\1\uffff\1\0\1\71\1\uffff\1\160\1\uffff\1\0\1\71\1"+
        "\uffff\1\0\1\146\1\67\1\47\1\0\1\146\1\uffff\2\0\1\146\1\47\1\uffff"+
        "\2\146\1\uffff\1\47";
    static final String DFA32_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\3\uffff\1\12\10\uffff\1\23\4\uffff\1\5"+
        "\5\uffff\1\14\5\uffff\1\17\14\uffff\1\1\1\2\1\3\1\uffff\1\21\1\20"+
        "\1\7\1\10\1\11\1\13\26\uffff\1\24\1\25\5\uffff\1\15\4\uffff\1\16"+
        "\16\uffff\1\22\4\uffff";
    static final String DFA32_specialS =
        "\1\4\1\3\1\1\1\127\1\uffff\1\111\1\uffff\1\70\1\63\1\0\1\uffff\1"+
        "\77\1\46\1\126\1\125\1\75\1\51\1\114\1\40\1\uffff\1\14\1\16\1\12"+
        "\2\uffff\1\43\1\42\1\105\1\41\1\13\1\uffff\1\115\1\34\1\103\1\122"+
        "\1\6\1\uffff\1\55\1\113\1\54\1\56\1\44\1\106\1\65\1\11\1\120\1\76"+
        "\1\21\1\20\12\uffff\1\104\1\52\1\17\1\15\1\36\1\72\1\47\1\37\1\26"+
        "\1\35\1\2\1\107\1\27\1\32\1\101\1\100\1\30\1\121\1\45\1\7\1\50\1"+
        "\64\4\uffff\1\60\1\62\1\123\1\uffff\1\33\1\73\1\116\1\57\1\uffff"+
        "\1\31\1\102\1\117\1\25\1\74\1\10\1\112\1\22\1\61\1\124\1\24\1\23"+
        "\1\71\1\110\1\uffff\1\66\1\67\1\5\1\53}>";
    static final String[] DFA32_transitionS = {
            "\12\23\1\14\2\23\1\13\22\23\1\12\1\23\1\15\1\4\1\23\1\6\1\23"+
            "\1\20\4\23\1\10\1\23\1\5\1\7\1\16\11\17\1\1\2\23\1\2\1\3\2\23"+
            "\32\11\6\23\32\11\1\21\1\23\1\22\uff82\23",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "",
            "\12\27",
            "",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "\12\23\1\uffff\2\23\1\uffff\63\23\32\33\6\23\32\33\uff85\23",
            "",
            "\1\14",
            "\1\36",
            "\12\40\1\uffff\2\40\1\uffff\24\40\1\41\71\40\1\37\uffa3\40",
            "\12\23\1\uffff\2\23\1\uffff\40\23\1\50\1\23\10\46\2\53\12\23"+
            "\1\45\1\52\1\51\5\23\1\47\13\23\1\43\13\23\1\45\1\52\1\51\5"+
            "\23\1\47\13\23\1\42\uff87\23",
            "\12\23\1\uffff\2\23\1\uffff\40\23\1\50\1\23\12\54\12\23\1\45"+
            "\1\52\1\51\5\23\1\47\27\23\1\45\1\52\1\51\5\23\1\47\uff93\23",
            "\12\56\1\uffff\2\56\1\uffff\31\56\1\uffff\64\56\1\55\uffa3"+
            "\56",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\27\13\uffff\1\64\1\66\36\uffff\1\64\1\66",
            "",
            "\1\uffff",
            "\1\uffff",
            "\12\23\1\uffff\2\23\1\uffff\63\23\32\33\6\23\32\33\uff85\23",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\73\4\uffff\1\73\10\uffff\4\75\4\76\44\uffff\1\73\5\uffff"+
            "\1\73\3\uffff\1\73\7\uffff\1\73\3\uffff\1\73\1\uffff\1\73\1"+
            "\74",
            "\12\40\1\uffff\2\40\1\uffff\24\40\1\41\71\40\1\37\uffa3\40",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "\1\102\1\uffff\12\100\7\uffff\6\100\11\uffff\1\101\20\uffff"+
            "\6\100\11\uffff\1\101",
            "\1\102\1\uffff\12\100\7\uffff\6\100\11\uffff\1\101\20\uffff"+
            "\6\100\11\uffff\1\101",
            "",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "\12\23\1\uffff\2\23\1\uffff\40\23\1\50\1\23\10\46\2\53\12\23"+
            "\1\45\1\52\1\51\5\23\1\47\27\23\1\45\1\52\1\51\5\23\1\47\uff93"+
            "\23",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "\12\23\1\uffff\2\23\1\uffff\42\23\12\105\12\23\1\45\1\106\1"+
            "\51\35\23\1\45\1\106\1\51\uff99\23",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "\1\111\1\uffff\1\111\2\uffff\12\112",
            "\12\23\1\uffff\2\23\1\uffff\40\23\1\50\1\23\12\53\12\23\1\45"+
            "\1\52\1\51\35\23\1\45\1\52\1\51\uff99\23",
            "\12\23\1\uffff\2\23\1\uffff\40\23\1\50\1\23\12\54\12\23\1\45"+
            "\1\52\1\51\5\23\1\47\27\23\1\45\1\52\1\51\5\23\1\47\uff93\23",
            "\1\114\4\uffff\1\114\10\uffff\4\116\4\117\44\uffff\1\114\5"+
            "\uffff\1\114\3\uffff\1\114\7\uffff\1\114\3\uffff\1\114\1\uffff"+
            "\1\114\1\115",
            "\1\120",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\123\1\uffff\1\123\2\uffff\12\124",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\40\1\uffff\2\40\1\uffff\24\40\1\41\71\40\1\37\uffa3\40",
            "\12\125\7\uffff\6\125\32\uffff\6\125",
            "\12\40\1\uffff\2\40\1\uffff\24\40\1\41\15\40\10\126\44\40\1"+
            "\37\uffa3\40",
            "\12\40\1\uffff\2\40\1\uffff\24\40\1\41\15\40\10\127\44\40\1"+
            "\37\uffa3\40",
            "\1\uffff",
            "\12\23\1\uffff\2\23\1\uffff\40\23\1\102\1\23\12\100\7\23\6"+
            "\100\5\23\1\47\3\23\1\101\20\23\6\100\5\23\1\47\3\23\1\101\uff8f"+
            "\23",
            "\1\132\1\uffff\1\132\2\uffff\12\133",
            "\12\134\7\uffff\6\134\11\uffff\1\101\20\uffff\6\134\11\uffff"+
            "\1\101",
            "\1\uffff",
            "\1\uffff",
            "\12\23\1\uffff\2\23\1\uffff\42\23\12\105\12\23\1\45\1\106\1"+
            "\51\35\23\1\45\1\106\1\51\uff99\23",
            "\1\137\1\uffff\1\137\2\uffff\12\140",
            "\1\uffff",
            "\1\uffff",
            "\12\112",
            "\12\23\1\uffff\2\23\1\uffff\42\23\12\112\12\23\1\45\1\23\1"+
            "\51\35\23\1\45\1\23\1\51\uff99\23",
            "\1\uffff",
            "\1\120",
            "\12\142\7\uffff\6\142\32\uffff\6\142",
            "\1\120\10\uffff\10\143",
            "\1\120\10\uffff\10\144",
            "\12\23\1\uffff\2\23\1\uffff\ufff2\23",
            "",
            "",
            "\12\124",
            "\12\124\14\uffff\1\66\37\uffff\1\66",
            "\12\146\7\uffff\6\146\32\uffff\6\146",
            "\12\40\1\uffff\2\40\1\uffff\24\40\1\41\15\40\10\147\44\40\1"+
            "\37\uffa3\40",
            "\12\40\1\uffff\2\40\1\uffff\24\40\1\41\71\40\1\37\uffa3\40",
            "",
            "\1\uffff",
            "\12\133",
            "\12\23\1\uffff\2\23\1\uffff\42\23\12\133\12\23\1\45\1\23\1"+
            "\51\35\23\1\45\1\23\1\51\uff99\23",
            "\12\134\7\uffff\6\134\11\uffff\1\101\20\uffff\6\134\11\uffff"+
            "\1\101",
            "",
            "\1\uffff",
            "\12\140",
            "\12\23\1\uffff\2\23\1\uffff\42\23\12\140\12\23\1\45\1\23\1"+
            "\51\35\23\1\45\1\23\1\51\uff99\23",
            "\1\uffff",
            "\12\152\7\uffff\6\152\32\uffff\6\152",
            "\1\120\10\uffff\10\153",
            "\1\120",
            "\1\uffff",
            "\12\155\7\uffff\6\155\32\uffff\6\155",
            "\12\40\1\uffff\2\40\1\uffff\24\40\1\41\71\40\1\37\uffa3\40",
            "\1\uffff",
            "\1\uffff",
            "\12\156\7\uffff\6\156\32\uffff\6\156",
            "\1\120",
            "",
            "\12\157\7\uffff\6\157\32\uffff\6\157",
            "\12\160\7\uffff\6\160\32\uffff\6\160",
            "\12\40\1\uffff\2\40\1\uffff\24\40\1\41\71\40\1\37\uffa3\40",
            "\1\120"
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
            return "1:1: Tokens : ( T__39 | T__40 | T__41 | POUND | DOT | PERCENT | FORWARD_SLASH | COMMA | ID | WS | IGNORED_NEWLINE | CHANGE_INDENT | StringLiteral | LONGLITERAL | INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | TEXT | BEGIN_HASH | END_HASH );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_9>='A' && LA32_9<='Z')||(LA32_9>='a' && LA32_9<='z')) && ((( !textMode )||( textMode )))) {s = 27;}

                        else if ( ((LA32_9>='\u0000' && LA32_9<='\t')||(LA32_9>='\u000B' && LA32_9<='\f')||(LA32_9>='\u000E' && LA32_9<='@')||(LA32_9>='[' && LA32_9<='`')||(LA32_9>='{' && LA32_9<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 28;

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_2 = input.LA(1);

                         
                        int index32_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_2>='\u0000' && LA32_2<='\t')||(LA32_2>='\u000B' && LA32_2<='\f')||(LA32_2>='\u000E' && LA32_2<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 21;

                         
                        input.seek(index32_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_69 = input.LA(1);

                         
                        int index32_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_69=='E'||LA32_69=='e') ) {s = 70;}

                        else if ( (LA32_69=='F'||LA32_69=='f') ) {s = 41;}

                        else if ( ((LA32_69>='0' && LA32_69<='9')) ) {s = 69;}

                        else if ( (LA32_69=='D'||LA32_69=='d') ) {s = 37;}

                        else if ( ((LA32_69>='\u0000' && LA32_69<='\t')||(LA32_69>='\u000B' && LA32_69<='\f')||(LA32_69>='\u000E' && LA32_69<='/')||(LA32_69>=':' && LA32_69<='C')||(LA32_69>='G' && LA32_69<='c')||(LA32_69>='g' && LA32_69<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 94;

                         
                        input.seek(index32_69);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_1 = input.LA(1);

                         
                        int index32_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_1>='\u0000' && LA32_1<='\t')||(LA32_1>='\u000B' && LA32_1<='\f')||(LA32_1>='\u000E' && LA32_1<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 20;

                         
                        input.seek(index32_1);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_0 = input.LA(1);

                         
                        int index32_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_0==':') ) {s = 1;}

                        else if ( (LA32_0=='=') ) {s = 2;}

                        else if ( (LA32_0=='>') ) {s = 3;}

                        else if ( (LA32_0=='#') && (( beginningOfLine ))) {s = 4;}

                        else if ( (LA32_0=='.') ) {s = 5;}

                        else if ( (LA32_0=='%') && (( beginningOfLine ))) {s = 6;}

                        else if ( (LA32_0=='/') && ((( !textMode )||( textMode )))) {s = 7;}

                        else if ( (LA32_0==',') && ((( !textMode )||( textMode )))) {s = 8;}

                        else if ( ((LA32_0>='A' && LA32_0<='Z')||(LA32_0>='a' && LA32_0<='z')) && ((( !textMode )||( textMode )))) {s = 9;}

                        else if ( (LA32_0==' ') && (( !textMode ))) {s = 10;}

                        else if ( (LA32_0=='\r') && ((( !hashMode )||( hashMode )))) {s = 11;}

                        else if ( (LA32_0=='\n') && ((( !hashMode )||( hashMode )))) {s = 12;}

                        else if ( (LA32_0=='\"') && ((( !textMode )||( textMode )))) {s = 13;}

                        else if ( (LA32_0=='0') ) {s = 14;}

                        else if ( ((LA32_0>='1' && LA32_0<='9')) ) {s = 15;}

                        else if ( (LA32_0=='\'') ) {s = 16;}

                        else if ( (LA32_0=='{') && ((( !textMode )||( textMode )))) {s = 17;}

                        else if ( (LA32_0=='}') && ((( textMode )||( hashMode )))) {s = 18;}

                        else if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\u001F')||LA32_0=='!'||LA32_0=='$'||LA32_0=='&'||(LA32_0>='(' && LA32_0<='+')||LA32_0=='-'||(LA32_0>=';' && LA32_0<='<')||(LA32_0>='?' && LA32_0<='@')||(LA32_0>='[' && LA32_0<='`')||LA32_0=='|'||(LA32_0>='~' && LA32_0<='\uFFFF')) && (( textMode ))) {s = 19;}

                         
                        input.seek(index32_0);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_111 = input.LA(1);

                         
                        int index32_111 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_111=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA32_111=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA32_111>='\u0000' && LA32_111<='\t')||(LA32_111>='\u000B' && LA32_111<='\f')||(LA32_111>='\u000E' && LA32_111<='!')||(LA32_111>='#' && LA32_111<='[')||(LA32_111>=']' && LA32_111<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else s = 19;

                         
                        input.seek(index32_111);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_35 = input.LA(1);

                         
                        int index32_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_35>='0' && LA32_35<='9')||(LA32_35>='A' && LA32_35<='F')||(LA32_35>='a' && LA32_35<='f')) ) {s = 64;}

                        else if ( (LA32_35=='P'||LA32_35=='p') ) {s = 65;}

                        else if ( (LA32_35=='.') ) {s = 66;}

                        else s = 19;

                         
                        input.seek(index32_35);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_78 = input.LA(1);

                         
                        int index32_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_78>='0' && LA32_78<='7')) ) {s = 99;}

                        else if ( (LA32_78=='\'') ) {s = 80;}

                        else s = 19;

                         
                        input.seek(index32_78);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA32_99 = input.LA(1);

                         
                        int index32_99 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_99=='\'') ) {s = 80;}

                        else if ( ((LA32_99>='0' && LA32_99<='7')) ) {s = 107;}

                        else s = 19;

                         
                        input.seek(index32_99);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA32_44 = input.LA(1);

                         
                        int index32_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_44=='D'||LA32_44=='d') ) {s = 37;}

                        else if ( ((LA32_44>='0' && LA32_44<='9')) ) {s = 44;}

                        else if ( (LA32_44=='E'||LA32_44=='e') ) {s = 42;}

                        else if ( (LA32_44=='.') ) {s = 40;}

                        else if ( (LA32_44=='F'||LA32_44=='f') ) {s = 41;}

                        else if ( (LA32_44=='L'||LA32_44=='l') ) {s = 39;}

                        else if ( ((LA32_44>='\u0000' && LA32_44<='\t')||(LA32_44>='\u000B' && LA32_44<='\f')||(LA32_44>='\u000E' && LA32_44<='-')||LA32_44=='/'||(LA32_44>=':' && LA32_44<='C')||(LA32_44>='G' && LA32_44<='K')||(LA32_44>='M' && LA32_44<='c')||(LA32_44>='g' && LA32_44<='k')||(LA32_44>='m' && LA32_44<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 36;

                         
                        input.seek(index32_44);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA32_22 = input.LA(1);

                         
                        int index32_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 51;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_22);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA32_29 = input.LA(1);

                         
                        int index32_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 58;}

                        else if ( (( !hashMode )) ) {s = 30;}

                         
                        input.seek(index32_29);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA32_20 = input.LA(1);

                         
                        int index32_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 49;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_20);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA32_62 = input.LA(1);

                         
                        int index32_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_62>='0' && LA32_62<='7')) && ((( !textMode )||( textMode )))) {s = 87;}

                        else if ( (LA32_62=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA32_62=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA32_62>='\u0000' && LA32_62<='\t')||(LA32_62>='\u000B' && LA32_62<='\f')||(LA32_62>='\u000E' && LA32_62<='!')||(LA32_62>='#' && LA32_62<='/')||(LA32_62>='8' && LA32_62<='[')||(LA32_62>=']' && LA32_62<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else s = 19;

                         
                        input.seek(index32_62);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA32_21 = input.LA(1);

                         
                        int index32_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 50;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_21);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA32_61 = input.LA(1);

                         
                        int index32_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_61>='0' && LA32_61<='7')) && ((( !textMode )||( textMode )))) {s = 86;}

                        else if ( (LA32_61=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA32_61=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA32_61>='\u0000' && LA32_61<='\t')||(LA32_61>='\u000B' && LA32_61<='\f')||(LA32_61>='\u000E' && LA32_61<='!')||(LA32_61>='#' && LA32_61<='/')||(LA32_61>='8' && LA32_61<='[')||(LA32_61>=']' && LA32_61<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else s = 19;

                         
                        input.seek(index32_61);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA32_48 = input.LA(1);

                         
                        int index32_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( textMode )) ) {s = 19;}

                        else if ( (( hashMode )) ) {s = 82;}

                         
                        input.seek(index32_48);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA32_47 = input.LA(1);

                         
                        int index32_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( textMode )) ) {s = 19;}

                        else if ( (( !textMode )) ) {s = 81;}

                         
                        input.seek(index32_47);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA32_101 = input.LA(1);

                         
                        int index32_101 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 108;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_101);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA32_105 = input.LA(1);

                         
                        int index32_105 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_105);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA32_104 = input.LA(1);

                         
                        int index32_104 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_104);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA32_97 = input.LA(1);

                         
                        int index32_97 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_97);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA32_67 = input.LA(1);

                         
                        int index32_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_67);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA32_71 = input.LA(1);

                         
                        int index32_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_71);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA32_75 = input.LA(1);

                         
                        int index32_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_75);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA32_94 = input.LA(1);

                         
                        int index32_94 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 53;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_94);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA32_72 = input.LA(1);

                         
                        int index32_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 54;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_72);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA32_89 = input.LA(1);

                         
                        int index32_89 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 36;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_89);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA32_32 = input.LA(1);

                         
                        int index32_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_32=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA32_32=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA32_32>='\u0000' && LA32_32<='\t')||(LA32_32>='\u000B' && LA32_32<='\f')||(LA32_32>='\u000E' && LA32_32<='!')||(LA32_32>='#' && LA32_32<='[')||(LA32_32>=']' && LA32_32<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else s = 19;

                         
                        input.seek(index32_32);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA32_68 = input.LA(1);

                         
                        int index32_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 93;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_68);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA32_63 = input.LA(1);

                         
                        int index32_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 88;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_63);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA32_66 = input.LA(1);

                         
                        int index32_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_66>='0' && LA32_66<='9')||(LA32_66>='A' && LA32_66<='F')||(LA32_66>='a' && LA32_66<='f')) ) {s = 92;}

                        else if ( (LA32_66=='P'||LA32_66=='p') ) {s = 65;}

                        else s = 19;

                         
                        input.seek(index32_66);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA32_18 = input.LA(1);

                         
                        int index32_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_18>='\u0000' && LA32_18<='\t')||(LA32_18>='\u000B' && LA32_18<='\f')||(LA32_18>='\u000E' && LA32_18<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 48;

                         
                        input.seek(index32_18);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA32_28 = input.LA(1);

                         
                        int index32_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 57;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_28);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA32_26 = input.LA(1);

                         
                        int index32_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 56;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_26);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA32_25 = input.LA(1);

                         
                        int index32_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 55;}

                        else if ( (( textMode )) ) {s = 19;}

                         
                        input.seek(index32_25);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA32_41 = input.LA(1);

                         
                        int index32_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_41>='\u0000' && LA32_41<='\t')||(LA32_41>='\u000B' && LA32_41<='\f')||(LA32_41>='\u000E' && LA32_41<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 72;

                         
                        input.seek(index32_41);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA32_77 = input.LA(1);

                         
                        int index32_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_77>='0' && LA32_77<='9')||(LA32_77>='A' && LA32_77<='F')||(LA32_77>='a' && LA32_77<='f')) ) {s = 98;}

                        else s = 19;

                         
                        input.seek(index32_77);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA32_12 = input.LA(1);

                         
                        int index32_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_12==' ') && (( !hashMode ))) {s = 30;}

                        else s = 29;

                         
                        input.seek(index32_12);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA32_65 = input.LA(1);

                         
                        int index32_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_65=='+'||LA32_65=='-') ) {s = 90;}

                        else if ( ((LA32_65>='0' && LA32_65<='9')) ) {s = 91;}

                        else s = 19;

                         
                        input.seek(index32_65);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA32_79 = input.LA(1);

                         
                        int index32_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_79>='0' && LA32_79<='7')) ) {s = 100;}

                        else if ( (LA32_79=='\'') ) {s = 80;}

                        else s = 19;

                         
                        input.seek(index32_79);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA32_16 = input.LA(1);

                         
                        int index32_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_16=='\\') ) {s = 45;}

                        else if ( ((LA32_16>='\u0000' && LA32_16<='\t')||(LA32_16>='\u000B' && LA32_16<='\f')||(LA32_16>='\u000E' && LA32_16<='&')||(LA32_16>='(' && LA32_16<='[')||(LA32_16>=']' && LA32_16<='\uFFFF')) ) {s = 46;}

                        else s = 19;

                         
                        input.seek(index32_16);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA32_60 = input.LA(1);

                         
                        int index32_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_60>='0' && LA32_60<='9')||(LA32_60>='A' && LA32_60<='F')||(LA32_60>='a' && LA32_60<='f')) && ((( !textMode )||( textMode )))) {s = 85;}

                        else s = 19;

                         
                        input.seek(index32_60);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA32_112 = input.LA(1);

                         
                        int index32_112 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_112=='\'') ) {s = 80;}

                        else s = 19;

                         
                        input.seek(index32_112);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA32_39 = input.LA(1);

                         
                        int index32_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_39>='\u0000' && LA32_39<='\t')||(LA32_39>='\u000B' && LA32_39<='\f')||(LA32_39>='\u000E' && LA32_39<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 68;

                         
                        input.seek(index32_39);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA32_37 = input.LA(1);

                         
                        int index32_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_37>='\u0000' && LA32_37<='\t')||(LA32_37>='\u000B' && LA32_37<='\f')||(LA32_37>='\u000E' && LA32_37<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 67;

                         
                        input.seek(index32_37);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA32_40 = input.LA(1);

                         
                        int index32_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_40>='0' && LA32_40<='9')) ) {s = 69;}

                        else if ( (LA32_40=='E'||LA32_40=='e') ) {s = 70;}

                        else if ( (LA32_40=='D'||LA32_40=='d') ) {s = 37;}

                        else if ( (LA32_40=='F'||LA32_40=='f') ) {s = 41;}

                        else if ( ((LA32_40>='\u0000' && LA32_40<='\t')||(LA32_40>='\u000B' && LA32_40<='\f')||(LA32_40>='\u000E' && LA32_40<='/')||(LA32_40>=':' && LA32_40<='C')||(LA32_40>='G' && LA32_40<='c')||(LA32_40>='g' && LA32_40<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 71;

                         
                        input.seek(index32_40);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA32_92 = input.LA(1);

                         
                        int index32_92 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_92=='P'||LA32_92=='p') ) {s = 65;}

                        else if ( ((LA32_92>='0' && LA32_92<='9')||(LA32_92>='A' && LA32_92<='F')||(LA32_92>='a' && LA32_92<='f')) ) {s = 92;}

                        else s = 19;

                         
                        input.seek(index32_92);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA32_85 = input.LA(1);

                         
                        int index32_85 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_85>='0' && LA32_85<='9')||(LA32_85>='A' && LA32_85<='F')||(LA32_85>='a' && LA32_85<='f')) && ((( !textMode )||( textMode )))) {s = 102;}

                        else s = 19;

                         
                        input.seek(index32_85);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA32_102 = input.LA(1);

                         
                        int index32_102 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_102>='0' && LA32_102<='9')||(LA32_102>='A' && LA32_102<='F')||(LA32_102>='a' && LA32_102<='f')) && ((( !textMode )||( textMode )))) {s = 109;}

                        else s = 19;

                         
                        input.seek(index32_102);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA32_86 = input.LA(1);

                         
                        int index32_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_86=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA32_86=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA32_86>='0' && LA32_86<='7')) && ((( !textMode )||( textMode )))) {s = 103;}

                        else if ( ((LA32_86>='\u0000' && LA32_86<='\t')||(LA32_86>='\u000B' && LA32_86<='\f')||(LA32_86>='\u000E' && LA32_86<='!')||(LA32_86>='#' && LA32_86<='/')||(LA32_86>='8' && LA32_86<='[')||(LA32_86>=']' && LA32_86<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else s = 19;

                         
                        input.seek(index32_86);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_8>='\u0000' && LA32_8<='\t')||(LA32_8>='\u000B' && LA32_8<='\f')||(LA32_8>='\u000E' && LA32_8<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 26;

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA32_80 = input.LA(1);

                         
                        int index32_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_80>='\u0000' && LA32_80<='\t')||(LA32_80>='\u000B' && LA32_80<='\f')||(LA32_80>='\u000E' && LA32_80<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 101;

                         
                        input.seek(index32_80);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA32_43 = input.LA(1);

                         
                        int index32_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_43=='D'||LA32_43=='d') ) {s = 37;}

                        else if ( ((LA32_43>='0' && LA32_43<='9')) ) {s = 43;}

                        else if ( (LA32_43=='E'||LA32_43=='e') ) {s = 42;}

                        else if ( (LA32_43=='.') ) {s = 40;}

                        else if ( (LA32_43=='F'||LA32_43=='f') ) {s = 41;}

                        else if ( ((LA32_43>='\u0000' && LA32_43<='\t')||(LA32_43>='\u000B' && LA32_43<='\f')||(LA32_43>='\u000E' && LA32_43<='-')||LA32_43=='/'||(LA32_43>=':' && LA32_43<='C')||(LA32_43>='G' && LA32_43<='c')||(LA32_43>='g' && LA32_43<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 75;

                         
                        input.seek(index32_43);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA32_109 = input.LA(1);

                         
                        int index32_109 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_109>='0' && LA32_109<='9')||(LA32_109>='A' && LA32_109<='F')||(LA32_109>='a' && LA32_109<='f')) && ((( !textMode )||( textMode )))) {s = 111;}

                        else s = 19;

                         
                        input.seek(index32_109);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA32_110 = input.LA(1);

                         
                        int index32_110 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_110>='0' && LA32_110<='9')||(LA32_110>='A' && LA32_110<='F')||(LA32_110>='a' && LA32_110<='f')) ) {s = 112;}

                        else s = 19;

                         
                        input.seek(index32_110);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_7>='\u0000' && LA32_7<='\t')||(LA32_7>='\u000B' && LA32_7<='\f')||(LA32_7>='\u000E' && LA32_7<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 25;

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA32_106 = input.LA(1);

                         
                        int index32_106 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_106>='0' && LA32_106<='9')||(LA32_106>='A' && LA32_106<='F')||(LA32_106>='a' && LA32_106<='f')) ) {s = 110;}

                        else s = 19;

                         
                        input.seek(index32_106);
                        if ( s>=0 ) return s;
                        break;
                    case 58 : 
                        int LA32_64 = input.LA(1);

                         
                        int index32_64 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_64>='0' && LA32_64<='9')||(LA32_64>='A' && LA32_64<='F')||(LA32_64>='a' && LA32_64<='f')) ) {s = 64;}

                        else if ( (LA32_64=='P'||LA32_64=='p') ) {s = 65;}

                        else if ( (LA32_64=='.') ) {s = 66;}

                        else if ( (LA32_64=='L'||LA32_64=='l') ) {s = 39;}

                        else if ( ((LA32_64>='\u0000' && LA32_64<='\t')||(LA32_64>='\u000B' && LA32_64<='\f')||(LA32_64>='\u000E' && LA32_64<='-')||LA32_64=='/'||(LA32_64>=':' && LA32_64<='@')||(LA32_64>='G' && LA32_64<='K')||(LA32_64>='M' && LA32_64<='O')||(LA32_64>='Q' && LA32_64<='`')||(LA32_64>='g' && LA32_64<='k')||(LA32_64>='m' && LA32_64<='o')||(LA32_64>='q' && LA32_64<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 89;

                         
                        input.seek(index32_64);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA32_90 = input.LA(1);

                         
                        int index32_90 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_90>='0' && LA32_90<='9')) ) {s = 91;}

                        else s = 19;

                         
                        input.seek(index32_90);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA32_98 = input.LA(1);

                         
                        int index32_98 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_98>='0' && LA32_98<='9')||(LA32_98>='A' && LA32_98<='F')||(LA32_98>='a' && LA32_98<='f')) ) {s = 106;}

                        else s = 19;

                         
                        input.seek(index32_98);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA32_15 = input.LA(1);

                         
                        int index32_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_15=='D'||LA32_15=='d') ) {s = 37;}

                        else if ( ((LA32_15>='0' && LA32_15<='9')) ) {s = 44;}

                        else if ( (LA32_15=='E'||LA32_15=='e') ) {s = 42;}

                        else if ( (LA32_15=='.') ) {s = 40;}

                        else if ( (LA32_15=='L'||LA32_15=='l') ) {s = 39;}

                        else if ( (LA32_15=='F'||LA32_15=='f') ) {s = 41;}

                        else if ( ((LA32_15>='\u0000' && LA32_15<='\t')||(LA32_15>='\u000B' && LA32_15<='\f')||(LA32_15>='\u000E' && LA32_15<='-')||LA32_15=='/'||(LA32_15>=':' && LA32_15<='C')||(LA32_15>='G' && LA32_15<='K')||(LA32_15>='M' && LA32_15<='c')||(LA32_15>='g' && LA32_15<='k')||(LA32_15>='m' && LA32_15<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 36;

                         
                        input.seek(index32_15);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA32_46 = input.LA(1);

                         
                        int index32_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_46=='\'') ) {s = 80;}

                        else s = 19;

                         
                        input.seek(index32_46);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA32_11 = input.LA(1);

                         
                        int index32_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_11=='\n') && ((( !hashMode )||( hashMode )))) {s = 12;}

                         
                        input.seek(index32_11);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA32_74 = input.LA(1);

                         
                        int index32_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_74=='D'||LA32_74=='d') ) {s = 37;}

                        else if ( ((LA32_74>='0' && LA32_74<='9')) ) {s = 74;}

                        else if ( (LA32_74=='F'||LA32_74=='f') ) {s = 41;}

                        else if ( ((LA32_74>='\u0000' && LA32_74<='\t')||(LA32_74>='\u000B' && LA32_74<='\f')||(LA32_74>='\u000E' && LA32_74<='/')||(LA32_74>=':' && LA32_74<='C')||LA32_74=='E'||(LA32_74>='G' && LA32_74<='c')||LA32_74=='e'||(LA32_74>='g' && LA32_74<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 97;

                         
                        input.seek(index32_74);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA32_73 = input.LA(1);

                         
                        int index32_73 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_73>='0' && LA32_73<='9')) ) {s = 74;}

                        else s = 19;

                         
                        input.seek(index32_73);
                        if ( s>=0 ) return s;
                        break;
                    case 66 : 
                        int LA32_95 = input.LA(1);

                         
                        int index32_95 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_95>='0' && LA32_95<='9')) ) {s = 96;}

                        else s = 19;

                         
                        input.seek(index32_95);
                        if ( s>=0 ) return s;
                        break;
                    case 67 : 
                        int LA32_33 = input.LA(1);

                         
                        int index32_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_33>='\u0000' && LA32_33<='\t')||(LA32_33>='\u000B' && LA32_33<='\f')||(LA32_33>='\u000E' && LA32_33<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 63;

                         
                        input.seek(index32_33);
                        if ( s>=0 ) return s;
                        break;
                    case 68 : 
                        int LA32_59 = input.LA(1);

                         
                        int index32_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_59=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA32_59=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA32_59>='\u0000' && LA32_59<='\t')||(LA32_59>='\u000B' && LA32_59<='\f')||(LA32_59>='\u000E' && LA32_59<='!')||(LA32_59>='#' && LA32_59<='[')||(LA32_59>=']' && LA32_59<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else s = 19;

                         
                        input.seek(index32_59);
                        if ( s>=0 ) return s;
                        break;
                    case 69 : 
                        int LA32_27 = input.LA(1);

                         
                        int index32_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_27>='A' && LA32_27<='Z')||(LA32_27>='a' && LA32_27<='z')) && ((( !textMode )||( textMode )))) {s = 27;}

                        else if ( ((LA32_27>='\u0000' && LA32_27<='\t')||(LA32_27>='\u000B' && LA32_27<='\f')||(LA32_27>='\u000E' && LA32_27<='@')||(LA32_27>='[' && LA32_27<='`')||(LA32_27>='{' && LA32_27<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 28;

                         
                        input.seek(index32_27);
                        if ( s>=0 ) return s;
                        break;
                    case 70 : 
                        int LA32_42 = input.LA(1);

                         
                        int index32_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_42=='+'||LA32_42=='-') ) {s = 73;}

                        else if ( ((LA32_42>='0' && LA32_42<='9')) ) {s = 74;}

                        else s = 19;

                         
                        input.seek(index32_42);
                        if ( s>=0 ) return s;
                        break;
                    case 71 : 
                        int LA32_70 = input.LA(1);

                         
                        int index32_70 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_70=='+'||LA32_70=='-') ) {s = 95;}

                        else if ( ((LA32_70>='0' && LA32_70<='9')) ) {s = 96;}

                        else s = 19;

                         
                        input.seek(index32_70);
                        if ( s>=0 ) return s;
                        break;
                    case 72 : 
                        int LA32_107 = input.LA(1);

                         
                        int index32_107 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_107=='\'') ) {s = 80;}

                        else s = 19;

                         
                        input.seek(index32_107);
                        if ( s>=0 ) return s;
                        break;
                    case 73 : 
                        int LA32_5 = input.LA(1);

                         
                        int index32_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_5>='0' && LA32_5<='9')) ) {s = 23;}

                        else s = 24;

                         
                        input.seek(index32_5);
                        if ( s>=0 ) return s;
                        break;
                    case 74 : 
                        int LA32_100 = input.LA(1);

                         
                        int index32_100 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_100=='\'') ) {s = 80;}

                        else s = 19;

                         
                        input.seek(index32_100);
                        if ( s>=0 ) return s;
                        break;
                    case 75 : 
                        int LA32_38 = input.LA(1);

                         
                        int index32_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_38=='D'||LA32_38=='d') ) {s = 37;}

                        else if ( ((LA32_38>='0' && LA32_38<='7')) ) {s = 38;}

                        else if ( (LA32_38=='E'||LA32_38=='e') ) {s = 42;}

                        else if ( (LA32_38=='.') ) {s = 40;}

                        else if ( ((LA32_38>='8' && LA32_38<='9')) ) {s = 43;}

                        else if ( (LA32_38=='F'||LA32_38=='f') ) {s = 41;}

                        else if ( (LA32_38=='L'||LA32_38=='l') ) {s = 39;}

                        else if ( ((LA32_38>='\u0000' && LA32_38<='\t')||(LA32_38>='\u000B' && LA32_38<='\f')||(LA32_38>='\u000E' && LA32_38<='-')||LA32_38=='/'||(LA32_38>=':' && LA32_38<='C')||(LA32_38>='G' && LA32_38<='K')||(LA32_38>='M' && LA32_38<='c')||(LA32_38>='g' && LA32_38<='k')||(LA32_38>='m' && LA32_38<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 36;

                         
                        input.seek(index32_38);
                        if ( s>=0 ) return s;
                        break;
                    case 76 : 
                        int LA32_17 = input.LA(1);

                         
                        int index32_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_17>='\u0000' && LA32_17<='\t')||(LA32_17>='\u000B' && LA32_17<='\f')||(LA32_17>='\u000E' && LA32_17<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 47;

                         
                        input.seek(index32_17);
                        if ( s>=0 ) return s;
                        break;
                    case 77 : 
                        int LA32_31 = input.LA(1);

                         
                        int index32_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_31=='\"'||LA32_31=='\''||LA32_31=='\\'||LA32_31=='b'||LA32_31=='f'||LA32_31=='n'||LA32_31=='r'||LA32_31=='t') && ((( !textMode )||( textMode )))) {s = 59;}

                        else if ( (LA32_31=='u') && ((( !textMode )||( textMode )))) {s = 60;}

                        else if ( ((LA32_31>='0' && LA32_31<='3')) && ((( !textMode )||( textMode )))) {s = 61;}

                        else if ( ((LA32_31>='4' && LA32_31<='7')) && ((( !textMode )||( textMode )))) {s = 62;}

                        else s = 19;

                         
                        input.seek(index32_31);
                        if ( s>=0 ) return s;
                        break;
                    case 78 : 
                        int LA32_91 = input.LA(1);

                         
                        int index32_91 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_91=='D'||LA32_91=='d') ) {s = 37;}

                        else if ( ((LA32_91>='0' && LA32_91<='9')) ) {s = 91;}

                        else if ( (LA32_91=='F'||LA32_91=='f') ) {s = 41;}

                        else if ( ((LA32_91>='\u0000' && LA32_91<='\t')||(LA32_91>='\u000B' && LA32_91<='\f')||(LA32_91>='\u000E' && LA32_91<='/')||(LA32_91>=':' && LA32_91<='C')||LA32_91=='E'||(LA32_91>='G' && LA32_91<='c')||LA32_91=='e'||(LA32_91>='g' && LA32_91<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 104;

                         
                        input.seek(index32_91);
                        if ( s>=0 ) return s;
                        break;
                    case 79 : 
                        int LA32_96 = input.LA(1);

                         
                        int index32_96 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_96=='D'||LA32_96=='d') ) {s = 37;}

                        else if ( ((LA32_96>='0' && LA32_96<='9')) ) {s = 96;}

                        else if ( (LA32_96=='F'||LA32_96=='f') ) {s = 41;}

                        else if ( ((LA32_96>='\u0000' && LA32_96<='\t')||(LA32_96>='\u000B' && LA32_96<='\f')||(LA32_96>='\u000E' && LA32_96<='/')||(LA32_96>=':' && LA32_96<='C')||LA32_96=='E'||(LA32_96>='G' && LA32_96<='c')||LA32_96=='e'||(LA32_96>='g' && LA32_96<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 105;

                         
                        input.seek(index32_96);
                        if ( s>=0 ) return s;
                        break;
                    case 80 : 
                        int LA32_45 = input.LA(1);

                         
                        int index32_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_45=='\"'||LA32_45=='\''||LA32_45=='\\'||LA32_45=='b'||LA32_45=='f'||LA32_45=='n'||LA32_45=='r'||LA32_45=='t') ) {s = 76;}

                        else if ( (LA32_45=='u') ) {s = 77;}

                        else if ( ((LA32_45>='0' && LA32_45<='3')) ) {s = 78;}

                        else if ( ((LA32_45>='4' && LA32_45<='7')) ) {s = 79;}

                        else s = 19;

                         
                        input.seek(index32_45);
                        if ( s>=0 ) return s;
                        break;
                    case 81 : 
                        int LA32_76 = input.LA(1);

                         
                        int index32_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_76=='\'') ) {s = 80;}

                        else s = 19;

                         
                        input.seek(index32_76);
                        if ( s>=0 ) return s;
                        break;
                    case 82 : 
                        int LA32_34 = input.LA(1);

                         
                        int index32_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_34>='0' && LA32_34<='9')||(LA32_34>='A' && LA32_34<='F')||(LA32_34>='a' && LA32_34<='f')) ) {s = 64;}

                        else if ( (LA32_34=='P'||LA32_34=='p') ) {s = 65;}

                        else if ( (LA32_34=='.') ) {s = 66;}

                        else s = 19;

                         
                        input.seek(index32_34);
                        if ( s>=0 ) return s;
                        break;
                    case 83 : 
                        int LA32_87 = input.LA(1);

                         
                        int index32_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_87=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA32_87=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA32_87>='\u0000' && LA32_87<='\t')||(LA32_87>='\u000B' && LA32_87<='\f')||(LA32_87>='\u000E' && LA32_87<='!')||(LA32_87>='#' && LA32_87<='[')||(LA32_87>=']' && LA32_87<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else s = 19;

                         
                        input.seek(index32_87);
                        if ( s>=0 ) return s;
                        break;
                    case 84 : 
                        int LA32_103 = input.LA(1);

                         
                        int index32_103 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_103=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA32_103=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA32_103>='\u0000' && LA32_103<='\t')||(LA32_103>='\u000B' && LA32_103<='\f')||(LA32_103>='\u000E' && LA32_103<='!')||(LA32_103>='#' && LA32_103<='[')||(LA32_103>=']' && LA32_103<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else s = 19;

                         
                        input.seek(index32_103);
                        if ( s>=0 ) return s;
                        break;
                    case 85 : 
                        int LA32_14 = input.LA(1);

                         
                        int index32_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_14=='x') ) {s = 34;}

                        else if ( (LA32_14=='X') ) {s = 35;}

                        else if ( (LA32_14=='D'||LA32_14=='d') ) {s = 37;}

                        else if ( ((LA32_14>='0' && LA32_14<='7')) ) {s = 38;}

                        else if ( (LA32_14=='L'||LA32_14=='l') ) {s = 39;}

                        else if ( (LA32_14=='.') ) {s = 40;}

                        else if ( (LA32_14=='F'||LA32_14=='f') ) {s = 41;}

                        else if ( (LA32_14=='E'||LA32_14=='e') ) {s = 42;}

                        else if ( ((LA32_14>='8' && LA32_14<='9')) ) {s = 43;}

                        else if ( ((LA32_14>='\u0000' && LA32_14<='\t')||(LA32_14>='\u000B' && LA32_14<='\f')||(LA32_14>='\u000E' && LA32_14<='-')||LA32_14=='/'||(LA32_14>=':' && LA32_14<='C')||(LA32_14>='G' && LA32_14<='K')||(LA32_14>='M' && LA32_14<='W')||(LA32_14>='Y' && LA32_14<='c')||(LA32_14>='g' && LA32_14<='k')||(LA32_14>='m' && LA32_14<='w')||(LA32_14>='y' && LA32_14<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 36;

                         
                        input.seek(index32_14);
                        if ( s>=0 ) return s;
                        break;
                    case 86 : 
                        int LA32_13 = input.LA(1);

                         
                        int index32_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA32_13=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA32_13>='\u0000' && LA32_13<='\t')||(LA32_13>='\u000B' && LA32_13<='\f')||(LA32_13>='\u000E' && LA32_13<='!')||(LA32_13>='#' && LA32_13<='[')||(LA32_13>=']' && LA32_13<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( (LA32_13=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else s = 19;

                         
                        input.seek(index32_13);
                        if ( s>=0 ) return s;
                        break;
                    case 87 : 
                        int LA32_3 = input.LA(1);

                         
                        int index32_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA32_3>='\u0000' && LA32_3<='\t')||(LA32_3>='\u000B' && LA32_3<='\f')||(LA32_3>='\u000E' && LA32_3<='\uFFFF')) && (( textMode ))) {s = 19;}

                        else s = 22;

                         
                        input.seek(index32_3);
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