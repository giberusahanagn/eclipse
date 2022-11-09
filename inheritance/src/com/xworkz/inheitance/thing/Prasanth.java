package com.xworkz.inheitance.thing;

public class Prasanth extends Director{

	public int age;
	
	public Prasanth(String name,int noOfMovies,int age) {
		super(name,noOfMovies);
		this.age=age;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println(this.age);
	}
}
