package com.libedi.myproject.designpattern_pizza.store;

import com.libedi.myproject.designpattern_pizza.pizza.Pizza;

/**
 * 피자 스토어 추상 클래스
 * @author libedi
 *
 */
public abstract class PizzaStore {
	/**
	 * 피자 주문
	 * @param type
	 * @return
	 */
	public Pizza orderPizza(String type){
		// 피자 객체의 인스턴스를 만드는 일은 PizzaStore의 서브 클래스에 있는 createPizza() 메소드에서 처리.
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	/*
	 * 팩토리 메소드 선언
	 * : Pizza 인스턴스를 만드는 일은 이제 팩토리 역할을 하는 메소드에서 맡아서 처리.
	 */
	protected abstract Pizza createPizza(String type);
}
