package com.xworkz.boot;

import com.xworkz.constants.ShopName;

public class Cracker {

	public final static String NAME = "Flower Pot";// literal
	public double price;// method
	public String shape;// constructor
	public static String color;// Reference
	public ShopName shopName = ShopName.Deepavali_sales;//enum

	public Cracker(String shape) {
		this.shape = shape;

	}

	public void setPrice(double price) {
		this.price = price;
		price=40;
	}

	static {
		color = "Red";
	}
	public void display() {
		System.out.println("name of the product :"+NAME);
		System.out.println("price:"+price);
		System.out.println("Shape:"+shape);
		System.out.println("Color:"+color);
		System.out.println("name of the shop:"+shopName);
		
	}

}
