package com.xworkz.collection.dto;

public class CakeDTO {

	private String cakeName;
	private String location;
	private int cakePrice;
	
	public CakeDTO() {
		// TODO Auto-generated constructor stub
	}

	public CakeDTO(String cakeName, String location, int cakePrice) {
		super();
		this.cakeName = cakeName;
		this.location = location;
		this.cakePrice = cakePrice;
	}

	@Override
	public String toString() {
		return "CakeDTO [cakeName=" + cakeName + ", location=" + location + ", cakePrice=" + cakePrice + "]";
	}

	public String getCakeName() {
		return cakeName;
	}

	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getCakePrice() {
		return cakePrice;
	}

	public void setCakePrice(int bakeryName) {
		this.cakePrice = bakeryName;
	}
	
}
