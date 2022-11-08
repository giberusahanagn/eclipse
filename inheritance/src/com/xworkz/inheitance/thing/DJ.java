package com.xworkz.inheitance.thing;

public class DJ extends Party {

	public String place;
	public int date;
	public String timings;

	public DJ() {
	System.out.println(place);
	System.out.println(date);
	System.out.println(timings);
	}
	

	public DJ(String place, int date, String timings) {
		this();
		this.place = place;
		this.date = date;
		this.timings = timings;
	}

	public DJ(String place, int date) {
		super("Bangalore", 15);
		this.place = place;
		this.date = date;
		this.timings = timings;
	}

	
}
