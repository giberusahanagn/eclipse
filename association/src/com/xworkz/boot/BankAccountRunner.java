package com.xworkz.boot;

import com.xworkz.program.encapsulation.BankAccount;
import com.xworkz.program.encapsulation.BankAccountAccess;

public class BankAccountRunner {

	public static void main(String[] args) {
		 BankAccount bankAccount = new BankAccount();
BankAccountAccess access=new BankAccountAccess();

	access.useBankAccount();
    bankAccount.getAccountNumber();	
    access.cEO="CEO NAME";
    System.out.println(System.lineSeparator());
    System.out.println(access.cEO);
    System.out.println(access.name);
    System.out.println(access.userNumbers);
    System.out.println(access.employee);
    System.out.println(access.StateAddress);
    System.out.println(access.branch);
	}

}
