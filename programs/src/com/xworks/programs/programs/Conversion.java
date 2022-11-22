package com.xworks.programs.programs;

public class Conversion {
	public static void main(String[] args) {
		String number = "1234";

		int convNumber = Integer.parseInt(number);
		System.out.println("Conversion of String to Integer: " + convNumber);

		int variable = 56789;

		String convString = Integer.toString(variable);
		System.out.println("Conversion of Integer to String: " + convString);
	}
}
