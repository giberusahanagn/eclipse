package com.xworkz.inheitance.boot;

import com.xworkz.inheitance.casting.ENT;
import com.xworkz.inheitance.casting.Patient;
import com.xworkz.inheitance.casting.Cardiologist;
import com.xworkz.inheitance.casting.Dentist;
import com.xworkz.inheitance.casting.Doctor;

public class DoctorRunner {

	public static void main(String[] args) {

		Doctor doctor = new Doctor();

		System.out.println(System.lineSeparator());

		Doctor doctor1 = new Dentist();
		Doctor doctor2 = (Doctor) doctor1;

		System.out.println(System.lineSeparator());

		ENT ent = new ENT();
		System.out.println(System.lineSeparator());
		Doctor doctor3 = new ENT();

		// Doctor doctor4 = (ENT) ent;
		Doctor doctor5 = (ENT) doctor3;
		System.out.println(System.lineSeparator());
		Doctor doctor6 = new Cardiologist();

		Doctor doctor7 = (Doctor) doctor6;
		 System.out.println(System.lineSeparator());
		 
		 Doctor doctor8=new Patient(doctor7);
		 
	}

}
