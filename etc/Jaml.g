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
}

prog returns [String rendering] @init {$rendering = "";}:
  (line {$rendering += $line.rendering;} {$rendering += "\n";})*;

element returns [String rendering] @init {String content = ""; boolean selfClosing=false;}:
  elementDeclaration 
   ( TEXT NEWLINE {content = $TEXT.text;} | 
     NEWLINE (content {content = $content.rendering;})? |
     FORWARD_SLASH NEWLINE {selfClosing = true;})
  {$rendering = Util.elem($elementDeclaration.type, $elementDeclaration.attrMap, content, selfClosing);}
  ;

line returns [String rendering] @init { $rendering = ""; } :
  element {$rendering = $element.rendering;}
  | TEXT {$rendering = $TEXT.text;} NEWLINE
  | NEWLINE
  ;

elementDeclaration returns [String type, Map<String,String> attrMap] @init {$attrMap = new LinkedHashMap<String,String>();}:
  ((a1=divAttrs {$attrMap.putAll($a1.attrMap); $type = "div";})
   (attrHash {$attrMap.putAll($attrHash.attrMap);})?)
| 
 (
  (a2=attrs {$attrMap.putAll($a2.attrMap); $type = $a2.type;}) 
  (attrHash {$attrMap.putAll($attrHash.attrMap);})?) 
  ;

content returns [String rendering] @init { $rendering = ""; } :
INDENT 
 (e1=element {$rendering += $e1.rendering + "\n";} | TEXT NEWLINE {$rendering += $TEXT.text + "\n";})+
DEDENT
{$rendering = "\n" + Util.indent(Util.stripTrailingNewline($rendering)) + "\n";}
;
//line: TEXT {System.out.println($TEXT.text);};

attrs returns [Map<String,String> attrMap, String type] @init {$attrMap = new LinkedHashMap<String,String>();}:
PERCENT ID {$type = $ID.text;}
(idSpecifier {$attrMap.put("id", $idSpecifier.id);} |
 classSpecifier {$attrMap.put("class", $classSpecifier.klass);})*;

divAttrs returns [Map<String,String> attrMap] @init {$attrMap = new LinkedHashMap<String,String>();}:
(idSpecifier {$attrMap.put("id", $idSpecifier.id);} |
 classSpecifier {$attrMap.put("class", $classSpecifier.klass);})+;

attrHash returns [Map<String,String> attrMap] @init {$attrMap = new LinkedHashMap<String,String>();}:
  BEGIN_HASH
  ( am1=attrMapping        {$attrMap.put($am1.key, $am1.value);}
    (COMMA am2=attrMapping {$attrMap.put($am2.key, $am2.value);})*)?
  END_HASH;

attrMapping returns [String key, String value]:
':' ID '=' '>' attrValue {
  $key = $ID.text; $value = $attrValue.value;
};

attrValue returns [String value]
: lit=StringLiteral {$value = Util.parseStringLiteral($lit.text);} |
  lit=INTLITERAL {$value = Util.parseIntegerLiteral($lit.text);} |
  lit=LONGLITERAL {$value = Util.parseLongLiteral($lit.text);} |
  lit=CHARLITERAL {$value = Util.parseCharLiteral($lit.text);} |
  lit=FLOATLITERAL {$value = Util.parseFloatLiteral($lit.text);} |
  lit=DOUBLELITERAL {$value = Util.parseDoubleLiteral($lit.text);}
  ;

idSpecifier returns [String id]: POUND ID {$id = $ID.text;};

classSpecifier returns [String klass]:
DOT ID {$klass = $ID.text;};

POUND: { beginningOfLine }?=> '#' {textMode = false;};
DOT: { beginningOfLine }?=> '.' {textMode = false;};
PERCENT: { beginningOfLine }?=> '%' {textMode = false;};
FORWARD_SLASH: { !textMode }?=> '/';
COMMA: { !textMode }?=> ',';
ID  : { !textMode }?=> ('a'..'z'|'A'..'Z')+;
// NEWLINE: ('\r'? '\n') {textMode = true; beginningOfLine=true;};

BEGIN_HASH: { !textMode }?=>
  '{' {hashMode = true;};

END_HASH: { hashMode }?=>
  '}' {hashMode = false; //textMode = true;
  };

WS : { !textMode }?=>
  Spaces {skip(); if (!hashMode ) textMode=true;};

IGNORED_NEWLINE  : { hashMode }?=> NL {skip();};

CHANGE_INDENT 
@init { int tb = 0; } :{ !hashMode }?=> 
	(NL) (' ' {tb++;})* {
	          emit(new CommonToken(NEWLINE));
	          System.out.println("NEWLINE");
	          System.out.println(tb + "/" + currentIndentation);
	          if (tb > currentIndentation) {
	              emit(new CommonToken(INDENT));
	              System.out.println("INDENT");
	          } else if(tb < currentIndentation) {
	              for(int i = 0; i < currentIndentation - tb; i+=2) {
	    	          emit(new CommonToken(DEDENT));
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

StringLiteral: { !textMode }?=>
    '"' ( EscapeSequence | ~('\\' | '"' | '\r' | '\n' ) )* '"'
  ;

LONGLITERAL
    :   IntegerNumber LongSuffix
    ;

    
INTLITERAL
    :   IntegerNumber 
    ;
    
fragment
IntegerNumber
    :   '0' 
    |   '1'..'9' ('0'..'9')*    
    |   '0' ('0'..'7')+         
    |   HexPrefix HexDigit+        
    ;

fragment
HexPrefix
    :   '0x' | '0X'
    ;
        
fragment
HexDigit
    :   ('0'..'9'|'a'..'f'|'A'..'F')
    ;

fragment
LongSuffix
    :   'l' | 'L'
    ;


fragment
NonIntegerNumber
    :   ('0' .. '9')+ '.' ('0' .. '9')* Exponent?  
    |   '.' ( '0' .. '9' )+ Exponent?  
    |   ('0' .. '9')+ Exponent  
    |   ('0' .. '9')+ 
    |   
        HexPrefix (HexDigit )* 
        (    () 
        |    ('.' (HexDigit )* ) 
        ) 
        ( 'p' | 'P' ) 
        ( '+' | '-' )? 
        ( '0' .. '9' )+
        ;
        
fragment 
Exponent    
    :   ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ 
    ;
    
fragment 
FloatSuffix
    :   'f' | 'F' 
    ;     

fragment
DoubleSuffix
    :   'd' | 'D'
    ;
        
FLOATLITERAL
    :   NonIntegerNumber FloatSuffix
    ;
    
DOUBLELITERAL
    :   NonIntegerNumber DoubleSuffix?
    ;

CHARLITERAL
    :   '\'' 
        (   EscapeSequence 
        |   ~( '\'' | '\\' | '\r' | '\n' )
        ) 
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

TEXT: { textMode }?=>
      (~('.' | '#' | '%' | '\r' | '\n' | ' '))
      (~('\r' | '\n'))*
      {beginningOfLine=false;};