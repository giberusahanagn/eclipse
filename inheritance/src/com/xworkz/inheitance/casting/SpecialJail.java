package com.xworkz.inheitance.casting;

public class SpecialJail extends Jail{
	
	public String jailName="Special Jail";
	public int noOfCriminals=40;
    public SpecialJail() {
	System.out.println("Entered Special  Class");
	System.out.println("Jail name : "+jailName);
	System.out.println("No of Criminals : " +noOfCriminals);
}
}
