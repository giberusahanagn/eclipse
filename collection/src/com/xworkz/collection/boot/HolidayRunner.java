package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.xworkz.collection.dto.HolidayDTO;

public class HolidayRunner {
	public static void main(String[] args) {

		HolidayDTO dto = new HolidayDTO("Bangalore", 10, "Fest");
		HolidayDTO dto1 = new HolidayDTO("Davanagere", 20, "Summer");
		HolidayDTO dto2 = new HolidayDTO("Mangalore", 4, null);
		HolidayDTO dto3 = new HolidayDTO("Mane", 18, "Festival");
		HolidayDTO dto4 = new HolidayDTO("Bangalore", 10, "Fest");
		HolidayDTO dto5 = new HolidayDTO("Bangalore", 10, "Fest");
		
		Collection<HolidayDTO> collection = new ArrayList<HolidayDTO>();
		collection.add(dto4);
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);

		boolean contains = collection.contains(dto5);
		System.out.println("contains...:" + contains);
		
	}
}
