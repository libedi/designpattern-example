package com.libedi.myproject.designpattern_weather.observer;

import java.util.Observable;
import java.util.Observer;

import com.libedi.myproject.designpattern_weather.subject.WeatherDataByJDK;

/**
 * java.util.Observer 를 구현한 CurrentConditionsDisplay 클래스
 * @author libedi
 *
 */
public class CurrentConditionsDisplayByJDK implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;

	/*
	 * Obseravable 을 인자로 받아 옵저버 등록.
	 */
	public CurrentConditionsDisplayByJDK(Observable o) {
		this.observable = o;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherDataByJDK){
			WeatherDataByJDK weatherData = (WeatherDataByJDK) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.display();
		}
	}
	
	/**
	 * 가장 최근에 얻은 기온과 습도 표시
	 */
	@Override
	public void display() {
		System.out.println("Current conditions : " + this.temperature + "F degrees and " + this.humidity + "% humidity");
	}

}
