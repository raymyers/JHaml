package com.cadrlife.jhaml;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cadrlife.jhaml.JHamlConfig;
import com.cadrlife.jhaml.internal.Helper;
import com.google.common.base.CharMatcher;

public class DoctypeTest {
	
	@Test
	public void xhtmlDoctypes() {
		assertEquals(Helper.DOCTYPE_XHTML_1_0_STRICT, render("!!! strict"));
		assertEquals(Helper.DOCTYPE_XHTML_1_0_FRAMESET, render("!!! frameset"));
		assertEquals(Helper.DOCTYPE_XHTML_1_2_MOBILE, render("!!! mobile"));
		assertEquals(Helper.DOCTYPE_XHTML_1_0_TRANSITIONAL, render("!!! transitional"));
		assertEquals(Helper.DOCTYPE_XHTML_1_0_TRANSITIONAL, render("!!!"));
	}
	
	@Test
	public void htmlDoctypes() {
		assertEquals(Helper.DOCTYPE_HTML, renderWithFormat("html5", "!!!"));
		assertEquals(Helper.DOCTYPE_HTML, render("!!! 5"));
		assertEquals(Helper.DOCTYPE_HTML_4_01_STRICT, renderWithFormat("html4", "!!! strict"));
		assertEquals(Helper.DOCTYPE_HTML_4_01_FRAMESET, renderWithFormat("html4", "!!! frameset"));
		assertEquals(Helper.DOCTYPE_HTML_4_01_TRANSITIONAL, renderWithFormat("html4", "!!! transitional"));
		assertEquals(Helper.DOCTYPE_HTML_4_01_TRANSITIONAL, renderWithFormat("html4", "!!!"));
	}
	
	@Test
	public void htmlIgnoresXmlPrologDeclaration() {
		assertEquals("", renderWithFormat("html4", "!!! XML"));
		// because anything before the doctype triggers quirks mode in IE
	    assertFalse(CharMatcher.WHITESPACE.matches(renderWithFormat("html4", "!!! xml\n!!!").charAt(0)));
	}
	
	private String render(String haml) {
		JHaml jhaml = new JHaml();
		return jhaml.parse(haml);
	}
	private String renderWithFormat(String format, String haml) {
		JHamlConfig config = new JHamlConfig();
		JHaml jhaml = new JHaml(config);
		config.format = format;
		return jhaml.parse(haml);
	}
}
