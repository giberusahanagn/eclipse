package com.xworkz.program.encapsulation;

public class PhonePayAccess {
		
	public String appName="Phone pay";
	public String updateVersion="1.3.5";
	public double noOfUsers=677832;
	
	PhonePay pay=new PhonePay();
	
	public void use() {
		
		pay.setAppName("Phone pay");
		pay.setVersion("1.23.3");
		pay.setUserName("Sahana");
		pay.setUserAge(22);
		pay.setUserId(82093);
		pay.setUserBankName("canara bank");
		pay.setPhoneNumber(9972745176l);
		pay.setuPIID("Sahanan@pay");
		pay.setBankBrach("Bangalore");
		System.out.println(pay.getAppName());
		System.out.println("App version :"+pay.getVersion());
		System.out.println("App UserName :"+pay.getUserName());
		System.out.println("age :"+pay.getUserAge());
		System.out.println("UserId :"+pay.getUserId());
		System.out.println("BAnk name :"+pay.getUserBankName());
		System.out.println("phone number :"+pay.getPhoneNumber());
		System.out.println("UPI ID :"+pay.getuPIID());
		System.out.println("Bank branch: "+pay.getBankBrach());

	}
	public void phonePay() {
	System.out.println("App name: "+appName);
	System.out.println("Upadted version "+updateVersion);
	System.out.println("No of Users :"+noOfUsers);
		
	}
}
