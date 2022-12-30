package com.xworkz.crudNewOne.boot;

import java.time.LocalDateTime;
import com.xworkz.crudNewOne.dto.TheaterDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;
import com.xworkz.crudNewOne.repository.TheaterRepository;
import com.xworkz.crudNewOne.repository.TheaterRepositoryImpl;
import com.xworkz.crudNewOne.service.TheaterService;
import com.xworkz.crudNewOne.service.TheaterServiceImpl;

public class TheaterRunner {

	public static void main(String[] args) throws InvalidDataException {

		TheaterDTO dto = new TheaterDTO(-10, "bhavana", "local theater", "Normal", "System", LocalDateTime.now(),
				"Sahana", LocalDateTime.now());

		TheaterRepository repository = new TheaterRepositoryImpl();

		TheaterService service = new TheaterServiceImpl(repository);
		try {
			System.out.println("before try block...." + dto);
			service.saveAndValidate(dto);
			System.out.println("After try block....");
		} catch (InvalidDataException e) {
			System.out.println(dto);
			System.out.println("inside catch block...");
		}
	}

}
