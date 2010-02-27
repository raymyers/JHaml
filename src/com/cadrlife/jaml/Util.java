package com.cadrlife.jaml;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringEscapeUtils;

import com.cadrlife.jaml.JamlAttrHashParser.attrMappings_return;


public class Util {
	public static String elem(String el, String attribString, String content) {
		return "<" + el + attribString + ">" + content + "</" + el + ">";
	}
	
	public static String elem(String el, Map<String,String> attribMap, String content, boolean selfClosing) {
		if (selfClosing) {
			return "<" + el + attribs(attribMap) + " />";
		}
		return "<" + el + attribs(attribMap) + ">" + content + "</" + el + ">";
	}
	
	public static String elem(String el) {
		return elem(el, "", "");
	}
	
	public static String attribs(String...s) {
		String result = "";
		for (int i=0; i<s.length; i+=2) {
			String attr = s[i];
			String value = s[i+1];
			result += " " + attr + "=" + "'" + value + "'"; 
		}
		return result;
	}
	
	public static String attribs(Map<String, String> attribMap) {
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
	
	public static void parseAttrHash(String input, Map<String, String> attrMap) {
		System.out.println(">>> "+ input);
		JamlParserWrapper jamlParserWrapper = new JamlParserWrapper();
		try {
			attrMappings_return parseJamlAttrHash = jamlParserWrapper.parseJamlAttrHash(input);
			attrMap.putAll(parseJamlAttrHash.attrMap);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String parseStringLiteral(String lit) {
		return StringEscapeUtils.unescapeJava(lit.substring(1, lit.length()-1));
	}
	
	public static String parseIntegerLiteral(String lit) {
		lit = lit.replaceAll("(l|L)$", "");
		if (lit.startsWith("0x") || lit.startsWith("0X")) {
			return Long.toString(Long.parseLong(lit.substring(2),16));
		}
		if (lit.startsWith("0")) {
			return Long.toString(Long.parseLong(lit,8));
		}
		return Long.toString(Long.parseLong(lit));
	}
	
	public static String indent(String text) {
		return " " + text.replaceAll("\n", "\n "); 
	}
	public static String stripTrailingNewline(String text) {
		return text.replaceFirst("\n$", ""); 
	}

	public static String parseFloatLiteral(String lit) {
		return Double.toString(Double.parseDouble(lit));
	}

	public static String parseCharLiteral(String lit) {
		return parseStringLiteral(lit);
	}

	public static String parseLongLiteral(String lit) {
		return parseIntegerLiteral(lit.substring(0, lit.length()-1));
	}

	public static String parseDoubleLiteral(String lit) {
		return Double.toString(Double.parseDouble(lit));
	}

	public static String jspExpression(String code) {
		return "<%= " + code + " %>";
	}
	
	public static String jspScriptlet(String code) {
		return "<% " + code + " %>";
	}

	public static String parseFreeFormText(String text) {
		if (text.startsWith("=")) {
			return jspExpression(text.substring(1).trim());
		}
		if (text.startsWith("-")) {
			return jspScriptlet(text.substring(1).trim());
		}
		return text;
	}
	
}
