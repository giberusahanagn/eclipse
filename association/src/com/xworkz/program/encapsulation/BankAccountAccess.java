package com.xworkz.program.encapsulation;

public class BankAccountAccess {

	public String name;
	public String cEO;
	public long userNumbers=22329555l;
	public double employee=2734565d;
	public String StateAddress="bangalore";
	public String branch;
	BankAccount account=new BankAccount();
	
	public void useBankAccount() {
		account.setUserName("Dhruthi");
		account.setBankName("Canara");
		account.setManagerName("Pushpa");
		account.setUserAge(7);
		account.setAccountNumber(3320101004177l);
		account.isATM();
		account.isNetBanking();
		account.setMoboileNumber(9972451281l);
		account.setAddress("Challekere");
		System.out.println("USER name: "+account.getUserName());
		System.out.println("BAnk name: "+account.getBankName());
		System.out.println("Manager name: "+ account.getManagerName());
		System.out.println(account.getUserAge());
		System.out.println(account.getAccountNumber());
		System.out.println("Boolean ATM: "+account.isATM());
		System.out.println("Boolean Net banking: "+account.isNetBanking());
		System.out.println(account.getMoboileNumber());
		System.out.println(account.getAddress());
		
	}
}
