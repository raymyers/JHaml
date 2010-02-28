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
}
