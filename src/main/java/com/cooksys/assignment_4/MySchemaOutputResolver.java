package com.cooksys.assignment_4;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;

public class MySchemaOutputResolver extends SchemaOutputResolver {

	private String fileName;

	public MySchemaOutputResolver(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
		return new StreamResult(new File(this.fileName).getAbsolutePath());
	}

}
