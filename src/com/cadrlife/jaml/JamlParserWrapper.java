package com.cadrlife.jaml;

import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.cadrlife.jaml.JamlAttrHashParser.attrMappings_return;
import com.cadrlife.jaml.JamlParser.jamlSource_return;
import com.cadrlife.util.StringInputStream;

public class JamlParserWrapper {

	public attrMappings_return parseJamlAttrHash(String input, Helper helper)
		throws IOException, RecognitionException {
		input += "\n";
		JamlAttrHashLexer lexer = new JamlAttrHashLexer(new ANTLRInputStream(
				new StringInputStream(input)));
		CommonTokenStream tokens1 = new CommonTokenStream(lexer);
		CommonTokenStream tokens = tokens1;
			JamlAttrHashParser parser = new JamlAttrHashParser(tokens);
			parser.enableErrorMessageCollection(true);
		attrMappings_return attrMappings = parser.attrMappings(helper);
		throwForParseErrors(parser);
		return attrMappings;
	}

	private void throwForParseErrors(JamlAttrHashParser parser) {
		if (parser.failed() || !parser.getMessages().isEmpty()) {
			for (String msg : parser.getMessages()) {
				System.err.println(msg);
			}
			throw new RuntimeException();
		}
	}

	public jamlSource_return parseJaml(String input) throws JamlParseException {
		try {
			JamlParser parser = primeJamlParser(input, false);
			jamlSource_return result = parser.jamlSource(new JamlConfig());
			throwForParseErrors(parser);
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			throw new JamlParseException("");
		} catch (RecognitionException e) {
			e.printStackTrace();
			throw new JamlParseException("");
		}
	}

	private void throwForParseErrors(JamlParser parser) {
		if (parser.failed()) {
			throw new RuntimeException();
		}

	}

	private JamlParser primeJamlParser(String input, boolean b) throws IOException {
		JamlLexer lexer = new JamlLexer(new ANTLRInputStream(
				new StringInputStream(input)));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		JamlParser parser = new JamlParser(tokens);
		return parser;	
	}

	public CommonTokenStream tokenizeJaml(String input) throws IOException {
		JamlLexer lexer = new JamlLexer(new ANTLRInputStream(
				new StringInputStream(input)));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return tokens;
	}

}