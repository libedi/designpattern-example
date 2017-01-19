package com.libedi.myproject.designpattern_pizza.pizza;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza(){
		this.setName("Chicago Style Deep Dish Veggie Pizza");
		this.setDough("Extra Thick Crust Dough");
		this.setSauce("Plum Tomato Sauce");
		this.getToppings().add("Shredded Mozzarella Veggie");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
