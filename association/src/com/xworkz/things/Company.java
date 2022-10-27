package com.xworkz.things;

public class Company {
	public String name;
	public String type;
	
	
	public Company(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public void showOff(String name, String type) {
		System.out.println("Name of the company: "+name);
		System.out.println("type of the company: "+type);
	}
}
