package com.cadrlife.jhaml;

import java.io.IOException;

class LineTextWriter implements Appendable {
	private final Line line;

	public LineTextWriter(Line line) {
		this.line = line;
	}
	public Appendable append(CharSequence csq) throws IOException {
		line.text += csq;
		return this;
	}

	public Appendable append(char c) throws IOException {
		line.text += c;
		return this;
	}

	public Appendable append(CharSequence csq, int start, int end)
			throws IOException {
		line.text += csq.subSequence(start, end);
		return this;
	}

}
