package com.wbn.weixin.business.weather.activator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.wbn.weixin.business.weather.bean.WeatherDateMate;
import com.wbn.weixin.business.weather.bean.WeatherItem;
import com.wbn.weixin.business.weather.bean.WeatherRequest;
import com.wbn.weixin.business.weather.bean.WeatherResponse;

public class WeatherActivator {
	private String url;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public WeatherResponse rtrvWeatherContent(WeatherRequest req)
			throws IOException {
		String city = req.getCity();
		String url = this.url + "?code=" + city +"&vt=4";
		
		Document doc = Jsoup.connect(url).timeout(5000).get();
		// File input = new File("doc/weather.htm");
		//Document doc = Jsoup.parse(input, "UTF-8", "http://weather1.sina.cn/");

		// Retrieve weather list
		List<WeatherItem> listItems = rtrvWeatherItemList(doc);
		List<WeatherDateMate> listDateMates = rtrvWeatherDateMate(doc);

		WeatherResponse resp = new WeatherResponse();
		resp.setWeatherItem(listItems);
		resp.setWeatherDateMate(listDateMates);

		return resp;
	}

	private List<WeatherItem> rtrvWeatherItemList(Document doc) {

		Elements list = doc.select("#scroller div");
		List<WeatherItem> weatherItemList = new ArrayList<WeatherItem>();

		for (Element src : list) {

			WeatherItem item = new WeatherItem();
			Elements children = src.children();

			for (int i = 0; i < children.size(); i++) {
				Element el = children.get(i);
				if (i == 0) {
					item.setTime(el.text());
				} else if (i == 2) {
					item.setTemperature(el.text());
				} else {
					// do nothing
				}
			}

			weatherItemList.add(item);
		}

		return weatherItemList;
	}

	private List<WeatherDateMate> rtrvWeatherDateMate(Document doc) {
		Elements list = doc.select("ul.weather_datemate li");
		List<WeatherDateMate> weatherDateMate = new ArrayList<WeatherDateMate>();

		for (Element src : list) {
			WeatherDateMate dateMate = new WeatherDateMate();
			Elements children = src.children();
			for (int i = 0; i < children.size(); i++) {
				Elements subElements = children.get(i).children();
				if (i == 0) {
					dateMate.setCnDate(subElements.get(0).text());
					dateMate.setDate(subElements.get(1).text());
				} else if (i == 1) {
					dateMate.setDayStatus(subElements.get(0).text());
					dateMate.setNightStatus(subElements.get(1).text());
				} else if (i == 3) {
					dateMate.setDayTemperature(subElements.get(0).text());
					dateMate.setNightTemperture(subElements.get(1).text());
				} else {
					// do nothing
				}
			}
			weatherDateMate.add(dateMate);
		}

		return weatherDateMate;
	}
}