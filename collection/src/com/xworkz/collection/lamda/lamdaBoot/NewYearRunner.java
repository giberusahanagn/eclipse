package com.xworkz.collection.lamda.lamdaBoot;

import java.util.LinkedList;
import java.util.List;
import com.xworkz.collection.lamda.lamdaInterface.NewYear;

public class NewYearRunner {
	public static void main(String[] args) {
		NewYear newYear1 = (e) -> {
			System.out.println("running year functional Inteface :" + e);
	
		};
		newYear1.year(2022);
		NewYear newYear2 = (year) -> {
			System.out.println("running year functional Inteface :" + year);
		
		};
		newYear2.year(2023);
		NewYear newYear3 = (e) -> {
			System.out.println("running year functional Inteface :" + e);
		};
		newYear3.year(2024);

		System.out.println("-------------------------------");
		List list = new LinkedList();
		list.add(newYear1);
		list.add(newYear2);
		list.add(newYear3);
		list.forEach((n) -> {
			System.out.println(n);
		});

	}
}
