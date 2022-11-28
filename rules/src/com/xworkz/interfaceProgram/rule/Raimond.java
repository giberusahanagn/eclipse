package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.Shirt;

public class Raimond implements Shirt {

	@Override
	public boolean collor() {
		System.out.println("collor method");
		return false;
	}

	@Override
	public int noOfButtons() {
		System.out.println("No of buttons method");
		return 0;
	}

	@Override
	public int armLength() {
		System.out.println("arm length method");
		return 0;
	}

	@Override
	public char size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String brandName() {
		System.out.println("brand name method");
		return Shirt.super.brandName();
	}

	public void display() {
		System.out.println("display method");
		collor();
		noOfButtons();
		armLength();
		size();
		brandName();

	}
}
