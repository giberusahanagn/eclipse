package com.xworks.programs.programs;

public class Repalce {
	public static void main(String[] args) {

		String name = "sahana gn";

		int count = 0;
		for (char c : name.toCharArray()) {
			if (c == ' ') {
				count++;
			}
		}
		System.out.println("number of white space: " + count);

	}
}
