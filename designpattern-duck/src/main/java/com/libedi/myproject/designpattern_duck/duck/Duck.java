package com.libedi.myproject.designpattern_duck.duck;

import com.libedi.myproject.designpattern_duck.fly.FlyBehavior;
import com.libedi.myproject.designpattern_duck.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck(){
	}
	
	public abstract void display();
	
	public void performFly(){
		this.flyBehavior.fly();
	}
	
	public void performQuack(){
		this.quackBehavior.quack();
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void swim(){
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
	}
}
