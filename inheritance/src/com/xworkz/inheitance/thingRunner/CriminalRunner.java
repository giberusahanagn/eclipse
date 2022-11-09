package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.Criminal;
import com.xworkz.inheitance.thing.Ravi;

public class CriminalRunner {
public static void main(String[] args) {
	
	Criminal criminal=new Ravi("Ravi", true,"Ravi"); 
Criminal criminal1=new Criminal("Ravi", true);


criminal.display();
System.out.println(System.lineSeparator());

criminal1.display();

}
}
