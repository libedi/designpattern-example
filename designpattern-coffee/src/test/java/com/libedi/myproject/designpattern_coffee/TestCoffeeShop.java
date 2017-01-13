package com.libedi.myproject.designpattern_coffee;

import org.junit.Test;

import com.libedi.myproject.designpattern_coffee.component.Beverage;
import com.libedi.myproject.designpattern_coffee.component.DarkRoast;
import com.libedi.myproject.designpattern_coffee.component.Espresso;
import com.libedi.myproject.designpattern_coffee.component.HouseBlend;
import com.libedi.myproject.designpattern_coffee.decorator.Mocha;
import com.libedi.myproject.designpattern_coffee.decorator.Soy;
import com.libedi.myproject.designpattern_coffee.decorator.Whip;

/**
 * 데코레이터 패턴을 적용한 스타버즈 커피숍 메뉴 주문 테스트
 * @author libedi
 *
 */
public class TestCoffeeShop {
	
	@Test
	public void testStarbuzzCoffee() throws Exception{
		/*
		 * 아무것도 넣치 않은 에스프레소 주문
		 */
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		/*
		 * 모카 2샷, 휘핑크림을 얹은 다크 로스트 커피요~
		 */
		Beverage beverage2 = new DarkRoast();	// DarkRoast 객체를 만든다.
		beverage2 = new Mocha(beverage2);		// Mocha 로 감싼다.
		beverage2 = new Mocha(beverage2);		// Mocha 하나 더 추가.
		beverage2 = new Whip(beverage2);		// Whip 으로 감싼다.
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		/*
		 * 두유, 모카 추가하고 휘핑 크림을 얹은 하우스 블렌드 커피 주문이요~
		 */
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
