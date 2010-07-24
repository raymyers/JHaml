package com.cadrlife.jhaml;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.cadrlife.jhaml.internal.JHamlParseException;
import com.google.common.base.CharMatcher;

public class ErrorMessagesTest {
	
	private JHamlConfig config;
	
	@Before
	public void setup() {
		config = new JHamlConfig();
	}
	@Test
	public void errorMessages() {
		assertInputThrows("!!!\n  a", "Illegal nesting: nesting within a header command is illegal.");
		assertInputThrows("a\n  b", "Illegal nesting: nesting within plain text is illegal.");
		assertInputThrows("/ a\n  b", "Illegal nesting: nesting within a tag that already has content is illegal.");
		assertInputThrows("% a", "Invalid tag: \"% a\".");
		assertInputThrows("%p a\n  b", "Illegal nesting: content can't be both given on the same line as %p and nested within it.");
		assertInputThrows("%p=", "There's no Java code for = to evaluate.");
//		assertInputThrows("%p~", "There's no Ruby code for ~ to evaluate.");
//		assertInputThrows("~", "There's no Ruby code for ~ to evaluate.");
		assertInputThrows("=", "There's no Java code for = to evaluate.");
		assertInputThrows("%p/\n  a", "Illegal nesting: nesting within a self-closing tag is illegal.");
		assertInputThrows(":a\n  b", "Filter \"a\" is not defined.", 1);
		assertInputThrows(":a= b", "Invalid filter name \":a= b\".");
		assertInputThrows(".", "Illegal element: classes and ids must have values.");
		assertInputThrows(".#", "Illegal element: classes and ids must have values.");
		assertInputThrows(".{} a", "Illegal element: classes and ids must have values.");
//		assertInputThrows(".() a", "Illegal element: classes and ids must have values.");
		assertInputThrows(".= a", "Illegal element: classes and ids must have values.");
		assertInputThrows("%p..a", "Illegal element: classes and ids must have values.");
		assertInputThrows("%a/ b", "Self-closing tags can't have content.");
		assertInputThrows("%p{:a => 'b',\n:c => 'd'}/ e", "Self-closing tags can't have content.", 2);
		assertInputThrows("%p{:a => 'b',\n:c => 'd'}=", "There's no Java code for = to evaluate.", 2);
		assertInputThrows("%p.{:a => 'b',\n:c => 'd'} e", "Illegal element: classes and ids must have values.", 1);
		assertInputThrows("%p{:a => 'b',\n:c => 'd',\n:e => 'f'}\n%p/ a", "Self-closing tags can't have content.", 4);
//		assertInputThrows("%p{:a => 'b',\n:c => 'd',\n:e => 'f'}\n- raise 'foo'", "foo", 4);
//		assertInputThrows("%p{:a => 'b',\n:c => raise('foo'),\n:e => 'f'}", "foo", 2);
//		assertInputThrows("%p{:a => 'b',\n:c => 'd',\n:e => raise('foo')}", "foo", 3);
		assertInputThrows(" %p foo", "Indenting at the beginning of the document is illegal.");
		assertInputThrows("  %p foo", "Indenting at the beginning of the document is illegal.");
		/*    "- end", <<MESSAGE.rstrip,
		You don't need to use "- end" in Haml. Un-indent to close a block:
		- if foo?
		  %strong Foo!
		- else
		  Not foo.
		%p This line is un-indented, so it isn't part of the "if" block
		MESSAGE
		*/
		assertInputThrows(" \n\t\n %p foo", "Indenting at the beginning of the document is illegal.", 3);
		assertInputThrows("\n\n %p foo", "Indenting at the beginning of the document is illegal.", 3);
		assertInputThrows("%p\n  foo\n foo", "Inconsistent indentation: 1 space was used for indentation, but the rest of the document was indented using 2 spaces.", 3);
		assertInputThrows("%p\n  foo\n%p\n foo", "Inconsistent indentation: 1 space was used for indentation, but the rest of the document was indented using 2 spaces.", 4);
		assertInputThrows("%p\n\t\tfoo\n\tfoo", "Inconsistent indentation: 1 tab was used for indentation, but the rest of the document was indented using 2 tabs.", 3);
		assertInputThrows("%p\n  foo\n   foo", "Inconsistent indentation: 3 spaces were used for indentation, but the rest of the document was indented using 2 spaces.", 3);
		assertInputThrows("%p\n  foo\n  %p\n   bar", "Inconsistent indentation: 3 spaces were used for indentation, but the rest of the document was indented using 2 spaces.", 4);
		assertInputThrows("%p\n  :plain\n     bar\n   \t  baz", "Inconsistent indentation: \"   \\t  \" was used for indentation, but the rest of the document was indented using 2 spaces.", 4);
		assertInputThrows("%p\n  foo\n%p\n    bar", "The line was indented 2 levels deeper than the previous line.", 4);
		assertInputThrows("%p\n  foo\n  %p\n        bar", "The line was indented 3 levels deeper than the previous line.", 4);
		assertInputThrows("%p\n \tfoo", "Indentation can't use both tabs and spaces.", 2);
		/*  "%p(", "Invalid attribute list: \"(\".",
		    "%p(foo=\nbar)", "Invalid attribute list: \"(foo=\".", 1,
		    "%p(foo=)", "Invalid attribute list: \"(foo=)\".",
		    "%p(foo 'bar')", "Invalid attribute list: \"(foo 'bar')\".",
		    "%p(foo 'bar'\nbaz='bang')", "Invalid attribute list: \"(foo 'bar'\".", 1,
		    "%p(foo='bar'\nbaz 'bang'\nbip='bop')", "Invalid attribute list: \"(foo='bar' baz 'bang'\".", 2,
		    "%p{:foo => 'bar' :bar => 'baz'}", :compile,
		    "%p{:foo => }", :compile,
		    "%p{=> 'bar'}", :compile,
		    "%p{:foo => 'bar}", :compile,
		    "%p{'foo => 'bar'}", :compile,
		    "%p{:foo => 'bar\"}", :compile,
		 
		    # Regression tests
		    "- raise 'foo'\n\n\n\nbar", "foo", 1,
		    "= 'foo'\n-raise 'foo'", "foo", 2,
		    "\n\n\n- raise 'foo'", "foo", 4,
		    "%p foo |\n   bar |\n   baz |\nbop\n- raise 'foo'", "foo", 5,
		    "foo\n\n\n  bar", "Illegal nesting: nesting within plain text is illegal.", 4,
		    "%p/\n\n  bar", "Illegal nesting: nesting within a self-closing tag is illegal.", 3,
		    "%p foo\n\n  bar", "Illegal nesting: content can't be both given on the same line as %p and nested within it.", 3,
		    "/ foo\n\n  bar", "Illegal nesting: nesting within a tag that already has content is illegal.", 3,
		    "!!!\n\n  bar", "Illegal nesting: nesting within a header command is illegal.", 3,
		    "foo\n:ruby\n  1\n  2\n  3\n- raise 'foo'", "foo", 6,
		    "foo\n:erb\n  1\n  2\n  3\n- raise 'foo'", "foo", 6,
		    "= raise 'foo'\nfoo\nbar\nbaz\nbang", "foo", 1,*/
	}
	
	@Test
	public void badOutputOption() {
		config.format = "html1";
		assertInputThrows("%br", "Invalid output format: html1", 0);
	}
	
	private void assertInputThrows(String input, String message) {
		assertInputThrows(input, message, lastLineNumber(input));
	}
	private int lastLineNumber(String input) {
		return CharMatcher.anyOf("\n").countIn(input)+1;
	}
	private void assertInputThrows(String input, String message, int line) {
		try {
			String output = new JHaml(config).parse(input);
			fail("No exception thrown, expected: " + message + "\nOutput:\n" + output);
		} catch (JHamlParseException e) {
			assertEquals(message, e.getMessage().replaceFirst("Line \\d+: ", ""));
			assertEquals(line, e.getLineNumber());
		}
	}
}
