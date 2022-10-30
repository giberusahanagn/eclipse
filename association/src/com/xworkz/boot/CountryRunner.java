package com.xworkz.boot;

import com.xworkz.things.associationProgram.City;
import com.xworkz.things.associationProgram.Country;
import com.xworkz.things.associationProgram.Gender;
import com.xworkz.things.associationProgram.Name;
import com.xworkz.things.associationProgram.President;

public class CountryRunner {
	public static void main(String[] args) {
		Country country = new Country("India");

		President president = new President();
		president.presidentDisplay("Droupadi Murmu", 5, Gender.FEMALE);
		System.out.println(System.lineSeparator());
		City city = new City();
		Name name = new Name();
		name.nameDisplay("Karnataka", "Mysore", null);
		city.cityDisplay(name, "Bangalore", 457760d);
		System.out.println("------");

		City city2 = new City();
		name.nameDisplay("Davanagere", "BenneNagari", "Don't know");
		city.cityDisplay(name,"Karnataka", 7898d);

		City[] cities= {city,city2};
		country.setCity(cities);
		
	}

}
