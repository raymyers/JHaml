package com.cadrlife.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;

@SuppressWarnings("deprecation")
public class StringInputStream extends InputStream {

	private StringBufferInputStream stringBufferInputStream;

	public StringInputStream(String input) {
		stringBufferInputStream = new StringBufferInputStream(input);
	}

	@Override
	public int read() throws IOException {
		return stringBufferInputStream.read();
	}

}
