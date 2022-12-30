package com.xworkz.crudNewOne.service;

import com.xworkz.crudNewOne.dto.RailwayStationDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;
import com.xworkz.crudNewOne.repository.RailwayRepository;

public class RailwayServiceIlmpl implements RailwayService {

	RailwayRepository repo;

	public RailwayServiceIlmpl(RailwayRepository repo) {
		this.repo = repo;
		System.out.println("running RailwayServiceIlmpl in const... ");
	}

	@Override
	public boolean validateAndSave(RailwayStationDTO dto) throws InvalidDataException {
		String name = dto.getName();
		String area = dto.getArea();
		int noOfPlatforms = dto.getNoOfPlatforms();
		int price = dto.getTicketPrice();
		boolean validName = false;
		boolean validArea = false;
		boolean validPlatforms = false;
		boolean validPrice = false;
		if (name != null && name.length() < 4 && name.length() <= 20) {
			System.out.println("valid name :" + dto);
			validName = true;
		} else {
			System.err.println("name is not valid :" + dto);
		}
		if (area != null && area.length() >= 4 && area.length() <= 20) {
			System.out.println("valid area :" + dto);
			validArea = true;
		} else {
			System.err.println("area is not valid :" + dto);
		}
		if (price != 0 && price >= 60 && price <= 500) {
			System.out.println("price valid.." + price);
			validPrice = true;
		} else {
			System.err.println("price not valid :" + price);
		}
		if (noOfPlatforms != 0 && noOfPlatforms >= 1 && noOfPlatforms <= 20) {
			System.out.println("noOfPlatforms valid.." + noOfPlatforms);
			validPlatforms = true;
		} else {
			System.err.println("noOfPlatforms not valid :" + noOfPlatforms);
		}
		if (validName && validArea && validPrice && validPlatforms) {
			System.out.println("Informations are valid " + dto);
			boolean saved = repo.save(dto);
			System.out.println("information are valid inside the valid conditions" +saved);
			return true;
		}

		System.err.println("information is not valid ,check once :" + dto);
		throw new InvalidDataException("check the data ,data is not valid :" + dto);

		// return false;
	}
}
