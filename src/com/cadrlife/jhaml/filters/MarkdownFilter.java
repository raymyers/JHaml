package com.cadrlife.jhaml.filters;

import com.cadrlife.jhaml.JHamlConfig;
import com.petebevin.markdown.MarkdownProcessor;

public class MarkdownFilter extends Filter {

	private MarkdownProcessor markdownProcessor = new MarkdownProcessor();

	public MarkdownFilter(JHamlConfig config) {
		super(config);
	}

	@Override
	public String process(String input) {
		return markdownProcessor.markdown(input);
	}

}
