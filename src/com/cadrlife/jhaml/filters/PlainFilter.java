package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;
import com.google.common.base.CharMatcher;

public class PlainFilter extends Filter {

	public PlainFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return CharMatcher.WHITESPACE.trimTrailingFrom(indent(input,-4));
	}
}
