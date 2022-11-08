package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.constants.RingType;
import com.xworkz.inheitance.thing.Engagement;
import com.xworkz.inheitance.thing.Marraige;

public class MarriageRunner {
	public static void main(String[] args) {

		Marraige marraige = new Marraige(null, 0, null, "45678");
		System.out.println(System.lineSeparator());
		Marraige marraige1 = new Engagement(null, 5467, null);
		System.out.println(System.lineSeparator());

		Marraige marraige2 = (Marraige) marraige1; // Casting
		if (marraige2 instanceof Marraige) {
			System.out.println("acquire properties of parent class");
		} else {
			System.err.println("not pointing to parent class");
		}

		Marraige marraige3 = new Marraige();
		System.out.println(System.lineSeparator());
		Marraige marraige4 = new Engagement(0, null);
		System.out.println(System.lineSeparator());
		Marraige marraige5 = new Engagement(null, RingType.PLATINUM);

		
		Marraige marraige6=new Marraige(null, 0, null, "unknown");
		
		Marraige marraige7=new Engagement("yrfge");
	}
}
