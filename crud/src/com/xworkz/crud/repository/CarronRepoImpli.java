package com.xworkz.crud.repository;

import com.xworkz.crud.dto.CarromDTO;
import com.xworkz.crud.exception.ArraySizeExceed;

public class CarronRepoImpli implements CarromRepo {

	private CarromDTO[] dto = new CarromDTO[3];

	private int index=0;

	@Override
	public boolean create(CarromDTO dto) {

		System.out.println("running create override method....");
		if (this.index >= this.dto.length) {
			throw new ArraySizeExceed();
		}

		this.dto[this.index] = dto;
		index++;
		System.out.println(dto);
		return true;
	}

}
