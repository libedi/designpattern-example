package com.libedi.myproject.designpattern_coffee.decorator;

import com.libedi.myproject.designpattern_coffee.component.Beverage;

/**
 * 첨가물 데코레이터 추상 클래스
 * - Beverage 객체가 들어갈 자리에 들어갈 수 있어야 하므로,
 * - Beverage 클래스를 확장.
 * @author libedi
 *
 */
public abstract class CondimentDecorator extends Beverage {

	/**
	 * 모든 첨가물 데코레이터에서 getDescription() 메서드를 새로 구현하도록 만들 계획.
	 * : Beverage 객체의 getDescription() 를 확장할 수 있다.
	 */
	public abstract String getDescription();

}
