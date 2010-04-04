package com.cadrlife.jhaml;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cadrlife.jhaml.JHamlConfig;

public class HtmlStyleAttributeHashTest {
	
	@Test
	public void noAttributes() {
		String haml = "%html()";
		String html = "<html></html>";
		assertEquals(html, render(haml));
	}
	
	@Test
	public void oneAttribute() {
		String html = "<html a='b'></html>";
		assertEquals(html, render("%html(a='b')"));
		assertEquals(html, render("%html(a=\"b\")"));
	}
	
	@Test
	public void htmlStyleAttributes() {
		String haml = "%html(xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"en\" lang=\"en\")";
		String html = "<html lang='en' xml:lang='en' xmlns='http://www.w3.org/1999/xhtml'></html>";
		assertEquals(html, render(haml));
	}
	
	@Test
	public void expressionsAsAttribute() {
		assertEquals("<html a='<%= b %>'></html>", render("%html(a=b)"));
		assertEquals("<html a='<%= 2+x %>'></html>", render("%html(a=2+x)"));
		assertEquals("<html a='<%= foo.bar(baz, boo) %>'></html>", render("%html(a=foo.bar(baz, boo))"));
	}
	
	@Test
	public void bothStylesOfAttributes() {
		assertEquals("<html a='b' b='c'></html>", render("%html(a='b'){:b=>'c'}"));
		assertEquals("<html a='b' b='c'></html>", render("%html{:b=>'c'}(a='b')"));
		assertEquals("<html a='b' b='c'>(d='e')</html>", render("%html{:b=>'c'}(a='b')(d='e')"));
		assertEquals("<html a='b' b='c'>{:d=>'e'}</html>", render("%html{:b=>'c'}(a='b'){:d=>'e'}"));
	}
	
	@Test
	public void defaultToTrue() {
		assertEquals("<html a='a' b='b'></html>", render("%html(a b)"));
		assertEquals("<html a b></html>", renderWithFormat("html5", "%html(a b)"));
	}
	
	private String renderWithFormat(String format, String haml) {
		JHamlConfig config = new JHamlConfig();
		config.format = format;
		return new JHaml(config).parse(haml);
	}
	
	private String render(String haml) {
		JHamlConfig config = new JHamlConfig();
		return new JHaml(config).parse(haml);
	}

//	private void assertAttributeValue(String input, String attr, String value) {
//		assertEquals(value, readAttrs(input).get(attr).value);
//	}

//	private Map<String, AttributeValue> readAttrs(String input) {
//		List<Line> lines = new JHamlParserWrapper().parseJhaml("%p" + input + "\n", new JHamlConfig());
//		return lines.get(0).attrMap;
//	}
}
