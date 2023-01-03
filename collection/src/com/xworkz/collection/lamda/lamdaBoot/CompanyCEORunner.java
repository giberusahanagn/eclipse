package com.xworkz.collection.lamda.lamdaBoot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import com.xworkz.collection.lamda.lamdaDTO.CompanyCEODTO;
import com.xworkz.collection.lamda.lamdaDTO.DaugtherDTO;

public class CompanyCEORunner {

	public static void main(String[] args) {
		DaugtherDTO daugtherDTO1 = new DaugtherDTO("sahana", 9008285475l, 22, false, true);
		CompanyCEODTO ceodto1 = new CompanyCEODTO("Manjula", "ABC", 45, "India", "B.E", true, daugtherDTO1);
		// System.out.println(ceodto1);
		DaugtherDTO daugtherDTO2 = new DaugtherDTO("sahanagn", 8722159292l, 24, false, true);
		CompanyCEODTO ceodto2 = new CompanyCEODTO("nagaraj", "ABC", 52, "India", "PUC", true, daugtherDTO2);
		// System.out.println(ceodto2);
		DaugtherDTO daugtherDTO3 = new DaugtherDTO("janu", 8722159292l, 12, false, true);
		CompanyCEODTO ceodto3 = new CompanyCEODTO("veeresh", "dhruthi", 49, "India", "med..", true, daugtherDTO3);
		// System.out.println(ceodto3);
		ceodto1.getDaughterDTO().setAge(0);
		Collection<CompanyCEODTO> ceodtos = new ArrayList<CompanyCEODTO>();
		ceodtos.add(ceodto1);
		ceodtos.add(ceodto2);
		ceodtos.add(ceodto3);
		System.out.println("---------printing details of daughterDTO---------");
		ceodtos.stream().map(ele -> ele.getDaughterDTO()).collect(Collectors.toList())
				.forEach(ele -> System.out.println("details :" + ele));
		System.out.println("---------printing names of daughterDTO---------");

		ceodtos.stream().map(ele -> ele.getDaughterDTO().getName()).collect(Collectors.toList())
				.forEach(ele -> System.out.println("names :" + ele));

		System.out.println("---------printing age of ceo i.e> given Age---------");

		long count = ceodtos.stream().filter(ele -> {
			return ele.getAge() > 46;
		}).count();
		System.out.println(count);
//		.collect(Collectors.toList())
//		.forEach(ele -> System.out.println(ele))
//		;

		System.out.println("----------------------------------------------------");
//
//		for (CompanyCEODTO companyCEODTO : ceodtos) {
//			

//		}
		ceodtos.stream().forEach(c -> System.out.println("father age" + c.getAge() + "d age" + c.getDaughterDTO().getAge()));

	}
}