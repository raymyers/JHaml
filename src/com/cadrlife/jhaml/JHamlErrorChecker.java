package com.cadrlife.jhaml;

import java.util.List;

import com.cadrlife.jhaml.util.IndentUtils;
import com.google.common.base.CharMatcher;

public class JHamlErrorChecker {
	private static final String INVALID_OUTPUT_FORMAT = "Invalid output format: %s";
	private static final String INDENTATION_CAN_T_USE_BOTH_TABS_AND_SPACES = "Indentation can't use both tabs and spaces.";
	private static final String THE_LINE_WAS_INDENTED_DEEPER_THAN_THE_PREVIOUS_LINE = "The line was indented %d levels deeper than the previous line.";
	private static final String INCONSISTENT_INDENTATION = "Inconsistent indentation: %s %s used for indentation, but the rest of the document was indented using %s.";
	private static final String INDENTING_AT_THE_BEGINNING_OF_THE_DOCUMENT_IS_ILLEGAL = "Indenting at the beginning of the document is illegal.";
	private static final String SELF_CLOSING_TAGS_CAN_T_HAVE_CONTENT = "Self-closing tags can't have content.";
	private static final String INVALID_FILTER_NAME = "Invalid filter name \":%s\".";
	private static final String FILTER_IS_NOT_DEFINED = "Filter \"%s\" is not defined.";
	private static final String ILLEGAL_NESTING_NESTING_WITHIN_A_SELF_CLOSING_TAG_IS_ILLEGAL = "Illegal nesting: nesting within a self-closing tag is illegal.";
	private static final String THERE_S_NO_JAVA_CODE_FOR_OPERATION_TO_EVALUATE = "There's no Java code for %s to evaluate.";
	private static final String ILLEGAL_NESTING_CONTENT_CAN_T_BE_BOTH_GIVEN_ON_THE_SAME_LINE_AND_NESTED_WITHIN_IT = "Illegal nesting: content can't be both given on the same line as %%%s and nested within it.";
	private static final String INVALID_TAG = "Invalid tag: \"%s\".";
	private static final String ILLEGAL_NESTING_NESTING_WITHIN_A_TAG_THAT_ALREADY_HAS_CONTENT_IS_ILLEGAL = "Illegal nesting: nesting within a tag that already has content is illegal.";
	private static final String ILLEGAL_NESTING_NESTING_WITHIN_PLAIN_TEXT_IS_ILLEGAL = "Illegal nesting: nesting within plain text is illegal.";
	private static final String ILLEGAL_NESTING_NESTING_WITHIN_A_HEADER_COMMAND_IS_ILLEGAL = "Illegal nesting: nesting within a header command is illegal.";
	private static final String ILLEGAL_ELEMENT_CLASSES_AND_IDS_MUST_HAVE_VALUES = "Illegal element: classes and ids must have values.";
	private int lineNumber = -1;
	public JHamlErrorChecker() {
	}
	public void checkHeaderHasNoNestedContent(Line line, String header) {
		if (header.contains("\n")) {
			this.lineNumber++;
			throwError(ILLEGAL_NESTING_NESTING_WITHIN_A_HEADER_COMMAND_IS_ILLEGAL);
		}
	}
	private void throwError(int lineNumber, String message) {
		throw new JHamlParseException(message, lineNumber);
	}
	
	private void throwError(String message) {
		throwError(getCurrentLineNumber(), message);
	}
	public void checkForNullClassesAndIds(List<String> classes,
			List<String> ids) {
		if (classes.contains(null)) {
			throwError(getCurrentLineNumber(), ILLEGAL_ELEMENT_CLASSES_AND_IDS_MUST_HAVE_VALUES);
		}
		if (ids.contains(null)) {
			throwError(getCurrentLineNumber(), ILLEGAL_ELEMENT_CLASSES_AND_IDS_MUST_HAVE_VALUES);
		}
		
	}
	public void checkNoNestingWithinContent(Line line) {
		if (line.hasNestedContent() && line.hasInLineContent() && !line.isFilter()) {
			this.setCurrentLineNumber(line.block.get(0).lineNumber);
			if (line.isElement()) {
				throwError(String.format(ILLEGAL_NESTING_CONTENT_CAN_T_BE_BOTH_GIVEN_ON_THE_SAME_LINE_AND_NESTED_WITHIN_IT,line.tag));
			} else {
				throwError(ILLEGAL_NESTING_NESTING_WITHIN_PLAIN_TEXT_IS_ILLEGAL);
			}
		}
	}
	public void setCurrentLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public void checkNoNestingWithContentOnFirstLine(String text) {
		if (IndentUtils.hasContentOnFirstLine(text) && IndentUtils.containsNesting(text)) {
			this.lineNumber++;
			throwError(ILLEGAL_NESTING_NESTING_WITHIN_A_TAG_THAT_ALREADY_HAS_CONTENT_IS_ILLEGAL);
		}
	}
	
