package com.xworkz.boot;


import com.xworkz.constants.Doctor;

public class Hospital {
	public String type;
	public String location;
	public String hospitalName;
	public String patient;
	public String patientLocation;
	
	public String[] hospitalNames;
	public String[] address;
	public String[] patientNames;
	public long[] patientsNumber;
	public Doctor doctorName=Doctor.DHRUTHI;
	public Doctor doctor=Doctor.JHANAVI;
	
	
	public Hospital(String type,String location,String hospitalName,String patient,
			String patientLocation,String[] hospitalNames,
			String[] address,String[] patientNames,long[] patientsNumber,Doctor doctor) {
		this.doctor=doctor;
		this.type=type;
		this.location=location;
		this.hospitalName=hospitalName;
		this.patient=patient;
		this.patientLocation=patientLocation;
		this.hospitalNames=this.hospitalNames;
		this.address=address;
		this.patientNames=this.patientNames;
		this.patientsNumber=patientsNumber;
		
	}
	
	public void details() {
		System.out.println(type);
		System.out.println(location);
		System.out.println(hospitalName);
		System.out.println(patient);
		System.out.println(address);
		System.out.println("----hospitalNames--");
		for (int i = 0; i < hospitalNames.length; i++) {
			String string = hospitalNames[i];
			System.out.println(string);
		}
			System.out.println("----address--");
			for (int i = 0; i < address.length; i++) {
				String string = address[i];
				System.out.println(string);
		}
			System.out.println("----patientNames--");
			for (int i = 0; i < patientNames.length; i++) {
				String string = patientNames[i];
				System.out.println(string);
		}
			System.out.println("----patientsNumber--");
			for (int i = 0; i < patientsNumber.length; i++) {
				long number = patientsNumber[i];
				System.out.println(number);
		}
	}
}
