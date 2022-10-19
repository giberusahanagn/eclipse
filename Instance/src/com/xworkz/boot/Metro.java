package com.xworkz.boot;

public class Metro {
	
	public String name;
	public String location;
	 public String personName;
	  public String source;
	  public String destination;
	  public int noOfBoogis;
	  public String[] sourceName;
	  public String[] mergeName;
	  public String[] destinationName;
	  public String[] seatTypes;
	  public int[] smartcardId;
	  
	  public Metro(String name,String location,String personName,String source,String destination,
			  int noOfBoogis,String[] sourceName,String[] mergeName,String[] destinationName,
			  String[] seatTypes,int[] smartcardId) {
		// TODO Auto-generated constructor stub
		  this.name=name;
		  this.location=location;
		  this.personName=personName;
		  this.source=source;
		  this.destination=destination;
		  this.noOfBoogis=noOfBoogis;
		  this.sourceName=sourceName;
		  this.mergeName=mergeName;
		  this.destinationName=destinationName;
		  this.seatTypes=seatTypes;
		  this.smartcardId=smartcardId; 
	}
	  public void display() {
		  System.out.println(name);
		  System.out.println(location);
		  System.out.println(personName);
		  System.out.println(source);
		  System.out.println(destination);
		  System.out.println(noOfBoogis);
		  System.out.println("--------SourceName-----");
		  for(int index=0;index<sourceName.length;index++) {
			  String source=sourceName[index];
			  System.out.println(source);
		  }
		  System.out.println("----mergeName-----");
		  for(int index=0;index<mergeName.length;index++) {
			  String name=mergeName[index];
			  System.out.println(name);
		  }
		  System.out.println("----destinationName-----");
		  for(int index=0;index<destinationName.length;index++) {
			  String destination=destinationName[index];
			  System.out.println(destination);
		  }
		  System.out.println("----seattype-----");
		  for(int index=0;index<seatTypes.length;index++) {
			  String seattype=seatTypes[index];
			  System.out.println(seattype);
		  }
		  System.out.println("-----smart card id----------");
		  for(int index=0;index<smartcardId.length;index++) {
			  int smartCardNo=smartcardId[index];
			  System.out.println(smartCardNo);
		  }
	  }
}
