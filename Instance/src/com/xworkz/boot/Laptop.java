package com.xworkz.boot;

import com.xworkz.constants.Drive;

public class Laptop {
	
	public String userName;
	public int noOfLaptop;
	public String location;
	public String OS;
	public double price;
	
	public String[] company;
	public double[] amount;
	public String[] oSName;
	public Drive drive=Drive.LOCALDISK_B;
	
	public Laptop(String userName,int noOfLaptop,String location,String OS,double price
			,String[] company,double[] amount,String[] oSName,Drive drive) {
		
		this.userName=userName;
		this.noOfLaptop=noOfLaptop;
		this.location=location;
		this.OS=OS;
		this.price=price;
		this.company=company;
		this.amount=amount;
		this.oSName=oSName;
		this.drive=drive;
				
	}
	public void show() {
		// TODO Auto-generated method stub
			System.out.println(userName);
			System.out.println(noOfLaptop);
			System.out.println(location);
			System.out.println(OS);
			System.out.println(price);
			System.out.println(company);
			System.out.println(amount);
			System.out.println(oSName);
			System.out.println(Drive.MUSIC.ordinal());
		
	}
	
}
