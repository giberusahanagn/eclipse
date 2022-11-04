package com.xworkz.boot;

import com.xworkz.program.encapsulation.GooglePay;
import com.xworkz.program.encapsulation.GooglePayAccess;

public class GooglePayRunner {

	public static void main(String[] args) {
		GooglePay googlePay=new GooglePay();
		googlePay.getUserName();
		
		
		GooglePayAccess  pay = new GooglePayAccess();
		pay.use();
		
	}
}
