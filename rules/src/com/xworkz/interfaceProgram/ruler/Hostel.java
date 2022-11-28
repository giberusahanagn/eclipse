package com.xworkz.interfaceProgram.ruler;

public interface Hostel {
	
	void behave();
	void followRules();
	default double strength() {
		return 150;
	}
	static void location() {
		System.out.println("location");
	}
	
	 void display();
}
