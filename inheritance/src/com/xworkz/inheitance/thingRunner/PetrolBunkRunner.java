package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.PetrolBunk;
import com.xworkz.inheitance.thing.Venkateshwara;
import com.xworkz.inheitance.thing.HR;

public class PetrolBunkRunner {

	public static void main(String[] args) {
		
		PetrolBunk petrolBunk=new PetrolBunk();

		petrolBunk.petrol();
		System.out.println(System.lineSeparator());
		petrolBunk.diesel();
		
		System.out.println(System.lineSeparator());
		
		Venkateshwara venkateshwara=new Venkateshwara();
		venkateshwara.petrol();
}
}