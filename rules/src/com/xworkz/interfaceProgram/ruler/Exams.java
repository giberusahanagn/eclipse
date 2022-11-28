package com.xworkz.interfaceProgram.ruler;

public interface Exams {

	boolean copy();

	boolean pens();

	boolean prepare();

	default String subject() {
		System.out.println("default method");
		return "java";
	}
	
	public static int timings() {
		System.out.println("static method");
		return 2;
	}

}
