package com.xworkz.boot;


import com.xworkz.program.encapsulation.PassportAccess;
import com.xworkz.program.encapsulation.Passport;

public class PassportRunner {
	public static void main(String[] args) {
		Passport passport = new Passport();
		PassportAccess idProof = new PassportAccess();
		passport.getAge();
		System.out.println(System.lineSeparator());
		System.out.println(idProof.IdOwnerName);
		System.out.println("----Passport-----");
		idProof.usePassport();
		System.out.println(System.lineSeparator());
		System.out.println("----Aadhar-----");
		idProof.usePassport();
	}
}
