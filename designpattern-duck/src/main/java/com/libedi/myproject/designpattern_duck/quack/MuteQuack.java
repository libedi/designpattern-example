package com.libedi.myproject.designpattern_duck.quack;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("조용");
	}

}
