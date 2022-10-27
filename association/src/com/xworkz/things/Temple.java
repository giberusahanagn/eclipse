package com.xworkz.things;
//Temple: name,god:custom,mainPriest,noOfVisitor,collectionPerDay
public class Temple {
	public String name="Kaashi";
	public God god=new God();
	public String mainPriest="acharya";
	public int noOfVisitor=1000;
	public long collectionPerDay=567890l;
	
	public  void displayTemple() {
		System.out.println("Temple name: "+name);
		System.out.println("Temple main priest: "+mainPriest);
		System.out.println("noOfVisitor: "+noOfVisitor);
		System.out.println("collection Per Day: "+collectionPerDay);
		System.out.println(System.lineSeparator());
		
	}
}
