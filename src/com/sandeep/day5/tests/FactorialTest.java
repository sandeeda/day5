package com.sandeep.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day5.Factorial;
import com.sandeep.day5.exception.InvalidInputException;

class FactorialTest {

	@Test
	void testGetFactorialWithValidInput() throws InvalidInputException {
		assertEquals(6, Factorial.getFactorial(3));
	}

}
