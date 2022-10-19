package com.xworkz.bootRunner;

import com.xworkz.boot.Shop;

public class ShopRunner {

	public static void main(String[] args) {
		
		String[] fruits= {"Mango","Water melon","Apple","Custard Apple"};
		String[] vegetables= {"Beans","Onion","Chilli","Tomato","Carrot"};
		String[] dryFruits= {"Almonds","Cashew","Walnuts","Dates","Raisins"};
		String[] chocolate= {"Dairy Milk","Milky Bar","Kit Kat","Nestle","Cadbury"};
		String[] snacks= {"Lays","Bingo","Full Toss","too Yummy"};
		String[] drinks= {"Mazaa","Tropicono","Red Bull","Thumbs Up"};
		
	Shop shop =new Shop("DMart","Bangalore","Global",13d,80,fruits,vegetables,dryFruits,chocolate,snacks,drinks);
	shop.display();
	}
	
}
