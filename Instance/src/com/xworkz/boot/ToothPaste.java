package com.xworkz.boot;

import com.xworkz.constants.BrandName;

public class ToothPaste {
 
	public String name;
	public String productName;
	public String color;
	public BrandName brandName=BrandName.CLOSE_UP;
	public int noOfPastes;
	 public String[] names;
	public ToothPaste(String name,String product,String color,BrandName brandName,int noOfPastes,
			String[] names) {
		this.name=name;
		this.brandName=brandName.COLGATE;
		this.productName=productName;
		this.color=color;
		this.noOfPastes=noOfPastes;
		this.names=names;
		
	}
	public void display() {
		System.out.println(name);
		System.out.println(brandName);
		System.out.println(productName);
		System.out.println(color);
		System.out.println(noOfPastes);
	}
	
}
