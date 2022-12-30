package com.xworkz.crudNewOne.repository;

import com.xworkz.crudNewOne.dto.PlaceDTO;

public class PlaceRepositoryImpl implements PlaceRepository {

	PlaceDTO[] array = new PlaceDTO[4];
	int index = 0;

	@Override
	public boolean save(PlaceDTO dto) {
		System.out.println("running save in PlaceRepositoryImpl...");

		if (this.index >= this.array.length) {
			System.err.println("storage exceed....");
			throw new ArrayIndexOutOfBoundsException("array sixe exceed....");
		}
		this.array[this.index] = dto;
		index++;
		System.out.println("saved details...." + dto + "at index :" + index);
		return true;
	}
}
