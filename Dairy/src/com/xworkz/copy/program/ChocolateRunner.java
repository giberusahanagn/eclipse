package com.xworkz.copy.program;

public class ChocolateRunner {
	public static void main(String[] args) {
		Chocolate type=new Chocolate();
		System.out.println(type.name);
		System.out.println(type.brand);
		System.out.println(type.flavour);
		System.out.println(type.price);
		
		System.out.println("****************");
		type.name="Dairy Milk";
		type.brand="Cadbury";
		type.flavour="Nuts";
		type.price=100;
		System.out.println(type.name);
		System.out.println(type.brand);
		System.out.println(type.flavour);
		System.out.println(type.price);
		
	}

}
