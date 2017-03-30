package com.libedi.myproject.designpattern_pizza.pizza2;

import com.libedi.myproject.designpattern_pizza.ingrd.PizzaIngredientFactory;

/**
 * 조개 피자 클래스
 * @author libedi
 *
 */
public class ClamPizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	
	/**
	 * 조개 피자에서도 마찬가지로 원재료 팩토리를 이용합니다.
	 * @param ingredientFactory
	 */
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	/**
	 * prepare() 메소드에서는 조개 피자를 만들기 위해 필요한 재료들을 자기 지역의 팩토리로부터 가져옵니다.
	 */
	@Override
	public void prepare() {
		System.out.println("Preparing " + this.getName());
		this.setDough(this.ingredientFactory.createDough());
		this.setSauce(this.ingredientFactory.createSauce());
		this.setCheese(this.ingredientFactory.createCheese());
		// 뉴욕 팩토리에서는 신선한 조개를 만들어주지만, 시카고 팩토리에서는 냉동 조개를 사용할 겁니다.
		this.setClam(this.ingredientFactory.createClam());
	}

}
