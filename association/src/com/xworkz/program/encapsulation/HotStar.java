package com.xworkz.program.encapsulation;

public class HotStar {
	 String name="Manjula";
	 String userName;
	 String userId;
	private boolean prime;
	private int amount;
	private int pricePerMonth;
	private int noOfUsers;
	private String password;
	private String primeUserName;
	private boolean active;
	
	
	public boolean isPrime() {
		return prime;
	}
	 void setPrime(boolean prime) {
		this.prime = prime;
	}
	public int getAmount() {
		return amount;
	}
	 void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPricePerMonth() {
		return pricePerMonth;
	}
	 void setPricePerMonth(int pricePerMonth) {
		this.pricePerMonth = pricePerMonth;
	}
	public int getNoOfUsers() {
		return noOfUsers;
	}
	 void setNoOfUsers(int noOfUsers) {
		this.noOfUsers = noOfUsers;
	}
	public String getPassword() {
		return password;
	}
	 void setPassword(String password) {
		this.password = password;
	}
	public String getPrimeUserName() {
		return primeUserName;
	}
	 void setPrimeUserName(String primeUserName) {
		this.primeUserName = primeUserName;
	}
	public boolean isActive() {
		return active;
	}
	 void setActive(boolean active) {
		this.active = active;
	}



}
