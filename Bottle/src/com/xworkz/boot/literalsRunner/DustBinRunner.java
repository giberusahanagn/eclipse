package com.xworkz.boot.literalsRunner;

import com.xworkz.boot.literals.DustBin;

public class DustBinRunner {

	public static void main(String[] args) {
		
			DustBin dustBin=new DustBin();
			System.out.println(dustBin.thing);
			System.out.println(dustBin.madeOf);
			System.out.println(dustBin.shape);
			System.out.println(dustBin.length);
			System.out.println(dustBin.weight);
			System.out.println(dustBin.price);
			System.out.println(dustBin.size);
			System.out.println(dustBin.nameOfBrand);
			
			dustBin.wetWaste=true;
			dustBin.dryWaste=true;
			dustBin.noOfTypes=3;
			System.out.println(dustBin.wetWaste);
			System.out.println(dustBin.dryWaste);
			System.out.println(dustBin.noOfTypes);
		
			System.out.println("==========another copy========");
			DustBin dustBin2=new DustBin();
			dustBin2.thing="BUCKET";
			dustBin2.madeOf="Steel";
			dustBin2.length=40;
			System.out.println(dustBin2.thing);
			System.out.println(dustBin2.madeOf);
			System.out.println(dustBin2.shape);
			System.out.println(dustBin2.length);
			System.out.println(dustBin2.weight);
			System.out.println(dustBin2.price);
			System.out.println(dustBin2.size);
			System.out.println(dustBin2.nameOfBrand);
			
			dustBin.wetWaste=false;
			dustBin.dryWaste=true;
			dustBin.noOfTypes=3;
			System.out.println(dustBin2.wetWaste);
			System.out.println(dustBin2.dryWaste);
			System.out.println(dustBin2.noOfTypes);
		
			
	}

}
