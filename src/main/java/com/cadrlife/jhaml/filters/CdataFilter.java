package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;

public class CdataFilter extends Filter {

	public CdataFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return "<![CDATA[\n" + trimEnd(indent(input,JHamlConfig.OUTPUT_INDENTATION_SIZE))
				+ "\n]]>";
	}

}


