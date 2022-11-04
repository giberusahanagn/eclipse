package com.xworkz.boot;

import com.xworkz.program.encapsulation.Paytm;
import com.xworkz.program.encapsulation.PaytmAccess;

public class PaytmRunner {
public static void main(String[] args) {
	Paytm paytm=new Paytm();
	PaytmAccess access=new PaytmAccess();
	
	access.use();
	paytm.getuPIID();
	
	
}
}
