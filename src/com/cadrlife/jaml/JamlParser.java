// $ANTLR 3.2 Sep 23, 2009 12:02:23 ../etc/Jaml.g 2010-02-27 11:49:44

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
    // ../etc/Jaml.g:62:1: element returns [String rendering] : elementDeclaration ( freeformText NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) ;
    public final JamlParser.element_return element() throws RecognitionException {
    traceIn("element", 2);
        JamlParser.element_return retval = new JamlParser.element_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE4=null;
        Token NEWLINE5=null;
        Token FORWARD_SLASH7=null;
        Token NEWLINE8=null;
        JamlParser.elementDeclaration_return elementDeclaration2 = null;

        JamlParser.freeformText_return freeformText3 = null;

        JamlParser.content_return content6 = null;


        CommonTree NEWLINE4_tree=null;
        CommonTree NEWLINE5_tree=null;
        CommonTree FORWARD_SLASH7_tree=null;
        CommonTree NEWLINE8_tree=null;

        String content = ""; boolean selfClosing=false;
        try {
            // ../etc/Jaml.g:62:91: ( elementDeclaration ( freeformText NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE ) )
            // ../etc/Jaml.g:63:3: elementDeclaration ( freeformText NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_elementDeclaration_in_element122);
            elementDeclaration2=elementDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, elementDeclaration2.getTree());
            // ../etc/Jaml.g:64:4: ( freeformText NEWLINE | NEWLINE ( content )? | FORWARD_SLASH NEWLINE )
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
                    // ../etc/Jaml.g:64:6: freeformText NEWLINE
                    {
                    pushFollow(FOLLOW_freeformText_in_element130);
                    freeformText3=freeformText();

                    state._fsp--;

                    adaptor.addChild(root_0, freeformText3.getTree());
                    NEWLINE4=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element132); 
                    NEWLINE4_tree = (CommonTree)adaptor.create(NEWLINE4);
                    adaptor.addChild(root_0, NEWLINE4_tree);

                    content = (freeformText3!=null?freeformText3.rendering:null);

                    }
                    break;
                case 2 :
                    // ../etc/Jaml.g:65:6: NEWLINE ( content )?
                    {
                    NEWLINE5=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_element144); 
                    NEWLINE5_tree = (CommonTree)adaptor.create(NEWLINE5);
                    adaptor.addChild(root_0, NEWLINE5_tree);

                    // ../etc/Jaml.g:65:14: ( content )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==INDENT) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../etc/Jaml.g:65:15: content
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
                    // ../etc/Jaml.g:66:6: FORWARD_SLASH NEWLINE
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
    // ../etc/Jaml.g:70:1: line returns [String rendering] : ( element | freeformText NEWLINE | NEWLINE );
    public final JamlParser.line_return line() throws RecognitionException {
    traceIn("line", 3);
        JamlParser.line_return retval = new JamlParser.line_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token NEWLINE11=null;
        Token NEWLINE12=null;
        JamlParser.element_return element9 = null;

        JamlParser.freeformText_return freeformText10 = null;


        CommonTree NEWLINE11_tree=null;
        CommonTree NEWLINE12_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:70:60: ( element | freeformText NEWLINE | NEWLINE )
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
                    // ../etc/Jaml.g:71:3: element
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
                    // ../etc/Jaml.g:72:5: freeformText NEWLINE
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_freeformText_in_line199);
                    freeformText10=freeformText();

                    state._fsp--;

                    adaptor.addChild(root_0, freeformText10.getTree());
                    retval.rendering = (freeformText10!=null?freeformText10.rendering:null);
                    NEWLINE11=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_line203); 
                    NEWLINE11_tree = (CommonTree)adaptor.create(NEWLINE11);
                    adaptor.addChild(root_0, NEWLINE11_tree);


                    }
                    break;
                case 3 :
                    // ../etc/Jaml.g:73:5: NEWLINE
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

    public static class freeformText_return extends ParserRuleReturnScope {
        public String rendering;
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "freeformText"
    // ../etc/Jaml.g:76:1: freeformText returns [String rendering] : TEXT ;
    public final JamlParser.freeformText_return freeformText() throws RecognitionException {
    traceIn("freeformText", 4);
        JamlParser.freeformText_return retval = new JamlParser.freeformText_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token TEXT13=null;

        CommonTree TEXT13_tree=null;

        try {
            // ../etc/Jaml.g:76:40: ( TEXT )
            // ../etc/Jaml.g:77:7: TEXT
            {
            root_0 = (CommonTree)adaptor.nil();

            TEXT13=(Token)match(input,TEXT,FOLLOW_TEXT_in_freeformText231); 
            TEXT13_tree = (CommonTree)adaptor.create(TEXT13);
            adaptor.addChild(root_0, TEXT13_tree);


                    retval.rendering = util.parseFreeFormText((TEXT13!=null?TEXT13.getText():null));
                  

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
    // ../etc/Jaml.g:82:1: elementDeclaration returns [String type, Map<String,String> attrMap] : ( (a1= divAttrs[$attrMap] ( attrHash[$attrMap] )? ) | (a2= attrs[$attrMap] ( attrHash[$attrMap] )? ) );
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
        try {
            // ../etc/Jaml.g:83:57: ( (a1= divAttrs[$attrMap] ( attrHash[$attrMap] )? ) | (a2= attrs[$attrMap] ( attrHash[$attrMap] )? ) )
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
                    // ../etc/Jaml.g:84:3: (a1= divAttrs[$attrMap] ( attrHash[$attrMap] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:84:3: (a1= divAttrs[$attrMap] ( attrHash[$attrMap] )? )
                    // ../etc/Jaml.g:84:4: a1= divAttrs[$attrMap] ( attrHash[$attrMap] )?
                    {
                    pushFollow(FOLLOW_divAttrs_in_elementDeclaration263);
                    a1=divAttrs(retval.attrMap);

                    state._fsp--;

                    adaptor.addChild(root_0, a1.getTree());
                    retval.type = "div";
                    // ../etc/Jaml.g:84:43: ( attrHash[$attrMap] )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==BEGIN_HASH) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../etc/Jaml.g:84:43: attrHash[$attrMap]
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration268);
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
                    // ../etc/Jaml.g:86:2: (a2= attrs[$attrMap] ( attrHash[$attrMap] )? )
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    // ../etc/Jaml.g:86:2: (a2= attrs[$attrMap] ( attrHash[$attrMap] )? )
                    // ../etc/Jaml.g:87:3: a2= attrs[$attrMap] ( attrHash[$attrMap] )?
                    {
                    pushFollow(FOLLOW_attrs_in_elementDeclaration283);
                    a2=attrs(retval.attrMap);

                    state._fsp--;

                    adaptor.addChild(root_0, a2.getTree());
                    retval.type = (a2!=null?a2.type:null);
                    // ../etc/Jaml.g:88:3: ( attrHash[$attrMap] )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==BEGIN_HASH) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../etc/Jaml.g:88:3: attrHash[$attrMap]
                            {
                            pushFollow(FOLLOW_attrHash_in_elementDeclaration291);
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
    // ../etc/Jaml.g:91:1: content returns [String rendering] : INDENT (e1= element | freeformText NEWLINE )+ DEDENT ;
    public final JamlParser.content_return content() throws RecognitionException {
    traceIn("content", 6);
        JamlParser.content_return retval = new JamlParser.content_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token INDENT16=null;
        Token NEWLINE18=null;
        Token DEDENT19=null;
        JamlParser.element_return e1 = null;

        JamlParser.freeformText_return freeformText17 = null;


        CommonTree INDENT16_tree=null;
        CommonTree NEWLINE18_tree=null;
        CommonTree DEDENT19_tree=null;

         retval.rendering = ""; 
        try {
            // ../etc/Jaml.g:91:63: ( INDENT (e1= element | freeformText NEWLINE )+ DEDENT )
            // ../etc/Jaml.g:92:1: INDENT (e1= element | freeformText NEWLINE )+ DEDENT
            {
            root_0 = (CommonTree)adaptor.nil();

            INDENT16=(Token)match(input,INDENT,FOLLOW_INDENT_in_content315); 
            INDENT16_tree = (CommonTree)adaptor.create(INDENT16);
            adaptor.addChild(root_0, INDENT16_tree);

            // ../etc/Jaml.g:93:2: (e1= element | freeformText NEWLINE )+
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
            	    // ../etc/Jaml.g:93:3: e1= element
            	    {
            	    pushFollow(FOLLOW_element_in_content322);
            	    e1=element();

            	    state._fsp--;

            	    adaptor.addChild(root_0, e1.getTree());
            	    retval.rendering += (e1!=null?e1.rendering:null) + "\n";

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:93:54: freeformText NEWLINE
            	    {
            	    pushFollow(FOLLOW_freeformText_in_content328);
            	    freeformText17=freeformText();

            	    state._fsp--;

            	    adaptor.addChild(root_0, freeformText17.getTree());
            	    NEWLINE18=(Token)match(input,NEWLINE,FOLLOW_NEWLINE_in_content330); 
            	    NEWLINE18_tree = (CommonTree)adaptor.create(NEWLINE18);
            	    adaptor.addChild(root_0, NEWLINE18_tree);

            	    retval.rendering += (freeformText17!=null?freeformText17.rendering:null) + "\n";

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

            DEDENT19=(Token)match(input,DEDENT,FOLLOW_DEDENT_in_content336); 
            DEDENT19_tree = (CommonTree)adaptor.create(DEDENT19);
            adaptor.addChild(root_0, DEDENT19_tree);

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
    // ../etc/Jaml.g:98:1: attrs[Map<String,String> attrMap] returns [String type] : PERCENT ID ( idSpecifier | classSpecifier )* ;
    public final JamlParser.attrs_return attrs(Map<String,String> attrMap) throws RecognitionException {
    traceIn("attrs", 7);
        JamlParser.attrs_return retval = new JamlParser.attrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token PERCENT20=null;
        Token ID21=null;
        JamlParser.idSpecifier_return idSpecifier22 = null;

        JamlParser.classSpecifier_return classSpecifier23 = null;


        CommonTree PERCENT20_tree=null;
        CommonTree ID21_tree=null;

        try {
            // ../etc/Jaml.g:98:56: ( PERCENT ID ( idSpecifier | classSpecifier )* )
            // ../etc/Jaml.g:99:1: PERCENT ID ( idSpecifier | classSpecifier )*
            {
            root_0 = (CommonTree)adaptor.nil();

            PERCENT20=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_attrs351); 
            PERCENT20_tree = (CommonTree)adaptor.create(PERCENT20);
            adaptor.addChild(root_0, PERCENT20_tree);

            ID21=(Token)match(input,ID,FOLLOW_ID_in_attrs353); 
            ID21_tree = (CommonTree)adaptor.create(ID21);
            adaptor.addChild(root_0, ID21_tree);

            retval.type = (ID21!=null?ID21.getText():null);
            // ../etc/Jaml.g:100:1: ( idSpecifier | classSpecifier )*
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
            	    // ../etc/Jaml.g:100:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_attrs358);
            	    idSpecifier22=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier22.getTree());
            	    attrMap.put("id", (idSpecifier22!=null?idSpecifier22.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:101:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_attrs365);
            	    classSpecifier23=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier23.getTree());
            	    attrMap.put("class", (classSpecifier23!=null?classSpecifier23.klass:null));

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
    // ../etc/Jaml.g:103:1: divAttrs[Map<String,String> attrMap] : ( idSpecifier | classSpecifier )+ ;
    public final JamlParser.divAttrs_return divAttrs(Map<String,String> attrMap) throws RecognitionException {
    traceIn("divAttrs", 8);
        JamlParser.divAttrs_return retval = new JamlParser.divAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.idSpecifier_return idSpecifier24 = null;

        JamlParser.classSpecifier_return classSpecifier25 = null;



        try {
            // ../etc/Jaml.g:103:38: ( ( idSpecifier | classSpecifier )+ )
            // ../etc/Jaml.g:104:1: ( idSpecifier | classSpecifier )+
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:104:1: ( idSpecifier | classSpecifier )+
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
            	    // ../etc/Jaml.g:104:2: idSpecifier
            	    {
            	    pushFollow(FOLLOW_idSpecifier_in_divAttrs379);
            	    idSpecifier24=idSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, idSpecifier24.getTree());
            	    attrMap.put("id", (idSpecifier24!=null?idSpecifier24.id:null));

            	    }
            	    break;
            	case 2 :
            	    // ../etc/Jaml.g:105:2: classSpecifier
            	    {
            	    pushFollow(FOLLOW_classSpecifier_in_divAttrs386);
            	    classSpecifier25=classSpecifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, classSpecifier25.getTree());
            	    attrMap.put("class", (classSpecifier25!=null?classSpecifier25.klass:null));

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
    // ../etc/Jaml.g:107:1: attrHash[Map<String,String> attrMap] : BEGIN_HASH hashAttrs END_HASH ;
    public final JamlParser.attrHash_return attrHash(Map<String,String> attrMap) throws RecognitionException {
    traceIn("attrHash", 9);
        JamlParser.attrHash_return retval = new JamlParser.attrHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token BEGIN_HASH26=null;
        Token END_HASH28=null;
        JamlParser.hashAttrs_return hashAttrs27 = null;


        CommonTree BEGIN_HASH26_tree=null;
        CommonTree END_HASH28_tree=null;

        try {
            // ../etc/Jaml.g:107:38: ( BEGIN_HASH hashAttrs END_HASH )
            // ../etc/Jaml.g:108:3: BEGIN_HASH hashAttrs END_HASH
            {
            root_0 = (CommonTree)adaptor.nil();

            BEGIN_HASH26=(Token)match(input,BEGIN_HASH,FOLLOW_BEGIN_HASH_in_attrHash401); 
            BEGIN_HASH26_tree = (CommonTree)adaptor.create(BEGIN_HASH26);
            adaptor.addChild(root_0, BEGIN_HASH26_tree);

            System.out.println("BEGIN " + input.toString(retval.start,input.LT(-1)));
            pushFollow(FOLLOW_hashAttrs_in_attrHash407);
            hashAttrs27=hashAttrs();

            state._fsp--;

            adaptor.addChild(root_0, hashAttrs27.getTree());
            END_HASH28=(Token)match(input,END_HASH,FOLLOW_END_HASH_in_attrHash412); 
            END_HASH28_tree = (CommonTree)adaptor.create(END_HASH28);
            adaptor.addChild(root_0, END_HASH28_tree);

            util.parseAttrHash((hashAttrs27!=null?hashAttrs27.contents:null), attrMap);

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
    // ../etc/Jaml.g:112:1: hashAttrs returns [String contents] : ( notEndHash )* ;
    public final JamlParser.hashAttrs_return hashAttrs() throws RecognitionException {
    traceIn("hashAttrs", 10);
        JamlParser.hashAttrs_return retval = new JamlParser.hashAttrs_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        JamlParser.notEndHash_return notEndHash29 = null;



        retval.contents ="";
        try {
            // ../etc/Jaml.g:112:59: ( ( notEndHash )* )
            // ../etc/Jaml.g:113:1: ( notEndHash )*
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:113:1: ( notEndHash )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=INDENT && LA11_0<=BEGIN_HASH)||(LA11_0>=POUND && LA11_0<=JAVA_RBRACE)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../etc/Jaml.g:113:2: notEndHash
            	    {
            	    pushFollow(FOLLOW_notEndHash_in_hashAttrs432);
            	    notEndHash29=notEndHash();

            	    state._fsp--;

            	    adaptor.addChild(root_0, notEndHash29.getTree());
            	    retval.contents += (notEndHash29!=null?input.toString(notEndHash29.start,notEndHash29.stop):null);

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
    // ../etc/Jaml.g:115:1: notEndHash : (~ END_HASH ) ;
    public final JamlParser.notEndHash_return notEndHash() throws RecognitionException {
    traceIn("notEndHash", 11);
        JamlParser.notEndHash_return retval = new JamlParser.notEndHash_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token set30=null;

        CommonTree set30_tree=null;

        try {
            // ../etc/Jaml.g:115:12: ( (~ END_HASH ) )
            // ../etc/Jaml.g:115:14: (~ END_HASH )
            {
            root_0 = (CommonTree)adaptor.nil();

            // ../etc/Jaml.g:115:14: (~ END_HASH )
            // ../etc/Jaml.g:115:15: ~ END_HASH
            {
            set30=(Token)input.LT(1);
            if ( (input.LA(1)>=INDENT && input.LA(1)<=BEGIN_HASH)||(input.LA(1)>=POUND && input.LA(1)<=JAVA_RBRACE) ) {
                input.consume();
                adaptor.addChild(root_0, (CommonTree)adaptor.create(set30));
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
    // ../etc/Jaml.g:117:1: idSpecifier returns [String id] : POUND ID ;
    public final JamlParser.idSpecifier_return idSpecifier() throws RecognitionException {
    traceIn("idSpecifier", 12);
        JamlParser.idSpecifier_return retval = new JamlParser.idSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token POUND31=null;
        Token ID32=null;

        CommonTree POUND31_tree=null;
        CommonTree ID32_tree=null;

        try {
            // ../etc/Jaml.g:117:32: ( POUND ID )
            // ../etc/Jaml.g:117:34: POUND ID
            {
            root_0 = (CommonTree)adaptor.nil();

            POUND31=(Token)match(input,POUND,FOLLOW_POUND_in_idSpecifier460); 
            POUND31_tree = (CommonTree)adaptor.create(POUND31);
            adaptor.addChild(root_0, POUND31_tree);

            ID32=(Token)match(input,ID,FOLLOW_ID_in_idSpecifier462); 
            ID32_tree = (CommonTree)adaptor.create(ID32);
            adaptor.addChild(root_0, ID32_tree);

            retval.id = (ID32!=null?ID32.getText():null);

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
    // ../etc/Jaml.g:119:1: classSpecifier returns [String klass] : DOT ID ;
    public final JamlParser.classSpecifier_return classSpecifier() throws RecognitionException {
    traceIn("classSpecifier", 13);
        JamlParser.classSpecifier_return retval = new JamlParser.classSpecifier_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token DOT33=null;
        Token ID34=null;

        CommonTree DOT33_tree=null;
        CommonTree ID34_tree=null;

        try {
            // ../etc/Jaml.g:119:38: ( DOT ID )
            // ../etc/Jaml.g:120:1: DOT ID
            {
            root_0 = (CommonTree)adaptor.nil();

            DOT33=(Token)match(input,DOT,FOLLOW_DOT_in_classSpecifier475); 
            DOT33_tree = (CommonTree)adaptor.create(DOT33);
            adaptor.addChild(root_0, DOT33_tree);

            ID34=(Token)match(input,ID,FOLLOW_ID_in_classSpecifier477); 
            ID34_tree = (CommonTree)adaptor.create(ID34);
            adaptor.addChild(root_0, ID34_tree);

            retval.klass = (ID34!=null?ID34.getText():null);

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
    public static final BitSet FOLLOW_elementDeclaration_in_element122 = new BitSet(new long[]{0x00000000000001C0L});
    public static final BitSet FOLLOW_freeformText_in_element130 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_element132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_element144 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_content_in_element147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_element160 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_element162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_element_in_line191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_freeformText_in_line199 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_line203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NEWLINE_in_line209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TEXT_in_freeformText231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divAttrs_in_elementDeclaration263 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attrs_in_elementDeclaration283 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_attrHash_in_elementDeclaration291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INDENT_in_content315 = new BitSet(new long[]{0x0000000000006300L});
    public static final BitSet FOLLOW_element_in_content322 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_freeformText_in_content328 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_NEWLINE_in_content330 = new BitSet(new long[]{0x0000000000006320L});
    public static final BitSet FOLLOW_DEDENT_in_content336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERCENT_in_attrs351 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_attrs353 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_idSpecifier_in_attrs358 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_classSpecifier_in_attrs365 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_idSpecifier_in_divAttrs379 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_classSpecifier_in_divAttrs386 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_BEGIN_HASH_in_attrHash401 = new BitSet(new long[]{0x00000001FFFFFFF0L});
    public static final BitSet FOLLOW_hashAttrs_in_attrHash407 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_HASH_in_attrHash412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notEndHash_in_hashAttrs432 = new BitSet(new long[]{0x00000001FFFFEFF2L});
    public static final BitSet FOLLOW_set_in_notEndHash445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POUND_in_idSpecifier460 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_idSpecifier462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOT_in_classSpecifier475 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ID_in_classSpecifier477 = new BitSet(new long[]{0x0000000000000002L});

}