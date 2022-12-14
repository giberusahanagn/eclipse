package com.xworkz.crud.repository;

import com.xworkz.crud.dto.MobileDTO;
import com.xworkz.crud.exception.ArraySizeExceed;

public class MobileRepoImpli implements MobileRepo {

	private MobileDTO[] dto = new MobileDTO[5];
	private int index = 0;

	@Override
	public String display(MobileDTO dto) {
		System.out.println("running override method in impliments");
		if (this.index >= this.dto.length) {
			throw new ArraySizeExceed();
		}
		
		
		this.dto[index]=dto;
		this.index++;
		System.out.println(dto);
		
		return "Completed";
	}

}
