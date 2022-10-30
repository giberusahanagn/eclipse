package com.xworkz.things;

//Weapon: name,use,weight
//showOff
public class Weapon {
	public String name;
	public String use;
	public int weight;

	public Weapon(String name, int weight) {
		super();
		this.name = name;
		this.use = use;
		this.weight = weight;

	}

	public void showOff() {
		System.out.println("Weapon name:" + name);
		System.out.println("use: " + use);
		System.out.println("weapon weight: " + weight);
	}
}
