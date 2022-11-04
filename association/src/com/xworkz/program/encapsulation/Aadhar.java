package com.xworkz.program.encapsulation;

public class Aadhar {

	private long idNo;
	private String ownerName;
	String nationalism="Indian";
	int age=18;
	String color="White";
	private long phoneNumber;
	String address="Davanagere";
	String fatherName="Nagaraj GB";
	private double pincode;
	int lengthInCm=19;
	private String dOB;

	public long getIdNo() {
		return idNo;
	}

	 void setIdNo(long idNo) {
		this.idNo = idNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	 void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	 void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getPincode() {
		return pincode;
	}

	 void setPincode(double pincode) {
		this.pincode = pincode;
	}

	public String getdOB() {
		return dOB;
	}

	 void setdOB(String dOB) {
		this.dOB = dOB;
	}

}
