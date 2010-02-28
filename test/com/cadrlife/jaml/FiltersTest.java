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
			":cdata\n" +
			"  Hello\n" +
			"  %p"; 
		String html =
			"<![CDATA[\n" + 
			"  Hello\n" +
			"  %p\n" + 
			"]]>"; 
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
}
