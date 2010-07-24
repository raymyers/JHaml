package com.cadrlife.jhaml.internal;

import java.io.IOException;
import java.io.LineNumberReader;


import com.google.common.base.CharMatcher;
import com.cadrlife.jhaml.internal.org.apache.commons.io.output.NullWriter;

public class JHamlReader {

	private final LineNumberReader reader;
	private Appendable writer;

	public JHamlReader(LineNumberReader reader) {
		this.reader = reader;
		writer = NullWriter.NULL_WRITER;
	}
	
	public void setLineNumber(int lineNumber) {
		reader.setLineNumber(lineNumber);
	}
	
	public int getLineNumber() {
		return reader.getLineNumber();
	}
	
	public String readLine() {
		try {
			String line = reader.readLine();
			this.writer.append(line);
			return line;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public String consumeMatching(CharMatcher matcher) {
		StringBuffer buf = new StringBuffer();
		int c;
		while ((c = peek()) > -1 && 
				matcher.matches((char)c)) {
			buf.append((char)c);
			skip(1);
		}
		return buf.toString();
	}

	public void skip(int n) {
		for (int i=0;i<n;i++) {
			read();
		}
	}

	int peek() {
		try {
			reader.mark(1);
			int c = reader.read();
			reader.reset();
			return c;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean eof() {
		return peek() < 0;
	}

	public boolean isNextChar(char c) {
		return peek() == c;
	}

	public boolean isNextInput(String string) {
		try {
			reader.mark(string.length());
			for (int i = 0; i< string.length(); i++) {
				if (reader.read() != string.charAt(i)) {
					reader.reset();
					return false;
				}
			}
			reader.reset();
			return true;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public int read() {
		try {
			int c = reader.read();
			writer.append((char)c);
			return c;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public String consumeMatchingWithEscaping(CharMatcher matcher, char escapeChar) {
		StringBuffer buf = new StringBuffer();
		int c;
		while ((c = peek()) > -1 && 
				(matcher.matches((char)c) || c == escapeChar)) {
			buf.append((char)c);
			skip(1);
			if (c == escapeChar) {
				buf.append((char)read());
			}
		}
		return buf.toString();
	}

	public boolean isNextCharOneOf(String chars) {
		return chars.indexOf(peek()) > -1;
	}

	public void setObserver(Appendable appendable) {
		this.writer = appendable == null ? NullWriter.NULL_WRITER : appendable;
	}

	public boolean nextCharMatches(CharMatcher matcher) {
		return matcher.matches((char)peek());
	}

}
