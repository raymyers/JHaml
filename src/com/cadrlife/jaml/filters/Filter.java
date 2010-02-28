package com.cadrlife.jaml.filters;

import com.cadrlife.jaml.JamlConfig;

public abstract class Filter {
	protected final JamlConfig config;

	public Filter(JamlConfig config) {
		this.config = config;
	}
	
	public abstract String process(String input);
}
