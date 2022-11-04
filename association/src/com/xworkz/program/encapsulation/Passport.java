package com.xworkz.program.encapsulation;

public class Passport {
	private int idNo;
	private String ownerName;
	private String nationalism;
	private int age;
	private int noOfPages;
	double date=03112022d;
	String color="Navy blue";
	int validityYears=20;
	double expirayDate=03112044d;
	long phoneNumber=9008284717l;

	public int getIdNo() {

		return this.idNo;
	}

	void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public String getOwnerName() {
		return this.ownerName;
	}

	void setOwnerName(String ownerName) {
		this.ownerName = ownerName;

	}

	public String getNationalism() {
		return this.nationalism;
	}

	void setNationalism(String nationalism) {
		this.nationalism = nationalism;
	}

	public int getAge() {
		return this.age;
	}

	void setAge(int age) {
		this.age = age;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

}
