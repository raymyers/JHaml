package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;

public class JspFilter extends Filter {

	public JspFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return new PlainFilter(config).process(input);
	}

}
