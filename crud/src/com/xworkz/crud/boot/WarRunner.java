package com.xworkz.crud.boot;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.crud.dto.WarDTO;
import com.xworkz.crud.repositories.WarRepository;
import com.xworkz.crud.repositories.WarRepositoryImpi;

public class WarRunner {
	public static void main(String[] args) {

		WarRepository repository = new WarRepositoryImpi();

		WarDTO dto = new WarDTO();
		dto.setName("kargil");
		dto.setStartedDate(2001);
		dto.setEndDate(2000);
		dto.setStartBy("pakisthan");
		dto.setStartedWith("India");
		dto.setWonBy("India");
		dto.setNoOfDeaths(21000);
		dto.setCreatedBy("SYSTEM");
		dto.setCreatedDate(LocalDateTime.of(1990, 1, 12, 1, 15));
		dto.setUpdatedBy("Sahana");
		dto.setUpdatedDate(LocalDateTime.now());
		repository.create(dto);
		System.out.println("----------------------");

		WarDTO dto1 = new WarDTO();
		dto1.setName("UkrainWar");
		dto1.setStartedDate(2022);
		dto1.setEndDate(2022);
		dto1.setStartBy("Russia");
		dto1.setStartedWith("Ukrain");
		dto1.setWonBy("India");
		dto1.setNoOfDeaths(2000);
		dto1.setCreatedBy("SYSTEM");
		dto1.setCreatedDate(LocalDateTime.of(2020, 6, 2, 12, 00));
		dto1.setUpdatedBy("Sahana");
		dto1.setUpdatedDate(LocalDateTime.now());
		repository.create(dto1);
		System.out.println("----------------------");

		WarDTO dto2 = new WarDTO();
		dto2.setName("Mahabharath");
		dto2.setStartedDate(1927);
		dto2.setEndDate(1945);
		dto2.setStartBy("kuwrava");
		dto2.setStartedWith("pandavas");
		dto2.setWonBy("pandava");
		dto2.setNoOfDeaths(1213258);
		dto2.setCreatedBy("SYSTEM");
		dto2.setCreatedDate(LocalDateTime.of(1970, 1, 1, 12, 10));
		dto2.setUpdatedBy("Sahana");
		dto2.setUpdatedDate(LocalDateTime.now());
		repository.create(dto2);
		System.out.println("----------------------");

		int index = repository.total();
		System.out.println("total index :" + index);

		System.out.println("----------------------");
		repository.findByStartBy("Russia");
		System.out.println("==========================");

		repository.findByStartedByAndStartedWith("udgv", "India");
		System.out.println("--------------------------------------");

		// repository.findByStartDateGreaterThanOREqualTo(LocalDateTime.now());
		repository.findByStartDateGreaterThanOREqualTo(1980);
		System.out.println(System.lineSeparator());
		System.out.println("--------------------------------------");

		repository.findByStartDateLesserThanOREqualTo(LocalDateTime.now());
		System.out.println(System.lineSeparator());
		System.out.println("--------------------------------------");

		System.out.println("running last method");
		repository.findByStartDateAndEndDate(1927, 1945);
	}
}
