package com.xworkz.inheitance.thing;

public class Moon extends Satellite{

	public String color;
	public Moon(String color,String nameOne) {
		super(10, nameOne);
		super.nameOne=nameOne;
		this.color=color;
		color="White";
	}
	@Override
	public void display() {
		super.display();
		System.out.println("color :"+this.color);
	}
}
