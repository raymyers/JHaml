package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;

public class PlainFilter extends Filter {

	public PlainFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return input;
	}
}
