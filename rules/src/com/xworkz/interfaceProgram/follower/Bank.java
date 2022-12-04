package com.xworkz.interfaceProgram.follower;

import com.xworkz.interfaceProgram.rules.RBI;

public class Bank implements RBI{

	public boolean minBalance() {
		System.out.println("running min balance");
		return false;
	}

	public boolean followRules() {
		System.out.println("running follow rules");
		return false;
	}

}
