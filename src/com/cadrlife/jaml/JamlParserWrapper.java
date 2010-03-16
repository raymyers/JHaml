package com.cadrlife.jaml;

import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.cadrlife.jaml.JamlParser.jamlSource_return;
import com.cadrlife.util.StringInputStream;

public class JamlParserWrapper {

	public List<Line> parseJaml(String input, JamlConfig config) throws JamlParseException {
		try {
			JamlLexer lexer = new JamlLexer(new ANTLRInputStream(
					new StringInputStream(input)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			JamlParser parser = new JamlParser(tokens);
			new JamlErrorChecker().checkDocumentDoesNotBeginWithIndentation(input);
			jamlSource_return result = parser.jamlSource(config);
			throwForParseErrors(parser);
			return result.lines;
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

	public CommonTokenStream tokenizeJaml(String input) throws IOException {
		JamlLexer lexer = new JamlLexer(new ANTLRInputStream(
				new StringInputStream(input)));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return tokens;
	}

}