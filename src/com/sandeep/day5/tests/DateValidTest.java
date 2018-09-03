package com.sandeep.day5.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.sandeep.day5.DateValid;
import com.sandeep.day5.InvalidDayException;
import com.sandeep.day5.exception.InvalidMonthException;

class DateValidTest extends Exception{

	@Test
	void testMyDateWithValidInput() throws InvalidMonthException, InvalidDayException {
		assertNotNull(new DateValid(1,2,2016));
	}

	@Test
	void testMyDateWithInvalidDate()  {
//		assertNotNull(new MyDate(32,2,2016));
		assertThrows(InvalidDayException.class, ()->new DateValid(32,2,2016));
	}
	
	@Test
	void testMyDateWithInvalidMonth()  {
		assertThrows(InvalidMonthException.class, ()->new DateValid(30,15,2016));
	}

}
