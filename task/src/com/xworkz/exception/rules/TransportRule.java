package com.xworkz.exception.rules;

public interface TransportRule {
	boolean paidTax(double amount);

	double gst();
}

