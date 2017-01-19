package com.libedi.myproject.designpattern_pizza;

import org.junit.Test;

import com.libedi.myproject.designpattern_pizza.pizza.Pizza;
import com.libedi.myproject.designpattern_pizza.store.ChicagoPizzaStore;
import com.libedi.myproject.designpattern_pizza.store.NYPizzaStore;
import com.libedi.myproject.designpattern_pizza.store.PizzaStore;

/**
 * 피자 스토어 테스트
 * : 팩토리 메소드 패턴
 * @author libedi
 *
 */
public class PizzaStoreTest {
	
	@Test
	public void testPizzaStore() throws Exception{
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName());
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName());
	}
}
