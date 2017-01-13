package com.libedi.myproject.designpattern_coffee.decorator;

import com.libedi.myproject.designpattern_coffee.component.Beverage;

/**
 * 두유 데코레이터 클래스
 * @author libedi
 *
 */
public class Soy extends CondimentDecorator {
	private Beverage beverage;
	
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", 두유";
	}

	@Override
	public double cost() {
		return .15 + this.beverage.cost();
	}

}
