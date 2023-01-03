package com.xworkz.collection.lamda.lamdaDTO;

public class NewYearDTO {

	private String day;
	private Integer year;

	public NewYearDTO() {
		// TODO Auto-generated constructor stub
	}

	public NewYearDTO(String day, Integer year) {
		super();
		this.day = day;
		this.year = year;
	}

	@Override
	public String toString() {
		return "NewYear [day=" + day + ", year=" + year + "]";
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
