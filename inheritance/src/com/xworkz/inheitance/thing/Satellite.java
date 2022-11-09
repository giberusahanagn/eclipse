package com.xworkz.inheitance.thing;

public class Satellite {

	public int noOfSatellite;
	public String nameOne;
	public Satellite(int noOfSatellite, String nameOne) {
		super();
		this.noOfSatellite = noOfSatellite;
		this.nameOne = nameOne;
	}
	
	public void display() {
		System.out.println("noOfSatellite : "+noOfSatellite);
		System.out.println("nameOne : "+nameOne);
	}
}
