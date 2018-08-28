package com.sandeep.day5.assignments;

import com.sandeep.day5.exception.AgeNotWithinRangeException;
import com.sandeep.day5.exception.NameNotValidException;

public class StudentDriver {

	public static void main(String[] args) {
		
		
		try {
			Student student=new Student(45, "sandeep Das", 99, "CSE");
		} catch (AgeNotWithinRangeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		} catch (NameNotValidException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}

	}
	

}
