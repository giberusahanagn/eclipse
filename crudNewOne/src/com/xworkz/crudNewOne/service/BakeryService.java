package com.xworkz.crudNewOne.service;

import com.xworkz.crudNewOne.dto.BakeryDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;

public interface BakeryService {

	boolean validateAndSave(BakeryDTO dto) throws InvalidDataException;
}
