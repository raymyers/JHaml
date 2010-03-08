package com.cadrlife.jaml;

import java.util.List;

import com.cadrlife.jaml.util.IndentUtils;

public class JamlErrorChecker {
	private static final String THERE_S_NO_JAVA_CODE_FOR_OPERATION_TO_EVALUATE = "There's no Java code for %s to evaluate.";
	private static final String ILLEGAL_NESTING_CONTENT_CAN_T_BE_BOTH_GIVEN_ON_THE_SAME_LINE_AND_NESTED_WITHIN_IT = "Illegal nesting: content can't be both given on the same line as %%%s and nested within it.";
	private static final String INVALID_TAG = "Invalid tag: \"%s\".";
	private static final String ILLEGAL_NESTING_NESTING_WITHIN_A_TAG_THAT_ALREADY_HAS_CONTENT_IS_ILLEGAL = "Illegal nesting: nesting within a tag that already has content is illegal.";
	private static final String ILLEGAL_NESTING_NESTING_WITHIN_PLAIN_TEXT_IS_ILLEGAL = "Illegal nesting: nesting within plain text is illegal.";
	private static final String ILLEGAL_NESTING_NESTING_WITHIN_A_HEADER_COMMAND_IS_ILLEGAL = "Illegal nesting: nesting within a header command is illegal.";
	private static final String ILLEGAL_ELEMENT_CLASSES_AND_IDS_MUST_HAVE_VALUES = "Illegal element: classes and ids must have values.";
	public void checkHeaderHasNoNestedContent(String header) {
		if (header.contains("\n")) {
			throw new JamlParseException(ILLEGAL_NESTING_NESTING_WITHIN_A_HEADER_COMMAND_IS_ILLEGAL);
		}
	}
	public void checkForNullClassesAndIds(List<String> classes,
			List<String> ids) {
		if (classes.contains(null) || ids.contains(null)) {
			throw new JamlParseException(ILLEGAL_ELEMENT_CLASSES_AND_IDS_MUST_HAVE_VALUES);
		}
		
	}
	public void checkNoNestingWithinContent(String currentElementType, String text) {
		if (IndentUtils.containsNesting(text)) {
			if (null == currentElementType) {
				throw new JamlParseException(ILLEGAL_NESTING_NESTING_WITHIN_PLAIN_TEXT_IS_ILLEGAL);
			} else {
				throw new JamlParseException(String.format(ILLEGAL_NESTING_CONTENT_CAN_T_BE_BOTH_GIVEN_ON_THE_SAME_LINE_AND_NESTED_WITHIN_IT,currentElementType));
			}
		}
	}
	public void checkNoNestingWithContentOnFirstLine(String text) {
		if (IndentUtils.hasContentOnFirstLine(text) && IndentUtils.containsNesting(text)) {
			throw new JamlParseException(ILLEGAL_NESTING_NESTING_WITHIN_A_TAG_THAT_ALREADY_HAS_CONTENT_IS_ILLEGAL);
		}
	}
	
	public void checkElementHasLegalTag(String tag, String el) {
		if (null == el) {
			throw new JamlParseException(String.format(INVALID_TAG,tag.trim()));
		}
	}
	public void checkJavaCodeIsNotEmpty(String operation, String code) {
		if (code.trim().isEmpty()) {
			throw new JamlParseException(String.format(THERE_S_NO_JAVA_CODE_FOR_OPERATION_TO_EVALUATE,operation));
		}
	}
	public void checkContentOfSelfClosingTags(String content) {
		if (!content.trim().isEmpty()) {
			throw new JamlParseException("Illegal nesting: nesting within a self-closing tag is illegal.");
		}
	}
}
