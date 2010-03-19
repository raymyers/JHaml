package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;
import com.google.common.base.CharMatcher;

public class PreserveFilter extends Filter {

	public PreserveFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		String normalizedInput = CharMatcher.WHITESPACE.trimTrailingFrom(indent(input,-JHamlConfig.OUTPUT_INDENTATION_SIZE));
		return normalizedInput.replaceAll("\n", "&#x000A;");
	}

}
