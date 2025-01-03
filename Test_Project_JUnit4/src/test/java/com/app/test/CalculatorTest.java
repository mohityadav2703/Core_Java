package com.app.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.test.Calculator;

public class CalculatorTest {
	
	public static Calculator calc=null;
	
	@BeforeClass
	public  static void init() {
		calc=new Calculator();
	}
	
	@AfterClass
	public static void destroy() {
		calc=null;
	}
	

	@Test
	public void testAdd() {
		Integer actualResult=calc.add(10, 20);
		Integer expectedResult=30;
		assertEquals(actualResult, expectedResult);
	}
	
	@Test
	public void testMultiply() {
		Integer actualResult=calc.multiply(10, 20);
		Integer expectedResult=200;
		assertEquals(actualResult, expectedResult);
	}
}
