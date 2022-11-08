package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.Catering;
import com.xworkz.inheitance.thing.GaneshaCatering;

public class CateringRunner {

	public static void main(String[] args) {

		Catering catering = new Catering();
		System.out.println(System.lineSeparator());

		Catering catering2 = new GaneshaCatering();
		System.out.println(System.lineSeparator());

		Catering catering3 = new Catering(null, null, null);
		System.out.println(System.lineSeparator());

		Catering catering4 = new GaneshaCatering(null, 10, null);
	}

}
