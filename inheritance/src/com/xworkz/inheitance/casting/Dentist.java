package com.xworkz.inheitance.casting;

public class Dentist extends Doctor {

	public String dent_Name;
	public int dent_Age;
	public double dent_Fees;

	public Dentist() {
		System.out.println("entered default cons.. Dentist Class---------");
		System.out.println("Doctor name in dentist class : " + doctorName);
		System.out.println("Doctor Age in dentist class : " + doctorAge);
		System.out.println("entered default cons.. Dentist class");
		System.out.println(dent_Age);
		System.out.println(dent_Name);
		System.out.println(dent_Fees);
	}

}
