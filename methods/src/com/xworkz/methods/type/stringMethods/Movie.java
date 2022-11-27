package com.xworkz.methods.type.stringMethods;

public class Movie {
	public static void main(String[] args) {

		String word = "Triple Riding is a romantic action entertainer movie directed by Mahesh Gowda. The movie casts Ganesh, Megha Shetty, Rachana Inder, and Aditi Prabhudeva in the main lead roles along with Sadhu Kokila, Kuri Pratap, Ravishankar, Rangayana Raghu, Shobaraj, Sharath Lohitashwa, and many others have seen in supporting roles.Triple Riding movie was released in theaters on November 25, 2022 amma.";
		int index;
		int count = 0;
		System.out.println("String length: " + word.length());
		System.out.println(System.lineSeparator());
		String[] split = word.split(" ");

		for (index = 0; index < split.length; index++) {
			String string = split[index];
			System.out.println(split[index]);
		}
		System.out.println(System.lineSeparator());
		char[] findR = word.toCharArray();

		for (index = 0; index < findR.length; index++) {
			if (findR[index] == 'R' || findR[index] == 'r') {
				count++;
			}
		}
		System.out.println("no of count of R's & r's:" + count);
		System.out.println(System.lineSeparator());

		for (int i = 0; i < findR.length; i++) {
			if (findR[i] == '0' || findR[i] == '1' || findR[i] == '2' || findR[i] == '3' || findR[i] == '4'
					|| findR[i] == '5') {
				System.out.println("found number:" + findR[i]);
			}
		}
		System.out.println(System.lineSeparator());
		String[] splitI = word.split("i");
		// System.out.println(splitI);
		int i;
		for (i = 0; i < splitI.length; i++) {
			System.out.println("split method in i:" + splitI[i]);
		}
		System.out.println(System.lineSeparator());
		String uppercase = word.toUpperCase();
		System.out.println(uppercase);
		System.out.println(System.lineSeparator());
		String lowercase = word.toLowerCase();
		System.out.println(lowercase);

		int no;
		int digits = 0;
		char[] sahana = word.toCharArray();
		System.out.println("printing digits");
		for (no = 0; no < word.length(); no++) {
			if (Character.isDigit(word.charAt(no))) {
				System.out.println(sahana[no]);
				digits++;
			}
		}
		System.out.println("no of digits :" + digits);
		System.out.println(System.lineSeparator());

	}
}
