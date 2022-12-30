package com.xworkz.pizza.boot;

import java.time.LocalDateTime;

import com.xworkz.pizza.constant.HelmetColor;
import com.xworkz.pizza.constant.HelmetType;
import com.xworkz.pizza.dto.HelmetDTO;
import com.xworkz.pizza.repository.HelmetRepository;
import com.xworkz.pizza.repository.HelmetRepositoryImpl;
import com.xworkz.pizza.service.HelmetService;
import com.xworkz.pizza.service.HelmetServiceImpl;

public class HelmetRunner {
	public static void main(String[] args) {

		HelmetDTO dto = new HelmetDTO("Vega", HelmetType.FULL, HelmetColor.BLACK, 750D);
		dto.setCreatedBy("System");
		dto.setCreatedDate(LocalDateTime.MAX);
		dto.setUpdatedBy("Sahana GN");
		dto.setUpdatedDate(LocalDateTime.now());
		
		HelmetDTO dto1 = new HelmetDTO("Va", HelmetType.FULL, HelmetColor.BLACK, 750D);
		HelmetRepository helmetRepository = new HelmetRepositoryImpl();
		HelmetService helmetService = new HelmetServiceImpl(helmetRepository);
	//	HelmetDTO[] dtos = { dto, dto1 };
		boolean success = helmetService.ValidateAndSave(dto);
		System.out.println("success  :" + success);
	}
}
