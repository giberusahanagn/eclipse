package com.xworkz.crudNewOne.service;

import com.xworkz.crudNewOne.dto.BuildingDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;
import com.xworkz.crudNewOne.repository.BulidingRepository;

public class BulidingSeviceImpl implements BulidingSevice {

	BulidingRepository repo;

	public BulidingSeviceImpl(BulidingRepository repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(BuildingDTO dto) throws InvalidDataException {
		boolean validNumber = false;
		boolean validName = false;
		boolean validFloors = false;
		boolean validType = false;

		if (dto.getNo() != 0) {
			System.out.println("number is valid :" + dto.getNo());
			validNumber = true;
		} else {
			System.err.println("number is not valid " + dto.getNo());
		}
		if (dto.getFloors() != 0) {
			System.out.println("floors is valid " + dto.getFloors());
			validFloors = true;
		} else {
			System.err.println("floors is not valid " + dto.getFloors());
		}
		if (dto.getName() != null && dto.getName().length() >= 4 && dto.getName().length() <= 20) {
			System.out.println("valid name :" + dto.getName());
			validName = true;
		} else {
			System.err.println("name is not valid :" + dto);
		}
		if (dto.getType() != null && dto.getType().length() >= 4 && dto.getType().length() <= 20) {
			System.out.println("valid type :" + dto.getType());
			validType = true;
		} else {
			System.err.println("type is not valid :" + dto);
		}
		if (validNumber && validName && validType && validFloors) {
			System.out.println("Informations are valid " + dto);
			boolean saved = repo.saved(dto);
			System.out.println("information are valid inside the valid conditions" + saved);
			return true;
		}

		System.err.println("information is not valid ,check once :" + dto);
		throw new InvalidDataException("check the data ,data is not valid :" + dto);

	}
}
