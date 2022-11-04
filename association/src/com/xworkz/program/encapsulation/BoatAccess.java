package com.xworkz.program.encapsulation;

public class BoatAccess {

	Boat boat=new Boat();
	
	public void showOff() {

		System.out.println(boat.name);
		System.out.println(boat.brand);
		boat.brand = "philips";
		System.out.println("After modify of brand: " +boat.brand);
		System.out.println(boat.ownerName);
		boat.ownerName="Sahana";
		System.out.println("After modify of owner name: " + boat.ownerName);
		
		System.out.println(boat.price);
		System.out.println(boat.quality);
		System.out.println(boat.quality);
		System.out.println(boat.ambassador);
		boat.setManufactureDate(567887);
		System.out.println(boat.getManufactureDate());
		boat.setExpiryDate(123456);
		System.out.println(boat.getExpiryDate());
		boat.setQuantity(100);
		System.out.println(boat.getQuantity());
	}

}
