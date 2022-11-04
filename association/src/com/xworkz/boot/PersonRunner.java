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
		country.setValues("India", "Dehli", "Droupdi murmu", 4567898d);
		

		State state = new State();
		state.setValues("Karnataka", "Bangalore", "Bommai", 456789d);
		
		City city = new City();
		city.setValues("Karnataka", "kempeGowda","IT", 4356776d);
	
		
		
		Location location = new Location();
		location.setLocation(1, "rajajinagar");
		location.showOff(city,state,country);

		
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
		email.setvalues("Sahana","sahanagn.xworkz@gmail.com","Sahana@123", 9008284717l, company);
	
	
		Email email2=new Email();
		email2.setvalues("Manjula","majulac@gmail.com","Manjula@123", 9972451281l, company);
	
		

		Email email3=new Email();
		email3.setvalues("Bharath","bharathgn@gmail.com", "Bharath@123", 8722159292l, company);
	
		System.out.println(System.lineSeparator());
		Email[] emails= {email,email2,email3};
		
		Person person = new Person();
		person.setEmail("Sahana",emails,job);
	
		
		person.showOff();

	}
}
