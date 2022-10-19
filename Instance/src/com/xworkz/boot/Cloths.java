package com.xworkz.boot;

public class Cloths {
	public String name;
	public char size;
	public String clothType;
	public int noOfClothes;
	public int age;
	public char gender;
	public String[] typeOfClothes;
	public String[] typeOfSize;
	public String[] paymentMode;
	public String[] typeOfDress;
	public String[] shopName;
	public String[] basedOnAge;
	
	public Cloths(String name,char size,String clothType,int noOfClothes,int age,char gender,
			String[] typeOfClothes,String[] typeOfSize,String[] paymentMode,String[] typeOfDress,
			String[] shopName,String[] basedOnAge) {this.name=name;
			this.size=size;
			this.clothType=clothType;
			this.age=age;
			this.gender=gender;
			this.typeOfClothes=typeOfClothes;
			this.typeOfSize=typeOfSize;
			this.typeOfDress=typeOfDress;
			this.paymentMode=paymentMode;
			this.shopName=shopName;
			this.basedOnAge=basedOnAge;
	}			
	public void display(){
		System.out.println(name);
		System.out.println(size);
		System.out.println(clothType);
		System.out.println(age);
		System.out.println(gender);
		
		System.out.println("--------typeOfClothes-----");
		  for(int index=0;index<typeOfClothes.length;index++) {
			  String source=typeOfClothes[index];
			  System.out.println(source);
		  }
		  System.out.println("----typeOfSize-----");
		  for(int index=0;index<typeOfSize.length;index++) {
			  String sizeType=typeOfSize[index];
			  System.out.println(sizeType);
		  }
		  System.out.println("----typeOfDress-----");
		  for(int index=0;index<typeOfDress.length;index++) {
			  String dressName=typeOfDress[index];
			  System.out.println(dressName);
		  }
		  System.out.println("----paymentMode-----");
		  for(int index=0;index<paymentMode.length;index++) {
			  String payment=paymentMode[index];
			  System.out.println(payment);
		  }
		 
		  System.out.println("-----shopName----------");
		  for(int index=0;index<shopName.length;index++) {
			  String names=shopName[index];
			  System.out.println(names);
		  }
		  System.out.println("----basedOnAge-----");
		  for(int index=0;index<basedOnAge.length;index++) {
			  String agesList=basedOnAge[index];
			  System.out.println(agesList);
		  }
	}
}
