package com.cadrlife.jaml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EmbeddedJavaCodeTest {
	private Jaml jaml = new Jaml();
	
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
    public void ifStatement() {
    	String html = "<% if (1+1==2) { %>\n  <p />\n<% } %>";
		assertEquals(html, jaml.parse("- if (1+1==2)\n  %p/"));
    }
    @Test
    public void ifStatementNoParens() {
    	String html = "<% if (1 + 1 == 2) { %>\n  <p />\n<% } %>";
    	assertEquals(html, jaml.parse("- if 1 + 1 == 2\n  %p/"));
    }
}
