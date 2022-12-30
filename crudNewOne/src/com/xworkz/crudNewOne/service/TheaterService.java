package com.xworkz.crudNewOne.service;

import com.xworkz.crudNewOne.dto.TheaterDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;

public interface TheaterService {

	boolean saveAndValidate(TheaterDTO dto)  throws InvalidDataException;
}
