package com.xworkz.interfaceProgram.follower;

import com.xworkz.interfaceProgram.rules.AirportRules;

public class Passanger implements AirportRules {

	@Override
	public int wearMask() {
		System.out.println("running wearMask");
		return 0;
	}

	@Override
	public int noSmoking() {
		System.out.println("running no smoking");
		return 0;
	}
}
