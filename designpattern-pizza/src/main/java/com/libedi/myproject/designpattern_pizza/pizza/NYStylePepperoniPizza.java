package com.libedi.myproject.designpattern_pizza.pizza;

public class NYStylePepperoniPizza extends Pizza {
	public NYStylePepperoniPizza(){
		this.setName("NY Style Sauce and Pepperoni Pizza");
		this.setDough("Thin Crust Dough");
		this.setSauce("Marinara Sauce");
		this.getToppings().add("Grated Reggiano Pepperoni");
	}
}
