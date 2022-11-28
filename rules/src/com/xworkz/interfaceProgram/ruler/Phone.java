package com.xworkz.interfaceProgram.ruler;

public interface Phone {

	boolean makeCall();
	boolean camera();
	double price();
	int size();
	static String companyName() {
		System.out.println("static method");
		return "name";
	}
}
