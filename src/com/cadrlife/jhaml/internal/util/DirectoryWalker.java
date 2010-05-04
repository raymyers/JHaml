package com.cadrlife.jhaml.internal.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;

public abstract class DirectoryWalker {

	public DirectoryWalker() {
	}

	protected abstract void handleFile(File file, Collection<File> results)
	throws IOException;

	protected void walk(File root, Collection<File> results) throws IOException {
		root = root.getCanonicalFile();
		if (root.exists()) {
			if (root.isFile()) {
				handleFile(root,  results);
			} else {
				File[] children = root.listFiles();
				for (File child : children) {
					walk(child, results);
				}
			}
		} else {
			throw new FileNotFoundException(root.getCanonicalPath());
		}
	}

}