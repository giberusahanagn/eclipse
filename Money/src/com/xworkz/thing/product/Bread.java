package com.xworkz.thing.product;

public class Bread {
	public String type;
	public String shape;
	public String companyName;
	public int price;
	public float quantity;

	public Bread() {

	}

	public Bread(String type) {
		this.type = type;
		System.out.println("Bread type :" + type);
	}

	public Bread(int price) {
		this.price = price;
		System.out.println("Bread price :" + price);
	}

	public Bread(float quantity) {
		this.quantity = quantity;
		System.out.println("Bread quantity :" + quantity);
	}

	public Bread(String type, int price) {
		this.type = type;
		System.out.println("Bread type :" + type);
		this.price = price;
		System.out.println("Bread price :" + price);
	}

	public Bread(String type, float quauntity) {
		this.type = type;
		System.out.println("Bread type :" + type);
		this.quantity = quauntity;
		System.out.println("Bread quantity :" + quauntity);
	}

	public Bread(String type, String shape) {
		this.type = type;
		System.out.println("Bread type :" + type);
		this.shape = shape;
		System.out.println("Bread shape :" + shape);
	}

	public Bread(String type, String shape, String companyName) {
		this.type = type;
		System.out.println("Bread type :" + type);
		this.shape = shape;
		System.out.println("Bread shape :" + shape);
		this.companyName = companyName;
		System.out.println("Bread company name: " + companyName);
	}

	public Bread(String type, String shape, String companyName, int price) {
		this.type = type;
		System.out.println("Bread type :" + type);
		this.shape = shape;
		System.out.println("Bread shape :" + shape);
		this.companyName = companyName;
		System.out.println("Bread company name: " + companyName);
		this.price = price;
		System.out.println("Bread price :" + price);

	}

	public Bread(String type, String shape, String companyName, int price, float quantity) {
		this.type = type;
		System.out.println("Bread type :" + type);
		this.shape = shape;
		System.out.println("Bread shape :" + shape);
		this.companyName = companyName;
		System.out.println("Bread company name: " + companyName);
		this.price = price;
		System.out.println("Bread price :" + price);
		this.quantity = quantity;
		System.out.println("Bread quantity :" + quantity);

	}
}
