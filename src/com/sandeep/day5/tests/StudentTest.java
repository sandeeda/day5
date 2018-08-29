package com.sandeep.day5.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sandeep.day5.assignments.Student;
import com.sandeep.day5.exception.AgeNotWithinRangeException;
import com.sandeep.day5.exception.NameNotValidException;

class StudentTest {
	
	Student stu;

	
	@Test
	void testStudentWithValidInput() throws AgeNotWithinRangeException, NameNotValidException {
		stu = new Student(10, "Sandeep", 18, "CSE");
		assertNotNull(stu);
	}
	
	@Test
	void testStudentWithInvalidAge() {
		assertThrows(AgeNotWithinRangeException.class, ()->new Student(10, "sandeeep", 99, "B.Tech"));
	}
	@Test
	void testStudentWithInvalidName() {
		assertThrows(NameNotValidException.class,()->new Student(10, "a32dsfsd sad", 18, "BSC"));
	}

}
