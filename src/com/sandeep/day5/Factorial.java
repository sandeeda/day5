package com.sandeep.day5;

import com.sandeep.day5.exception.FactorialException;
import com.sandeep.day5.exception.InvalidInputException;

public class Factorial {

	public static int getFactorial(int num) throws InvalidInputException, FactorialException {
		int result = 1;
		if(num<2)
			throw new InvalidInputException("number less than two");
		

		for(int i=1;i<=num;i++)
		{
			if(result>result+result)
				throw new FactorialException("number too long for int");
			else
				result*=i;
			
		}
		
		return result;
	}

}
