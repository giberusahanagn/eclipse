package com.xworkz.boot;

public class Shop {
      public String shopName;
      public String location;
      public String shopType;
      public double area;
      public int noOfItems;
      public String[] fruits;
      public String[] vegetables;
      public String[] dryFruits;
      public String[] chocolate;
      public String[] snacks;
      public String[] drinks;
      
      
      public Shop(String shopName,String location,String shopType,double area,
    	int noOfItems,String[] fruits,String[] vegetables,String[] dryFruits,
    	String[] chocolate,String[] snacks,String[] juice) {
    	  this.shopName=shopName;
    	  this.location=location;
    	  this.shopType=shopType;
    	  this.area=area;
    	  this.noOfItems=noOfItems;
    	  this.fruits=fruits;
    	  this.vegetables=vegetables;
    	  this.dryFruits=dryFruits;
    	  this.chocolate=chocolate;
    		this.snacks=snacks;
    		this.drinks=juice;
    	
	}
     
	public void display() {
    	  System.out.println(shopName);
    	  System.out.println(location);
    	  System.out.println(shopType);
    	  System.out.println(area);
    	  System.out.println(noOfItems);
    	  System.out.println("---fruits--");
    	  for (int i = 0; i < fruits.length; i++) {
			String fruit=(fruits[i]);
			System.out.println(fruit);
		}
    	  System.out.println("--vegetables---");
    	  for (int i = 0; i < vegetables.length; i++) {
  			String vegetable=(vegetables[i]);
  			System.out.println(vegetable);
  		}
    	  System.out.println("----dryFruits----");
    	  for (int i = 0; i < dryFruits.length; i++) {
    			String dryFruit=(dryFruits[i]);
    			System.out.println(dryFruit);
    		}
    	  System.out.println("----chocolate----");
    	  for (int i = 0; i < chocolate.length; i++) {
  			String choco=(chocolate[i]);
  			System.out.println(choco);
  		}
    	  System.out.println("---snacks----");
    	  for (int i = 0; i < snacks.length; i++) {
    			String snack=(snacks[i]);
    			System.out.println(snack);
    		}
    	  System.out.println("---drinks-----");
    	  for (int i = 0; i < drinks.length; i++) {
  			String drink=(drinks[i]);
  			System.out.println(drink);
  		}
    	  
      }
}
