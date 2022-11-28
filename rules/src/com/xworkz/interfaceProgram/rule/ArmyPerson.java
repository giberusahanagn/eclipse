package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.ArmyRule;

public class ArmyPerson implements ArmyRule {

	@Override
	public boolean idName() {
		System.out.println("implements methods");
		return false;
	}

	@Override
	public boolean idNumber() {
		System.out.println("implements methods");
		return false;
	}

	@Override
	public double phoneNumber() {
		System.out.println("implements methods");
		return 0;
	}

	@Override
	public boolean address() {
		System.out.println("implements methods");
		return false;
	}

	public void display() {
		idName();
		idNumber();
		phoneNumber();
		address();
		ArmyRule.dispaly();
	}

}
