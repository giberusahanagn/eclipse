package com.xworkz.boot.literalsRunner;

import com.xworkz.boot.literals.Tea;

public class TeaRunner {
public static void main(String[] args) {
	Tea tea=new Tea();
	System.out.println(tea.product);
	System.out.println(tea.brand);
	System.out.println(tea.place);
	System.out.println(tea.type);
	System.out.println(tea.color);
	System.out.println(tea.quantity);
	System.out.println(tea.typesOfTea);
	System.out.println(tea.gingerInGm);
	System.out.println(tea.sugar);
	
	tea.quality=true;
	System.out.println(tea.quality);
	tea.milk="Nandhini";		
	System.out.println(tea.milk);
	
	tea.water=15;
	System.out.println(tea.quality);
	
	tea.relaxation=true;
	System.out.println(tea.relaxation);
	
	
	tea.manfDate=08082022d;
	System.out.println(tea.manfDate);
	
	tea.expDate=08082023d;
	System.out.println(tea.expDate);
	
	tea.netWeight=100;
	System.out.println(tea.netWeight);
	
	tea.healthy=true;
	System.out.println(tea.healthy);
	System.out.println("===========");
	
	Tea coffee=new Tea();
	coffee.product="COFFEE";
	coffee.place="CoffeeShop";
	coffee.brand="malgudi";
	System.out.println(coffee.product);
	System.out.println(coffee.place);
	System.out.println(coffee.brand);
	System.out.println("-------after changing---");
	tea=coffee;
	
	coffee.product="Coffee";
	System.out.println(coffee.product);
	System.out.println(coffee.brand);
	System.out.println(coffee.place);
	System.out.println(coffee.type);
	System.out.println(coffee.color);
	System.out.println(coffee.quantity);
	System.out.println(coffee.typesOfTea);
	System.out.println(coffee.gingerInGm);
	System.out.println(coffee.sugar);
	System.out.println(coffee.quality);
	System.out.println(coffee.milk);
	System.out.println(coffee.water);
	System.out.println(coffee.price);
	System.out.println(coffee.relaxation);
	System.out.println(coffee.manfDate);
	System.out.println(coffee.expDate);
	System.out.println(coffee.netWeight);
	System.out.println(coffee.healthy);
	
	
	
	
}
}
