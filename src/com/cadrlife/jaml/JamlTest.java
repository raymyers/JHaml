package com.cadrlife.jaml;

import static org.junit.Assert.*;

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
       public void divIsDefaultElement() throws Exception {
               assertEquals("<div class='atlantis'></div>", jaml.parse(".atlantis").trim());
       }
       
       @Test
       public void idAndClassElement() throws Exception {
               assertEquals("<div id='id' class='atlantis'></div>", jaml.parse("#id.atlantis").trim());
       }

       @Test
       public void attributes() throws Exception {
               String html = "<div class='atlantis' style='ugly'></div>";
			String haml = ".atlantis{:style => \"ugly\"}";
			assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void attributes2() throws Exception {
               String html = "<div style='ugly'></div>";
			String haml = "%div{:style => \"ugly\"}";
			assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void nestedElement() throws Exception {
    	   String haml = "%p" + INDENT + "%a{:href=>\"http://haml-lang.com\"}";
    	   String html = "<p><a href='http://haml-lang.com'></a></p>";
    	   assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void twoNestedElements() throws Exception {
    	   String haml = "%p\n  %a{:href=>\"http://haml-lang.com\"}\n  %tag";
    	   String html = "<p><a href='http://haml-lang.com'></a><tag></tag></p>";
    	   assertEquals(html, jaml.parse(haml));
       }
       
       @Test
       public void twoLevelNestingElements() throws Exception {
    	   String haml = "%p\n  %a\n    %tag";
    	   String html = "<p><a><tag></tag></a></p>";
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
}