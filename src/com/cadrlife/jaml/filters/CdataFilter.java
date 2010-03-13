package com.cadrlife.jaml.filters;

import com.cadrlife.jaml.JamlConfig;
import com.google.common.base.CharMatcher;

public class CdataFilter extends Filter {

	public CdataFilter(JamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return "<![CDATA[\n" + CharMatcher.WHITESPACE.trimTrailingFrom(indent(input,-2))
				+ "\n]]>";
	}

}
