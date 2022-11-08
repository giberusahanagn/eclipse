package com.xworkz.inheitance.thing;

import com.xworkz.inheitance.constants.Place;

public class GaneshaCatering extends Catering{

	public String CateringName="Ganesha";
	public int experience;
	
	public GaneshaCatering() {
		
		System.out.println(CateringName);
		System.out.println(experience);
	}

	public GaneshaCatering(String cateringName, int experience ,Place place) {
	super(cateringName, cateringName, place);
		this.CateringName = cateringName;
		this.experience = experience;
		System.out.println(CateringName);
		System.out.println(experience);
		System.out.println(place);
	}
	
	
	
}
