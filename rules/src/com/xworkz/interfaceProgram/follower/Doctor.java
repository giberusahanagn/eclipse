package com.xworkz.interfaceProgram.follower;

public class Doctor {

	HospitalRule hospitalRule;

	public Doctor(HospitalRule hospitalRule) {
		super();
		this.hospitalRule = hospitalRule;
	}

	public void display() {
		if (hospitalRule != null) {
			int staffs = this.hospitalRule.noOfStaffs();
			boolean facility = this.hospitalRule.goodFacilities();
			if (staffs == 0 && facility == false) {
				System.out.println("following");
			} else {
				System.err.println("not following");
			}
		}
	}
}
