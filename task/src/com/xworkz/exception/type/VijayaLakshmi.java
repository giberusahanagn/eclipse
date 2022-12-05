package com.xworkz.exception.type;

import com.xworkz.exception.rules.KarnatakaRTO;

public class VijayaLakshmi extends JavaTrainee implements KarnatakaRTO {

	public VijayaLakshmi(String name, int age, double dOB, String location, long number) {
		super(name, age, dOB, location, number);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean paidTax(double amount) {
		System.out.println("running paidTax");
		return false;
	}

	@Override
	public double gst() {
		System.out.println("running gst");
		return 0;
	}

	@Override
	public double vat() {
		System.out.println("running vat");
		return 0;
	}

	@Override
	public void training() {
		System.out.println("running training");

	}

	@Override
	public void exceuteProgram() {
		System.out.println("running exceute program");

	}

}
