package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;
import com.cadrlife.jhaml.util.IndentUtils;
import com.google.common.base.CharMatcher;

public abstract class Filter {
	protected final JHamlConfig config;

	public Filter(JHamlConfig config) {
		this.config = config;
	}
	
	public abstract String process(String input);
	
	protected String indent(String text, int amount) {
		return IndentUtils.indent(text, amount);
	}
	
	protected String trimEnd(String string) {
		return CharMatcher.WHITESPACE.trimTrailingFrom(string);
	}

}
