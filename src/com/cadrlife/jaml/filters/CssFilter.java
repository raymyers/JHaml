package com.cadrlife.jaml.filters;

import com.cadrlife.jaml.JamlConfig;
import com.google.common.base.CharMatcher;


public class CssFilter extends Filter {

	public CssFilter(JamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return "<style type='text/css'>\n" + 
		"<!--\n" + 
		indent(CharMatcher.WHITESPACE.trimTrailingFrom(input), 2) + "\n" + 
		"-->\n" + 
		"</style>";
	}
}
