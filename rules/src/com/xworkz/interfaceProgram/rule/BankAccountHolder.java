package com.xworkz.interfaceProgram.rule;

import com.xworkz.interfaceProgram.ruler.BankRules;

public class BankAccountHolder implements BankRules {
	@Override
	public boolean accountHolder() {
		System.out.println("implement method in class");
		return false;
	}

	@Override
	public boolean phoneNumber() {
		System.out.println("implement method in class");
		return false;
	}

	@Override
	public boolean age() {
		System.out.println("implement method in class");
		return false;
	}

	@Override
	public boolean signature() {
		System.out.println("implement method in class");
		return false;
	}


	public boolean show() {
		dispaly();
		accountHolder();
		phoneNumber();
		age();
		signature();
		return false;
	}

}
