package com.xworkz.crud.boot;

import com.xworkz.crud.dto.CarromDTO;
import com.xworkz.crud.repository.CarromRepo;
import com.xworkz.crud.repository.CarronRepoImpli;

public class CarromRunner {
	public static void main(String[] args) {

		CarromRepo carromRepo = new CarronRepoImpli();
		CarromDTO dto = new CarromDTO();

		dto.setPlayers(4);
		dto.setTeamName("Xworkz");
		dto.setWins(true);
		dto.setPrice(2000);

		carromRepo.create(dto);

		dto.setPlayers(4);
		dto.setTeamName("Xworkz");
		dto.setWins(true);
		dto.setPrice(2000);

		carromRepo.create(dto);

		dto.setPlayers(4);
		dto.setTeamName("Xworkz");
		dto.setWins(true);
		dto.setPrice(2000);

		carromRepo.create(dto);

		
	}
}
