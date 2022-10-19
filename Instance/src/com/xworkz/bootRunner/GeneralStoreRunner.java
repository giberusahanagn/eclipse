package com.xworkz.bootRunner;

import com.xworkz.boot.GeneralStore;

public class GeneralStoreRunner {

	public static void main(String[] args) {
		String[] paymentOptions = { "Cash", "UPI" };
		String[] itemTypes = { "Chai", "Cool Drinks", "Daily using products", "Groceries" };
		String[] coolDrinks = { "Sting", "7up", "Coke" };
		String[] shampoo = { "sunsilk", "Dove" };
		String[] soaps = { "Santoor", "Mysore Sandal" };
		int[] packingCovers = { 5, 1, 5, 2, 5, 10 };

		GeneralStore generalStore = new GeneralStore("Dmart", "Bangalore", 560018, "Swathi", "10-9", paymentOptions, itemTypes, coolDrinks, shampoo, soaps, packingCovers);
			generalStore.show();
	

	}

}
