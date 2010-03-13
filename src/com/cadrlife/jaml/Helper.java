package com.cadrlife.jaml;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringEscapeUtils;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;


public class Helper {
	private final JamlConfig config;
	final JamlErrorChecker errorChecker;

	public Helper(JamlConfig config) {
		this.config = config;
		errorChecker = new JamlErrorChecker();
	}
	
	public String elem(String tag, String el, Map<String,String> attribMap, String content, boolean selfClosing) {
		content = content == null ? "" : content;
		errorChecker.checkElementHasLegalTag(tag, el);
		boolean autoClose = config.autoclose.contains(el) && content.isEmpty();
		if (selfClosing || autoClose) {
			errorChecker.checkContentOfSelfClosingTags(tag, content);
			return "<" + el + attribs(attribMap) + " />";
		}
		return "<" + el + attribs(attribMap) + ">" + content + "</" + el + ">";
	}
	
	public String attribs(String...s) {
		String result = "";
		for (int i=0; i<s.length; i+=2) {
			String attr = s[i];
			String value = s[i+1];
			result += " " + attr + "=" + "'" + value + "'"; 
		}
		return result;
	}
	
	public String attribs(Map<String, String> attribMap) {
		String result = "";
		if (null != attribMap) {
			for (Entry<String, String> e : attribMap.entrySet()) {
				String attr = e.getKey();
				String value = e.getValue();
				result += " " + attr + "=" + "'" + value + "'"; 
			}
		}
		return result;
	}
	
	public String parseStringLiteral(String lit) {
		return StringEscapeUtils.unescapeJava(lit.substring(1, lit.length()-1));
	}
	
	public String parseIntegerLiteral(String lit) {
		lit = lit.replaceAll("(l|L)$", "");
		if (lit.startsWith("0x") || lit.startsWith("0X")) {
			return Long.toString(Long.parseLong(lit.substring(2),16));
		}
		if (lit.startsWith("0")) {
			return Long.toString(Long.parseLong(lit,8));
		}
		return Long.toString(Long.parseLong(lit));
	}
	
	public String indent(String text) {
		return "  " + text.replaceAll("\n", "\n  "); 
	}
	public String stripTrailingNewline(String text) {
		return text.replaceFirst("\n$", ""); 
	}

	public String parseFloatLiteral(String lit) {
		return Double.toString(Double.parseDouble(lit));
	}

	public String parseCharLiteral(String lit) {
		return parseStringLiteral(lit);
	}

	public String parseLongLiteral(String lit) {
		return parseIntegerLiteral(lit.substring(0, lit.length()-1));
	}

	public String parseDoubleLiteral(String lit) {
		return Double.toString(Double.parseDouble(lit));
	}

	public String jspExpression(String lineText, String code) {
		errorChecker.checkJavaCodeIsNotEmpty(lineText, "=",code);
		return "<%= " + code + " %>";
	}
	
	public String jspScriptlet(String code) {
		boolean isMultiLine = code.contains("\n") || code.contains("\r");
		if (code.startsWith("if") && isMultiLine) {
			return ifBlock(code);
		}
		if (code.startsWith("while") && isMultiLine) {
			return whileLoop(code);
		}
		if (code.startsWith("for") && isMultiLine) {
			return forLoop(code);
		}
		return "<% " + code + " %>";
	}

	public String parseFreeFormText(Line line, String currentElementType, String text) {
		this.errorChecker.setCurrentLineNumber(line.lineNumber);
		if (text.startsWith("!!!")) {
			return header(line, text);
		}
		if (text.startsWith("=")) {
			return jspExpression(line.text, text.substring(1).trim());
		}
		if (text.startsWith("-")) {
			return jspScriptlet(text.substring(1).trim());
		}
		if (text.startsWith("/[if") && text.contains("]")) {
			return ieConditionalComment(text.substring(1));
		}
		if (text.startsWith("/")) {
			return htmlComment(text.substring(1));
		}
		if (text.startsWith(":")) {
			return filter(text.substring(1));
		}
		errorChecker.checkNoNestingWithinContent(line);
		return CharMatcher.is(' ').trimTrailingFrom(text);
	}

