package com.xworkz.crudNewOne.service;

import com.xworkz.crudNewOne.dto.PlaceDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;
import com.xworkz.crudNewOne.repository.PlaceRepository;

public class PlaceServiceImpl implements PlaceService {

	PlaceRepository placeRepository;

	public PlaceServiceImpl(PlaceRepository placeRepository) {
		super();
		this.placeRepository = placeRepository;
	}

	@Override
	public boolean validateAndSave(PlaceDTO dto) throws InvalidDataException {
		String name = dto.getName();
		String location = dto.getLocation();
		String famousFor = dto.getFamousFor();
		long minPopulation = dto.getMinPopulation();
		String famousPerson = dto.getFamousPerson();
		boolean validName = false;
		boolean validLocation = false;
		boolean validFamousFor = false;
		boolean validMinPopu = false;
		boolean validFamousPerson = false;
		if (name != null && name.length() > 4 && name.length() <= 20) {
			System.out.println("valid name :" + name);
			validName = true;
		} else {
			System.err.println("name is not valid :" + name);
		}
		if (location != null && location.length() >= 4 && location.length() <= 20) {
			System.out.println("valid location :" + location);
			validLocation = true;
		} else {
			System.err.println("location is not valid :" + location);
		}
		if (famousFor != null && famousFor.length() >= 4 && famousFor.length() <= 20) {
			System.out.println("valid location :" + famousFor);
			validFamousFor = true;
		} else {
			System.err.println("location is not valid :" + famousFor);
		}
		if (famousPerson != null && famousPerson.length() >= 4 && famousPerson.length() <= 20) {
			System.out.println("famousPerson location :" + famousPerson);
			validFamousPerson = true;
		} else {
			System.err.println("famousPerson is not valid :" + famousPerson);
		}
		if (validName && validLocation && validFamousFor && validFamousPerson) {
			System.out.println("data is valid :" + dto);
			boolean saved = placeRepository.save(dto);
			System.out.println("data is saved.. :" + saved);
			return saved;
		}
		throw new InvalidDataException("in valid data ---costum exception :" + famousFor);
	}

}
