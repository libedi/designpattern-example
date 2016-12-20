package com.libedi.myproject.designpattern_weather.observer;

/**
 * 옵저버 인터페이스
 * - 주제 객체에서 옵저버한테 갱신된 정보를 제공하는 방법을 제공.
 * @author libedi
 *
 */
public interface Observer {
	/**
	 * 기상정보가 변경되었을 때, 옵저버한테 전달되는 상태값들
	 * @param temp
	 * @param humidity
	 * @param pressure
	 */
	void update(float temp, float humidity, float pressure);
}
