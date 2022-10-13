package com.xworkz.thing.product;

public class Boat {
	public String name;
	public String color;
	public String companyName;
	public int type;
	public String owner;

	public Boat() {
		System.out.println("Program Start aythu");
	}

	public Boat(String name) {
		this.name = name;
		System.out.println(name);
	}

	public Boat(String name,int type) {
		this.name = name;
		this.type = type;
		System.out.println(name);
		System.out.println(type);
	}

	public Boat(String name,String color) {
		this.name = name;
		this.color=color;
		System.out.println(color);
		System.out.println(name);

	}
	public Boat(int type) {
		this.type=type;
		System.out.println(type);
	}
	
	public Boat(String name,String color,String companyName) {
		this.name = name;
		this.companyName = companyName;
		this.color=color;
		System.out.println(name);
		System.out.println(companyName);
		System.out.println(color);
	}
	public Boat(String name,String color,String companyName,String owner) {
		this.name = name;
		this.companyName = companyName;
		this.color=color;
		this.owner=owner;
		System.out.println(name);
		System.out.println(companyName);
		System.out.println(color);
		System.out.println(owner);
	}

	public Boat(String name,String color,String companyName,String owner,int type) {
		this.name = name;
		this.companyName = companyName;
		this.color=color;
		this.owner=owner;
		this.type=type;
		System.out.println(name);
		System.out.println(companyName);
		System.out.println(color);
		System.out.println(owner);
		System.out.println(type);
	}



	
}
