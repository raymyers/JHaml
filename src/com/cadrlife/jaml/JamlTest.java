package com.cadrlife.jaml;

import static org.junit.Assert.*;

import java.io.IOException;

import org.antlr.runtime.RecognitionException;
import org.junit.Test;

public class JamlTest {
	private String INDENT = "\n  ";
       private Jaml jaml = new Jaml();

       @Test
       public void emptyRender() throws Exception  {
               assertEquals("", jaml.parse(""));
       }

       @Test
       public void element() throws Exception {
               assertEquals("<div class='atlantis'></div>", jaml.parse("%div.atlantis").trim());
       }
       
       @Test
       public void twoElements() throws Exception {
               assertEquals("<a></a>\n<b></b>", jaml.parse("%a\n%b").trim());
       }

       @Test
       public void divIsDefaultElement() throws Exception {
               assertEquals("<div class='atlantis'></div>", jaml.parse(".atlantis").trim());
       }
       
       @Test
       public void idAndClassElement() throws Exception {
               assertEquals("<div id='id' class='atlantis'></div>", jaml.parse("#id.atlantis").trim());
       }

       @Test
       public void attributesDiv() throws Exception {
               String html = "<div class='atlantis' style='ugly'></div>";
			String haml = ".atlantis{:style => \"ugly\"}";
			assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void attributes() throws Exception {
               String html = "<p style='ugly'></p>";
			String haml = "%p{:style => \"ugly\"}";
			assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void spacesInAttributeHash() throws Exception {
            String html = "<p style='ugly'></p>";
			String haml = "%p{  :style  =>\"ugly\"  }";
			assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void nestedElement() throws Exception {
    	   String haml = "%p" + INDENT + "%a{:href=>\"http://haml-lang.com\"}";
    	   String html = "<p>\n <a href='http://haml-lang.com'></a>\n</p>";
    	   assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void twoNestedElements() throws Exception {
    	   String haml = "%p\n  %a{:href=>\"http://haml-lang.com\"}\n  %tag";
    	   String html = "<p>\n <a href='http://haml-lang.com'></a>\n <tag></tag>\n</p>";
    	   assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void twoLevelNestingElements() throws Exception {
    	   String haml = "%p\n  %a\n    %tag";
    	   String html = "<p>\n <a>\n  <tag></tag>\n </a>\n</p>";
    	   assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void plainText() throws Exception {
    	   assertEquals("Hello World", jaml.parse("Hello World"));
       }
       
       @Test
       public void plainTextThreeLines() throws Exception {
    	   assertEquals("Hello\nCruel\nWorld", jaml.parse("Hello\nCruel\nWorld"));
       }
       
       @Test
       public void textInsideElementInline() throws Exception {
    	   assertEquals("<a>Hello World</a>", jaml.parse("%a Hello World"));
       }
       @Test
       public void textInsideElementSeparateLine() throws Exception {
    	   assertEquals("<a>\n Hello World\n</a>", jaml.parse("%a\n  Hello World"));
       }
       
       @Test
       public void textInsideElementTwoLines() throws Exception {
    	   assertEquals("<a>\n Hello\n World\n</a>", jaml.parse("%a\n  Hello\n  World"));
       }
       
       @Test
       public void textAndElementsInsideElementTwoLines() throws Exception {
    	   assertEquals("<a>\n <b>b</b>\n Hello World\n <c>c</c>\n</a>", jaml.parse("%a\n  %b b\n  Hello World\n  %c c"));
       }
       
       @Test
       public void stringsShouldGetStrippedInsideTags() throws Exception {
    	   String haml = ".stripped    This should have no spaces in front of it";
    	   String html = "<div class='stripped'>This should have no spaces in front of it</div>";
    	   assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void attributeHashWithNewLines() throws Exception {
    	   assertEquals("<p a='b' c='d'>foop</p>", jaml.parse("%p{:a => \"b\",\n :c => \"d\"} foop"));
    	   assertEquals("<p a='b' c='d'>\n foop\n</p>", jaml.parse("%p{:a => \"b\",\n :c => \"d\"}\n foop"));
    	   assertEquals("<p a='b' c='d' />", jaml.parse("%p{:a => \"b\",\n :c => \"d\"}/"));
    	   assertEquals("<p a='b' c='d' e='f'></p>", jaml.parse("%p{:a => \"b\",\n :c => \"d\",\n :e => \"f\"}"));
       }
}