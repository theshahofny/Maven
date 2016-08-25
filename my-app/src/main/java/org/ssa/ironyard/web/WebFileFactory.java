package org.ssa.ironyard.web;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

public class WebFileFactory implements FileFactory{

	final String fileName;
	
	
	public WebFileFactory(String fileName) {
		super();
		this.fileName = fileName;
	}


	@Override
	public File getInstance(){
		URL resource = getClass().getClassLoader().getResource(fileName);
		try{
			return new File(resource.toURI());
		}
		catch(URISyntaxException ex){
			ex.printStackTrace();
			throw new RuntimeException();
		}
	}
}
