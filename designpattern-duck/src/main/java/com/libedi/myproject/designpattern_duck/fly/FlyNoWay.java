package com.libedi.myproject.designpattern_duck.fly;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("저는 못날아요");
	}

}
