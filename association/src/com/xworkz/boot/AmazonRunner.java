package com.xworkz.boot;

import com.xworkz.program.encapsulation.Amazon;
import com.xworkz.program.encapsulation.AmazonAccess;

public class AmazonRunner {

	public static void main(String[] args) {
		Amazon amazon=new Amazon();
		AmazonAccess access=new AmazonAccess();
		access.use();
		amazon.getNoOfUsers();

	}

}
