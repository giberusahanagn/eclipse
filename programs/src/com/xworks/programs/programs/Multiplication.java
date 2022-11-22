package com.xworks.programs.programs;

public class Multiplication {
	public static void main(String[] args) {
		String givenNumber = "200";
		int number = 5;
		int length = givenNumber.length();
		int convertedNumber = Integer.parseInt(givenNumber);
		double power = convertedNumber * (Math.pow(number, length));
		System.out.println(power);

	}
}