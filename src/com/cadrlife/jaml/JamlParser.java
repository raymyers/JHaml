// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-03-08 10:47:24

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

@SuppressWarnings({"unused","unchecked"}) public class JamlParser extends Parser {
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
    Helper util = new Helper(config,this);
    boolean isWithinFilter = false;
    public void pushElementScopeForTesting() {
      element_stack.push(new element_scope());
    }
    public int getCurrentLineNumber() {
      int i=-1;
      for (; input.LT(i).getLine() <= 0; i--) {
        System.out.println(">>>>");
        System.out.println(input.LT(i).getLine());
        System.out.println(input.LT(i));
      }
      System.out.println(">>>>");
      System.out.println(input.LT(i).getLine());
      System.out.println(input.LT(i));
      return input.LT(i).getLine();
    }
    public int getCurrentLineNumber(String token) {
      int i=-1;
      for (; !token.equals(input.LT(i).getText()); i--);
      return input.LT(i).getLine();
    }



    public static class jamlSource_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jamlSource"
    // ../etc/Jaml.g:76:1: jamlSource[JamlConfig config] returns [String rendering] : ( line )* ;
    public final JamlParser.jamlSource_return jamlSource(JamlConfig config) throws RecognitionException {
    traceIn("jamlSource", 1);
        JamlParser.jamlSource_return retval = new JamlParser.jamlSource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.line_return line1 = null;




          retval.rendering = ""; 
          this.config = config;
          Helper util = new Helper(config, this);

        try {
            // ../etc/Jaml.g:82:1: ( ( line )* )
            // ../etc/Jaml.g:82:3: ( line )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:82:3: ( line )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==NEWLINE||(LA1_0>=TEXT && LA1_0<=PERCENT)||(LA1_0>=POUND && LA1_0<=DOT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../etc/Jaml.g:82:4: line
            	    {
            	    pushFollow(FOLLOW_line_in_jamlSource97);
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

    protected static class element_scope {
        String type;
    }
    protected Stack element_stack = new Stack();

    public static class element_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // ../etc/Jaml.g:84:1: element returns [String rendering] : elementDeclaration ( FORWARD_SLASH )? ( freeformText[false] | newline ( content )? ) ;
    public final JamlParser.element_return element() throws RecognitionException {
    traceIn("element", 2);
        element_stack.push(new element_scope());
        JamlParser.element_return retval = new JamlParser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FORWARD_SLASH3=null;
        JamlParser.elementDeclaration_return elementDeclaration2 = null;

        JamlParser.freeformText_return freeformText4 = null;

        JamlParser.newline_return newline5 = null;

        JamlParser.content_return content6 = null;


        CommonTree FORWARD_SLASH3_tree=null;


          	String content = ""; 
          	boolean selfClosing=false;
          
        try {
            // ../etc/Jaml.g:92:3: ( elementDeclaration ( FORWARD_SLASH )? ( freeformText[false] | newline ( content )? ) )
            // ../etc/Jaml.g:93:3: elementDeclaration ( FORWARD_SLASH )? ( freeformText[false] | newline ( content )? )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elementDeclaration_in_element131);
            elementDeclaration2=elementDeclaration();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, elementDeclaration2.getTree());
            // ../etc/Jaml.g:93:22: ( FORWARD_SLASH )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FORWARD_SLASH) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../etc/Jaml.g:93:23: FORWARD_SLASH
                    {
                    FORWARD_SLASH3=(Token)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_element134); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FORWARD_SLASH3_tree = (CommonTree)adaptor.create(FORWARD_SLASH3);
                    adaptor.addChild(root_0, FORWARD_SLASH3_tree);
                    }
                    if ( state.backtracking==0 ) {
                      selfClosing = true;
                    }

                    }
                    break;

            }

            // ../etc/Jaml.g:94:4: ( freeformText[false] | newline ( content )? )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TEXT) ) {
                alt4=1;
            }
            else if ( (LA4_0==NEWLINE) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../etc/Jaml.g:94:6: freeformText[false]
                    {
                    pushFollow(FOLLOW_freeformText_in_element145);
                    freeformText4=freeformText(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, freeformText4.getTree());
                    if ( state.backtracking==0 ) {
                      content = (freeformText4!=null?freeformText4.rendering:null);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:95:6: newline ( content )?
                    {
                    pushFollow(FOLLOW_newline_in_element158);
                    newline5=newline();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newline5.getTree());
                    // ../etc/Jaml.g:95:14: ( content )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==INDENT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../etc/Jaml.g:95:15: content
                            {
                            pushFollow(FOLLOW_content_in_element161);
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

            }

            if ( state.backtracking==0 ) {
              retval.rendering = util.elem(input.toString(retval.start,input.LT(-1)), ((element_scope)element_stack.peek()).type, (elementDeclaration2!=null?elementDeclaration2.attrMap:null), content, selfClosing);
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
            element_stack.pop();
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
    // ../etc/Jaml.g:99:1: line returns [String rendering] : ( element | freeformText[true] | newline );
    public final JamlParser.line_return line() throws RecognitionException {
    traceIn("line", 3);
        JamlParser.line_return retval = new JamlParser.line_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.element_return element7 = null;

        JamlParser.freeformText_return freeformText8 = null;

        JamlParser.newline_return newline9 = null;



         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:99:60: ( element | freeformText[true] | newline )
            int alt5=3;
            switch ( input.LA(1) ) {
            case PERCENT:
            case POUND:
            case DOT:
                {
                alt5=1;
                }
                break;
            case TEXT:
                {
                alt5=2;
                }
                break;
            case NEWLINE:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../etc/Jaml.g:100:3: element
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_element_in_line192);
                    element7=element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, element7.getTree());
                    if ( state.backtracking==0 ) {
                      retval.rendering = (element7!=null?element7.rendering:null);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:101:5: freeformText[true]
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_freeformText_in_line200);
                    freeformText8=freeformText(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, freeformText8.getTree());
                    if ( state.backtracking==0 ) {
                      retval.rendering = (freeformText8!=null?freeformText8.rendering:null);
                    }

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:102:5: newline
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_newline_in_line209);
                    newline9=newline();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, newline9.getTree());

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
    // ../etc/Jaml.g:105:1: freeformText[boolean beginningOfLine] returns [String rendering] : TEXT newline ( content )? ;
    public final JamlParser.freeformText_return freeformText(boolean beginningOfLine) throws RecognitionException {
    traceIn("freeformText", 4);
        JamlParser.freeformText_return retval = new JamlParser.freeformText_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT10=null;
        JamlParser.newline_return newline11 = null;

        JamlParser.content_return content12 = null;


        CommonTree TEXT10_tree=null;


          String txt = "";
          boolean isFilter = false;

        try {
            // ../etc/Jaml.g:109:2: ( TEXT newline ( content )? )
            // ../etc/Jaml.g:110:3: TEXT newline ( content )?
            {
            root_0 = (CommonTree)adaptor.nil();

            TEXT10=(Token)match(input,TEXT,FOLLOW_TEXT_in_freeformText234); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TEXT10_tree = (CommonTree)adaptor.create(TEXT10);
            adaptor.addChild(root_0, TEXT10_tree);
            }
            if ( state.backtracking==0 ) {

                  txt = (TEXT10!=null?TEXT10.getText():null); 
                  if (!isWithinFilter && beginningOfLine && txt.startsWith(":")) {
                    isFilter = true;
                    isWithinFilter = true;
                  }
                
            }
            pushFollow(FOLLOW_newline_in_freeformText238);
            newline11=newline();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, newline11.getTree());
            // ../etc/Jaml.g:117:3: ( content )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==INDENT) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../etc/Jaml.g:117:4: content
                    {
                    pushFollow(FOLLOW_content_in_freeformText243);
                    content12=content();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, content12.getTree());
                    if ( state.backtracking==0 ) {

                          if (isFilter) {
                          	int contentPos = (content12!=null?((Token)content12.start):null).getCharPositionInLine();
                          	txt = txt + (newline11!=null?input.toString(newline11.start,newline11.stop):null) + util.spaces(contentPos) + (content12!=null?input.toString(content12.start,content12.stop):null);
                          } else {
                          	txt += (content12!=null?content12.rendering:null);
                          }
                        
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                  if (isFilter) {
                    isWithinFilter = false;
                  }
                  if (!isWithinFilter) {
                    String currentElementType = element_stack.isEmpty() ? null : ((element_scope)element_stack.peek()).type;  
                    retval.rendering = util.parseFreeFormText(currentElementType, txt);
                  }
                
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
        public Map<String,String> attrMap;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elementDeclaration"
    // ../etc/Jaml.g:135:1: elementDeclaration returns [Map<String,String> attrMap] : ( ( divAttrs[ids,classes] ( attrHash[$attrMap] )? ) | ( attrs[ids,classes] ( attrHash[$attrMap] )? ) );
    public final JamlParser.elementDeclaration_return elementDeclaration() throws RecognitionException {
    traceIn("elementDeclaration", 5);
        JamlParser.elementDeclaration_return retval = new JamlParser.elementDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.divAttrs_return divAttrs13 = null;

        JamlParser.attrHash_return attrHash14 = null;

        JamlParser.attrs_return attrs15 = null;

        JamlParser.attrHash_return attrHash16 = null;




          	retval.attrMap = new LinkedHashMap<String,String>();
          	List<String> ids = new ArrayList<String>();
          	List<String> classes = new ArrayList<String>();
          
        try {
            // ../etc/Jaml.g:143:4: ( ( divAttrs[ids,classes] ( attrHash[$attrMap] )? ) | ( attrs[ids,classes] ( attrHash[$attrMap] )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=POUND && LA9_0<=DOT)) ) {
                alt9=1;
            }
            else if ( (LA9_0==PERCENT) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../etc/Jaml.g:144:3: ( divAttrs[ids,classes] ( attrHash[$attrMap] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:144:3: ( divAttrs[ids,classes] ( attrHash[$attrMap] )? )
                    // ../etc/Jaml.g:144:4: divAttrs[ids,classes] ( attrHash[$attrMap] )?
                    {
                    pushFollow(FOLLOW_divAttrs_in_elementDeclaration287);
                    divAttrs13=divAttrs(ids, classes);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, divAttrs13.getTree());
                    if ( state.backtracking==0 ) {
                      ((element_scope)element_stack.peek()).type = "div";
                    }
                    // ../etc/Jaml.g:144:52: ( attrHash[$attrMap] )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==BEGIN_HASH) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../etc/Jaml.g:144:52: attrHash[$attrMap]
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration292);
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
                    // ../etc/Jaml.g:146:2: ( attrs[ids,classes] ( attrHash[$attrMap] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:146:2: ( attrs[ids,classes] ( attrHash[$attrMap] )? )
                    // ../etc/Jaml.g:146:3: attrs[ids,classes] ( attrHash[$attrMap] )?
                    {
                    pushFollow(FOLLOW_attrs_in_elementDeclaration302);
                    attrs15=attrs(ids, classes);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attrs15.getTree());
                    // ../etc/Jaml.g:146:22: ( attrHash[$attrMap] )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==BEGIN_HASH) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../etc/Jaml.g:146:22: attrHash[$attrMap]
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration305);
                            attrHash16=attrHash(retval.attrMap);

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attrHash16.getTree());

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
    // ../etc/Jaml.g:149:1: content returns [String rendering] : INDENT ( (e1= element | freeformText[true] | ( blankLines )=> blankLines )+ | inner= content ) DEDENT ;
    public final JamlParser.content_return content() throws RecognitionException {
    traceIn("content", 6);
        JamlParser.content_return retval = new JamlParser.content_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INDENT17=null;
        Token DEDENT20=null;
        JamlParser.element_return e1 = null;

        JamlParser.content_return inner = null;

        JamlParser.freeformText_return freeformText18 = null;

        JamlParser.blankLines_return blankLines19 = null;


        CommonTree INDENT17_tree=null;
        CommonTree DEDENT20_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:149:63: ( INDENT ( (e1= element | freeformText[true] | ( blankLines )=> blankLines )+ | inner= content ) DEDENT )
            // ../etc/Jaml.g:150:1: INDENT ( (e1= element | freeformText[true] | ( blankLines )=> blankLines )+ | inner= content ) DEDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            INDENT17=(Token)match(input,INDENT,FOLLOW_INDENT_in_content328); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INDENT17_tree = (CommonTree)adaptor.create(INDENT17);
            adaptor.addChild(root_0, INDENT17_tree);
            }
            // ../etc/Jaml.g:151:2: ( (e1= element | freeformText[true] | ( blankLines )=> blankLines )+ | inner= content )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==DEDENT||(LA11_0>=TEXT && LA11_0<=PERCENT)||(LA11_0>=POUND && LA11_0<=DOT)) ) {
                alt11=1;
            }
            else if ( (LA11_0==INDENT) ) {
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
                    // ../etc/Jaml.g:152:4: (e1= element | freeformText[true] | ( blankLines )=> blankLines )+
                    {
                    // ../etc/Jaml.g:152:4: (e1= element | freeformText[true] | ( blankLines )=> blankLines )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=4;
                        switch ( input.LA(1) ) {
                        case DEDENT:
                            {
                            int LA10_1 = input.LA(2);

                            if ( (synpred1_Jaml()) ) {
                                alt10=3;
                            }


                            }
                            break;
                        case PERCENT:
                        case POUND:
                        case DOT:
                            {
                            alt10=1;
                            }
                            break;
                        case TEXT:
                            {
                            alt10=2;
                            }
                            break;

                        }

                        switch (alt10) {
                    	case 1 :
                    	    // ../etc/Jaml.g:152:5: e1= element
                    	    {
                    	    pushFollow(FOLLOW_element_in_content340);
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
                    	    // ../etc/Jaml.g:153:5: freeformText[true]
                    	    {
                    	    pushFollow(FOLLOW_freeformText_in_content351);
                    	    freeformText18=freeformText(true);

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, freeformText18.getTree());
                    	    if ( state.backtracking==0 ) {
                    	      retval.rendering += (freeformText18!=null?freeformText18.rendering:null) + "\n";
                    	    }

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../etc/Jaml.g:154:5: ( blankLines )=> blankLines
                    	    {
                    	    pushFollow(FOLLOW_blankLines_in_content368);
                    	    blankLines19=blankLines();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, blankLines19.getTree());

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
                    // ../etc/Jaml.g:156:6: inner= content
                    {
                    pushFollow(FOLLOW_content_in_content383);
                    inner=content();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, inner.getTree());
                    if ( state.backtracking==0 ) {
                      retval.rendering += (inner!=null?inner.rendering:null);
                    }

                    }
                    break;

            }

            DEDENT20=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_content392); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEDENT20_tree = (CommonTree)adaptor.create(DEDENT20);
            adaptor.addChild(root_0, DEDENT20_tree);
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
    // ../etc/Jaml.g:162:1: blankLines : DEDENT ( ( NEWLINE )+ | blankLines ) INDENT ;
    public final JamlParser.blankLines_return blankLines() throws RecognitionException {
    traceIn("blankLines", 7);
        JamlParser.blankLines_return retval = new JamlParser.blankLines_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DEDENT21=null;
        Token NEWLINE22=null;
        Token INDENT24=null;
        JamlParser.blankLines_return blankLines23 = null;


        CommonTree DEDENT21_tree=null;
        CommonTree NEWLINE22_tree=null;
        CommonTree INDENT24_tree=null;

        try {
            // ../etc/Jaml.g:162:12: ( DEDENT ( ( NEWLINE )+ | blankLines ) INDENT )
            // ../etc/Jaml.g:162:14: DEDENT ( ( NEWLINE )+ | blankLines ) INDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            DEDENT21=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_blankLines403); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DEDENT21_tree = (CommonTree)adaptor.create(DEDENT21);
            adaptor.addChild(root_0, DEDENT21_tree);
            }
            // ../etc/Jaml.g:162:21: ( ( NEWLINE )+ | blankLines )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NEWLINE) ) {
                alt13=1;
            }
            else if ( (LA13_0==DEDENT) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../etc/Jaml.g:162:22: ( NEWLINE )+
                    {
                    // ../etc/Jaml.g:162:22: ( NEWLINE )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==NEWLINE) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../etc/Jaml.g:162:22: NEWLINE
                    	    {
                    	    NEWLINE22=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_blankLines406); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    NEWLINE22_tree = (CommonTree)adaptor.create(NEWLINE22);
                    	    adaptor.addChild(root_0, NEWLINE22_tree);
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:162:33: blankLines
                    {
                    pushFollow(FOLLOW_blankLines_in_blankLines411);
                    blankLines23=blankLines();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, blankLines23.getTree());

                    }
                    break;

            }

            INDENT24=(Token)match(input,INDENT,FOLLOW_INDENT_in_blankLines414); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INDENT24_tree = (CommonTree)adaptor.create(INDENT24);
            adaptor.addChild(root_0, INDENT24_tree);
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
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attrs"
    // ../etc/Jaml.g:164:1: attrs[List<String> ids, List<String> classes] : PERCENT ( ID )? ( idSpecifier | classSpecifier )* ;
    public final JamlParser.attrs_return attrs(List<String> ids, List<String> classes) throws RecognitionException {
    traceIn("attrs", 8);
        JamlParser.attrs_return retval = new JamlParser.attrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERCENT25=null;
        Token ID26=null;
        JamlParser.idSpecifier_return idSpecifier27 = null;

        JamlParser.classSpecifier_return classSpecifier28 = null;


        CommonTree PERCENT25_tree=null;
        CommonTree ID26_tree=null;

        try {
            // ../etc/Jaml.g:164:46: ( PERCENT ( ID )? ( idSpecifier | classSpecifier )* )
            // ../etc/Jaml.g:165:1: PERCENT ( ID )? ( idSpecifier | classSpecifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            PERCENT25=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_attrs422); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            PERCENT25_tree = (CommonTree)adaptor.create(PERCENT25);
            adaptor.addChild(root_0, PERCENT25_tree);
            }
            // ../etc/Jaml.g:165:9: ( ID )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../etc/Jaml.g:165:9: ID
                    {
                    ID26=(Token)match(input,ID,FOLLOW_ID_in_attrs424); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID26_tree = (CommonTree)adaptor.create(ID26);
                    adaptor.addChild(root_0, ID26_tree);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              ((element_scope)element_stack.peek()).type = (ID26!=null?ID26.getText():null);
            }
            // ../etc/Jaml.g:166:1: ( idSpecifier | classSpecifier )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==POUND) ) {
                    alt15=1;
                }
                else if ( (LA15_0==DOT) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // ../etc/Jaml.g:166:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_attrs430);
            	    idSpecifier27=idSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, idSpecifier27.getTree());
            	    if ( state.backtracking==0 ) {
            	      ids.add((idSpecifier27!=null?idSpecifier27.id:null));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:167:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_attrs437);
            	    classSpecifier28=classSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classSpecifier28.getTree());
            	    if ( state.backtracking==0 ) {
            	      classes.add((classSpecifier28!=null?classSpecifier28.klass:null));
            	    }

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
    // ../etc/Jaml.g:169:1: divAttrs[List<String> ids, List<String> classes] : ( idSpecifier | classSpecifier )+ ;
    public final JamlParser.divAttrs_return divAttrs(List<String> ids, List<String> classes) throws RecognitionException {
    traceIn("divAttrs", 9);
        JamlParser.divAttrs_return retval = new JamlParser.divAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.idSpecifier_return idSpecifier29 = null;

        JamlParser.classSpecifier_return classSpecifier30 = null;



        try {
            // ../etc/Jaml.g:169:50: ( ( idSpecifier | classSpecifier )+ )
            // ../etc/Jaml.g:170:1: ( idSpecifier | classSpecifier )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:170:1: ( idSpecifier | classSpecifier )+
            int cnt16=0;
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==POUND) ) {
                    alt16=1;
                }
                else if ( (LA16_0==DOT) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // ../etc/Jaml.g:170:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_divAttrs451);
            	    idSpecifier29=idSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, idSpecifier29.getTree());
            	    if ( state.backtracking==0 ) {
            	      ids.add((idSpecifier29!=null?idSpecifier29.id:null));
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:171:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_divAttrs458);
            	    classSpecifier30=classSpecifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classSpecifier30.getTree());
            	    if ( state.backtracking==0 ) {
            	      classes.add((classSpecifier30!=null?classSpecifier30.klass:null));
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // ../etc/Jaml.g:173:1: attrHash[Map<String,String> attrMap] : BEGIN_HASH hashAttrs END_HASH ;
    public final JamlParser.attrHash_return attrHash(Map<String,String> attrMap) throws RecognitionException {
    traceIn("attrHash", 10);
        JamlParser.attrHash_return retval = new JamlParser.attrHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN_HASH31=null;
        Token END_HASH33=null;
        JamlParser.hashAttrs_return hashAttrs32 = null;


        CommonTree BEGIN_HASH31_tree=null;
        CommonTree END_HASH33_tree=null;

        try {
            // ../etc/Jaml.g:173:38: ( BEGIN_HASH hashAttrs END_HASH )
            // ../etc/Jaml.g:174:3: BEGIN_HASH hashAttrs END_HASH
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN_HASH31=(Token)match(input,BEGIN_HASH,FOLLOW_BEGIN_HASH_in_attrHash473); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BEGIN_HASH31_tree = (CommonTree)adaptor.create(BEGIN_HASH31);
            adaptor.addChild(root_0, BEGIN_HASH31_tree);
            }
            if ( state.backtracking==0 ) {
              System.out.println("BEGIN " + input.toString(retval.start,input.LT(-1)));
            }
            pushFollow(FOLLOW_hashAttrs_in_attrHash479);
            hashAttrs32=hashAttrs();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, hashAttrs32.getTree());
            END_HASH33=(Token)match(input,END_HASH,FOLLOW_END_HASH_in_attrHash484); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END_HASH33_tree = (CommonTree)adaptor.create(END_HASH33);
            adaptor.addChild(root_0, END_HASH33_tree);
            }
            if ( state.backtracking==0 ) {
              util.parseAttrHash((hashAttrs32!=null?hashAttrs32.contents:null), attrMap);
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
    // ../etc/Jaml.g:178:1: hashAttrs returns [String contents] : ( notEndHash )* ;
    public final JamlParser.hashAttrs_return hashAttrs() throws RecognitionException {
    traceIn("hashAttrs", 11);
        JamlParser.hashAttrs_return retval = new JamlParser.hashAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.notEndHash_return notEndHash34 = null;



        retval.contents ="";
        try {
            // ../etc/Jaml.g:178:59: ( ( notEndHash )* )
            // ../etc/Jaml.g:179:1: ( notEndHash )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:179:1: ( notEndHash )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=INDENT && LA17_0<=BEGIN_HASH)||(LA17_0>=POUND && LA17_0<=JAVA_RBRACE)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../etc/Jaml.g:179:2: notEndHash
            	    {
            	    pushFollow(FOLLOW_notEndHash_in_hashAttrs504);
            	    notEndHash34=notEndHash();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, notEndHash34.getTree());
            	    if ( state.backtracking==0 ) {
            	      retval.contents += (notEndHash34!=null?input.toString(notEndHash34.start,notEndHash34.stop):null);
            	    }

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
    // ../etc/Jaml.g:181:1: notEndHash : (~ END_HASH ) ;
    public final JamlParser.notEndHash_return notEndHash() throws RecognitionException {
    traceIn("notEndHash", 12);
        JamlParser.notEndHash_return retval = new JamlParser.notEndHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set35=null;

        CommonTree set35_tree=null;

        try {
            // ../etc/Jaml.g:181:12: ( (~ END_HASH ) )
            // ../etc/Jaml.g:181:14: (~ END_HASH )
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:181:14: (~ END_HASH )
            // ../etc/Jaml.g:181:15: ~ END_HASH
            {
            set35=(Token)input.LT(1);
            if ( (input.LA(1)>=INDENT && input.LA(1)<=BEGIN_HASH)||(input.LA(1)>=POUND && input.LA(1)<=JAVA_RBRACE) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set35));
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
    // ../etc/Jaml.g:183:1: idSpecifier returns [String id] : POUND ( ID )? ;
    public final JamlParser.idSpecifier_return idSpecifier() throws RecognitionException {
    traceIn("idSpecifier", 13);
        JamlParser.idSpecifier_return retval = new JamlParser.idSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POUND36=null;
        Token ID37=null;

        CommonTree POUND36_tree=null;
        CommonTree ID37_tree=null;

        try {
            // ../etc/Jaml.g:183:32: ( POUND ( ID )? )
            // ../etc/Jaml.g:183:34: POUND ( ID )?
            {
            root_0 = (CommonTree)adaptor.nil();

            POUND36=(Token)match(input,POUND,FOLLOW_POUND_in_idSpecifier532); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POUND36_tree = (CommonTree)adaptor.create(POUND36);
            adaptor.addChild(root_0, POUND36_tree);
            }
            // ../etc/Jaml.g:183:40: ( ID )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../etc/Jaml.g:183:40: ID
                    {
                    ID37=(Token)match(input,ID,FOLLOW_ID_in_idSpecifier534); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID37_tree = (CommonTree)adaptor.create(ID37);
                    adaptor.addChild(root_0, ID37_tree);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              retval.id = (ID37!=null?ID37.getText():null);
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
    // ../etc/Jaml.g:185:1: classSpecifier returns [String klass] : DOT ( ID )? ;
    public final JamlParser.classSpecifier_return classSpecifier() throws RecognitionException {
    traceIn("classSpecifier", 14);
        JamlParser.classSpecifier_return retval = new JamlParser.classSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT38=null;
        Token ID39=null;

        CommonTree DOT38_tree=null;
        CommonTree ID39_tree=null;

        try {
            // ../etc/Jaml.g:185:38: ( DOT ( ID )? )
            // ../etc/Jaml.g:186:1: DOT ( ID )?
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT38=(Token)match(input,DOT,FOLLOW_DOT_in_classSpecifier548); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT38_tree = (CommonTree)adaptor.create(DOT38);
            adaptor.addChild(root_0, DOT38_tree);
            }
            // ../etc/Jaml.g:186:5: ( ID )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../etc/Jaml.g:186:5: ID
                    {
                    ID39=(Token)match(input,ID,FOLLOW_ID_in_classSpecifier550); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID39_tree = (CommonTree)adaptor.create(ID39);
                    adaptor.addChild(root_0, ID39_tree);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              retval.klass = (ID39!=null?ID39.getText():null);
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

    public static class newline_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "newline"
    // ../etc/Jaml.g:188:1: newline : ( ( NEWLINE ( DEDENT )* NEWLINE )=> NEWLINE | NEWLINE );
    public final JamlParser.newline_return newline() throws RecognitionException {
    traceIn("newline", 15);
        JamlParser.newline_return retval = new JamlParser.newline_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE40=null;
        Token NEWLINE41=null;

        CommonTree NEWLINE40_tree=null;
        CommonTree NEWLINE41_tree=null;

        try {
            // ../etc/Jaml.g:188:8: ( ( NEWLINE ( DEDENT )* NEWLINE )=> NEWLINE | NEWLINE )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==NEWLINE) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred2_Jaml()) ) {
                    alt20=1;
                }
                else if ( (true) ) {
                    alt20=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../etc/Jaml.g:188:10: ( NEWLINE ( DEDENT )* NEWLINE )=> NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEWLINE40=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_newline570); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE40_tree = (CommonTree)adaptor.create(NEWLINE40);
                    adaptor.addChild(root_0, NEWLINE40_tree);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:188:48: NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    NEWLINE41=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_newline574); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    NEWLINE41_tree = (CommonTree)adaptor.create(NEWLINE41);
                    adaptor.addChild(root_0, NEWLINE41_tree);
                    }
                    if ( state.backtracking==0 ) {

                        util.validateIndentation(isWithinFilter, (NEWLINE41!=null?NEWLINE41.getText():null).substring(1));

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
    traceOut("newline", 15);
        }
        return retval;
    }
    // $ANTLR end "newline"

    // $ANTLR start synpred1_Jaml
    public final void synpred1_Jaml_fragment() throws RecognitionException {   
        traceIn("synpred1_Jaml_fragment", 16);
        try {
            // ../etc/Jaml.g:154:5: ( blankLines )
            // ../etc/Jaml.g:154:6: blankLines
            {
            pushFollow(FOLLOW_blankLines_in_synpred1_Jaml364);
            blankLines();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        finally {
            traceOut("synpred1_Jaml_fragment", 16);
        }}
    // $ANTLR end synpred1_Jaml

    // $ANTLR start synpred2_Jaml
    public final void synpred2_Jaml_fragment() throws RecognitionException {   
        traceIn("synpred2_Jaml_fragment", 17);
        try {
            // ../etc/Jaml.g:188:10: ( NEWLINE ( DEDENT )* NEWLINE )
            // ../etc/Jaml.g:188:11: NEWLINE ( DEDENT )* NEWLINE
            {
            match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred2_Jaml561); if (state.failed) return ;
            // ../etc/Jaml.g:188:19: ( DEDENT )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==DEDENT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../etc/Jaml.g:188:19: DEDENT
            	    {
            	    match(input,DEDENT,FOLLOW_DEDENT_in_synpred2_Jaml563); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match(input,NEWLINE,FOLLOW_NEWLINE_in_synpred2_Jaml566); if (state.failed) return ;

            }

        }
        finally {
            traceOut("synpred2_Jaml_fragment", 17);
        }}
    // $ANTLR end synpred2_Jaml

    // Delegated rules

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


 

    public static final BitSet FOLLOW_line_in_jamlSource97 = new BitSet(new long[]{0x0000000000006342L});
    public static final BitSet FOLLOW_elementDeclaration_in_element131 = new BitSet(new long[]{0x00000000000063D0L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_element134 = new BitSet(new long[]{0x0000000000006350L});
    public static final BitSet FOLLOW_freeformText_in_element145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newline_in_element158 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_content_in_element161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_line192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_freeformText_in_line200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_newline_in_line209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_freeformText234 = new BitSet(new long[]{0x0000000000006350L});
    public static final BitSet FOLLOW_newline_in_freeformText238 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_content_in_freeformText243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divAttrs_in_elementDeclaration287 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrs_in_elementDeclaration302 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_content328 = new BitSet(new long[]{0x0000000000006330L});
    public static final BitSet FOLLOW_element_in_content340 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_freeformText_in_content351 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_blankLines_in_content368 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_content_in_content383 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_DEDENT_in_content392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEDENT_in_blankLines403 = new BitSet(new long[]{0x0000000000006360L});
    public static final BitSet FOLLOW_NEWLINE_in_blankLines406 = new BitSet(new long[]{0x0000000000000050L});
    public static final BitSet FOLLOW_blankLines_in_blankLines411 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_INDENT_in_blankLines414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_attrs422 = new BitSet(new long[]{0x0000000000006402L});
    public static final BitSet FOLLOW_ID_in_attrs424 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_idSpecifier_in_attrs430 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_classSpecifier_in_attrs437 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_idSpecifier_in_divAttrs451 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_classSpecifier_in_divAttrs458 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_BEGIN_HASH_in_attrHash473 = new BitSet(new long[]{0x00000001FFFFFFF0L});
    public static final BitSet FOLLOW_hashAttrs_in_attrHash479 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_HASH_in_attrHash484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notEndHash_in_hashAttrs504 = new BitSet(new long[]{0x00000001FFFFEFF2L});
    public static final BitSet FOLLOW_set_in_notEndHash517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_idSpecifier532 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_idSpecifier534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_classSpecifier548 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ID_in_classSpecifier550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_newline570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_newline574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_blankLines_in_synpred1_Jaml364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred2_Jaml561 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_DEDENT_in_synpred2_Jaml563 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_NEWLINE_in_synpred2_Jaml566 = new BitSet(new long[]{0x0000000000000002L});

}