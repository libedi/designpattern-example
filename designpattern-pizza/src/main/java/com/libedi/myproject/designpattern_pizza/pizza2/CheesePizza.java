package com.libedi.myproject.designpattern_pizza.pizza2;

import com.libedi.myproject.designpattern_pizza.ingrd.PizzaIngredientFactory;

/**
 * 치즈 피자 클래스
 * : 팩토리 메소드 패턴을 이용한 코드는 NYCheesePizza와 ChicagoCheesePizze로 나뉘었다.
 * : 두 클래스는 지역별로 다른 재료를 사용한다는 점을 빼면 다른 점이 없다.
 * : 따라서 피자마다 클래스를 지역별로 따로 만들 필요가 없다.
 * : 지역별로 다른 점은 원재료 공장에서 커버해준다.
 * @author libedi
 *
 */
public class CheesePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	
	/**
	 * 이제 피자를 만들기 위해 원재료를 제공하는 공장이 필요하다.
	 * 따라서 각 피자 클래스에서는 생성자를 통해서 팩토리를 전달받는다.
	 * 이 팩토리는 인스턴스 변수에 저장하면 된다.
	 */
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	/**
	 * 팩토리가 작동하는 부분
	 * : prepare() 메소드에서 치즈 피자를 만들기 위한 각 단계를 처리.
	 * : 재료가 필요할 때마다 팩토리에 있는 메소드를 호출해서 만듦.
	 */
	@Override
	public void prepare() {
		System.out.println("Preparing " + this.getName());
		this.setDough(this.ingredientFactory.createDough());
		this.setSauce(this.ingredientFactory.createSauce());
		this.setCheese(this.ingredientFactory.createCheese());
	}
}
