package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.xworkz.collection.dto.CakeDTO;

public class CakeRunner {
	public static void main(String[] args) {
		

		CakeDTO cakeDTO1 = new CakeDTO("Chocolate", "Rajajinagar", 600);
		CakeDTO cakeDTO2 = new CakeDTO("pineApple", "VVPuram", 500);
		CakeDTO cakeDTO3 = new CakeDTO("Vanilla", "Mysore Circle", 800);

		List<CakeDTO> cakeDTOs = new ArrayList<CakeDTO>();

		cakeDTOs.add(cakeDTO1);
		cakeDTOs.add(cakeDTO2);
		cakeDTOs.add(cakeDTO3);
		cakeDTOs.add(1, cakeDTO3);
		// System.out.println(cakeDTOs);

		Iterator<CakeDTO> iterator = cakeDTOs.iterator();
		while (iterator.hasNext()) {
			CakeDTO element = iterator.next();
			System.out.println(element);
			// System.out.println("Getting index 1: " + cakeDTOs.get(1));
			System.out.println(cakeDTOs.get(2));

		}
		System.out.println(System.lineSeparator());
		List<CakeDTO> cakeDTOs2 = new LinkedList<CakeDTO>();
		cakeDTOs2.add(cakeDTO1);
		cakeDTOs2.add(cakeDTO2);
		cakeDTOs2.add(cakeDTO3);
		cakeDTOs2.add(cakeDTO1);
		System.out.println("using listIterator....");
		Iterator<CakeDTO> iterator2 = cakeDTOs2.listIterator(2);
		while (iterator2.hasNext()) {
			CakeDTO element = iterator2.next();
			System.out.println(element);
			
			// iterator2.forEachRemaining(null);

		}

	}
}
