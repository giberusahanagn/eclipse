package com.xworkz.program.encapsulation;

public class Product{
	String name = "Sugar";
	String brand = "TATA";
	String ownerName = "Ratan tata";
	int price = 50;
	boolean quality = true;
	double barcode = 5679;
	String ambassador = "TATA";
	private double manufactureDate = 2021;
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
