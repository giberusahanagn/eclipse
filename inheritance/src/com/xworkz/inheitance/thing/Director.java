package com.xworkz.inheitance.thing;

public class Director {

	public String directorName;
	public int noOfMovies;
	
	public Director(String directorName, int noOfMovies) {
		super();
		this.directorName = directorName;
		this.noOfMovies = noOfMovies;
	}
	
	public void display() {
		System.out.println(directorName);
		System.out.println(noOfMovies);
	}
	
}
