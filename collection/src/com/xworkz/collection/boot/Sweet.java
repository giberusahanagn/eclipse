package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Sweet {

	public static void main(String[] args) {

		Collection<String> sweet = new ArrayList<String>();
		sweet.add("Burfi");
		sweet.add("kajuBarfi");
		sweet.add("jamun");
		sweet.add("peda");
		sweet.add("dharwad peda..");
		sweet.add("basan laddu");
		sweet.add("rava unde");
		sweet.add("mysore pak");
		sweet.add("jelabi");
		sweet.add("badhusha");
		sweet.add("paneer kova");
		sweet.add("champakali");
		sweet.add("triangle sweet ");
		sweet.add("rasmalai");

		System.out.println("before clear method :" + sweet.size());
		for (String name : sweet) {
			System.out.println(name);
		}
		sweet.clear();
		System.out.println("after clear method :" + sweet.size());

		System.out.println(System.lineSeparator());
		Collection<String> currency = new ArrayList();
		currency.add("Rupee");
		currency.add("Arabic dirham");
		currency.add("afghani");
		currency.add("lek");
		currency.add("kwanza");
		currency.add("guilder");
		currency.add("manat");
		currency.add("manat");
		currency.add("boliviano");
		currency.add("Brazilian real");
		currency.add("ngultrum");
		currency.add("Cook dollar");
		currency.add("nakfa");
		currency.add("lempira");
		currency.add("Japanese yen");
		currency.add("Iraqi dinar");
		currency.add("Comorian franc");
		currency.add("South Korean won");
		currency.add("North Korean won");
		currency.add("Kuwaiti dinar");
		currency.add("Lebanese pound");
		currency.add("Liberian dollar");
		currency.add("Lesotho loti");
		currency.add("denar");
		currency.add("Mexican peso");
		currency.add("naira");
		System.out.println("before clear method :" + currency.size());
		currency.clear();
		System.out.println("after clear method :" + currency.size());
		System.out.println(System.lineSeparator());

		Collection<Integer> couponCode = new LinkedList();
		couponCode.add(3999);
		couponCode.add(4999);
		couponCode.add(5999);
		couponCode.add(6999);
		couponCode.add(6999);
		couponCode.add(7999);
		couponCode.add(7999);
		couponCode.add(8999);
		couponCode.add(9999);
		couponCode.add(1999);
		couponCode.add(2999);
		couponCode.add(999);
		couponCode.add(399);
		couponCode.add(499);
		couponCode.add(3999);
		couponCode.add(3999);
		couponCode.add(3999);
		System.out.println("before add :" + couponCode.size());
		couponCode.clear();
		System.out.println("After add :" + couponCode.size());

		System.out.println(System.lineSeparator());

		Collection<String> bike = new HashSet();
		bike.add("TVS");
		bike.add("Yamaha");
		bike.add("KTM");
		bike.add("Honda");
		bike.add("Bajaj");
		bike.add("Pulsar");
		bike.add("Hero Splendor Plus");
		bike.add("Yezdi Roadster");
		bike.add(" Royal Enfield Classic 350");
		bike.add("Yamaha YZF R15 V4");
		bike.add("Bajaj Pulsar NS200");
		bike.add("TVS Apache RTR 160 4V");
		bike.add("Honda SP 125");
		bike.add("TVS Raider 125");
		bike.add("Hero Splendor Plus");
		bike.add("Honda");
		bike.add("Honda Activa 6G");
		bike.add("Yamaha");
		bike.add("Royal Enfield Hunter 350. ...");
		bike.add("Yamaha R15S");
		bike.add("TVS Apache RTR 160");
		bike.add("Yamaha");
		bike.add("Kawasaki Ninja H2,");
		bike.add("Honda");
		bike.add("Honda Shine");

		System.out.println("before clear :" + bike.size());
		bike.clear();
		System.out.println("after clear :" + bike.size());

		System.out.println(System.lineSeparator());

		Collection<String> malls = new HashSet();
		malls.add("Garuda Mall");
		malls.add("Mantri Square Mall");
		malls.add("Orion Mall");
		malls.add("Lulu Mall");
		malls.add(" GT Mall");
		malls.add("Garuda Mall");
		malls.add("RR Mall");
		malls.add("Forum Mall");
		malls.add("Nexus Mall");
		malls.add("zolo Mall");
		malls.add("DLF Mall of IndiaMall");
		malls.add("VR Punjab  Mall");
		malls.add("Z Square Mall Mall");
		malls.add("Phoenix Palassio Mall");
		malls.add("Nexus Sujana Mall");
		malls.add("Acropolis  Mall");
		malls.add("Mani Mall");
		malls.add("Growel's Mall");
		malls.add("Vegas Mall");
		malls.add("VR Surat Mall");
		malls.add("Pacific Mall");
		malls.add("Moments Mall");
		malls.add("World Square Mall");
		malls.add("Logix City Centre Mall");
		malls.add("TDI Mall Mall");
		malls.add("DLF Avenue Mall");
		malls.add("MGF Metropolitan Mall");
		malls.add("Crown Interiorz Mall");
		malls.add("City Centre Mall");
		malls.add("Axis Mall");
		malls.add("MSX Mall");
		malls.add("Unity One Mall");
		malls.add("Lodha Xperia Mall");
		malls.add("Royal Meenakshi Mall");
		malls.add("Nexus Koramangala Mall");
		malls.add("Nexus Whitefield Mall");
		malls.add("Elements Mall");
		malls.add("Bharat Mall");
		malls.add("Bangalore Central Mall");
		malls.add("Hilite Mall, Calicut");
		malls.add("Lulu Mall, Kochi");
		malls.add("Mall of Travancore");
		malls.add("Oberon Mall");
		malls.add("Sobha City Mall");
		malls.add("Mall of Joy, Thrissur");
		malls.add("Selex Mall, Thrissur");
		malls.add("Abad Nucleus Mall");
		malls.add("Artech Central Mall");
		malls.add("RP Mall, Calicut");
		malls.add("DB City Mall, Bhopal");
		malls.add("Neptune Magnet Mall");
		malls.add("City Centre, Nashik");
		malls.add("Viviana Mall");
		malls.add("Metro Junction Mall");
		malls.add("Inorbit Mall, Vashi");
		malls.add("Korum Mall");
		malls.add("Khandesh Central Mall");
		malls.add("Utkal Centre Point");
		malls.add("DN Regalia");

		System.out.println("before add method :" + malls.size());
		malls.clear();
		System.out.println("after add method :" + malls.size());
		System.out.println(System.lineSeparator());
		
	}

}
