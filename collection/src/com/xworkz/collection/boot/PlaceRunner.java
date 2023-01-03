package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.collection.dto.PlaceDTO;

public class PlaceRunner {
	public static void main(String[] args) {
		PlaceDTO dto1 = new PlaceDTO("Bangalore", "MysoreCircle", "Basham Circle");
		PlaceDTO dto2 = new PlaceDTO("Davanagere", "donnehalli", "davanagere");
		PlaceDTO dto3 = new PlaceDTO("Mangalore", "karkala", null);
		PlaceDTO dto4 = new PlaceDTO("Mane", "mane", "mane");
		PlaceDTO dto5 = new PlaceDTO("Bangalore", " ", "Fest");
		Collection<PlaceDTO> collection = new ArrayList<PlaceDTO>();
		collection.add(dto5);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		
		
		collection.add(dto4);
		
		boolean contains=collection.contains(dto5);
		System.out.println(contains);
	}
}
