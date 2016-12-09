package com.libedi.myproject.designpattern_duck.fly;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날고 있어요!");
	}

}
