package com.xworkz.copy.type;

public class TextileShop {
	
public String ownerName;
public String ownerWifeName;
public String ownerDaughterName;
public int ownerNoOfWifes;
public int shopNo;
public long ownerDaughterNumber;
public long contactNo;



public TextileShop() {
	System.out.println("custom Const....");
}
public TextileShop(String ownerName) {
	this(1,9008284717l,"monu");
	this.contactNo=contactNo=967676695l;
	this.ownerName=ownerName;
	System.out.println("owner Name:"+ownerName);
	System.out.println("owner  contact No:"+contactNo);
}

public TextileShop( String ownerDaughterName,long ownerDaughterNumber) {

	this.ownerDaughterName=ownerDaughterName;
	this.ownerDaughterNumber=ownerDaughterNumber;
	System.out.println("owner Daughter Name:"+ownerDaughterName);
	System.out.println("owner Daughter Number:"+ownerDaughterNumber);
}
public TextileShop( int ownerNoOfWifes) {

	this("Sahana",934762352l);
	this.ownerNoOfWifes=ownerNoOfWifes=1;
	System.out.println("owner No Of Wifes:"+ownerNoOfWifes);
}
public TextileShop( long ownerDaughterNumber) {
	this(10,"dhruthi",872215919l);
	this.ownerDaughterNumber=ownerDaughterNumber;
	System.out.println("owner Daughter Number:"+ownerDaughterNumber);
}
public TextileShop( int shopNo,String ownerName,long contactNo) {
	this(1,9972451281l,"Sahana");
	this.shopNo=shopNo;
	this.ownerName=ownerName;
	this.contactNo=contactNo;
	System.out.println("shop No:"+shopNo);
	System.out.println("owner Name:"+ownerName);
	System.out.println("contact No:"+contactNo);
}
public TextileShop(int ownerNoOfWifes,long ownerDaughterNumber,String ownerDaughterName ) {

	this.shopNo=shopNo=9;
	this.ownerNoOfWifes=ownerNoOfWifes;
	this.ownerDaughterName=ownerDaughterName;
	
	System.out.println("shopNo:"+shopNo);
	System.out.println("owner No Of Wifes:"+ownerNoOfWifes);
	System.out.println("owner Daughter Number:"+ownerDaughterNumber);
	System.out.println("owner Daughter Name:"+ownerDaughterName);
	
	
	
}

}
