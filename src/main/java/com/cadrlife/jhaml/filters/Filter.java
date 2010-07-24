package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;
import com.google.common.base.CharMatcher;
import com.cadrlife.jhaml.internal.util.IndentUtils;

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
