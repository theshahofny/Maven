package org.ssa.ironyard.web;


import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.ssa.ironyard.web.Vegetable.Color;

@Controller
public class GreetingController {

	static Logger LOGGER = LogManager.getLogger(GreetingController.class);
	
	@Autowired
	WeatherService weather;
	
	@RequestMapping("/")
	@ResponseBody
	public String greet(){
		return "Our first web-app";
	}
	
	@RequestMapping("/foo")
	@ResponseBody
	public Map<String, LocalDate> now(){
		Map<String,LocalDate> model = new HashMap<>();
		model.put("now", LocalDate.now());
		return model;
	}
	
	@RequestMapping("/zucchini")
	@ResponseBody
	public Vegetable zucchini(){
		return new Vegetable(Color.YELLOW, "zucchini");
	}

	@RequestMapping("/potato")
	@ResponseBody
	public Vegetable potato(){
		return new Vegetable(Color.BROWN, "potato");
	}
	@RequestMapping("/tomato")
	@ResponseBody
	public Vegetable tomato(){
		return new Vegetable(Color.RED, "tomato");
	}
	@RequestMapping("/cabbage")
	@ResponseBody
	public Vegetable cabbage(){
		return new Vegetable(Color.GREEN, "cabbage");
	}
	@RequestMapping("/brusselSprouts")
	@ResponseBody
	public Vegetable brusselSprouts(){
		return new Vegetable(Color.GREEN, "brusselSprouts");
	}
	
	@RequestMapping("/temp")
	@ResponseBody
	public float currentTemp(){
		return this.weather.temperature();
	}
	
	@RequestMapping("/trie")
	@ResponseBody
	public List<String> suggestions(HttpServletRequest request) throws URISyntaxException
	{
		String param = request.getParameter("digits");
		return Arrays.asList(param);
	}
}
