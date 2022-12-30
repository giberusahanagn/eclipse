package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.CalenderDTO;

public class CalenderRunner {

	public static void main(String[] args) {

		CalenderDTO calenderDTO1 = new CalenderDTO("Prajavani", 12, 2000);
		CalenderDTO calenderDTO2 = new CalenderDTO("Prajavani", 12, 2000);
		CalenderDTO calenderDTO3 = new CalenderDTO("Prajavani", 12, 2000);
		CalenderDTO calenderDTO4 = new CalenderDTO("Prajavani", 12, 2000);
		CalenderDTO calenderDTO5 = new CalenderDTO("Prajavani", 12, 2000);

		//boolean equals = calenderDTO1.equals(calenderDTO5);
		
		Collection<CalenderDTO> calenderDTOs=new ArrayList<CalenderDTO>();
		calenderDTOs.add(calenderDTO5);
		calenderDTOs.add(calenderDTO1);
		calenderDTOs.add(calenderDTO2);
		calenderDTOs.add(calenderDTO3);
		calenderDTOs.add(calenderDTO4);
		
		boolean check=calenderDTOs.contains(calenderDTO2);
		System.out.println("contains.... "+check);
	}

}
