package com.xworkz.bootRunner;

import com.xworkz.boot.Food ;

public class FoodRunner {

	public static void main(String[] args) {
		String[] foodTypes = { "Spicy", "Sweet", "Bitter" };
		String[] paymentMode = { "Hard cash", "google pay", "phone pay" };
		String[] ingredients = { "Rice", "vegetables", "rice", "masala" };
		Food food = new Food("Palav", true, 2, foodTypes, paymentMode, ingredients);
		food.display();
	}

}
