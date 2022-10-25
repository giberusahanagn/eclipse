package com.xworkz.boot;

import com.xworkz.constants.ShopName;

public class Saloon {
	public ShopName shopName = ShopName.Lakshmi_saloon; 
	public double price;
	public double area;
	public static String hairColor;

	public Saloon(ShopName shopName) {

	}

	public void setPrice(double price) {
		this.price = price;
	}

	static {
		hairColor = "Gold";
	}

	public void display() {

		System.out.println("price:" + price);
		System.out.println("Area:" + area);
		System.out.println("Color:" + hairColor);
		System.out.println("name of the shop:" + shopName);

	}

}
