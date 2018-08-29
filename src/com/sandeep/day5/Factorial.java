package com.sandeep.day5;

import com.sandeep.day5.exception.InvalidInputException;

public class Factorial {

	public static int getFactorial(int num) throws InvalidInputException {
		int result = 1;
		if(num<2)
			throw new InvalidInputException("number less than two");
		
		int max=Integer.MAX_VALUE;

		for(int i=num;i>=1;i--)
		{
			if(result>result*i)
			result*=i;
			
		}
		
		return result;
	}

}
