package com.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.parameterize.test.PalindromeCheck;

public class PalindromeTest {
	
	@ParameterizedTest
	@ValueSource(strings= {"radar", "racecar", "madam", "liril"})
	public void testIsPalindrome(String str) {
		PalindromeCheck pc = new PalindromeCheck();
		boolean actual=pc.isPalindrome(str);
		assertTrue(actual);
	}

}
