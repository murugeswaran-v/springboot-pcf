package com.example.springboot.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.springboot.demo.entity.WeatherResponse;

/**
 * @author Murugeswaran
 *
 */
@RestController
@RequestMapping("/api")
public class WeatherController {
	
	@Value("${custom.weather.url}")
	private String url;
	
	@GetMapping("/weather/{city}")
	public WeatherResponse getWeatherByCity(@PathVariable String city) {
		
		Map<String, String> queyParams = new HashMap<String, String>();
		queyParams.put("city", city);		
		RestTemplate restTemplate = new RestTemplate();
		WeatherResponse response = restTemplate.getForObject(url, WeatherResponse.class, queyParams);
		return response;
	}

}
