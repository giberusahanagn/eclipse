package com.xworkz.thing.productRunner;

import com.xworkz.thing.product.Fish;

public class FishRunner {

	public static void main(String[] args) {

        Fish fish=new Fish();
      System.out.println("------------------");
      
        Fish fish1=new Fish("StarFish");
        System.out.println("------------------");
        
        Fish fish2=new Fish("StarFish","Bony Fish");
        System.out.println("------------------");
        
        Fish fish3=new Fish(99.99f);
        System.out.println("------------------");
        
        Fish fish4=new Fish(1);
        System.out.println("------------------");
        
        Fish fish5=new Fish(60);
        System.out.println("------------------");
        
        Fish fish6=new Fish(99.99f,1);
        System.out.println("------------------");
        
        Fish fish7=new Fish(99.99f,1,60);
        
	}

}
