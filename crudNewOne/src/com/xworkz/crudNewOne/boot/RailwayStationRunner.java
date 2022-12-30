package com.xworkz.crudNewOne.boot;

import com.xworkz.crudNewOne.dto.RailwayStationDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;
import com.xworkz.crudNewOne.repository.RailwayRepository;
import com.xworkz.crudNewOne.repository.RailwayRepositoryImpli;
import com.xworkz.crudNewOne.service.RailwayService;
import com.xworkz.crudNewOne.service.RailwayServiceIlmpl;

public class RailwayStationRunner {
	public static void main(String[] args) {

		RailwayStationDTO dto = new RailwayStationDTO(null, "bangalore", 2, 200);

		RailwayRepository railwayRepository = new RailwayRepositoryImpli();
		RailwayService railwayService = new RailwayServiceIlmpl(railwayRepository);

		try {
			System.out.println("running try before event ...." + dto);
			railwayService.validateAndSave(dto);
		} catch (InvalidDataException e) {
			System.out.println("exception mathced....." + dto);
		}
	}
}
