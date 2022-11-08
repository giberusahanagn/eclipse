package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.BacheloreParty;
import com.xworkz.inheitance.thing.Party;

public class PartyRunner {
	public static void main(String[] args) {

		Party party = new Party();

		System.out.println(System.lineSeparator());

		Party party2 = new Party("PArty", "Bangalore", 4567);
		System.out.println(System.lineSeparator());
		
		Party party3 = new Party("Bangalore", 78765);
		System.out.println(System.lineSeparator());

		
		Party party4=new BacheloreParty();
		System.out.println(System.lineSeparator());
		
		Party  party5=new BacheloreParty(null);
		System.out.println(System.lineSeparator());
		
		Party party6=new Party(null, 0);
		System.out.println(System.lineSeparator());
	}
}
