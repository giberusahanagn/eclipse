package com.xworkz.crud.dto;

public class WarDTO extends AbstractAuditDTO {

	private String name;
	private double startedDate;
	private double endDate;
	private String startBy;
	private String startedWith;
	private String wonBy;
	private int noOfDeaths;

	public WarDTO() {
		System.out.println("running war dto....");
	}

	@Override
	public String toString() {
		super.toString();
		return "WarDTO [name=" + name + ", endDate=" + endDate + ", startBy=" + startBy + ", startedWith=" + startedWith
				+ ", wonBy=" + wonBy + ", noOfDeaths=" + noOfDeaths + "" + super.toString();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getStartedDate() {
		return startedDate;
	}

	public void setStartedDate(double startedDate) {
		this.startedDate = startedDate;
	}

	public double getEndDate() {
		return endDate;
	}

	public void setEndDate(double endDate) {
		this.endDate = endDate;
	}

	public String getStartBy() {
		return startBy;
	}

	public void setStartBy(String startBy) {
		this.startBy = startBy;
	}

	public String getStartedWith() {
		return startedWith;
	}

	public void setStartedWith(String startedWith) {
		this.startedWith = startedWith;
	}

	public String getWonBy() {
		return wonBy;
	}

	public void setWonBy(String wonBy) {
		this.wonBy = wonBy;
	}

	public int getNoOfDeaths() {
		return noOfDeaths;
	}

	public void setNoOfDeaths(int noOfDeaths) {
		this.noOfDeaths = noOfDeaths;
	}

}
