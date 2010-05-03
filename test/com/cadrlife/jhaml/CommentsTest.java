package com.cadrlife.jhaml;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CommentsTest {
	private JHaml jhaml = new JHaml();

	@Test
	public void singleLineComments() {
		assertEquals("<!-- %a -->\n<p></p>", jhaml.parse("/%a\n%p"));
		assertEquals("<!--\n-->\n<p></p>", jhaml.parse("/\n%p"));
		assertEquals("<p></p>\n<!-- %a -->\n<p></p>", jhaml.parse("%p\n/%a\n%p"));
		assertEquals("<p></p>\n<!--\n-->\n<p></p>", jhaml.parse("%p\n/\n%p"));
	}

	@Test
	public void multiLineComments() {
		String haml = 
			"/\n" +
			"  %p This doesn't render...\n" + 
			"  %div\n" + 
			"    %h1 Because it's commented out!";
		String html = 
			"<!--\n" +
			"  <p>This doesn't render...</p>\n" +
			"  <div>\n" + 
			"    <h1>Because it's commented out!</h1>\n" + 
			"  </div>\n"+
			"-->";
		assertEquals(html, jhaml.parse(haml));
	}
	
	@Test
	public void ieConditionalComments() {
		String haml = 
			"/[if IE]\n" +
			"  %a{ :href => \"http://www.mozilla.com/en-US/firefox/\" }\n" + 
			"    %h1 Get Firefox";
		String html = 
			"<!--[if IE]>\n" +
			"  <a href='http://www.mozilla.com/en-US/firefox/'>\n" +
			"    <h1>Get Firefox</h1>\n" + 
			"  </a>\n" +
			"<![endif]-->";
		assertEquals(html, jhaml.parse(haml));
	}
}
