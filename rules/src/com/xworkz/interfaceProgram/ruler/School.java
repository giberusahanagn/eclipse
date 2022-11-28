package com.xworkz.interfaceProgram.ruler;

public interface School {
	public static final String name = "Government";

	String homework();

	boolean uniform();

	int strength();

	public static void schoolName() {
		System.out.println("running schoolname in School");
	}

	public static void schoolName(String principal) {
		System.out.println("running schoolname in School");
	}

	void noOfRooms();
	
	default void noOfSection() {
		System.out.println("default method");
	}
}
