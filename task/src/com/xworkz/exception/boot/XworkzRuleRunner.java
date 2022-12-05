package com.xworkz.exception.boot;

import com.xworkz.exception.type.VijayaLakshmi;

public class XworkzRuleRunner {
	public static void main(String[] args) {

		VijayaLakshmi lakshmi = new VijayaLakshmi("Sahana", 18, 03122000d, "bangalore", 9972451281l);
		lakshmi.display();
		
		System.out.println(System.lineSeparator());
		System.out.println("running all override methods");
		lakshmi.paidTax(600000d);
		lakshmi.gst();
		lakshmi.vat();
		lakshmi.training();
		lakshmi.exceuteProgram();
		lakshmi.eat();
		
		System.out.println(System.lineSeparator());
		lakshmi.completedProgram();
		lakshmi.uploadedTask();
		lakshmi.training();
		lakshmi.exceuteProgram();
	}
}
