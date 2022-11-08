package com.xworkz.inheitance.thing;

import com.xworkz.inheitance.constants.Place;

public class PreWeddingShoot extends Party{
	
	public Place place;
	public String shootPlace;
	public int members;
	public PreWeddingShoot() {
		// TODO Auto-generated constructor stub
	}
	public PreWeddingShoot(Place place, String shootPlace, int members) {
		super();
		this.place = place;
		this.shootPlace = shootPlace;
		this.members = members;
	}
	public PreWeddingShoot(String place, int total) {
		super("Bangalore",45678 );
	
	}
	public PreWeddingShoot(String className, String place, int total) {
		this(place, total);
		
	}
	
	
	
}
