package com.cadrlife.jhaml;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringEscapeUtils;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;

public class Helper {
	public static final String DOCTYPE_HTML_4_01_STRICT = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">";
	public static final String DOCTYPE_HTML_4_01_FRAMESET = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Frameset//EN\" \"http://www.w3.org/TR/html4/frameset.dtd\">";
	public static final String DOCTYPE_HTML_4_01_TRANSITIONAL = "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">";
	public static final String DOCTYPE_XHTML_1_0_TRANSITIONAL = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
	public static final String DOCTYPE_XHTML_1_1_BASIC = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML Basic 1.1//EN\" \"http://www.w3.org/TR/xhtml-basic/xhtml-basic11.dtd\">";
	public static final String DOCTYPE_XHTML_1_2_MOBILE = "<!DOCTYPE html PUBLIC \"-//WAPFORUM//DTD XHTML Mobile 1.2//EN\" \"http://www.openmobilealliance.org/tech/DTD/xhtml-mobile12.dtd\">";
	public static final String DOCTYPE_XHTML_1_0_FRAMESET = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">";
	public static final String DOCTYPE_XHTML_1_0_STRICT = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">";
	public static final String DOCTYPE_HTML = "<!DOCTYPE html>";
	public static final String DOCTYPE_XHTML_1_1_STRICT = "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.1//EN\" \"http://www.w3.org/TR/xhtml11/DTD/xhtml11.dtd\">";
	private final JHamlConfig config;
	final JHamlErrorChecker errorChecker;

	public Helper(JHamlConfig config) {
		this.config = config;
		errorChecker = new JHamlErrorChecker();
	}

	public String elem(Line line, String content, boolean selfClosing) {
		content = content == null ? "" : content;
		errorChecker.checkElementHasLegalTag(line);
		boolean autoClose = config.autoclose.contains(line.tag) && content.isEmpty();
		if (selfClosing || autoClose) {
			errorChecker.checkContentOfSelfClosingTags(line.text, content);
			return "<" + line.tag + attribs(line.attrMap) + " />";
		}
		return "<" + line.tag + attribs(line.attrMap) + ">" + content + "</" + line.tag + ">";
	}

//	public String attribs(String... s) {
//		String result = "";
//		for (int i = 0; i < s.length; i += 2) {
//			String attr = s[i];
//			String value = s[i + 1];
//			result += " " + attr + "=" + this.config.attrWrapper + value + this.config.attrWrapper;
//		}
//		return result;
//	}

	public String attribs(Map<String, AttributeValue> attribMap) {
		String attrWrapper = this.config.attrWrapper;
		String quoteEscape = "\"".equals(attrWrapper) ? "&quot;" : "&apos;";
	    String otherQuoteChar = "\"".equals(attrWrapper) ? "'" : "\"";
		String result = "";
		if (null != attribMap) {
			for (Entry<String, AttributeValue> e : attribMap.entrySet()) {
				String attr = e.getKey();
				String value = e.getValue().value;
				if (e.getValue().isNull() || e.getValue().isFalse()) {
					continue;
				}
				String thisAttrWrapper = attrWrapper;
				if (!e.getValue().isJspExpression()) {
					// Should do the same as Haml's Helper.escape_once
					value = StringEscapeUtils.escapeHtml(StringEscapeUtils.unescapeHtml(value));
					// Helpers.preserve
					value = value.replaceAll("\n", "&#x000A;");
					// We want to decide whether or not to escape quotes
					value = value.replaceAll("&quot;","\"");
			        if (value.contains(attrWrapper)) {
			        	if (value.contains(otherQuoteChar)) {
			        		value = value.replaceAll(attrWrapper, quoteEscape);
			        	} else {
			        		thisAttrWrapper = otherQuoteChar;
			        	}
			        }
				}
	        	if (e.getValue().isTrue()) {
					if (this.config.isXhtml()) {
						result += " " + attr + "=" + thisAttrWrapper + attr + thisAttrWrapper;
					} else {
						result += " " + attr;
					}
				} else {
					result += " " + attr + "=" + thisAttrWrapper + value + thisAttrWrapper;
				}
			}
		}
		return result;
	}

	public String parseStringLiteral(String lit) {
		return StringEscapeUtils.unescapeJava(lit
				.substring(1, lit.length() - 1));
	}

