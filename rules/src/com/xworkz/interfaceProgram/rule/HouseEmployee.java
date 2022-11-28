package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.House;

public class HouseEmployee implements House {

	@Override
	public boolean goodVasthu() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean noOfRooms() {
		System.out.println("override method");
		return false;
	}

	@Override
	public boolean area() {
		System.out.println("override method");
		return false;
	}

	@Override
	public String houseType() {
		System.out.println("override method");
		return null;
	}

	@Override
	public double total() {
		System.out.println("override method");

		return 0;
	}

	public void show() {
		goodVasthu();
		noOfRooms();
		area();
		houseType();
		total();
	}
}
