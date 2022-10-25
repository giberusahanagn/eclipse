package com.xworkz.boot;

import com.xworkz.constants.ShopName;

public class Lamp {
	public final String name = "Study lamp";// literal
	public double price;// method
	public String shape;// constructor
	public static String color;// Reference
	public ShopName shopName = ShopName.Lamp_shop;// enum

	public Lamp(String shape) {
		this.shape = shape;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	static {
		color = "black";
	}

	public void display() {
		System.out.println("name of the product :" + name);
		System.out.println("price:" + price);
		System.out.println("Shape:" + shape);
		System.out.println("Color:" + color);
		System.out.println("name of the shop:" + shopName);

	}

}
