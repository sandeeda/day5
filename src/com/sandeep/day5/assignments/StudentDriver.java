package com.sandeep.day5.assignments;

import com.sandeep.day5.exception.AgeNotWithinRangeException;
import com.sandeep.day5.exception.NameNotValidException;

public class StudentDriver {

	public static void main(String[] args) {
		
		
		try {
			Student student=new Student(45, "sandeep Das", 18, "CSE");
		} catch (AgeNotWithinRangeException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (NameNotValidException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}

	}
	

}
