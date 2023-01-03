package com.xworkz.collection.lamda.lamdaBoot;

import java.util.Collection;
import java.util.LinkedList;
import java.util.stream.Collectors;

import com.xworkz.collection.lamda.lamdaDTO.ApplicationDTO;

public class AppliactionRunner {
	public static void main(String[] args) {

		Collection<ApplicationDTO> applicationDTOs = new LinkedList<ApplicationDTO>();
		applicationDTOs.add(new ApplicationDTO("AFCAT", "Government", 0d, 1.8D, true));
		applicationDTOs.add(new ApplicationDTO("Google", "google", 0d, 1.8D, true));
		applicationDTOs.add(new ApplicationDTO("xworkz", "developers", 22000d, 2d, false));
		applicationDTOs.add(new ApplicationDTO("CET", "Government", 250d, 1.8D, false));
		applicationDTOs.stream().filter(ele -> ele.isFree())
				.filter(ele -> ele.getDevelopedBy().equalsIgnoreCase("google")).collect(Collectors.toList())
				.forEach(ele -> System.out.println("developed by: " + ele));
	}
}
