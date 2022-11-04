package com.xworkz.boot;

import com.xworkz.program.encapsulation.Aadhar;
import com.xworkz.program.encapsulation.AadharAccess;

public class AadharRunner {
public static void main(String[] args) {
	 Aadhar aadhar = new Aadhar();
	 aadhar.getdOB();
	 aadhar.getIdNo();
	 System.out.println(System.lineSeparator());
	 AadharAccess aadharAccess=new AadharAccess();
	 aadharAccess.useAadhar();
}
}
