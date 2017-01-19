package com.libedi.myproject.designpattern_pizza.store;

import com.libedi.myproject.designpattern_pizza.pizza.NYStyleCheesePizza;
import com.libedi.myproject.designpattern_pizza.pizza.NYStyleClamPizza;
import com.libedi.myproject.designpattern_pizza.pizza.NYStylePepperoniPizza;
import com.libedi.myproject.designpattern_pizza.pizza.NYStyleVeggiePizza;
import com.libedi.myproject.designpattern_pizza.pizza.Pizza;

/**
 * 뉴욕 피자 스토어 클래스
 * : NYPizzaStore 는 PizzaStore를 확장하기 때문에
 * : orderPizza() 메소드도 자동으로 상속받게 된다.
 * @author libedi
 *
 */
public class NYPizzaStore extends PizzaStore {

	/**
	 * 피자 생성
	 * 1. createPizza() 에서는 Pizza 객체를 리턴하며,
	 *   Pizza의 서브클래스 가운데 어느 구상 클래스 객체의 인스턴스를 만들어 리턴할지는
	 *   전적으로 PizzaStore의 서브 클래스에 의해 결정된다.
	 * 2. createPizza() 는 PizzaStore 에서 추상 메소드로 선언되었기 때문에,
	 *   구상 클래스에서 반드시 구현해야 한다.
	 */
	@Override
	protected Pizza createPizza(String type) {
		/*
		 * 구상 클래스의 객체를 생성.
		 * 각 피자 종류에 해당하는 뉴욕풍 피자를 생성해서 리턴.
		 */
		if(type.equals("cheese")){
			return new NYStyleCheesePizza();
		} else if(type.equals("veggie")){
			return new NYStyleVeggiePizza();
		} else if(type.equals("clam")){
			return new NYStyleClamPizza();
		} else if(type.equals("pepperoni")){
			return new NYStylePepperoniPizza();
		} else return null;
	}

}
