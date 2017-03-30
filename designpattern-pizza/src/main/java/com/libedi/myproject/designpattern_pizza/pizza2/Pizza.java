package com.libedi.myproject.designpattern_pizza.pizza2;

import com.libedi.myproject.designpattern_pizza.ingrd.Cheese;
import com.libedi.myproject.designpattern_pizza.ingrd.Clams;
import com.libedi.myproject.designpattern_pizza.ingrd.Dough;
import com.libedi.myproject.designpattern_pizza.ingrd.Pepperoni;
import com.libedi.myproject.designpattern_pizza.ingrd.Sauce;
import com.libedi.myproject.designpattern_pizza.ingrd.Veggies;

/**
 * 원재료에 맞게 수정된 피자 추상 클래스
 * @author libedi
 *
 */
public abstract class Pizza {
	private String name;
	private Dough dough;
	private Sauce sauce;
	private Veggies[] veggies;
	private Cheese cheese;
	private Pepperoni pepperoni;
	private Clams clam;

	/*
	 * prepare() 메소드를 추상 메소드로 만듭니다.
	 * 이 부분에서 피자를 만드는 데 필요한 재료들을 정돈하게 됩니다.
	 * 물론 모든 원재료는 원재료 팩토리에서 가져오지요.
	 */
	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Dough getDough() {
		return dough;
	}
	public void setDough(Dough dough) {
		this.dough = dough;
	}
	public Sauce getSauce() {
		return sauce;
	}
	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}
	public Veggies[] getVeggies() {
		return veggies;
	}
	public void setVeggies(Veggies[] veggies) {
		this.veggies = veggies.clone();
	}
	public Cheese getCheese() {
		return cheese;
	}
	public void setCheese(Cheese cheese) {
		this.cheese = cheese;
	}
	public Pepperoni getPepperoni() {
		return pepperoni;
	}
	public void setPepperoni(Pepperoni pepperoni) {
		this.pepperoni = pepperoni;
	}
	public Clams getClam() {
		return clam;
	}
	public void setClam(Clams clam) {
		this.clam = clam;
	}
}
