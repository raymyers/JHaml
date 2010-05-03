package com.cadrlife.jhaml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cadrlife.jhaml.filters.CdataFilter;
import com.cadrlife.jhaml.filters.CssFilter;
import com.cadrlife.jhaml.filters.EscapedFilter;
import com.cadrlife.jhaml.filters.Filter;
import com.cadrlife.jhaml.filters.JavaScriptFilter;
import com.cadrlife.jhaml.filters.JspFilter;
import com.cadrlife.jhaml.filters.PlainFilter;
import com.cadrlife.jhaml.filters.PreserveFilter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class JHamlConfig {
	public static final int OUTPUT_INDENTATION_SIZE = 2;
	public static final ImmutableList<String> validFormats = ImmutableList.of("xhtml","html4","html5");
	public String format = "xhtml";
	public List<String> autoclose = Lists.newArrayList("meta", "img", "link", "br", "hr", "input", "area", "param", "col", "base");
	public List<String> preserve = Lists.newArrayList("textarea", "pre");
	public String attrWrapper = "'";
	
	public Map<String,Filter> filters = new HashMap<String,Filter>();
	{
		filters.put("plain", new PlainFilter(this));
		filters.put("javascript", new JavaScriptFilter(this));
		filters.put("cdata", new CdataFilter(this));
		filters.put("escaped", new EscapedFilter(this));
		filters.put("preserve", new PreserveFilter(this));
		filters.put("jsp", new JspFilter(this));
		filters.put("css", new CssFilter(this));
	}
	
	public boolean isXhtml() {
		return !isHtml();
	}
	public boolean isHtml() {
		return isHtml4() || isHtml5();
	}
	public boolean isHtml4() {
		return "html4".equals(this.format);
	}
	public boolean isHtml5() {
		return "html5".equals(this.format);
	}
	
	// These options escapeHtml, suppressEval, and encoding may not be necessary.
	//	boolean escapeHtml = false;
	//	boolean suppressEval = false;
	//	String encoding = "utf-8";
}
