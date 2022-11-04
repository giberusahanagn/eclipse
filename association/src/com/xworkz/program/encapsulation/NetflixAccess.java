package com.xworkz.program.encapsulation;

public class NetflixAccess {
	Netflix netflix=new Netflix();
public void use() {
		
	
	netflix.isActive();
	netflix.setPrime(true);
	netflix.setPricePerMonth(199);
	netflix.setNoOfUsers(4);
	netflix.setPassword("netflix @2");
	netflix.setActive(true);
	netflix.setAmount(1000);
		System.out.println(netflix.getAmount());
		System.out.println(netflix.isPrime());
		System.out.println(netflix.getPricePerMonth());
		System.out.println(netflix.getNoOfUsers());
		System.out.println(netflix.getNoOfUsers());
		System.out.println(netflix.getPassword());
		System.out.println(netflix.name);
		System.out.println(netflix.userName);
		System.out.println(netflix.userId);
		
	}
}
