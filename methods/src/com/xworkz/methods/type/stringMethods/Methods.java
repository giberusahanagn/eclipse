package com.xworkz.methods.type.stringMethods;

public class Methods {

	public static void main(String[] args) {
		String name = "sahana";
		char ch = name.charAt(5);// returns the char value at the 4th index

		System.out.println("charAt() method: " + ch);
		System.out.println(System.lineSeparator());

		System.out.println("codePointAt()--> " + "gets unicode  :" + name.codePointAt(2));
		System.out.println(System.lineSeparator());

		System.out.println("provides unicode of previous index value: " + name.codePointBefore(2));
		System.out.println(System.lineSeparator());
		System.out.println("count the number of index value using start and end values: ");
		System.out.println(name.codePointCount(0, 3));
		System.out.println(System.lineSeparator());

		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		String word = "";
		System.out.println(name.concat(" GN"));
		System.out.println(name.compareTo(word));
		System.out.println(word.hashCode());

		System.out.println(word.isEmpty());
		System.out.println(System.lineSeparator());
		// System.out.println(name.valueOf(4));

		
		String a="swati";
		String b="swati";
		
		System.out.println(a.equals(b));//equals
		
		System.out.println(a.contentEquals(b));//char sequence
		
		System.out.println(a.contentEquals(b));//String buffer
		
		
		

	}

}
