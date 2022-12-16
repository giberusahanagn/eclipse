package com.xworkz.crud.repositories;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.WarDTO;

public interface WarRepository {

	boolean create(WarDTO dto);

	boolean create(WarDTO[] array);

	int total();

	WarDTO findByStartBy(String startedBy);

	WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith);

	WarDTO findByStartDateGreaterThanOREqualTo(double date);

	WarDTO findByStartDateLesserThanOREqualTo(LocalDateTime date);

	WarDTO findByStartDateAndEndDate(double startDate, double endDate);
}