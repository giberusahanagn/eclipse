package com.xworkz.copy.type;

public class Tractor {
	public String ownerName;
	public String brand;
	public double price;
	public String color;
	public int hp;
	public String model;

	public Tractor() {
		System.out.println("Program Strat aythu");

	}
	public Tractor(String ownerName) {
		this.ownerName=ownerName;
		System.out.println("OwnerName :" +ownerName);
	}
	public Tractor(String ownerName,String brand) {
		this(ownerName);
		this.brand=brand;
		System.out.println("Tractor Brand :" +brand);
	}
	
	public Tractor(String ownerName,String brand ,String color) {
		this(ownerName,brand);
		this.color=color;
		System.out.println("Tractor color :" +color);
	}
	public Tractor(String ownerName,String brand ,String color,double price) {
		this(ownerName,brand,color);
		this.price=price;
		System.out.println("Tractor price :" +price);
	}
	public Tractor(String ownerName,String brand ,String color,double price,int hp) {
		this(ownerName,brand,color,price);
		this.hp=hp;
		System.out.println("Tractor hp :" +hp);
	}
}
