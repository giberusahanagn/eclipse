package com.xworkz.methods.type;

public class Paint {

	private String name;
	private String brand;
	private String price;
	private String manfDate;
	private String exprDate;
	private String color;
	private String QrCode;
	private String netWeight;
	private String quantity;
	private String quality;

	public Paint() {
		// TODO Auto-generated constructor stub
	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public long getManfDate() {
//		return manfDate;
//	}
//
//	public void setManfDate(long manfDate) {
//		this.manfDate = manfDate;
//	}
//
//	public long getExprDate() {
//		return exprDate;
//	}
//
//	public void setExprDate(long exprDate) {
//		this.exprDate = exprDate;
//	}
//
//	public String getColor() {
//		return color;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}
//
//	public double getQrCode() {
//		return QrCode;
//	}
//
//	public void setQrCode(double qrCode) {
//		QrCode = qrCode;
//	}
//
//	public int getNetWeight() {
//		return netWeight;
//	}
//
//	public void setNetWeight(int netWeight) {
//		this.netWeight = netWeight;
//	}
//
//	public String getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(String quantity) {
//		this.quantity = quantity;
//	}
//
//	public boolean isQuality() {
//		return quality;
//	}
//
//	public void setQuality(boolean quality) {
//		this.quality = quality;
//	}

	public Paint(String name, String brand, String price, String manfDate, String exprDate, String color, String qrCode,
			String netWeight, String quantity, String quality) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.manfDate = manfDate;
		this.exprDate = exprDate;
		this.color = color;
		this.QrCode = qrCode;
		this.netWeight = netWeight;
		this.quantity = quantity;
		this.quality = quality;
	}

	@Override
	public String toString() {

		return "Paint [name=" + name + ", brand=" + brand + ", price=" + price + ", manfDate=" + manfDate
				+ ", exprDate=" + exprDate + ", color=" + color + ", QrCode=" + QrCode + ", netWeight=" + netWeight
				+ ", quantity=" + quantity + ", quality=" + quality + "]";
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Paint) {
			Paint casted = (Paint) obj;
			if (this.name.equals(casted.name) && this.brand.equals(casted.brand) && this.price.equals(casted.price)
					&& this.manfDate.equals(casted.manfDate) && this.exprDate.equals(casted.exprDate)
					&& this.color.equals(casted.color) && this.QrCode.equals(casted.QrCode)
					&& this.netWeight.equals(casted.netWeight) && this.quality.equals(casted.quality)
					&& this.quantity.equals(casted.quantity)) {
				System.out.println("10 properties are matched");

				return true;

			} else {
				System.err.println("not same");
			}
		}
		return false;
	}
}
