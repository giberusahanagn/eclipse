package com.xworkz.bootRunner;

import com.xworkz.boot.Education;

public class EducationRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] intermediate = { "Science", "Commerce", "Arts", "Diploma" };
		String[] degreeName = { "B.E", "B.Tech", "BSC", "Doctor" };
		int[] noOfYears = { 4, 4, 3, 5 };
		Education education = new Education("Neelamma", "Gulbarga", "Bangalore", "hebbal", 70, intermediate, degreeName,
				noOfYears);
		education.display();
	}

}
