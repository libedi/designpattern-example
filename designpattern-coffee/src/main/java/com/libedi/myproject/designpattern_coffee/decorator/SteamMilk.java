package com.libedi.myproject.designpattern_coffee.decorator;

import com.libedi.myproject.designpattern_coffee.component.Beverage;

/**
 * 스팀 밀크 데코레이터 클래스
 * @author libedi
 *
 */
public class SteamMilk extends CondimentDecorator {
	private Beverage beverage;
	
	public SteamMilk(Beverage beverage){
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", 스팀 밀크";
	}

	@Override
	public double cost() {
		return .10 + this.beverage.cost();
	}

}
