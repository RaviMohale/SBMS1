package com.ravi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class StringUtilstest {
	
	private StringUtils su = new StringUtils();
	
	@Test
	public void testStringToInt1() {
		
		Integer actual = su.stringToInt("123");
		Integer expected = 123;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testStringToInt2() {
		assertThrows(IllegalArgumentException.class, ()-> su.stringToInt(null));
	}
	@Test
	public void testStringToInt3() {
		assertThrows(IllegalArgumentException.class, ()-> su.stringToInt(""));
	}
}
