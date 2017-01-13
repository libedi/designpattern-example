package com.libedi.myproject.designpattern_coffee.component;

/**
 * 디카페인 커피 클래스
 * @author libedi
 *
 */
public class Decaf extends Beverage {

	public Decaf(){
		this.description = "디카페인 커피";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
