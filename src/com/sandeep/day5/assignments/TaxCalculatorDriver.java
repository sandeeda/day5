package com.sandeep.day5.assignments;

import java.util.Scanner;

import com.sandeep.day5.exception.CountryNotValidException;
import com.sandeep.day5.exception.EmployeeNameInvalidException;
import com.sandeep.day5.exception.TaxNotEligibleException;

public class TaxCalculatorDriver {

	public static void main(String[] args) {
		
		String name;
		String ans;
		boolean isIndian;
		double empSal,tax;
		TaxCalculator taxcal=new TaxCalculator();
		try(Scanner in = new Scanner(System.in))
		{
			
			tax=taxcal.calculateTax("sandeep das", true, 123456);
			System.out.println("Tax amount is : "+tax);
			
			
		}
		catch(TaxNotEligibleException|EmployeeNameInvalidException|CountryNotValidException e)
		{
			if(e instanceof TaxNotEligibleException)
			{
				System.out.println(e.getMessage());
			}
			if(e instanceof CountryNotValidException)
			{
				System.out.println(e.getMessage());
			}
			if(e instanceof EmployeeNameInvalidException)
			{
				System.out.println(e.getMessage());
			}
		}

	}

}
