package com.xworkz.collection.lamda.lamdaBoot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import com.xworkz.collection.lamda.lamdaDTO.PalaceDTO;

public class PalaceRunner {

	public static void main(String[] args) {

		Collection<PalaceDTO> dtos = new ArrayList<PalaceDTO>();
		dtos.add(new PalaceDTO("Mysore", "Mysore", "King", false, 0d));
		dtos.add(new PalaceDTO("Bangalore", "bangalore", "kempegowda", false, 100d));
		dtos.add(new PalaceDTO("Udaypur", "Udaypur", "PrathapSingh", true, 0d));
		dtos.add(new PalaceDTO("Dwaraka", "Dwaraka", "krishna", true, 0d));

		
		dtos.stream().filter((ele)->(ele.isDestroyed()!=false))
		.collect(Collectors.toList())
		.forEach(ele->System.out.println(ele));
	}

}
