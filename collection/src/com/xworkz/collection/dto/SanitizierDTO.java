package com.xworkz.collection.dto;

public class SanitizierDTO {

	private int id;
	private String brand;
	private int price;
	private String color;

	public SanitizierDTO() {
		// TODO Auto-generated constructor stub
	}

	public SanitizierDTO(int id, String brand, int price, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return "SanitizierDTO [id=" + id + ", brand=" + brand + ", price=" + price + ", color=" + color + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
