package com.xworkz.collection.dto;

public class HolidayDTO {
	private String place;
	private int noOfDays;
	private String type;

	public HolidayDTO() {
		System.out.println("running place dto....");
	}

	public HolidayDTO(String place, int noOfDays, String type) {
		super();
		this.place = place;
		this.noOfDays = noOfDays;
		this.type = type;
	}

	@Override
	public String toString() {
		return "PlaceDTO [place=" + place + ", noOfDays=" + noOfDays + ", type=" + type + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running place dto...");
		if (obj != null) {
			if (obj instanceof Object) {
				HolidayDTO holidayDTO = (HolidayDTO) obj;
				if (this.place.equals(holidayDTO.place) && this.noOfDays == holidayDTO.noOfDays
						&& this.type.equals(holidayDTO.type)) {
					System.out.println("data matched....");
					return true;
				}
			}
		}
		return false;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
