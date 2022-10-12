package com.xworkz.boot.literalsRunner;

import com.xworkz.boot.literals.Rmd;

public class RmdRunner {

	public static void main(String[] args) {
		Rmd rmd=new Rmd();
		System.out.println(rmd.type);
		System.out.println(rmd.relaxation);
		System.out.println(rmd.quantity);
		System.out.println(rmd.quality);
		System.out.println(rmd.product);
		System.out.println(rmd.price);
		System.out.println(rmd.place);
		System.out.println(rmd.color);
		System.out.println(rmd.brand);
		System.out.println("*********************");
		rmd.netWeight=50;
		rmd.manfDate=2022;
		rmd.healthy=false;
		rmd.expDate=6;
		rmd.pack="12Packs";
		System.out.println(rmd.netWeight);
		System.out.println(rmd.manfDate);
		System.out.println(rmd.healthy);
		System.out.println(rmd.expDate);
		System.out.println(rmd.pack);
		
	}

}
