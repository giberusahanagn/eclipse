package com.xworkz.bootRunner;

import com.xworkz.boot.Laptop;
import com.xworkz.constants.Drive;

public class LaptopRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] company= {"HP","DELL","LENOVO","ASUS"};
		 double[] amount= {45000,34566,56768,35674};
		 String[] oSName= {"Intel","Razen"};
		 Laptop laptop=new Laptop("Sahana",2,"Bangalore","windows",27879,company,amount,oSName,Drive.DOWLOAD); 
		 laptop.show();
	}

}
