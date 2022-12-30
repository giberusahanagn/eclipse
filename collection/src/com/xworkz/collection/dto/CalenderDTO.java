package com.xworkz.collection.dto;

public class CalenderDTO {
	private String name;
	private Double price;
	private Integer year;

	public CalenderDTO() {
		// TODO Auto-generated constructor stub
	}

	public CalenderDTO(String name, double price, int year) {
		super();
		this.name = name;
		this.price = price;
		this.year = year;
	}

	@Override
	public String toString() {
		return "CalenderDTO [name=" + name + ", price=" + price + ", year=" + year + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals....");
		if (obj != null) {
			if (obj instanceof Object) {
				CalenderDTO calenderDTO = (CalenderDTO) obj;
				if (this.name.equals(calenderDTO.name) && this.price.equals(calenderDTO.price)
						&& this.year.equals(calenderDTO.year)) {
					System.out.println("data matched....");
					return true;
				}
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
