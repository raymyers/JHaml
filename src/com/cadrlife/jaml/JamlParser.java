// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-26 19:39:32

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INDENT", "DEDENT", "NEWLINE", "TEXT", "FORWARD_SLASH", "PERCENT", "ID", "BEGIN_HASH", "END_HASH", "POUND", "DOT", "COMMA", "Spaces", "WS", "NL", "IGNORED_NEWLINE", "CHANGE_INDENT", "SpacesQ", "EscapeSequence", "StringLiteral", "IntegerNumber", "LongSuffix", "LONGLITERAL", "INTLITERAL", "HexPrefix", "HexDigit", "Exponent", "NonIntegerNumber", "FloatSuffix", "DoubleSuffix", "FLOATLITERAL", "DOUBLELITERAL", "CHARLITERAL", "UnicodeEscape", "OctalEscape", "HASH_CONTENTS", "LBRACE", "RBRACE", "JAVA_LBRACE", "JAVA_RBRACE"
    };
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
    public static final int NonIntegerNumber=31;
    public static final int FloatSuffix=32;
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
    // ../etc/Jaml.g:69:1: elementDeclaration returns [String type, Map<String,String> attrMap] : ( (a1= divAttrs[$attrMap] ( attrHash[$attrMap] )? ) | (a2= attrs[$attrMap] ( attrHash[$attrMap] )? ) );
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
            // ../etc/Jaml.g:70:57: ( (a1= divAttrs[$attrMap] ( attrHash[$attrMap] )? ) | (a2= attrs[$attrMap] ( attrHash[$attrMap] )? ) )
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
                    // ../etc/Jaml.g:71:3: (a1= divAttrs[$attrMap] ( attrHash[$attrMap] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:71:3: (a1= divAttrs[$attrMap] ( attrHash[$attrMap] )? )
                    // ../etc/Jaml.g:71:4: a1= divAttrs[$attrMap] ( attrHash[$attrMap] )?
                    {
                    pushFollow(FOLLOW_divAttrs_in_elementDeclaration236);
                    a1=divAttrs(retval.attrMap);

                    state._fsp--;

                    adaptor.addChild(root_0, a1.getTree());
                    retval.type = "div";
                    // ../etc/Jaml.g:71:43: ( attrHash[$attrMap] )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==BEGIN_HASH) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../etc/Jaml.g:71:43: attrHash[$attrMap]
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration241);
                            attrHash13=attrHash(retval.attrMap);

                            state._fsp--;

                            adaptor.addChild(root_0, attrHash13.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:73:2: (a2= attrs[$attrMap] ( attrHash[$attrMap] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:73:2: (a2= attrs[$attrMap] ( attrHash[$attrMap] )? )
                    // ../etc/Jaml.g:74:3: a2= attrs[$attrMap] ( attrHash[$attrMap] )?
                    {
                    pushFollow(FOLLOW_attrs_in_elementDeclaration256);
                    a2=attrs(retval.attrMap);

                    state._fsp--;

                    adaptor.addChild(root_0, a2.getTree());
                    retval.type = (a2!=null?a2.type:null);
                    // ../etc/Jaml.g:75:3: ( attrHash[$attrMap] )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==BEGIN_HASH) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../etc/Jaml.g:75:3: attrHash[$attrMap]
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration264);
                            attrHash14=attrHash(retval.attrMap);

                            state._fsp--;

                            adaptor.addChild(root_0, attrHash14.getTree());

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

            INDENT15=(Token)match(input,INDENT,FOLLOW_INDENT_in_content288); 
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
            	    pushFollow(FOLLOW_element_in_content295);
            	    e1=element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e1.getTree());
            	    retval.rendering += (e1!=null?e1.rendering:null) + "\n";

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:80:54: TEXT NEWLINE
            	    {
            	    TEXT16=(Token)match(input,TEXT,FOLLOW_TEXT_in_content301); 
            	    TEXT16_tree = (CommonTree)adaptor.create(TEXT16);
            	    adaptor.addChild(root_0, TEXT16_tree);

            	    NEWLINE17=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_content303); 
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

            DEDENT18=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_content309); 
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
        public String type;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrs"
    // ../etc/Jaml.g:86:1: attrs[Map<String,String> attrMap] returns [String type] : PERCENT ID ( idSpecifier | classSpecifier )* ;
    public final JamlParser.attrs_return attrs(Map<String,String> attrMap) throws RecognitionException {
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

        try {
            // ../etc/Jaml.g:86:56: ( PERCENT ID ( idSpecifier | classSpecifier )* )
            // ../etc/Jaml.g:87:1: PERCENT ID ( idSpecifier | classSpecifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            PERCENT19=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_attrs325); 
            PERCENT19_tree = (CommonTree)adaptor.create(PERCENT19);
            adaptor.addChild(root_0, PERCENT19_tree);

            ID20=(Token)match(input,ID,FOLLOW_ID_in_attrs327); 
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
            	    pushFollow(FOLLOW_idSpecifier_in_attrs332);
            	    idSpecifier21=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier21.getTree());
            	    attrMap.put("id", (idSpecifier21!=null?idSpecifier21.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:89:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_attrs339);
            	    classSpecifier22=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier22.getTree());
            	    attrMap.put("class", (classSpecifier22!=null?classSpecifier22.klass:null));

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "divAttrs"
    // ../etc/Jaml.g:91:1: divAttrs[Map<String,String> attrMap] : ( idSpecifier | classSpecifier )+ ;
    public final JamlParser.divAttrs_return divAttrs(Map<String,String> attrMap) throws RecognitionException {
    traceIn("divAttrs", 7);
        JamlParser.divAttrs_return retval = new JamlParser.divAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.idSpecifier_return idSpecifier23 = null;

        JamlParser.classSpecifier_return classSpecifier24 = null;



        try {
            // ../etc/Jaml.g:91:38: ( ( idSpecifier | classSpecifier )+ )
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
            	    pushFollow(FOLLOW_idSpecifier_in_divAttrs353);
            	    idSpecifier23=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier23.getTree());
            	    attrMap.put("id", (idSpecifier23!=null?idSpecifier23.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:93:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_divAttrs360);
            	    classSpecifier24=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier24.getTree());
            	    attrMap.put("class", (classSpecifier24!=null?classSpecifier24.klass:null));

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
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrHash"
    // ../etc/Jaml.g:95:1: attrHash[Map<String,String> attrMap] : BEGIN_HASH hashAttrs END_HASH ;
    public final JamlParser.attrHash_return attrHash(Map<String,String> attrMap) throws RecognitionException {
    traceIn("attrHash", 8);
        JamlParser.attrHash_return retval = new JamlParser.attrHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN_HASH25=null;
        Token END_HASH27=null;
        JamlParser.hashAttrs_return hashAttrs26 = null;


        CommonTree BEGIN_HASH25_tree=null;
        CommonTree END_HASH27_tree=null;

        try {
            // ../etc/Jaml.g:95:38: ( BEGIN_HASH hashAttrs END_HASH )
            // ../etc/Jaml.g:96:3: BEGIN_HASH hashAttrs END_HASH
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN_HASH25=(Token)match(input,BEGIN_HASH,FOLLOW_BEGIN_HASH_in_attrHash375); 
            BEGIN_HASH25_tree = (CommonTree)adaptor.create(BEGIN_HASH25);
            adaptor.addChild(root_0, BEGIN_HASH25_tree);

            System.out.println("BEGIN " + input.toString(retval.start,input.LT(-1)));
            pushFollow(FOLLOW_hashAttrs_in_attrHash381);
            hashAttrs26=hashAttrs();

            state._fsp--;

            adaptor.addChild(root_0, hashAttrs26.getTree());
            END_HASH27=(Token)match(input,END_HASH,FOLLOW_END_HASH_in_attrHash386); 
            END_HASH27_tree = (CommonTree)adaptor.create(END_HASH27);
            adaptor.addChild(root_0, END_HASH27_tree);

            Util.parseAttrHash((hashAttrs26!=null?hashAttrs26.contents:null), attrMap);

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

    public static class hashAttrs_return extends ParserRuleReturnScope {
        public String contents;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "hashAttrs"
    // ../etc/Jaml.g:100:1: hashAttrs returns [String contents] : ( notEndHash )* ;
    public final JamlParser.hashAttrs_return hashAttrs() throws RecognitionException {
    traceIn("hashAttrs", 9);
        JamlParser.hashAttrs_return retval = new JamlParser.hashAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.notEndHash_return notEndHash28 = null;



        retval.contents ="";
        try {
            // ../etc/Jaml.g:100:59: ( ( notEndHash )* )
            // ../etc/Jaml.g:101:1: ( notEndHash )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:101:1: ( notEndHash )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=INDENT && LA11_0<=BEGIN_HASH)||(LA11_0>=POUND && LA11_0<=JAVA_RBRACE)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../etc/Jaml.g:101:2: notEndHash
            	    {
            	    pushFollow(FOLLOW_notEndHash_in_hashAttrs406);
            	    notEndHash28=notEndHash();

            	    state._fsp--;

            	    adaptor.addChild(root_0, notEndHash28.getTree());
            	    retval.contents += (notEndHash28!=null?input.toString(notEndHash28.start,notEndHash28.stop):null);

            	    }
            	    break;

            	default :
            	    break loop11;
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
    traceOut("hashAttrs", 9);
        }
        return retval;
    }
    // $ANTLR end "hashAttrs"

    public static class notEndHash_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notEndHash"
    // ../etc/Jaml.g:103:1: notEndHash : (~ END_HASH ) ;
    public final JamlParser.notEndHash_return notEndHash() throws RecognitionException {
    traceIn("notEndHash", 10);
        JamlParser.notEndHash_return retval = new JamlParser.notEndHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set29=null;

        CommonTree set29_tree=null;

        try {
            // ../etc/Jaml.g:103:12: ( (~ END_HASH ) )
            // ../etc/Jaml.g:103:14: (~ END_HASH )
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:103:14: (~ END_HASH )
            // ../etc/Jaml.g:103:15: ~ END_HASH
            {
            set29=(Token)input.LT(1);
            if ( (input.LA(1)>=INDENT && input.LA(1)<=BEGIN_HASH)||(input.LA(1)>=POUND && input.LA(1)<=JAVA_RBRACE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set29));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            System.out.println("() " + input.toString(retval.start,input.LT(-1)));

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
    traceOut("notEndHash", 10);
        }
        return retval;
    }
    // $ANTLR end "notEndHash"

    public static class idSpecifier_return extends ParserRuleReturnScope {
        public String id;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idSpecifier"
    // ../etc/Jaml.g:105:1: idSpecifier returns [String id] : POUND ID ;
    public final JamlParser.idSpecifier_return idSpecifier() throws RecognitionException {
    traceIn("idSpecifier", 11);
        JamlParser.idSpecifier_return retval = new JamlParser.idSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POUND30=null;
        Token ID31=null;

        CommonTree POUND30_tree=null;
        CommonTree ID31_tree=null;

        try {
            // ../etc/Jaml.g:105:32: ( POUND ID )
            // ../etc/Jaml.g:105:34: POUND ID
            {
            root_0 = (CommonTree)adaptor.nil();

            POUND30=(Token)match(input,POUND,FOLLOW_POUND_in_idSpecifier434); 
            POUND30_tree = (CommonTree)adaptor.create(POUND30);
            adaptor.addChild(root_0, POUND30_tree);

            ID31=(Token)match(input,ID,FOLLOW_ID_in_idSpecifier436); 
            ID31_tree = (CommonTree)adaptor.create(ID31);
            adaptor.addChild(root_0, ID31_tree);

            retval.id = (ID31!=null?ID31.getText():null);

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
    // ../etc/Jaml.g:107:1: classSpecifier returns [String klass] : DOT ID ;
    public final JamlParser.classSpecifier_return classSpecifier() throws RecognitionException {
    traceIn("classSpecifier", 12);
        JamlParser.classSpecifier_return retval = new JamlParser.classSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT32=null;
        Token ID33=null;

        CommonTree DOT32_tree=null;
        CommonTree ID33_tree=null;

        try {
            // ../etc/Jaml.g:107:38: ( DOT ID )
            // ../etc/Jaml.g:108:1: DOT ID
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_classSpecifier449); 
            DOT32_tree = (CommonTree)adaptor.create(DOT32);
            adaptor.addChild(root_0, DOT32_tree);

            ID33=(Token)match(input,ID,FOLLOW_ID_in_classSpecifier451); 
            ID33_tree = (CommonTree)adaptor.create(ID33);
            adaptor.addChild(root_0, ID33_tree);

            retval.klass = (ID33!=null?ID33.getText():null);

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


 

    public static final BitSet FOLLOW_line_in_prog98 = new BitSet(new long[]{0x00000000000062C2L});
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
    public static final BitSet FOLLOW_divAttrs_in_elementDeclaration236 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrs_in_elementDeclaration256 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_content288 = new BitSet(new long[]{0x0000000000006280L});
    public static final BitSet FOLLOW_element_in_content295 = new BitSet(new long[]{0x00000000000062A0L});
    public static final BitSet FOLLOW_TEXT_in_content301 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_content303 = new BitSet(new long[]{0x00000000000062A0L});
    public static final BitSet FOLLOW_DEDENT_in_content309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_attrs325 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_attrs327 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_idSpecifier_in_attrs332 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_classSpecifier_in_attrs339 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_idSpecifier_in_divAttrs353 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_classSpecifier_in_divAttrs360 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_BEGIN_HASH_in_attrHash375 = new BitSet(new long[]{0x00000FFFFFFFFFF0L});
    public static final BitSet FOLLOW_hashAttrs_in_attrHash381 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_HASH_in_attrHash386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notEndHash_in_hashAttrs406 = new BitSet(new long[]{0x00000FFFFFFFEFF2L});
    public static final BitSet FOLLOW_set_in_notEndHash419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_idSpecifier434 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idSpecifier436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_classSpecifier449 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classSpecifier451 = new BitSet(new long[]{0x0000000000000002L});

}