package com.xworks.programs.programs;

public class Remove {
public static void main(String[] args) {

	String word="         java is a PL     ";
	
	word=word.replaceAll("\\s","");
	System.out.println(word);
}
}
