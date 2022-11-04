package com.xworkz.program.encapsulation;

public class HotStarAccess {
	HotStar hotStar=new HotStar();
public void use() {
		
	
	hotStar.isActive();
	hotStar.setPrime(true);
	hotStar.setPricePerMonth(199);
	hotStar.setNoOfUsers(4);
	hotStar.setPassword("amazon @2");
	
		hotStar.setActive(true);
		hotStar.setAmount(1000);
		System.out.println(hotStar.getAmount());
		System.out.println(hotStar.isPrime());
		System.out.println(hotStar.getPricePerMonth());
		System.out.println(hotStar.getNoOfUsers());
		System.out.println(hotStar.getNoOfUsers());
		System.out.println(hotStar.getPassword());
		System.out.println(hotStar.name);
		System.out.println(hotStar.userName);
		System.out.println(hotStar.userId);
		
	}
}
