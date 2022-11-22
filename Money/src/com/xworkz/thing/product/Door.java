package com.xworkz.thing.product;

public class Door {
	public int price;
	public String wood;
	public String shape;
	
	public Door() {
		System.out.println("Door open aythu");
	}
	
	
	
	public Door(int price) {
		this.price=price;
		System.out.println(price);
		
	}
	public Door(String wood,int price) {
		this.wood=wood;
		this.price=price;
		System.out.println(wood);
		System.out.println(price);
	}
	public Door(String wood, String shape) {
		this.wood=wood;
		this.shape=shape;
		System.out.println(wood);
		System.out.println(shape);
	}
	public Door(int price, String wood) {
		this.price=price;
		this.wood=wood;
		System.out.println(price);
		System.out.println(wood);
	}
	public Door(int price,String wood,String shape) {
		this.price=price;
		this.shape=shape;
		this.wood=wood;
		System.out.println(price);
		System.out.println(shape);
		System.out.println(wood);
	}

}
