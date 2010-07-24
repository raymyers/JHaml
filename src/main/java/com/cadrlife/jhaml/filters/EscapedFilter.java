package com.cadrlife.jhaml.filters;

import org.apache.commons.lang.StringEscapeUtils;

import com.cadrlife.jhaml.JHamlConfig;

public class EscapedFilter extends Filter {

	public EscapedFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return trimEnd(indent(StringEscapeUtils.escapeHtml(input),0));
	}
}
