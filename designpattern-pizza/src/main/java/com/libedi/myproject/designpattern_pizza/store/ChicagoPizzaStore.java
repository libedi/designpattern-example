package com.libedi.myproject.designpattern_pizza.store;

import com.libedi.myproject.designpattern_pizza.pizza.ChicagoStyleCheesePizza;
import com.libedi.myproject.designpattern_pizza.pizza.ChicagoStyleClamPizza;
import com.libedi.myproject.designpattern_pizza.pizza.ChicagoStylePepperoniPizza;
import com.libedi.myproject.designpattern_pizza.pizza.ChicagoStyleVeggiePizza;
import com.libedi.myproject.designpattern_pizza.pizza.Pizza;

/**
 * 시카고 피자 클래스
 * @author libedi
 *
 */
public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		} else if(type.equals("veggie")){
			return new ChicagoStyleVeggiePizza();
		} else if(type.equals("clam")){
			return new ChicagoStyleClamPizza();
		} else if(type.equals("pepperoni")){
			return new ChicagoStylePepperoniPizza();
		} else return null;
	}

}
