package com.xworkz.boot;

import com.xworkz.program.encapsulation.PhonePay;
import com.xworkz.program.encapsulation.PhonePayAccess;

public class PhonePayRunner {
public static void main(String[] args) {

	PhonePayAccess access=new PhonePayAccess();
	access.use();
	

	access.phonePay();
	
	
	PhonePay pay=new PhonePay();
	pay.getAppName();
}
}
