package com.xworks.programs.programs;

import java.util.Scanner;

public class Eureka {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		int end = scan.nextInt();

//		System.out.println(start);
//		System.out.println(end);
		int i;
		for (i = start; i <= end; i++) {
//			System.out.println(i);
			int temp = i;
			System.out.print(" " + temp);
			int count = 0;
			for (; temp != 0; temp = temp / 10) {
				count++;
			}
			int num = temp;
			int ref = 0;
			int sum = 0;
			for (; num > 0; num = num / 10) {
				ref = num % 10;
				sum += (int) Math.pow(ref, count);
				count--;

			}
			if (num == sum) {
				System.out.println(num + " ");
			}
		}
	}
}
