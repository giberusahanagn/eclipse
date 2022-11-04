package com.xworkz.program.encapsulation;

public class AmazonAccess {

	public String product="Electronics";
	public String name="WM";
	
	Amazon amazon=new Amazon();
	public void use() {
		
		System.out.println(product);
		System.out.println(name);
		System.out.println(System.lineSeparator());
		amazon.isActive();
		amazon.setPrime(true);
		amazon.setPricePerMonth(199);
		amazon.setNoOfUsers(4);
		amazon.setPassword("amazon @2");
		amazon.setPrimeUserName(name);
		amazon.setActive(true);
		amazon.setAmount(1000);
		System.out.println(amazon.getAmount());
		System.out.println(amazon.isPrime());
		System.out.println(amazon.getPricePerMonth());
		System.out.println(amazon.getNoOfUsers());
		System.out.println(amazon.getNoOfUsers());
		System.out.println(amazon.getPassword());
		System.out.println(amazon.name);
		System.out.println(amazon.userName);
		System.out.println(amazon.userId);
		
	}
}
