package com.xworkz.crudNewOne.exception;

public class InvalidDataException extends Exception {
	public InvalidDataException() {
		// TODO Auto-generated constructor stub
	}

	public InvalidDataException(String msg) {
		super(msg);
		System.err.println("custom exception for invalid data ...");

	}
}
