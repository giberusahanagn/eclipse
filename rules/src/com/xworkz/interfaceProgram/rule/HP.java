package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.Laptop;

public class HP implements Laptop {

	@Override
	public boolean companyName() {
		System.out.println("method");
		return false;
	}

	@Override
	public boolean keyBoard() {
		System.out.println("method");
		return false;
	}

	@Override
	public boolean mouse() {
		System.out.println("method ");
		return false;
	}

	@Override
	public boolean display() {
		System.out.println("method");
		return false;
	}

	@Override
	public boolean windowsNumber() {
System.out.println("method");
		// TODO Auto-generated method stub
		return false;
	}

	public void show() {
		companyName();
		keyBoard();
		mouse();
		display();
		windowsNumber();
	}

}
