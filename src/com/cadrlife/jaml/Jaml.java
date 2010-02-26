package com.cadrlife.jaml;


@SuppressWarnings("deprecation")
public class Jaml {
	private final JamlParserWrapper jamlParserWrapper = new JamlParserWrapper();

	public String parse(String input) {
		if (input.trim().isEmpty()) {
			return "";
		}
		input = sanitizeInput(input);
		try {
			String output = jamlParserWrapper.parseJaml(input).rendering;
			return output.replaceAll("\n\n+", "\n").trim();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	private String sanitizeInput(String input) {
		return input.replaceAll("\r\n", "\n").replaceAll("\r", "\n") + "\n";
	}
}