package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.BacheloreParty;
import com.xworkz.inheitance.thing.Party;

public class MoneyRunner {
public static void main(String[] args) {
	
	
	Party party =new  Party();
	System.out.println(System.lineSeparator());
	 
	Party party2=new Party(null, 87789);
	System.out.println(System.lineSeparator());
	
	Party party3=new BacheloreParty();
	System.out.println(System.lineSeparator());
	
	Party party4=new BacheloreParty(null);
	System.out.println(System.lineSeparator());
	
	Party party5=new BacheloreParty(null, null, 567834);
	System.out.println(System.lineSeparator());
}

}
