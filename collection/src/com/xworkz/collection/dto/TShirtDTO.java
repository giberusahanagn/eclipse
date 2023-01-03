package com.xworkz.collection.dto;

public class TShirtDTO {
	private String brand;
	private boolean type;
	private int price;

	public TShirtDTO() {
		// TODO Auto-generated constructor stub
	}

	public TShirtDTO(String brand, boolean type, int price) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
	}

	@Override
	public String toString() {
		return "TShirtDTO [brand=" + brand + ", type=" + type + ", price=" + price + ", hashCode()=" + hashCode() + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("running hash code...");
		return 3;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof TShirtDTO) {
				TShirtDTO dto = (TShirtDTO) obj;
				if (dto.brand.equals(this.brand)) {
					System.out.println("brand matched");
					return true;
				}
			}
		}
		return false;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
