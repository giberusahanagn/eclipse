package com.xworkz.interfaceProgram.follower;


import com.xworkz.interfaceProgram.rules.HospitalManagement;

public class HospitalRule implements HospitalManagement{

	@Override
	public int noOfStaffs() {
		System.out.println("running no of staffs");
		return 0;
	}

	@Override
	public boolean goodFacilities() {
		System.out.println("running good Facilities");
		return false;
	}
	
	
}
