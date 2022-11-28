package com.xworkz.methods.type.stringMethods;

public class reverse {
	public static void main(String[] args) {
		String name = "anna";
		StringBuffer buffer = new StringBuffer(name);
		buffer.reverse();
		String compare = buffer.toString();
		if (name.equals(compare)) {
			System.out.println("matched");
		} else {
			System.err.println("not matched");
		}
	}
}
