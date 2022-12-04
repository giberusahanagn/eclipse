package com.xworkz.interfaceProgram.boot;

import com.xworkz.interfaceProgram.follower.Driver;
import com.xworkz.interfaceProgram.follower.Passanger;
import com.xworkz.interfaceProgram.follower.Staffs;

public class AirportRunner {
	public static void main(String[] args) {

		Passanger passanger = new Passanger();
		passanger.wearMask();
		System.out.println("--------------");
		Staffs staffs = new Staffs(passanger);
		staffs.checkOut();
		System.out.println("--------------");
		Driver driver = new Driver(passanger);
		driver.checkOut();
	}
}
