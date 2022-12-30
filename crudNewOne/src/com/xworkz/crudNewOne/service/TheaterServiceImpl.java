package com.xworkz.crudNewOne.service;

import com.xworkz.crudNewOne.dto.TheaterDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;
import com.xworkz.crudNewOne.repository.TheaterRepository;

public class TheaterServiceImpl implements TheaterService {
	private TheaterRepository theaterRepository;

	public TheaterServiceImpl(TheaterRepository theaterRepository) {
		this.theaterRepository = theaterRepository;
	}

	@Override
	public boolean saveAndValidate(TheaterDTO theaterDto) throws InvalidDataException {
		int id = theaterDto.getId();
		String name = theaterDto.getName();
		String brand = theaterDto.getBrand();
		String seats = theaterDto.getSeats();

		boolean validID = false;
		boolean validName = false;
		boolean validBrand = false;
		boolean validSeats = false;
		if (id >= 0 && id <= 20) {
			System.out.println("id of Theater is valid :" + id);
			validID = true;

		} else {
			System.err.println("id is not vaid :" + id);
		}
		if (name.length() >= 0 && name.length() <= 20) {
			System.out.println("Name is valid :" + name);
			validName = true;
		} else {
			System.err.println("name is not vaid :" + name);
		}
		if (brand.length() >= 3 && brand.length() <= 20) {
			System.out.println("brand is valid :" + brand);
			validBrand = true;
		} else {
			System.err.println("brand is not vaid :" + brand);
		}
		if (seats.length() >= 3 && seats.length() <= 20) {
			System.out.println("seats is valid :" + seats);
			validSeats = true;
		} else {
			System.err.println("seats is not vaid :" + seats);
		}
		if (validID && validName && validBrand && validSeats) {
			// System.out.println("Informations are valid " + theaterDto);
			boolean saved = theaterRepository.save(theaterDto);
			System.out.println("information are valid inside the valid conditions" + saved);
			return true;
		}

		System.err.println("information is not valid ,check once :" + theaterDto);
		throw new InvalidDataException("check the data ,data is not valid :" + theaterDto);

	}
}
