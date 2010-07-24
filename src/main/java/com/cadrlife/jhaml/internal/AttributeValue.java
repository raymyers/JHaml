package com.cadrlife.jhaml.internal;

public class AttributeValue {
	public static AttributeValue literal(String value) {
		return new AttributeValue(value, false);
	}
	public static AttributeValue quoted(String value) {
		return new AttributeValue(value, true);
	}
	public final String value;
	public final boolean quoted;
	private AttributeValue(String value, boolean quoted) {
		this.value = value;
		this.quoted = quoted;
	}
	public boolean isNull() {
		return !quoted && "null".equals(value);
	}
	public boolean isTrue() {
		return !quoted && "true".equals(value);
	}
	public boolean isFalse() {
		return !quoted && "false".equals(value);
	}
	public boolean isJspExpression() {
		return !quoted && value.startsWith("<%=");
	}
}
