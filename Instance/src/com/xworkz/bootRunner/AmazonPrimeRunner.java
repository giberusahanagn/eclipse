package com.xworkz.bootRunner;

import com.xworkz.boot.AmazonPrime;

public class AmazonPrimeRunner {

	public static void main(String[] args) {
		String[] session= {"childrens","adults"};
		String[] nameOfUsers= {"Sahana","bharatha","nagaveni"};
		long[] numbers= {9008284717l,9972451281l,8722159292l};
		int[] ages= {22,24,29};
		
		AmazonPrime amazon=new AmazonPrime("Sahana", 6,session,nameOfUsers,numbers,ages);
		amazon.display();
	}

}
