package com.cadrlife.jaml;

import static org.junit.Assert.*;

import org.junit.Test;

public class JamlTest {
	private String INDENT = "\n  ";
	private JamlConfig config = new JamlConfig();
	private Jaml jaml = new Jaml(config);	

	@Test
	public void emptyRender() {
		assertEquals("", jaml.parse(""));
	}

	@Test
	public void element() {
		assertEquals("<div class='atlantis'></div>", jaml
				.parse("%div.atlantis").trim());
	}

	@Test
	public void twoElements() {
		assertEquals("<a></a>\n<b></b>", jaml.parse("%a\n%b").trim());
	}

	@Test
	public void divIsDefaultElement() {
		assertEquals("<div class='atlantis'></div>", jaml.parse(".atlantis")
				.trim());
	}

	@Test
	public void idAndClassElement() {
		assertEquals("<div class='atlantis' id='id'></div>", jaml.parse(
				"#id.atlantis").trim());
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
		String html = "<p>\n  <a href='http://haml-lang.com'></a>\n</p>";
		assertEquals(html, jaml.parse(haml));
	}

	@Test
	public void twoNestedElements() {
		String haml = "%p\n  %a{:href=>\"http://haml-lang.com\"}\n  %tag";
		String html = "<p>\n  <a href='http://haml-lang.com'></a>\n  <tag></tag>\n</p>";
		assertEquals(html, jaml.parse(haml));
	}

	@Test
	public void twoLevelNestingElements() {
		String haml = "%p\n  %a\n    %tag";
		String html = "<p>\n  <a>\n    <tag></tag>\n  </a>\n</p>";
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
		assertEquals("<a>\n  Hello World\n</a>", jaml.parse("%a\n  Hello World"));
	}

	@Test
	public void textInsideElementTwoLines() {
		assertEquals("<a>\n  Hello\n  World\n</a>", jaml
				.parse("%a\n  Hello\n  World"));
	}

	@Test
	public void textAndElementsInsideElementTwoLines() {
		assertEquals("<a>\n  <b>b</b>\n  Hello World\n  <c>c</c>\n</a>", jaml
				.parse("%a\n  %b b\n  Hello World\n  %c c"));
	}

	@Test
	public void stringsShouldGetStrippedInsideTags() {
		String haml = ".stripped    This should have no spaces in front of it";
		String html = "<div class='stripped'>This should have no spaces in front of it</div>";
		assertEquals(html, jaml.parse(haml));
	}

	@Test
	public void attributeHashWithNewLines() {
		assertEquals("<p a='b' c='d'>foop</p>", jaml
				.parse("%p{:a => \"b\",\n :c => \"d\"} foop"));
		assertEquals("<p a='b' c='d'>\n  foop\n</p>", jaml
				.parse("%p{:a => \"b\",\n :c => \"d\"}\n foop"));
		assertEquals("<p a='b' c='d' />", jaml
				.parse("%p{:a => \"b\",\n :c => \"d\"}/"));
		assertEquals("<p a='b' c='d' e='f'></p>", jaml
				.parse("%p{:a => \"b\",\n :c => \"d\",\n :e => \"f\"}"));
	}

	@Test
	public void selfClosingTags() {
		assertEquals("<p a='b' />", jaml.parse("%p{:a => \"b\"}/"));
		for (String elem : new JamlConfig().autoclose) {
			assertEquals("<" + elem + " />", jaml.parse("%" + elem + ""));
		}
	}
	
	@Test
	public void preserveTags() {
//		for (String elem : new JamlConfig().autoclose) {
//			assertEquals("<" + elem + " />", jaml.parse("%" + elem + ""));
//		}
	}

	@Test
	public void crNewLine() {
		String html = "<p>foo</p>\n<p>bar</p>\n<p>baz</p>\n<p>boom</p>";
		assertEquals(html, jaml.parse("%p foo\r%p bar\r\n%p baz\n\r%p boom"));
	}

	@Test
	public void elementsWithMultipleClasses() {
		String html = "<p class='a b c'></p>";
		assertEquals(html, jaml.parse("%p.b.c{:class=>'a'}"));
	}

	@Test
	public void elementsWithMultipleIds() {
		// Haml handles multiple ids differently from classes.
		// This matches behavior of Haml 2.2.20.
		String html = "<p id='c_a'></p>";
		assertEquals(html, jaml.parse("%p#b#c{:id=>'a'}"));
	}
	
	@Test
	public void doctypeHeader() {
		String header = Helper.DOCTYPE_XHTML_1_0_TRANSITIONAL;
		assertEquals(header + "\n<p />", jaml.parse("!!!\n%p/"));
	}
	@Test
	public void blankLines() {
		assertEquals("<p>\n  <a />\n  <b />\n</p>", jaml.parse("%p\n  %a/\n\n  %b/"));
		assertEquals("<p>\n  <a />\n  <b />\n</p>", jaml.parse("%p\n  %a/\n\n\n\n  %b/"));
		assertEquals("<p>\n  <p>\n    <a />\n    <b />\n  </p>\n</p>", jaml.parse("%p\n  %p\n    %a/\n\n    %b/"));
	}
	
	@Test
	public void flexibleTabulation() {
		assertEquals("<p>\n  foo\n</p>\n<q>\n  bar\n  <a>\n    baz\n  </a>\n</q>", jaml.parse("%p\n foo\n%q\n bar\n %a\n  baz"));
		assertEquals("<p>\n  foo\n</p>\n<q>\n  bar\n  <a>\n    baz\n  </a>\n</q>", jaml.parse("%p\n\tfoo\n%q\n\tbar\n\t%a\n\t\tbaz"));
		assertEquals("<p>\n      \t \t bar\n   baz\n</p>", jaml.parse("%p\n  :plain\n        \t \t bar\n     baz"));
	}
	
	@Test
	public void attrWrapper() {
		this.config.attrWrapper = "*";
		assertEquals("<p strange=*attrs*></p>", jaml.parse("%p{ :strange => 'attrs'}"));
		this.config.attrWrapper = "\"";
		assertEquals("<p escaped='quo\"te'></p>", jaml.parse("%p{ :escaped => 'quo\"te'}"));
		assertEquals("<p escaped=\"quo'te\"></p>", jaml.parse("%p{ :escaped => 'quo\\'te'}"));
	    assertEquals("<p escaped=\"q'uo&quot;te\"></p>", jaml.parse("%p{ :escaped => 'q\\'uo\"te'}"));
	    assertEquals("<?xml version=\"1.0\" encoding=\"utf-8\" ?>", jaml.parse("!!! XML"));
	    this.config.attrWrapper = "'";
	}
}