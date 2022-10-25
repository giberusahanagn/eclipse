package com.xworkz.bootRunner;

import com.xworkz.boot.Hospital;
import com.xworkz.constants.Doctor;

public class HospitalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] hospitalNames= {"Government","Apollo","CLinic"};
		String[] address= {"Bangalore","Malleshwaram","Majestic"};
		String[] patientNames= {"Swathi","neelu","Jothi","nayana"};
		long[] patientsNumber= {567890987l,456789945l,746573536l,346681345l};
Hospital hospital=new Hospital("Hospital", "Bangalore", "Government","unknown","mysore",
		hospitalNames, address, patientNames, patientsNumber,Doctor.DHRUTHI);
	}

}
