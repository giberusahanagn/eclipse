package com.xworkz.interfaceProgram.ruler;

public interface Traffic {

	boolean follow();

	boolean redStop();

	boolean greenMove();

	boolean color();

	default boolean display() {
		System.out.println("display all");
		return false;
	}
}
