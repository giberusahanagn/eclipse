package com.xworkz.things.associationArray;
 
public class Job {
	
	public double salary;
	public String role;
	public boolean bond;
	public Company company=new Company();
	
	public Job() {
		
	}
	public void setValues(double salary, String role, boolean bond, Company company) {
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		this.company = company;
	}
	
	public void showOff() {
		System.out.println("salary in job class: " +salary);
		System.out.println("Bond in job class: " +bond);
		System.out.println("Role in job class: " +role);
		company.showOff();
	}
	

	
}
