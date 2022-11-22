package com.xworkz.methods.type;

public class Lipstick {
String name;
String price;
String noOfItems;
String size;
String color;
String noOfColors;
String noOfBrand;
public Lipstick(String price) {
	this.price=price;
}
@Override
	public boolean equals(Object obj) {
		if(obj instanceof Lipstick) {
			Lipstick casted=(Lipstick)obj;
			if(this.price.equals(casted.price)) {
				System.out.println("Lipstick : 1 properties");
			return true;
			}
			else {
				System.err.println("not matched");
			}
		}
		return false;
	}
}
