package com.libedi.myproject.designpattern_duck.duck;

import com.libedi.myproject.designpattern_duck.fly.FlyNoWay;
import com.libedi.myproject.designpattern_duck.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck(){
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("저는 모형 오리입니다.");
	}

}
