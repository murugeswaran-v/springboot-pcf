package com.example.springboot.demo.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Murugeswaran
 *
 */
public class WeatherResponse {
	
	private Coord coord;
	private List<Weather> weather= new ArrayList<Weather>();
	private String base;
	private Main main;
	private Integer visibility;
	private Wind wind;
	private Clouds clouds;
	private Long dt;
	private Sys sys;
	private Integer timezone;
	private Long id;
	private String name;
	private String cod;
	
	public WeatherResponse() {
		
	}

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public String getBase() {
		return base;
	}

	public void setBase(String base) {
		this.base = base;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Integer getVisibility() {
		return visibility;
	}

	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public Long getDt() {
		return dt;
	}

	public void setDt(Long dt) {
		this.dt = dt;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public Integer getTimezone() {
		return timezone;
	}

	public void setTimezone(Integer timezone) {
		this.timezone = timezone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}


	// Coord Entity
	public static class Coord{
		
		private Double lon;
		private Double lat;
		
		public Double getLon() {
			return lon;
		}
		public void setLon(Double lon) {
			this.lon = lon;
		}
		public Double getLat() {
			return lat;
		}
		public void setLat(Double lat) {
			this.lat = lat;
		}
		
		@Override
		public String toString() {
			return "Coord [lon=" + lon + ", lat=" + lat + "]";
		}
		
	}
	
	//Weather Entity
	public static class Weather {
		private Integer id;
		private String main;
		private String description;
		private String icon;

		public int getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getMain() {
			return main;
		}

		public void setMain(String main) {
			this.main = main;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		@Override
		public String toString() {
			return "Weather [id=" + id + ", main=" + main + ", description=" + description + ", icon=" + icon + "]";
		}
		
	}
	
	//main entity
	public static class Main{
		private Double temp;
		private Long pressure;
		private Integer humidity;
		private Double temp_min;
		private Double temp_max;

		public Double getTemp() {
			return temp;
		}

		public void setTemp(Double temp) {
			this.temp = temp;
		}

		public long getPressure() {
			return pressure;
		}

		public void setPressure(Long pressure) {
			this.pressure = pressure;
		}

		public int getHumidity() {
			return humidity;
		}

		public void setHumidity(Integer humidity) {
			this.humidity = humidity;
		}

		public Double getTemp_min() {
			return temp_min;
		}

		public void setTemp_min(Double temp_min) {
			this.temp_min = temp_min;
		}

		public Double getTemp_max() {
			return temp_max;
		}

		public void setTemp_max(Double temp_max) {
			this.temp_max = temp_max;
		}

		@Override
		public String toString() {
			return "Main [temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity + ", temp_min=" + temp_min
					+ ", temp_max=" + temp_max + "]";
		}
		
		
	}
	
	//wind entity
	public static class Wind{
		private Double speed;
		private Integer deg;
		
		public double getSpeed() {
			return speed;
		}

		public void setSpeed(Double speed) {
			this.speed = speed;
		}

		public int getDeg() {
			return deg;
		}

		public void setDeg(Integer deg) {
			this.deg = deg;
		}

		@Override
		public String toString() {
			return "Wind [speed=" + speed + ", deg=" + deg + "]";
		}
		
		
	}
	
	//clouds entity
	public static class Clouds{
		private Integer all;


		public Integer getAll() {
			return all;
		}

		public void setAll(Integer all) {
			this.all = all;
		}

		@Override
		public String toString() {
			return "Clouds [all=" + all + "]";
		}
		
	}
	
	//sys entity
	public static class Sys{
		private Integer type;
		private Integer id;
		private Double message;
		private String country;
		private Long sunrise;
		private Long sunset;

		public Integer getType() {
			return type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Double getMessage() {
			return message;
		}

		public void setMessage(Double message) {
			this.message = message;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public Long getSunrise() {
			return sunrise;
		}

		public void setSunrise(Long sunrise) {
			this.sunrise = sunrise;
		}

		public Long getSunset() {
			return sunset;
		}

		public void setSunset(Long sunset) {
			this.sunset = sunset;
		}

		@Override
		public String toString() {
			return "Sys [type=" + type + ", id=" + id + ", message=" + message + ", country=" + country + ", sunrise="
					+ sunrise + ", sunset=" + sunset + "]";
		}
		
	}
	
}
