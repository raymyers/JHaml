package com.cadrlife.jhaml;

import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.cadrlife.jhaml.generated.JHamlLexer;
import com.cadrlife.jhaml.generated.JHamlParser;
import com.cadrlife.util.StringInputStream;

public class JHamlParserWrapper {

	public List<Line> parseJhaml(String input, JHamlConfig config) throws JHamlParseException {
		try {
			JHamlLexer lexer = new JHamlLexer(new ANTLRInputStream(
					new StringInputStream(input)));
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			JHamlParser parser = new JHamlParser(tokens);
			new JHamlErrorChecker().checkDocumentDoesNotBeginWithIndentation(input);
			JHamlParser.jhamlSource_return result = parser.jhamlSource(config);
			throwForParseErrors(parser);
			return result.lines;
		} catch (IOException e) {
			e.printStackTrace();
			throw new JHamlParseException("");
		} catch (RecognitionException e) {
			e.printStackTrace();
			throw new JHamlParseException("");
		}
	}

	private void throwForParseErrors(JHamlParser parser) {
		if (parser.failed()) {
			throw new RuntimeException();
		}

	}

	public CommonTokenStream tokenizeJHaml(String input) throws IOException {
		JHamlLexer lexer = new JHamlLexer(new ANTLRInputStream(
				new StringInputStream(input)));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return tokens;
	}

}