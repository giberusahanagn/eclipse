package com.xworkz.boot;

public class Food{
	public String foodName;
	public boolean taste;
	public int noOfItems;

	public String foodTypes[];
	public String paymentMode[];
	public String ingredients[];

	public Food(String foodName, boolean taste, int noOfItems, String[] foodTypes, String[] paymentMode,
			String[] ingredients) {
		this.foodName = foodName;
		this.taste = taste;
		this.noOfItems = noOfItems;
		this.foodTypes = foodTypes;
		this.paymentMode = paymentMode;
		this.ingredients = ingredients;
	}

	public void display() {
		System.out.println(foodName);
		System.out.println(taste);
		System.out.println(noOfItems);

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
	}

}
