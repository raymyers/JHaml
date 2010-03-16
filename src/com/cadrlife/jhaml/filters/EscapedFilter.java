package com.cadrlife.jhaml.filters;

import org.apache.commons.lang.StringEscapeUtils;

import com.cadrlife.jhaml.JHamlConfig;
import com.google.common.base.CharMatcher;

public class EscapedFilter extends Filter {

	public EscapedFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		String escaped = StringEscapeUtils.escapeHtml(input);
		return CharMatcher.WHITESPACE.trimTrailingFrom(indent(escaped,0));
	}
}
