package com.xworkz.copy.boot;

import com.xworkz.copy.program.Developer;

public class DeveloperRunner {

	public static void main(String[] args) {
		Developer via = new Developer();
		System.out.println(via.company);
		System.out.println(via.education);
		System.out.println(via.experience);
		System.out.println(via.name);
		System.out.println(via.salary);
		System.out.println("*************************");
        via.company="IT";
        via.education="BE";
        via.experience=0;
        via.name="Sahana";
        via.salary=30000d;
        System.out.println(via.company);
		System.out.println(via.education);
		System.out.println(via.experience);
		System.out.println(via.name);
		System.out.println(via.salary);
        
	}

}
