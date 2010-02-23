// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-23 12:38:01

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "INDENT", "DEDENT", "NEWLINE", "TEXT", "PERCENT", "ID", "BEGIN_HASH", "COMMA", "END_HASH", "StringLiteral", "POUND", "DOT", "INT", "Spaces", "WS", "NL", "CHANGE_INDENT", "SpacesQ", "EscapeSequence", "UnicodeEscape", "OctalEscape", "HexDigit", "':'", "'='", "'>'"
    };
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int PERCENT=8;
    public static final int T__26=26;
    public static final int POUND=14;
    public static final int END_HASH=12;
    public static final int CHANGE_INDENT=20;
    public static final int SpacesQ=21;
    public static final int DEDENT=5;
    public static final int INT=16;
    public static final int TEXT=7;
    public static final int ID=9;
    public static final int EOF=-1;
    public static final int HexDigit=25;
    public static final int BEGIN_HASH=10;
    public static final int INDENT=4;
    public static final int StringLiteral=13;
    public static final int WS=18;
    public static final int NEWLINE=6;
    public static final int COMMA=11;
    public static final int UnicodeEscape=23;
    public static final int Spaces=17;
    public static final int NL=19;
    public static final int DOT=15;
    public static final int OctalEscape=24;
    public static final int EscapeSequence=22;

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
    // ../etc/Jaml.g:36:1: prog returns [String rendering] : ( line NEWLINE )* ;
    public final JamlParser.prog_return prog() throws RecognitionException {
    traceIn("prog", 1);
        JamlParser.prog_return retval = new JamlParser.prog_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE2=null;
        JamlParser.line_return line1 = null;


        CommonTree NEWLINE2_tree=null;

        retval.rendering = "";
        try {
            // ../etc/Jaml.g:36:57: ( ( line NEWLINE )* )
            // ../etc/Jaml.g:37:3: ( line NEWLINE )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:37:3: ( line NEWLINE )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=TEXT && LA1_0<=PERCENT)||(LA1_0>=POUND && LA1_0<=DOT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../etc/Jaml.g:37:4: line NEWLINE
            	    {
            	    pushFollow(FOLLOW_line_in_prog98);
            	    line1=line();

            	    state._fsp--;

            	    adaptor.addChild(root_0, line1.getTree());
            	    retval.rendering += (line1!=null?line1.rendering:null);
            	    NEWLINE2=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_prog102); 
            	    NEWLINE2_tree = (CommonTree)adaptor.create(NEWLINE2);
            	    adaptor.addChild(root_0, NEWLINE2_tree);

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
    // ../etc/Jaml.g:39:1: element returns [String rendering] : elementDeclaration ( content )? ;
    public final JamlParser.element_return element() throws RecognitionException {
    traceIn("element", 2);
        JamlParser.element_return retval = new JamlParser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.elementDeclaration_return elementDeclaration3 = null;

        JamlParser.content_return content4 = null;



        String content = "";
        try {
            // ../etc/Jaml.g:39:64: ( elementDeclaration ( content )? )
            // ../etc/Jaml.g:40:3: elementDeclaration ( content )?
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elementDeclaration_in_element124);
            elementDeclaration3=elementDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, elementDeclaration3.getTree());
            // ../etc/Jaml.g:40:22: ( content )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INDENT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../etc/Jaml.g:40:23: content
                    {
                    pushFollow(FOLLOW_content_in_element127);
                    content4=content();

                    state._fsp--;

                    adaptor.addChild(root_0, content4.getTree());
                    content = (content4!=null?content4.rendering:null);

                    }
                    break;

            }

            retval.rendering = Util.elem((elementDeclaration3!=null?elementDeclaration3.type:null), (elementDeclaration3!=null?elementDeclaration3.attrMap:null), content);

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
    // ../etc/Jaml.g:44:1: line returns [String rendering] : ( element | TEXT );
    public final JamlParser.line_return line() throws RecognitionException {
    traceIn("line", 3);
        JamlParser.line_return retval = new JamlParser.line_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT6=null;
        JamlParser.element_return element5 = null;


        CommonTree TEXT6_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:44:60: ( element | TEXT )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==PERCENT||(LA3_0>=POUND && LA3_0<=DOT)) ) {
                alt3=1;
            }
            else if ( (LA3_0==TEXT) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../etc/Jaml.g:45:3: element
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_element_in_line157);
                    element5=element();

                    state._fsp--;

                    adaptor.addChild(root_0, element5.getTree());
                    retval.rendering = (element5!=null?element5.rendering:null);

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:46:5: TEXT
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    TEXT6=(Token)match(input,TEXT,FOLLOW_TEXT_in_line165); 
                    TEXT6_tree = (CommonTree)adaptor.create(TEXT6);
                    adaptor.addChild(root_0, TEXT6_tree);

                    retval.rendering = (TEXT6!=null?TEXT6.getText():null);

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
    // ../etc/Jaml.g:49:1: elementDeclaration returns [String type, Map<String,String> attrMap] : ( ( (a1= divAttrs ) ( attrHash )? ) | ( (a2= attrs ) ( attrHash )? ) );
    public final JamlParser.elementDeclaration_return elementDeclaration() throws RecognitionException {
    traceIn("elementDeclaration", 4);
        JamlParser.elementDeclaration_return retval = new JamlParser.elementDeclaration_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.divAttrs_return a1 = null;

        JamlParser.attrs_return a2 = null;

        JamlParser.attrHash_return attrHash7 = null;

        JamlParser.attrHash_return attrHash8 = null;



        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:49:124: ( ( (a1= divAttrs ) ( attrHash )? ) | ( (a2= attrs ) ( attrHash )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=POUND && LA6_0<=DOT)) ) {
                alt6=1;
            }
            else if ( (LA6_0==PERCENT) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../etc/Jaml.g:50:3: ( (a1= divAttrs ) ( attrHash )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:50:3: ( (a1= divAttrs ) ( attrHash )? )
                    // ../etc/Jaml.g:50:4: (a1= divAttrs ) ( attrHash )?
                    {
                    // ../etc/Jaml.g:50:4: (a1= divAttrs )
                    // ../etc/Jaml.g:50:5: a1= divAttrs
                    {
                    pushFollow(FOLLOW_divAttrs_in_elementDeclaration192);
                    a1=divAttrs();

                    state._fsp--;

                    adaptor.addChild(root_0, a1.getTree());
                    retval.attrMap.putAll((a1!=null?a1.attrMap:null)); retval.type = "div";

                    }

                    // ../etc/Jaml.g:51:4: ( attrHash )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==BEGIN_HASH) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../etc/Jaml.g:51:5: attrHash
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration201);
                            attrHash7=attrHash();

                            state._fsp--;

                            adaptor.addChild(root_0, attrHash7.getTree());
                            retval.attrMap.putAll((attrHash7!=null?attrHash7.attrMap:null));

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:53:2: ( (a2= attrs ) ( attrHash )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:53:2: ( (a2= attrs ) ( attrHash )? )
                    // ../etc/Jaml.g:54:3: (a2= attrs ) ( attrHash )?
                    {
                    // ../etc/Jaml.g:54:3: (a2= attrs )
                    // ../etc/Jaml.g:54:4: a2= attrs
                    {
                    pushFollow(FOLLOW_attrs_in_elementDeclaration219);
                    a2=attrs();

                    state._fsp--;

                    adaptor.addChild(root_0, a2.getTree());
                    retval.attrMap.putAll((a2!=null?a2.attrMap:null)); retval.type = (a2!=null?a2.type:null);

                    }

                    // ../etc/Jaml.g:55:3: ( attrHash )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==BEGIN_HASH) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../etc/Jaml.g:55:4: attrHash
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration228);
                            attrHash8=attrHash();

                            state._fsp--;

                            adaptor.addChild(root_0, attrHash8.getTree());
                            retval.attrMap.putAll((attrHash8!=null?attrHash8.attrMap:null));

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
    // ../etc/Jaml.g:58:1: content returns [String rendering] : ( INDENT e1= element ( NEWLINE e2= element )* DEDENT ) ;
    public final JamlParser.content_return content() throws RecognitionException {
    traceIn("content", 5);
        JamlParser.content_return retval = new JamlParser.content_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INDENT9=null;
        Token NEWLINE10=null;
        Token DEDENT11=null;
        JamlParser.element_return e1 = null;

        JamlParser.element_return e2 = null;


        CommonTree INDENT9_tree=null;
        CommonTree NEWLINE10_tree=null;
        CommonTree DEDENT11_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:58:63: ( ( INDENT e1= element ( NEWLINE e2= element )* DEDENT ) )
            // ../etc/Jaml.g:60:1: ( INDENT e1= element ( NEWLINE e2= element )* DEDENT )
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:60:1: ( INDENT e1= element ( NEWLINE e2= element )* DEDENT )
            // ../etc/Jaml.g:60:2: INDENT e1= element ( NEWLINE e2= element )* DEDENT
            {
            INDENT9=(Token)match(input,INDENT,FOLLOW_INDENT_in_content256); 
            INDENT9_tree = (CommonTree)adaptor.create(INDENT9);
            adaptor.addChild(root_0, INDENT9_tree);

            pushFollow(FOLLOW_element_in_content262);
            e1=element();

            state._fsp--;

            adaptor.addChild(root_0, e1.getTree());
            retval.rendering += (e1!=null?e1.rendering:null);
            // ../etc/Jaml.g:62:2: ( NEWLINE e2= element )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==NEWLINE) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../etc/Jaml.g:62:3: NEWLINE e2= element
            	    {
            	    NEWLINE10=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_content269); 
            	    NEWLINE10_tree = (CommonTree)adaptor.create(NEWLINE10);
            	    adaptor.addChild(root_0, NEWLINE10_tree);

            	    pushFollow(FOLLOW_element_in_content273);
            	    e2=element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e2.getTree());
            	    retval.rendering += (e2!=null?e2.rendering:null);

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            DEDENT11=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_content280); 
            DEDENT11_tree = (CommonTree)adaptor.create(DEDENT11);
            adaptor.addChild(root_0, DEDENT11_tree);


            }


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
    // ../etc/Jaml.g:67:1: attrs returns [Map<String,String> attrMap, String type] : PERCENT ID ( idSpecifier | classSpecifier )* ;
    public final JamlParser.attrs_return attrs() throws RecognitionException {
    traceIn("attrs", 6);
        JamlParser.attrs_return retval = new JamlParser.attrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERCENT12=null;
        Token ID13=null;
        JamlParser.idSpecifier_return idSpecifier14 = null;

        JamlParser.classSpecifier_return classSpecifier15 = null;


        CommonTree PERCENT12_tree=null;
        CommonTree ID13_tree=null;

        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:67:111: ( PERCENT ID ( idSpecifier | classSpecifier )* )
            // ../etc/Jaml.g:68:1: PERCENT ID ( idSpecifier | classSpecifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            PERCENT12=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_attrs299); 
            PERCENT12_tree = (CommonTree)adaptor.create(PERCENT12);
            adaptor.addChild(root_0, PERCENT12_tree);

            ID13=(Token)match(input,ID,FOLLOW_ID_in_attrs301); 
            ID13_tree = (CommonTree)adaptor.create(ID13);
            adaptor.addChild(root_0, ID13_tree);

            retval.type = (ID13!=null?ID13.getText():null);
            // ../etc/Jaml.g:69:1: ( idSpecifier | classSpecifier )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==POUND) ) {
                    alt8=1;
                }
                else if ( (LA8_0==DOT) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // ../etc/Jaml.g:69:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_attrs306);
            	    idSpecifier14=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier14.getTree());
            	    retval.attrMap.put("id", (idSpecifier14!=null?idSpecifier14.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:70:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_attrs313);
            	    classSpecifier15=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier15.getTree());
            	    retval.attrMap.put("class", (classSpecifier15!=null?classSpecifier15.klass:null));

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // ../etc/Jaml.g:72:1: divAttrs returns [Map<String,String> attrMap] : ( idSpecifier | classSpecifier )+ ;
    public final JamlParser.divAttrs_return divAttrs() throws RecognitionException {
    traceIn("divAttrs", 7);
        JamlParser.divAttrs_return retval = new JamlParser.divAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.idSpecifier_return idSpecifier16 = null;

        JamlParser.classSpecifier_return classSpecifier17 = null;



        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:72:101: ( ( idSpecifier | classSpecifier )+ )
            // ../etc/Jaml.g:73:1: ( idSpecifier | classSpecifier )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:73:1: ( idSpecifier | classSpecifier )+
            int cnt9=0;
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
            	    // ../etc/Jaml.g:73:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_divAttrs334);
            	    idSpecifier16=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier16.getTree());
            	    retval.attrMap.put("id", (idSpecifier16!=null?idSpecifier16.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:74:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_divAttrs341);
            	    classSpecifier17=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier17.getTree());
            	    retval.attrMap.put("class", (classSpecifier17!=null?classSpecifier17.klass:null));

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
    // ../etc/Jaml.g:76:1: attrHash returns [Map<String,String> attrMap] : BEGIN_HASH (am1= attrMapping ( COMMA am2= attrMapping )* )? END_HASH ;
    public final JamlParser.attrHash_return attrHash() throws RecognitionException {
    traceIn("attrHash", 8);
        JamlParser.attrHash_return retval = new JamlParser.attrHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN_HASH18=null;
        Token COMMA19=null;
        Token END_HASH20=null;
        JamlParser.attrMapping_return am1 = null;

        JamlParser.attrMapping_return am2 = null;


        CommonTree BEGIN_HASH18_tree=null;
        CommonTree COMMA19_tree=null;
        CommonTree END_HASH20_tree=null;

        retval.attrMap = new LinkedHashMap<String,String>();
        try {
            // ../etc/Jaml.g:76:101: ( BEGIN_HASH (am1= attrMapping ( COMMA am2= attrMapping )* )? END_HASH )
            // ../etc/Jaml.g:77:3: BEGIN_HASH (am1= attrMapping ( COMMA am2= attrMapping )* )? END_HASH
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN_HASH18=(Token)match(input,BEGIN_HASH,FOLLOW_BEGIN_HASH_in_attrHash363); 
            BEGIN_HASH18_tree = (CommonTree)adaptor.create(BEGIN_HASH18);
            adaptor.addChild(root_0, BEGIN_HASH18_tree);

            // ../etc/Jaml.g:78:3: (am1= attrMapping ( COMMA am2= attrMapping )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../etc/Jaml.g:78:5: am1= attrMapping ( COMMA am2= attrMapping )*
                    {
                    pushFollow(FOLLOW_attrMapping_in_attrHash371);
                    am1=attrMapping();

                    state._fsp--;

                    adaptor.addChild(root_0, am1.getTree());
                    retval.attrMap.put((am1!=null?am1.key:null), (am1!=null?am1.value:null));
                    // ../etc/Jaml.g:79:5: ( COMMA am2= attrMapping )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMMA) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../etc/Jaml.g:79:6: COMMA am2= attrMapping
                    	    {
                    	    COMMA19=(Token)match(input,COMMA,FOLLOW_COMMA_in_attrHash387); 
                    	    COMMA19_tree = (CommonTree)adaptor.create(COMMA19);
                    	    adaptor.addChild(root_0, COMMA19_tree);

                    	    pushFollow(FOLLOW_attrMapping_in_attrHash391);
                    	    am2=attrMapping();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, am2.getTree());
                    	    retval.attrMap.put((am2!=null?am2.key:null), (am2!=null?am2.value:null));

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            END_HASH20=(Token)match(input,END_HASH,FOLLOW_END_HASH_in_attrHash401); 
            END_HASH20_tree = (CommonTree)adaptor.create(END_HASH20);
            adaptor.addChild(root_0, END_HASH20_tree);


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
    // ../etc/Jaml.g:82:1: attrMapping returns [String key, String value] : ':' ID '=' '>' attrValue ;
    public final JamlParser.attrMapping_return attrMapping() throws RecognitionException {
    traceIn("attrMapping", 9);
        JamlParser.attrMapping_return retval = new JamlParser.attrMapping_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal21=null;
        Token ID22=null;
        Token char_literal23=null;
        Token char_literal24=null;
        JamlParser.attrValue_return attrValue25 = null;


        CommonTree char_literal21_tree=null;
        CommonTree ID22_tree=null;
        CommonTree char_literal23_tree=null;
        CommonTree char_literal24_tree=null;

        try {
            // ../etc/Jaml.g:82:47: ( ':' ID '=' '>' attrValue )
            // ../etc/Jaml.g:83:1: ':' ID '=' '>' attrValue
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal21=(Token)match(input,26,FOLLOW_26_in_attrMapping412); 
            char_literal21_tree = (CommonTree)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);

            ID22=(Token)match(input,ID,FOLLOW_ID_in_attrMapping414); 
            ID22_tree = (CommonTree)adaptor.create(ID22);
            adaptor.addChild(root_0, ID22_tree);

            char_literal23=(Token)match(input,27,FOLLOW_27_in_attrMapping416); 
            char_literal23_tree = (CommonTree)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);

            char_literal24=(Token)match(input,28,FOLLOW_28_in_attrMapping418); 
            char_literal24_tree = (CommonTree)adaptor.create(char_literal24);
            adaptor.addChild(root_0, char_literal24_tree);

            pushFollow(FOLLOW_attrValue_in_attrMapping420);
            attrValue25=attrValue();

            state._fsp--;

            adaptor.addChild(root_0, attrValue25.getTree());

              retval.key = (ID22!=null?ID22.getText():null); retval.value = (attrValue25!=null?attrValue25.value:null);


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
    // ../etc/Jaml.g:87:1: attrValue returns [String value] : StringLiteral ;
    public final JamlParser.attrValue_return attrValue() throws RecognitionException {
    traceIn("attrValue", 10);
        JamlParser.attrValue_return retval = new JamlParser.attrValue_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token StringLiteral26=null;

        CommonTree StringLiteral26_tree=null;

        try {
            // ../etc/Jaml.g:88:1: ( StringLiteral )
            // ../etc/Jaml.g:88:3: StringLiteral
            {
            root_0 = (CommonTree)adaptor.nil();

            StringLiteral26=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_attrValue434); 
            StringLiteral26_tree = (CommonTree)adaptor.create(StringLiteral26);
            adaptor.addChild(root_0, StringLiteral26_tree);

            retval.value = Util.parseStringLiteral((StringLiteral26!=null?StringLiteral26.getText():null));

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
    // ../etc/Jaml.g:90:1: idSpecifier returns [String id] : POUND ID ;
    public final JamlParser.idSpecifier_return idSpecifier() throws RecognitionException {
    traceIn("idSpecifier", 11);
        JamlParser.idSpecifier_return retval = new JamlParser.idSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POUND27=null;
        Token ID28=null;

        CommonTree POUND27_tree=null;
        CommonTree ID28_tree=null;

        try {
            // ../etc/Jaml.g:90:32: ( POUND ID )
            // ../etc/Jaml.g:90:34: POUND ID
            {
            root_0 = (CommonTree)adaptor.nil();

            POUND27=(Token)match(input,POUND,FOLLOW_POUND_in_idSpecifier447); 
            POUND27_tree = (CommonTree)adaptor.create(POUND27);
            adaptor.addChild(root_0, POUND27_tree);

            ID28=(Token)match(input,ID,FOLLOW_ID_in_idSpecifier449); 
            ID28_tree = (CommonTree)adaptor.create(ID28);
            adaptor.addChild(root_0, ID28_tree);

            retval.id = (ID28!=null?ID28.getText():null);

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
    // ../etc/Jaml.g:92:1: classSpecifier returns [String klass] : DOT ID ;
    public final JamlParser.classSpecifier_return classSpecifier() throws RecognitionException {
    traceIn("classSpecifier", 12);
        JamlParser.classSpecifier_return retval = new JamlParser.classSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT29=null;
        Token ID30=null;

        CommonTree DOT29_tree=null;
        CommonTree ID30_tree=null;

        try {
            // ../etc/Jaml.g:92:38: ( DOT ID )
            // ../etc/Jaml.g:93:1: DOT ID
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT29=(Token)match(input,DOT,FOLLOW_DOT_in_classSpecifier462); 
            DOT29_tree = (CommonTree)adaptor.create(DOT29);
            adaptor.addChild(root_0, DOT29_tree);

            ID30=(Token)match(input,ID,FOLLOW_ID_in_classSpecifier464); 
            ID30_tree = (CommonTree)adaptor.create(ID30);
            adaptor.addChild(root_0, ID30_tree);

            retval.klass = (ID30!=null?ID30.getText():null);

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


 

    public static final BitSet FOLLOW_line_in_prog98 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_prog102 = new BitSet(new long[]{0x000000000000C182L});
    public static final BitSet FOLLOW_elementDeclaration_in_element124 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_content_in_element127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_line157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_line165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divAttrs_in_elementDeclaration192 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrs_in_elementDeclaration219 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_content256 = new BitSet(new long[]{0x000000000000C100L});
    public static final BitSet FOLLOW_element_in_content262 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_NEWLINE_in_content269 = new BitSet(new long[]{0x000000000000C100L});
    public static final BitSet FOLLOW_element_in_content273 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_DEDENT_in_content280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_attrs299 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_attrs301 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_idSpecifier_in_attrs306 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_classSpecifier_in_attrs313 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_idSpecifier_in_divAttrs334 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_classSpecifier_in_divAttrs341 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_BEGIN_HASH_in_attrHash363 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_attrMapping_in_attrHash371 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_attrHash387 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_attrMapping_in_attrHash391 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_END_HASH_in_attrHash401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_attrMapping412 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_attrMapping414 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_attrMapping416 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_attrMapping418 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_attrValue_in_attrMapping420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_attrValue434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_idSpecifier447 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_idSpecifier449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_classSpecifier462 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ID_in_classSpecifier464 = new BitSet(new long[]{0x0000000000000002L});

}