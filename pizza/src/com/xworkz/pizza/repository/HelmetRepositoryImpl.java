package com.xworkz.pizza.repository;

import com.xworkz.pizza.dto.HelmetDTO;

public class HelmetRepositoryImpl implements HelmetRepository {

	private HelmetDTO[] dto = new HelmetDTO[5];
	private int index = 0;

	@Override
	public boolean save(HelmetDTO dto) {
		System.out.println("running save in HelmetRepositoryImpl...");

		if (this.index >= this.dto.length) {
			System.err.println("storage exceed....");
			throw new ArrayIndexOutOfBoundsException();
		}
		this.dto[this.index] = dto;
		index++;
		System.out.println("saved details...." + dto + "at index :" + index);

		return true;
	}
}
