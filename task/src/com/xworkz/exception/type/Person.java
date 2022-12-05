package com.xworkz.exception.type;

public abstract class Person extends Object {
	private String name;
	private int age;
	private double DOB;
	private String location;
	private long number;

	public Person(String name, int age, double dOB, String location, long number) {
		super();
		this.name = name;
		this.age = age;
		DOB = dOB;
		this.location = location;
		this.number = number;
	}

	public void eat() {
		System.out.println("running eat");
	}

	public void sleep() {
		System.out.println("running sleep");
	}

	public void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(DOB);
		System.out.println(location);
		System.out.println(number);
	}
}
