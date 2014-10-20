package com.wbn.weixin.business.weather.service;

import com.wbn.weixin.business.weather.bean.WeatherRequest;
import com.wbn.weixin.business.weather.bean.WeatherResponse;

public interface WeatherService {
	public WeatherResponse rtrvWeather(WeatherRequest req);
}
