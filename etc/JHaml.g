grammar JHaml;

options {
  output=AST;
  ASTLabelType=CommonTree; // type of $stat.tree ref etc...
}

@parser::header {
package com.cadrlife.jhaml.generated;
import java.util.Map;
import com.cadrlife.jhaml.Helper;
import com.cadrlife.jhaml.JHamlConfig;
import com.cadrlife.jhaml.Line;
import com.cadrlife.jhaml.AttributeValue;
}

@lexer::header {
package com.cadrlife.jhaml.generated;
}
@lexer::members {
static enum EMode {
      BEGINNING,ELEMENT_TYPE,ELEMENT_DECLARATION,ATTRIBUTE_HASH,AFTER_ATTRIBUTE_HASH,TEXT
    };
EMode lineMode = EMode.BEGINNING;
int braceDepth = 0;
int parenDepth = 0;
}

@parser::members {
Helper helper;
}
 
jhamlSource[JHamlConfig config] returns [List<Line> lines]
@init {
  helper = new Helper(config);
  $lines = new ArrayList<Line>();
}
: (line[$lines] NEWLINE)+ EOF;

line[List<Line> lines]
scope {
Line val;
line_return node;
}
@init {
$line::val = new Line();
$line::node = retval; 
}
@after{
$line::val.text = $line.text;
$line::val.lineNumber = retval.start.getLine();
lines.add($line::val);
}
:  indentation? (element | plainText)?;

plainText: TEXT {$line::val.inLineContent = $TEXT.text;};

element @after{$line::val.isElement = true;} 
:	 
  PERCENT ELEMENT_TYPE? (idSpecifier | classSpecifier)* attributeHash? selfClose? inLineContent?
    {$line::val.tag = $ELEMENT_TYPE.text;}
  | (idSpecifier | classSpecifier)+ attributeHash? selfClose? inLineContent? 
    {$line::val.tag = "div";};

selfClose: FORWARD_SLASH {$line::val.isSelfClosing = true;};

indentation: INDENTATION {$line::val.leadingWhitespace = $INDENTATION.text;}; 

attributeHash: BEGIN_HASH (attributeMapping (COMMA attributeMapping)*)? END_HASH;

attributeMapping: attribute MAP_TO attribute_value
{
$line::val.attrMap.put($attribute.name, $attribute_value.value);
}
;

attribute returns [String name]: 
  n=ATTRIBUTE_NAME {$name = $n.text.substring(1);} |
  literal {$name = $literal.value.value;}
;

attribute_value returns [AttributeValue value]:
  ((literal (COMMA | END_HASH))=> literal  {$value=$literal.value;}) | 
  ex=javaExpression {
  $value = helper.parseJavaAttrValue(input.toString($line::node.start,input.LT(-1)), $attribute_value.text);
  }
;

javaExpression: 
  (JAVA_CODE | literal | JAVA_LBRACE | JAVA_RBRACE | JAVA_LPAREN | JAVA_RPAREN | JAVA_COMMA)+;

literal returns [AttributeValue value]: 
  lit=STRING_LITERAL {$value = AttributeValue.quoted(helper.parseStringLiteral($lit.text));} |
  lit=CHAR_LITERAL {$value = AttributeValue.quoted(helper.parseCharLiteral($lit.text));} |
  lit=(HEX_LITERAL|OCTAL_LITERAL|DECIMAL_LITERAL) {$value = AttributeValue.literal(helper.parseIntegerLiteral($lit.text));} |
  lit=FLOATING_POINT_LITERAL {$value = AttributeValue.quoted(helper.parseFloatLiteral($lit.text));}
;

idSpecifier: DOT ID? {$line::val.classes.add($ID.text);};
 
classSpecifier: POUND ID? {$line::val.ids.add($ID.text);};

inLineContent: TEXT {$line::val.inLineContent = $TEXT.text;};

// LEXER

PERCENT:   {lineMode == EMode.BEGINNING}?=>
  '%' {lineMode = EMode.ELEMENT_TYPE;};

POUND: {lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.ELEMENT_TYPE}?=>
  '#' {lineMode = EMode.ELEMENT_DECLARATION;};

DOT:   {lineMode == EMode.BEGINNING || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.ELEMENT_TYPE}?=>
  '.' {lineMode = EMode.ELEMENT_DECLARATION;};

FORWARD_SLASH: { lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH || lineMode == EMode.ELEMENT_TYPE}?=> 
  '/' {lineMode = EMode.TEXT;};


COMMA: { lineMode == EMode.ATTRIBUTE_HASH && parenDepth <= 0}?=> 
  ',';

JAVA_COMMA: { lineMode == EMode.ATTRIBUTE_HASH && parenDepth > 0}?=> 
  ',';
  
JAVA_CODE: { lineMode == EMode.ATTRIBUTE_HASH }?=> 
  ~(':' | '=' | ',' | '(' | ')' | ' ' | '\t' | '\n' | '\'' | '\"' | ('0'..'9') | '{' | '}')+;


