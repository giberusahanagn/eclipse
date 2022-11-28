package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.Interview;

public class ITCompany implements Interview {

	@Override
	public String name() {
		System.out.println("implement method");
		return null;
	}

	@Override
	public boolean eduaction() {
		System.out.println("implement method");
		return false;
	}

	@Override
	public double salary() {
		System.out.println("implement method");
		return 0;
	}

	@Override
	public String role() {
		// TODO Auto-generated method stub
		return Interview.super.role();
	}

	public String companyName() {
		System.out.println("static method");

		return null;
	}

	public void display() {
		name();
		eduaction();
		salary();
		role();
Interview.companyName();
	}
}
