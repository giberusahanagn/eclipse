package com.xworkz.crudNewOne.repository;

import com.xworkz.crudNewOne.dto.BakeryDTO;

public class BakeryRepositoryImpl implements BakeryRepository {

	BakeryDTO[] array = new BakeryDTO[4];
	int index = 0;

	@Override
	public boolean save(BakeryDTO dto) {
		System.out.println("running save in HelmetRepositoryImpl...");

		if (this.index >= this.array.length) {
			System.err.println("storage exceed....");
			throw new ArrayIndexOutOfBoundsException();
		}
		this.array[this.index] = dto;
		index++;
		System.out.println("saved details...." + dto + "at index :" + index);
		return true;

	}
}
