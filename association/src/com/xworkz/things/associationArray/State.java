package com.xworkz.things.associationArray;

public class State {
	public String name;
	public String capital;
	public String chiefMisiter;
	public double area;
	
	public State() {
		
	}
	 public void setValues(String name, String capital, String chiefMisiter, double area) {
			this.name=name;
			this.capital=capital;
			this.chiefMisiter=chiefMisiter;
			this.area=area;
		}
	public void showOff() {
		System.out.println("State class......");
		System.out.println(name);
		System.out.println(capital);
		System.out.println(chiefMisiter);
		System.out.println(area);
	}
	
	
}
