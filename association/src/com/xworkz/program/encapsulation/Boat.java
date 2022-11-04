package com.xworkz.program.encapsulation;

public class Boat {

	String UserName = "Sahana";
	String name = "Earphone";
	String brand = "Boat";
	String ownerName = "Aman Gupta";
	int price = 578;
	boolean quality = true;
	double barcode = 5679;
	String ambassador = "KL Rahul";
	private double manufactureDate = 976;
	private double expiryDate;
	private int quantity;

	public double getManufactureDate() {
		this.manufactureDate = manufactureDate;

		return this.manufactureDate;
	}

	void setManufactureDate(double manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public double getExpiryDate() {
		this.expiryDate = expiryDate;

		return this.expiryDate;
	}

	void setExpiryDate(double expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getQuantity() {
		this.quantity = quantity;

		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
