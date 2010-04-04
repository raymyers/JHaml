package com.cadrlife.jhaml;

import java.io.LineNumberReader;
import java.io.StringReader;
import java.util.List;

public class JHamlParserWrapper {
	public List<Line> parseJhaml(String input, JHamlConfig config) throws JHamlParseException {
		JHamlReader reader = new JHamlReader(new LineNumberReader(new StringReader(input)));
		return new JHamlParser(reader).jHamlSource();
	}
	public List<Line> parseJhaml(String input) throws JHamlParseException {
		return parseJhaml(input, new JHamlConfig());
	}
}