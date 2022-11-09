package com.xworkz.inheitance.thing;

public class Criminal {

	public String criminalName;
	public boolean jail;
	public Criminal(String criminalName,boolean jail) {
		this.criminalName=criminalName;
		this.jail=jail;
	}
	
	public void display() {
		System.out.println(criminalName);
		System.out.println(jail);
	}
}
