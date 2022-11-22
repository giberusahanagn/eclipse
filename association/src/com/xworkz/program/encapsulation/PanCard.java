package com.xworkz.program.encapsulation;

public class PanCard {

	private int idNo;
	private	String ownerName;
	private	long phoneNumber;
	private	double pinCode;
	private	String dOB;
	int age=18;
	String color="Blue";
	String address;
	String fatherName="Nagaraj ";
	int lengthInCm=10;
	public int getIdNo() {
		return idNo;
	}
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getPinCode() {
		return pinCode;
	}
	public void setPinCode(double pinCode) {
		this.pinCode = pinCode;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	
}
