package com.xworks.programs.programs;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}
	public void Display() {
		
		System.out.println("instatnce method");
		
	}
	public static void show() {
	Program pr = new Program();
	pr.Display();
		System.out.println("static mathod");
	}
	
	public static void main(String[] args) {
		
		
		 Program name = new Program();
		name.Display();
		name.show(); 
		
		//Program.show();
		Program.show();
		
	}
}
