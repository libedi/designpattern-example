package com.libedi.myproject.designpattern_weather;

import org.junit.Test;

import com.libedi.myproject.designpattern_weather.observer.CurrentConditionsDisplay;
import com.libedi.myproject.designpattern_weather.observer.CurrentConditionsDisplayByJDK;
import com.libedi.myproject.designpattern_weather.observer.HeatIndexDisplay;
import com.libedi.myproject.designpattern_weather.subject.WeatherData;
import com.libedi.myproject.designpattern_weather.subject.WeatherDataByJDK;

/**
 * chapter.2 기상 스테이션 테스트 
 * @author libedi
 *
 */
public class TestWeatherStation {
	
	/**
	 * 직접 구현한 옵저버 패턴
	 * @throws Exception
	 */
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
	
	/**
	 * Java 라이브러리를 이용한 옵저버 패턴
	 * @throws Exception
	 */
	@Test
	public void testWeatherByJDK() throws Exception{
		WeatherDataByJDK weatherData = new WeatherDataByJDK();
		
		CurrentConditionsDisplayByJDK currentDisplay = new CurrentConditionsDisplayByJDK(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
