package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.School;

public class Student implements School {

	
	@Override
	public String homework() {
		System.out.println("abstract method");
		return null;
	}

	@Override
	public boolean uniform() {
		System.out.println("abstract method");
		return false;
	}

	@Override
	public int strength() {
		System.out.println("abstract method");
		return 0;
	}

	public static void schoolName() {
		System.out.println("static method");
	}

	public static void schoolName(String principal) {
		System.out.println("static method with arguments");
	}

	@Override
	public void noOfRooms() {
		System.out.println("no return type");

	}

}
