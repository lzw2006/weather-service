package com.wbn.weixin.business.weather.bean;

public class WeatherItem {
	private String time;
	private String temperature;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return "time:" + this.time + " temperature:" + this.temperature;
	}
}
