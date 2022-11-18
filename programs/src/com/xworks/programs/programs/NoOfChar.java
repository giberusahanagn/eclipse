package com.xworks.programs.programs;

public class NoOfChar {
	public static void main(String[] args) {
		String name = "Sahana";
		char[] ch = name.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			System.out.println(ch[i]);
		}

	}

}
