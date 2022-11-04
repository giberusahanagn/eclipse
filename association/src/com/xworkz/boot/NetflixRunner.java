package com.xworkz.boot;

import com.xworkz.program.encapsulation.Netflix;
import com.xworkz.program.encapsulation.NetflixAccess;

public class NetflixRunner {

	public static void main(String[] args) {
		Netflix netflix=new Netflix();
		NetflixAccess access=new NetflixAccess();
		access.use();
		netflix.getNoOfUsers();

	}
}
