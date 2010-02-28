package com.cadrlife.jaml;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import com.cadrlife.jaml.JamlParser.elementDeclaration_return;
import com.cadrlife.util.StringInputStream;

public class JamlAttributeHashTest {
	
	@Test
	public void string() {
		String input = "{:a => \"Hello World\"}";
		assertEquals("Hello World", readAttrs(input).get("a"));
	}
	
	@Test
	public void unJavaLikeSingleQuotedString() {
		String input = "{:a => 'Hello'}";
		assertEquals("Hello", readAttrs(input).get("a"));
	}
	
	@Test
	public void character() {
		String input = "{:a => 'H'}";
		assertEquals("H", readAttrs(input).get("a"));
	}
	
	@Test
	public void stringEscaping() {
		String input = "{:a => \"\\\"Hello\\\" World\"}";
		assertEquals("\"Hello\" World", readAttrs(input).get("a"));
	}
	
	@Test
	public void integer() {
		String input = "{:a => 42}";
		assertEquals("42", readAttrs(input).get("a"));
	}
	
	@Test
	public void octalInteger() {
		String input = "{:a => 042}";
		assertEquals("34", readAttrs(input).get("a"));
	}
	
	@Test
	public void hexInteger() {
		String input = "{:a => 0x42}";
		assertEquals("66", readAttrs(input).get("a"));
	}
	
	@Test
	public void hexLong() {
		String input = "{:a => 0x42l}";
		assertEquals("66", readAttrs(input).get("a"));
	}
	
	@Test
	public void floatingPoint() {
		String input = "{:a => 42.01, :b => 42.02f, :c => 42.03d}";
		assertEquals("42.01", readAttrs(input).get("a"));
		assertEquals("42.02", readAttrs(input).get("b"));
		assertEquals("42.03", readAttrs(input).get("c"));
	}
	
	@Test
	public void numbersAsAttributeNames() {
		String input = "{1 => 42}";
		assertEquals("42", readAttrs(input).get("1"));
	}
	
	@Test
	public void stringsAsAttributeNames() {
		String input = "{\"1\" => 42 }";
		assertEquals("42", readAttrs(input).get("1"));
	}
	
	@Test
	public void bracesWithinValues() {
		// Broken in Haml 2.09 -- Ray
		assertEquals("}{", readAttrs("{\"1\" => \"}{\"}").get("1"));
		assertEquals("{", readAttrs("{\"1\" => '{'}").get("1"));
	}
	
	@Test
	public void javaExpressionsAsValues() {
		String input = "{:a => 1+2 , :b => foo(bar(baz.boo))}";
		assertEquals("<%= 1+2 %>", readAttrs(input).get("a"));
		assertEquals("<%= foo(bar(baz.boo)) %>", readAttrs(input).get("b"));
	}
	@Test
	public void javaExpressionWithAnonymousClassAsValue() {
		// Non. Trivial.
		String anon = "new Runnable() {\n@Override\npublic void run() {\n throw new RuntimeException();}\n}";
		String input = "{:a => 1+2 , :b => " + anon + ", :c => 3}";
		assertEquals("<%= 1+2 %>", readAttrs(input).get("a"));
		assertEquals("<%= " + anon + " %>", readAttrs(input).get("b"));
		assertEquals("3", readAttrs(input).get("c"));
	}
	
	private Map<String, String> readAttrs(String input) {
		try {
			
			JamlLexer lexer = new JamlLexer(new ANTLRInputStream(
					new StringInputStream(("%p" + input))));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			JamlParser parser = new JamlParser(tokens);
			elementDeclaration_return prog = parser.elementDeclaration();
			if (parser.failed()) {
				throw new RuntimeException();
			}
			return prog.attrMap;
		} catch (RecognitionException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
