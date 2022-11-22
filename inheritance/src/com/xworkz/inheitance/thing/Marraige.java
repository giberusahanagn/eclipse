package com.xworkz.inheitance.thing;

public class Marraige {
	
	 static String staticVariable;
	public String className;
	public int noOfPeople;
	public String place;
	
	public Marraige() {
		System.out.println(className);
		System.out.println(noOfPeople);
		System.out.println(place);	
		
	}
	public Marraige(String className, int noOfPeople, String place,String staticVariable) {
		this();
		this.className = className;
		this.noOfPeople = noOfPeople;
		this.place = place;
		this.staticVariable=staticVariable;
		System.out.println("printing static name: "+staticVariable);
	}
	
    public Marraige(String staticVariable) {
    	this.staticVariable=staticVariable;
    	
    	System.out.println("Printing static variable :"+staticVariable);
      }
	
}
