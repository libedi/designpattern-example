package com.libedi.myproject.designpattern_coffee.decorator;

import com.libedi.myproject.designpattern_coffee.component.Beverage;

/**
 * 휘핑 크림 데코레이터 클래스
 * @author libedi
 *
 */
public class Whip extends CondimentDecorator {
	private Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", 휘핑 크림";
	}

	@Override
	public double cost() {
		return .10 + this.beverage.cost();
	}

}
