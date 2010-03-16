package com.cadrlife.jhaml;

public class JHamlParseException extends RuntimeException {
	private final int lineNumber;

	public JHamlParseException(String message) {
		super(message);
		lineNumber = -1;
	}
	
	public JHamlParseException(String message, int lineNumber) {
		super("Line " + lineNumber + ": " + message);
		this.lineNumber = lineNumber;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	private static final long serialVersionUID = 1L;

}
