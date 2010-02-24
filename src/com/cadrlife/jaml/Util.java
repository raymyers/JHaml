package com.cadrlife.jaml;
import java.util.Map;
import java.util.Map.Entry;


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
	public static String parseStringLiteral(String lit) {
		return lit.substring(1, lit.length()-1);
	}
	
	public static String indent(String text) {
		return " " + text.replaceAll("\n", "\n "); 
	}
	public static String stripTrailingNewline(String text) {
		return text.replaceFirst("\n$", ""); 
	}
	
}
