package com.xworkz.interfaceProgram.ruler;

public interface HR {

	boolean research();
	boolean behave();
	boolean hire();
	boolean fire();
 static	boolean refire() {
	 System.out.println("static mehtod");
	 return true;
 }
	
}
