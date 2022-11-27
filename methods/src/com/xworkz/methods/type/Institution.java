package com.xworkz.methods.type;

public class Institution {
	String name;
	String studentname;
	String age;
	String standard;
	String section;
	long number;
	String idNumber;
	String height;
	String strength;

	public Institution(String name, String studentname, String age, String standard, String section, String idNumber) {
		super();
		this.name = name;
		this.studentname = studentname;
		this.age = age;
		this.standard = standard;
		this.section = section;
		this.idNumber = idNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Institution) {
			Institution institution = (Institution) obj;
			if (this.name.equals(institution.name) && this.studentname.equals(institution.studentname)
					&& this.age.equals(institution.age) && this.standard.equals(institution.standard)
					&& this.section.equals(institution.section) && this.idNumber.equals(institution.idNumber)) {
				System.out.println("Institution : 6 propertues are matched");
				return true;
			} else {
				System.err.println("not matched");
			}
		}
		return false;
	}
}
