package com.libedi.myproject.designpattern_pizza.ingrd;

/**
 * 원재료를 생산할 팩토리 인터페이스
 * @author libedi
 *
 */
public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
	/*
	 * 1. 지역별로 팩토리를 만듭니다. 각 생성 메소드를 구현하는 PizzaIngredientFactory 클래스를 만들어야 합니다.
	 * 2. ReggianoCheese, RedPeppers, ThickCrustDough와 같이 팩토리에서 사용할 원재료 클래스들을 구현합니다.
	 *    상황에 따라 서로 다른 지역에서 같은 재료 클래스를 쓸 수도 있습니다.
	 * 3. 그리고 나서 새로 만든 원재료 공장을 PizzaStore 코드에서 사용하도록 함으로써 모든 것을 하나로 묶어줘야 합니다.
	 */
}
