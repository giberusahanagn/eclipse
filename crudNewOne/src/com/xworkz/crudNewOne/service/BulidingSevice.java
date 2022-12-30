package com.xworkz.crudNewOne.service;

import com.xworkz.crudNewOne.dto.BuildingDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;

public interface BulidingSevice {

	boolean validateAndSave(BuildingDTO buildingDTO) throws InvalidDataException;
}
