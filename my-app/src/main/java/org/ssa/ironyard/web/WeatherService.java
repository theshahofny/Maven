package org.ssa.ironyard.web;

import org.springframework.stereotype.Service;

@Service
//this is what other services depended on
public class WeatherService {

	public float temperature(){
		return 67.7f;
	}
	
}
