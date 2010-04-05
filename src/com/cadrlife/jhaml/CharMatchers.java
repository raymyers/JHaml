package com.cadrlife.jhaml;

import com.google.common.base.CharMatcher;

public class CharMatchers {
	// http://www.w3.org/TR/xml11/#sec-common-syn
	// Differs from the XML spec:
	//   Allows names to begin with digits.
	//   Does not allow periods or hyphens.
	
	public static final CharMatcher XML_NAME_START_CHAR = 
		CharMatcher.JAVA_LETTER_OR_DIGIT
		.or(CharMatcher.anyOf(":_"))
		.or(CharMatcher.inRange('\u00c0', '\u00d6'))
		.or(CharMatcher.inRange('\u00d8','\u00f6'))
		.or(CharMatcher.inRange('\u00f8','\u02ff'))
		.or(CharMatcher.inRange('\u0370','\u037d'))
		.or(CharMatcher.inRange('\u037f','\u1fff'))
		.or(CharMatcher.inRange('\u200c','\u200d'))
		.or(CharMatcher.inRange('\u2070','\u218f'))
		.or(CharMatcher.inRange('\u2c00','\u2fef'))
		.or(CharMatcher.inRange('\u3001','\ud7ff'))
		.or(CharMatcher.inRange('\uf900','\ufdcf'))
		.or(CharMatcher.inRange('\ufdf0','\ufffd'));
	
	public static final CharMatcher XML_NAME_CHAR = 
		XML_NAME_START_CHAR
		.or(CharMatcher.is('\u00b7'))
		.or(CharMatcher.inRange('\u0300','\u036f'))
		.or(CharMatcher.inRange('\u203f','\u2040'));
	
	public static final CharMatcher CLASS_CHAR = CharMatcher.JAVA_LETTER_OR_DIGIT.or(CharMatcher.is(':'));
	
	public static final CharMatcher INDENTATION_CHAR = CharMatcher.anyOf(" \t");
	
	public static final CharMatcher ID_CHAR = CLASS_CHAR;
	
	private CharMatchers() {}
}
