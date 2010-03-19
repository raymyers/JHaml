package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;


public class JavaScriptFilter extends Filter {

	public JavaScriptFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return "<script type='text/javascript'>\n" + 
		"  //<![CDATA[\n" + 
		indent(trimEnd(input), 4) + "\n" + 
		"  //]]>\n" + 
		"</script>";
	}
}
