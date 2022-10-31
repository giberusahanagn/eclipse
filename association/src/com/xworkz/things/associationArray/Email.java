package com.xworkz.things.associationArray;

public class Email {
	public String name;
	public int id = 34;
	public String password = "Sahana";
	public long moblieNumber = 9972451281l;
	public Company company = new Company();

	public Email() {
		
	}
	public void setvalues(String name,int id, String password, long moblieNumber, Company company) {
		this.name=name;
		this.id = id;
		this.password = password;
		this.moblieNumber = moblieNumber;
		this.company = company;
	}

	public void showOff() {
		System.out.println("Name of the person: "+name);
		System.out.println("Id in email class:"+id);
		System.out.println("password :"+password);
		System.out.println("number :"+moblieNumber);
		company.showOff();

	}
}
