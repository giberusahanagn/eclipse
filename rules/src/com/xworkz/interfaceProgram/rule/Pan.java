package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.ID;

public class Pan implements ID {

	@Override
	public boolean idName() {
		System.out.println("methods");
		return false;
	}

	@Override
	public boolean idNumber() {
		System.out.println("methods");
		return false;
	}

	@Override
	public double phoneNumber() {
		System.out.println("methods");
		return 0;
	}

	@Override
	public boolean address() {
		System.out.println("methods");
		return false;
	}
	public void display() {
		System.out.println("Pan class");
		idName();
		idNumber();
		phoneNumber();
		address();
		
	}

}
