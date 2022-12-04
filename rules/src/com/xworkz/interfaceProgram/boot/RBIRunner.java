package com.xworkz.interfaceProgram.boot;

import com.xworkz.interfaceProgram.follower.Bank;
import com.xworkz.interfaceProgram.follower.Canarabank;
import com.xworkz.interfaceProgram.follower.SBIBank;

public class RBIRunner {
	public static void main(String[] args) {
		Bank bank = new Bank();
		bank.followRules();
		bank.minBalance();
		System.out.println("---------------------");

		Canarabank canarabank = new Canarabank(bank);
		canarabank.checkout();
		System.out.println("----------------");

		SBIBank bank2 = new SBIBank(bank);
		bank2.checkout();

	}

}
