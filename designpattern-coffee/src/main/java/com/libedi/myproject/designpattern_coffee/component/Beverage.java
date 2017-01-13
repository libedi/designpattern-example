package com.libedi.myproject.designpattern_coffee.component;

/**
 * 음료 추상 클래스
 * @author libedi
 *
 */
public abstract class Beverage {
	String description = "제목 없음";

	public String getDescription() {
		return description;
	}
	
	/**
	 * 서브 클래스에서 구현해야할 메서드
	 * @return
	 */
	public abstract double cost();
}
