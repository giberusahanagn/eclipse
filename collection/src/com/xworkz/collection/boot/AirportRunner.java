package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.AirportDTO;

public class AirportRunner {

	public static void main(String[] args) {
		AirportDTO airportDTO1 = new AirportDTO("SBC", "BAngalore", "Mangalore");
		AirportDTO airportDTO2 = new AirportDTO("SBC", "Mangalore", "Mangalore");
		AirportDTO airportDTO3 = new AirportDTO(null, null, "Mangalore");
		AirportDTO airportDTO4 = new AirportDTO("bcg", "hjkk", "Mangalore");
		AirportDTO airportDTO5 = new AirportDTO("SBC", "BAngalore", "Mangalore");

		boolean equals = airportDTO1.getName().equals(airportDTO2.getName());
		System.out.println(equals);
		Collection<AirportDTO> airportDTOs = new ArrayList<AirportDTO>();
		airportDTOs.add(airportDTO1);
		airportDTOs.add(airportDTO2);
		// airportDTOs.contains(airportDTO5);
		boolean contains = airportDTOs.contains(airportDTO4);
		System.out.println("contains :" + contains);

	}

}
