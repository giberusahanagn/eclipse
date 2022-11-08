package com.xworkz.inheitance.thing;

public class Marraige {
	 static String name;
	public String className;
	public int noOfPeople;
	public String place;
	
	public Marraige() {
		System.out.println(className);
		System.out.println(noOfPeople);
		System.out.println(place);	
	}
	public Marraige(String className, int noOfPeople, String place,String name) {
		this();
		this.className = className;
		this.noOfPeople = noOfPeople;
		this.place = place;
		this.name=name;
		System.out.println("printing static name: "+name);
	}
	
    public Marraige(String name) {
    	this.name=name;
    	
    	System.out.println("Printing static variable :"+name);
      }
	
}
