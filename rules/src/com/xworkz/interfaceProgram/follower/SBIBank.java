package com.xworkz.interfaceProgram.follower;

public class SBIBank {

	Bank bank;

	public SBIBank(Bank bank) {
		super();
		this.bank = bank;
	}

	public void checkout() {
		if (bank != null) {
			boolean minbalance = this.bank.minBalance();
			boolean followRules = this.bank.followRules();
			if (minbalance == true && followRules == false) {
				System.out.println("following rules");

			} else {
				System.err.println("not following");
			}
		}
	}

}
