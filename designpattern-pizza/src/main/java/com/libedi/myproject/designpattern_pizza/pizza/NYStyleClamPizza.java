package com.libedi.myproject.designpattern_pizza.pizza;

public class NYStyleClamPizza extends Pizza {
	public NYStyleClamPizza(){
		this.setName("NY Style Sauce and Clam Pizza");
		this.setDough("Thin Crust Dough");
		this.setSauce("Marinara Sauce");
		this.getToppings().add("Grated Reggiano Clam");
	}
}
