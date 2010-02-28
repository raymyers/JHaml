package com.cadrlife.jaml;

public abstract class Filter {
	protected final JamlConfig config;

	public Filter(JamlConfig config) {
		this.config = config;
	}
	
	public abstract String process(String input);
}
