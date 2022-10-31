package com.xworkz.boot;

import com.xworkz.things.associationArray.Person;
import com.xworkz.things.associationArray.Email;
import com.xworkz.things.associationArray.Job;
import com.xworkz.things.associationArray.Company;
import com.xworkz.things.associationArray.Address;
import com.xworkz.things.associationArray.Location;
import com.xworkz.things.associationArray.City;
import com.xworkz.things.associationArray.State;
import com.xworkz.things.associationArray.Country;

public class PersonRunner {
	public static void main(String[] args) {

		Country country = new Country();
		country.setValues("India", "Dehli", "Droupdi", 4567898d);
		country.showOff();
		System.out.println(System.lineSeparator());

		State state = new State();
		state.setValues("Karnataka", "Bangalore", "Bommai", 456789d);
		state.showOff();
		
		System.out.println(System.lineSeparator());
		City city = new City();
		city.setValues("Karnataka", "kempeGowda","IT", 4356776d);
		city.showOff();
		
		System.out.println(System.lineSeparator());
		Location location = new Location();
		location.setLocation(10, "rajajinagar");
		location.showOff();

		
		Address address = new Address();
		address.setAddress(location);
		
		
		System.out.println(System.lineSeparator());
		Company company = new Company();
		company.setValues("TCS", "Ratan tata", address);
		company.showOff();
		
		System.out.println(System.lineSeparator());
		Job job = new Job();
		job.setValues(456787d,"Trainee", true,company);
		job.showOff();
		
		System.out.println(System.lineSeparator());
		Email email = new Email();
		email.setvalues("Sahana",10,"Sahana@123", 9008284717l, company);
		email.showOff();
		
		System.out.println(System.lineSeparator());
		Email email2=new Email();
		email2.setvalues("Manjula",11,"Manjula@123", 9972451281l, company);
		email2.showOff();
		
		System.out.println(System.lineSeparator());
		Email email3=new Email();
		email3.setvalues("Bharath",12, "Bharath@123", 8722159292l, company);
		email3.showOff();
		System.out.println(System.lineSeparator());
		Email[] emails= {email,email2,email3};
		
		Person person = new Person();
		person.setEmail("Sahana",emails,job);
	
		
		

	}
}
