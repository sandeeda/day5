package com.sandeep.day5.assignments;

import java.util.Scanner;

import com.sandeep.day5.exception.AnyOneNumberIsNegativeException;
import com.sandeep.day5.exception.BothNumbersAreNegativeException;

public class MyCalculatorMain {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int n,p;
		MyCalculator calc= new MyCalculator();
		try(Scanner in=new Scanner(System.in))
		{
			System.out.println("enter base");
			n=in.nextInt();
			System.out.println("enter power");
			p=in.nextInt();
			if((n<=10 && n>=-10) && (p<=10 && p>=-10))
			
			System.out.println(calc.power(n, p));
		}
		catch(AnyOneNumberIsNegativeException|BothNumbersAreNegativeException e)
		{
			if(e instanceof AnyOneNumberIsNegativeException)
			{
				System.out.println(e.toString());
			}
			else if(e instanceof BothNumbersAreNegativeException)
			{
				System.out.println(e.toString());
			}
		}
	}

}
