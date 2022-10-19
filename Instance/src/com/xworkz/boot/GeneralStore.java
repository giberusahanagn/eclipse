package com.xworkz.boot;

public class GeneralStore {
	public String name;
	public String area;
	public double areaPincode;
	public String ownerName;
	public String timings;

	public String[] paymentOptions;
	public String[] itemTypes;
	public String[] coolDrinks;
	public String[] shampoo;
	public String[] soaps;
	public int[] packingCovers;

	public GeneralStore(String name, String area, double areaPincode, String ownerName, String timings,
			String[] paymentOptions, String[] itemTypes, String[] coolDrinks, String[] shampoo, String[] soaps,
			int[] packingCovers) {

		this.name = name;
		this.area = area;
		this.areaPincode = areaPincode;
		this.ownerName = ownerName;
		this.timings = timings;

		this.paymentOptions = paymentOptions;
		this.itemTypes = itemTypes;
		this.coolDrinks = coolDrinks;
		this.shampoo = shampoo;
		this.soaps = soaps;
		this.packingCovers = packingCovers;

	}

	public void show() {
		System.out.println("Name : " + name);
		System.out.println("Area : " + area);
		System.out.println("Area Pincode : " + areaPincode);
		System.out.println("Owner Name : " + ownerName);
		System.out.println("Opening Hours :" + timings);

		System.out.println("====Payment Options====");
		for (int i = 0; i < paymentOptions.length; i++) {
			String string = paymentOptions[i];
			System.out.println(string);
		}
		System.out.println("====Item Types====");
		for (int i = 0; i < itemTypes.length; i++) {
			String string = itemTypes[i];
			System.out.println(string);
		}
		System.out.println("====Cool Drinks====");
		for (int i = 0; i < coolDrinks.length; i++) {
			String string = coolDrinks[i];
			System.out.println(string);
		}

		System.out.println("====Shampoos====");
		for (int i = 0; i < shampoo.length; i++) {
			String string = shampoo[i];
			System.out.println(string);
		}
		System.out.println("====Soaps====");
		for (int i = 0; i < soaps.length; i++) {
			String string = soaps[i];
			System.out.println(string);
		}
		System.out.println("====Packing Covers====");
		for (int i = 0; i < packingCovers.length; i++) {
			int d = packingCovers[i];
			System.out.println(d);
		}

	}
}


