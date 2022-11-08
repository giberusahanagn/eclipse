package com.xworkz.inheitance.thing;

import com.xworkz.inheitance.constants.RingType;

public class Engagement extends Marraige {

	public String className;
	public RingType ringType=RingType.GOLD;
	public Engagement(int noOfPeople, String place) {
		super();	
	}
	public Engagement(String className, int noOfPeople, String place) {
	this(noOfPeople, place);
		System.out.println("Extend marriage class");
	}
	
	
	public Engagement(String className, RingType ringType) {
		this.ringType=ringType;
		System.out.println(className);
		System.out.println(ringType);
	
	}
	public Engagement(String name) {
		super(name);
	System.out.println("static variable constructor");
	}
	
}
