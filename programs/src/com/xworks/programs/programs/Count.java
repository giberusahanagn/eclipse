package com.xworks.programs.programs;

public class Count {
public static void main(String[] args) {
	String name="Sahana aeiou";
	int vow=0;
	int cons=0;
	char[] ch=name.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		if(ch[i]=='a'|| ch[i]=='e' || ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			vow++;
		}
		else {
		
			cons++;
		}
		
	}
	System.out.println("no of vowels :"+vow);
	System.out.println("no of constants :"+cons);
}
}
