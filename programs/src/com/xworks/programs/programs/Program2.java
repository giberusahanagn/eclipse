package com.xworks.programs.programs;

public class Program2 {

	static int total;

	char op;

	public Program2(char op, int number1, int number2) {
		this.op = op;
		switch (op) {
		case '+':
			total = number1 + number2;
			System.out.println(total);
			break;
		case '-':
			total = number1 - number2;
			System.out.println(total);
			break;
		case '*':
			System.out.println(number1 * number2);
			break;
		case '/':
			System.out.println(number1 / number2);

		}

	}

	public static void main(String[] ref) {

		Program2 program2 = new Program2('*', 2, 3);
	}
}
