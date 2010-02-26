package com.cadrlife.jaml;

import java.io.IOException;
import java.io.StringBufferInputStream;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import com.cadrlife.jaml.JamlParser.prog_return;
import com.cadrlife.util.StringInputStream;
import com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated.JavaLexer;
import com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated.JavaParser;
import com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated.JavaParser.compilationUnit_return;
import com.habelitz.jsobjectizer.unmarshaller.antlrbridge.generated.JavaParser.expression_return;

public class JamlParserWrapper {

	public compilationUnit_return parseJavaCompilationUnit(String input)
			throws IOException, RecognitionException {
		JavaParser parser = primeJavaParser(input, true);
		compilationUnit_return compilationUnit = parser.compilationUnit();
		throwForParseErrors(parser);
		return compilationUnit;
	}

	public expression_return parseJavaExpression(String input)
			throws IOException, RecognitionException {
		JavaParser parser = primeJavaParser(input, true);
		expression_return expression = parser.expression();
		throwForParseErrors(parser);
		return expression;
	}

	public prog_return parseJaml(String input) throws IOException,
			RecognitionException {
		JamlParser parser = primeJamlParser(input, false);
		prog_return jamlSource = parser.prog();
		throwForParseErrors(parser);
		return jamlSource;
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

	private JavaParser primeJavaParser(String input, boolean b)
			throws IOException {
		input += "\n";
		CommonTokenStream tokens = tokenizeJava(input);
		JavaParser parser = new JavaParser(tokens);
		parser.enableErrorMessageCollection(true);
		return parser;
	}

	public CommonTokenStream tokenizeJava(String input) throws IOException {
		JavaLexer lexer = new JavaLexer(new ANTLRInputStream(
				new StringInputStream(input)));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return tokens;
	}
	
	public CommonTokenStream tokenizeJaml(String input) throws IOException {
		JamlLexer lexer = new JamlLexer(new ANTLRInputStream(
				new StringInputStream(input)));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return tokens;
	}

	private void throwForParseErrors(JavaParser parser) {
		if (parser.failed() || !parser.getMessages().isEmpty()) {
			for (String msg : parser.getMessages()) {
				System.err.println(msg);
			}
			throw new RuntimeException();
		}
	}
}