package com.libedi.myproject.designpattern_duck;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.libedi.myproject.designpattern_duck.duck.Duck;
import com.libedi.myproject.designpattern_duck.duck.MallardDuck;
import com.libedi.myproject.designpattern_duck.duck.ModelDuck;
import com.libedi.myproject.designpattern_duck.fly.FlyRocketPowered;

public class TestDuck {
	private Duck mallard;
	private Duck model;
	
	@Before
	public void setUp() throws Exception{
		this.mallard = new MallardDuck();
		this.model = new ModelDuck();
	}
	
	@Test
	public void testMockCreation() throws Exception{
		assertNotNull(this.mallard);
		assertNotNull(this.model);
	}
	
	@Test
	public void testMallardDuck() throws Exception{
		this.mallard.performFly();
		this.mallard.performQuack();
		
		this.model.performFly();
		this.model.setFlyBehavior(new FlyRocketPowered());
		this.model.performFly();
	}
}
