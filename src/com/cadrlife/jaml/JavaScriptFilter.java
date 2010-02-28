package com.cadrlife.jaml;

import com.google.common.base.CharMatcher;


public class JavaScriptFilter extends Filter {

	public JavaScriptFilter(JamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return "<script type='text/javascript'>\n" + 
		"  //<![CDATA[\n" + 
		indent(CharMatcher.WHITESPACE.trimTrailingFrom(input)) + "\n" + 
		"  //]]>\n" + 
		"</script>";
	}
	
	public String indent(String text) {
		return "  " + text.replaceAll("\n", "\n  "); 
	}

}
