package com.xworkz.interfaceProgram.ruler;

public interface Hospital {

	default String HospitalName() {
		return null;
	}

	default void location() {
		System.out.println("default method");
	}

	double noOfStaffs();

	boolean pharmacy();

	default void noOfpatients() {
System.out.println("default method");
	}
	void display();

}