package com.xworkz.boot;

public class Tea {

	public String product="Tea";
	public String brand="RedLable";
	public String place="TeaShop";
	public String type="Normal";
	public String color="brown";
	public int quantity=100;
	public String[] brandName;
	public int[] noOfUsers;
	public String[] ingredients;
	public String[] teaType;
	public Tea(String product,String brand,String place,String type,String color,int quantity,
			String[] brandName,int[] noOfUsers,String[] ingredients,String[] teaType) {
		
		this.product=product;
		this.brand=brand;
		this.place=place;
		this.type=type;
		this.color=color;
		this.quantity=quantity;
		this.brandName=brandName;
		this.noOfUsers=noOfUsers;
		this.ingredients=ingredients;
		this.teaType=teaType;
		
	}
	public void dispaly() {
		System.out.println(product);
		System.out.println(brand);
		System.out.println(place);
		System.out.println(type);
		System.out.println(color);
		System.out.println(quantity);
		System.out.println("------no of users---");
		for (int i = 0; i < noOfUsers.length; i++) {
			int string = noOfUsers[i];
			System.out.println(string);
		}
		System.out.println("----brandName----");
		for (int i = 0; i < brandName.length; i++) {
			String string = brandName[i];
			System.out.println(string);
		}
		System.out.println("---ingredients----");
		for (int i = 0; i < ingredients.length; i++) {
			String string = ingredients[i];
			System.out.println(string);
		}
		System.out.println("------tea type----");
		for (int i = 0; i < teaType.length; i++) {
			String string = teaType[i];
			System.out.println(string);
		}
		
		
	}
}
