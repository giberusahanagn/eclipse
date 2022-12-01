package com.xworkz.interfaceProgram.boot;

import com.xworkz.interfaceProgram.follower.XworkzInstitute;
import com.xworkz.interfaceProgram.rules.DevelopingInstitute;
import com.xworkz.interfaceProgram.rules.Institute;
import com.xworkz.interfaceProgram.rules.TestingInstitute;
import com.xworkz.interfaceProgram.rules.XWorkz;

public class XworkzRunner {

	public static void main(String[] args) {

		Object object = new XworkzInstitute();

		System.out.println("all 9 methods Object class");
		System.out.println(System.lineSeparator());

		XworkzInstitute institute = new XworkzInstitute();
		institute.placement();
		institute.training();
		institute.interview();
		System.out.println("12 methods XworkzInstitute class");
		System.out.println(System.lineSeparator());

		XWorkz workz = new XworkzInstitute();

		DevelopingInstitute developingInstitute = new XworkzInstitute();
		developingInstitute.interview();
		System.out.println("10 methods");

		TestingInstitute institute2 = new XworkzInstitute();
		institute2.interview();
		System.out.println("10 methods");
		System.out.println(System.lineSeparator());

		Institute institute3 = new XworkzInstitute();

		institute3.placement();
		institute3.training();
		System.out.println("12 methods");

	}

}
