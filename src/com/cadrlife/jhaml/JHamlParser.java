package com.cadrlife.jhaml;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.CharMatcher;
import com.google.common.collect.ImmutableSet;

public class JHamlParser {
	private static final CharMatcher ELEMENT_TYPE_MATCHER = CharMatcher.JAVA_LETTER_OR_DIGIT.or(CharMatcher.is(':'));
	private static final CharMatcher CLASS_MATCHER = CharMatcher.JAVA_LETTER_OR_DIGIT.or(CharMatcher.is(':'));
	private static final CharMatcher INDENTATION_MATCHER = CharMatcher.anyOf(" \t");
	private static final CharMatcher ID_MATCHER = CLASS_MATCHER;
	private static final CharMatcher ATTRIBUTE_MATCHER = ID_MATCHER;

	private final JHamlReader reader;
	private Helper helper;
	public JHamlParser(JHamlReader reader) {
		helper = new Helper(new JHamlConfig());
		this.reader = reader;
	}
	public List<Line> jHamlSource() {
		ArrayList<Line> lines = new ArrayList<Line>();
		while (line(lines));
		return lines;
	}
	private boolean line(ArrayList<Line> lines) {
		if (reader.eof()) {
			return false;
		}
		Line line = new Line();
		line.lineNumber = reader.getLineNumber()+1;
		lines.add(line);
		reader.setObserver(line.textWriter());
		line.leadingWhitespace = reader.consumeMatching(INDENTATION_MATCHER);
		if (elementDeclaration(line)) {
			line.isElement = true;
			if (reader.isNextChar('/')) {
				reader.skip(1);
				line.isSelfClosing = true;
			}
			ignoreWhitespace();
			line.inLineContent = reader.readLine();
			reader.setObserver(null);
			return true;
		}
		line.inLineContent = reader.readLine();
		reader.setObserver(null);
		return true;
	}
	private boolean elementDeclaration(Line line) {
		boolean hasElementTypeSpecifier = elementTypeSpecifier(line);
		if (hasElementTypeSpecifier || classSpecifier(line) || idSpecifier(line)) {
			while (classSpecifier(line) || idSpecifier(line));
			if (!hasElementTypeSpecifier) {
				line.tag = "div";
			}
			attributeHash(line);
			return true;
		}
		return false;
	}
	
	private boolean attributeHash(Line line) {
		if (reader.isNextChar('{')) {
			reader.skip(1);
			ignoreWhitespaceIncludingNewline();
			attributeMapping(line);
			ignoreWhitespaceIncludingNewline();
			while (reader.isNextChar(',')) {
				reader.skip(1);
				ignoreWhitespaceIncludingNewline();
				attributeMapping(line);
				ignoreWhitespaceIncludingNewline();
			}
			if (reader.isNextChar('}')) {
				reader.skip(1);
				return true;
			}
			fail();
		}
	 	return false;
	}
	private void fail() {
		throw new RuntimeException();	
	}
	private boolean attributeMapping(Line line) {
		String attr = ""; 
		if (reader.isNextChar(':')) {
			reader.skip(1);
			attr = reader.consumeMatching(ATTRIBUTE_MATCHER);
		} else if (reader.isNextCharOneOf("0123456789")) {
			attr = numberLiteral();
		} else if (reader.isNextCharOneOf("'\"")) {
			attr = helper.parseStringLiteral(stringLiteral());
		} else {
			return false;
		}
		ignoreWhitespaceIncludingNewline();
		if (reader.isNextInput("=>")) {
			reader.skip(2);
			ignoreWhitespaceIncludingNewline();
			line.attrMap.put(attr, attributeValue());
			return true;
		}
		fail();
		return false;
	}
	
	private AttributeValue attributeValue() {
		String exp = expression().trim();
		if (exp.startsWith("'") || exp.startsWith("\"")) {
			return AttributeValue.quoted(helper.parseStringLiteral(exp));
		} else {
//			String identifier = reader.consumeMatching(CharMatcher.JAVA_LETTER);
//			if (!identifier.isEmpty()) {
//				identifier += reader.consumeMatching(CharMatcher.JAVA_LETTER_OR_DIGIT);
//				return AttributeValue.literal(identifier);
//			}
			CharMatcher NUMBER_LITERAL_CHARS = CharMatcher.JAVA_LETTER_OR_DIGIT.or(CharMatcher.is('.'));
			if (CharMatcher.JAVA_DIGIT.indexIn(exp) == 0 && NUMBER_LITERAL_CHARS.matchesAllOf(exp)) {
				return AttributeValue.literal(helper.parseNumberLiteral(exp));
			}
			ImmutableSet<String> keywords = ImmutableSet.of("null","true","false");
			if (keywords.contains(exp)) {
				return AttributeValue.literal(exp);
			}			
			return AttributeValue.literal("<%= " + exp + " %>");
		}
//		fail();
//		return null;
	}
	
	private String expression() {
		int parenDepth = 0;
		int braceDepth = 0;
		int bracketDepth = 0;
		String exp = "";
		while (!reader.eof()) {
			if (parenDepth < 1 && braceDepth <1 && braceDepth <1 && bracketDepth <1 && reader.isNextCharOneOf(",}")) {
				break;
			}
			if (reader.isNextCharOneOf("'\"")) {
				exp += stringLiteral();
				continue;
			}
			char c = (char)reader.read();
			exp += c;
			switch (c) {
			case '{': braceDepth++; break;
			case '}': braceDepth--; break;
			case '(': parenDepth++; break;
			case ')': parenDepth--; break;
			case '[': bracketDepth++; break;
			case ']': bracketDepth--; break;
			}
		}
		return exp;
	}
	private String numberLiteral() {
		String val = "";
			if (reader.isNextInput("0x")) {
				val = "0x";
				reader.skip(2);
			}
			val += reader.consumeMatching(CharMatcher.inRange('0', '9'));
			if (reader.isNextChar('.')) {
				reader.skip(1);
				val += "." + reader.consumeMatching(CharMatcher.inRange('0', '9'));
				if (reader.isNextCharOneOf("dDfF")) {
					reader.skip(1);
				}
				return helper.parseDoubleLiteral(val);
				
			}
			if (reader.isNextCharOneOf("lL")) {
				reader.skip(1);
			}
			return helper.parseIntegerLiteral(val);
	}
	private String stringLiteral() {
		char quote = (char) reader.read();
		String val = reader.consumeMatchingWithEscaping(CharMatcher.is(quote).negate(),'\\');
//		String ret = StringEscapeUtils.unescapeJava(val);
		if (reader.isNextChar(quote)) {
			reader.skip(1);
			return quote + val + quote;
		}
		fail();
		return null;
	}
	private void ignoreWhitespace() {
		reader.consumeMatching(INDENTATION_MATCHER);
	}
	private void ignoreWhitespaceIncludingNewline() {
		reader.consumeMatching(CharMatcher.WHITESPACE);
	}
	private boolean elementTypeSpecifier(Line line) {
		if (reader.isNextChar('%')) {
			reader.skip(1);
			line.tag = reader.consumeMatching(ELEMENT_TYPE_MATCHER);
			return true;
		}
		return false;
	}
	private boolean classSpecifier(Line line) {
		if (reader.isNextChar('.')) {
			reader.skip(1);
			line.classes.add(reader.consumeMatching(CLASS_MATCHER));
			return true;
		}
		return false;
	}
	private boolean idSpecifier(Line line) {
		if (reader.isNextChar('#')) {
			reader.skip(1);
			line.ids.add(reader.consumeMatching(ID_MATCHER));
			return true;
		}
		return false;
	}
}
