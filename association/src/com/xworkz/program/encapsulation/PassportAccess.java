package com.xworkz.program.encapsulation;

public class PassportAccess {
	public String IdOwnerName;
	boolean id;
	Passport passport = new Passport();

	Aadhar aadhar = new Aadhar();

	public void usePassport() {
		passport.setIdNo(3);
		passport.setAge(22);
		passport.setNationalism("Indian");
		passport.setNoOfPages(10);
		passport.setOwnerName("Sahana");
		System.out.println("Age get method: " + passport.getAge());
		System.out.println("Id no get method: " + passport.getIdNo());
		System.out.println("Nation get method :" + passport.getNationalism());
		System.out.println("NoOfPages get method : " + passport.getNoOfPages());
		System.out.println("Owner name  get method: " + passport.getOwnerName());
		System.out.println("DAte: " + passport.date);
		System.out.println("color: " + passport.color);
		System.out.println("validityYears: " + passport.validityYears);
		System.out.println("expirayDate: " + passport.expirayDate);
		System.out.println("phoneNumber: " + passport.phoneNumber);
	}

	
	
}
