package com.cadrlife.jhaml;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Line {

	public List<String> ids = new ArrayList<String>();
	public List<String> classes = new ArrayList<String>();
	public String tag = "";
	public String inLineContent = "";
	public Map<String, AttributeValue> attrMap = new TreeMap<String, AttributeValue>();
	public String leadingWhitespace = "";
	public String indentation = "";
	public List<Line> block = new ArrayList<Line>();
	public boolean isSelfClosing = false;
	public boolean isWithinFilter = false;
	public String text = "";
	public int lineNumber = -1;
	public boolean isElement = false; 
	public boolean isElement() {
		return isElement;
	}
	public boolean isBlank() {
		return !isElement() && this.inLineContent.trim().isEmpty();
	}
	public boolean isComment() {
		return !isElement() && inLineContent.startsWith("/");
	}
	public boolean hasNestedContent() {
		return !block.isEmpty();
	}
	@Override
	public String toString() {
		return tag + inLineContent;
	}
	public boolean isFilter() {
		return inLineContent.startsWith(":");
	}
	public boolean isStatement() {
		return !isElement() && inLineContent.startsWith("-");
	}
	public boolean hasInLineContent() {
		return !inLineContent.isEmpty();
	}
	public boolean canHaveNesting() {
		return this.isElement || this.isFilter() || this.isComment() || this.isStatement();
	}
}
