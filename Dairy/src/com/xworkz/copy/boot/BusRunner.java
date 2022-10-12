package com.xworkz.copy.boot;

import com.xworkz.copy.program.Bus;

public class BusRunner {

	public static void main(String[] args) {
		
	Bus bus=new Bus() ;
	System.out.println(bus.no);
	System.out.println(bus.source);
	System.out.println(bus.destination);
	bus.no=67487;
	bus.source="Ilkal";
	bus.destination="Bangalor";
	System.out.println("----------------------");
	System.out.println(bus.no);
	System.out.println(bus.source);
	System.out.println(bus.destination);
	}
}
