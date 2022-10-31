package com.xworkz.things.associationArray;

public class Country {
	public String name;
	public String capital;
	public String president;
	public double area;
 public Country() {

}
 public void setValues(String name, String capital, String president, double area) {
		this.name = name;
		this.capital = capital;
		this.president = president;
		this.area = area;
 }
	public void showOff() {
		System.out.println("Country class....");
		System.out.println(name);
		System.out.println(capital);
		System.out.println(president);
		System.out.println(area);
		
	}
}
