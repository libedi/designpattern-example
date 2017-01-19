package com.libedi.myproject.designpattern_pizza.pizza;

public class ChicagoStyleClamPizza extends Pizza {
	public ChicagoStyleClamPizza(){
		this.setName("Chicago Style Deep Dish Clam Pizza");
		this.setDough("Extra Thick Crust Dough");
		this.setSauce("Plum Tomato Sauce");
		this.getToppings().add("Shredded Mozzarella Clam");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
