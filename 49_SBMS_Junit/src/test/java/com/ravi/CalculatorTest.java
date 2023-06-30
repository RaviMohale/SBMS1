package com.ravi;

import org.junit.jupiter.api.Test;

import com.ravi.service.Calculator;

public class CalculatorTest {

	@Test
public void testAdd() {
		
		Calculator c = new Calculator();
		
		int actualResult = c.add(1, 3);
		int expectedResult = 3;
		assertEquals(actualResult,expectedResult);
	
	}

	private void assertEquals(int actualResult, int expectedResult) {
		// TODO Auto-generated method stub
		
	}

}
