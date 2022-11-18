package com.xworks.programs.programs;

public class UppernLower {
	public static void main(String[] args) {
		String name = "sahana";
		char[] word = name.toCharArray();
		for (int i = 0; i < word.length; i++) {
			if (word[i] >= 'A' && word[i] <= 'Z') {
				word[i] = (char) ((int) word[i] + 32);
				System.out.print(word[i]);
			} else {
				if (word[i] >= 'a' && word[i] <= 'z') {
					word[i] = (char) ((int) word[i] - 32);
					System.out.print(word[i]);

				}
			}
		}

	}

}
