package com.xworkz.things;

//Location: street,city,state,pincode,country
public class Location {

	public String street;
	String city;
	String state;
	long pincode;
	String country;


	public void showOff(String street, String city, String state, long pincode, String country) {
			System.out.println("Location-----> Street:"+street);
			System.out.println("city:"+city);
			System.out.println("state:"+state);
			System.out.println("pincode:"+pincode);
			System.out.println("country:"+country);
			System.out.println(System.lineSeparator());
	}
	
}
