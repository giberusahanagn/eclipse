package com.xworkz.things.associationArray;

public class City {
	public String name;
	public String famousPerson;
	public String cityFamousFor;
	public double area;
	
    public City() {
	
}	
    public void setValues(String name, String famousPerson, String cityFamousFor, double area) {
		this.name=name;
		this.famousPerson=famousPerson;
		this.cityFamousFor=cityFamousFor;
		this.area=area;
	}
	public void showOff() {
		System.out.println("City class.....");
		System.out.println(name);
		System.out.println(famousPerson);
		System.out.println(cityFamousFor);
		System.out.println(area);
	}
}
	

