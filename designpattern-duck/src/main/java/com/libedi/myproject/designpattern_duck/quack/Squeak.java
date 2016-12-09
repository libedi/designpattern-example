package com.libedi.myproject.designpattern_duck.quack;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("삑");
	}

}
