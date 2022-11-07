package com.xworkz.inheitance.boot;

import com.xworkz.inheitance.casting.*;

public class CourtRunner {
	public static void main(String[] args) {

		Court court = new Court();
		System.out.println(System.lineSeparator());

		Court court2 = new HighCourt();

		System.out.println("----------Casting-----------");
		// access parent class using sub class
		Court court3 = (Court) court2;
		System.out.println(court3.country);
		System.out.println(court3.ageOfJudge);
		System.out.println(System.lineSeparator());

		Court court4 = new DistrictCourt();
		System.out.println("----------Casting-----------");
		Court court5 = (Court) court4;
		System.out.println(court4.country);
		System.out.println(court4.ageOfJudge);
		System.out.println(System.lineSeparator());
		
		Court court6=new SupremCourt();
		System.out.println("----------Casting-----------");
		Court court7=(Court) court6;
		
		System.out.println(court6.country);
		System.out.println(court6.ageOfJudge);
	}
}
