package com.cadrlife.jaml;

public class JamlParseException extends RuntimeException {
	private final int lineNumber;

	public JamlParseException(String message) {
		super(message);
		lineNumber = -1;
	}
	
	public JamlParseException(String message, int lineNumber) {
		super("Line " + lineNumber + ": " + message);
		this.lineNumber = lineNumber;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	private static final long serialVersionUID = 1L;

}
