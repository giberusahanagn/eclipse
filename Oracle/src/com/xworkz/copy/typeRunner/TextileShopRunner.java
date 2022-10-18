package com.xworkz.copy.typeRunner;

import com.xworkz.copy.type.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {
	TextileShop textileShop = new TextileShop(8798);
	System.out.println("--------------------");
	TextileShop textileShop1 = new TextileShop("Nagaraj");
	System.out.println("-------------------");
	
	TextileShop textileShop2 = new TextileShop("sahana",349733637l);
	System.out.println("-------------------");
	
	TextileShop textileShop3 = new TextileShop(1,872215919l,"dhruthi");
	
	System.out.println("-------------------");
	TextileShop textileShop4 = new TextileShop(9972451281l);
	
	System.out.println("-------------------");
	TextileShop textileShop5 = new TextileShop(30,"Bharath",9481038849l);
	
	
	
	}

}
