package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.Phone;

public class Oppo implements Phone {

	@Override
	public boolean makeCall() {
		System.out.println("method");
		return false;
	}

	@Override
	public boolean camera() {
		System.out.println("method");
		return false;
	}

	@Override
	public double price() {
		System.out.println("method");
		return 0;
	}

	@Override
	public int size() {
		System.out.println("method");
		return 0;
	}

	public void display() {
		makeCall();
		camera();
		price();
		size();
		Phone.companyName();
	}
}
