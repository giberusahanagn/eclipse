package com.xworkz.inheitance.thing;

public class PoliticalParty {

	public String partyName;
	public double noOfPeople;
	
	public PoliticalParty() {
		// TODO Auto-generated constructor stub
	}

	public PoliticalParty(String partyName, double noOfPeople) {
	
		this.partyName = partyName;
		this.noOfPeople = noOfPeople;
	}
	public void display() {
		System.out.println(partyName);
		System.out.println(noOfPeople);
		
	}
}
