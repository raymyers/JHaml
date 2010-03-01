// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-28 17:49:27

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
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line1.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.rendering += (line1!=null?line1.rendering:null) + "\n";
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
    // ../etc/Jaml.g:62:1: element returns [String rendering] : elementDeclaration ( freeformText[false] | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) ;
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
            // ../etc/Jaml.g:67:3: ( elementDeclaration ( freeformText[false] | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) )
            // ../etc/Jaml.g:68:3: elementDeclaration ( freeformText[false] | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elementDeclaration_in_element126);
            elementDeclaration2=elementDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementDeclaration2.getTree());
            // ../etc/Jaml.g:69:4: ( freeformText[false] | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
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
                    // ../etc/Jaml.g:69:6: freeformText[false]
                    {
                    pushFollow(FOLLOW_freeformText_in_element134);
                    freeformText3=freeformText(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, freeformText3.getTree());
                    if ( state.backtracking==0 ) {
                      content = (freeformText3!=null?freeformText3.rendering:null);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:70:6: NEWLINE ( content )?
                    {
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element147); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE4_tree = (CommonTree)adaptor.create(NEWLINE4);
                    adaptor.addChild(root_0, NEWLINE4_tree);
                    }
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
                            pushFollow(FOLLOW_content_in_element150);
                            content5=content();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, content5.getTree());
                            if ( state.backtracking==0 ) {
                              content = (content5!=null?content5.rendering:null);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:71:6: FORWARD_SLASH NEWLINE
                    {
                    FORWARD_SLASH6=(Token)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_element163); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FORWARD_SLASH6_tree = (CommonTree)adaptor.create(FORWARD_SLASH6);
                    adaptor.addChild(root_0, FORWARD_SLASH6_tree);
                    }
                    NEWLINE7=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element165); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE7_tree = (CommonTree)adaptor.create(NEWLINE7);
                    adaptor.addChild(root_0, NEWLINE7_tree);
                    }
                    if ( state.backtracking==0 ) {
                      selfClosing = true;
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              retval.rendering = util.elem((elementDeclaration2!=null?elementDeclaration2.type:null), (elementDeclaration2!=null?elementDeclaration2.attrMap:null), content, selfClosing);
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
    // ../etc/Jaml.g:75:1: line returns [String rendering] : ( element | freeformText[true] | NEWLINE );
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
            // ../etc/Jaml.g:75:60: ( element | freeformText[true] | NEWLINE )
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
                    // ../etc/Jaml.g:76:3: element
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_element_in_line194);
                    element8=element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, element8.getTree());
                    if ( state.backtracking==0 ) {
                      retval.rendering = (element8!=null?element8.rendering:null);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:77:5: freeformText[true]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_freeformText_in_line202);
                    freeformText9=freeformText(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, freeformText9.getTree());
                    if ( state.backtracking==0 ) {
                      retval.rendering = (freeformText9!=null?freeformText9.rendering:null);
                    }

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:78:5: NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_line211); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE10_tree = (CommonTree)adaptor.create(NEWLINE10);
                    adaptor.addChild(root_0, NEWLINE10_tree);
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

    public static class freeformText_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "freeformText"
    // ../etc/Jaml.g:81:1: freeformText[boolean beginningOfLine] returns [String rendering] : TEXT NEWLINE ( content )? ;
    public final JamlParser.freeformText_return freeformText(boolean beginningOfLine) throws RecognitionException {
    traceIn("freeformText", 4);
        JamlParser.freeformText_return retval = new JamlParser.freeformText_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT11=null;
        Token NEWLINE12=null;
        JamlParser.content_return content13 = null;


        CommonTree TEXT11_tree=null;
        CommonTree NEWLINE12_tree=null;

        String txt = "";
        try {
            // ../etc/Jaml.g:81:90: ( TEXT NEWLINE ( content )? )
            // ../etc/Jaml.g:82:3: TEXT NEWLINE ( content )?
            {
            root_0 = (CommonTree)adaptor.nil();

            TEXT11=(Token)match(input,TEXT,FOLLOW_TEXT_in_freeformText235); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TEXT11_tree = (CommonTree)adaptor.create(TEXT11);
            adaptor.addChild(root_0, TEXT11_tree);
            }
            NEWLINE12=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_freeformText237); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            NEWLINE12_tree = (CommonTree)adaptor.create(NEWLINE12);
            adaptor.addChild(root_0, NEWLINE12_tree);
            }
            if ( state.backtracking==0 ) {
              txt = (TEXT11!=null?TEXT11.getText():null);
            }
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
                    pushFollow(FOLLOW_content_in_freeformText244);
                    content13=content();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, content13.getTree());
                    if ( state.backtracking==0 ) {

                          if (beginningOfLine && txt.startsWith(":")) {
                          	int contentPos = (content13!=null?((Token)content13.start):null).getCharPositionInLine();
                          	txt = txt + (NEWLINE12!=null?NEWLINE12.getText():null) + util.spaces(contentPos) + (content13!=null?input.toString(content13.start,content13.stop):null);
                          } else {
                          	txt += (content13!=null?content13.rendering:null);
                          }
                        
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              retval.rendering = util.parseFreeFormText(txt);
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
    // ../etc/Jaml.g:93:1: elementDeclaration returns [String type, Map<String,String> attrMap] : ( (a1= divAttrs[ids,classes] ( attrHash[$attrMap] )? ) | (a2= attrs[ids,classes] ( attrHash[$attrMap] )? ) );
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
            // ../etc/Jaml.g:101:4: ( (a1= divAttrs[ids,classes] ( attrHash[$attrMap] )? ) | (a2= attrs[ids,classes] ( attrHash[$attrMap] )? ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=POUND && LA8_0<=DOT)) ) {
                alt8=1;
            }
            else if ( (LA8_0==PERCENT) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../etc/Jaml.g:102:3: (a1= divAttrs[ids,classes] ( attrHash[$attrMap] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:102:3: (a1= divAttrs[ids,classes] ( attrHash[$attrMap] )? )
                    // ../etc/Jaml.g:102:4: a1= divAttrs[ids,classes] ( attrHash[$attrMap] )?
                    {
                    pushFollow(FOLLOW_divAttrs_in_elementDeclaration290);
                    a1=divAttrs(ids, classes);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, a1.getTree());
                    if ( state.backtracking==0 ) {
                      retval.type = "div";
                    }
                    // ../etc/Jaml.g:102:46: ( attrHash[$attrMap] )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==BEGIN_HASH) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../etc/Jaml.g:102:46: attrHash[$attrMap]
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration295);
                            attrHash14=attrHash(retval.attrMap);

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attrHash14.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:104:2: (a2= attrs[ids,classes] ( attrHash[$attrMap] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:104:2: (a2= attrs[ids,classes] ( attrHash[$attrMap] )? )
                    // ../etc/Jaml.g:104:3: a2= attrs[ids,classes] ( attrHash[$attrMap] )?
                    {
                    pushFollow(FOLLOW_attrs_in_elementDeclaration307);
                    a2=attrs(ids, classes);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, a2.getTree());
                    if ( state.backtracking==0 ) {
                      retval.type = (a2!=null?a2.type:null);
                    }
                    // ../etc/Jaml.g:105:3: ( attrHash[$attrMap] )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==BEGIN_HASH) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../etc/Jaml.g:105:3: attrHash[$attrMap]
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration315);
                            attrHash15=attrHash(retval.attrMap);

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attrHash15.getTree());

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
            if ( state.backtracking==0 ) {

                	util.mergeAttributes(retval.attrMap, ids, classes);
                
            }
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
    // ../etc/Jaml.g:108:1: content returns [String rendering] : INDENT (e1= element | freeformText[true] | ( blankLines )=> blankLines )+ DEDENT ;
    public final JamlParser.content_return content() throws RecognitionException {
    traceIn("content", 6);
        JamlParser.content_return retval = new JamlParser.content_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INDENT16=null;
        Token DEDENT19=null;
        JamlParser.element_return e1 = null;

        JamlParser.freeformText_return freeformText17 = null;

        JamlParser.blankLines_return blankLines18 = null;


        CommonTree INDENT16_tree=null;
        CommonTree DEDENT19_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:108:63: ( INDENT (e1= element | freeformText[true] | ( blankLines )=> blankLines )+ DEDENT )
            // ../etc/Jaml.g:109:1: INDENT (e1= element | freeformText[true] | ( blankLines )=> blankLines )+ DEDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            INDENT16=(Token)match(input,INDENT,FOLLOW_INDENT_in_content338); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INDENT16_tree = (CommonTree)adaptor.create(INDENT16);
            adaptor.addChild(root_0, INDENT16_tree);
            }
            // ../etc/Jaml.g:110:2: (e1= element | freeformText[true] | ( blankLines )=> blankLines )+
            int cnt9=0;
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case DEDENT:
                    {
                    int LA9_1 = input.LA(2);

                    if ( (synpred1_Jaml()) ) {
                        alt9=3;
                    }


                    }
                    break;
                case PERCENT:
                case POUND:
                case DOT:
                    {
                    alt9=1;
                    }
                    break;
                case TEXT:
                    {
                    alt9=2;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../etc/Jaml.g:110:4: e1= element
            	    {
            	    pushFollow(FOLLOW_element_in_content346);
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
            	    // ../etc/Jaml.g:111:3: freeformText[true]
            	    {
            	    pushFollow(FOLLOW_freeformText_in_content355);
            	    freeformText17=freeformText(true);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, freeformText17.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.rendering += (freeformText17!=null?freeformText17.rendering:null) + "\n";
            	    }

            	    }
            	    break;
            	case 3 :
            	    // ../etc/Jaml.g:112:3: ( blankLines )=> blankLines
            	    {
            	    pushFollow(FOLLOW_blankLines_in_content370);
            	    blankLines18=blankLines();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blankLines18.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            DEDENT19=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_content375); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEDENT19_tree = (CommonTree)adaptor.create(DEDENT19);
            adaptor.addChild(root_0, DEDENT19_tree);
            }
            if ( state.backtracking==0 ) {
              retval.rendering = "\n" + util.indent(util.stripTrailingNewline(retval.rendering)) + "\n";
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
    traceOut("content", 6);
        }
        return retval;
    }
    // $ANTLR end "content"

    public static class blankLines_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "blankLines"
    // ../etc/Jaml.g:117:1: blankLines : DEDENT ( ( NEWLINE )+ | blankLines ) INDENT ;
    public final JamlParser.blankLines_return blankLines() throws RecognitionException {
    traceIn("blankLines", 7);
        JamlParser.blankLines_return retval = new JamlParser.blankLines_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEDENT20=null;
        Token NEWLINE21=null;
        Token INDENT23=null;
        JamlParser.blankLines_return blankLines22 = null;


        CommonTree DEDENT20_tree=null;
        CommonTree NEWLINE21_tree=null;
        CommonTree INDENT23_tree=null;

        try {
            // ../etc/Jaml.g:117:12: ( DEDENT ( ( NEWLINE )+ | blankLines ) INDENT )
            // ../etc/Jaml.g:117:14: DEDENT ( ( NEWLINE )+ | blankLines ) INDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            DEDENT20=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_blankLines386); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEDENT20_tree = (CommonTree)adaptor.create(DEDENT20);
            adaptor.addChild(root_0, DEDENT20_tree);
            }
            // ../etc/Jaml.g:117:21: ( ( NEWLINE )+ | blankLines )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==NEWLINE) ) {
                alt11=1;
            }
            else if ( (LA11_0==DEDENT) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../etc/Jaml.g:117:22: ( NEWLINE )+
                    {
                    // ../etc/Jaml.g:117:22: ( NEWLINE )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==NEWLINE) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../etc/Jaml.g:117:22: NEWLINE
                    	    {
                    	    NEWLINE21=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_blankLines389); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NEWLINE21_tree = (CommonTree)adaptor.create(NEWLINE21);
                    	    adaptor.addChild(root_0, NEWLINE21_tree);
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
                    break;
                case 2 :
                    // ../etc/Jaml.g:117:33: blankLines
                    {
                    pushFollow(FOLLOW_blankLines_in_blankLines394);
                    blankLines22=blankLines();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blankLines22.getTree());

                    }
                    break;

            }

            INDENT23=(Token)match(input,INDENT,FOLLOW_INDENT_in_blankLines397); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INDENT23_tree = (CommonTree)adaptor.create(INDENT23);
            adaptor.addChild(root_0, INDENT23_tree);
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
    traceOut("blankLines", 7);
        }
        return retval;
    }
    // $ANTLR end "blankLines"

    public static class attrs_return extends ParserRuleReturnScope {
        public String type;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrs"
    // ../etc/Jaml.g:119:1: attrs[List<String> ids, List<String> classes] returns [String type] : PERCENT ID ( idSpecifier | classSpecifier )* ;
    public final JamlParser.attrs_return attrs(List<String> ids, List<String> classes) throws RecognitionException {
    traceIn("attrs", 8);
        JamlParser.attrs_return retval = new JamlParser.attrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERCENT24=null;
        Token ID25=null;
        JamlParser.idSpecifier_return idSpecifier26 = null;

        JamlParser.classSpecifier_return classSpecifier27 = null;


        CommonTree PERCENT24_tree=null;
        CommonTree ID25_tree=null;

        try {
            // ../etc/Jaml.g:119:68: ( PERCENT ID ( idSpecifier | classSpecifier )* )
            // ../etc/Jaml.g:120:1: PERCENT ID ( idSpecifier | classSpecifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            PERCENT24=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_attrs409); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PERCENT24_tree = (CommonTree)adaptor.create(PERCENT24);
            adaptor.addChild(root_0, PERCENT24_tree);
            }
            ID25=(Token)match(input,ID,FOLLOW_ID_in_attrs411); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID25_tree = (CommonTree)adaptor.create(ID25);
            adaptor.addChild(root_0, ID25_tree);
            }
            if ( state.backtracking==0 ) {
              retval.type = (ID25!=null?ID25.getText():null);
            }
            // ../etc/Jaml.g:121:1: ( idSpecifier | classSpecifier )*
            loop12:
            do {
                int alt12=3;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==POUND) ) {
                    alt12=1;
                }
                else if ( (LA12_0==DOT) ) {
                    alt12=2;
                }


                switch (alt12) {
            	case 1 :
            	    // ../etc/Jaml.g:121:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_attrs416);
            	    idSpecifier26=idSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, idSpecifier26.getTree());
            	    if ( state.backtracking==0 ) {
            	      ids.add((idSpecifier26!=null?idSpecifier26.id:null));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:122:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_attrs423);
            	    classSpecifier27=classSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classSpecifier27.getTree());
            	    if ( state.backtracking==0 ) {
            	      classes.add((classSpecifier27!=null?classSpecifier27.klass:null));
            	    }

            	    }
            	    break;

            	default :
            	    break loop12;
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
    traceOut("attrs", 8);
        }
        return retval;
    }
    // $ANTLR end "attrs"

    public static class divAttrs_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "divAttrs"
    // ../etc/Jaml.g:124:1: divAttrs[List<String> ids, List<String> classes] : ( idSpecifier | classSpecifier )+ ;
    public final JamlParser.divAttrs_return divAttrs(List<String> ids, List<String> classes) throws RecognitionException {
    traceIn("divAttrs", 9);
        JamlParser.divAttrs_return retval = new JamlParser.divAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.idSpecifier_return idSpecifier28 = null;

        JamlParser.classSpecifier_return classSpecifier29 = null;



        try {
            // ../etc/Jaml.g:124:50: ( ( idSpecifier | classSpecifier )+ )
            // ../etc/Jaml.g:125:1: ( idSpecifier | classSpecifier )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:125:1: ( idSpecifier | classSpecifier )+
            int cnt13=0;
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==POUND) ) {
                    alt13=1;
                }
                else if ( (LA13_0==DOT) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // ../etc/Jaml.g:125:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_divAttrs437);
            	    idSpecifier28=idSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, idSpecifier28.getTree());
            	    if ( state.backtracking==0 ) {
            	      ids.add((idSpecifier28!=null?idSpecifier28.id:null));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:126:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_divAttrs444);
            	    classSpecifier29=classSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classSpecifier29.getTree());
            	    if ( state.backtracking==0 ) {
            	      classes.add((classSpecifier29!=null?classSpecifier29.klass:null));
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    traceOut("divAttrs", 9);
        }
        return retval;
    }
    // $ANTLR end "divAttrs"

    public static class attrHash_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrHash"
    // ../etc/Jaml.g:128:1: attrHash[Map<String,String> attrMap] : BEGIN_HASH hashAttrs END_HASH ;
    public final JamlParser.attrHash_return attrHash(Map<String,String> attrMap) throws RecognitionException {
    traceIn("attrHash", 10);
        JamlParser.attrHash_return retval = new JamlParser.attrHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN_HASH30=null;
        Token END_HASH32=null;
        JamlParser.hashAttrs_return hashAttrs31 = null;


        CommonTree BEGIN_HASH30_tree=null;
        CommonTree END_HASH32_tree=null;

        try {
            // ../etc/Jaml.g:128:38: ( BEGIN_HASH hashAttrs END_HASH )
            // ../etc/Jaml.g:129:3: BEGIN_HASH hashAttrs END_HASH
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN_HASH30=(Token)match(input,BEGIN_HASH,FOLLOW_BEGIN_HASH_in_attrHash459); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BEGIN_HASH30_tree = (CommonTree)adaptor.create(BEGIN_HASH30);
            adaptor.addChild(root_0, BEGIN_HASH30_tree);
            }
            if ( state.backtracking==0 ) {
              System.out.println("BEGIN " + input.toString(retval.start,input.LT(-1)));
            }
            pushFollow(FOLLOW_hashAttrs_in_attrHash465);
            hashAttrs31=hashAttrs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, hashAttrs31.getTree());
            END_HASH32=(Token)match(input,END_HASH,FOLLOW_END_HASH_in_attrHash470); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END_HASH32_tree = (CommonTree)adaptor.create(END_HASH32);
            adaptor.addChild(root_0, END_HASH32_tree);
            }
            if ( state.backtracking==0 ) {
              util.parseAttrHash((hashAttrs31!=null?hashAttrs31.contents:null), attrMap);
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
    traceOut("attrHash", 10);
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
    // ../etc/Jaml.g:133:1: hashAttrs returns [String contents] : ( notEndHash )* ;
    public final JamlParser.hashAttrs_return hashAttrs() throws RecognitionException {
    traceIn("hashAttrs", 11);
        JamlParser.hashAttrs_return retval = new JamlParser.hashAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.notEndHash_return notEndHash33 = null;



        retval.contents ="";
        try {
            // ../etc/Jaml.g:133:59: ( ( notEndHash )* )
            // ../etc/Jaml.g:134:1: ( notEndHash )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:134:1: ( notEndHash )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=INDENT && LA14_0<=BEGIN_HASH)||(LA14_0>=POUND && LA14_0<=JAVA_RBRACE)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../etc/Jaml.g:134:2: notEndHash
            	    {
            	    pushFollow(FOLLOW_notEndHash_in_hashAttrs490);
            	    notEndHash33=notEndHash();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, notEndHash33.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.contents += (notEndHash33!=null?input.toString(notEndHash33.start,notEndHash33.stop):null);
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
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
    traceOut("hashAttrs", 11);
        }
        return retval;
    }
    // $ANTLR end "hashAttrs"

    public static class notEndHash_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notEndHash"
    // ../etc/Jaml.g:136:1: notEndHash : (~ END_HASH ) ;
    public final JamlParser.notEndHash_return notEndHash() throws RecognitionException {
    traceIn("notEndHash", 12);
        JamlParser.notEndHash_return retval = new JamlParser.notEndHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set34=null;

        CommonTree set34_tree=null;

        try {
            // ../etc/Jaml.g:136:12: ( (~ END_HASH ) )
            // ../etc/Jaml.g:136:14: (~ END_HASH )
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:136:14: (~ END_HASH )
            // ../etc/Jaml.g:136:15: ~ END_HASH
            {
            set34=(Token)input.LT(1);
            if ( (input.LA(1)>=INDENT && input.LA(1)<=BEGIN_HASH)||(input.LA(1)>=POUND && input.LA(1)<=JAVA_RBRACE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set34));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            if ( state.backtracking==0 ) {
              System.out.println("() " + input.toString(retval.start,input.LT(-1)));
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
    traceOut("notEndHash", 12);
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
    // ../etc/Jaml.g:138:1: idSpecifier returns [String id] : POUND ID ;
    public final JamlParser.idSpecifier_return idSpecifier() throws RecognitionException {
    traceIn("idSpecifier", 13);
        JamlParser.idSpecifier_return retval = new JamlParser.idSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POUND35=null;
        Token ID36=null;

        CommonTree POUND35_tree=null;
        CommonTree ID36_tree=null;

        try {
            // ../etc/Jaml.g:138:32: ( POUND ID )
            // ../etc/Jaml.g:138:34: POUND ID
            {
            root_0 = (CommonTree)adaptor.nil();

            POUND35=(Token)match(input,POUND,FOLLOW_POUND_in_idSpecifier518); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POUND35_tree = (CommonTree)adaptor.create(POUND35);
            adaptor.addChild(root_0, POUND35_tree);
            }
            ID36=(Token)match(input,ID,FOLLOW_ID_in_idSpecifier520); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID36_tree = (CommonTree)adaptor.create(ID36);
            adaptor.addChild(root_0, ID36_tree);
            }
            if ( state.backtracking==0 ) {
              retval.id = (ID36!=null?ID36.getText():null);
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
    traceOut("idSpecifier", 13);
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
    // ../etc/Jaml.g:140:1: classSpecifier returns [String klass] : DOT ID ;
    public final JamlParser.classSpecifier_return classSpecifier() throws RecognitionException {
    traceIn("classSpecifier", 14);
        JamlParser.classSpecifier_return retval = new JamlParser.classSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT37=null;
        Token ID38=null;

        CommonTree DOT37_tree=null;
        CommonTree ID38_tree=null;

        try {
            // ../etc/Jaml.g:140:38: ( DOT ID )
            // ../etc/Jaml.g:141:1: DOT ID
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT37=(Token)match(input,DOT,FOLLOW_DOT_in_classSpecifier533); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT37_tree = (CommonTree)adaptor.create(DOT37);
            adaptor.addChild(root_0, DOT37_tree);
            }
            ID38=(Token)match(input,ID,FOLLOW_ID_in_classSpecifier535); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID38_tree = (CommonTree)adaptor.create(ID38);
            adaptor.addChild(root_0, ID38_tree);
            }
            if ( state.backtracking==0 ) {
              retval.klass = (ID38!=null?ID38.getText():null);
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
    traceOut("classSpecifier", 14);
        }
        return retval;
    }
    // $ANTLR end "classSpecifier"

    // $ANTLR start synpred1_Jaml
    public final void synpred1_Jaml_fragment() throws RecognitionException {   
        traceIn("synpred1_Jaml_fragment", 15);
        try {
            // ../etc/Jaml.g:112:3: ( blankLines )
            // ../etc/Jaml.g:112:4: blankLines
            {
            pushFollow(FOLLOW_blankLines_in_synpred1_Jaml366);
            blankLines();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        finally {
            traceOut("synpred1_Jaml_fragment", 15);
        }}
    // $ANTLR end synpred1_Jaml

    // Delegated rules

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


 

    public static final BitSet FOLLOW_line_in_jamlSource98 = new BitSet(new long[]{0x0000000000006342L});
    public static final BitSet FOLLOW_elementDeclaration_in_element126 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_freeformText_in_element134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_element147 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_content_in_element150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_element163 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_element165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_line194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_freeformText_in_line202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_line211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_freeformText235 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_freeformText237 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_content_in_freeformText244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divAttrs_in_elementDeclaration290 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrs_in_elementDeclaration307 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_content338 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_element_in_content346 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_freeformText_in_content355 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_blankLines_in_content370 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_DEDENT_in_content375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEDENT_in_blankLines386 = new BitSet(new long[]{0x0000000000006360L});
    public static final BitSet FOLLOW_NEWLINE_in_blankLines389 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_blankLines_in_blankLines394 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INDENT_in_blankLines397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_attrs409 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_attrs411 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_idSpecifier_in_attrs416 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_classSpecifier_in_attrs423 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_idSpecifier_in_divAttrs437 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_classSpecifier_in_divAttrs444 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_BEGIN_HASH_in_attrHash459 = new BitSet(new long[]{0x00000001FFFFFFF0L});
    public static final BitSet FOLLOW_hashAttrs_in_attrHash465 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_HASH_in_attrHash470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notEndHash_in_hashAttrs490 = new BitSet(new long[]{0x00000001FFFFEFF2L});
    public static final BitSet FOLLOW_set_in_notEndHash503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_idSpecifier518 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idSpecifier520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_classSpecifier533 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classSpecifier535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankLines_in_synpred1_Jaml366 = new BitSet(new long[]{0x0000000000000002L});

}