	public void checkElementHasLegalTag(String tag, String el) {
		if (null == el) {
			throwError(String.format(INVALID_TAG,tag.trim()));
		}
	}
	public void checkJavaCodeIsNotEmpty(String lineText, String operation, String code) {
		if (code.trim().isEmpty()) {
			advanceBeyondElementDeclaration(lineText);
			throwError(String.format(THERE_S_NO_JAVA_CODE_FOR_OPERATION_TO_EVALUATE,operation));
		}
	}
	public void checkContentOfSelfClosingTags(String lineText, String content) {
		advanceBeyondElementDeclaration(lineText);
		if (!content.trim().isEmpty()) {
			if (content.contains("\n")) {
				this.lineNumber++;
				throwError(ILLEGAL_NESTING_NESTING_WITHIN_A_SELF_CLOSING_TAG_IS_ILLEGAL);
			}
			throwError(SELF_CLOSING_TAGS_CAN_T_HAVE_CONTENT);
		}
	}
	private void advanceBeyondElementDeclaration(String lineText) {
		int newlinesInElementDeclaration = CharMatcher.is('\n').countIn(lineText);
		this.lineNumber += newlinesInElementDeclaration;
	}
	public void checkFilterIsDefined(JHamlConfig config, String filter, String content) {
		if (!config.filters.containsKey(filter)) {
			int contentLines = CharMatcher.is('\n').countIn(content);
			if (filter.contains(" ")) {
				throwError(getCurrentLineNumber()-contentLines, String.format(INVALID_FILTER_NAME,filter));
			}
			throwError(getCurrentLineNumber()-contentLines, String.format(FILTER_IS_NOT_DEFINED,filter));
		}
	}
	private int getCurrentLineNumber() {
		return this.lineNumber;
	}
	public void checkDocumentDoesNotBeginWithIndentation(String input) {
		int lineNumber = 1;
		for (String line : input.split("\n")) {
			if (!line.trim().isEmpty()) {
				if (line.startsWith(" ") || line.startsWith("\t")) {
					throwError(lineNumber, INDENTING_AT_THE_BEGINNING_OF_THE_DOCUMENT_IS_ILLEGAL);
				}
				return;
			}
			lineNumber++;
		}
	}
	public void checkIndentationIsConsistent(int indentationSize,
			boolean isIndentWithTabs, int currentIndentation, String actualIndentation, String effectiveIndentation) {
		if (effectiveIndentation.isEmpty()) {
			return;
		}
		boolean indentationIsInvalidLength = effectiveIndentation.length() % indentationSize != 0;
		int indentationLevels = (effectiveIndentation.length() - currentIndentation) / indentationSize;
		boolean isAllTabs = CharMatcher.is('\t').matchesAllOf(effectiveIndentation);
		boolean isAllSpaces = CharMatcher.is(' ').matchesAllOf(effectiveIndentation);
		boolean indentationIsWrongType = isIndentWithTabs != isAllTabs;
		boolean indentationIsMixed = !(isAllTabs || isAllSpaces);
		if (indentationIsInvalidLength || indentationIsWrongType || indentationIsMixed) {
			String indentationDescription = IndentUtils.describe(actualIndentation);
			String wasOrWere = indentationDescription.endsWith("s") ? "were" : "was";
			throwError(getCurrentLineNumber(),String.format(INCONSISTENT_INDENTATION,indentationDescription,wasOrWere, IndentUtils.describe(isIndentWithTabs,indentationSize)));
		}
		if (indentationLevels > 1) {
			throwError(getCurrentLineNumber(), String.format(THE_LINE_WAS_INDENTED_DEEPER_THAN_THE_PREVIOUS_LINE,indentationLevels));
		}
	}
	public void checkInitialIndentation(String indentation) {
		boolean isAllTabs = CharMatcher.is('\t').matchesAllOf(indentation);
		boolean isAllSpaces = CharMatcher.is(' ').matchesAllOf(indentation);
		if (!(isAllTabs || isAllSpaces)) {
			throwError(getCurrentLineNumber(),INDENTATION_CAN_T_USE_BOTH_TABS_AND_SPACES);
		}
	}
	public void validateConfig(JHamlConfig config) {
		if (!JHamlConfig.validFormats.contains(config.format)) {
			throwError(0,String.format(INVALID_OUTPUT_FORMAT,config.format));
		}
	}
}
