package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.constants.Place;
import com.xworkz.inheitance.thing.Party;
import com.xworkz.inheitance.thing.PreWeddingShoot;

public class PreWeddingShootRunner {

	public static void main(String[] args) {

		Party party = new Party();
		System.out.println(System.lineSeparator());

		Party party2 = new Party("PArty", "Bangalore", 4567);
		System.out.println(System.lineSeparator());

		Party party3 = new PreWeddingShoot();

		System.out.println(System.lineSeparator());

		Party party4 = new PreWeddingShoot(null, 0);
		System.out.println(System.lineSeparator());
		
		Party party5= new PreWeddingShoot(Place.Bangalore, null, 0);
		System.out.println(System.lineSeparator());
		
		Party party6= new PreWeddingShoot("PreWedding","Bangalore", 45678);
		System.out.println(System.lineSeparator());
		
	}

}
