package com.cadrlife.jaml;

import java.io.IOException;
import java.io.StringBufferInputStream;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;

import com.cadrlife.jaml.JamlParser.prog_return;

public class Jaml {

	@SuppressWarnings( { "unchecked", "deprecation" })
	public String parse(String input) throws IOException, RecognitionException {
		if (input.trim().isEmpty()) {
			return "";
		}
		CommonTokenStream tokens = new CommonTokenStream(
				new JamlLexer(new ANTLRInputStream(new StringBufferInputStream(
						input + "\n"))));
		CommonTokenStream tokens2 = new CommonTokenStream(
				new JamlLexer(new ANTLRInputStream(new StringBufferInputStream(
						input + "\n"))));
		for (Token t : (List<Token>) tokens2.getTokens()) {
//			System.out.println(t);
		}
		JamlParser parser = new JamlParser(tokens);
		prog_return prog = parser.prog();
		if (parser.failed()) {
			throw new RuntimeException();
		}
		return prog.rendering.trim();
	}
}