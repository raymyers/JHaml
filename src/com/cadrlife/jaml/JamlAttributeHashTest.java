package com.cadrlife.jaml;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Map;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import com.cadrlife.jaml.JamlParser.attrHash_return;

public class JamlAttributeHashTest {
	
	@Test
	public void string() {
		String input = "{:a => \"Hello World\"}";
		assertEquals("Hello World", readAttrs(input).get("a"));
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
		String input = "{\"1\" => 42}";
		assertEquals("42", readAttrs(input).get("1"));
	}
	
	private Map<String, String> readAttrs(String input) {
		try {
			
			CommonTokenStream tokens = Jaml.tokenize("%p" + input);
			tokens.getTokens().remove(0);
			tokens.getTokens().remove(0);
			JamlParser parser = new JamlParser(tokens);
			if (parser.failed()) {
				throw new RuntimeException();
			}
			attrHash_return prog = parser.attrHash();
			return prog.attrMap;
		} catch (RecognitionException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
