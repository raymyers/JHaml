package com.cadrlife.jaml;

import java.io.IOException;
import java.io.StringBufferInputStream;
import java.util.Map;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.cadrlife.jaml.JamlParser.attrHash_return;
import com.cadrlife.jaml.JamlParser.prog_return;

@SuppressWarnings("deprecation")
public class Jaml {

	public String parse(String input) {
		if (input.trim().isEmpty()) {
			return "";
		}
		input = sanitizeInput(input);
		try {
			CommonTokenStream tokens = tokenize(input);
			prog_return prog = parseProg(tokens);
			String output = prog.rendering;
			return output.replaceAll("\n\n+", "\n").trim();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	private prog_return parseProg(CommonTokenStream tokens)
			throws RecognitionException {
		JamlParser parser = new JamlParser(tokens);
		if (parser.failed()) {
			throw new RuntimeException();
		}
		prog_return prog = parser.prog();
		return prog;
	}

	
	static CommonTokenStream tokenize(String input) throws IOException {
		CommonTokenStream tokens = new CommonTokenStream(
				new JamlLexer(new ANTLRInputStream(new StringBufferInputStream(
						input + "\n"))));
		return tokens;
	}

	private String sanitizeInput(String input) {
		return input.replaceAll("\r\n", "\n").replaceAll("\r", "\n") + "\n";
	}
}