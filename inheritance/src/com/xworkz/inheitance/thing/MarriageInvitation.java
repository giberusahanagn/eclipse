package com.xworkz.inheitance.thing;

public class MarriageInvitation extends Invitation{
	public String className;
	public int noOfPeople;
	public String place;
	
	public MarriageInvitation() {
		System.out.println(className);
		System.out.println(noOfPeople);
		System.out.println(place);
		// TODO Auto-generated constructor stub
	}
	public MarriageInvitation(String name, int price, int noOfCopies, String className, int noOfPeople, String place) {
		super(name, price, noOfCopies);
		this.className = className;
		this.noOfPeople = noOfPeople;
		this.place = place;
		
		System.out.println(className);
		System.out.println(noOfPeople);
		System.out.println(place);
		System.out.println(name);
		System.out.println(price);
		System.out.println(noOfCopies);
		
	}
}
