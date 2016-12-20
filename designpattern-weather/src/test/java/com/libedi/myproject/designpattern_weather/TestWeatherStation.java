package com.libedi.myproject.designpattern_weather;

import org.junit.Test;

import com.libedi.myproject.designpattern_weather.observer.CurrentConditionsDisplay;
import com.libedi.myproject.designpattern_weather.observer.HeatIndexDisplay;
import com.libedi.myproject.designpattern_weather.subject.WeatherData;

public class TestWeatherStation {
	
	@Test
	public void testWeather() throws Exception{
		// 우선 WeatherData 객체 생성
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		HeatIndexDisplay heatDisplay = new HeatIndexDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
