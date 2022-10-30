package com.xworkz.things.associationProgram;

public class President {

	public String name;
	public int tenure;
	public Gender gender=Gender.FEMALE;
	
	public President() {
		
	}
	public void presidentDisplay(String name,int tenure,Gender gender) {
		this.name=name;
		this.tenure=tenure;
		this.gender=gender;
		System.out.println("Name of the presidnet:"+name);
		System.out.println("Tenure of the president: "+tenure);
		System.out.println("Gender:"+gender);
	}
}
