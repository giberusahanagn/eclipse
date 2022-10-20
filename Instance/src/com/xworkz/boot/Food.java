package com.xworkz.boot;

public class Food{
	public String foodName;
	public boolean taste;
	public int noOfItems;
	public double price=100;
	public String location="Bangalore";
	public int noOfCustomers=190;
	
	public int[] priceList= {10,25,20,45,70};
	public String hotelName[];
	public String foodTypes[];
	public String paymentMode[];
	public String ingredients[];
    
	public Food(String foodName, boolean taste, int noOfItems, String[] foodTypes, String[] paymentMode,
			String[] ingredients,String[] hotelName) {
		this.foodName = foodName;
		this.taste = taste;
		this.price=price;
		this.location=location;
		this.noOfItems = noOfItems;
		this.noOfCustomers=noOfItems;
		this.foodTypes = foodTypes;
		this.paymentMode = paymentMode;
		this.ingredients = ingredients;
		this.hotelName=hotelName;
		this.priceList=priceList;
	}

	public void display() {
		System.out.println(foodName);
		System.out.println(taste);
		System.out.println(noOfItems);
		System.out.println(price);
		System.out.println(location);
		System.out.println(noOfCustomers);
		System.out.println("---------foodTypes-----------");
		for (int index = 0; index < foodTypes.length; index++) {
			String food = foodTypes[index];
			System.out.println(food);
		}
		System.out.println("---------paymentMode--------");
		for (int index = 0; index < paymentMode.length; index++) {
			String food = paymentMode[index];
			System.out.println(food);
		}
		System.out.println("------ingredients------");
		for (int index = 0; index < ingredients.length; index++) {
			String food = ingredients[index];
			System.out.println(food);
		}
		System.out.println("------Hotel Name------");
		for (int index = 0; index < hotelName.length; index++) {
			String name = hotelName[index];
			System.out.println(name);
		}
		System.out.println("------price List------");
		for (int index = 0; index < priceList.length; index++) {
			int price = priceList[index];
			System.out.println(price);
		}
	}

}
