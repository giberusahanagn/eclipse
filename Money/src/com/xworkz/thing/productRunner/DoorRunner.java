package com.xworkz.thing.productRunner;

import com.xworkz.thing.product.Door;

public class DoorRunner {

	public static void main(String[] args) {
		Door door=new Door(25000);
		
		System.out.println("***************************");
		
		Door door1;
		door1=new Door("Shriganda", 25000);
		
		System.out.println("*************************");
		Door door2;
		door2=new Door("Vanni","Square");
		
		
		System.out.println("***********************");
		Door door3;
		door3=new Door(22000,"Vanni");
		
		System.out.println("*************************");
		Door door4;
		door4=new Door(22000,"Shriganda","square");
	}
	

}
