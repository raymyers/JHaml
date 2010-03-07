package com.cadrlife.jaml;

import java.util.List;

public class JamlErrorChecker {
	public static final String ILLEGAL_NESTING_NESTING_WITHIN_A_HEADER_COMMAND_IS_ILLEGAL = "Illegal nesting: nesting within a header command is illegal.";
	public static final String ILLEGAL_ELEMENT_CLASSES_AND_IDS_MUST_HAVE_VALUES = "Illegal element: classes and ids must have values.";
	public void checkHeaderHasNoNestedContent(String header) {
		if (header.contains("\n")) {
			throw new JamlParseException(ILLEGAL_NESTING_NESTING_WITHIN_A_HEADER_COMMAND_IS_ILLEGAL);
		}
	}
	public void checkForNullClassesAndIds(List<String> classes,
			List<String> ids) {
		if (classes.contains(null) || ids.contains(null)) {
			throw new JamlParseException(JamlErrorChecker.ILLEGAL_ELEMENT_CLASSES_AND_IDS_MUST_HAVE_VALUES);
		}
		
	}
	public void checkNoNestingWithinPlainText(String text) {
		
	}
}
