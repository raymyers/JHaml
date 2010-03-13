// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-03-13 15:51:39

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

@SuppressWarnings("all") public class JamlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NEWLINE", "TEXT", "PERCENT", "ID", "FORWARD_SLASH", "INDENTATION", "BEGIN_HASH", "COMMA", "END_HASH", "MAP_TO", "ATTRIBUTE_NAME", "JAVA_CODE", "JAVA_LBRACE", "JAVA_RBRACE", "STRING_LITERAL", "CHAR_LITERAL", "HEX_LITERAL", "OCTAL_LITERAL", "DECIMAL_LITERAL", "FLOATING_POINT_LITERAL", "TRUE", "FALSE", "NULL", "DOT", "POUND", "Space", "WS", "WS_WITHIN_HASH", "NL", "IGNORED_NEWLINE", "HEX_DIGIT", "INTEGER_TYPE_SUFFIX", "EXPONENT", "FLOAT_TYPE_SUFFIX", "EscapeSequence", "TextLine", "InLineText", "RemainderOfLineText", "LBRACE", "RBRACE"
    };
    public static final int EXPONENT=36;
    public static final int END_HASH=12;
    public static final int LBRACE=42;
    public static final int ID=7;
    public static final int EOF=-1;
    public static final int Space=29;
    public static final int STRING_LITERAL=18;
    public static final int FLOATING_POINT_LITERAL=23;
    public static final int COMMA=11;
    public static final int HEX_LITERAL=20;
    public static final int MAP_TO=13;
    public static final int NL=32;
    public static final int DOT=27;
    public static final int JAVA_RBRACE=17;
    public static final int FLOAT_TYPE_SUFFIX=37;
    public static final int TextLine=39;
    public static final int PERCENT=6;
    public static final int IGNORED_NEWLINE=33;
    public static final int RBRACE=43;
    public static final int POUND=28;
    public static final int NULL=26;
    public static final int OCTAL_LITERAL=21;
    public static final int HEX_DIGIT=34;
    public static final int TEXT=5;
    public static final int InLineText=40;
    public static final int TRUE=24;
    public static final int BEGIN_HASH=10;
    public static final int RemainderOfLineText=41;
    public static final int ATTRIBUTE_NAME=14;
    public static final int WS=30;
    public static final int WS_WITHIN_HASH=31;
    public static final int NEWLINE=4;
    public static final int CHAR_LITERAL=19;
    public static final int JAVA_CODE=15;
    public static final int JAVA_LBRACE=16;
    public static final int FALSE=25;
    public static final int DECIMAL_LITERAL=22;
    public static final int INTEGER_TYPE_SUFFIX=35;
    public static final int EscapeSequence=38;
    public static final int FORWARD_SLASH=8;
    public static final int INDENTATION=9;

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


    Helper helper;


    public static class jamlSource_return extends ParserRuleReturnScope {
        public List<Line> lines;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "jamlSource"
    // ../etc/Jaml.g:29:1: jamlSource[JamlConfig config] returns [List<Line> lines] : ( line[$lines] NEWLINE )+ EOF ;
    public final JamlParser.jamlSource_return jamlSource(JamlConfig config) throws RecognitionException {
    traceIn("jamlSource", 1);
        JamlParser.jamlSource_return retval = new JamlParser.jamlSource_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE2=null;
        Token EOF3=null;
        JamlParser.line_return line1 = null;


        CommonTree NEWLINE2_tree=null;
        CommonTree EOF3_tree=null;


          helper = new Helper(config);
          retval.lines = new ArrayList<Line>();

        try {
            // ../etc/Jaml.g:34:1: ( ( line[$lines] NEWLINE )+ EOF )
            // ../etc/Jaml.g:34:3: ( line[$lines] NEWLINE )+ EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:34:3: ( line[$lines] NEWLINE )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=NEWLINE && LA1_0<=PERCENT)||LA1_0==INDENTATION||(LA1_0>=DOT && LA1_0<=POUND)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../etc/Jaml.g:34:4: line[$lines] NEWLINE
            	    {
            	    pushFollow(FOLLOW_line_in_jamlSource77);
            	    line1=line(retval.lines);

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, line1.getTree());
            	    NEWLINE2=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_jamlSource80); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    NEWLINE2_tree = (CommonTree)adaptor.create(NEWLINE2);
            	    adaptor.addChild(root_0, NEWLINE2_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_jamlSource84); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF3_tree = (CommonTree)adaptor.create(EOF3);
            adaptor.addChild(root_0, EOF3_tree);
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
    traceOut("jamlSource", 1);
        }
        return retval;
    }
    // $ANTLR end "jamlSource"

    protected static class line_scope {
        Line val;
        line_return node;
    }
    protected Stack line_stack = new Stack();

    public static class line_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "line"
    // ../etc/Jaml.g:36:1: line[List<Line> lines] : ( indentation )? ( element | plainText )? ;
    public final JamlParser.line_return line(List<Line> lines) throws RecognitionException {
    traceIn("line", 2);
        line_stack.push(new line_scope());
        JamlParser.line_return retval = new JamlParser.line_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.indentation_return indentation4 = null;

        JamlParser.element_return element5 = null;

        JamlParser.plainText_return plainText6 = null;




        ((line_scope)line_stack.peek()).val = new Line();
        ((line_scope)line_stack.peek()).node = retval; 

        try {
            // ../etc/Jaml.g:50:1: ( ( indentation )? ( element | plainText )? )
            // ../etc/Jaml.g:50:4: ( indentation )? ( element | plainText )?
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:50:4: ( indentation )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==INDENTATION) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../etc/Jaml.g:50:4: indentation
                    {
                    pushFollow(FOLLOW_indentation_in_line107);
                    indentation4=indentation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, indentation4.getTree());

                    }
                    break;

            }

            // ../etc/Jaml.g:50:17: ( element | plainText )?
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==PERCENT||(LA3_0>=DOT && LA3_0<=POUND)) ) {
                alt3=1;
            }
            else if ( (LA3_0==TEXT) ) {
                alt3=2;
            }
            switch (alt3) {
                case 1 :
                    // ../etc/Jaml.g:50:18: element
                    {
                    pushFollow(FOLLOW_element_in_line111);
                    element5=element();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, element5.getTree());

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:50:28: plainText
                    {
                    pushFollow(FOLLOW_plainText_in_line115);
                    plainText6=plainText();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, plainText6.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {

              ((line_scope)line_stack.peek()).val.text = input.toString(retval.start,input.LT(-1));
              ((line_scope)line_stack.peek()).val.lineNumber = retval.start.getLine();
              lines.add(((line_scope)line_stack.peek()).val);

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("line", 2);
            line_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "line"

    public static class plainText_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "plainText"
    // ../etc/Jaml.g:52:1: plainText : TEXT ;
    public final JamlParser.plainText_return plainText() throws RecognitionException {
    traceIn("plainText", 3);
        JamlParser.plainText_return retval = new JamlParser.plainText_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT7=null;

        CommonTree TEXT7_tree=null;

        try {
            // ../etc/Jaml.g:52:10: ( TEXT )
            // ../etc/Jaml.g:52:12: TEXT
            {
            root_0 = (CommonTree)adaptor.nil();

            TEXT7=(Token)match(input,TEXT,FOLLOW_TEXT_in_plainText124); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TEXT7_tree = (CommonTree)adaptor.create(TEXT7);
            adaptor.addChild(root_0, TEXT7_tree);
            }
            if ( state.backtracking==0 ) {
              ((line_scope)line_stack.peek()).val.inLineContent = (TEXT7!=null?TEXT7.getText():null);
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
    traceOut("plainText", 3);
        }
        return retval;
    }
    // $ANTLR end "plainText"

    public static class element_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "element"
    // ../etc/Jaml.g:54:1: element : ( PERCENT ( ID )? ( idSpecifier | classSpecifier )* ( attributeHash )? ( selfClose )? ( inLineContent )? | ( idSpecifier | classSpecifier )+ ( attributeHash )? ( selfClose )? ( inLineContent )? );
    public final JamlParser.element_return element() throws RecognitionException {
    traceIn("element", 4);
        JamlParser.element_return retval = new JamlParser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERCENT8=null;
        Token ID9=null;
        JamlParser.idSpecifier_return idSpecifier10 = null;

        JamlParser.classSpecifier_return classSpecifier11 = null;

        JamlParser.attributeHash_return attributeHash12 = null;

        JamlParser.selfClose_return selfClose13 = null;

        JamlParser.inLineContent_return inLineContent14 = null;

        JamlParser.idSpecifier_return idSpecifier15 = null;

        JamlParser.classSpecifier_return classSpecifier16 = null;

        JamlParser.attributeHash_return attributeHash17 = null;

        JamlParser.selfClose_return selfClose18 = null;

        JamlParser.inLineContent_return inLineContent19 = null;


        CommonTree PERCENT8_tree=null;
        CommonTree ID9_tree=null;

        try {
            // ../etc/Jaml.g:55:1: ( PERCENT ( ID )? ( idSpecifier | classSpecifier )* ( attributeHash )? ( selfClose )? ( inLineContent )? | ( idSpecifier | classSpecifier )+ ( attributeHash )? ( selfClose )? ( inLineContent )? )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==PERCENT) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=DOT && LA13_0<=POUND)) ) {
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
                    // ../etc/Jaml.g:56:3: PERCENT ( ID )? ( idSpecifier | classSpecifier )* ( attributeHash )? ( selfClose )? ( inLineContent )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    PERCENT8=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_element143); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    PERCENT8_tree = (CommonTree)adaptor.create(PERCENT8);
                    adaptor.addChild(root_0, PERCENT8_tree);
                    }
                    // ../etc/Jaml.g:56:11: ( ID )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==ID) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../etc/Jaml.g:56:11: ID
                            {
                            ID9=(Token)match(input,ID,FOLLOW_ID_in_element145); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            ID9_tree = (CommonTree)adaptor.create(ID9);
                            adaptor.addChild(root_0, ID9_tree);
                            }

                            }
                            break;

                    }

                    // ../etc/Jaml.g:56:15: ( idSpecifier | classSpecifier )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==DOT) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0==POUND) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../etc/Jaml.g:56:16: idSpecifier
                    	    {
                    	    pushFollow(FOLLOW_idSpecifier_in_element149);
                    	    idSpecifier10=idSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, idSpecifier10.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../etc/Jaml.g:56:30: classSpecifier
                    	    {
                    	    pushFollow(FOLLOW_classSpecifier_in_element153);
                    	    classSpecifier11=classSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classSpecifier11.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    // ../etc/Jaml.g:56:47: ( attributeHash )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==BEGIN_HASH) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../etc/Jaml.g:56:47: attributeHash
                            {
                            pushFollow(FOLLOW_attributeHash_in_element157);
                            attributeHash12=attributeHash();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeHash12.getTree());

                            }
                            break;

                    }

                    // ../etc/Jaml.g:56:62: ( selfClose )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==FORWARD_SLASH) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../etc/Jaml.g:56:62: selfClose
                            {
                            pushFollow(FOLLOW_selfClose_in_element160);
                            selfClose13=selfClose();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, selfClose13.getTree());

                            }
                            break;

                    }

                    // ../etc/Jaml.g:56:73: ( inLineContent )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==TEXT) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../etc/Jaml.g:56:73: inLineContent
                            {
                            pushFollow(FOLLOW_inLineContent_in_element163);
                            inLineContent14=inLineContent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, inLineContent14.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      ((line_scope)line_stack.peek()).val.tag = (ID9!=null?ID9.getText():null);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:58:5: ( idSpecifier | classSpecifier )+ ( attributeHash )? ( selfClose )? ( inLineContent )?
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:58:5: ( idSpecifier | classSpecifier )+
                    int cnt9=0;
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==DOT) ) {
                            alt9=1;
                        }
                        else if ( (LA9_0==POUND) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../etc/Jaml.g:58:6: idSpecifier
                    	    {
                    	    pushFollow(FOLLOW_idSpecifier_in_element177);
                    	    idSpecifier15=idSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, idSpecifier15.getTree());

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../etc/Jaml.g:58:20: classSpecifier
                    	    {
                    	    pushFollow(FOLLOW_classSpecifier_in_element181);
                    	    classSpecifier16=classSpecifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, classSpecifier16.getTree());

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

                    // ../etc/Jaml.g:58:37: ( attributeHash )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==BEGIN_HASH) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../etc/Jaml.g:58:37: attributeHash
                            {
                            pushFollow(FOLLOW_attributeHash_in_element185);
                            attributeHash17=attributeHash();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeHash17.getTree());

                            }
                            break;

                    }

                    // ../etc/Jaml.g:58:52: ( selfClose )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==FORWARD_SLASH) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../etc/Jaml.g:58:52: selfClose
                            {
                            pushFollow(FOLLOW_selfClose_in_element188);
                            selfClose18=selfClose();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, selfClose18.getTree());

                            }
                            break;

                    }

                    // ../etc/Jaml.g:58:63: ( inLineContent )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==TEXT) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../etc/Jaml.g:58:63: inLineContent
                            {
                            pushFollow(FOLLOW_inLineContent_in_element191);
                            inLineContent19=inLineContent();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, inLineContent19.getTree());

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {
                      ((line_scope)line_stack.peek()).val.tag = "div";
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
              ((line_scope)line_stack.peek()).val.isElement = true;
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
    traceOut("element", 4);
        }
        return retval;
    }
    // $ANTLR end "element"

    public static class selfClose_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selfClose"
    // ../etc/Jaml.g:61:1: selfClose : FORWARD_SLASH ;
    public final JamlParser.selfClose_return selfClose() throws RecognitionException {
    traceIn("selfClose", 5);
        JamlParser.selfClose_return retval = new JamlParser.selfClose_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token FORWARD_SLASH20=null;

        CommonTree FORWARD_SLASH20_tree=null;

        try {
            // ../etc/Jaml.g:61:10: ( FORWARD_SLASH )
            // ../etc/Jaml.g:61:12: FORWARD_SLASH
            {
            root_0 = (CommonTree)adaptor.nil();

            FORWARD_SLASH20=(Token)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_selfClose206); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            FORWARD_SLASH20_tree = (CommonTree)adaptor.create(FORWARD_SLASH20);
            adaptor.addChild(root_0, FORWARD_SLASH20_tree);
            }
            if ( state.backtracking==0 ) {
              ((line_scope)line_stack.peek()).val.isSelfClosing = true;
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
    traceOut("selfClose", 5);
        }
        return retval;
    }
    // $ANTLR end "selfClose"

    public static class indentation_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indentation"
    // ../etc/Jaml.g:63:1: indentation : INDENTATION ;
    public final JamlParser.indentation_return indentation() throws RecognitionException {
    traceIn("indentation", 6);
        JamlParser.indentation_return retval = new JamlParser.indentation_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INDENTATION21=null;

        CommonTree INDENTATION21_tree=null;

        try {
            // ../etc/Jaml.g:63:12: ( INDENTATION )
            // ../etc/Jaml.g:63:14: INDENTATION
            {
            root_0 = (CommonTree)adaptor.nil();

            INDENTATION21=(Token)match(input,INDENTATION,FOLLOW_INDENTATION_in_indentation215); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            INDENTATION21_tree = (CommonTree)adaptor.create(INDENTATION21);
            adaptor.addChild(root_0, INDENTATION21_tree);
            }
            if ( state.backtracking==0 ) {
              ((line_scope)line_stack.peek()).val.leadingWhitespace = (INDENTATION21!=null?INDENTATION21.getText():null);
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
    traceOut("indentation", 6);
        }
        return retval;
    }
    // $ANTLR end "indentation"

    public static class attributeHash_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeHash"
    // ../etc/Jaml.g:65:1: attributeHash : BEGIN_HASH ( attributeMapping ( COMMA attributeMapping )* )? END_HASH ;
    public final JamlParser.attributeHash_return attributeHash() throws RecognitionException {
    traceIn("attributeHash", 7);
        JamlParser.attributeHash_return retval = new JamlParser.attributeHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN_HASH22=null;
        Token COMMA24=null;
        Token END_HASH26=null;
        JamlParser.attributeMapping_return attributeMapping23 = null;

        JamlParser.attributeMapping_return attributeMapping25 = null;


        CommonTree BEGIN_HASH22_tree=null;
        CommonTree COMMA24_tree=null;
        CommonTree END_HASH26_tree=null;

        try {
            // ../etc/Jaml.g:65:14: ( BEGIN_HASH ( attributeMapping ( COMMA attributeMapping )* )? END_HASH )
            // ../etc/Jaml.g:65:16: BEGIN_HASH ( attributeMapping ( COMMA attributeMapping )* )? END_HASH
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN_HASH22=(Token)match(input,BEGIN_HASH,FOLLOW_BEGIN_HASH_in_attributeHash225); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            BEGIN_HASH22_tree = (CommonTree)adaptor.create(BEGIN_HASH22);
            adaptor.addChild(root_0, BEGIN_HASH22_tree);
            }
            // ../etc/Jaml.g:65:27: ( attributeMapping ( COMMA attributeMapping )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ATTRIBUTE_NAME||(LA15_0>=STRING_LITERAL && LA15_0<=NULL)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../etc/Jaml.g:65:28: attributeMapping ( COMMA attributeMapping )*
                    {
                    pushFollow(FOLLOW_attributeMapping_in_attributeHash228);
                    attributeMapping23=attributeMapping();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeMapping23.getTree());
                    // ../etc/Jaml.g:65:45: ( COMMA attributeMapping )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==COMMA) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../etc/Jaml.g:65:46: COMMA attributeMapping
                    	    {
                    	    COMMA24=(Token)match(input,COMMA,FOLLOW_COMMA_in_attributeHash231); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    COMMA24_tree = (CommonTree)adaptor.create(COMMA24);
                    	    adaptor.addChild(root_0, COMMA24_tree);
                    	    }
                    	    pushFollow(FOLLOW_attributeMapping_in_attributeHash233);
                    	    attributeMapping25=attributeMapping();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, attributeMapping25.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);


                    }
                    break;

            }

            END_HASH26=(Token)match(input,END_HASH,FOLLOW_END_HASH_in_attributeHash239); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            END_HASH26_tree = (CommonTree)adaptor.create(END_HASH26);
            adaptor.addChild(root_0, END_HASH26_tree);
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
    traceOut("attributeHash", 7);
        }
        return retval;
    }
    // $ANTLR end "attributeHash"

    public static class attributeMapping_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attributeMapping"
    // ../etc/Jaml.g:67:1: attributeMapping : attribute MAP_TO attribute_value ;
    public final JamlParser.attributeMapping_return attributeMapping() throws RecognitionException {
    traceIn("attributeMapping", 8);
        JamlParser.attributeMapping_return retval = new JamlParser.attributeMapping_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token MAP_TO28=null;
        JamlParser.attribute_return attribute27 = null;

        JamlParser.attribute_value_return attribute_value29 = null;


        CommonTree MAP_TO28_tree=null;

        try {
            // ../etc/Jaml.g:67:17: ( attribute MAP_TO attribute_value )
            // ../etc/Jaml.g:67:19: attribute MAP_TO attribute_value
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_attribute_in_attributeMapping246);
            attribute27=attribute();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute27.getTree());
            MAP_TO28=(Token)match(input,MAP_TO,FOLLOW_MAP_TO_in_attributeMapping248); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            MAP_TO28_tree = (CommonTree)adaptor.create(MAP_TO28);
            adaptor.addChild(root_0, MAP_TO28_tree);
            }
            pushFollow(FOLLOW_attribute_value_in_attributeMapping250);
            attribute_value29=attribute_value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, attribute_value29.getTree());
            if ( state.backtracking==0 ) {

              ((line_scope)line_stack.peek()).val.attrMap.put((attribute27!=null?attribute27.name:null), (attribute_value29!=null?attribute_value29.value:null));

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
    traceOut("attributeMapping", 8);
        }
        return retval;
    }
    // $ANTLR end "attributeMapping"

    public static class attribute_return extends ParserRuleReturnScope {
        public String name;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute"
    // ../etc/Jaml.g:73:1: attribute returns [String name] : (n= ATTRIBUTE_NAME | literal );
    public final JamlParser.attribute_return attribute() throws RecognitionException {
    traceIn("attribute", 9);
        JamlParser.attribute_return retval = new JamlParser.attribute_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token n=null;
        JamlParser.literal_return literal30 = null;


        CommonTree n_tree=null;

        try {
            // ../etc/Jaml.g:73:32: (n= ATTRIBUTE_NAME | literal )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ATTRIBUTE_NAME) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=STRING_LITERAL && LA16_0<=NULL)) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../etc/Jaml.g:74:3: n= ATTRIBUTE_NAME
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    n=(Token)match(input,ATTRIBUTE_NAME,FOLLOW_ATTRIBUTE_NAME_in_attribute269); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    n_tree = (CommonTree)adaptor.create(n);
                    adaptor.addChild(root_0, n_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.name = (n!=null?n.getText():null).substring(1);
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:75:3: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_attribute277);
                    literal30=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal30.getTree());
                    if ( state.backtracking==0 ) {
                      retval.name = (literal30!=null?literal30.value:null);
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
    traceOut("attribute", 9);
        }
        return retval;
    }
    // $ANTLR end "attribute"

    public static class attribute_value_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "attribute_value"
    // ../etc/Jaml.g:78:1: attribute_value returns [String value] : ( ( ( literal ( COMMA | END_HASH ) )=> literal ) | ex= javaExpression );
    public final JamlParser.attribute_value_return attribute_value() throws RecognitionException {
    traceIn("attribute_value", 10);
        JamlParser.attribute_value_return retval = new JamlParser.attribute_value_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.javaExpression_return ex = null;

        JamlParser.literal_return literal31 = null;



        try {
            // ../etc/Jaml.g:78:39: ( ( ( literal ( COMMA | END_HASH ) )=> literal ) | ex= javaExpression )
            int alt17=2;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                int LA17_1 = input.LA(2);

                if ( (synpred1_Jaml()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
                }
                break;
            case CHAR_LITERAL:
                {
                int LA17_2 = input.LA(2);

                if ( (synpred1_Jaml()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 2, input);

                    throw nvae;
                }
                }
                break;
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case DECIMAL_LITERAL:
                {
                int LA17_3 = input.LA(2);

                if ( (synpred1_Jaml()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 3, input);

                    throw nvae;
                }
                }
                break;
            case FLOATING_POINT_LITERAL:
                {
                int LA17_4 = input.LA(2);

                if ( (synpred1_Jaml()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 4, input);

                    throw nvae;
                }
                }
                break;
            case TRUE:
            case FALSE:
            case NULL:
                {
                int LA17_5 = input.LA(2);

                if ( (synpred1_Jaml()) ) {
                    alt17=1;
                }
                else if ( (true) ) {
                    alt17=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 5, input);

                    throw nvae;
                }
                }
                break;
            case JAVA_CODE:
            case JAVA_LBRACE:
            case JAVA_RBRACE:
                {
                alt17=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../etc/Jaml.g:79:3: ( ( literal ( COMMA | END_HASH ) )=> literal )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:79:3: ( ( literal ( COMMA | END_HASH ) )=> literal )
                    // ../etc/Jaml.g:79:4: ( literal ( COMMA | END_HASH ) )=> literal
                    {
                    pushFollow(FOLLOW_literal_in_attribute_value307);
                    literal31=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal31.getTree());
                    if ( state.backtracking==0 ) {
                      retval.value =(literal31!=null?literal31.value:null);
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:80:3: ex= javaExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_javaExpression_in_attribute_value320);
                    ex=javaExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, ex.getTree());
                    if ( state.backtracking==0 ) {

                        retval.value = helper.jspExpression(input.toString(((line_scope)line_stack.peek()).node.start,input.LT(-1)), input.toString(retval.start,input.LT(-1)));
                        
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
    traceOut("attribute_value", 10);
        }
        return retval;
    }
    // $ANTLR end "attribute_value"

    public static class javaExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "javaExpression"
    // ../etc/Jaml.g:85:1: javaExpression : ( JAVA_CODE | literal | JAVA_LBRACE | JAVA_RBRACE )+ ;
    public final JamlParser.javaExpression_return javaExpression() throws RecognitionException {
    traceIn("javaExpression", 11);
        JamlParser.javaExpression_return retval = new JamlParser.javaExpression_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token JAVA_CODE32=null;
        Token JAVA_LBRACE34=null;
        Token JAVA_RBRACE35=null;
        JamlParser.literal_return literal33 = null;


        CommonTree JAVA_CODE32_tree=null;
        CommonTree JAVA_LBRACE34_tree=null;
        CommonTree JAVA_RBRACE35_tree=null;

        try {
            // ../etc/Jaml.g:85:15: ( ( JAVA_CODE | literal | JAVA_LBRACE | JAVA_RBRACE )+ )
            // ../etc/Jaml.g:85:17: ( JAVA_CODE | literal | JAVA_LBRACE | JAVA_RBRACE )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:85:17: ( JAVA_CODE | literal | JAVA_LBRACE | JAVA_RBRACE )+
            int cnt18=0;
            loop18:
            do {
                int alt18=5;
                switch ( input.LA(1) ) {
                case JAVA_CODE:
                    {
                    alt18=1;
                    }
                    break;
                case STRING_LITERAL:
                case CHAR_LITERAL:
                case HEX_LITERAL:
                case OCTAL_LITERAL:
                case DECIMAL_LITERAL:
                case FLOATING_POINT_LITERAL:
                case TRUE:
                case FALSE:
                case NULL:
                    {
                    alt18=2;
                    }
                    break;
                case JAVA_LBRACE:
                    {
                    alt18=3;
                    }
                    break;
                case JAVA_RBRACE:
                    {
                    alt18=4;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../etc/Jaml.g:85:18: JAVA_CODE
            	    {
            	    JAVA_CODE32=(Token)match(input,JAVA_CODE,FOLLOW_JAVA_CODE_in_javaExpression331); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    JAVA_CODE32_tree = (CommonTree)adaptor.create(JAVA_CODE32);
            	    adaptor.addChild(root_0, JAVA_CODE32_tree);
            	    }

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:85:30: literal
            	    {
            	    pushFollow(FOLLOW_literal_in_javaExpression335);
            	    literal33=literal();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal33.getTree());

            	    }
            	    break;
            	case 3 :
            	    // ../etc/Jaml.g:85:40: JAVA_LBRACE
            	    {
            	    JAVA_LBRACE34=(Token)match(input,JAVA_LBRACE,FOLLOW_JAVA_LBRACE_in_javaExpression339); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    JAVA_LBRACE34_tree = (CommonTree)adaptor.create(JAVA_LBRACE34);
            	    adaptor.addChild(root_0, JAVA_LBRACE34_tree);
            	    }

            	    }
            	    break;
            	case 4 :
            	    // ../etc/Jaml.g:85:54: JAVA_RBRACE
            	    {
            	    JAVA_RBRACE35=(Token)match(input,JAVA_RBRACE,FOLLOW_JAVA_RBRACE_in_javaExpression343); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    JAVA_RBRACE35_tree = (CommonTree)adaptor.create(JAVA_RBRACE35);
            	    adaptor.addChild(root_0, JAVA_RBRACE35_tree);
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
    traceOut("javaExpression", 11);
        }
        return retval;
    }
    // $ANTLR end "javaExpression"

    public static class literal_return extends ParserRuleReturnScope {
        public String value;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // ../etc/Jaml.g:87:1: literal returns [String value] : (lit= STRING_LITERAL | lit= CHAR_LITERAL | lit= ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL ) | lit= FLOATING_POINT_LITERAL | lit= ( TRUE | FALSE | NULL ) );
    public final JamlParser.literal_return literal() throws RecognitionException {
    traceIn("literal", 12);
        JamlParser.literal_return retval = new JamlParser.literal_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token lit=null;

        CommonTree lit_tree=null;

        try {
            // ../etc/Jaml.g:87:31: (lit= STRING_LITERAL | lit= CHAR_LITERAL | lit= ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL ) | lit= FLOATING_POINT_LITERAL | lit= ( TRUE | FALSE | NULL ) )
            int alt19=5;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt19=1;
                }
                break;
            case CHAR_LITERAL:
                {
                alt19=2;
                }
                break;
            case HEX_LITERAL:
            case OCTAL_LITERAL:
            case DECIMAL_LITERAL:
                {
                alt19=3;
                }
                break;
            case FLOATING_POINT_LITERAL:
                {
                alt19=4;
                }
                break;
            case TRUE:
            case FALSE:
            case NULL:
                {
                alt19=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../etc/Jaml.g:88:3: lit= STRING_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_literal361); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = helper.parseStringLiteral((lit!=null?lit.getText():null));
                    }

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:89:3: lit= CHAR_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_literal371); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = helper.parseCharLiteral((lit!=null?lit.getText():null));
                    }

                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:90:3: lit= ( HEX_LITERAL | OCTAL_LITERAL | DECIMAL_LITERAL )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)input.LT(1);
                    if ( (input.LA(1)>=HEX_LITERAL && input.LA(1)<=DECIMAL_LITERAL) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(lit));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    if ( state.backtracking==0 ) {
                      retval.value = helper.parseIntegerLiteral((lit!=null?lit.getText():null));
                    }

                    }
                    break;
                case 4 :
                    // ../etc/Jaml.g:91:3: lit= FLOATING_POINT_LITERAL
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)match(input,FLOATING_POINT_LITERAL,FOLLOW_FLOATING_POINT_LITERAL_in_literal397); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    lit_tree = (CommonTree)adaptor.create(lit);
                    adaptor.addChild(root_0, lit_tree);
                    }
                    if ( state.backtracking==0 ) {
                      retval.value = helper.parseFloatLiteral((lit!=null?lit.getText():null));
                    }

                    }
                    break;
                case 5 :
                    // ../etc/Jaml.g:92:3: lit= ( TRUE | FALSE | NULL )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    lit=(Token)input.LT(1);
                    if ( (input.LA(1)>=TRUE && input.LA(1)<=NULL) ) {
                        input.consume();
                        if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(lit));
                        state.errorRecovery=false;state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    if ( state.backtracking==0 ) {
                      retval.value = (lit!=null?lit.getText():null);
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
    traceOut("literal", 12);
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class idSpecifier_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idSpecifier"
    // ../etc/Jaml.g:95:1: idSpecifier : DOT ( ID )? ;
    public final JamlParser.idSpecifier_return idSpecifier() throws RecognitionException {
    traceIn("idSpecifier", 13);
        JamlParser.idSpecifier_return retval = new JamlParser.idSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT36=null;
        Token ID37=null;

        CommonTree DOT36_tree=null;
        CommonTree ID37_tree=null;

        try {
            // ../etc/Jaml.g:95:12: ( DOT ( ID )? )
            // ../etc/Jaml.g:95:14: DOT ( ID )?
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT36=(Token)match(input,DOT,FOLLOW_DOT_in_idSpecifier423); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            DOT36_tree = (CommonTree)adaptor.create(DOT36);
            adaptor.addChild(root_0, DOT36_tree);
            }
            // ../etc/Jaml.g:95:18: ( ID )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../etc/Jaml.g:95:18: ID
                    {
                    ID37=(Token)match(input,ID,FOLLOW_ID_in_idSpecifier425); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID37_tree = (CommonTree)adaptor.create(ID37);
                    adaptor.addChild(root_0, ID37_tree);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              ((line_scope)line_stack.peek()).val.classes.add((ID37!=null?ID37.getText():null));
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
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "classSpecifier"
    // ../etc/Jaml.g:97:1: classSpecifier : POUND ( ID )? ;
    public final JamlParser.classSpecifier_return classSpecifier() throws RecognitionException {
    traceIn("classSpecifier", 14);
        JamlParser.classSpecifier_return retval = new JamlParser.classSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POUND38=null;
        Token ID39=null;

        CommonTree POUND38_tree=null;
        CommonTree ID39_tree=null;

        try {
            // ../etc/Jaml.g:97:15: ( POUND ( ID )? )
            // ../etc/Jaml.g:97:17: POUND ( ID )?
            {
            root_0 = (CommonTree)adaptor.nil();

            POUND38=(Token)match(input,POUND,FOLLOW_POUND_in_classSpecifier436); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            POUND38_tree = (CommonTree)adaptor.create(POUND38);
            adaptor.addChild(root_0, POUND38_tree);
            }
            // ../etc/Jaml.g:97:23: ( ID )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../etc/Jaml.g:97:23: ID
                    {
                    ID39=(Token)match(input,ID,FOLLOW_ID_in_classSpecifier438); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    ID39_tree = (CommonTree)adaptor.create(ID39);
                    adaptor.addChild(root_0, ID39_tree);
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
              ((line_scope)line_stack.peek()).val.ids.add((ID39!=null?ID39.getText():null));
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

    public static class inLineContent_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "inLineContent"
    // ../etc/Jaml.g:99:1: inLineContent : TEXT ;
    public final JamlParser.inLineContent_return inLineContent() throws RecognitionException {
    traceIn("inLineContent", 15);
        JamlParser.inLineContent_return retval = new JamlParser.inLineContent_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT40=null;

        CommonTree TEXT40_tree=null;

        try {
            // ../etc/Jaml.g:99:14: ( TEXT )
            // ../etc/Jaml.g:99:16: TEXT
            {
            root_0 = (CommonTree)adaptor.nil();

            TEXT40=(Token)match(input,TEXT,FOLLOW_TEXT_in_inLineContent448); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            TEXT40_tree = (CommonTree)adaptor.create(TEXT40);
            adaptor.addChild(root_0, TEXT40_tree);
            }
            if ( state.backtracking==0 ) {
              ((line_scope)line_stack.peek()).val.inLineContent = (TEXT40!=null?TEXT40.getText():null);
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
    traceOut("inLineContent", 15);
        }
        return retval;
    }
    // $ANTLR end "inLineContent"

    // $ANTLR start synpred1_Jaml
    public final void synpred1_Jaml_fragment() throws RecognitionException {   
        traceIn("synpred1_Jaml_fragment", 16);
        try {
            // ../etc/Jaml.g:79:4: ( literal ( COMMA | END_HASH ) )
            // ../etc/Jaml.g:79:5: literal ( COMMA | END_HASH )
            {
            pushFollow(FOLLOW_literal_in_synpred1_Jaml295);
            literal();

            state._fsp--;
            if (state.failed) return ;
            if ( (input.LA(1)>=COMMA && input.LA(1)<=END_HASH) ) {
                input.consume();
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        finally {
            traceOut("synpred1_Jaml_fragment", 16);
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


 

    public static final BitSet FOLLOW_line_in_jamlSource77 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_NEWLINE_in_jamlSource80 = new BitSet(new long[]{0x0000000018000270L});
    public static final BitSet FOLLOW_EOF_in_jamlSource84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_indentation_in_line107 = new BitSet(new long[]{0x0000000018000062L});
    public static final BitSet FOLLOW_element_in_line111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plainText_in_line115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_plainText124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_element143 = new BitSet(new long[]{0x00000000180005E2L});
    public static final BitSet FOLLOW_ID_in_element145 = new BitSet(new long[]{0x0000000018000562L});
    public static final BitSet FOLLOW_idSpecifier_in_element149 = new BitSet(new long[]{0x0000000018000562L});
    public static final BitSet FOLLOW_classSpecifier_in_element153 = new BitSet(new long[]{0x0000000018000562L});
    public static final BitSet FOLLOW_attributeHash_in_element157 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_selfClose_in_element160 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_inLineContent_in_element163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_idSpecifier_in_element177 = new BitSet(new long[]{0x0000000018000562L});
    public static final BitSet FOLLOW_classSpecifier_in_element181 = new BitSet(new long[]{0x0000000018000562L});
    public static final BitSet FOLLOW_attributeHash_in_element185 = new BitSet(new long[]{0x0000000000000122L});
    public static final BitSet FOLLOW_selfClose_in_element188 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_inLineContent_in_element191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_selfClose206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENTATION_in_indentation215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_HASH_in_attributeHash225 = new BitSet(new long[]{0x0000000007FC5000L});
    public static final BitSet FOLLOW_attributeMapping_in_attributeHash228 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_COMMA_in_attributeHash231 = new BitSet(new long[]{0x0000000007FC4000L});
    public static final BitSet FOLLOW_attributeMapping_in_attributeHash233 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_END_HASH_in_attributeHash239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributeMapping246 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_MAP_TO_in_attributeMapping248 = new BitSet(new long[]{0x0000000007FFC000L});
    public static final BitSet FOLLOW_attribute_value_in_attributeMapping250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_NAME_in_attribute269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_attribute277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_attribute_value307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_javaExpression_in_attribute_value320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JAVA_CODE_in_javaExpression331 = new BitSet(new long[]{0x0000000007FFC002L});
    public static final BitSet FOLLOW_literal_in_javaExpression335 = new BitSet(new long[]{0x0000000007FFC002L});
    public static final BitSet FOLLOW_JAVA_LBRACE_in_javaExpression339 = new BitSet(new long[]{0x0000000007FFC002L});
    public static final BitSet FOLLOW_JAVA_RBRACE_in_javaExpression343 = new BitSet(new long[]{0x0000000007FFC002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_literal361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_literal371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOATING_POINT_LITERAL_in_literal397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_literal407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_idSpecifier423 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_idSpecifier425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_classSpecifier436 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_ID_in_classSpecifier438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_inLineContent448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_synpred1_Jaml295 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_synpred1_Jaml297 = new BitSet(new long[]{0x0000000000000002L});

}