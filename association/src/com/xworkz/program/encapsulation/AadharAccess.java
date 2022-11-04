package com.xworkz.program.encapsulation;

public class AadharAccess {

	
	Aadhar aadhar=new Aadhar();
	public void useAadhar() {
		aadhar.setIdNo(10);
		aadhar.setOwnerName("Swathi");
		aadhar.setPhoneNumber(807354398l);
		aadhar.setPincode(577528);
		aadhar.setdOB("03/12/2000");
		System.out.println("get Id number :" + aadhar.getIdNo());
		System.out.println("get OwnerName:" + aadhar.getOwnerName());
		System.out.println("get phone number :" + aadhar.getPhoneNumber());
		System.out.println("get pincode:" + aadhar.getPincode());
		System.out.println("NAtionalism:" + aadhar.nationalism);
		System.out.println("Age :" + aadhar.age);
		System.out.println("color :" + aadhar.color);
		System.out.println("Address :" + aadhar.address);
		System.out.println("Father name :" + aadhar.fatherName);
		System.out.println("Length of Aadhar :" + aadhar.lengthInCm);

	}
}
