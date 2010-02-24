// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-23 22:56:51

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INDENT", "DEDENT", "NEWLINE", "TEXT", "FORWARD_SLASH", "PERCENT", "ID", "BEGIN_HASH", "COMMA", "END_HASH", "StringLiteral", "POUND", "DOT", "INT", "Spaces", "WS", "NL", "IGNORED_NEWLINE", "CHANGE_INDENT", "SpacesQ", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "':'", "'='", "'>'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int IGNORED_NEWLINE=21;
    public static final int PERCENT=9;
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
    public static final int UnicodeEscape=25;
    public static final int Spaces=18;
    public static final int NL=20;
    public static final int DOT=16;
    public static final int OctalEscape=26;
    public static final int EscapeSequence=24;
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
    // ../etc/Jaml.g:51:1: prog returns [String rendering] : ( line )* ;
    public final JamlParser.prog_return prog() throws RecognitionException {
    traceIn("prog", 1);
        JamlParser.prog_return retval = new JamlParser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.line_return line1 = null;



        retval.rendering = "";
        try {
            // ../etc/Jaml.g:51:57: ( ( line )* )
            // ../etc/Jaml.g:52:3: ( line )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:52:3: ( line )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==TEXT||LA1_0==PERCENT||(LA1_0>=POUND && LA1_0<=DOT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../etc/Jaml.g:52:4: line
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
    // ../etc/Jaml.g:54:1: element returns [String rendering] : elementDeclaration ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) ;
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
            // ../etc/Jaml.g:54:91: ( elementDeclaration ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) )
            // ../etc/Jaml.g:55:3: elementDeclaration ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elementDeclaration_in_element122);
            elementDeclaration2=elementDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, elementDeclaration2.getTree());
            // ../etc/Jaml.g:56:4: ( TEXT NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
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
                    // ../etc/Jaml.g:56:6: TEXT NEWLINE
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
                    // ../etc/Jaml.g:57:6: NEWLINE ( content )?
                    {
                    NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element144); 
                    NEWLINE5_tree = (CommonTree)adaptor.create(NEWLINE5);
                    adaptor.addChild(root_0, NEWLINE5_tree);

                    // ../etc/Jaml.g:57:14: ( content )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==INDENT) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../etc/Jaml.g:57:15: content
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
                    // ../etc/Jaml.g:58:6: FORWARD_SLASH NEWLINE
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
    // ../etc/Jaml.g:62:1: line returns [String rendering] : ( element | TEXT NEWLINE );
    public final JamlParser.line_return line() throws RecognitionException {
    traceIn("line", 3);
        JamlParser.line_return retval = new JamlParser.line_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT10=null;
        Token NEWLINE11=null;
        JamlParser.element_return element9 = null;


        CommonTree TEXT10_tree=null;
        CommonTree NEWLINE11_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:62:60: ( element | TEXT NEWLINE )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==PERCENT||(LA4_0>=POUND && LA4_0<=DOT)) ) {
                alt4=1;
            }
            else if ( (LA4_0==TEXT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../etc/Jaml.g:63:3: element
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
                    // ../etc/Jaml.g:64:5: TEXT NEWLINE
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
    // ../etc/Jaml.g:67:1: elementDeclaration returns [String type, Map<String,String> attrMap] : ( ( (a1= divAttrs ) ( attrHash )? ) | ( (a2= attrs ) ( attrHash )? ) );
    public final JamlParser.elementDeclaration_return elementDeclaration() throws RecognitionException {
    traceIn("elementDeclaration", 4);
        JamlParser.elementDeclaration_return retval = new JamlParser.elementDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.divAttrs_return a1 = null;

        JamlParser.attrs_return a2 = null;

        JamlParser.attrHash_return attrHash12 = null;

        JamlParser.attrHash_return attrHash13 = null;



        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:67:124: ( ( (a1= divAttrs ) ( attrHash )? ) | ( (a2= attrs ) ( attrHash )? ) )
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
                    // ../etc/Jaml.g:68:3: ( (a1= divAttrs ) ( attrHash )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:68:3: ( (a1= divAttrs ) ( attrHash )? )
                    // ../etc/Jaml.g:68:4: (a1= divAttrs ) ( attrHash )?
                    {
                    // ../etc/Jaml.g:68:4: (a1= divAttrs )
                    // ../etc/Jaml.g:68:5: a1= divAttrs
                    {
                    pushFollow(FOLLOW_divAttrs_in_elementDeclaration228);
                    a1=divAttrs();

                    state._fsp--;

                    adaptor.addChild(root_0, a1.getTree());
                    retval.attrMap.putAll((a1!=null?a1.attrMap:null)); retval.type = "div";

                    }

                    // ../etc/Jaml.g:69:4: ( attrHash )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==BEGIN_HASH) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../etc/Jaml.g:69:5: attrHash
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration237);
                            attrHash12=attrHash();

                            state._fsp--;

                            adaptor.addChild(root_0, attrHash12.getTree());
                            retval.attrMap.putAll((attrHash12!=null?attrHash12.attrMap:null));

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:71:2: ( (a2= attrs ) ( attrHash )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:71:2: ( (a2= attrs ) ( attrHash )? )
                    // ../etc/Jaml.g:72:3: (a2= attrs ) ( attrHash )?
                    {
                    // ../etc/Jaml.g:72:3: (a2= attrs )
                    // ../etc/Jaml.g:72:4: a2= attrs
                    {
                    pushFollow(FOLLOW_attrs_in_elementDeclaration255);
                    a2=attrs();

                    state._fsp--;

                    adaptor.addChild(root_0, a2.getTree());
                    retval.attrMap.putAll((a2!=null?a2.attrMap:null)); retval.type = (a2!=null?a2.type:null);

                    }

                    // ../etc/Jaml.g:73:3: ( attrHash )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==BEGIN_HASH) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../etc/Jaml.g:73:4: attrHash
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration264);
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
    // ../etc/Jaml.g:76:1: content returns [String rendering] : INDENT (e1= element | TEXT NEWLINE )+ DEDENT ;
    public final JamlParser.content_return content() throws RecognitionException {
    traceIn("content", 5);
        JamlParser.content_return retval = new JamlParser.content_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INDENT14=null;
        Token TEXT15=null;
        Token NEWLINE16=null;
        Token DEDENT17=null;
        JamlParser.element_return e1 = null;


        CommonTree INDENT14_tree=null;
        CommonTree TEXT15_tree=null;
        CommonTree NEWLINE16_tree=null;
        CommonTree DEDENT17_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:76:63: ( INDENT (e1= element | TEXT NEWLINE )+ DEDENT )
            // ../etc/Jaml.g:77:1: INDENT (e1= element | TEXT NEWLINE )+ DEDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            INDENT14=(Token)match(input,INDENT,FOLLOW_INDENT_in_content290); 
            INDENT14_tree = (CommonTree)adaptor.create(INDENT14);
            adaptor.addChild(root_0, INDENT14_tree);

            // ../etc/Jaml.g:78:2: (e1= element | TEXT NEWLINE )+
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
            	    // ../etc/Jaml.g:78:3: e1= element
            	    {
            	    pushFollow(FOLLOW_element_in_content297);
            	    e1=element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e1.getTree());
            	    retval.rendering += (e1!=null?e1.rendering:null) + "\n";

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:78:54: TEXT NEWLINE
            	    {
            	    TEXT15=(Token)match(input,TEXT,FOLLOW_TEXT_in_content303); 
            	    TEXT15_tree = (CommonTree)adaptor.create(TEXT15);
            	    adaptor.addChild(root_0, TEXT15_tree);

            	    NEWLINE16=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_content305); 
            	    NEWLINE16_tree = (CommonTree)adaptor.create(NEWLINE16);
            	    adaptor.addChild(root_0, NEWLINE16_tree);

            	    retval.rendering += (TEXT15!=null?TEXT15.getText():null) + "\n";

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

            DEDENT17=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_content311); 
            DEDENT17_tree = (CommonTree)adaptor.create(DEDENT17);
            adaptor.addChild(root_0, DEDENT17_tree);

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
    // ../etc/Jaml.g:84:1: attrs returns [Map<String,String> attrMap, String type] : PERCENT ID ( idSpecifier | classSpecifier )* ;
    public final JamlParser.attrs_return attrs() throws RecognitionException {
    traceIn("attrs", 6);
        JamlParser.attrs_return retval = new JamlParser.attrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERCENT18=null;
        Token ID19=null;
        JamlParser.idSpecifier_return idSpecifier20 = null;

        JamlParser.classSpecifier_return classSpecifier21 = null;


        CommonTree PERCENT18_tree=null;
        CommonTree ID19_tree=null;

        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:84:111: ( PERCENT ID ( idSpecifier | classSpecifier )* )
            // ../etc/Jaml.g:85:1: PERCENT ID ( idSpecifier | classSpecifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            PERCENT18=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_attrs331); 
            PERCENT18_tree = (CommonTree)adaptor.create(PERCENT18);
            adaptor.addChild(root_0, PERCENT18_tree);

            ID19=(Token)match(input,ID,FOLLOW_ID_in_attrs333); 
            ID19_tree = (CommonTree)adaptor.create(ID19);
            adaptor.addChild(root_0, ID19_tree);

            retval.type = (ID19!=null?ID19.getText():null);
            // ../etc/Jaml.g:86:1: ( idSpecifier | classSpecifier )*
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
            	    // ../etc/Jaml.g:86:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_attrs338);
            	    idSpecifier20=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier20.getTree());
            	    retval.attrMap.put("id", (idSpecifier20!=null?idSpecifier20.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:87:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_attrs345);
            	    classSpecifier21=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier21.getTree());
            	    retval.attrMap.put("class", (classSpecifier21!=null?classSpecifier21.klass:null));

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
    // ../etc/Jaml.g:89:1: divAttrs returns [Map<String,String> attrMap] : ( idSpecifier | classSpecifier )+ ;
    public final JamlParser.divAttrs_return divAttrs() throws RecognitionException {
    traceIn("divAttrs", 7);
        JamlParser.divAttrs_return retval = new JamlParser.divAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.idSpecifier_return idSpecifier22 = null;

        JamlParser.classSpecifier_return classSpecifier23 = null;



        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:89:101: ( ( idSpecifier | classSpecifier )+ )
            // ../etc/Jaml.g:90:1: ( idSpecifier | classSpecifier )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:90:1: ( idSpecifier | classSpecifier )+
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
            	    // ../etc/Jaml.g:90:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_divAttrs366);
            	    idSpecifier22=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier22.getTree());
            	    retval.attrMap.put("id", (idSpecifier22!=null?idSpecifier22.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:91:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_divAttrs373);
            	    classSpecifier23=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier23.getTree());
            	    retval.attrMap.put("class", (classSpecifier23!=null?classSpecifier23.klass:null));

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
    // ../etc/Jaml.g:93:1: attrHash returns [Map<String,String> attrMap] : BEGIN_HASH (am1= attrMapping ( COMMA am2= attrMapping )* )? END_HASH ;
    public final JamlParser.attrHash_return attrHash() throws RecognitionException {
    traceIn("attrHash", 8);
        JamlParser.attrHash_return retval = new JamlParser.attrHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN_HASH24=null;
        Token COMMA25=null;
        Token END_HASH26=null;
        JamlParser.attrMapping_return am1 = null;

        JamlParser.attrMapping_return am2 = null;


        CommonTree BEGIN_HASH24_tree=null;
        CommonTree COMMA25_tree=null;
        CommonTree END_HASH26_tree=null;

        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:93:101: ( BEGIN_HASH (am1= attrMapping ( COMMA am2= attrMapping )* )? END_HASH )
            // ../etc/Jaml.g:94:3: BEGIN_HASH (am1= attrMapping ( COMMA am2= attrMapping )* )? END_HASH
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN_HASH24=(Token)match(input,BEGIN_HASH,FOLLOW_BEGIN_HASH_in_attrHash395); 
            BEGIN_HASH24_tree = (CommonTree)adaptor.create(BEGIN_HASH24);
            adaptor.addChild(root_0, BEGIN_HASH24_tree);

            // ../etc/Jaml.g:95:3: (am1= attrMapping ( COMMA am2= attrMapping )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../etc/Jaml.g:95:5: am1= attrMapping ( COMMA am2= attrMapping )*
                    {
                    pushFollow(FOLLOW_attrMapping_in_attrHash403);
                    am1=attrMapping();

                    state._fsp--;

                    adaptor.addChild(root_0, am1.getTree());
                    retval.attrMap.put((am1!=null?am1.key:null), (am1!=null?am1.value:null));
                    // ../etc/Jaml.g:96:5: ( COMMA am2= attrMapping )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../etc/Jaml.g:96:6: COMMA am2= attrMapping
                    	    {
                    	    COMMA25=(Token)match(input,COMMA,FOLLOW_COMMA_in_attrHash419); 
                    	    COMMA25_tree = (CommonTree)adaptor.create(COMMA25);
                    	    adaptor.addChild(root_0, COMMA25_tree);

                    	    pushFollow(FOLLOW_attrMapping_in_attrHash423);
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

            END_HASH26=(Token)match(input,END_HASH,FOLLOW_END_HASH_in_attrHash433); 
            END_HASH26_tree = (CommonTree)adaptor.create(END_HASH26);
            adaptor.addChild(root_0, END_HASH26_tree);


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
    // ../etc/Jaml.g:99:1: attrMapping returns [String key, String value] : ':' ID '=' '>' attrValue ;
    public final JamlParser.attrMapping_return attrMapping() throws RecognitionException {
    traceIn("attrMapping", 9);
        JamlParser.attrMapping_return retval = new JamlParser.attrMapping_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal27=null;
        Token ID28=null;
        Token char_literal29=null;
        Token char_literal30=null;
        JamlParser.attrValue_return attrValue31 = null;


        CommonTree char_literal27_tree=null;
        CommonTree ID28_tree=null;
        CommonTree char_literal29_tree=null;
        CommonTree char_literal30_tree=null;

        try {
            // ../etc/Jaml.g:99:47: ( ':' ID '=' '>' attrValue )
            // ../etc/Jaml.g:100:1: ':' ID '=' '>' attrValue
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal27=(Token)match(input,28,FOLLOW_28_in_attrMapping444); 
            char_literal27_tree = (CommonTree)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);

            ID28=(Token)match(input,ID,FOLLOW_ID_in_attrMapping446); 
            ID28_tree = (CommonTree)adaptor.create(ID28);
            adaptor.addChild(root_0, ID28_tree);

            char_literal29=(Token)match(input,29,FOLLOW_29_in_attrMapping448); 
            char_literal29_tree = (CommonTree)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);

            char_literal30=(Token)match(input,30,FOLLOW_30_in_attrMapping450); 
            char_literal30_tree = (CommonTree)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);

            pushFollow(FOLLOW_attrValue_in_attrMapping452);
            attrValue31=attrValue();

            state._fsp--;

            adaptor.addChild(root_0, attrValue31.getTree());

              retval.key = (ID28!=null?ID28.getText():null); retval.value = (attrValue31!=null?attrValue31.value:null);


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

    public static class attrValue_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrValue"
    // ../etc/Jaml.g:104:1: attrValue returns [String value] : StringLiteral ;
    public final JamlParser.attrValue_return attrValue() throws RecognitionException {
    traceIn("attrValue", 10);
        JamlParser.attrValue_return retval = new JamlParser.attrValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral32=null;

        CommonTree StringLiteral32_tree=null;

        try {
            // ../etc/Jaml.g:105:1: ( StringLiteral )
            // ../etc/Jaml.g:105:3: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral32=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_attrValue466); 
            StringLiteral32_tree = (CommonTree)adaptor.create(StringLiteral32);
            adaptor.addChild(root_0, StringLiteral32_tree);

            retval.value = Util.parseStringLiteral((StringLiteral32!=null?StringLiteral32.getText():null));

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
    traceOut("attrValue", 10);
        }
        return retval;
    }
    // $ANTLR end "attrValue"

    public static class idSpecifier_return extends ParserRuleReturnScope {
        public String id;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idSpecifier"
    // ../etc/Jaml.g:107:1: idSpecifier returns [String id] : POUND ID ;
    public final JamlParser.idSpecifier_return idSpecifier() throws RecognitionException {
    traceIn("idSpecifier", 11);
        JamlParser.idSpecifier_return retval = new JamlParser.idSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POUND33=null;
        Token ID34=null;

        CommonTree POUND33_tree=null;
        CommonTree ID34_tree=null;

        try {
            // ../etc/Jaml.g:107:32: ( POUND ID )
            // ../etc/Jaml.g:107:34: POUND ID
            {
            root_0 = (CommonTree)adaptor.nil();

            POUND33=(Token)match(input,POUND,FOLLOW_POUND_in_idSpecifier479); 
            POUND33_tree = (CommonTree)adaptor.create(POUND33);
            adaptor.addChild(root_0, POUND33_tree);

            ID34=(Token)match(input,ID,FOLLOW_ID_in_idSpecifier481); 
            ID34_tree = (CommonTree)adaptor.create(ID34);
            adaptor.addChild(root_0, ID34_tree);

            retval.id = (ID34!=null?ID34.getText():null);

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
    // ../etc/Jaml.g:109:1: classSpecifier returns [String klass] : DOT ID ;
    public final JamlParser.classSpecifier_return classSpecifier() throws RecognitionException {
    traceIn("classSpecifier", 12);
        JamlParser.classSpecifier_return retval = new JamlParser.classSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT35=null;
        Token ID36=null;

        CommonTree DOT35_tree=null;
        CommonTree ID36_tree=null;

        try {
            // ../etc/Jaml.g:109:38: ( DOT ID )
            // ../etc/Jaml.g:110:1: DOT ID
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT35=(Token)match(input,DOT,FOLLOW_DOT_in_classSpecifier494); 
            DOT35_tree = (CommonTree)adaptor.create(DOT35);
            adaptor.addChild(root_0, DOT35_tree);

            ID36=(Token)match(input,ID,FOLLOW_ID_in_classSpecifier496); 
            ID36_tree = (CommonTree)adaptor.create(ID36);
            adaptor.addChild(root_0, ID36_tree);

            retval.klass = (ID36!=null?ID36.getText():null);

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


 

    public static final BitSet FOLLOW_line_in_prog98 = new BitSet(new long[]{0x0000000000018282L});
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
    public static final BitSet FOLLOW_divAttrs_in_elementDeclaration228 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrs_in_elementDeclaration255 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_content290 = new BitSet(new long[]{0x0000000000018280L});
    public static final BitSet FOLLOW_element_in_content297 = new BitSet(new long[]{0x00000000000182A0L});
    public static final BitSet FOLLOW_TEXT_in_content303 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_content305 = new BitSet(new long[]{0x00000000000182A0L});
    public static final BitSet FOLLOW_DEDENT_in_content311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_attrs331 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_attrs333 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_idSpecifier_in_attrs338 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_classSpecifier_in_attrs345 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_idSpecifier_in_divAttrs366 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_classSpecifier_in_divAttrs373 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_BEGIN_HASH_in_attrHash395 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_attrMapping_in_attrHash403 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_COMMA_in_attrHash419 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_attrMapping_in_attrHash423 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_END_HASH_in_attrHash433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_attrMapping444 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_attrMapping446 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_attrMapping448 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_attrMapping450 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_attrValue_in_attrMapping452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_attrValue466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_idSpecifier479 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idSpecifier481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_classSpecifier494 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classSpecifier496 = new BitSet(new long[]{0x0000000000000002L});

}