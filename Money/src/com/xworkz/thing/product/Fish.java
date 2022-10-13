package com.xworkz.thing.product;

public class Fish {
 public String name;
 public String type;
 public float price;
 public double weight;
 public int length;
 
 public Fish() {
	 System.out.println("Fish Market");
 }
 public Fish(String name) {
	 this.name=name;
	 System.out.println("Fish name: "+name);
 }
 public Fish(String name ,String type) {
	 this.name=name;
	 this.type=type;
	 
	 System.out.println("Fish name: "+name);
	 System.out.println("Fish type: "+type);
 }
 public Fish(float price) {
	 this.price=price;
	 System.out.println("Fish price: "+price);
 }
 public Fish(double weight) {
	 this.weight=weight;
	 System.out.println("Fish weight: "+weight);
 }
 
 public Fish(int length) {
	 this.length=length;
	 System.out.println("Fish length: "+length);
 }
 public Fish(float price,double weight) {
	 this.price=price;
	 this.weight=weight;
	 
	 System.out.println("Fish price: "+price);
	 System.out.println("Fish weight: "+weight);
 }
 public Fish(float price,double weight,int length) {
	 this.price=price;
	 this.weight=weight;
	 this.length=length;
	 System.out.println("Fish price: "+price);
	 System.out.println("Fish weight: "+weight);
	 System.out.println("Fish length: "+length);
 }
}
