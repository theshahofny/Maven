package org.ssa.ironyard.web;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TrieLoadingService 
{
    static final Logger LOGGER = LogManager.getLogger(TrieLoadingService.class);
    
    @Autowired
    Trie trie;
    
    public TrieLoadingService(Trie trie) throws URISyntaxException
    {
        URL resource = getClass().getClassLoader().getResource("corncob_lowercase.txt");
        File file = new File(resource.toURI());
        LOGGER.debug("file {}, exists?{}", file, file.exists());

    }
    
    public void guesstheWord(Trie trie) throws URISyntaxException{
    	
    }
    
    

}