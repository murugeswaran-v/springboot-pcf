package com.example.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot.demo.entity.WeatherResponse;


/**
 * @author Murugeswaran
 *
 */
@RestController
@RequestMapping("/api")
public class WeatherController {
	
	@Value("${custom.weather.url}")
	private String weatherURL;
	
	@Value("${custom.forcast.url}")
	private String forecastURL;
    
    @GetMapping("/weather/{city}")
	public WeatherResponse getWeatherByCity(@PathVariable String city) {
        WeatherReporter weatherReporter = new WeatherReporter();
        WeatherResponse response = weatherReporter.processWeatherReportByCity(weatherURL, forecastURL, city);
        return response;
	}

}
