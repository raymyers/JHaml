// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-26 12:33:13

package com.cadrlife.jaml;
import java.util.LinkedHashMap;
import java.util.Map;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class JamlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INDENT", "DEDENT", "NEWLINE", "TEXT", "FORWARD_SLASH", "PERCENT", "ID", "BEGIN_HASH", "COMMA", "END_HASH", "StringLiteral", "INTLITERAL", "LONGLITERAL", "CHARLITERAL", "FLOATLITERAL", "DOUBLELITERAL", "POUND", "DOT", "Spaces", "WS", "NL", "IGNORED_NEWLINE", "CHANGE_INDENT", "SpacesQ", "EscapeSequence", "IntegerNumber", "LongSuffix", "HexPrefix", "HexDigit", "Exponent", "NonIntegerNumber", "FloatSuffix", "DoubleSuffix", "UnicodeEscape", "OctalEscape", "':'", "'='", "'>'"
    };
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int IGNORED_NEWLINE=25;
    public static final int PERCENT=9;
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
    public static final int LongSuffix=30;
    public static final int LONGLITERAL=16;
    public static final int StringLiteral=14;
    public static final int WS=23;
    public static final int NEWLINE=6;
    public static final int DoubleSuffix=36;
    public static final int COMMA=12;
    public static final int T__39=39;
    public static final int UnicodeEscape=37;
    public static final int Spaces=22;
    public static final int FloatSuffix=35;
    public static final int NonIntegerNumber=34;
    public static final int CHARLITERAL=17;
    public static final int NL=24;
    public static final int DOT=21;
    public static final int FLOATLITERAL=18;
    public static final int OctalEscape=38;
    public static final int EscapeSequence=28;
    public static final int FORWARD_SLASH=8;
    public static final int HexPrefix=31;

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
    // ../etc/Jaml.g:52:1: prog returns [String rendering] : ( line )* ;
    public final JamlParser.prog_return prog() throws RecognitionException {
    traceIn("prog", 1);
        JamlParser.prog_return retval = new JamlParser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.line_return line1 = null;



        retval.rendering = "";
        try {
            // ../etc/Jaml.g:52:57: ( ( line )* )
            // ../etc/Jaml.g:53:3: ( line )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:53:3: ( line )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=NEWLINE && LA1_0<=TEXT)||LA1_0==PERCENT||(LA1_0>=POUND && LA1_0<=DOT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../etc/Jaml.g:53:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_prog98);
            	    line1=line();

            	    state._fsp--;

            	    adaptor.addChild(root_0, line1.getTree());
            	    retval.rendering += (line1!=null?line1.rendering:null);
            	    retval.rendering += "\n";

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // ../etc/Jaml.g:55:1: element returns [String rendering] : elementDeclaration ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) ;
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
            // ../etc/Jaml.g:55:91: ( elementDeclaration ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) )
            // ../etc/Jaml.g:56:3: elementDeclaration ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elementDeclaration_in_element122);
            elementDeclaration2=elementDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, elementDeclaration2.getTree());
            // ../etc/Jaml.g:57:4: ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../etc/Jaml.g:57:6: TEXT NEWLINE
                    {
                    TEXT3=(Token)match(input,TEXT,FOLLOW_TEXT_in_element130); 
                    TEXT3_tree = (CommonTree)adaptor.create(TEXT3);
                    adaptor.addChild(root_0, TEXT3_tree);

                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element132); 
                    NEWLINE4_tree = (CommonTree)adaptor.create(NEWLINE4);
                    adaptor.addChild(root_0, NEWLINE4_tree);

                    content = (TEXT3!=null?TEXT3.getText():null);

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:58:6: NEWLINE ( content )?
                    {
                    NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element144); 
                    NEWLINE5_tree = (CommonTree)adaptor.create(NEWLINE5);
                    adaptor.addChild(root_0, NEWLINE5_tree);

                    // ../etc/Jaml.g:58:14: ( content )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==INDENT) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../etc/Jaml.g:58:15: content
                            {
                            pushFollow(FOLLOW_content_in_element147);
                            content6=content();

                            state._fsp--;

                            adaptor.addChild(root_0, content6.getTree());
                            content = (content6!=null?content6.rendering:null);

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:59:6: FORWARD_SLASH NEWLINE
                    {
                    FORWARD_SLASH7=(Token)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_element160); 
                    FORWARD_SLASH7_tree = (CommonTree)adaptor.create(FORWARD_SLASH7);
                    adaptor.addChild(root_0, FORWARD_SLASH7_tree);

                    NEWLINE8=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element162); 
                    NEWLINE8_tree = (CommonTree)adaptor.create(NEWLINE8);
                    adaptor.addChild(root_0, NEWLINE8_tree);

                    selfClosing = true;

                    }
                    break;

            }

            retval.rendering = Util.elem((elementDeclaration2!=null?elementDeclaration2.type:null), (elementDeclaration2!=null?elementDeclaration2.attrMap:null), content, selfClosing);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // ../etc/Jaml.g:63:1: line returns [String rendering] : ( element | TEXT NEWLINE | NEWLINE );
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
            // ../etc/Jaml.g:63:60: ( element | TEXT NEWLINE | NEWLINE )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../etc/Jaml.g:64:3: element
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_element_in_line191);
                    element9=element();

                    state._fsp--;

                    adaptor.addChild(root_0, element9.getTree());
                    retval.rendering = (element9!=null?element9.rendering:null);

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:65:5: TEXT NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TEXT10=(Token)match(input,TEXT,FOLLOW_TEXT_in_line199); 
                    TEXT10_tree = (CommonTree)adaptor.create(TEXT10);
                    adaptor.addChild(root_0, TEXT10_tree);

                    retval.rendering = (TEXT10!=null?TEXT10.getText():null);
                    NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_line203); 
                    NEWLINE11_tree = (CommonTree)adaptor.create(NEWLINE11);
                    adaptor.addChild(root_0, NEWLINE11_tree);


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:66:5: NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_line209); 
                    NEWLINE12_tree = (CommonTree)adaptor.create(NEWLINE12);
                    adaptor.addChild(root_0, NEWLINE12_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // ../etc/Jaml.g:69:1: elementDeclaration returns [String type, Map<String,String> attrMap] : ( ( (a1= divAttrs ) ( attrHash )? ) | ( (a2= attrs ) ( attrHash )? ) );
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
            // ../etc/Jaml.g:69:124: ( ( (a1= divAttrs ) ( attrHash )? ) | ( (a2= attrs ) ( attrHash )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=POUND && LA7_0<=DOT)) ) {
                alt7=1;
            }
            else if ( (LA7_0==PERCENT) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../etc/Jaml.g:70:3: ( (a1= divAttrs ) ( attrHash )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:70:3: ( (a1= divAttrs ) ( attrHash )? )
                    // ../etc/Jaml.g:70:4: (a1= divAttrs ) ( attrHash )?
                    {
                    // ../etc/Jaml.g:70:4: (a1= divAttrs )
                    // ../etc/Jaml.g:70:5: a1= divAttrs
                    {
                    pushFollow(FOLLOW_divAttrs_in_elementDeclaration234);
                    a1=divAttrs();

                    state._fsp--;

                    adaptor.addChild(root_0, a1.getTree());
                    retval.attrMap.putAll((a1!=null?a1.attrMap:null)); retval.type = "div";

                    }

                    // ../etc/Jaml.g:71:4: ( attrHash )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==BEGIN_HASH) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../etc/Jaml.g:71:5: attrHash
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration243);
                            attrHash13=attrHash();

                            state._fsp--;

                            adaptor.addChild(root_0, attrHash13.getTree());
                            retval.attrMap.putAll((attrHash13!=null?attrHash13.attrMap:null));

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:73:2: ( (a2= attrs ) ( attrHash )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:73:2: ( (a2= attrs ) ( attrHash )? )
                    // ../etc/Jaml.g:74:3: (a2= attrs ) ( attrHash )?
                    {
                    // ../etc/Jaml.g:74:3: (a2= attrs )
                    // ../etc/Jaml.g:74:4: a2= attrs
                    {
                    pushFollow(FOLLOW_attrs_in_elementDeclaration261);
                    a2=attrs();

                    state._fsp--;

                    adaptor.addChild(root_0, a2.getTree());
                    retval.attrMap.putAll((a2!=null?a2.attrMap:null)); retval.type = (a2!=null?a2.type:null);

                    }

                    // ../etc/Jaml.g:75:3: ( attrHash )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==BEGIN_HASH) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../etc/Jaml.g:75:4: attrHash
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration270);
                            attrHash14=attrHash();

                            state._fsp--;

                            adaptor.addChild(root_0, attrHash14.getTree());
                            retval.attrMap.putAll((attrHash14!=null?attrHash14.attrMap:null));

                            }
                            break;

                    }


                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // ../etc/Jaml.g:78:1: content returns [String rendering] : INDENT (e1= element | TEXT NEWLINE )+ DEDENT ;
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
            // ../etc/Jaml.g:78:63: ( INDENT (e1= element | TEXT NEWLINE )+ DEDENT )
            // ../etc/Jaml.g:79:1: INDENT (e1= element | TEXT NEWLINE )+ DEDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            INDENT15=(Token)match(input,INDENT,FOLLOW_INDENT_in_content296); 
            INDENT15_tree = (CommonTree)adaptor.create(INDENT15);
            adaptor.addChild(root_0, INDENT15_tree);

            // ../etc/Jaml.g:80:2: (e1= element | TEXT NEWLINE )+
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
            	    // ../etc/Jaml.g:80:3: e1= element
            	    {
            	    pushFollow(FOLLOW_element_in_content303);
            	    e1=element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e1.getTree());
            	    retval.rendering += (e1!=null?e1.rendering:null) + "\n";

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:80:54: TEXT NEWLINE
            	    {
            	    TEXT16=(Token)match(input,TEXT,FOLLOW_TEXT_in_content309); 
            	    TEXT16_tree = (CommonTree)adaptor.create(TEXT16);
            	    adaptor.addChild(root_0, TEXT16_tree);

            	    NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_content311); 
            	    NEWLINE17_tree = (CommonTree)adaptor.create(NEWLINE17);
            	    adaptor.addChild(root_0, NEWLINE17_tree);

            	    retval.rendering += (TEXT16!=null?TEXT16.getText():null) + "\n";

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

            DEDENT18=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_content317); 
            DEDENT18_tree = (CommonTree)adaptor.create(DEDENT18);
            adaptor.addChild(root_0, DEDENT18_tree);

            retval.rendering = "\n" + Util.indent(Util.stripTrailingNewline(retval.rendering)) + "\n";

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // ../etc/Jaml.g:86:1: attrs returns [Map<String,String> attrMap, String type] : PERCENT ID ( idSpecifier | classSpecifier )* ;
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
            // ../etc/Jaml.g:86:111: ( PERCENT ID ( idSpecifier | classSpecifier )* )
            // ../etc/Jaml.g:87:1: PERCENT ID ( idSpecifier | classSpecifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            PERCENT19=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_attrs337); 
            PERCENT19_tree = (CommonTree)adaptor.create(PERCENT19);
            adaptor.addChild(root_0, PERCENT19_tree);

            ID20=(Token)match(input,ID,FOLLOW_ID_in_attrs339); 
            ID20_tree = (CommonTree)adaptor.create(ID20);
            adaptor.addChild(root_0, ID20_tree);

            retval.type = (ID20!=null?ID20.getText():null);
            // ../etc/Jaml.g:88:1: ( idSpecifier | classSpecifier )*
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
            	    // ../etc/Jaml.g:88:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_attrs344);
            	    idSpecifier21=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier21.getTree());
            	    retval.attrMap.put("id", (idSpecifier21!=null?idSpecifier21.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:89:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_attrs351);
            	    classSpecifier22=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier22.getTree());
            	    retval.attrMap.put("class", (classSpecifier22!=null?classSpecifier22.klass:null));

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // ../etc/Jaml.g:91:1: divAttrs returns [Map<String,String> attrMap] : ( idSpecifier | classSpecifier )+ ;
    public final JamlParser.divAttrs_return divAttrs() throws RecognitionException {
    traceIn("divAttrs", 7);
        JamlParser.divAttrs_return retval = new JamlParser.divAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.idSpecifier_return idSpecifier23 = null;

        JamlParser.classSpecifier_return classSpecifier24 = null;



        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:91:101: ( ( idSpecifier | classSpecifier )+ )
            // ../etc/Jaml.g:92:1: ( idSpecifier | classSpecifier )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:92:1: ( idSpecifier | classSpecifier )+
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
            	    // ../etc/Jaml.g:92:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_divAttrs372);
            	    idSpecifier23=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier23.getTree());
            	    retval.attrMap.put("id", (idSpecifier23!=null?idSpecifier23.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:93:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_divAttrs379);
            	    classSpecifier24=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier24.getTree());
            	    retval.attrMap.put("class", (classSpecifier24!=null?classSpecifier24.klass:null));

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // ../etc/Jaml.g:95:1: attrHash returns [Map<String,String> attrMap] : BEGIN_HASH (am1= attrMapping ( COMMA am2= attrMapping )* )? END_HASH ;
    public final JamlParser.attrHash_return attrHash() throws RecognitionException {
    traceIn("attrHash", 8);
        JamlParser.attrHash_return retval = new JamlParser.attrHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN_HASH25=null;
        Token COMMA26=null;
        Token END_HASH27=null;
        JamlParser.attrMapping_return am1 = null;

        JamlParser.attrMapping_return am2 = null;


        CommonTree BEGIN_HASH25_tree=null;
        CommonTree COMMA26_tree=null;
        CommonTree END_HASH27_tree=null;

        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:95:101: ( BEGIN_HASH (am1= attrMapping ( COMMA am2= attrMapping )* )? END_HASH )
            // ../etc/Jaml.g:96:3: BEGIN_HASH (am1= attrMapping ( COMMA am2= attrMapping )* )? END_HASH
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN_HASH25=(Token)match(input,BEGIN_HASH,FOLLOW_BEGIN_HASH_in_attrHash401); 
            BEGIN_HASH25_tree = (CommonTree)adaptor.create(BEGIN_HASH25);
            adaptor.addChild(root_0, BEGIN_HASH25_tree);

            // ../etc/Jaml.g:97:3: (am1= attrMapping ( COMMA am2= attrMapping )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=StringLiteral && LA12_0<=DOUBLELITERAL)||LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../etc/Jaml.g:97:5: am1= attrMapping ( COMMA am2= attrMapping )*
                    {
                    pushFollow(FOLLOW_attrMapping_in_attrHash409);
                    am1=attrMapping();

                    state._fsp--;

                    adaptor.addChild(root_0, am1.getTree());
                    retval.attrMap.put((am1!=null?am1.key:null), (am1!=null?am1.value:null));
                    // ../etc/Jaml.g:98:5: ( COMMA am2= attrMapping )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../etc/Jaml.g:98:6: COMMA am2= attrMapping
                    	    {
                    	    COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_attrHash425); 
                    	    COMMA26_tree = (CommonTree)adaptor.create(COMMA26);
                    	    adaptor.addChild(root_0, COMMA26_tree);

                    	    pushFollow(FOLLOW_attrMapping_in_attrHash429);
                    	    am2=attrMapping();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, am2.getTree());
                    	    retval.attrMap.put((am2!=null?am2.key:null), (am2!=null?am2.value:null));

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            END_HASH27=(Token)match(input,END_HASH,FOLLOW_END_HASH_in_attrHash439); 
            END_HASH27_tree = (CommonTree)adaptor.create(END_HASH27);
            adaptor.addChild(root_0, END_HASH27_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // ../etc/Jaml.g:101:1: attrMapping returns [String key, String value] : ( ':' ID | attr= literal ) '=' '>' attrVal= literal ;
    public final JamlParser.attrMapping_return attrMapping() throws RecognitionException {
    traceIn("attrMapping", 9);
        JamlParser.attrMapping_return retval = new JamlParser.attrMapping_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal28=null;
        Token ID29=null;
        Token char_literal30=null;
        Token char_literal31=null;
        JamlParser.literal_return attr = null;

        JamlParser.literal_return attrVal = null;


        CommonTree char_literal28_tree=null;
        CommonTree ID29_tree=null;
        CommonTree char_literal30_tree=null;
        CommonTree char_literal31_tree=null;

        try {
            // ../etc/Jaml.g:101:47: ( ( ':' ID | attr= literal ) '=' '>' attrVal= literal )
            // ../etc/Jaml.g:102:2: ( ':' ID | attr= literal ) '=' '>' attrVal= literal
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:102:2: ( ':' ID | attr= literal )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==39) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=StringLiteral && LA13_0<=DOUBLELITERAL)) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../etc/Jaml.g:102:3: ':' ID
                    {
                    char_literal28=(Token)match(input,39,FOLLOW_39_in_attrMapping452); 
                    char_literal28_tree = (CommonTree)adaptor.create(char_literal28);
                    adaptor.addChild(root_0, char_literal28_tree);

                    ID29=(Token)match(input,ID,FOLLOW_ID_in_attrMapping454); 
                    ID29_tree = (CommonTree)adaptor.create(ID29);
                    adaptor.addChild(root_0, ID29_tree);

                    retval.key = (ID29!=null?ID29.getText():null);

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:102:31: attr= literal
                    {
                    pushFollow(FOLLOW_literal_in_attrMapping462);
                    attr=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, attr.getTree());
                    retval.key = (attr!=null?attr.value:null);

                    }
                    break;

            }

            char_literal30=(Token)match(input,40,FOLLOW_40_in_attrMapping470); 
            char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);

            char_literal31=(Token)match(input,41,FOLLOW_41_in_attrMapping472); 
            char_literal31_tree = (CommonTree)adaptor.create(char_literal31);
            adaptor.addChild(root_0, char_literal31_tree);

            pushFollow(FOLLOW_literal_in_attrMapping479);
            attrVal=literal();

            state._fsp--;

            adaptor.addChild(root_0, attrVal.getTree());
            retval.value = (attrVal!=null?attrVal.value:null);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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

    public static class literal_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // ../etc/Jaml.g:106:1: literal returns [String value] : (lit= StringLiteral | lit= INTLITERAL | lit= LONGLITERAL | lit= CHARLITERAL | lit= FLOATLITERAL | lit= DOUBLELITERAL );
    public final JamlParser.literal_return literal() throws RecognitionException {
    traceIn("literal", 10);
        JamlParser.literal_return retval = new JamlParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lit=null;

        CommonTree lit_tree=null;

        try {
            // ../etc/Jaml.g:107:1: (lit= StringLiteral | lit= INTLITERAL | lit= LONGLITERAL | lit= CHARLITERAL | lit= FLOATLITERAL | lit= DOUBLELITERAL )
            int alt14=6;
            switch ( input.LA(1) ) {
            case StringLiteral:
                {
                alt14=1;
                }
                break;
            case INTLITERAL:
                {
                alt14=2;
                }
                break;
            case LONGLITERAL:
                {
                alt14=3;
                }
                break;
            case CHARLITERAL:
                {
                alt14=4;
                }
                break;
            case FLOATLITERAL:
                {
                alt14=5;
                }
                break;
            case DOUBLELITERAL:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../etc/Jaml.g:107:3: lit= StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal495); 
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);

                    retval.value = Util.parseStringLiteral((lit!=null?lit.getText():null));

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:108:3: lit= INTLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,INTLITERAL,FOLLOW_INTLITERAL_in_literal505); 
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);

                    retval.value = Util.parseIntegerLiteral((lit!=null?lit.getText():null));

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:109:3: lit= LONGLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,LONGLITERAL,FOLLOW_LONGLITERAL_in_literal515); 
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);

                    retval.value = Util.parseLongLiteral((lit!=null?lit.getText():null));

                    }
                    break;
                case 4 :
                    // ../etc/Jaml.g:110:3: lit= CHARLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,CHARLITERAL,FOLLOW_CHARLITERAL_in_literal525); 
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);

                    retval.value = Util.parseCharLiteral((lit!=null?lit.getText():null));

                    }
                    break;
                case 5 :
                    // ../etc/Jaml.g:111:3: lit= FLOATLITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,FLOATLITERAL,FOLLOW_FLOATLITERAL_in_literal535); 
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);

                    retval.value = Util.parseFloatLiteral((lit!=null?lit.getText():null));

                    }
                    break;
                case 6 :
                    // ../etc/Jaml.g:112:3: lit= DOUBLELITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,DOUBLELITERAL,FOLLOW_DOUBLELITERAL_in_literal545); 
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);

                    retval.value = Util.parseDoubleLiteral((lit!=null?lit.getText():null));

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("literal", 10);
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
    // ../etc/Jaml.g:115:1: idSpecifier returns [String id] : POUND ID ;
    public final JamlParser.idSpecifier_return idSpecifier() throws RecognitionException {
    traceIn("idSpecifier", 11);
        JamlParser.idSpecifier_return retval = new JamlParser.idSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POUND32=null;
        Token ID33=null;

        CommonTree POUND32_tree=null;
        CommonTree ID33_tree=null;

        try {
            // ../etc/Jaml.g:115:32: ( POUND ID )
            // ../etc/Jaml.g:115:34: POUND ID
            {
            root_0 = (CommonTree)adaptor.nil();

            POUND32=(Token)match(input,POUND,FOLLOW_POUND_in_idSpecifier561); 
            POUND32_tree = (CommonTree)adaptor.create(POUND32);
            adaptor.addChild(root_0, POUND32_tree);

            ID33=(Token)match(input,ID,FOLLOW_ID_in_idSpecifier563); 
            ID33_tree = (CommonTree)adaptor.create(ID33);
            adaptor.addChild(root_0, ID33_tree);

            retval.id = (ID33!=null?ID33.getText():null);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("idSpecifier", 11);
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
    // ../etc/Jaml.g:117:1: classSpecifier returns [String klass] : DOT ID ;
    public final JamlParser.classSpecifier_return classSpecifier() throws RecognitionException {
    traceIn("classSpecifier", 12);
        JamlParser.classSpecifier_return retval = new JamlParser.classSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT34=null;
        Token ID35=null;

        CommonTree DOT34_tree=null;
        CommonTree ID35_tree=null;

        try {
            // ../etc/Jaml.g:117:38: ( DOT ID )
            // ../etc/Jaml.g:118:1: DOT ID
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT34=(Token)match(input,DOT,FOLLOW_DOT_in_classSpecifier576); 
            DOT34_tree = (CommonTree)adaptor.create(DOT34);
            adaptor.addChild(root_0, DOT34_tree);

            ID35=(Token)match(input,ID,FOLLOW_ID_in_classSpecifier578); 
            ID35_tree = (CommonTree)adaptor.create(ID35);
            adaptor.addChild(root_0, ID35_tree);

            retval.klass = (ID35!=null?ID35.getText():null);

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("classSpecifier", 12);
        }
        return retval;
    }
    // $ANTLR end "classSpecifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_prog98 = new BitSet(new long[]{0x00000000003002C2L});
    public static final BitSet FOLLOW_elementDeclaration_in_element122 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_TEXT_in_element130 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_element132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_element144 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_content_in_element147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_element160 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_element162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_line191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_line199 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_line203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_line209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divAttrs_in_elementDeclaration234 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrs_in_elementDeclaration261 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_content296 = new BitSet(new long[]{0x0000000000300280L});
    public static final BitSet FOLLOW_element_in_content303 = new BitSet(new long[]{0x00000000003002A0L});
    public static final BitSet FOLLOW_TEXT_in_content309 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_content311 = new BitSet(new long[]{0x00000000003002A0L});
    public static final BitSet FOLLOW_DEDENT_in_content317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_attrs337 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_attrs339 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_idSpecifier_in_attrs344 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_classSpecifier_in_attrs351 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_idSpecifier_in_divAttrs372 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_classSpecifier_in_divAttrs379 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_BEGIN_HASH_in_attrHash401 = new BitSet(new long[]{0x00000080000FE000L});
    public static final BitSet FOLLOW_attrMapping_in_attrHash409 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_attrHash425 = new BitSet(new long[]{0x00000080000FC000L});
    public static final BitSet FOLLOW_attrMapping_in_attrHash429 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_END_HASH_in_attrHash439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_attrMapping452 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_attrMapping454 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_literal_in_attrMapping462 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_attrMapping470 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_attrMapping472 = new BitSet(new long[]{0x00000080000FC000L});
    public static final BitSet FOLLOW_literal_in_attrMapping479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTLITERAL_in_literal505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONGLITERAL_in_literal515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHARLITERAL_in_literal525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATLITERAL_in_literal535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLELITERAL_in_literal545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_idSpecifier561 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idSpecifier563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_classSpecifier576 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classSpecifier578 = new BitSet(new long[]{0x0000000000000002L});

}