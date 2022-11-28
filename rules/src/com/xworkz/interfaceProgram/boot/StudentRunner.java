package com.xworkz.interfaceProgram.boot;

import com.xworkz.interfaceProgram.ruler.School;
import com.xworkz.interfaceProgram.rule.Student;

public class StudentRunner {
	public static void main(String[] args) {

		Student student = new Student();
		System.out.println(student.name);
		student.homework();
		student.strength();
		student.uniform();
		Student.schoolName();
		Student.schoolName(null);
		student.noOfRooms();
		student.noOfSection();
		System.out.println(System.lineSeparator());
		School school = new Student();
		System.out.println(school.name);
		school.homework();
		school.strength();
		school.uniform();
		School.schoolName();
		school.noOfRooms();
		School.schoolName(null);
		school.noOfSection();
	}
}
