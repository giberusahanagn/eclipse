package com.xworkz.boot.literals;

public class Add {

	public static void main(String[] args) {
		int number = 1234;
		int rev = 0;
		int mod = 0;

		while (number > 0) {
			mod = number %10 ;
			rev = rev * 10 + mod;
			number = number / 10;

		}
		System.out.print(rev);
	}
}
