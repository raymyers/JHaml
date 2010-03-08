package com.cadrlife.jaml.filters;

import com.cadrlife.jaml.JamlConfig;
import com.cadrlife.jaml.util.IndentUtils;

public abstract class Filter {
	protected final JamlConfig config;

	public Filter(JamlConfig config) {
		this.config = config;
	}
	
	public abstract String process(String input);
	
	public String indent(String text, int amount) {
		return IndentUtils.indent(text, amount);
	}

}
