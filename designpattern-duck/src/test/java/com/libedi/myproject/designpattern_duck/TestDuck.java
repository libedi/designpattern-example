package com.libedi.myproject.designpattern_duck;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.libedi.myproject.designpattern_duck.duck.Duck;
import com.libedi.myproject.designpattern_duck.duck.MallardDuck;

public class TestDuck {
	private Duck duck;
	
	@Before
	public void setUp() throws Exception{
		this.duck = new MallardDuck();
	}
	
	@Test
	public void testMockCreation() throws Exception{
		assertNotNull(this.duck);
	}
	
	@Test
	public void testMallardDuck() throws Exception{
		this.duck.performFly();
		this.duck.performQuack();
	}
}
