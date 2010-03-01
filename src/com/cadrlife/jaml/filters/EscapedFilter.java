package com.cadrlife.jaml.filters;

import org.apache.commons.lang.StringEscapeUtils;

import com.cadrlife.jaml.JamlConfig;
import com.google.common.base.CharMatcher;

public class EscapedFilter extends Filter {

	public EscapedFilter(JamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		String escaped = StringEscapeUtils.escapeHtml(input);
		return CharMatcher.WHITESPACE.trimTrailingFrom(indent(escaped,0));
	}
}
