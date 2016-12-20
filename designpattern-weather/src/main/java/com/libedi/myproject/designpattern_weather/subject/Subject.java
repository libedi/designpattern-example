package com.libedi.myproject.designpattern_weather.subject;

import com.libedi.myproject.designpattern_weather.observer.Observer;

/**
 * 주제 인터페이스
 * @author libedi
 *
 */
public interface Subject {
	/**
	 * 옵저버 등록
	 * @param o
	 */
	void registerObserver(Observer o);
	/**
	 * 옵저버 제거
	 * @param o
	 */
	void removeObserver(Observer o);
	/**
	 * 주제 객체의 상태가 변경되었을 때, 옵저버들에게 알리기 위한 메소드
	 */
	void notifyObserver();
}
