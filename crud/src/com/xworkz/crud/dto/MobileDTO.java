package com.xworkz.crud.dto;

public class MobileDTO extends AbstractAuditDTO {

	private String userName;
	private int userAge;
	private long phoneNumber;
	private double noOfUsers;

	public MobileDTO() {
		System.out.println("calling const......");
	}

	@Override
	public String toString() {
		return "MobileDTO [userName=" + userName + ", userAge=" + userAge + ", phoneNumber=" + phoneNumber
				+ ", noOfUsers=" + noOfUsers + "]";
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setNoOfUsers(double noOfUsers) {
		this.noOfUsers = noOfUsers;
	}

}
