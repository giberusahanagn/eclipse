package com.xworkz.methods.type.stringMethods;

public class Palindrome {
	public static void main(String[] args) {
		String word = "anna anna amma ";
		//char[] ch = word.toCharArray();
		String[] split = word.split(" ");
		System.out.println(split.length);
		int j;
		int index;
		for (index = 0; index < split.length; index++) {
			for (j = split.length -1; j >= 0; j--) {
				if (split[index].equals(split[j])) {
					System.out.println(split[index] + " matched with " + split[j]);
				} else {
					System.err.println(split[index] + " not matched with " + split[j]);
				}
			}
		}
	}

}
