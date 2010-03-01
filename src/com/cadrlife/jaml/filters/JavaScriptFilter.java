package com.cadrlife.jaml.filters;

import com.cadrlife.jaml.JamlConfig;
import com.google.common.base.CharMatcher;


public class JavaScriptFilter extends Filter {

	public JavaScriptFilter(JamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return "<script type='text/javascript'>\n" + 
		"  //<![CDATA[\n" + 
		indent(CharMatcher.WHITESPACE.trimTrailingFrom(input), 4) + "\n" + 
		"  //]]>\n" + 
		"</script>";
	}
}
