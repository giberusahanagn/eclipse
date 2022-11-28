package com.xworkz.interfaceProgram.ruler;

public interface BankRules {

	boolean accountHolder();

	boolean phoneNumber();

	boolean age();

	boolean signature();

	default boolean dispaly() {
		System.out.println("display all");
		return false;
	}
}
