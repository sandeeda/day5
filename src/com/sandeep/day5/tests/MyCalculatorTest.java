package com.sandeep.day5.tests;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.sandeep.day5.MyCalculator;

class MyCalculatorTest {

	@Test
	void testPowerWithValidInput() throws Exception {
		assertEquals(243, MyCalculator.power(3,5));
		assertEquals(16, MyCalculator.power(2,4));
		assertEquals(32, MyCalculator.power(2,5));
	}
	
	
	@Test
	void testPowerWithZeroInputs() {
		Exception e1;

		Executable e = () -> MyCalculator.power(0,0);
		assertThrows(Exception.class , e);
		
		e1=assertThrows(Exception.class , ()->MyCalculator.power(0,0));
		assertEquals("n and p should not be zero", e1.getMessage());
	}
	
	
	
	@Test
	void testPowerWithNegativeInputs()
	{
		Exception e1;
		String result="n and p should not be negative";
		e1=assertThrows(Exception.class , ()->MyCalculator.power(-2,-5));
		assertEquals(result, e1.getMessage());

		
		e1=assertThrows(Exception.class , ()->MyCalculator.power(-2,5));
		assertEquals(result, e1.getMessage());
		
		
		e1=assertThrows(Exception.class , ()->MyCalculator.power(2,-5));
		assertEquals(result, e1.getMessage());
	}

}

