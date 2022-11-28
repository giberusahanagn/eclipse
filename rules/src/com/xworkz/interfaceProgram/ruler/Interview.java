package com.xworkz.interfaceProgram.ruler;

public interface Interview {
	String name();

	boolean eduaction();

	default String role() {
		System.out.println("role default method");
		return "Sde";
	}

	double salary();

	static String companyName() {
		System.out.println("static method in interface class");
		return "abc";
	}
}
