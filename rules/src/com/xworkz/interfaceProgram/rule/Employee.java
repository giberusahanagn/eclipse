package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.HR;

public class Employee implements HR {

	@Override
	public boolean research() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean behave() {
	System.out.println("implement method");
		return false;
	}

	@Override
	public boolean hire() {
		System.out.println("implement method");
		return false;
	}

	@Override
	public boolean fire() {
		System.out.println("implement method");
		return false;
	}

	public  boolean refire() {
		
		System.out.println("implement static and method of refire");
		return false;
	}

	public void display() {
		System.out.println("display method");
		behave();
		hire();
		fire();
		refire();
	}
}
