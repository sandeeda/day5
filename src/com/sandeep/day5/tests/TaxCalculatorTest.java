package com.sandeep.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sandeep.day5.assignments.TaxCalculator;
import com.sandeep.day5.exception.CountryNotValidException;
import com.sandeep.day5.exception.EmployeeNameInvalidException;
import com.sandeep.day5.exception.TaxNotEligibleException;

class TaxCalculatorTest {
	/*TaxCalculator t;
	@BeforeEach
	void setUp()
	{
		t = new TaxCalculator();
	}*/
	@Test
	void testCalculateTaxWithValidInputs() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		assertEquals(9876.48, TaxCalculator.calculateTax("sandeep das", true, 123456),0.02);
		
	}
	
	
	@Test
	void testCalculateWithInvalidName()
	{
		EmployeeNameInvalidException e;
		e = assertThrows(EmployeeNameInvalidException.class, ()->TaxCalculator.calculateTax("", true, 123456));
		assertEquals("The employee name cannot be empty", e.getMessage());
		e = assertThrows(EmployeeNameInvalidException.class, ()->TaxCalculator.calculateTax(null, true, 123456));
		assertEquals("The employee name cannot be empty", e.getMessage());

	}
	
	@Test
	void testCalculateWithInvalidCountry()
	{
		CountryNotValidException e;
		e = assertThrows(CountryNotValidException.class, ()->TaxCalculator.calculateTax("sandeep", false, 123456));
		assertEquals("The employee should be an indian citizen for calculating tax", e.getMessage());
		e = assertThrows(CountryNotValidException.class, ()->TaxCalculator.calculateTax("shreya", false, 123456));
		assertEquals("The employee should be an indian citizen for calculating tax", e.getMessage());

	}

	
	@Test
	void testNotElligibleForTax()
	{
		TaxNotEligibleException e;
		e = assertThrows(TaxNotEligibleException.class, ()->TaxCalculator.calculateTax("sandeep", true, 123));
		assertEquals("The employee does not need to pay tax", e.getMessage());
		e = assertThrows(TaxNotEligibleException.class, ()->TaxCalculator.calculateTax("shreya", true, 123));
		assertEquals("The employee does not need to pay tax", e.getMessage());

	}

}
