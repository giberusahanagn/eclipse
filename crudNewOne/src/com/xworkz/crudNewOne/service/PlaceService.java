package com.xworkz.crudNewOne.service;

import com.xworkz.crudNewOne.dto.PlaceDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;

public interface PlaceService {

	boolean validateAndSave(PlaceDTO dto) throws InvalidDataException;
}
