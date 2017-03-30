package com.libedi.myproject.designpattern_pizza.ingrd.fac;

import com.libedi.myproject.designpattern_pizza.ingrd.Cheese;
import com.libedi.myproject.designpattern_pizza.ingrd.Clams;
import com.libedi.myproject.designpattern_pizza.ingrd.Dough;
import com.libedi.myproject.designpattern_pizza.ingrd.Pepperoni;
import com.libedi.myproject.designpattern_pizza.ingrd.PizzaIngredientFactory;
import com.libedi.myproject.designpattern_pizza.ingrd.Sauce;
import com.libedi.myproject.designpattern_pizza.ingrd.Veggies;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.BlackOlives;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.Eggplant;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.FrozenClams;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.MozzarellaCheese;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.Oregano;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.PlumTomatoSauce;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.SlicedPepperoni;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.Spinach;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.ThickCrustDough;

/**
 * 시카도 원재료 공장
 * @author libedi
 *
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Oregano(), new BlackOlives(), new Eggplant(), new Spinach() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
