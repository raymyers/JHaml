package com.cadrlife.jaml;

import org.apache.commons.lang.StringUtils;


public class JavaScriptFilter extends Filter {

	public JavaScriptFilter(JamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return "<script type='text/javascript'>\n" + 
		"  //<![CDATA[\n" + 
		indent(StringUtils.chomp(input)) + "\n" + 
		"  //]]>\n" + 
		"</script>";
	}
	
	public String indent(String text) {
		return "  " + text.replaceAll("\n", "\n  "); 
	}

}
