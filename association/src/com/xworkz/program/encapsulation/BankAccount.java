package com.xworkz.program.encapsulation;

public class BankAccount {

	private String userName;
	private String bankName;
	private String managerName;
	private int userAge;
	private long accountNumber;
	private boolean netBanking=true;
	private boolean ATM;
	private long moboileNumber;
	private String address;

	public String getUserName() {
		return userName;
	}

	void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBankName() {
		return bankName;
	}

	void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public boolean isNetBanking() {
		return netBanking;
	}

	void setNetBanking(boolean netBanking) {
		this.netBanking = netBanking;
	}

	public boolean isATM() {
		return ATM;
	}

	void setATM(boolean aTM) {
		this.ATM = aTM;
	}

	public long getMoboileNumber() {
		return moboileNumber;
	}

	void setMoboileNumber(long moboileNumber) {
		this.moboileNumber = moboileNumber;
	}

	public String getManagerName() {
		return managerName;
	}

	void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public int getUserAge() {
		return userAge;
	}

	void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

}
