package com.xworkz.interfaceProgram.follower;

import com.xworkz.interfaceProgram.rules.XWorkz;

public class XworkzInstitute implements XWorkz {

	@Override
	public boolean training() {
		System.out.println("running training");
		return false;
	}

	@Override
	public boolean placement() {
		System.out.println("running placement");
		return false;
	}
}