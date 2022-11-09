package com.xworkz.inheitance.thing;

public class Ravi extends Criminal {

	public String personName;
public Ravi(String criminalName,boolean jail,String personName) {
	super(criminalName, jail);
	this.personName=personName;
}

@Override
public void display() {
	
	super.display();
	System.out.println(personName);
}
}
