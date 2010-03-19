package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;


public class CssFilter extends Filter {

	public CssFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return "<style type='text/css'>\n" + 
		"<!--\n" + 
		indent(trimEnd(input), JHamlConfig.OUTPUT_INDENTATION_SIZE) + "\n" + 
		"-->\n" + 
		"</style>";
	}
}
