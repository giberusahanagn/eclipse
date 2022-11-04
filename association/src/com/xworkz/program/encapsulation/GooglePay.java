package com.xworkz.program.encapsulation;

public class GooglePay {

	private String appName;
	private String version;
	private String userName;
	private int userAge;
	private int userId;
	private String userBankName;
	private long phoneNumber;
	private String uPIID;
	private String bankBrach;

	 public String getAppName() {
		return appName;
	}

	void setAppName(String appName) {
		this.appName = appName;
	}

	public String getVersion() {
		return version;
	}

	void setVersion(String version) {
		this.version = version;
	}

	public String getUserName() {
		return userName;
	}

	void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserAge() {
		return userAge;
	}

	void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public int getUserId() {
		return userId;
	}

	void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserBankName() {
		return userBankName;
	}

	void setUserBankName(String userBankName) {
		this.userBankName = userBankName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getuPIID() {
		return uPIID;
	}

	void setuPIID(String uPIID) {
		this.uPIID = uPIID;
	}

	public String getBankBrach() {
		return bankBrach;
	}

	void setBankBrach(String bankBrach) {
		this.bankBrach = bankBrach;
	}

}
