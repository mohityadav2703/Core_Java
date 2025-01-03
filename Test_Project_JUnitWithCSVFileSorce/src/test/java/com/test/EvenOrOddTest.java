package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
public class EvenOrOddTest {
	
	@ParameterizedTest
	@CsvFileSource(resources= "/data.csv", numLinesToSkip = 1)
	void evenOddTest(String input, String expected) {
		System.out.println(input);
		EvenOdd eo = new EvenOdd();
		String actual=eo.evenOrOddNum(Integer.parseInt(input));
		assertEquals(expected,actual);
	}

}
