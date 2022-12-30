package com.xworkz.crudNewOne.dto;

public class RailwayStationDTO extends AbstractAuditDTO {

	private String name;
	private String area;
	private int noOfPlatforms;
	private int ticketPrice;

	public RailwayStationDTO(String name, String area, int noOfPlatforms, int ticketPrice) {
		super();
		this.name = name;
		this.area = area;
		this.noOfPlatforms = noOfPlatforms;
		this.ticketPrice = ticketPrice;
	}

	@Override
	public String toString() {
		return "RailwayStation [name=" + name + ", area=" + area + ", noOfPlatforms=" + noOfPlatforms + ", ticketPrice="
				+ ticketPrice + ", toString()=" + super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getNoOfPlatforms() {
		return noOfPlatforms;
	}

	public void setNoOfPlatforms(int noOfPlatforms) {
		this.noOfPlatforms = noOfPlatforms;
	}

	public int getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
}
