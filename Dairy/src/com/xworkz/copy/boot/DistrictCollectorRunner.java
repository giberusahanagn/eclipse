package com.xworkz.copy.boot;

import com.xworkz.copy.program.DistrictCollector;

public class DistrictCollectorRunner {
	public static void main(String[] args) {
		DistrictCollector ref=new DistrictCollector();
		System.out.println(ref.name);
		System.out.println(ref.age);
		System.out.println(ref.district);
		System.out.println(ref.batchNo);
		System.out.println("<------------------------>");
		ref.name="Sahana";
		ref.age=28;
		ref.district="Bagalkot";
		ref.batchNo=2020;
		System.out.println(ref.name);
		System.out.println(ref.age);
		System.out.println(ref.district);
		System.out.println(ref.batchNo);
	}

}
