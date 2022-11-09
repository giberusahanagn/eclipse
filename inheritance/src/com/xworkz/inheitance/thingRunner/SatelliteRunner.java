package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.Moon;
import com.xworkz.inheitance.thing.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		
		Moon moon =new Moon("white", "Moon");
		
		Satellite  satellite=new Satellite(20,null);
		
		moon.display();
		System.out.println(System.lineSeparator());
		
		satellite.display();
	}
}
