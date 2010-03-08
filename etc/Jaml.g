grammar Jaml;

options {
  output=AST;
  ASTLabelType=CommonTree; // type of $stat.tree ref etc...
}

tokens {
  INDENT;
  DEDENT;
  NEWLINE;
}

@parser::header {
package com.cadrlife.jaml;
import java.util.LinkedHashMap;
import java.util.Map;
}

@lexer::header {
package com.cadrlife.jaml;
}


@lexer::members {
	int currentIndentation = 0;
	boolean textMode = true;
	boolean hashMode = false;
	boolean beginningOfLine = true;
	int braceDepth = 0;
	
	List tokens = new ArrayList();
	@Override
	public void emit(Token token) {
	        state.token = token;
	    	tokens.add(token);
	}
	@Override
	public Token nextToken() {
	    	super.nextToken();
	        if ( tokens.size()==0 ) {
	            return Token.EOF_TOKEN;
	        }
	        return (Token)tokens.remove(0);
	}
}

@parser::members {
String output = "";
JamlConfig config = new JamlConfig();
Helper util = new Helper(config);
boolean shouldParseText = true;
public void pushElementScopeForTesting() {
  element_stack.push(new element_scope());
}
}

jamlSource[JamlConfig config] returns [String rendering]
@init {
  $rendering = ""; 
  this.config = $config;
  Helper util = new Helper(config);
}
: (line {$rendering += $line.rendering + "\n";})*;

element returns [String rendering]
  scope {
    String type;
  } 
  @init {
  	String content = ""; 
  	boolean selfClosing=false;
  }
  :
  elementDeclaration (FORWARD_SLASH {selfClosing = true;})?
   ( freeformText[false] {content = $freeformText.rendering;} | 
     NEWLINE (content {content = $content.rendering;})?)
  {$rendering = util.elem($element.text, $element::type, $elementDeclaration.attrMap, content, selfClosing);}
  ;

line returns [String rendering] @init { $rendering = ""; } :
  element {$rendering = $element.rendering;}
  | freeformText[true] {$rendering = $freeformText.rendering;}
  | NEWLINE
  ;
  
freeformText[boolean beginningOfLine] returns [String rendering] 
@init {
  String txt = "";
  boolean isFilter = false;
}:
  TEXT NEWLINE {
    txt = $TEXT.text; 
    if (shouldParseText && beginningOfLine && txt.startsWith(":")) {
      isFilter = true;
      shouldParseText = false;
    }
  }
  (content {
    if (isFilter) {
    	int contentPos = $content.start.getCharPositionInLine();
    	txt = txt + $NEWLINE.text + util.spaces(contentPos) + $content.text;
    } else {
    	txt += $content.rendering;
    }
  })? 
  {
    if (isFilter) {
      shouldParseText = true;
    }
    if (shouldParseText) {
      String currentElementType = element_stack.isEmpty() ? null : $element::type;  
      $rendering = util.parseFreeFormText(currentElementType, txt);
    }
  };
      
elementDeclaration returns [Map<String,String> attrMap] 
  @init {
  	$attrMap = new LinkedHashMap<String,String>();
  	List<String> ids = new ArrayList<String>();
  	List<String> classes = new ArrayList<String>();
  }
  @after {
  	util.mergeAttributes($attrMap, ids, classes);
  }:
  (divAttrs[ids,classes] {$element::type = "div";} attrHash[$attrMap]?)
| 
 (attrs[ids,classes] attrHash[$attrMap]?)
  ;

content returns [String rendering] @init { $rendering = ""; } :
INDENT 
 ( e1=element {$rendering += $e1.rendering + "\n";} | 
  freeformText[true] {$rendering += $freeformText.rendering + "\n";} | 
  (blankLines)=> blankLines )+
DEDENT
{$rendering = "\n" + util.indent(util.stripTrailingNewline($rendering)) + "\n";}
;

blankLines : DEDENT (NEWLINE+ | blankLines) INDENT;

attrs[List<String> ids, List<String> classes]:
PERCENT ID? {$element::type = $ID.text;}
(idSpecifier {$ids.add($idSpecifier.id);} |
 classSpecifier {$classes.add($classSpecifier.klass);})*;

divAttrs[List<String> ids, List<String> classes] :
(idSpecifier {$ids.add($idSpecifier.id);} |
 classSpecifier {$classes.add($classSpecifier.klass);})+;

