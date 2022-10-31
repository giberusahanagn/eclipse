package com.xworkz.things.associationArray;

public class Company {

	public String name;
	public String ownerName;
	public Address adress = new Address();

	public Company() {
		// TODO Auto-generated constructor stub
	}

	public void setValues(String name, String ownerName, Address adress) {
		this.name = name;
		this.ownerName = ownerName;
		this.adress = adress;
	}

	public void showOff() {
		System.out.println("Name of the Company class: " + name);
		System.out.println("Owner name of the Company class: " + ownerName);
		adress.showOff();
	}

}
