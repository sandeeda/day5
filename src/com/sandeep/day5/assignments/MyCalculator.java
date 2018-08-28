package com.sandeep.day5.assignments;

import com.sandeep.day5.exception.AnyOneNumberIsNegativeException;
import com.sandeep.day5.exception.BothNumbersAreNegativeException;

public class MyCalculator {
	
	
	public long power(int n,int p ) throws BothNumbersAreNegativeException,AnyOneNumberIsNegativeException
	{
		if(n<=0 && p<=0)
		{
			throw new BothNumbersAreNegativeException("n and p should not be zero");
		}
		
		else if(n<=0 || p<=0)
		{
			throw new AnyOneNumberIsNegativeException("n or p should not be negative");
		}
		
			
		return (long) Math.pow(n, p);
	}

}
