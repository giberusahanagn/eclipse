package com.xworkz.interfaceProgram.ruler;

public interface App {

	boolean approval();
	default void appName() {
		System.out.println("whats'up");
	}
	double noOfUsers();
	int version();
	static String companyName() {
		System.out.println("company name");
		return null;
	}
}
