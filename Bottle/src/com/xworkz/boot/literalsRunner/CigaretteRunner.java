package com.xworkz.boot.literalsRunner;

import com.xworkz.boot.literals.Cigarette;

public class CigaretteRunner {

	public static void main(String[] args) {
		Cigarette type=new Cigarette();
		System.out.println(type.brand);
		System.out.println(type.Colour);
	    System.out.println(type.length);
		System.out.println(type.weigth);
		System.out.println(type.typesOfCigarette);
		System.out.println(type.shape);
		System.out.println(type.price);
		System.out.println(type.name);
		System.out.println(type.noOfCigaretteInAPack);
		System.out.println("******************************");
		type.goodForCondition=false;
		type.manifacturing=1998;
		type.place="Gujaratha";
		System.out.println(type.goodForCondition);
		System.out.println(type.manifacturing);
		System.out.println(type.place);

	}

}
