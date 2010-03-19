package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;
import com.cadrlife.jhaml.util.IndentUtils;
import com.google.common.base.CharMatcher;

public class PlainFilter extends Filter {

	public PlainFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
//		return CharMatcher.WHITESPACE.trimTrailingFrom(indent(input,-IndentUtils.baseIndentation(input)));
		return CharMatcher.WHITESPACE.trimTrailingFrom(input);
	}
}
