package com.xworkz.things.associationProgram;

public class Country {
	public String name;
	public City cities[];
	public President president=new President();

	public Country(String name) {
		this.name = name;
		
System.out.println("Country Name: "+name);
	}

	public void setCity(City[] cities) {
		this.cities = cities;
		if (cities != null) {
			for (int i = 0; i < cities.length; i++) {
				City city=cities[i];
				
			}
		} else {
			System.out.println("City is Empty");
		}
	

	}

}