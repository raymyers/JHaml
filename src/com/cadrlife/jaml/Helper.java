package com.cadrlife.jaml;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;

import com.cadrlife.jaml.JamlAttrHashParser.attrMappings_return;


public class Helper {
	private final JamlConfig config;

	public Helper(JamlConfig config) {
		this.config = config;
	}
	
	public String elem(String el, Map<String,String> attribMap, String content, boolean selfClosing) {
		boolean autoClose = config.autoclose.contains(el) && content.isEmpty();
		if (selfClosing || autoClose) {
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
	
	public void parseAttrHash(String input, Map<String, String> attrMap) {
		System.out.println(">>> "+ input);
		JamlParserWrapper jamlParserWrapper = new JamlParserWrapper();
		try {
			attrMappings_return parseJamlAttrHash = jamlParserWrapper.parseJamlAttrHash(input);
			attrMap.putAll(parseJamlAttrHash.attrMap);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
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
		return " " + text.replaceAll("\n", "\n "); 
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

	public String jspExpression(String code) {
		return "<%= " + code + " %>";
	}
	
	public String jspScriptlet(String code) {
		return "<% " + code + " %>";
	}

	public String parseFreeFormText(String text) {
		if (text.startsWith("=")) {
			return jspExpression(text.substring(1).trim());
		}
		if (text.startsWith("-")) {
			return jspScriptlet(text.substring(1).trim());
		}
		return text;
	}

	public void mergeAttributes(Map<String, String> attrMap, List<String> ids, List<String> classes) {
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
		if (!classes.isEmpty()) {
			attrMap.put("class", StringUtils.join(classes, " "));
		}
		attrMap.putAll(attrsFromHash);
		if (!ids.isEmpty()) {
			if (ids.size() > 2) {
				ids = ids.subList(ids.size()-2, ids.size());
			}
			
			attrMap.put("id", StringUtils.join(ids, "_"));
		}
	}
	
}
