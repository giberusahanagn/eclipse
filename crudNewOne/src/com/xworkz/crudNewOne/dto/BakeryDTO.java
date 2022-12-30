package com.xworkz.crudNewOne.dto;

public class BakeryDTO {
	private String name;
	private String ownerName;
	private String location;
	private String famousFor;
	private long number;

	public BakeryDTO() {
		// TODO Auto-generated constructor stub
	}

	public BakeryDTO(String name, String ownerName, String location, String famousFor, long number) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.location = location;
		this.famousFor = famousFor;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "BakeryDTO [name=" + name + ", ownerName=" + ownerName + ", location=" + location + ", famousFor="
				+ famousFor + ", number=" + number + "]";
	}

}
