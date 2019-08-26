package com.example.springboot.demo.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.client.RestTemplate;

import com.example.springboot.demo.entity.WeatherResponse;
import com.example.springboot.demo.entity.WeatherResponse.Forecast;

/**
 * @author Murugeswaran
 *
 */
public class WeatherReporter {
	
	private WeatherResponse weatherResponse;
	
	public WeatherReporter() {
		weatherResponse = new WeatherResponse();
	}
	
	//Get the the city value
    private Function<JSONObject, String> key_city = city -> {
    	String name = (String) (city.get("name"));
    	if (name != null) {
    		name = name.toLowerCase();
    	}
    	return name;
    };
    
    //Maps and Transform the Weather response
    @SuppressWarnings({ "unchecked" })
	private Function<JSONObject, WeatherResponse> value_weather = jsonBody -> {
    	
    	JSONArray forecastArray = (JSONArray) jsonBody.get("list");
    	
    	if (forecastArray == null) {
    	
    		weatherResponse.setCity_name((String) jsonBody.get("name"));
    		weatherResponse.setTimezone((Long) jsonBody.get("timezone"));    			
    		//Get Temperature information
    		JSONObject weatherTempArray = (JSONObject) jsonBody.get("main");    	
    		weatherResponse.setCurr_temp((Double)weatherTempArray.get("temp"));
    		weatherResponse.setHumidity((Long)weatherTempArray.get("humidity"));
    		weatherResponse.setCurr_temp_max((Double)weatherTempArray.get("temp_max"));
    		weatherResponse.setCurr_temp_min((Double)weatherTempArray.get("temp_min"));
    	}else {
    		//Mapping forcast list
    		ArrayList<Forecast> forecastList = new ArrayList<Forecast>();
    		forecastArray.forEach(element->{
    			JSONObject forcastElement = (JSONObject) element;
    			try {
    			forecastList.add(
                		weatherResponse.new Forecast((String) forcastElement.get("dt_txt"), 
                		((Double) ((JSONObject) forcastElement.get("main")).get("temp")),
                		((Long)((JSONObject) forcastElement.get("main")).get("humidity")),
                		((Double)((JSONObject) forcastElement.get("main")).get("temp_min")), 
                		((Double)((JSONObject) forcastElement.get("main")).get("temp_max"))
                		));
    			}catch (ClassCastException e) {
                	//Ignore Casting exception for POC
                }
    		});
    		weatherResponse.setForecast(forecastList);
    	}
        return weatherResponse;
    };
    
	private JSONObject getWeatherdata(String uriString, String city) {
    	
    	JSONObject jsonObj = null;
    	Map<String, String> queyParams = new HashMap<String, String>();
    	queyParams.put("city", city);
    	try {
    		RestTemplate restTemplate = new RestTemplate();
    		String response = restTemplate.getForObject(uriString, String.class, queyParams);
    		
    		JSONParser parser = new JSONParser();    	
			jsonObj = (JSONObject) parser.parse(response.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return jsonObj;
    	
    }
	
	public WeatherResponse processWeatherReportByCity(String currentWeatherURL, String forecastWeatherURL, String city) {
		Map<String, WeatherResponse> weatherReport = null;
		
    	JSONObject currentWeather = getWeatherdata(currentWeatherURL,city);
		JSONObject forecastWeather = getWeatherdata(forecastWeatherURL,city);
		
		List<JSONObject> jsonArray = new ArrayList<JSONObject>();
		jsonArray.add(currentWeather);
		jsonArray.add(forecastWeather);
		
		weatherReport = (Map<String, WeatherResponse>) jsonArray.stream().collect(Collectors.toMap(key_city, value_weather));
		
		return weatherReport.get(city.toLowerCase());
	}
	

}
