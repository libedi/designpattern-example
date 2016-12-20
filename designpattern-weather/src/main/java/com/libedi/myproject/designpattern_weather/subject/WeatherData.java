package com.libedi.myproject.designpattern_weather.subject;

import java.util.ArrayList;
import java.util.List;

import com.libedi.myproject.designpattern_weather.observer.Observer;

public class WeatherData implements Subject {
	private List<Observer> observers;	// 옵저버 객체들을 저장하기 위한 List
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		this.observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = this.observers.indexOf(o);
		if(i >= 0){
			this.observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		// 등록된 모든 옵저버들에게 상태값을 알려준다.
		for(Observer observer : this.observers){
			observer.update(temperature, humidity, pressure);
		}
	}
	
	/**
	 * 기상 스테이션으로부터 갱신된 측정치를 받으면 옵저버들에게 알림.
	 */
	public void measurementsChanged(){
		this.notifyObserver();
	}
	
	/**
	 * 테스트용 : 기상장비로부터 데이터 가져오는 메서드
	 * @param temperature
	 * @param humidity
	 * @param pressure
	 */
	public void setMeasurements(float temperature, float humidity, float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}

}
