package com.cadrlife.jhaml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class EmbeddedJavaCodeTest {
	private JHaml jhaml = new JHaml();
	
    @Test
    public void jspScriptlet() {
 	   assertEquals("<% foo(bar); %>", jhaml.parse("- foo(bar);"));
 	   assertEquals("<p>\n  <% foo(bar); %>\n</p>", jhaml.parse("%p\n - foo(bar);"));
    }
    
    @Test
    public void jspExpression() {
 	   assertEquals("<%= foo(bar); %>", jhaml.parse("= foo(bar);"));
 	   assertEquals("<p><%= foo(bar); %></p>", jhaml.parse("%p= foo(bar);"));
    }

    @Test
    public void nestedExpression() {
	    String haml = "%li=item\n  #nested_div";
	    String html = "<li><%= item %>\n  <div id='nested_div'></div>\n</li>";
	    assertEquals(html,jhaml.parse(haml));
    }

    @Test
    public void ifStatement() {
    	String html = "<% if (1+1==2) { %>\n  <p />\n<% } %>";
		assertEquals(html, jhaml.parse("- if (1+1==2)\n  %p/"));
    }
    
    @Test
    public void ifStatementWithElse() {
    	String html = "<% if (1+1==2) { %>\n  <p />\n<% } else { %>\n  <br />\n<% } %>";
		assertEquals(html, jhaml.parse("- if (1+1==2)\n  %p/\n- else\n  %br/"));
    }
    
    @Test
    public void ifStatementWithElseIf() {
    	String html = "<% if (1+1==2) { %>\n  <p />\n<% } else if (1==4) { %>\n  <br />\n<% } %>";
		assertEquals(html, jhaml.parse("- if (1+1==2)\n  %p/\n- else if (1==4)\n  %br/"));
    }
   
    @Test
    public void ifStatementNoParens() {
    	String html = "<% if (1 + 1 == 2) { %>\n  <p />\n<% } %>";
    	assertEquals(html, jhaml.parse("- if 1 + 1 == 2\n  %p/"));
    }
    
    @Test
    public void ifStatementWithElseIfNoParens() {
    	String html = "<% if (1+1==2) { %>\n  <p />\n<% } else if (1==4) { %>\n  <br />\n<% } %>";
    	assertEquals(html, jhaml.parse("- if (1+1==2)\n  %p/\n- else if 1==4\n  %br/"));
    }
    
    @Test
    public void whileLoop() {
    	String html = "<% while (1+1==2) { %>\n  <p />\n<% } %>";
    	assertEquals(html, jhaml.parse("- while (1+1==2)\n  %p/"));
    }
    
    @Test
    public void forLoop() {
    	String html = "<% for (int i=0; i<10; i++) { %>\n  <p />\n<% } %>";
    	assertEquals(html, jhaml.parse("- for (int i=0; i<10; i++)\n  %p/"));
    }
    
    @Test
    public void forLoopNoParens() {
    	String html = "<% for (String s : strings) { %>\n  <p />\n<% } %>";
    	assertEquals(html, jhaml.parse("- for String s : strings\n  %p/"));
    }
    
    @Test
    public void groovyStyleEachLoop() {
    	String html = "<% aList.each { %>\n  <p />\n<% } %>";
    	assertEquals(html, jhaml.parse("- aList.each\n  %p/"));
    }
}
