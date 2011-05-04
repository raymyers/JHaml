package com.cadrlife.jhaml;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlankLinesTest {
	private JHaml jhaml = new JHaml();
	
	@Test
	public void emptyLine() {
		String haml =
			"%head\n" +
			"  %title A title\n" +
			"\n" +
			"%body\n";
		
		String html =
			"<head>\n" +
			"  <title>A title</title>\n" +
			"</head>\n" +
				"<body>\n" +
			"</body>";
		
		assertEquals(html, jhaml.parse(haml));
	}
}