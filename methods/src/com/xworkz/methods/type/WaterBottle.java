package com.xworkz.methods.type;

public class WaterBottle {

	private String name;
	private String brand;
	private String price;
	private long manfDate;
	private long exprDate;
	private String color;
	private double QrCode;
	private int netWeight;
	private String quantity;
	private boolean quality;

	public WaterBottle(String brand, String price, String quantity) {
		super();
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof WaterBottle) {
			WaterBottle casted = (WaterBottle) obj;
			if (this.brand.equals(casted.brand) && this.price.equals(casted.price) && this.quantity.equals(casted.quantity) ) {

				System.out.println("brand ,price,quantity is same");
				System.out.println("3 properties");
				return true;
			} else {
				System.err.println("brand not same");
			}
		
			
		}

		return false;
	}

}
