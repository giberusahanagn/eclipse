package com.xworkz.thing.productRunner;

import com.xworkz.thing.product.Passport;

public class PassportRunner {

	public static void main(String[] args) {

		Passport passport = new Passport();

		System.out.println(passport.no);
		System.out.println(passport.expiryDate);
		System.out.println(passport.issuedDate);
		System.out.println(passport.name);
		System.out.println(passport.country);
		System.out.println("--------------------------");

		Passport passport2=new Passport(1);
		System.out.println("--------------------------");

		Passport passport3=new Passport(08082045d);
		System.out.println("--------------------------");

		Passport passport4=new Passport("Sahana");
		System.out.println("--------------------------");

		Passport passport5=new Passport(1,"Sahana");
		System.out.println("--------------------------");

		Passport passport6=new Passport(08082045d,2,"Sahana");
		System.out.println("--------------------------");

		Passport passport7=new Passport(08082045d,3,"Sahana",08082045d);
		System.out.println("--------------------------");

		Passport passport8=new Passport(08082045d,4,"Sahana",08082045d,"India");
	}

}
