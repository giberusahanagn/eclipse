package com.xworkz.program.encapsulation;

public class PanCardAccess {

	PanCard panCard=new PanCard();
	
	public void usePanCard() {
		panCard.setIdNo(10);
		panCard.setOwnerName("Swathi");
		panCard.setPhoneNumber(807354398l);
		panCard.setPinCode(577528d);
		panCard.setdOB("03/12/2000");
		System.out.println("get Id number :" + panCard.getIdNo());
		System.out.println("get OwnerName:" + panCard.getOwnerName());
		System.out.println("get phone number :" + panCard.getPhoneNumber());
		System.out.println("get pincode:" + panCard.getPinCode());
		System.out.println("Age :" + panCard.age);
		System.out.println("color :" + panCard.color);
		System.out.println("Address :" + panCard.address);
		System.out.println("Father name :" + panCard.fatherName);
		System.out.println("Length of Aadhar :" + panCard.lengthInCm);

	}
}
