package com.libedi.myproject.designpattern_weather.subject;

import java.util.Observable;

/**
 * java.util.Observable 을 상속한 WeatherData 클래스
 * @author libedi
 *
 */
public class WeatherDataByJDK extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;
	
	// 이제 옵저버들을 저장할 필요가 없다.
	public WeatherDataByJDK() {}
	
	public void measurementsChanged(){
		/*
		 * notifyObservers() 호출하기 전에 setChanged()를 호출해서
		 * 상태가 바뀐것을 알린다.
		 */
		super.setChanged();
		/*
		 * notifyObservers() 에 파라미터 객체를 보내지 않는다.
		 * Push 방식이 아닌, Pull 방식을 사용함을 의미.
		 */
		super.notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
}
