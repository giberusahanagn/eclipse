package com.xworkz.interfaceProgram.boot;

import com.xworkz.interfaceProgram.follower.HospitalRule;
import com.xworkz.interfaceProgram.follower.Patient;
import com.xworkz.interfaceProgram.follower.Doctor;

public class HospialRunner {
	public static void main(String[] args) {

		HospitalRule hospitalRule = new HospitalRule();
		hospitalRule.goodFacilities();
		hospitalRule.noOfStaffs();
		System.out.println("--------------------");

		Doctor doctor = new Doctor(hospitalRule);
		doctor.display();
		System.out.println(System.lineSeparator());
		Patient patient = new Patient(hospitalRule);
		patient.display();
	}
}
