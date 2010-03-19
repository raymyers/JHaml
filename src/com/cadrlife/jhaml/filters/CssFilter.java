package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;
import com.google.common.base.CharMatcher;


public class CssFilter extends Filter {

	public CssFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return "<style type='text/css'>\n" + 
		"<!--\n" + 
		indent(CharMatcher.WHITESPACE.trimTrailingFrom(input), JHamlConfig.OUTPUT_INDENTATION_SIZE) + "\n" + 
		"-->\n" + 
		"</style>";
	}
}
