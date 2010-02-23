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
}

@parser::members {
String output = "";
}

prog returns [String rendering] @init {$rendering = "";}:
  (line {$rendering += $line.rendering;} NEWLINE {$rendering += "\n";})*;

element returns [String rendering] @init {String content = "";}:
  elementDeclaration (content {content = $content.rendering;})?
  {$rendering = Util.elem($elementDeclaration.type, $elementDeclaration.attrMap, content);}
  ;

line returns [String rendering] @init { $rendering = ""; } :
  element {$rendering = $element.rendering;}
  | TEXT {$rendering = $TEXT.text;}
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
//line {$rendering = $line.text;}
(INDENT 
 e1=element {$rendering += $e1.rendering;} 
 (NEWLINE e2=element {$rendering += $e2.rendering;})* 
DEDENT)
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
: StringLiteral {$value = Util.parseStringLiteral($StringLiteral.text);};

idSpecifier returns [String id]: POUND ID {$id = $ID.text;};

classSpecifier returns [String klass]:
DOT ID {$klass = $ID.text;};

POUND: { beginningOfLine }?=> '#' {textMode = false;};
DOT: { beginningOfLine }?=> '.' {textMode = false;};
PERCENT: { beginningOfLine }?=> '%' {textMode = false;};
COMMA: { !textMode }?=> ',';
ID  : { !textMode }?=> ('a'..'z'|'A'..'Z')+;
INT : { !textMode }?=>  '0'..'9'+;
// NEWLINE: ('\r'? '\n') {textMode = true; beginningOfLine=true;};

BEGIN_HASH: { !textMode }?=>
  '{' {hashMode = true;};

END_HASH: { hashMode }?=>
  '}' {hashMode = false; textMode = true;};

WS  : { !textMode }?=>
  Spaces {skip(); if (!hashMode ) textMode=true;};

CHANGE_INDENT
@init { int tb = 0; }
  :(NL) (' ' {tb++;})* {
          if(tb > currentIndentation) {
              emit(new CommonToken(INDENT));
              System.out.println("INDENT");
          }else if(tb < currentIndentation) {
              for(int i = 0; i < currentIndentation - tb; i++) {
                  emit(new CommonToken(DEDENT));
              System.out.println("DEDENT");
              }
          }else {
                emit(new CommonToken(NEWLINE));
              System.out.println("NEWLINE");
              //skip();
          }
          currentIndentation = tb;
      };
fragment
NL: '\r'? '\n';

fragment SpacesQ: (' ')*;
fragment Spaces: (' ')+;

StringLiteral: { !textMode }?=>
    '"' ( EscapeSequence | ~('\\'|'"') )* '"'
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

TEXT: { textMode }?=>
      (~('.' | '#' | '%' | '\r' | '\n'))
      (~('\r' | '\n'))*
      {beginningOfLine=false;};