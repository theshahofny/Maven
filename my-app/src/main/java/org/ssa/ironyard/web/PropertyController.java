package org.ssa.ironyard.web;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.ssa.ironyard.web.Vegetable.Color;

//@RestController
public class PropertyController
{
	
	static final Logger LOGGER = LogManager.getLogger(PropertyController.class);
	
	@RequestMapping("/realestate/{city}/{street}")
	@ResponseBody
	public List<Property> search(@PathVariable String city, @PathVariable String street){

		List<Property> p2 = new ArrayList<>();
		Property p = new Property(1400000, "5th avenue Ohiio", 500);
		Property p1 = new Property(800000, "123 main Oregon", 500);
		Property p7 = new Property(400000, "5th avenue NY", 500);
		Property p3 = new Property(35000, "5th avenue NY", 500);
		Property p4 = new Property(80000, "5th avenue NY", 500);
		
		
		
		LOGGER.warn("city {} street{}", city, street);
		if(city.equals("cinncinati") && street.equals("main")){
			
			p2.add(p);
			return p2;
		}
		if(city.equals("portland") && street.equals("main")){
			
			p2.add(p1);
			return p2;
		}
		
		if(city.equals("new_york") && street.equals("main")){
		
			p2.add(p7);
			return p2;
		}
		
		if(city.equals("baltimore") && street.equals("main")){
			
			p2.add(p3);
			return p2;
		}
		
		if(city.equals("orlando") && street.equals("main")){
			p2.add(p4);
			return p2;
		}
		return Collections.emptyList();
		
		
	}
	

}