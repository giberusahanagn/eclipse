package com.xworkz.inheitance.thing;

public class Party {
	public String className = "Party";
	public String place;
	public int total;

	public Party() {
		System.out.println(className);
		System.out.println(place);
		System.out.println(total);
	}

	public Party(String className, String place, int total) {
		super();
		this.className = className;
		this.place = place;
		this.total = total;
		System.out.println(className);
		System.out.println(place);
		System.out.println(total);
	}

	public Party(String place, int total) {
		this(place, place, total);
		this.place = place;
		this.total = total;
		System.out.println(place);
		System.out.println(total);
	}
}
