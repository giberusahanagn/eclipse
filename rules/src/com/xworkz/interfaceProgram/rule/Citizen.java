package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.Traffic;

public class Citizen implements Traffic {

	@Override
	public boolean follow() {
		System.out.println("abstract method");
		return false;
	}

	@Override
	public boolean redStop() {
		System.out.println("abstract method");
		return false;
	}

	@Override
	public boolean greenMove() {
		System.out.println("abstract method");
		return false;
	}

	@Override
	public boolean color() {
		System.out.println("abstract method");
		return false;
	}

	public boolean display() {
		follow();
		redStop();
		greenMove();
		color();
		
		 return false;
	}
}
