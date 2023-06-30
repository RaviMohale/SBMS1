package com.ravi;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	Calculator c = new Calculator();
@Test
	public void testAdd() {
		
		
		
		int actualResult = c.add(1, 3);
		int expectedResult = 4;
		
		assertEquals(actualResult, expectedResult);
	
	}
@Test
public void testMul() {
	
	int actualResult = c.mul(2, 3);
	int expectedResult = 6;
	
	assertEquals(actualResult, expectedResult);
}


}
