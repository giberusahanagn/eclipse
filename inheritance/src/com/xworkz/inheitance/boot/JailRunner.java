package com.xworkz.inheitance.boot;

import com.xworkz.inheitance.casting.*;

public class JailRunner {
	public static void main(String[] args) {

		Jail jail = new Jail();
		System.out.println(jail.jailName);
		System.out.println(jail.place);
		System.out.println(System.lineSeparator());
		Jail jail2 = new SpecialJail();
		System.out.println("Casting:---->");
		Jail jail3 = (Jail) jail2;
		System.out.println(jail2.jailName);
		System.out.println(jail3.place);
		
		
		System.out.println(System.lineSeparator());
		Jail jail4 = new DistrictJail();
		System.out.println("Casting:---->");
		Jail jail5 = (Jail) jail4;
		System.out.println(jail4.jailName);
		System.out.println(jail4.place);
		
		//System.out.println(jail5.jailName);
		//System.out.println(jail5.place);
		
		System.out.println(System.lineSeparator());
		Jail jail6 = new CentralJail();
		System.out.println("Casting:---->");
		Jail jail7 = (Jail) jail6;
		System.out.println(jail7.jailName);
		System.out.println(jail7.place);

		/*Jail jail8 = new CentralJail();
		System.out.println("Casting:---->");
		Jail jail9 = (Jail) jail8;
		System.out.println(jail9.jailName);
		System.out.println(jail9.place);
		 */
	}
}
