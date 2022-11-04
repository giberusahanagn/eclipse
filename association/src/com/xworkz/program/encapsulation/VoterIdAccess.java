package com.xworkz.program.encapsulation;

public class VoterIdAccess {
	
	VoterID voterId=new VoterID();
	public void useVoterId() {
		voterId.setIdNo(10);
		voterId.setOwnerName("Swathi");
		voterId.setPhoneNumber(807354398l);
		voterId.setPinCode(577528d);
		voterId.setdOB("03/12/2000");
		System.out.println("get Id number :" + voterId.getIdNo());
		System.out.println("get OwnerName:" + voterId.getOwnerName());
		System.out.println("get phone number :" + voterId.getPhoneNumber());
		System.out.println("get pincode:" + voterId.getPinCode());
		System.out.println("Age :" + voterId.age);
		System.out.println("color :" + voterId.color);
		System.out.println("Address :" + voterId.address);
		System.out.println("Father name :" + voterId.fatherName);
		System.out.println("Length of Aadhar :" + voterId.lengthInCm);

	}
}
