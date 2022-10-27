package com.xworkz.things;

import com.xworkz.constants.Shape;

public class Pillar {
	public int id = 10;
	public String place = "Davanagere";
	public Shape shape = Shape.RECTANGLE;
	public int height = 20;
	public String material = "IRON";
	public Company company = new Company("Soild foundation", "Bangalore");

	public Pillar() {
		System.out.println("Piller Construction.........");
		System.out.println("pillar id: "+id);
		System.out.println("pce: "+place);
		System.out.println("shape: "+shape);
		System.out.println("height: "+height);
		System.out.println(System.lineSeparator());
	//	company.showOff();
	}
}
