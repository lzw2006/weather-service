package com.wbn.weixin.business.weather.activator;

import com.wbn.weixin.business.weather.bean.WeatherRequest;
import com.wbn.weixin.business.weather.bean.WeatherResponse;

public class StoreActivator {
	public Object get(WeatherRequest req) {
		return new WeatherResponse();
	}
	
	public void set(WeatherResponse resp) {
//		CacheManager cacheManager = CacheManager.getInstance();
//		Cache cache = cacheManager.getCache("CACHE1");
//		cache.put(new Element(resp.getCity(), resp));
	}
}
