package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.Tractor;

public class TractorRunner {

	public static void main(String[] args) {
		Tractor tractor=new Tractor ();
		System.out.println(tractor.ownerName);
		System.out.println(tractor.brand);
		System.out.println(tractor.price);
		System.out.println(tractor.hp);
		System.out.println(tractor.color);
		System.out.println(tractor.model);
		System.out.println();  
		System.out.println("constract ownername");
		Tractor tractor1=new Tractor("Anand Mahindra"); 
		
		System.out.println("constract brand");
		Tractor tractor2=new Tractor("Anand Mahindra","Mahindra"); 
		
		System.out.println("constract color"); 
		Tractor tractor3=new Tractor("Anand Mahindra","Mahindra","Blue");
		
		System.out.println("constract price");
		Tractor tractor4=new Tractor("Anand Mahindra","Mahindra","Blue",4000000d);
		
		System.out.println("constract hp");
		Tractor tractor5=new Tractor("Anand Mahindra","Mahindra","Blue",4000000d,245);


	}

}
