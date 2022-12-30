package com.xworkz.crudNewOne.repository;

import com.xworkz.crudNewOne.dto.TheaterDTO;
import com.xworkz.crudNewOne.exception.StorageExceedException;

public class TheaterRepositoryImpl implements TheaterRepository {

	private TheaterDTO[] array = new TheaterDTO[5];
	private int number = 0;

	@Override
	public boolean save(TheaterDTO theaterDTO) {
		System.out.println("running Theater Repository impli...");
		if (this.number >= this.array.length) {
			throw new StorageExceedException("Array size extends check the storage/Array indexss ..." + number);
		}
		this.array[number] = theaterDTO;
		System.out.println("list are..." + theaterDTO + "the index is :" + number);
		number++;
		return true;
	}

}
