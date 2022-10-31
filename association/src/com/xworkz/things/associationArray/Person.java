package com.xworkz.things.associationArray;

public class Person {
	public String name;
	public Email[] email;
	public Job job=new Job();
	
	public Person() {
	
	}
	public void setEmail(String name,Email[] email, Job job) {
		this.name=name;
		this.email=email;
		this.job=job;
	}
	 public void showOff() {
		System.out.println("Name: "+name);
		job.showOff();
	}
}