	private String header(Line line, String header) {
		errorChecker.checkHeaderHasNoNestedContent(line, header);
		return "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
	}

	private String filter(String text) {
		String filter = text;
		String remainingLines = "";
		if (text.contains("\n")) {
			filter = text.substring(0,text.indexOf("\n"));
			remainingLines =  text.substring(text.indexOf("\n")+1);
		}
		errorChecker.checkFilterIsDefined(config, filter, remainingLines);
		return config.filters.get(filter).process(remainingLines);
	}

	private String ifBlock(String string) {
		String condition = string.substring(string.indexOf("if")+2, string.indexOf("\n")).trim();
		if (!condition.startsWith("(")) {
			condition = "(" + condition + ")";
		}
		String remainingLines = string.substring(string.indexOf("\n"));
		return "<% if " + condition + " { %>" + remainingLines + "\n<% } %>";
	}
	
	private String whileLoop(String string) {
		String condition = string.substring(string.indexOf("while")+5, string.indexOf("\n")).trim();
		if (!condition.startsWith("(")) {
			condition = "(" + condition + ")";
		}
		String remainingLines = string.substring(string.indexOf("\n"));
		return "<% while " + condition + " { %>" + remainingLines + "\n<% } %>";
	}
	
	private String forLoop(String string) {
		String condition = string.substring(string.indexOf("for")+3, string.indexOf("\n")).trim();
		if (!condition.startsWith("(")) {
			condition = "(" + condition + ")";
		}
		String remainingLines = string.substring(string.indexOf("\n"));
		return "<% for " + condition + " { %>" + remainingLines + "\n<% } %>";
	}

	private String ieConditionalComment(String string) {
		int startOfCondition = string.indexOf("[");
		int endOfCondition = string.indexOf("]");
		String condition = string.substring(startOfCondition, endOfCondition+1);
		String contents = string.substring(endOfCondition+1);
		return "<!--" + condition + ">" + contents + "<![endif]-->";
	}

	private String htmlComment(String string) {
		if (CharMatcher.WHITESPACE.matchesAllOf(string)) {
			return "<!--\n-->";
		}
		errorChecker.checkNoNestingWithContentOnFirstLine(string);
		if (string.contains("\n")) {
			return "<!--\n" + string + "\n-->";
		}
		return "<!-- " + string.trim() + " -->";
	}

	public void mergeAttributes(Line line) {
		Map<String, String> attrMap = line.attrMap;
		List<String> ids = line.ids;
		List<String> classes = line.classes;
		// Classes go first, Ids go last.
		Map<String, String> attrsFromHash = new LinkedHashMap<String, String>();
		attrsFromHash.putAll(attrMap);
		attrMap.clear();
		if (attrsFromHash.containsKey("id")) {
			ids.add(attrsFromHash.get("id"));
			attrsFromHash.remove("id");
		}
		if (attrsFromHash.containsKey("class")) {
			classes.add(0, attrsFromHash.get("class"));
			attrsFromHash.remove("class");
		}
		errorChecker.setCurrentLineNumber(line.lineNumber);
		errorChecker.checkForNullClassesAndIds(classes, ids);
		if (!classes.isEmpty()) {
			attrMap.put("class", Joiner.on(" ").join(classes));
		}
		attrMap.putAll(attrsFromHash);
		if (!ids.isEmpty()) {
			if (ids.size() > 2) {
				ids = ids.subList(ids.size()-2, ids.size());
			}
			
			attrMap.put("id", Joiner.on("_").join(ids));
		}
	}

	public String spaces(int spaces) {
		String string = "";
		for (int i = 0; i<spaces; i++) {
			string += " ";
		}
		return string;
	}
	
}
