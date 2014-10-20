package com.wbn.weixin.business.weather.bean;

public class WeatherDateMate {
	private String cnDate;
	private String date;
	private String dayStatus;
	private String nightStatus;
	private String dayTemperature;
	private String nightTemperture;
	
	public String getCnDate() {
		return cnDate;
	}
	public void setCnDate(String cnDate) {
		this.cnDate = cnDate;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDayStatus() {
		return dayStatus;
	}
	public void setDayStatus(String dayStatus) {
		this.dayStatus = dayStatus;
	}
	public String getNightStatus() {
		return nightStatus;
	}
	public void setNightStatus(String nightStatus) {
		this.nightStatus = nightStatus;
	}
	public String getDayTemperature() {
		return dayTemperature;
	}
	public void setDayTemperature(String dayTemperature) {
		this.dayTemperature = dayTemperature;
	}
	public String getNightTemperture() {
		return nightTemperture;
	}
	public void setNightTemperture(String nightTemperture) {
		this.nightTemperture = nightTemperture;
	}
	
	@Override
	public String toString() {
	// TODO Auto-generated method stub
	return cnDate + " " + date + " 日间:" + dayStatus + dayTemperature + " 夜间:" + nightStatus + " " + nightTemperture;
	}
	
}
