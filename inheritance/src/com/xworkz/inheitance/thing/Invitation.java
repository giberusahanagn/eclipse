package com.xworkz.inheitance.thing;

public class Invitation  {

	public String name;
	public int price;
	public int noOfCopies;

	public Invitation() {
		System.out.println("Invitation def cons.......");
	}
	public Invitation(String name, int price, int noOfCopies) {
		this();
		this.name = name;
		this.price = price;
		this.noOfCopies = noOfCopies;
	}

}
