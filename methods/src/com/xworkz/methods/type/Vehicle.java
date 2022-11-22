package com.xworkz.methods.type;

public class Vehicle {
	
private String noOfVehicle;
private String name;
private String brand;
private String type;
private String price;
private String color;
private int noOfSeats;

public Vehicle(String name, String brand, String price, String color) {
	super();
	this.name = name;
	this.brand = brand;
	this.price = price;
	this.color = color;
}
 

@Override
	public boolean equals(Object obj) {
	if(obj instanceof Vehicle) {
		
		Vehicle vehicle=(Vehicle)obj;
		if(this.brand.equals(vehicle.brand) && this.color.equals(vehicle.color) ) {
			System.out.println("brand are same :" +brand);
			System.out.println("Color are same :" +brand);
			System.out.println("2 properties");
			return true;
		}
		else
		{
			System.err.println("brand are not same");
		}
	}
	return super.equals(obj);
	}

	
}
	

