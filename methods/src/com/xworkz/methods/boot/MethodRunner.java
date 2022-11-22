package com.xworkz.methods.boot;

import com.xworkz.methods.type.*;

public class MethodRunner {
	public static void main(String[] args) {

		Paint paint = new Paint();

		Paint paint1 = new Paint("PAINT", "Asian", " 1200", " 10022012l", " 10022019l", "Blue", " 1232d", " 120", "120",
				"true");

		System.out.println(paint1);// String method

		Paint paint2 = new Paint("PAINT", "Asian", " 1200", " 10022012l", " 10022019l", "Blue", " 1232d", " 120", "120",
				"true");
		System.out.println(paint2.toString());
		boolean same = paint1.equals(paint2);

		System.out.println("-----------");

		Vehicle vehicle = new Vehicle("Bicycle", "honda", "1000", "Red");

		Vehicle vehicle1 = new Vehicle("Bike", "honda", "150000", "Red");
		boolean vehicle2 = vehicle.equals(vehicle1);
		System.out.println(vehicle2);
		System.out.println("-----------");

		WaterBottle bottle = new WaterBottle("nylen", " 200", "1");

		WaterBottle bottle2 = new WaterBottle("nylen", " 200", "1");

		boolean same2 = bottle.equals(bottle2);
		System.out.println(same2);

		System.out.println(System.lineSeparator());

		Object currency = new Currency("Rupee", "Armenian dram", "Australian dollar", "Euro");
		Currency currency1 = new Currency("Rupee", "Armenian dram", "Australian dollar", "Euro");
		boolean same3 = currency.equals(currency1);
		System.out.println(same3);

		System.out.println(System.lineSeparator());

		God god = new God("Shiva", "Alla", "Jesus", "Buddha", "Alla");
		God god1 = new God("Shiva", "Alla", "Jesus", "Buddha", "Alla");
		boolean same4 = god.equals(god1);
		System.out.println(same4);

		System.out.println(System.lineSeparator());

		Institution institution = new Institution("Government", "janu", "16", "10", "A", "1");
		Institution institution1 = new Institution("Government", "janu", "16", "10", "A", "1");

		boolean same5 = institution.equals(institution1);
		System.out.println(same5);
		System.out.println(System.lineSeparator());

		Hospital hospital = new Hospital("Government", "Janu", "25", "Bangalore", "Mbbs", "9008284717", "Unknown");
		Hospital hospital1 = new Hospital("Government", "Janu", "25", "Bangalore", "Mbbs", "9008284717", "Unknown");
		boolean same6 = hospital.equals(hospital1);
		System.out.println(same6);
		System.out.println(System.lineSeparator());

	}
}
