package com.xworkz.copy.type;

public class Test {
	public int age;
	public String name = "Sahana";
	public String location = "Bangalore";
	public long number = 9008284717l;

	public Test(String name) {
		
		this.name = name;
		System.out.println("Constructor---1");
		System.out.println("name:" + name);
	}

	public Test(String location, int age) {
	
		this("Sneha");
		System.out.println("Constructor --2");
		System.out.println(location);
		System.out.println(age);

	}

	public Test(long number) {
		
		this("Davanagere", 22);
		System.out.println("Constructor---3");
		this.number = number;
		System.out.println(number);

	}
	public Test() {
		this(8722159292l);
		System.out.println("--default constructor-----");
	}

}
