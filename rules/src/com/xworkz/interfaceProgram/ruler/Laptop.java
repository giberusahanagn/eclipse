package com.xworkz.interfaceProgram.ruler;

public interface Laptop {

	boolean companyName();
	boolean keyBoard();
	boolean mouse();
	boolean display();
	boolean windowsNumber();
	default void showOff() {
		companyName();
		keyBoard();
		mouse();
		display();
		windowsNumber();
	}
}
