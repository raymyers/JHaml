package com.cadrlife.jaml.filters;

import com.cadrlife.jaml.JamlConfig;
import com.google.common.base.CharMatcher;

public abstract class Filter {
	protected final JamlConfig config;

	public Filter(JamlConfig config) {
		this.config = config;
	}
	
	public abstract String process(String input);
	
	public String indent(String text, int amount) {
		String current = spaces(baseIndentation(text));
		String textWithoutFirstIndent = CharMatcher.is(' ').trimLeadingFrom(text);
		String target = spaces(amount);
		return target + textWithoutFirstIndent.replaceAll("\n"+current, "\n"+target ); 
	}
	
	public String spaces(int spaces) {
		String string = "";
		for (int i = 0; i<spaces; i++) {
			string += " ";
		}
		return string;
	}

	private int baseIndentation(String text) {
		return text.length() - CharMatcher.is(' ').trimLeadingFrom(text).length();
	}

}
