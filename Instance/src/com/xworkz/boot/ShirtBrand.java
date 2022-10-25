package com.xworkz.boot;

import com.xworkz.constants.ShopName;

public class ShirtBrand {

	public final String dressName = "T-Shirt";
	public double price;
	public String area;
	public static String color;

	public ShirtBrand(String area) {
		this.area = area;
	}

	static {
		color = "navy blue";
	}

	public int setPrice(double price) {
		price = 500;
		return 0;
	}

	public void display() {

		System.out.println("dressName :" + dressName);
		System.out.println("price :" + price);
		System.out.println("Area :" + area);
		System.out.println("color :" + color);

	}
}
