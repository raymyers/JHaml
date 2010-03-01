package com.cadrlife.jaml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FiltersTest {
	private Jaml jaml = new Jaml();
	
	@Test
	public void javascript() {
		String haml = 
			":javascript\n" +
			"  \"use strict\";\n" +
			"  jQuery(function() {});"; 
		String html =
			"<script type='text/javascript'>\n" + 
			"  //<![CDATA[\n" + 
			"    \"use strict\";\n" +
			"    jQuery(function() {});\n" + 
			"  //]]>\n" + 
			"</script>";
		assertEquals(html, jaml.parse(haml));
	}
	@Test
	public void cdata() {
		String haml = 
			"%p\n" + 
			"  :cdata\n" +
			"    Hello\n" +
			"    %p"; 
		String html =
			"<p>\n" + 
			"  <![CDATA[\n" + 
			"    Hello\n" +
			"    %p\n" + 
			"  ]]>\n" +
			"</p>"; 
		assertEquals(html, jaml.parse(haml));
	}
	@Test
	public void emptyCdata() {
		String haml = 
			":cdata\n" +
			"Hello";
		String html =
			"<![CDATA[\n" + 
			"]]>\n" + 
			"Hello";
		assertEquals(html, jaml.parse(haml));
	}
	@Test
	public void plain() {
		String haml = 
			"%p\n" + 
			"  :plain\n" +
			"    %div\n" +
			"    Hello";
		String html =
			"<p>\n" + 
			"  %div\n" + 
			"  Hello\n" +
			"</p>"; 
		assertEquals(html, jaml.parse(haml));
	}
	@Test
	public void escaped() {
		String haml = 
			":escaped\n" +
			"  <div />";
		String html = "&lt;div /&gt;"; 
		assertEquals(html, jaml.parse(haml));
	}
	@Test
	public void preserve() {
		String haml = 
			":preserve\n" +
			"  a\n   b\n\n    c";
		String html = "a&#x000A; b&#x000A;&#x000A;  c"; 
		assertEquals(html, jaml.parse(haml));
	}
}
