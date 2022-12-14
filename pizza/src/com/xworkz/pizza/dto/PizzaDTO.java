package com.xworkz.pizza.dto;

import com.xworkz.pizza.constant.PizzaSize;

public class PizzaDTO extends AbstractAuditDTO {

	private String pizzaName;
	private double price;
	private String company;
	private PizzaSize size;
	private boolean cheese;
	private String falvor;
	private String type;

	@Override
	public String toString() {
		return "PizzaDTO [pizzaName=" + pizzaName + ", price=" + price + ", company=" + company + ", size=" + size
				+ ", cheese=" + cheese + ", falvor=" + falvor + ", type=" + type + ", toString()=" + super.toString()
				+ "]";
	}

	public String getPizzaName() {
		return pizzaName;
	}

	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public boolean isCheese() {
		return cheese;
	}

	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}

	public String getFalvor() {
		return falvor;
	}

	public void setFalvor(String falvor) {
		this.falvor = falvor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
