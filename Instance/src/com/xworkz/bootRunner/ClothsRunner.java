package com.xworkz.bootRunner;

import com.xworkz.boot.Cloths;

public class ClothsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] typeOfClothes= {"Cotton","Silk","polySter","nylon"};
		String[] typeOfSize= {"XS","M","L","XL","XXL"};
		String[] paymentMode= {"GPay","Phone pay","Paytm","Amazon"};
		String[] shopName= {"BSC","Myntra","Ajio","FlipCart"};
		String[] basedOnAge= {"1-9","10-13","15-20","21-25"};
		String[] typeOfDress= {"T-shirts","Shirts","Saree","Pants","kurtha"};
		
		Cloths cloths=new Cloths("BSC",'m', "Cotton", 10, 22,'F', typeOfClothes,typeOfSize, paymentMode,typeOfDress,shopName,basedOnAge);
	
	cloths.display();
	}

}
