package org.ssa.ironyard.web;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//@Controller
public class TrieController {

	static final Logger LOGGER = LogManager.getLogger(TrieController.class);
//
//	@ResponseBody
//	@RequestMapping("/param")
//	public List<String> suggestions(HttpServletRequest request) throws URISyntaxException
//	{
//		LOGGER.debug("will attempt to load corncob.txt");
//		URL resource = getClass().getClassLoader().getResource("");
//		File file = new File(resource.toURI());
//		LOGGER.debug("file{}. exists? {}", file, file.exists());
//		if(null!= request.getParameter("digits"))
//			return Arrays.asList(request.getParameter("digits"));
//
//		return Arrays.asList("not", "implemented", "yet");
//	}

	@ResponseBody
	@RequestMapping("/param")
	public List<String> suggestions1(HttpServletRequest request) throws URISyntaxException
	{
		LOGGER.debug("will attempt to load corncob.txt");
//		
//		URL resource = getClass().getClassLoader().getResource("");
//		File file = new File(resource.toURI());
//		LOGGER.debug("file{}. exists? {}", file, file.exists());
		if(request.getParameter("digits").contains(null))
		if(!Strings.isEmpty(request.getParameter("digits")))
			return Arrays.asList(request.getParameter("digits"));
		
		return Arrays.asList("not", "implemented", "yet");
	}

	
}
