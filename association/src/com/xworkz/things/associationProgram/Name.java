package com.xworkz.things.associationProgram;

public class Name {

	public String currentName;
	public String oldName;
	public String futureName;

	public Name() {
	}
	
	public void nameDisplay(String currentName, String oldName, String futureName) {
		System.out.println("displaying Name class");
		System.out.println("Current Name: " + currentName);
		System.out.println("Old Name :" + oldName);
		System.out.println("Future Name: " + futureName);
	}
}
