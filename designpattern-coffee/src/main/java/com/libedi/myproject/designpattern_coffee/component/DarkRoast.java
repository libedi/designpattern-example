package com.libedi.myproject.designpattern_coffee.component;

/**
 * 다크 로스트 커피 클래스
 * @author libedi
 *
 */
public class DarkRoast extends Beverage {

	public DarkRoast(){
		this.description = "다크 로스트 커피";
	}
	
	@Override
	public double cost() {
		return .99;
	}

}
