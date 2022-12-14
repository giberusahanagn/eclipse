package com.xworkz.crud.repositories;

import java.time.LocalDateTime;

import com.xworkz.crud.dto.WarDTO;
import com.xworkz.crud.exception.ArraySizeExceed;

public class WarRepositoryImpi implements WarRepository {

	private WarDTO[] warDto = new WarDTO[4];
	private int index = 0;

	@Override
	public boolean create(WarDTO dto) {
		System.out.println("running create method....");
		if (this.index >= this.warDto.length) {
			throw new ArraySizeExceed();
		}
		this.warDto[index] = dto;
		index++;
		System.out.println(dto);
		return true;
	}

	@Override
	public int total() {
		System.out.println("Running inde total method for index");
		return index;
	}

	@Override
	public WarDTO findByStartBy(String startedBy) {
		System.out.println("running findBy StartBy");
		for (WarDTO dto : warDto) {

			if (dto != null && dto.getStartBy().equals(startedBy)) {
				System.out.println(" name matched...");
				System.out.println("war started by :" + startedBy + " AND the details of the war is: " + dto);
				return dto;
			}
			index++;
		}
		return null;
	}

	@Override
	public WarDTO findByStartedByAndStartedWith(String startedBy, String startedWith) {
		System.out.println("running findByStartedBy And StartedWith method.. ");
		for (WarDTO dto : warDto) {

			if (dto != null && dto.getStartBy().equals(startedBy) && dto.getStartedWith().equals(startedWith)) {
				System.out.println(" name matched...");
				System.out.println("war started by :" + startedBy + " & started With " + startedWith
						+ " the details of the war is: " + dto);
				return dto;
			}
			index++;
		}
		return null;
	}

	@Override
	public WarDTO findByStartDateGreaterThanOREqualTo(double date) {
		System.out.println("Running findByStartDateGreaterThanOREqualTo.....");
		for (WarDTO dto : warDto) {
			System.out.println("running for loop...");
			if (dto != null) {
				if (date >= dto.getStartedDate()) {

					System.out.println("found year findByStartDateGreaterThanOREqualTo   -->>" + date + dto);
					return dto;
				} else {
					System.err.println("not found");
				}
				index++;
			}

		}

		return null;
	}

	@Override
	public WarDTO findByStartDateLesserThanOREqualTo(LocalDateTime date) {
		System.out.println("Running findByStartDateLesserThanOREqualTo.....");
		for (WarDTO dto : warDto) {

			if (dto != null) {
				if (dto.getStartedDate() <= date.getYear()) {

					System.out.println("found year for findByStartDateLesserThanOREqualTo   -->" + date + dto);
					return dto;
				} else {
					System.err.println("not found");
				}
				index++;
			}

		}

		return null;
	}

	@Override
	public WarDTO findByStartDateAndEndDate(double startDate, double endDate) {
		System.out.println("Running findByStartDateAndEndDate.....");
		for (WarDTO dto : warDto) {

			if (dto != null) {
				if (dto.getStartedDate() == startDate && dto.getEndDate() == endDate) {

					System.out.println("found year for findByStartDateAndEndDate   -->" + startDate + endDate + dto);
					return dto;
				} else {
					System.err.println("not found");
				}
				index++;
			}

		}

		return null;
	}

}
