package com.xworkz.crudNewOne.service;

import com.xworkz.crudNewOne.dto.RailwayStationDTO;
import com.xworkz.crudNewOne.exception.InvalidDataException;

public interface RailwayService {

	boolean validateAndSave(RailwayStationDTO dto) throws InvalidDataException;
}
