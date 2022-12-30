package com.xworkz.crudNewOne.repository;

import com.xworkz.crudNewOne.dto.BuildingDTO;
import com.xworkz.crudNewOne.exception.StorageExceedException;

public class BulidingRepositoryImpl implements BulidingRepository {
	private BuildingDTO[] array = new BuildingDTO[4];
	int index = 0;

	@Override
	public boolean saved(BuildingDTO buildingDTO) {
		System.out.println("running RailwayStation Impli. classs");
		if (this.index >= this.array.length) {
			throw new StorageExceedException("Storage exceed check once :" + buildingDTO);
		}
		this.array[index] = buildingDTO;
		System.out.println("the date is " + buildingDTO + "and the index is :" + index);
		index++;
		return false;
	}
}
