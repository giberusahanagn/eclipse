package com.xworkz.crud.repository;

import com.xworkz.crud.dto.IplDTO;
import com.xworkz.crud.exception.ArraySizeExceed;

public class IplRepositoryImpli implements IplRepository {

	private IplDTO[] iplDto = new IplDTO[2];
	private int index = 0;

	@Override
	public boolean create(IplDTO dto) {
		System.out.println("running implimenting class......");
		if (this.index >= this.iplDto.length) {
			throw new ArraySizeExceed();
			// return false;
		}
		this.iplDto[this.index] = dto;
		System.out.println(dto);
		this.index++;
		return true;
	}

}
