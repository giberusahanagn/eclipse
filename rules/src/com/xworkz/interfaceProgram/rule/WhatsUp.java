package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.App;

public class WhatsUp implements App {

	@Override
	public boolean approval() {
		System.out.println("implemented method");
		return false;
	}

	@Override
	public double noOfUsers() {
		System.out.println("implemented method");
		return 0;
	}

	@Override
	public int version() {
		System.out.println("implemented method");
		return 0;
	}

	@Override
	public void appName() {
		System.out.println("implemented method");
		App.super.appName();
	}

	public String companyName() {
		System.out.println("override static method using simple method");
		approval();
		noOfUsers();
		version();
		appName();
		
		return App.companyName();
	}

}
