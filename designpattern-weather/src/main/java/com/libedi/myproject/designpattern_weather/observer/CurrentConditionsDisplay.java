package com.libedi.myproject.designpattern_weather.observer;

import com.libedi.myproject.designpattern_weather.subject.Subject;

/**
 * 현재 조건을 표시하는 디스플레이
 * @author libedi
 *
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;	// 주제 객체에서 등록,삭제를 위한 레퍼런스

	/**
	 * 생성자에 weatherData라는 주제객체가 전달되며, 그 객체를 써서 디스플레이를 옵저버에 등록.
	 * @param weatherData
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	/**
	 * 기온과 습도를 저장하고, display() 호출
	 */
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.display();
	}
	
	/**
	 * 가장 최근에 얻은 기온과 습도 표시
	 */
	@Override
	public void display() {
		System.out.println("Current conditions : " + this.temperature + "F degrees and " + this.humidity + "% humidity");
	}

}
