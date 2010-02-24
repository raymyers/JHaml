// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-23 22:56:52

package com.cadrlife.jaml;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class JamlLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int PERCENT=9;
    public static final int IGNORED_NEWLINE=21;
    public static final int POUND=15;
    public static final int END_HASH=13;
    public static final int CHANGE_INDENT=22;
    public static final int SpacesQ=23;
    public static final int INT=17;
    public static final int DEDENT=5;
    public static final int TEXT=7;
    public static final int ID=10;
    public static final int EOF=-1;
    public static final int HexDigit=27;
    public static final int BEGIN_HASH=11;
    public static final int INDENT=4;
    public static final int StringLiteral=14;
    public static final int T__30=30;
    public static final int WS=19;
    public static final int NEWLINE=6;
    public static final int COMMA=12;
    public static final int Spaces=18;
    public static final int UnicodeEscape=25;
    public static final int NL=20;
    public static final int DOT=16;
    public static final int EscapeSequence=24;
    public static final int OctalEscape=26;
    public static final int FORWARD_SLASH=8;

    	int currentIndentation = 0;
    	boolean textMode = true;
    	boolean hashMode = false;
    	boolean beginningOfLine = true;
    	
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

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
    traceIn("T__28", 1);
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:28:7: ( ':' )
            // ../etc/Jaml.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("T__28", 1);
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
    traceIn("T__29", 2);
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:29:7: ( '=' )
            // ../etc/Jaml.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("T__29", 2);
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
    traceIn("T__30", 3);
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:30:7: ( '>' )
            // ../etc/Jaml.g:30:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("T__30", 3);
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "POUND"
    public final void mPOUND() throws RecognitionException {
    traceIn("POUND", 4);
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
            // ../etc/Jaml.g:117:5: ({...}? => ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // ../etc/Jaml.g:117:7: {...}? => ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "ID", " !textMode ");
            }
            // ../etc/Jaml.g:117:24: ( 'a' .. 'z' | 'A' .. 'Z' )+
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

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
    traceIn("INT", 10);
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:118:5: ({...}? => ( '0' .. '9' )+ )
            // ../etc/Jaml.g:118:7: {...}? => ( '0' .. '9' )+
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "INT", " !textMode ");
            }
            // ../etc/Jaml.g:118:25: ( '0' .. '9' )+
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
            	    // ../etc/Jaml.g:118:25: '0' .. '9'
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
    traceOut("INT", 10);
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "BEGIN_HASH"
    public final void mBEGIN_HASH() throws RecognitionException {
    traceIn("BEGIN_HASH", 11);
        try {
            int _type = BEGIN_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:121:11: ({...}? => '{' )
            // ../etc/Jaml.g:121:13: {...}? => '{'
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
    traceOut("BEGIN_HASH", 11);
        }
    }
    // $ANTLR end "BEGIN_HASH"

    // $ANTLR start "END_HASH"
    public final void mEND_HASH() throws RecognitionException {
    traceIn("END_HASH", 12);
        try {
            int _type = END_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:124:9: ({...}? => '}' )
            // ../etc/Jaml.g:124:11: {...}? => '}'
            {
            if ( !(( hashMode )) ) {
                throw new FailedPredicateException(input, "END_HASH", " hashMode ");
            }
            match('}'); 
            hashMode = false; //textMode = true;
              

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
    traceOut("END_HASH", 12);
        }
    }
    // $ANTLR end "END_HASH"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
    traceIn("WS", 13);
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
    traceOut("WS", 13);
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "IGNORED_NEWLINE"
    public final void mIGNORED_NEWLINE() throws RecognitionException {
    traceIn("IGNORED_NEWLINE", 14);
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
    traceOut("IGNORED_NEWLINE", 14);
        }
    }
    // $ANTLR end "IGNORED_NEWLINE"

    // $ANTLR start "CHANGE_INDENT"
    public final void mCHANGE_INDENT() throws RecognitionException {
    traceIn("CHANGE_INDENT", 15);
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
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==' ') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../etc/Jaml.g:135:8: ' '
            	    {
            	    match(' '); 
            	    tb++;

            	    }
            	    break;

            	default :
            	    break loop3;
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
    traceOut("CHANGE_INDENT", 15);
        }
    }
    // $ANTLR end "CHANGE_INDENT"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
    traceIn("NL", 16);
        try {
            // ../etc/Jaml.g:155:3: ( ( '\\r' )? '\\n' )
            // ../etc/Jaml.g:155:5: ( '\\r' )? '\\n'
            {
            // ../etc/Jaml.g:155:5: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
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
    traceOut("NL", 16);
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "SpacesQ"
    public final void mSpacesQ() throws RecognitionException {
    traceIn("SpacesQ", 17);
        try {
            // ../etc/Jaml.g:157:17: ( ( ' ' )* )
            // ../etc/Jaml.g:157:19: ( ' ' )*
            {
            // ../etc/Jaml.g:157:19: ( ' ' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../etc/Jaml.g:157:20: ' '
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
    traceOut("SpacesQ", 17);
        }
    }
    // $ANTLR end "SpacesQ"

    // $ANTLR start "Spaces"
    public final void mSpaces() throws RecognitionException {
    traceIn("Spaces", 18);
        try {
            // ../etc/Jaml.g:158:16: ( ( ' ' )+ )
            // ../etc/Jaml.g:158:18: ( ' ' )+
            {
            // ../etc/Jaml.g:158:18: ( ' ' )+
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
            	    // ../etc/Jaml.g:158:19: ' '
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
    traceOut("Spaces", 18);
        }
    }
    // $ANTLR end "Spaces"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
    traceIn("StringLiteral", 19);
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:160:14: ({...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // ../etc/Jaml.g:160:16: {...}? => '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            if ( !(( !textMode )) ) {
                throw new FailedPredicateException(input, "StringLiteral", " !textMode ");
            }
            match('\"'); 
            // ../etc/Jaml.g:161:9: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
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
            	    // ../etc/Jaml.g:161:11: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:161:28: ~ ( '\\\\' | '\"' )
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
    traceOut("StringLiteral", 19);
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
    traceIn("EscapeSequence", 20);
        try {
            // ../etc/Jaml.g:166:3: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
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
                    // ../etc/Jaml.g:166:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // ../etc/Jaml.g:167:7: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:168:7: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
    traceOut("EscapeSequence", 20);
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
    traceIn("OctalEscape", 21);
        try {
            // ../etc/Jaml.g:173:3: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
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
                    // ../etc/Jaml.g:173:7: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:173:12: ( '0' .. '3' )
                    // ../etc/Jaml.g:173:13: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // ../etc/Jaml.g:173:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:173:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:173:34: ( '0' .. '7' )
                    // ../etc/Jaml.g:173:35: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:174:7: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:174:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:174:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // ../etc/Jaml.g:174:23: ( '0' .. '7' )
                    // ../etc/Jaml.g:174:24: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:175:7: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // ../etc/Jaml.g:175:12: ( '0' .. '7' )
                    // ../etc/Jaml.g:175:13: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
    traceOut("OctalEscape", 21);
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
    traceIn("UnicodeEscape", 22);
        try {
            // ../etc/Jaml.g:180:3: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // ../etc/Jaml.g:180:7: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
    traceOut("UnicodeEscape", 22);
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
    traceIn("HexDigit", 23);
        try {
            // ../etc/Jaml.g:184:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../etc/Jaml.g:184:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
    traceOut("HexDigit", 23);
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "TEXT"
    public final void mTEXT() throws RecognitionException {
    traceIn("TEXT", 24);
        try {
            int _type = TEXT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../etc/Jaml.g:186:5: ({...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' ) ) (~ ( '\\r' | '\\n' ) )* )
            // ../etc/Jaml.g:186:7: {...}? => (~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' ) ) (~ ( '\\r' | '\\n' ) )*
            {
            if ( !(( textMode )) ) {
                throw new FailedPredicateException(input, "TEXT", " textMode ");
            }
            // ../etc/Jaml.g:187:7: (~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' ) )
            // ../etc/Jaml.g:187:8: ~ ( '.' | '#' | '%' | '\\r' | '\\n' | ' ' )
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\"')||input.LA(1)=='$'||(input.LA(1)>='&' && input.LA(1)<='-')||(input.LA(1)>='/' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            // ../etc/Jaml.g:188:7: (~ ( '\\r' | '\\n' ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../etc/Jaml.g:188:8: ~ ( '\\r' | '\\n' )
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
    traceOut("TEXT", 24);
        }
    }
    // $ANTLR end "TEXT"

    public void mTokens() throws RecognitionException {
        // ../etc/Jaml.g:1:8: ( T__28 | T__29 | T__30 | POUND | DOT | PERCENT | FORWARD_SLASH | COMMA | ID | INT | BEGIN_HASH | END_HASH | WS | IGNORED_NEWLINE | CHANGE_INDENT | StringLiteral | TEXT )
        int alt11=17;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // ../etc/Jaml.g:1:10: T__28
                {
                mT__28(); 

                }
                break;
            case 2 :
                // ../etc/Jaml.g:1:16: T__29
                {
                mT__29(); 

                }
                break;
            case 3 :
                // ../etc/Jaml.g:1:22: T__30
                {
                mT__30(); 

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
                // ../etc/Jaml.g:1:69: INT
                {
                mINT(); 

                }
                break;
            case 11 :
                // ../etc/Jaml.g:1:73: BEGIN_HASH
                {
                mBEGIN_HASH(); 

                }
                break;
            case 12 :
                // ../etc/Jaml.g:1:84: END_HASH
                {
                mEND_HASH(); 

                }
                break;
            case 13 :
                // ../etc/Jaml.g:1:93: WS
                {
                mWS(); 

                }
                break;
            case 14 :
                // ../etc/Jaml.g:1:96: IGNORED_NEWLINE
                {
                mIGNORED_NEWLINE(); 

                }
                break;
            case 15 :
                // ../etc/Jaml.g:1:112: CHANGE_INDENT
                {
                mCHANGE_INDENT(); 

                }
                break;
            case 16 :
                // ../etc/Jaml.g:1:126: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 17 :
                // ../etc/Jaml.g:1:140: TEXT
                {
                mTEXT(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\22\1\23\1\24\3\uffff\1\25\1\26\1\30\1\31\1\33\1\34\2"+
        "\uffff\1\35\1\21\6\uffff\1\30\2\uffff\1\31\4\uffff\2\21\1\61\13"+
        "\uffff\4\21\1\uffff\7\21";
    static final String DFA11_eofS =
        "\71\uffff";
    static final String DFA11_minS =
        "\4\0\3\uffff\6\0\1\uffff\1\12\1\40\1\0\1\uffff\14\0\1\uffff\1\42"+
        "\2\0\13\uffff\1\0\1\60\3\0\1\60\2\0\1\60\1\0\1\60\1\0";
    static final String DFA11_maxS =
        "\4\uffff\3\uffff\6\uffff\1\uffff\1\12\1\40\1\uffff\1\uffff\5\0\1"+
        "\uffff\2\0\1\uffff\3\0\1\uffff\1\165\2\uffff\13\uffff\1\uffff\1"+
        "\146\2\uffff\1\0\1\146\2\uffff\1\146\1\uffff\1\146\1\uffff";
    static final String DFA11_acceptS =
        "\4\uffff\1\4\1\5\1\6\6\uffff\1\15\3\uffff\1\21\14\uffff\1\17\3\uffff"+
        "\1\20\1\1\1\2\1\3\1\7\1\10\1\11\1\12\1\13\1\14\1\16\14\uffff";
    static final String DFA11_specialS =
        "\1\47\1\32\1\37\1\34\3\uffff\1\15\1\17\1\26\1\13\1\31\1\21\1\uffff"+
        "\1\16\1\12\1\14\1\uffff\1\7\1\11\1\5\1\36\1\35\1\25\1\41\1\40\1"+
        "\6\1\44\1\42\1\43\1\uffff\1\10\1\22\1\27\13\uffff\1\23\1\20\1\2"+
        "\1\45\1\33\1\0\1\1\1\30\1\3\1\24\1\4\1\46}>";
    static final String[] DFA11_transitionS = {
            "\12\21\1\17\2\21\1\16\22\21\1\15\1\21\1\20\1\4\1\21\1\6\6\21"+
            "\1\10\1\21\1\5\1\7\12\12\1\1\2\21\1\2\1\3\2\21\32\11\6\21\32"+
            "\11\1\13\1\21\1\14\uff82\21",
            "\12\21\1\uffff\2\21\1\uffff\ufff2\21",
            "\12\21\1\uffff\2\21\1\uffff\ufff2\21",
            "\12\21\1\uffff\2\21\1\uffff\ufff2\21",
            "",
            "",
            "",
            "\12\21\1\uffff\2\21\1\uffff\ufff2\21",
            "\12\21\1\uffff\2\21\1\uffff\ufff2\21",
            "\12\21\1\uffff\2\21\1\uffff\63\21\32\27\6\21\32\27\uff85\21",
            "\12\21\1\uffff\2\21\1\uffff\42\21\12\32\uffc6\21",
            "\12\21\1\uffff\2\21\1\uffff\ufff2\21",
            "\12\21\1\uffff\2\21\1\uffff\ufff2\21",
            "",
            "\1\17",
            "\1\36",
            "\12\40\1\42\2\40\1\42\24\40\1\41\71\40\1\37\uffa3\40",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\21\1\uffff\2\21\1\uffff\63\21\32\27\6\21\32\27\uff85\21",
            "\1\uffff",
            "\1\uffff",
            "\12\21\1\uffff\2\21\1\uffff\42\21\12\32\uffc6\21",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\55\4\uffff\1\55\10\uffff\4\57\4\60\44\uffff\1\55\5\uffff"+
            "\1\55\3\uffff\1\55\7\uffff\1\55\3\uffff\1\55\1\uffff\1\55\1"+
            "\56",
            "\12\40\1\42\2\40\1\42\24\40\1\41\71\40\1\37\uffa3\40",
            "\12\21\1\uffff\2\21\1\uffff\ufff2\21",
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
            "",
            "\12\40\1\42\2\40\1\42\24\40\1\41\71\40\1\37\uffa3\40",
            "\12\62\7\uffff\6\62\32\uffff\6\62",
            "\12\40\1\42\2\40\1\42\24\40\1\41\15\40\10\63\44\40\1\37\uffa3"+
            "\40",
            "\12\40\1\42\2\40\1\42\24\40\1\41\15\40\10\64\44\40\1\37\uffa3"+
            "\40",
            "\1\uffff",
            "\12\65\7\uffff\6\65\32\uffff\6\65",
            "\12\40\1\42\2\40\1\42\24\40\1\41\15\40\10\66\44\40\1\37\uffa3"+
            "\40",
            "\12\40\1\42\2\40\1\42\24\40\1\41\71\40\1\37\uffa3\40",
            "\12\67\7\uffff\6\67\32\uffff\6\67",
            "\12\40\1\42\2\40\1\42\24\40\1\41\71\40\1\37\uffa3\40",
            "\12\70\7\uffff\6\70\32\uffff\6\70",
            "\12\40\1\42\2\40\1\42\24\40\1\41\71\40\1\37\uffa3\40"
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
            return "1:1: Tokens : ( T__28 | T__29 | T__30 | POUND | DOT | PERCENT | FORWARD_SLASH | COMMA | ID | INT | BEGIN_HASH | END_HASH | WS | IGNORED_NEWLINE | CHANGE_INDENT | StringLiteral | TEXT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_50 = input.LA(1);

                         
                        int index11_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_50>='0' && LA11_50<='9')||(LA11_50>='A' && LA11_50<='F')||(LA11_50>='a' && LA11_50<='f')) && ((( !textMode )||( textMode )))) {s = 53;}

                        else s = 17;

                         
                        input.seek(index11_50);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_51 = input.LA(1);

                         
                        int index11_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_51=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA11_51=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA11_51>='0' && LA11_51<='7')) && ((( !textMode )||( textMode )))) {s = 54;}

                        else if ( ((LA11_51>='\u0000' && LA11_51<='\t')||(LA11_51>='\u000B' && LA11_51<='\f')||(LA11_51>='\u000E' && LA11_51<='!')||(LA11_51>='#' && LA11_51<='/')||(LA11_51>='8' && LA11_51<='[')||(LA11_51>=']' && LA11_51<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( (LA11_51=='\n'||LA11_51=='\r') && (( !textMode ))) {s = 34;}

                        else s = 17;

                         
                        input.seek(index11_51);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_47 = input.LA(1);

                         
                        int index11_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_47=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA11_47=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA11_47>='0' && LA11_47<='7')) && ((( !textMode )||( textMode )))) {s = 51;}

                        else if ( ((LA11_47>='\u0000' && LA11_47<='\t')||(LA11_47>='\u000B' && LA11_47<='\f')||(LA11_47>='\u000E' && LA11_47<='!')||(LA11_47>='#' && LA11_47<='/')||(LA11_47>='8' && LA11_47<='[')||(LA11_47>=']' && LA11_47<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( (LA11_47=='\n'||LA11_47=='\r') && (( !textMode ))) {s = 34;}

                        else s = 17;

                         
                        input.seek(index11_47);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_53 = input.LA(1);

                         
                        int index11_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_53>='0' && LA11_53<='9')||(LA11_53>='A' && LA11_53<='F')||(LA11_53>='a' && LA11_53<='f')) && ((( !textMode )||( textMode )))) {s = 55;}

                        else s = 17;

                         
                        input.seek(index11_53);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_55 = input.LA(1);

                         
                        int index11_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_55>='0' && LA11_55<='9')||(LA11_55>='A' && LA11_55<='F')||(LA11_55>='a' && LA11_55<='f')) && ((( !textMode )||( textMode )))) {s = 56;}

                        else s = 17;

                         
                        input.seek(index11_55);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_20 = input.LA(1);

                         
                        int index11_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 37;}

                        else if ( (( textMode )) ) {s = 17;}

                         
                        input.seek(index11_20);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_26 = input.LA(1);

                         
                        int index11_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_26>='0' && LA11_26<='9')) && ((( !textMode )||( textMode )))) {s = 26;}

                        else if ( ((LA11_26>='\u0000' && LA11_26<='\t')||(LA11_26>='\u000B' && LA11_26<='\f')||(LA11_26>='\u000E' && LA11_26<='/')||(LA11_26>=':' && LA11_26<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 25;

                         
                        input.seek(index11_26);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_18 = input.LA(1);

                         
                        int index11_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 35;}

                        else if ( (( textMode )) ) {s = 17;}

                         
                        input.seek(index11_18);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_31 = input.LA(1);

                         
                        int index11_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_31=='\"'||LA11_31=='\''||LA11_31=='\\'||LA11_31=='b'||LA11_31=='f'||LA11_31=='n'||LA11_31=='r'||LA11_31=='t') && ((( !textMode )||( textMode )))) {s = 45;}

                        else if ( (LA11_31=='u') && ((( !textMode )||( textMode )))) {s = 46;}

                        else if ( ((LA11_31>='0' && LA11_31<='3')) && ((( !textMode )||( textMode )))) {s = 47;}

                        else if ( ((LA11_31>='4' && LA11_31<='7')) && ((( !textMode )||( textMode )))) {s = 48;}

                        else s = 17;

                         
                        input.seek(index11_31);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_19 = input.LA(1);

                         
                        int index11_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (!((( textMode )))) ) {s = 36;}

                        else if ( (( textMode )) ) {s = 17;}

                         
                        input.seek(index11_19);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_15==' ') && (( !hashMode ))) {s = 30;}

                        else s = 29;

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_10 = input.LA(1);

                         
                        int index11_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_10>='0' && LA11_10<='9')) && ((( !textMode )||( textMode )))) {s = 26;}

                        else if ( ((LA11_10>='\u0000' && LA11_10<='\t')||(LA11_10>='\u000B' && LA11_10<='\f')||(LA11_10>='\u000E' && LA11_10<='/')||(LA11_10>=':' && LA11_10<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 25;

                         
                        input.seek(index11_10);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_16=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA11_16>='\u0000' && LA11_16<='\t')||(LA11_16>='\u000B' && LA11_16<='\f')||(LA11_16>='\u000E' && LA11_16<='!')||(LA11_16>='#' && LA11_16<='[')||(LA11_16>=']' && LA11_16<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( (LA11_16=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA11_16=='\n'||LA11_16=='\r') && (( !textMode ))) {s = 34;}

                        else s = 17;

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_7>='\u0000' && LA11_7<='\t')||(LA11_7>='\u000B' && LA11_7<='\f')||(LA11_7>='\u000E' && LA11_7<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 21;

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_14=='\n') && ((( !hashMode )||( hashMode )))) {s = 15;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_8>='\u0000' && LA11_8<='\t')||(LA11_8>='\u000B' && LA11_8<='\f')||(LA11_8>='\u000E' && LA11_8<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 22;

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA11_46 = input.LA(1);

                         
                        int index11_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_46>='0' && LA11_46<='9')||(LA11_46>='A' && LA11_46<='F')||(LA11_46>='a' && LA11_46<='f')) && ((( !textMode )||( textMode )))) {s = 50;}

                        else s = 17;

                         
                        input.seek(index11_46);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA11_12 = input.LA(1);

                         
                        int index11_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_12>='\u0000' && LA11_12<='\t')||(LA11_12>='\u000B' && LA11_12<='\f')||(LA11_12>='\u000E' && LA11_12<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 28;

                         
                        input.seek(index11_12);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA11_32 = input.LA(1);

                         
                        int index11_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_32=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA11_32=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA11_32>='\u0000' && LA11_32<='\t')||(LA11_32>='\u000B' && LA11_32<='\f')||(LA11_32>='\u000E' && LA11_32<='!')||(LA11_32>='#' && LA11_32<='[')||(LA11_32>=']' && LA11_32<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( (LA11_32=='\n'||LA11_32=='\r') && (( !textMode ))) {s = 34;}

                        else s = 17;

                         
                        input.seek(index11_32);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA11_45 = input.LA(1);

                         
                        int index11_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_45=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA11_45=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA11_45>='\u0000' && LA11_45<='\t')||(LA11_45>='\u000B' && LA11_45<='\f')||(LA11_45>='\u000E' && LA11_45<='!')||(LA11_45>='#' && LA11_45<='[')||(LA11_45>=']' && LA11_45<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( (LA11_45=='\n'||LA11_45=='\r') && (( !textMode ))) {s = 34;}

                        else s = 17;

                         
                        input.seek(index11_45);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA11_54 = input.LA(1);

                         
                        int index11_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_54=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA11_54=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA11_54>='\u0000' && LA11_54<='\t')||(LA11_54>='\u000B' && LA11_54<='\f')||(LA11_54>='\u000E' && LA11_54<='!')||(LA11_54>='#' && LA11_54<='[')||(LA11_54>=']' && LA11_54<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( (LA11_54=='\n'||LA11_54=='\r') && (( !textMode ))) {s = 34;}

                        else s = 17;

                         
                        input.seek(index11_54);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA11_23 = input.LA(1);

                         
                        int index11_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_23>='A' && LA11_23<='Z')||(LA11_23>='a' && LA11_23<='z')) && ((( !textMode )||( textMode )))) {s = 23;}

                        else if ( ((LA11_23>='\u0000' && LA11_23<='\t')||(LA11_23>='\u000B' && LA11_23<='\f')||(LA11_23>='\u000E' && LA11_23<='@')||(LA11_23>='[' && LA11_23<='`')||(LA11_23>='{' && LA11_23<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 24;

                         
                        input.seek(index11_23);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA11_9 = input.LA(1);

                         
                        int index11_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_9>='A' && LA11_9<='Z')||(LA11_9>='a' && LA11_9<='z')) && ((( !textMode )||( textMode )))) {s = 23;}

                        else if ( ((LA11_9>='\u0000' && LA11_9<='\t')||(LA11_9>='\u000B' && LA11_9<='\f')||(LA11_9>='\u000E' && LA11_9<='@')||(LA11_9>='[' && LA11_9<='`')||(LA11_9>='{' && LA11_9<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 24;

                         
                        input.seek(index11_9);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA11_33 = input.LA(1);

                         
                        int index11_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_33>='\u0000' && LA11_33<='\t')||(LA11_33>='\u000B' && LA11_33<='\f')||(LA11_33>='\u000E' && LA11_33<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 49;

                         
                        input.seek(index11_33);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA11_52 = input.LA(1);

                         
                        int index11_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_52=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA11_52=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA11_52>='\u0000' && LA11_52<='\t')||(LA11_52>='\u000B' && LA11_52<='\f')||(LA11_52>='\u000E' && LA11_52<='!')||(LA11_52>='#' && LA11_52<='[')||(LA11_52>=']' && LA11_52<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( (LA11_52=='\n'||LA11_52=='\r') && (( !textMode ))) {s = 34;}

                        else s = 17;

                         
                        input.seek(index11_52);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA11_11 = input.LA(1);

                         
                        int index11_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_11>='\u0000' && LA11_11<='\t')||(LA11_11>='\u000B' && LA11_11<='\f')||(LA11_11>='\u000E' && LA11_11<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 27;

                         
                        input.seek(index11_11);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA11_1 = input.LA(1);

                         
                        int index11_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_1>='\u0000' && LA11_1<='\t')||(LA11_1>='\u000B' && LA11_1<='\f')||(LA11_1>='\u000E' && LA11_1<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 18;

                         
                        input.seek(index11_1);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA11_49 = input.LA(1);

                         
                        int index11_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 34;}

                        else if ( (( textMode )) ) {s = 17;}

                         
                        input.seek(index11_49);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_3>='\u0000' && LA11_3<='\t')||(LA11_3>='\u000B' && LA11_3<='\f')||(LA11_3>='\u000E' && LA11_3<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 20;

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA11_22 = input.LA(1);

                         
                        int index11_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 39;}

                        else if ( (( textMode )) ) {s = 17;}

                         
                        input.seek(index11_22);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA11_21 = input.LA(1);

                         
                        int index11_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 38;}

                        else if ( (( textMode )) ) {s = 17;}

                         
                        input.seek(index11_21);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA11_2>='\u0000' && LA11_2<='\t')||(LA11_2>='\u000B' && LA11_2<='\f')||(LA11_2>='\u000E' && LA11_2<='\uFFFF')) && (( textMode ))) {s = 17;}

                        else s = 19;

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA11_25 = input.LA(1);

                         
                        int index11_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 41;}

                        else if ( (( textMode )) ) {s = 17;}

                         
                        input.seek(index11_25);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA11_24 = input.LA(1);

                         
                        int index11_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 40;}

                        else if ( (( textMode )) ) {s = 17;}

                         
                        input.seek(index11_24);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA11_28 = input.LA(1);

                         
                        int index11_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 43;}

                        else if ( (( textMode )) ) {s = 17;}

                         
                        input.seek(index11_28);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA11_29 = input.LA(1);

                         
                        int index11_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( hashMode )) ) {s = 44;}

                        else if ( (( !hashMode )) ) {s = 30;}

                         
                        input.seek(index11_29);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA11_27 = input.LA(1);

                         
                        int index11_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (( !textMode )) ) {s = 42;}

                        else if ( (( textMode )) ) {s = 17;}

                         
                        input.seek(index11_27);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA11_48 = input.LA(1);

                         
                        int index11_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_48=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA11_48=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA11_48>='0' && LA11_48<='7')) && ((( !textMode )||( textMode )))) {s = 52;}

                        else if ( (LA11_48=='\n'||LA11_48=='\r') && (( !textMode ))) {s = 34;}

                        else if ( ((LA11_48>='\u0000' && LA11_48<='\t')||(LA11_48>='\u000B' && LA11_48<='\f')||(LA11_48>='\u000E' && LA11_48<='!')||(LA11_48>='#' && LA11_48<='/')||(LA11_48>='8' && LA11_48<='[')||(LA11_48>=']' && LA11_48<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else s = 17;

                         
                        input.seek(index11_48);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA11_56 = input.LA(1);

                         
                        int index11_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA11_56=='\"') && ((( !textMode )||( textMode )))) {s = 33;}

                        else if ( (LA11_56=='\\') && ((( !textMode )||( textMode )))) {s = 31;}

                        else if ( ((LA11_56>='\u0000' && LA11_56<='\t')||(LA11_56>='\u000B' && LA11_56<='\f')||(LA11_56>='\u000E' && LA11_56<='!')||(LA11_56>='#' && LA11_56<='[')||(LA11_56>=']' && LA11_56<='\uFFFF')) && ((( !textMode )||( textMode )))) {s = 32;}

                        else if ( (LA11_56=='\n'||LA11_56=='\r') && (( !textMode ))) {s = 34;}

                        else s = 17;

                         
                        input.seek(index11_56);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
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

                        else if ( (LA11_0=='/') && ((( !textMode )||( textMode )))) {s = 7;}

                        else if ( (LA11_0==',') && ((( !textMode )||( textMode )))) {s = 8;}

                        else if ( ((LA11_0>='A' && LA11_0<='Z')||(LA11_0>='a' && LA11_0<='z')) && ((( !textMode )||( textMode )))) {s = 9;}

                        else if ( ((LA11_0>='0' && LA11_0<='9')) && ((( !textMode )||( textMode )))) {s = 10;}

                        else if ( (LA11_0=='{') && ((( !textMode )||( textMode )))) {s = 11;}

                        else if ( (LA11_0=='}') && ((( textMode )||( hashMode )))) {s = 12;}

                        else if ( (LA11_0==' ') && (( !textMode ))) {s = 13;}

                        else if ( (LA11_0=='\r') && ((( !hashMode )||( hashMode )))) {s = 14;}

                        else if ( (LA11_0=='\n') && ((( !hashMode )||( hashMode )))) {s = 15;}

                        else if ( (LA11_0=='\"') && ((( !textMode )||( textMode )))) {s = 16;}

                        else if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\u001F')||LA11_0=='!'||LA11_0=='$'||(LA11_0>='&' && LA11_0<='+')||LA11_0=='-'||(LA11_0>=';' && LA11_0<='<')||(LA11_0>='?' && LA11_0<='@')||(LA11_0>='[' && LA11_0<='`')||LA11_0=='|'||(LA11_0>='~' && LA11_0<='\uFFFF')) && (( textMode ))) {s = 17;}

                         
                        input.seek(index11_0);
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