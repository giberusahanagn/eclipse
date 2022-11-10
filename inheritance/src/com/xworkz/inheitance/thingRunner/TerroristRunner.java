package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.Kasab;
import com.xworkz.inheitance.thing.Terrorist;

public class TerroristRunner {
public static void main(String[] args) {
	
	Kasab kasab=new Kasab();
	kasab.country();
	
	System.out.println(System.lineSeparator());
	Terrorist terrorist=new Terrorist();
	terrorist.country();
	
}
}
