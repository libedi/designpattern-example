package com.libedi.myproject.designpattern_pizza.pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
	public ChicagoStylePepperoniPizza(){
		this.setName("Chicago Style Deep Dish Pepperoni Pizza");
		this.setDough("Extra Thick Crust Dough");
		this.setSauce("Plum Tomato Sauce");
		this.getToppings().add("Shredded Mozzarella Pepperoni");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
