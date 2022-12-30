package com.xworkz.crudNewOne.service;

import com.xworkz.crudNewOne.dto.BakeryDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;
import com.xworkz.crudNewOne.repository.BakeryRepository;

public class BakeryServiceImpl implements BakeryService {

	BakeryRepository bakeryRepository;

	public BakeryServiceImpl(BakeryRepository bakeryRepository) {
		this.bakeryRepository = bakeryRepository;
	}

	@Override
	public boolean validateAndSave(BakeryDTO dto) throws InvalidDataException {
		String name = dto.getName();
		String ownerName = dto.getOwnerName();
		String location = dto.getLocation();
		String famousFor = dto.getFamousFor();
		long number = dto.getNumber();
		boolean validName = false;
		boolean validOwnerName = false;
		boolean validLocation = false;
		boolean validFamousFor = false;
		boolean validNumber = false;
		if (name != null && name.length() > 4 && name.length() <= 20) {
			System.out.println("valid name :" + dto);
			validName = true;
		} else {
			System.err.println("name is not valid :" + dto);
		}
		if (ownerName != null && ownerName.length() >= 4 && ownerName.length() <= 20) {
			System.out.println("ownerName area :" + dto);
			validOwnerName = true;
		} else {
			System.err.println("ownerName is not valid :" + dto);
		}
		if (location != null && location.length() > 4 && location.length() <= 20) {
			System.out.println("location name :" + dto);
			validLocation = true;
		} else {
			System.err.println("location is not valid :" + dto);
		}
		if (famousFor != null && famousFor.length() >= 4 && famousFor.length() <= 20) {
			System.out.println("famousFor area :" + dto);
			validFamousFor = true;
		} else {
			System.err.println("famousFor is not valid :" + dto);
		}
		if (number != 0) {
			System.out.println("contact number :" + number);
			validNumber = true;
		} else {
			System.err.println("contact is null :" + number);
		}

		if (validName && validOwnerName && validLocation && validFamousFor) {
			System.out.println("data is valid....");
			boolean saved = bakeryRepository.save(dto);
			System.out.println("saved data.... " + saved);
			return saved;
		}
		throw new InvalidDataException("data is not valid check once :" + dto);
	}
}
