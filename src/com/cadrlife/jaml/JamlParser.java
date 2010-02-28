// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-27 19:54:27

package com.cadrlife.jaml;
import java.util.LinkedHashMap;
import java.util.Map;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

@SuppressWarnings("unused") public class JamlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INDENT", "DEDENT", "NEWLINE", "FORWARD_SLASH", "TEXT", "PERCENT", "ID", "BEGIN_HASH", "END_HASH", "POUND", "DOT", "COMMA", "Spaces", "WS", "NL", "IGNORED_NEWLINE", "CHANGE_INDENT", "SpacesQ", "EscapeSequence", "StringLiteral", "CHARLITERAL", "UnicodeEscape", "OctalEscape", "HexDigit", "HASH_CONTENTS", "LBRACE", "RBRACE", "JAVA_LBRACE", "JAVA_RBRACE"
    };
    public static final int RBRACE=30;
    public static final int PERCENT=9;
    public static final int IGNORED_NEWLINE=19;
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
    public static final int HASH_CONTENTS=28;
    public static final int WS=17;
    public static final int NEWLINE=6;
    public static final int COMMA=15;
    public static final int UnicodeEscape=25;
    public static final int Spaces=16;
    public static final int CHARLITERAL=24;
    public static final int JAVA_LBRACE=31;
    public static final int NL=18;
    public static final int DOT=14;
    public static final int OctalEscape=26;
    public static final int EscapeSequence=22;
    public static final int FORWARD_SLASH=7;
    public static final int JAVA_RBRACE=32;

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
    JamlConfig config = new JamlConfig();
    Helper util = new Helper(config);


    public static class jamlSource_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jamlSource"
    // ../etc/Jaml.g:54:1: jamlSource[JamlConfig config] returns [String rendering] : ( line )* ;
    public final JamlParser.jamlSource_return jamlSource(JamlConfig config) throws RecognitionException {
    traceIn("jamlSource", 1);
        JamlParser.jamlSource_return retval = new JamlParser.jamlSource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.line_return line1 = null;




          retval.rendering = ""; 
          this.config = config;
          Helper util = new Helper(config);

        try {
            // ../etc/Jaml.g:60:1: ( ( line )* )
            // ../etc/Jaml.g:60:3: ( line )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:60:3: ( line )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE||(LA1_0>=TEXT && LA1_0<=PERCENT)||(LA1_0>=POUND && LA1_0<=DOT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../etc/Jaml.g:60:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_jamlSource98);
            	    line1=line();

            	    state._fsp--;

            	    adaptor.addChild(root_0, line1.getTree());
            	    retval.rendering += (line1!=null?line1.rendering:null) + "\n";

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
    traceOut("jamlSource", 1);
        }
        return retval;
    }
    // $ANTLR end "jamlSource"

    public static class element_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // ../etc/Jaml.g:62:1: element returns [String rendering] : elementDeclaration ( freeformText | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) ;
    public final JamlParser.element_return element() throws RecognitionException {
    traceIn("element", 2);
        JamlParser.element_return retval = new JamlParser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE4=null;
        Token FORWARD_SLASH6=null;
        Token NEWLINE7=null;
        JamlParser.elementDeclaration_return elementDeclaration2 = null;

        JamlParser.freeformText_return freeformText3 = null;

        JamlParser.content_return content5 = null;


        CommonTree NEWLINE4_tree=null;
        CommonTree FORWARD_SLASH6_tree=null;
        CommonTree NEWLINE7_tree=null;


          	String content = ""; 
          	boolean selfClosing=false;
          
        try {
            // ../etc/Jaml.g:67:3: ( elementDeclaration ( freeformText | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) )
            // ../etc/Jaml.g:68:3: elementDeclaration ( freeformText | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elementDeclaration_in_element126);
            elementDeclaration2=elementDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, elementDeclaration2.getTree());
            // ../etc/Jaml.g:69:4: ( freeformText | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
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
                    // ../etc/Jaml.g:69:6: freeformText
                    {
                    pushFollow(FOLLOW_freeformText_in_element134);
                    freeformText3=freeformText();

                    state._fsp--;

                    adaptor.addChild(root_0, freeformText3.getTree());
                    content = (freeformText3!=null?freeformText3.rendering:null);

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:70:6: NEWLINE ( content )?
                    {
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element146); 
                    NEWLINE4_tree = (CommonTree)adaptor.create(NEWLINE4);
                    adaptor.addChild(root_0, NEWLINE4_tree);

                    // ../etc/Jaml.g:70:14: ( content )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==INDENT) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../etc/Jaml.g:70:15: content
                            {
                            pushFollow(FOLLOW_content_in_element149);
                            content5=content();

                            state._fsp--;

                            adaptor.addChild(root_0, content5.getTree());
                            content = (content5!=null?content5.rendering:null);

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:71:6: FORWARD_SLASH NEWLINE
                    {
                    FORWARD_SLASH6=(Token)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_element162); 
                    FORWARD_SLASH6_tree = (CommonTree)adaptor.create(FORWARD_SLASH6);
                    adaptor.addChild(root_0, FORWARD_SLASH6_tree);

                    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element164); 
                    NEWLINE7_tree = (CommonTree)adaptor.create(NEWLINE7);
                    adaptor.addChild(root_0, NEWLINE7_tree);

                    selfClosing = true;

                    }
                    break;

            }

            retval.rendering = util.elem((elementDeclaration2!=null?elementDeclaration2.type:null), (elementDeclaration2!=null?elementDeclaration2.attrMap:null), content, selfClosing);

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
    // ../etc/Jaml.g:75:1: line returns [String rendering] : ( element | freeformText | NEWLINE );
    public final JamlParser.line_return line() throws RecognitionException {
    traceIn("line", 3);
        JamlParser.line_return retval = new JamlParser.line_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE10=null;
        JamlParser.element_return element8 = null;

        JamlParser.freeformText_return freeformText9 = null;


        CommonTree NEWLINE10_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:75:60: ( element | freeformText | NEWLINE )
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
                    // ../etc/Jaml.g:76:3: element
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_element_in_line193);
                    element8=element();

                    state._fsp--;

                    adaptor.addChild(root_0, element8.getTree());
                    retval.rendering = (element8!=null?element8.rendering:null);

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:77:5: freeformText
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_freeformText_in_line201);
                    freeformText9=freeformText();

                    state._fsp--;

                    adaptor.addChild(root_0, freeformText9.getTree());
                    retval.rendering = (freeformText9!=null?freeformText9.rendering:null);

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:78:5: NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_line209); 
                    NEWLINE10_tree = (CommonTree)adaptor.create(NEWLINE10);
                    adaptor.addChild(root_0, NEWLINE10_tree);


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

    public static class freeformText_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "freeformText"
    // ../etc/Jaml.g:81:1: freeformText returns [String rendering] : TEXT NEWLINE ( content )? ;
    public final JamlParser.freeformText_return freeformText() throws RecognitionException {
    traceIn("freeformText", 4);
        JamlParser.freeformText_return retval = new JamlParser.freeformText_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT11=null;
        Token NEWLINE12=null;
        JamlParser.content_return content13 = null;


        CommonTree TEXT11_tree=null;
        CommonTree NEWLINE12_tree=null;

        try {
            // ../etc/Jaml.g:81:40: ( TEXT NEWLINE ( content )? )
            // ../etc/Jaml.g:82:3: TEXT NEWLINE ( content )?
            {
            root_0 = (CommonTree)adaptor.nil();

            TEXT11=(Token)match(input,TEXT,FOLLOW_TEXT_in_freeformText227); 
            TEXT11_tree = (CommonTree)adaptor.create(TEXT11);
            adaptor.addChild(root_0, TEXT11_tree);

            NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_freeformText229); 
            NEWLINE12_tree = (CommonTree)adaptor.create(NEWLINE12);
            adaptor.addChild(root_0, NEWLINE12_tree);

            String txt = (TEXT11!=null?TEXT11.getText():null);
            // ../etc/Jaml.g:83:3: ( content )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INDENT) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../etc/Jaml.g:83:4: content
                    {
                    pushFollow(FOLLOW_content_in_freeformText236);
                    content13=content();

                    state._fsp--;

                    adaptor.addChild(root_0, content13.getTree());
                    txt += (content13!=null?content13.rendering:null);

                    }
                    break;

            }

            retval.rendering = util.parseFreeFormText(txt);

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
    traceOut("freeformText", 4);
        }
        return retval;
    }
    // $ANTLR end "freeformText"

    public static class elementDeclaration_return extends ParserRuleReturnScope {
        public String type;
        public Map<String,String> attrMap;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementDeclaration"
    // ../etc/Jaml.g:86:1: elementDeclaration returns [String type, Map<String,String> attrMap] : ( (a1= divAttrs[ids,classes] ( attrHash[$attrMap] )? ) | (a2= attrs[ids,classes] ( attrHash[$attrMap] )? ) );
    public final JamlParser.elementDeclaration_return elementDeclaration() throws RecognitionException {
    traceIn("elementDeclaration", 5);
        JamlParser.elementDeclaration_return retval = new JamlParser.elementDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.divAttrs_return a1 = null;

        JamlParser.attrs_return a2 = null;

        JamlParser.attrHash_return attrHash14 = null;

        JamlParser.attrHash_return attrHash15 = null;




          	retval.attrMap = new LinkedHashMap<String,String>();
          	List<String> ids = new ArrayList<String>();
          	List<String> classes = new ArrayList<String>();
          
        try {
            // ../etc/Jaml.g:94:4: ( (a1= divAttrs[ids,classes] ( attrHash[$attrMap] )? ) | (a2= attrs[ids,classes] ( attrHash[$attrMap] )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=POUND && LA8_0<=DOT)) ) {
                alt8=1;
            }
            else if ( (LA8_0==PERCENT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../etc/Jaml.g:95:3: (a1= divAttrs[ids,classes] ( attrHash[$attrMap] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:95:3: (a1= divAttrs[ids,classes] ( attrHash[$attrMap] )? )
                    // ../etc/Jaml.g:95:4: a1= divAttrs[ids,classes] ( attrHash[$attrMap] )?
                    {
                    pushFollow(FOLLOW_divAttrs_in_elementDeclaration282);
                    a1=divAttrs(ids, classes);

                    state._fsp--;

                    adaptor.addChild(root_0, a1.getTree());
                    retval.type = "div";
                    // ../etc/Jaml.g:95:46: ( attrHash[$attrMap] )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==BEGIN_HASH) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../etc/Jaml.g:95:46: attrHash[$attrMap]
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration287);
                            attrHash14=attrHash(retval.attrMap);

                            state._fsp--;

                            adaptor.addChild(root_0, attrHash14.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:97:2: (a2= attrs[ids,classes] ( attrHash[$attrMap] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:97:2: (a2= attrs[ids,classes] ( attrHash[$attrMap] )? )
                    // ../etc/Jaml.g:97:3: a2= attrs[ids,classes] ( attrHash[$attrMap] )?
                    {
                    pushFollow(FOLLOW_attrs_in_elementDeclaration299);
                    a2=attrs(ids, classes);

                    state._fsp--;

                    adaptor.addChild(root_0, a2.getTree());
                    retval.type = (a2!=null?a2.type:null);
                    // ../etc/Jaml.g:98:3: ( attrHash[$attrMap] )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==BEGIN_HASH) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../etc/Jaml.g:98:3: attrHash[$attrMap]
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration307);
                            attrHash15=attrHash(retval.attrMap);

                            state._fsp--;

                            adaptor.addChild(root_0, attrHash15.getTree());

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


              	util.mergeAttributes(retval.attrMap, ids, classes);
              
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("elementDeclaration", 5);
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
    // ../etc/Jaml.g:101:1: content returns [String rendering] : INDENT (e1= element | freeformText )+ DEDENT ;
    public final JamlParser.content_return content() throws RecognitionException {
    traceIn("content", 6);
        JamlParser.content_return retval = new JamlParser.content_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INDENT16=null;
        Token DEDENT18=null;
        JamlParser.element_return e1 = null;

        JamlParser.freeformText_return freeformText17 = null;


        CommonTree INDENT16_tree=null;
        CommonTree DEDENT18_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:101:63: ( INDENT (e1= element | freeformText )+ DEDENT )
            // ../etc/Jaml.g:102:1: INDENT (e1= element | freeformText )+ DEDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            INDENT16=(Token)match(input,INDENT,FOLLOW_INDENT_in_content330); 
            INDENT16_tree = (CommonTree)adaptor.create(INDENT16);
            adaptor.addChild(root_0, INDENT16_tree);

            // ../etc/Jaml.g:103:2: (e1= element | freeformText )+
            int cnt9=0;
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==PERCENT||(LA9_0>=POUND && LA9_0<=DOT)) ) {
                    alt9=1;
                }
                else if ( (LA9_0==TEXT) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../etc/Jaml.g:103:3: e1= element
            	    {
            	    pushFollow(FOLLOW_element_in_content337);
            	    e1=element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e1.getTree());
            	    retval.rendering += (e1!=null?e1.rendering:null) + "\n";

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:104:3: freeformText
            	    {
            	    pushFollow(FOLLOW_freeformText_in_content346);
            	    freeformText17=freeformText();

            	    state._fsp--;

            	    adaptor.addChild(root_0, freeformText17.getTree());
            	    retval.rendering += (freeformText17!=null?freeformText17.rendering:null) + "\n";

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

            DEDENT18=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_content352); 
            DEDENT18_tree = (CommonTree)adaptor.create(DEDENT18);
            adaptor.addChild(root_0, DEDENT18_tree);

            retval.rendering = "\n" + util.indent(util.stripTrailingNewline(retval.rendering)) + "\n";

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
    traceOut("content", 6);
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
    // ../etc/Jaml.g:109:1: attrs[List<String> ids, List<String> classes] returns [String type] : PERCENT ID ( idSpecifier | classSpecifier )* ;
    public final JamlParser.attrs_return attrs(List<String> ids, List<String> classes) throws RecognitionException {
    traceIn("attrs", 7);
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
            // ../etc/Jaml.g:109:68: ( PERCENT ID ( idSpecifier | classSpecifier )* )
            // ../etc/Jaml.g:110:1: PERCENT ID ( idSpecifier | classSpecifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            PERCENT19=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_attrs367); 
            PERCENT19_tree = (CommonTree)adaptor.create(PERCENT19);
            adaptor.addChild(root_0, PERCENT19_tree);

            ID20=(Token)match(input,ID,FOLLOW_ID_in_attrs369); 
            ID20_tree = (CommonTree)adaptor.create(ID20);
            adaptor.addChild(root_0, ID20_tree);

            retval.type = (ID20!=null?ID20.getText():null);
            // ../etc/Jaml.g:111:1: ( idSpecifier | classSpecifier )*
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
            	    // ../etc/Jaml.g:111:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_attrs374);
            	    idSpecifier21=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier21.getTree());
            	    ids.add((idSpecifier21!=null?idSpecifier21.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:112:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_attrs381);
            	    classSpecifier22=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier22.getTree());
            	    classes.add((classSpecifier22!=null?classSpecifier22.klass:null));

            	    }
            	    break;

            	default :
            	    break loop10;
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
    traceOut("attrs", 7);
        }
        return retval;
    }
    // $ANTLR end "attrs"

    public static class divAttrs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "divAttrs"
    // ../etc/Jaml.g:114:1: divAttrs[List<String> ids, List<String> classes] : ( idSpecifier | classSpecifier )+ ;
    public final JamlParser.divAttrs_return divAttrs(List<String> ids, List<String> classes) throws RecognitionException {
    traceIn("divAttrs", 8);
        JamlParser.divAttrs_return retval = new JamlParser.divAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.idSpecifier_return idSpecifier23 = null;

        JamlParser.classSpecifier_return classSpecifier24 = null;



        try {
            // ../etc/Jaml.g:114:50: ( ( idSpecifier | classSpecifier )+ )
            // ../etc/Jaml.g:115:1: ( idSpecifier | classSpecifier )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:115:1: ( idSpecifier | classSpecifier )+
            int cnt11=0;
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==POUND) ) {
                    alt11=1;
                }
                else if ( (LA11_0==DOT) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../etc/Jaml.g:115:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_divAttrs395);
            	    idSpecifier23=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier23.getTree());
            	    ids.add((idSpecifier23!=null?idSpecifier23.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:116:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_divAttrs402);
            	    classSpecifier24=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier24.getTree());
            	    classes.add((classSpecifier24!=null?classSpecifier24.klass:null));

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    traceOut("divAttrs", 8);
        }
        return retval;
    }
    // $ANTLR end "divAttrs"

    public static class attrHash_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrHash"
    // ../etc/Jaml.g:118:1: attrHash[Map<String,String> attrMap] : BEGIN_HASH hashAttrs END_HASH ;
    public final JamlParser.attrHash_return attrHash(Map<String,String> attrMap) throws RecognitionException {
    traceIn("attrHash", 9);
        JamlParser.attrHash_return retval = new JamlParser.attrHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN_HASH25=null;
        Token END_HASH27=null;
        JamlParser.hashAttrs_return hashAttrs26 = null;


        CommonTree BEGIN_HASH25_tree=null;
        CommonTree END_HASH27_tree=null;

        try {
            // ../etc/Jaml.g:118:38: ( BEGIN_HASH hashAttrs END_HASH )
            // ../etc/Jaml.g:119:3: BEGIN_HASH hashAttrs END_HASH
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN_HASH25=(Token)match(input,BEGIN_HASH,FOLLOW_BEGIN_HASH_in_attrHash417); 
            BEGIN_HASH25_tree = (CommonTree)adaptor.create(BEGIN_HASH25);
            adaptor.addChild(root_0, BEGIN_HASH25_tree);

            System.out.println("BEGIN " + input.toString(retval.start,input.LT(-1)));
            pushFollow(FOLLOW_hashAttrs_in_attrHash423);
            hashAttrs26=hashAttrs();

            state._fsp--;

            adaptor.addChild(root_0, hashAttrs26.getTree());
            END_HASH27=(Token)match(input,END_HASH,FOLLOW_END_HASH_in_attrHash428); 
            END_HASH27_tree = (CommonTree)adaptor.create(END_HASH27);
            adaptor.addChild(root_0, END_HASH27_tree);

            util.parseAttrHash((hashAttrs26!=null?hashAttrs26.contents:null), attrMap);

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
    traceOut("attrHash", 9);
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
    // ../etc/Jaml.g:123:1: hashAttrs returns [String contents] : ( notEndHash )* ;
    public final JamlParser.hashAttrs_return hashAttrs() throws RecognitionException {
    traceIn("hashAttrs", 10);
        JamlParser.hashAttrs_return retval = new JamlParser.hashAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.notEndHash_return notEndHash28 = null;



        retval.contents ="";
        try {
            // ../etc/Jaml.g:123:59: ( ( notEndHash )* )
            // ../etc/Jaml.g:124:1: ( notEndHash )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:124:1: ( notEndHash )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=INDENT && LA12_0<=BEGIN_HASH)||(LA12_0>=POUND && LA12_0<=JAVA_RBRACE)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../etc/Jaml.g:124:2: notEndHash
            	    {
            	    pushFollow(FOLLOW_notEndHash_in_hashAttrs448);
            	    notEndHash28=notEndHash();

            	    state._fsp--;

            	    adaptor.addChild(root_0, notEndHash28.getTree());
            	    retval.contents += (notEndHash28!=null?input.toString(notEndHash28.start,notEndHash28.stop):null);

            	    }
            	    break;

            	default :
            	    break loop12;
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
    traceOut("hashAttrs", 10);
        }
        return retval;
    }
    // $ANTLR end "hashAttrs"

    public static class notEndHash_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notEndHash"
    // ../etc/Jaml.g:126:1: notEndHash : (~ END_HASH ) ;
    public final JamlParser.notEndHash_return notEndHash() throws RecognitionException {
    traceIn("notEndHash", 11);
        JamlParser.notEndHash_return retval = new JamlParser.notEndHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set29=null;

        CommonTree set29_tree=null;

        try {
            // ../etc/Jaml.g:126:12: ( (~ END_HASH ) )
            // ../etc/Jaml.g:126:14: (~ END_HASH )
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:126:14: (~ END_HASH )
            // ../etc/Jaml.g:126:15: ~ END_HASH
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
    traceOut("notEndHash", 11);
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
    // ../etc/Jaml.g:128:1: idSpecifier returns [String id] : POUND ID ;
    public final JamlParser.idSpecifier_return idSpecifier() throws RecognitionException {
    traceIn("idSpecifier", 12);
        JamlParser.idSpecifier_return retval = new JamlParser.idSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POUND30=null;
        Token ID31=null;

        CommonTree POUND30_tree=null;
        CommonTree ID31_tree=null;

        try {
            // ../etc/Jaml.g:128:32: ( POUND ID )
            // ../etc/Jaml.g:128:34: POUND ID
            {
            root_0 = (CommonTree)adaptor.nil();

            POUND30=(Token)match(input,POUND,FOLLOW_POUND_in_idSpecifier476); 
            POUND30_tree = (CommonTree)adaptor.create(POUND30);
            adaptor.addChild(root_0, POUND30_tree);

            ID31=(Token)match(input,ID,FOLLOW_ID_in_idSpecifier478); 
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
    traceOut("idSpecifier", 12);
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
    // ../etc/Jaml.g:130:1: classSpecifier returns [String klass] : DOT ID ;
    public final JamlParser.classSpecifier_return classSpecifier() throws RecognitionException {
    traceIn("classSpecifier", 13);
        JamlParser.classSpecifier_return retval = new JamlParser.classSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT32=null;
        Token ID33=null;

        CommonTree DOT32_tree=null;
        CommonTree ID33_tree=null;

        try {
            // ../etc/Jaml.g:130:38: ( DOT ID )
            // ../etc/Jaml.g:131:1: DOT ID
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT32=(Token)match(input,DOT,FOLLOW_DOT_in_classSpecifier491); 
            DOT32_tree = (CommonTree)adaptor.create(DOT32);
            adaptor.addChild(root_0, DOT32_tree);

            ID33=(Token)match(input,ID,FOLLOW_ID_in_classSpecifier493); 
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
    traceOut("classSpecifier", 13);
        }
        return retval;
    }
    // $ANTLR end "classSpecifier"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_jamlSource98 = new BitSet(new long[]{0x0000000000006342L});
    public static final BitSet FOLLOW_elementDeclaration_in_element126 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_freeformText_in_element134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_element146 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_content_in_element149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_element162 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_element164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_line193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_freeformText_in_line201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_line209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_freeformText227 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_freeformText229 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_content_in_freeformText236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divAttrs_in_elementDeclaration282 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrs_in_elementDeclaration299 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_content330 = new BitSet(new long[]{0x0000000000006300L});
    public static final BitSet FOLLOW_element_in_content337 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_freeformText_in_content346 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_DEDENT_in_content352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_attrs367 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_attrs369 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_idSpecifier_in_attrs374 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_classSpecifier_in_attrs381 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_idSpecifier_in_divAttrs395 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_classSpecifier_in_divAttrs402 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_BEGIN_HASH_in_attrHash417 = new BitSet(new long[]{0x00000001FFFFFFF0L});
    public static final BitSet FOLLOW_hashAttrs_in_attrHash423 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_HASH_in_attrHash428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notEndHash_in_hashAttrs448 = new BitSet(new long[]{0x00000001FFFFEFF2L});
    public static final BitSet FOLLOW_set_in_notEndHash461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_idSpecifier476 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idSpecifier478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_classSpecifier491 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classSpecifier493 = new BitSet(new long[]{0x0000000000000002L});

}