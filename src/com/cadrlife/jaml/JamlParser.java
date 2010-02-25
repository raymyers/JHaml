// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-25 02:01:17

package com.cadrlife.jaml;
import java.util.LinkedHashMap;
import java.util.Map;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class JamlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INDENT", "DEDENT", "NEWLINE", "TEXT", "FORWARD_SLASH", "PERCENT", "ID", "LBRACE", "COMMA", "RBRACE", "IDENTIFIER", "STRINGLITERAL", "INTLITERAL", "LONGLITERAL", "CHARLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "TRUE", "FALSE", "NULL", "POUND", "DOT", "Spaces", "WS", "NL", "IGNORED_NEWLINE", "CHANGE_INDENT", "SpacesQ", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", "EscapeSequence", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "NonIntegerNumber", "FloatSuffix", "DoubleSuffix", "UnicodeEscape", "OctalEscape", "IdentifierStart", "IdentifierPart", "SurrogateIdentifer", "':'", "','", "'?'", "'||'", "'&&'", "'|'", "'^'", "'&'", "'=='", "'!='", "'instanceof'", "'<'", "'='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'~'", "'!'", "'('", "')'", "'.'", "'['", "']'", "'class'", "'this'", "'super'", "'new'", "'boolean'", "'char'", "'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'extends'", "'{'", "'}'"
    };
    public static final int EOF=-1;
    public static final int LBRACKET=34;
    public static final int T__91=91;
    public static final int RPAREN=33;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int Spaces=26;
    public static final int NonIntegerNumber=42;
    public static final int FloatSuffix=43;
    public static final int NL=28;
    public static final int HexPrefix=39;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int RBRACE=13;
    public static final int IGNORED_NEWLINE=29;
    public static final int T__83=83;
    public static final int POUND=24;
    public static final int NULL=23;
    public static final int DOUBLELITERAL=20;
    public static final int IdentifierStart=47;
    public static final int SpacesQ=31;
    public static final int T__85=85;
    public static final int INTLITERAL=16;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int LONGLITERAL=17;
    public static final int LongSuffix=38;
    public static final int T__71=71;
    public static final int WS=27;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int SurrogateIdentifer=49;
    public static final int CHARLITERAL=18;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int FALSE=22;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int EscapeSequence=36;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int IntegerNumber=37;
    public static final int LBRACE=11;
    public static final int Exponent=41;
    public static final int DEDENT=5;
    public static final int T__61=61;
    public static final int ID=10;
    public static final int T__60=60;
    public static final int HexDigit=40;
    public static final int INDENT=4;
    public static final int LPAREN=32;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int COMMA=12;
    public static final int IDENTIFIER=14;
    public static final int T__59=59;
    public static final int RBRACKET=35;
    public static final int DOT=25;
    public static final int T__50=50;
    public static final int IdentifierPart=48;
    public static final int PERCENT=9;
    public static final int CHANGE_INDENT=30;
    public static final int TEXT=7;
    public static final int TRUE=21;
    public static final int NEWLINE=6;
    public static final int DoubleSuffix=44;
    public static final int STRINGLITERAL=15;
    public static final int UnicodeEscape=45;
    public static final int FLOATLITERAL=19;
    public static final int OctalEscape=46;
    public static final int FORWARD_SLASH=8;

    // delegates
    // delegators


        public JamlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public JamlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return JamlParser.tokenNames; }
    public String getGrammarFileName() { return "../etc/Jaml.g"; }


    String output = "";


    public static class prog_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // ../etc/Jaml.g:54:1: prog returns [String rendering] : ( line )* ;
    public final JamlParser.prog_return prog() throws RecognitionException {
    traceIn("prog", 1);
        JamlParser.prog_return retval = new JamlParser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.line_return line1 = null;



        retval.rendering = "";
        try {
            // ../etc/Jaml.g:54:57: ( ( line )* )
            // ../etc/Jaml.g:55:3: ( line )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:55:3: ( line )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=NEWLINE && LA1_0<=TEXT)||LA1_0==PERCENT||(LA1_0>=POUND && LA1_0<=DOT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../etc/Jaml.g:55:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_prog100);
            	    line1=line();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line1.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.rendering += (line1!=null?line1.rendering:null);
            	    }
            	    if ( state.backtracking==0 ) {
            	      retval.rendering += "\n";
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("prog", 1);
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class element_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // ../etc/Jaml.g:57:1: element returns [String rendering] : elementDeclaration ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) ;
    public final JamlParser.element_return element() throws RecognitionException {
    traceIn("element", 2);
        JamlParser.element_return retval = new JamlParser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT3=null;
        Token NEWLINE4=null;
        Token NEWLINE5=null;
        Token FORWARD_SLASH7=null;
        Token NEWLINE8=null;
        JamlParser.elementDeclaration_return elementDeclaration2 = null;

        JamlParser.content_return content6 = null;


        CommonTree TEXT3_tree=null;
        CommonTree NEWLINE4_tree=null;
        CommonTree NEWLINE5_tree=null;
        CommonTree FORWARD_SLASH7_tree=null;
        CommonTree NEWLINE8_tree=null;

        String content = ""; boolean selfClosing=false;
        try {
            // ../etc/Jaml.g:57:91: ( elementDeclaration ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) )
            // ../etc/Jaml.g:58:3: elementDeclaration ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elementDeclaration_in_element124);
            elementDeclaration2=elementDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementDeclaration2.getTree());
            // ../etc/Jaml.g:59:4: ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
            int alt3=3;
            switch ( input.LA(1) ) {
            case TEXT:
                {
                alt3=1;
                }
                break;
            case NEWLINE:
                {
                alt3=2;
                }
                break;
            case FORWARD_SLASH:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../etc/Jaml.g:59:6: TEXT NEWLINE
                    {
                    TEXT3=(Token)match(input,TEXT,FOLLOW_TEXT_in_element132); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TEXT3_tree = (CommonTree)adaptor.create(TEXT3);
                    adaptor.addChild(root_0, TEXT3_tree);
                    }
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element134); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE4_tree = (CommonTree)adaptor.create(NEWLINE4);
                    adaptor.addChild(root_0, NEWLINE4_tree);
                    }
                    if ( state.backtracking==0 ) {
                      content = (TEXT3!=null?TEXT3.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:60:6: NEWLINE ( content )?
                    {
                    NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element146); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE5_tree = (CommonTree)adaptor.create(NEWLINE5);
                    adaptor.addChild(root_0, NEWLINE5_tree);
                    }
                    // ../etc/Jaml.g:60:14: ( content )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==INDENT) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../etc/Jaml.g:60:15: content
                            {
                            pushFollow(FOLLOW_content_in_element149);
                            content6=content();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, content6.getTree());
                            if ( state.backtracking==0 ) {
                              content = (content6!=null?content6.rendering:null);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:61:6: FORWARD_SLASH NEWLINE
                    {
                    FORWARD_SLASH7=(Token)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_element162); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FORWARD_SLASH7_tree = (CommonTree)adaptor.create(FORWARD_SLASH7);
                    adaptor.addChild(root_0, FORWARD_SLASH7_tree);
                    }
                    NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element164); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE8_tree = (CommonTree)adaptor.create(NEWLINE8);
                    adaptor.addChild(root_0, NEWLINE8_tree);
                    }
                    if ( state.backtracking==0 ) {
                      selfClosing = true;
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              retval.rendering = Util.elem((elementDeclaration2!=null?elementDeclaration2.type:null), (elementDeclaration2!=null?elementDeclaration2.attrMap:null), content, selfClosing);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("element", 2);
        }
        return retval;
    }
    // $ANTLR end "element"

    public static class line_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "line"
    // ../etc/Jaml.g:65:1: line returns [String rendering] : ( element | TEXT NEWLINE | NEWLINE );
    public final JamlParser.line_return line() throws RecognitionException {
    traceIn("line", 3);
        JamlParser.line_return retval = new JamlParser.line_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT10=null;
        Token NEWLINE11=null;
        Token NEWLINE12=null;
        JamlParser.element_return element9 = null;


        CommonTree TEXT10_tree=null;
        CommonTree NEWLINE11_tree=null;
        CommonTree NEWLINE12_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:65:60: ( element | TEXT NEWLINE | NEWLINE )
            int alt4=3;
            switch ( input.LA(1) ) {
            case PERCENT:
            case POUND:
            case DOT:
                {
                alt4=1;
                }
                break;
            case TEXT:
                {
                alt4=2;
                }
                break;
            case NEWLINE:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../etc/Jaml.g:66:3: element
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_element_in_line193);
                    element9=element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, element9.getTree());
                    if ( state.backtracking==0 ) {
                      retval.rendering = (element9!=null?element9.rendering:null);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:67:5: TEXT NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TEXT10=(Token)match(input,TEXT,FOLLOW_TEXT_in_line201); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TEXT10_tree = (CommonTree)adaptor.create(TEXT10);
                    adaptor.addChild(root_0, TEXT10_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.rendering = (TEXT10!=null?TEXT10.getText():null);
                    }
                    NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_line205); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE11_tree = (CommonTree)adaptor.create(NEWLINE11);
                    adaptor.addChild(root_0, NEWLINE11_tree);
                    }

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:68:5: NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_line211); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE12_tree = (CommonTree)adaptor.create(NEWLINE12);
                    adaptor.addChild(root_0, NEWLINE12_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("line", 3);
        }
        return retval;
    }
    // $ANTLR end "line"

    public static class elementDeclaration_return extends ParserRuleReturnScope {
        public String type;
        public Map<String,String> attrMap;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementDeclaration"
    // ../etc/Jaml.g:71:1: elementDeclaration returns [String type, Map<String,String> attrMap] : ( ( (a1= divAttrs ) ( attrHash )? ) | ( (a2= attrs ) ( attrHash )? ) );
    public final JamlParser.elementDeclaration_return elementDeclaration() throws RecognitionException {
    traceIn("elementDeclaration", 4);
        JamlParser.elementDeclaration_return retval = new JamlParser.elementDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.divAttrs_return a1 = null;

        JamlParser.attrs_return a2 = null;

        JamlParser.attrHash_return attrHash13 = null;

        JamlParser.attrHash_return attrHash14 = null;



        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:71:124: ( ( (a1= divAttrs ) ( attrHash )? ) | ( (a2= attrs ) ( attrHash )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=POUND && LA7_0<=DOT)) ) {
                alt7=1;
            }
            else if ( (LA7_0==PERCENT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../etc/Jaml.g:72:3: ( (a1= divAttrs ) ( attrHash )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:72:3: ( (a1= divAttrs ) ( attrHash )? )
                    // ../etc/Jaml.g:72:4: (a1= divAttrs ) ( attrHash )?
                    {
                    // ../etc/Jaml.g:72:4: (a1= divAttrs )
                    // ../etc/Jaml.g:72:5: a1= divAttrs
                    {
                    pushFollow(FOLLOW_divAttrs_in_elementDeclaration236);
                    a1=divAttrs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, a1.getTree());
                    if ( state.backtracking==0 ) {
                      retval.attrMap.putAll((a1!=null?a1.attrMap:null)); retval.type = "div";
                    }

                    }

                    // ../etc/Jaml.g:73:4: ( attrHash )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==LBRACE) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../etc/Jaml.g:73:5: attrHash
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration245);
                            attrHash13=attrHash();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attrHash13.getTree());
                            if ( state.backtracking==0 ) {
                              retval.attrMap.putAll((attrHash13!=null?attrHash13.attrMap:null));
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:75:2: ( (a2= attrs ) ( attrHash )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:75:2: ( (a2= attrs ) ( attrHash )? )
                    // ../etc/Jaml.g:76:3: (a2= attrs ) ( attrHash )?
                    {
                    // ../etc/Jaml.g:76:3: (a2= attrs )
                    // ../etc/Jaml.g:76:4: a2= attrs
                    {
                    pushFollow(FOLLOW_attrs_in_elementDeclaration263);
                    a2=attrs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, a2.getTree());
                    if ( state.backtracking==0 ) {
                      retval.attrMap.putAll((a2!=null?a2.attrMap:null)); retval.type = (a2!=null?a2.type:null);
                    }

                    }

                    // ../etc/Jaml.g:77:3: ( attrHash )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==LBRACE) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../etc/Jaml.g:77:4: attrHash
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration272);
                            attrHash14=attrHash();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attrHash14.getTree());
                            if ( state.backtracking==0 ) {
                              retval.attrMap.putAll((attrHash14!=null?attrHash14.attrMap:null));
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("elementDeclaration", 4);
        }
        return retval;
    }
    // $ANTLR end "elementDeclaration"

    public static class content_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "content"
    // ../etc/Jaml.g:80:1: content returns [String rendering] : INDENT (e1= element | TEXT NEWLINE )+ DEDENT ;
    public final JamlParser.content_return content() throws RecognitionException {
    traceIn("content", 5);
        JamlParser.content_return retval = new JamlParser.content_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INDENT15=null;
        Token TEXT16=null;
        Token NEWLINE17=null;
        Token DEDENT18=null;
        JamlParser.element_return e1 = null;


        CommonTree INDENT15_tree=null;
        CommonTree TEXT16_tree=null;
        CommonTree NEWLINE17_tree=null;
        CommonTree DEDENT18_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:80:63: ( INDENT (e1= element | TEXT NEWLINE )+ DEDENT )
            // ../etc/Jaml.g:81:1: INDENT (e1= element | TEXT NEWLINE )+ DEDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            INDENT15=(Token)match(input,INDENT,FOLLOW_INDENT_in_content298); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INDENT15_tree = (CommonTree)adaptor.create(INDENT15);
            adaptor.addChild(root_0, INDENT15_tree);
            }
            // ../etc/Jaml.g:82:2: (e1= element | TEXT NEWLINE )+
            int cnt8=0;
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==PERCENT||(LA8_0>=POUND && LA8_0<=DOT)) ) {
                    alt8=1;
                }
                else if ( (LA8_0==TEXT) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ../etc/Jaml.g:82:3: e1= element
            	    {
            	    pushFollow(FOLLOW_element_in_content305);
            	    e1=element();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, e1.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.rendering += (e1!=null?e1.rendering:null) + "\n";
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:82:54: TEXT NEWLINE
            	    {
            	    TEXT16=(Token)match(input,TEXT,FOLLOW_TEXT_in_content311); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    TEXT16_tree = (CommonTree)adaptor.create(TEXT16);
            	    adaptor.addChild(root_0, TEXT16_tree);
            	    }
            	    NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_content313); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NEWLINE17_tree = (CommonTree)adaptor.create(NEWLINE17);
            	    adaptor.addChild(root_0, NEWLINE17_tree);
            	    }
            	    if ( state.backtracking==0 ) {
            	      retval.rendering += (TEXT16!=null?TEXT16.getText():null) + "\n";
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            DEDENT18=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_content319); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEDENT18_tree = (CommonTree)adaptor.create(DEDENT18);
            adaptor.addChild(root_0, DEDENT18_tree);
            }
            if ( state.backtracking==0 ) {
              retval.rendering = "\n" + Util.indent(Util.stripTrailingNewline(retval.rendering)) + "\n";
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("content", 5);
        }
        return retval;
    }
    // $ANTLR end "content"

    public static class attrs_return extends ParserRuleReturnScope {
        public Map<String,String> attrMap;
        public String type;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrs"
    // ../etc/Jaml.g:88:1: attrs returns [Map<String,String> attrMap, String type] : PERCENT ID ( idSpecifier | classSpecifier )* ;
    public final JamlParser.attrs_return attrs() throws RecognitionException {
    traceIn("attrs", 6);
        JamlParser.attrs_return retval = new JamlParser.attrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERCENT19=null;
        Token ID20=null;
        JamlParser.idSpecifier_return idSpecifier21 = null;

        JamlParser.classSpecifier_return classSpecifier22 = null;


        CommonTree PERCENT19_tree=null;
        CommonTree ID20_tree=null;

        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:88:111: ( PERCENT ID ( idSpecifier | classSpecifier )* )
            // ../etc/Jaml.g:89:1: PERCENT ID ( idSpecifier | classSpecifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            PERCENT19=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_attrs339); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PERCENT19_tree = (CommonTree)adaptor.create(PERCENT19);
            adaptor.addChild(root_0, PERCENT19_tree);
            }
            ID20=(Token)match(input,ID,FOLLOW_ID_in_attrs341); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID20_tree = (CommonTree)adaptor.create(ID20);
            adaptor.addChild(root_0, ID20_tree);
            }
            if ( state.backtracking==0 ) {
              retval.type = (ID20!=null?ID20.getText():null);
            }
            // ../etc/Jaml.g:90:1: ( idSpecifier | classSpecifier )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==POUND) ) {
                    alt9=1;
                }
                else if ( (LA9_0==DOT) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../etc/Jaml.g:90:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_attrs346);
            	    idSpecifier21=idSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, idSpecifier21.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.attrMap.put("id", (idSpecifier21!=null?idSpecifier21.id:null));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:91:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_attrs353);
            	    classSpecifier22=classSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classSpecifier22.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.attrMap.put("class", (classSpecifier22!=null?classSpecifier22.klass:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("attrs", 6);
        }
        return retval;
    }
    // $ANTLR end "attrs"

    public static class divAttrs_return extends ParserRuleReturnScope {
        public Map<String,String> attrMap;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "divAttrs"
    // ../etc/Jaml.g:93:1: divAttrs returns [Map<String,String> attrMap] : ( idSpecifier | classSpecifier )+ ;
    public final JamlParser.divAttrs_return divAttrs() throws RecognitionException {
    traceIn("divAttrs", 7);
        JamlParser.divAttrs_return retval = new JamlParser.divAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.idSpecifier_return idSpecifier23 = null;

        JamlParser.classSpecifier_return classSpecifier24 = null;



        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:93:101: ( ( idSpecifier | classSpecifier )+ )
            // ../etc/Jaml.g:94:1: ( idSpecifier | classSpecifier )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:94:1: ( idSpecifier | classSpecifier )+
            int cnt10=0;
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==POUND) ) {
                    alt10=1;
                }
                else if ( (LA10_0==DOT) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // ../etc/Jaml.g:94:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_divAttrs374);
            	    idSpecifier23=idSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, idSpecifier23.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.attrMap.put("id", (idSpecifier23!=null?idSpecifier23.id:null));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:95:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_divAttrs381);
            	    classSpecifier24=classSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classSpecifier24.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.attrMap.put("class", (classSpecifier24!=null?classSpecifier24.klass:null));
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("divAttrs", 7);
        }
        return retval;
    }
    // $ANTLR end "divAttrs"

    public static class attrHash_return extends ParserRuleReturnScope {
        public Map<String,String> attrMap;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrHash"
    // ../etc/Jaml.g:97:1: attrHash returns [Map<String,String> attrMap] : LBRACE (am1= attrMapping ( COMMA am2= attrMapping )* )? RBRACE ;
    public final JamlParser.attrHash_return attrHash() throws RecognitionException {
    traceIn("attrHash", 8);
        JamlParser.attrHash_return retval = new JamlParser.attrHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token LBRACE25=null;
        Token COMMA26=null;
        Token RBRACE27=null;
        JamlParser.attrMapping_return am1 = null;

        JamlParser.attrMapping_return am2 = null;


        CommonTree LBRACE25_tree=null;
        CommonTree COMMA26_tree=null;
        CommonTree RBRACE27_tree=null;

        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:97:101: ( LBRACE (am1= attrMapping ( COMMA am2= attrMapping )* )? RBRACE )
            // ../etc/Jaml.g:98:3: LBRACE (am1= attrMapping ( COMMA am2= attrMapping )* )? RBRACE
            {
            root_0 = (CommonTree)adaptor.nil();

            LBRACE25=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_attrHash403); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            LBRACE25_tree = (CommonTree)adaptor.create(LBRACE25);
            adaptor.addChild(root_0, LBRACE25_tree);
            }
            // ../etc/Jaml.g:99:3: (am1= attrMapping ( COMMA am2= attrMapping )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=STRINGLITERAL && LA12_0<=NULL)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../etc/Jaml.g:99:5: am1= attrMapping ( COMMA am2= attrMapping )*
                    {
                    pushFollow(FOLLOW_attrMapping_in_attrHash411);
                    am1=attrMapping();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, am1.getTree());
                    if ( state.backtracking==0 ) {
                      retval.attrMap.put((am1!=null?am1.key:null), (am1!=null?am1.value:null));
                    }
                    // ../etc/Jaml.g:100:5: ( COMMA am2= attrMapping )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../etc/Jaml.g:100:6: COMMA am2= attrMapping
                    	    {
                    	    COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_attrHash427); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    COMMA26_tree = (CommonTree)adaptor.create(COMMA26);
                    	    adaptor.addChild(root_0, COMMA26_tree);
                    	    }
                    	    pushFollow(FOLLOW_attrMapping_in_attrHash431);
                    	    am2=attrMapping();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, am2.getTree());
                    	    if ( state.backtracking==0 ) {
                    	      retval.attrMap.put((am2!=null?am2.key:null), (am2!=null?am2.value:null));
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            RBRACE27=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_attrHash441); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            RBRACE27_tree = (CommonTree)adaptor.create(RBRACE27);
            adaptor.addChild(root_0, RBRACE27_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("attrHash", 8);
        }
        return retval;
    }
    // $ANTLR end "attrHash"

    public static class attrMapping_return extends ParserRuleReturnScope {
        public String key;
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrMapping"
    // ../etc/Jaml.g:103:1: attrMapping returns [String key, String value] : (attrName= ( literal ) ) ':' (attrValue= expression ) ;
    public final JamlParser.attrMapping_return attrMapping() throws RecognitionException {
    traceIn("attrMapping", 9);
        JamlParser.attrMapping_return retval = new JamlParser.attrMapping_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token attrName=null;
        Token char_literal29=null;
        JamlParser.expression_return attrValue = null;

        JamlParser.literal_return literal28 = null;


        CommonTree attrName_tree=null;
        CommonTree char_literal29_tree=null;

        try {
            // ../etc/Jaml.g:103:47: ( (attrName= ( literal ) ) ':' (attrValue= expression ) )
            // ../etc/Jaml.g:104:1: (attrName= ( literal ) ) ':' (attrValue= expression )
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:104:1: (attrName= ( literal ) )
            // ../etc/Jaml.g:104:2: attrName= ( literal )
            {
            // ../etc/Jaml.g:104:11: ( literal )
            // ../etc/Jaml.g:104:12: literal
            {
            pushFollow(FOLLOW_literal_in_attrMapping456);
            literal28=literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, literal28.getTree());

            }


            }

            char_literal29=(Token)match(input,50,FOLLOW_50_in_attrMapping460); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal29_tree = (CommonTree)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);
            }
            // ../etc/Jaml.g:104:26: (attrValue= expression )
            // ../etc/Jaml.g:104:27: attrValue= expression
            {
            pushFollow(FOLLOW_expression_in_attrMapping465);
            attrValue=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, attrValue.getTree());

            }

            if ( state.backtracking==0 ) {

                retval.key = attrName.value; retval.value = (attrValue!=null?attrValue.value:null);

            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("attrMapping", 9);
        }
        return retval;
    }
    // $ANTLR end "attrMapping"

    public static class expression_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // ../etc/Jaml.g:108:1: expression returns [String value] : conditionalExpression ;
    public final JamlParser.expression_return expression() throws RecognitionException {
    traceIn("expression", 10);
        JamlParser.expression_return retval = new JamlParser.expression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.conditionalExpression_return conditionalExpression30 = null;



        try {
            // ../etc/Jaml.g:108:34: ( conditionalExpression )
            // ../etc/Jaml.g:110:1: conditionalExpression
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalExpression_in_expression480);
            conditionalExpression30=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression30.getTree());
            if ( state.backtracking==0 ) {
              retval.value = (conditionalExpression30!=null?input.toString(conditionalExpression30.start,conditionalExpression30.stop):null);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("expression", 10);
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expressionList"
    // ../etc/Jaml.g:115:1: expressionList : expression ( ',' expression )* ;
    public final JamlParser.expressionList_return expressionList() throws RecognitionException {
    traceIn("expressionList", 11);
        JamlParser.expressionList_return retval = new JamlParser.expressionList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal32=null;
        JamlParser.expression_return expression31 = null;

        JamlParser.expression_return expression33 = null;


        CommonTree char_literal32_tree=null;

        try {
            // ../etc/Jaml.g:116:5: ( expression ( ',' expression )* )
            // ../etc/Jaml.g:116:9: expression ( ',' expression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_expression_in_expressionList504);
            expression31=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression31.getTree());
            // ../etc/Jaml.g:117:9: ( ',' expression )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==51) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../etc/Jaml.g:117:10: ',' expression
            	    {
            	    char_literal32=(Token)match(input,51,FOLLOW_51_in_expressionList515); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal32_tree = (CommonTree)adaptor.create(char_literal32);
            	    adaptor.addChild(root_0, char_literal32_tree);
            	    }
            	    pushFollow(FOLLOW_expression_in_expressionList517);
            	    expression33=expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression33.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("expressionList", 11);
        }
        return retval;
    }
    // $ANTLR end "expressionList"

    public static class conditionalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalExpression"
    // ../etc/Jaml.g:121:1: conditionalExpression : conditionalOrExpression ( '?' expression ':' conditionalExpression )? ;
    public final JamlParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
    traceIn("conditionalExpression", 12);
        JamlParser.conditionalExpression_return retval = new JamlParser.conditionalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal35=null;
        Token char_literal37=null;
        JamlParser.conditionalOrExpression_return conditionalOrExpression34 = null;

        JamlParser.expression_return expression36 = null;

        JamlParser.conditionalExpression_return conditionalExpression38 = null;


        CommonTree char_literal35_tree=null;
        CommonTree char_literal37_tree=null;

        try {
            // ../etc/Jaml.g:122:5: ( conditionalOrExpression ( '?' expression ':' conditionalExpression )? )
            // ../etc/Jaml.g:122:9: conditionalOrExpression ( '?' expression ':' conditionalExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression548);
            conditionalOrExpression34=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression34.getTree());
            // ../etc/Jaml.g:123:9: ( '?' expression ':' conditionalExpression )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==52) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../etc/Jaml.g:123:10: '?' expression ':' conditionalExpression
                    {
                    char_literal35=(Token)match(input,52,FOLLOW_52_in_conditionalExpression559); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal35_tree = (CommonTree)adaptor.create(char_literal35);
                    adaptor.addChild(root_0, char_literal35_tree);
                    }
                    pushFollow(FOLLOW_expression_in_conditionalExpression561);
                    expression36=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression36.getTree());
                    char_literal37=(Token)match(input,50,FOLLOW_50_in_conditionalExpression563); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal37_tree = (CommonTree)adaptor.create(char_literal37);
                    adaptor.addChild(root_0, char_literal37_tree);
                    }
                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression565);
                    conditionalExpression38=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression38.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("conditionalExpression", 12);
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalOrExpression"
    // ../etc/Jaml.g:127:1: conditionalOrExpression : conditionalAndExpression ( '||' conditionalAndExpression )* ;
    public final JamlParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
    traceIn("conditionalOrExpression", 13);
        JamlParser.conditionalOrExpression_return retval = new JamlParser.conditionalOrExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal40=null;
        JamlParser.conditionalAndExpression_return conditionalAndExpression39 = null;

        JamlParser.conditionalAndExpression_return conditionalAndExpression41 = null;


        CommonTree string_literal40_tree=null;

        try {
            // ../etc/Jaml.g:128:5: ( conditionalAndExpression ( '||' conditionalAndExpression )* )
            // ../etc/Jaml.g:128:9: conditionalAndExpression ( '||' conditionalAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression596);
            conditionalAndExpression39=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression39.getTree());
            // ../etc/Jaml.g:129:9: ( '||' conditionalAndExpression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==53) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../etc/Jaml.g:129:10: '||' conditionalAndExpression
            	    {
            	    string_literal40=(Token)match(input,53,FOLLOW_53_in_conditionalOrExpression607); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal40_tree = (CommonTree)adaptor.create(string_literal40);
            	    adaptor.addChild(root_0, string_literal40_tree);
            	    }
            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression609);
            	    conditionalAndExpression41=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression41.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("conditionalOrExpression", 13);
        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"

    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "conditionalAndExpression"
    // ../etc/Jaml.g:133:1: conditionalAndExpression : inclusiveOrExpression ( '&&' inclusiveOrExpression )* ;
    public final JamlParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
    traceIn("conditionalAndExpression", 14);
        JamlParser.conditionalAndExpression_return retval = new JamlParser.conditionalAndExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal43=null;
        JamlParser.inclusiveOrExpression_return inclusiveOrExpression42 = null;

        JamlParser.inclusiveOrExpression_return inclusiveOrExpression44 = null;


        CommonTree string_literal43_tree=null;

        try {
            // ../etc/Jaml.g:134:5: ( inclusiveOrExpression ( '&&' inclusiveOrExpression )* )
            // ../etc/Jaml.g:134:9: inclusiveOrExpression ( '&&' inclusiveOrExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression640);
            inclusiveOrExpression42=inclusiveOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression42.getTree());
            // ../etc/Jaml.g:135:9: ( '&&' inclusiveOrExpression )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==54) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../etc/Jaml.g:135:10: '&&' inclusiveOrExpression
            	    {
            	    string_literal43=(Token)match(input,54,FOLLOW_54_in_conditionalAndExpression651); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    string_literal43_tree = (CommonTree)adaptor.create(string_literal43);
            	    adaptor.addChild(root_0, string_literal43_tree);
            	    }
            	    pushFollow(FOLLOW_inclusiveOrExpression_in_conditionalAndExpression653);
            	    inclusiveOrExpression44=inclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, inclusiveOrExpression44.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("conditionalAndExpression", 14);
        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"

    public static class inclusiveOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inclusiveOrExpression"
    // ../etc/Jaml.g:139:1: inclusiveOrExpression : exclusiveOrExpression ( '|' exclusiveOrExpression )* ;
    public final JamlParser.inclusiveOrExpression_return inclusiveOrExpression() throws RecognitionException {
    traceIn("inclusiveOrExpression", 15);
        JamlParser.inclusiveOrExpression_return retval = new JamlParser.inclusiveOrExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal46=null;
        JamlParser.exclusiveOrExpression_return exclusiveOrExpression45 = null;

        JamlParser.exclusiveOrExpression_return exclusiveOrExpression47 = null;


        CommonTree char_literal46_tree=null;

        try {
            // ../etc/Jaml.g:140:5: ( exclusiveOrExpression ( '|' exclusiveOrExpression )* )
            // ../etc/Jaml.g:140:9: exclusiveOrExpression ( '|' exclusiveOrExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression684);
            exclusiveOrExpression45=exclusiveOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression45.getTree());
            // ../etc/Jaml.g:141:9: ( '|' exclusiveOrExpression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==55) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../etc/Jaml.g:141:10: '|' exclusiveOrExpression
            	    {
            	    char_literal46=(Token)match(input,55,FOLLOW_55_in_inclusiveOrExpression695); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal46_tree = (CommonTree)adaptor.create(char_literal46);
            	    adaptor.addChild(root_0, char_literal46_tree);
            	    }
            	    pushFollow(FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression697);
            	    exclusiveOrExpression47=exclusiveOrExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, exclusiveOrExpression47.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("inclusiveOrExpression", 15);
        }
        return retval;
    }
    // $ANTLR end "inclusiveOrExpression"

    public static class exclusiveOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exclusiveOrExpression"
    // ../etc/Jaml.g:145:1: exclusiveOrExpression : andExpression ( '^' andExpression )* ;
    public final JamlParser.exclusiveOrExpression_return exclusiveOrExpression() throws RecognitionException {
    traceIn("exclusiveOrExpression", 16);
        JamlParser.exclusiveOrExpression_return retval = new JamlParser.exclusiveOrExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal49=null;
        JamlParser.andExpression_return andExpression48 = null;

        JamlParser.andExpression_return andExpression50 = null;


        CommonTree char_literal49_tree=null;

        try {
            // ../etc/Jaml.g:146:5: ( andExpression ( '^' andExpression )* )
            // ../etc/Jaml.g:146:9: andExpression ( '^' andExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression728);
            andExpression48=andExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression48.getTree());
            // ../etc/Jaml.g:147:9: ( '^' andExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==56) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../etc/Jaml.g:147:10: '^' andExpression
            	    {
            	    char_literal49=(Token)match(input,56,FOLLOW_56_in_exclusiveOrExpression739); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal49_tree = (CommonTree)adaptor.create(char_literal49);
            	    adaptor.addChild(root_0, char_literal49_tree);
            	    }
            	    pushFollow(FOLLOW_andExpression_in_exclusiveOrExpression741);
            	    andExpression50=andExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, andExpression50.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("exclusiveOrExpression", 16);
        }
        return retval;
    }
    // $ANTLR end "exclusiveOrExpression"

    public static class andExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpression"
    // ../etc/Jaml.g:151:1: andExpression : equalityExpression ( '&' equalityExpression )* ;
    public final JamlParser.andExpression_return andExpression() throws RecognitionException {
    traceIn("andExpression", 17);
        JamlParser.andExpression_return retval = new JamlParser.andExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal52=null;
        JamlParser.equalityExpression_return equalityExpression51 = null;

        JamlParser.equalityExpression_return equalityExpression53 = null;


        CommonTree char_literal52_tree=null;

        try {
            // ../etc/Jaml.g:152:5: ( equalityExpression ( '&' equalityExpression )* )
            // ../etc/Jaml.g:152:9: equalityExpression ( '&' equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_andExpression772);
            equalityExpression51=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression51.getTree());
            // ../etc/Jaml.g:153:9: ( '&' equalityExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==57) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../etc/Jaml.g:153:10: '&' equalityExpression
            	    {
            	    char_literal52=(Token)match(input,57,FOLLOW_57_in_andExpression783); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal52_tree = (CommonTree)adaptor.create(char_literal52);
            	    adaptor.addChild(root_0, char_literal52_tree);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_andExpression785);
            	    equalityExpression53=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression53.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("andExpression", 17);
        }
        return retval;
    }
    // $ANTLR end "andExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
    // ../etc/Jaml.g:157:1: equalityExpression : instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* ;
    public final JamlParser.equalityExpression_return equalityExpression() throws RecognitionException {
    traceIn("equalityExpression", 18);
        JamlParser.equalityExpression_return retval = new JamlParser.equalityExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set55=null;
        JamlParser.instanceOfExpression_return instanceOfExpression54 = null;

        JamlParser.instanceOfExpression_return instanceOfExpression56 = null;


        CommonTree set55_tree=null;

        try {
            // ../etc/Jaml.g:158:5: ( instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )* )
            // ../etc/Jaml.g:158:9: instanceOfExpression ( ( '==' | '!=' ) instanceOfExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression820);
            instanceOfExpression54=instanceOfExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression54.getTree());
            // ../etc/Jaml.g:159:9: ( ( '==' | '!=' ) instanceOfExpression )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=58 && LA20_0<=59)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../etc/Jaml.g:160:13: ( '==' | '!=' ) instanceOfExpression
            	    {
            	    set55=(Token)input.LT(1);
            	    if ( (input.LA(1)>=58 && input.LA(1)<=59) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set55));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_instanceOfExpression_in_equalityExpression897);
            	    instanceOfExpression56=instanceOfExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, instanceOfExpression56.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("equalityExpression", 18);
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class instanceOfExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instanceOfExpression"
    // ../etc/Jaml.g:167:1: instanceOfExpression : relationalExpression ( 'instanceof' type )? ;
    public final JamlParser.instanceOfExpression_return instanceOfExpression() throws RecognitionException {
    traceIn("instanceOfExpression", 19);
        JamlParser.instanceOfExpression_return retval = new JamlParser.instanceOfExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal58=null;
        JamlParser.relationalExpression_return relationalExpression57 = null;

        JamlParser.type_return type59 = null;


        CommonTree string_literal58_tree=null;

        try {
            // ../etc/Jaml.g:168:5: ( relationalExpression ( 'instanceof' type )? )
            // ../etc/Jaml.g:168:9: relationalExpression ( 'instanceof' type )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_instanceOfExpression932);
            relationalExpression57=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression57.getTree());
            // ../etc/Jaml.g:169:9: ( 'instanceof' type )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==60) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../etc/Jaml.g:169:10: 'instanceof' type
                    {
                    string_literal58=(Token)match(input,60,FOLLOW_60_in_instanceOfExpression943); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal58_tree = (CommonTree)adaptor.create(string_literal58);
                    adaptor.addChild(root_0, string_literal58_tree);
                    }
                    pushFollow(FOLLOW_type_in_instanceOfExpression945);
                    type59=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type59.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("instanceOfExpression", 19);
        }
        return retval;
    }
    // $ANTLR end "instanceOfExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
    // ../etc/Jaml.g:173:1: relationalExpression : shiftExpression ( relationalOp shiftExpression )* ;
    public final JamlParser.relationalExpression_return relationalExpression() throws RecognitionException {
    traceIn("relationalExpression", 20);
        JamlParser.relationalExpression_return retval = new JamlParser.relationalExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.shiftExpression_return shiftExpression60 = null;

        JamlParser.relationalOp_return relationalOp61 = null;

        JamlParser.shiftExpression_return shiftExpression62 = null;



        try {
            // ../etc/Jaml.g:174:5: ( shiftExpression ( relationalOp shiftExpression )* )
            // ../etc/Jaml.g:174:9: shiftExpression ( relationalOp shiftExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_shiftExpression_in_relationalExpression976);
            shiftExpression60=shiftExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression60.getTree());
            // ../etc/Jaml.g:175:9: ( relationalOp shiftExpression )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==61||LA22_0==63) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../etc/Jaml.g:175:10: relationalOp shiftExpression
            	    {
            	    pushFollow(FOLLOW_relationalOp_in_relationalExpression987);
            	    relationalOp61=relationalOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalOp61.getTree());
            	    pushFollow(FOLLOW_shiftExpression_in_relationalExpression989);
            	    shiftExpression62=shiftExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftExpression62.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("relationalExpression", 20);
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class relationalOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalOp"
    // ../etc/Jaml.g:179:1: relationalOp : ( '<' '=' | '>' '=' | '<' | '>' );
    public final JamlParser.relationalOp_return relationalOp() throws RecognitionException {
    traceIn("relationalOp", 21);
        JamlParser.relationalOp_return retval = new JamlParser.relationalOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal63=null;
        Token char_literal64=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token char_literal67=null;
        Token char_literal68=null;

        CommonTree char_literal63_tree=null;
        CommonTree char_literal64_tree=null;
        CommonTree char_literal65_tree=null;
        CommonTree char_literal66_tree=null;
        CommonTree char_literal67_tree=null;
        CommonTree char_literal68_tree=null;

        try {
            // ../etc/Jaml.g:180:5: ( '<' '=' | '>' '=' | '<' | '>' )
            int alt23=4;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==61) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==62) ) {
                    alt23=1;
                }
                else if ( ((LA23_1>=IDENTIFIER && LA23_1<=NULL)||(LA23_1>=64 && LA23_1<=65)||(LA23_1>=69 && LA23_1<=73)||(LA23_1>=81 && LA23_1<=89)) ) {
                    alt23=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0==63) ) {
                int LA23_2 = input.LA(2);

                if ( (LA23_2==62) ) {
                    alt23=2;
                }
                else if ( ((LA23_2>=IDENTIFIER && LA23_2<=NULL)||(LA23_2>=64 && LA23_2<=65)||(LA23_2>=69 && LA23_2<=73)||(LA23_2>=81 && LA23_2<=89)) ) {
                    alt23=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../etc/Jaml.g:180:10: '<' '='
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal63=(Token)match(input,61,FOLLOW_61_in_relationalOp1021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal63_tree = (CommonTree)adaptor.create(char_literal63);
                    adaptor.addChild(root_0, char_literal63_tree);
                    }
                    char_literal64=(Token)match(input,62,FOLLOW_62_in_relationalOp1023); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal64_tree = (CommonTree)adaptor.create(char_literal64);
                    adaptor.addChild(root_0, char_literal64_tree);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:181:10: '>' '='
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal65=(Token)match(input,63,FOLLOW_63_in_relationalOp1034); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal65_tree = (CommonTree)adaptor.create(char_literal65);
                    adaptor.addChild(root_0, char_literal65_tree);
                    }
                    char_literal66=(Token)match(input,62,FOLLOW_62_in_relationalOp1036); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal66_tree = (CommonTree)adaptor.create(char_literal66);
                    adaptor.addChild(root_0, char_literal66_tree);
                    }

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:182:9: '<'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal67=(Token)match(input,61,FOLLOW_61_in_relationalOp1046); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal67_tree = (CommonTree)adaptor.create(char_literal67);
                    adaptor.addChild(root_0, char_literal67_tree);
                    }

                    }
                    break;
                case 4 :
                    // ../etc/Jaml.g:183:9: '>'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal68=(Token)match(input,63,FOLLOW_63_in_relationalOp1056); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal68_tree = (CommonTree)adaptor.create(char_literal68);
                    adaptor.addChild(root_0, char_literal68_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("relationalOp", 21);
        }
        return retval;
    }
    // $ANTLR end "relationalOp"

    public static class shiftExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftExpression"
    // ../etc/Jaml.g:186:1: shiftExpression : additiveExpression ( shiftOp additiveExpression )* ;
    public final JamlParser.shiftExpression_return shiftExpression() throws RecognitionException {
    traceIn("shiftExpression", 22);
        JamlParser.shiftExpression_return retval = new JamlParser.shiftExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.additiveExpression_return additiveExpression69 = null;

        JamlParser.shiftOp_return shiftOp70 = null;

        JamlParser.additiveExpression_return additiveExpression71 = null;



        try {
            // ../etc/Jaml.g:187:5: ( additiveExpression ( shiftOp additiveExpression )* )
            // ../etc/Jaml.g:187:9: additiveExpression ( shiftOp additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_shiftExpression1076);
            additiveExpression69=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression69.getTree());
            // ../etc/Jaml.g:188:9: ( shiftOp additiveExpression )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==61) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==61) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==63) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==63) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // ../etc/Jaml.g:188:10: shiftOp additiveExpression
            	    {
            	    pushFollow(FOLLOW_shiftOp_in_shiftExpression1087);
            	    shiftOp70=shiftOp();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, shiftOp70.getTree());
            	    pushFollow(FOLLOW_additiveExpression_in_shiftExpression1089);
            	    additiveExpression71=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression71.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("shiftExpression", 22);
        }
        return retval;
    }
    // $ANTLR end "shiftExpression"

    public static class shiftOp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "shiftOp"
    // ../etc/Jaml.g:193:1: shiftOp : ( '<' '<' | '>' '>' '>' | '>' '>' );
    public final JamlParser.shiftOp_return shiftOp() throws RecognitionException {
    traceIn("shiftOp", 23);
        JamlParser.shiftOp_return retval = new JamlParser.shiftOp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal72=null;
        Token char_literal73=null;
        Token char_literal74=null;
        Token char_literal75=null;
        Token char_literal76=null;
        Token char_literal77=null;
        Token char_literal78=null;

        CommonTree char_literal72_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal74_tree=null;
        CommonTree char_literal75_tree=null;
        CommonTree char_literal76_tree=null;
        CommonTree char_literal77_tree=null;
        CommonTree char_literal78_tree=null;

        try {
            // ../etc/Jaml.g:194:5: ( '<' '<' | '>' '>' '>' | '>' '>' )
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==61) ) {
                alt25=1;
            }
            else if ( (LA25_0==63) ) {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==63) ) {
                    int LA25_3 = input.LA(3);

                    if ( (LA25_3==63) ) {
                        alt25=2;
                    }
                    else if ( ((LA25_3>=IDENTIFIER && LA25_3<=NULL)||(LA25_3>=64 && LA25_3<=65)||(LA25_3>=69 && LA25_3<=73)||(LA25_3>=81 && LA25_3<=89)) ) {
                        alt25=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../etc/Jaml.g:194:10: '<' '<'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal72=(Token)match(input,61,FOLLOW_61_in_shiftOp1122); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal72_tree = (CommonTree)adaptor.create(char_literal72);
                    adaptor.addChild(root_0, char_literal72_tree);
                    }
                    char_literal73=(Token)match(input,61,FOLLOW_61_in_shiftOp1124); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal73_tree = (CommonTree)adaptor.create(char_literal73);
                    adaptor.addChild(root_0, char_literal73_tree);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:195:10: '>' '>' '>'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal74=(Token)match(input,63,FOLLOW_63_in_shiftOp1135); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal74_tree = (CommonTree)adaptor.create(char_literal74);
                    adaptor.addChild(root_0, char_literal74_tree);
                    }
                    char_literal75=(Token)match(input,63,FOLLOW_63_in_shiftOp1137); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal75_tree = (CommonTree)adaptor.create(char_literal75);
                    adaptor.addChild(root_0, char_literal75_tree);
                    }
                    char_literal76=(Token)match(input,63,FOLLOW_63_in_shiftOp1139); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal76_tree = (CommonTree)adaptor.create(char_literal76);
                    adaptor.addChild(root_0, char_literal76_tree);
                    }

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:196:10: '>' '>'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal77=(Token)match(input,63,FOLLOW_63_in_shiftOp1150); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal77_tree = (CommonTree)adaptor.create(char_literal77);
                    adaptor.addChild(root_0, char_literal77_tree);
                    }
                    char_literal78=(Token)match(input,63,FOLLOW_63_in_shiftOp1152); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal78_tree = (CommonTree)adaptor.create(char_literal78);
                    adaptor.addChild(root_0, char_literal78_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("shiftOp", 23);
        }
        return retval;
    }
    // $ANTLR end "shiftOp"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
    // ../etc/Jaml.g:200:1: additiveExpression : multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* ;
    public final JamlParser.additiveExpression_return additiveExpression() throws RecognitionException {
    traceIn("additiveExpression", 24);
        JamlParser.additiveExpression_return retval = new JamlParser.additiveExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set80=null;
        JamlParser.multiplicativeExpression_return multiplicativeExpression79 = null;

        JamlParser.multiplicativeExpression_return multiplicativeExpression81 = null;


        CommonTree set80_tree=null;

        try {
            // ../etc/Jaml.g:201:5: ( multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )* )
            // ../etc/Jaml.g:201:9: multiplicativeExpression ( ( '+' | '-' ) multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1173);
            multiplicativeExpression79=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression79.getTree());
            // ../etc/Jaml.g:202:9: ( ( '+' | '-' ) multiplicativeExpression )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=64 && LA26_0<=65)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../etc/Jaml.g:203:13: ( '+' | '-' ) multiplicativeExpression
            	    {
            	    set80=(Token)input.LT(1);
            	    if ( (input.LA(1)>=64 && input.LA(1)<=65) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set80));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression1250);
            	    multiplicativeExpression81=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression81.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("additiveExpression", 24);
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
    // ../etc/Jaml.g:210:1: multiplicativeExpression : unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* ;
    public final JamlParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
    traceIn("multiplicativeExpression", 25);
        JamlParser.multiplicativeExpression_return retval = new JamlParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set83=null;
        JamlParser.unaryExpression_return unaryExpression82 = null;

        JamlParser.unaryExpression_return unaryExpression84 = null;


        CommonTree set83_tree=null;

        try {
            // ../etc/Jaml.g:211:5: ( unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )* )
            // ../etc/Jaml.g:212:9: unaryExpression ( ( '*' | '/' | '%' ) unaryExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1288);
            unaryExpression82=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression82.getTree());
            // ../etc/Jaml.g:213:9: ( ( '*' | '/' | '%' ) unaryExpression )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=66 && LA27_0<=68)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../etc/Jaml.g:214:13: ( '*' | '/' | '%' ) unaryExpression
            	    {
            	    set83=(Token)input.LT(1);
            	    if ( (input.LA(1)>=66 && input.LA(1)<=68) ) {
            	        input.consume();
            	        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set83));
            	        state.errorRecovery=false;state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return retval;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression1383);
            	    unaryExpression84=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression84.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("multiplicativeExpression", 25);
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpression"
    // ../etc/Jaml.g:222:1: unaryExpression : ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus );
    public final JamlParser.unaryExpression_return unaryExpression() throws RecognitionException {
    traceIn("unaryExpression", 26);
        JamlParser.unaryExpression_return retval = new JamlParser.unaryExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal85=null;
        Token char_literal87=null;
        Token string_literal89=null;
        Token string_literal91=null;
        JamlParser.unaryExpression_return unaryExpression86 = null;

        JamlParser.unaryExpression_return unaryExpression88 = null;

        JamlParser.unaryExpression_return unaryExpression90 = null;

        JamlParser.unaryExpression_return unaryExpression92 = null;

        JamlParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus93 = null;


        CommonTree char_literal85_tree=null;
        CommonTree char_literal87_tree=null;
        CommonTree string_literal89_tree=null;
        CommonTree string_literal91_tree=null;

        try {
            // ../etc/Jaml.g:227:5: ( '+' unaryExpression | '-' unaryExpression | '++' unaryExpression | '--' unaryExpression | unaryExpressionNotPlusMinus )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt28=1;
                }
                break;
            case 65:
                {
                alt28=2;
                }
                break;
            case 69:
                {
                alt28=3;
                }
                break;
            case 70:
                {
                alt28=4;
                }
                break;
            case IDENTIFIER:
            case STRINGLITERAL:
            case INTLITERAL:
            case LONGLITERAL:
            case CHARLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERAL:
            case TRUE:
            case FALSE:
            case NULL:
            case 71:
            case 72:
            case 73:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                {
                alt28=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../etc/Jaml.g:227:9: '+' unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal85=(Token)match(input,64,FOLLOW_64_in_unaryExpression1416); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal85_tree = (CommonTree)adaptor.create(char_literal85);
                    adaptor.addChild(root_0, char_literal85_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1419);
                    unaryExpression86=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression86.getTree());

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:228:9: '-' unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal87=(Token)match(input,65,FOLLOW_65_in_unaryExpression1429); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal87_tree = (CommonTree)adaptor.create(char_literal87);
                    adaptor.addChild(root_0, char_literal87_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1431);
                    unaryExpression88=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression88.getTree());

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:229:9: '++' unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal89=(Token)match(input,69,FOLLOW_69_in_unaryExpression1441); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal89_tree = (CommonTree)adaptor.create(string_literal89);
                    adaptor.addChild(root_0, string_literal89_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1443);
                    unaryExpression90=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression90.getTree());

                    }
                    break;
                case 4 :
                    // ../etc/Jaml.g:230:9: '--' unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    string_literal91=(Token)match(input,70,FOLLOW_70_in_unaryExpression1453); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal91_tree = (CommonTree)adaptor.create(string_literal91);
                    adaptor.addChild(root_0, string_literal91_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression1455);
                    unaryExpression92=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression92.getTree());

                    }
                    break;
                case 5 :
                    // ../etc/Jaml.g:231:9: unaryExpressionNotPlusMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1465);
                    unaryExpressionNotPlusMinus93=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus93.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("unaryExpression", 26);
        }
        return retval;
    }
    // $ANTLR end "unaryExpression"

    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpressionNotPlusMinus"
    // ../etc/Jaml.g:234:1: unaryExpressionNotPlusMinus : ( '~' unaryExpression | '!' unaryExpression | castExpressionOrPrimaryParExpression | primaryNonParExpression ( selector )* ( '++' | '--' )? );
    public final JamlParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
    traceIn("unaryExpressionNotPlusMinus", 27);
        JamlParser.unaryExpressionNotPlusMinus_return retval = new JamlParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal94=null;
        Token char_literal96=null;
        Token set101=null;
        JamlParser.unaryExpression_return unaryExpression95 = null;

        JamlParser.unaryExpression_return unaryExpression97 = null;

        JamlParser.castExpressionOrPrimaryParExpression_return castExpressionOrPrimaryParExpression98 = null;

        JamlParser.primaryNonParExpression_return primaryNonParExpression99 = null;

        JamlParser.selector_return selector100 = null;


        CommonTree char_literal94_tree=null;
        CommonTree char_literal96_tree=null;
        CommonTree set101_tree=null;

        try {
            // ../etc/Jaml.g:235:5: ( '~' unaryExpression | '!' unaryExpression | castExpressionOrPrimaryParExpression | primaryNonParExpression ( selector )* ( '++' | '--' )? )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt31=1;
                }
                break;
            case 72:
                {
                alt31=2;
                }
                break;
            case 73:
                {
                alt31=3;
                }
                break;
            case IDENTIFIER:
            case STRINGLITERAL:
            case INTLITERAL:
            case LONGLITERAL:
            case CHARLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERAL:
            case TRUE:
            case FALSE:
            case NULL:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                {
                alt31=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../etc/Jaml.g:235:9: '~' unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal94=(Token)match(input,71,FOLLOW_71_in_unaryExpressionNotPlusMinus1485); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal94_tree = (CommonTree)adaptor.create(char_literal94);
                    adaptor.addChild(root_0, char_literal94_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1487);
                    unaryExpression95=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression95.getTree());

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:236:9: '!' unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal96=(Token)match(input,72,FOLLOW_72_in_unaryExpressionNotPlusMinus1497); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal96_tree = (CommonTree)adaptor.create(char_literal96);
                    adaptor.addChild(root_0, char_literal96_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1499);
                    unaryExpression97=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression97.getTree());

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:237:9: castExpressionOrPrimaryParExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_castExpressionOrPrimaryParExpression_in_unaryExpressionNotPlusMinus1509);
                    castExpressionOrPrimaryParExpression98=castExpressionOrPrimaryParExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, castExpressionOrPrimaryParExpression98.getTree());

                    }
                    break;
                case 4 :
                    // ../etc/Jaml.g:238:9: primaryNonParExpression ( selector )* ( '++' | '--' )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primaryNonParExpression_in_unaryExpressionNotPlusMinus1519);
                    primaryNonParExpression99=primaryNonParExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primaryNonParExpression99.getTree());
                    // ../etc/Jaml.g:239:9: ( selector )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( ((LA29_0>=75 && LA29_0<=76)) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../etc/Jaml.g:239:10: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_unaryExpressionNotPlusMinus1530);
                    	    selector100=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector100.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    // ../etc/Jaml.g:240:9: ( '++' | '--' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=69 && LA30_0<=70)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../etc/Jaml.g:
                            {
                            set101=(Token)input.LT(1);
                            if ( (input.LA(1)>=69 && input.LA(1)<=70) ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set101));
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("unaryExpressionNotPlusMinus", 27);
        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"

    public static class castExpressionOrPrimaryParExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "castExpressionOrPrimaryParExpression"
    // ../etc/Jaml.g:244:1: castExpressionOrPrimaryParExpression : '(' ( ( type )=> type ')' unaryExpression | expression ')' ( selector )* ( '++' | '--' )? ) ;
    public final JamlParser.castExpressionOrPrimaryParExpression_return castExpressionOrPrimaryParExpression() throws RecognitionException {
    traceIn("castExpressionOrPrimaryParExpression", 28);
        JamlParser.castExpressionOrPrimaryParExpression_return retval = new JamlParser.castExpressionOrPrimaryParExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal102=null;
        Token char_literal104=null;
        Token char_literal107=null;
        Token set109=null;
        JamlParser.type_return type103 = null;

        JamlParser.unaryExpression_return unaryExpression105 = null;

        JamlParser.expression_return expression106 = null;

        JamlParser.selector_return selector108 = null;


        CommonTree char_literal102_tree=null;
        CommonTree char_literal104_tree=null;
        CommonTree char_literal107_tree=null;
        CommonTree set109_tree=null;

        try {
            // ../etc/Jaml.g:252:5: ( '(' ( ( type )=> type ')' unaryExpression | expression ')' ( selector )* ( '++' | '--' )? ) )
            // ../etc/Jaml.g:252:7: '(' ( ( type )=> type ')' unaryExpression | expression ')' ( selector )* ( '++' | '--' )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal102=(Token)match(input,73,FOLLOW_73_in_castExpressionOrPrimaryParExpression1576); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal102_tree = (CommonTree)adaptor.create(char_literal102);
            adaptor.addChild(root_0, char_literal102_tree);
            }
            // ../etc/Jaml.g:253:11: ( ( type )=> type ')' unaryExpression | expression ')' ( selector )* ( '++' | '--' )? )
            int alt34=2;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // ../etc/Jaml.g:253:15: ( type )=> type ')' unaryExpression
                    {
                    pushFollow(FOLLOW_type_in_castExpressionOrPrimaryParExpression1598);
                    type103=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type103.getTree());
                    char_literal104=(Token)match(input,74,FOLLOW_74_in_castExpressionOrPrimaryParExpression1600); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal104_tree = (CommonTree)adaptor.create(char_literal104);
                    adaptor.addChild(root_0, char_literal104_tree);
                    }
                    pushFollow(FOLLOW_unaryExpression_in_castExpressionOrPrimaryParExpression1602);
                    unaryExpression105=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression105.getTree());

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:254:15: expression ')' ( selector )* ( '++' | '--' )?
                    {
                    pushFollow(FOLLOW_expression_in_castExpressionOrPrimaryParExpression1622);
                    expression106=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression106.getTree());
                    char_literal107=(Token)match(input,74,FOLLOW_74_in_castExpressionOrPrimaryParExpression1624); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal107_tree = (CommonTree)adaptor.create(char_literal107);
                    adaptor.addChild(root_0, char_literal107_tree);
                    }
                    // ../etc/Jaml.g:254:30: ( selector )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( ((LA32_0>=75 && LA32_0<=76)) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../etc/Jaml.g:254:31: selector
                    	    {
                    	    pushFollow(FOLLOW_selector_in_castExpressionOrPrimaryParExpression1627);
                    	    selector108=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector108.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ../etc/Jaml.g:254:42: ( '++' | '--' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=69 && LA33_0<=70)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../etc/Jaml.g:
                            {
                            set109=(Token)input.LT(1);
                            if ( (input.LA(1)>=69 && input.LA(1)<=70) ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set109));
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("castExpressionOrPrimaryParExpression", 28);
        }
        return retval;
    }
    // $ANTLR end "castExpressionOrPrimaryParExpression"

    public static class primaryNonParExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primaryNonParExpression"
    // ../etc/Jaml.g:258:1: primaryNonParExpression : ( IDENTIFIER ( ( '.' IDENTIFIER )=> '.' IDENTIFIER )* ( ( identifierSuffix )=> identifierSuffix )? | literal | creator | primitiveType ( '[' ']' )* '.' 'class' );
    public final JamlParser.primaryNonParExpression_return primaryNonParExpression() throws RecognitionException {
    traceIn("primaryNonParExpression", 29);
        JamlParser.primaryNonParExpression_return retval = new JamlParser.primaryNonParExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER110=null;
        Token char_literal111=null;
        Token IDENTIFIER112=null;
        Token char_literal117=null;
        Token char_literal118=null;
        Token char_literal119=null;
        Token string_literal120=null;
        JamlParser.identifierSuffix_return identifierSuffix113 = null;

        JamlParser.literal_return literal114 = null;

        JamlParser.creator_return creator115 = null;

        JamlParser.primitiveType_return primitiveType116 = null;


        CommonTree IDENTIFIER110_tree=null;
        CommonTree char_literal111_tree=null;
        CommonTree IDENTIFIER112_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree char_literal118_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree string_literal120_tree=null;

        try {
            // ../etc/Jaml.g:262:5: ( IDENTIFIER ( ( '.' IDENTIFIER )=> '.' IDENTIFIER )* ( ( identifierSuffix )=> identifierSuffix )? | literal | creator | primitiveType ( '[' ']' )* '.' 'class' )
            int alt38=4;
            switch ( input.LA(1) ) {
            case IDENTIFIER:
                {
                alt38=1;
                }
                break;
            case STRINGLITERAL:
            case INTLITERAL:
            case LONGLITERAL:
            case CHARLITERAL:
            case FLOATLITERAL:
            case DOUBLELITERAL:
            case TRUE:
            case FALSE:
            case NULL:
                {
                alt38=2;
                }
                break;
            case 81:
                {
                alt38=3;
                }
                break;
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../etc/Jaml.g:264:5: IDENTIFIER ( ( '.' IDENTIFIER )=> '.' IDENTIFIER )* ( ( identifierSuffix )=> identifierSuffix )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    IDENTIFIER110=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primaryNonParExpression1684); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER110_tree = (CommonTree)adaptor.create(IDENTIFIER110);
                    adaptor.addChild(root_0, IDENTIFIER110_tree);
                    }
                    // ../etc/Jaml.g:265:9: ( ( '.' IDENTIFIER )=> '.' IDENTIFIER )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==75) ) {
                            int LA35_2 = input.LA(2);

                            if ( (LA35_2==IDENTIFIER) ) {
                                int LA35_3 = input.LA(3);

                                if ( (synpred2_Jaml()) ) {
                                    alt35=1;
                                }


                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../etc/Jaml.g:265:10: ( '.' IDENTIFIER )=> '.' IDENTIFIER
                    	    {
                    	    char_literal111=(Token)match(input,75,FOLLOW_75_in_primaryNonParExpression1702); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal111_tree = (CommonTree)adaptor.create(char_literal111);
                    	    adaptor.addChild(root_0, char_literal111_tree);
                    	    }
                    	    IDENTIFIER112=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_primaryNonParExpression1704); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    IDENTIFIER112_tree = (CommonTree)adaptor.create(IDENTIFIER112);
                    	    adaptor.addChild(root_0, IDENTIFIER112_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // ../etc/Jaml.g:266:9: ( ( identifierSuffix )=> identifierSuffix )?
                    int alt36=2;
                    alt36 = dfa36.predict(input);
                    switch (alt36) {
                        case 1 :
                            // ../etc/Jaml.g:266:10: ( identifierSuffix )=> identifierSuffix
                            {
                            pushFollow(FOLLOW_identifierSuffix_in_primaryNonParExpression1723);
                            identifierSuffix113=identifierSuffix();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierSuffix113.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:267:9: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primaryNonParExpression1735);
                    literal114=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal114.getTree());

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:268:9: creator
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_creator_in_primaryNonParExpression1745);
                    creator115=creator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, creator115.getTree());

                    }
                    break;
                case 4 :
                    // ../etc/Jaml.g:269:9: primitiveType ( '[' ']' )* '.' 'class'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_primaryNonParExpression1755);
                    primitiveType116=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType116.getTree());
                    // ../etc/Jaml.g:270:9: ( '[' ']' )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==76) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../etc/Jaml.g:270:10: '[' ']'
                    	    {
                    	    char_literal117=(Token)match(input,76,FOLLOW_76_in_primaryNonParExpression1766); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal117_tree = (CommonTree)adaptor.create(char_literal117);
                    	    adaptor.addChild(root_0, char_literal117_tree);
                    	    }
                    	    char_literal118=(Token)match(input,77,FOLLOW_77_in_primaryNonParExpression1768); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal118_tree = (CommonTree)adaptor.create(char_literal118);
                    	    adaptor.addChild(root_0, char_literal118_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);

                    char_literal119=(Token)match(input,75,FOLLOW_75_in_primaryNonParExpression1789); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal119_tree = (CommonTree)adaptor.create(char_literal119);
                    adaptor.addChild(root_0, char_literal119_tree);
                    }
                    string_literal120=(Token)match(input,78,FOLLOW_78_in_primaryNonParExpression1791); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal120_tree = (CommonTree)adaptor.create(string_literal120);
                    adaptor.addChild(root_0, string_literal120_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("primaryNonParExpression", 29);
        }
        return retval;
    }
    // $ANTLR end "primaryNonParExpression"

    public static class superSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "superSuffix"
    // ../etc/Jaml.g:277:1: superSuffix : ( arguments | '.' ( typeArguments )? IDENTIFIER ( arguments )? );
    public final JamlParser.superSuffix_return superSuffix() throws RecognitionException {
    traceIn("superSuffix", 30);
        JamlParser.superSuffix_return retval = new JamlParser.superSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal122=null;
        Token IDENTIFIER124=null;
        JamlParser.arguments_return arguments121 = null;

        JamlParser.typeArguments_return typeArguments123 = null;

        JamlParser.arguments_return arguments125 = null;


        CommonTree char_literal122_tree=null;
        CommonTree IDENTIFIER124_tree=null;

        try {
            // ../etc/Jaml.g:278:5: ( arguments | '.' ( typeArguments )? IDENTIFIER ( arguments )? )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==73) ) {
                alt41=1;
            }
            else if ( (LA41_0==75) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../etc/Jaml.g:278:9: arguments
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arguments_in_superSuffix1822);
                    arguments121=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments121.getTree());

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:279:9: '.' ( typeArguments )? IDENTIFIER ( arguments )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal122=(Token)match(input,75,FOLLOW_75_in_superSuffix1832); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal122_tree = (CommonTree)adaptor.create(char_literal122);
                    adaptor.addChild(root_0, char_literal122_tree);
                    }
                    // ../etc/Jaml.g:279:13: ( typeArguments )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==61) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../etc/Jaml.g:279:14: typeArguments
                            {
                            pushFollow(FOLLOW_typeArguments_in_superSuffix1835);
                            typeArguments123=typeArguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments123.getTree());

                            }
                            break;

                    }

                    IDENTIFIER124=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_superSuffix1856); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER124_tree = (CommonTree)adaptor.create(IDENTIFIER124);
                    adaptor.addChild(root_0, IDENTIFIER124_tree);
                    }
                    // ../etc/Jaml.g:282:9: ( arguments )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==73) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../etc/Jaml.g:282:10: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_superSuffix1867);
                            arguments125=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments125.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("superSuffix", 30);
        }
        return retval;
    }
    // $ANTLR end "superSuffix"

    public static class identifierSuffix_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "identifierSuffix"
    // ../etc/Jaml.g:287:1: identifierSuffix : ( ( ( '[' )=> '[' ( expression )? ']' )+ ( '.' 'class' )? | arguments );
    public final JamlParser.identifierSuffix_return identifierSuffix() throws RecognitionException {
    traceIn("identifierSuffix", 31);
        JamlParser.identifierSuffix_return retval = new JamlParser.identifierSuffix_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal126=null;
        Token char_literal128=null;
        Token char_literal129=null;
        Token string_literal130=null;
        JamlParser.expression_return expression127 = null;

        JamlParser.arguments_return arguments131 = null;


        CommonTree char_literal126_tree=null;
        CommonTree char_literal128_tree=null;
        CommonTree char_literal129_tree=null;
        CommonTree string_literal130_tree=null;

        try {
            // ../etc/Jaml.g:288:5: ( ( ( '[' )=> '[' ( expression )? ']' )+ ( '.' 'class' )? | arguments )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==76) ) {
                alt45=1;
            }
            else if ( (LA45_0==73) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../etc/Jaml.g:288:8: ( ( '[' )=> '[' ( expression )? ']' )+ ( '.' 'class' )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:288:8: ( ( '[' )=> '[' ( expression )? ']' )+
                    int cnt43=0;
                    loop43:
                    do {
                        int alt43=2;
                        alt43 = dfa43.predict(input);
                        switch (alt43) {
                    	case 1 :
                    	    // ../etc/Jaml.g:288:9: ( '[' )=> '[' ( expression )? ']'
                    	    {
                    	    char_literal126=(Token)match(input,76,FOLLOW_76_in_identifierSuffix1904); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal126_tree = (CommonTree)adaptor.create(char_literal126);
                    	    adaptor.addChild(root_0, char_literal126_tree);
                    	    }
                    	    // ../etc/Jaml.g:288:21: ( expression )?
                    	    int alt42=2;
                    	    int LA42_0 = input.LA(1);

                    	    if ( ((LA42_0>=IDENTIFIER && LA42_0<=NULL)||(LA42_0>=64 && LA42_0<=65)||(LA42_0>=69 && LA42_0<=73)||(LA42_0>=81 && LA42_0<=89)) ) {
                    	        alt42=1;
                    	    }
                    	    switch (alt42) {
                    	        case 1 :
                    	            // ../etc/Jaml.g:288:21: expression
                    	            {
                    	            pushFollow(FOLLOW_expression_in_identifierSuffix1906);
                    	            expression127=expression();

                    	            state._fsp--;
                    	            if (state.failed) return retval;
                    	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression127.getTree());

                    	            }
                    	            break;

                    	    }

                    	    char_literal128=(Token)match(input,77,FOLLOW_77_in_identifierSuffix1909); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal128_tree = (CommonTree)adaptor.create(char_literal128);
                    	    adaptor.addChild(root_0, char_literal128_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt43 >= 1 ) break loop43;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(43, input);
                                throw eee;
                        }
                        cnt43++;
                    } while (true);

                    // ../etc/Jaml.g:288:39: ( '.' 'class' )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==75) ) {
                        int LA44_1 = input.LA(2);

                        if ( (LA44_1==78) ) {
                            alt44=1;
                        }
                    }
                    switch (alt44) {
                        case 1 :
                            // ../etc/Jaml.g:288:40: '.' 'class'
                            {
                            char_literal129=(Token)match(input,75,FOLLOW_75_in_identifierSuffix1914); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            char_literal129_tree = (CommonTree)adaptor.create(char_literal129);
                            adaptor.addChild(root_0, char_literal129_tree);
                            }
                            string_literal130=(Token)match(input,78,FOLLOW_78_in_identifierSuffix1916); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            string_literal130_tree = (CommonTree)adaptor.create(string_literal130);
                            adaptor.addChild(root_0, string_literal130_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:289:9: arguments
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arguments_in_identifierSuffix1928);
                    arguments131=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments131.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("identifierSuffix", 31);
        }
        return retval;
    }
    // $ANTLR end "identifierSuffix"

    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
    // ../etc/Jaml.g:296:1: selector : ( '.' IDENTIFIER ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '[' expression ']' );
    public final JamlParser.selector_return selector() throws RecognitionException {
    traceIn("selector", 32);
        JamlParser.selector_return retval = new JamlParser.selector_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal132=null;
        Token IDENTIFIER133=null;
        Token char_literal135=null;
        Token string_literal136=null;
        Token char_literal137=null;
        Token string_literal138=null;
        Token char_literal140=null;
        Token char_literal142=null;
        JamlParser.arguments_return arguments134 = null;

        JamlParser.superSuffix_return superSuffix139 = null;

        JamlParser.expression_return expression141 = null;


        CommonTree char_literal132_tree=null;
        CommonTree IDENTIFIER133_tree=null;
        CommonTree char_literal135_tree=null;
        CommonTree string_literal136_tree=null;
        CommonTree char_literal137_tree=null;
        CommonTree string_literal138_tree=null;
        CommonTree char_literal140_tree=null;
        CommonTree char_literal142_tree=null;

        try {
            // ../etc/Jaml.g:297:5: ( '.' IDENTIFIER ( arguments )? | '.' 'this' | '.' 'super' superSuffix | '[' expression ']' )
            int alt47=4;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==75) ) {
                switch ( input.LA(2) ) {
                case IDENTIFIER:
                    {
                    alt47=1;
                    }
                    break;
                case 79:
                    {
                    alt47=2;
                    }
                    break;
                case 80:
                    {
                    alt47=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA47_0==76) ) {
                alt47=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../etc/Jaml.g:297:9: '.' IDENTIFIER ( arguments )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal132=(Token)match(input,75,FOLLOW_75_in_selector1967); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal132_tree = (CommonTree)adaptor.create(char_literal132);
                    adaptor.addChild(root_0, char_literal132_tree);
                    }
                    IDENTIFIER133=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_selector1969); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    IDENTIFIER133_tree = (CommonTree)adaptor.create(IDENTIFIER133);
                    adaptor.addChild(root_0, IDENTIFIER133_tree);
                    }
                    // ../etc/Jaml.g:298:9: ( arguments )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==73) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../etc/Jaml.g:298:10: arguments
                            {
                            pushFollow(FOLLOW_arguments_in_selector1980);
                            arguments134=arguments();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments134.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:300:9: '.' 'this'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal135=(Token)match(input,75,FOLLOW_75_in_selector2001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal135_tree = (CommonTree)adaptor.create(char_literal135);
                    adaptor.addChild(root_0, char_literal135_tree);
                    }
                    string_literal136=(Token)match(input,79,FOLLOW_79_in_selector2003); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal136_tree = (CommonTree)adaptor.create(string_literal136);
                    adaptor.addChild(root_0, string_literal136_tree);
                    }

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:301:9: '.' 'super' superSuffix
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal137=(Token)match(input,75,FOLLOW_75_in_selector2013); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal137_tree = (CommonTree)adaptor.create(char_literal137);
                    adaptor.addChild(root_0, char_literal137_tree);
                    }
                    string_literal138=(Token)match(input,80,FOLLOW_80_in_selector2015); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal138_tree = (CommonTree)adaptor.create(string_literal138);
                    adaptor.addChild(root_0, string_literal138_tree);
                    }
                    pushFollow(FOLLOW_superSuffix_in_selector2025);
                    superSuffix139=superSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, superSuffix139.getTree());

                    }
                    break;
                case 4 :
                    // ../etc/Jaml.g:304:9: '[' expression ']'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal140=(Token)match(input,76,FOLLOW_76_in_selector2040); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal140_tree = (CommonTree)adaptor.create(char_literal140);
                    adaptor.addChild(root_0, char_literal140_tree);
                    }
                    pushFollow(FOLLOW_expression_in_selector2042);
                    expression141=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression141.getTree());
                    char_literal142=(Token)match(input,77,FOLLOW_77_in_selector2044); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal142_tree = (CommonTree)adaptor.create(char_literal142);
                    adaptor.addChild(root_0, char_literal142_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("selector", 32);
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class creator_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "creator"
    // ../etc/Jaml.g:307:1: creator : 'new' ( nonWildcardTypeArguments )? createdName ( classCreatorRest | arrayCreatorRest ) ;
    public final JamlParser.creator_return creator() throws RecognitionException {
    traceIn("creator", 33);
        JamlParser.creator_return retval = new JamlParser.creator_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token string_literal143=null;
        JamlParser.nonWildcardTypeArguments_return nonWildcardTypeArguments144 = null;

        JamlParser.createdName_return createdName145 = null;

        JamlParser.classCreatorRest_return classCreatorRest146 = null;

        JamlParser.arrayCreatorRest_return arrayCreatorRest147 = null;


        CommonTree string_literal143_tree=null;

        try {
            // ../etc/Jaml.g:308:5: ( 'new' ( nonWildcardTypeArguments )? createdName ( classCreatorRest | arrayCreatorRest ) )
            // ../etc/Jaml.g:308:9: 'new' ( nonWildcardTypeArguments )? createdName ( classCreatorRest | arrayCreatorRest )
            {
            root_0 = (CommonTree)adaptor.nil();

            string_literal143=(Token)match(input,81,FOLLOW_81_in_creator2064); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            string_literal143_tree = (CommonTree)adaptor.create(string_literal143);
            adaptor.addChild(root_0, string_literal143_tree);
            }
            // ../etc/Jaml.g:309:9: ( nonWildcardTypeArguments )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==61) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../etc/Jaml.g:309:9: nonWildcardTypeArguments
                    {
                    pushFollow(FOLLOW_nonWildcardTypeArguments_in_creator2075);
                    nonWildcardTypeArguments144=nonWildcardTypeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, nonWildcardTypeArguments144.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_createdName_in_creator2087);
            createdName145=createdName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, createdName145.getTree());
            // ../etc/Jaml.g:311:9: ( classCreatorRest | arrayCreatorRest )
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==73) ) {
                alt49=1;
            }
            else if ( (LA49_0==76) ) {
                alt49=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }
            switch (alt49) {
                case 1 :
                    // ../etc/Jaml.g:311:11: classCreatorRest
                    {
                    pushFollow(FOLLOW_classCreatorRest_in_creator2100);
                    classCreatorRest146=classCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classCreatorRest146.getTree());

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:311:30: arrayCreatorRest
                    {
                    pushFollow(FOLLOW_arrayCreatorRest_in_creator2104);
                    arrayCreatorRest147=arrayCreatorRest();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayCreatorRest147.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("creator", 33);
        }
        return retval;
    }
    // $ANTLR end "creator"

    public static class arrayCreatorRest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayCreatorRest"
    // ../etc/Jaml.g:314:1: arrayCreatorRest : ( ( '[' )=> '[' ( expression )? ']' )+ ( arrayInitializer )? ;
    public final JamlParser.arrayCreatorRest_return arrayCreatorRest() throws RecognitionException {
    traceIn("arrayCreatorRest", 34);
        JamlParser.arrayCreatorRest_return retval = new JamlParser.arrayCreatorRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal148=null;
        Token char_literal150=null;
        JamlParser.expression_return expression149 = null;

        JamlParser.arrayInitializer_return arrayInitializer151 = null;


        CommonTree char_literal148_tree=null;
        CommonTree char_literal150_tree=null;

        try {
            // ../etc/Jaml.g:315:5: ( ( ( '[' )=> '[' ( expression )? ']' )+ ( arrayInitializer )? )
            // ../etc/Jaml.g:315:9: ( ( '[' )=> '[' ( expression )? ']' )+ ( arrayInitializer )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:315:9: ( ( '[' )=> '[' ( expression )? ']' )+
            int cnt51=0;
            loop51:
            do {
                int alt51=2;
                alt51 = dfa51.predict(input);
                switch (alt51) {
            	case 1 :
            	    // ../etc/Jaml.g:315:10: ( '[' )=> '[' ( expression )? ']'
            	    {
            	    char_literal148=(Token)match(input,76,FOLLOW_76_in_arrayCreatorRest2128); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal148_tree = (CommonTree)adaptor.create(char_literal148);
            	    adaptor.addChild(root_0, char_literal148_tree);
            	    }
            	    // ../etc/Jaml.g:315:22: ( expression )?
            	    int alt50=2;
            	    int LA50_0 = input.LA(1);

            	    if ( ((LA50_0>=IDENTIFIER && LA50_0<=NULL)||(LA50_0>=64 && LA50_0<=65)||(LA50_0>=69 && LA50_0<=73)||(LA50_0>=81 && LA50_0<=89)) ) {
            	        alt50=1;
            	    }
            	    switch (alt50) {
            	        case 1 :
            	            // ../etc/Jaml.g:315:22: expression
            	            {
            	            pushFollow(FOLLOW_expression_in_arrayCreatorRest2130);
            	            expression149=expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression149.getTree());

            	            }
            	            break;

            	    }

            	    char_literal150=(Token)match(input,77,FOLLOW_77_in_arrayCreatorRest2133); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal150_tree = (CommonTree)adaptor.create(char_literal150);
            	    adaptor.addChild(root_0, char_literal150_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            // ../etc/Jaml.g:316:9: ( arrayInitializer )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==91) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../etc/Jaml.g:316:9: arrayInitializer
                    {
                    pushFollow(FOLLOW_arrayInitializer_in_arrayCreatorRest2145);
                    arrayInitializer151=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer151.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("arrayCreatorRest", 34);
        }
        return retval;
    }
    // $ANTLR end "arrayCreatorRest"

    public static class type_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // ../etc/Jaml.g:318:1: type : ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* );
    public final JamlParser.type_return type() throws RecognitionException {
    traceIn("type", 35);
        JamlParser.type_return retval = new JamlParser.type_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal153=null;
        Token char_literal154=null;
        Token char_literal156=null;
        Token char_literal157=null;
        JamlParser.classOrInterfaceType_return classOrInterfaceType152 = null;

        JamlParser.primitiveType_return primitiveType155 = null;


        CommonTree char_literal153_tree=null;
        CommonTree char_literal154_tree=null;
        CommonTree char_literal156_tree=null;
        CommonTree char_literal157_tree=null;

        try {
            // ../etc/Jaml.g:319:5: ( classOrInterfaceType ( '[' ']' )* | primitiveType ( '[' ']' )* )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==IDENTIFIER) ) {
                alt55=1;
            }
            else if ( ((LA55_0>=82 && LA55_0<=89)) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../etc/Jaml.g:319:9: classOrInterfaceType ( '[' ']' )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_classOrInterfaceType_in_type2161);
                    classOrInterfaceType152=classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceType152.getTree());
                    // ../etc/Jaml.g:320:9: ( '[' ']' )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==76) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../etc/Jaml.g:320:10: '[' ']'
                    	    {
                    	    char_literal153=(Token)match(input,76,FOLLOW_76_in_type2172); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal153_tree = (CommonTree)adaptor.create(char_literal153);
                    	    adaptor.addChild(root_0, char_literal153_tree);
                    	    }
                    	    char_literal154=(Token)match(input,77,FOLLOW_77_in_type2174); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal154_tree = (CommonTree)adaptor.create(char_literal154);
                    	    adaptor.addChild(root_0, char_literal154_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:322:9: primitiveType ( '[' ']' )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_type2195);
                    primitiveType155=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType155.getTree());
                    // ../etc/Jaml.g:323:9: ( '[' ']' )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==76) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // ../etc/Jaml.g:323:10: '[' ']'
                    	    {
                    	    char_literal156=(Token)match(input,76,FOLLOW_76_in_type2206); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal156_tree = (CommonTree)adaptor.create(char_literal156);
                    	    adaptor.addChild(root_0, char_literal156_tree);
                    	    }
                    	    char_literal157=(Token)match(input,77,FOLLOW_77_in_type2208); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal157_tree = (CommonTree)adaptor.create(char_literal157);
                    	    adaptor.addChild(root_0, char_literal157_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("type", 35);
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class classOrInterfaceType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classOrInterfaceType"
    // ../etc/Jaml.g:328:1: classOrInterfaceType : IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )* ;
    public final JamlParser.classOrInterfaceType_return classOrInterfaceType() throws RecognitionException {
    traceIn("classOrInterfaceType", 36);
        JamlParser.classOrInterfaceType_return retval = new JamlParser.classOrInterfaceType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token IDENTIFIER158=null;
        Token char_literal160=null;
        Token IDENTIFIER161=null;
        JamlParser.typeArguments_return typeArguments159 = null;

        JamlParser.typeArguments_return typeArguments162 = null;


        CommonTree IDENTIFIER158_tree=null;
        CommonTree char_literal160_tree=null;
        CommonTree IDENTIFIER161_tree=null;

        try {
            // ../etc/Jaml.g:329:5: ( IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )* )
            // ../etc/Jaml.g:329:9: IDENTIFIER ( typeArguments )? ( '.' IDENTIFIER ( typeArguments )? )*
            {
            root_0 = (CommonTree)adaptor.nil();

            IDENTIFIER158=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterfaceType2240); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            IDENTIFIER158_tree = (CommonTree)adaptor.create(IDENTIFIER158);
            adaptor.addChild(root_0, IDENTIFIER158_tree);
            }
            // ../etc/Jaml.g:330:9: ( typeArguments )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==61) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../etc/Jaml.g:330:10: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2251);
                    typeArguments159=typeArguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments159.getTree());

                    }
                    break;

            }

            // ../etc/Jaml.g:332:9: ( '.' IDENTIFIER ( typeArguments )? )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==75) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../etc/Jaml.g:332:10: '.' IDENTIFIER ( typeArguments )?
            	    {
            	    char_literal160=(Token)match(input,75,FOLLOW_75_in_classOrInterfaceType2273); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal160_tree = (CommonTree)adaptor.create(char_literal160);
            	    adaptor.addChild(root_0, char_literal160_tree);
            	    }
            	    IDENTIFIER161=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_classOrInterfaceType2275); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    IDENTIFIER161_tree = (CommonTree)adaptor.create(IDENTIFIER161);
            	    adaptor.addChild(root_0, IDENTIFIER161_tree);
            	    }
            	    // ../etc/Jaml.g:333:13: ( typeArguments )?
            	    int alt57=2;
            	    int LA57_0 = input.LA(1);

            	    if ( (LA57_0==61) ) {
            	        alt57=1;
            	    }
            	    switch (alt57) {
            	        case 1 :
            	            // ../etc/Jaml.g:333:14: typeArguments
            	            {
            	            pushFollow(FOLLOW_typeArguments_in_classOrInterfaceType2290);
            	            typeArguments162=typeArguments();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArguments162.getTree());

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("classOrInterfaceType", 36);
        }
        return retval;
    }
    // $ANTLR end "classOrInterfaceType"

    public static class primitiveType_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primitiveType"
    // ../etc/Jaml.g:338:1: primitiveType : ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' );
    public final JamlParser.primitiveType_return primitiveType() throws RecognitionException {
    traceIn("primitiveType", 37);
        JamlParser.primitiveType_return retval = new JamlParser.primitiveType_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set163=null;

        CommonTree set163_tree=null;

        try {
            // ../etc/Jaml.g:339:5: ( 'boolean' | 'char' | 'byte' | 'short' | 'int' | 'long' | 'float' | 'double' )
            // ../etc/Jaml.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set163=(Token)input.LT(1);
            if ( (input.LA(1)>=82 && input.LA(1)<=89) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set163));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("primitiveType", 37);
        }
        return retval;
    }
    // $ANTLR end "primitiveType"

    public static class typeArguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeArguments"
    // ../etc/Jaml.g:349:1: typeArguments : '<' typeArgument ( ',' typeArgument )* '>' ;
    public final JamlParser.typeArguments_return typeArguments() throws RecognitionException {
    traceIn("typeArguments", 38);
        JamlParser.typeArguments_return retval = new JamlParser.typeArguments_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal164=null;
        Token char_literal166=null;
        Token char_literal168=null;
        JamlParser.typeArgument_return typeArgument165 = null;

        JamlParser.typeArgument_return typeArgument167 = null;


        CommonTree char_literal164_tree=null;
        CommonTree char_literal166_tree=null;
        CommonTree char_literal168_tree=null;

        try {
            // ../etc/Jaml.g:350:5: ( '<' typeArgument ( ',' typeArgument )* '>' )
            // ../etc/Jaml.g:350:9: '<' typeArgument ( ',' typeArgument )* '>'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal164=(Token)match(input,61,FOLLOW_61_in_typeArguments2427); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal164_tree = (CommonTree)adaptor.create(char_literal164);
            adaptor.addChild(root_0, char_literal164_tree);
            }
            pushFollow(FOLLOW_typeArgument_in_typeArguments2429);
            typeArgument165=typeArgument();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArgument165.getTree());
            // ../etc/Jaml.g:351:9: ( ',' typeArgument )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==51) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../etc/Jaml.g:351:10: ',' typeArgument
            	    {
            	    char_literal166=(Token)match(input,51,FOLLOW_51_in_typeArguments2440); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal166_tree = (CommonTree)adaptor.create(char_literal166);
            	    adaptor.addChild(root_0, char_literal166_tree);
            	    }
            	    pushFollow(FOLLOW_typeArgument_in_typeArguments2442);
            	    typeArgument167=typeArgument();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, typeArgument167.getTree());

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);

            char_literal168=(Token)match(input,63,FOLLOW_63_in_typeArguments2464); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal168_tree = (CommonTree)adaptor.create(char_literal168);
            adaptor.addChild(root_0, char_literal168_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("typeArguments", 38);
        }
        return retval;
    }
    // $ANTLR end "typeArguments"

    public static class typeArgument_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeArgument"
    // ../etc/Jaml.g:356:1: typeArgument : ( type | '?' ( ( 'extends' | 'super' ) type )? );
    public final JamlParser.typeArgument_return typeArgument() throws RecognitionException {
    traceIn("typeArgument", 39);
        JamlParser.typeArgument_return retval = new JamlParser.typeArgument_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal170=null;
        Token set171=null;
        JamlParser.type_return type169 = null;

        JamlParser.type_return type172 = null;


        CommonTree char_literal170_tree=null;
        CommonTree set171_tree=null;

        try {
            // ../etc/Jaml.g:357:5: ( type | '?' ( ( 'extends' | 'super' ) type )? )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==IDENTIFIER||(LA61_0>=82 && LA61_0<=89)) ) {
                alt61=1;
            }
            else if ( (LA61_0==52) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../etc/Jaml.g:357:9: type
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_type_in_typeArgument2484);
                    type169=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, type169.getTree());

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:358:9: '?' ( ( 'extends' | 'super' ) type )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal170=(Token)match(input,52,FOLLOW_52_in_typeArgument2494); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal170_tree = (CommonTree)adaptor.create(char_literal170);
                    adaptor.addChild(root_0, char_literal170_tree);
                    }
                    // ../etc/Jaml.g:359:9: ( ( 'extends' | 'super' ) type )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==80||LA60_0==90) ) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // ../etc/Jaml.g:360:13: ( 'extends' | 'super' ) type
                            {
                            set171=(Token)input.LT(1);
                            if ( input.LA(1)==80||input.LA(1)==90 ) {
                                input.consume();
                                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set171));
                                state.errorRecovery=false;state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return retval;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                throw mse;
                            }

                            pushFollow(FOLLOW_type_in_typeArgument2562);
                            type172=type();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, type172.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("typeArgument", 39);
        }
        return retval;
    }
    // $ANTLR end "typeArgument"

    public static class typeList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typeList"
    // ../etc/Jaml.g:367:1: typeList : type ( ',' type )* ;
    public final JamlParser.typeList_return typeList() throws RecognitionException {
    traceIn("typeList", 40);
        JamlParser.typeList_return retval = new JamlParser.typeList_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal174=null;
        JamlParser.type_return type173 = null;

        JamlParser.type_return type175 = null;


        CommonTree char_literal174_tree=null;

        try {
            // ../etc/Jaml.g:368:5: ( type ( ',' type )* )
            // ../etc/Jaml.g:368:9: type ( ',' type )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_type_in_typeList2597);
            type173=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type173.getTree());
            // ../etc/Jaml.g:369:9: ( ',' type )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==51) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../etc/Jaml.g:369:10: ',' type
            	    {
            	    char_literal174=(Token)match(input,51,FOLLOW_51_in_typeList2608); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    char_literal174_tree = (CommonTree)adaptor.create(char_literal174);
            	    adaptor.addChild(root_0, char_literal174_tree);
            	    }
            	    pushFollow(FOLLOW_type_in_typeList2610);
            	    type175=type();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, type175.getTree());

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("typeList", 40);
        }
        return retval;
    }
    // $ANTLR end "typeList"

    public static class variableInitializer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableInitializer"
    // ../etc/Jaml.g:375:1: variableInitializer : ( arrayInitializer | expression );
    public final JamlParser.variableInitializer_return variableInitializer() throws RecognitionException {
    traceIn("variableInitializer", 41);
        JamlParser.variableInitializer_return retval = new JamlParser.variableInitializer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.arrayInitializer_return arrayInitializer176 = null;

        JamlParser.expression_return expression177 = null;



        try {
            // ../etc/Jaml.g:376:5: ( arrayInitializer | expression )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==91) ) {
                alt63=1;
            }
            else if ( ((LA63_0>=IDENTIFIER && LA63_0<=NULL)||(LA63_0>=64 && LA63_0<=65)||(LA63_0>=69 && LA63_0<=73)||(LA63_0>=81 && LA63_0<=89)) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../etc/Jaml.g:376:9: arrayInitializer
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_arrayInitializer_in_variableInitializer2647);
                    arrayInitializer176=arrayInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayInitializer176.getTree());

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:377:9: expression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_expression_in_variableInitializer2657);
                    expression177=expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expression177.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("variableInitializer", 41);
        }
        return retval;
    }
    // $ANTLR end "variableInitializer"

    public static class arrayInitializer_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arrayInitializer"
    // ../etc/Jaml.g:380:1: arrayInitializer : '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}' ;
    public final JamlParser.arrayInitializer_return arrayInitializer() throws RecognitionException {
    traceIn("arrayInitializer", 42);
        JamlParser.arrayInitializer_return retval = new JamlParser.arrayInitializer_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal178=null;
        Token char_literal180=null;
        Token char_literal182=null;
        Token char_literal183=null;
        JamlParser.variableInitializer_return variableInitializer179 = null;

        JamlParser.variableInitializer_return variableInitializer181 = null;


        CommonTree char_literal178_tree=null;
        CommonTree char_literal180_tree=null;
        CommonTree char_literal182_tree=null;
        CommonTree char_literal183_tree=null;

        try {
            // ../etc/Jaml.g:381:5: ( '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}' )
            // ../etc/Jaml.g:381:9: '{' ( variableInitializer ( ',' variableInitializer )* )? ( ',' )? '}'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal178=(Token)match(input,91,FOLLOW_91_in_arrayInitializer2677); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal178_tree = (CommonTree)adaptor.create(char_literal178);
            adaptor.addChild(root_0, char_literal178_tree);
            }
            // ../etc/Jaml.g:382:13: ( variableInitializer ( ',' variableInitializer )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=IDENTIFIER && LA65_0<=NULL)||(LA65_0>=64 && LA65_0<=65)||(LA65_0>=69 && LA65_0<=73)||(LA65_0>=81 && LA65_0<=89)||LA65_0==91) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../etc/Jaml.g:382:14: variableInitializer ( ',' variableInitializer )*
                    {
                    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer2693);
                    variableInitializer179=variableInitializer();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer179.getTree());
                    // ../etc/Jaml.g:383:17: ( ',' variableInitializer )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==51) ) {
                            int LA64_1 = input.LA(2);

                            if ( ((LA64_1>=IDENTIFIER && LA64_1<=NULL)||(LA64_1>=64 && LA64_1<=65)||(LA64_1>=69 && LA64_1<=73)||(LA64_1>=81 && LA64_1<=89)||LA64_1==91) ) {
                                alt64=1;
                            }


                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../etc/Jaml.g:383:18: ',' variableInitializer
                    	    {
                    	    char_literal180=(Token)match(input,51,FOLLOW_51_in_arrayInitializer2712); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    char_literal180_tree = (CommonTree)adaptor.create(char_literal180);
                    	    adaptor.addChild(root_0, char_literal180_tree);
                    	    }
                    	    pushFollow(FOLLOW_variableInitializer_in_arrayInitializer2714);
                    	    variableInitializer181=variableInitializer();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, variableInitializer181.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../etc/Jaml.g:386:13: ( ',' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==51) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../etc/Jaml.g:386:14: ','
                    {
                    char_literal182=(Token)match(input,51,FOLLOW_51_in_arrayInitializer2764); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    char_literal182_tree = (CommonTree)adaptor.create(char_literal182);
                    adaptor.addChild(root_0, char_literal182_tree);
                    }

                    }
                    break;

            }

            char_literal183=(Token)match(input,92,FOLLOW_92_in_arrayInitializer2777); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal183_tree = (CommonTree)adaptor.create(char_literal183);
            adaptor.addChild(root_0, char_literal183_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("arrayInitializer", 42);
        }
        return retval;
    }
    // $ANTLR end "arrayInitializer"

    public static class createdName_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "createdName"
    // ../etc/Jaml.g:391:1: createdName : ( classOrInterfaceType | primitiveType );
    public final JamlParser.createdName_return createdName() throws RecognitionException {
    traceIn("createdName", 43);
        JamlParser.createdName_return retval = new JamlParser.createdName_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.classOrInterfaceType_return classOrInterfaceType184 = null;

        JamlParser.primitiveType_return primitiveType185 = null;



        try {
            // ../etc/Jaml.g:392:5: ( classOrInterfaceType | primitiveType )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==IDENTIFIER) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=82 && LA67_0<=89)) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../etc/Jaml.g:392:9: classOrInterfaceType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_classOrInterfaceType_in_createdName2811);
                    classOrInterfaceType184=classOrInterfaceType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, classOrInterfaceType184.getTree());

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:393:9: primitiveType
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_primitiveType_in_createdName2821);
                    primitiveType185=primitiveType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primitiveType185.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("createdName", 43);
        }
        return retval;
    }
    // $ANTLR end "createdName"

    public static class classCreatorRest_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classCreatorRest"
    // ../etc/Jaml.g:407:1: classCreatorRest : arguments ;
    public final JamlParser.classCreatorRest_return classCreatorRest() throws RecognitionException {
    traceIn("classCreatorRest", 44);
        JamlParser.classCreatorRest_return retval = new JamlParser.classCreatorRest_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.arguments_return arguments186 = null;



        try {
            // ../etc/Jaml.g:408:5: ( arguments )
            // ../etc/Jaml.g:408:9: arguments
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_arguments_in_classCreatorRest2845);
            arguments186=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments186.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("classCreatorRest", 44);
        }
        return retval;
    }
    // $ANTLR end "classCreatorRest"

    public static class nonWildcardTypeArguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "nonWildcardTypeArguments"
    // ../etc/Jaml.g:415:1: nonWildcardTypeArguments : '<' typeList '>' ;
    public final JamlParser.nonWildcardTypeArguments_return nonWildcardTypeArguments() throws RecognitionException {
    traceIn("nonWildcardTypeArguments", 45);
        JamlParser.nonWildcardTypeArguments_return retval = new JamlParser.nonWildcardTypeArguments_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal187=null;
        Token char_literal189=null;
        JamlParser.typeList_return typeList188 = null;


        CommonTree char_literal187_tree=null;
        CommonTree char_literal189_tree=null;

        try {
            // ../etc/Jaml.g:416:5: ( '<' typeList '>' )
            // ../etc/Jaml.g:416:9: '<' typeList '>'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal187=(Token)match(input,61,FOLLOW_61_in_nonWildcardTypeArguments2893); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal187_tree = (CommonTree)adaptor.create(char_literal187);
            adaptor.addChild(root_0, char_literal187_tree);
            }
            pushFollow(FOLLOW_typeList_in_nonWildcardTypeArguments2895);
            typeList188=typeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, typeList188.getTree());
            char_literal189=(Token)match(input,63,FOLLOW_63_in_nonWildcardTypeArguments2905); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal189_tree = (CommonTree)adaptor.create(char_literal189);
            adaptor.addChild(root_0, char_literal189_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("nonWildcardTypeArguments", 45);
        }
        return retval;
    }
    // $ANTLR end "nonWildcardTypeArguments"

    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
    // ../etc/Jaml.g:420:1: arguments : '(' ( expressionList )? ')' ;
    public final JamlParser.arguments_return arguments() throws RecognitionException {
    traceIn("arguments", 46);
        JamlParser.arguments_return retval = new JamlParser.arguments_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal190=null;
        Token char_literal192=null;
        JamlParser.expressionList_return expressionList191 = null;


        CommonTree char_literal190_tree=null;
        CommonTree char_literal192_tree=null;

        try {
            // ../etc/Jaml.g:421:5: ( '(' ( expressionList )? ')' )
            // ../etc/Jaml.g:421:9: '(' ( expressionList )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal190=(Token)match(input,73,FOLLOW_73_in_arguments2925); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal190_tree = (CommonTree)adaptor.create(char_literal190);
            adaptor.addChild(root_0, char_literal190_tree);
            }
            // ../etc/Jaml.g:421:13: ( expressionList )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=IDENTIFIER && LA68_0<=NULL)||(LA68_0>=64 && LA68_0<=65)||(LA68_0>=69 && LA68_0<=73)||(LA68_0>=81 && LA68_0<=89)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../etc/Jaml.g:421:14: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments2928);
                    expressionList191=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList191.getTree());

                    }
                    break;

            }

            char_literal192=(Token)match(input,74,FOLLOW_74_in_arguments2941); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal192_tree = (CommonTree)adaptor.create(char_literal192);
            adaptor.addChild(root_0, char_literal192_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("arguments", 46);
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class parExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parExpression"
    // ../etc/Jaml.g:425:1: parExpression : '(' expression ')' ;
    public final JamlParser.parExpression_return parExpression() throws RecognitionException {
    traceIn("parExpression", 47);
        JamlParser.parExpression_return retval = new JamlParser.parExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal193=null;
        Token char_literal195=null;
        JamlParser.expression_return expression194 = null;


        CommonTree char_literal193_tree=null;
        CommonTree char_literal195_tree=null;

        try {
            // ../etc/Jaml.g:426:5: ( '(' expression ')' )
            // ../etc/Jaml.g:426:9: '(' expression ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal193=(Token)match(input,73,FOLLOW_73_in_parExpression2965); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal193_tree = (CommonTree)adaptor.create(char_literal193);
            adaptor.addChild(root_0, char_literal193_tree);
            }
            pushFollow(FOLLOW_expression_in_parExpression2967);
            expression194=expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression194.getTree());
            char_literal195=(Token)match(input,74,FOLLOW_74_in_parExpression2969); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            char_literal195_tree = (CommonTree)adaptor.create(char_literal195);
            adaptor.addChild(root_0, char_literal195_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("parExpression", 47);
        }
        return retval;
    }
    // $ANTLR end "parExpression"

    public static class literal_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // ../etc/Jaml.g:429:1: literal returns [String value] : (lit= STRINGLITERAL | lit= INTLITERAL | lit= LONGLITERAL | lit= CHARLITERAL | lit= FLOATLITERAL | lit= DOUBLELITERAL | TRUE | FALSE | NULL );
    public final JamlParser.literal_return literal() throws RecognitionException {
    traceIn("literal", 48);
        JamlParser.literal_return retval = new JamlParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lit=null;
        Token TRUE196=null;
        Token FALSE197=null;
        Token NULL198=null;

        CommonTree lit_tree=null;
        CommonTree TRUE196_tree=null;
        CommonTree FALSE197_tree=null;
        CommonTree NULL198_tree=null;

        try {
            // ../etc/Jaml.g:429:31: (lit= STRINGLITERAL | lit= INTLITERAL | lit= LONGLITERAL | lit= CHARLITERAL | lit= FLOATLITERAL | lit= DOUBLELITERAL | TRUE | FALSE | NULL )
            int alt69=9;
            switch ( input.LA(1) ) {
            case STRINGLITERAL:
                {
                alt69=1;
                }
                break;
            case INTLITERAL:
                {
                alt69=2;
                }
                break;
            case LONGLITERAL:
                {
                alt69=3;
                }
                break;
            case CHARLITERAL:
                {
                alt69=4;
                }
                break;
            case FLOATLITERAL:
                {
                alt69=5;
                }
                break;
            case DOUBLELITERAL:
                {
                alt69=6;
                }
                break;
            case TRUE:
                {
                alt69=7;
                }
                break;
            case FALSE:
                {
                alt69=8;
                }
                break;
            case NULL:
                {
                alt69=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../etc/Jaml.g:431:3: lit= STRINGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,STRINGLITERAL,FOLLOW_STRINGLITERAL_in_literal2991); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = Util.parseStringLiteral((lit!=null?lit.getText():null));
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:432:3: lit= INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal3001); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = Util.parseIntegerLiteral((lit!=null?lit.getText():null));
                    }

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:433:3: lit= LONGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal3011); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = Util.parseLongLiteral((lit!=null?lit.getText():null));
                    }

                    }
                    break;
                case 4 :
                    // ../etc/Jaml.g:434:3: lit= CHARLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal3021); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = Util.parseCharLiteral((lit!=null?lit.getText():null));
                    }

                    }
                    break;
                case 5 :
                    // ../etc/Jaml.g:435:3: lit= FLOATLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal3031); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = Util.parseFloatLiteral((lit!=null?lit.getText():null));
                    }

                    }
                    break;
                case 6 :
                    // ../etc/Jaml.g:436:3: lit= DOUBLELITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal3041); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = Util.parseDoubleLiteral((lit!=null?lit.getText():null));
                    }

                    }
                    break;
                case 7 :
                    // ../etc/Jaml.g:437:3: TRUE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TRUE196=(Token)match(input,TRUE,FOLLOW_TRUE_in_literal3049); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    TRUE196_tree = (CommonTree)adaptor.create(TRUE196);
                    adaptor.addChild(root_0, TRUE196_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = "null"
                    }

                    }
                    break;
                case 8 :
                    // ../etc/Jaml.g:438:3: FALSE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    FALSE197=(Token)match(input,FALSE,FOLLOW_FALSE_in_literal3057); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FALSE197_tree = (CommonTree)adaptor.create(FALSE197);
                    adaptor.addChild(root_0, FALSE197_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = "null"
                    }

                    }
                    break;
                case 9 :
                    // ../etc/Jaml.g:439:3: NULL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NULL198=(Token)match(input,NULL,FOLLOW_NULL_in_literal3065); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NULL198_tree = (CommonTree)adaptor.create(NULL198);
                    adaptor.addChild(root_0, NULL198_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = "null"
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("literal", 48);
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class idSpecifier_return extends ParserRuleReturnScope {
        public String id;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idSpecifier"
    // ../etc/Jaml.g:442:1: idSpecifier returns [String id] : POUND ID ;
    public final JamlParser.idSpecifier_return idSpecifier() throws RecognitionException {
    traceIn("idSpecifier", 49);
        JamlParser.idSpecifier_return retval = new JamlParser.idSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POUND199=null;
        Token ID200=null;

        CommonTree POUND199_tree=null;
        CommonTree ID200_tree=null;

        try {
            // ../etc/Jaml.g:442:32: ( POUND ID )
            // ../etc/Jaml.g:442:34: POUND ID
            {
            root_0 = (CommonTree)adaptor.nil();

            POUND199=(Token)match(input,POUND,FOLLOW_POUND_in_idSpecifier3081); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POUND199_tree = (CommonTree)adaptor.create(POUND199);
            adaptor.addChild(root_0, POUND199_tree);
            }
            ID200=(Token)match(input,ID,FOLLOW_ID_in_idSpecifier3083); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID200_tree = (CommonTree)adaptor.create(ID200);
            adaptor.addChild(root_0, ID200_tree);
            }
            if ( state.backtracking==0 ) {
              retval.id = (ID200!=null?ID200.getText():null);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("idSpecifier", 49);
        }
        return retval;
    }
    // $ANTLR end "idSpecifier"

    public static class classSpecifier_return extends ParserRuleReturnScope {
        public String klass;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classSpecifier"
    // ../etc/Jaml.g:444:1: classSpecifier returns [String klass] : DOT ID ;
    public final JamlParser.classSpecifier_return classSpecifier() throws RecognitionException {
    traceIn("classSpecifier", 50);
        JamlParser.classSpecifier_return retval = new JamlParser.classSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT201=null;
        Token ID202=null;

        CommonTree DOT201_tree=null;
        CommonTree ID202_tree=null;

        try {
            // ../etc/Jaml.g:444:38: ( DOT ID )
            // ../etc/Jaml.g:445:1: DOT ID
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT201=(Token)match(input,DOT,FOLLOW_DOT_in_classSpecifier3096); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT201_tree = (CommonTree)adaptor.create(DOT201);
            adaptor.addChild(root_0, DOT201_tree);
            }
            ID202=(Token)match(input,ID,FOLLOW_ID_in_classSpecifier3098); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID202_tree = (CommonTree)adaptor.create(ID202);
            adaptor.addChild(root_0, ID202_tree);
            }
            if ( state.backtracking==0 ) {
              retval.klass = (ID202!=null?ID202.getText():null);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("classSpecifier", 50);
        }
        return retval;
    }
    // $ANTLR end "classSpecifier"

    // $ANTLR start synpred1_Jaml
    public final void synpred1_Jaml_fragment() throws RecognitionException {   
        traceIn("synpred1_Jaml_fragment", 51);
        try {
            // ../etc/Jaml.g:253:15: ( type )
            // ../etc/Jaml.g:253:16: type
            {
            pushFollow(FOLLOW_type_in_synpred1_Jaml1594);
            type();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        finally {
            traceOut("synpred1_Jaml_fragment", 51);
        }}
    // $ANTLR end synpred1_Jaml

    // $ANTLR start synpred2_Jaml
    public final void synpred2_Jaml_fragment() throws RecognitionException {   
        traceIn("synpred2_Jaml_fragment", 52);
        try {
            // ../etc/Jaml.g:265:10: ( '.' IDENTIFIER )
            // ../etc/Jaml.g:265:11: '.' IDENTIFIER
            {
            match(input,75,FOLLOW_75_in_synpred2_Jaml1696); if (state.failed) return ;
            match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_synpred2_Jaml1698); if (state.failed) return ;

            }

        }
        finally {
            traceOut("synpred2_Jaml_fragment", 52);
        }}
    // $ANTLR end synpred2_Jaml

    // $ANTLR start synpred3_Jaml
    public final void synpred3_Jaml_fragment() throws RecognitionException {   
        traceIn("synpred3_Jaml_fragment", 53);
        try {
            // ../etc/Jaml.g:266:10: ( identifierSuffix )
            // ../etc/Jaml.g:266:11: identifierSuffix
            {
            pushFollow(FOLLOW_identifierSuffix_in_synpred3_Jaml1719);
            identifierSuffix();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        finally {
            traceOut("synpred3_Jaml_fragment", 53);
        }}
    // $ANTLR end synpred3_Jaml

    // $ANTLR start synpred4_Jaml
    public final void synpred4_Jaml_fragment() throws RecognitionException {   
        traceIn("synpred4_Jaml_fragment", 54);
        try {
            // ../etc/Jaml.g:288:9: ( '[' )
            // ../etc/Jaml.g:288:10: '['
            {
            match(input,76,FOLLOW_76_in_synpred4_Jaml1900); if (state.failed) return ;

            }

        }
        finally {
            traceOut("synpred4_Jaml_fragment", 54);
        }}
    // $ANTLR end synpred4_Jaml

    // $ANTLR start synpred5_Jaml
    public final void synpred5_Jaml_fragment() throws RecognitionException {   
        traceIn("synpred5_Jaml_fragment", 55);
        try {
            // ../etc/Jaml.g:315:10: ( '[' )
            // ../etc/Jaml.g:315:11: '['
            {
            match(input,76,FOLLOW_76_in_synpred5_Jaml2124); if (state.failed) return ;

            }

        }
        finally {
            traceOut("synpred5_Jaml_fragment", 55);
        }}
    // $ANTLR end synpred5_Jaml

    // Delegated rules

    public final boolean synpred3_Jaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Jaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Jaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Jaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Jaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Jaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Jaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Jaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Jaml() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Jaml_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA34 dfa34 = new DFA34(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA43 dfa43 = new DFA43(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA34_eotS =
        "\25\uffff";
    static final String DFA34_eofS =
        "\25\uffff";
    static final String DFA34_minS =
        "\1\16\2\0\22\uffff";
    static final String DFA34_maxS =
        "\1\131\2\0\22\uffff";
    static final String DFA34_acceptS =
        "\3\uffff\1\2\20\uffff\1\1";
    static final String DFA34_specialS =
        "\1\uffff\1\0\1\1\22\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\1\11\3\50\uffff\2\3\3\uffff\5\3\7\uffff\1\3\10\2",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "253:11: ( ( type )=> type ')' unaryExpression | expression ')' ( selector )* ( '++' | '--' )? )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA34_1 = input.LA(1);

                         
                        int index34_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Jaml()) ) {s = 20;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index34_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA34_2 = input.LA(1);

                         
                        int index34_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_Jaml()) ) {s = 20;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index34_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 34, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\30\uffff";
    static final String DFA36_eofS =
        "\30\uffff";
    static final String DFA36_minS =
        "\1\14\1\0\26\uffff";
    static final String DFA36_maxS =
        "\1\134\1\0\26\uffff";
    static final String DFA36_acceptS =
        "\2\uffff\1\1\1\2\24\uffff";
    static final String DFA36_specialS =
        "\1\0\1\1\26\uffff}>";
    static final String[] DFA36_transitionS = {
            "\2\3\44\uffff\14\3\1\uffff\10\3\2\uffff\1\2\2\3\1\1\1\3\16\uffff"+
            "\1\3",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "266:9: ( ( identifierSuffix )=> identifierSuffix )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0==76) ) {s = 1;}

                        else if ( (LA36_0==73) && (synpred3_Jaml())) {s = 2;}

                        else if ( ((LA36_0>=COMMA && LA36_0<=RBRACE)||(LA36_0>=50 && LA36_0<=61)||(LA36_0>=63 && LA36_0<=70)||(LA36_0>=74 && LA36_0<=75)||LA36_0==77||LA36_0==92) ) {s = 3;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_1 = input.LA(1);

                         
                        int index36_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred3_Jaml()) ) {s = 2;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index36_1);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA43_eotS =
        "\31\uffff";
    static final String DFA43_eofS =
        "\1\1\30\uffff";
    static final String DFA43_minS =
        "\1\14\1\uffff\1\0\26\uffff";
    static final String DFA43_maxS =
        "\1\134\1\uffff\1\0\26\uffff";
    static final String DFA43_acceptS =
        "\1\uffff\1\2\26\uffff\1\1";
    static final String DFA43_specialS =
        "\2\uffff\1\0\26\uffff}>";
    static final String[] DFA43_transitionS = {
            "\2\1\44\uffff\14\1\1\uffff\10\1\3\uffff\2\1\1\2\1\1\16\uffff"+
            "\1\1",
            "",
            "\1\uffff",
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
            ""
    };

    static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
    static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
    static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
    static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
    static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
    static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
    static final short[][] DFA43_transition;

    static {
        int numStates = DFA43_transitionS.length;
        DFA43_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
        }
    }

    class DFA43 extends DFA {

        public DFA43(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 43;
            this.eot = DFA43_eot;
            this.eof = DFA43_eof;
            this.min = DFA43_min;
            this.max = DFA43_max;
            this.accept = DFA43_accept;
            this.special = DFA43_special;
            this.transition = DFA43_transition;
        }
        public String getDescription() {
            return "()+ loopback of 288:8: ( ( '[' )=> '[' ( expression )? ']' )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA43_2 = input.LA(1);

                         
                        int index43_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_Jaml()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index43_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 43, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA51_eotS =
        "\31\uffff";
    static final String DFA51_eofS =
        "\31\uffff";
    static final String DFA51_minS =
        "\1\14\2\uffff\1\0\25\uffff";
    static final String DFA51_maxS =
        "\1\134\2\uffff\1\0\25\uffff";
    static final String DFA51_acceptS =
        "\1\uffff\1\2\26\uffff\1\1";
    static final String DFA51_specialS =
        "\3\uffff\1\0\25\uffff}>";
    static final String[] DFA51_transitionS = {
            "\2\1\44\uffff\14\1\1\uffff\10\1\3\uffff\2\1\1\3\1\1\15\uffff"+
            "\2\1",
            "",
            "",
            "\1\uffff",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "()+ loopback of 315:9: ( ( '[' )=> '[' ( expression )? ']' )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA51_3 = input.LA(1);

                         
                        int index51_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_Jaml()) ) {s = 24;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index51_3);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 51, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_line_in_prog100 = new BitSet(new long[]{0x00000000030002C2L});
    public static final BitSet FOLLOW_elementDeclaration_in_element124 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_TEXT_in_element132 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_element134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_element146 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_content_in_element149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_element162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_element164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_line193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_line201 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_line205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_line211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divAttrs_in_elementDeclaration236 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrs_in_elementDeclaration263 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_content298 = new BitSet(new long[]{0x0000000003000280L});
    public static final BitSet FOLLOW_element_in_content305 = new BitSet(new long[]{0x00000000030002A0L});
    public static final BitSet FOLLOW_TEXT_in_content311 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_content313 = new BitSet(new long[]{0x00000000030002A0L});
    public static final BitSet FOLLOW_DEDENT_in_content319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_attrs339 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_attrs341 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_idSpecifier_in_attrs346 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_classSpecifier_in_attrs353 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_idSpecifier_in_divAttrs374 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_classSpecifier_in_divAttrs381 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_LBRACE_in_attrHash403 = new BitSet(new long[]{0x0000000000FFA000L});
    public static final BitSet FOLLOW_attrMapping_in_attrHash411 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_attrHash427 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_attrMapping_in_attrHash431 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_RBRACE_in_attrHash441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_attrMapping456 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_attrMapping460 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_expression_in_attrMapping465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expression480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList504 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_expressionList515 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_expression_in_expressionList517 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression548 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_52_in_conditionalExpression559 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_expression_in_conditionalExpression561 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_conditionalExpression563 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression596 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_conditionalOrExpression607 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression609 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression640 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_conditionalAndExpression651 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_inclusiveOrExpression_in_conditionalAndExpression653 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression684 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_inclusiveOrExpression695 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_exclusiveOrExpression_in_inclusiveOrExpression697 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression728 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_56_in_exclusiveOrExpression739 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_andExpression_in_exclusiveOrExpression741 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression772 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_andExpression783 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_equalityExpression_in_andExpression785 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression820 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_set_in_equalityExpression847 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_instanceOfExpression_in_equalityExpression897 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_relationalExpression_in_instanceOfExpression932 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_instanceOfExpression943 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_type_in_instanceOfExpression945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression976 = new BitSet(new long[]{0xA000000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpression987 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_shiftExpression_in_relationalExpression989 = new BitSet(new long[]{0xA000000000000002L});
    public static final BitSet FOLLOW_61_in_relationalOp1021 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_relationalOp1023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_relationalOp1034 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_relationalOp1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_relationalOp1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_relationalOp1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1076 = new BitSet(new long[]{0xA000000000000002L});
    public static final BitSet FOLLOW_shiftOp_in_shiftExpression1087 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_additiveExpression_in_shiftExpression1089 = new BitSet(new long[]{0xA000000000000002L});
    public static final BitSet FOLLOW_61_in_shiftOp1122 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_shiftOp1124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_shiftOp1135 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_shiftOp1137 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_shiftOp1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_shiftOp1150 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_shiftOp1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1173 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_set_in_additiveExpression1200 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression1250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1288 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_set_in_multiplicativeExpression1315 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression1383 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_64_in_unaryExpression1416 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_unaryExpression1429 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_unaryExpression1441 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_unaryExpression1453 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_unaryExpressionNotPlusMinus1485 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_unaryExpressionNotPlusMinus1497 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpressionNotPlusMinus1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_castExpressionOrPrimaryParExpression_in_unaryExpressionNotPlusMinus1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primaryNonParExpression_in_unaryExpressionNotPlusMinus1519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001860L});
    public static final BitSet FOLLOW_selector_in_unaryExpressionNotPlusMinus1530 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001860L});
    public static final BitSet FOLLOW_set_in_unaryExpressionNotPlusMinus1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_castExpressionOrPrimaryParExpression1576 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_type_in_castExpressionOrPrimaryParExpression1598 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_castExpressionOrPrimaryParExpression1600 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_unaryExpression_in_castExpressionOrPrimaryParExpression1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_castExpressionOrPrimaryParExpression1622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_castExpressionOrPrimaryParExpression1624 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001860L});
    public static final BitSet FOLLOW_selector_in_castExpressionOrPrimaryParExpression1627 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001860L});
    public static final BitSet FOLLOW_set_in_castExpressionOrPrimaryParExpression1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primaryNonParExpression1684 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001A00L});
    public static final BitSet FOLLOW_75_in_primaryNonParExpression1702 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_primaryNonParExpression1704 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001A00L});
    public static final BitSet FOLLOW_identifierSuffix_in_primaryNonParExpression1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primaryNonParExpression1735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_creator_in_primaryNonParExpression1745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_primaryNonParExpression1755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_76_in_primaryNonParExpression1766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_primaryNonParExpression1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_primaryNonParExpression1789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_primaryNonParExpression1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_superSuffix1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_superSuffix1832 = new BitSet(new long[]{0x2000000000004000L});
    public static final BitSet FOLLOW_typeArguments_in_superSuffix1835 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_superSuffix1856 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001200L});
    public static final BitSet FOLLOW_arguments_in_superSuffix1867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_identifierSuffix1904 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE23E3L});
    public static final BitSet FOLLOW_expression_in_identifierSuffix1906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_identifierSuffix1909 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_identifierSuffix1914 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_identifierSuffix1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_identifierSuffix1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_selector1967 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_selector1969 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001200L});
    public static final BitSet FOLLOW_arguments_in_selector1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_selector2001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_selector2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_selector2013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_selector2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001A00L});
    public static final BitSet FOLLOW_superSuffix_in_selector2025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_selector2040 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_expression_in_selector2042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_selector2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_creator2064 = new BitSet(new long[]{0x2000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_nonWildcardTypeArguments_in_creator2075 = new BitSet(new long[]{0x2000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_createdName_in_creator2087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_classCreatorRest_in_creator2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayCreatorRest_in_creator2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_arrayCreatorRest2128 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE23E3L});
    public static final BitSet FOLLOW_expression_in_arrayCreatorRest2130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_arrayCreatorRest2133 = new BitSet(new long[]{0x0000000000000002L,0x0000000008001000L});
    public static final BitSet FOLLOW_arrayInitializer_in_arrayCreatorRest2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_type2161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_type2172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_type2174 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_primitiveType_in_type2195 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_type2206 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_type2208 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterfaceType2240 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2251 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_classOrInterfaceType2273 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_classOrInterfaceType2275 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_typeArguments_in_classOrInterfaceType2290 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_set_in_primitiveType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_typeArguments2427 = new BitSet(new long[]{0x0010000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments2429 = new BitSet(new long[]{0x8008000000000000L});
    public static final BitSet FOLLOW_51_in_typeArguments2440 = new BitSet(new long[]{0x0010000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_typeArgument_in_typeArguments2442 = new BitSet(new long[]{0x8008000000000000L});
    public static final BitSet FOLLOW_63_in_typeArguments2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeArgument2484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_typeArgument2494 = new BitSet(new long[]{0x0000000000000002L,0x0000000004010000L});
    public static final BitSet FOLLOW_set_in_typeArgument2518 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_type_in_typeArgument2562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_typeList2597 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_51_in_typeList2608 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_type_in_typeList2610 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_variableInitializer2647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_variableInitializer2657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_arrayInitializer2677 = new BitSet(new long[]{0x0008000000FFC000L,0x000000001BFE03E3L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer2693 = new BitSet(new long[]{0x0008000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_51_in_arrayInitializer2712 = new BitSet(new long[]{0x0000000000FFC000L,0x000000000BFE03E3L});
    public static final BitSet FOLLOW_variableInitializer_in_arrayInitializer2714 = new BitSet(new long[]{0x0008000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_51_in_arrayInitializer2764 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_arrayInitializer2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_classOrInterfaceType_in_createdName2811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primitiveType_in_createdName2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arguments_in_classCreatorRest2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_nonWildcardTypeArguments2893 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_typeList_in_nonWildcardTypeArguments2895 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_nonWildcardTypeArguments2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_arguments2925 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE07E3L});
    public static final BitSet FOLLOW_expressionList_in_arguments2928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_arguments2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_parExpression2965 = new BitSet(new long[]{0x0000000000FFC000L,0x0000000003FE03E3L});
    public static final BitSet FOLLOW_expression_in_parExpression2967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_parExpression2969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRINGLITERAL_in_literal2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal3001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal3011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_literal3049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_literal3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_literal3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_idSpecifier3081 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idSpecifier3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_classSpecifier3096 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classSpecifier3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred1_Jaml1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_synpred2_Jaml1696 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_IDENTIFIER_in_synpred2_Jaml1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierSuffix_in_synpred3_Jaml1719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred4_Jaml1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred5_Jaml2124 = new BitSet(new long[]{0x0000000000000002L});

}