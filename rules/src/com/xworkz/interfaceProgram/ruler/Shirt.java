package com.xworkz.interfaceProgram.ruler;

public interface Shirt {

	boolean collor();
	int noOfButtons();
	int armLength();
	default String brandName() {
		System.out.println("brand name");
		return null;
	}
	char size();
	
}
