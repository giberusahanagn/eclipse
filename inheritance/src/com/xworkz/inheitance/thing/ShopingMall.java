package com.xworkz.inheitance.thing;

public class ShopingMall {
	public String mallName;
	public String place;
	public double pincode;

	public ShopingMall() {
		this.mallName = mallName;
		this.place = place;
		this.pincode = pincode;
	}

	public ShopingMall(String mallName, String place, double pincode) {
		this();
		this.mallName = mallName;
		this.place = place;
		this.pincode = pincode;
	}

	public void display() {
		System.out.println(mallName);
		System.out.println(place);
		System.out.println(pincode);
	}
}
