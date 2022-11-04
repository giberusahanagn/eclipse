package com.xworkz.program.encapsulation;

public class ProductAccess {
	
	
	Product product=new Product();
	
	public void use() {
	System.out.println(product.name);
	System.out.println(product.brand);
	product.brand = "philips";
	System.out.println("After modify: " + product.brand);
	System.out.println(product.ownerName);
	System.out.println(product.price);
	System.out.println(product.quality);
	System.out.println(product.quality);
	System.out.println(product.ambassador);
	product.setManufactureDate(567887);
	System.out.println(product.getManufactureDate());
	product.setExpiryDate(123456);
	System.out.println(product.getExpiryDate());
	product.setQuantity(100);
	System.out.println(product.getQuantity());

}
}
