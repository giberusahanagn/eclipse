package com.xworkz.boot;

import com.xworkz.constants.ShopName;

public class Flower {
	public final String name = "Rose";// literal
	public double price;// method
	public String shape;// constructor
	public static String color;// Reference
	public ShopName shopName = ShopName.Ganesha_stores;// enum

	public Flower(String shape) {
		this.shape = shape;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	static {
		color = "Red";
	}

	public void display() {
		System.out.println("name of the product :" + name);
		System.out.println("price:" + price);
		System.out.println("Shape:" + shape);
		System.out.println("Color:" + color);
		System.out.println("name of the shop:" + shopName);

	}

}
