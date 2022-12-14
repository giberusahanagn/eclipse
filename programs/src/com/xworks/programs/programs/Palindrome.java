package com.xworks.programs.programs;

public class Palindrome {
	public static void main(String[] args) {

		String name = "madam";
		int count = 0;
		int index = 0;

		for (index = 0; index <= name.length() / 2; index++) {
			if (name.charAt(index) == name.charAt(name.length() - 1 - index)) {
				continue;

			} else {
				count = count + 1;
			}
		}
		if (count == 0) {
			System.out.println("palindrom");
		} else {
			System.err.println("not a palindroem");
		}

		int number = 1821;
		//int temp = number;
		int rev = 0;
		int mod = 0;

		while (number != 0) {

			number = number % 10;
			rev = rev * 10 + mod;
			

		}
		if (number == rev) {
			System.out.println("palindrome");
		} else {
			System.err.println("not palindrome");
		}

	}

}
