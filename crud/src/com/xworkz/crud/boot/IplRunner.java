package com.xworkz.crud.boot;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.IplDTO;
import com.xworkz.crud.repository.IplRepository;
import com.xworkz.crud.repository.IplRepositoryImpli;

public class IplRunner {
	public static void main(String[] args) {

		IplRepository iplRepository = new IplRepositoryImpli();
		IplDTO dto = new IplDTO();

		dto.setTeamName("RCB");
		dto.setCaptainName("virat");    
		dto.setOwnerAlive(true);
		dto.setPurse(1200020d);
		dto.setWins(170);
		dto.setDefeats(10);
		dto.setCreatedBy("System");
		dto.setCreatedDate(LocalDateTime.now());

		iplRepository.create(dto);

		IplDTO dto1 = new IplDTO();
		dto1.setTeamName("CSK");
		dto1.setCaptainName("Dhoni");
		dto1.setOwnerAlive(true);
		dto1.setPurse(1200020d);
		dto1.setWins(170);
		dto1.setDefeats(10);
		dto1.setCreatedBy("System");
		dto1.setCreatedDate(LocalDateTime.now());
		iplRepository.create(dto1);

	}
}
