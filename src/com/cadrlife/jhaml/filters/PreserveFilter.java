package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;

public class PreserveFilter extends Filter {

	public PreserveFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		String normalizedInput = trimEnd(indent(input,-JHamlConfig.OUTPUT_INDENTATION_SIZE));
		return normalizedInput.replaceAll("\n", "&#x000A;");
	}

}
