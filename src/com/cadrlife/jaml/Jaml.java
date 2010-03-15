package com.cadrlife.jaml;

import java.util.ArrayList;
import java.util.List;

import com.cadrlife.jaml.util.IndentUtils;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;


public class Jaml {
	private final JamlParserWrapper jamlParserWrapper = new JamlParserWrapper();
	private Helper helper;
	private int indentationSize = -1;
	private boolean isIndentWithTabs = false;
	
	public Jaml() {
		helper = new Helper(new JamlConfig());
	}
	public Jaml(JamlConfig config) {
		helper = new Helper(config);
	}
	
	public String parse(String input) {
		indentationSize = -1;
		isIndentWithTabs = false;
		if (input.trim().isEmpty()) {
			return "";
		}
		input = sanitizeInput(input);
		try {
			List<Line> lines = jamlParserWrapper.parseJaml(input);
			List<Line> lineTree = processNesting(lines);
			return renderLines(lineTree).replaceAll("\n\n+", "\n").trim();
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	private String renderLines(List<Line> lineTree) {
		String result = "";
		for (Line line : lineTree) {
			result += renderLine(line) + "\n";
		}
		return result;
	}

	private List<Line> processNesting(List<Line> lines) {
		int indentSize = -1;
		List<Line> lineTree = new ArrayList<Line>();
		for (Line line : lines) {
			
			Line parentLine = parentLine(line, lineTree);
			if (parentLine != null) {
				if (indentSize == -1) {
					indentSize = line.leadingWhitespace.length() - parentLine.leadingWhitespace.length();
				}
				line.indentation = parentLine.indentation + "  ";
				if (parentLine.isFilter()) {
					line.isWithinFilter = true;
				}
				parentLine.block.add(line);
			} else {
				lineTree.add(line);
			}
		}
		return lineTree;
	}
	
	private Line parentLine(Line childLine, List<Line> lineTree) {
		Line lastLine = null;
		for (Line line : lineTree) {
			if (!line.isBlank() && !line.isWithinFilter) {
				lastLine = line;
			}
		}
		if (lastLine != null) {
			if (isDeeper(lastLine, childLine) || childLine.isBlank()) {
				if (childLine.isBlank() && !lastLine.canHaveNesting()) {
					return null;
				}
				Line innerParent = parentLine(childLine, lastLine.block);
				return innerParent == null ? lastLine : innerParent;
			}
		}
		return null;
	}

	private boolean isDeeper(Line previousLine, Line line) {
		return previousLine.leadingWhitespace.length() < line.leadingWhitespace.length();
	}

	private String renderLine(Line line) {
		for (Line nestedLine : line.block) {
			validateIndentation(line,nestedLine);
		}
		String nestedContent = renderLines(line.block);
		String content = line.inLineContent + (nestedContent.isEmpty() ? "" : "\n" + IndentUtils.indent(nestedContent,2));
		if (line.isElement()) {
			helper.errorChecker.setCurrentLineNumber(line.lineNumber);
			helper.mergeAttributes(line);
			String parsedContent = helper.parseFreeFormText(line, "", content);
			parsedContent = parsedContent.replaceAll("\\n+\\s*\\z", "\n");
			String element = helper.elem(line.text, line.tag, line.attrMap, parsedContent, line.isSelfClosing);
			return element;
		}
		if (line.isStatement() || line.isComment()) {
			if (line.hasNestedContent()) {
				return helper.parseFreeFormText(line, "",line.inLineContent + "\n" + IndentUtils.indent(renderLines(line.block),2));
			}
			return helper.parseFreeFormText(line, "",line.inLineContent);
		}
		
		String textBlock = textBlock(line);
		return helper.parseFreeFormText(line, "", textBlock);
	}

	private String textBlock(Line line) {
		String result = line.text.substring(line.leadingWhitespace.length());
		List<String> content = new ArrayList<String>();
		for (Line contentLine : line.block) {
			content.add(contentLine.leadingWhitespace + textBlock(contentLine));
		}
		return result + (content.isEmpty() ? "" : "\n") + Joiner.on("\n").join(content);
	}

	private String sanitizeInput(String input) {
		return input.replaceAll("\r\n", "\n").replaceAll("\n\r", "\n").replaceAll("\r", "\n") + "\n";
	}
	
	public void validateIndentation(Line parentLine, Line line) {
		int parentIndent = parentLine.indentation.length();
		this.helper.errorChecker.setCurrentLineNumber(line.lineNumber);
		line.indentation = line.leadingWhitespace;
		if (line.indentation.isEmpty() || line.isBlank()) {
			return;
		}
		if (indentationSize == -1 && !line.indentation.isEmpty()) {
			indentationSize = line.indentation.length();
			isIndentWithTabs =  CharMatcher.is('\t').matchesAllOf(line.indentation);
			this.helper.errorChecker.checkInitialIndentation(line.indentation);
		}
		String effectiveIndentation = line.indentation;
		int nextLevel = parentIndent + indentationSize;
		if (parentLine.isFilter() && line.indentation.length() > nextLevel) {
			effectiveIndentation = line.indentation.substring(0, nextLevel);
		}
		this.helper.errorChecker.checkIndentationIsConsistent(indentationSize,isIndentWithTabs,parentIndent,line.indentation,effectiveIndentation);
	}
}