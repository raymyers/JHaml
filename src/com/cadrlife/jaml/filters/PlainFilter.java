package com.cadrlife.jaml.filters;

import com.cadrlife.jaml.JamlConfig;
import com.google.common.base.CharMatcher;

public class PlainFilter extends Filter {

	public PlainFilter(JamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return CharMatcher.WHITESPACE.trimTrailingFrom(indent(input,0));
	}
}
