package com.xworkz.inheitance.thing;

public class BacheloreParty extends Party{

	public String name;

	
	public BacheloreParty(String name) {
		super();
		this.name = name;
		System.out.println(name);
		System.out.println(total);
	}

	public BacheloreParty() {
		super();
	
	}

	public BacheloreParty(String className, String place, int total) {
		this(className);
		System.out.println(className);
		System.out.println(place);
		System.out.println(total);
	}
	
	

}
