package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.DJ;
import com.xworkz.inheitance.thing.Party;

public class DjRunner {
	public static void main(String[] args) {

		Party party = new Party();
		System.out.println(System.lineSeparator());

		Party party2 = new Party(null, 87789);
		System.out.println(System.lineSeparator());
		
		DJ dj=new DJ();
		
		Party party3 =new  DJ();
		System.out.println(System.lineSeparator());
		 
		Party party4=new DJ(null, 87789);
		System.out.println(System.lineSeparator());
		
		Party party5=new DJ(null, 0);
		System.out.println(System.lineSeparator());
		 
		Party party6=new Party(null, null, 0);
		System.out.println(System.lineSeparator());
	}
}
