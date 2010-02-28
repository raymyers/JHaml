package com.cadrlife.jaml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JamlConfig {
	List<String> autoclose = new ArrayList<String>(Arrays.asList("meta", "img", "link", "br", "hr", "input", "area", "param", "col", "base"));
	public Map<String,Filter> filters = new HashMap<String,Filter>();
	{
		filters.put("javascript", new JavaScriptFilter(this));
	}
}
