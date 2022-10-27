package com.xworkz.boot;

import com.xworkz.things.Mountain;

public class MountainRunner {
	public static void main(String[] args) {
		Mountain mountain = new Mountain();

		mountain.displayMountain("Himalayan range", 3200d);
		System.out.println(System.lineSeparator());
		mountain.location.showOff(null, "J&K", "J&K", 180001l, "INDIA");

		mountain.temple.displayTemple();

		mountain.temple.god.godShowOff();
	}
}