ATTRIBUTE_NAME:   { lineMode == EMode.ATTRIBUTE_HASH }?=> 
  ':' ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
  ;
  
MAP_TO: { lineMode == EMode.ATTRIBUTE_HASH }?=> 
  '=>';

ID:   { lineMode == EMode.ELEMENT_DECLARATION }?=> 
  ('a'..'z'|'A'..'Z'|'0'..'9')+
  ;
ELEMENT_TYPE:   { lineMode == EMode.ELEMENT_TYPE }?=> 
  ('a'..'z'|'A'..'Z'|'0'..'9'|':')+ { lineMode = EMode.ELEMENT_DECLARATION; }
  ;

INDENTATION : { lineMode == EMode.BEGINNING }?=>
  Space+;

WS : { lineMode == EMode.ELEMENT_TYPE || lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH }?=>
  Space+ { $channel = HIDDEN; lineMode = EMode.TEXT; };

WS_WITHIN_HASH : { lineMode == EMode.ATTRIBUTE_HASH }?=>
  Space { $channel = HIDDEN; };
  
fragment Space: ('\t' | ' ');

// No need to catch \r because it is caught in preprocessing.
NEWLINE  : { lineMode != EMode.ATTRIBUTE_HASH }?=> NL {lineMode = EMode.BEGINNING;};
IGNORED_NEWLINE  : { lineMode == EMode.ATTRIBUTE_HASH }?=> NL {$channel = HIDDEN;};
NL: '\n';

HEX_LITERAL : { lineMode == EMode.ATTRIBUTE_HASH }?=> '0' ('x'|'X') HEX_DIGIT+ INTEGER_TYPE_SUFFIX? ;

DECIMAL_LITERAL : { lineMode == EMode.ATTRIBUTE_HASH }?=> ('0' | '1'..'9' '0'..'9'*) INTEGER_TYPE_SUFFIX? ;

OCTAL_LITERAL : { lineMode == EMode.ATTRIBUTE_HASH }?=> '0' ('0'..'7')+ INTEGER_TYPE_SUFFIX? ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
INTEGER_TYPE_SUFFIX : ('l'|'L') ;

FLOATING_POINT_LITERAL
    : { lineMode == EMode.ATTRIBUTE_HASH }?=>
      ( ('0'..'9')+ 
        (
            '.' ('0'..'9')* EXPONENT? FLOAT_TYPE_SUFFIX?
        |   EXPONENT FLOAT_TYPE_SUFFIX?
        |   FLOAT_TYPE_SUFFIX
        )
     |  '.' ('0'..'9')+ EXPONENT? FLOAT_TYPE_SUFFIX?
    )
    ;

fragment
FLOAT_TYPE_SUFFIX : ('f'|'F'|'d'|'D') ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

// Extended to include strings for attribute mappings like :a => 'Hello'.
CHAR_LITERAL 
    : { lineMode == EMode.ATTRIBUTE_HASH }?=> '\'' ( EscapeSequence | ~('\''|'\\') )* '\''
    ;

STRING_LITERAL
    : { lineMode == EMode.ATTRIBUTE_HASH }?=> '"' ( EscapeSequence | ~('\\'|'"') )* '"'
    ;

fragment
EscapeSequence: '\\' ~NL;

TEXT: (TextLine | InLineText)? RemainderOfLineText?;

RemainderOfLineText: { lineMode == EMode.TEXT }?=> (~'\n')+;

TextLine: { lineMode == EMode.BEGINNING }?=> 
  (~('.' | '#' | '%' | NL | Space)) {lineMode = EMode.TEXT;};

InLineText: { lineMode == EMode.ELEMENT_DECLARATION || lineMode == EMode.AFTER_ATTRIBUTE_HASH }?=> 
  ('-' | '=') {lineMode = EMode.TEXT;};
      
//EQUALS  : { hashMode }?=> ;
BEGIN_HASH  : { lineMode == EMode.ELEMENT_DECLARATION }?=> LBRACE {lineMode = EMode.ATTRIBUTE_HASH;};
END_HASH  : { lineMode == EMode.ATTRIBUTE_HASH && braceDepth == 1 }?=> RBRACE {lineMode = EMode.AFTER_ATTRIBUTE_HASH;};

JAVA_LBRACE : { lineMode == EMode.ATTRIBUTE_HASH }?=> LBRACE;

JAVA_RBRACE : { braceDepth > 1 }?=> RBRACE;

JAVA_LPAREN : { lineMode == EMode.ATTRIBUTE_HASH }?=> 
  '(' { parenDepth++; }; 
  
JAVA_RPAREN : { lineMode == EMode.ATTRIBUTE_HASH }?=>
  ')' { if (parenDepth > 0) parenDepth--; };

fragment LBRACE : '{' {braceDepth++;};
fragment RBRACE  : '}' {braceDepth--;};
