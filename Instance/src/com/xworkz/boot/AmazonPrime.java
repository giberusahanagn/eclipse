package com.xworkz.boot;

import com.xworkz.constants.UserName;

public class AmazonPrime {
	public String name;
	public int noOfUsers;
	public int age;
	public long phoneNumber;
	public String email;
	
	public UserName userName=UserName.BHARATH;
	public String[] session;
	public String[] nameOfUsers;
	public long[] numbers;
	public int[] ages;

	public AmazonPrime(String name,int noOfUsers,String[] session,String[] nameOfUsers,long[] numbers,int[] ages) {
		this.name=name;
		this.noOfUsers=noOfUsers;
		this.session=session;
		this.nameOfUsers=nameOfUsers;
		this.numbers=numbers;
		this.ages=ages;
		
	}
	public void display() {
		
		System.out.println("name :"+name);
		System.out.println("noOfUsers :"+noOfUsers);
		System.out.println("age :"+age);
		System.out.println("phoneNumber :"+phoneNumber);
		System.out.println("email :"+email);
		System.out.println("user name :"+UserName.NAGAVENI);
	
		System.out.println("-----ages-----");
		for (int i = 0; i < ages.length; i++) {
			int j = ages[i];
			System.out.println(j);
		}
		
		System.out.println("----------number------");
		for (int i = 0; i < numbers.length; i++) {
			long j = numbers[i];
			System.out.println(j);
		}
		System.out.println("---nameOfUsers-----");
		for (int i = 0; i < nameOfUsers.length; i++) {
			String j = nameOfUsers[i];
			System.out.println(j);
		}
		System.out.println("---session-----");
		for (int i = 0; i < session.length; i++) {
			String j = session[i];
			System.out.println(j);
		}
	
	}
}
