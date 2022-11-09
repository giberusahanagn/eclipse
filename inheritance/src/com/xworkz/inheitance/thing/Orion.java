package com.xworkz.inheitance.thing;

public class Orion extends ShopingMall {

	public String area;

	public Orion() {

	}

	public Orion(String area) {
		super("Orion", "Bangalore", 560078d);
		this.area = area;
	}

	public void display() {
		super.display();
		System.out.println(area);
	}

}