attrHash[Map<String,String> attrMap] :
  BEGIN_HASH {System.out.println("BEGIN " + $text);}
  hashAttrs 
  END_HASH {util.parseAttrHash($hashAttrs.contents, $attrMap);};

hashAttrs returns [String contents] @init {$contents="";} :
(notEndHash {$contents += $notEndHash.text;})*;

notEndHash : (~END_HASH) {System.out.println("() " + $notEndHash.text);};

idSpecifier returns [String id]: POUND ID {$id = $ID.text;};

classSpecifier returns [String klass]:
DOT ID {$klass = $ID.text;};

// LEXER

POUND:   '#' {textMode = false; beginningOfLine=false;};
DOT:     '.' {textMode = false; beginningOfLine=false;};
PERCENT: '%' {textMode = false; beginningOfLine=false;};
FORWARD_SLASH: { !beginningOfLine && !hashMode }?=> '/';
COMMA: { !textMode }?=> ',';
ID  : { !textMode }?=> 
  ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
  {textMode = true;};
// NEWLINE: ('\r'? '\n') {textMode = true; beginningOfLine=true;};

WS : { !textMode }?=>
  Spaces {if ( !hashMode ) { $channel = HIDDEN; textMode=true; }};

IGNORED_NEWLINE  : { hashMode }?=> NL ;

CHANGE_INDENT 
@init { String spaces = ""; } :{ !hashMode }?=> 
	(NL) (' ' {spaces+=" ";})* {
	          emit(new CommonToken(NEWLINE, "\n" + spaces));
	          System.out.println("NEWLINE");
	          int tb = spaces.length();
	          System.out.println(tb + "/" + currentIndentation);
	          if (tb > currentIndentation) {
	              for(int i = 0; i < tb - currentIndentation; i+=2) {
		              emit(new CommonToken(INDENT,""));
		              System.out.println("INDENT");
	              }
	          } else if(tb < currentIndentation) {
	              for(int i = 0; i < currentIndentation - tb; i+=2) {
	    	          emit(new CommonToken(DEDENT,""));
		    	      System.out.println("DEDENT");
	              }
	          } else {
	              //skip();
	          }
	          currentIndentation = tb;
	          textMode=true;
	          beginningOfLine=true;
      };
fragment
NL: '\r'? '\n';

fragment SpacesQ: (' ')*;
fragment Spaces: (' ')+;

StringLiteral: { hashMode }?=>
    '"' ( EscapeSequence | ~('\\' | '"' | '\r' | '\n' ) )* '"'
  ;

// Extended to include strings for attribute mappings like :a => 'Hello'.
CHARLITERAL 
    :   '\'' 
        (   EscapeSequence 
        |   ~( '\'' | '\\' | '\r' | '\n' )
        )*
        '\''
    ;
    
fragment
EscapeSequence
  :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
  |   UnicodeEscape
  |   OctalEscape
  ;

fragment
OctalEscape
  :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
  |   '\\' ('0'..'7') ('0'..'7')
  |   '\\' ('0'..'7')
  ;

fragment
UnicodeEscape
  :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
  ;
  
fragment
HexDigit : ('0'..'9'|'a'..'f'|'A'..'F') ;

TEXT: { textMode && !hashMode }?=>
      (~('.' | '#' | '%' | '\r' | '\n' | '{' | ' '))
      (~('\r' | '\n'))*
      {
        beginningOfLine = false;
      };
      
HASH_CONTENTS: { hashMode }?=>
      (~('"' | '\'' | '{' | '}'));

//EQUALS  : { hashMode }?=> ;
BEGIN_HASH  : { textMode && braceDepth == 0 }?=> LBRACE {hashMode=true;};
END_HASH  : { braceDepth == 1 }?=> RBRACE {hashMode=false;};

JAVA_LBRACE : { hashMode }?=> LBRACE;
JAVA_RBRACE : { braceDepth > 1 }?=>  RBRACE;

fragment LBRACE : '{' {braceDepth++;};
fragment RBRACE  : { hashMode }?=> '}' {braceDepth--;};

// These tokens get emitted by the CHANGE_INDENTATION rule.
// They only have their own lexer rules to shut up ANTLR's warnings.
NEWLINE : {false}?=> ' ';
INDENT : {false}?=> ' ';
DEDENT : {false}?=> ' ';