package com.xworkz.inheitance.thing;
import com.xworkz.inheitance.constants.*;
public class Catering {
 
public String className="Catering";
public String CateringName;
public Place place=Place.Mysore;

public Catering() {
	System.out.println(className);
	System.out.println(CateringName);
	System.out.println(place);
}

public Catering(String className, String cateringName, Place place) {
	this();
	this.className = className;
	CateringName = cateringName;
	this.place = place;
}


}
