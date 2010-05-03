package com.cadrlife.jhaml;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.charset.Charset;

import org.junit.Test;

import com.cadrlife.jhaml.internal.com.google.common.io.Resources;

public class WholeDocumentTest {
	private JHaml jhaml = new JHaml();
	
	@Test
	public void hamlTryDocument() throws IOException {
		String hamlFile = "haml.try.haml";
		String htmlFile = "haml.try.html";
		String haml = read(hamlFile);
		String html = read(htmlFile).replaceAll("\r\n", "\n");
		assertEquals(html, jhaml.parse(haml));
	}
	
	private String read(String hamlFile) throws IOException {
		return Resources.toString(Resources.getResource(this.getClass(), hamlFile), Charset.defaultCharset());
	}
}
