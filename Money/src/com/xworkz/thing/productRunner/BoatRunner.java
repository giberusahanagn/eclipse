package com.xworkz.thing.productRunner;

import com.xworkz.thing.product.Boat;

public class BoatRunner {

	public static void main(String[] args) {
		Boat boat = new Boat();
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyName);
		System.out.println(boat.owner);
		System.out.println(boat.type);
		boat.name = "Earphone";
		boat.color = "Black";
		boat.companyName = "Boat Company";
		boat.owner = "AmanGuptha";
		boat.type = 10;
		System.out.println(boat.name);
		System.out.println(boat.color);
		System.out.println(boat.companyName);
		System.out.println(boat.owner);
		System.out.println(boat.type);
		
		System.out.println("*************************");
		Boat type;
		type=new Boat("Bluetooth");
		System.out.println("*************************");
		Boat type1;
		type1=new Boat("Earphone",10);
		System.out.println("*************************");
		Boat type2;
		type2=new Boat("Bluetooth","Bla"
				+ "ck");
		System.out.println("*************************");
		Boat type3;
		type3=new Boat(10);
		System.out.println("*************************");
		Boat type4;
		type4=new Boat("Bluetooth","Black","AmanGuptha");
		System.out.println("*************************");
		Boat type5;
		type5=new Boat("Bluetooth","Black","Boat","AmanGuptha");
		
		System.out.println("*************************");
		
		Boat type6;
		type6=new Boat("Bluetooth","Black","Boat","AmanGuptha",10);
		
		

	}

}
