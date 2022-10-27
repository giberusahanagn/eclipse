package com.xworkz.things;

//Fuel: brand:custom,special:true,type:enum,price,quantity
//showOff()-->brand.showOff
//totalPrice()
import com.xworkz.constants.Type;

public class Fuel {

	public boolean special = true;
	public float price;
	public int quantity;
	public Brand brand = new Brand();// class
	public Type type;// enum


	public void showOff() {
		System.out.println("Special:" + special);
		System.out.println("Fuel price: " + price);
		System.out.println("Fuel quantity: " + quantity);
		System.out.println("Fuel Type: "+Type.KEROSINE);
		System.out.println(System.lineSeparator());
		brand.showOff();
		
		
	
	}
}