package com.example.springboot.demo.entity;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Murugeswaran
 *
 */
public class WeatherResponse {
	
	private String city_name;
	private Long timezone;
	private Double curr_temp;
	private Long humidity;
	private Double curr_temp_min;
	private Double curr_temp_max;
	
	private List<Forecast> forecast= new ArrayList<Forecast>();
	
	public WeatherResponse() {
		
	}
	
	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public Long getTimezone() {
		return timezone;
	}

	public void setTimezone(Long timezone) {
		this.timezone = timezone;
	}

	public Double getCurr_temp() {
		return curr_temp;
	}

	public void setCurr_temp(Double curr_temp) {
		this.curr_temp = curr_temp;
	}

	public Long getHumidity() {
		return humidity;
	}

	public void setHumidity(Long humidity) {
		this.humidity = humidity;
	}

	public Double getCurr_temp_min() {
		return curr_temp_min;
	}

	public void setCurr_temp_min(Double curr_temp_min) {
		this.curr_temp_min = curr_temp_min;
	}

	public Double getCurr_temp_max() {
		return curr_temp_max;
	}

	public void setCurr_temp_max(Double curr_temp_max) {
		this.curr_temp_max = curr_temp_max;
	}

	public List<Forecast> getForecast() {
		return forecast;
	}

	public void setForecast(List<Forecast> forecast) {
		this.forecast = forecast;
	}

	// Forecast Entity
	public class Forecast{
		private String date_time;
		private Double forecast_temp;
		private Long forecast_humidity;
		private Double forecast_temp_min;
		private Double forecast_temp_max;
		
		public Forecast(){
			
		}		
		
		public Forecast(String date_time, Double forecast_temp, Long forecast_humidity, Double forecast_temp_min,
				Double forecast_temp_max) {
			this.date_time = date_time;
			this.forecast_temp = forecast_temp;
			this.forecast_humidity = forecast_humidity;
			this.forecast_temp_min = forecast_temp_min;
			this.forecast_temp_max = forecast_temp_max;
		}



		public String getDate_time() {
			return date_time;
		}

		public void setDate_time(String date_time) {
			this.date_time = date_time;
		}

		public Double getForecast_temp() {
			return forecast_temp;
		}

		public void setForecast_temp(Double forecast_temp) {
			this.forecast_temp = forecast_temp;
		}

		public Long getForecast_humidity() {
			return forecast_humidity;
		}

		public void setForecast_humidity(Long forecast_humidity) {
			this.forecast_humidity = forecast_humidity;
		}

		public Double getForecast_temp_min() {
			return forecast_temp_min;
		}

		public void setForecast_temp_min(Double forecast_temp_min) {
			this.forecast_temp_min = forecast_temp_min;
		}

		public Double getForecast_temp_max() {
			return forecast_temp_max;
		}

		public void setForecast_temp_max(Double forecast_temp_max) {
			this.forecast_temp_max = forecast_temp_max;
		}

		@Override
		public String toString() {
			return "Forecast [date_time=" + date_time + ", forecast_temp=" + forecast_temp + ", forecast_humidity="
					+ forecast_humidity + ", forecast_temp_min=" + forecast_temp_min + ", forecast_temp_max="
					+ forecast_temp_max + "]";
		}
		
		
	}
	
}
