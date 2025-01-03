package com.app.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		Integer actualResult=calc.add(10, 20);
		assertEquals(30, actualResult);
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		Integer actualResult=calc.multiply(10, 20);
		Integer expectedResult=200;
		assertEquals(actualResult, expectedResult);
	}

}
