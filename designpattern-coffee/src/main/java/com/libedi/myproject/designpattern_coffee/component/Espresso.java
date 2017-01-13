package com.libedi.myproject.designpattern_coffee.component;

/**
 * 에스프레소 클래스
 * @author libedi
 *
 */
public class Espresso extends Beverage {
	
	public Espresso(){
		this.description = "에스프레소";
	}
	
	/**
	 * 에스프레소 가격 계산
	 */
	@Override
	public double cost() {
		return 1.99;
	}

}
