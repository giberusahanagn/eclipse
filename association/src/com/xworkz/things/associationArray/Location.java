package com.xworkz.things.associationArray;

public class Location {
	public int no;
	public String street;
	public City city = new City();
	public State state = new State();
	public Country country = new Country();

	public Location() {
	}

	public void setLocation(int no,String street) {
		this.no=no;
		this.street=street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public void showOff(City city,State state,Country country) {
		System.out.println("No of the locations in location class: " +no);
		System.out.println("Street name of the location in Location class:"+street);
		
		city.showOff();
		System.out.println(System.lineSeparator());
		state.showOff();
		System.out.println(System.lineSeparator());
		country.showOff();
	}
}
