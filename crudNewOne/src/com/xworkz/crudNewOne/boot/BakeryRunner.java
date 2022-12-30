package com.xworkz.crudNewOne.boot;

import com.xworkz.crudNewOne.dto.BakeryDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;
import com.xworkz.crudNewOne.repository.BakeryRepository;
import com.xworkz.crudNewOne.repository.BakeryRepositoryImpl;
import com.xworkz.crudNewOne.service.BakeryService;
import com.xworkz.crudNewOne.service.BakeryServiceImpl;

public class BakeryRunner {

	public static void main(String[] args) {
		BakeryDTO bakeryDTO = new BakeryDTO(null, "Neelamma", "Bangalore", "Pastries...", 345678987l);
		BakeryRepository bakeryRepository = new BakeryRepositoryImpl();
		BakeryService bakeryService = new BakeryServiceImpl(bakeryRepository);
		try {
			System.out.println("before try block....");
			bakeryService.validateAndSave(bakeryDTO);
		} catch (InvalidDataException e) {
			System.out.println("exception matched..." + bakeryDTO);
		}
	}

}
