package com.cadrlife.jhaml;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Line {

	public boolean isElement = false;
	public String tag = "";
	public List<String> ids = new ArrayList<String>();
	public List<String> classes = new ArrayList<String>();
	public Map<String, AttributeValue> attrMap = new TreeMap<String, AttributeValue>();
	public boolean isSelfClosing = false;
	public String inlineContent = "";
	public String leadingWhitespace = "";
	public String indentation = "";
	public List<Line> block = new ArrayList<Line>();
	public boolean isWithinFilter = false;
	public String text = "";
	public int lineNumber = -1;
	private Appendable textWriter = new LineTextWriter(this); 
	public boolean isElement() {
		return isElement;
	}
	public boolean isBlank() {
		return !isElement() && this.inlineContent.trim().isEmpty();
	}
	public boolean isComment() {
		return !isElement() && inlineContent.startsWith("/");
	}
	public boolean hasNestedContent() {
		return !block.isEmpty();
	}
	@Override
	public String toString() {
		return tag + inlineContent;
	}
	public boolean isFilter() {
		return inlineContent.startsWith(":");
	}
	public boolean isStatement() {
		return !isElement() && inlineContent.startsWith("-");
	}
	public boolean hasInLineContent() {
		return !inlineContent.isEmpty();
	}
	public boolean canHaveNesting() {
		return this.isElement || this.isFilter() || this.isComment() || this.isStatement();
	}
	public Appendable getTextWriter() {
		return textWriter ;
	}
	
}
