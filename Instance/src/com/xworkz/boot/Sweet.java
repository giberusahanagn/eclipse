package com.xworkz.boot;

import com.xworkz.constants.Colors;

public class Sweet {
	public double price;
	public String name;
	public int quntity = 50;
	public String shape;
	public Colors color=Colors.WHITE;
	public static String shopName;

	public Sweet(double price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	static {
		shopName = "Ganesha Sweets";
	}

	public void display() {
		System.out.println(this.price);
		System.out.println(this.name);
		System.out.println(this.quntity);
		System.out.println(this.shape);
		System.out.println(this.color);
		System.out.println(Sweet.shopName);
	}
}
