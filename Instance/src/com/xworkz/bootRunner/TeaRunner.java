package com.xworkz.bootRunner;

import com.xworkz.boot.Tea;

public class TeaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] brandName= {"RedLabel","Nestle","Tazaa"};
		 int[] noOfUsers= {20,34,5};
		 String[] ingredients= {"Water","Milk","Sugar","TeaPowder"};
		 String[] teaType= {"Normal Tea","Ginger tea","Black tea"};
		
			 Tea name = new Tea(null, null, null, null, null, 0, brandName, noOfUsers, ingredients, teaType); 
			 name.dispaly();
	}

}
