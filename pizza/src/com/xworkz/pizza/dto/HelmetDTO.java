package com.xworkz.pizza.dto;

import com.xworkz.pizza.constant.HelmetColor;
import com.xworkz.pizza.constant.HelmetType;

public class HelmetDTO extends AbstractAuditDTO {

	private String brand;
	private HelmetType type;
	private HelmetColor color;
	private Double price;
	

	public HelmetDTO(String brand, HelmetType type, HelmetColor color, Double price) {
		super();
		this.brand = brand;
		this.type = type;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "HelmetDTO [brand=" + brand + ", type=" + type + ", color=" + color + ", price=" + price
				+ ", toString()=  ----->>" + super.toString() + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public HelmetType getType() {
		return type;
	}

	public void setType(HelmetType type) {
		this.type = type;
	}

	public HelmetColor getColor() {
		return color;
	}

	public void setColor(HelmetColor color) {
		this.color = color;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}
