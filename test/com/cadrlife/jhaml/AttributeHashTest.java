package com.cadrlife.jhaml;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.cadrlife.jhaml.internal.AttributeValue;
import com.cadrlife.jhaml.internal.JHamlParser;
import com.cadrlife.jhaml.internal.Line;

public class AttributeHashTest {
	
	@Test
	public void string() {
		String input = "{:a => \"Hello World\"}";
		assertAttributeValue(input,"a","Hello World");
	}
	
	@Test
	public void emptyString() {
		String input = "{:a => \"\"}";
		assertAttributeValue(input,"a","");
	}
	
	@Test
	public void unJavaLikeSingleQuotedString() {
		String input = "{:a => 'Hello'}";
		assertAttributeValue(input,"a","Hello");
	}
	
	@Test
	public void character() {
		String input = "{:a => 'H'}";
		assertAttributeValue(input,"a","H");
	}
	
	@Test
	public void stringEscaping() {
		String input = "{:a => \"\\\"Hello\\\" World\"}";
		assertAttributeValue(input,"a","\"Hello\" World");
	}
	
	@Test
	public void integer() {
		String input = "{:a => 42}";
		assertAttributeValue(input,"a","42");
	}
	
	@Test
	public void octalInteger() {
		String input = "{:a => 042}";
		assertAttributeValue(input,"a","34");
	}
	
	@Test
	public void hexInteger() {
		String input = "{:a => 0x42}";
		assertAttributeValue(input,"a","66");
	}
	
	@Test
	public void hexLong() {
		String input = "{:a => 0x42l}";
		assertAttributeValue(input,"a","66");
	}
	
	@Test
	public void floatingPoint() {
		String input = "{:a => 42.01, :b => 42.02f, :c => 42.03d}";
		assertAttributeValue(input,"a","42.01");
		assertAttributeValue(input,"b","42.02");
		assertAttributeValue(input,"c","42.03");
	}
	
	@Test
	public void numbersAsAttributeNames() {
		String input = "{1 => 42}";
		assertAttributeValue(input,"1","42");
	}
	
	@Test
	public void stringsAsAttributeNames() {
		String input = "{\"1\" => 42 }";
		assertAttributeValue(input,"1","42");
	}
	
	@Test
	public void bracesWithinValues() {
		// Broken in Haml 2.09 -- Ray
		assertAttributeValue("{\"1\" => \"}{\"}","1","}{");
		assertAttributeValue("{\"1\" => '{'}", "1", "{");
	}
	
	@Test
	public void javaExpressionsAsValues() {
		String input = "{:a => 1+2 , :b => foo(bar(baz.boo))}";
		assertAttributeValue(input, "a", "<%= 1+2 %>");
		assertAttributeValue(input, "b", "<%= foo(bar(baz.boo)) %>");
	}
	
	@Test
	public void javaExpressionsWithCommasAsValues() {
		String input = "{:a => Arrays.asList(1,2,3), :b => 1+2}";
		assertAttributeValue(input, "a", "<%= Arrays.asList(1,2,3) %>");
		assertAttributeValue(input, "b", "<%= 1+2 %>");
	}
	
	@Test
	public void javaExpressionWithAnonymousClassAsValue() {
		// Non. Trivial.
		String anon = "new Runnable() {\n@Override\npublic void run() {\n throw new RuntimeException();}\n}";
		String input = "{:a => 1+2 , :b => " + anon + ", :c => 3}";
		assertAttributeValue(input, "a", "<%= 1+2 %>");
		assertAttributeValue(input, "b", "<%= " + anon + " %>");
		assertAttributeValue(input, "c", "3");
	}
	
	@Test
	public void html5DataAttributes() {
		String input = "{:data => {:author_id => 123, :foo => 'bar', :biz => 'baz'}}";
		assertAttributeValue(input, "data-author_id", "123");
		assertAttributeValue(input, "data-foo", "bar");
		assertAttributeValue(input, "data-biz", "baz");
	}
	
	@Test
	public void html5DataAttributes_withJavaExpressions() {
		assertAttributeValue("{:data => {:one_plus_one => 1+1}}", "data-one_plus_one", "<%= 1+1 %>");
	}
	
	@Test
	public void html5DataAttributes_multipleDefs_useTheMoreExplicitAttribute() {
		String input1 = "{:data => {:foo => 'first'}, 'data-foo' => 'second'}";
		assertAttributeValue(input1, "data-foo", "second");
		String input2 = "{'data-foo' => 'first', :data => {:foo => 'second'}}";
		assertAttributeValue(input2, "data-foo", "first");
	}
	
	@Test
	public void doNotEscapeJavaExpressionValues() {
		String input = "%p{:a => foo(\"'<>&\")}";
		assertEquals("<p a='<%= foo(\"'<>&\") %>'></p>",new JHaml().parse(input));
	}
	
	@Test
	public void nullValues() {
		String input = "%p{:a => null}";
		assertEquals("<p></p>", new JHaml().parse(input));
	}
	
	@Test
	public void booleanAttributes() {
		assertEquals("<p bar baz='true' foo='bar'></p>", renderWithFormat("html4", "%p{:foo => 'bar', :bar => true, :baz => 'true'}"));
		assertEquals("<p bar='bar' baz='true' foo='bar'></p>", renderWithFormat("xhtml", "%p{:foo => 'bar', :bar => true, :baz => 'true'}"));
		assertEquals("<p baz='false' foo='bar'></p>", renderWithFormat("html4", "%p{:foo => 'bar', :bar => false, :baz => 'false'}"));
		assertEquals("<p baz='false' foo='bar'></p>", renderWithFormat("xhtml", "%p{:foo => 'bar', :bar => false, :baz => 'false'}"));
	}
	
	private String renderWithFormat(String format, String haml) {
		JHamlConfig config = new JHamlConfig();
		config.format = format;
		return new JHaml(config).parse(haml);
	}

	private void assertAttributeValue(String input, String attr, String value) {
		Map<String, AttributeValue> attrs = readAttrs(input);
		assertTrue("attribute " + attr + " not present", attrs.containsKey(attr));
		assertEquals(value, attrs.get(attr).value);
	}

	private Map<String, AttributeValue> readAttrs(String input) {
		String haml = "%p" + input + "\n";
		List<Line> lines = new JHamlParser(new StringReader(haml)).jHamlSource();
		return lines.get(0).attrMap;
	}
}
