package com.libedi.myproject.designpattern_pizza.pizza;

public class NYStyleCheesePizza extends Pizza {
	public NYStyleCheesePizza(){
		this.setName("NY Style Sauce and Cheese Pizza");
		this.setDough("Thin Crust Dough");
		this.setSauce("Marinara Sauce");
		this.getToppings().add("Grated Reggiano Cheese");
	}
}
