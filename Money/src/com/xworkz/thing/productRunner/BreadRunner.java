package com.xworkz.thing.productRunner;

import com.xworkz.thing.product.Bread;

public class BreadRunner {

	public static void main(String[] args) {

		Bread bread = new Bread();
		System.out.println(bread.type);
		System.out.println(bread.shape);
		System.out.println(bread.companyName);
		System.out.println(bread.price);
		System.out.println(bread.quantity);
		System.out.println("--------------------------");

		Bread bread1 = new Bread("Flat Bread");
		System.out.println("--------------------------");

		Bread bread2 = new Bread(30);
		System.out.println("--------------------------");

		Bread bread3 = new Bread(80.00f);
		System.out.println("--------------------------");

		Bread bread4 = new Bread("Flat Bread", 80.00f);
		System.out.println("--------------------------");

		Bread bread5 = new Bread("Flat Bread", "Round");
		System.out.println("--------------------------");

		Bread bread6 = new Bread("Flat Bread", "Round", "Governmet");
		System.out.println("--------------------------");

		Bread bread7 = new Bread("Flat Bread", "Round", "Governmet", 30);
		System.out.println("--------------------------");

		Bread bread8 = new Bread("Flat Bread", "Round", "Governmet", 30,80.00f);
	}
}
