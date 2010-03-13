package com.cadrlife.jaml.util;

import com.google.common.base.CharMatcher;

public class IndentUtils {
//	public static String rebaseIndent(String text, int amount) {
//		String current = spaces(baseIndentation(text));
//		String textWithoutFirstIndent = CharMatcher.is(' ').trimLeadingFrom(text);
//		String target = spaces(amount);
//		return target + textWithoutFirstIndent.replaceAll("\n", "\n"+target ); 
//	}
	public static String indent(String text, int amount) {
		if (amount >= 0) {
			String target = spaces(amount);
			return target + text.replaceAll("\n", "\n"+target).replaceAll("\n"+target+"\\z", "\n"); 
		}
		if (text.length() < -amount) {
			return text;
		}
		return text.substring(-amount).replaceAll("\n" + spaces(-amount), "\n");
	}
	
	public static String spaces(int spaces) {
		String string = "";
		for (int i = 0; i<spaces; i++) {
			string += " ";
		}
		return string;
	}

	public static int baseIndentation(String text) {
		return text.length() - CharMatcher.is(' ').trimLeadingFrom(text).length();
	}

	public static boolean containsNesting(String text) {
		return text.contains("\n" + spaces(baseIndentation(text)+1));
	}

	public static boolean hasContentOnFirstLine(String text) {
		int endOfFirstLine = text.contains("\n") ? text.indexOf('\n') : text.length();
		return !text.substring(0, endOfFirstLine).trim().isEmpty();
	}

	public static String describe(boolean isIndentWithTabs, int indentationSize) {
		return indentationSize + (isIndentWithTabs ? " tab" : " space") + (indentationSize == 1 ? "" : "s");
	}

	public static String describe(String indentation) {
		if (CharMatcher.is('\t').matchesAllOf(indentation)) {
			return describe(true, indentation.length());
		}
		if (CharMatcher.is(' ').matchesAllOf(indentation)) {
			return describe(false, indentation.length());
		}
		return "\"" + indentation.replaceAll("\t", "\\\\t")+ "\"";
	}
}
