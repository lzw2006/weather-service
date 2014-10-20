package com.wbn.weixin.business.weather.bean;

import java.util.List;

public class WeatherResponse {

	List<WeatherItem> weatherItem;
	List<WeatherDateMate> weatherDateMate;

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
