package com.xworkz.interfaceProgram.follower;

public class Canarabank {

	Bank bank;

	public Canarabank(Bank bank) {
		super();
		this.bank = bank;
	}

	public void checkout() {
		if (bank != null) {
			boolean minbalance = this.bank.minBalance();
			boolean followRules = this.bank.followRules();
			if (minbalance == false && followRules == false) {
				System.out.println("following rules");

			} else {
				System.err.println("not following");
			}
		}
	}
}
