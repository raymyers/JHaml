package com.cadrlife.jhaml;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

import com.cadrlife.jhaml.internal.com.google.common.io.Files;
import com.cadrlife.jhaml.internal.util.DirectoryWalker;

public class JHamlBatchConverter extends DirectoryWalker {
	private boolean deleteHamlFiles = false;
	private String hamlExtension = "haml";
	private String targetExtenstion = "jsp";
	private boolean outputModificationWarning = true;
	private Charset charset = Charset.defaultCharset();
	
	public List<File> convertAllInPath(File startDirectory) throws IOException {
		List<File> results = new ArrayList<File>();
		walk(startDirectory, results);
		return results;
	}

	@Override
	protected void handleFile(File file, Collection<File> results) throws IOException {
		if (file.getName().endsWith("." + hamlExtension)) {
			String warning = warning(file.getName());
			String gsp = new JHaml()
					.parse(Files.toString(file, getCharset()));
			String gspFileName = file.getAbsolutePath().replaceAll(
					"\\." + Pattern.quote(hamlExtension) + "$", "." + targetExtenstion);
			Files.write(warning + gsp, new File(gspFileName), getCharset());
			if (isDeleteHamlFiles()) {
				file.delete();
			}
		}
		results.add(file);
	}

	private String warning(String filename) {
		if (isOutputModificationWarning()) {
			return "<%-- DO NOT MODIFY THIS FILE, IT IS AUTOMATICALLY GENERATED. INSTEAD MODIFY " + filename + " --%>\n";
		}
		return "";
	}

	public void setDeleteHamlFiles(boolean deleteHamlFiles) {
		this.deleteHamlFiles = deleteHamlFiles;
	}

	public boolean isDeleteHamlFiles() {
		return deleteHamlFiles;
	}

	public void setTargetExtenstion(String targetExtenstion) {
		this.targetExtenstion = targetExtenstion;
	}

	public String getTargetExtenstion() {
		return targetExtenstion;
	}

	public void setHamlExtension(String hamlExtension) {
		this.hamlExtension = hamlExtension;
	}

	public String getHamlExtension() {
		return hamlExtension;
	}

	public void setCharset(Charset charset) {
		this.charset = charset;
	}

	public Charset getCharset() {
		return charset;
	}

	public void setOutputModificationWarning(boolean outputModificationWarning) {
		this.outputModificationWarning = outputModificationWarning;
	}

	public boolean isOutputModificationWarning() {
		return outputModificationWarning;
	}

}
