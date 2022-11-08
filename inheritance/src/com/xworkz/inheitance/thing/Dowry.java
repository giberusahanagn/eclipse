package com.xworkz.inheitance.thing;

public class Dowry extends Money{

	public String name;
	public double amount;
	public Dowry() {
		
	}

	public Dowry(double money) {
		super(money);
		
	}

	public Dowry(String name, double amount) {
		this();
		this.name = name;
		this.amount = amount;
	}
	
}
