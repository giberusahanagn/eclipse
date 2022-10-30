package com.xworkz.things.associationProgram;

public class City {
	public Name name=new Name();
	public String capital;
	public double area;
	
	public City() {
	this.name=name;
	}
	public void cityDisplay(Name name,String Capital,double area) {
		System.out.println("Capital :"+capital);
		System.out.println("Total area :"+area);
		if(name!=null) {
			this.name=name;
			}
		else {
			System.out.println("Name is empty");
		}
	}
}
