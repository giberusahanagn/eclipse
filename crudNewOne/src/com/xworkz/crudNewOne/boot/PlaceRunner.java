package com.xworkz.crudNewOne.boot;

import com.xworkz.crudNewOne.dto.PlaceDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;
import com.xworkz.crudNewOne.repository.PlaceRepository;
import com.xworkz.crudNewOne.repository.PlaceRepositoryImpl;
import com.xworkz.crudNewOne.service.PlaceService;
import com.xworkz.crudNewOne.service.PlaceServiceImpl;

public class PlaceRunner {

	public static void main(String[] args) {
		PlaceDTO dto = new PlaceDTO("Bangalore", "Karnataka", "IT Companies..", 34567890, "KempeGowda..");
		PlaceRepository placeRepository = new PlaceRepositoryImpl();
		PlaceService placeService = new PlaceServiceImpl(placeRepository);
		try {
			placeService.validateAndSave(dto);
		} catch (InvalidDataException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

}
