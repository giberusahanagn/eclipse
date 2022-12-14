package com.xworkz.crud.boot;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.MobileDTO;
import com.xworkz.crud.repository.MobileRepo;
import com.xworkz.crud.repository.MobileRepoImpli;

public class MobileRunner {
	public static void main(String[] args) {

		MobileRepo mobileRepo = new MobileRepoImpli();

		MobileDTO dto = new MobileDTO();
		dto.setUserName("Sahana");
		dto.setUserAge(22);
		dto.setPhoneNumber(900824717l);
		dto.setNoOfUsers(1);
		dto.setCreatedBy("SYSTEM");
		dto.setCreatedDate(LocalDateTime.now());

		mobileRepo.display(dto);

		MobileDTO dto1 = new MobileDTO();
		
		dto1.setUserName("Sahana");
		dto1.setUserAge(22);
		dto1.setPhoneNumber(900824717l);
		dto1.setNoOfUsers(1);
		dto1.setCreatedBy("SYSTEM");
		dto1.setCreatedDate(LocalDateTime.now());

		mobileRepo.display(dto1);

		MobileDTO dto2 = new MobileDTO();
		dto2.setUserName("bharath");
		dto2.setUserAge(22);
		dto2.setPhoneNumber(900824717l);
		dto2.setNoOfUsers(1);
		dto2.setCreatedBy("SYSTEM");
		dto2.setCreatedDate(LocalDateTime.now());

		mobileRepo.display(dto2);

		MobileDTO dto3 = new MobileDTO();
		dto3.setUserName("Sahana");
		dto3.setUserAge(22);
		dto3.setPhoneNumber(900824717l);
		dto3.setNoOfUsers(1);
		dto3.setCreatedBy("SYSTEM");
		dto3.setCreatedDate(LocalDateTime.now());

		mobileRepo.display(dto3);


		MobileDTO dto4 = new MobileDTO();
		dto4.setUserName("Sahana");
		dto4.setUserAge(22);
		dto4.setPhoneNumber(900824717l);
		dto4.setNoOfUsers(1);
		dto4.setCreatedBy("SYSTEM");
		dto4.setCreatedDate(LocalDateTime.now());

		mobileRepo.display(dto4);

	}
}
