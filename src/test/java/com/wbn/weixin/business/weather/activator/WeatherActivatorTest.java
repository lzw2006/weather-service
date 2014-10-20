package com.wbn.weixin.business.weather.activator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wbn.weixin.business.weather.bean.WeatherRequest;
import com.wbn.weixin.business.weather.bean.WeatherResponse;
import com.wbn.weixin.business.weather.service.WeatherService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/com/wbn/weixin/business/weather/spring-integration-context.xml" })
public class WeatherActivatorTest {
	@Autowired
	private WeatherService service;

	@Test
	public void testRtrvWeatherSuccess() {
		WeatherRequest req = new WeatherRequest();
		req.setCity("shanghai");
		WeatherResponse resp = service.rtrvWeather(req);
		System.out.println(resp.getWeatherDateMate());
		System.out.println(resp.getWeatherItem());
		assertNotNull(resp.getWeatherDateMate());
		assertNotNull(resp.getWeatherItem());
	}
}
