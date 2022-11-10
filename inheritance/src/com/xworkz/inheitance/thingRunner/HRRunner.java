package com.xworkz.inheitance.thingRunner;

import com.xworkz.inheitance.thing.Akshara;
import com.xworkz.inheitance.thing.HR;

public class HRRunner {

	public static void main(String[] args) {
		
		Akshara akshara=new Akshara();
		System.out.println(System.lineSeparator());
		akshara.firing();
		System.out.println(System.lineSeparator());
		akshara.hiring();
		
		System.out.println(System.lineSeparator());
		
		HR hr=new HR();
		hr.firing();
		
	}

}
