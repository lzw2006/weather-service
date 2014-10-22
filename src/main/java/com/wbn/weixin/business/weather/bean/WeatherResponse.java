package com.wbn.weixin.business.weather.bean;

import java.util.List;

public class WeatherResponse {

	private String city;
	private List<WeatherItem> weatherItem;
	private List<WeatherDateMate> weatherDateMate;

	
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<WeatherItem> getWeatherItem() {
		return weatherItem;
	}

	public void setWeatherItem(List<WeatherItem> weatherItem) {
		this.weatherItem = weatherItem;
	}

	public List<WeatherDateMate> getWeatherDateMate() {
		return weatherDateMate;
	}

	public void setWeatherDateMate(List<WeatherDateMate> weatherDateMate) {
		this.weatherDateMate = weatherDateMate;
	}
}
