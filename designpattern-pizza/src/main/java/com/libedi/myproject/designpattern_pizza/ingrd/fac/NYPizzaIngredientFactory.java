package com.libedi.myproject.designpattern_pizza.ingrd.fac;

import com.libedi.myproject.designpattern_pizza.ingrd.Cheese;
import com.libedi.myproject.designpattern_pizza.ingrd.Clams;
import com.libedi.myproject.designpattern_pizza.ingrd.Dough;
import com.libedi.myproject.designpattern_pizza.ingrd.Pepperoni;
import com.libedi.myproject.designpattern_pizza.ingrd.PizzaIngredientFactory;
import com.libedi.myproject.designpattern_pizza.ingrd.Sauce;
import com.libedi.myproject.designpattern_pizza.ingrd.Veggies;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.FreshClams;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.Garlic;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.MarinaraSauce;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.Mushroom;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.Onion;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.RedPepper;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.ReggianoCheese;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.SlicedPepperoni;
import com.libedi.myproject.designpattern_pizza.ingrd.impl.ThinCrustDough;

/**
 * 뉴욕 원재료 공장
 * - 이 팩토리에서는 마리나라 소스, 레지아노 치즈, 신선한 조개 등을 전문적으로 생산
 * @author libedi
 *
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
