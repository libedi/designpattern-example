package com.libedi.myproject.designpattern_coffee.decorator;

import com.libedi.myproject.designpattern_coffee.component.Beverage;

/**
 * 모카 데코레이터 클래스
 * : 데코레이터 이므로 CondimentDecorator 를 확장.
 * @author libedi
 *
 */
public class Mocha extends CondimentDecorator {
	/*
	 * Mocha 인스턴스에는 Beverage에 대한 레퍼런스 두가지가 있다.
	 * 아래 참조 
	 */
	
	/**
	 * 1. 감싸고자 하는 음료를 저장하기 위한 인스턴스 변수
	 */
	private Beverage beverage;
	/**
	 * 2. 인스턴스 변수를 감싸고자 하는 객체로 설정하기 위한 생성자.
	 * : 데코레이터의 생성자에 감싸고자 하는 음료 객체를 전달하는 방식을 사용. 
	 * @param beverage
	 */
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}

	/**
	 * 음료의 description 을 확장해보자.
	 */
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", 모카";
	}

	@Override
	public double cost() {
		return .20 + this.beverage.cost();
	}

}
