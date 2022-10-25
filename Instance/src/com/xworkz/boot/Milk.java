package com.xworkz.boot;

public class Milk {
	public static String brand = "Nandhini";// literal
	public double price;// method
	public int litre = 1;
	public static boolean quality;

	public Milk(String brand) {
		this.brand = brand;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	static {
		quality=true;
	}

	public void display() {
		System.out.println("Brand:" + brand);
		System.out.println("price:" + price);
		System.out.println("litre:" + litre);
		System.out.println("quality:" + quality);
	}

}
