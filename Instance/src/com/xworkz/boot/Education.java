package com.xworkz.boot;

public class Education {
  public String studentName;
  public String location;
  public String source;
  public String destination;
  public int noOfFriends;
  public String[] intermediate;
  public String[] degreeName;
  public int[] noOfYears;
   
   public Education(String studentName,String location,String source,
		   String destination,int noOfFriends,String[] intermediate,
		   String[] degreeName,int[] noOfYears) {
	   this.studentName=studentName;
	   this.location=location;
	   this.source=source;
	   this.destination=destination;
	   this.noOfFriends=noOfFriends;
	   this.intermediate=intermediate;
	   this.degreeName=degreeName;
	   this.noOfYears=noOfYears;  
   }
  public void display(){
	   System.out.println(studentName);
	   System.out.println(location);
	   System.out.println(source);
	   System.out.println(destination);
	   System.out.println(noOfFriends);
	   System.out.println("----intermediate-----");
	   for (int i = 0; i < intermediate.length; i++) {
		String name=intermediate[i];
		System.out.println(name);
	}
	   System.out.println("----degreeName-----");
	   for (int i = 0; i < degreeName.length; i++) {
			String name=degreeName[i];
			System.out.println(name);
		}
	   System.out.println("------noOfYears-------"); 
	   for (int i = 0; i < noOfYears.length; i++) {
			int duration=noOfYears[i];
			System.out.println(duration);
		}
   }
}
