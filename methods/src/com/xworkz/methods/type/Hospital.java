package com.xworkz.methods.type;

public class Hospital {
	String name;
	String doctorName;
	String doctorAge;
	String doctorEducation;
	String doctorLocation;
	String doctorNumber;
	String patientName;
	String patientAge;
	String patientProblem;
	String patientLocation;

	public Hospital(String name, String doctorName, String doctorAge, String doctorEducation, String doctorLocation,
			String doctorNumber ,	String patientName) {
		super();
		this.name = name;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorEducation = doctorEducation;
		this.doctorLocation = doctorLocation;
		this.doctorNumber = doctorNumber;
		this.patientName=patientName;
	}

	@Override
	public boolean equals(Object obj) {
	 if(obj instanceof Hospital) {
		 Hospital hospital=(Hospital)obj;
			if(this.name.equals(hospital.name) 
					&&this.doctorName.equals(hospital.doctorName)
					&&this.doctorAge.equals(hospital.doctorAge)
					&&this.doctorLocation.equals(hospital.doctorLocation)
					&&this.doctorEducation.equals(hospital.doctorEducation)
					&& this.doctorNumber.equals(hospital.doctorNumber) 
					&& this.patientName.equals(hospital.patientName))
			{
				System.out.println("Hospital :7 propertues are matched");
				return true;
			}
			else {
				System.err.println("not matched");
			}
		
	}
	 return false;
	}
}
