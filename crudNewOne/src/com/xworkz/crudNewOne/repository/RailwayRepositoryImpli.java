package com.xworkz.crudNewOne.repository;

import com.xworkz.crudNewOne.dto.RailwayStationDTO;
import com.xworkz.crudNewOne.exception.StorageExceedException;

public class RailwayRepositoryImpli implements RailwayRepository {

	private RailwayStationDTO[] repo = new RailwayStationDTO[3];
	private int google = 0;

	@Override
	public boolean save(RailwayStationDTO dto) {
		System.out.println("running RailwayStation Impli. classs");
		if (this.google >= this.repo.length) {
			throw new StorageExceedException("Storage exceed check once :" + dto);
		}
		this.repo[google] = dto;
		System.out.println("the date is " + dto + "and the index is :" + google);
		google++;
		return false;
	}
}
