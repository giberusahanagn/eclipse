package com.xworkz.thing.product;

public class Passport {

	public int no;
	public double expiryDate;
	public double issuedDate;
	public String name;
	public String country;
	

	public Passport() {
	}

	public Passport(int no) {
		this.no = no;
		System.out.println("Passport Number: " + no);
	}

	public Passport(double expiryDate) {
		this.expiryDate = expiryDate;
		System.out.println("Passport expiryDate: " + expiryDate);
	}

	public Passport(String name) {
		this.name = name;
		System.out.println("Passport Name: " + name);
	}

	public Passport(int no, String name) {
		this.no = no;
		System.out.println("Passport number: " + no);
		this.name = name;
		System.out.println("Passport Name: " + name);
	}

	public Passport(double issuedDate, int no, String name) {
		this.issuedDate = issuedDate;
		System.out.println("Passport issuedDate: " + issuedDate);
		this.no = no;
		System.out.println("Passport number: " + no);
		this.name = name;
		System.out.println("Passport Name: " + name);
	}

	public Passport(double issuedDate, int no, String name, double expiryDate) {
		this.issuedDate = issuedDate;
		System.out.println("Passport issuedDate: " + issuedDate);
		this.no = no;
		System.out.println("Passport number: " + no);
		this.name = name;
		System.out.println("Passport Name: " + name);
		this.expiryDate = expiryDate;
		System.out.println("Passport expiryDate: " + expiryDate);
	}

	public Passport(double issuedDate, int no, String name, double expiryDate, String country) {
		this.issuedDate = issuedDate;
		System.out.println("Passport issuedDate: " + issuedDate);
		this.no = no;
		System.out.println("Passport number: " + no);
		this.name = name;
		System.out.println("Passport Name: " + name);
		this.expiryDate = expiryDate;
		System.out.println("Passport expiryDate: " + expiryDate);
		this.country = country;
		System.out.println("Country: " + country);
	}
}
