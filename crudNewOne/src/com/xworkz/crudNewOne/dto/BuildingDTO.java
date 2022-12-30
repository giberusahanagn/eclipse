package com.xworkz.crudNewOne.dto;

public class BuildingDTO {
	private int no;
	private String name;
	private int floors;
	private String type;
	private boolean lift;
	private boolean parking;
	public BuildingDTO(int no, String name, int floors, String type, boolean lift, boolean parking) {
		super();
		this.no = no;
		this.name = name;
		this.floors = floors;
		this.type = type;
		this.lift = lift;
		this.parking = parking;
	}
	@Override
	public String toString() {
		return "BuildingDTO [no=" + no + ", name=" + name + ", floors=" + floors + ", type=" + type + ", lift=" + lift
				+ ", parking=" + parking + ", toString()=" + super.toString() + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFloors() {
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isLift() {
		return lift;
	}
	public void setLift(boolean lift) {
		this.lift = lift;
	}
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}

}
