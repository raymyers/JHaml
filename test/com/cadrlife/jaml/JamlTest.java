package com.cadrlife.jaml;

import static org.junit.Assert.*;

import org.junit.Test;

public class JamlTest {
	private String INDENT = "\n  ";
       private Jaml jaml = new Jaml();

       @Test
       public void emptyRender()  {
               assertEquals("", jaml.parse(""));
       }

       @Test
       public void element() {
               assertEquals("<div class='atlantis'></div>", jaml.parse("%div.atlantis").trim());
       }
       
       @Test
       public void twoElements() {
               assertEquals("<a></a>\n<b></b>", jaml.parse("%a\n%b").trim());
       }

       @Test
       public void divIsDefaultElement() {
               assertEquals("<div class='atlantis'></div>", jaml.parse(".atlantis").trim());
       }
       
       @Test
       public void idAndClassElement() {
               assertEquals("<div id='id' class='atlantis'></div>", jaml.parse("#id.atlantis").trim());
       }

       @Test
       public void attributesDiv() {
               String html = "<div class='atlantis' style='ugly'></div>";
			String haml = ".atlantis{:style => \"ugly\"}";
			assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void attributes() {
               String html = "<p style='ugly'></p>";
			String haml = "%p{:style => \"ugly\"}";
			assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void spacesInAttributeHash() {
            String html = "<p style='ugly'></p>";
			String haml = "%p{  :style  =>\"ugly\"  }";
			assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void nestedElement() {
    	   String haml = "%p" + INDENT + "%a{:href=>\"http://haml-lang.com\"}";
    	   String html = "<p>\n <a href='http://haml-lang.com'></a>\n</p>";
    	   assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void twoNestedElements() {
    	   String haml = "%p\n  %a{:href=>\"http://haml-lang.com\"}\n  %tag";
    	   String html = "<p>\n <a href='http://haml-lang.com'></a>\n <tag></tag>\n</p>";
    	   assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void twoLevelNestingElements() {
    	   String haml = "%p\n  %a\n    %tag";
    	   String html = "<p>\n <a>\n  <tag></tag>\n </a>\n</p>";
    	   assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void plainText() {
    	   assertEquals("Hello World", jaml.parse("Hello World"));
       }
       
       @Test
       public void plainTextThreeLines() {
    	   assertEquals("Hello\nCruel\nWorld", jaml.parse("Hello\nCruel\nWorld"));
       }
       
       @Test
       public void textInsideElementInline() {
    	   assertEquals("<a>Hello World</a>", jaml.parse("%a Hello World"));
       }
       @Test
       public void textInsideElementSeparateLine() {
    	   assertEquals("<a>\n Hello World\n</a>", jaml.parse("%a\n  Hello World"));
       }
       
       @Test
       public void textInsideElementTwoLines() {
    	   assertEquals("<a>\n Hello\n World\n</a>", jaml.parse("%a\n  Hello\n  World"));
       }
       
       @Test
       public void textAndElementsInsideElementTwoLines() {
    	   assertEquals("<a>\n <b>b</b>\n Hello World\n <c>c</c>\n</a>", jaml.parse("%a\n  %b b\n  Hello World\n  %c c"));
       }
       
       @Test
       public void jspScriptlet() {
    	   assertEquals("<% foo(bar); %>", jaml.parse("- foo(bar);"));
    	   assertEquals("<p><% foo(bar); %></p>", jaml.parse("%p- foo(bar);"));
       }
       
       @Test
       public void jspExpression() {
    	   assertEquals("<%= foo(bar); %>", jaml.parse("= foo(bar);"));
    	   assertEquals("<p><%= foo(bar); %></p>", jaml.parse("%p= foo(bar);"));
       }
       
       @Test
       public void stringsShouldGetStrippedInsideTags() {
    	   String haml = ".stripped    This should have no spaces in front of it";
    	   String html = "<div class='stripped'>This should have no spaces in front of it</div>";
    	   assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void attributeHashWithNewLines() {
    	   assertEquals("<p a='b' c='d'>foop</p>", jaml.parse("%p{:a => \"b\",\n :c => \"d\"} foop"));
    	   assertEquals("<p a='b' c='d'>\n foop\n</p>", jaml.parse("%p{:a => \"b\",\n :c => \"d\"}\n foop"));
    	   assertEquals("<p a='b' c='d' />", jaml.parse("%p{:a => \"b\",\n :c => \"d\"}/"));
    	   assertEquals("<p a='b' c='d' e='f'></p>", jaml.parse("%p{:a => \"b\",\n :c => \"d\",\n :e => \"f\"}"));
       }
       
       @Test
       public void crNewLine() {
    	   String html = "<p>foo</p>\n<p>bar</p>\n<p>baz</p>\n<p>boom</p>";
    	   assertEquals(html, jaml.parse("%p foo\r%p bar\r\n%p baz\n\r%p boom"));
       }
}