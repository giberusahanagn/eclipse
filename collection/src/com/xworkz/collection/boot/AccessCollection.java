package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class AccessCollection {

	public static void main(String[] args) {

		Collection<String> animals = new ArrayList<String>();
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Gifare");
		animals.add("Monkey");
		animals.add("Chimpange");
		animals.add("Rabbit");
		animals.add("Cow");
		animals.add("Goat");
		animals.add("buffolo");
		animals.add("Donkey");
		animals.add("Horse");

		for (String names : animals) {
			System.out.println("for each loop-->animals name " + names);
		}
		System.out.println(System.lineSeparator());
		Iterator<String> hesaru = animals.iterator();
		while (hesaru.hasNext()) {
			System.out.println(hesaru.next());
		}

		System.out.println("----------------------------");
		String watch1 = "Sonata";

		Collection<String> wathes = new ArrayList<String>();
		wathes.add(watch1);
		wathes.add("Sonata");
		wathes.add("Titan");
		wathes.add("FastTrack");
		wathes.add("HMT");
		wathes.add(null);

		for (String names : wathes) {
			System.out.println(names);
		}
		System.out.println(System.lineSeparator());
		Iterator<String> ref = wathes.iterator();
		while (ref.hasNext()) {
			String string = (String) ref.next();
			System.out.println(string);
		}
		System.out.println("-----------------");
		Collection<Integer> sizes = new TreeSet<Integer>();
		sizes.add(5);
		sizes.add(6);
		sizes.add(7);
		sizes.add(8);
		sizes.add(9);
		sizes.add(10);
		sizes.add(11);
		sizes.add(12);
		sizes.add(12);
		sizes.add(2);
		sizes.add(3);
		sizes.add(6);
		sizes.add(0);
		sizes.add(8);
		sizes.add(9);
		for (Integer integer : sizes) {
			System.out.println(integer);
		}
		System.out.println(System.lineSeparator());

		Iterator<Integer> iteratorSize = sizes.iterator();
		while (iteratorSize.hasNext()) {
			System.out.println(iteratorSize.next());
		}

		System.out.println("----------------------------------");

		Collection<String> cities = new LinkedHashSet<String>();
		cities.add("Banaglore");
		cities.add("Hyderbad");
		cities.add("Chennai");
		cities.add("Mumbai");
		cities.add("Telangana");

		for (String string : cities) {
			System.out.println(string);
		}
		System.out.println(System.lineSeparator());
		Iterator<String> ref1 = cities.iterator();

		while (ref1.hasNext()) {
			System.out.println(ref1.next());
		}
		System.out.println("-----------------------------------");

		Collection<String> companies = new ArrayList<String>();
		companies.add("Xworkz");
		companies.add("TCS");
		companies.add("Common Wealth");
		companies.add("IBM");
		companies.add("Oracle");
		companies.add("Infosys");
		companies.add("Wipro");
		companies.add("Capgemini");
		companies.add("Moback");
		companies.add("Cognizant");
		companies.add("Kyndral");
		companies.add("Delloti");
		companies.add("PWC");
		companies.add("Spederian");
		companies.add("Accenture");
		companies.add("InfoTech");
		companies.add("Redmi");
		companies.add("Oopo");
		companies.add("Vivo");
		companies.add("HP");
		for (String string : companies) {
			System.out.println(string);
		}

		System.out.println(System.lineSeparator());

		Iterator<String> ref3 = companies.iterator();
		while (ref3.hasNext()) {
			System.out.println(ref3.next());
		}
	}

}
