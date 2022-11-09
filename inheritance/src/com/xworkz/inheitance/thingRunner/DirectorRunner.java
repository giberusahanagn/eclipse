package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.Director;
import com.xworkz.inheitance.thing.Prasanth;

public class DirectorRunner {
public static void main(String[] args) {
	
	Director director=new Director(null, 0);
	
	Director prasanth=new Prasanth("Prasanth", 10, 25);
	
	prasanth.display();
}
}
