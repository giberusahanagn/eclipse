package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.Bjp;
import com.xworkz.inheitance.thing.PoliticalParty;

public class PoliticalPartyRunner {

	public static void main(String[] args) {
	
		PoliticalParty party=new PoliticalParty("BJP",12000d);
		PoliticalParty bjp=new Bjp("Basavaraj Bommai");

		
		party.display();
		
		System.out.println(System.lineSeparator());
		bjp.display();
		}

}
