package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.Hostel;

public class Hostellers implements Hostel{

	@Override
	public void behave() {
		// TODO Auto-generated method stub
		System.out.println("implement method in class");
	}

	@Override
	public void followRules() {
		// TODO Auto-generated method stub
		System.out.println("implement method in class");
	}
	@Override
	public double strength() {
		System.out.println("default method in class");
		return Hostel.super.strength();
	}

	@Override
	public void display() {
	behave();
	followRules();
	strength();
	Hostel.location();
	
		
	}


}
