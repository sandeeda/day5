package com.sandeep.day5.assignments;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.sandeep.day5.exception.AgeNotWithinRangeException;
import com.sandeep.day5.exception.NameNotValidException;

public class Student {
	
	private int rollNo;
	private String name;
	private int age;
	private String course;
	public  Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
		super();
		this.rollNo = rollNo;
		 String expression = "^[a-zA-Z\\s]+"; 
		    if(name.matches(expression))    
	    this.name = name;
		else
			throw new NameNotValidException("Invalid name");
		if(age>=15 && age<=21)
		{
			this.age=age;
		}
		else
			throw new AgeNotWithinRangeException("invalid age for student");
		this.course = course;
		
		
		System.out.println("details===> name: "+this.name +"age: "+this.age+"roll no. "+this.rollNo+"course: "+this.course);
	}
	
	

}
