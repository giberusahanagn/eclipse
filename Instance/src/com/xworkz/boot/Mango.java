package com.xworkz.boot;

import com.xworkz.constants.ShopName;

public class Mango {

	public double price;// method
	public String shape;// constructor
	public static String color;// Reference
	public ShopName shopName = ShopName.Fruit_stall;// enum

	public Mango(String color) {
		Mango.color = color;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {

		System.out.println("price:" + price);
		System.out.println("Shape:" + shape);
		System.out.println("Color:" + color);
		System.out.println("name of the shop:" + shopName);

	}

}