	public String parseIntegerLiteral(String lit) {
		lit = lit.replaceAll("(l|L)$", "");
		if (lit.startsWith("0x") || lit.startsWith("0X")) {
			return Long.toString(Long.parseLong(lit.substring(2), 16));
		}
		if (lit.startsWith("0")) {
			return Long.toString(Long.parseLong(lit, 8));
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

	public String parseDoubleLiteral(String lit) {
		return Double.toString(Double.parseDouble(lit));
	}
	
	public String parseNumberLiteral(String lit) {
		return lit.contains(".") ? parseDoubleLiteral(lit) : parseIntegerLiteral(lit);
	}

	public String jspExpression(String lineText, String code) {
		errorChecker.checkJavaCodeIsNotEmpty(lineText, "=", code);
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

	public String parseFreeFormText(Line line, String currentElementType,
			String text) {
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
		if (text.startsWith("\\")) {
			return CharMatcher.is(' ').trimTrailingFrom(text.substring(1));
		}
		errorChecker.checkNoNestingWithinContent(line);
		return CharMatcher.is(' ').trimTrailingFrom(text);
	}

	private String header(Line line, String header) {
		errorChecker.checkHeaderHasNoNestedContent(line, header);
		// if (config.isXhtml()) {
		// return
		// "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";
		// }
		// return
		// "<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">";

		String text = header.substring(3).toLowerCase().trim();
		String[] tokens = text.split("\\s+");
		if (text.startsWith("xml")) {
			if (config.isHtml()) {
				return "";
			}
			String wrapper = config.attrWrapper;
			String encoding = text.contains(" ") ? tokens[1] : "utf-8";
			return String.format("<?xml version=%s1.0%s encoding=%s%s%s ?>",
					wrapper, wrapper, wrapper, encoding, wrapper);
		}
		if (config.isHtml5()) {
			return DOCTYPE_HTML;
		}
		// TODO: This regex is from the Ruby implementation, and could be updated for Java.
//		Pattern pattern = Pattern.compile("(\\d(?:\\.\\d)?)?[\\s]*([a-z]*)",
//				Pattern.CASE_INSENSITIVE);
		String version = tokens.length > 0 ? tokens[0] : "";
		String type = tokens.length > 1 ? tokens[1] : "";
		if (CharMatcher.JAVA_LETTER.matchesAllOf(version)) {
			type = version;
			version = "";
		}
//		System.err.println("<" + version + ">");
//		System.err.println("<" + type + ">");
		// version, type = text.scan(DOCTYPE_REGEX )[0]
		if (config.isXhtml()) {
			if ("1.1".equals(version)) {
				return DOCTYPE_XHTML_1_1_STRICT;
			}
			if ("5".equals(version)) {
				return DOCTYPE_HTML;
			}
			if ("strict".equals(type)) {
				return DOCTYPE_XHTML_1_0_STRICT;
			}
			if ("frameset".equals(type)) {
				return DOCTYPE_XHTML_1_0_FRAMESET;
			}
			if ("mobile".equals(type)) {
				return DOCTYPE_XHTML_1_2_MOBILE;
			}
			if ("basic".equals(type)) {
				return DOCTYPE_XHTML_1_1_BASIC;
			}
			return DOCTYPE_XHTML_1_0_TRANSITIONAL;
		}
		if (config.isHtml4()) {
			if ("strict".equals(type)) {
				return DOCTYPE_HTML_4_01_STRICT;
			}
			if ("frameset".equals(type)) {
				return DOCTYPE_HTML_4_01_FRAMESET;
			}
			return DOCTYPE_HTML_4_01_TRANSITIONAL;
		}
		return "";
	}

	private String filter(String text) {
		String filter = text;
		String remainingLines = "";
		if (text.contains("\n")) {
			filter = text.substring(0, text.indexOf("\n"));
			remainingLines = text.substring(text.indexOf("\n") + 1);
		}
		errorChecker.checkFilterIsDefined(config, filter, remainingLines);
		return config.filters.get(filter).process(remainingLines);
	}

	private String ifBlock(String string) {
		String condition = string.substring(string.indexOf("if") + 2,
				string.indexOf("\n")).trim();
		if (!condition.startsWith("(")) {
			condition = "(" + condition + ")";
		}
		String remainingLines = string.substring(string.indexOf("\n"));
		return "<% if " + condition + " { %>" + remainingLines + "\n<% } %>";
	}

	private String whileLoop(String string) {
		String condition = string.substring(string.indexOf("while") + 5,
				string.indexOf("\n")).trim();
		if (!condition.startsWith("(")) {
			condition = "(" + condition + ")";
		}
		String remainingLines = string.substring(string.indexOf("\n"));
		return "<% while " + condition + " { %>" + remainingLines + "\n<% } %>";
	}

	private String forLoop(String string) {
		String condition = string.substring(string.indexOf("for") + 3,
				string.indexOf("\n")).trim();
		if (!condition.startsWith("(")) {
			condition = "(" + condition + ")";
		}
		String remainingLines = string.substring(string.indexOf("\n"));
		return "<% for " + condition + " { %>" + remainingLines + "\n<% } %>";
	}

	private String ieConditionalComment(String string) {
		int startOfCondition = string.indexOf("[");
		int endOfCondition = string.indexOf("]");
		String condition = string.substring(startOfCondition,
				endOfCondition + 1);
		String contents = string.substring(endOfCondition + 1);
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
		List<String> ids = line.ids;
		List<String> classes = line.classes;
		// Classes go first, Ids go last.
		Map<String, AttributeValue> attrMap = line.attrMap;
		if (attrMap.containsKey("id")) {
			ids.add(attrMap.get("id").value);
			attrMap.remove("id");
		}
		if (attrMap.containsKey("class")) {
			classes.add(0, attrMap.get("class").value);
			attrMap.remove("class");
		}
		errorChecker.setCurrentLineNumber(line.lineNumber);
		errorChecker.checkForNullClassesAndIds(classes, ids);
		if (!classes.isEmpty()) {
			attrMap.put("class", AttributeValue.quoted(Joiner.on(" ").join(classes)));
		}
		if (!ids.isEmpty()) {
			if (ids.size() > 2) {
				ids = ids.subList(ids.size() - 2, ids.size());
			}

			attrMap.put("id", AttributeValue.quoted(Joiner.on("_").join(ids)));
		}
	}

	public String spaces(int spaces) {
		String string = "";
		for (int i = 0; i < spaces; i++) {
			string += " ";
		}
		return string;
	}

	public AttributeValue parseJavaAttrValue(String lineText, String code) {
		if ("null".equals(code.trim()) || "true".equals(code.trim()) || "false".equals(code.trim())) {
			return AttributeValue.literal(code.trim());
		}
		return AttributeValue.literal(jspExpression(lineText, code));
	}


}
