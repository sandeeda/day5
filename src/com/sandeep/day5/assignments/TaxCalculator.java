package com.sandeep.day5.assignments;

import com.sandeep.day5.exception.CountryNotValidException;
import com.sandeep.day5.exception.EmployeeNameInvalidException;
import com.sandeep.day5.exception.TaxNotEligibleException;

public class TaxCalculator {

	public static double calculateTax(String empName,boolean isIndian,double empSal) throws CountryNotValidException,EmployeeNameInvalidException,TaxNotEligibleException
	{
		double taxAmount=0;
		if(isIndian==false)
			throw new CountryNotValidException("The employee should be an indian citizen for calculating tax");
		else if(empName==null||empName.equals(""))
			throw new EmployeeNameInvalidException("The employee name cannot be empty");
		else
		{
			if(empSal>100000 && isIndian)
			{
				taxAmount=empSal*0.08;
			}
			else if(empSal>50000 && empSal<=100000 && isIndian)
			{
				taxAmount=empSal*0.06;
			}
			else if(empSal>30000 && empSal<=50000 && isIndian)
			{
				taxAmount=empSal*0.05;
			}
			else if(empSal>10000 && empSal<=30000 && isIndian)
			{
				taxAmount=empSal*0.04;
			}
			else
			{
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			}
							
		}
		
		return taxAmount;
		
	}
	

}
