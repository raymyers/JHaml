package com.cadrlife.jaml.filters;

import com.cadrlife.jaml.JamlConfig;
import com.google.common.base.CharMatcher;

public class PreserveFilter extends Filter {

	public PreserveFilter(JamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		String normalizedInput = CharMatcher.WHITESPACE.trimTrailingFrom(indent(input,-2));
		return normalizedInput.replaceAll("\n", "&#x000A;");
	}

}
