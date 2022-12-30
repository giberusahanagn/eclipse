package com.xworkz.crudNewOne.boot;

import com.xworkz.crudNewOne.dto.BuildingDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;
import com.xworkz.crudNewOne.repository.BulidingRepository;
import com.xworkz.crudNewOne.repository.BulidingRepositoryImpl;
import com.xworkz.crudNewOne.service.BulidingSevice;
import com.xworkz.crudNewOne.service.BulidingSeviceImpl;

public class BuildingRunner {
	public static void main(String[] args) {

		BuildingDTO buildingDTO = new BuildingDTO(2, "Gangamma nilaya", 3, "RCC....", false, false);

		BulidingRepository bulidingRepository = new BulidingRepositoryImpl();
		BulidingSevice bulidingSevice = new BulidingSeviceImpl(bulidingRepository);
		boolean success = true;
		try {
			success = bulidingSevice.validateAndSave(buildingDTO);
			// System.out.println("");
		} catch (InvalidDataException e) {
			// TODO Auto-generated catch block
			System.out.println("sucess :" + success);
		}

	}
}
