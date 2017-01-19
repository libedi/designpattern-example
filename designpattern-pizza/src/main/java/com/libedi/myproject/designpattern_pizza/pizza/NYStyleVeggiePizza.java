package com.libedi.myproject.designpattern_pizza.pizza;

public class NYStyleVeggiePizza extends Pizza {
	public NYStyleVeggiePizza(){
		this.setName("NY Style Sauce and Veggie Pizza");
		this.setDough("Thin Crust Dough");
		this.setSauce("Marinara Sauce");
		this.getToppings().add("Grated Reggiano Veggie");
	}
}
