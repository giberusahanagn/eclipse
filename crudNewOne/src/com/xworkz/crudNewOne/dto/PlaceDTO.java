package com.xworkz.crudNewOne.dto;

public class PlaceDTO extends AbstractAuditDTO {
	private String name;
	private String location;
	private String famousFor;
	private long minPopulation;
	private String famousPerson;

	public PlaceDTO(String name, String location, String famousFor, long minPopulation, String famousPerson) {
		super();
		this.name = name;
		this.location = location;
		this.famousFor = famousFor;
		this.minPopulation = minPopulation;
		this.famousPerson = famousPerson;
	}

	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", location=" + location + ", famousFor=" + famousFor + ", minPopulation="
				+ minPopulation + ", famousPerson=" + famousPerson + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public long getMinPopulation() {
		return minPopulation;
	}

	public void setMinPopulation(long minPopulation) {
		this.minPopulation = minPopulation;
	}

	public String getFamousPerson() {
		return famousPerson;
	}

	public void setFamousPerson(String famousPerson) {
		this.famousPerson = famousPerson;
	}

}
