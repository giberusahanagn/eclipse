package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import com.xworkz.collection.dto.SanitizierDTO;

public class SanitizerRunner {
	public static void main(String[] args) {

		SanitizierDTO dto1 = new SanitizierDTO(1, "Himayala", 20, "ColorLess");
		SanitizierDTO dto2 = new SanitizierDTO(2, "Dettol", 0, "Pink");
		SanitizierDTO dto3 = new SanitizierDTO(3, "Salvon", 26, "ColorLess");
		SanitizierDTO dto4 = new SanitizierDTO(4, "LifeBoy", 0, "Blue");
		SanitizierDTO dto5 = new SanitizierDTO(5, "Dabur", 83, "LightPink");
		SanitizierDTO dto6 = new SanitizierDTO(6, "SafeGuard", 90, "lightBlue");
		SanitizierDTO dto7 = new SanitizierDTO(7, "Apollo", 20, null);
		SanitizierDTO dto8 = new SanitizierDTO(8, null, 70, "Green");
		SanitizierDTO dto9 = new SanitizierDTO(9, "try-active", 40, "Red");
		SanitizierDTO dto10 = new SanitizierDTO(10, "Dalmia", 0, "lightBlue");

		SanitizierDTO dto11 = new SanitizierDTO(10, "Dalmia", 0, "lightBlue");

		Collection<SanitizierDTO> collection = new ArrayList<SanitizierDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);

		Iterator<SanitizierDTO> iterator = collection.iterator();
		while (iterator.hasNext()) {
			SanitizierDTO dto = iterator.next();
			System.out.println(dto);
		}

		System.out.println(System.lineSeparator());
		Iterator<SanitizierDTO> iterator1 = collection.iterator();
		System.out.println("printing price > 5");
		while (iterator1.hasNext()) {
			SanitizierDTO dto = iterator1.next();

			if (dto.getPrice() > 5) {
				System.out.println(dto.getPrice());
			}
		}
		System.out.println(System.lineSeparator());
		Iterator<SanitizierDTO> iterator2 = collection.iterator();
		System.out.println("Removing color : Red,green,blue");
		while (iterator2.hasNext()) {
			SanitizierDTO element = iterator2.next();
			if (element.getColor() == "Red" || element.getColor() == "Blue" || element.getColor() == "Green") {
				iterator2.remove();
				System.out.println(element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<SanitizierDTO> iterator3 = collection.iterator();
		System.out.println("Finding least price ");
		while (iterator3.hasNext()) {
			SanitizierDTO element = iterator3.next();
			if (element.getPrice() < 10) {
				System.out.println(element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<SanitizierDTO> iterator4 = collection.iterator();
		System.out.println("Finding max price ");
		while (iterator4.hasNext()) {
			SanitizierDTO element = iterator4.next();
			if (element.getPrice() >= 70) {
				System.out.println(element);
			}

		}
		System.out.println(System.lineSeparator());
		Iterator<SanitizierDTO> iterator5 = collection.iterator();
		System.out.println("Finding 2nd max price ");
		while (iterator5.hasNext()) {
			SanitizierDTO element = iterator5.next();
//			System.out.println(element);
			if (element.getPrice() > 70 && element.getPrice() < 90) {
				System.out.println(element);
			}

		}

	}

}
