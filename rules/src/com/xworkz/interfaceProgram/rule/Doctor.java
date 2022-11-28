package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.Hospital;

public class Doctor implements Hospital {

	@Override
	public double noOfStaffs() {
		System.out.println("implement method in class");
		return 0;
	}

	@Override
	public void location() {
		System.out.println("implement method in class");
		Hospital.super.location();
	}

	@Override
	public boolean pharmacy() {
		System.out.println("implement method in class");
		return false;
	}

	public void display() {
		noOfpatients();
		noOfStaffs();
		HospitalName();
		pharmacy();
		location();
	}
}
